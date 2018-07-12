package org.example.define.ui.labeling;

import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.define.define.BasicType;
import org.example.define.define.Variable;
import org.example.define.define.Variables;
import org.example.define.typing.DefineTypeComputer;

@SuppressWarnings("all")
public class TypeRepresentation {
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  public String trueVariableType(final Variables v) {
    String _xifexpression = null;
    if ((v instanceof Variable)) {
      String _xblockexpression = null;
      {
        String string = "";
        boolean _isVariantKeyword = ((Variable)v).isVariantKeyword();
        if (_isVariantKeyword) {
          String _string = string;
          string = (_string + "variant ");
        }
        String _xifexpression_1 = null;
        BasicType _variableType = ((Variable)v).getVariableType();
        boolean _tripleNotEquals = (_variableType != null);
        if (_tripleNotEquals) {
          String _string_1 = string;
          String _string_2 = this._defineTypeComputer.typeFor(((Variable)v).getVariableType()).toString();
          _xifexpression_1 = string = (_string_1 + _string_2);
        } else {
          String _string_3 = string;
          _xifexpression_1 = string = (_string_3 + " absolutely, positvely, truly null ");
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
