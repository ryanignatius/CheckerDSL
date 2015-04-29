/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

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

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;
import org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression;
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Format Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl#getMaxIndex <em>Max Index</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForFormatExpressionImpl extends MinimalEObjectImpl.Container implements ForFormatExpression
{
  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected ChkVariable index;

  /**
   * The cached value of the '{@link #getMaxIndex() <em>Max Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxIndex()
   * @generated
   * @ordered
   */
  protected ChkVariables maxIndex;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected EList<FormatExpression> ex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForFormatExpressionImpl()
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
    return CheckerDslPackage.Literals.FOR_FORMAT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariable getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(ChkVariable newIndex, NotificationChain msgs)
  {
    ChkVariable oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(ChkVariable newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX, newIndex, newIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariables getMaxIndex()
  {
    return maxIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxIndex(ChkVariables newMaxIndex, NotificationChain msgs)
  {
    ChkVariables oldMaxIndex = maxIndex;
    maxIndex = newMaxIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX, oldMaxIndex, newMaxIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxIndex(ChkVariables newMaxIndex)
  {
    if (newMaxIndex != maxIndex)
    {
      NotificationChain msgs = null;
      if (maxIndex != null)
        msgs = ((InternalEObject)maxIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX, null, msgs);
      if (newMaxIndex != null)
        msgs = ((InternalEObject)newMaxIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX, null, msgs);
      msgs = basicSetMaxIndex(newMaxIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX, newMaxIndex, newMaxIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormatExpression> getEx()
  {
    if (ex == null)
    {
      ex = new EObjectContainmentEList<FormatExpression>(FormatExpression.class, this, CheckerDslPackage.FOR_FORMAT_EXPRESSION__EX);
    }
    return ex;
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
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX:
        return basicSetIndex(null, msgs);
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX:
        return basicSetMaxIndex(null, msgs);
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__EX:
        return ((InternalEList<?>)getEx()).basicRemove(otherEnd, msgs);
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
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX:
        return getIndex();
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX:
        return getMaxIndex();
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__EX:
        return getEx();
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
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX:
        setIndex((ChkVariable)newValue);
        return;
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX:
        setMaxIndex((ChkVariables)newValue);
        return;
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__EX:
        getEx().clear();
        getEx().addAll((Collection<? extends FormatExpression>)newValue);
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
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX:
        setIndex((ChkVariable)null);
        return;
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX:
        setMaxIndex((ChkVariables)null);
        return;
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__EX:
        getEx().clear();
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
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__INDEX:
        return index != null;
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__MAX_INDEX:
        return maxIndex != null;
      case CheckerDslPackage.FOR_FORMAT_EXPRESSION__EX:
        return ex != null && !ex.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForFormatExpressionImpl
