package org.example.eis.interpreter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.example.eis.EisModelUtil;
import org.example.eis.eis.And;
import org.example.eis.eis.BoolConstant;
import org.example.eis.eis.ByteConstant;
import org.example.eis.eis.CharConstant;
import org.example.eis.eis.Comparison;
import org.example.eis.eis.DWordConstant;
import org.example.eis.eis.Equality;
import org.example.eis.eis.Idiom;
import org.example.eis.eis.IntConstant;
import org.example.eis.eis.LTimeConstant;
import org.example.eis.eis.LWordConstant;
import org.example.eis.eis.Minus;
import org.example.eis.eis.MulOrDiv;
import org.example.eis.eis.Not;
import org.example.eis.eis.Or;
import org.example.eis.eis.Plus;
import org.example.eis.eis.RealConstant;
import org.example.eis.eis.StringConstant;
import org.example.eis.eis.TimeConstant;
import org.example.eis.eis.Variable;
import org.example.eis.eis.VariableRef;
import org.example.eis.eis.WordConstant;
import org.example.eis.typing.DefineTypeComputer;

@SuppressWarnings("all")
public class EisInterpreter {
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  @Inject
  private IResourceScopeCache cache;
  
  @Inject
  @Extension
  private EisModelUtil _eisModelUtil;
  
