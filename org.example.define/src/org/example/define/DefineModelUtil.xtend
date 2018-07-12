package org.example.define

import org.example.define.define.Inout
import org.example.define.define.Input
import org.example.define.define.Output
import org.example.define.define.Udt
import org.example.define.define.Variable
import org.example.define.define.VariableRef

class DefineModelUtil {

	def isVariableDefinedBefore(VariableRef varRef) {
		varRef.variable.variablesDefinedBefore.contains(varRef.variable)
	}

	def variablesDefinedBefore(Variable variable) {
		val container = variable.eContainer
		val variablesBefore = switch (container) {
			Output:
				container.outputVariables.takeWhile[it != variable].filter(Variable)
			Inout:
				container.inoutVariables.takeWhile[it != variable].filter(Variable)
			Input:
				container.inputVariables.takeWhile[it != variable].filter(Variable)
			Udt:
				container.udtVariables.takeWhile[it != variable].filter(Variable)
			default:
				emptyList
		}
		return variablesBefore.toSet
	}

	def udtTypesDefinedBefore(Variable variable) {
		val container = variable.eContainer
		val udtTypesBefore = switch (container) {
			Output:
				container.outputVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Inout:
				container.inoutVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Input:
				container.inputVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Udt:
				container.udtVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			default:
				emptyList
		}
		return udtTypesBefore
	}
}
