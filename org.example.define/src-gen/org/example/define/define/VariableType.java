/**
 * generated by Xtext 2.13.0
 */
package org.example.define.define;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.VariableType#getBasicTypes <em>Basic Types</em>}</li>
 *   <li>{@link org.example.define.define.VariableType#getSpecifiedUdtType <em>Specified Udt Type</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getVariableType()
 * @model
 * @generated
 */
public interface VariableType extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Types</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Types</em>' attribute.
   * @see #setBasicTypes(String)
   * @see org.example.define.define.DefinePackage#getVariableType_BasicTypes()
   * @model
   * @generated
   */
  String getBasicTypes();

  /**
   * Sets the value of the '{@link org.example.define.define.VariableType#getBasicTypes <em>Basic Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Types</em>' attribute.
   * @see #getBasicTypes()
   * @generated
   */
  void setBasicTypes(String value);

  /**
   * Returns the value of the '<em><b>Specified Udt Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specified Udt Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specified Udt Type</em>' reference.
   * @see #setSpecifiedUdtType(UdtType)
   * @see org.example.define.define.DefinePackage#getVariableType_SpecifiedUdtType()
   * @model
   * @generated
   */
  UdtType getSpecifiedUdtType();

  /**
   * Sets the value of the '{@link org.example.define.define.VariableType#getSpecifiedUdtType <em>Specified Udt Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specified Udt Type</em>' reference.
   * @see #getSpecifiedUdtType()
   * @generated
   */
  void setSpecifiedUdtType(UdtType value);

} // VariableType
