package org.example.define.ui.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.ui.testing.AbstractOutlineTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(DefineUiInjectorProvider)
class DefineOutlineTest extends AbstractOutlineTest {

	override protected getEditorId() {
		"org.example.define.Define"
	}

	@Test def void testBasicOutline() {
		'''
			define{
				input[]
				output[]
				inout[]
			}
		'''.assertAllLabels(
			'''
			input
			output
			inout
			'''
		)
	}

	@Test def void testVariables() {
		'''
			define{
				input[ int a;]
				output[]
			}
		'''.assertAllLabels(
			'''
			input
			  a : int
			output
			'''
		)
	}

}
