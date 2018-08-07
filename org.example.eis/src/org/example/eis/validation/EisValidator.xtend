/*
 * generated by Xtext 2.12.0
 */
package org.example.eis.validation

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check
import org.example.eis.eis.And
import org.example.eis.eis.Assert
import org.example.eis.eis.BasicType
import org.example.eis.eis.BoolConstant
import org.example.eis.eis.Comparison
import org.example.eis.eis.DefineBlock
import org.example.eis.eis.DirectionBlock
import org.example.eis.eis.EisModel
import org.example.eis.eis.EisPackage
import org.example.eis.eis.Equality
import org.example.eis.eis.Idiom
import org.example.eis.eis.InOut
import org.example.eis.eis.Input
import org.example.eis.eis.IntConstant
import org.example.eis.eis.Minus
import org.example.eis.eis.MulOrDiv
import org.example.eis.eis.Not
import org.example.eis.eis.Or
import org.example.eis.eis.Plus
import org.example.eis.eis.Set
import org.example.eis.eis.Statement
import org.example.eis.eis.StringConstant
import org.example.eis.eis.Udt
import org.example.eis.eis.UdtRef
import org.example.eis.eis.Variable
import org.example.eis.eis.VariableRef
import org.example.eis.eis.Variables
import org.example.eis.eis.impl.BoolConstantImpl
import org.example.eis.eis.impl.IntConstantImpl
import org.example.eis.eis.impl.StringConstantImpl
import org.example.eis.eis.impl.UdtImpl
import org.example.eis.eis.impl.VariableImpl
import org.example.eis.interpreter.EisInterpreter
import org.example.eis.typing.DefineType
import org.example.eis.typing.DefineTypeComputer

class EisValidator extends AbstractEisValidator {
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
	public static val MULTIPLE_STATEMENT_ASSIGNMENT = ISSUE_CODE_PREFIX + "MultipleStatementAssignment"
	public static val MISSING_UDT_REFERENCE = ISSUE_CODE_PREFIX + "MissingUdtReference"
	public static val INVALID_RANGE_DEFINITION = ISSUE_CODE_PREFIX + "InvalidRangeDefinition"
	public static val MULTIPLE_PLCCYCLE = ISSUE_CODE_PREFIX + "MultiplePlcCycle"
	public static val MULTIPLE_TESTCASE_NAME = ISSUE_CODE_PREFIX + "MultipleTestcaseName"
	public static val OUT_OF_BOUNDS = ISSUE_CODE_PREFIX + "MultipleTestcaseName"

	@Inject extension DefineTypeComputer
	@Inject extension EisInterpreter

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

