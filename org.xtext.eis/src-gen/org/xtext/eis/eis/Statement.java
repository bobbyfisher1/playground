/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.eis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.Statement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.eis.eis.Statement#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.xtext.eis.eis.Statement#getIdiom <em>Idiom</em>}</li>
 *   <li>{@link org.xtext.eis.eis.Statement#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.xtext.eis.eis.EisPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variables)
   * @see org.xtext.eis.eis.EisPackage#getStatement_Variable()
   * @model
   * @generated
   */
  Variables getVariable();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.Statement#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variables value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.eis.eis.Cascade}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' containment reference list.
   * @see org.xtext.eis.eis.EisPackage#getStatement_Cascade()
   * @model containment="true"
   * @generated
   */
  EList<Cascade> getCascade();

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
   * @see org.xtext.eis.eis.EisPackage#getStatement_Idiom()
   * @model containment="true"
   * @generated
   */
  Idiom getIdiom();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.Statement#getIdiom <em>Idiom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idiom</em>' containment reference.
   * @see #getIdiom()
   * @generated
   */
  void setIdiom(Idiom value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Idiom)
   * @see org.xtext.eis.eis.EisPackage#getStatement_Range()
   * @model containment="true"
   * @generated
   */
  Idiom getRange();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.Statement#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Idiom value);

} // Statement
