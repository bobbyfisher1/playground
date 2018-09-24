package org.xtext.eis.typing;

import java.util.Arrays;
import org.xtext.eis.eis.And;
import org.xtext.eis.eis.BasicType;
import org.xtext.eis.eis.BoolConstant;
import org.xtext.eis.eis.ByteConstant;
import org.xtext.eis.eis.CharConstant;
import org.xtext.eis.eis.Comparison;
import org.xtext.eis.eis.DWordConstant;
import org.xtext.eis.eis.DateConstant;
import org.xtext.eis.eis.Equality;
import org.xtext.eis.eis.Idiom;
import org.xtext.eis.eis.IntConstant;
import org.xtext.eis.eis.LTimeConstant;
import org.xtext.eis.eis.LWordConstant;
import org.xtext.eis.eis.Minus;
import org.xtext.eis.eis.MulOrDiv;
import org.xtext.eis.eis.Not;
import org.xtext.eis.eis.Or;
import org.xtext.eis.eis.Plus;
import org.xtext.eis.eis.RealConstant;
import org.xtext.eis.eis.StringConstant;
import org.xtext.eis.eis.TimeConstant;
import org.xtext.eis.eis.VariableRef;
import org.xtext.eis.eis.WordConstant;
import org.xtext.eis.typing.EisType;
import org.xtext.eis.typing.types.BoolType;
import org.xtext.eis.typing.types.ByteType;
import org.xtext.eis.typing.types.CharType;
import org.xtext.eis.typing.types.DIntType;
import org.xtext.eis.typing.types.DWordType;
import org.xtext.eis.typing.types.DateType;
import org.xtext.eis.typing.types.IntType;
import org.xtext.eis.typing.types.LIntType;
import org.xtext.eis.typing.types.LRealType;
import org.xtext.eis.typing.types.LTimeType;
import org.xtext.eis.typing.types.LWordType;
import org.xtext.eis.typing.types.NullType;
import org.xtext.eis.typing.types.RealType;
import org.xtext.eis.typing.types.SIntType;
import org.xtext.eis.typing.types.StringType;
import org.xtext.eis.typing.types.TimeType;
import org.xtext.eis.typing.types.UDIntType;
import org.xtext.eis.typing.types.UIntType;
import org.xtext.eis.typing.types.ULIntType;
import org.xtext.eis.typing.types.USIntType;
import org.xtext.eis.typing.types.WCharType;
import org.xtext.eis.typing.types.WordType;

@SuppressWarnings("all")
public class EisTypeComputer {
  public final static StringType STRING_TYPE = new StringType();
  
  public final static IntType INT_TYPE = new IntType();
  
  public final static BoolType BOOL_TYPE = new BoolType();
  
  public final static NullType NULL_TYPE = new NullType();
  
  public final static RealType REAL_TYPE = new RealType();
  
  public final static LRealType LREAL_TYPE = new LRealType();
  
  public final static CharType CHAR_TYPE = new CharType();
  
  public final static WCharType WCHAR_TYPE = new WCharType();
  
  public final static TimeType TIME_TYPE = new TimeType();
  
  public final static LTimeType LTIME_TYPE = new LTimeType();
  
  public final static DateType DATE_TYPE = new DateType();
  
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
  
  public boolean isStringType(final EisType type) {
    return (type == EisTypeComputer.STRING_TYPE);
  }
  
  public boolean isIntSuperType(final EisType type) {
    return ((((((((type == EisTypeComputer.INT_TYPE) || (type == EisTypeComputer.USINT_TYPE)) || (type == EisTypeComputer.UINT_TYPE)) || (type == EisTypeComputer.UDINT_TYPE)) || (type == EisTypeComputer.ULINT_TYPE)) || 
      (type == EisTypeComputer.SINT_TYPE)) || (type == EisTypeComputer.DINT_TYPE)) || (type == EisTypeComputer.LINT_TYPE));
  }
  
