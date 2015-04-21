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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkPrefix;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkVariableImpl extends MinimalEObjectImpl.Container implements ChkVariable
{
  /**
   * The cached value of the '{@link #getPref() <em>Pref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected ChkPrefix pref;

  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected EList<String> v;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkVariableImpl()
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
    return CheckerDslPackage.Literals.CHK_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkPrefix getPref()
  {
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPref(ChkPrefix newPref, NotificationChain msgs)
  {
    ChkPrefix oldPref = pref;
    pref = newPref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE__PREF, oldPref, newPref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPref(ChkPrefix newPref)
  {
    if (newPref != pref)
    {
      NotificationChain msgs = null;
      if (pref != null)
        msgs = ((InternalEObject)pref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLE__PREF, null, msgs);
      if (newPref != null)
        msgs = ((InternalEObject)newPref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLE__PREF, null, msgs);
      msgs = basicSetPref(newPref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE__PREF, newPref, newPref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getV()
  {
    if (v == null)
    {
      v = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.CHK_VARIABLE__V);
    }
    return v;
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
      case CheckerDslPackage.CHK_VARIABLE__PREF:
        return basicSetPref(null, msgs);
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
      case CheckerDslPackage.CHK_VARIABLE__PREF:
        return getPref();
      case CheckerDslPackage.CHK_VARIABLE__VAR:
        return getVar();
      case CheckerDslPackage.CHK_VARIABLE__V:
        return getV();
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
      case CheckerDslPackage.CHK_VARIABLE__PREF:
        setPref((ChkPrefix)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE__VAR:
        setVar((String)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE__V:
        getV().clear();
        getV().addAll((Collection<? extends String>)newValue);
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
      case CheckerDslPackage.CHK_VARIABLE__PREF:
        setPref((ChkPrefix)null);
        return;
      case CheckerDslPackage.CHK_VARIABLE__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_VARIABLE__V:
        getV().clear();
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
      case CheckerDslPackage.CHK_VARIABLE__PREF:
        return pref != null;
      case CheckerDslPackage.CHK_VARIABLE__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case CheckerDslPackage.CHK_VARIABLE__V:
        return v != null && !v.isEmpty();
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
    result.append(" (var: ");
    result.append(var);
    result.append(", v: ");
    result.append(v);
    result.append(')');
    return result.toString();
  }

} //ChkVariableImpl
