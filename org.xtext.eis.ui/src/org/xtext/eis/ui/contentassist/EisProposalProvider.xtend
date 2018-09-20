/*
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.xtext.eis.eis.InOut
import org.xtext.eis.eis.Input
import org.xtext.eis.eis.Output
import org.xtext.eis.eis.Udt

class EisProposalProvider extends AbstractEisProposalProvider {
	override completeVariable_VariableType(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {

		super.completeVariable_VariableType(model, assignment, context, acceptor)

		// As added proposals udtTypes are shown as well 
		// Here model is either input, inout or output
		val udtTypes = if (model instanceof Input)
				model.inputVariables.filter(Udt).map[udtType]
			else if (model instanceof Output)
				model.outputVariables.filter(Udt).map[udtType]
			else if (model instanceof InOut)
				model.inoutVariables.filter(Udt).map[udtType]
			else if (model instanceof Udt)
				model.udtVariables.filter(Udt).map[udtType]

		for (e : udtTypes)
			acceptor.accept(createCompletionProposal(e.name, e.name + " - UdtType", null, context))
	}

	override completeBoolConstant_Value(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeBoolConstant_Value(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("", "testActive (bool)", null, context))
	}

	override completeBlockConstant_Value(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeBlockConstant_Value(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("", "blocktype (FB|FC)", null, context))
	}

	override complete_EisModel(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.complete_EisModel(model, ruleCall, context, acceptor)
//		acceptor.accept(createCompletionProposal("project = ", "project", null, context))
//		acceptor.accept(createCompletionProposal("plcname = ", "plcname", null, context))
		acceptor.accept(createCompletionProposal("author = ", "author", null, context))
	}

	override completeEisModel_ProjectName(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeEisModel_ProjectName(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal('''"projectName";
		'''.toString, "projectName (string)", null, context))
	}

	override completeEisModel_PlcName(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {

		super.completeEisModel_PlcName(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal('''"plcName";
		'''.toString, "plcName (string)", null, context))
	}

	override completeEisModel_AuthorName(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeEisModel_AuthorName(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal('''"authorName";
		'''.toString, 'authorName (string)', null, context))
	}

	override complete_Testcase(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.complete_Testcase(model, ruleCall, context, acceptor)
		acceptor.accept(createCompletionProposal("testcase ", "testcase", null, context))
	}

	override completeTestcase_TestcaseName(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeTestcase_TestcaseName(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("testcaseName(", 'testcaseName (ID)', null, context))
	}

	override completeTestcase_Description(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeTestcase_Description(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal(
		'''"description"){
	define {
		input[]
		output[]
		inout[]
	}
	teststep(0, "description") {
		set[]
		assert[]
	}
''', 'description (string)', null, context))
	}

	override completeTeststepBlock_PlcCycle(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeTeststepBlock_PlcCycle(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal('0, ', 'plcCycle (int)', null, context))
	}

	override completeTeststepBlock_Description(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeTeststepBlock_Description(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal(
		'''"description"){
		set[]
		assert[]
	}''', 'description (string)', null, context))
	}
}
