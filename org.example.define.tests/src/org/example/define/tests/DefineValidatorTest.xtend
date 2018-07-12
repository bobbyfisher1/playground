package org.example.define.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.define.define.DefineBlock
import org.example.define.define.DefinePackage
import org.example.define.define.Variable
import org.example.define.typing.DefineType
import org.example.define.typing.DefineTypeComputer
import org.example.define.validation.DefineValidator
import org.junit.Test
import org.junit.runner.RunWith

import static org.example.define.typing.DefineTypeComputer.*

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(DefineInjectorProvider)
class DefineValidatorTest {

	@Inject extension ParseHelper<DefineBlock>
	@Inject extension ValidationTestHelper
	@Inject extension DefineTypeComputer

	val start = '''
		define{
			input[]
			output[	
	'''
	val end = "]}"
//	-------------------------------------------------
	val startWithVariable = '''
	define{
		input[]
		output[	int a = '''

	val endWithSemicolon = ";]}"

	//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	@Test def void testDuplicateVariablesNoInoutBlock() {
		var text = '''
			define{
				output[int t;]
				input[ int t;]
			}
		'''
		text.toString.assertDuplicateVariables(DefinePackage.eINSTANCE.variable, "variable name", 't', 2)
	}

	@Test def void testDuplicateVariablesWithInoutBlock() {
		'''
			define{
				output[]
				input[int t;]
				inout[int t;]
			}
		'''.toString.assertDuplicateVariables(DefinePackage.eINSTANCE.variable, "variable name", 't', 2)
	}

	@Test def void testDuplicateVariablesWithEmptyInoutBlock() {
		'''
			define{
				output[int t;]
				input[int t;]
				inout[]
			}
		'''.toString.assertDuplicateVariables(DefinePackage.eINSTANCE.variable, "variable name", 't', 4)
	}

	@Test def void testDuplicateUdts() {
		'''
			define{
				input[udt a(udtType1){}]
				output[]
				inout[udt a(udtType2){}]
			}
		'''.toString.assertDuplicateUdts(DefinePackage.eINSTANCE.udt, "variable name", 'a', 'udtType', 2)
	}

	@Test def void testDuplicateNameInUdt() {
		'''
			define{
				input[]
				output[ 
					udt a(typeA){
						int a;
						bool a;
					}
				]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MULTIPLE_VARIABLE_DECLARATION)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testWrongNotType() { "!10".assertType(INT_TYPE, BOOL_TYPE) }

	@Test def void testWrongMulOrDivType() {
		"10 * true".assertType(BOOL_TYPE, INT_TYPE)
		"'10' / 10".assertType(STRING_TYPE, INT_TYPE)
	}

	@Test def void testWrongMinusType() {
		"10 - true".assertType(BOOL_TYPE, INT_TYPE)
		"'10' - 10".assertType(STRING_TYPE, INT_TYPE)
	}

	@Test def void testWrongAndType() {
		"10 && true".assertType(INT_TYPE, BOOL_TYPE)
		"false && '10'".assertType(STRING_TYPE, BOOL_TYPE)
	}

	@Test def void testWrongOrType() {
		"10 || true".assertType(INT_TYPE, BOOL_TYPE)
		"false || '10'".assertType(STRING_TYPE, BOOL_TYPE)
	}

	@Test def void testWrongEqualityType() {
		"10 == true".assertSameType(INT_TYPE, BOOL_TYPE)
		"false != '10'".assertSameType(BOOL_TYPE, STRING_TYPE)
	}

	@Test def void testWrongComparisonType() {
		"10 < '1'".assertSameType(INT_TYPE, STRING_TYPE)
		"'10' > 10".assertSameType(STRING_TYPE, INT_TYPE)
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
		(start + "int a=4;" + end).parse.assertNoErrors;
		(start + "int a = 4 +/- 16;" + end).parse.assertNoErrors;
	}

	@Test def void testWrongTypes() {
		(start + "int a = 4 +/- true;" + end).assertWrongType;
		(start + "int a = true +/- 3" + end).assertWrongType;
		(start + "int a = true +/- 'string' " + end).assertWrongType;
	}

	def private void assertWrongType(String text) {
		text.parse.assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INCOMPATIBLE_TYPES)
	}

	@Test def void testCommaNotation() {
		'''
			define{
				input[int a, t;] 
				output[]
			}
		'''.parse.assertNoErrors
	}

	@Test def void testInvalidCommaOnLastVariable() {
		'''
			define{
				output[ variant int a,] 
				input[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidCommaNotation() {
		'''
			define{
				input[]
				output[
					variant int a,
					udt b(typeB){}
					bool c;
				]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingTypeIO() {
		'''
			define{
				input[a;] 
				output[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MISSING_VARIABLE_TYPE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingTypeIOInout() {
		'''
			define{
				input[a;] 
				output[] 
				inout[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MISSING_VARIABLE_TYPE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testMissingVariableType() {
		'''
			define{	
				input[int a; t;] 
				output[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MISSING_VARIABLE_TYPE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInferredType() {
		'''
			define{
				input[int a, t;] 
				output[]
			}
		'''.parse.direction.input.inputVariables => [
			(get(0) as Variable).variableType.typeFor.assertSame(INT_TYPE);
			(get(1) as Variable).variableType.typeFor.assertSame(NULL_TYPE) // After validation the type is inferred!!!!! It works!!!!!!!!!!!
		]
	}

	@Test def void testInferredVariant() {
		'''
			define{
				input[
					variant int a, t;
				] 
				output[]
			}
		'''.parse.direction.input.inputVariables => [
			(get(0) as Variable).variantKeyword.assertTrue;
			(get(1) as Variable).variantKeyword.assertFalse // It works after validation!!!!!!!!!!!
		]
	}

	@Test def void testInferredUdtType() {
		val text = '''
			udt a(typeA){}
			typeA b,c;
		'''
		(start + text + end).parse => [
			assertNoErrors
		]
	}

	@Test def void testBothTypesDeclared() {
		'''
			define{
				input[]
				output[ 
					udt a(typeA){}
					null typeA b;
				]
			}
		'''.parse => [
			assertNoErrors
		]
	}

	@Test def void testMultipleUdtType() {
		'''
			define{
				input[]
				output[ 
					udt a(typeA){}
					udt b(typeA){}
				]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.udt, DefineValidator.MULTIPLE_UDT_TYPE)
		]
	}

	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private void assertDuplicateVariables(String text, EClass type, String description, String name,
		int duplicateErrors) {
		text.parse => [
			// check that the error is on both duplicates 
			assertError(
				type,
				DefineValidator.MULTIPLE_VARIABLE_DECLARATION,
				text.indexOf(type.toString),
				name.length, // + ';'.length, // AVA: the ';' is highlighted as an error as well
				"Multiple " + description + " '" + name + "'"
			)

			/*AVA 
			 * The method indexOf(name) is tricky here.
			 * As the variable is called 'a' the  first letter 'a' will be sought. Yet this letter already occurs in the variable's datatype 'float'.
			 * This causes a problem
			 * */
			assertError(
				type,
				DefineValidator.MULTIPLE_VARIABLE_DECLARATION,
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
				DefineValidator.MULTIPLE_UDT_DECLARATION,
				text.indexOf(type.toString),
				name.length, // + 'udt ( ){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			assertError(
				type,
				DefineValidator.MULTIPLE_UDT_DECLARATION,
				text.lastIndexOf(type.toString),
				name.length, // + 'udt ( ){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			// check that the amount of errors equals the amount of duplicates
			duplicateErrors.assertEquals(validate.size)
		]
	}

	def void assertType(CharSequence input, DefineType expectedWrongType, DefineType expectedActualType) {
		(startWithVariable + input + endWithSemicolon).parse.assertError(DefinePackage.eINSTANCE.expression,
			DefineValidator.TYPE_MISMATCH, "expected " + expectedActualType + " type, but was " + expectedWrongType)
	}

	def void assertSameType(CharSequence input, DefineType expectedLeft, DefineType expectedRight) {
		(startWithVariable + input + endWithSemicolon).parse.assertError(DefinePackage.eINSTANCE.expression,
			DefineValidator.TYPE_MISMATCH, "expected the same type, but was " + expectedLeft + ", " + expectedRight)
	}

	def void assertNotBooleanType(CharSequence input) {
		(startWithVariable + input + endWithSemicolon).parse.assertError(DefinePackage.eINSTANCE.expression,
			DefineValidator.TYPE_MISMATCH, "cannot be boolean")
	}
}