	@Check def void checkNoDuplicateVariablesIOInOut(DirectionBlock directionblock) {
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
					error("Multiple udtType '" + (d as Udt).udtType.name + "'", d, EisPackage.eINSTANCE.udt_UdtType,
						EisValidator.MULTIPLE_UDT_TYPE)
			}
		}
	}

	@Check def void checkNoDuplicateUdtTypesIOInOut(DirectionBlock directionblock) {
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
					error("Multiple udtType '" + (d as Udt).udtType.name + "'", d, EisPackage.eINSTANCE.udt_UdtType,
						EisValidator.MULTIPLE_UDT_TYPE)
			}
		}
	}

	@Check def void checkType(Not not) {
		checkExpectedBoolean(not.idiom, EisPackage.Literals.NOT__IDIOM)
	}

	@Check def void checkType(And and) {
		checkExpectedBoolean(and.left, EisPackage.Literals.AND__LEFT)
		checkExpectedBoolean(and.right, EisPackage.Literals.AND__RIGHT)
	}

	@Check def void checkType(Or or) {
		checkExpectedBoolean(or.left, EisPackage.Literals.OR__LEFT)
		checkExpectedBoolean(or.right, EisPackage.Literals.OR__RIGHT)
	}

	@Check def void checkType(Minus minus) {
		checkExpectedInt(minus.left, EisPackage.Literals.MINUS__LEFT)
		checkExpectedInt(minus.right, EisPackage.Literals.MINUS__RIGHT)
	}

	@Check def void checkType(MulOrDiv mulOrDiv) {
		checkExpectedInt(mulOrDiv.left, EisPackage.Literals.MUL_OR_DIV__LEFT)
		checkExpectedInt(mulOrDiv.right, EisPackage.Literals.MUL_OR_DIV__RIGHT)
	}

	@Check def void checkType(Equality equality) {
		val leftType = getTypeAndCheckNotNull(equality.left, EisPackage.Literals.EQUALITY__LEFT)
		val rightType = getTypeAndCheckNotNull(equality.right, EisPackage.Literals.EQUALITY__RIGHT)
		checkExpectedSameType(leftType, rightType)
	}

	@Check def void checkType(Comparison comparison) {
		val leftType = getTypeAndCheckNotNull(comparison.left, EisPackage.Literals.COMPARISON__LEFT)
		val rightType = getTypeAndCheckNotNull(comparison.right, EisPackage.Literals.COMPARISON__RIGHT)
		checkExpectedSameType(leftType, rightType)
		checkNotBoolean(leftType, EisPackage.Literals.COMPARISON__LEFT)
		checkNotBoolean(rightType, EisPackage.Literals.COMPARISON__RIGHT)
	}

	@Check def void checkType(Plus plus) {
		val leftType = getTypeAndCheckNotNull(plus.left, EisPackage.Literals.PLUS__LEFT)
		val rightType = getTypeAndCheckNotNull(plus.right, EisPackage.Literals.PLUS__RIGHT)
		if (leftType.isIntType || rightType.isIntType || (!leftType.isStringType && !rightType.isStringType)) {
			checkNotBoolean(leftType, EisPackage.Literals.PLUS__LEFT)
			checkNotBoolean(rightType, EisPackage.Literals.PLUS__RIGHT)
		}
	}

	@Check def void checkType(Variable variable) {
		if (variable.idiom !== null) {
			val expectedType = variable.variableType.typeFor
			val actualType = variable?.idiom.typeFor
			val rangeType = variable?.range?.typeFor

			if (expectedType === null || actualType === null)
				return;

			if (expectedType !== actualType)
				if (!(actualType.isIntType && expectedType.isIntType))
					error(
						"Incompatible types. Expected '" + expectedType.toString + "' but was '" + actualType.toString +
							"'", variable, EisPackage.eINSTANCE.variable_Idiom, INCOMPATIBLE_TYPES)

			if (rangeType !== null && rangeType != expectedType)
				if (!(rangeType.isIntType && expectedType.isIntType))
					error(
						"Incompatible types. Expected '" + expectedType.toString + "' but was '" + rangeType.toString +
							"'", variable, EisPackage.eINSTANCE.variable_Range, INCOMPATIBLE_TYPES)

		}
	}

	@Check def void checkType(Statement statement) {
		val cascade = statement.cascade
		val variable = statement.variable
		val last = cascade?.last?.udtVar

		val actualType = statement.idiom.typeFor
		val rangeType = statement?.range?.typeFor
		var expectedType = BasicType.NULL

		if (variable instanceof Variable) {
			expectedType = (variable as Variable).variableType
			compareTypesAndCallErrorOnMismatch(statement, actualType, expectedType, rangeType)
			if (rangeType !== null) {
				if (expectedType === BasicType.BOOL)
					error("The range feature is not permitted to boolean types", statement,
						EisPackage.eINSTANCE.statement_Range, INVALID_RANGE_DEFINITION)

				if (expectedType === BasicType.STRING)
					error("The range feature is not permitted to string types", statement,
						EisPackage.eINSTANCE.statement_Range, INVALID_RANGE_DEFINITION)
			}
		} else if (last instanceof Variable) {
			expectedType = last.variableType
			compareTypesAndCallErrorOnMismatch(statement, actualType, expectedType, rangeType)
			if (rangeType !== null) {
				if (expectedType === BasicType.BOOL)
					error("The range feature is not permitted to boolean types", statement,
						EisPackage.eINSTANCE.statement_Range, INVALID_RANGE_DEFINITION)

				if (expectedType === BasicType.STRING)
					error("The range feature is not permitted to string types", statement,
						EisPackage.eINSTANCE.statement_Range, INVALID_RANGE_DEFINITION)
			}
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

	@Check def void checkCommaSyntaxIOInOut(InOut inouts) {
		val inout = inouts.inoutVariables
		if (!inout.empty) {
			checkCommaSyntaxWithVariables(inout)
		}
	}

	@Check def void checkNullVariableRefs(VariableRef varRef) {
		if (varRef.variable.idiom === null)
			error("Referred variable '" + varRef.variable.name + "' is null.", varRef,
				EisPackage.eINSTANCE.variableRef_Variable, NULL_REFERENCE)
	}

	@Check def void checkVariantWithRefs(VariableRef varRef) {
		val variable = varRef.eContainer
		if ((variable as Variable).variantKeyword !== varRef.variable.variantKeyword)
			error("Both variables must be variant types.", variable, EisPackage.eINSTANCE.variable_VariantKeyword,
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
						EisPackage.eINSTANCE.udtRef_UdtType, RECURSIVE_UDT_REFERENCE)
				}
				count++
			}
		}
	}

	@Check def void checkUdtStatements(Statement statement) {
		if (!(statement.variable instanceof Variable) && statement.cascade.empty) {
			error("Only variables can be assigned to values", statement, EisPackage.eINSTANCE.statement_Variable,
				MISSING_UDT_REFERENCE)
		}

		val cascade = statement.cascade

		for (c : cascade) {
			if (!(c.udtVar instanceof Variable) && c === cascade.last) {
				error("Only variables can be assigned to values", statement, EisPackage.eINSTANCE.statement_Cascade,
					MISSING_UDT_REFERENCE)
			}
		}
	}

	@Check def void checkMultipleStatementsSetBlock(Set sets) {
		val set = sets.setVariables
		val multiMap = HashMultimap.create()
		var name = set?.head?.variable?.toString

		// add all variables to the map
		for (e : set) {
			if (e.cascade.empty)
				multiMap.put(e.variable, e)
			else {
				name = e.variable.toString
				for (c : e.cascade)
					name += c.udtVar.toString
				multiMap.put(name, e)
			}
		}

		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates) {
					if (d.cascade.empty)
						error("Multiple variable assignment", d, EisPackage.eINSTANCE.statement_Variable,
							MULTIPLE_STATEMENT_ASSIGNMENT)
					else {
						error("Multiple variable assignment", d, EisPackage.eINSTANCE.statement_Variable,
							MULTIPLE_STATEMENT_ASSIGNMENT)
						error("Multiple variable assignment", d, EisPackage.eINSTANCE.statement_Cascade,
							MULTIPLE_STATEMENT_ASSIGNMENT)
					}
				}
			}
		}
	}

	@Check def void checkMultipleStatementsAssertBlock(Assert asserts) {
		val assert = asserts.assertVariables
		val multiMap = HashMultimap.create()
		var name = ""

		// add all variables to the map
		for (e : assert) {
			if (e.cascade.empty)
				multiMap.put(e.variable.name, e)
			else {
				name = e.variable.name.toString
				for (c : e.cascade)
					name += '.' + c.udtVar.name.toString
				multiMap.put(name, e)
			}
		}

		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates) {
					if (d.cascade.empty)
						error("Multiple variable assignment", d, EisPackage.eINSTANCE.statement_Variable,
							MULTIPLE_STATEMENT_ASSIGNMENT)
					else {
						error("Multiple variable assignment", d, EisPackage.eINSTANCE.statement_Variable,
							MULTIPLE_STATEMENT_ASSIGNMENT)
						error("Multiple variable assignment", d, EisPackage.eINSTANCE.statement_Cascade,
							MULTIPLE_STATEMENT_ASSIGNMENT)
					}
				}
			}
		}
	}

	@Check def void checkRangeOperator(Variable variable) {
		if (variable.range !== null) {
			if (variable.variableType === BasicType.BOOL)
				error("The range feature is not permitted to boolean types", variable,
					EisPackage.eINSTANCE.variable_Range, INVALID_RANGE_DEFINITION)

			if (variable.variableType === BasicType.STRING)
				error("The range feature is not permitted to string types", variable,
					EisPackage.eINSTANCE.variable_Range, INVALID_RANGE_DEFINITION)

			if (variable.directionBlock instanceof Input)
				error("The range feature is not permitted to input variables", variable,
					EisPackage.eINSTANCE.variable_Range, INVALID_RANGE_DEFINITION)
		}
	}

	@Check def void checkRangeOperator(Set set) {
		val sets = set.setVariables
		for (statement : sets)
			if (statement.range !== null)
				error("The range feature is not permitted to input variables", statement,
					EisPackage.eINSTANCE.statement_Range, INVALID_RANGE_DEFINITION)
	}

	@Check def void checkUniquePlcCycles(DefineBlock define) {
		var multiMap = HashMultimap.create
		// add all udtTypes of input to the multimap
		for (e : define?.teststeps)
			multiMap.put(e.plcCycle, e)

		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					error("Multiple plcCycle", d, EisPackage.eINSTANCE.teststepBlock_PlcCycle,
						EisValidator.MULTIPLE_PLCCYCLE)
			}
		}
	}

	@Check def void checkUniqueTestcaseNames(EisModel model) {
		var multiMap = HashMultimap.create
		// add all udtTypes of input to the multimap
		for (e : model?.testcases)
			multiMap.put(e.testcase_name, e)

		// check for duplicates
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					error("Multiple plcCycle", d, EisPackage.eINSTANCE.testcase_Testcase_name,
						EisValidator.MULTIPLE_TESTCASE_NAME)
			}
		}
	}

