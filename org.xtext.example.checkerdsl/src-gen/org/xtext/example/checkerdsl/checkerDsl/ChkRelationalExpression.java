/**
 */
package org.xtext.example.checkerdsl.checkerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getOpr <em>Opr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV2 <em>V2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkRelationalExpression()
 * @model
 * @generated
 */
public interface ChkRelationalExpression extends ChkGeneralExpressions
{
  /**
   * Returns the value of the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V1</em>' containment reference.
   * @see #setV1(ChkVariables)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkRelationalExpression_V1()
   * @model containment="true"
   * @generated
   */
  ChkVariables getV1();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV1 <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V1</em>' containment reference.
   * @see #getV1()
   * @generated
   */
  void setV1(ChkVariables value);

  /**
   * Returns the value of the '<em><b>Opr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opr</em>' attribute.
   * @see #setOpr(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkRelationalExpression_Opr()
   * @model
   * @generated
   */
  String getOpr();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getOpr <em>Opr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opr</em>' attribute.
   * @see #getOpr()
   * @generated
   */
  void setOpr(String value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' containment reference.
   * @see #setV2(ChkVariables)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkRelationalExpression_V2()
   * @model containment="true"
   * @generated
   */
  ChkVariables getV2();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV2 <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V2</em>' containment reference.
   * @see #getV2()
   * @generated
   */
  void setV2(ChkVariables value);

} // ChkRelationalExpression
