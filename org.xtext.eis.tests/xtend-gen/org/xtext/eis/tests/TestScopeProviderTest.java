package org.xtext.eis.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.eis.eis.Assert;
import org.xtext.eis.eis.EisModel;
import org.xtext.eis.eis.EisPackage;
import org.xtext.eis.eis.Set;
import org.xtext.eis.eis.Testcase;
import org.xtext.eis.eis.TeststepBlock;
import org.xtext.eis.tests.EisInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class TestScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<EisModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
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
  
  private final String define = (this.beginning + "define{");
  
  private final String output = "output[]";
  
  private final String input = "input[]";
  
  private String teststep = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("teststep(0,\'\'){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("set[]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      String _plus = (_builder.toString() + TestScopeProviderTest.this.ending);
      return _plus;
    }
  }.apply();
  
  @Test
  public void testSetReference() {
    try {
      Set _set = IterableExtensions.<TeststepBlock>head(IterableExtensions.<Testcase>head(this._parseHelper.parse((((this.define + this.output) + "input[int a, b;]") + this.teststep)).getTestcases()).getDefine().getTeststeps()).getAssertion().getSet();
      final Procedure1<Set> _function = (Set it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, EisPackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Set>operator_doubleArrow(_set, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssertReference() {
    try {
      Assert _assert = IterableExtensions.<TeststepBlock>head(IterableExtensions.<Testcase>head(this._parseHelper.parse((((this.define + this.input) + "output[int a, b;]") + this.teststep)).getTestcases()).getDefine().getTeststeps()).getAssertion().getAssert();
      final Procedure1<Assert> _function = (Assert it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, EisPackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Assert>operator_doubleArrow(_assert, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSetReferenceInout() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("teststep(0,\'\'){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("set[ a=0; b=0;]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      String _plus = (_builder.toString() + this.ending);
      this.teststep = _plus;
      Set _set = IterableExtensions.<TeststepBlock>head(IterableExtensions.<Testcase>head(this._parseHelper.parse(((((this.define + this.input) + this.output) + "inout[int a, b;]") + this.teststep)).getTestcases()).getDefine().getTeststeps()).getAssertion().getSet();
      final Procedure1<Set> _function = (Set it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, EisPackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Set>operator_doubleArrow(_set, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssertReferenceInout() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("teststep(0,\'\'){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("set[ a=0; b=0;]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      String _plus = (_builder.toString() + this.ending);
      this.teststep = _plus;
      Assert _assert = IterableExtensions.<TeststepBlock>head(IterableExtensions.<Testcase>head(this._parseHelper.parse(((((this.define + this.input) + this.output) + "inout[int a, b;]") + this.teststep)).getTestcases()).getDefine().getTeststeps()).getAssertion().getAssert();
      final Procedure1<Assert> _function = (Assert it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, EisPackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Assert>operator_doubleArrow(_assert, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSettingVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ a = 3; ]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String teststep = _builder.toString();
      EisModel _parse = this._parseHelper.parse((((((this.define + "input[ int a; ]") + this.output) + "}") + teststep) + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleStatements() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = 3;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//a = 4;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String teststep = _builder.toString();
      EisModel _parse = this._parseHelper.parse((((((this.define + "input[ int a; ]") + this.output) + "}") + teststep) + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUdtStatements() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int b = 0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ a.b = 3; ]");
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
  public void testUdtRefStatements() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int b = 0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("typeA xyz;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ xyz.b = 3; ]");
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
  public void testRecursiveUdtStatements() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt b(typeB){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int c;");
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
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("teststep(0,\"\"){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("assert[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("set[ a.b.c = 3; ]");
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
  
  private void assertScope(final EObject context, final EReference reference, final CharSequence expected) {
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getName();
    };
    org.junit.Assert.assertEquals(expected.toString(), IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(this._iScopeProvider.getScope(context, reference).getAllElements(), _function), ", "));
  }
}
