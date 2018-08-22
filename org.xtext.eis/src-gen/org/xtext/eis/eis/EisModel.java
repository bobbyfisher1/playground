/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.eis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.EisModel#getProject_name <em>Project name</em>}</li>
 *   <li>{@link org.xtext.eis.eis.EisModel#getPlc_name <em>Plc name</em>}</li>
 *   <li>{@link org.xtext.eis.eis.EisModel#getAuthor_name <em>Author name</em>}</li>
 *   <li>{@link org.xtext.eis.eis.EisModel#getTestcases <em>Testcases</em>}</li>
 * </ul>
 *
 * @see org.xtext.eis.eis.EisPackage#getEisModel()
 * @model
 * @generated
 */
public interface EisModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Project name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project name</em>' attribute.
   * @see #setProject_name(String)
   * @see org.xtext.eis.eis.EisPackage#getEisModel_Project_name()
   * @model
   * @generated
   */
  String getProject_name();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.EisModel#getProject_name <em>Project name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project name</em>' attribute.
   * @see #getProject_name()
   * @generated
   */
  void setProject_name(String value);

  /**
   * Returns the value of the '<em><b>Plc name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plc name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plc name</em>' attribute.
   * @see #setPlc_name(String)
   * @see org.xtext.eis.eis.EisPackage#getEisModel_Plc_name()
   * @model
   * @generated
   */
  String getPlc_name();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.EisModel#getPlc_name <em>Plc name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plc name</em>' attribute.
   * @see #getPlc_name()
   * @generated
   */
  void setPlc_name(String value);

  /**
   * Returns the value of the '<em><b>Author name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author name</em>' attribute.
   * @see #setAuthor_name(String)
   * @see org.xtext.eis.eis.EisPackage#getEisModel_Author_name()
   * @model
   * @generated
   */
  String getAuthor_name();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.EisModel#getAuthor_name <em>Author name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author name</em>' attribute.
   * @see #getAuthor_name()
   * @generated
   */
  void setAuthor_name(String value);

  /**
   * Returns the value of the '<em><b>Testcases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.eis.eis.Testcase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcases</em>' containment reference list.
   * @see org.xtext.eis.eis.EisPackage#getEisModel_Testcases()
   * @model containment="true"
   * @generated
   */
  EList<Testcase> getTestcases();

} // EisModel