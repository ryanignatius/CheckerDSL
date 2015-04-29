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

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
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
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar3 <em>Var3</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getRemove <em>Remove</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getRandom <em>Random</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getVar4 <em>Var4</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getAddRow <em>Add Row</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getAddCol <em>Add Col</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSwapRow <em>Swap Row</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getSwapCol <em>Swap Col</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getRemoveRow <em>Remove Row</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getRemoveCol <em>Remove Col</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getPermute <em>Permute</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getPlus <em>Plus</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getInvert <em>Invert</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl#getCompositional <em>Compositional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperImpl extends ChkGeneralExpressionsImpl implements Helper
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
  protected ChkVariable var;

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
   * The cached value of the '{@link #getVar3() <em>Var3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar3()
   * @generated
   * @ordered
   */
  protected ChkVariables var3;

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
   * The default value of the '{@link #getRemove() <em>Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemove()
   * @generated
   * @ordered
   */
  protected static final String REMOVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemove() <em>Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemove()
   * @generated
   * @ordered
   */
  protected String remove = REMOVE_EDEFAULT;

  /**
   * The default value of the '{@link #getRandom() <em>Random</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandom()
   * @generated
   * @ordered
   */
  protected static final String RANDOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRandom() <em>Random</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandom()
   * @generated
   * @ordered
   */
  protected String random = RANDOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar4() <em>Var4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar4()
   * @generated
   * @ordered
   */
  protected ChkVariables var4;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getContains() <em>Contains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContains()
   * @generated
   * @ordered
   */
  protected static final String CONTAINS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContains() <em>Contains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContains()
   * @generated
   * @ordered
   */
  protected String contains = CONTAINS_EDEFAULT;

  /**
   * The default value of the '{@link #getAddRow() <em>Add Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddRow()
   * @generated
   * @ordered
   */
  protected static final String ADD_ROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddRow() <em>Add Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddRow()
   * @generated
   * @ordered
   */
  protected String addRow = ADD_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getAddCol() <em>Add Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddCol()
   * @generated
   * @ordered
   */
  protected static final String ADD_COL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddCol() <em>Add Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddCol()
   * @generated
   * @ordered
   */
  protected String addCol = ADD_COL_EDEFAULT;

  /**
   * The default value of the '{@link #getSwapRow() <em>Swap Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwapRow()
   * @generated
   * @ordered
   */
  protected static final String SWAP_ROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSwapRow() <em>Swap Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwapRow()
   * @generated
   * @ordered
   */
  protected String swapRow = SWAP_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getSwapCol() <em>Swap Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwapCol()
   * @generated
   * @ordered
   */
  protected static final String SWAP_COL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSwapCol() <em>Swap Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwapCol()
   * @generated
   * @ordered
   */
  protected String swapCol = SWAP_COL_EDEFAULT;

  /**
   * The default value of the '{@link #getRemoveRow() <em>Remove Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveRow()
   * @generated
   * @ordered
   */
  protected static final String REMOVE_ROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoveRow() <em>Remove Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveRow()
   * @generated
   * @ordered
   */
  protected String removeRow = REMOVE_ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getRemoveCol() <em>Remove Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveCol()
   * @generated
   * @ordered
   */
  protected static final String REMOVE_COL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoveCol() <em>Remove Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveCol()
   * @generated
   * @ordered
   */
  protected String removeCol = REMOVE_COL_EDEFAULT;

  /**
   * The default value of the '{@link #getPermute() <em>Permute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermute()
   * @generated
   * @ordered
   */
  protected static final String PERMUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPermute() <em>Permute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermute()
   * @generated
   * @ordered
   */
  protected String permute = PERMUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getPlus() <em>Plus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlus()
   * @generated
   * @ordered
   */
  protected static final String PLUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlus() <em>Plus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlus()
   * @generated
   * @ordered
   */
  protected String plus = PLUS_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected String multiply = MULTIPLY_EDEFAULT;

  /**
   * The default value of the '{@link #getInvert() <em>Invert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvert()
   * @generated
   * @ordered
   */
  protected static final String INVERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInvert() <em>Invert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvert()
   * @generated
   * @ordered
   */
  protected String invert = INVERT_EDEFAULT;

  /**
   * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected static final String INCLUDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected String include = INCLUDE_EDEFAULT;

  /**
   * The default value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclude()
   * @generated
   * @ordered
   */
  protected static final String EXCLUDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclude()
   * @generated
   * @ordered
   */
  protected String exclude = EXCLUDE_EDEFAULT;

  /**
   * The default value of the '{@link #getCompositional() <em>Compositional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositional()
   * @generated
   * @ordered
   */
  protected static final String COMPOSITIONAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompositional() <em>Compositional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositional()
   * @generated
   * @ordered
   */
  protected String compositional = COMPOSITIONAL_EDEFAULT;

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
  public ChkVariable getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(ChkVariable newVar, NotificationChain msgs)
  {
    ChkVariable oldVar = var;
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
  public void setVar(ChkVariable newVar)
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
  public String getRemove()
  {
    return remove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemove(String newRemove)
  {
    String oldRemove = remove;
    remove = newRemove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__REMOVE, oldRemove, remove));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRandom()
  {
    return random;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandom(String newRandom)
  {
    String oldRandom = random;
    random = newRandom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__RANDOM, oldRandom, random));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariables getVar4()
  {
    return var4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar4(ChkVariables newVar4, NotificationChain msgs)
  {
    ChkVariables oldVar4 = var4;
    var4 = newVar4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR4, oldVar4, newVar4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar4(ChkVariables newVar4)
  {
    if (newVar4 != var4)
    {
      NotificationChain msgs = null;
      if (var4 != null)
        msgs = ((InternalEObject)var4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.HELPER__VAR4, null, msgs);
      if (newVar4 != null)
        msgs = ((InternalEObject)newVar4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckerDslPackage.HELPER__VAR4, null, msgs);
      msgs = basicSetVar4(newVar4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__VAR4, newVar4, newVar4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContains()
  {
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContains(String newContains)
  {
    String oldContains = contains;
    contains = newContains;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__CONTAINS, oldContains, contains));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddRow()
  {
    return addRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddRow(String newAddRow)
  {
    String oldAddRow = addRow;
    addRow = newAddRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__ADD_ROW, oldAddRow, addRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddCol()
  {
    return addCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddCol(String newAddCol)
  {
    String oldAddCol = addCol;
    addCol = newAddCol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__ADD_COL, oldAddCol, addCol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSwapRow()
  {
    return swapRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwapRow(String newSwapRow)
  {
    String oldSwapRow = swapRow;
    swapRow = newSwapRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__SWAP_ROW, oldSwapRow, swapRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSwapCol()
  {
    return swapCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwapCol(String newSwapCol)
  {
    String oldSwapCol = swapCol;
    swapCol = newSwapCol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__SWAP_COL, oldSwapCol, swapCol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRemoveRow()
  {
    return removeRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveRow(String newRemoveRow)
  {
    String oldRemoveRow = removeRow;
    removeRow = newRemoveRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__REMOVE_ROW, oldRemoveRow, removeRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRemoveCol()
  {
    return removeCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveCol(String newRemoveCol)
  {
    String oldRemoveCol = removeCol;
    removeCol = newRemoveCol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__REMOVE_COL, oldRemoveCol, removeCol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPermute()
  {
    return permute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPermute(String newPermute)
  {
    String oldPermute = permute;
    permute = newPermute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__PERMUTE, oldPermute, permute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlus()
  {
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlus(String newPlus)
  {
    String oldPlus = plus;
    plus = newPlus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__PLUS, oldPlus, plus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiply()
  {
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiply(String newMultiply)
  {
    String oldMultiply = multiply;
    multiply = newMultiply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__MULTIPLY, oldMultiply, multiply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInvert()
  {
    return invert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvert(String newInvert)
  {
    String oldInvert = invert;
    invert = newInvert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__INVERT, oldInvert, invert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInclude()
  {
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInclude(String newInclude)
  {
    String oldInclude = include;
    include = newInclude;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__INCLUDE, oldInclude, include));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclude(String newExclude)
  {
    String oldExclude = exclude;
    exclude = newExclude;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__EXCLUDE, oldExclude, exclude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCompositional()
  {
    return compositional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompositional(String newCompositional)
  {
    String oldCompositional = compositional;
    compositional = newCompositional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.HELPER__COMPOSITIONAL, oldCompositional, compositional));
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
      case CheckerDslPackage.HELPER__VAR4:
        return basicSetVar4(null, msgs);
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
      case CheckerDslPackage.HELPER__VAR3:
        return getVar3();
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
      case CheckerDslPackage.HELPER__REMOVE:
        return getRemove();
      case CheckerDslPackage.HELPER__RANDOM:
        return getRandom();
      case CheckerDslPackage.HELPER__VAR4:
        return getVar4();
      case CheckerDslPackage.HELPER__SIZE:
        return getSize();
      case CheckerDslPackage.HELPER__CONTAINS:
        return getContains();
      case CheckerDslPackage.HELPER__ADD_ROW:
        return getAddRow();
      case CheckerDslPackage.HELPER__ADD_COL:
        return getAddCol();
      case CheckerDslPackage.HELPER__SWAP_ROW:
        return getSwapRow();
      case CheckerDslPackage.HELPER__SWAP_COL:
        return getSwapCol();
      case CheckerDslPackage.HELPER__REMOVE_ROW:
        return getRemoveRow();
      case CheckerDslPackage.HELPER__REMOVE_COL:
        return getRemoveCol();
      case CheckerDslPackage.HELPER__PERMUTE:
        return getPermute();
      case CheckerDslPackage.HELPER__PLUS:
        return getPlus();
      case CheckerDslPackage.HELPER__MULTIPLY:
        return getMultiply();
      case CheckerDslPackage.HELPER__INVERT:
        return getInvert();
      case CheckerDslPackage.HELPER__INCLUDE:
        return getInclude();
      case CheckerDslPackage.HELPER__EXCLUDE:
        return getExclude();
      case CheckerDslPackage.HELPER__COMPOSITIONAL:
        return getCompositional();
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
        setVar((ChkVariable)newValue);
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
      case CheckerDslPackage.HELPER__VAR3:
        setVar3((ChkVariables)newValue);
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
      case CheckerDslPackage.HELPER__REMOVE:
        setRemove((String)newValue);
        return;
      case CheckerDslPackage.HELPER__RANDOM:
        setRandom((String)newValue);
        return;
      case CheckerDslPackage.HELPER__VAR4:
        setVar4((ChkVariables)newValue);
        return;
      case CheckerDslPackage.HELPER__SIZE:
        setSize((String)newValue);
        return;
      case CheckerDslPackage.HELPER__CONTAINS:
        setContains((String)newValue);
        return;
      case CheckerDslPackage.HELPER__ADD_ROW:
        setAddRow((String)newValue);
        return;
      case CheckerDslPackage.HELPER__ADD_COL:
        setAddCol((String)newValue);
        return;
      case CheckerDslPackage.HELPER__SWAP_ROW:
        setSwapRow((String)newValue);
        return;
      case CheckerDslPackage.HELPER__SWAP_COL:
        setSwapCol((String)newValue);
        return;
      case CheckerDslPackage.HELPER__REMOVE_ROW:
        setRemoveRow((String)newValue);
        return;
      case CheckerDslPackage.HELPER__REMOVE_COL:
        setRemoveCol((String)newValue);
        return;
      case CheckerDslPackage.HELPER__PERMUTE:
        setPermute((String)newValue);
        return;
      case CheckerDslPackage.HELPER__PLUS:
        setPlus((String)newValue);
        return;
      case CheckerDslPackage.HELPER__MULTIPLY:
        setMultiply((String)newValue);
        return;
      case CheckerDslPackage.HELPER__INVERT:
        setInvert((String)newValue);
        return;
      case CheckerDslPackage.HELPER__INCLUDE:
        setInclude((String)newValue);
        return;
      case CheckerDslPackage.HELPER__EXCLUDE:
        setExclude((String)newValue);
        return;
      case CheckerDslPackage.HELPER__COMPOSITIONAL:
        setCompositional((String)newValue);
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
        setVar((ChkVariable)null);
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
      case CheckerDslPackage.HELPER__VAR3:
        setVar3((ChkVariables)null);
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
      case CheckerDslPackage.HELPER__REMOVE:
        setRemove(REMOVE_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__RANDOM:
        setRandom(RANDOM_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__VAR4:
        setVar4((ChkVariables)null);
        return;
      case CheckerDslPackage.HELPER__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__CONTAINS:
        setContains(CONTAINS_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__ADD_ROW:
        setAddRow(ADD_ROW_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__ADD_COL:
        setAddCol(ADD_COL_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__SWAP_ROW:
        setSwapRow(SWAP_ROW_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__SWAP_COL:
        setSwapCol(SWAP_COL_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__REMOVE_ROW:
        setRemoveRow(REMOVE_ROW_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__REMOVE_COL:
        setRemoveCol(REMOVE_COL_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__PERMUTE:
        setPermute(PERMUTE_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__PLUS:
        setPlus(PLUS_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__MULTIPLY:
        setMultiply(MULTIPLY_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__INVERT:
        setInvert(INVERT_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__INCLUDE:
        setInclude(INCLUDE_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__EXCLUDE:
        setExclude(EXCLUDE_EDEFAULT);
        return;
      case CheckerDslPackage.HELPER__COMPOSITIONAL:
        setCompositional(COMPOSITIONAL_EDEFAULT);
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
      case CheckerDslPackage.HELPER__VAR3:
        return var3 != null;
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
      case CheckerDslPackage.HELPER__REMOVE:
        return REMOVE_EDEFAULT == null ? remove != null : !REMOVE_EDEFAULT.equals(remove);
      case CheckerDslPackage.HELPER__RANDOM:
        return RANDOM_EDEFAULT == null ? random != null : !RANDOM_EDEFAULT.equals(random);
      case CheckerDslPackage.HELPER__VAR4:
        return var4 != null;
      case CheckerDslPackage.HELPER__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case CheckerDslPackage.HELPER__CONTAINS:
        return CONTAINS_EDEFAULT == null ? contains != null : !CONTAINS_EDEFAULT.equals(contains);
      case CheckerDslPackage.HELPER__ADD_ROW:
        return ADD_ROW_EDEFAULT == null ? addRow != null : !ADD_ROW_EDEFAULT.equals(addRow);
      case CheckerDslPackage.HELPER__ADD_COL:
        return ADD_COL_EDEFAULT == null ? addCol != null : !ADD_COL_EDEFAULT.equals(addCol);
      case CheckerDslPackage.HELPER__SWAP_ROW:
        return SWAP_ROW_EDEFAULT == null ? swapRow != null : !SWAP_ROW_EDEFAULT.equals(swapRow);
      case CheckerDslPackage.HELPER__SWAP_COL:
        return SWAP_COL_EDEFAULT == null ? swapCol != null : !SWAP_COL_EDEFAULT.equals(swapCol);
      case CheckerDslPackage.HELPER__REMOVE_ROW:
        return REMOVE_ROW_EDEFAULT == null ? removeRow != null : !REMOVE_ROW_EDEFAULT.equals(removeRow);
      case CheckerDslPackage.HELPER__REMOVE_COL:
        return REMOVE_COL_EDEFAULT == null ? removeCol != null : !REMOVE_COL_EDEFAULT.equals(removeCol);
      case CheckerDslPackage.HELPER__PERMUTE:
        return PERMUTE_EDEFAULT == null ? permute != null : !PERMUTE_EDEFAULT.equals(permute);
      case CheckerDslPackage.HELPER__PLUS:
        return PLUS_EDEFAULT == null ? plus != null : !PLUS_EDEFAULT.equals(plus);
      case CheckerDslPackage.HELPER__MULTIPLY:
        return MULTIPLY_EDEFAULT == null ? multiply != null : !MULTIPLY_EDEFAULT.equals(multiply);
      case CheckerDslPackage.HELPER__INVERT:
        return INVERT_EDEFAULT == null ? invert != null : !INVERT_EDEFAULT.equals(invert);
      case CheckerDslPackage.HELPER__INCLUDE:
        return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
      case CheckerDslPackage.HELPER__EXCLUDE:
        return EXCLUDE_EDEFAULT == null ? exclude != null : !EXCLUDE_EDEFAULT.equals(exclude);
      case CheckerDslPackage.HELPER__COMPOSITIONAL:
        return COMPOSITIONAL_EDEFAULT == null ? compositional != null : !COMPOSITIONAL_EDEFAULT.equals(compositional);
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
    result.append(", remove: ");
    result.append(remove);
    result.append(", random: ");
    result.append(random);
    result.append(", size: ");
    result.append(size);
    result.append(", contains: ");
    result.append(contains);
    result.append(", addRow: ");
    result.append(addRow);
    result.append(", addCol: ");
    result.append(addCol);
    result.append(", swapRow: ");
    result.append(swapRow);
    result.append(", swapCol: ");
    result.append(swapCol);
    result.append(", removeRow: ");
    result.append(removeRow);
    result.append(", removeCol: ");
    result.append(removeCol);
    result.append(", permute: ");
    result.append(permute);
    result.append(", plus: ");
    result.append(plus);
    result.append(", multiply: ");
    result.append(multiply);
    result.append(", invert: ");
    result.append(invert);
    result.append(", include: ");
    result.append(include);
    result.append(", exclude: ");
    result.append(exclude);
    result.append(", compositional: ");
    result.append(compositional);
    result.append(')');
    return result.toString();
  }

} //HelperImpl
