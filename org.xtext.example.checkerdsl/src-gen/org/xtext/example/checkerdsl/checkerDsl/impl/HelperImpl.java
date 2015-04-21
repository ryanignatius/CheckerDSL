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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;
import org.xtext.example.checkerdsl.checkerDsl.Helper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getPrime <em>Prime</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar3 <em>Var3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperImpl extends ChkRelationalExpressionsImpl implements Helper
{
  /**
   * The default value of the '{@link #getSum() <em>Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected static final String SUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSum() <em>Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected String sum = SUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected EObject var;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getPrime() <em>Prime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrime()
   * @generated
   * @ordered
   */
  protected static final String PRIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrime() <em>Prime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrime()
   * @generated
   * @ordered
   */
  protected String prime = PRIME_EDEFAULT;

  /**
   * The default value of the '{@link #getSwap() <em>Swap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwap()
   * @generated
   * @ordered
   */
  protected static final String SWAP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSwap() <em>Swap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwap()
   * @generated
   * @ordered
   */
  protected String swap = SWAP_EDEFAULT;

  /**
   * The default value of the '{@link #getVar1() <em>Var1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected static final String VAR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected String var1 = VAR1_EDEFAULT;

  /**
   * The default value of the '{@link #getVar2() <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected static final String VAR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected String var2 = VAR2_EDEFAULT;

  /**
   * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected static final String SELECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected String select = SELECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<String> vars;

  /**
   * The default value of the '{@link #getAdd() <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected static final String ADD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected String add = ADD_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar3() <em>Var3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar3()
   * @generated
   * @ordered
   */
  protected ChkVariables var3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelperImpl()
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
    return CheckerDslPackage.Literals.HELPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSum()
  {
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSum(String newSum)
  {
    String oldSum = sum;
    sum = newSum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__SUM, oldSum, sum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(EObject newVar, NotificationChain msgs)
  {
    EObject oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(EObject newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.HELPER__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.HELPER__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrime()
  {
    return prime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrime(String newPrime)
  {
    String oldPrime = prime;
    prime = newPrime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__PRIME, oldPrime, prime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSwap()
  {
    return swap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwap(String newSwap)
  {
    String oldSwap = swap;
    swap = newSwap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__SWAP, oldSwap, swap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(String newVar1)
  {
    String oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR1, oldVar1, var1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(String newVar2)
  {
    String oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR2, oldVar2, var2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelect()
  {
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelect(String newSelect)
  {
    String oldSelect = select;
    select = newSelect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__SELECT, oldSelect, select));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVars()
  {
    if (vars == null)
    {
      vars = new EDataTypeEList<String>(String.class, this, CheckerDslPackage.HELPER__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdd()
  {
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdd(String newAdd)
  {
    String oldAdd = add;
    add = newAdd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__ADD, oldAdd, add));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariables getVar3()
  {
    return var3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar3(ChkVariables newVar3, NotificationChain msgs)
  {
    ChkVariables oldVar3 = var3;
    var3 = newVar3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR3, oldVar3, newVar3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar3(ChkVariables newVar3)
  {
    if (newVar3 != var3)
    {
      NotificationChain msgs = null;
      if (var3 != null)
        msgs = ((InternalEObject)var3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.HELPER__VAR3, null, msgs);
      if (newVar3 != null)
        msgs = ((InternalEObject)newVar3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.HELPER__VAR3, null, msgs);
      msgs = basicSetVar3(newVar3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR3, newVar3, newVar3));
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
      case CheckerDslPackage.HELPER__VAR:
        return basicSetVar(null, msgs);
      case CheckerDslPackage.HELPER__VAR3:
        return basicSetVar3(null, msgs);
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
      case CheckerDslPackage.HELPER__SUM:
        return getSum();
      case CheckerDslPackage.HELPER__VAR:
        return getVar();
      case CheckerDslPackage.HELPER__MAX:
        return getMax();
      case CheckerDslPackage.HELPER__MIN:
        return getMin();
      case CheckerDslPackage.HELPER__PRIME:
        return getPrime();
      case CheckerDslPackage.HELPER__SWAP:
        return getSwap();
      case CheckerDslPackage.HELPER__VAR1:
        return getVar1();
      case CheckerDslPackage.HELPER__VAR2:
        return getVar2();
      case CheckerDslPackage.HELPER__SELECT:
        return getSelect();
      case CheckerDslPackage.HELPER__VARS:
        return getVars();
      case CheckerDslPackage.HELPER__ADD:
        return getAdd();
      case CheckerDslPackage.HELPER__VAR3:
        return getVar3();
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
      case CheckerDslPackage.HELPER__SUM:
        setSum((String)newValue);
        return;
      case CheckerDslPackage.HELPER__VAR:
        setVar((EObject)newValue);
        return;
      case CheckerDslPackage.HELPER__MAX:
        setMax((String)newValue);
        return;
      case CheckerDslPackage.HELPER__MIN:
        setMin((String)newValue);
        return;
      case CheckerDslPackage.HELPER__PRIME:
        setPrime((String)newValue);
        return;
      case CheckerDslPackage.HELPER__SWAP:
        setSwap((String)newValue);
        return;
      case CheckerDslPackage.HELPER__VAR1:
        setVar1((String)newValue);
        return;
      case CheckerDslPackage.HELPER__VAR2:
        setVar2((String)newValue);
        return;
      case CheckerDslPackage.HELPER__SELECT:
        setSelect((String)newValue);
        return;
      case CheckerDslPackage.HELPER__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends String>)newValue);
        return;
      case CheckerDslPackage.HELPER__ADD:
        setAdd((String)newValue);
        return;
      case CheckerDslPackage.HELPER__VAR3:
        setVar3((ChkVariables)newValue);
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
      case CheckerDslPackage.HELPER__SUM:
        setSum(SUM_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__VAR:
        setVar((EObject)null);
        return;
      case CheckerDslPackage.HELPER__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__PRIME:
        setPrime(PRIME_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__SWAP:
        setSwap(SWAP_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__VAR1:
        setVar1(VAR1_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__VAR2:
        setVar2(VAR2_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__SELECT:
        setSelect(SELECT_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__VARS:
        getVars().clear();
        return;
      case CheckerDslPackage.HELPER__ADD:
        setAdd(ADD_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__VAR3:
        setVar3((ChkVariables)null);
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
      case CheckerDslPackage.HELPER__SUM:
        return SUM_EDEFAULT == null ? sum != null : !SUM_EDEFAULT.equals(sum);
      case CheckerDslPackage.HELPER__VAR:
        return var != null;
      case CheckerDslPackage.HELPER__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case CheckerDslPackage.HELPER__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case CheckerDslPackage.HELPER__PRIME:
        return PRIME_EDEFAULT == null ? prime != null : !PRIME_EDEFAULT.equals(prime);
      case CheckerDslPackage.HELPER__SWAP:
        return SWAP_EDEFAULT == null ? swap != null : !SWAP_EDEFAULT.equals(swap);
      case CheckerDslPackage.HELPER__VAR1:
        return VAR1_EDEFAULT == null ? var1 != null : !VAR1_EDEFAULT.equals(var1);
      case CheckerDslPackage.HELPER__VAR2:
        return VAR2_EDEFAULT == null ? var2 != null : !VAR2_EDEFAULT.equals(var2);
      case CheckerDslPackage.HELPER__SELECT:
        return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
      case CheckerDslPackage.HELPER__VARS:
        return vars != null && !vars.isEmpty();
      case CheckerDslPackage.HELPER__ADD:
        return ADD_EDEFAULT == null ? add != null : !ADD_EDEFAULT.equals(add);
      case CheckerDslPackage.HELPER__VAR3:
        return var3 != null;
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
    result.append(" (sum: ");
    result.append(sum);
    result.append(", max: ");
    result.append(max);
    result.append(", min: ");
    result.append(min);
    result.append(", prime: ");
    result.append(prime);
    result.append(", swap: ");
    result.append(swap);
    result.append(", var1: ");
    result.append(var1);
    result.append(", var2: ");
    result.append(var2);
    result.append(", select: ");
    result.append(select);
    result.append(", vars: ");
    result.append(vars);
    result.append(", add: ");
    result.append(add);
    result.append(')');
    return result.toString();
  }

} //HelperImpl
