/**
 * generated by Xtext 2.13.0
 */
package org.example.define.define;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Udt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.Udt#getUdtName <em>Udt Name</em>}</li>
 *   <li>{@link org.example.define.define.Udt#getUdtTypes <em>Udt Types</em>}</li>
 *   <li>{@link org.example.define.define.Udt#getUdtVariables <em>Udt Variables</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getUdt()
 * @model
 * @generated
 */
public interface Udt extends EObject
{
  /**
   * Returns the value of the '<em><b>Udt Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Udt Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Udt Name</em>' attribute.
   * @see #setUdtName(String)
   * @see org.example.define.define.DefinePackage#getUdt_UdtName()
   * @model
   * @generated
   */
  String getUdtName();

  /**
   * Sets the value of the '{@link org.example.define.define.Udt#getUdtName <em>Udt Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Udt Name</em>' attribute.
   * @see #getUdtName()
   * @generated
   */
  void setUdtName(String value);

  /**
   * Returns the value of the '<em><b>Udt Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Udt Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Udt Types</em>' containment reference.
   * @see #setUdtTypes(UdtType)
   * @see org.example.define.define.DefinePackage#getUdt_UdtTypes()
   * @model containment="true"
   * @generated
   */
  UdtType getUdtTypes();

  /**
   * Sets the value of the '{@link org.example.define.define.Udt#getUdtTypes <em>Udt Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Udt Types</em>' containment reference.
   * @see #getUdtTypes()
   * @generated
   */
  void setUdtTypes(UdtType value);

  /**
   * Returns the value of the '<em><b>Udt Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.example.define.define.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Udt Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Udt Variables</em>' containment reference list.
   * @see org.example.define.define.DefinePackage#getUdt_UdtVariables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getUdtVariables();

} // Udt
