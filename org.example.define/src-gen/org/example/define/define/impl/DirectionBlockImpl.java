/**
 * generated by Xtext 2.14.0
 */
package org.example.define.define.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.define.define.DefinePackage;
import org.example.define.define.DirectionBlock;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direction Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.impl.DirectionBlockImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.example.define.define.impl.DirectionBlockImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link org.example.define.define.impl.DirectionBlockImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectionBlockImpl extends MinimalEObjectImpl.Container implements DirectionBlock
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected Input input;

  /**
   * The cached value of the '{@link #getInout() <em>Inout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInout()
   * @generated
   * @ordered
   */
  protected Inout inout;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected Output output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectionBlockImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DefinePackage.Literals.DIRECTION_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(Input newInput, NotificationChain msgs)
  {
    Input oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.DIRECTION_BLOCK__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(Input newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.DIRECTION_BLOCK__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.DIRECTION_BLOCK__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.DIRECTION_BLOCK__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inout getInout()
  {
    return inout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInout(Inout newInout, NotificationChain msgs)
  {
    Inout oldInout = inout;
    inout = newInout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.DIRECTION_BLOCK__INOUT, oldInout, newInout);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInout(Inout newInout)
  {
    if (newInout != inout)
    {
      NotificationChain msgs = null;
      if (inout != null)
        msgs = ((InternalEObject)inout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.DIRECTION_BLOCK__INOUT, null, msgs);
      if (newInout != null)
        msgs = ((InternalEObject)newInout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.DIRECTION_BLOCK__INOUT, null, msgs);
      msgs = basicSetInout(newInout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.DIRECTION_BLOCK__INOUT, newInout, newInout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs)
  {
    Output oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.DIRECTION_BLOCK__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(Output newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.DIRECTION_BLOCK__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.DIRECTION_BLOCK__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.DIRECTION_BLOCK__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DefinePackage.DIRECTION_BLOCK__INPUT:
        return basicSetInput(null, msgs);
      case DefinePackage.DIRECTION_BLOCK__INOUT:
        return basicSetInout(null, msgs);
      case DefinePackage.DIRECTION_BLOCK__OUTPUT:
        return basicSetOutput(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DefinePackage.DIRECTION_BLOCK__INPUT:
        return getInput();
      case DefinePackage.DIRECTION_BLOCK__INOUT:
        return getInout();
      case DefinePackage.DIRECTION_BLOCK__OUTPUT:
        return getOutput();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DefinePackage.DIRECTION_BLOCK__INPUT:
        setInput((Input)newValue);
        return;
      case DefinePackage.DIRECTION_BLOCK__INOUT:
        setInout((Inout)newValue);
        return;
      case DefinePackage.DIRECTION_BLOCK__OUTPUT:
        setOutput((Output)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DefinePackage.DIRECTION_BLOCK__INPUT:
        setInput((Input)null);
        return;
      case DefinePackage.DIRECTION_BLOCK__INOUT:
        setInout((Inout)null);
        return;
      case DefinePackage.DIRECTION_BLOCK__OUTPUT:
        setOutput((Output)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DefinePackage.DIRECTION_BLOCK__INPUT:
        return input != null;
      case DefinePackage.DIRECTION_BLOCK__INOUT:
        return inout != null;
      case DefinePackage.DIRECTION_BLOCK__OUTPUT:
        return output != null;
    }
    return super.eIsSet(featureID);
  }

} //DirectionBlockImpl