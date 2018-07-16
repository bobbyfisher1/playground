package org.example.define.typing

import org.example.define.define.And
import org.example.define.define.BasicType
import org.example.define.define.BoolConstant
import org.example.define.define.Comparison
import org.example.define.define.Equality
import org.example.define.define.Idiom
import org.example.define.define.IntConstant
import org.example.define.define.Minus
import org.example.define.define.MulOrDiv
import org.example.define.define.Not
import org.example.define.define.Or
import org.example.define.define.Plus
import org.example.define.define.StringConstant
import org.example.define.define.VariableRef

class DefineTypeComputer {
	public static val STRING_TYPE = new StringType
	public static val INT_TYPE = new IntType
	public static val BOOL_TYPE = new BoolType
	public static val NULL_TYPE = new NullType

	def isStringType(DefineType type) {
		type === STRING_TYPE
	}

	def isIntType(DefineType type) {
		type === INT_TYPE
	}

	def isBoolType(DefineType type) {
		type === BOOL_TYPE
	}

	def dispatch DefineType typeFor(Idiom i) {
		switch (i) {
			StringConstant: STRING_TYPE
			IntConstant: INT_TYPE
			BoolConstant: BOOL_TYPE
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
