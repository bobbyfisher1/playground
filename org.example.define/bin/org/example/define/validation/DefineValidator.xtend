/*
 * generated by Xtext 2.14.0
 */
package org.example.define.validation

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check
import org.example.define.define.And
import org.example.define.define.BasicType
import org.example.define.define.Comparison
import org.example.define.define.DefinePackage
import org.example.define.define.DirectionBlock
import org.example.define.define.Equality
import org.example.define.define.Idiom
import org.example.define.define.Inout
import org.example.define.define.Minus
import org.example.define.define.MulOrDiv
import org.example.define.define.Not
import org.example.define.define.Or
import org.example.define.define.Plus
import org.example.define.define.Udt
import org.example.define.define.UdtRef
import org.example.define.define.Variable
import org.example.define.define.VariableRef
import org.example.define.define.Variables
import org.example.define.define.impl.UdtImpl
import org.example.define.define.impl.VariableImpl
import org.example.define.typing.DefineType
import org.example.define.typing.DefineTypeComputer

class DefineValidator extends AbstractDefineValidator {
	protected static val ISSUE_CODE_PREFIX = "org.example.entities.";
	public static val MULTIPLE_VARIABLE_DECLARATION = ISSUE_CODE_PREFIX + "MultipleVariableDeclaration"
	public static val MULTIPLE_UDT_DECLARATION = ISSUE_CODE_PREFIX + "MultipleUdtDeclaration"
	public static val MISSING_VARIABLE_TYPE = ISSUE_CODE_PREFIX + "MissingVariableType"
	public static val MULTIPLE_TYPE_DEFINITION = ISSUE_CODE_PREFIX + "MultipleTypeDefinition"
	public static val INVALID_VARIANT_KEYWORD = ISSUE_CODE_PREFIX + "InvalidVariantKeyword"
	public static val INVALID_COMMA_NOTATION = ISSUE_CODE_PREFIX + "InvalidCommaNotation"
	public static val TYPE_MISMATCH = ISSUE_CODE_PREFIX + "TypeMismatch"
	public static val INCOMPATIBLE_TYPES = ISSUE_CODE_PREFIX + "IncompatibleTypes"
	public static val NULL_REFERENCE = ISSUE_CODE_PREFIX + "NullReference"
	public static val MULTIPLE_UDT_TYPE = ISSUE_CODE_PREFIX + "MultipleUdtType"
	public static val VARIANT_MISMATCH = ISSUE_CODE_PREFIX + "VariantMismatch"
	public static val RECURSIVE_VARIABLE_REFERENCE = ISSUE_CODE_PREFIX + "RecursiveVariableReference"
	public static val RECURSIVE_UDT_REFERENCE = ISSUE_CODE_PREFIX + "RecursiveUdtReference"

	@Inject extension DefineTypeComputer

//
// checks -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Check def void checkNoDuplicateVariablesIO(DirectionBlock directionblock) {
		val in = directionblock.input.inputVariables
		val out = directionblock.output.outputVariables
		val multiMap = HashMultimap.create()

		// add all variables to the map
		for (e : in) {
			e.checkVariableTypeAndAddToMap(multiMap)
			if (e instanceof Udt)
				e.checkAllVariableNamesInUdtScope
		}

