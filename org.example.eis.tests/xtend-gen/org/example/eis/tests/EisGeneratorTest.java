package org.example.eis.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.example.eis.eis.EisModel;
import org.example.eis.tests.EisInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class EisGeneratorTest {
  @Inject
  @Extension
  private ParseHelper<EisModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  private final String beginning = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project = \"project\";");
      _builder.newLine();
      _builder.append("plcname = \"plcname\";");
      _builder.newLine();
      _builder.append("author \t= \"author\";");
      _builder.newLine();
      _builder.append("testcase Testcase{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testActive = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("blockType = FC;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description = \"description\";");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private final String ending = "}";
  
  @Test
  public void testEmptiness() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("project = \"project\";");
    _builder.newLine();
    _builder.append("plcname = \"plcname\";");
    _builder.newLine();
    _builder.append("author \t= \"author\";");
    _builder.newLine();
    _builder.append("testcase Testcase{}");
    _builder.newLine();
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\">");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_builder.toString(), _function);
  }
  
  @Test
  public void testBeginning() {
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder.newLine();
        _builder.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<TiaProjectName>project</TiaProjectName>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<PlcName>plcname</PlcName>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<Author>author</Author>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<TestCases>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</TestCase>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</TestCases>");
        _builder.newLine();
        _builder.append("</TestFixture>");
        _builder.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow((this.beginning + this.ending), _function);
  }
  
  @Test
  public void testMultipleEmptyTestCases() {
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder.newLine();
        _builder.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<TiaProjectName>project</TiaProjectName>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<PlcName>plcname</PlcName>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<Author>author</Author>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<TestCases>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</TestCase>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<TestCase ID=\"1\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</TestCase>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<TestCase ID=\"2\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</TestCase>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</TestCases>");
        _builder.newLine();
        _builder.append("</TestFixture>");
        _builder.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(((this.beginning + this.ending) + "testcase Test1{} testcase Test2{}"), _function);
  }
  
  @Test
  public void testEmptyDefineBlock() {
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
    String _plus = (this.beginning + _builder);
    String _plus_1 = (_plus + this.ending);
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_plus_1, _function);
  }
  
  @Test
  public void testDefineBlockWithVariables() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("variant int a;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool b;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[\t]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[  ]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(0, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("b = true; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("a = 12; ");
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
    String _plus_1 = (_plus + this.ending);
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<Teststep PlcCycle =\"0\" Description=\"\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("<Inputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t");
        _builder_1.append("<Element xsi:type=\"Input\" Name=\"a\" Datatype=\"int\" Direction=\"Input\" Value=\"12\" Variant=\"true\" />");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t");
        _builder_1.append("<Element xsi:type=\"Input\" Name=\"b\" Datatype=\"bool\" Direction=\"Input\" Value=\"true\" Variant=\"false\" />");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("</Inputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("<Outputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("</Outputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("</Teststep>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_plus_1, _function);
  }
  
  @Test
  public void testDefineBlockWithUdts() {
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
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[\t]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[  ]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(0, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("a.b = 43;");
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
    String _plus_1 = (_plus + this.ending);
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<Teststep PlcCycle =\"0\" Description=\"\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("<Inputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t");
        _builder_1.append("<Element xsi: type=\"InputUDT\" Name=\"a\" Datatype=\"typeA\" Direction=\"Input\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t\t");
        _builder_1.append("<Elements>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t\t\t");
        _builder_1.append("<Element xsi:type=\"Input\" Name=\"b\" Datatype=\"int\" Direction=\"Input\" Value=\"43\" Variant=\"false\" />");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t\t");
        _builder_1.append("</Elements>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t");
        _builder_1.append("</Element>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("</Inputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("<Outputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t");
        _builder_1.append("</Outputs>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("</Teststep>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_plus_1, _function);
  }
  
  @Test
  public void testDefineBlockWithUdtsAndInOuts() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[ ]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output[\t]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[ int a; ]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(0, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("a = 43;");
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
    String _plus_1 = (_plus + this.ending);
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<Teststep PlcCycle =\"0\" Description=\"\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("</Teststep>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_plus_1, _function);
  }
  
  @Test
  public void testDefineBlockWithCrazyUdts() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("udt z(allovertheplace){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("string one = \"zero\";");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("udt a(typeA){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("int b;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("udt c(typeC){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("bool d;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
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
    _builder.append("output[\t]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//inout[  ]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(0, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("assert[]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(1, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("z.a.b = 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("z.a.c.d = true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("z.one = \"one\";");
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
    String _plus_1 = (_plus + this.ending);
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<Teststep PlcCycle =\"0\" Description=\"\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("</Teststep>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_plus_1, _function);
  }
  
  @Test
  public void testAbgespeckt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inout[ ");
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
    _builder.append("output[\t]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[  ]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(0, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("assert[]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("teststep(1, \"\"){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("set[ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("a.b = 33;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("c = 3;");
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
    String _plus_1 = (_plus + this.ending);
    final Procedure1<String> _function = (String it) -> {
      try {
        this._validationTestHelper.assertNoErrors(this._parseHelper.parse(it));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<TestFixture xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TiaProjectName>project</TiaProjectName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<PlcName>plcname</PlcName>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<Author>author</Author>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<TestCases>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<TestCase ID=\"0\" TestActive=\"false\" Blockname=\"Testcase\" Blocktype=\"FC\" Description=\"description\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<Teststep PlcCycle =\"0\" Description=\"\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("</Teststep>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</Teststeps>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</TestCase>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</TestCases>");
        _builder_1.newLine();
        _builder_1.append("</TestFixture>");
        _builder_1.newLine();
        this._compilationTestHelper.assertCompilesTo(it, _builder_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ObjectExtensions.<String>operator_doubleArrow(_plus_1, _function);
  }
}
