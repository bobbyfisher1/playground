package org.example.eis.interpreter

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import org.example.eis.eis.And
import org.example.eis.eis.BoolConstant
import org.example.eis.eis.ByteConstant
import org.example.eis.eis.Comparison
import org.example.eis.eis.DWordConstant
import org.example.eis.eis.Equality
import org.example.eis.eis.Idiom
import org.example.eis.eis.IntConstant
import org.example.eis.eis.LWordConstant
import org.example.eis.eis.LongConstant
import org.example.eis.eis.Minus
import org.example.eis.eis.MulOrDiv
import org.example.eis.eis.Not
import org.example.eis.eis.Or
import org.example.eis.eis.Plus
import org.example.eis.eis.RealConstant
import org.example.eis.eis.StringConstant
import org.example.eis.eis.Variable
import org.example.eis.eis.VariableRef
import org.example.eis.eis.WordConstant
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
			ByteConstant:
				e.value
			WordConstant:
				e.value
			DWordConstant:
				e.value
			LWordConstant:
				e.value
			LongConstant:
				e.value
			Not: {
				if (e.idiom.interpret instanceof Boolean)
					!(e.idiom.interpret as Boolean)
				else {
				}
			}
			MulOrDiv: {
				val left = e.left.interpret
				val right = e.right.interpret
				if (left instanceof Integer && right instanceof Integer) {
					if (e.op == '*')
						(left as Integer) * (right as Integer)
					else {
						if (right as Integer != 0)
							(left as Integer) / (right as Integer)
						else {
						}
					}
				} else {
				}
			}
			Minus: {
				val left = e.left.interpret
				val right = e.right.interpret
				if (left instanceof Integer && right instanceof Integer) {
					(left as Integer) - (right as Integer)
				} else {
				}
			}
			Plus: {
				if (e.left.typeFor.isStringType || e.right.typeFor.isStringType)
					e.left.interpret.toString + e.right.interpret.toString
				else {
					val left = e.left.interpret
					val right = e.right.interpret
					if (left instanceof Integer && right instanceof Integer)
						(left as Integer) + (right as Integer)
					else {
					}
				}
			}
			Equality: {
				if (e.op == '==')
					e.left.interpret == e.right.interpret
				else
					e.left.interpret != e.right.interpret
			}
			And: {
				val left = e.left.interpret
				val right = e.right.interpret
				if (left instanceof Boolean && right instanceof Boolean) {
					(left as Boolean) && (right as Boolean)
				} else {
				}
			}
			Or: {
				val left = e.left.interpret
				val right = e.right.interpret
				if (left instanceof Boolean && right instanceof Boolean) {
					(left as Boolean) || (right as Boolean)
				} else {
				}
			}
			Comparison: {
				if (e.left.typeFor.isStringType) {
					val left = e.left.interpret
					val right = e.right.interpret
					if (left instanceof String && right instanceof String)
						switch (e.op) {
							case '<': (left as String) < (right as String)
							case '>': (left as String) > (right as String)
							case '>=': (left as String) >= (right as String)
							case '<=': (left as String) <= (right as String)
							default: false
						}
					else {
					}
				} else {
					val left = e.left.interpret
					val right = e.right.interpret
					if (left instanceof Integer && right instanceof Integer)
						switch (e.op) {
							case '<': (left as Integer) < (right as Integer)
							case '>': (left as Integer) > (right as Integer)
							case '>=': (left as Integer) >= (right as Integer)
							case '<=': (left as Integer) <= (right as Integer)
							default: false
						}
					else {
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
