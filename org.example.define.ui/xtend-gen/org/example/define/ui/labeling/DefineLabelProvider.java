/**
 * generated by Xtext 2.14.0
 */
package org.example.define.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.Output;
import org.example.define.define.Udt;
import org.example.define.define.Variable;
import org.example.define.ui.labeling.TypeRepresentation;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class DefineLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  @Extension
  private TypeRepresentation _typeRepresentation;
  
  @Inject
  public DefineLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Input i) {
    return "input";
  }
  
  public String text(final Output o) {
    return "output";
  }
  
  public String text(final Inout io) {
    return "inout";
  }
  
  public String text(final Variable v) {
    String _xifexpression = null;
    Udt _udt = v.getUdt();
    boolean _tripleNotEquals = (_udt != null);
    if (_tripleNotEquals) {
      String _udtName = v.getUdt().getUdtName();
      String _plus = ("udt " + _udtName);
      String _plus_1 = (_plus + " of type ");
      String _udtTypeName = v.getUdt().getUdtTypes().getUdtTypeName();
      _xifexpression = (_plus_1 + _udtTypeName);
    } else {
      String _variableName = v.getVariableName();
      String _plus_2 = (_variableName + " : ");
      String _trueVariableType = this._typeRepresentation.trueVariableType(v);
      _xifexpression = (_plus_2 + _trueVariableType);
    }
    return _xifexpression;
  }
}
