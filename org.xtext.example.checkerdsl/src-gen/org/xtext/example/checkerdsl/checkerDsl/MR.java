/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMr <em>Mr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getNum <em>Num</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMrExpression <em>Mr Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR()
 * @model
 * @generated
 */
public interface MR extends Feature
{
  /**
   * Returns the value of the '<em><b>Mr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mr</em>' attribute.
   * @see #setMr(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_Mr()
   * @model
   * @generated
   */
  String getMr();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMr <em>Mr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mr</em>' attribute.
   * @see #getMr()
   * @generated
   */
  void setMr(String value);

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

  /**
   * Returns the value of the '<em><b>Mr Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.MrExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mr Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mr Expression</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_MrExpression()
   * @model containment="true"
   * @generated
   */
  EList<MrExpression> getMrExpression();

} // MR
