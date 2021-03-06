/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.eis.eis.AssertionBlock;
import org.xtext.eis.eis.Cascade;
import org.xtext.eis.eis.Idiom;
import org.xtext.eis.eis.InOut;
import org.xtext.eis.eis.Input;
import org.xtext.eis.eis.Output;
import org.xtext.eis.eis.Statement;
import org.xtext.eis.eis.TeststepBlock;
import org.xtext.eis.eis.Udt;
import org.xtext.eis.eis.UdtRef;
import org.xtext.eis.eis.Variable;
import org.xtext.eis.eis.Variables;
import org.xtext.eis.ui.labeling.TypeRepresentation;

@SuppressWarnings("all")
public class EisLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  @Extension
  private TypeRepresentation _typeRepresentation;
  
  @Inject
  public EisLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Input i) {
    return "input";
  }
  
  public String text(final Output o) {
    return "output";
  }
  
  public String text(final InOut io) {
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
  
  public String text(final AssertionBlock aBlock) {
    EObject _eContainer = aBlock.eContainer();
    final int plcCycle = Long.valueOf(((TeststepBlock) _eContainer).getPlcCycle()).intValue();
    EObject _eContainer_1 = aBlock.eContainer();
    final String description = ((TeststepBlock) _eContainer_1).getDescription();
    return ((("teststep " + Integer.valueOf(plcCycle)) + "   ") + description);
  }
  
  public String text(final Statement st) {
    String name = st.getVariable().toString();
    boolean _isEmpty = st.getCascade().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Cascade> _cascade = st.getCascade();
      for (final Cascade c : _cascade) {
        String _name = name;
        name = (_name + c);
      }
    }
    String _elvis = null;
    String _string = st.getIdiom().toString();
    String _plus = ((name + " = ") + _string);
    String _plus_1 = (_plus + " +/- ");
    Idiom _range = null;
    if (st!=null) {
      _range=st.getRange();
    }
    String _string_1 = _range.toString();
    String _plus_2 = (_plus_1 + _string_1);
    if (_plus_2 != null) {
      _elvis = _plus_2;
    } else {
      _elvis = "";
    }
    return _elvis;
  }
  
  public String text(final Cascade cascade) {
    final EObject statement = cascade.eContainer();
    String name = ((Statement) statement).getVariable().toString();
    if ((statement instanceof Statement)) {
      boolean _isEmpty = ((Statement)statement).getCascade().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<Cascade> _cascade = ((Statement)statement).getCascade();
        for (final Cascade c : _cascade) {
          String _name = name;
          name = (_name + c);
        }
      }
      String _elvis = null;
      String _string = ((Statement)statement).getIdiom().toString();
      String _plus = ((name + " = ") + _string);
      String _plus_1 = (_plus + " +/- ");
      Idiom _range = null;
      if (((Statement)statement)!=null) {
        _range=((Statement)statement).getRange();
      }
      String _string_1 = _range.toString();
      String _plus_2 = (_plus_1 + _string_1);
      if (_plus_2 != null) {
        _elvis = _plus_2;
      } else {
        _elvis = "";
      }
      return _elvis;
    }
    return null;
  }
}
