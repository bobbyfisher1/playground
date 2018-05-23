/**
 * generated by Xtext 2.13.0
 */
package org.example.eis.eis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.eis.eis.EisFactory
 * @model kind="package"
 * @generated
 */
public interface EisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/eis/Eis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EisPackage eINSTANCE = org.example.eis.eis.impl.EisPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.eis.eis.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.eis.eis.impl.ModelImpl
   * @see org.example.eis.eis.impl.EisPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Eis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EIS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.eis.eis.impl.EisTypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.eis.eis.impl.EisTypeImpl
   * @see org.example.eis.eis.impl.EisPackageImpl#getEisType()
   * @generated
   */
  int EIS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EIS_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EIS_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.eis.eis.impl.TiaProjectNameImpl <em>Tia Project Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.eis.eis.impl.TiaProjectNameImpl
   * @see org.example.eis.eis.impl.EisPackageImpl#getTiaProjectName()
   * @generated
   */
  int TIA_PROJECT_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIA_PROJECT_NAME__NAME = EIS_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Tia Project Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIA_PROJECT_NAME_FEATURE_COUNT = EIS_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.eis.eis.impl.PLCNameImpl <em>PLC Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.eis.eis.impl.PLCNameImpl
   * @see org.example.eis.eis.impl.EisPackageImpl#getPLCName()
   * @generated
   */
  int PLC_NAME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLC_NAME__NAME = EIS_TYPE__NAME;

  /**
   * The number of structural features of the '<em>PLC Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLC_NAME_FEATURE_COUNT = EIS_TYPE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.example.eis.eis.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.example.eis.eis.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.eis.eis.Model#getEis <em>Eis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Eis</em>'.
   * @see org.example.eis.eis.Model#getEis()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Eis();

  /**
   * Returns the meta object for class '{@link org.example.eis.eis.EisType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.example.eis.eis.EisType
   * @generated
   */
  EClass getEisType();

  /**
   * Returns the meta object for the attribute '{@link org.example.eis.eis.EisType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.eis.eis.EisType#getName()
   * @see #getEisType()
   * @generated
   */
  EAttribute getEisType_Name();

  /**
   * Returns the meta object for class '{@link org.example.eis.eis.TiaProjectName <em>Tia Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tia Project Name</em>'.
   * @see org.example.eis.eis.TiaProjectName
   * @generated
   */
  EClass getTiaProjectName();

  /**
   * Returns the meta object for class '{@link org.example.eis.eis.PLCName <em>PLC Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PLC Name</em>'.
   * @see org.example.eis.eis.PLCName
   * @generated
   */
  EClass getPLCName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EisFactory getEisFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.eis.eis.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.eis.eis.impl.ModelImpl
     * @see org.example.eis.eis.impl.EisPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Eis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EIS = eINSTANCE.getModel_Eis();

    /**
     * The meta object literal for the '{@link org.example.eis.eis.impl.EisTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.eis.eis.impl.EisTypeImpl
     * @see org.example.eis.eis.impl.EisPackageImpl#getEisType()
     * @generated
     */
    EClass EIS_TYPE = eINSTANCE.getEisType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EIS_TYPE__NAME = eINSTANCE.getEisType_Name();

    /**
     * The meta object literal for the '{@link org.example.eis.eis.impl.TiaProjectNameImpl <em>Tia Project Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.eis.eis.impl.TiaProjectNameImpl
     * @see org.example.eis.eis.impl.EisPackageImpl#getTiaProjectName()
     * @generated
     */
    EClass TIA_PROJECT_NAME = eINSTANCE.getTiaProjectName();

    /**
     * The meta object literal for the '{@link org.example.eis.eis.impl.PLCNameImpl <em>PLC Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.eis.eis.impl.PLCNameImpl
     * @see org.example.eis.eis.impl.EisPackageImpl#getPLCName()
     * @generated
     */
    EClass PLC_NAME = eINSTANCE.getPLCName();

  }

} //EisPackage
