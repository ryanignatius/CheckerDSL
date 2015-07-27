/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSum <em>Sum</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPrime <em>Prime</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar3 <em>Var3</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar4 <em>Var4</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemove <em>Remove</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRandom <em>Random</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getReverse <em>Reverse</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getContains <em>Contains</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAddRow <em>Add Row</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAddCol <em>Add Col</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapRow <em>Swap Row</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapCol <em>Swap Col</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveRow <em>Remove Row</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveCol <em>Remove Col</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPermute <em>Permute</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPlus <em>Plus</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getInvert <em>Invert</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getInclude <em>Include</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getCompositional <em>Compositional</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper()
 * @model
 * @generated
 */
public interface Helper extends ChkGeneralExpressions
{
  /**
   * Returns the value of the '<em><b>Sum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' attribute.
   * @see #setSum(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Sum()
   * @model
   * @generated
   */
  String getSum();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSum <em>Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' attribute.
   * @see #getSum()
   * @generated
   */
  void setSum(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(ChkVariable)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Var()
   * @model containment="true"
   * @generated
   */
  ChkVariable getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(ChkVariable value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Max()
   * @model
   * @generated
   */
  String getMax();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(String value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Min()
   * @model
   * @generated
   */
  String getMin();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(String value);

  /**
   * Returns the value of the '<em><b>Prime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prime</em>' attribute.
   * @see #setPrime(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Prime()
   * @model
   * @generated
   */
  String getPrime();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPrime <em>Prime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prime</em>' attribute.
   * @see #getPrime()
   * @generated
   */
  void setPrime(String value);

  /**
   * Returns the value of the '<em><b>Var3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var3</em>' containment reference.
   * @see #setVar3(ChkVariables)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Var3()
   * @model containment="true"
   * @generated
   */
  ChkVariables getVar3();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar3 <em>Var3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var3</em>' containment reference.
   * @see #getVar3()
   * @generated
   */
  void setVar3(ChkVariables value);

  /**
   * Returns the value of the '<em><b>Swap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swap</em>' attribute.
   * @see #setSwap(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Swap()
   * @model
   * @generated
   */
  String getSwap();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwap <em>Swap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Swap</em>' attribute.
   * @see #getSwap()
   * @generated
   */
  void setSwap(String value);

  /**
   * Returns the value of the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' attribute.
   * @see #setVar1(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Var1()
   * @model
   * @generated
   */
  String getVar1();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar1 <em>Var1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' attribute.
   * @see #getVar1()
   * @generated
   */
  void setVar1(String value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' attribute.
   * @see #setVar2(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Var2()
   * @model
   * @generated
   */
  String getVar2();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar2 <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' attribute.
   * @see #getVar2()
   * @generated
   */
  void setVar2(String value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' attribute.
   * @see #setSelect(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Select()
   * @model
   * @generated
   */
  String getSelect();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSelect <em>Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' attribute.
   * @see #getSelect()
   * @generated
   */
  void setSelect(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Vars()
   * @model unique="false"
   * @generated
   */
  EList<String> getVars();

  /**
   * Returns the value of the '<em><b>Var4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var4</em>' containment reference.
   * @see #setVar4(ChkVariables)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Var4()
   * @model containment="true"
   * @generated
   */
  ChkVariables getVar4();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar4 <em>Var4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var4</em>' containment reference.
   * @see #getVar4()
   * @generated
   */
  void setVar4(ChkVariables value);

  /**
   * Returns the value of the '<em><b>Add</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' attribute.
   * @see #setAdd(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Add()
   * @model
   * @generated
   */
  String getAdd();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAdd <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add</em>' attribute.
   * @see #getAdd()
   * @generated
   */
  void setAdd(String value);

  /**
   * Returns the value of the '<em><b>Remove</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove</em>' attribute.
   * @see #setRemove(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Remove()
   * @model
   * @generated
   */
  String getRemove();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemove <em>Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove</em>' attribute.
   * @see #getRemove()
   * @generated
   */
  void setRemove(String value);

  /**
   * Returns the value of the '<em><b>Random</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Random</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random</em>' attribute.
   * @see #setRandom(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Random()
   * @model
   * @generated
   */
  String getRandom();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRandom <em>Random</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random</em>' attribute.
   * @see #getRandom()
   * @generated
   */
  void setRandom(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Reverse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reverse</em>' attribute.
   * @see #setReverse(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Reverse()
   * @model
   * @generated
   */
  String getReverse();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getReverse <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reverse</em>' attribute.
   * @see #getReverse()
   * @generated
   */
  void setReverse(String value);

  /**
   * Returns the value of the '<em><b>Contains</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' attribute.
   * @see #setContains(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Contains()
   * @model
   * @generated
   */
  String getContains();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getContains <em>Contains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contains</em>' attribute.
   * @see #getContains()
   * @generated
   */
  void setContains(String value);

  /**
   * Returns the value of the '<em><b>Add Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Row</em>' attribute.
   * @see #setAddRow(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_AddRow()
   * @model
   * @generated
   */
  String getAddRow();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAddRow <em>Add Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Row</em>' attribute.
   * @see #getAddRow()
   * @generated
   */
  void setAddRow(String value);

  /**
   * Returns the value of the '<em><b>Add Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Col</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Col</em>' attribute.
   * @see #setAddCol(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_AddCol()
   * @model
   * @generated
   */
  String getAddCol();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAddCol <em>Add Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Col</em>' attribute.
   * @see #getAddCol()
   * @generated
   */
  void setAddCol(String value);

  /**
   * Returns the value of the '<em><b>Swap Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swap Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swap Row</em>' attribute.
   * @see #setSwapRow(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_SwapRow()
   * @model
   * @generated
   */
  String getSwapRow();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapRow <em>Swap Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Swap Row</em>' attribute.
   * @see #getSwapRow()
   * @generated
   */
  void setSwapRow(String value);

  /**
   * Returns the value of the '<em><b>Swap Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swap Col</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swap Col</em>' attribute.
   * @see #setSwapCol(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_SwapCol()
   * @model
   * @generated
   */
  String getSwapCol();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapCol <em>Swap Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Swap Col</em>' attribute.
   * @see #getSwapCol()
   * @generated
   */
  void setSwapCol(String value);

  /**
   * Returns the value of the '<em><b>Remove Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Row</em>' attribute.
   * @see #setRemoveRow(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_RemoveRow()
   * @model
   * @generated
   */
  String getRemoveRow();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveRow <em>Remove Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove Row</em>' attribute.
   * @see #getRemoveRow()
   * @generated
   */
  void setRemoveRow(String value);

  /**
   * Returns the value of the '<em><b>Remove Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Col</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Col</em>' attribute.
   * @see #setRemoveCol(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_RemoveCol()
   * @model
   * @generated
   */
  String getRemoveCol();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveCol <em>Remove Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove Col</em>' attribute.
   * @see #getRemoveCol()
   * @generated
   */
  void setRemoveCol(String value);

  /**
   * Returns the value of the '<em><b>Permute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permute</em>' attribute.
   * @see #setPermute(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Permute()
   * @model
   * @generated
   */
  String getPermute();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPermute <em>Permute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Permute</em>' attribute.
   * @see #getPermute()
   * @generated
   */
  void setPermute(String value);

  /**
   * Returns the value of the '<em><b>Plus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plus</em>' attribute.
   * @see #setPlus(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Plus()
   * @model
   * @generated
   */
  String getPlus();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPlus <em>Plus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plus</em>' attribute.
   * @see #getPlus()
   * @generated
   */
  void setPlus(String value);

  /**
   * Returns the value of the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiply</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiply</em>' attribute.
   * @see #setMultiply(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Multiply()
   * @model
   * @generated
   */
  String getMultiply();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMultiply <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiply</em>' attribute.
   * @see #getMultiply()
   * @generated
   */
  void setMultiply(String value);

  /**
   * Returns the value of the '<em><b>Invert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invert</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invert</em>' attribute.
   * @see #setInvert(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Invert()
   * @model
   * @generated
   */
  String getInvert();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getInvert <em>Invert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invert</em>' attribute.
   * @see #getInvert()
   * @generated
   */
  void setInvert(String value);

  /**
   * Returns the value of the '<em><b>Include</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include</em>' attribute.
   * @see #setInclude(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Include()
   * @model
   * @generated
   */
  String getInclude();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getInclude <em>Include</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include</em>' attribute.
   * @see #getInclude()
   * @generated
   */
  void setInclude(String value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude</em>' attribute.
   * @see #setExclude(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Exclude()
   * @model
   * @generated
   */
  String getExclude();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getExclude <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' attribute.
   * @see #getExclude()
   * @generated
   */
  void setExclude(String value);

  /**
   * Returns the value of the '<em><b>Compositional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compositional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compositional</em>' attribute.
   * @see #setCompositional(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Compositional()
   * @model
   * @generated
   */
  String getCompositional();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getCompositional <em>Compositional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compositional</em>' attribute.
   * @see #getCompositional()
   * @generated
   */
  void setCompositional(String value);

} // Helper
