/**
 * generated by Xtext 2.14.0
 */
package org.example.eis.eis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.eis.eis.BasicType;
import org.example.eis.eis.EisPackage;
import org.example.eis.eis.Idiom;
import org.example.eis.eis.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.eis.eis.impl.VariableImpl#isVariantKeyword <em>Variant Keyword</em>}</li>
 *   <li>{@link org.example.eis.eis.impl.VariableImpl#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link org.example.eis.eis.impl.VariableImpl#getIdiom <em>Idiom</em>}</li>
 *   <li>{@link org.example.eis.eis.impl.VariableImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.example.eis.eis.impl.VariableImpl#isNextVariable <em>Next Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends VariablesImpl implements Variable
{
  /**
   * The default value of the '{@link #isVariantKeyword() <em>Variant Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVariantKeyword()
   * @generated
   * @ordered
   */
  protected static final boolean VARIANT_KEYWORD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVariantKeyword() <em>Variant Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVariantKeyword()
   * @generated
   * @ordered
   */
  protected boolean variantKeyword = VARIANT_KEYWORD_EDEFAULT;

  /**
   * The default value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableType()
   * @generated
   * @ordered
   */
  protected static final BasicType VARIABLE_TYPE_EDEFAULT = BasicType.NULL;

  /**
   * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableType()
   * @generated
   * @ordered
   */
  protected BasicType variableType = VARIABLE_TYPE_EDEFAULT;

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
   * The default value of the '{@link #isNextVariable() <em>Next Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNextVariable()
   * @generated
   * @ordered
   */
  protected static final boolean NEXT_VARIABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNextVariable() <em>Next Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNextVariable()
   * @generated
   * @ordered
   */
  protected boolean nextVariable = NEXT_VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public  VariableImpl()
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
    return EisPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVariantKeyword()
  {
    return variantKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariantKeyword(boolean newVariantKeyword)
  {
    boolean oldVariantKeyword = variantKeyword;
    variantKeyword = newVariantKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__VARIANT_KEYWORD, oldVariantKeyword, variantKeyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType getVariableType()
  {
    return variableType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableType(BasicType newVariableType)
  {
    BasicType oldVariableType = variableType;
    variableType = newVariableType == null ? VARIABLE_TYPE_EDEFAULT : newVariableType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__IDIOM, oldIdiom, newIdiom);
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
        msgs = ((InternalEObject)idiom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EisPackage.VARIABLE__IDIOM, null, msgs);
      if (newIdiom != null)
        msgs = ((InternalEObject)newIdiom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EisPackage.VARIABLE__IDIOM, null, msgs);
      msgs = basicSetIdiom(newIdiom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__IDIOM, newIdiom, newIdiom));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__RANGE, oldRange, newRange);
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
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EisPackage.VARIABLE__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EisPackage.VARIABLE__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNextVariable()
  {
    return nextVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextVariable(boolean newNextVariable)
  {
    boolean oldNextVariable = nextVariable;
    nextVariable = newNextVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EisPackage.VARIABLE__NEXT_VARIABLE, oldNextVariable, nextVariable));
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
      case EisPackage.VARIABLE__IDIOM:
        return basicSetIdiom(null, msgs);
      case EisPackage.VARIABLE__RANGE:
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
      case EisPackage.VARIABLE__VARIANT_KEYWORD:
        return isVariantKeyword();
      case EisPackage.VARIABLE__VARIABLE_TYPE:
        return getVariableType();
      case EisPackage.VARIABLE__IDIOM:
        return getIdiom();
      case EisPackage.VARIABLE__RANGE:
        return getRange();
      case EisPackage.VARIABLE__NEXT_VARIABLE:
        return isNextVariable();
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
      case EisPackage.VARIABLE__VARIANT_KEYWORD:
        setVariantKeyword((Boolean)newValue);
        return;
      case EisPackage.VARIABLE__VARIABLE_TYPE:
        setVariableType((BasicType)newValue);
        return;
      case EisPackage.VARIABLE__IDIOM:
        setIdiom((Idiom)newValue);
        return;
      case EisPackage.VARIABLE__RANGE:
        setRange((Idiom)newValue);
        return;
      case EisPackage.VARIABLE__NEXT_VARIABLE:
        setNextVariable((Boolean)newValue);
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
      case EisPackage.VARIABLE__VARIANT_KEYWORD:
        setVariantKeyword(VARIANT_KEYWORD_EDEFAULT);
        return;
      case EisPackage.VARIABLE__VARIABLE_TYPE:
        setVariableType(VARIABLE_TYPE_EDEFAULT);
        return;
      case EisPackage.VARIABLE__IDIOM:
        setIdiom((Idiom)null);
        return;
      case EisPackage.VARIABLE__RANGE:
        setRange((Idiom)null);
        return;
      case EisPackage.VARIABLE__NEXT_VARIABLE:
        setNextVariable(NEXT_VARIABLE_EDEFAULT);
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
      case EisPackage.VARIABLE__VARIANT_KEYWORD:
        return variantKeyword != VARIANT_KEYWORD_EDEFAULT;
      case EisPackage.VARIABLE__VARIABLE_TYPE:
        return variableType != VARIABLE_TYPE_EDEFAULT;
      case EisPackage.VARIABLE__IDIOM:
        return idiom != null;
      case EisPackage.VARIABLE__RANGE:
        return range != null;
      case EisPackage.VARIABLE__NEXT_VARIABLE:
        return nextVariable != NEXT_VARIABLE_EDEFAULT;
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
    result.append(" (variantKeyword: ");
    result.append(variantKeyword);
    result.append(", variableType: ");
    result.append(variableType);
    result.append(", nextVariable: ");
    result.append(nextVariable);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
