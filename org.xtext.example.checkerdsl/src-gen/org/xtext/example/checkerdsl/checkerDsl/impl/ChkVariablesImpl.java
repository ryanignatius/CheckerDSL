/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl#getVa <em>Va</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl#getNu <em>Nu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkVariablesImpl extends MinimalEObjectImpl.Container implements ChkVariables
{
  /**
   * The cached value of the '{@link #getVa() <em>Va</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVa()
   * @generated
   * @ordered
   */
  protected ChkVariable va;

  /**
   * The default value of the '{@link #getNu() <em>Nu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNu()
   * @generated
   * @ordered
   */
  protected static final int NU_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNu() <em>Nu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNu()
   * @generated
   * @ordered
   */
  protected int nu = NU_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkVariablesImpl()
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
    return CheckerDslPackage.Literals.CHK_VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariable getVa()
  {
    return va;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVa(ChkVariable newVa, NotificationChain msgs)
  {
    ChkVariable oldVa = va;
    va = newVa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLES__VA, oldVa, newVa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVa(ChkVariable newVa)
  {
    if (newVa != va)
    {
      NotificationChain msgs = null;
      if (va != null)
        msgs = ((InternalEObject)va).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLES__VA, null, msgs);
      if (newVa != null)
        msgs = ((InternalEObject)newVa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLES__VA, null, msgs);
      msgs = basicSetVa(newVa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLES__VA, newVa, newVa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNu()
  {
    return nu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNu(int newNu)
  {
    int oldNu = nu;
    nu = newNu;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLES__NU, oldNu, nu));
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
      case CheckerDslPackage.CHK_VARIABLES__VA:
        return basicSetVa(null, msgs);
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
      case CheckerDslPackage.CHK_VARIABLES__VA:
        return getVa();
      case CheckerDslPackage.CHK_VARIABLES__NU:
        return getNu();
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
      case CheckerDslPackage.CHK_VARIABLES__VA:
        setVa((ChkVariable)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLES__NU:
        setNu((Integer)newValue);
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
      case CheckerDslPackage.CHK_VARIABLES__VA:
        setVa((ChkVariable)null);
        return;
      case CheckerDslPackage.CHK_VARIABLES__NU:
        setNu(NU_EDEFAULT);
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
      case CheckerDslPackage.CHK_VARIABLES__VA:
        return va != null;
      case CheckerDslPackage.CHK_VARIABLES__NU:
        return nu != NU_EDEFAULT;
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
    result.append(" (nu: ");
    result.append(nu);
    result.append(')');
    return result.toString();
  }

} //ChkVariablesImpl
