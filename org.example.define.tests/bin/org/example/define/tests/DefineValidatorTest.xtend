package org.example.define.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.define.define.DefineBlock
import org.example.define.define.DefinePackage
import org.example.define.validation.DefineValidator
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(DefineInjectorProvider)
class DefineValidatorTest {

	@Inject extension ParseHelper<DefineBlock>
	@Inject extension ValidationTestHelper

	//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	@Test def void testDuplicateVariablesNoInoutBlock() {
		'''
			define{
				output[]
				input[ int t, t;]
			}
		'''.toString.assertDuplicateVariables(DefinePackage.eINSTANCE.variable, "variable name", 't', 2)
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

	@Test def void testDuplicateVariants() {
		'''
			define{
				input[variant a(int);]
				output[]
				inout[variant a(int);]
			}
		'''.toString.assertDuplicateVariants(DefinePackage.eINSTANCE.variable, "variable name", 'a', 'int', 2)
	}

	@Test def void testDuplicateUdts() {
		'''
			define{
				input[udt a(udtType){}]
				output[]
				inout[udt a(udtType){}]
			}
		'''.toString.assertDuplicateUdts(DefinePackage.eINSTANCE.variable, "variable name", 'a', 'udtType', 2)
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
				DefineValidator.MULTIPLE_VARIABLE,
				text.indexOf(type.toString),
				name.length + ';'.length, // AVA: the ';' is highlighted as an error as well
				"Multiple " + description + " '" + name + "'"
			)

			/*AVA 
			 * The method indexOf(name) is tricky here.
			 * As the variable is called 'a' the  first letter 'a' will be sought. Yet this letter already occurs in the variable's datatype 'float'.
			 * This causes a problem
			 * */
			assertError(type, DefineValidator.MULTIPLE_VARIABLE, text.lastIndexOf(type.toString), name.length + 1,
				"Multiple " + description + " '" + name + "'")
			// check that the amount of errors equals the amount of duplicates
			duplicateErrors.assertEquals(validate.size)
		]
	}

	def private void assertDuplicateVariants(String text, EClass type, String description, String name,
		String variableType, int duplicateErrors) {
		text.parse => [
			// check that the error is on both duplicates 
			assertError(
				type,
				DefineValidator.MULTIPLE_VARIANT,
				text.indexOf(type.toString),
				name.length + '();'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			assertError(
				type,
				DefineValidator.MULTIPLE_VARIANT,
				text.lastIndexOf(type.toString),
				name.length + '();'.length + variableType.length,
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
				DefineValidator.MULTIPLE_UDT,
				text.indexOf(type.toString),
				name.length + 'udt (){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			assertError(
				type,
				DefineValidator.MULTIPLE_UDT,
				text.lastIndexOf(type.toString),
				name.length + 'udt (){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			// check that the amount of errors equals the amount of duplicates
			duplicateErrors.assertEquals(validate.size)
		]
	}
}
