/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.eis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testcase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.Testcase#getTestcase_name <em>Testcase name</em>}</li>
 *   <li>{@link org.xtext.eis.eis.Testcase#getTestblock <em>Testblock</em>}</li>
 * </ul>
 *
 * @see org.xtext.eis.eis.EisPackage#getTestcase()
 * @model
 * @generated
 */
public interface Testcase extends EObject
{
  /**
   * Returns the value of the '<em><b>Testcase name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcase name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcase name</em>' attribute.
   * @see #setTestcase_name(String)
   * @see org.xtext.eis.eis.EisPackage#getTestcase_Testcase_name()
   * @model
   * @generated
   */
  String getTestcase_name();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.Testcase#getTestcase_name <em>Testcase name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testcase name</em>' attribute.
   * @see #getTestcase_name()
   * @generated
   */
  void setTestcase_name(String value);

  /**
   * Returns the value of the '<em><b>Testblock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testblock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testblock</em>' containment reference.
   * @see #setTestblock(Testblock)
   * @see org.xtext.eis.eis.EisPackage#getTestcase_Testblock()
   * @model containment="true"
   * @generated
   */
  Testblock getTestblock();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.Testcase#getTestblock <em>Testblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testblock</em>' containment reference.
   * @see #getTestblock()
   * @generated
   */
  void setTestblock(Testblock value);

} // Testcase
