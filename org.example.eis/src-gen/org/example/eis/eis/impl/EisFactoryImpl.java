/**
 * generated by Xtext 2.13.0
 */
package org.example.eis.eis.impl;

import org.eclipse.emf.ecore.EClass;
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
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
