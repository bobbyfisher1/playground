package org.example.eis.typing

import org.example.eis.eis.And
import org.example.eis.eis.BasicType
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
import org.example.eis.eis.VariableRef

class DefineTypeComputer {
	public static val STRING_TYPE = new StringType
	public static val INT_TYPE = new IntType
	public static val BOOL_TYPE = new BoolType
	public static val NULL_TYPE = new NullType
	public static val REAL_TYPE = new RealType

	def isStringType(DefineType type) {
		type === STRING_TYPE
	}

	def isIntType(DefineType type) {
		type === INT_TYPE
	}

	def isBoolType(DefineType type) {
		type === BOOL_TYPE
	}

	def isRealType(DefineType type) {
		type === REAL_TYPE
	}

	def dispatch DefineType typeFor(Idiom i) {
		switch (i) {
			StringConstant: STRING_TYPE
			IntConstant: INT_TYPE
			BoolConstant: BOOL_TYPE
			RealConstant: REAL_TYPE
			Not: BOOL_TYPE
			MulOrDiv: INT_TYPE
			Minus: INT_TYPE
			Comparison: BOOL_TYPE
			Equality: BOOL_TYPE
			And: BOOL_TYPE
			Or: BOOL_TYPE
			default: NULL_TYPE
		}
	}

	def dispatch DefineType typeFor(BasicType type) {
		val t = type.toString
		if (t === 'int') {
			INT_TYPE
		} else if (t === 'bool') {
			BOOL_TYPE;
		} else if (t === 'string') {
			STRING_TYPE
		} else if (t === 'real') {
			REAL_TYPE
		} else
			NULL_TYPE
	}

	def dispatch DefineType typeFor(Plus plus) {
		val leftType = plus.left.typeFor
		val rightType = plus.right?.typeFor
		if (leftType.isStringType || rightType.isStringType)
			STRING_TYPE
		else
			INT_TYPE
	}

	def dispatch DefineType typeFor(VariableRef varRef) {
		return varRef.variable.idiom?.typeFor
	}

}
