/**
 * generated by Xtext 2.14.0
 */
package org.example.eis.eis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.eis.eis.AssertionBlock#getSet <em>Set</em>}</li>
 *   <li>{@link org.example.eis.eis.AssertionBlock#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see org.example.eis.eis.EisPackage#getAssertionBlock()
 * @model
 * @generated
 */
public interface AssertionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(Set)
   * @see org.example.eis.eis.EisPackage#getAssertionBlock_Set()
   * @model containment="true"
   * @generated
   */
  Set getSet();

  /**
   * Sets the value of the '{@link org.example.eis.eis.AssertionBlock#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(Set value);

  /**
   * Returns the value of the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert</em>' containment reference.
   * @see #setAssert(Assert)
   * @see org.example.eis.eis.EisPackage#getAssertionBlock_Assert()
   * @model containment="true"
   * @generated
   */
  Assert getAssert();

  /**
   * Sets the value of the '{@link org.example.eis.eis.AssertionBlock#getAssert <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert</em>' containment reference.
   * @see #getAssert()
   * @generated
   */
  void setAssert(Assert value);

} // AssertionBlock