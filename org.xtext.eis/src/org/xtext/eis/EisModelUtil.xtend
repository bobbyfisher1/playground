package org.xtext.eis

import org.xtext.eis.eis.Input
import org.xtext.eis.eis.Output
import org.xtext.eis.eis.Udt
import org.xtext.eis.eis.UdtRef
import org.xtext.eis.eis.Variable

class EisModelUtil {

	def variablesDefinedBefore(Variable variable) {
		val container = variable.eContainer
		val variablesBefore = switch (container) {
			Output:
				container.outputVariables.takeWhile[it != variable].filter(Variable)
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

	def udtTypesDefinedBefore(UdtRef variable) {
		val container = variable.eContainer
		return switch (container) {
			Output:
				container.outputVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Input:
				container.inputVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			Udt:
				container.udtVariables.takeWhile[it != variable].filter(Udt).map[udtType]
			default:
				emptyList
		}
	}

	def udtTypesDefinedBefore(Input input) {
		return input.inputVariables.filter(Udt).map[udtType]
	}

	def udtTypesDefinedBefore(Output output) {
		return output.outputVariables.filter(Udt).map[udtType]
	}

	def udtTypesDefinedBefore(Udt udt) {
		return udt.udtVariables.filter(Udt).map[udtType]
	}

	def String toCharUpper(String string, int index) {
		val array = string.toCharArray
		val uppercaseChar = array.get(index).charValue.toString.toUpperCase.charAt(0)

		array.set(index, uppercaseChar)
		return array.join
	}

}
