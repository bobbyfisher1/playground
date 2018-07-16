/**
 * generated by Xtext 2.14.0
 */
package org.example.define.validation;

import com.google.common.base.Objects;
import com.google.common.collect.HashMultimap;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.define.define.And;
import org.example.define.define.BasicType;
import org.example.define.define.Comparison;
import org.example.define.define.DefinePackage;
import org.example.define.define.DirectionBlock;
import org.example.define.define.Equality;
import org.example.define.define.Idiom;
import org.example.define.define.Inout;
import org.example.define.define.Minus;
import org.example.define.define.MulOrDiv;
import org.example.define.define.Not;
import org.example.define.define.Or;
import org.example.define.define.Plus;
import org.example.define.define.Udt;
import org.example.define.define.UdtRef;
import org.example.define.define.Variable;
import org.example.define.define.VariableRef;
import org.example.define.define.Variables;
import org.example.define.define.impl.UdtImpl;
import org.example.define.define.impl.VariableImpl;
import org.example.define.typing.DefineType;
import org.example.define.typing.DefineTypeComputer;
import org.example.define.validation.AbstractDefineValidator;

@SuppressWarnings("all")
public class DefineValidator extends AbstractDefineValidator {
  protected final static String ISSUE_CODE_PREFIX = "org.example.entities.";
  
  public final static String MULTIPLE_VARIABLE_DECLARATION = (DefineValidator.ISSUE_CODE_PREFIX + "MultipleVariableDeclaration");
  
  public final static String MULTIPLE_UDT_DECLARATION = (DefineValidator.ISSUE_CODE_PREFIX + "MultipleUdtDeclaration");
  
  public final static String MISSING_VARIABLE_TYPE = (DefineValidator.ISSUE_CODE_PREFIX + "MissingVariableType");
  
  public final static String MULTIPLE_TYPE_DEFINITION = (DefineValidator.ISSUE_CODE_PREFIX + "MultipleTypeDefinition");
  
  public final static String INVALID_VARIANT_KEYWORD = (DefineValidator.ISSUE_CODE_PREFIX + "InvalidVariantKeyword");
  
  public final static String INVALID_COMMA_NOTATION = (DefineValidator.ISSUE_CODE_PREFIX + "InvalidCommaNotation");
  
  public final static String TYPE_MISMATCH = (DefineValidator.ISSUE_CODE_PREFIX + "TypeMismatch");
  
  public final static String INCOMPATIBLE_TYPES = (DefineValidator.ISSUE_CODE_PREFIX + "IncompatibleTypes");
  
  public final static String NULL_REFERENCE = (DefineValidator.ISSUE_CODE_PREFIX + "NullReference");
  
  public final static String MULTIPLE_UDT_TYPE = (DefineValidator.ISSUE_CODE_PREFIX + "MultipleUdtType");
  
  public final static String VARIANT_MISMATCH = (DefineValidator.ISSUE_CODE_PREFIX + "VariantMismatch");
  
  public final static String RECURSIVE_VARIABLE_REFERENCE = (DefineValidator.ISSUE_CODE_PREFIX + "RecursiveVariableReference");
  
  public final static String RECURSIVE_UDT_REFERENCE = (DefineValidator.ISSUE_CODE_PREFIX + "RecursiveUdtReference");
  
  @Inject
  @Extension
  private DefineTypeComputer _defineTypeComputer;
  
