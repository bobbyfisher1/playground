/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
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
import org.xtext.eis.eis.BoolConstant;
import org.xtext.eis.eis.EisModel;
import org.xtext.eis.eis.Idiom;
import org.xtext.eis.eis.IntConstant;
import org.xtext.eis.eis.RealConstant;
import org.xtext.eis.eis.Testcase;
import org.xtext.eis.eis.Udt;
import org.xtext.eis.eis.Variable;
import org.xtext.eis.eis.Variables;
import org.xtext.eis.tests.EisInjectorProvider;
import org.xtext.eis.typing.DefineTypeComputer;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class EisParsingTest {
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
  
  private final int delta = 0;
  
  @Test
  public void testFixedProgramBeginning_noErrors() {
    try {
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((this.beginning + this.ending)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessingProgrammBeginning_noErrors() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project = \"x\";");
      _builder.newLine();
      _builder.append("plcname = \"fj484\";");
      _builder.newLine();
      _builder.append("author = \"Paul Auster\";");
      _builder.newLine();
      EisModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(it.getProjectName(), "x");
        Assert.assertEquals(it.getPlcName(), "fj484");
        Assert.assertEquals(it.getAuthorName(), "Paul Auster");
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefineStructure() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("int a= 4; int b = 0;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("bool Int=true;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("int x; variant int y; udt z(atype){}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("inout[");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("udt Rain(typeRain){ ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("int d = 90;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("udt Sun(typeSun){");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("int e = 10;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("variant int Train;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((_plus + this.ending)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessingVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int a= 4;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("udt Dido(typeDido){ int b = 39; }");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("variant int Train;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("inout[]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("output[bool x,y,z;]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variables> _inputVariables = IterableExtensions.<Testcase>head(it.getTestcases()).getDefine().getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variables>> _function_1 = (EList<Variables> it_1) -> {
          Variables _get = it_1.get(0);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.INT_TYPE);
            Assert.assertEquals(it_2.getName(), "a");
            Idiom _idiom = it_2.getIdiom();
            Assert.assertEquals(((IntConstant) _idiom).getValue(), 4);
          };
          ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get), _function_2);
          Variables _get_1 = it_1.get(1);
          final Procedure1<Udt> _function_3 = (Udt it_2) -> {
            Assert.assertEquals(it_2.getName(), "Dido");
            Assert.assertEquals(it_2.getUdtType().getName(), "typeDido");
            Variables _get_2 = it_2.getUdtVariables().get(0);
            final Procedure1<Variable> _function_4 = (Variable it_3) -> {
              Assert.assertSame(this._defineTypeComputer.typeFor(it_3.getVariableType()), DefineTypeComputer.INT_TYPE);
              Assert.assertEquals(it_3.getName(), "b");
              Idiom _idiom = it_3.getIdiom();
              Assert.assertEquals(((IntConstant) _idiom).getValue(), 39);
            };
            ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get_2), _function_4);
          };
          ObjectExtensions.<Udt>operator_doubleArrow(((Udt) _get_1), _function_3);
          Variables _get_2 = it_1.get(2);
          final Procedure1<Variable> _function_4 = (Variable it_2) -> {
            Assert.assertEquals(it_2.getName(), "Train");
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.INT_TYPE);
            Assert.assertEquals(Boolean.valueOf(it_2.isVariantKeyword()), Boolean.valueOf(true));
          };
          ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get_2), _function_4);
        };
        ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessingVariables2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int a = 4 ;int b; bool c = false;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("bool d=true;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variables> _inputVariables = IterableExtensions.<Testcase>head(it.getTestcases()).getDefine().getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variables>> _function_1 = (EList<Variables> it_1) -> {
          Variables _get = it_1.get(0);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.INT_TYPE);
            Assert.assertEquals(it_2.getName(), "a");
            Idiom _idiom = it_2.getIdiom();
            Assert.assertEquals(((IntConstant) _idiom).getValue(), 4);
          };
          ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get), _function_2);
          Variables _get_1 = it_1.get(1);
          final Procedure1<Variables> _function_3 = (Variables it_2) -> {
            Assert.assertEquals(it_2.getName(), "b");
          };
          ObjectExtensions.<Variables>operator_doubleArrow(_get_1, _function_3);
          Variables _get_2 = it_1.get(2);
          final Procedure1<Variable> _function_4 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.BOOL_TYPE);
            Assert.assertEquals(it_2.getName(), "c");
            Idiom _idiom = it_2.getIdiom();
            Assert.assertEquals(((BoolConstant) _idiom).getValue(), "false");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get_2), _function_4);
          Variables _get_3 = it_1.get(3);
          final Procedure1<Variable> _function_5 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.BOOL_TYPE);
            Assert.assertEquals(it_2.getName(), "d");
            Idiom _idiom = it_2.getIdiom();
            Assert.assertEquals(((BoolConstant) _idiom).getValue(), "true");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get_3), _function_5);
        };
        ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessingCascadeOfVariables() {
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
      _builder.append("int a;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("/*int b=9;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("bool c;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("bool d=false;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int e=1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt One(typeOne){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt Two(typeTwo){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int aaaa; ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("variant bool TwoAndAHalf;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("variant int Three;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
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
  public void testUnorderedGroup() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[] input[] inout[]");
      _builder.newLine();
      _builder.append("}");
      String _plus = (this.beginning + _builder);
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse((_plus + this.ending)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOutputRangeDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input [ ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output [ int a = 4  +/-  9; ]");
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
  public void testDecimal() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ real a = 19.00000000009; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Variables _get = IterableExtensions.<Testcase>head(it.getTestcases()).getDefine().getDirection().getInput().getInputVariables().get(0);
        final Procedure1<Variable> _function_1 = (Variable it_1) -> {
          Idiom _idiom = it_1.getIdiom();
          Assert.assertEquals(Double.parseDouble(((RealConstant) _idiom).getValue()), 19.00000000009, this.delta);
          this._validationTestHelper.assertNoErrors(it_1);
        };
        ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get), _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDecimal3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ real a = 0.4; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Variables _get = IterableExtensions.<Testcase>head(it.getTestcases()).getDefine().getDirection().getInput().getInputVariables().get(0);
        final Procedure1<Variable> _function_1 = (Variable it_1) -> {
          Idiom _idiom = it_1.getIdiom();
          Assert.assertEquals(Double.parseDouble(((RealConstant) _idiom).getValue()), 0.4, this.delta);
        };
        ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get), _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ int a=14; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessingVariables3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int a= 4;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variables> _inputVariables = IterableExtensions.<Testcase>head(it.getTestcases()).getDefine().getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variables>> _function_1 = (EList<Variables> it_1) -> {
          Variables _get = it_1.get(0);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.INT_TYPE);
            Assert.assertEquals(it_2.getName(), "a");
            Idiom _idiom = it_2.getIdiom();
            Assert.assertEquals(((IntConstant) _idiom).getValue(), 4);
          };
          ObjectExtensions.<Variable>operator_doubleArrow(((Variable) _get), _function_2);
        };
        ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyStatement() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ char a;]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ a; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String teststep = _builder.toString();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(((this.beginning + teststep) + this.ending)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
