package org.example.eis.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.eis.eis.EisModel
import org.example.eis.eis.EisPackage
import org.example.eis.eis.Udt
import org.example.eis.eis.UdtRef
import org.example.eis.eis.Variable
import org.example.eis.validation.EisValidator
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class EisScopeProviderTest {
	@Inject extension ParseHelper<EisModel>
	@Inject extension ValidationTestHelper;
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

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testVariableRefScope() {
		(beginning + '''
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
		''' + ending).parse => [
			assertNoErrors
			testcases.head.testblock.define.direction.input.inputVariables => [
				get(2) as Variable => [
					idiom.assertScope(EisPackage.eINSTANCE.variableRef_Variable, "a")
				]
				get(4) as UdtRef => [
					assertScope(EisPackage.eINSTANCE.udtRef_UdtType, "typeB, typeD")
				]
			]
		]
	}

	@Test def void testRefScope() {
		(beginning + '''
			define{
				input[ 
					int a;
					udt b(typeB){}
					int c=0;
					udt d(typeD){}
				]
				output[]
			}
		''' + ending).parse.testcases.head.testblock.define.direction.input => [
			assertNoErrors
			assertScope(EisPackage.eINSTANCE.udtRef_UdtType, "typeB, typeD")
		]
	}

	@Test def void testScopeInUdt() {
		(beginning + '''
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
		}''' + ending).parse => [
			assertNoErrors
			testcases.head.testblock.define.direction.input.inputVariables.head as Udt => [
				udtVariables.get(2) as Variable => [assertScope(EisPackage.eINSTANCE.variableRef_Variable, "a")]
				udtVariables.get(3) as UdtRef => [assertScope(EisPackage.eINSTANCE.udtRef_UdtType, "typeB")]
				// testing the cascade
				udtVariables.get(4) as Udt => [
					udtVariables.get(2) as Variable => [assertScope(EisPackage.eINSTANCE.variableRef_Variable, "A")]
					udtVariables.get(3) as UdtRef => [assertScope(EisPackage.eINSTANCE.udtRef_UdtType, "typeBB")]
				]
			]
		]
	}

	@Test def void testReference() {
		(beginning + '''
			define{
				input[]
				output[ 
					int a = 9;
					int b = a;
				]
			}
		''' + ending).parse.testcases.head.testblock.define.direction.output.outputVariables.get(1) as Variable => [
			assertNoErrors
			idiom.assertScope(EisPackage.eINSTANCE.variableRef_Variable, "a")
		]
	}

	@Test def void testNullReference() {
		(beginning + '''
			define{
				input[]
				output[ 
					int a ;
					int b = a;
				]
			}
		''' + ending).parse.testcases.head.testblock.define.direction.output.outputVariables.get(1) as Variable => [
			assertError(EisPackage.eINSTANCE.variableRef, EisValidator.NULL_REFERENCE)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testReferenceWithWrongType() {
		(beginning + '''
			define{
				input[]
				output[ 
					int a=19;
					bool b = a;
				]
			}
		''' + ending).parse => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.INCOMPATIBLE_TYPES)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testVariantMismatch() {
		(beginning + '''
			define{
				input[]
				output[ 
					variant int a = 0;
					int b = a;
				]
			}
		''' + ending).parse.testcases.head.testblock.define.direction.output.outputVariables.get(1) as Variable => [
			assertError(EisPackage.eINSTANCE.variable, EisValidator.VARIANT_MISMATCH)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testReferencingUdts() {
		(beginning + '''
			define{
				input[]
				output[ 
					udt a(typeA){
						variant int b = 69 +/- 666;
					}
					typeA c;
				]
			}
		''' + ending).parse => [assertNoErrors]
	}

	//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		expected.toString.assertEquals(context.getScope(reference).allElements.map[name].join(", "))
	}

}
