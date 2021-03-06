/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.eis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.DirectionBlock#getInput <em>Input</em>}</li>
 *   <li>{@link org.xtext.eis.eis.DirectionBlock#getOutput <em>Output</em>}</li>
 *   <li>{@link org.xtext.eis.eis.DirectionBlock#getInout <em>Inout</em>}</li>
 * </ul>
 *
 * @see org.xtext.eis.eis.EisPackage#getDirectionBlock()
 * @model
 * @generated
 */
public interface DirectionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Input)
   * @see org.xtext.eis.eis.EisPackage#getDirectionBlock_Input()
   * @model containment="true"
   * @generated
   */
  Input getInput();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.DirectionBlock#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Input value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(Output)
   * @see org.xtext.eis.eis.EisPackage#getDirectionBlock_Output()
   * @model containment="true"
   * @generated
   */
  Output getOutput();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.DirectionBlock#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(Output value);

  /**
   * Returns the value of the '<em><b>Inout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inout</em>' containment reference.
   * @see #setInout(InOut)
   * @see org.xtext.eis.eis.EisPackage#getDirectionBlock_Inout()
   * @model containment="true"
   * @generated
   */
  InOut getInout();

  /**
   * Sets the value of the '{@link org.xtext.eis.eis.DirectionBlock#getInout <em>Inout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inout</em>' containment reference.
   * @see #getInout()
   * @generated
   */
  void setInout(InOut value);

} // DirectionBlock
