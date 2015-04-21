/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl#getOpr <em>Opr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl#getV2 <em>V2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkRelationalExpressionImpl extends ChkRelationalExpressionsImpl implements ChkRelationalExpression
{
  /**
   * The cached value of the '{@link #getV1() <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected ChkVariables v1;

  /**
   * The default value of the '{@link #getOpr() <em>Opr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpr()
   * @generated
   * @ordered
   */
  protected static final String OPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpr() <em>Opr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpr()
   * @generated
   * @ordered
   */
  protected String opr = OPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected ChkVariables v2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkRelationalExpressionImpl()
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
    return CheckerDslPackage.Literals.CHK_RELATIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariables getV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV1(ChkVariables newV1, NotificationChain msgs)
  {
    ChkVariables oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1, oldV1, newV1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(ChkVariables newV1)
  {
    if (newV1 != v1)
    {
      NotificationChain msgs = null;
      if (v1 != null)
        msgs = ((InternalEObject)v1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1, null, msgs);
      if (newV1 != null)
        msgs = ((InternalEObject)newV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1, null, msgs);
      msgs = basicSetV1(newV1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1, newV1, newV1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpr()
  {
    return opr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpr(String newOpr)
  {
    String oldOpr = opr;
    opr = newOpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__OPR, oldOpr, opr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariables getV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV2(ChkVariables newV2, NotificationChain msgs)
  {
    ChkVariables oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2, oldV2, newV2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(ChkVariables newV2)
  {
    if (newV2 != v2)
    {
      NotificationChain msgs = null;
      if (v2 != null)
        msgs = ((InternalEObject)v2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2, null, msgs);
      if (newV2 != null)
        msgs = ((InternalEObject)newV2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2, null, msgs);
      msgs = basicSetV2(newV2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2, newV2, newV2));
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
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1:
        return basicSetV1(null, msgs);
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2:
        return basicSetV2(null, msgs);
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
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1:
        return getV1();
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__OPR:
        return getOpr();
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2:
        return getV2();
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
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1:
        setV1((ChkVariables)newValue);
        return;
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__OPR:
        setOpr((String)newValue);
        return;
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2:
        setV2((ChkVariables)newValue);
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
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1:
        setV1((ChkVariables)null);
        return;
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__OPR:
        setOpr(OPR_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2:
        setV2((ChkVariables)null);
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
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V1:
        return v1 != null;
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__OPR:
        return OPR_EDEFAULT == null ? opr != null : !OPR_EDEFAULT.equals(opr);
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION__V2:
        return v2 != null;
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
    result.append(" (opr: ");
    result.append(opr);
    result.append(')');
    return result.toString();
  }

} //ChkRelationalExpressionImpl