		for (e : out) {
			e.checkVariableTypeAndAddToMap(multiMap)
			if (e instanceof Udt)
				e.checkAllVariableNamesInUdtScope
		}

		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					d.checkVariableTypeAndCallError
			}
		}
	}

	@Check def void checkNoDuplicateVariablesIOInout(DirectionBlock directionblock) {
		val in = directionblock.input.inputVariables
		val out = directionblock.output.outputVariables
		val inout = directionblock.inout.inoutVariables
		val multiMap = HashMultimap.create

		// add all variables to the multimap
		for (e : in) {
			e.checkVariableTypeAndAddToMap(multiMap)
			if (e instanceof Udt)
				e.checkAllVariableNamesInUdtScope
		}
		for (e : out) {
			e.checkVariableTypeAndAddToMap(multiMap)
			if (e instanceof Udt)
				e.checkAllVariableNamesInUdtScope
		}

		for (e : inout) {
			e.checkVariableTypeAndAddToMap(multiMap)
			if (e instanceof Udt)
				e.checkAllVariableNamesInUdtScope
		}

		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					d.checkVariableTypeAndCallError
			}
		}
	}

	@Check def void checkNoDuplicateUdtTypesIO(DirectionBlock directionblock) {
		var multiMap = HashMultimap.create
		val in = directionblock.input.inputVariables
		val out = directionblock.output.outputVariables

		// add all udtTypes of input to the multimap
		for (e : in) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}

		for (e : out) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}
		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					error("Multiple udtType '" + (d as Udt).udtType.name + "'", d, DefinePackage.eINSTANCE.udt_UdtType,
						DefineValidator.MULTIPLE_UDT_TYPE)
			}
		}
	}

	@Check def void checkNoDuplicateUdtTypesIOInout(DirectionBlock directionblock) {
		var multiMap = HashMultimap.create
		val in = directionblock.input.inputVariables
		val out = directionblock.output.outputVariables
		val inout = directionblock.inout.inoutVariables

		// add all udtTypes of input to the multimap
		for (e : in) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}

		for (e : out) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}
		for (e : inout) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}
		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					error("Multiple udtType '" + (d as Udt).udtType.name + "'", d, DefinePackage.eINSTANCE.udt_UdtType,
						DefineValidator.MULTIPLE_UDT_TYPE)
			}
		}
	}

	@Check def checkType(Not not) {
		checkExpectedBoolean(not.idiom, DefinePackage.Literals.NOT__IDIOM)
	}

	@Check def checkType(And and) {
		checkExpectedBoolean(and.left, DefinePackage.Literals.AND__LEFT)
		checkExpectedBoolean(and.right, DefinePackage.Literals.AND__RIGHT)
	}

	@Check def checkType(Or or) {
		checkExpectedBoolean(or.left, DefinePackage.Literals.OR__LEFT)
		checkExpectedBoolean(or.right, DefinePackage.Literals.OR__RIGHT)
	}

	@Check def checkType(Minus minus) {
		checkExpectedInt(minus.left, DefinePackage.Literals.MINUS__LEFT)
		checkExpectedInt(minus.right, DefinePackage.Literals.MINUS__RIGHT)
	}

	@Check def checkType(MulOrDiv mulOrDiv) {
		checkExpectedInt(mulOrDiv.left, DefinePackage.Literals.MUL_OR_DIV__LEFT)
		checkExpectedInt(mulOrDiv.right, DefinePackage.Literals.MUL_OR_DIV__RIGHT)
	}

	@Check def checkType(Equality equality) {
		val leftType = getTypeAndCheckNotNull(equality.left, DefinePackage.Literals.EQUALITY__LEFT)
		val rightType = getTypeAndCheckNotNull(equality.right, DefinePackage.Literals.EQUALITY__RIGHT)
		checkExpectedSameType(leftType, rightType)
	}

	@Check def checkType(Comparison comparison) {
		val leftType = getTypeAndCheckNotNull(comparison.left, DefinePackage.Literals.COMPARISON__LEFT)
		val rightType = getTypeAndCheckNotNull(comparison.right, DefinePackage.Literals.COMPARISON__RIGHT)
		checkExpectedSameType(leftType, rightType)
		checkNotBoolean(leftType, DefinePackage.Literals.COMPARISON__LEFT)
		checkNotBoolean(rightType, DefinePackage.Literals.COMPARISON__RIGHT)
	}

	@Check def checkType(Plus plus) {
		val leftType = getTypeAndCheckNotNull(plus.left, DefinePackage.Literals.PLUS__LEFT)
		val rightType = getTypeAndCheckNotNull(plus.right, DefinePackage.Literals.PLUS__RIGHT)
		if (leftType.isIntType || rightType.isIntType || (!leftType.isStringType && !rightType.isStringType)) {
			checkNotBoolean(leftType, DefinePackage.Literals.PLUS__LEFT)
			checkNotBoolean(rightType, DefinePackage.Literals.PLUS__RIGHT)
		}
	}

	@Check def checkType(Variable v) {
		if ( /*v.udt === null &&*/ v.idiom !== null) {
			val actualType = v?.idiom.typeFor
			val expectedType = v.variableType.typeFor
			val rangeType = v?.range?.typeFor

			if (expectedType === null || actualType === null)
				return;

			if (expectedType != actualType)
				error("Incompatible types. Expected '" + expectedType.toString + "' but was '" + actualType.toString +
					"'", v, DefinePackage.eINSTANCE.variable_Idiom, INCOMPATIBLE_TYPES)

			if (rangeType !== null && rangeType != actualType)
				error("Incompatible types. Expected '" + expectedType.toString + "' but was '" + rangeType.toString +
					"'", v, DefinePackage.eINSTANCE.variable_Range, INCOMPATIBLE_TYPES)

		}
	}

	@Check def void checkCommaSyntaxIO(DirectionBlock directionblock) {
		val in = directionblock.input.inputVariables
		val out = directionblock.output.outputVariables
		if (!in.empty) {
			checkCommaSyntaxWithVariables(in)
		}
		if (!out.empty) {
			checkCommaSyntaxWithVariables(out)
		}
	}

	@Check def void checkCommaSyntaxIOInout(Inout inouts) {
		val inout = inouts.inoutVariables
		if (!inout.empty) {
			checkCommaSyntaxWithVariables(inout)
		}
	}

	@Check def void checkNullVariableRefs(VariableRef varRef) {
		if (varRef.variable.idiom === null)
			error("Referred variable '" + varRef.variable.name + "' is null.", varRef,
				DefinePackage.eINSTANCE.variableRef_Variable, NULL_REFERENCE)
	}

	@Check def void checkVariantWithRefs(VariableRef varRef) {
		val variable = varRef.eContainer
		if ((variable as Variable).variantKeyword !== varRef.variable.variantKeyword)
			error("Both variables must be variant types.", variable, DefinePackage.eINSTANCE.variable_VariantKeyword,
				VARIANT_MISMATCH)
	}

	@Check def void checkUdtRefs(UdtRef udtRef) {
		var ownUdtVars = udtRef.udtVariables
		val referredUdtVars = (udtRef.udtType.eContainer as Udt).udtVariables
		var count = 0

		ownUdtVars.clear
		if (!referredUdtVars.empty) {
			for (e : referredUdtVars) {
				if (e instanceof Variable) {
					ownUdtVars.add(assignNewVariable(referredUdtVars, count))
				} else if (e instanceof Udt) {
					ownUdtVars.add(assignNewUdt(referredUdtVars, count))
				} else if (e instanceof UdtRef) {
					error("This reference cannot be made because the udt itself contains other references ", udtRef,
						DefinePackage.eINSTANCE.udtRef_UdtType, RECURSIVE_UDT_REFERENCE)
				}
				count++
			}
		}
	}