  public boolean isSecondLetterCapitalized(final EisType type) {
    return ((((((((((type == EisTypeComputer.USINT_TYPE) || (type == EisTypeComputer.UINT_TYPE)) || (type == EisTypeComputer.UDINT_TYPE)) || (type == EisTypeComputer.ULINT_TYPE)) || (type == EisTypeComputer.SINT_TYPE)) || 
      (type == EisTypeComputer.DINT_TYPE)) || (type == EisTypeComputer.LINT_TYPE)) || (type == EisTypeComputer.DWORD_TYPE)) || (type == EisTypeComputer.LWORD_TYPE)) || 
      (type == EisTypeComputer.LTIME_TYPE));
  }
  
  public boolean isSecondLetterCapitalized(final BasicType type) {
    boolean _xblockexpression = false;
    {
      String _string = null;
      if (type!=null) {
        _string=type.toString();
      }
      final String t = _string;
      _xblockexpression = ((t == "wchar") || (t == "lreal"));
    }
    return _xblockexpression;
  }
  
  public boolean isThirdLetterCapitalized(final EisType type) {
    return (((type == EisTypeComputer.USINT_TYPE) || (type == EisTypeComputer.UDINT_TYPE)) || (type == EisTypeComputer.ULINT_TYPE));
  }
  
  public boolean isCharType(final EisType type) {
    return ((type == EisTypeComputer.CHAR_TYPE) || (type == EisTypeComputer.WCHAR_TYPE));
  }
  
  public boolean isTimeType(final EisType type) {
    return (type == EisTypeComputer.TIME_TYPE);
  }
  
  public boolean isLTimeType(final EisType type) {
    return (type == EisTypeComputer.LTIME_TYPE);
  }
  
  public boolean isDateType(final EisType type) {
    return (type == EisTypeComputer.DATE_TYPE);
  }
  
  public boolean isBoolType(final EisType type) {
    return (type == EisTypeComputer.BOOL_TYPE);
  }
  
  public boolean isRealType(final EisType type) {
    return ((type == EisTypeComputer.REAL_TYPE) || (type == EisTypeComputer.LREAL_TYPE));
  }
  
  public boolean isByteType(final EisType type) {
    return (type == EisTypeComputer.BYTE_TYPE);
  }
  
  public boolean isWordType(final EisType type) {
    return (type == EisTypeComputer.WORD_TYPE);
  }
  
  public boolean isDWordType(final EisType type) {
    return (type == EisTypeComputer.DWORD_TYPE);
  }
  
  public boolean isLWordType(final EisType type) {
    return (type == EisTypeComputer.LWORD_TYPE);
  }
  
  public boolean isUSIntType(final EisType type) {
    return (type == EisTypeComputer.USINT_TYPE);
  }
  
  public boolean isUIntType(final EisType type) {
    return (type == EisTypeComputer.UINT_TYPE);
  }
  
  public boolean isUDIntType(final EisType type) {
    return (type == EisTypeComputer.UDINT_TYPE);
  }
  
  public boolean isULIntType(final EisType type) {
    return (type == EisTypeComputer.ULINT_TYPE);
  }
  
  public boolean isSIntType(final EisType type) {
    return (type == EisTypeComputer.SINT_TYPE);
  }
  
  public boolean isIntType(final EisType type) {
    return (type == EisTypeComputer.INT_TYPE);
  }
  
  public boolean isDIntType(final EisType type) {
    return (type == EisTypeComputer.DINT_TYPE);
  }
  
  public boolean isLIntType(final EisType type) {
    return (type == EisTypeComputer.LINT_TYPE);
  }
  
