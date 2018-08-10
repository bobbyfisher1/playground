/*
 * generated by Xtext 2.12.0
 */
package org.example.eis.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.example.eis.eis.InOut
import org.example.eis.eis.Input
import org.example.eis.eis.Output
import org.example.eis.eis.Udt

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class EisProposalProvider extends AbstractEisProposalProvider {

	override completeVariable_VariableType(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		// The content assist should work as expected.
		super.completeVariable_VariableType(model, assignment, context, acceptor)

		// As an added proposals udtTypes are shown as well 
		// Here model is either input, inout or output
		val udtTypes = if (model instanceof Input)
				model.inputVariables.filter(Udt).map[udtType]
			else if (model instanceof InOut)
				model.inoutVariables.filter(Udt).map[udtType]
			else if (model instanceof Output)
				model.outputVariables.filter(Udt).map[udtType]
			else if (model instanceof Udt)
				model.udtVariables.filter(Udt).map[udtType]
		for (e : udtTypes)
			acceptor.accept(createCompletionProposal(e.name, e.name + " - UdtType", null, context))
	}
}