package org.example.define.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.Variable;
import org.example.define.tests.DefineInjectorProvider;
import org.example.define.typing.DefineType;
import org.example.define.typing.DefineTypeComputer;
import org.example.define.validation.DefineValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineInjectorProvider.class)
@SuppressWarnings("all")
public class DefineValidatorTest {
  @Inject
  @Extension
  private ParseHelper<DefineBlock> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  private final String start = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[\t");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private final String end = "]}";
  
  private final String startWithVariable = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[\tint a = ");
      return _builder.toString();
    }
  }.apply();
  
  private final String endWithSemicolon = ";]}";
  
  @Test
  public void testDuplicateVariablesNoInoutBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[int t;]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[ int t;]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String text = _builder.toString();
    this.assertDuplicateVariables(text.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "t", 2);
  }
  
  @Test
  public void testDuplicateVariablesWithInoutBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[int t;]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[int t;]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicateVariables(_builder.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "t", 2);
  }
  
  @Test
  public void testDuplicateVariablesWithEmptyInoutBlock() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[int t;]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[int t;]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicateVariables(_builder.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "t", 4);
  }
  
  @Test
  public void testDuplicateUdts() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[udt a(udtType1){}]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[udt a(udtType2){}]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicateUdts(_builder.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "a", "udtType", 2);
  }
  
  @Test
  public void testDuplicateNameInUdt() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int a;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("bool a;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MULTIPLE_VARIABLE_DECLARATION);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongNotType() {
    this.assertType("!10", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
  }
  
  @Test
  public void testWrongMulOrDivType() {
    this.assertType("10 * true", DefineTypeComputer.BOOL_TYPE, DefineTypeComputer.INT_TYPE);
    this.assertType("\'10\' / 10", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.INT_TYPE);
  }
  
  @Test
  public void testWrongMinusType() {
    this.assertType("10 - true", DefineTypeComputer.BOOL_TYPE, DefineTypeComputer.INT_TYPE);
    this.assertType("\'10\' - 10", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.INT_TYPE);
  }
  
  @Test
  public void testWrongAndType() {
    this.assertType("10 && true", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
    this.assertType("false && \'10\'", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.BOOL_TYPE);
  }
  
  @Test
  public void testWrongOrType() {
    this.assertType("10 || true", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
    this.assertType("false || \'10\'", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.BOOL_TYPE);
  }
  
  @Test
  public void testWrongEqualityType() {
    this.assertSameType("10 == true", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("false != \'10\'", DefineTypeComputer.BOOL_TYPE, DefineTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void testWrongComparisonType() {
    this.assertSameType("10 < \'1\'", DefineTypeComputer.INT_TYPE, DefineTypeComputer.STRING_TYPE);
    this.assertSameType("\'10\' > 10", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.INT_TYPE);
  }
  
  @Test
  public void testWrongBooleanComparison() {
    this.assertNotBooleanType("10 < true");
    this.assertNotBooleanType("false > 0");
    this.assertNotBooleanType("false > true");
  }
  
  @Test
  public void testWrongBooleanPlus() {
    this.assertNotBooleanType("10 + true");
    this.assertNotBooleanType("false + 0");
    this.assertNotBooleanType("false + true");
  }
  
  @Test
  public void testCorrectType() {
    try {
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + "int a=4;") + this.end)));
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + "int a = 4 +/- 16;") + this.end)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongTypes() {
    this.assertWrongType(((this.start + "int a = 4 +/- true;") + this.end));
    this.assertWrongType(((this.start + "int a = true +/- 3") + this.end));
    this.assertWrongType(((this.start + "int a = true +/- \'string\' ") + this.end));
  }
  
  private void assertWrongType(final String text) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse(text), DefinePackage.eINSTANCE.getVariable(), DefineValidator.INCOMPATIBLE_TYPES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCommaNotation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[int a, t;] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidCommaOnLastVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ variant int a,] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.INVALID_COMMA_NOTATION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidCommaNotation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variant int a,");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt b(typeB){}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("bool c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.INVALID_COMMA_NOTATION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingTypeIO() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[a;] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MISSING_VARIABLE_TYPE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingTypeIOInout() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[a;] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("inout[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MISSING_VARIABLE_TYPE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingVariableType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[int a; t;] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MISSING_VARIABLE_TYPE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInferredType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[int a, t;] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      EList<Variable> _inputVariables = this._parseHelper.parse(_builder).getDirection().getInput().getInputVariables();
      final Procedure1<EList<Variable>> _function = (EList<Variable> it) -> {
        Assert.assertSame(this._defineTypeComputer.typeFor(it.get(0).getVariableType()), DefineTypeComputer.INT_TYPE);
        Assert.assertSame(this._defineTypeComputer.typeFor(it.get(1).getVariableType()), DefineTypeComputer.NULL_TYPE);
      };
      ObjectExtensions.<EList<Variable>>operator_doubleArrow(_inputVariables, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInferredVariant() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variant int a, t;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      EList<Variable> _inputVariables = this._parseHelper.parse(_builder).getDirection().getInput().getInputVariables();
      final Procedure1<EList<Variable>> _function = (EList<Variable> it) -> {
        Assert.assertTrue(it.get(0).isVariantKeyword());
        Assert.assertFalse(it.get(1).isVariantKeyword());
      };
      ObjectExtensions.<EList<Variable>>operator_doubleArrow(_inputVariables, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertDuplicateVariables(final String text, final EClass type, final String description, final String name, final int duplicateErrors) {
    try {
      DefineBlock _parse = this._parseHelper.parse(text);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIABLE_DECLARATION, 
          text.indexOf(type.toString()), 
          name.length(), 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIABLE_DECLARATION, 
          text.lastIndexOf(type.toString()), 
          name.length(), 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        Assert.assertEquals(duplicateErrors, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertDuplicateUdts(final String text, final EClass type, final String description, final String name, final String variableType, final int duplicateErrors) {
    try {
      DefineBlock _parse = this._parseHelper.parse(text);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        int _indexOf = text.indexOf(type.toString());
        int _length = name.length();
        int _length_1 = "udt ( ){}".length();
        int _plus = (_length + _length_1);
        int _length_2 = variableType.length();
        int _plus_1 = (_plus + _length_2);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_UDT_DECLARATION, _indexOf, _plus_1, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_3 = name.length();
        int _length_4 = "udt ( ){}".length();
        int _plus_2 = (_length_3 + _length_4);
        int _length_5 = variableType.length();
        int _plus_3 = (_plus_2 + _length_5);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_UDT_DECLARATION, _lastIndexOf, _plus_3, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        Assert.assertEquals(duplicateErrors, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertType(final CharSequence input, final DefineType expectedWrongType, final DefineType expectedActualType) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse(((this.startWithVariable + input) + this.endWithSemicolon)), DefinePackage.eINSTANCE.getExpression(), 
        DefineValidator.TYPE_MISMATCH, ((("expected " + expectedActualType) + " type, but was ") + expectedWrongType));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertSameType(final CharSequence input, final DefineType expectedLeft, final DefineType expectedRight) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse(((this.startWithVariable + input) + this.endWithSemicolon)), DefinePackage.eINSTANCE.getExpression(), 
        DefineValidator.TYPE_MISMATCH, ((("expected the same type, but was " + expectedLeft) + ", ") + expectedRight));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertNotBooleanType(final CharSequence input) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse(((this.startWithVariable + input) + this.endWithSemicolon)), DefinePackage.eINSTANCE.getExpression(), 
        DefineValidator.TYPE_MISMATCH, "cannot be boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