  public boolean isWithoutRangeOp(final EisType type) {
    return (((((((((((type == EisTypeComputer.BOOL_TYPE) || (type == EisTypeComputer.STRING_TYPE)) || (type == EisTypeComputer.BYTE_TYPE)) || (type == EisTypeComputer.WORD_TYPE)) || (type == EisTypeComputer.DWORD_TYPE)) || 
      (type == EisTypeComputer.LWORD_TYPE)) || (type == EisTypeComputer.CHAR_TYPE)) || (type == EisTypeComputer.WCHAR_TYPE)) || (type == EisTypeComputer.TIME_TYPE)) || 
      (type == EisTypeComputer.LTIME_TYPE)) || (type == EisTypeComputer.DATE_TYPE));
  }
  
  protected EisType _typeFor(final Idiom i) {
    EisType _switchResult = null;
    boolean _matched = false;
    if (i instanceof StringConstant) {
      _matched=true;
      _switchResult = EisTypeComputer.STRING_TYPE;
    }
    if (!_matched) {
      if (i instanceof IntConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof BoolConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof RealConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.REAL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof ByteConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.BYTE_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof WordConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.WORD_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof DWordConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.DWORD_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof LWordConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.LWORD_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof CharConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.CHAR_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof TimeConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.TIME_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof LTimeConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.LTIME_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof DateConstant) {
        _matched=true;
        _switchResult = EisTypeComputer.DATE_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Not) {
        _matched=true;
        _switchResult = EisTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof MulOrDiv) {
        _matched=true;
        EisType _xifexpression = null;
        if (((this.typeFor(((MulOrDiv)i).getLeft()) instanceof RealType) && (this.typeFor(((MulOrDiv)i).getRight()) instanceof RealType))) {
          _xifexpression = EisTypeComputer.REAL_TYPE;
        } else {
          _xifexpression = EisTypeComputer.INT_TYPE;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (i instanceof Minus) {
        _matched=true;
        EisType _xifexpression = null;
        if (((this.typeFor(((Minus)i).getLeft()) instanceof RealType) && (this.typeFor(((Minus)i).getRight()) instanceof RealType))) {
          _xifexpression = EisTypeComputer.REAL_TYPE;
        } else {
          _xifexpression = EisTypeComputer.INT_TYPE;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (i instanceof Comparison) {
        _matched=true;
        _switchResult = EisTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Equality) {
        _matched=true;
        _switchResult = EisTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof And) {
        _matched=true;
        _switchResult = EisTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Or) {
        _matched=true;
        _switchResult = EisTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      _switchResult = EisTypeComputer.NULL_TYPE;
    }
    return _switchResult;
  }
  
  protected EisType _typeFor(final BasicType type) {
    EisType _xblockexpression = null;
    {
      String _string = null;
      if (type!=null) {
        _string=type.toString();
      }
      final String t = _string;
      EisType _xifexpression = null;
      if ((t == "int")) {
        _xifexpression = EisTypeComputer.INT_TYPE;
      } else {
        EisType _xifexpression_1 = null;
        if ((t == "bool")) {
          _xifexpression_1 = EisTypeComputer.BOOL_TYPE;
        } else {
          EisType _xifexpression_2 = null;
          if ((t == "string")) {
            _xifexpression_2 = EisTypeComputer.STRING_TYPE;
          } else {
            EisType _xifexpression_3 = null;
            if ((t == "real")) {
              _xifexpression_3 = EisTypeComputer.REAL_TYPE;
            } else {
              EisType _xifexpression_4 = null;
              if ((t == "lreal")) {
                _xifexpression_4 = EisTypeComputer.REAL_TYPE;
              } else {
                EisType _xifexpression_5 = null;
                if ((t == "byte")) {
                  _xifexpression_5 = EisTypeComputer.BYTE_TYPE;
                } else {
                  EisType _xifexpression_6 = null;
                  if ((t == "word")) {
                    _xifexpression_6 = EisTypeComputer.WORD_TYPE;
                  } else {
                    EisType _xifexpression_7 = null;
                    if ((t == "dword")) {
                      _xifexpression_7 = EisTypeComputer.DWORD_TYPE;
                    } else {
                      EisType _xifexpression_8 = null;
                      if ((t == "lword")) {
                        _xifexpression_8 = EisTypeComputer.LWORD_TYPE;
                      } else {
                        EisType _xifexpression_9 = null;
                        if ((t == "usint")) {
                          _xifexpression_9 = EisTypeComputer.USINT_TYPE;
                        } else {
                          EisType _xifexpression_10 = null;
                          if ((t == "uint")) {
                            _xifexpression_10 = EisTypeComputer.UINT_TYPE;
                          } else {
                            EisType _xifexpression_11 = null;
                            if ((t == "udint")) {
                              _xifexpression_11 = EisTypeComputer.UDINT_TYPE;
                            } else {
                              EisType _xifexpression_12 = null;
                              if ((t == "ulint")) {
                                _xifexpression_12 = EisTypeComputer.ULINT_TYPE;
                              } else {
                                EisType _xifexpression_13 = null;
                                if ((t == "sint")) {
                                  _xifexpression_13 = EisTypeComputer.SINT_TYPE;
                                } else {
                                  EisType _xifexpression_14 = null;
                                  if ((t == "dint")) {
                                    _xifexpression_14 = EisTypeComputer.DINT_TYPE;
                                  } else {
                                    EisType _xifexpression_15 = null;
                                    if ((t == "lint")) {
                                      _xifexpression_15 = EisTypeComputer.LINT_TYPE;
                                    } else {
                                      EisType _xifexpression_16 = null;
                                      if ((t == "char")) {
                                        _xifexpression_16 = EisTypeComputer.CHAR_TYPE;
                                      } else {
                                        EisType _xifexpression_17 = null;
                                        if ((t == "wchar")) {
                                          _xifexpression_17 = EisTypeComputer.CHAR_TYPE;
                                        } else {
                                          EisType _xifexpression_18 = null;
                                          if ((t == "time")) {
                                            _xifexpression_18 = EisTypeComputer.TIME_TYPE;
                                          } else {
                                            EisType _xifexpression_19 = null;
                                            if ((t == "ltime")) {
                                              _xifexpression_19 = EisTypeComputer.LTIME_TYPE;
                                            } else {
                                              EisType _xifexpression_20 = null;
                                              if ((t == "date")) {
                                                _xifexpression_20 = EisTypeComputer.DATE_TYPE;
                                              } else {
                                                _xifexpression_20 = EisTypeComputer.NULL_TYPE;
                                              }
                                              _xifexpression_19 = _xifexpression_20;
                                            }
                                            _xifexpression_18 = _xifexpression_19;
                                          }
                                          _xifexpression_17 = _xifexpression_18;
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
  
  protected EisType _typeFor(final Plus plus) {
    EisType _xblockexpression = null;
    {
      final EisType leftType = this.typeFor(plus.getLeft());
      Idiom _right = plus.getRight();
      EisType _typeFor = null;
      if (_right!=null) {
        _typeFor=this.typeFor(_right);
      }
      final EisType rightType = _typeFor;
      EisType _xifexpression = null;
      if ((this.isStringType(leftType) || this.isStringType(rightType))) {
        _xifexpression = EisTypeComputer.STRING_TYPE;
      } else {
        EisType _xifexpression_1 = null;
        if (((leftType instanceof RealType) && (rightType instanceof RealType))) {
          _xifexpression_1 = EisTypeComputer.REAL_TYPE;
        } else {
          _xifexpression_1 = EisTypeComputer.INT_TYPE;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected EisType _typeFor(final VariableRef varRef) {
    Idiom _idiom = varRef.getVariable().getIdiom();
    EisType _typeFor = null;
    if (_idiom!=null) {
      _typeFor=this.typeFor(_idiom);
    }
    return _typeFor;
  }
  
  public EisType typeFor(final Object plus) {
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
