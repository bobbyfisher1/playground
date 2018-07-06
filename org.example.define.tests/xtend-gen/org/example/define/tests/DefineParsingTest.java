/**
 * generated by Xtext 2.14.0
 */
package org.example.define.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.define.define.BoolConstant;
import org.example.define.define.DefineBlock;
import org.example.define.define.EFloat;
import org.example.define.define.Expression;
import org.example.define.define.IntConstant;
import org.example.define.define.Udt;
import org.example.define.define.Variable;
import org.example.define.tests.DefineInjectorProvider;
import org.example.define.typing.DefineTypeComputer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineInjectorProvider.class)
@SuppressWarnings("all")
public class DefineParsingTest {
  @Inject
  @Extension
  private ParseHelper<DefineBlock> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  @Test
  public void testDefineStructure() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a= 4; int b = 0 +/- 3;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("bool Int=true;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//float f = 5;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int x; variant int y; udt z(atype){}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("inout[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt Rain(typeRain){ ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int d = 90;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt Sun(typeSun){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int e = 10;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variant int Train;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
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
      _builder.append("output[bool x,y,z;]\t\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variable> _inputVariables = it.getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variable>> _function_1 = (EList<Variable> it_1) -> {
          Variable _get = it_1.get(0);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            Assert.assertEquals(it_2.getVariableName(), "a");
            Expression _expression = it_2.getExpression();
            Assert.assertEquals(((IntConstant) _expression).getValue(), 4);
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get, _function_2);
          Udt _udt = it_1.get(1).getUdt();
          final Procedure1<Udt> _function_3 = (Udt it_2) -> {
            Assert.assertEquals(it_2.getUdtName(), "Dido");
            Assert.assertEquals(it_2.getUdtTypes().getUdtTypeName(), "typeDido");
            Variable _get_1 = it_2.getUdtVariables().get(0);
            final Procedure1<Variable> _function_4 = (Variable it_3) -> {
              Assert.assertEquals(it_3.getVariableName(), "b");
              Expression _expression = it_3.getExpression();
              Assert.assertEquals(((IntConstant) _expression).getValue(), 39);
            };
            ObjectExtensions.<Variable>operator_doubleArrow(_get_1, _function_4);
          };
          ObjectExtensions.<Udt>operator_doubleArrow(_udt, _function_3);
          Variable _get_1 = it_1.get(2);
          final Procedure1<Variable> _function_4 = (Variable it_2) -> {
            Assert.assertEquals(it_2.getVariableName(), "Train");
            Assert.assertEquals(Boolean.valueOf(it_2.isVariantKeyword()), Boolean.valueOf(true));
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get_1, _function_4);
        };
        ObjectExtensions.<EList<Variable>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variable> _inputVariables = it.getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variable>> _function_1 = (EList<Variable> it_1) -> {
          Variable _get = it_1.get(0);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.INT_TYPE);
            Assert.assertEquals(it_2.getVariableName(), "a");
            Expression _expression = it_2.getExpression();
            Assert.assertEquals(((IntConstant) _expression).getValue(), 4);
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get, _function_2);
          Variable _get_1 = it_1.get(1);
          final Procedure1<Variable> _function_3 = (Variable it_2) -> {
            Assert.assertEquals(it_2.getVariableName(), "b");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get_1, _function_3);
          Variable _get_2 = it_1.get(2);
          final Procedure1<Variable> _function_4 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.BOOL_TYPE);
            Assert.assertEquals(it_2.getVariableName(), "c");
            Expression _expression = it_2.getExpression();
            Assert.assertEquals(((BoolConstant) _expression).getValue(), "false");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get_2, _function_4);
          Variable _get_3 = it_1.get(3);
          final Procedure1<Variable> _function_5 = (Variable it_2) -> {
            Assert.assertSame(this._defineTypeComputer.typeFor(it_2.getVariableType()), DefineTypeComputer.BOOL_TYPE);
            Assert.assertEquals(it_2.getVariableName(), "d");
            Expression _expression = it_2.getExpression();
            Assert.assertEquals(((BoolConstant) _expression).getValue(), "true");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get_3, _function_5);
        };
        ObjectExtensions.<EList<Variable>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
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
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
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
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
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
      _builder.append("input[ float a = 19.5; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        Variable _get = it.getDirection().getInput().getInputVariables().get(0);
        final Procedure1<Variable> _function_1 = (Variable it_1) -> {
          Expression _expression = it_1.getExpression();
          Assert.assertEquals(((EFloat) _expression).getValue(), 19);
          Expression _expression_1 = it_1.getExpression();
          Assert.assertEquals(((EFloat) _expression_1).getValueOfDecimal(), 5);
        };
        ObjectExtensions.<Variable>operator_doubleArrow(_get, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDecimal2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ float a = 19.; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        Variable _get = it.getDirection().getInput().getInputVariables().get(0);
        final Procedure1<Variable> _function_1 = (Variable it_1) -> {
          Expression _expression = it_1.getExpression();
          Assert.assertEquals(((EFloat) _expression).getValue(), 19);
          Expression _expression_1 = it_1.getExpression();
          Assert.assertEquals(((EFloat) _expression_1).getValueOfDecimal(), 0);
        };
        ObjectExtensions.<Variable>operator_doubleArrow(_get, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      _builder.append("input[ float a = 0.4; ]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        Variable _get = it.getDirection().getInput().getInputVariables().get(0);
        final Procedure1<Variable> _function_1 = (Variable it_1) -> {
          Expression _expression = it_1.getExpression();
          Assert.assertEquals(((EFloat) _expression).getValue(), 0);
          Expression _expression_1 = it_1.getExpression();
          Assert.assertEquals(((EFloat) _expression_1).getValueOfDecimal(), 4);
        };
        ObjectExtensions.<Variable>operator_doubleArrow(_get, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
