package org.example.eis.ui.labeling;

import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.eis.eis.Variable;
import org.example.eis.typing.DefineTypeComputer;

@SuppressWarnings("all")
public class TypeRepresentation {
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  public String trueVariableType(final Variable v) {
    String _xblockexpression = null;
    {
      String string = "";
      boolean _isInout = v.isInout();
      if (_isInout) {
        String _string = string;
        string = (_string + "inout ");
      }
      boolean _isVariantKeyword = v.isVariantKeyword();
      if (_isVariantKeyword) {
        String _string_1 = string;
        string = (_string_1 + "variant ");
      }
      String _string_2 = string;
      String _string_3 = this._defineTypeComputer.typeFor(v.getVariableType()).toString();
      _xblockexpression = string = (_string_2 + _string_3);
    }
    return _xblockexpression;
  }
}
