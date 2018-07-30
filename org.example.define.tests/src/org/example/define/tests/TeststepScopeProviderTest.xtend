package org.example.define.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.define.define.DefineBlock
import org.example.define.define.DefinePackage
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(DefineInjectorProvider)
class TeststepScopeProviderTest {
	@Inject extension ParseHelper<DefineBlock>
	@Inject extension ValidationTestHelper
	@Inject extension IScopeProvider

//
// variables -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	val define = "define{"
	val output = "output[]"
	val input = "input[]"
//	val inout = "inout[]"
	val teststep = '''}
		teststep(0,''){
			set[]
			assert[]
		}
	'''

	//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	@Test def void testSetReference() {
		(define + output + "input[int a, b;]" + teststep).parse.teststeps.head.assertion.set => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testAssertReference() {
		(define + input + "output[int a, b;]" + teststep).parse.teststeps.head.assertion.assert => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testSetReferenceInout() {
		(define + input + output + "inout[int a, b;]" + teststep).parse.teststeps.head.assertion.set => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testAssertReferenceInout() {
		(define + input + output + "inout[int a, b;]" + teststep).parse.teststeps.head.assertion.assert => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testSettingVariables() {
		val teststep = '''
			teststep(0,""){
				assert[]
				set[ a = 3; ]
			}
		'''
		(define + "input[ int a; ]" + output + '}' + teststep).parse => [
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
		(define + "input[ int a; ]" + output + '}' + teststep).parse => [
//			assertError(DefinePackage.eINSTANCE.statement, DefineValidator.MULTIPLE_STATEMENT_ASSIGNMENT)
//			teststeps.head.assertion.set.setVariables.head.variable.assertScope(
//				DefinePackage.eINSTANCE.statement_Variable, "a, b")
			assertNoErrors
		]
	}

	@Test def void testUdtStatements() {
		'''
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
		'''.parse => [
			assertNoErrors
		]
	}

	@Test def void testUdtRefStatements() {
		'''
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
		'''.parse => [
			assertNoErrors
		]
	}

	@Test def void testRecursiveUdtStatements() {
		'''
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
		'''.parse => [
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
