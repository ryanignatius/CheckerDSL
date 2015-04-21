/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkPrefix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkPrefixImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkPrefixImpl#getNewtest <em>Newtest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkPrefixImpl extends MinimalEObjectImpl.Container implements ChkPrefix
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getNewtest() <em>Newtest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewtest()
   * @generated
   * @ordered
   */
  protected static final String NEWTEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewtest() <em>Newtest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewtest()
   * @generated
   * @ordered
   */
  protected String newtest = NEWTEST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkPrefixImpl()
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
    return CheckerDslPackage.Literals.CHK_PREFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_PREFIX__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewtest()
  {
    return newtest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewtest(String newNewtest)
  {
    String oldNewtest = newtest;
    newtest = newNewtest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_PREFIX__NEWTEST, oldNewtest, newtest));
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
      case CheckerDslPackage.CHK_PREFIX__TYPE:
        return getType();
      case CheckerDslPackage.CHK_PREFIX__NEWTEST:
        return getNewtest();
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
      case CheckerDslPackage.CHK_PREFIX__TYPE:
        setType((String)newValue);
        return;
      case CheckerDslPackage.CHK_PREFIX__NEWTEST:
        setNewtest((String)newValue);
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
      case CheckerDslPackage.CHK_PREFIX__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_PREFIX__NEWTEST:
        setNewtest(NEWTEST_EDEFAULT);
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
      case CheckerDslPackage.CHK_PREFIX__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case CheckerDslPackage.CHK_PREFIX__NEWTEST:
        return NEWTEST_EDEFAULT == null ? newtest != null : !NEWTEST_EDEFAULT.equals(newtest);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", newtest: ");
    result.append(newtest);
    result.append(')');
    return result.toString();
  }

} //ChkPrefixImpl
