package org.example.eis.typing;

import java.util.Arrays;
import org.example.eis.eis.And;
import org.example.eis.eis.BasicType;
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
import org.example.eis.eis.VariableRef;
import org.example.eis.eis.WordConstant;
import org.example.eis.typing.DefineType;
import org.example.eis.typing.types.BoolType;
import org.example.eis.typing.types.ByteType;
import org.example.eis.typing.types.CharType;
import org.example.eis.typing.types.DIntType;
import org.example.eis.typing.types.DWordType;
import org.example.eis.typing.types.IntType;
import org.example.eis.typing.types.LIntType;
import org.example.eis.typing.types.LTimeType;
import org.example.eis.typing.types.LWordType;
import org.example.eis.typing.types.NullType;
import org.example.eis.typing.types.RealType;
import org.example.eis.typing.types.SIntType;
import org.example.eis.typing.types.StringType;
import org.example.eis.typing.types.TimeType;
import org.example.eis.typing.types.UDIntType;
import org.example.eis.typing.types.UIntType;
import org.example.eis.typing.types.ULIntType;
import org.example.eis.typing.types.USIntType;
import org.example.eis.typing.types.WordType;

@SuppressWarnings("all")
public class DefineTypeComputer {
  public final static StringType STRING_TYPE = new StringType();
  
  public final static IntType INT_TYPE = new IntType();
  
  public final static BoolType BOOL_TYPE = new BoolType();
  
  public final static NullType NULL_TYPE = new NullType();
  
  public final static RealType REAL_TYPE = new RealType();
  
  public final static CharType CHAR_TYPE = new CharType();
  
  public final static TimeType TIME_TYPE = new TimeType();
  
  public final static LTimeType LTIME_TYPE = new LTimeType();
  
  public final static ByteType BYTE_TYPE = new ByteType();
  
  public final static WordType WORD_TYPE = new WordType();
  
  public final static DWordType DWORD_TYPE = new DWordType();
  
  public final static LWordType LWORD_TYPE = new LWordType();
  
  public final static USIntType USINT_TYPE = new USIntType();
  
  public final static UIntType UINT_TYPE = new UIntType();
  
  public final static UDIntType UDINT_TYPE = new UDIntType();
  
  public final static ULIntType ULINT_TYPE = new ULIntType();
  
  public final static SIntType SINT_TYPE = new SIntType();
  
  public final static DIntType DINT_TYPE = new DIntType();
  
  public final static LIntType LINT_TYPE = new LIntType();
  
  public boolean isStringType(final DefineType type) {
    return (type == DefineTypeComputer.STRING_TYPE);
  }
  
  public boolean isIntSuperType(final DefineType type) {
    return ((((((((type == DefineTypeComputer.INT_TYPE) || (type == DefineTypeComputer.USINT_TYPE)) || (type == DefineTypeComputer.UINT_TYPE)) || (type == DefineTypeComputer.UDINT_TYPE)) || (type == DefineTypeComputer.ULINT_TYPE)) || 
      (type == DefineTypeComputer.SINT_TYPE)) || (type == DefineTypeComputer.DINT_TYPE)) || (type == DefineTypeComputer.LINT_TYPE));
  }
  
  public boolean isSecondLetterCapitalized(final DefineType type) {
    return ((((((((((type == DefineTypeComputer.USINT_TYPE) || (type == DefineTypeComputer.UINT_TYPE)) || (type == DefineTypeComputer.UDINT_TYPE)) || (type == DefineTypeComputer.ULINT_TYPE)) || (type == DefineTypeComputer.SINT_TYPE)) || 
      (type == DefineTypeComputer.DINT_TYPE)) || (type == DefineTypeComputer.LINT_TYPE)) || (type == DefineTypeComputer.DWORD_TYPE)) || (type == DefineTypeComputer.LWORD_TYPE)) || 
      (type == DefineTypeComputer.LTIME_TYPE));
  }
  
  public boolean isThirdLetterCapitalized(final DefineType type) {
    return (((type == DefineTypeComputer.USINT_TYPE) || (type == DefineTypeComputer.UDINT_TYPE)) || (type == DefineTypeComputer.ULINT_TYPE));
  }
  
  public boolean isBoolType(final DefineType type) {
    return (type == DefineTypeComputer.BOOL_TYPE);
  }
  
  public boolean isRealType(final DefineType type) {
    return (type == DefineTypeComputer.REAL_TYPE);
  }
  
