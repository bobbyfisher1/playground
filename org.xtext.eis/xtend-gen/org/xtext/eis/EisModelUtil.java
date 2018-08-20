package org.xtext.eis;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.eis.eis.Input;
import org.xtext.eis.eis.Output;
import org.xtext.eis.eis.Udt;
import org.xtext.eis.eis.UdtRef;
import org.xtext.eis.eis.UdtType;
import org.xtext.eis.eis.Variable;
import org.xtext.eis.eis.Variables;

@SuppressWarnings("all")
public class EisModelUtil {
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
  
  public Iterable<Variable> variablesDefinedBefore(final Input input) {
    return Iterables.<Variable>filter(input.getInputVariables(), Variable.class);
  }
  
  public Iterable<Variable> variablesDefinedBefore(final Output output) {
    return Iterables.<Variable>filter(output.getOutputVariables(), Variable.class);
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
    return _switchResult;
  }
  
  public Iterable<UdtType> udtTypesDefinedBefore(final Input input) {
    final Function1<Udt, UdtType> _function = (Udt it) -> {
      return it.getUdtType();
    };
    return IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(input.getInputVariables(), Udt.class), _function);
  }
  
  public Iterable<UdtType> udtTypesDefinedBefore(final Output output) {
    final Function1<Udt, UdtType> _function = (Udt it) -> {
      return it.getUdtType();
    };
    return IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(output.getOutputVariables(), Udt.class), _function);
  }
  
  public Iterable<UdtType> udtTypesDefinedBefore(final Udt udt) {
    final Function1<Udt, UdtType> _function = (Udt it) -> {
      return it.getUdtType();
    };
    return IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(udt.getUdtVariables(), Udt.class), _function);
  }
  
  public String toCharUpper(final String string, final int index) {
    final char[] array = string.toCharArray();
    final char uppercaseChar = Character.valueOf(Character.valueOf(array[index]).charValue()).toString().toUpperCase().charAt(0);
    array[index] = uppercaseChar;
    return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(array)));
  }
}
