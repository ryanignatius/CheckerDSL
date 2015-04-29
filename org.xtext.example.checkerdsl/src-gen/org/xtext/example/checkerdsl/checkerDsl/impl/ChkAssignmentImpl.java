/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkAssignment;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl#getOpr <em>Opr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl#getV2 <em>V2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkAssignmentImpl extends ChkGeneralExpressionsImpl implements ChkAssignment
{
  /**
   * The default value of the '{@link #getDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected static final String DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected String def = DEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getV1() <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected ChkVariable v1;

  /**
   * The default value of the '{@link #getOpr() <em>Opr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpr()
   * @generated
   * @ordered
   */
  protected static final String OPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpr() <em>Opr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpr()
   * @generated
   * @ordered
   */
  protected String opr = OPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected EObject v2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkAssignmentImpl()
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
    return CheckerDslPackage.Literals.CHK_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(String newDef)
  {
    String oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_ASSIGNMENT__DEF, oldDef, def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariable getV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV1(ChkVariable newV1, NotificationChain msgs)
  {
    ChkVariable oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_ASSIGNMENT__V1, oldV1, newV1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(ChkVariable newV1)
  {
    if (newV1 != v1)
    {
      NotificationChain msgs = null;
      if (v1 != null)
        msgs = ((InternalEObject)v1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_ASSIGNMENT__V1, null, msgs);
      if (newV1 != null)
        msgs = ((InternalEObject)newV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_ASSIGNMENT__V1, null, msgs);
      msgs = basicSetV1(newV1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_ASSIGNMENT__V1, newV1, newV1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpr()
  {
    return opr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpr(String newOpr)
  {
    String oldOpr = opr;
    opr = newOpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_ASSIGNMENT__OPR, oldOpr, opr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV2(EObject newV2, NotificationChain msgs)
  {
    EObject oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_ASSIGNMENT__V2, oldV2, newV2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(EObject newV2)
  {
    if (newV2 != v2)
    {
      NotificationChain msgs = null;
      if (v2 != null)
        msgs = ((InternalEObject)v2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_ASSIGNMENT__V2, null, msgs);
      if (newV2 != null)
        msgs = ((InternalEObject)newV2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_ASSIGNMENT__V2, null, msgs);
      msgs = basicSetV2(newV2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_ASSIGNMENT__V2, newV2, newV2));
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
      case CheckerDslPackage.CHK_ASSIGNMENT__V1:
        return basicSetV1(null, msgs);
      case CheckerDslPackage.CHK_ASSIGNMENT__V2:
        return basicSetV2(null, msgs);
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
      case CheckerDslPackage.CHK_ASSIGNMENT__DEF:
        return getDef();
      case CheckerDslPackage.CHK_ASSIGNMENT__V1:
        return getV1();
      case CheckerDslPackage.CHK_ASSIGNMENT__OPR:
        return getOpr();
      case CheckerDslPackage.CHK_ASSIGNMENT__V2:
        return getV2();
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
      case CheckerDslPackage.CHK_ASSIGNMENT__DEF:
        setDef((String)newValue);
        return;
      case CheckerDslPackage.CHK_ASSIGNMENT__V1:
        setV1((ChkVariable)newValue);
        return;
      case CheckerDslPackage.CHK_ASSIGNMENT__OPR:
        setOpr((String)newValue);
        return;
      case CheckerDslPackage.CHK_ASSIGNMENT__V2:
        setV2((EObject)newValue);
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
      case CheckerDslPackage.CHK_ASSIGNMENT__DEF:
        setDef(DEF_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_ASSIGNMENT__V1:
        setV1((ChkVariable)null);
        return;
      case CheckerDslPackage.CHK_ASSIGNMENT__OPR:
        setOpr(OPR_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_ASSIGNMENT__V2:
        setV2((EObject)null);
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
      case CheckerDslPackage.CHK_ASSIGNMENT__DEF:
        return DEF_EDEFAULT == null ? def != null : !DEF_EDEFAULT.equals(def);
      case CheckerDslPackage.CHK_ASSIGNMENT__V1:
        return v1 != null;
      case CheckerDslPackage.CHK_ASSIGNMENT__OPR:
        return OPR_EDEFAULT == null ? opr != null : !OPR_EDEFAULT.equals(opr);
      case CheckerDslPackage.CHK_ASSIGNMENT__V2:
        return v2 != null;
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
    result.append(" (def: ");
    result.append(def);
    result.append(", opr: ");
    result.append(opr);
    result.append(')');
    return result.toString();
  }

} //ChkAssignmentImpl
