package org.example.eis

import org.example.eis.eis.InOut
import org.example.eis.eis.Input
import org.example.eis.eis.Output
import org.example.eis.eis.Udt
import org.example.eis.eis.UdtRef
import org.example.eis.eis.Variable

class EisModelUtil {
	def variablesDefinedBefore(Variable variable) {
		val container = variable.eContainer
		val variablesBefore = switch (container) {
			Output:
				container.outputVariables.takeWhile[it != variable].filter(Variable)
			InOut:
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

	def variablesDefinedBefore(Input input) {
		input.inputVariables.filter(Variable)
	}

	def variablesDefinedBefore(Output output) {
		output.outputVariables.filter(Variable)
	}

	def variablesDefinedBefore(InOut inout) {
		inout.inoutVariables.filter(Variable)
	}

	def udtTypesDefinedBefore(UdtRef variable) {
		val container = variable.eContainer
		return switch (container) {
			Output:
				container.outputVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			InOut:
				container.inoutVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Input:
				container.inputVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Udt:
				container.udtVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			default:
				emptyList
		}
	}

	// The following four scopes need to be limited by the validator to allow only the udtTypes which are defined before.
	def udtTypesDefinedBefore(Input input) {
		return input.inputVariables.filter(Udt).map[udtType]
	}

	def udtTypesDefinedBefore(Output output) {
		return output.outputVariables.filter(Udt).map[udtType]
	}

	def udtTypesDefinedBefore(InOut inout) {
		return inout.inoutVariables.filter(Udt).map[udtType]
	}

	def udtTypesDefinedBefore(Udt udt) {
		return udt.udtVariables.filter(Udt).map[udtType]
	}
}
