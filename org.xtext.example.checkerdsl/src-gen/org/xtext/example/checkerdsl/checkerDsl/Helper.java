/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar3 <em>Var3</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper()
 * @model
 * @generated
 */
public interface Helper extends ChkRelationalExpressions
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
   * @see #setVar(EObject)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getHelper_Var()
   * @model containment="true"
   * @generated
   */
  EObject getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EObject value);

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

} // Helper
