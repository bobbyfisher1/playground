/**
 * generated by Xtext 2.14.0
 */
package org.example.eis.eis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.eis.eis.Plus#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.eis.eis.Plus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.example.eis.eis.EisPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends Idiom
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Idiom)
   * @see org.example.eis.eis.EisPackage#getPlus_Left()
   * @model containment="true"
   * @generated
   */
  Idiom getLeft();

  /**
   * Sets the value of the '{@link org.example.eis.eis.Plus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Idiom value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Idiom)
   * @see org.example.eis.eis.EisPackage#getPlus_Right()
   * @model containment="true"
   * @generated
   */
  Idiom getRight();

  /**
   * Sets the value of the '{@link org.example.eis.eis.Plus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Idiom value);

} // Plus
