/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getAsg <em>Asg</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression()
 * @model
 * @generated
 */
public interface ChkExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Asg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asg</em>' attribute.
   * @see #setAsg(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_Asg()
   * @model
   * @generated
   */
  String getAsg();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getAsg <em>Asg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asg</em>' attribute.
   * @see #getAsg()
   * @generated
   */
  void setAsg(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ChkGeneralExpressions)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_Exp()
   * @model containment="true"
   * @generated
   */
  ChkGeneralExpressions getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ChkGeneralExpressions value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' attribute.
   * @see #setWhere(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_Where()
   * @model
   * @generated
   */
  String getWhere();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getWhere <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' attribute.
   * @see #getWhere()
   * @generated
   */
  void setWhere(String value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_Cond()
   * @model containment="true"
   * @generated
   */
  EList<ChkRelationalExpression> getCond();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_Type()
   * @model unique="false"
   * @generated
   */
  EList<String> getType();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(ChkVariable)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkExpression_V()
   * @model containment="true"
   * @generated
   */
  ChkVariable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(ChkVariable value);

} // ChkExpression
