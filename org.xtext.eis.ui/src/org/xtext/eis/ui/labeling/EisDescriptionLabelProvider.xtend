/*
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.ui.labeling

import javax.inject.Inject
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider
import org.xtext.eis.eis.InOut
import org.xtext.eis.eis.Input
import org.xtext.eis.eis.Output
import org.xtext.eis.eis.Udt
import org.xtext.eis.eis.UdtRef
import org.xtext.eis.eis.Variable
import org.xtext.eis.eis.Variables

class EisDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

	@Inject extension TypeRepresentation

	def text(Input i) { "input" }

	def text(Output o) { "output" }

	def text(InOut io) { "inout" }

	def text(Variables v) {
		if (v instanceof Variable)
			v.name + " : " + v.trueVariableType
		else if (v instanceof Udt)
			"udt " + v.name + " of type " + v.udtType.name
		else if (v instanceof UdtRef)
			"udt " + v.name + " of type " + v.udtType.name
	}
}