  public boolean isByteType(final DefineType type) {
    return (type == DefineTypeComputer.BYTE_TYPE);
  }
  
  public boolean isWordType(final DefineType type) {
    return (type == DefineTypeComputer.WORD_TYPE);
  }
  
  public boolean isDWordType(final DefineType type) {
    return (type == DefineTypeComputer.DWORD_TYPE);
  }
  
  public boolean isLWordType(final DefineType type) {
    return (type == DefineTypeComputer.LWORD_TYPE);
  }
  
  public boolean isUSIntType(final DefineType type) {
    return (type == DefineTypeComputer.USINT_TYPE);
  }
  
  public boolean isUIntType(final DefineType type) {
    return (type == DefineTypeComputer.UINT_TYPE);
  }
  
  public boolean isUDIntType(final DefineType type) {
    return (type == DefineTypeComputer.UDINT_TYPE);
  }
  
  public boolean isULIntType(final DefineType type) {
    return (type == DefineTypeComputer.ULINT_TYPE);
  }
  
  public boolean isSIntType(final DefineType type) {
    return (type == DefineTypeComputer.SINT_TYPE);
  }
  
  public boolean isIntType(final DefineType type) {
    return (type == DefineTypeComputer.INT_TYPE);
  }
  
  public boolean isDIntType(final DefineType type) {
    return (type == DefineTypeComputer.DINT_TYPE);
  }
  
  public boolean isLIntType(final DefineType type) {
    return (type == DefineTypeComputer.LINT_TYPE);
  }
  
  protected DefineType _typeFor(final Idiom i) {
    DefineType _switchResult = null;
    boolean _matched = false;
    if (i instanceof StringConstant) {
      _matched=true;
      _switchResult = DefineTypeComputer.STRING_TYPE;
    }
    if (!_matched) {
      if (i instanceof IntConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof BoolConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof RealConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.REAL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof ByteConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.BYTE_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof WordConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.WORD_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof DWordConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.DWORD_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof LWordConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.LWORD_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof CharConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.CHAR_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof TimeConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.TIME_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof LTimeConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.LTIME_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Not) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof MulOrDiv) {
        _matched=true;
        DefineType _xifexpression = null;
        if (((this.typeFor(((MulOrDiv)i).getLeft()) instanceof RealType) && (this.typeFor(((MulOrDiv)i).getRight()) instanceof RealType))) {
          _xifexpression = DefineTypeComputer.REAL_TYPE;
        } else {
          _xifexpression = DefineTypeComputer.INT_TYPE;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (i instanceof Minus) {
        _matched=true;
        DefineType _xifexpression = null;
        if (((this.typeFor(((Minus)i).getLeft()) instanceof RealType) && (this.typeFor(((Minus)i).getRight()) instanceof RealType))) {
          _xifexpression = DefineTypeComputer.REAL_TYPE;
        } else {
          _xifexpression = DefineTypeComputer.INT_TYPE;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (i instanceof Comparison) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Equality) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof And) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Or) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      _switchResult = DefineTypeComputer.NULL_TYPE;
    }
    return _switchResult;
  }
  
