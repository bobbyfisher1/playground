package org.example.eis.ui.labeling

import javax.inject.Inject
import org.example.eis.eis.Variable
import org.example.eis.typing.DefineTypeComputer

class TypeRepresentation {
	@Inject extension DefineTypeComputer

	def trueVariableType(Variable v) {
		var string = ""

		if(v.inout) string += 'inout '
		if(v.variantKeyword) string += "variant "

		string += v.variableType.typeFor.toString
	}
}
