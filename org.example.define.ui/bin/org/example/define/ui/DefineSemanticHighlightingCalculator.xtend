package org.example.define.ui

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.util.CancelIndicator
import org.example.define.define.DefinePackage
import org.example.define.define.UdtType

class DefineSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	/*
	 * Here, well I'm not sure if the class is supposed to extend the above calculator, syntax highlighting is configured.
	 * Check out the following websites for information on how to do that.
	 * 
	 * http://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#highlighting
	 * https://www.eclipse.org/forums/index.php/t/1066294/
	 * https://github.com/mn-mikke/Model-driven-Pretty-Printer-for-Xtext-Framework/wiki/Standard-Way-of-Syntax-Highlighting-in-Xtext-Framework
	 */
	override protected doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		val EObject rootObject = resource.getParseResult().getRootASTElement();

		for (UdtType g : EcoreUtil2.getAllContentsOfType(rootObject, UdtType)) {
			for (INode node : NodeModelUtils.findNodesForFeature(g, DefinePackage.eINSTANCE.udt_UdtType)) {

				acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.KEYWORD_ID);
			}
		}
		super.doProvideHighlightingFor(resource, acceptor, cancelIndicator)
	}

/*
 * 	override protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
 * 		EObject
 * 		rootObject = resource.getParseResult().getRootASTElement();

 * 		for (UdtType g : EcoreUtil2.getAllContentsOfType(rootObject,)) {
 * 			for (INode node : NodeModelUtils.findNodesForFeature(g, MyDslPackage.Literals.GREETING__NAME)) {

 * 				acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.COMMENT_ID);
 * 			}
 * 		}
 * 		super.doProvideHighlightingFor(resource, acceptor);
 * 	}
 */
}