  @Check
  public void checkNoDuplicateVariablesIO(final DirectionBlock directionblock) {
    final EList<Variables> in = directionblock.getInput().getInputVariables();
    final EList<Variables> out = directionblock.getOutput().getOutputVariables();
    final HashMultimap<String, Variables> multiMap = HashMultimap.<String, Variables>create();
    for (final Variables e : in) {
      {
        this.checkVariableTypeAndAddToMap(e, multiMap);
        if ((e instanceof Udt)) {
          this.checkAllVariableNamesInUdtScope(((Udt)e));
        }
      }
    }
    for (final Variables e_1 : out) {
      {
        this.checkVariableTypeAndAddToMap(e_1, multiMap);
        if ((e_1 instanceof Udt)) {
          this.checkAllVariableNamesInUdtScope(((Udt)e_1));
        }
      }
    }
    Set<Map.Entry<String, Collection<Variables>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<Variables>> entry : _entrySet) {
      {
        final Collection<Variables> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Variables d : duplicates) {
            this.checkVariableTypeAndCallError(d);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicateVariablesIOInout(final DirectionBlock directionblock) {
    final EList<Variables> in = directionblock.getInput().getInputVariables();
    final EList<Variables> out = directionblock.getOutput().getOutputVariables();
    final EList<Variables> inout = directionblock.getInout().getInoutVariables();
    final HashMultimap<String, Variables> multiMap = HashMultimap.<String, Variables>create();
    for (final Variables e : in) {
      {
        this.checkVariableTypeAndAddToMap(e, multiMap);
        if ((e instanceof Udt)) {
          this.checkAllVariableNamesInUdtScope(((Udt)e));
        }
      }
    }
    for (final Variables e_1 : out) {
      {
        this.checkVariableTypeAndAddToMap(e_1, multiMap);
        if ((e_1 instanceof Udt)) {
          this.checkAllVariableNamesInUdtScope(((Udt)e_1));
        }
      }
    }
    for (final Variables e_2 : inout) {
      {
        this.checkVariableTypeAndAddToMap(e_2, multiMap);
        if ((e_2 instanceof Udt)) {
          this.checkAllVariableNamesInUdtScope(((Udt)e_2));
        }
      }
    }
    Set<Map.Entry<String, Collection<Variables>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<Variables>> entry : _entrySet) {
      {
        final Collection<Variables> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Variables d : duplicates) {
            this.checkVariableTypeAndCallError(d);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicateUdtTypesIO(final DirectionBlock directionblock) {
    HashMultimap<String, Udt> multiMap = HashMultimap.<String, Udt>create();
    final EList<Variables> in = directionblock.getInput().getInputVariables();
    final EList<Variables> out = directionblock.getOutput().getOutputVariables();
    for (final Variables e : in) {
      if ((e instanceof Udt)) {
        multiMap.put(((Udt)e).getUdtType().getName(), ((Udt)e));
        this.checkNoDuplicateUdtTypes(((Udt)e));
      }
    }
    for (final Variables e_1 : out) {
      if ((e_1 instanceof Udt)) {
        multiMap.put(((Udt)e_1).getUdtType().getName(), ((Udt)e_1));
        this.checkNoDuplicateUdtTypes(((Udt)e_1));
      }
    }
    Set<Map.Entry<String, Collection<Udt>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<Udt>> entry : _entrySet) {
      {
        final Collection<Udt> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Udt d : duplicates) {
            String _name = ((Udt) d).getUdtType().getName();
            String _plus = ("Multiple udtType \'" + _name);
            String _plus_1 = (_plus + "\'");
            this.error(_plus_1, d, DefinePackage.eINSTANCE.getUdt_UdtType(), 
              DefineValidator.MULTIPLE_UDT_TYPE);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicateUdtTypesIOInout(final DirectionBlock directionblock) {
    HashMultimap<String, Udt> multiMap = HashMultimap.<String, Udt>create();
    final EList<Variables> in = directionblock.getInput().getInputVariables();
    final EList<Variables> out = directionblock.getOutput().getOutputVariables();
    final EList<Variables> inout = directionblock.getInout().getInoutVariables();
    for (final Variables e : in) {
      if ((e instanceof Udt)) {
        multiMap.put(((Udt)e).getUdtType().getName(), ((Udt)e));
        this.checkNoDuplicateUdtTypes(((Udt)e));
      }
    }
    for (final Variables e_1 : out) {
      if ((e_1 instanceof Udt)) {
        multiMap.put(((Udt)e_1).getUdtType().getName(), ((Udt)e_1));
        this.checkNoDuplicateUdtTypes(((Udt)e_1));
      }
    }
    for (final Variables e_2 : inout) {
      if ((e_2 instanceof Udt)) {
        multiMap.put(((Udt)e_2).getUdtType().getName(), ((Udt)e_2));
        this.checkNoDuplicateUdtTypes(((Udt)e_2));
      }
    }
    Set<Map.Entry<String, Collection<Udt>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<Udt>> entry : _entrySet) {
      {
        final Collection<Udt> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Udt d : duplicates) {
            String _name = ((Udt) d).getUdtType().getName();
            String _plus = ("Multiple udtType \'" + _name);
            String _plus_1 = (_plus + "\'");
            this.error(_plus_1, d, DefinePackage.eINSTANCE.getUdt_UdtType(), 
              DefineValidator.MULTIPLE_UDT_TYPE);
          }
        }
      }
    }
  }
  
  @Check
  public void checkType(final Not not) {
    this.checkExpectedBoolean(not.getIdiom(), DefinePackage.Literals.NOT__IDIOM);
  }
  
  @Check
  public void checkType(final And and) {
    this.checkExpectedBoolean(and.getLeft(), DefinePackage.Literals.AND__LEFT);
    this.checkExpectedBoolean(and.getRight(), DefinePackage.Literals.AND__RIGHT);
  }
  
  @Check
  public void checkType(final Or or) {
    this.checkExpectedBoolean(or.getLeft(), DefinePackage.Literals.OR__LEFT);
    this.checkExpectedBoolean(or.getRight(), DefinePackage.Literals.OR__RIGHT);
  }
  
  @Check
  public void checkType(final Minus minus) {
    this.checkExpectedInt(minus.getLeft(), DefinePackage.Literals.MINUS__LEFT);
    this.checkExpectedInt(minus.getRight(), DefinePackage.Literals.MINUS__RIGHT);
  }
  
  @Check
  public void checkType(final MulOrDiv mulOrDiv) {
    this.checkExpectedInt(mulOrDiv.getLeft(), DefinePackage.Literals.MUL_OR_DIV__LEFT);
    this.checkExpectedInt(mulOrDiv.getRight(), DefinePackage.Literals.MUL_OR_DIV__RIGHT);
  }
  
  @Check
  public void checkType(final Equality equality) {
    final DefineType leftType = this.getTypeAndCheckNotNull(equality.getLeft(), DefinePackage.Literals.EQUALITY__LEFT);
    final DefineType rightType = this.getTypeAndCheckNotNull(equality.getRight(), DefinePackage.Literals.EQUALITY__RIGHT);
    this.checkExpectedSameType(leftType, rightType);
  }
  
  @Check
  public void checkType(final Comparison comparison) {
    final DefineType leftType = this.getTypeAndCheckNotNull(comparison.getLeft(), DefinePackage.Literals.COMPARISON__LEFT);
    final DefineType rightType = this.getTypeAndCheckNotNull(comparison.getRight(), DefinePackage.Literals.COMPARISON__RIGHT);
    this.checkExpectedSameType(leftType, rightType);
    this.checkNotBoolean(leftType, DefinePackage.Literals.COMPARISON__LEFT);
    this.checkNotBoolean(rightType, DefinePackage.Literals.COMPARISON__RIGHT);
  }
  
  @Check
  public void checkType(final Plus plus) {
    final DefineType leftType = this.getTypeAndCheckNotNull(plus.getLeft(), DefinePackage.Literals.PLUS__LEFT);
    final DefineType rightType = this.getTypeAndCheckNotNull(plus.getRight(), DefinePackage.Literals.PLUS__RIGHT);
    if (((this._defineTypeComputer.isIntType(leftType) || this._defineTypeComputer.isIntType(rightType)) || ((!this._defineTypeComputer.isStringType(leftType)) && (!this._defineTypeComputer.isStringType(rightType))))) {
      this.checkNotBoolean(leftType, DefinePackage.Literals.PLUS__LEFT);
      this.checkNotBoolean(rightType, DefinePackage.Literals.PLUS__RIGHT);
    }
  }
  
  @Check
  public void checkType(final Variable v) {
    Idiom _idiom = v.getIdiom();
    boolean _tripleNotEquals = (_idiom != null);
    if (_tripleNotEquals) {
      Idiom _idiom_1 = null;
      if (v!=null) {
        _idiom_1=v.getIdiom();
      }
      final DefineType actualType = this._defineTypeComputer.typeFor(_idiom_1);
      final DefineType expectedType = this._defineTypeComputer.typeFor(v.getVariableType());
      Idiom _range = null;
      if (v!=null) {
        _range=v.getRange();
      }
      DefineType _typeFor = null;
      if (_range!=null) {
        _typeFor=this._defineTypeComputer.typeFor(_range);
      }
      final DefineType rangeType = _typeFor;
      if (((expectedType == null) || (actualType == null))) {
        return;
      }
      boolean _notEquals = (!Objects.equal(expectedType, actualType));
      if (_notEquals) {
        String _string = expectedType.toString();
        String _plus = ("Incompatible types. Expected \'" + _string);
        String _plus_1 = (_plus + "\' but was \'");
        String _string_1 = actualType.toString();
        String _plus_2 = (_plus_1 + _string_1);
        String _plus_3 = (_plus_2 + 
          "\'");
        this.error(_plus_3, v, DefinePackage.eINSTANCE.getVariable_Idiom(), DefineValidator.INCOMPATIBLE_TYPES);
      }
      if (((rangeType != null) && (!Objects.equal(rangeType, actualType)))) {
        String _string_2 = expectedType.toString();
        String _plus_4 = ("Incompatible types. Expected \'" + _string_2);
        String _plus_5 = (_plus_4 + "\' but was \'");
        String _string_3 = rangeType.toString();
        String _plus_6 = (_plus_5 + _string_3);
        String _plus_7 = (_plus_6 + 
          "\'");
        this.error(_plus_7, v, DefinePackage.eINSTANCE.getVariable_Range(), DefineValidator.INCOMPATIBLE_TYPES);
      }
    }
  }
  
  @Check
  public void checkCommaSyntaxIO(final DirectionBlock directionblock) {
    final EList<Variables> in = directionblock.getInput().getInputVariables();
    final EList<Variables> out = directionblock.getOutput().getOutputVariables();
    boolean _isEmpty = in.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.checkCommaSyntaxWithVariables(in);
    }
    boolean _isEmpty_1 = out.isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      this.checkCommaSyntaxWithVariables(out);
    }
  }
  
  @Check
  public void checkCommaSyntaxIOInout(final Inout inouts) {
    final EList<Variables> inout = inouts.getInoutVariables();
    boolean _isEmpty = inout.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.checkCommaSyntaxWithVariables(inout);
    }
  }
  
