package org.xtext.eis.ui.labeling

import javax.inject.Inject
import org.xtext.eis.eis.Variable
import org.xtext.eis.typing.DefineTypeComputer

class TypeRepresentation {
	@Inject extension DefineTypeComputer

	def trueVariableType(Variable v) {
		var string = ""

		if(v.inout) string += 'inout '
		if(v.variantKeyword) string += "variant "

		string += v.variableType.typeFor.toString
	}
}