package org.example.eis.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.eis.eis.EisModel
import org.example.eis.eis.Variable
import org.example.eis.typing.DefineType
import org.example.eis.typing.DefineTypeComputer
import org.junit.Test
import org.junit.runner.RunWith

import static org.example.eis.typing.DefineTypeComputer.*

import static extension org.junit.Assert.*
import org.example.eis.eis.EisPackage
import org.example.eis.validation.EisValidator

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class DefineTypeComputerTest {
	@Inject extension ParseHelper<EisModel>
	@Inject extension ValidationTestHelper
	@Inject extension DefineTypeComputer

//
// variables -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	val beginning = '''	
		project = "abckdjh";
		plcname = "d383";
		author 	= "name two";
		testcase Blockname{
			testActive = false;
			blockType = FC;
			description = "";
	'''
	val ending = "}"

	val start = beginning + '''
	define{
		input[]
		output[	'''

	val end = "]}" + ending

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testIsInt() { (DefineTypeComputer.INT_TYPE).isIntSuperType.assertTrue }

	@Test def void testAllTypes() {
		// basic types
		"int a = 2;".assertSameType(INT_TYPE)
		"string b = 'stringaling';".assertSameType(STRING_TYPE)
		"bool c = true;".assertSameType(BOOL_TYPE)
		// operators
		"bool d = true || false; ".assertSameType(BOOL_TYPE)
		"bool e = true && false; ".assertSameType(BOOL_TYPE)
		"bool f = true == false; ".assertSameType(BOOL_TYPE)
		"bool g = true != false; ".assertSameType(BOOL_TYPE)
		"bool h = 1>=0; ".assertSameType(BOOL_TYPE)
		"bool i = 0<=1; ".assertSameType(BOOL_TYPE)
		"bool j = 1>0; ".assertSameType(BOOL_TYPE)
		"bool k = 0<1; ".assertSameType(BOOL_TYPE)
		"bool p = !true; ".assertSameType(BOOL_TYPE)

		"int l = 1+1; ".assertSameType(INT_TYPE)
		"int m = 1-1; ".assertSameType(INT_TYPE)
		"int n = 1*1; ".assertSameType(INT_TYPE)
		"int o = 1/1; ".assertSameType(INT_TYPE)

	}

	@Test def void testTypesWithPlusOp() {
		"int a = 1+1;".assertSameType(INT_TYPE)
		"string b = 1+'string';".assertSameType(STRING_TYPE)
		"string c = 'string'+1;".assertSameType(STRING_TYPE)
		"string d = 'string'+'string';".assertSameType(STRING_TYPE)
		"string e = 'string' + true;".assertSameType(STRING_TYPE)
		"string f = true + 'string';".assertSameType(STRING_TYPE)
	}

	@Test def void testIsString() { (DefineTypeComputer.STRING_TYPE).isStringType.assertTrue }

	@Test def void testIsBool() { (DefineTypeComputer.BOOL_TYPE).isBoolType.assertTrue }

	@Test def void testNotIsInt() { (DefineTypeComputer.STRING_TYPE).isIntSuperType.assertFalse }

	@Test def void testNotIsString() { (DefineTypeComputer.INT_TYPE).isStringType.assertFalse }

	@Test def void testNotIsBool() { (DefineTypeComputer.INT_TYPE).isBoolType.assertFalse }

	@Test def void testInt() {
		val real = '''
			int a = -1;
		'''
		(start + real + end).parse => [
			assertNoErrors
		]
	}

	@Test def void testReal() {
		val real = '''
			real a = -1.01;
		'''
		(start + real + end).parse => [
			assertNoErrors
		]
	}

	@Test def void testByte() {
		val real = '''
			byte a = 16#AA;
		'''
		(start + real + end).parse => [
			assertNoErrors
		]
	}

	@Test def void testWord() {
		val real = '''
			word a = 16#AAAA;
		'''
		(start + real + end).parse => [
			assertNoErrors
		]
	}

	@Test def void testDWord() {
		val real = '''
			dword a = 16#AAAA_AAAA;
		'''
		(start + real + end).parse => [
			assertNoErrors
		]
	}

	@Test def void testLWord() {
		val real = '''lword a = 16#AAAA_AAAA_AAAA_AAAA;'''

		(start + real + end).parse => [assertNoErrors]
	}

	@Test def void testUSInt() {
		val uSInt = '''usint a = 20;'''
		(start + uSInt + end).parse => [assertNoErrors]
	}

	@Test def void testUSIntBounds() {
		val uSInt = '''usint a = '''
		(start + uSInt + '256' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + uSInt + '-1' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + uSInt + '0 +/- -14' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + uSInt + '0 +/- 256' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
	}

	@Test def void testUIntBounds() {
		val uInt = '''uint a = '''
		(start + uInt + '65535+1' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + uInt + '-1' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + uInt + '0 +/- -14' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + uInt + '0 +/- 65535+1' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
	}

//bug: -128 -1 isn't allowed because it's recognized as two numbers without an op in between
	@Test def void testSIntBounds() {
		val sInt = '''sint a = '''
		(start + sInt + '-129' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + sInt + '128' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + sInt + '0 +/-( -128 - 1)' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + sInt + '0 +/- (127+1)' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
	}

	@Test def void testIntBounds() {
		val _int = '''int a = '''
		(start + _int + '-32768 - 1' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + _int + '32767+1' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + _int + '0 +/- (-32768 - 1)' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
		(start + _int + '0 +/- (32767+1)' + ';' + end).parse => [
			1.assertEquals(validate.size)
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS)
		]
	}

//	@Test def void testLint() {
//		val _long = '''lint a = 123L;'''
//
//		(start + _long + end) => [
//			println("aaaa")
//			parse.assertNoErrors
//			println("aaaa")
//		]
//	}
	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private void assertSameType(String text, DefineType expectedType) {
		((start + text + end).parse.testcases.head.testblock.define.direction.output.outputVariables.
			get(0) as Variable).idiom.typeFor.assertSame(expectedType)
	}
}
