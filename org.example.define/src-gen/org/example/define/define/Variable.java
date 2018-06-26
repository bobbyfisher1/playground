/**
 * generated by Xtext 2.13.0
 */
package org.example.define.define;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.Variable#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link org.example.define.define.Variable#getVariableDefinition <em>Variable Definition</em>}</li>
 *   <li>{@link org.example.define.define.Variable#getUdt <em>Udt</em>}</li>
 *   <li>{@link org.example.define.define.Variable#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Type</em>' attribute.
   * @see #setVariableType(String)
   * @see org.example.define.define.DefinePackage#getVariable_VariableType()
   * @model
   * @generated
   */
  String getVariableType();

  /**
   * Sets the value of the '{@link org.example.define.define.Variable#getVariableType <em>Variable Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Type</em>' attribute.
   * @see #getVariableType()
   * @generated
   */
  void setVariableType(String value);

  /**
   * Returns the value of the '<em><b>Variable Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Definition</em>' containment reference.
   * @see #setVariableDefinition(VariableDefinition)
   * @see org.example.define.define.DefinePackage#getVariable_VariableDefinition()
   * @model containment="true"
   * @generated
   */
  VariableDefinition getVariableDefinition();

  /**
   * Sets the value of the '{@link org.example.define.define.Variable#getVariableDefinition <em>Variable Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Definition</em>' containment reference.
   * @see #getVariableDefinition()
   * @generated
   */
  void setVariableDefinition(VariableDefinition value);

  /**
   * Returns the value of the '<em><b>Udt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Udt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Udt</em>' containment reference.
   * @see #setUdt(Udt)
   * @see org.example.define.define.DefinePackage#getVariable_Udt()
   * @model containment="true"
   * @generated
   */
  Udt getUdt();

  /**
   * Sets the value of the '{@link org.example.define.define.Variable#getUdt <em>Udt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Udt</em>' containment reference.
   * @see #getUdt()
   * @generated
   */
  void setUdt(Udt value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' containment reference.
   * @see #setVariant(Variant)
   * @see org.example.define.define.DefinePackage#getVariable_Variant()
   * @model containment="true"
   * @generated
   */
  Variant getVariant();

  /**
   * Sets the value of the '{@link org.example.define.define.Variable#getVariant <em>Variant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' containment reference.
   * @see #getVariant()
   * @generated
   */
  void setVariant(Variant value);

} // Variable
