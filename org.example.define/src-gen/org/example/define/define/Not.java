/**
 * generated by Xtext 2.14.0
 */
package org.example.define.define;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.Not#getIdiom <em>Idiom</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Idiom
{
  /**
   * Returns the value of the '<em><b>Idiom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Idiom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idiom</em>' containment reference.
   * @see #setIdiom(Idiom)
   * @see org.example.define.define.DefinePackage#getNot_Idiom()
   * @model containment="true"
   * @generated
   */
  Idiom getIdiom();

  /**
   * Sets the value of the '{@link org.example.define.define.Not#getIdiom <em>Idiom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idiom</em>' containment reference.
   * @see #getIdiom()
   * @generated
   */
  void setIdiom(Idiom value);

} // Not
