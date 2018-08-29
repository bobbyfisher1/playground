/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.eis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.InOut#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.eis.eis.InOut#getInoutVariables <em>Inout Variables</em>}</li>
 * </ul>
 *
 * @see org.xtext.eis.eis.EisPackage#getInOut()
 * @model
 * @generated
 */
public interface InOut extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.eis.eis.EisPackage#getInOut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.InOut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inout Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.eis.eis.Variables}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inout Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inout Variables</em>' containment reference list.
   * @see org.xtext.eis.eis.EisPackage#getInOut_InoutVariables()
   * @model containment="true"
   * @generated
   */
  EList<Variables> getInoutVariables();

} // InOut