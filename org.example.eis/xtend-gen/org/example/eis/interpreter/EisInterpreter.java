package org.example.eis.interpreter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.example.eis.eis.And;
import org.example.eis.eis.BoolConstant;
import org.example.eis.eis.Comparison;
import org.example.eis.eis.Equality;
import org.example.eis.eis.Idiom;
import org.example.eis.eis.IntConstant;
import org.example.eis.eis.Minus;
import org.example.eis.eis.MulOrDiv;
import org.example.eis.eis.Not;
import org.example.eis.eis.Or;
import org.example.eis.eis.Plus;
import org.example.eis.eis.RealConstant;
import org.example.eis.eis.StringConstant;
import org.example.eis.eis.Variable;
import org.example.eis.eis.VariableRef;
import org.example.eis.typing.DefineTypeComputer;

@SuppressWarnings("all")
public class EisInterpreter {
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  @Inject
  private IResourceScopeCache cache;
  
  protected Object _interpret(final Idiom e) {
    Object _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntConstant) {
      _matched=true;
      _switchResult = ((IntConstant)e).getValue();
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = Boolean.valueOf(Boolean.parseBoolean(((BoolConstant)e).getValue()));
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        _switchResult = ((StringConstant)e).getValue();
      }
    }
    if (!_matched) {
      if (e instanceof RealConstant) {
        _matched=true;
        _switchResult = Float.valueOf(((RealConstant)e).getValue());
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        Object _interpret = this.interpret(((Not)e).getIdiom());
        _switchResult = Boolean.valueOf((!(((Boolean) _interpret)).booleanValue()));
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        int _xblockexpression = (int) 0;
        {
          Object _interpret = this.interpret(((MulOrDiv)e).getLeft());
          final Integer left = ((Integer) _interpret);
          Object _interpret_1 = this.interpret(((MulOrDiv)e).getRight());
          final Integer right = ((Integer) _interpret_1);
          int _xifexpression = (int) 0;
          String _op = ((MulOrDiv)e).getOp();
          boolean _equals = Objects.equal(_op, "*");
          if (_equals) {
            _xifexpression = ((left).intValue() * (right).intValue());
          } else {
            _xifexpression = ((left).intValue() / (right).intValue());
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = Integer.valueOf(_xblockexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        Object _interpret = this.interpret(((Minus)e).getLeft());
        Object _interpret_1 = this.interpret(((Minus)e).getRight());
        _switchResult = Integer.valueOf(((((Integer) _interpret)).intValue() - (((Integer) _interpret_1)).intValue()));
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        Object _xifexpression = null;
        if ((this._defineTypeComputer.isStringType(this._defineTypeComputer.typeFor(((Plus)e).getLeft())) || this._defineTypeComputer.isStringType(this._defineTypeComputer.typeFor(((Plus)e).getRight())))) {
          String _string = this.interpret(((Plus)e).getLeft()).toString();
          String _string_1 = this.interpret(((Plus)e).getRight()).toString();
          _xifexpression = (_string + _string_1);
        } else {
          Object _interpret = this.interpret(((Plus)e).getLeft());
          Object _interpret_1 = this.interpret(((Plus)e).getRight());
          _xifexpression = Integer.valueOf(((((Integer) _interpret)).intValue() + (((Integer) _interpret_1)).intValue()));
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        boolean _xifexpression = false;
        String _op = ((Equality)e).getOp();
        boolean _equals = Objects.equal(_op, "==");
        if (_equals) {
          Object _interpret = this.interpret(((Equality)e).getLeft());
          Object _interpret_1 = this.interpret(((Equality)e).getRight());
          _xifexpression = Objects.equal(_interpret, _interpret_1);
        } else {
          Object _interpret_2 = this.interpret(((Equality)e).getLeft());
          Object _interpret_3 = this.interpret(((Equality)e).getRight());
          _xifexpression = (!Objects.equal(_interpret_2, _interpret_3));
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = Boolean.valueOf(((((Boolean) this.interpret(((And)e).getLeft()))).booleanValue() && (((Boolean) this.interpret(((And)e).getRight()))).booleanValue()));
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = Boolean.valueOf(((((Boolean) this.interpret(((Or)e).getLeft()))).booleanValue() || (((Boolean) this.interpret(((Or)e).getRight()))).booleanValue()));
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        boolean _xifexpression = false;
        boolean _isStringType = this._defineTypeComputer.isStringType(this._defineTypeComputer.typeFor(((Comparison)e).getLeft()));
        if (_isStringType) {
          boolean _xblockexpression = false;
          {
            Object _interpret = this.interpret(((Comparison)e).getLeft());
            final String left = ((String) _interpret);
            Object _interpret_1 = this.interpret(((Comparison)e).getRight());
            final String right = ((String) _interpret_1);
            boolean _switchResult_1 = false;
            String _op = ((Comparison)e).getOp();
            if (_op != null) {
              switch (_op) {
                case "<":
                  _switchResult_1 = (left.compareTo(right) < 0);
                  break;
                case ">":
                  _switchResult_1 = (left.compareTo(right) > 0);
                  break;
                case ">=":
                  _switchResult_1 = (left.compareTo(right) >= 0);
                  break;
                case "<=":
                  _switchResult_1 = (left.compareTo(right) <= 0);
                  break;
                default:
                  _switchResult_1 = false;
                  break;
              }
            } else {
              _switchResult_1 = false;
            }
            _xblockexpression = _switchResult_1;
          }
          _xifexpression = _xblockexpression;
        } else {
          boolean _xblockexpression_1 = false;
          {
            Object _interpret = this.interpret(((Comparison)e).getLeft());
            final Integer left = ((Integer) _interpret);
            Object _interpret_1 = this.interpret(((Comparison)e).getRight());
            final Integer right = ((Integer) _interpret_1);
            boolean _switchResult_1 = false;
            String _op = ((Comparison)e).getOp();
            if (_op != null) {
              switch (_op) {
                case "<":
                  _switchResult_1 = (left.compareTo(right) < 0);
                  break;
                case ">":
                  _switchResult_1 = (left.compareTo(right) > 0);
                  break;
                case ">=":
                  _switchResult_1 = (left.compareTo(right) >= 0);
                  break;
                case "<=":
                  _switchResult_1 = (left.compareTo(right) <= 0);
                  break;
                default:
                  _switchResult_1 = false;
                  break;
              }
            } else {
              _switchResult_1 = false;
            }
            _xblockexpression_1 = _switchResult_1;
          }
          _xifexpression = _xblockexpression_1;
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        _matched=true;
        Object _xblockexpression = null;
        {
          final Variable v = ((VariableRef)e).getVariable();
          Pair<String, Variable> _mappedTo = Pair.<String, Variable>of("interpret", v);
          final Provider<Object> _function = () -> {
            return this.interpret(v);
          };
          _xblockexpression = this.cache.<Object>get(_mappedTo, ((VariableRef)e).eResource(), _function);
        }
        _switchResult = _xblockexpression;
      }
    }
    return _switchResult;
  }
  
  protected Object _interpret(final Variable e) {
    return this.interpret(e.getIdiom());
  }
  
  public Object interpret(final EObject e) {
    if (e instanceof Variable) {
      return _interpret((Variable)e);
    } else if (e instanceof Idiom) {
      return _interpret((Idiom)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
