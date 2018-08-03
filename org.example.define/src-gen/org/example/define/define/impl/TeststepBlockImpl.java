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

import org.example.define.define.AssertionBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.TeststepBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teststep Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.impl.TeststepBlockImpl#getPlcCycle <em>Plc Cycle</em>}</li>
 *   <li>{@link org.example.define.define.impl.TeststepBlockImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.define.define.impl.TeststepBlockImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeststepBlockImpl extends MinimalEObjectImpl.Container implements TeststepBlock
{
  /**
   * The default value of the '{@link #getPlcCycle() <em>Plc Cycle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlcCycle()
   * @generated
   * @ordered
   */
  protected static final int PLC_CYCLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPlcCycle() <em>Plc Cycle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlcCycle()
   * @generated
   * @ordered
   */
  protected int plcCycle = PLC_CYCLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertion()
   * @generated
   * @ordered
   */
  protected AssertionBlock assertion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TeststepBlockImpl()
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
    return DefinePackage.Literals.TESTSTEP_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPlcCycle()
  {
    return plcCycle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlcCycle(int newPlcCycle)
  {
    int oldPlcCycle = plcCycle;
    plcCycle = newPlcCycle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.TESTSTEP_BLOCK__PLC_CYCLE, oldPlcCycle, plcCycle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.TESTSTEP_BLOCK__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionBlock getAssertion()
  {
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertion(AssertionBlock newAssertion, NotificationChain msgs)
  {
    AssertionBlock oldAssertion = assertion;
    assertion = newAssertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.TESTSTEP_BLOCK__ASSERTION, oldAssertion, newAssertion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertion(AssertionBlock newAssertion)
  {
    if (newAssertion != assertion)
    {
      NotificationChain msgs = null;
      if (assertion != null)
        msgs = ((InternalEObject)assertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.TESTSTEP_BLOCK__ASSERTION, null, msgs);
      if (newAssertion != null)
        msgs = ((InternalEObject)newAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.TESTSTEP_BLOCK__ASSERTION, null, msgs);
      msgs = basicSetAssertion(newAssertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.TESTSTEP_BLOCK__ASSERTION, newAssertion, newAssertion));
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
      case DefinePackage.TESTSTEP_BLOCK__ASSERTION:
        return basicSetAssertion(null, msgs);
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
      case DefinePackage.TESTSTEP_BLOCK__PLC_CYCLE:
        return getPlcCycle();
      case DefinePackage.TESTSTEP_BLOCK__DESCRIPTION:
        return getDescription();
      case DefinePackage.TESTSTEP_BLOCK__ASSERTION:
        return getAssertion();
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
      case DefinePackage.TESTSTEP_BLOCK__PLC_CYCLE:
        setPlcCycle((Integer)newValue);
        return;
      case DefinePackage.TESTSTEP_BLOCK__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DefinePackage.TESTSTEP_BLOCK__ASSERTION:
        setAssertion((AssertionBlock)newValue);
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
      case DefinePackage.TESTSTEP_BLOCK__PLC_CYCLE:
        setPlcCycle(PLC_CYCLE_EDEFAULT);
        return;
      case DefinePackage.TESTSTEP_BLOCK__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DefinePackage.TESTSTEP_BLOCK__ASSERTION:
        setAssertion((AssertionBlock)null);
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
      case DefinePackage.TESTSTEP_BLOCK__PLC_CYCLE:
        return plcCycle != PLC_CYCLE_EDEFAULT;
      case DefinePackage.TESTSTEP_BLOCK__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DefinePackage.TESTSTEP_BLOCK__ASSERTION:
        return assertion != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (plcCycle: ");
    result.append(plcCycle);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //TeststepBlockImpl
