package org.example.define.ui.tests;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.example.define.ui.tests.DefineUiInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineUiInjectorProvider.class)
@SuppressWarnings("all")
public class DefineContentAssistTest extends AbstractContentAssistTest {
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
  
  @Test
  public void testEmptyProgram() {
    try {
      this.newBuilder().assertText("define");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyBlock() {
    try {
      this.newBuilder().append(this.start).assertText("Name", "]", "bool", "float", "int", "null", "string", "udt", "variant");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableReference() {
    try {
      this.newBuilder().append((this.start + "int a=42; int b=")).assertText("!", "Value", "(", "1", "=", "a", "false", "true");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUdtReference() {
    try {
      this.newBuilder().append((this.start + "udt a(typeA){}   ")).assertText(
        "Name", 
        "typeA", 
        "]", 
        "bool", 
        "float", 
        "int", 
        "null", 
        "string", 
        "udt", 
        "variant");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
