package org.example.define.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.define.define.DefineBlock
import org.example.define.scoping.DefineIndex
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(DefineInjectorProvider)
class DefineIndexTest {
	@Inject extension ParseHelper<DefineBlock>
	@Inject extension DefineIndex
	@Inject extension ValidationTestHelper;

	@Test def void testExportedEObjectDescriptions() {
		'''
			define{
				input[ int a,b; ]
				output[
					udt c(typeC){}
				]
			}
		'''.parse => [
			assertNoErrors
			assertExportedEObjectDescriptions("input, input.a, input.b, output, output.c, output.c.typeC")
		]
	}

	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
		expected.toString.assertEquals(o.getExportedEObjectDescriptions.map[qualifiedName].join(", "))
	}
}
