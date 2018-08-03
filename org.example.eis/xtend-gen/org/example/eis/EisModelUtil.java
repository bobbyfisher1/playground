package org.example.eis;

import com.google.common.collect.Iterables;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.eis.eis.Input;
import org.example.eis.eis.Output;
import org.example.eis.eis.Udt;
import org.example.eis.eis.UdtRef;
import org.example.eis.eis.UdtType;
import org.example.eis.eis.Variable;

@SuppressWarnings("all")
public class EisModelUtil {
  public Set<Variable> variablesDefinedBefore(final Variable variable) {
    throw new Error("Unresolved compilation problems:"
      + "\nInOut cannot be resolved to a type."
      + "\nThe method or field inoutVariables is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ntakeWhile cannot be resolved"
      + "\nfilter cannot be resolved");
  }
  
  public Iterable<Variable> variablesDefinedBefore(final Input input) {
    return Iterables.<Variable>filter(input.getInputVariables(), Variable.class);
  }
  
  public Iterable<Variable> variablesDefinedBefore(final Output output) {
    return Iterables.<Variable>filter(output.getOutputVariables(), Variable.class);
  }
  
  public Object variablesDefinedBefore(final /* InOut */Object inout) {
    throw new Error("Unresolved compilation problems:"
      + "\ninoutVariables cannot be resolved"
      + "\nfilter cannot be resolved");
  }
  
  public Iterable<UdtType> udtTypesDefinedBefore(final UdtRef variable) {
    throw new Error("Unresolved compilation problems:"
      + "\nInOut cannot be resolved to a type."
      + "\nThe method or field inoutVariables is undefined for the type EObject"
      + "\nThe method or field udtType is undefined"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ntakeWhile cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nmap cannot be resolved");
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
  
  public Object udtTypesDefinedBefore(final /* InOut */Object inout) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field udtType is undefined"
      + "\ninoutVariables cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  public Iterable<UdtType> udtTypesDefinedBefore(final Udt udt) {
    final Function1<Udt, UdtType> _function = (Udt it) -> {
      return it.getUdtType();
    };
    return IterableExtensions.<Udt, UdtType>map(Iterables.<Udt>filter(udt.getUdtVariables(), Udt.class), _function);
  }
}
