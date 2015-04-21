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
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.Subtask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl#getB <em>B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitImpl extends MinimalEObjectImpl.Container implements Limit
{
  /**
   * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSub()
   * @generated
   * @ordered
   */
  protected Subtask sub;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected EList<String> a;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected EList<String> b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LimitImpl()
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
    return CheckerDslPackage.Literals.LIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtask getSub()
  {
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSub(Subtask newSub, NotificationChain msgs)
  {
    Subtask oldSub = sub;
    sub = newSub;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.LIMIT__SUB, oldSub, newSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(Subtask newSub)
  {
    if (newSub != sub)
    {
      NotificationChain msgs = null;
      if (sub != null)
        msgs = ((InternalEObject)sub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.LIMIT__SUB, null, msgs);
      if (newSub != null)
        msgs = ((InternalEObject)newSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.LIMIT__SUB, null, msgs);
      msgs = basicSetSub(newSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.LIMIT__SUB, newSub, newSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getA()
  {
    if (a == null)
    {
      a = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.LIMIT__A);
    }
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getB()
  {
    if (b == null)
    {
      b = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.LIMIT__B);
    }
    return b;
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
      case CheckerDslPackage.LIMIT__SUB:
        return basicSetSub(null, msgs);
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
      case CheckerDslPackage.LIMIT__SUB:
        return getSub();
      case CheckerDslPackage.LIMIT__A:
        return getA();
      case CheckerDslPackage.LIMIT__B:
        return getB();
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
      case CheckerDslPackage.LIMIT__SUB:
        setSub((Subtask)newValue);
        return;
      case CheckerDslPackage.LIMIT__A:
        getA().clear();
        getA().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.LIMIT__B:
        getB().clear();
        getB().addAll((Collection<? extends String>)newValue);
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
      case CheckerDslPackage.LIMIT__SUB:
        setSub((Subtask)null);
        return;
      case CheckerDslPackage.LIMIT__A:
        getA().clear();
        return;
      case CheckerDslPackage.LIMIT__B:
        getB().clear();
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
      case CheckerDslPackage.LIMIT__SUB:
        return sub != null;
      case CheckerDslPackage.LIMIT__A:
        return a != null && !a.isEmpty();
      case CheckerDslPackage.LIMIT__B:
        return b != null && !b.isEmpty();
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
    result.append(" (a: ");
    result.append(a);
    result.append(", b: ");
    result.append(b);
    result.append(')');
    return result.toString();
  }

} //LimitImpl
