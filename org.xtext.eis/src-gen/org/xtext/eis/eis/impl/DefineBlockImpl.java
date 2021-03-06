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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.eis.eis.DefineBlock;
import org.xtext.eis.eis.DirectionBlock;
import org.xtext.eis.eis.EisPackage;
import org.xtext.eis.eis.TeststepBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.eis.eis.impl.DefineBlockImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.xtext.eis.eis.impl.DefineBlockImpl#getTeststeps <em>Teststeps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineBlockImpl extends MinimalEObjectImpl.Container implements DefineBlock
{
  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected DirectionBlock direction;

  /**
   * The cached value of the '{@link #getTeststeps() <em>Teststeps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeststeps()
   * @generated
   * @ordered
   */
  protected EList<TeststepBlock> teststeps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefineBlockImpl()
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
    return EisPackage.Literals.DEFINE_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectionBlock getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirection(DirectionBlock newDirection, NotificationChain msgs)
  {
    DirectionBlock oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EisPackage.DEFINE_BLOCK__DIRECTION, oldDirection, newDirection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(DirectionBlock newDirection)
  {
    if (newDirection != direction)
    {
      NotificationChain msgs = null;
      if (direction != null)
        msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EisPackage.DEFINE_BLOCK__DIRECTION, null, msgs);
      if (newDirection != null)
        msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EisPackage.DEFINE_BLOCK__DIRECTION, null, msgs);
      msgs = basicSetDirection(newDirection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.DEFINE_BLOCK__DIRECTION, newDirection, newDirection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TeststepBlock> getTeststeps()
  {
    if (teststeps == null)
    {
      teststeps = new EObjectContainmentEList<TeststepBlock>(TeststepBlock.class, this, EisPackage.DEFINE_BLOCK__TESTSTEPS);
    }
    return teststeps;
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
      case EisPackage.DEFINE_BLOCK__DIRECTION:
        return basicSetDirection(null, msgs);
      case EisPackage.DEFINE_BLOCK__TESTSTEPS:
        return ((InternalEList<?>)getTeststeps()).basicRemove(otherEnd, msgs);
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
      case EisPackage.DEFINE_BLOCK__DIRECTION:
        return getDirection();
      case EisPackage.DEFINE_BLOCK__TESTSTEPS:
        return getTeststeps();
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
      case EisPackage.DEFINE_BLOCK__DIRECTION:
        setDirection((DirectionBlock)newValue);
        return;
      case EisPackage.DEFINE_BLOCK__TESTSTEPS:
        getTeststeps().clear();
        getTeststeps().addAll((Collection<? extends TeststepBlock>)newValue);
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
      case EisPackage.DEFINE_BLOCK__DIRECTION:
        setDirection((DirectionBlock)null);
        return;
      case EisPackage.DEFINE_BLOCK__TESTSTEPS:
        getTeststeps().clear();
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
      case EisPackage.DEFINE_BLOCK__DIRECTION:
        return direction != null;
      case EisPackage.DEFINE_BLOCK__TESTSTEPS:
        return teststeps != null && !teststeps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefineBlockImpl
