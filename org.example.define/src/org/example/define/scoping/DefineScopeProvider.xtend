/*
 * generated by Xtext 2.14.0
 */
package org.example.define.scoping

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.example.define.DefineModelUtil
import org.example.define.define.Assert
import org.example.define.define.DefineBlock
import org.example.define.define.DefinePackage
import org.example.define.define.Idiom
import org.example.define.define.Inout
import org.example.define.define.Input
import org.example.define.define.Output
import org.example.define.define.Set
import org.example.define.define.Statement
import org.example.define.define.Udt
import org.example.define.define.UdtRef
import org.example.define.define.Variable
import org.example.define.define.Variables

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class DefineScopeProvider extends AbstractDefineScopeProvider {

	@Inject extension DefineModelUtil

	override getScope(EObject context, EReference reference) {
		if (reference == DefinePackage.eINSTANCE.udtRef_UdtType)
			return scopeForUdtType(context)
		else if (reference == DefinePackage.eINSTANCE.variableRef_Variable)
			return scopeForVariableRef(context)
		else if (reference == DefinePackage.eINSTANCE.statement_Variable)
			return scopeForStatements(context)
		else if (reference == DefinePackage.eINSTANCE.cascade_UdtVar)
			return scopeForUdtStatements(context)
		else
			return super.getScope(context, reference)
	}

//
//  scope methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def protected IScope scopeForUdtType(EObject context) {
		return switch (context) {
			UdtRef:
				Scopes.scopeFor(context.udtTypesDefinedBefore)
			Input:
				Scopes.scopeFor(context.udtTypesDefinedBefore)
			Output:
				Scopes.scopeFor(context.udtTypesDefinedBefore)
			Inout:
				Scopes.scopeFor(context.udtTypesDefinedBefore)
			Udt:
				Scopes.scopeFor(context.udtTypesDefinedBefore)
		}
	}

	def protected IScope scopeForVariableRef(EObject context) {
		return switch (context) {
			Variable:
				Scopes.scopeFor(context.variablesDefinedBefore)
			Idiom:
				Scopes.scopeFor((context.eContainer as Variable).variablesDefinedBefore)
		}
	}

	def protected IScope scopeForStatements(EObject context) {
		var defineBlock = getDefineBlock(context)

		val input = (defineBlock as DefineBlock).direction.input
		val output = (defineBlock as DefineBlock).direction.output
		val inout = (defineBlock as DefineBlock).direction?.inout

		var List<Variables> inoutScope = emptyList
		if (inout !== null)
			inoutScope = inout.inoutVariables

		if (context instanceof Statement)
			statementScope(context.eContainer, input, output, inoutScope)
		else
			statementScope(context, input, output, inoutScope)
	}

	def protected IScope scopeForUdtStatements(EObject context) { // context is the specific cascade
		val cascade = (context.eContainer as Statement).cascade
		val number = getNumber(context)
		
		if (context === cascade.head)
			return firstPosition(context) // use case: the statement was of an Udt or UdtRef.  First position 
		else { // higher position
			val pos = number - 1
			val penultimate = cascade.get(pos).udtVar
			if (penultimate instanceof Udt)
				return Scopes.scopeFor(penultimate.udtVariables)
			else if (penultimate instanceof UdtRef)
				return Scopes.scopeFor((penultimate.udtType.eContainer as Udt).udtVariables)
		} // else
		// return IScope.NULLSCOPE
	}

//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def getNumber(EObject context) {
		val cascade = (context.eContainer as Statement).cascade
		var num = 0
		for (c : cascade) {
			if (c === context) {
				return num
			}
			num++
		}
	}

	def protected IScope firstPosition(EObject context) { // context is cascade
		val variable = (context.eContainer as Statement).variable

		if (variable instanceof Udt)
			return Scopes.scopeFor(variable.udtVariables)
		else if (variable instanceof UdtRef) // This is so called backtracking. The original Udt which the UdtRef was pointing to is scoped. 
			return Scopes.scopeFor((variable.udtType.eContainer as Udt).udtVariables)
	}

	def protected EObject getDefineBlock(EObject context) {
		val container = context.eContainer
		if (container instanceof DefineBlock)
			return container
		else
			getDefineBlock(container)
	}

	def protected IScope statementScope(EObject context, Input inputs, Output outputs, List<Variables> inoutScope) {
		var input = inputs.inputVariables
		var output = outputs.outputVariables

		return switch (context) {
			Set:
				Scopes.scopeFor(input + inoutScope)
			Assert:
				Scopes.scopeFor(output + inoutScope)
		}
	}

}