  protected Object _interpret(final Idiom e) {
    Object _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntConstant) {
      _matched=true;
      _switchResult = Long.valueOf(((IntConstant)e).getValue());
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
        _switchResult = Double.valueOf(((RealConstant)e).getValue());
      }
    }
    if (!_matched) {
      if (e instanceof ByteConstant) {
        _matched=true;
        _switchResult = ((ByteConstant)e).getValue().toUpperCase();
      }
    }
    if (!_matched) {
      if (e instanceof WordConstant) {
        _matched=true;
        _switchResult = ((WordConstant)e).getValue().toUpperCase();
      }
    }
    if (!_matched) {
      if (e instanceof DWordConstant) {
        _matched=true;
        _switchResult = ((DWordConstant)e).getValue().toUpperCase();
      }
    }
    if (!_matched) {
      if (e instanceof LWordConstant) {
        _matched=true;
        _switchResult = ((LWordConstant)e).getValue().toUpperCase();
      }
    }
    if (!_matched) {
      if (e instanceof CharConstant) {
        _matched=true;
        _switchResult = Character.valueOf(((CharConstant)e).getValue().charAt(1));
      }
    }
    if (!_matched) {
      if (e instanceof TimeConstant) {
        _matched=true;
        _switchResult = StringExtensions.toFirstUpper(((TimeConstant)e).getValue().toLowerCase());
      }
    }
    if (!_matched) {
      if (e instanceof LTimeConstant) {
        _matched=true;
        _switchResult = this._eisModelUtil.toCharUpper(StringExtensions.toFirstUpper(((LTimeConstant)e).getValue().toLowerCase()), 1);
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        Boolean _xifexpression = null;
        Object _interpret = this.interpret(((Not)e).getIdiom());
        if ((_interpret instanceof Boolean)) {
          Object _interpret_1 = this.interpret(((Not)e).getIdiom());
          _xifexpression = Boolean.valueOf((!(((Boolean) _interpret_1)).booleanValue()));
        } else {
          _xifexpression = null;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        Number _xblockexpression = null;
        {
          final Object left = this.interpret(((MulOrDiv)e).getLeft());
          final Object right = this.interpret(((MulOrDiv)e).getRight());
          Number _xifexpression = null;
          if (((left instanceof Long) && (right instanceof Long))) {
            Long _xifexpression_1 = null;
            String _op = ((MulOrDiv)e).getOp();
            boolean _equals = Objects.equal(_op, "*");
            if (_equals) {
              _xifexpression_1 = Long.valueOf(((((Long) left)).longValue() * (((Long) right)).longValue()));
            } else {
              Long _xifexpression_2 = null;
              if (((((Long) right)).longValue() != 0)) {
                _xifexpression_2 = Long.valueOf(((((Long) left)).longValue() / (((Long) right)).longValue()));
              } else {
                _xifexpression_2 = null;
              }
              _xifexpression_1 = _xifexpression_2;
            }
            _xifexpression = _xifexpression_1;
          } else {
            Double _xifexpression_3 = null;
            if (((left instanceof Double) && (right instanceof Double))) {
              Double _xifexpression_4 = null;
              String _op_1 = ((MulOrDiv)e).getOp();
              boolean _equals_1 = Objects.equal(_op_1, "*");
              if (_equals_1) {
                _xifexpression_4 = Double.valueOf(DoubleExtensions.operator_multiply(((Double) left), ((Double) right)));
              } else {
                Double _xifexpression_5 = null;
                if (((((Double) right)).doubleValue() != 0)) {
                  _xifexpression_5 = Double.valueOf(DoubleExtensions.operator_divide(((Double) left), ((Double) right)));
                } else {
                  _xifexpression_5 = null;
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            } else {
              _xifexpression_3 = null;
            }
            _xifexpression = _xifexpression_3;
          }
          _xblockexpression = ((Number)_xifexpression);
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        Number _xblockexpression = null;
        {
          final Object left = this.interpret(((Minus)e).getLeft());
          final Object right = this.interpret(((Minus)e).getRight());
          Number _xifexpression = null;
          if (((left instanceof Long) && (right instanceof Long))) {
            _xifexpression = Long.valueOf(((((Long) left)).longValue() - (((Long) right)).longValue()));
          } else {
            Double _xifexpression_1 = null;
            if (((left instanceof Double) && (right instanceof Double))) {
              _xifexpression_1 = Double.valueOf(DoubleExtensions.operator_minus(((Double) left), ((Double) right)));
            } else {
              _xifexpression_1 = null;
            }
            _xifexpression = _xifexpression_1;
          }
          _xblockexpression = ((Number)_xifexpression);
        }
        _switchResult = _xblockexpression;
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
          Number _xblockexpression = null;
          {
            final Object left = this.interpret(((Plus)e).getLeft());
            final Object right = this.interpret(((Plus)e).getRight());
            Number _xifexpression_1 = null;
            if (((left instanceof Long) && (right instanceof Long))) {
              _xifexpression_1 = Long.valueOf(((((Long) left)).longValue() + (((Long) right)).longValue()));
            } else {
              Double _xifexpression_2 = null;
              if (((left instanceof Double) && (right instanceof Double))) {
                _xifexpression_2 = Double.valueOf(DoubleExtensions.operator_plus(((Double) left), ((Double) right)));
              } else {
                _xifexpression_2 = null;
              }
              _xifexpression_1 = _xifexpression_2;
            }
            _xblockexpression = ((Number)_xifexpression_1);
          }
          _xifexpression = _xblockexpression;
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
        Boolean _xblockexpression = null;
        {
          final Object left = this.interpret(((And)e).getLeft());
          final Object right = this.interpret(((And)e).getRight());
          Boolean _xifexpression = null;
          if (((left instanceof Boolean) && (right instanceof Boolean))) {
            _xifexpression = Boolean.valueOf(((((Boolean) left)).booleanValue() && (((Boolean) right)).booleanValue()));
          } else {
            _xifexpression = null;
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        Boolean _xblockexpression = null;
        {
          final Object left = this.interpret(((Or)e).getLeft());
          final Object right = this.interpret(((Or)e).getRight());
          Boolean _xifexpression = null;
          if (((left instanceof Boolean) && (right instanceof Boolean))) {
            _xifexpression = Boolean.valueOf(((((Boolean) left)).booleanValue() || (((Boolean) right)).booleanValue()));
          } else {
            _xifexpression = null;
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        Boolean _xifexpression = null;
        boolean _isStringType = this._defineTypeComputer.isStringType(this._defineTypeComputer.typeFor(((Comparison)e).getLeft()));
        if (_isStringType) {
          Boolean _xblockexpression = null;
          {
            final Object left = this.interpret(((Comparison)e).getLeft());
            final Object right = this.interpret(((Comparison)e).getRight());
            Boolean _xifexpression_1 = null;
            if (((left instanceof String) && (right instanceof String))) {
              boolean _switchResult_1 = false;
              String _op = ((Comparison)e).getOp();
              if (_op != null) {
                switch (_op) {
                  case "<":
                    _switchResult_1 = (((String) left).compareTo(((String) right)) < 0);
                    break;
                  case ">":
                    _switchResult_1 = (((String) left).compareTo(((String) right)) > 0);
                    break;
                  case ">=":
                    _switchResult_1 = (((String) left).compareTo(((String) right)) >= 0);
                    break;
                  case "<=":
                    _switchResult_1 = (((String) left).compareTo(((String) right)) <= 0);
                    break;
                  default:
                    _switchResult_1 = false;
                    break;
                }
              } else {
                _switchResult_1 = false;
              }
              _xifexpression_1 = Boolean.valueOf(_switchResult_1);
            } else {
              _xifexpression_1 = null;
            }
            _xblockexpression = _xifexpression_1;
          }
          _xifexpression = _xblockexpression;
        } else {
          Boolean _xblockexpression_1 = null;
          {
            final Object left = this.interpret(((Comparison)e).getLeft());
            final Object right = this.interpret(((Comparison)e).getRight());
            Boolean _xifexpression_1 = null;
            if (((left instanceof Long) && (right instanceof Long))) {
              boolean _switchResult_1 = false;
              String _op = ((Comparison)e).getOp();
              if (_op != null) {
                switch (_op) {
                  case "<":
                    _switchResult_1 = (((Long) left).compareTo(((Long) right)) < 0);
                    break;
                  case ">":
                    _switchResult_1 = (((Long) left).compareTo(((Long) right)) > 0);
                    break;
                  case ">=":
                    _switchResult_1 = (((Long) left).compareTo(((Long) right)) >= 0);
                    break;
                  case "<=":
                    _switchResult_1 = (((Long) left).compareTo(((Long) right)) <= 0);
                    break;
                  default:
                    _switchResult_1 = false;
                    break;
                }
              } else {
                _switchResult_1 = false;
              }
              _xifexpression_1 = Boolean.valueOf(_switchResult_1);
            } else {
              Boolean _xifexpression_2 = null;
              if (((left instanceof Double) && (right instanceof Double))) {
                boolean _switchResult_2 = false;
                String _op_1 = ((Comparison)e).getOp();
                if (_op_1 != null) {
                  switch (_op_1) {
                    case "<":
                      _switchResult_2 = (((Double) left).compareTo(((Double) right)) < 0);
                      break;
                    case ">":
                      _switchResult_2 = (((Double) left).compareTo(((Double) right)) > 0);
                      break;
                    case ">=":
                      _switchResult_2 = (((Double) left).compareTo(((Double) right)) >= 0);
                      break;
                    case "<=":
                      _switchResult_2 = (((Double) left).compareTo(((Double) right)) <= 0);
                      break;
                    default:
                      _switchResult_2 = false;
                      break;
                  }
                } else {
                  _switchResult_2 = false;
                }
                _xifexpression_2 = Boolean.valueOf(_switchResult_2);
              } else {
                _xifexpression_2 = null;
              }
              _xifexpression_1 = _xifexpression_2;
            }
            _xblockexpression_1 = _xifexpression_1;
          }
          _xifexpression = _xblockexpression_1;
        }
        _switchResult = _xifexpression;
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
