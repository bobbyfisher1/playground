package org.xtext.eis.ui.labeling

import javax.inject.Inject
import org.xtext.eis.eis.Variable
import org.xtext.eis.typing.EisTypeComputer

class TypeRepresentation {
	@Inject extension EisTypeComputer

	def trueVariableType(Variable v) {
		var string = ""

		if (v.variantKeyword)
			string += "variant "

		string += v.variableType.typeFor.toString
	}
}
