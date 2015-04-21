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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl#getSz <em>Sz</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends FeatureImpl implements Property
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
   * The cached value of the '{@link #getSz() <em>Sz</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSz()
   * @generated
   * @ordered
   */
  protected EList<String> sz;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected EList<Limit> limit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return CheckerDslPackage.Literals.PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSz()
  {
    if (sz == null)
    {
      sz = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.PROPERTY__SZ);
    }
    return sz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Limit> getLimit()
  {
    if (limit == null)
    {
      limit = new EObjectContainmentEList<Limit>(Limit.class, this, CheckerDslPackage.PROPERTY__LIMIT);
    }
    return limit;
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
      case CheckerDslPackage.PROPERTY__LIMIT:
        return ((InternalEList<?>)getLimit()).basicRemove(otherEnd, msgs);
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
      case CheckerDslPackage.PROPERTY__TYPE:
        return getType();
      case CheckerDslPackage.PROPERTY__SZ:
        return getSz();
      case CheckerDslPackage.PROPERTY__NAME:
        return getName();
      case CheckerDslPackage.PROPERTY__LIMIT:
        return getLimit();
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
      case CheckerDslPackage.PROPERTY__TYPE:
        setType((String)newValue);
        return;
      case CheckerDslPackage.PROPERTY__SZ:
        getSz().clear();
        getSz().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case CheckerDslPackage.PROPERTY__LIMIT:
        getLimit().clear();
        getLimit().addAll((Collection<? extends Limit>)newValue);
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
      case CheckerDslPackage.PROPERTY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CheckerDslPackage.PROPERTY__SZ:
        getSz().clear();
        return;
      case CheckerDslPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CheckerDslPackage.PROPERTY__LIMIT:
        getLimit().clear();
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
      case CheckerDslPackage.PROPERTY__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case CheckerDslPackage.PROPERTY__SZ:
        return sz != null && !sz.isEmpty();
      case CheckerDslPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CheckerDslPackage.PROPERTY__LIMIT:
        return limit != null && !limit.isEmpty();
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
    result.append(", sz: ");
    result.append(sz);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
