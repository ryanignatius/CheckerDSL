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
import org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.SpValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getArr <em>Arr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getSz <em>Sz</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getLimit1 <em>Limit1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl#getSpValue <em>Sp Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkVariableDeclarationImpl extends FeatureImpl implements ChkVariableDeclaration
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
   * The cached value of the '{@link #getArr() <em>Arr</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArr()
   * @generated
   * @ordered
   */
  protected EList<String> arr;

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
   * The cached value of the '{@link #getLimit1() <em>Limit1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit1()
   * @generated
   * @ordered
   */
  protected Limit limit1;

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
   * The cached value of the '{@link #getSpValue() <em>Sp Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpValue()
   * @generated
   * @ordered
   */
  protected SpValue spValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkVariableDeclarationImpl()
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
    return CheckerDslPackage.Literals.CHK_VARIABLE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE_DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArr()
  {
    if (arr == null)
    {
      arr = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.CHK_VARIABLE_DECLARATION__ARR);
    }
    return arr;
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
      sz = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.CHK_VARIABLE_DECLARATION__SZ);
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
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit getLimit1()
  {
    return limit1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimit1(Limit newLimit1, NotificationChain msgs)
  {
    Limit oldLimit1 = limit1;
    limit1 = newLimit1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1, oldLimit1, newLimit1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit1(Limit newLimit1)
  {
    if (newLimit1 != limit1)
    {
      NotificationChain msgs = null;
      if (limit1 != null)
        msgs = ((InternalEObject)limit1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1, null, msgs);
      if (newLimit1 != null)
        msgs = ((InternalEObject)newLimit1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1, null, msgs);
      msgs = basicSetLimit1(newLimit1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1, newLimit1, newLimit1));
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
      limit = new EObjectContainmentEList<Limit>(Limit.class, this, CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT);
    }
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpValue getSpValue()
  {
    return spValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpValue(SpValue newSpValue, NotificationChain msgs)
  {
    SpValue oldSpValue = spValue;
    spValue = newSpValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE, oldSpValue, newSpValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpValue(SpValue newSpValue)
  {
    if (newSpValue != spValue)
    {
      NotificationChain msgs = null;
      if (spValue != null)
        msgs = ((InternalEObject)spValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE, null, msgs);
      if (newSpValue != null)
        msgs = ((InternalEObject)newSpValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE, null, msgs);
      msgs = basicSetSpValue(newSpValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE, newSpValue, newSpValue));
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
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1:
        return basicSetLimit1(null, msgs);
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT:
        return ((InternalEList<?>)getLimit()).basicRemove(otherEnd, msgs);
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE:
        return basicSetSpValue(null, msgs);
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
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__TYPE:
        return getType();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__ARR:
        return getArr();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SZ:
        return getSz();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__NAME:
        return getName();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1:
        return getLimit1();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT:
        return getLimit();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE:
        return getSpValue();
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
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__TYPE:
        setType((String)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__ARR:
        getArr().clear();
        getArr().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SZ:
        getSz().clear();
        getSz().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1:
        setLimit1((Limit)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT:
        getLimit().clear();
        getLimit().addAll((Collection<? extends Limit>)newValue);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE:
        setSpValue((SpValue)newValue);
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
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__ARR:
        getArr().clear();
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SZ:
        getSz().clear();
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1:
        setLimit1((Limit)null);
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT:
        getLimit().clear();
        return;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE:
        setSpValue((SpValue)null);
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
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__ARR:
        return arr != null && !arr.isEmpty();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SZ:
        return sz != null && !sz.isEmpty();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT1:
        return limit1 != null;
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__LIMIT:
        return limit != null && !limit.isEmpty();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION__SP_VALUE:
        return spValue != null;
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
    result.append(", arr: ");
    result.append(arr);
    result.append(", sz: ");
    result.append(sz);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ChkVariableDeclarationImpl
