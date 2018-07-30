/**
 * generated by Xtext 2.12.0
 */
package org.example.eis.validation;

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
import org.example.eis.eis.And;
import org.example.eis.eis.Assert;
import org.example.eis.eis.BasicType;
import org.example.eis.eis.Cascade;
import org.example.eis.eis.Comparison;
import org.example.eis.eis.DirectionBlock;
import org.example.eis.eis.EisPackage;
import org.example.eis.eis.Equality;
import org.example.eis.eis.Idiom;
import org.example.eis.eis.Inout;
import org.example.eis.eis.Minus;
import org.example.eis.eis.MulOrDiv;
import org.example.eis.eis.Not;
import org.example.eis.eis.Or;
import org.example.eis.eis.Plus;
import org.example.eis.eis.Statement;
import org.example.eis.eis.Udt;
import org.example.eis.eis.UdtRef;
import org.example.eis.eis.Variable;
import org.example.eis.eis.VariableRef;
import org.example.eis.eis.Variables;
import org.example.eis.eis.impl.UdtImpl;
import org.example.eis.eis.impl.VariableImpl;
import org.example.eis.typing.DefineType;
import org.example.eis.typing.DefineTypeComputer;
import org.example.eis.validation.AbstractEisValidator;

@SuppressWarnings("all")
public class EisValidator extends AbstractEisValidator {
  protected final static String ISSUE_CODE_PREFIX = "org.example.entities.";
  
  public final static String MULTIPLE_VARIABLE_DECLARATION = (EisValidator.ISSUE_CODE_PREFIX + "MultipleVariableDeclaration");
  
  public final static String MULTIPLE_UDT_DECLARATION = (EisValidator.ISSUE_CODE_PREFIX + "MultipleUdtDeclaration");
  
  public final static String MISSING_VARIABLE_TYPE = (EisValidator.ISSUE_CODE_PREFIX + "MissingVariableType");
  
  public final static String MULTIPLE_TYPE_DEFINITION = (EisValidator.ISSUE_CODE_PREFIX + "MultipleTypeDefinition");
  
  public final static String INVALID_VARIANT_KEYWORD = (EisValidator.ISSUE_CODE_PREFIX + "InvalidVariantKeyword");
  
  public final static String INVALID_COMMA_NOTATION = (EisValidator.ISSUE_CODE_PREFIX + "InvalidCommaNotation");
  
  public final static String TYPE_MISMATCH = (EisValidator.ISSUE_CODE_PREFIX + "TypeMismatch");
  
  public final static String INCOMPATIBLE_TYPES = (EisValidator.ISSUE_CODE_PREFIX + "IncompatibleTypes");
  
  public final static String NULL_REFERENCE = (EisValidator.ISSUE_CODE_PREFIX + "NullReference");
  
  public final static String MULTIPLE_UDT_TYPE = (EisValidator.ISSUE_CODE_PREFIX + "MultipleUdtType");
  
  public final static String VARIANT_MISMATCH = (EisValidator.ISSUE_CODE_PREFIX + "VariantMismatch");
  
  public final static String RECURSIVE_VARIABLE_REFERENCE = (EisValidator.ISSUE_CODE_PREFIX + "RecursiveVariableReference");
  
  public final static String RECURSIVE_UDT_REFERENCE = (EisValidator.ISSUE_CODE_PREFIX + "RecursiveUdtReference");
  
  public final static String MULTIPLE_STATEMENT_ASSIGNMENT = (EisValidator.ISSUE_CODE_PREFIX + "MultipleStatementAssignment");
  
