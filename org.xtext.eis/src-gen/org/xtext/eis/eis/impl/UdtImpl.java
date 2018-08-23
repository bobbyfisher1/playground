/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.eis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.eis.eis.EisPackage;
import org.xtext.eis.eis.Udt;
import org.xtext.eis.eis.UdtType;
import org.xtext.eis.eis.Variables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Udt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.impl.UdtImpl#getUdtType <em>Udt Type</em>}</li>
 *   <li>{@link org.xtext.eis.eis.impl.UdtImpl#getUdtVariables <em>Udt Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UdtImpl extends VariablesImpl implements Udt
{
  /**
   * The cached value of the '{@link #getUdtType() <em>Udt Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUdtType()
   * @generated
   * @ordered
   */
  protected UdtType udtType;

  /**
   * The cached value of the '{@link #getUdtVariables() <em>Udt Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUdtVariables()
   * @generated
   * @ordered
   */
  protected EList<Variables> udtVariables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public  UdtImpl()
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
    return EisPackage.Literals.UDT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UdtType getUdtType()
  {
    return udtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUdtType(UdtType newUdtType, NotificationChain msgs)
  {
    UdtType oldUdtType = udtType;
    udtType = newUdtType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EisPackage.UDT__UDT_TYPE, oldUdtType, newUdtType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUdtType(UdtType newUdtType)
  {
    if (newUdtType != udtType)
    {
      NotificationChain msgs = null;
      if (udtType != null)
        msgs = ((InternalEObject)udtType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EisPackage.UDT__UDT_TYPE, null, msgs);
      if (newUdtType != null)
        msgs = ((InternalEObject)newUdtType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EisPackage.UDT__UDT_TYPE, null, msgs);
      msgs = basicSetUdtType(newUdtType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.UDT__UDT_TYPE, newUdtType, newUdtType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variables> getUdtVariables()
  {
    if (udtVariables == null)
    {
      udtVariables = new EObjectContainmentEList<Variables>(Variables.class, this, EisPackage.UDT__UDT_VARIABLES);
    }
    return udtVariables;
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
      case EisPackage.UDT__UDT_TYPE:
        return basicSetUdtType(null, msgs);
      case EisPackage.UDT__UDT_VARIABLES:
        return ((InternalEList<?>)getUdtVariables()).basicRemove(otherEnd, msgs);
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
      case EisPackage.UDT__UDT_TYPE:
        return getUdtType();
      case EisPackage.UDT__UDT_VARIABLES:
        return getUdtVariables();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EisPackage.UDT__UDT_TYPE:
        setUdtType((UdtType)newValue);
        return;
      case EisPackage.UDT__UDT_VARIABLES:
        getUdtVariables().clear();
        getUdtVariables().addAll((Collection<? extends Variables>)newValue);
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
      case EisPackage.UDT__UDT_TYPE:
        setUdtType((UdtType)null);
        return;
      case EisPackage.UDT__UDT_VARIABLES:
        getUdtVariables().clear();
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
      case EisPackage.UDT__UDT_TYPE:
        return udtType != null;
      case EisPackage.UDT__UDT_VARIABLES:
        return udtVariables != null && !udtVariables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UdtImpl
