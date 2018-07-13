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
import org.example.define.define.UdtRef;
import org.example.define.define.Variable;
import org.example.define.define.Variables;
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
  
  public String text(final Variables v) {
    String _xifexpression = null;
    if ((v instanceof Variable)) {
      String _name = ((Variable)v).getName();
      String _plus = (_name + " : ");
      String _trueVariableType = this._typeRepresentation.trueVariableType(((Variable)v));
      _xifexpression = (_plus + _trueVariableType);
    } else {
      String _xifexpression_1 = null;
      if ((v instanceof Udt)) {
        String _name_1 = ((Udt)v).getName();
        String _plus_1 = ("udt " + _name_1);
        String _plus_2 = (_plus_1 + " of type ");
        String _name_2 = ((Udt)v).getUdtType().getName();
        _xifexpression_1 = (_plus_2 + _name_2);
      } else {
        String _xifexpression_2 = null;
        if ((v instanceof UdtRef)) {
          String _name_3 = ((UdtRef)v).getName();
          String _plus_3 = ("udt " + _name_3);
          String _plus_4 = (_plus_3 + " of type ");
          String _name_4 = ((UdtRef)v).getUdtType().getName();
          _xifexpression_2 = (_plus_4 + _name_4);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
