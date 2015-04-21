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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpressions;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getAsg <em>Asg</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkExpressionImpl extends MinimalEObjectImpl.Container implements ChkExpression
{
  /**
   * The default value of the '{@link #getAsg() <em>Asg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsg()
   * @generated
   * @ordered
   */
  protected static final String ASG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAsg() <em>Asg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsg()
   * @generated
   * @ordered
   */
  protected String asg = ASG_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected ChkRelationalExpressions exp;

  /**
   * The default value of the '{@link #getWhere() <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected static final String WHERE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected String where = WHERE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected EList<ChkRelationalExpression> cond;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<String> type;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected ChkVariable v;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkExpressionImpl()
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
    return CheckerDslPackage.Literals.CHK_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAsg()
  {
    return asg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsg(String newAsg)
  {
    String oldAsg = asg;
    asg = newAsg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__ASG, oldAsg, asg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkRelationalExpressions getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(ChkRelationalExpressions newExp, NotificationChain msgs)
  {
    ChkRelationalExpressions oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(ChkRelationalExpressions newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_EXPRESSION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_EXPRESSION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhere(String newWhere)
  {
    String oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__WHERE, oldWhere, where));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChkRelationalExpression> getCond()
  {
    if (cond == null)
    {
      cond = new EObjectContainmentEList<ChkRelationalExpression>(ChkRelationalExpression.class, this, CheckerDslPackage.CHK_EXPRESSION__COND);
    }
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getType()
  {
    if (type == null)
    {
      type = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.CHK_EXPRESSION__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariable getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(ChkVariable newV, NotificationChain msgs)
  {
    ChkVariable oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(ChkVariable newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_EXPRESSION__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.CHK_EXPRESSION__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_EXPRESSION__V, newV, newV));
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
      case CheckerDslPackage.CHK_EXPRESSION__EXP:
        return basicSetExp(null, msgs);
      case CheckerDslPackage.CHK_EXPRESSION__COND:
        return ((InternalEList<?>)getCond()).basicRemove(otherEnd, msgs);
      case CheckerDslPackage.CHK_EXPRESSION__V:
        return basicSetV(null, msgs);
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
      case CheckerDslPackage.CHK_EXPRESSION__ASG:
        return getAsg();
      case CheckerDslPackage.CHK_EXPRESSION__EXP:
        return getExp();
      case CheckerDslPackage.CHK_EXPRESSION__WHERE:
        return getWhere();
      case CheckerDslPackage.CHK_EXPRESSION__COND:
        return getCond();
      case CheckerDslPackage.CHK_EXPRESSION__TYPE:
        return getType();
      case CheckerDslPackage.CHK_EXPRESSION__OP:
        return getOp();
      case CheckerDslPackage.CHK_EXPRESSION__V:
        return getV();
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
      case CheckerDslPackage.CHK_EXPRESSION__ASG:
        setAsg((String)newValue);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__EXP:
        setExp((ChkRelationalExpressions)newValue);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__WHERE:
        setWhere((String)newValue);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__COND:
        getCond().clear();
        getCond().addAll((Collection<? extends ChkRelationalExpression>)newValue);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__V:
        setV((ChkVariable)newValue);
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
      case CheckerDslPackage.CHK_EXPRESSION__ASG:
        setAsg(ASG_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__EXP:
        setExp((ChkRelationalExpressions)null);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__WHERE:
        setWhere(WHERE_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__COND:
        getCond().clear();
        return;
      case CheckerDslPackage.CHK_EXPRESSION__TYPE:
        getType().clear();
        return;
      case CheckerDslPackage.CHK_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_EXPRESSION__V:
        setV((ChkVariable)null);
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
      case CheckerDslPackage.CHK_EXPRESSION__ASG:
        return ASG_EDEFAULT == null ? asg != null : !ASG_EDEFAULT.equals(asg);
      case CheckerDslPackage.CHK_EXPRESSION__EXP:
        return exp != null;
      case CheckerDslPackage.CHK_EXPRESSION__WHERE:
        return WHERE_EDEFAULT == null ? where != null : !WHERE_EDEFAULT.equals(where);
      case CheckerDslPackage.CHK_EXPRESSION__COND:
        return cond != null && !cond.isEmpty();
      case CheckerDslPackage.CHK_EXPRESSION__TYPE:
        return type != null && !type.isEmpty();
      case CheckerDslPackage.CHK_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case CheckerDslPackage.CHK_EXPRESSION__V:
        return v != null;
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
    result.append(" (asg: ");
    result.append(asg);
    result.append(", where: ");
    result.append(where);
    result.append(", type: ");
    result.append(type);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ChkExpressionImpl
