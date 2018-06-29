/**
 * generated by Xtext 2.13.0
 */
package org.example.define.define.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.define.define.DefinePackage;
import org.example.define.define.UdtType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Udt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.impl.UdtTypeImpl#getUdtTypeName <em>Udt Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UdtTypeImpl extends MinimalEObjectImpl.Container implements UdtType
{
  /**
   * The default value of the '{@link #getUdtTypeName() <em>Udt Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUdtTypeName()
   * @generated
   * @ordered
   */
  protected static final String UDT_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUdtTypeName() <em>Udt Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUdtTypeName()
   * @generated
   * @ordered
   */
  protected String udtTypeName = UDT_TYPE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UdtTypeImpl()
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
    return DefinePackage.Literals.UDT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUdtTypeName()
  {
    return udtTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUdtTypeName(String newUdtTypeName)
  {
    String oldUdtTypeName = udtTypeName;
    udtTypeName = newUdtTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.UDT_TYPE__UDT_TYPE_NAME, oldUdtTypeName, udtTypeName));
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
      case DefinePackage.UDT_TYPE__UDT_TYPE_NAME:
        return getUdtTypeName();
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
      case DefinePackage.UDT_TYPE__UDT_TYPE_NAME:
        setUdtTypeName((String)newValue);
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
      case DefinePackage.UDT_TYPE__UDT_TYPE_NAME:
        setUdtTypeName(UDT_TYPE_NAME_EDEFAULT);
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
      case DefinePackage.UDT_TYPE__UDT_TYPE_NAME:
        return UDT_TYPE_NAME_EDEFAULT == null ? udtTypeName != null : !UDT_TYPE_NAME_EDEFAULT.equals(udtTypeName);
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
    result.append(" (udtTypeName: ");
    result.append(udtTypeName);
    result.append(')');
    return result.toString();
  }

} //UdtTypeImpl