//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def private Udt assignNewUdt(Iterable<? extends Variables> referredUdtVars, int count) {
		var newUdt = new UdtImpl
		val childRef = (referredUdtVars.get(count) as Udt)
		val childRefVars = childRef.udtVariables
		var count2 = 0

		newUdt.name = childRef.name
		newUdt.udtType = childRef.udtType

		if (!childRefVars.empty) {
			for (e : childRefVars) {
				if (e instanceof Variable) {
					newUdt.udtVariables.add(assignNewVariable(childRefVars, count2))
				} else if (e instanceof Udt) {
					newUdt.udtVariables.add(assignNewUdt(childRefVars, count2))
				} else if (e instanceof UdtRef) {
					error("This reference cannot be made because the udt itself contains other references ",
						(e as UdtRef), DefinePackage.eINSTANCE.udtRef_UdtType, RECURSIVE_UDT_REFERENCE)
				}
				count2++
			}
		}

		return newUdt
	}

	def private Variable assignNewVariable(Iterable<? extends Variables> referredUdtVars, int count) {
		var newVariable = new VariableImpl
		val variable = (referredUdtVars.get(count) as Variable)

		newVariable.name = variable.name
		newVariable.variableType = variable.variableType
		newVariable.variantKeyword = variable.isVariantKeyword
		newVariable.nextVariable = variable.isNextVariable

		if ((variable.idiom instanceof VariableRef) || (variable.range instanceof VariableRef)) {
			error("This reference cannot be made because a variable contains other references ", // udtRef,
			DefinePackage.eINSTANCE.udtRef_UdtType, RECURSIVE_VARIABLE_REFERENCE)
		} else {
			newVariable.idiom = variable.idiom
			newVariable.range = variable.range
		}

		return newVariable
	}

	def private checkVariableTypeAndAddToMap(
		Variables e,
		HashMultimap<String, Variables> multiMap
	) {
		if (e instanceof Udt) {
			multiMap.put(e.name, e)
		} else if (e instanceof Variable)
			multiMap.put(e.name, e)
	}

	def private void checkAllVariableNamesInUdtScope(Udt udt) {
		val newMultimap = HashMultimap.create
		val udts = udt.udtVariables

		for (e : udts) {
			e.checkVariableTypeAndAddToMap(newMultimap)
			if (e instanceof Udt)
				e.checkAllVariableNamesInUdtScope
		}
// check for duplicates
		for (entry : newMultimap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					d.checkVariableTypeAndCallError
			}
		}
	}

	def private checkVariableTypeAndCallError(Variables e) {
		if (e instanceof Udt)
			error("Multiple variable name '" + e.name + "'", e, DefinePackage.eINSTANCE.variables_Name,
				DefineValidator.MULTIPLE_UDT_DECLARATION)
		else if (e instanceof Variable)
			error("Multiple variable name '" + e.name + "'", e, DefinePackage.eINSTANCE.variables_Name,
				DefineValidator.MULTIPLE_VARIABLE_DECLARATION)
	}

	def private checkExpectedBoolean(Idiom exp, EReference reference) {
		checkExpectedType(exp, DefineTypeComputer.BOOL_TYPE, reference)
	}

	def private checkExpectedInt(Idiom exp, EReference reference) {
		checkExpectedType(exp, DefineTypeComputer.INT_TYPE, reference)
	}

	def private checkExpectedType(Idiom exp, DefineType expectedType, EReference reference) {
		val actualType = getTypeAndCheckNotNull(exp, reference)
		if (actualType != expectedType)
			error("expected " + expectedType + " type, but was " + actualType, reference, TYPE_MISMATCH)
	}

	def private DefineType getTypeAndCheckNotNull(Idiom exp, EReference reference) {
		var type = exp?.typeFor
		if (type === null)
			error("null type", reference, TYPE_MISMATCH)
		return type;
	}

	def private checkExpectedSameType(DefineType left, DefineType right) {
		if (right !== null && left !== null && right != left)
			error("expected the same type, but was " + left + ", " + right,
				DefinePackage.Literals.EQUALITY.EIDAttribute, TYPE_MISMATCH)
	}

	def private checkNotBoolean(DefineType type, EReference reference) {
		if (type.isBoolType)
			error("cannot be boolean", reference, TYPE_MISMATCH)
	}

	def void checkNoDuplicateUdtTypes(Udt udt) {
		var multiMap = HashMultimap.create
		val udts = udt.udtVariables

		for (e : udts) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}
	}

	def private void checkCommaSyntaxWithVariables(Iterable<? extends Variables> variables) {

		var count = 0 // ugly programming
		var countOfVariableBefore = 0
		var commaBeforeVariable = false;
		var helpingVariableType = BasicType.NULL
//		var inferUdtType = false
		var variantKeyword = false
		//
		for (e : variables) {
			if (e instanceof Udt) {
				if (!e.udtVariables.empty)
					checkCommaSyntaxWithVariables(e.udtVariables)
			}

			// refer error to the last variable which was succeeded by a comma
			if (commaBeforeVariable && !(e instanceof Variable)) {
				error("Invalid comma. Semicolon expected.", variables.get(countOfVariableBefore),
					DefinePackage.eINSTANCE.variable_NextVariable, INVALID_COMMA_NOTATION)
			}

			if (e instanceof Variable) { // e is of type variable and not udt	//
				if ((count - countOfVariableBefore) > 1) {
					// this checks the case if there's a udt type between a comma and the expected inferred type
					commaBeforeVariable = false
				}

				if (!commaBeforeVariable) {
					if (e.variableType === BasicType.NULL) {
						error("Missing variable type", e, DefinePackage.eINSTANCE.variable_VariableType,
							MISSING_VARIABLE_TYPE);
					}
//					if (e.variableType !== BasicType.NULL && e.udtType !== null) {
//						error("Multiple type definition", e, DefinePackage.eINSTANCE.variable_VariableType,
//							MULTIPLE_TYPE_DEFINITION)
//					}
				} // else if there was a comma before the variable
				else {
					// assign inferred type 								
//					if (!inferUdtType && e.udtType === null) { // basicType
					if (e.variableType === BasicType.NULL) {
						e.variableType = helpingVariableType
					} // defined type after a comma
					else {
						error("Multiple type definition", e, DefinePackage.eINSTANCE.variable_VariableType,
							MULTIPLE_TYPE_DEFINITION)
					}
//					}
//					 else if (inferUdtType) { // udtType
//						if (e.udtType === null)
//							e.udtType = (variables.get(countOfVariableBefore) as Variable).udtType
//						else
//							error("Multiple type definition", e, DefinePackage.eINSTANCE.variable_UdtType,
//								MULTIPLE_TYPE_DEFINITION)
//					}
					// assign variantKeyword
					e.variantKeyword = variantKeyword
				}
// for the immediate next variable
				if (e.nextVariable) { // comma at the end instead of semicolon
					commaBeforeVariable = true;
					countOfVariableBefore = count;

					// the type must be handed over to the next variable
//					if (e.udtType === null) {
					helpingVariableType = e.variableType
//						inferUdtType = false
//					} else {
////						inferUdtType = true
//						helpingVariableType = BasicType.NULL
//					}
				// the variant as well					
//					variantKeyword = e.variantKeyword
				} else {
					commaBeforeVariable = false
					helpingVariableType = null
//					inferUdtType = false
//					variantKeyword = false
				}
				variantKeyword = e.variantKeyword
			}
			count++
		}
		// check if the last/only variable ends with a comma
		val last = variables.last
		if (last instanceof Variable)
			if (last.nextVariable)
				error("Invalid comma. Semicolon expected.", last, DefinePackage.eINSTANCE.variable_NextVariable,
					INVALID_COMMA_NOTATION)
	}

//
// yet unimplemented -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Check def void checkUppercaseVariantName() {}

	@Check def void checkUppercaseUdtName() {}

	@Check def void checkLowercaseUdtType() {}
}
