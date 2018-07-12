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
import org.example.define.define.Udt
import org.example.define.define.Variable
import org.example.define.validation.DefineValidator
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(DefineInjectorProvider)
class DefineScopeProviderTest {
	@Inject extension ParseHelper<DefineBlock>
	@Inject extension ValidationTestHelper;

	@Inject extension IScopeProvider

	//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	@Test def void testScope() {
		'''
			define{
				input[ 
					int a;
					udt b(typeB){}
					int c=0;
					udt d(typeD){}
					int e;
				]
				output[]
			}
		'''.parse => [
			assertNoErrors
			direction.input.inputVariables.get(2) as Variable => [
				assertScope(DefinePackage.eINSTANCE.variable_UdtType, "typeB")
				expression.assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "a")
			]
		]
	}

	@Test def void testScopeInUdt() {
		'''
		define{
			output[]
			input[
				udt a(typeA){
					int a;
					udt b(typeB){}
					int c = 0;
					udt d(typeD){
						int A;
						udt B(typeBB){}
						int C=0;
					}	
				}
			]
		}'''.parse => [
			assertNoErrors
			direction.input.inputVariables.head as Udt => [
				udtVariables.get(2) as Variable => [
					assertScope(DefinePackage.eINSTANCE.variable_UdtType, "typeB")
					assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "a")
				]
				// testing the cascade
				udtVariables.get(3) as Udt => [
					udtVariables.get(2) as Variable => [
						assertScope(DefinePackage.eINSTANCE.variable_UdtType, "typeBB")
						assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "A")
					]
				]
			]
		]
	}

	@Test def void testReference() {
		'''
			define{
				input[]
				output[ 
					int a = 9;
					int b = a;
				]
			}
		'''.parse.direction.output.outputVariables.get(1) as Variable => [
			assertNoErrors
			expression.assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "a")

		]
	}

	@Test def void testNullReference() {
		'''
			define{
				input[]
				output[ 
					int a ;
					int b = a;
				]
			}
		'''.parse.direction.output.outputVariables.get(1) as Variable => [
			assertError(DefinePackage.eINSTANCE.variableRef, DefineValidator.NULL_REFERENCE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testReferenceWithWrongType() {
		'''
			define{
				input[]
				output[ 
					int a=19;
					bool b = a;
				]
			}
		'''.parse => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.INCOMPATIBLE_TYPES)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testVariantMismatch() {
		'''
			define{
				input[]
				output[ 
					variant int a = 0;
					int b = a;
				]
			}
		'''.parse.direction.output.outputVariables.get(1) as Variable => [
			assertError(DefinePackage.eINSTANCE.variable, DefineValidator.VARIANT_MISMATCH)
			1.assertEquals(validate.size)
		]
	}

	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		expected.toString.assertEquals(context.getScope(reference).allElements.map[name].join(", "))
	}
}
