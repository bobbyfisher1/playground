/**
 * generated by Xtext 2.14.0
 */
package org.example.eis.eis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.eis.eis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EisFactoryImpl extends EFactoryImpl implements EisFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EisFactory init()
  {
    try
    {
      EisFactory theEisFactory = (EisFactory)EPackage.Registry.INSTANCE.getEFactory(EisPackage.eNS_URI);
      if (theEisFactory != null)
      {
        return theEisFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EisFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EisFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EisPackage.EIS_MODEL: return createEisModel();
      case EisPackage.TESTCASE: return createTestcase();
      case EisPackage.TESTBLOCK: return createTestblock();
      case EisPackage.BOOL_CONSTANT: return createBoolConstant();
      case EisPackage.BLOCK_CONSTANT: return createBlockConstant();
      case EisPackage.DEFINE_BLOCK: return createDefineBlock();
      case EisPackage.DIRECTION_BLOCK: return createDirectionBlock();
      case EisPackage.INPUT: return createInput();
      case EisPackage.OUTPUT: return createOutput();
      case EisPackage.INOUT: return createInout();
      case EisPackage.VARIABLES: return createVariables();
      case EisPackage.VARIABLE: return createVariable();
      case EisPackage.UDT: return createUdt();
      case EisPackage.UDT_REF: return createUdtRef();
      case EisPackage.UDT_TYPE: return createUdtType();
      case EisPackage.IDIOM: return createIdiom();
      case EisPackage.EFLOAT: return createEFloat();
      case EisPackage.TESTSTEP_BLOCK: return createTeststepBlock();
      case EisPackage.ASSERTION_BLOCK: return createAssertionBlock();
      case EisPackage.SET: return createSet();
      case EisPackage.ASSERT: return createAssert();
      case EisPackage.STATEMENT: return createStatement();
      case EisPackage.CASCADE: return createCascade();
      case EisPackage.OR: return createOr();
      case EisPackage.AND: return createAnd();
      case EisPackage.EQUALITY: return createEquality();
      case EisPackage.COMPARISON: return createComparison();
      case EisPackage.PLUS: return createPlus();
      case EisPackage.MINUS: return createMinus();
      case EisPackage.MUL_OR_DIV: return createMulOrDiv();
      case EisPackage.NOT: return createNot();
      case EisPackage.INT_CONSTANT: return createIntConstant();
      case EisPackage.STRING_CONSTANT: return createStringConstant();
      case EisPackage.VARIABLE_REF: return createVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EisPackage.BASIC_TYPE:
        return createBasicTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EisPackage.BASIC_TYPE:
        return convertBasicTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EisModel createEisModel()
  {
    EisModelImpl eisModel = new EisModelImpl();
    return eisModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Testcase createTestcase()
  {
    TestcaseImpl testcase = new TestcaseImpl();
    return testcase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Testblock createTestblock()
  {
    TestblockImpl testblock = new TestblockImpl();
    return testblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockConstant createBlockConstant()
  {
    BlockConstantImpl blockConstant = new BlockConstantImpl();
    return blockConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefineBlock createDefineBlock()
  {
    DefineBlockImpl defineBlock = new DefineBlockImpl();
    return defineBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectionBlock createDirectionBlock()
  {
    DirectionBlockImpl directionBlock = new DirectionBlockImpl();
    return directionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inout createInout()
  {
    InoutImpl inout = new InoutImpl();
    return inout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables createVariables()
  {
    VariablesImpl variables = new VariablesImpl();
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Udt createUdt()
  {
    UdtImpl udt = new UdtImpl();
    return udt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UdtRef createUdtRef()
  {
    UdtRefImpl udtRef = new UdtRefImpl();
    return udtRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UdtType createUdtType()
  {
    UdtTypeImpl udtType = new UdtTypeImpl();
    return udtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Idiom createIdiom()
  {
    IdiomImpl idiom = new IdiomImpl();
    return idiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EFloat createEFloat()
  {
    EFloatImpl eFloat = new EFloatImpl();
    return eFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TeststepBlock createTeststepBlock()
  {
    TeststepBlockImpl teststepBlock = new TeststepBlockImpl();
    return teststepBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionBlock createAssertionBlock()
  {
    AssertionBlockImpl assertionBlock = new AssertionBlockImpl();
    return assertionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assert createAssert()
  {
    AssertImpl assert_ = new AssertImpl();
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cascade createCascade()
  {
    CascadeImpl cascade = new CascadeImpl();
    return cascade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicTypeFromString(EDataType eDataType, String initialValue)
  {
    BasicType result = BasicType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBasicTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EisPackage getEisPackage()
  {
    return (EisPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EisPackage getPackage()
  {
    return EisPackage.eINSTANCE;
  }

} //EisFactoryImpl
