package org.xtext.eis.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.eis.eis.EisModel;
import org.xtext.eis.eis.EisPackage;
import org.xtext.eis.eis.Input;
import org.xtext.eis.eis.Testcase;
import org.xtext.eis.eis.Udt;
import org.xtext.eis.eis.UdtRef;
import org.xtext.eis.eis.Variable;
import org.xtext.eis.eis.Variables;
import org.xtext.eis.tests.EisInjectorProvider;
import org.xtext.eis.validation.EisValidator;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class EisScopeProviderTest {
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
      _builder.append("testcase Blockname{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testActive = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("blockType = FC;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description = \"\";");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private final String ending = "}";
  
  @Test
  public void testVariableRefScope() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt b(typeB){}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int c=0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt d(typeD){}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("typeB e;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt f(typeF){}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variables> _inputVariables = IterableExtensions.<Testcase>head(it.getTestcases()).getTestblock().getDefine().getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variables>> _function_1 = (EList<Variables> it_1) -> {
          Variables _get = it_1.get(2);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            this.assertScope(it_2.getIdiom(), EisPackage.eINSTANCE.getVariableRef_Variable(), "a");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(
            ((Variable) _get), _function_2);
          Variables _get_1 = it_1.get(4);
          final Procedure1<UdtRef> _function_3 = (UdtRef it_2) -> {
            this.assertScope(it_2, EisPackage.eINSTANCE.getUdtRef_UdtType(), "typeB, typeD");
          };
          ObjectExtensions.<UdtRef>operator_doubleArrow(
            ((UdtRef) _get_1), _function_3);
        };
        ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRefScope() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt b(typeB){}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int c=0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt d(typeD){}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      Input _input = IterableExtensions.<Testcase>head(this._parseHelper.parse((_plus + this.ending)).getTestcases()).getTestblock().getDefine().getDirection().getInput();
      final Procedure1<Input> _function = (Input it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, EisPackage.eINSTANCE.getUdtRef_UdtType(), "typeB, typeD");
      };
      ObjectExtensions.<Input>operator_doubleArrow(_input, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeInUdt() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int a;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt b(typeB){}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int c = 0;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("typeB d;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("udt dd(typeDD){");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("udt B(typeBB){}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int C=0;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("typeBB D;");
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
      _builder.append("}");
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
        Variables _head = IterableExtensions.<Variables>head(IterableExtensions.<Testcase>head(it.getTestcases()).getTestblock().getDefine().getDirection().getInput().getInputVariables());
        final Procedure1<Udt> _function_1 = (Udt it_1) -> {
          Variables _get = it_1.getUdtVariables().get(2);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            this.assertScope(it_2, EisPackage.eINSTANCE.getVariableRef_Variable(), "a");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(
            ((Variable) _get), _function_2);
          Variables _get_1 = it_1.getUdtVariables().get(3);
          final Procedure1<UdtRef> _function_3 = (UdtRef it_2) -> {
            this.assertScope(it_2, EisPackage.eINSTANCE.getUdtRef_UdtType(), "typeB");
          };
          ObjectExtensions.<UdtRef>operator_doubleArrow(
            ((UdtRef) _get_1), _function_3);
          Variables _get_2 = it_1.getUdtVariables().get(4);
          final Procedure1<Udt> _function_4 = (Udt it_2) -> {
            Variables _get_3 = it_2.getUdtVariables().get(2);
            final Procedure1<Variable> _function_5 = (Variable it_3) -> {
              this.assertScope(it_3, EisPackage.eINSTANCE.getVariableRef_Variable(), "A");
            };
            ObjectExtensions.<Variable>operator_doubleArrow(
              ((Variable) _get_3), _function_5);
            Variables _get_4 = it_2.getUdtVariables().get(3);
            final Procedure1<UdtRef> _function_6 = (UdtRef it_3) -> {
              this.assertScope(it_3, EisPackage.eINSTANCE.getUdtRef_UdtType(), "typeBB");
            };
            ObjectExtensions.<UdtRef>operator_doubleArrow(
              ((UdtRef) _get_4), _function_6);
          };
          ObjectExtensions.<Udt>operator_doubleArrow(
            ((Udt) _get_2), _function_4);
        };
        ObjectExtensions.<Udt>operator_doubleArrow(
          ((Udt) _head), _function_1);
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a = 9;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int b = a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      Variables _get = IterableExtensions.<Testcase>head(this._parseHelper.parse((_plus + this.ending)).getTestcases()).getTestblock().getDefine().getDirection().getOutput().getOutputVariables().get(1);
      final Procedure1<Variable> _function = (Variable it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it.getIdiom(), EisPackage.eINSTANCE.getVariableRef_Variable(), "a");
      };
      ObjectExtensions.<Variable>operator_doubleArrow(
        ((Variable) _get), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNullReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a ;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int b = a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      Variables _get = IterableExtensions.<Testcase>head(this._parseHelper.parse((_plus + this.ending)).getTestcases()).getTestblock().getDefine().getDirection().getOutput().getOutputVariables().get(1);
      final Procedure1<Variable> _function = (Variable it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariableRef(), EisValidator.NULL_REFERENCE);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<Variable>operator_doubleArrow(
        ((Variable) _get), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferenceWithWrongType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int a=19;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("bool b = a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      EisModel _parse = this._parseHelper.parse((_plus + this.ending));
      final Procedure1<EisModel> _function = (EisModel it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.INCOMPATIBLE_TYPES);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariantMismatch() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("variant int a = 0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("int b = a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _plus = (this.beginning + _builder);
      Variables _get = IterableExtensions.<Testcase>head(this._parseHelper.parse((_plus + this.ending)).getTestcases()).getTestblock().getDefine().getDirection().getOutput().getOutputVariables().get(1);
      final Procedure1<Variable> _function = (Variable it) -> {
        this._validationTestHelper.assertError(it, EisPackage.eINSTANCE.getVariable(), EisValidator.VARIANT_MISMATCH);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<Variable>operator_doubleArrow(
        ((Variable) _get), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReferencingUdts() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("define{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("input[]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("output[ ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("udt a(typeA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("variant int b = 69 +/- 666;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("typeA c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("]");
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
    Assert.assertEquals(expected.toString(), IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(this._iScopeProvider.getScope(context, reference).getAllElements(), _function), ", "));
  }
}
