/**
 * generated by Xtext 2.14.0
 */
package org.example.define.define;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.Assert#getName <em>Name</em>}</li>
 *   <li>{@link org.example.define.define.Assert#getAssertVariables <em>Assert Variables</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends EObject
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
   * @see org.example.define.define.DefinePackage#getAssert_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.define.define.Assert#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assert Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.example.define.define.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Variables</em>' containment reference list.
   * @see org.example.define.define.DefinePackage#getAssert_AssertVariables()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getAssertVariables();

} // Assert
