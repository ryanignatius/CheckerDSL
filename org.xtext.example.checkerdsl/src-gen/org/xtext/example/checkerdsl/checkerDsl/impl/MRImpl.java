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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.FollowUp;
import org.xtext.example.checkerdsl.checkerDsl.MR;
import org.xtext.example.checkerdsl.checkerDsl.Property;

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
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl#getMrExp <em>Mr Exp</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl#getFollowup <em>Followup</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl#getProperty <em>Property</em>}</li>
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
   * The cached value of the '{@link #getMrExp() <em>Mr Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMrExp()
   * @generated
   * @ordered
   */
  protected EList<EObject> mrExp;

  /**
   * The cached value of the '{@link #getFollowup() <em>Followup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowup()
   * @generated
   * @ordered
   */
  protected FollowUp followup;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

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
  public EList<EObject> getMrExp()
  {
    if (mrExp == null)
    {
      mrExp = new EObjectContainmentEList<EObject>(EObject.class, this, CheckerDslPackage.MR__MR_EXP);
    }
    return mrExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FollowUp getFollowup()
  {
    return followup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFollowup(FollowUp newFollowup, NotificationChain msgs)
  {
    FollowUp oldFollowup = followup;
    followup = newFollowup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.MR__FOLLOWUP, oldFollowup, newFollowup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFollowup(FollowUp newFollowup)
  {
    if (newFollowup != followup)
    {
      NotificationChain msgs = null;
      if (followup != null)
        msgs = ((InternalEObject)followup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.MR__FOLLOWUP, null, msgs);
      if (newFollowup != null)
        msgs = ((InternalEObject)newFollowup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.MR__FOLLOWUP, null, msgs);
      msgs = basicSetFollowup(newFollowup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.MR__FOLLOWUP, newFollowup, newFollowup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.MR__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.MR__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.MR__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.MR__PROPERTY, newProperty, newProperty));
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
      case CheckerDslPackage.MR__MR_EXP:
        return ((InternalEList<?>)getMrExp()).basicRemove(otherEnd, msgs);
      case CheckerDslPackage.MR__FOLLOWUP:
        return basicSetFollowup(null, msgs);
      case CheckerDslPackage.MR__PROPERTY:
        return basicSetProperty(null, msgs);
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
      case CheckerDslPackage.MR__MR_EXP:
        return getMrExp();
      case CheckerDslPackage.MR__FOLLOWUP:
        return getFollowup();
      case CheckerDslPackage.MR__PROPERTY:
        return getProperty();
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
      case CheckerDslPackage.MR__MR_EXP:
        getMrExp().clear();
        getMrExp().addAll((Collection<? extends EObject>)newValue);
        return;
      case CheckerDslPackage.MR__FOLLOWUP:
        setFollowup((FollowUp)newValue);
        return;
      case CheckerDslPackage.MR__PROPERTY:
        setProperty((Property)newValue);
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
      case CheckerDslPackage.MR__MR_EXP:
        getMrExp().clear();
        return;
      case CheckerDslPackage.MR__FOLLOWUP:
        setFollowup((FollowUp)null);
        return;
      case CheckerDslPackage.MR__PROPERTY:
        setProperty((Property)null);
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
      case CheckerDslPackage.MR__MR_EXP:
        return mrExp != null && !mrExp.isEmpty();
      case CheckerDslPackage.MR__FOLLOWUP:
        return followup != null;
      case CheckerDslPackage.MR__PROPERTY:
        return property != null;
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
