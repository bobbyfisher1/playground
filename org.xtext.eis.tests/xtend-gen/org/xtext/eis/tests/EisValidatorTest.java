package org.xtext.eis.tests;

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
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.eis.eis.EisModel;
import org.xtext.eis.eis.EisPackage;
import org.xtext.eis.eis.Testcase;
import org.xtext.eis.eis.Variable;
import org.xtext.eis.eis.Variables;
import org.xtext.eis.tests.EisInjectorProvider;
import org.xtext.eis.typing.DefineType;
import org.xtext.eis.typing.DefineTypeComputer;
import org.xtext.eis.validation.EisValidator;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class EisValidatorTest {
  @Inject
  @Extension
  private ParseHelper<EisModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  private final String beginning = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project = \"abckdjh\";");
      _builder.newLine();
      _builder.append("plcname = \"d383\";");
      _builder.newLine();
      _builder.append("author \t= \"name two\";");
      _builder.newLine();
      _builder.append("testcase Blockname(false, FC, \"\") {");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private final String ending = "}";
  
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
      String _plus = (EisValidatorTest.this.beginning + _builder);
      return _plus;
    }
  }.apply();
  
  private final String end = "]}";
  
  private final String endWithSemicolon = (";]}" + this.ending);
  
  @Test
  public void testDuplicateVariablesIO() {
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
    this.assertDuplicateVariables(((this.beginning + text) + this.ending).toString(), EisPackage.eINSTANCE.getVariable(), "variable name", 
      "t", 2);
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
    String _plus = (this.beginning + _builder);
    this.assertDuplicateVariables((_plus + this.ending).toString(), EisPackage.eINSTANCE.getVariable(), "variable name", "t", 2);
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
    String _plus = (this.beginning + _builder);
    this.assertDuplicateVariables((_plus + this.ending).toString(), EisPackage.eINSTANCE.getVariable(), "variable name", "t", 4);
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
    String _plus = (this.beginning + _builder);
    this.assertDuplicateUdts((_plus + this.ending).toString(), EisPackage.eINSTANCE.getUdt(), "variable name", "a", "udtType", 2);
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
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.MULTIPLE_VARIABLE_DECLARATION);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
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
    this.assertType(" \'10\' / 10", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.INT_TYPE);
  }
  
  @Test
  public void testWrongMinusType() {
    this.assertType("10 - true", DefineTypeComputer.BOOL_TYPE, DefineTypeComputer.INT_TYPE);
    this.assertType(" \'10\' - 10", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.INT_TYPE);
  }
  
  @Test
  public void testWrongAndType() {
    this.assertType("10 && true", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
    this.assertType("false && \'10\' ", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.BOOL_TYPE);
  }
  
  @Test
  public void testWrongOrType() {
    this.assertType("10 || true", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
    this.assertType("false || \'10\' ", DefineTypeComputer.STRING_TYPE, DefineTypeComputer.BOOL_TYPE);
  }
  
  @Test
  public void testWrongEqualityType() {
    this.assertSameType("10 == true", DefineTypeComputer.INT_TYPE, DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("false != \'10\' ", DefineTypeComputer.BOOL_TYPE, DefineTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void testWrongComparisonType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("10 < \"1\"");
    this.assertSameType(_builder, DefineTypeComputer.INT_TYPE, DefineTypeComputer.STRING_TYPE);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\"10\" > 10");
    this.assertSameType(_builder_1, DefineTypeComputer.STRING_TYPE, DefineTypeComputer.INT_TYPE);
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
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((((this.start + "int a=4;") + this.end) + this.ending)));
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((((this.start + "int a = 4 +/- 16;") + this.end) + this.ending)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongTypes() {
    this.assertWrongType((((this.start + "int a = 4 +/- true;") + this.end) + this.ending), 1);
    this.assertWrongType((((this.start + "int a = true +/- 3;") + this.end) + this.ending), 1);
    this.assertWrongType((((this.start + "int a = true +/- \'string\' ;") + this.end) + this.ending), 2);
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
      String _plus = (this.beginning + _builder);
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((_plus + this.ending)));
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
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INVALID_COMMA_NOTATION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
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
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INVALID_COMMA_NOTATION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
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
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.MISSING_VARIABLE_TYPE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
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
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.MISSING_VARIABLE_TYPE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
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
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.MISSING_VARIABLE_TYPE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
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
      String _plus = (this.beginning + _builder);
      EList<Variables> _inputVariables = IterableExtensions.<Testcase>head(this._parseHelper.parse((_plus + this.ending)).getTestcases()).getDefine().getDirection().getInput().getInputVariables();
      final Procedure1<EList<Variables>> _function = (EList<Variables> it) -> {
        Variables _get = it.get(0);
        Assert.assertSame(this._defineTypeComputer.typeFor(((Variable) _get).getVariableType()), DefineTypeComputer.INT_TYPE);
        Variables _get_1 = it.get(1);
        Assert.assertSame(this._defineTypeComputer.typeFor(((Variable) _get_1).getVariableType()), DefineTypeComputer.NULL_TYPE);
      };
      ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function);
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
      String _plus = (this.beginning + _builder);
      EList<Variables> _inputVariables = IterableExtensions.<Testcase>head(this._parseHelper.parse((_plus + this.ending)).getTestcases()).getDefine().getDirection().getInput().getInputVariables();
      final Procedure1<EList<Variables>> _function = (EList<Variables> it) -> {
        Variables _get = it.get(0);
        Assert.assertTrue(((Variable) _get).isVariantKeyword());
        Variables _get_1 = it.get(1);
        Assert.assertFalse(((Variable) _get_1).isVariantKeyword());
      };
      ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUdtTypeRef() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("int x = 99 +/- 1;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("typeA b;");
      _builder.newLine();
      _builder.append("typeA c;");
      _builder.newLine();
      final String text = _builder.toString();
      EisModel _parse = this._parseHelper.parse((((this.start + text) + this.end) + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRecursiveReference() {
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
      _builder.append("string x = \'pretender\' +/- \'what\';");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt y(typeY){}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("typeY z;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("typeA b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getUdtRef(), EisValidator.RECURSIVE_UDT_REFERENCE);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleUdtType() {
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
      _builder.append("udt a(typeA){}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt b(typeA){}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getUdt(), EisValidator.MULTIPLE_UDT_TYPE);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingUdtReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int b;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ a = 0; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.MISSING_UDT_REFERENCE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingUdtRefReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int b;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("typeA xyz;");
      _builder.newLine();
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ xyz = 0; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.MISSING_UDT_REFERENCE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingUdtReferenceInCascade() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt b(typeB){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int c;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ a.b = 0; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.MISSING_UDT_REFERENCE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongStatementType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("teststep(0 ,\"don\'t forget the string\") {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[a = true;]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String teststep = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + "int a;") + this.end) + teststep) + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongStatementType2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("teststep(0 ,\"don\'t forget the string\") {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[a.b = true;]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String teststep = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("udt a(typeA){");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("int b;");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _plus = (this.start + _builder_1);
      String _plus_1 = (_plus + this.end);
      String _plus_2 = (_plus_1 + teststep);
      EisModel _parse = this._parseHelper.parse((_plus_2 + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleStatementsSetBlock() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int b;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("a.b = 0;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("a.b = 0;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("c = 0;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("c = 0;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
        Assert.assertEquals(6, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleStatementsAssertBlock() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ int a; ]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("a = 0;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("a = 0;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidRangeOnBoolean() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[  ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("bool _bool = true +/- false;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string _string = \"one\" +/- \"two\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("byte _byte = 16#bc +/- 16#df;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("word _word = 16#abcd +/- 16#efEF;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("dword _dword = 16#abcd_abcd +/- 16#efEF_efEF;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("lword _lword = 16#abcd_abcd_abcd_abcd +/- 16#efEF_efEF_efEF_efEF;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("char _char = \'c\' +/- \'h\';");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("wchar _wchar = \'a\' +/- \'r\';");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("time _time = T#1s +/- T#5ms;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ltime _ltime = LT#1us +/- LT#1ns;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("date _date = D#2018-11-01 +/- D#2018-11-02;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INVALID_RANGE_DEFINITION);
        Assert.assertEquals(11, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("define{");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("input[  ]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("output[");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("bool _bool;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("string _string;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("byte _byte;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("word _word;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("dword _dword;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("lword _lword;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("char _char;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("wchar _wchar;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("time _time;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("ltime _ltime;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("date _date;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("teststep(0,\"\"){");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("set[  ]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("assert[");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_bool = true +/- false;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("_string = \"one\" +/- \"two\";");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("_byte = 16#bc +/- 16#df;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_word = 16#abcd +/- 16#efEF;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_dword = 16#abcd_abcd +/- 16#efEF_efEF;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_lword = 16#abcd_abcd_abcd_abcd +/- 16#efEF_efEF_efEF_efEF;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_char = \'c\' +/- \'h\';");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_wchar = \'a\' +/- \'r\';");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_time = T#1s +/- T#5ms;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_ltime = LT#1us +/- LT#1ns;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("_date = D#2018-11-01 +/- D#2018-11-02;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _plus_1 = (this.beginning + _builder_1);
      EisModel _parse_1 = this._parseHelper.parse((_plus_1 + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.INVALID_RANGE_DEFINITION);
        Assert.assertEquals(11, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("define{");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("input[ int a = 0 +/- 5; ]");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("output[]");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      String _plus_2 = (this.beginning + _builder_2);
      EisModel _parse_2 = this._parseHelper.parse((_plus_2 + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INVALID_RANGE_DEFINITION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("define{");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("input[ int a;]");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("output[]");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.append("teststep(0,\"\"){");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("set[ a = 2 +/- 3;]");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("assert[]");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      String _plus_3 = (this.beginning + _builder_3);
      EisModel _parse_3 = this._parseHelper.parse((_plus_3 + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.INVALID_RANGE_DEFINITION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultiplePlcCycles() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"one\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"one\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MULTIPLE_PLCCYCLE);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDivisionByZero() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ int a = 1 / 0;]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      final String zero = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((this.beginning + zero) + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getMulOrDiv(), EisValidator.DIVISION_BY_ZERO);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDivisionByRealZero() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ real a = 1.0 / 0.0;]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      final String zero = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((this.beginning + zero) + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getMulOrDiv(), EisValidator.DIVISION_BY_ZERO);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleTestcaseNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project = \"\";");
      _builder.newLine();
      _builder.append("plcname = \"\";");
      _builder.newLine();
      _builder.append("author \t= \"\";");
      _builder.newLine();
      _builder.append("testcase Blockname(false, FC, \"\"){}");
      _builder.newLine();
      _builder.append("testcase Blockname(false, FC, \"\"){}");
      _builder.newLine();
      EisModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTestcase(), EisValidator.MULTIPLE_TESTCASE_NAME);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInOuts() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("inout[ int a; ]");
      String inout = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("teststep(0,\"\"){");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("set[]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("assert[]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      String teststep = _builder_1.toString();
      EisModel _parse = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MISSING_INOUT_DECLARATION);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("inout[\tint a,b;\t]");
      inout = _builder_2.toString();
      EisModel _parse_1 = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MISSING_INOUT_DECLARATION);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("teststep(0,\"\"){");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("set[ a=0; ]");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("assert[]");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("}");
      _builder_3.newLine();
      teststep = _builder_3.toString();
      EisModel _parse_2 = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MISSING_INOUT_DECLARATION);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("teststep(0,\"\"){");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("set[ ");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("a=0;");
      _builder_4.newLine();
      _builder_4.append("\t\t");
      _builder_4.append("b=0;");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("]");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("assert[]");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("}");
      _builder_4.newLine();
      teststep = _builder_4.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}")));
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append(" ");
      _builder_5.append("inout[ int a; ]");
      inout = _builder_5.toString();
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("teststep(0,\"\"){");
      _builder_6.newLine();
      _builder_6.append("\t");
      _builder_6.append("set[ a=0; ]");
      _builder_6.newLine();
      _builder_6.append("\t");
      _builder_6.append("assert[ a=0; ]");
      _builder_6.newLine();
      _builder_6.append("\t");
      _builder_6.append("}");
      _builder_6.newLine();
      teststep = _builder_6.toString();
      EisModel _parse_3 = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append(" ");
      _builder_7.append("inout[ int a,b; ]");
      inout = _builder_7.toString();
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("teststep(0,\"\"){");
      _builder_8.newLine();
      _builder_8.append("\t");
      _builder_8.append("set[ a=0; ]");
      _builder_8.newLine();
      _builder_8.append("\t");
      _builder_8.append("assert[ a=0; ]");
      _builder_8.newLine();
      _builder_8.append("\t");
      _builder_8.append("}");
      _builder_8.newLine();
      teststep = _builder_8.toString();
      EisModel _parse_4 = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function_4 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MISSING_INOUT_DECLARATION);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_4, _function_4);
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.append(" ");
      _builder_9.append("inout[ int a,b; ]");
      inout = _builder_9.toString();
      StringConcatenation _builder_10 = new StringConcatenation();
      _builder_10.append("teststep(0,\"\"){");
      _builder_10.newLine();
      _builder_10.append("\t");
      _builder_10.append("set[ a=0; b=0;]");
      _builder_10.newLine();
      _builder_10.append("\t");
      _builder_10.append("assert[ a=0; b=0;]");
      _builder_10.newLine();
      _builder_10.append("\t");
      _builder_10.append("}");
      _builder_10.newLine();
      teststep = _builder_10.toString();
      EisModel _parse_5 = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function_5 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_5, _function_5);
      StringConcatenation _builder_11 = new StringConcatenation();
      _builder_11.append("inout[ ");
      _builder_11.newLine();
      _builder_11.append("\t");
      _builder_11.append("udt a(typeA){");
      _builder_11.newLine();
      _builder_11.append("\t\t");
      _builder_11.append("int b,c;");
      _builder_11.newLine();
      _builder_11.append("\t");
      _builder_11.append("}");
      _builder_11.newLine();
      _builder_11.append("]");
      inout = _builder_11.toString();
      StringConcatenation _builder_12 = new StringConcatenation();
      _builder_12.append("teststep(0,\"\"){");
      _builder_12.newLine();
      _builder_12.append("\t");
      _builder_12.append("set[ ]");
      _builder_12.newLine();
      _builder_12.append("\t");
      _builder_12.append("assert[]");
      _builder_12.newLine();
      _builder_12.append("\t");
      _builder_12.append("}");
      _builder_12.newLine();
      teststep = _builder_12.toString();
      EisModel _parse_6 = this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}"));
      final Procedure1<EisModel> _function_6 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getTeststepBlock(), EisValidator.MISSING_INOUT_DECLARATION);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_6, _function_6);
      StringConcatenation _builder_13 = new StringConcatenation();
      _builder_13.append("inout[ ");
      _builder_13.newLine();
      _builder_13.append("\t");
      _builder_13.append("udt a(typeA){");
      _builder_13.newLine();
      _builder_13.append("\t\t");
      _builder_13.append("int b,c;");
      _builder_13.newLine();
      _builder_13.append("\t");
      _builder_13.append("}");
      _builder_13.newLine();
      _builder_13.append("]");
      inout = _builder_13.toString();
      StringConcatenation _builder_14 = new StringConcatenation();
      _builder_14.append("teststep(0,\"\"){");
      _builder_14.newLine();
      _builder_14.append("\t");
      _builder_14.append("set[ a.b=0;]");
      _builder_14.newLine();
      _builder_14.append("\t");
      _builder_14.append("assert[ a.c=0; ]");
      _builder_14.newLine();
      _builder_14.append("\t");
      _builder_14.append("}");
      _builder_14.newLine();
      teststep = _builder_14.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((((((this.start + "]") + inout) + "}") + teststep) + "}")));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertWrongType(final String text, final int numberOfErrors) {
    try {
      EisModel _parse = this._parseHelper.parse(text);
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(numberOfErrors, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertDuplicateVariables(final String text, final EClass type, final String description, final String name, final int duplicateErrors) {
    try {
      EisModel _parse = this._parseHelper.parse(text);
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, type, 
          EisValidator.MULTIPLE_VARIABLE_DECLARATION, 
          text.indexOf(type.toString()), 
          name.length(), 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        this._validationTestHelper.assertError(it, type, 
          EisValidator.MULTIPLE_VARIABLE_DECLARATION, 
          text.lastIndexOf(type.toString()), 
          name.length(), 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        Assert.assertEquals(duplicateErrors, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertDuplicateUdts(final String text, final EClass type, final String description, final String name, final String variableType, final int duplicateErrors) {
    try {
      EisModel _parse = this._parseHelper.parse(text);
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, type, 
          EisValidator.MULTIPLE_UDT_DECLARATION, 
          text.indexOf(type.toString()), 
          name.length(), 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        this._validationTestHelper.assertError(it, type, 
          EisValidator.MULTIPLE_UDT_DECLARATION, 
          text.lastIndexOf(type.toString()), 
          name.length(), 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        Assert.assertEquals(duplicateErrors, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertType(final CharSequence input, final DefineType expectedWrongType, final DefineType expectedActualType) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse((((this.start + "int a =") + input) + this.endWithSemicolon)), EisPackage.eINSTANCE.getIdiom(), 
        EisValidator.TYPE_MISMATCH, ((("expected " + expectedActualType) + " type, but was ") + expectedWrongType));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertSameType(final CharSequence input, final DefineType expectedLeft, final DefineType expectedRight) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse((((this.start + "int a =") + input) + this.endWithSemicolon)), EisPackage.eINSTANCE.getIdiom(), 
        EisValidator.TYPE_MISMATCH, ((("expected the same type, but was " + expectedLeft) + ", ") + expectedRight));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertNotBooleanType(final CharSequence input) {
    try {
      this._validationTestHelper.assertError(this._parseHelper.parse((((this.start + "int a =") + input) + this.endWithSemicolon)), EisPackage.eINSTANCE.getIdiom(), 
        EisValidator.TYPE_MISMATCH, "cannot be boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
