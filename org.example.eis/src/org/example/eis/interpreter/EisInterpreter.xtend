package org.example.eis.interpreter

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import org.example.eis.eis.And
import org.example.eis.eis.BoolConstant
import org.example.eis.eis.Comparison
import org.example.eis.eis.Equality
import org.example.eis.eis.Idiom
import org.example.eis.eis.IntConstant
import org.example.eis.eis.Minus
import org.example.eis.eis.MulOrDiv
import org.example.eis.eis.Not
import org.example.eis.eis.Or
import org.example.eis.eis.Plus
import org.example.eis.eis.RealConstant
import org.example.eis.eis.StringConstant
import org.example.eis.eis.Variable
import org.example.eis.eis.VariableRef
import org.example.eis.typing.DefineTypeComputer

class EisInterpreter {
	@Inject extension DefineTypeComputer
	@Inject IResourceScopeCache cache

	def dispatch Object interpret(Idiom e) {
		switch (e) {
			IntConstant:
				e.value
			BoolConstant:
				Boolean.parseBoolean(e.value)
			StringConstant:
				e.value
			RealConstant:
				e.value
			Not:
				!(e.idiom.interpret as Boolean)
			MulOrDiv: {
				val left = e.left.interpret as Integer
				val right = e.right.interpret as Integer
				if (e.op == '*')
					left * right
				else
					left / right
			}
			Minus:
				(e.left.interpret as Integer) - (e.right.interpret as Integer)
			Plus: {
				if (e.left.typeFor.isStringType || e.right.typeFor.isStringType)
					e.left.interpret.toString + e.right.interpret.toString
				else
					(e.left.interpret as Integer) + (e.right.interpret as Integer)
			}
			Equality: {
				if (e.op == '==')
					e.left.interpret == e.right.interpret
				else
					e.left.interpret != e.right.interpret
			}
			And:
				(e.left.interpret as Boolean) && (e.right.interpret as Boolean)
			Or:
				(e.left.interpret as Boolean) || (e.right.interpret as Boolean)
			Comparison: {
				if (e.left.typeFor.isStringType) {
					val left = e.left.interpret as String
					val right = e.right.interpret as String
					switch (e.op) {
						case '<': left < right
						case '>': left > right
						case '>=': left >= right
						case '<=': left <= right
						default: false
					}
				} else {
					val left = e.left.interpret as Integer
					val right = e.right.interpret as Integer
					switch (e.op) {
						case '<': left < right
						case '>': left > right
						case '>=': left >= right
						case '<=': left <= right
						default: false
					}
				}
			}
			VariableRef: {
				// avoid interpreting the same variable over and over again
				val v = e.variable
				cache.get("interpret" -> v, e.eResource)[v.interpret]
			}
		}
	}

	def dispatch Object interpret(Variable e) {
		e.idiom.interpret
	}

}
