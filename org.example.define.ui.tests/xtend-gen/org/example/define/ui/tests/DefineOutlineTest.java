package org.example.define.ui.tests;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.ui.testing.AbstractOutlineTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.define.ui.tests.DefineUiInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineUiInjectorProvider.class)
@SuppressWarnings("all")
public class DefineOutlineTest extends AbstractOutlineTest {
  @Override
  protected String getEditorId() {
    return "org.example.define.Define";
  }
  
  @Test
  public void testBasicOutline() {
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
      _builder.append("\t");
      _builder.append("inout[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("input");
      _builder_1.newLine();
      _builder_1.append("output");
      _builder_1.newLine();
      _builder_1.append("inout");
      _builder_1.newLine();
      this.assertAllLabels(_builder, _builder_1);
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
      _builder.append("input[ int a;]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("input");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("a : int");
      _builder_1.newLine();
      _builder_1.append("output");
      _builder_1.newLine();
      this.assertAllLabels(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
