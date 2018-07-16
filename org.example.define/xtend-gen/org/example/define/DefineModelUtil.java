package org.example.define;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.Output;
import org.example.define.define.Udt;
import org.example.define.define.UdtRef;
import org.example.define.define.UdtType;
import org.example.define.define.Variable;
import org.example.define.define.Variables;

@SuppressWarnings("all")
public class DefineModelUtil {
  public Set<Variable> variablesDefinedBefore(final Variable variable) {
    final EObject container = variable.eContainer();
    Iterable<Variable> _switchResult = null;
    boolean _matched = false;
    if (container instanceof Output) {
      _matched=true;
      final Function1<Variables, Boolean> _function = (Variables it) -> {
        return Boolean.valueOf((!Objects.equal(it, variable)));
      };
      _switchResult = Iterables.<Variable>filter(IterableExtensions.<Variables>takeWhile(((Output)container).getOutputVariables(), _function), Variable.class);
    }
    if (!_matched) {
      if (container instanceof Inout) {
        _matched=true;
        final Function1<Variables, Boolean> _function = (Variables it) -> {
          return Boolean.valueOf((!Objects.equal(it, variable)));
        };
        _switchResult = Iterables.<Variable>filter(IterableExtensions.<Variables>takeWhile(((Inout)container).getInoutVariables(), _function), Variable.class);
      }
    }
    if (!_matched) {
      if (container instanceof Input) {
        _matched=true;
        final Function1<Variables, Boolean> _function = (Variables it) -> {
          return Boolean.valueOf((!Objects.equal(it, variable)));
        };
        _switchResult = Iterables.<Variable>filter(IterableExtensions.<Variables>takeWhile(((Input)container).getInputVariables(), _function), Variable.class);
      }
    }
    if (!_matched) {
      if (container instanceof Udt) {
        _matched=true;
        final Function1<Variables, Boolean> _function = (Variables it) -> {
          return Boolean.valueOf((!Objects.equal(it, variable)));
        };
        _switchResult = Iterables.<Variable>filter(IterableExtensions.<Variables>takeWhile(((Udt)container).getUdtVariables(), _function), Variable.class);
      }
    }
    if (!_matched) {
      _switchResult = CollectionLiterals.<Variable>emptyList();
    }
    final Iterable<Variable> variablesBefore = _switchResult;
    return IterableExtensions.<Variable>toSet(variablesBefore);
  }
  
  public Iterable<UdtType> udtTypesDefinedBefore(final UdtRef variable) {
    final EObject container = variable.eContainer();
    Iterable<UdtType> _switchResult = null;
    boolean _matched = false;
    if (container instanceof Output) {
      _matched=true;
      final Function1<Variables, Boolean> _function = (Variables it) -> {
        return Boolean.valueOf((!Objects.equal(it, variable)));
      };
      final Function1<Udt, UdtType> _function_1 = (Udt it) -> {
        return it.getUdtType();
      };
      _switchResult = IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(IterableExtensions.<Variables>takeWhile(((Output)container).getOutputVariables(), _function), Udt.class), _function_1);
    }
    if (!_matched) {
      if (container instanceof Inout) {
        _matched=true;
        final Function1<Variables, Boolean> _function = (Variables it) -> {
          return Boolean.valueOf((!Objects.equal(it, variable)));
        };
        final Function1<Udt, UdtType> _function_1 = (Udt it) -> {
          return it.getUdtType();
        };
        _switchResult = IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(IterableExtensions.<Variables>takeWhile(((Inout)container).getInoutVariables(), _function), Udt.class), _function_1);
      }
    }
    if (!_matched) {
      if (container instanceof Input) {
        _matched=true;
        final Function1<Variables, Boolean> _function = (Variables it) -> {
          return Boolean.valueOf((!Objects.equal(it, variable)));
        };
        final Function1<Udt, UdtType> _function_1 = (Udt it) -> {
          return it.getUdtType();
        };
        _switchResult = IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(IterableExtensions.<Variables>takeWhile(((Input)container).getInputVariables(), _function), Udt.class), _function_1);
      }
    }
    if (!_matched) {
      if (container instanceof Udt) {
        _matched=true;
        final Function1<Variables, Boolean> _function = (Variables it) -> {
          return Boolean.valueOf((!Objects.equal(it, variable)));
        };
        final Function1<Udt, UdtType> _function_1 = (Udt it) -> {
          return it.getUdtType();
        };
        _switchResult = IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(IterableExtensions.<Variables>takeWhile(((Udt)container).getUdtVariables(), _function), Udt.class), _function_1);
      }
    }
    if (!_matched) {
      _switchResult = CollectionLiterals.<UdtType>emptyList();
    }
    final Iterable<UdtType> udtTypesBefore = _switchResult;
    return udtTypesBefore;
  }
}
