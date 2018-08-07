package org.example.eis.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.eis.tests.EisInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class EisFormatterTest {
  @Inject
  @Extension
  private FormatterTestHelper _formatterTestHelper;
  
  @Test
  public void testEisModel() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project=\"proj\"     ;   plcname=\"name\"\t;\t\tauthor=\"Bob\"\t\t\t;\t\t");
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("project = \"proj\";");
      _builder_1.newLine();
      _builder_1.append("plcname = \"name\";");
      _builder_1.newLine();
      _builder_1.append("author  = \"Bob\";");
      it.setExpectation(_builder_1);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
  
  @Test
  public void testEmptyTestcase() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project=\"proj\"\t;plcname=\"name\";author=\"Bob\";\t");
      _builder.newLine();
      _builder.append("testcase   One           {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("project = \"proj\";");
      _builder_1.newLine();
      _builder_1.append("plcname = \"name\";");
      _builder_1.newLine();
      _builder_1.append("author  = \"Bob\";");
      _builder_1.newLine();
      _builder_1.append("testcase One {}");
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
  
  @Test
  public void testTestblock() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project=\"proj\";plcname=\"name\";author=\"Bob\";\t");
      _builder.newLine();
      _builder.append("testcase One { testActive=true\t;\t\tblockType=FC;description=\"string\";}");
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("project = \"proj\";");
      _builder_1.newLine();
      _builder_1.append("plcname = \"name\";");
      _builder_1.newLine();
      _builder_1.append("author  = \"Bob\";");
      _builder_1.newLine();
      _builder_1.append("testcase One {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("testActive  = true;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("blockType   = FC;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("description = \"string\";");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
  
  @Test
  public void testDefineBlock() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project=\"proj\";plcname=\"name\";author=\"Bob\";\t");
      _builder.newLine();
      _builder.append("testcase One { testActive=true\t;\t\tblockType=FC;description=\"string\";");
      _builder.newLine();
      _builder.append("define{  input[]output[]\t}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("project = \"proj\";");
      _builder_1.newLine();
      _builder_1.append("plcname = \"name\";");
      _builder_1.newLine();
      _builder_1.append("author  = \"Bob\";");
      _builder_1.newLine();
      _builder_1.append("testcase One {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("testActive  = true;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("blockType   = FC;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("description = \"string\";");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("define {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("input[]");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("output[]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
}
