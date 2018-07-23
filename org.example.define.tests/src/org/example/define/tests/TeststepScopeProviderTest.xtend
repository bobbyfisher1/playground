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
	@Inject extension ValidationTestHelper;

	@Inject extension IScopeProvider

	val define = "define{"
	val output = "output[]"
	val input = "input[]"
//	val inout = "inout[]"
	val end = '''}
		teststep(0,''){
			set[]
			assert[]
		}
	'''

	//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	@Test def void testSetReference() {
		(define + output + "input[int a, b;]" + end).parse.teststeps.head.assertion.set => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testAssertReference() {
		(define + input + "output[int a, b;]" + end).parse.teststeps.head.assertion.assert => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testSetReferenceInout() {
		(define + input + output + "inout[int a, b;]" + end).parse.teststeps.head.assertion.set => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	@Test def void testAssertReferenceInout() {
		(define + input + output + "inout[int a, b;]" + end).parse.teststeps.head.assertion.assert => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.statement_Variable, "a, b")
		]
	}

	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		expected.toString.assertEquals(context.getScope(reference).allElements.map[name].join(", "))
	}
}
