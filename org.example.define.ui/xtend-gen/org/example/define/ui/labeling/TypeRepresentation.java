package org.example.define.ui.labeling;

import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.define.define.BasicType;
import org.example.define.define.Variable;
import org.example.define.typing.DefineTypeComputer;

@SuppressWarnings("all")
public class TypeRepresentation {
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  public String trueVariableType(final Variable v) {
    String _xblockexpression = null;
    {
      String string = "";
      boolean _isVariantKeyword = v.isVariantKeyword();
      if (_isVariantKeyword) {
        String _string = string;
        string = (_string + "variant ");
      }
      String _xifexpression = null;
      BasicType _variableType = v.getVariableType();
      boolean _tripleNotEquals = (_variableType != null);
      if (_tripleNotEquals) {
        String _string_1 = string;
        String _string_2 = this._defineTypeComputer.typeFor(v.getVariableType()).toString();
        _xifexpression = string = (_string_1 + _string_2);
      } else {
        String _string_3 = string;
        _xifexpression = string = (_string_3 + " absolutely, positvely, truly null ");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
