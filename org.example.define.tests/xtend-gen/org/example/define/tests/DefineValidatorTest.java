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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.Variable;
import org.example.define.tests.DefineInjectorProvider;
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
  public void testDuplicateVariants() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[variant a(int);]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[variant a(int);]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicateVariants(_builder.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "a", "int", 2);
  }
  
  @Test
  public void testDuplicateUdts() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[udt a(udtType){}]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[udt a(udtType){}]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicateUdts(_builder.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "a", "udtType", 2);
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
  public void failingTestInferredType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
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
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidCommaNotationAndMissingType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a, ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variant b(int);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("t;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MISSING_VARIABLE_TYPE);
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.INVALID_COMMA_NOTATION);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
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
      _builder.append("output[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a,");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variant b(int);");
      _builder.newLine();
      _builder.append("] ");
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
  public void testInvalidCommaOnLastVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ int a,] ");
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
  public void testTypesAfterComma() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ int a = 8, b = 10 +/- 5;] ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        EList<Variable> _outputVariables = it.getDirection().getOutput().getOutputVariables();
        final Procedure1<EList<Variable>> _function_1 = (EList<Variable> it_1) -> {
          Variable _get = it_1.get(0);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            Assert.assertEquals(it_2.getVariableDefinition().getVariableName(), "a");
            Assert.assertEquals(it_2.getVariableType().getBasicTypes(), "int");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get, _function_2);
          Variable _get_1 = it_1.get(1);
          final Procedure1<Variable> _function_3 = (Variable it_2) -> {
            Assert.assertEquals(it_2.getVariableDefinition().getVariableName(), "b");
            Assert.assertEquals(it_2.getVariableType(), null);
          };
          ObjectExtensions.<Variable>operator_doubleArrow(_get_1, _function_3);
        };
        ObjectExtensions.<EList<Variable>>operator_doubleArrow(_outputVariables, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingVariantKeyword() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[a(int);]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MISSING_VARIANT_KEYWORD);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidCommaNotationAndMissingVariantKeyword() {
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
      _builder.append("variant a(int),");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int b;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("c(bool);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.INVALID_COMMA_NOTATION);
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MISSING_VARIANT_KEYWORD);
        Assert.assertEquals(2, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleVariantKeyword() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[variant a(int), variant b(bool);]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.MULTIPLE_VARIANT_KEYWORD);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidCommaOnLastVariant() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[variant a(int),]");
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
  
  private void assertDuplicateVariables(final String text, final EClass type, final String description, final String name, final int duplicateErrors) {
    try {
      DefineBlock _parse = this._parseHelper.parse(text);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        int _indexOf = text.indexOf(type.toString());
        int _length = name.length();
        int _length_1 = ";".length();
        int _plus = (_length + _length_1);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIABLE_DECLARATION, _indexOf, _plus, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_2 = name.length();
        int _plus_1 = (_length_2 + 1);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIABLE_DECLARATION, _lastIndexOf, _plus_1, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        Assert.assertEquals(duplicateErrors, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertDuplicateVariants(final String text, final EClass type, final String description, final String name, final String variableType, final int duplicateErrors) {
    try {
      DefineBlock _parse = this._parseHelper.parse(text);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        int _indexOf = text.indexOf(type.toString());
        int _length = name.length();
        int _length_1 = "();".length();
        int _plus = (_length + _length_1);
        int _length_2 = variableType.length();
        int _plus_1 = (_plus + _length_2);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIANT_DECLARATION, _indexOf, _plus_1, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_3 = name.length();
        int _length_4 = "();".length();
        int _plus_2 = (_length_3 + _length_4);
        int _length_5 = variableType.length();
        int _plus_3 = (_plus_2 + _length_5);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIANT_DECLARATION, _lastIndexOf, _plus_3, 
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
        int _length_1 = "udt (){}".length();
        int _plus = (_length + _length_1);
        int _length_2 = variableType.length();
        int _plus_1 = (_plus + _length_2);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_UDT_DECLARATION, _indexOf, _plus_1, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_3 = name.length();
        int _length_4 = "udt (){}".length();
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
}
