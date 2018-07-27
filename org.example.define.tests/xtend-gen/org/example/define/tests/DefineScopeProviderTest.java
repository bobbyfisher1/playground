package org.example.define.tests;

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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.Input;
import org.example.define.define.Udt;
import org.example.define.define.UdtRef;
import org.example.define.define.Variable;
import org.example.define.define.Variables;
import org.example.define.tests.DefineInjectorProvider;
import org.example.define.validation.DefineValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DefineInjectorProvider.class)
@SuppressWarnings("all")
public class DefineScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<DefineBlock> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
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
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertNoErrors(it);
        EList<Variables> _inputVariables = it.getDirection().getInput().getInputVariables();
        final Procedure1<EList<Variables>> _function_1 = (EList<Variables> it_1) -> {
          Variables _get = it_1.get(2);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            this.assertScope(it_2.getIdiom(), DefinePackage.eINSTANCE.getVariableRef_Variable(), "a");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(
            ((Variable) _get), _function_2);
          Variables _get_1 = it_1.get(4);
          final Procedure1<UdtRef> _function_3 = (UdtRef it_2) -> {
            this.assertScope(it_2, DefinePackage.eINSTANCE.getUdtRef_UdtType(), "typeB, typeD");
          };
          ObjectExtensions.<UdtRef>operator_doubleArrow(
            ((UdtRef) _get_1), _function_3);
        };
        ObjectExtensions.<EList<Variables>>operator_doubleArrow(_inputVariables, _function_1);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      Input _input = this._parseHelper.parse(_builder).getDirection().getInput();
      final Procedure1<Input> _function = (Input it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it, DefinePackage.eINSTANCE.getUdtRef_UdtType(), "typeB, typeD");
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
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertNoErrors(it);
        Variables _head = IterableExtensions.<Variables>head(it.getDirection().getInput().getInputVariables());
        final Procedure1<Udt> _function_1 = (Udt it_1) -> {
          Variables _get = it_1.getUdtVariables().get(2);
          final Procedure1<Variable> _function_2 = (Variable it_2) -> {
            this.assertScope(it_2, DefinePackage.eINSTANCE.getVariableRef_Variable(), "a");
          };
          ObjectExtensions.<Variable>operator_doubleArrow(
            ((Variable) _get), _function_2);
          Variables _get_1 = it_1.getUdtVariables().get(3);
          final Procedure1<UdtRef> _function_3 = (UdtRef it_2) -> {
            this.assertScope(it_2, DefinePackage.eINSTANCE.getUdtRef_UdtType(), "typeB");
          };
          ObjectExtensions.<UdtRef>operator_doubleArrow(
            ((UdtRef) _get_1), _function_3);
          Variables _get_2 = it_1.getUdtVariables().get(4);
          final Procedure1<Udt> _function_4 = (Udt it_2) -> {
            Variables _get_3 = it_2.getUdtVariables().get(2);
            final Procedure1<Variable> _function_5 = (Variable it_3) -> {
              this.assertScope(it_3, DefinePackage.eINSTANCE.getVariableRef_Variable(), "A");
            };
            ObjectExtensions.<Variable>operator_doubleArrow(
              ((Variable) _get_3), _function_5);
            Variables _get_4 = it_2.getUdtVariables().get(3);
            final Procedure1<UdtRef> _function_6 = (UdtRef it_3) -> {
              this.assertScope(it_3, DefinePackage.eINSTANCE.getUdtRef_UdtType(), "typeBB");
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
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      Variables _get = this._parseHelper.parse(_builder).getDirection().getOutput().getOutputVariables().get(1);
      final Procedure1<Variable> _function = (Variable it) -> {
        this._validationTestHelper.assertNoErrors(it);
        this.assertScope(it.getIdiom(), DefinePackage.eINSTANCE.getVariableRef_Variable(), "a");
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
      Variables _get = this._parseHelper.parse(_builder).getDirection().getOutput().getOutputVariables().get(1);
      final Procedure1<Variable> _function = (Variable it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariableRef(), DefineValidator.NULL_REFERENCE);
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
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.INCOMPATIBLE_TYPES);
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
      Variables _get = this._parseHelper.parse(_builder).getDirection().getOutput().getOutputVariables().get(1);
      final Procedure1<Variable> _function = (Variable it) -> {
        this._validationTestHelper.assertError(it, DefinePackage.eINSTANCE.getVariable(), DefineValidator.VARIANT_MISMATCH);
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
      DefineBlock _parse = this._parseHelper.parse(_builder);
      final Procedure1<DefineBlock> _function = (DefineBlock it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<DefineBlock>operator_doubleArrow(_parse, _function);
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
