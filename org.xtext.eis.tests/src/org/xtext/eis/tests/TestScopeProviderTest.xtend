package org.xtext.eis.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.eis.eis.EisModel
import org.xtext.eis.eis.EisPackage

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class TestScopeProviderTest {
	@Inject extension ParseHelper<EisModel>
	@Inject extension ValidationTestHelper
	@Inject extension IScopeProvider

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

	val define = beginning + "define{"
	val output = "output[]"
	val input = "input[]"
	val teststep = '''}
		teststep(0,''){
			set[]
			assert[]
		}
	''' + ending

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testSetReference() {
		(define + output + "input[int a, b;]" + teststep).parse.testcases.head.testblock.define.teststeps.head.
			assertion.set => [
			assertNoErrors
			assertScope(EisPackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testAssertReference() {
		(define + input + "output[int a, b;]" + teststep).parse.testcases.head.testblock.define.teststeps.head.
			assertion.assert => [
			assertNoErrors
			assertScope(EisPackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testSetReferenceInout() {
		(define + input + output + "inout[int a, b;]" + teststep).parse.testcases.head.testblock.define.teststeps.head.
			assertion.set => [
			assertNoErrors
			assertScope(EisPackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testAssertReferenceInout() {
		(define + input + output + "inout[int a, b;]" + teststep).parse.testcases.head.testblock.define.teststeps.head.
			assertion.assert => [
			assertNoErrors
			assertScope(EisPackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testSettingVariables() {
		val teststep = '''
			teststep(0,""){
				assert[]
				set[ a = 3; ]
			}
		'''
		(define + "input[ int a; ]" + output + '}' + teststep + ending).parse => [
			assertNoErrors
		]
	}

	@Test def void testMultipleStatements() {
		val teststep = '''
			teststep(0,""){
				assert[]
				set[ 
					a = 3;
					//a = 4;
				]
			}
		'''
		(define + "input[ int a; ]" + output + '}' + teststep + ending).parse => [
//			assertError(EisPackage.eINSTANCE.statement, DefineValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
//			teststeps.head.assertion.set.setVariables.head.variable.assertScope(
//				EisPackage.eINSTANCE.statement_Variable, "a, b")
			assertNoErrors
		]
	}

	@Test def void testUdtStatements() {
		(beginning + '''
			define{
				input[
					udt a(typeA){
						int b = 0;
					}	
				]
				output[]
			}
			teststep(0,""){
				assert[]
				set[ a.b = 3; ]
			}
		''' + ending).parse => [
			assertNoErrors
		]
	}

	@Test def void testUdtRefStatements() {
		(beginning + '''
			define{
				input[
					udt a(typeA){
						int b = 0;
					}	
					typeA xyz;
				]
				output[]
			}
			teststep(0,""){
				assert[]
				set[ xyz.b = 3; ]
			}
		''' + ending).parse => [
			assertNoErrors
		]
	}

	@Test def void testRecursiveUdtStatements() {
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
				assert[]
				set[ a.b.c = 3; ]
			}
		''' + ending).parse => [
			assertNoErrors
		]
	}

	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		expected.toString.assertEquals(context.getScope(reference).allElements.map[name].join(", "))
	}

}
