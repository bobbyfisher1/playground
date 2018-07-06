package org.example.define.typing;

import java.util.Arrays;
import org.example.define.define.And;
import org.example.define.define.BasicType;
import org.example.define.define.BoolConstant;
import org.example.define.define.Comparison;
import org.example.define.define.Equality;
import org.example.define.define.Expression;
import org.example.define.define.IntConstant;
import org.example.define.define.Minus;
import org.example.define.define.MulOrDiv;
import org.example.define.define.Not;
import org.example.define.define.Or;
import org.example.define.define.Plus;
import org.example.define.define.StringConstant;
import org.example.define.typing.BoolType;
import org.example.define.typing.DefineType;
import org.example.define.typing.IntType;
import org.example.define.typing.NullType;
import org.example.define.typing.StringType;

@SuppressWarnings("all")
public class DefineTypeComputer {
  public final static StringType STRING_TYPE = new StringType();
  
  public final static IntType INT_TYPE = new IntType();
  
  public final static BoolType BOOL_TYPE = new BoolType();
  
  public final static NullType NULL_TYPE = new NullType();
  
  public boolean isStringType(final DefineType type) {
    return (type == DefineTypeComputer.STRING_TYPE);
  }
  
  public boolean isIntType(final DefineType type) {
    return (type == DefineTypeComputer.INT_TYPE);
  }
  
  public boolean isBoolType(final DefineType type) {
    return (type == DefineTypeComputer.BOOL_TYPE);
  }
  
  protected DefineType _typeFor(final Expression e) {
    DefineType _switchResult = null;
    boolean _matched = false;
    if (e instanceof StringConstant) {
      _matched=true;
      _switchResult = DefineTypeComputer.STRING_TYPE;
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        _switchResult = DefineTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = DefineTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = DefineTypeComputer.BOOL_TYPE;
      }
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
            _xifexpression_2 = DefineTypeComputer.NULL_TYPE;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected DefineType _typeFor(final Plus e) {
    DefineType _xblockexpression = null;
    {
      final DefineType leftType = this.typeFor(e.getLeft());
      Expression _right = e.getRight();
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
  
  public DefineType typeFor(final Object e) {
    if (e instanceof Plus) {
      return _typeFor((Plus)e);
    } else if (e instanceof BasicType) {
      return _typeFor((BasicType)e);
    } else if (e instanceof Expression) {
      return _typeFor((Expression)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
