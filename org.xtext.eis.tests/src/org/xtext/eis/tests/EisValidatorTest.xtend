package org.xtext.eis.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.eis.eis.EisModel
import org.xtext.eis.eis.EisPackage
import org.xtext.eis.eis.Variable
import org.xtext.eis.validation.EisValidator


import static extension org.junit.Assert.*
import static org.xtext.eis.typing.EisTypeComputer.*
import org.xtext.eis.typing.EisTypeComputer
import org.xtext.eis.typing.EisType

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class EisValidatorTest {
	@Inject extension ParseHelper<EisModel>
	@Inject extension ValidationTestHelper
	@Inject extension EisTypeComputer

	//
// variables -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	val beginning = '''	
		project = "abckdjh";
		plcname = "d383";
		author 	= "name two";
		testcase Blockname(false, FC, "") {
	'''

	val ending = "}"

	val start = beginning + '''
		define{
			input[]
			output[	
	'''
	val end = "]}"

	val endWithSemicolon = ";]}" + ending

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testDuplicateVariablesIO() {
		var text = '''
			define{
				output[int t;]
				input[ int t;]
			}
		'''
		(beginning + text + ending).toString.assertDuplicateVariables(EisPackage.eINSTANCE.variable, "variable name",
			't', 2)
	}

	@Test def void testDuplicateVariablesWithInoutBlock() {
		(beginning + '''
			define{
				output[]
				input[int t;]
				inout[int t;]
			}
		''' + ending).toString.assertDuplicateVariables(EisPackage.eINSTANCE.variable, "variable name", 't', 2)
	}

	@Test def void testDuplicateVariablesWithEmptyInoutBlock() {
		(beginning + '''
			define{
				output[int t;]
				input[int t;]
				inout[]
			}
		''' + ending).toString.assertDuplicateVariables(EisPackage.eINSTANCE.variable, "variable name", 't', 4)
	}

	@Test def void testDuplicateUdts() {
		(beginning + '''
			define{
				input[udt a(udtType1){}]
				output[]
				inout[udt a(udtType2){}]
			}
		''' + ending).toString.assertDuplicateUdts(EisPackage.eINSTANCE.udt, "variable name", 'a', 'udtType', 2)
	}

	@Test def void testDuplicateNameInUdt() {
		(beginning + '''
			define{
				input[]
				output[ 
					udt a(typeA){
						int a;
						bool a;
					}
				]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.MULTIPLE_VARIABLE_DECLARATION)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testWrongNotType() {
		"!10".assertType(INT_TYPE, BOOL_TYPE)
	}

	@Test def void testWrongMulOrDivType() {
		"10 * true".assertType(BOOL_TYPE, INT_TYPE)
		" '10' / 10".assertType(STRING_TYPE, INT_TYPE)
	}

	@Test def void testWrongMinusType() {
		"10 - true".assertType(BOOL_TYPE, INT_TYPE)
		" '10' - 10".assertType(STRING_TYPE, INT_TYPE)
	}

	@Test def void testWrongAndType() {
		"10 && true".assertType(INT_TYPE, BOOL_TYPE)
		"false && '10' ".assertType(STRING_TYPE, BOOL_TYPE)
	}

	@Test def void testWrongOrType() {
		"10 || true".assertType(INT_TYPE, BOOL_TYPE)
		"false || '10' ".assertType(STRING_TYPE, BOOL_TYPE)
	}

	@Test def void testWrongEqualityType() {
		"10 == true".assertSameType(INT_TYPE, BOOL_TYPE)
		"false != '10' ".assertSameType(BOOL_TYPE, STRING_TYPE)
	}

	@Test def void testWrongComparisonType() {
		'''10 < "1"'''.assertSameType(INT_TYPE, STRING_TYPE)
		'''"10" > 10'''.assertSameType(STRING_TYPE, INT_TYPE)
	}

	@Test def void testWrongBooleanComparison() {
		"10 < true".assertNotBooleanType
		"false > 0".assertNotBooleanType
		"false > true".assertNotBooleanType
	}

	@Test def void testWrongBooleanPlus() {
		"10 + true".assertNotBooleanType
		"false + 0".assertNotBooleanType
		"false + true".assertNotBooleanType
	}

	@Test def void testCorrectType() {
		(start + "int a=4;" + end + ending).parse.assertNoErrors;
		(start + "int a = 4 +/- 16;" + end + ending).parse.assertNoErrors;
	}

	@Test def void testWrongTypes() {
		(start + "int a = 4 +/- true;" + end + ending).assertWrongType(1);
		(start + "int a = true +/- 3;" + end + ending).assertWrongType(1);
		(start + "int a = true +/- 'string' ;" + end + ending).assertWrongType(2);
	}

	@Test def void testCommaNotation() {
		(beginning + '''
			define{
				input[int a, t;] 
				output[]
			}
		''' + ending).parse.assertNoErrors
	}

	@Test def void testInvalidCommaOnLastVariable() {
		(beginning + '''
			define{
				output[ variant int a,] 
				input[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidCommaNotation() {
		(beginning + '''
			define{
				input[]
				output[
					variant int a,
					udt b(typeB){}
					bool c;
				]
			}
		''' + ending ).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingTypeIO() {
		(beginning + '''
			define{
				input[a;] 
				output[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.MISSING_VARIABLE_TYPE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingTypeIOInout() {
		(beginning + '''
			define{
				input[a;] 
				output[] 
				inout[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.MISSING_VARIABLE_TYPE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingVariableType() {
		(beginning + '''
			define{	
				input[int a; t;] 
				output[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.MISSING_VARIABLE_TYPE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInferredType() {
		(beginning + '''
			define{
				input[int a, t;] 
				output[]
			}
		''' + ending).parse.testcases.head.define.direction.input.inputVariables => [
			(get(0) as Variable).variableType.typeFor.assertSame(INT_TYPE);
			(get(1) as Variable).variableType.typeFor.assertSame(NULL_TYPE) // After validation the type is inferred!!!!! It works!!!!!!!!!!!
		]
	}

	@Test def void testInferredVariant() {
		(beginning + '''
			define{
				input[
					variant int a, t;
				] 
				output[]
			}
		''' + ending).parse.testcases.head.define.direction.input.inputVariables => [
			(get(0) as Variable).variantKeyword.assertTrue;
			(get(1) as Variable).variantKeyword.assertFalse // It works after validation!!!!!!!!!!!
		]
	}

	@Test def void testUdtTypeRef() {
		val text = '''
			udt a(typeA){
				int x = 99 +/- 1;
			}
			typeA b;
			typeA c;
		'''
		(start + text + end + ending).parse => [
			assertNoErrors
		]
	}

	@Test def void testRecursiveReference() {
		(beginning + '''
			define{
				input[]
				output[ 
					udt a(typeA){
						string x = 'pretender' +/- 'what';
						udt y(typeY){}
						typeY z;
					}
					 typeA b;
				]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.udtRef, EisValidator.RECURSIVE_UDT_REFERENCE)
		]
	}

	@Test def void testMultipleUdtType() {
		(beginning + '''
			define{
				input[]
				output[ 
					udt a(typeA){}
					udt b(typeA){}
				]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.udt, EisValidator.MULTIPLE_UDT_TYPE)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testMissingUdtReference() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						int b;
					}
			]
				output[]
			}
			teststep(0,""){
				set[ a = 0; ]
				assert[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.MISSING_UDT_REFERENCE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingUdtRefReference() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						int b;
					}
					typeA xyz;
			]
				output[]
			}
			teststep(0,""){
				set[ xyz = 0; ]
				assert[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.MISSING_UDT_REFERENCE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingUdtReferenceInCascade() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						udt b(typeB){
							int c;
						}
					}
			]
				output[]
			}
			teststep(0,""){
				set[ a.b = 0; ]
				assert[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.MISSING_UDT_REFERENCE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testWrongStatementType() {
		val teststep = '''
			teststep(0 ,"don't forget the string") {
				set[ ]
				assert[a = true;]
			}
		'''
		(start + "int a;" + end + teststep + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.INCOMPATIBLE_TYPES)
		]
	}

	@Test def void testWrongStatementType2() {
		val teststep = '''
			teststep(0 ,"don't forget the string") {
				set[ ]
				assert[a.b = true;]
			}
		'''
		(start + '''
			udt a(typeA){
				int b;
			}
		''' + end + teststep + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.INCOMPATIBLE_TYPES)
		]
	}

	@Test def void testMultipleStatementsSetBlock() {
		(beginning + '''
			define{
				input[
					udt a(typeA){
						int b;
					}
					int c;
				]
				output[]
			}
			teststep(0,""){
				set[
						a.b = 0;
						a.b = 0;
						c = 0;
						c = 0;
				]
				assert[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
			6.assertEquals(validate.size)
		]
	}

	@Test def void testMultipleStatementsAssertBlock() {
		(beginning + '''
			define{
				input[]
				output[ int a; ]
			}
			teststep(0,""){
				assert[
						a = 0;
						a = 0;
				]
				set[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidRangeOnBoolean() {
		(beginning + '''
			define{
				input[  ]
				output[
					bool _bool = true +/- false;
					string _string = "one" +/- "two";
					byte _byte = 16#bc +/- 16#df;
					word _word = 16#abcd +/- 16#efEF;
					dword _dword = 16#abcd_abcd +/- 16#efEF_efEF;
					lword _lword = 16#abcd_abcd_abcd_abcd +/- 16#efEF_efEF_efEF_efEF;
					char _char = 'c' +/- 'h';
					wchar _wchar = 'a' +/- 'r';
					time _time = T#1s +/- T#5ms;
					ltime _ltime = LT#1us +/- LT#1ns;
					date _date = D#2018-11-01 +/- D#2018-11-02;
				]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.INVALID_RANGE_DEFINITION)
			11.assertEquals(validate.size)
		]

		(beginning + '''
			define{
				input[  ]
				output[
					bool _bool;
					string _string;
					byte _byte;
					word _word;
					dword _dword;
					lword _lword;
					char _char;
					wchar _wchar;
					time _time;
					ltime _ltime;
					date _date;
				]
			}
			teststep(0,""){
				set[  ]
				assert[
					_bool = true +/- false;
						_string = "one" +/- "two";
						_byte = 16#bc +/- 16#df;
					_word = 16#abcd +/- 16#efEF;
					_dword = 16#abcd_abcd +/- 16#efEF_efEF;
					_lword = 16#abcd_abcd_abcd_abcd +/- 16#efEF_efEF_efEF_efEF;
					_char = 'c' +/- 'h';
					_wchar = 'a' +/- 'r';
					_time = T#1s +/- T#5ms;
					_ltime = LT#1us +/- LT#1ns;
					_date = D#2018-11-01 +/- D#2018-11-02;
				]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.INVALID_RANGE_DEFINITION)
			11.assertEquals(validate.size)
		]

		(beginning + '''
			define{
				input[ int a = 0 +/- 5; ]
				output[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.INVALID_RANGE_DEFINITION)
			1.assertEquals(validate.size)
		]

		(beginning + '''
			define{
				input[ int a;]
				output[]
			}
			teststep(0,""){
				set[ a = 2 +/- 3;]
				assert[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.statement, EisValidator.INVALID_RANGE_DEFINITION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMultiplePlcCycles() {
		(beginning + '''
			define{
				input[]
				output[]
			}
			teststep(0,"one"){
				set[]
				assert[]
			}
			teststep(0,"one"){
				set[]
				assert[]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MULTIPLE_PLCCYCLE)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testDivisionByZero() {
		val zero = '''
		define{
			input[ int a = 1 / 0;]
			output[]
		}'''
		(beginning + zero + ending).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.mulOrDiv, EisValidator.DIVISION_BY_ZERO)
		]
	}

	@Test def void testDivisionByRealZero() {
		val zero = '''
		define{
			input[ real a = 1.0 / 0.0;]
			output[]
		}'''
		(beginning + zero + ending).parse => [
			assertError(EisPackage.eINSTANCE.mulOrDiv, EisValidator.DIVISION_BY_ZERO)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMultipleTestcaseNames() {
		'''
			project = "";
			plcname = "";
			author 	= "";
			testcase Blockname(false, FC, ""){}
			testcase Blockname(false, FC, ""){}
		'''.parse => [
			assertError(EisPackage.eINSTANCE.testcase, EisValidator.MULTIPLE_TESTCASE_NAME)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testInOuts() {
		var inout = ''' inout[ int a; ]'''
		var teststep = '''
			teststep(0,""){
				set[]
				assert[]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MISSING_INOUT_DECLARATION)
		]

		inout = '''inout[	int a,b;	]'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			2.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MISSING_INOUT_DECLARATION)
		]

		teststep = '''
			teststep(0,""){
				set[ a=0; ]
				assert[]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MISSING_INOUT_DECLARATION)
		]

		teststep = '''
			teststep(0,""){
				set[ 
					a=0;
					b=0;
				]
				assert[]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse.assertNoErrors

		inout = ''' inout[ int a; ]'''
		teststep = '''
			teststep(0,""){
				set[ a=0; ]
				assert[ a=0; ]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
		]

		inout = ''' inout[ int a,b; ]'''
		teststep = '''
			teststep(0,""){
				set[ a=0; ]
				assert[ a=0; ]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			2.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MISSING_INOUT_DECLARATION)
		]

		inout = ''' inout[ int a,b; ]'''
		teststep = '''
			teststep(0,""){
				set[ a=0; b=0;]
				assert[ a=0; b=0;]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			2.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
		]

		inout = ''' 
		inout[ 
			udt a(typeA){
				int b,c;
			}
		]'''
		teststep = '''
			teststep(0,""){
				set[ ]
				assert[]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse => [
			2.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.teststepBlock, EisValidator.MISSING_INOUT_DECLARATION)
		]

		inout = ''' 
		inout[ 
			udt a(typeA){
				int b,c;
			}
		]'''
		teststep = '''
			teststep(0,""){
				set[ a.b=0;]
				assert[ a.c=0; ]
				}
		'''
		(start + "]" + inout + "}" + teststep + '}').parse.assertNoErrors

	}

//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def private void assertWrongType(String text, int numberOfErrors) {
		text.parse => [
			numberOfErrors.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.INCOMPATIBLE_TYPES)
		]
	}

	def private void assertDuplicateVariables(String text, EClass type, String description, String name,
		int duplicateErrors) {
		text.parse => [
			// check that the error is on both duplicates 
			assertError(
				type,
				EisValidator.MULTIPLE_VARIABLE_DECLARATION,
				text.indexOf(type.toString),
				name.length, // + ';'.length, // AVA: the ';' is highlighted as an error as well
				"Multiple " + description + " '" + name + "'"
			)

			/*AVA 
			 * The method indexOf(name) is tricky here.
			 * As the variable is called 'a' the  first letter 'a' will be sought. Yet this letter already occurs in the variable's datatype 'real'.
			 * This causes a problem
			 * */
			assertError(
				type,
				EisValidator.MULTIPLE_VARIABLE_DECLARATION,
				text.lastIndexOf(type.toString),
				name.length, // + ';'.length,
				"Multiple " + description + " '" + name + "'"
			)

			// check that the amount of errors equals the amount of duplicates
			duplicateErrors.assertEquals(validate.size)

		]
	}

	def private void assertDuplicateUdts(String text, EClass type, String description, String name, String variableType,
		int duplicateErrors) {
		text.parse => [
			// check that the error is on both duplicates 
			assertError(
				type,
				EisValidator.MULTIPLE_UDT_DECLARATION,
				text.indexOf(type.toString),
				name.length, // + 'udt ( ){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			assertError(
				type,
				EisValidator.MULTIPLE_UDT_DECLARATION,
				text.lastIndexOf(type.toString),
				name.length, // + 'udt ( ){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			// check that the amount of errors equals the amount of duplicates
			duplicateErrors.assertEquals(validate.size)
		]
	}

	def void assertType(CharSequence input, EisType expectedWrongType, EisType expectedActualType) {
		(start + "int a =" + input + endWithSemicolon).parse.assertError(EisPackage.eINSTANCE.idiom,
			EisValidator.TYPE_MISMATCH, "expected " + expectedActualType + " type, but was " + expectedWrongType)
	}

	def void assertSameType(CharSequence input, EisType expectedLeft, EisType expectedRight) {
		(start + "int a =" + input + endWithSemicolon).parse.assertError(EisPackage.eINSTANCE.idiom,
			EisValidator.TYPE_MISMATCH, "expected the same type, but was " + expectedLeft + ", " + expectedRight)
	}

	def void assertNotBooleanType(CharSequence input) {
		(start + "int a =" + input + endWithSemicolon).parse.assertError(EisPackage.eINSTANCE.idiom,
			EisValidator.TYPE_MISMATCH, "cannot be boolean")
	}

}
