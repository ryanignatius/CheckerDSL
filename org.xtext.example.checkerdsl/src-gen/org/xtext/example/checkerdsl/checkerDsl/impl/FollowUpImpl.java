/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.FollowUp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Follow Up</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.FollowUpImpl#getFol <em>Fol</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.FollowUpImpl#getFollowups <em>Followups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FollowUpImpl extends MinimalEObjectImpl.Container implements FollowUp
{
  /**
   * The default value of the '{@link #getFol() <em>Fol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFol()
   * @generated
   * @ordered
   */
  protected static final String FOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFol() <em>Fol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFol()
   * @generated
   * @ordered
   */
  protected String fol = FOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getFollowups() <em>Followups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowups()
   * @generated
   * @ordered
   */
  protected EList<EObject> followups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FollowUpImpl()
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
    return CheckerDslPackage.Literals.FOLLOW_UP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFol()
  {
    return fol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFol(String newFol)
  {
    String oldFol = fol;
    fol = newFol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.FOLLOW_UP__FOL, oldFol, fol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getFollowups()
  {
    if (followups == null)
    {
      followups = new EObjectContainmentEList<EObject>(EObject.class, this, CheckerDslPackage.FOLLOW_UP__FOLLOWUPS);
    }
    return followups;
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
      case CheckerDslPackage.FOLLOW_UP__FOLLOWUPS:
        return ((InternalEList<?>)getFollowups()).basicRemove(otherEnd, msgs);
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
      case CheckerDslPackage.FOLLOW_UP__FOL:
        return getFol();
      case CheckerDslPackage.FOLLOW_UP__FOLLOWUPS:
        return getFollowups();
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
      case CheckerDslPackage.FOLLOW_UP__FOL:
        setFol((String)newValue);
        return;
      case CheckerDslPackage.FOLLOW_UP__FOLLOWUPS:
        getFollowups().clear();
        getFollowups().addAll((Collection<? extends EObject>)newValue);
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
      case CheckerDslPackage.FOLLOW_UP__FOL:
        setFol(FOL_EDEFAULT);
        return;
      case CheckerDslPackage.FOLLOW_UP__FOLLOWUPS:
        getFollowups().clear();
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
      case CheckerDslPackage.FOLLOW_UP__FOL:
        return FOL_EDEFAULT == null ? fol != null : !FOL_EDEFAULT.equals(fol);
      case CheckerDslPackage.FOLLOW_UP__FOLLOWUPS:
        return followups != null && !followups.isEmpty();
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
    result.append(" (fol: ");
    result.append(fol);
    result.append(')');
    return result.toString();
  }

} //FollowUpImpl