  @Check
  public void checkNullVariableRefs(final VariableRef varRef) {
    Idiom _idiom = varRef.getVariable().getIdiom();
    boolean _tripleEquals = (_idiom == null);
    if (_tripleEquals) {
      String _name = varRef.getVariable().getName();
      String _plus = ("Referred variable \'" + _name);
      String _plus_1 = (_plus + "\' is null.");
      this.error(_plus_1, varRef, 
        DefinePackage.eINSTANCE.getVariableRef_Variable(), DefineValidator.NULL_REFERENCE);
    }
  }
  
  @Check
  public void checkVariantWithRefs(final VariableRef varRef) {
    final EObject variable = varRef.eContainer();
    boolean _isVariantKeyword = ((Variable) variable).isVariantKeyword();
    boolean _isVariantKeyword_1 = varRef.getVariable().isVariantKeyword();
    boolean _tripleNotEquals = (Boolean.valueOf(_isVariantKeyword) != Boolean.valueOf(_isVariantKeyword_1));
    if (_tripleNotEquals) {
      this.error("Both variables must be variant types.", variable, DefinePackage.eINSTANCE.getVariable_VariantKeyword(), 
        DefineValidator.VARIANT_MISMATCH);
    }
  }
  
  @Check
  public void checkUdtRefs(final UdtRef udtRef) {
    EList<Variables> ownUdtVars = udtRef.getUdtVariables();
    EObject _eContainer = udtRef.getUdtType().eContainer();
    final EList<Variables> referredUdtVars = ((Udt) _eContainer).getUdtVariables();
    int count = 0;
    ownUdtVars.clear();
    boolean _isEmpty = referredUdtVars.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (final Variables e : referredUdtVars) {
        {
          if ((e instanceof Variable)) {
            ownUdtVars.add(this.assignNewVariable(referredUdtVars, count));
          } else {
            if ((e instanceof Udt)) {
              ownUdtVars.add(this.assignNewUdt(referredUdtVars, count));
            } else {
              if ((e instanceof UdtRef)) {
                this.error("This reference cannot be made because the udt itself contains other references ", udtRef, 
                  DefinePackage.eINSTANCE.getUdtRef_UdtType(), DefineValidator.RECURSIVE_UDT_REFERENCE);
              }
            }
          }
          count++;
        }
      }
    }
  }
  
  private Udt assignNewUdt(final Iterable<? extends Variables> referredUdtVars, final int count) {
    UdtImpl newUdt = new UdtImpl();
    Variables _get = ((Variables[])Conversions.unwrapArray(referredUdtVars, Variables.class))[count];
    final Udt childRef = ((Udt) _get);
    final EList<Variables> childRefVars = childRef.getUdtVariables();
    int count2 = 0;
    newUdt.setName(childRef.getName());
    newUdt.setUdtType(childRef.getUdtType());
    boolean _isEmpty = childRefVars.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (final Variables e : childRefVars) {
        {
          if ((e instanceof Variable)) {
            newUdt.getUdtVariables().add(this.assignNewVariable(childRefVars, count2));
          } else {
            if ((e instanceof Udt)) {
              newUdt.getUdtVariables().add(this.assignNewUdt(childRefVars, count2));
            } else {
              if ((e instanceof UdtRef)) {
                this.error("This reference cannot be made because the udt itself contains other references ", ((UdtRef) e), DefinePackage.eINSTANCE.getUdtRef_UdtType(), DefineValidator.RECURSIVE_UDT_REFERENCE);
              }
            }
          }
          count2++;
        }
      }
    }
    return newUdt;
  }
  
  private Variable assignNewVariable(final Iterable<? extends Variables> referredUdtVars, final int count) {
    VariableImpl newVariable = new VariableImpl();
    Variables _get = ((Variables[])Conversions.unwrapArray(referredUdtVars, Variables.class))[count];
    final Variable variable = ((Variable) _get);
    newVariable.setName(variable.getName());
    newVariable.setVariableType(variable.getVariableType());
    newVariable.setVariantKeyword(variable.isVariantKeyword());
    newVariable.setNextVariable(variable.isNextVariable());
    if (((variable.getIdiom() instanceof VariableRef) || (variable.getRange() instanceof VariableRef))) {
      this.error("This reference cannot be made because a variable contains other references ", 
        DefinePackage.eINSTANCE.getUdtRef_UdtType(), DefineValidator.RECURSIVE_VARIABLE_REFERENCE);
    } else {
      newVariable.setIdiom(variable.getIdiom());
      newVariable.setRange(variable.getRange());
    }
    return newVariable;
  }
  
  private boolean checkVariableTypeAndAddToMap(final Variables e, final HashMultimap<String, Variables> multiMap) {
    boolean _xifexpression = false;
    if ((e instanceof Udt)) {
      _xifexpression = multiMap.put(((Udt)e).getName(), e);
    } else {
      boolean _xifexpression_1 = false;
      if ((e instanceof Variable)) {
        _xifexpression_1 = multiMap.put(((Variable)e).getName(), e);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private void checkAllVariableNamesInUdtScope(final Udt udt) {
    final HashMultimap<String, Variables> newMultimap = HashMultimap.<String, Variables>create();
    final EList<Variables> udts = udt.getUdtVariables();
    for (final Variables e : udts) {
      {
        this.checkVariableTypeAndAddToMap(e, newMultimap);
        if ((e instanceof Udt)) {
          this.checkAllVariableNamesInUdtScope(((Udt)e));
        }
      }
    }
    Set<Map.Entry<String, Collection<Variables>>> _entrySet = newMultimap.asMap().entrySet();
    for (final Map.Entry<String, Collection<Variables>> entry : _entrySet) {
      {
        final Collection<Variables> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Variables d : duplicates) {
            this.checkVariableTypeAndCallError(d);
          }
        }
      }
    }
  }
  
  private void checkVariableTypeAndCallError(final Variables e) {
    if ((e instanceof Udt)) {
      String _name = ((Udt)e).getName();
      String _plus = ("Multiple variable name \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.error(_plus_1, e, DefinePackage.eINSTANCE.getVariables_Name(), 
        DefineValidator.MULTIPLE_UDT_DECLARATION);
    } else {
      if ((e instanceof Variable)) {
        String _name_1 = ((Variable)e).getName();
        String _plus_2 = ("Multiple variable name \'" + _name_1);
        String _plus_3 = (_plus_2 + "\'");
        this.error(_plus_3, e, DefinePackage.eINSTANCE.getVariables_Name(), 
          DefineValidator.MULTIPLE_VARIABLE_DECLARATION);
      }
    }
  }
  
  private void checkExpectedBoolean(final Idiom exp, final EReference reference) {
    this.checkExpectedType(exp, DefineTypeComputer.BOOL_TYPE, reference);
  }
  
  private void checkExpectedInt(final Idiom exp, final EReference reference) {
    this.checkExpectedType(exp, DefineTypeComputer.INT_TYPE, reference);
  }
  
  private void checkExpectedType(final Idiom exp, final DefineType expectedType, final EReference reference) {
    final DefineType actualType = this.getTypeAndCheckNotNull(exp, reference);
    boolean _notEquals = (!Objects.equal(actualType, expectedType));
    if (_notEquals) {
      this.error(((("expected " + expectedType) + " type, but was ") + actualType), reference, DefineValidator.TYPE_MISMATCH);
    }
  }
  
  private DefineType getTypeAndCheckNotNull(final Idiom exp, final EReference reference) {
    DefineType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._defineTypeComputer.typeFor(exp);
    }
    DefineType type = _typeFor;
    if ((type == null)) {
      this.error("null type", reference, DefineValidator.TYPE_MISMATCH);
    }
    return type;
  }
  
  private void checkExpectedSameType(final DefineType left, final DefineType right) {
    if ((((right != null) && (left != null)) && (!Objects.equal(right, left)))) {
      this.error(((("expected the same type, but was " + left) + ", ") + right), 
        DefinePackage.Literals.EQUALITY.getEIDAttribute(), DefineValidator.TYPE_MISMATCH);
    }
  }
  
  private void checkNotBoolean(final DefineType type, final EReference reference) {
    boolean _isBoolType = this._defineTypeComputer.isBoolType(type);
    if (_isBoolType) {
      this.error("cannot be boolean", reference, DefineValidator.TYPE_MISMATCH);
    }
  }
  
  public void checkNoDuplicateUdtTypes(final Udt udt) {
    HashMultimap<String, Udt> multiMap = HashMultimap.<String, Udt>create();
    final EList<Variables> udts = udt.getUdtVariables();
    for (final Variables e : udts) {
      if ((e instanceof Udt)) {
        multiMap.put(((Udt)e).getUdtType().getName(), ((Udt)e));
        this.checkNoDuplicateUdtTypes(((Udt)e));
      }
    }
  }
  
  private void checkCommaSyntaxWithVariables(final Iterable<? extends Variables> variables) {
    int count = 0;
    int countOfVariableBefore = 0;
    boolean commaBeforeVariable = false;
    BasicType helpingVariableType = BasicType.NULL;
    boolean variantKeyword = false;
    for (final Variables e : variables) {
      {
        if ((e instanceof Udt)) {
          boolean _isEmpty = ((Udt)e).getUdtVariables().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            this.checkCommaSyntaxWithVariables(((Udt)e).getUdtVariables());
          }
        }
        if ((commaBeforeVariable && (!(e instanceof Variable)))) {
          this.error("Invalid comma. Semicolon expected.", ((EObject[])Conversions.unwrapArray(variables, EObject.class))[countOfVariableBefore], 
            DefinePackage.eINSTANCE.getVariable_NextVariable(), DefineValidator.INVALID_COMMA_NOTATION);
        }
        if ((e instanceof Variable)) {
          if (((count - countOfVariableBefore) > 1)) {
            commaBeforeVariable = false;
          }
          if ((!commaBeforeVariable)) {
            BasicType _variableType = ((Variable)e).getVariableType();
            boolean _tripleEquals = (_variableType == BasicType.NULL);
            if (_tripleEquals) {
              this.error("Missing variable type", e, DefinePackage.eINSTANCE.getVariable_VariableType(), 
                DefineValidator.MISSING_VARIABLE_TYPE);
            }
          } else {
            BasicType _variableType_1 = ((Variable)e).getVariableType();
            boolean _tripleEquals_1 = (_variableType_1 == BasicType.NULL);
            if (_tripleEquals_1) {
              ((Variable)e).setVariableType(helpingVariableType);
            } else {
              this.error("Multiple type definition", e, DefinePackage.eINSTANCE.getVariable_VariableType(), 
                DefineValidator.MULTIPLE_TYPE_DEFINITION);
            }
            ((Variable)e).setVariantKeyword(variantKeyword);
          }
          boolean _isNextVariable = ((Variable)e).isNextVariable();
          if (_isNextVariable) {
            commaBeforeVariable = true;
            countOfVariableBefore = count;
            helpingVariableType = ((Variable)e).getVariableType();
          } else {
            commaBeforeVariable = false;
            helpingVariableType = null;
          }
          variantKeyword = ((Variable)e).isVariantKeyword();
        }
        count++;
      }
    }
    final Variables last = IterableExtensions.last(variables);
    if ((last instanceof Variable)) {
      boolean _isNextVariable = ((Variable)last).isNextVariable();
      if (_isNextVariable) {
        this.error("Invalid comma. Semicolon expected.", last, DefinePackage.eINSTANCE.getVariable_NextVariable(), 
          DefineValidator.INVALID_COMMA_NOTATION);
      }
    }
  }
  
  @Check
  public void checkUppercaseVariantName() {
  }
  
  @Check
  public void checkUppercaseUdtName() {
  }
  
  @Check
  public void checkLowercaseUdtType() {
  }
}
