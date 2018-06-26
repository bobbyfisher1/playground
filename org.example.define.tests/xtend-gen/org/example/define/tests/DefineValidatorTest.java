package org.example.define.tests;

import com.google.inject.Inject;
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
    _builder.append("output[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[ int t, t;]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicateVariables(_builder.toString(), DefinePackage.eINSTANCE.getVariable(), "variable name", "t", 2);
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
  
  private void assertDuplicateVariables(final String text, final EClass type, final String description, final String name, final int duplicateErrors) {
    try {
      DefineBlock _parse = this._parseHelper.parse(text);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        int _indexOf = text.indexOf(type.toString());
        int _length = name.length();
        int _length_1 = ";".length();
        int _plus = (_length + _length_1);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIABLE, _indexOf, _plus, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_2 = name.length();
        int _plus_1 = (_length_2 + 1);
        this._validationTestHelper.assertError(it, type, DefineValidator.MULTIPLE_VARIABLE, _lastIndexOf, _plus_1, 
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
          DefineValidator.MULTIPLE_VARIANT, _indexOf, _plus_1, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_3 = name.length();
        int _length_4 = "();".length();
        int _plus_2 = (_length_3 + _length_4);
        int _length_5 = variableType.length();
        int _plus_3 = (_plus_2 + _length_5);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_VARIANT, _lastIndexOf, _plus_3, 
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
          DefineValidator.MULTIPLE_UDT, _indexOf, _plus_1, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        int _lastIndexOf = text.lastIndexOf(type.toString());
        int _length_3 = name.length();
        int _length_4 = "udt (){}".length();
        int _plus_2 = (_length_3 + _length_4);
        int _length_5 = variableType.length();
        int _plus_3 = (_plus_2 + _length_5);
        this._validationTestHelper.assertError(it, type, 
          DefineValidator.MULTIPLE_UDT, _lastIndexOf, _plus_3, 
          (((("Multiple " + description) + " \'") + name) + "\'"));
        Assert.assertEquals(duplicateErrors, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
