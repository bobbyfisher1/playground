package org.xtext.eis.interpreter

import com.google.inject.Inject
import org.eclipse.xtext.util.IResourceScopeCache
import org.xtext.eis.EisModelUtil
import org.xtext.eis.eis.And
import org.xtext.eis.eis.BoolConstant
import org.xtext.eis.eis.ByteConstant
import org.xtext.eis.eis.CharConstant
import org.xtext.eis.eis.Comparison
import org.xtext.eis.eis.DWordConstant
import org.xtext.eis.eis.Equality
import org.xtext.eis.eis.Idiom
import org.xtext.eis.eis.IntConstant
import org.xtext.eis.eis.LTimeConstant
import org.xtext.eis.eis.LWordConstant
import org.xtext.eis.eis.Minus
import org.xtext.eis.eis.MulOrDiv
import org.xtext.eis.eis.Not
import org.xtext.eis.eis.Or
import org.xtext.eis.eis.Plus
import org.xtext.eis.eis.RealConstant
import org.xtext.eis.eis.StringConstant
import org.xtext.eis.eis.TimeConstant
import org.xtext.eis.eis.Variable
import org.xtext.eis.eis.VariableRef
import org.xtext.eis.eis.WordConstant
import org.xtext.eis.typing.DefineTypeComputer
import org.xtext.eis.eis.DateConstant

class EisInterpreter {

	@Inject extension DefineTypeComputer
	@Inject IResourceScopeCache cache
	@Inject extension EisModelUtil

	def dispatch Object interpret(Idiom e) {
		switch (e) {
			IntConstant:
				e.value
			BoolConstant:
				Boolean.parseBoolean(e.value)
			StringConstant:
				e.value
			RealConstant:
				Double.parseDouble(e.value)
			ByteConstant:
				e.value.toUpperCase
			WordConstant:
				e.value.toUpperCase
			DWordConstant:
				e.value.toUpperCase
			LWordConstant:
				e.value.toUpperCase
			CharConstant:
				e.value.charAt(1) // char a = 'a' => a 	//without apostrophes
			TimeConstant:
				e.value.toLowerCase.toFirstUpper
			LTimeConstant:
				e.value.toLowerCase.toFirstUpper.toCharUpper(1)
			DateConstant:
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
				if (left instanceof Long && right instanceof Long) {
					if (e.op == '*')
						(left as Long) * (right as Long)
					else {
						if (right as Long != 0)
							(left as Long) / (right as Long)
						else {
						}
					}
				} else if (left instanceof Double && right instanceof Double) {
					if (e.op == '*')
						(left as Double) * (right as Double)
					else {
						if (right as Double != 0)
							(left as Double) / (right as Double)
						else {
						}
					}
				} else {
				}
			}
			Minus: {
				val left = e.left.interpret
				val right = e.right.interpret
				if (left instanceof Long && right instanceof Long) {
					(left as Long) - (right as Long)
				} else if (left instanceof Double && right instanceof Double) {
					(left as Double) - (right as Double)
				} else {
				}
			}
			Plus: {
				if (e.left.typeFor.isStringType || e.right.typeFor.isStringType)
					e.left.interpret.toString + e.right.interpret.toString
				else {
					val left = e.left.interpret
					val right = e.right.interpret
					if (left instanceof Long && right instanceof Long)
						(left as Long) + (right as Long)
					else if (left instanceof Double && right instanceof Double) {
						(left as Double) + (right as Double)
					} else {
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
					if (left instanceof Long && right instanceof Long)
						switch (e.op) {
							case '<': (left as Long) < (right as Long)
							case '>': (left as Long) > (right as Long)
							case '>=': (left as Long) >= (right as Long)
							case '<=': (left as Long) <= (right as Long)
							default: false
						}
					else if (left instanceof Double && right instanceof Double) {
						switch (e.op) {
							case '<': (left as Double) < (right as Double)
							case '>': (left as Double) > (right as Double)
							case '>=': (left as Double) >= (right as Double)
							case '<=': (left as Double) <= (right as Double)
							default: false
						}
					} else {
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
