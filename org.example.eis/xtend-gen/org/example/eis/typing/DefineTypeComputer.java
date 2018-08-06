package org.example.eis.typing;

import java.util.Arrays;
import org.example.eis.eis.And;
import org.example.eis.eis.BasicType;
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
import org.example.eis.eis.VariableRef;
import org.example.eis.typing.BoolType;
import org.example.eis.typing.DefineType;
import org.example.eis.typing.IntType;
import org.example.eis.typing.NullType;
import org.example.eis.typing.RealType;
import org.example.eis.typing.StringType;

@SuppressWarnings("all")
public class DefineTypeComputer {
  public final static StringType STRING_TYPE = new StringType();
  
  public final static IntType INT_TYPE = new IntType();
  
  public final static BoolType BOOL_TYPE = new BoolType();
  
  public final static NullType NULL_TYPE = new NullType();
  
  public final static RealType REAL_TYPE = new RealType();
  
  public boolean isStringType(final DefineType type) {
    return (type == DefineTypeComputer.STRING_TYPE);
  }
  
  public boolean isIntType(final DefineType type) {
    return (type == DefineTypeComputer.INT_TYPE);
  }
  
  public boolean isBoolType(final DefineType type) {
    return (type == DefineTypeComputer.BOOL_TYPE);
  }
  
  public boolean isRealType(final DefineType type) {
    return (type == DefineTypeComputer.REAL_TYPE);
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
      if (i instanceof Not) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof MulOrDiv) {
        _matched=true;
        _switchResult = DefineTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (i instanceof Minus) {
        _matched=true;
        _switchResult = DefineTypeComputer.INT_TYPE;
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
      final String t = type.toString();
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
              _xifexpression_3 = DefineTypeComputer.NULL_TYPE;
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
        _xifexpression = DefineTypeComputer.INT_TYPE;
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
