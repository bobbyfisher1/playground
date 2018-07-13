/**
 * generated by Xtext 2.14.0
 */
package org.example.define.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.example.define.define.DefineBlock;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.Output;
import org.example.define.define.Udt;
import org.example.define.define.UdtRef;
import org.example.define.define.Variables;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
@SuppressWarnings("all")
public class DefineOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final Variables v) {
    boolean _xifexpression = false;
    if ((v instanceof Udt)) {
      _xifexpression = false;
    } else {
      boolean _xifexpression_1 = false;
      if ((v instanceof UdtRef)) {
        _xifexpression_1 = false;
      } else {
        _xifexpression_1 = true;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public void _createChildren(final DocumentRootNode outlineNode, final DefineBlock defineBlock) {
    final Input in = defineBlock.getDirection().getInput();
    final Output out = defineBlock.getDirection().getOutput();
    this.createNode(outlineNode, in);
    this.createNode(outlineNode, out);
    Inout _inout = defineBlock.getDirection().getInout();
    boolean _tripleNotEquals = (_inout != null);
    if (_tripleNotEquals) {
      final Inout inout = defineBlock.getDirection().getInout();
      this.createNode(outlineNode, inout);
    }
  }
}
