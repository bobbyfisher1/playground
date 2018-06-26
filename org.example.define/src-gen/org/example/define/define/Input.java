/**
 * generated by Xtext 2.13.0
 */
package org.example.define.define;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.Input#getInputVariables <em>Input Variables</em>}</li>
 * </ul>
 *
 * @see org.example.define.define.DefinePackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>Input Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.example.define.define.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Variables</em>' containment reference list.
   * @see org.example.define.define.DefinePackage#getInput_InputVariables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getInputVariables();

} // Input
