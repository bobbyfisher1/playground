package org.example.eis.typing

import org.example.eis.eis.And
import org.example.eis.eis.BasicType
import org.example.eis.eis.BoolConstant
import org.example.eis.eis.ByteConstant
import org.example.eis.eis.CharConstant
import org.example.eis.eis.Comparison
import org.example.eis.eis.DWordConstant
import org.example.eis.eis.Equality
import org.example.eis.eis.Idiom
import org.example.eis.eis.IntConstant
import org.example.eis.eis.LTimeConstant
import org.example.eis.eis.LWordConstant
import org.example.eis.eis.Minus
import org.example.eis.eis.MulOrDiv
import org.example.eis.eis.Not
import org.example.eis.eis.Or
import org.example.eis.eis.Plus
import org.example.eis.eis.RealConstant
import org.example.eis.eis.StringConstant
import org.example.eis.eis.TimeConstant
import org.example.eis.eis.VariableRef
import org.example.eis.eis.WordConstant
import org.example.eis.typing.types.BoolType
import org.example.eis.typing.types.ByteType
import org.example.eis.typing.types.CharType
import org.example.eis.typing.types.DIntType
import org.example.eis.typing.types.DWordType
import org.example.eis.typing.types.IntType
import org.example.eis.typing.types.LIntType
import org.example.eis.typing.types.LTimeType
import org.example.eis.typing.types.LWordType
import org.example.eis.typing.types.NullType
import org.example.eis.typing.types.RealType
import org.example.eis.typing.types.SIntType
import org.example.eis.typing.types.StringType
import org.example.eis.typing.types.TimeType
import org.example.eis.typing.types.UDIntType
import org.example.eis.typing.types.UIntType
import org.example.eis.typing.types.ULIntType
import org.example.eis.typing.types.USIntType
import org.example.eis.typing.types.WordType

class DefineTypeComputer {
	public static val STRING_TYPE = new StringType
	public static val INT_TYPE = new IntType
	public static val BOOL_TYPE = new BoolType
	public static val NULL_TYPE = new NullType
	public static val REAL_TYPE = new RealType
	public static val CHAR_TYPE = new CharType
	public static val TIME_TYPE = new TimeType
	public static val LTIME_TYPE = new LTimeType

	public static val BYTE_TYPE = new ByteType
	public static val WORD_TYPE = new WordType
	public static val DWORD_TYPE = new DWordType
	public static val LWORD_TYPE = new LWordType

	public static val USINT_TYPE = new USIntType
	public static val UINT_TYPE = new UIntType
	public static val UDINT_TYPE = new UDIntType
	public static val ULINT_TYPE = new ULIntType
	public static val SINT_TYPE = new SIntType
	public static val DINT_TYPE = new DIntType
	public static val LINT_TYPE = new LIntType

	def isStringType(DefineType type) { type === STRING_TYPE }

	def isIntSuperType(DefineType type) {
		type === INT_TYPE || type === USINT_TYPE || type === UINT_TYPE || type === UDINT_TYPE || type === ULINT_TYPE ||
			type === SINT_TYPE || type === DINT_TYPE || type === LINT_TYPE
	}

	def isSecondLetterCapitalized(DefineType type) {
		type === USINT_TYPE || type === UINT_TYPE || type === UDINT_TYPE || type === ULINT_TYPE || type === SINT_TYPE ||
			type === DINT_TYPE || type === LINT_TYPE || type === DWORD_TYPE || type === LWORD_TYPE ||
			type === LTIME_TYPE
	}

	def isThirdLetterCapitalized(DefineType type) {
		type === USINT_TYPE || type === UDINT_TYPE || type === ULINT_TYPE
	}

	def isBoolType(DefineType type) { type === BOOL_TYPE }

	def isRealType(DefineType type) { type === REAL_TYPE }

	def isByteType(DefineType type) { type === BYTE_TYPE }

	def isWordType(DefineType type) { type === WORD_TYPE }

	def isDWordType(DefineType type) { type === DWORD_TYPE }

	def isLWordType(DefineType type) { type === LWORD_TYPE }

	def isUSIntType(DefineType type) { type === USINT_TYPE }

	def isUIntType(DefineType type) { type === UINT_TYPE }

	def isUDIntType(DefineType type) { type === UDINT_TYPE }

	def isULIntType(DefineType type) { type === ULINT_TYPE }

	def isSIntType(DefineType type) { type === SINT_TYPE }

	def isIntType(DefineType type) { type === INT_TYPE }

	def isDIntType(DefineType type) { type === DINT_TYPE }

	def isLIntType(DefineType type) { type === LINT_TYPE }

	def dispatch DefineType typeFor(Idiom i) {
		switch (i) {
			StringConstant:
				STRING_TYPE
			IntConstant:
				INT_TYPE
			BoolConstant:
				BOOL_TYPE
			RealConstant:
				REAL_TYPE
			ByteConstant:
				BYTE_TYPE
			WordConstant:
				WORD_TYPE
			DWordConstant:
				DWORD_TYPE
			LWordConstant:
				LWORD_TYPE
			CharConstant:
				CHAR_TYPE
			TimeConstant:
				TIME_TYPE
			LTimeConstant:
				LTIME_TYPE
			//
//			LongConstant: LINT_TYPE
			//
			Not:
				BOOL_TYPE
			MulOrDiv: {
				if (i.left.typeFor instanceof RealType && i.right.typeFor instanceof RealType)
					REAL_TYPE
				else
					INT_TYPE
			}
			Minus: {
				if (i.left.typeFor instanceof RealType && i.right.typeFor instanceof RealType)
					REAL_TYPE
				else
					INT_TYPE
			}
			Comparison:
				BOOL_TYPE
			Equality:
				BOOL_TYPE
			And:
				BOOL_TYPE
			Or:
				BOOL_TYPE
			default:
				NULL_TYPE
		}
	}

	def dispatch DefineType typeFor(BasicType type) {
		val t = type?.toString

		if (t === 'int')
			INT_TYPE
		else if (t === 'bool')
			BOOL_TYPE
		else if (t === 'string')
			STRING_TYPE
		else if (t === 'real')
			REAL_TYPE
		else if (t === 'byte')
			BYTE_TYPE
		else if (t === 'word')
			WORD_TYPE
		else if (t === 'dword')
			DWORD_TYPE
		else if (t === 'lword')
			LWORD_TYPE
		else if (t === 'usint')
			USINT_TYPE
		else if (t === 'uint')
			UINT_TYPE
		else if (t === 'udint')
			UDINT_TYPE
		else if (t === 'ulint')
			ULINT_TYPE
		else if (t === 'sint')
			SINT_TYPE
		else if (t === 'dint')
			DINT_TYPE
		else if (t === 'lint')
			LINT_TYPE
		else if (t === 'char')
			CHAR_TYPE
		else if (t === 'time')
			TIME_TYPE
		else if (t === 'ltime')
			LTIME_TYPE
		else
			NULL_TYPE
	}

	def dispatch DefineType typeFor(Plus plus) {
		val leftType = plus.left.typeFor
		val rightType = plus.right?.typeFor
		if (leftType.isStringType || rightType.isStringType)
			STRING_TYPE
		else if (leftType instanceof RealType && rightType instanceof RealType)
			REAL_TYPE
		else
			INT_TYPE
	}

	def dispatch DefineType typeFor(VariableRef varRef) {
		return varRef.variable.idiom?.typeFor
	}

}
