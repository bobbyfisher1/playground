/**
 * generated by Xtext 2.14.0
 */
package org.example.eis.eis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.eis.eis.IntConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.example.eis.eis.EisPackage#getIntConstant()
 * @model
 * @generated
 */
public interface IntConstant extends Idiom
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.example.eis.eis.EisPackage#getIntConstant_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.example.eis.eis.IntConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntConstant
