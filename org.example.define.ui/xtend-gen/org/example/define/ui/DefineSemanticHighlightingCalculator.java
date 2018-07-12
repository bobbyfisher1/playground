package org.example.define.ui;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;
import org.example.define.define.DefinePackage;
import org.example.define.define.UdtType;

@SuppressWarnings("all")
public class DefineSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  /**
   * Here, well I'm not sure if the class is supposed to extend the above calculator, syntax highlighting is configured.
   * Check out the following websites for information on how to do that.
   * 
   * http://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#highlighting
   * https://www.eclipse.org/forums/index.php/t/1066294/
   * https://github.com/mn-mikke/Model-driven-Pretty-Printer-for-Xtext-Framework/wiki/Standard-Way-of-Syntax-Highlighting-in-Xtext-Framework
   */
  @Override
  protected void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    final EObject rootObject = resource.getParseResult().getRootASTElement();
    List<UdtType> _allContentsOfType = EcoreUtil2.<UdtType>getAllContentsOfType(rootObject, UdtType.class);
    for (final UdtType g : _allContentsOfType) {
      List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(g, DefinePackage.eINSTANCE.getUdt_UdtType());
      for (final INode node : _findNodesForFeature) {
        acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.KEYWORD_ID);
      }
    }
    super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
  }
}
