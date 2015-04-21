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

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ClassImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ClassImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends AbstractElementImpl implements org.xtext.example.checkerdsl.checkerDsl.Class
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference superType;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return CheckerDslPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(JvmTypeReference newSuperType, NotificationChain msgs)
  {
    JvmTypeReference oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CLASS__SUPER_TYPE, oldSuperType, newSuperType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(JvmTypeReference newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CLASS__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CLASS__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CLASS__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, CheckerDslPackage.CLASS__FEATURES);
    }
    return features;
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
      case CheckerDslPackage.CLASS__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case CheckerDslPackage.CLASS__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case CheckerDslPackage.CLASS__SUPER_TYPE:
        return getSuperType();
      case CheckerDslPackage.CLASS__FEATURES:
        return getFeatures();
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
      case CheckerDslPackage.CLASS__SUPER_TYPE:
        setSuperType((JvmTypeReference)newValue);
        return;
      case CheckerDslPackage.CLASS__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
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
      case CheckerDslPackage.CLASS__SUPER_TYPE:
        setSuperType((JvmTypeReference)null);
        return;
      case CheckerDslPackage.CLASS__FEATURES:
        getFeatures().clear();
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
      case CheckerDslPackage.CLASS__SUPER_TYPE:
        return superType != null;
      case CheckerDslPackage.CLASS__FEATURES:
        return features != null && !features.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
