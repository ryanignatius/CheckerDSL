/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.Subtask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.SubtaskImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtaskImpl extends MinimalEObjectImpl.Container implements Subtask
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtaskImpl()
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
    return CheckerDslPackage.Literals.SUBTASK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.SUBTASK__NUM, oldNum, num));
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
      case CheckerDslPackage.SUBTASK__NUM:
        return getNum();
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
      case CheckerDslPackage.SUBTASK__NUM:
        setNum((Integer)newValue);
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
      case CheckerDslPackage.SUBTASK__NUM:
        setNum(NUM_EDEFAULT);
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
      case CheckerDslPackage.SUBTASK__NUM:
        return num != NUM_EDEFAULT;
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
    result.append(" (num: ");
    result.append(num);
    result.append(')');
    return result.toString();
  }

} //SubtaskImpl
