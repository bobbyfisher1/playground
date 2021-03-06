/**
 * generated by Xtext 2.14.0
 */
package org.example.define.define.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.define.define.DefinePackage;
import org.example.define.define.Idiom;
import org.example.define.define.Not;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.impl.NotImpl#getIdiom <em>Idiom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotImpl extends IdiomImpl implements Not
{
  /**
   * The cached value of the '{@link #getIdiom() <em>Idiom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdiom()
   * @generated
   * @ordered
   */
  protected Idiom idiom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotImpl()
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
    return DefinePackage.Literals.NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Idiom getIdiom()
  {
    return idiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdiom(Idiom newIdiom, NotificationChain msgs)
  {
    Idiom oldIdiom = idiom;
    idiom = newIdiom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.NOT__IDIOM, oldIdiom, newIdiom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdiom(Idiom newIdiom)
  {
    if (newIdiom != idiom)
    {
      NotificationChain msgs = null;
      if (idiom != null)
        msgs = ((InternalEObject)idiom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.NOT__IDIOM, null, msgs);
      if (newIdiom != null)
        msgs = ((InternalEObject)newIdiom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.NOT__IDIOM, null, msgs);
      msgs = basicSetIdiom(newIdiom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.NOT__IDIOM, newIdiom, newIdiom));
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
      case DefinePackage.NOT__IDIOM:
        return basicSetIdiom(null, msgs);
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
      case DefinePackage.NOT__IDIOM:
        return getIdiom();
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
      case DefinePackage.NOT__IDIOM:
        setIdiom((Idiom)newValue);
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
      case DefinePackage.NOT__IDIOM:
        setIdiom((Idiom)null);
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
      case DefinePackage.NOT__IDIOM:
        return idiom != null;
    }
    return super.eIsSet(featureID);
  }

} //NotImpl
