package org.example.define.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.example.define.define.DefineBlock;
import org.example.define.define.Variable;
import org.example.define.define.Variables;
import org.example.define.tests.DefineInjectorProvider;
import org.example.define.typing.DefineType;
import org.example.define.typing.DefineTypeComputer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineInjectorProvider.class)
@SuppressWarnings("all")
public class DefineTypeComputerTest {
  @Inject
  @Extension
  private ParseHelper<DefineBlock> _parseHelper;
  
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
      return _builder.toString();
    }
  }.apply();
  
  private final String end = "]}";
  
  @Test
  public void testIsInt() {
    Assert.assertTrue(this._defineTypeComputer.isIntType(DefineTypeComputer.INT_TYPE));
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
    Assert.assertFalse(this._defineTypeComputer.isIntType(DefineTypeComputer.STRING_TYPE));
  }
  
  @Test
  public void testNotIsString() {
    Assert.assertFalse(this._defineTypeComputer.isStringType(DefineTypeComputer.INT_TYPE));
  }
  
  @Test
  public void testNotIsBool() {
    Assert.assertFalse(this._defineTypeComputer.isBoolType(DefineTypeComputer.INT_TYPE));
  }
  
  private void assertSameType(final String text, final DefineType expectedType) {
    try {
      Variables _get = this._parseHelper.parse(((this.start + text) + this.end)).getDirection().getOutput().getOutputVariables().get(0);
      Assert.assertSame(this._defineTypeComputer.typeFor(((Variable) _get).getIdiom()), expectedType);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
