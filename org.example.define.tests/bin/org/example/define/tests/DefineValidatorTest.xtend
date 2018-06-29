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

	@Test def void failingTestInferredType() {
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
		'''.parse.assertNoErrors
	}

	@Test def void testInvalidCommaNotationAndMissingType() {
		'''
			define{
				input[
					int a, 
					variant b(int);
					t;
				] 
				output[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MISSING_VARIABLE_TYPE)
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidCommaNotation() {
		'''
			define{
				output[
					int a,
					variant b(int);
			] 
				input[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidCommaOnLastVariable() {
		'''
			define{
				output[ int a,] 
				input[]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testTypesAfterComma() {
		'''
			define{
				output[ int a = 8, b = 10 +/- 5;] 
				input[]
			}
		'''.parse => [
			direction.output.outputVariables => [
				get(0) => [
					variableDefinition.variableName.assertEquals('a')
					variableType.basicTypes.assertEquals('int')
				]
				get(1) => [
					variableDefinition.variableName.assertEquals('b')
					variableType.assertEquals(null) // after validation the type is also 'int'
				]
			]
		]
	}

	@Test def void testMissingVariantKeyword() {
		'''
			define{
				input[]
				output[a(int);]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MISSING_VARIANT_KEYWORD)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidCommaNotationAndMissingVariantKeyword() {
		'''
			define{
				input[]
				output[
					variant a(int),
					int b;
					c(bool);
				]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MISSING_VARIANT_KEYWORD)
			2.assertEquals(validate.size)
		]
	}

	@Test def void testMultipleVariantKeyword() {
		'''
			define{
				input[]
				output[variant a(int), variant b(bool);]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.MULTIPLE_VARIANT_KEYWORD)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testInvalidCommaOnLastVariant() {
		'''
			define{
				input[]
				output[variant a(int),]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INVALID_COMMA_NOTATION)
			1.assertEquals(validate.size)
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
				name.length + ';'.length, // AVA: the ';' is highlighted as an error as well
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
				name.length + 1,
				"Multiple " + description + " '" + name + "'"
			)

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
				DefineValidator.MULTIPLE_VARIANT_DECLARATION,
				text.indexOf(type.toString),
				name.length + '();'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			assertError(
				type,
				DefineValidator.MULTIPLE_VARIANT_DECLARATION,
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
				DefineValidator.MULTIPLE_UDT_DECLARATION,
				text.indexOf(type.toString),
				name.length + 'udt (){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			assertError(
				type,
				DefineValidator.MULTIPLE_UDT_DECLARATION,
				text.lastIndexOf(type.toString),
				name.length + 'udt (){}'.length + variableType.length,
				"Multiple " + description + " '" + name + "'"
			)

			// check that the amount of errors equals the amount of duplicates
			duplicateErrors.assertEquals(validate.size)
		]
	}
}
//