  public final static String MISSING_UDT_REFERENCE = (EisValidator.ISSUE_CODE_PREFIX + "MissingUdtReference");
  
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
            this.error(_plus_1, d, EisPackage.eINSTANCE.getUdt_UdtType(), 
              EisValidator.MULTIPLE_UDT_TYPE);
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
            this.error(_plus_1, d, EisPackage.eINSTANCE.getUdt_UdtType(), 
              EisValidator.MULTIPLE_UDT_TYPE);
          }
        }
      }
    }
  }
  
  @Check
  public void checkType(final Not not) {
    this.checkExpectedBoolean(not.getIdiom(), EisPackage.Literals.NOT__IDIOM);
  }
  
  @Check
  public void checkType(final And and) {
    this.checkExpectedBoolean(and.getLeft(), EisPackage.Literals.AND__LEFT);
    this.checkExpectedBoolean(and.getRight(), EisPackage.Literals.AND__RIGHT);
  }
  
  @Check
  public void checkType(final Or or) {
    this.checkExpectedBoolean(or.getLeft(), EisPackage.Literals.OR__LEFT);
    this.checkExpectedBoolean(or.getRight(), EisPackage.Literals.OR__RIGHT);
  }
  
  @Check
  public void checkType(final Minus minus) {
    this.checkExpectedInt(minus.getLeft(), EisPackage.Literals.MINUS__LEFT);
    this.checkExpectedInt(minus.getRight(), EisPackage.Literals.MINUS__RIGHT);
  }
  
  @Check
  public void checkType(final MulOrDiv mulOrDiv) {
    this.checkExpectedInt(mulOrDiv.getLeft(), EisPackage.Literals.MUL_OR_DIV__LEFT);
    this.checkExpectedInt(mulOrDiv.getRight(), EisPackage.Literals.MUL_OR_DIV__RIGHT);
  }
  
  @Check
  public void checkType(final Equality equality) {
    final DefineType leftType = this.getTypeAndCheckNotNull(equality.getLeft(), EisPackage.Literals.EQUALITY__LEFT);
    final DefineType rightType = this.getTypeAndCheckNotNull(equality.getRight(), EisPackage.Literals.EQUALITY__RIGHT);
    this.checkExpectedSameType(leftType, rightType);
  }
  
  @Check
  public void checkType(final Comparison comparison) {
    final DefineType leftType = this.getTypeAndCheckNotNull(comparison.getLeft(), EisPackage.Literals.COMPARISON__LEFT);
    final DefineType rightType = this.getTypeAndCheckNotNull(comparison.getRight(), EisPackage.Literals.COMPARISON__RIGHT);
    this.checkExpectedSameType(leftType, rightType);
    this.checkNotBoolean(leftType, EisPackage.Literals.COMPARISON__LEFT);
    this.checkNotBoolean(rightType, EisPackage.Literals.COMPARISON__RIGHT);
  }
  
  @Check
  public void checkType(final Plus plus) {
    final DefineType leftType = this.getTypeAndCheckNotNull(plus.getLeft(), EisPackage.Literals.PLUS__LEFT);
    final DefineType rightType = this.getTypeAndCheckNotNull(plus.getRight(), EisPackage.Literals.PLUS__RIGHT);
    if (((this._defineTypeComputer.isIntType(leftType) || this._defineTypeComputer.isIntType(rightType)) || ((!this._defineTypeComputer.isStringType(leftType)) && (!this._defineTypeComputer.isStringType(rightType))))) {
      this.checkNotBoolean(leftType, EisPackage.Literals.PLUS__LEFT);
      this.checkNotBoolean(rightType, EisPackage.Literals.PLUS__RIGHT);
    }
  }
  
  @Check
  public void checkType(final Variable variable) {
    Idiom _idiom = variable.getIdiom();
    boolean _tripleNotEquals = (_idiom != null);
    if (_tripleNotEquals) {
      final DefineType expectedType = this._defineTypeComputer.typeFor(variable.getVariableType());
      Idiom _idiom_1 = null;
      if (variable!=null) {
        _idiom_1=variable.getIdiom();
      }
      final DefineType actualType = this._defineTypeComputer.typeFor(_idiom_1);
      Idiom _range = null;
      if (variable!=null) {
        _range=variable.getRange();
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
        this.error(_plus_3, variable, EisPackage.eINSTANCE.getVariable_Idiom(), EisValidator.INCOMPATIBLE_TYPES);
      }
      if (((rangeType != null) && (!Objects.equal(rangeType, expectedType)))) {
        String _string_2 = expectedType.toString();
        String _plus_4 = ("Incompatible types. Expected \'" + _string_2);
        String _plus_5 = (_plus_4 + "\' but was \'");
        String _string_3 = rangeType.toString();
        String _plus_6 = (_plus_5 + _string_3);
        String _plus_7 = (_plus_6 + 
          "\'");
        this.error(_plus_7, variable, EisPackage.eINSTANCE.getVariable_Range(), EisValidator.INCOMPATIBLE_TYPES);
      }
    }
  }
  
  @Check
  public void checkType(final Statement statement) {
    final EList<Cascade> cascade = statement.getCascade();
    final Variables variable = statement.getVariable();
    Cascade _last = null;
    if (cascade!=null) {
      _last=IterableExtensions.<Cascade>last(cascade);
    }
    Variables _udtVar = null;
    if (_last!=null) {
      _udtVar=_last.getUdtVar();
    }
    final Variables last = _udtVar;
    final DefineType actualType = this._defineTypeComputer.typeFor(statement.getIdiom());
    Idiom _range = null;
    if (statement!=null) {
      _range=statement.getRange();
    }
    DefineType _typeFor = null;
    if (_range!=null) {
      _typeFor=this._defineTypeComputer.typeFor(_range);
    }
    final DefineType rangeType = _typeFor;
    BasicType expectedType = BasicType.NULL;
    if ((variable instanceof Variable)) {
      expectedType = ((Variable) variable).getVariableType();
      this.compareTypesAndCallError(statement, actualType, expectedType, rangeType);
    } else {
      if ((last instanceof Variable)) {
        expectedType = ((Variable)last).getVariableType();
        this.compareTypesAndCallError(statement, actualType, expectedType, rangeType);
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
        EisPackage.eINSTANCE.getVariableRef_Variable(), EisValidator.NULL_REFERENCE);
    }
  }
  
  @Check
  public void checkVariantWithRefs(final VariableRef varRef) {
    final EObject variable = varRef.eContainer();
    boolean _isVariantKeyword = ((Variable) variable).isVariantKeyword();
    boolean _isVariantKeyword_1 = varRef.getVariable().isVariantKeyword();
    boolean _tripleNotEquals = (Boolean.valueOf(_isVariantKeyword) != Boolean.valueOf(_isVariantKeyword_1));
    if (_tripleNotEquals) {
      this.error("Both variables must be variant types.", variable, EisPackage.eINSTANCE.getVariable_VariantKeyword(), 
        EisValidator.VARIANT_MISMATCH);
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
                  EisPackage.eINSTANCE.getUdtRef_UdtType(), EisValidator.RECURSIVE_UDT_REFERENCE);
              }
            }
          }
          count++;
        }
      }
    }
  }
  
  @Check
  public void checkUdtStatements(final Statement statement) {
    if (((!(statement.getVariable() instanceof Variable)) && statement.getCascade().isEmpty())) {
      this.error("Only variables can be assigned to values", statement, EisPackage.eINSTANCE.getStatement_Variable(), 
        EisValidator.MISSING_UDT_REFERENCE);
    }
    final EList<Cascade> cascade = statement.getCascade();
    for (final Cascade c : cascade) {
      if (((!(c.getUdtVar() instanceof Variable)) && (c == IterableExtensions.<Cascade>last(cascade)))) {
        this.error("Only variables can be assigned to values", statement, EisPackage.eINSTANCE.getStatement_Cascade(), 
          EisValidator.MISSING_UDT_REFERENCE);
      }
    }
  }
  
  @Check
  public void checkMultipleStatementsSetBlock(final org.example.eis.eis.Set sets) {
    final EList<Statement> set = sets.getSetVariables();
    final HashMultimap<Object, Statement> multiMap = HashMultimap.<Object, Statement>create();
    Statement _head = null;
    if (set!=null) {
      _head=IterableExtensions.<Statement>head(set);
    }
    Variables _variable = null;
    if (_head!=null) {
      _variable=_head.getVariable();
    }
    String _string = null;
    if (_variable!=null) {
      _string=_variable.toString();
    }
    String name = _string;
    for (final Statement e : set) {
      boolean _isEmpty = e.getCascade().isEmpty();
      if (_isEmpty) {
        multiMap.put(e.getVariable(), e);
      } else {
        name = e.getVariable().toString();
        EList<Cascade> _cascade = e.getCascade();
        for (final Cascade c : _cascade) {
          String _name = name;
          String _string_1 = c.getUdtVar().toString();
          name = (_name + _string_1);
        }
        multiMap.put(name, e);
      }
    }
    Set<Map.Entry<Object, Collection<Statement>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<Object, Collection<Statement>> entry : _entrySet) {
      {
        final Collection<Statement> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Statement d : duplicates) {
            boolean _isEmpty_1 = d.getCascade().isEmpty();
            if (_isEmpty_1) {
              this.error("Multiple variable assignment", d, EisPackage.eINSTANCE.getStatement_Variable(), 
                EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
            } else {
              this.error("Multiple variable assignment", d, EisPackage.eINSTANCE.getStatement_Variable(), 
                EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
              this.error("Multiple variable assignment", d, EisPackage.eINSTANCE.getStatement_Cascade(), 
                EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkMultipleStatementsAssertBlock(final Assert asserts) {
    final EList<Statement> assert_ = asserts.getAssertVariables();
    final HashMultimap<Object, Statement> multiMap = HashMultimap.<Object, Statement>create();
    Statement _head = null;
    if (assert_!=null) {
      _head=IterableExtensions.<Statement>head(assert_);
    }
    Variables _variable = null;
    if (_head!=null) {
      _variable=_head.getVariable();
    }
    String _string = null;
    if (_variable!=null) {
      _string=_variable.toString();
    }
    String name = _string;
    for (final Statement e : assert_) {
      boolean _isEmpty = e.getCascade().isEmpty();
      if (_isEmpty) {
        multiMap.put(e.getVariable(), e);
      } else {
        name = e.getVariable().toString();
        EList<Cascade> _cascade = e.getCascade();
        for (final Cascade c : _cascade) {
          String _name = name;
          String _string_1 = c.getUdtVar().toString();
          name = (_name + _string_1);
        }
        multiMap.put(name, e);
      }
    }
    Set<Map.Entry<Object, Collection<Statement>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<Object, Collection<Statement>> entry : _entrySet) {
      {
        final Collection<Statement> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final Statement d : duplicates) {
            boolean _isEmpty_1 = d.getCascade().isEmpty();
            if (_isEmpty_1) {
              this.error("Multiple variable assignment", d, EisPackage.eINSTANCE.getStatement_Variable(), 
                EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
            } else {
              this.error("Multiple variable assignment", d, EisPackage.eINSTANCE.getStatement_Variable(), 
                EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
              this.error("Multiple variable assignment", d, EisPackage.eINSTANCE.getStatement_Cascade(), 
                EisValidator.MULTIPLE_STATEMENT_ASSIGNMENT);
            }
          }
        }
      }
    }
  }
  
  private void checkVariableTypeAndAddToMap(final Variables e, final HashMultimap<String, Variables> multiMap) {
    if ((e instanceof Udt)) {
      multiMap.put(((Udt)e).getName(), e);
    } else {
      if ((e instanceof Variable)) {
        multiMap.put(((Variable)e).getName(), e);
      }
    }
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
      this.error(_plus_1, e, EisPackage.eINSTANCE.getVariables_Name(), 
        EisValidator.MULTIPLE_UDT_DECLARATION);
    } else {
      if ((e instanceof Variable)) {
        String _name_1 = ((Variable)e).getName();
        String _plus_2 = ("Multiple variable name \'" + _name_1);
        String _plus_3 = (_plus_2 + "\'");
        this.error(_plus_3, e, EisPackage.eINSTANCE.getVariables_Name(), 
          EisValidator.MULTIPLE_VARIABLE_DECLARATION);
      }
    }
  }
  
  private void checkNoDuplicateUdtTypes(final Udt udt) {
    HashMultimap<String, Udt> multiMap = HashMultimap.<String, Udt>create();
    final EList<Variables> udts = udt.getUdtVariables();
    for (final Variables e : udts) {
      if ((e instanceof Udt)) {
        multiMap.put(((Udt)e).getUdtType().getName(), ((Udt)e));
        this.checkNoDuplicateUdtTypes(((Udt)e));
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
      this.error(((("expected " + expectedType) + " type, but was ") + actualType), reference, EisValidator.TYPE_MISMATCH);
    }
  }
  
  private DefineType getTypeAndCheckNotNull(final Idiom exp, final EReference reference) {
    DefineType _typeFor = null;
    if (exp!=null) {
      _typeFor=this._defineTypeComputer.typeFor(exp);
    }
    DefineType type = _typeFor;
    if ((type == null)) {
      this.error("null type", reference, EisValidator.TYPE_MISMATCH);
    }
    return type;
  }
  
  private void checkExpectedSameType(final DefineType left, final DefineType right) {
    if ((((right != null) && (left != null)) && (!Objects.equal(right, left)))) {
      this.error(((("expected the same type, but was " + left) + ", ") + right), EisPackage.Literals.EQUALITY.getEIDAttribute(), 
        EisValidator.TYPE_MISMATCH);
    }
  }
  
  private void checkNotBoolean(final DefineType type, final EReference reference) {
    boolean _isBoolType = this._defineTypeComputer.isBoolType(type);
    if (_isBoolType) {
      this.error("cannot be boolean", reference, EisValidator.TYPE_MISMATCH);
    }
  }
  
  private void compareTypesAndCallError(final Statement statement, final DefineType actualType, final BasicType expectedType, final DefineType rangeType) {
    DefineType _typeFor = this._defineTypeComputer.typeFor(expectedType);
    boolean _notEquals = (!Objects.equal(actualType, _typeFor));
    if (_notEquals) {
      String _string = expectedType.toString();
      String _plus = ("Incompatible types. Expected \'" + _string);
      String _plus_1 = (_plus + "\' but was \'");
      String _string_1 = actualType.toString();
      String _plus_2 = (_plus_1 + _string_1);
      String _plus_3 = (_plus_2 + "\'");
      this.error(_plus_3, statement, EisPackage.eINSTANCE.getStatement_Idiom(), EisValidator.INCOMPATIBLE_TYPES);
    }
    if (((rangeType != null) && (!Objects.equal(rangeType, this._defineTypeComputer.typeFor(expectedType))))) {
      String _string_2 = expectedType.toString();
      String _plus_4 = ("Incompatible types. Expected \'" + _string_2);
      String _plus_5 = (_plus_4 + "\' but was \'");
      String _string_3 = rangeType.toString();
      String _plus_6 = (_plus_5 + _string_3);
      String _plus_7 = (_plus_6 + "\'");
      this.error(_plus_7, statement, EisPackage.eINSTANCE.getStatement_Range(), EisValidator.INCOMPATIBLE_TYPES);
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
            EisPackage.eINSTANCE.getVariable_NextVariable(), EisValidator.INVALID_COMMA_NOTATION);
        }
        if ((e instanceof Variable)) {
          if (((count - countOfVariableBefore) > 1)) {
            commaBeforeVariable = false;
          }
          if ((!commaBeforeVariable)) {
            BasicType _variableType = ((Variable)e).getVariableType();
            boolean _tripleEquals = (_variableType == BasicType.NULL);
            if (_tripleEquals) {
              this.error("Missing variable type", e, EisPackage.eINSTANCE.getVariable_VariableType(), 
                EisValidator.MISSING_VARIABLE_TYPE);
            }
          } else {
            BasicType _variableType_1 = ((Variable)e).getVariableType();
            boolean _tripleEquals_1 = (_variableType_1 == BasicType.NULL);
            if (_tripleEquals_1) {
              ((Variable)e).setVariableType(helpingVariableType);
            } else {
              BasicType _variableType_2 = ((Variable)e).getVariableType();
              boolean _tripleNotEquals = (helpingVariableType != _variableType_2);
              if (_tripleNotEquals) {
                this.error("Multiple type definition", e, EisPackage.eINSTANCE.getVariable_VariableType(), 
                  EisValidator.MULTIPLE_TYPE_DEFINITION);
              }
            }
            if ((((Variable)e).isVariantKeyword() && (!variantKeyword))) {
              this.error("Invalid variant keyword", e, EisPackage.eINSTANCE.getVariable_VariantKeyword(), 
                EisValidator.INVALID_VARIANT_KEYWORD);
            } else {
              ((Variable)e).setVariantKeyword(variantKeyword);
            }
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
        this.error("Invalid comma. Semicolon expected.", last, EisPackage.eINSTANCE.getVariable_NextVariable(), 
          EisValidator.INVALID_COMMA_NOTATION);
      }
    }
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
        EisPackage.eINSTANCE.getUdtRef_UdtType(), EisValidator.RECURSIVE_VARIABLE_REFERENCE);
    } else {
      newVariable.setIdiom(variable.getIdiom());
      newVariable.setRange(variable.getRange());
    }
    return newVariable;
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
                this.error("This reference cannot be made because the udt itself contains other references ", ((UdtRef) e), EisPackage.eINSTANCE.getUdtRef_UdtType(), EisValidator.RECURSIVE_UDT_REFERENCE);
              }
            }
          }
          count2++;
        }
      }
    }
    return newUdt;
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
