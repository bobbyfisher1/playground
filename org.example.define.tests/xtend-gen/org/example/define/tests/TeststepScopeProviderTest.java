package org.example.define.tests;

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
import org.example.define.define.Assert;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.Set;
import org.example.define.define.TeststepBlock;
import org.example.define.tests.DefineInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineInjectorProvider.class)
@SuppressWarnings("all")
public class TeststepScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<DefineBlock> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  private final String define = "define{";
  
  private final String output = "output[]";
  
  private final String input = "input[]";
  
  private final String end = new Function0<String>() {
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
      return _builder.toString();
    }
  }.apply();
  
  @Test
  public void testSetReference() {
    try {
      Set _set = IterableExtensions.<TeststepBlock>head(this._parseHelper.parse((((this.define + this.output) + "input[int a, b;]") + this.end)).getTeststeps()).getAssertion().getSet();
      final Procedure1<Set> _function = (Set it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, DefinePackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Set>operator_doubleArrow(_set, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssertReference() {
    try {
      Assert _assert = IterableExtensions.<TeststepBlock>head(this._parseHelper.parse((((this.define + this.input) + "output[int a, b;]") + this.end)).getTeststeps()).getAssertion().getAssert();
      final Procedure1<Assert> _function = (Assert it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, DefinePackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Assert>operator_doubleArrow(_assert, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSetReferenceInout() {
    try {
      Set _set = IterableExtensions.<TeststepBlock>head(this._parseHelper.parse(((((this.define + this.input) + this.output) + "inout[int a, b;]") + this.end)).getTeststeps()).getAssertion().getSet();
      final Procedure1<Set> _function = (Set it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, DefinePackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Set>operator_doubleArrow(_set, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssertReferenceInout() {
    try {
      Assert _assert = IterableExtensions.<TeststepBlock>head(this._parseHelper.parse(((((this.define + this.input) + this.output) + "inout[int a, b;]") + this.end)).getTeststeps()).getAssertion().getAssert();
      final Procedure1<Assert> _function = (Assert it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, DefinePackage.eINSTANCE.getStatement_Variable(), "a, b");
      };
      ObjectExtensions.<Assert>operator_doubleArrow(_assert, _function);
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
