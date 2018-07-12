package org.example.define.ui.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(DefineUiInjectorProvider)
class DefineContentAssistTest extends AbstractContentAssistTest {

	val start = '''
		define{
			input[]
			output[	
	'''

//	val end = "]}"
//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testEmptyProgram() { newBuilder.assertText("define") }

	@Test def void testEmptyBlock() {
		newBuilder.append(start).assertText("Name", "]", "bool", "float", "int", "null", "string", "udt", "variant")
	}

	@Test def void testVariableReference() {
		newBuilder.append(start + "int a=42; int b=").assertText("!", "Value", "(", "1", "=", "a", "false", "true")
	}

	@Test def void testUdtReference() {
		newBuilder.append(start + "udt a(typeA){}   ").assertText(
			"Name",
			"typeA",
			"]",
			"bool",
			"float",
			"int",
			"null",
			"string",
			"udt",
			"variant"
		)
	}
}
