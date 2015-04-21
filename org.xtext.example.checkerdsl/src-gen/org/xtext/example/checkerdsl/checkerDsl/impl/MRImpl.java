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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.MR;
import org.xtext.example.checkerdsl.checkerDsl.MrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl#getMr <em>Mr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl#getNum <em>Num</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl#getMrExpression <em>Mr Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRImpl extends FeatureImpl implements MR
{
  /**
   * The default value of the '{@link #getMr() <em>Mr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMr()
   * @generated
   * @ordered
   */
  protected static final String MR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMr() <em>Mr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMr()
   * @generated
   * @ordered
   */
  protected String mr = MR_EDEFAULT;

  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final int NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected int num = NUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getMrExpression() <em>Mr Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMrExpression()
   * @generated
   * @ordered
   */
  protected EList<MrExpression> mrExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MRImpl()
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
    return CheckerDslPackage.Literals.MR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMr()
  {
    return mr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMr(String newMr)
  {
    String oldMr = mr;
    mr = newMr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.MR__MR, oldMr, mr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(int newNum)
  {
    int oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.MR__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MrExpression> getMrExpression()
  {
    if (mrExpression == null)
    {
      mrExpression = new EObjectContainmentEList<MrExpression>(MrExpression.class, this, CheckerDslPackage.MR__MR_EXPRESSION);
    }
    return mrExpression;
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
      case CheckerDslPackage.MR__MR_EXPRESSION:
        return ((InternalEList<?>)getMrExpression()).basicRemove(otherEnd, msgs);
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
      case CheckerDslPackage.MR__MR:
        return getMr();
      case CheckerDslPackage.MR__NUM:
        return getNum();
      case CheckerDslPackage.MR__MR_EXPRESSION:
        return getMrExpression();
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
      case CheckerDslPackage.MR__MR:
        setMr((String)newValue);
        return;
      case CheckerDslPackage.MR__NUM:
        setNum((Integer)newValue);
        return;
      case CheckerDslPackage.MR__MR_EXPRESSION:
        getMrExpression().clear();
        getMrExpression().addAll((Collection<? extends MrExpression>)newValue);
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
      case CheckerDslPackage.MR__MR:
        setMr(MR_EDEFAULT);
        return;
      case CheckerDslPackage.MR__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case CheckerDslPackage.MR__MR_EXPRESSION:
        getMrExpression().clear();
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
      case CheckerDslPackage.MR__MR:
        return MR_EDEFAULT == null ? mr != null : !MR_EDEFAULT.equals(mr);
      case CheckerDslPackage.MR__NUM:
        return num != NUM_EDEFAULT;
      case CheckerDslPackage.MR__MR_EXPRESSION:
        return mrExpression != null && !mrExpression.isEmpty();
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
    result.append(" (mr: ");
    result.append(mr);
    result.append(", num: ");
    result.append(num);
    result.append(')');
    return result.toString();
  }

} //MRImpl