  protected DefineType _typeFor(final BasicType type) {
    DefineType _xblockexpression = null;
    {
      String _string = null;
      if (type!=null) {
        _string=type.toString();
      }
      final String t = _string;
      DefineType _xifexpression = null;
      if ((t == "int")) {
        _xifexpression = DefineTypeComputer.INT_TYPE;
      } else {
        DefineType _xifexpression_1 = null;
        if ((t == "bool")) {
          _xifexpression_1 = DefineTypeComputer.BOOL_TYPE;
        } else {
          DefineType _xifexpression_2 = null;
          if ((t == "string")) {
            _xifexpression_2 = DefineTypeComputer.STRING_TYPE;
          } else {
            DefineType _xifexpression_3 = null;
            if ((t == "real")) {
              _xifexpression_3 = DefineTypeComputer.REAL_TYPE;
            } else {
              DefineType _xifexpression_4 = null;
              if ((t == "byte")) {
                _xifexpression_4 = DefineTypeComputer.BYTE_TYPE;
              } else {
                DefineType _xifexpression_5 = null;
                if ((t == "word")) {
                  _xifexpression_5 = DefineTypeComputer.WORD_TYPE;
                } else {
                  DefineType _xifexpression_6 = null;
                  if ((t == "dword")) {
                    _xifexpression_6 = DefineTypeComputer.DWORD_TYPE;
                  } else {
                    DefineType _xifexpression_7 = null;
                    if ((t == "lword")) {
                      _xifexpression_7 = DefineTypeComputer.LWORD_TYPE;
                    } else {
                      DefineType _xifexpression_8 = null;
                      if ((t == "usint")) {
                        _xifexpression_8 = DefineTypeComputer.USINT_TYPE;
                      } else {
                        DefineType _xifexpression_9 = null;
                        if ((t == "uint")) {
                          _xifexpression_9 = DefineTypeComputer.UINT_TYPE;
                        } else {
                          DefineType _xifexpression_10 = null;
                          if ((t == "udint")) {
                            _xifexpression_10 = DefineTypeComputer.UDINT_TYPE;
                          } else {
                            DefineType _xifexpression_11 = null;
                            if ((t == "ulint")) {
                              _xifexpression_11 = DefineTypeComputer.ULINT_TYPE;
                            } else {
                              DefineType _xifexpression_12 = null;
                              if ((t == "sint")) {
                                _xifexpression_12 = DefineTypeComputer.SINT_TYPE;
                              } else {
                                DefineType _xifexpression_13 = null;
                                if ((t == "dint")) {
                                  _xifexpression_13 = DefineTypeComputer.DINT_TYPE;
                                } else {
                                  DefineType _xifexpression_14 = null;
                                  if ((t == "lint")) {
                                    _xifexpression_14 = DefineTypeComputer.LINT_TYPE;
                                  } else {
                                    DefineType _xifexpression_15 = null;
                                    if ((t == "char")) {
                                      _xifexpression_15 = DefineTypeComputer.CHAR_TYPE;
                                    } else {
                                      DefineType _xifexpression_16 = null;
                                      if ((t == "time")) {
                                        _xifexpression_16 = DefineTypeComputer.TIME_TYPE;
                                      } else {
                                        DefineType _xifexpression_17 = null;
                                        if ((t == "ltime")) {
                                          _xifexpression_17 = DefineTypeComputer.LTIME_TYPE;
                                        } else {
                                          _xifexpression_17 = DefineTypeComputer.NULL_TYPE;
                                        }
                                        _xifexpression_16 = _xifexpression_17;
                                      }
                                      _xifexpression_15 = _xifexpression_16;
                                    }
                                    _xifexpression_14 = _xifexpression_15;
                                  }
                                  _xifexpression_13 = _xifexpression_14;
                                }
                                _xifexpression_12 = _xifexpression_13;
                              }
                              _xifexpression_11 = _xifexpression_12;
                            }
                            _xifexpression_10 = _xifexpression_11;
                          }
                          _xifexpression_9 = _xifexpression_10;
                        }
                        _xifexpression_8 = _xifexpression_9;
                      }
                      _xifexpression_7 = _xifexpression_8;
                    }
                    _xifexpression_6 = _xifexpression_7;
                  }
                  _xifexpression_5 = _xifexpression_6;
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected DefineType _typeFor(final Plus plus) {
    DefineType _xblockexpression = null;
    {
      final DefineType leftType = this.typeFor(plus.getLeft());
      Idiom _right = plus.getRight();
      DefineType _typeFor = null;
      if (_right!=null) {
        _typeFor=this.typeFor(_right);
      }
      final DefineType rightType = _typeFor;
      DefineType _xifexpression = null;
      if ((this.isStringType(leftType) || this.isStringType(rightType))) {
        _xifexpression = DefineTypeComputer.STRING_TYPE;
      } else {
        DefineType _xifexpression_1 = null;
        if (((leftType instanceof RealType) && (rightType instanceof RealType))) {
          _xifexpression_1 = DefineTypeComputer.REAL_TYPE;
        } else {
          _xifexpression_1 = DefineTypeComputer.INT_TYPE;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected DefineType _typeFor(final VariableRef varRef) {
    Idiom _idiom = varRef.getVariable().getIdiom();
    DefineType _typeFor = null;
    if (_idiom!=null) {
      _typeFor=this.typeFor(_idiom);
    }
    return _typeFor;
  }
  
  public DefineType typeFor(final Object plus) {
    if (plus instanceof Plus) {
      return _typeFor((Plus)plus);
    } else if (plus instanceof VariableRef) {
      return _typeFor((VariableRef)plus);
    } else if (plus instanceof BasicType) {
      return _typeFor((BasicType)plus);
    } else if (plus instanceof Idiom) {
      return _typeFor((Idiom)plus);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(plus).toString());
    }
  }
}