//	@Check def void checkDatatypeBoundaries(Variable variable) {
//		if (variable.idiom !== null) {
//			val expectedType = variable.variableType.typeFor
//			
//	}
//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def EObject directionBlock(EObject context) {
		val container = context.eContainer
		if (container instanceof DirectionBlock)
			return context
		else
			container.directionBlock
	}

	def private void checkVariableTypeAndAddToMap(
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

	def private void checkVariableTypeAndCallError(Variables e) {
		if (e instanceof Udt)
			error("Multiple variable name '" + e.name + "'", e, EisPackage.eINSTANCE.variables_Name,
				EisValidator.MULTIPLE_UDT_DECLARATION)
		else if (e instanceof Variable)
			error("Multiple variable name '" + e.name + "'", e, EisPackage.eINSTANCE.variables_Name,
				EisValidator.MULTIPLE_VARIABLE_DECLARATION)
	}

	def private void checkNoDuplicateUdtTypes(Udt udt) {
		var multiMap = HashMultimap.create
		val udts = udt.udtVariables

		for (e : udts) {
			if (e instanceof Udt) {
				multiMap.put(e.udtType.name, e)
				e.checkNoDuplicateUdtTypes
			}
		}
	}

	def private void checkExpectedBoolean(Idiom exp, EReference reference) {
		checkExpectedType(exp, DefineTypeComputer.BOOL_TYPE, reference)
	}

	def private void checkExpectedInt(Idiom exp, EReference reference) {
		checkExpectedType(exp, DefineTypeComputer.INT_TYPE, reference)
	}

	def private void checkExpectedType(Idiom exp, DefineType expectedType, EReference reference) {
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

	def private void checkExpectedSameType(DefineType left, DefineType right) {
		if (right !== null && left !== null && right != left)
			error("expected the same type, but was " + left + ", " + right, EisPackage.Literals.EQUALITY.EIDAttribute,
				TYPE_MISMATCH)
	}

	def private void checkNotBoolean(DefineType type, EReference reference) {
		if (type.isBoolType)
			error("cannot be boolean", reference, TYPE_MISMATCH)
	}

	def private void compareTypesAndCallErrorOnMismatch(Statement statement, DefineType actualType,
		BasicType _expectedType, DefineType rangeType) {
		val expectedType = _expectedType.typeFor

		if (actualType != expectedType)
			if (!(actualType.isIntType && expectedType.isIntType))
				error("Incompatible types. Expected '" + expectedType.toString + "' but was '" + actualType.toString +
					"'", statement, EisPackage.eINSTANCE.statement_Idiom, INCOMPATIBLE_TYPES)
		if (rangeType !== null && rangeType != expectedType)
			if (!(actualType.isIntType && expectedType.isIntType))
				error("Incompatible types. Expected '" + expectedType.toString + "' but was '" + rangeType.toString +
					"'", statement, EisPackage.eINSTANCE.statement_Range, INCOMPATIBLE_TYPES)
	}

	def private void checkCommaSyntaxWithVariables(Iterable<? extends Variables> variables) {

		var count = 0 // ugly programming
		var countOfVariableBefore = 0
		var commaBeforeVariable = false;
		var helpingVariableType = BasicType.NULL
		var variantKeyword = false

		for (e : variables) {

			if (e instanceof Udt) {
				if (!e.udtVariables.empty)
					checkCommaSyntaxWithVariables(e.udtVariables)
			}

			// refer error to the last variable which was succeeded by a comma
			if (commaBeforeVariable && !(e instanceof Variable)) {
				error("Invalid comma. Semicolon expected.", variables.get(countOfVariableBefore),
					EisPackage.eINSTANCE.variable_NextVariable, INVALID_COMMA_NOTATION)
			}

			if (e instanceof Variable) {
				//
				if ((count - countOfVariableBefore) > 1) {
					// this checks the case if there's a udt type between a comma and the expected inferred type
					commaBeforeVariable = false
				}

				if (!commaBeforeVariable) {
					if (e.variableType === BasicType.NULL) {
						error("Missing variable type", e, EisPackage.eINSTANCE.variable_VariableType,
							MISSING_VARIABLE_TYPE);
					}
				} //
				// else if there was a comma before the variable
				else {
					// assign inferred type 								
					if (e.variableType === BasicType.NULL) {
						e.variableType = helpingVariableType
					} else {
						if (helpingVariableType !== e.variableType)
							error("Multiple type definition", e, EisPackage.eINSTANCE.variable_VariableType,
								MULTIPLE_TYPE_DEFINITION)
					}
					if (e.variantKeyword && !variantKeyword)
						error("Invalid variant keyword", e, EisPackage.eINSTANCE.variable_VariantKeyword,
							INVALID_VARIANT_KEYWORD)
					else
						// assign variantKeyword
						e.variantKeyword = variantKeyword
				}
// for the immediate next variable
				if (e.nextVariable) { // comma at the end instead of semicolon
					commaBeforeVariable = true;
					countOfVariableBefore = count;

					// the type must be handed over to the next variable
					helpingVariableType = e.variableType

				} else {
					commaBeforeVariable = false
					helpingVariableType = null

				}
				// the variant as well	
				variantKeyword = e.variantKeyword
			}
			count++
		}
		// check if the last/only variable ends with a comma
		val last = variables.last
		if (last instanceof Variable)
			if (last.nextVariable)
				error("Invalid comma. Semicolon expected.", last, EisPackage.eINSTANCE.variable_NextVariable,
					INVALID_COMMA_NOTATION)
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
			EisPackage.eINSTANCE.udtRef_UdtType, RECURSIVE_VARIABLE_REFERENCE)
		} else {
			val type = newVariable.variableType.typeFor

			if (variable?.idiom !== null)
				switch type {
					case type.isStringType: {
						newVariable.idiom = new StringConstantImpl;
						(newVariable.idiom as StringConstant).value = variable?.idiom?.interpret?.toString
					}
					case type.isBoolType: {
						newVariable.idiom = new BoolConstantImpl;
						(newVariable.idiom as BoolConstant).value = variable?.idiom?.interpret?.toString
					}
					case type.isIntType: {
						newVariable.idiom = new IntConstantImpl;
						(newVariable.idiom as IntConstant).value = variable?.idiom?.interpret as Integer
					}
				}

			if (variable?.range !== null)
				switch type {
					case type.isStringType: {
						newVariable.range = new StringConstantImpl;
						(newVariable.range as StringConstant).value = variable?.range?.interpret?.toString
					}
					case type.isBoolType: {
						newVariable.range = new BoolConstantImpl;
						(newVariable.range as BoolConstant).value = variable?.range?.interpret?.toString
					}
					case type.isIntType: {
						newVariable.range = new IntConstantImpl;
						(newVariable.range as IntConstant).value = (variable?.range?.interpret as Integer)
					}
				}
		}

		return newVariable
	}

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
						(e as UdtRef), EisPackage.eINSTANCE.udtRef_UdtType, RECURSIVE_UDT_REFERENCE)
				}
				count2++
			}
		}

		return newUdt
	}

//
// yet unimplemented -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Check def void checkUppercaseVariantName() {}

	@Check def void checkUppercaseUdtName() {}

	@Check def void checkLowercaseUdtType() {}

}
