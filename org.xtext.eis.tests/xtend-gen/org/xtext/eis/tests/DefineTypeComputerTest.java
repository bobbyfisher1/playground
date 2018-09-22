package org.xtext.eis.tests;

import com.google.inject.Inject;
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
public class DefineTypeComputerTest {
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
      String _plus = (DefineTypeComputerTest.this.beginning + _builder);
      return _plus;
    }
  }.apply();
  
  private final String end = ("]}" + this.ending);
  
  private final String teststep = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("set[]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("assert[a=");
      return _builder.toString();
    }
  }.apply();
  
  @Test
  public void testIsInt() {
    Assert.assertTrue(this._defineTypeComputer.isIntSuperType(DefineTypeComputer.INT_TYPE));
  }
  
  @Test
  public void testAllTypes() {
    this.assertSameType("int a = 2;", DefineTypeComputer.INT_TYPE);
    this.assertSameType("string b = \'stringaling\';", DefineTypeComputer.STRING_TYPE);
    this.assertSameType("bool c = true;", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool d = true || false; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool e = true && false; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool f = true == false; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool g = true != false; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool h = 1>=0; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool i = 0<=1; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool j = 1>0; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool k = 0<1; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("bool p = !true; ", DefineTypeComputer.BOOL_TYPE);
    this.assertSameType("int l = 1+1; ", DefineTypeComputer.INT_TYPE);
    this.assertSameType("int m = 1-1; ", DefineTypeComputer.INT_TYPE);
    this.assertSameType("int n = 1*1; ", DefineTypeComputer.INT_TYPE);
    this.assertSameType("int o = 1/1; ", DefineTypeComputer.INT_TYPE);
  }
  
  @Test
  public void testTypesWithPlusOp() {
    this.assertSameType("int a = 1+1;", DefineTypeComputer.INT_TYPE);
    this.assertSameType("string b = 1+\'string\';", DefineTypeComputer.STRING_TYPE);
    this.assertSameType("string c = \'string\'+1;", DefineTypeComputer.STRING_TYPE);
    this.assertSameType("string d = \'string\'+\'string\';", DefineTypeComputer.STRING_TYPE);
    this.assertSameType("string e = \'string\' + true;", DefineTypeComputer.STRING_TYPE);
    this.assertSameType("string f = true + \'string\';", DefineTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void testIsString() {
    Assert.assertTrue(this._defineTypeComputer.isStringType(DefineTypeComputer.STRING_TYPE));
  }
  
  @Test
  public void testIsBool() {
    Assert.assertTrue(this._defineTypeComputer.isBoolType(DefineTypeComputer.BOOL_TYPE));
  }
  
  @Test
  public void testNotIsInt() {
    Assert.assertFalse(this._defineTypeComputer.isIntSuperType(DefineTypeComputer.STRING_TYPE));
  }
  
  @Test
  public void testNotIsString() {
    Assert.assertFalse(this._defineTypeComputer.isStringType(DefineTypeComputer.INT_TYPE));
  }
  
  @Test
  public void testNotIsBool() {
    Assert.assertFalse(this._defineTypeComputer.isBoolType(DefineTypeComputer.INT_TYPE));
  }
  
  @Test
  public void testInt() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int a = -1;");
      _builder.newLine();
      final String _int = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + _int) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReal() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("real a = -1.01;");
      String real = _builder.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + real) + this.end)));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("real a = -1.01E10;");
      real = _builder_1.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + real) + this.end)));
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("real a = -1.01e+10;");
      real = _builder_2.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + real) + this.end)));
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("real a = -1.01E-10;");
      real = _builder_3.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + real) + this.end)));
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("real a = -1.01e710;");
      real = _builder_4.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + real) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("real a = -1.01e+100;");
      real = _builder_5.toString();
      EisModel _parse_1 = this._parseHelper.parse(((this.start + real) + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("real a = -1.01e-100;");
      real = _builder_6.toString();
      EisModel _parse_2 = this._parseHelper.parse(((this.start + real) + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLReal() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("lreal a = -1.01;");
      String lreal = _builder.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + lreal) + this.end)));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("lreal a = -1.01e308;");
      lreal = _builder_1.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + lreal) + this.end)));
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("lreal a = -2.0e308;");
      lreal = _builder_2.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + lreal) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("lreal a = -1.01e309;");
      lreal = _builder_3.toString();
      EisModel _parse_1 = this._parseHelper.parse(((this.start + lreal) + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("lreal a = -3.0e-308;");
      lreal = _builder_4.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + lreal) + this.end)));
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("lreal a = -2.0e-308;");
      lreal = _builder_5.toString();
      EisModel _parse_2 = this._parseHelper.parse(((this.start + lreal) + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("lreal a = -3.0e-309;");
      lreal = _builder_6.toString();
      EisModel _parse_3 = this._parseHelper.parse(((this.start + lreal) + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testChar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("char a = \'u\';");
      final String _char = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + _char) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWChar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("wchar a = \'u\';");
      final String _wchar = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + _wchar) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testByte() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("byte \ta = 16#AA, b = 16#aa;");
      final String _byte = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("byte \ta = 16#aaAA, b = 16#aacc;");
      final String _byte2 = _builder_1.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + _byte) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((this.start + _byte2) + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWord() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("word a = 16#AAAA, b = 16#aaaa;");
      final String word = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("word a = 16#AA, b = 16#aa;");
      final String word2 = _builder_1.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + word) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((this.start + word2) + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDWord() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("dword a = 16#AAAA_AAAA, b = 16#aaaa_aaaa;");
      final String dword = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("dword a = 16#AAAA, b = 16#aaaa_aaaa_cccc_def8;");
      final String dword2 = _builder_1.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + dword) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((this.start + dword2) + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLWord() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("lword a = 16#ABCD_EF01_2345_6789, b = 16#abcd_efaa_aaaa_bbbb;");
      final String lword = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("lword a = 16#2345_6789, b = 16#ab;");
      final String lword2 = _builder_1.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + lword) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((this.start + lword2) + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INCOMPATIBLE_TYPES);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUSInt() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("usint a = 20;");
      final String uSInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((this.start + uSInt) + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUSIntBounds() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("usint a = ");
      final String uSInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + uSInt) + "256") + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + uSInt) + "-1") + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + uSInt) + "0 +/- -14") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((this.start + uSInt) + "0 +/- 256") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUIntBounds() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("uint a = ");
      final String uInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + uInt) + "65535+1") + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + uInt) + "-1") + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + uInt) + "0 +/- -14") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((this.start + uInt) + "0 +/- 65535+1") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUDIntBounds() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("udint a = ");
      final String uDInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + uDInt) + "4294967295+1") + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + uDInt) + "-1") + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + uDInt) + "0 +/- -14") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((this.start + uDInt) + "0 +/- 4294967295+1") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSIntBounds() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("sint a = ");
      final String sInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + sInt) + "-129") + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + sInt) + "128") + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + sInt) + "0 +/-( -128 - 1)") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((this.start + sInt) + "0 +/- (127+1)") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIntBounds() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int a = ");
      final String _int = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + _int) + "-32768 - 1") + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + _int) + "32767+1") + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + _int) + "0 +/- (-32768 - 1)") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((this.start + _int) + "0 +/- (32767+1)") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDIntBounds() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("dint a = ");
      final String dInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((this.start + dInt) + "-2147483648 - 1") + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + dInt) + "2147483647+1") + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + dInt) + "0 +/- (-2147483648- 1)") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((this.start + dInt) + "0 +/- (2147483647+1)") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUSIntBoundsInStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("usint a; ");
      final String uSInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((((this.start + uSInt) + "]}") + this.teststep) + "256") + ";]}") + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((((this.start + uSInt) + "]}") + this.teststep) + "-1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((((this.start + uSInt) + "]}") + this.teststep) + "0 +/- -14") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((((this.start + uSInt) + "]}") + this.teststep) + "0 +/- 256") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUIntBoundsInStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("uint a; ");
      final String uInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((((this.start + uInt) + "]}") + this.teststep) + "65535+1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((((this.start + uInt) + "]}") + this.teststep) + "-1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((((this.start + uInt) + "]}") + this.teststep) + "0 +/- -14") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((((this.start + uInt) + "]}") + this.teststep) + "0 +/- 65535+1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUDIntBoundsInStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("udint a; ");
      final String uDInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((((this.start + uDInt) + "]}") + this.teststep) + "4294967295+1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((((this.start + uDInt) + "]}") + this.teststep) + "-1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((((this.start + uDInt) + "]}") + this.teststep) + "0 +/- -14") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((((this.start + uDInt) + "]}") + this.teststep) + "0 +/- 4294967295+1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSIntBoundsInStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("sint a; ");
      final String sInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((((this.start + sInt) + "]}") + this.teststep) + "-129") + ";]}") + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((((this.start + sInt) + "]}") + this.teststep) + "128") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((((this.start + sInt) + "]}") + this.teststep) + "0 +/- (-128 - 1)") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((((this.start + sInt) + "]}") + this.teststep) + "0 +/- (127+1)") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIntBoundsInStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int a; ");
      final String _int = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((((this.start + _int) + "]}") + this.teststep) + "-32768 - 1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((((this.start + _int) + "]}") + this.teststep) + "32767 + 1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((((this.start + _int) + "]}") + this.teststep) + "0 +/- (-32768 - 1)") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((((this.start + _int) + "]}") + this.teststep) + "0 +/- (32767 + 1)") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDIntBoundsInStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("dint a; ");
      final String dInt = _builder.toString();
      EisModel _parse = this._parseHelper.parse(((((((this.start + dInt) + "]}") + this.teststep) + "-2147483648 - 1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      EisModel _parse_1 = this._parseHelper.parse(((((((this.start + dInt) + "]}") + this.teststep) + "2147483647 + 1") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse(((((((this.start + dInt) + "]}") + this.teststep) + "0 +/- (-2147483648 - 1)") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse(((((((this.start + dInt) + "]}") + this.teststep) + "0 +/- (2147483647 + 1)") + ";]}") + this.ending));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getStatement(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void temptingTime() {
    try {
      String time = "24d_20h_31M_23s_647ms";
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((((this.start + "time a = T#") + time) + ";") + this.end)));
      time = "24d_20h_31M_23s_648ms";
      EisModel _parse = this._parseHelper.parse(((((this.start + "time a = T#") + time) + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      time = "-24d_20h_31M_23s_648ms";
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((((this.start + "time a = T#") + time) + ";") + this.end)));
      time = "-24d_20h_31M_23s_649ms";
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + "time a = T#") + time) + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse((((this.start + "time a = T#") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse((((this.start + "time a = T#-") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testingLTime() {
    try {
      String LTime = "106751d_23h_47M_16s_854ms_775us_807ns";
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((((this.start + "ltime a = LT#") + LTime) + ";") + this.end)));
      LTime = "106751d_23h_47M_16s_854ms_775us_808ns";
      EisModel _parse = this._parseHelper.parse(((((this.start + "ltime a = LT#") + LTime) + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      LTime = "-106751d_23h_47M_16s_854ms_775us_808ns";
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((((this.start + "ltime a = LT#") + LTime) + ";") + this.end)));
      LTime = "-106751d_23h_47M_16s_854ms_775us_809ns";
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + "ltime a = LT#") + LTime) + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      EisModel _parse_2 = this._parseHelper.parse((((this.start + "ltime a = LT#") + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
      EisModel _parse_3 = this._parseHelper.parse((((this.start + "ltime a = LT#-") + ";") + this.end));
      final Procedure1<EisModel> _function_3 = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_3, _function_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testingUnderscores() {
    try {
      EisModel _parse = this._parseHelper.parse(((this.start + "time a = T#5s_ ;") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INVALID_UNDERSCORE_NOTATION);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.start + "string a = \'asdf_\';") + this.end)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDate() {
    try {
      String date = "1994-11-01";
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((((this.start + "date a = D#") + date) + ";") + this.end)));
      date = "0000-00-00";
      EisModel _parse = this._parseHelper.parse(((((this.start + "date a = D#") + date) + ";") + this.end));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INVALID_DATE_NOTATION);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
      date = "0000-01-01";
      EisModel _parse_1 = this._parseHelper.parse(((((this.start + "date a = D#") + date) + ";") + this.end));
      final Procedure1<EisModel> _function_1 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_1, _function_1);
      date = "2169-06-07";
      EisModel _parse_2 = this._parseHelper.parse(((((this.start + "date a = D#") + date) + ";") + this.end));
      final Procedure1<EisModel> _function_2 = (EisModel it) -> {
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VALUE_EXCEEDING_DATATYPE_BOUNDS);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse_2, _function_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertSameType(final String text, final DefineType expectedType) {
    try {
      Variables _get = IterableExtensions.<Testcase>head(this._parseHelper.parse(((this.start + text) + this.end)).getTestcases()).getDefine().getDirection().getOutput().getOutputVariables().get(0);
      Assert.assertSame(this._defineTypeComputer.typeFor(((Variable) _get).getIdiom()), expectedType);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
