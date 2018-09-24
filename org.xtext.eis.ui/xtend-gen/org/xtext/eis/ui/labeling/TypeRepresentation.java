package org.xtext.eis.ui.labeling;

import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.eis.eis.Variable;
import org.xtext.eis.typing.EisTypeComputer;

@SuppressWarnings("all")
public class TypeRepresentation {
  @Inject
  @Extension
  private EisTypeComputer _eisTypeComputer;
  
  public String trueVariableType(final Variable v) {
    String _xblockexpression = null;
    {
      String string = "";
      boolean _isVariantKeyword = v.isVariantKeyword();
      if (_isVariantKeyword) {
        String _string = string;
        string = (_string + "variant ");
      }
      String _string_1 = string;
      String _string_2 = this._eisTypeComputer.typeFor(v.getVariableType()).toString();
      _xblockexpression = string = (_string_1 + _string_2);
    }
    return _xblockexpression;
  }
}
