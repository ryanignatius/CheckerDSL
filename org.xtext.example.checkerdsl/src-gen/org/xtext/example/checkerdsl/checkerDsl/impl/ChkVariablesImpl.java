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
import org.xtext.example.checkerdsl.checkerDsl.ChkItemGroup;
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
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl#getGr <em>Gr</em>}</li>
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
  protected static final String NU_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNu() <em>Nu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNu()
   * @generated
   * @ordered
   */
  protected String nu = NU_EDEFAULT;

  /**
   * The cached value of the '{@link #getGr() <em>Gr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGr()
   * @generated
   * @ordered
   */
  protected ChkItemGroup gr;

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
  public String getNu()
  {
    return nu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNu(String newNu)
  {
    String oldNu = nu;
    nu = newNu;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLES__NU, oldNu, nu));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkItemGroup getGr()
  {
    return gr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGr(ChkItemGroup newGr, NotificationChain msgs)
  {
    ChkItemGroup oldGr = gr;
    gr = newGr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLES__GR, oldGr, newGr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGr(ChkItemGroup newGr)
  {
    if (newGr != gr)
    {
      NotificationChain msgs = null;
      if (gr != null)
        msgs = ((InternalEObject)gr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLES__GR, null, msgs);
      if (newGr != null)
        msgs = ((InternalEObject)newGr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLES__GR, null, msgs);
      msgs = basicSetGr(newGr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLES__GR, newGr, newGr));
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
      case CheckerDslPackage.CHK_VARIABLES__GR:
        return basicSetGr(null, msgs);
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
      case CheckerDslPackage.CHK_VARIABLES__GR:
        return getGr();
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
        setNu((String)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLES__GR:
        setGr((ChkItemGroup)newValue);
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
      case CheckerDslPackage.CHK_VARIABLES__GR:
        setGr((ChkItemGroup)null);
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
        return NU_EDEFAULT == null ? nu != null : !NU_EDEFAULT.equals(nu);
      case CheckerDslPackage.CHK_VARIABLES__GR:
        return gr != null;
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
