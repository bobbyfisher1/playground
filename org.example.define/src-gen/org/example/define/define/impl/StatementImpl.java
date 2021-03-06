/**
 * generated by Xtext 2.14.0
 */
package org.example.define.define.impl;

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

import org.example.define.define.Cascade;
import org.example.define.define.DefinePackage;
import org.example.define.define.Idiom;
import org.example.define.define.Statement;
import org.example.define.define.Variables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.define.define.impl.StatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.example.define.define.impl.StatementImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.example.define.define.impl.StatementImpl#getIdiom <em>Idiom</em>}</li>
 *   <li>{@link org.example.define.define.impl.StatementImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variables variable;

  /**
   * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCascade()
   * @generated
   * @ordered
   */
  protected EList<Cascade> cascade;

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
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Idiom range;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return DefinePackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (Variables)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefinePackage.STATEMENT__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variables newVariable)
  {
    Variables oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.STATEMENT__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Cascade> getCascade()
  {
    if (cascade == null)
    {
      cascade = new EObjectContainmentEList<Cascade>(Cascade.class, this, DefinePackage.STATEMENT__CASCADE);
    }
    return cascade;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.STATEMENT__IDIOM, oldIdiom, newIdiom);
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
        msgs = ((InternalEObject)idiom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.STATEMENT__IDIOM, null, msgs);
      if (newIdiom != null)
        msgs = ((InternalEObject)newIdiom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.STATEMENT__IDIOM, null, msgs);
      msgs = basicSetIdiom(newIdiom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.STATEMENT__IDIOM, newIdiom, newIdiom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Idiom getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Idiom newRange, NotificationChain msgs)
  {
    Idiom oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinePackage.STATEMENT__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(Idiom newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinePackage.STATEMENT__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinePackage.STATEMENT__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinePackage.STATEMENT__RANGE, newRange, newRange));
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
      case DefinePackage.STATEMENT__CASCADE:
        return ((InternalEList<?>)getCascade()).basicRemove(otherEnd, msgs);
      case DefinePackage.STATEMENT__IDIOM:
        return basicSetIdiom(null, msgs);
      case DefinePackage.STATEMENT__RANGE:
        return basicSetRange(null, msgs);
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
      case DefinePackage.STATEMENT__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case DefinePackage.STATEMENT__CASCADE:
        return getCascade();
      case DefinePackage.STATEMENT__IDIOM:
        return getIdiom();
      case DefinePackage.STATEMENT__RANGE:
        return getRange();
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
      case DefinePackage.STATEMENT__VARIABLE:
        setVariable((Variables)newValue);
        return;
      case DefinePackage.STATEMENT__CASCADE:
        getCascade().clear();
        getCascade().addAll((Collection<? extends Cascade>)newValue);
        return;
      case DefinePackage.STATEMENT__IDIOM:
        setIdiom((Idiom)newValue);
        return;
      case DefinePackage.STATEMENT__RANGE:
        setRange((Idiom)newValue);
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
      case DefinePackage.STATEMENT__VARIABLE:
        setVariable((Variables)null);
        return;
      case DefinePackage.STATEMENT__CASCADE:
        getCascade().clear();
        return;
      case DefinePackage.STATEMENT__IDIOM:
        setIdiom((Idiom)null);
        return;
      case DefinePackage.STATEMENT__RANGE:
        setRange((Idiom)null);
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
      case DefinePackage.STATEMENT__VARIABLE:
        return variable != null;
      case DefinePackage.STATEMENT__CASCADE:
        return cascade != null && !cascade.isEmpty();
      case DefinePackage.STATEMENT__IDIOM:
        return idiom != null;
      case DefinePackage.STATEMENT__RANGE:
        return range != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementImpl
