package org.xtext.eis.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.eis.eis.EisModel
import org.xtext.eis.scoping.EisIndex

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class EisIndexTest {

	@Inject extension ParseHelper<EisModel>
	@Inject extension EisIndex
	@Inject extension ValidationTestHelper

//
// variables -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	val beginning = '''	
		project = "abckdjh";
		plcname = "d383";
		author 	= "name two";
		testcase Blockname(false, FC, "") {
	'''
	val ending = "}"

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testExportedEObjectDescriptions() {
		(beginning + '''
			define{
				input[ int a,b; ]
				output[
					udt c(typeC){}
				]
			}
		''' + ending).parse => [
			assertNoErrors
			assertExportedEObjectDescriptions("input, input.a, input.b, output, output.c, output.c.typeC")
		]
	}

//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
		expected.toString.assertEquals(o.getExportedEObjectDescriptions.map[qualifiedName].join(", "))
	}

}
