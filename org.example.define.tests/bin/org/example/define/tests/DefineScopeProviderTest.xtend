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
import org.example.define.define.UdtRef
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
	@Test def void testVariableRefScope() {
		'''
			define{
				input[ 
					int a;
					udt b(typeB){}
					int c=0;
					udt d(typeD){}
					typeB e;
					udt f(typeF){}
				]
				output[]
			}
		'''.parse => [
			assertNoErrors
			direction.input.inputVariables => [
				get(2) as Variable => [
					idiom.assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "a")
				]
				get(4) as UdtRef => [
					assertScope(DefinePackage.eINSTANCE.udtRef_UdtType, "typeB, typeD")
				]
			]
		]
	}

	@Test def void testRefScope() {
		'''
			define{
				input[ 
					int a;
					udt b(typeB){}
					int c=0;
					udt d(typeD){}
				]
				output[]
			}
		'''.parse.direction.input => [
			assertNoErrors
			assertScope(DefinePackage.eINSTANCE.udtRef_UdtType, "typeB, typeD")
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
					typeB d;
					udt dd(typeDD){
						int A;
						udt B(typeBB){}
						int C=0;
						typeBB D;
					}
				}
			]
		}'''.parse => [
			assertNoErrors
			direction.input.inputVariables.head as Udt => [
				udtVariables.get(2) as Variable => [assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "a")]
				udtVariables.get(3) as UdtRef => [assertScope(DefinePackage.eINSTANCE.udtRef_UdtType, "typeB")]
				// testing the cascade
				udtVariables.get(4) as Udt => [
					udtVariables.get(2) as Variable => [assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "A")]
					udtVariables.get(3) as UdtRef => [assertScope(DefinePackage.eINSTANCE.udtRef_UdtType, "typeBB")]
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
			idiom.assertScope(DefinePackage.eINSTANCE.variableRef_Variable, "a")

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

	@Test def void testReferencingVariables() {
		'''
			define{
				input[]
				output[ 
					udt a(typeA){
						variant int b = 69 +/- 666;
					}
					typeA c;
				]
			}
		'''.parse => [assertNoErrors]
	}

//	@Test def void testReferencingVariables2() {
//		'''
//			define{
//				input[]
//				output[ 
//					udt a(typeA){
//						int b;
//					}
//					typeA c.b;
//				]
//			}
//		'''.parse => [assertNoErrors]
//	}
	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		expected.toString.assertEquals(context.getScope(reference).allElements.map[name].join(", "))
	}
}
