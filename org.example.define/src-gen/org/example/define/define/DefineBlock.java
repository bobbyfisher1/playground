/**
 * generated by Xtext 2.14.0
 */
package org.example.define.define;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.DefineBlock#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.example.define.define.DefineBlock#getTeststeps <em>Teststeps</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getDefineBlock()
 * @model
 * @generated
 */
public interface DefineBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' containment reference.
   * @see #setDirection(DirectionBlock)
   * @see org.example.define.define.DefinePackage#getDefineBlock_Direction()
   * @model containment="true"
   * @generated
   */
  DirectionBlock getDirection();

  /**
   * Sets the value of the '{@link org.example.define.define.DefineBlock#getDirection <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' containment reference.
   * @see #getDirection()
   * @generated
   */
  void setDirection(DirectionBlock value);

  /**
   * Returns the value of the '<em><b>Teststeps</b></em>' containment reference list.
   * The list contents are of type {@link org.example.define.define.TeststepBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teststeps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teststeps</em>' containment reference list.
   * @see org.example.define.define.DefinePackage#getDefineBlock_Teststeps()
   * @model containment="true"
   * @generated
   */
  EList<TeststepBlock> getTeststeps();

} // DefineBlock
