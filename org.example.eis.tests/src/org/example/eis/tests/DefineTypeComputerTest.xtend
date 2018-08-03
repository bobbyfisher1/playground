package org.example.eis.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.example.eis.eis.EisModel
import org.example.eis.eis.Variable
import org.example.eis.typing.DefineType
import org.example.eis.typing.DefineTypeComputer
import org.junit.Test
import org.junit.runner.RunWith

import static org.example.eis.typing.DefineTypeComputer.*
import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class DefineTypeComputerTest {
	@Inject extension ParseHelper<EisModel>
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
	@Test def void testIsInt() { (DefineTypeComputer.INT_TYPE).isIntType.assertTrue }

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

	@Test def void testNotIsInt() { (DefineTypeComputer.STRING_TYPE).isIntType.assertFalse }

	@Test def void testNotIsString() { (DefineTypeComputer.INT_TYPE).isStringType.assertFalse }

	@Test def void testNotIsBool() { (DefineTypeComputer.INT_TYPE).isBoolType.assertFalse }

	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private void assertSameType(String text, DefineType expectedType) {
		((start + text + end).parse.testcases.head.testblock.define.direction.output.outputVariables.
			get(0) as Variable).idiom.typeFor.assertSame(expectedType)
	}
}
