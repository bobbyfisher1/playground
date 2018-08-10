/**
 * generated by Xtext 2.14.0
 */
package org.example.define.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.define.DefineModelUtil;
import org.example.define.define.Assert;
import org.example.define.define.Cascade;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.DirectionBlock;
import org.example.define.define.Idiom;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.Output;
import org.example.define.define.Set;
import org.example.define.define.Statement;
import org.example.define.define.Udt;
import org.example.define.define.UdtRef;
import org.example.define.define.Variable;
import org.example.define.define.Variables;
import org.example.define.scoping.AbstractDefineScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class DefineScopeProvider extends AbstractDefineScopeProvider {
  @Inject
  @Extension
  private DefineModelUtil _defineModelUtil;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    EReference _udtRef_UdtType = DefinePackage.eINSTANCE.getUdtRef_UdtType();
    boolean _equals = Objects.equal(reference, _udtRef_UdtType);
    if (_equals) {
      return this.scopeForUdtType(context);
    } else {
      EReference _variableRef_Variable = DefinePackage.eINSTANCE.getVariableRef_Variable();
      boolean _equals_1 = Objects.equal(reference, _variableRef_Variable);
      if (_equals_1) {
        return this.scopeForVariableRef(context);
      } else {
        EReference _statement_Variable = DefinePackage.eINSTANCE.getStatement_Variable();
        boolean _equals_2 = Objects.equal(reference, _statement_Variable);
        if (_equals_2) {
          return this.scopeForStatements(context);
        } else {
          EReference _cascade_UdtVar = DefinePackage.eINSTANCE.getCascade_UdtVar();
          boolean _equals_3 = Objects.equal(reference, _cascade_UdtVar);
          if (_equals_3) {
            return this.scopeForUdtStatements(context);
          } else {
            return super.getScope(context, reference);
          }
        }
      }
    }
  }
  
  protected IScope scopeForUdtType(final EObject context) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (context instanceof UdtRef) {
      _matched=true;
      _switchResult = Scopes.scopeFor(this._defineModelUtil.udtTypesDefinedBefore(((UdtRef)context)));
    }
    if (!_matched) {
      if (context instanceof Input) {
        _matched=true;
        _switchResult = Scopes.scopeFor(this._defineModelUtil.udtTypesDefinedBefore(((Input)context)));
      }
    }
    if (!_matched) {
      if (context instanceof Output) {
        _matched=true;
        _switchResult = Scopes.scopeFor(this._defineModelUtil.udtTypesDefinedBefore(((Output)context)));
      }
    }
    if (!_matched) {
      if (context instanceof Inout) {
        _matched=true;
        _switchResult = Scopes.scopeFor(this._defineModelUtil.udtTypesDefinedBefore(((Inout)context)));
      }
    }
    if (!_matched) {
      if (context instanceof Udt) {
        _matched=true;
        _switchResult = Scopes.scopeFor(this._defineModelUtil.udtTypesDefinedBefore(((Udt)context)));
      }
    }
    return _switchResult;
  }
  
  protected IScope scopeForVariableRef(final EObject context) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (context instanceof Variable) {
      _matched=true;
      _switchResult = Scopes.scopeFor(this._defineModelUtil.variablesDefinedBefore(((Variable)context)));
    }
    if (!_matched) {
      if (context instanceof Idiom) {
        _matched=true;
        EObject _eContainer = ((Idiom)context).eContainer();
        _switchResult = Scopes.scopeFor(this._defineModelUtil.variablesDefinedBefore(((Variable) _eContainer)));
      }
    }
    return _switchResult;
  }
  
  protected IScope scopeForStatements(final EObject context) {
    IScope _xblockexpression = null;
    {
      EObject defineBlock = this.getDefineBlock(context);
      final Input input = ((DefineBlock) defineBlock).getDirection().getInput();
      final Output output = ((DefineBlock) defineBlock).getDirection().getOutput();
      DirectionBlock _direction = ((DefineBlock) defineBlock).getDirection();
      Inout _inout = null;
      if (_direction!=null) {
        _inout=_direction.getInout();
      }
      final Inout inout = _inout;
      List<Variables> inoutScope = CollectionLiterals.<Variables>emptyList();
      if ((inout != null)) {
        inoutScope = inout.getInoutVariables();
      }
      IScope _xifexpression = null;
      if ((context instanceof Statement)) {
        _xifexpression = this.statementScope(((Statement)context).eContainer(), input, output, inoutScope);
      } else {
        _xifexpression = this.statementScope(context, input, output, inoutScope);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected IScope scopeForUdtStatements(final EObject context) {
    EObject _eContainer = context.eContainer();
    final EList<Cascade> cascade = ((Statement) _eContainer).getCascade();
    final Integer number = this.getNumber(context);
    Cascade _head = IterableExtensions.<Cascade>head(cascade);
    boolean _tripleEquals = (context == _head);
    if (_tripleEquals) {
      return this.firstPosition(context);
    } else {
      final int pos = ((number).intValue() - 1);
      final Variables penultimate = cascade.get(pos).getUdtVar();
      if ((penultimate instanceof Udt)) {
        return Scopes.scopeFor(((Udt)penultimate).getUdtVariables());
      } else {
        if ((penultimate instanceof UdtRef)) {
          EObject _eContainer_1 = ((UdtRef)penultimate).getUdtType().eContainer();
          return Scopes.scopeFor(((Udt) _eContainer_1).getUdtVariables());
        }
      }
    }
    return null;
  }
  
  public Integer getNumber(final EObject context) {
    EObject _eContainer = context.eContainer();
    final EList<Cascade> cascade = ((Statement) _eContainer).getCascade();
    int num = 0;
    for (final Cascade c : cascade) {
      {
        if ((c == context)) {
          return Integer.valueOf(num);
        }
        num++;
      }
    }
    return null;
  }
  
  protected IScope firstPosition(final EObject context) {
    EObject _eContainer = context.eContainer();
    final Variables variable = ((Statement) _eContainer).getVariable();
    if ((variable instanceof Udt)) {
      return Scopes.scopeFor(((Udt)variable).getUdtVariables());
    } else {
      if ((variable instanceof UdtRef)) {
        EObject _eContainer_1 = ((UdtRef)variable).getUdtType().eContainer();
        return Scopes.scopeFor(((Udt) _eContainer_1).getUdtVariables());
      }
    }
    return null;
  }
  
  protected EObject getDefineBlock(final EObject context) {
    EObject _xblockexpression = null;
    {
      final EObject container = context.eContainer();
      EObject _xifexpression = null;
      if ((container instanceof DefineBlock)) {
        return container;
      } else {
        _xifexpression = this.getDefineBlock(container);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected IScope statementScope(final EObject context, final Input inputs, final Output outputs, final List<Variables> inoutScope) {
    EList<Variables> input = inputs.getInputVariables();
    EList<Variables> output = outputs.getOutputVariables();
    IScope _switchResult = null;
    boolean _matched = false;
    if (context instanceof Set) {
      _matched=true;
      Iterable<Variables> _plus = Iterables.<Variables>concat(input, inoutScope);
      _switchResult = Scopes.scopeFor(_plus);
    }
    if (!_matched) {
      if (context instanceof Assert) {
        _matched=true;
        Iterable<Variables> _plus = Iterables.<Variables>concat(output, inoutScope);
        _switchResult = Scopes.scopeFor(_plus);
      }
    }
    return _switchResult;
  }
}