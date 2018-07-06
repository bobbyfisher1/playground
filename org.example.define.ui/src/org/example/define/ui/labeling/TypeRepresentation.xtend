package org.example.define.ui.labeling

import javax.inject.Inject
import org.example.define.define.Variable
import org.example.define.typing.DefineTypeComputer

class TypeRepresentation {

	@Inject extension DefineTypeComputer

	def trueVariableType(Variable v) {
		var string = ""
		if (v.variantKeyword)
			string += "variant "
		if (v.variableType/* .basicType*/ !== null) {
			string += v.variableType.typeFor.toString
		}
		/*else if (v.variableType.udtType !== null) {
		 * 	string += v.variableType.udtType
		 } */
		else {
			string += ' absolutely, positvely, truly null '
		}
	}
}
