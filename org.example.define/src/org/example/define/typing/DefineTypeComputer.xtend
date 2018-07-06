package org.example.define.typing

import org.example.define.define.And
import org.example.define.define.BasicType
import org.example.define.define.BoolConstant
import org.example.define.define.Comparison
import org.example.define.define.Equality
import org.example.define.define.Expression
import org.example.define.define.IntConstant
import org.example.define.define.Minus
import org.example.define.define.MulOrDiv
import org.example.define.define.Not
import org.example.define.define.Or
import org.example.define.define.Plus
import org.example.define.define.StringConstant

class DefineTypeComputer {
	public static val STRING_TYPE = new StringType
	public static val INT_TYPE = new IntType
	public static val BOOL_TYPE = new BoolType
	public static val NULL_TYPE = new NullType

//	@Inject extension DefineModelUtil
//
//	@Inject IResourceScopeCache cache
	def isStringType(DefineType type) {
		type === STRING_TYPE
	}

	def isIntType(DefineType type) {
		type === INT_TYPE
	}

	def isBoolType(DefineType type) {
		type === BOOL_TYPE
	}

	def dispatch DefineType typeFor(Expression e) {
		switch (e) {
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

	def dispatch DefineType typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType.isStringType || rightType.isStringType)
			STRING_TYPE
		else
			INT_TYPE
	}
//
//	def dispatch DefineType typeFor(VariableRef varRef) {
//		if (!varRef.isVariableDefinedBefore)
//			return null
//		else {
//			val variable = varRef.variable
//			// use a pair as the key, not to conflict with the
//			// use of cache we make in DefineModelUtil
//			return cache.get("type" -> variable, variable.eResource) [
//				variable.expression.typeFor
//			]
//		}
//	}
}
