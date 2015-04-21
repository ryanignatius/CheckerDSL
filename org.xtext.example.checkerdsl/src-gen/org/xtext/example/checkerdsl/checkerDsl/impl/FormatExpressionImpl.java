/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl#getNum <em>Num</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormatExpressionImpl extends MinimalEObjectImpl.Container implements FormatExpression
{
  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final String NUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected String num = NUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected EList<String> var;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected EList<String> count;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormatExpressionImpl()
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
    return CheckerDslPackage.Literals.FORMAT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(String newNum)
  {
    String oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.FORMAT_EXPRESSION__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVar()
  {
    if (var == null)
    {
      var = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.FORMAT_EXPRESSION__VAR);
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCount()
  {
    if (count == null)
    {
      count = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.FORMAT_EXPRESSION__COUNT);
    }
    return count;
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
      case CheckerDslPackage.FORMAT_EXPRESSION__NUM:
        return getNum();
      case CheckerDslPackage.FORMAT_EXPRESSION__VAR:
        return getVar();
      case CheckerDslPackage.FORMAT_EXPRESSION__COUNT:
        return getCount();
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
      case CheckerDslPackage.FORMAT_EXPRESSION__NUM:
        setNum((String)newValue);
        return;
      case CheckerDslPackage.FORMAT_EXPRESSION__VAR:
        getVar().clear();
        getVar().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.FORMAT_EXPRESSION__COUNT:
        getCount().clear();
        getCount().addAll((Collection<? extends String>)newValue);
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
      case CheckerDslPackage.FORMAT_EXPRESSION__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case CheckerDslPackage.FORMAT_EXPRESSION__VAR:
        getVar().clear();
        return;
      case CheckerDslPackage.FORMAT_EXPRESSION__COUNT:
        getCount().clear();
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
      case CheckerDslPackage.FORMAT_EXPRESSION__NUM:
        return NUM_EDEFAULT == null ? num != null : !NUM_EDEFAULT.equals(num);
      case CheckerDslPackage.FORMAT_EXPRESSION__VAR:
        return var != null && !var.isEmpty();
      case CheckerDslPackage.FORMAT_EXPRESSION__COUNT:
        return count != null && !count.isEmpty();
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
    result.append(", var: ");
    result.append(var);
    result.append(", count: ");
    result.append(count);
    result.append(')');
    return result.toString();
  }

} //FormatExpressionImpl
