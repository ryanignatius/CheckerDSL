/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getNum <em>Num</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getSz <em>Sz</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatExpression()
 * @model
 * @generated
 */
public interface FormatExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatExpression_Num()
   * @model
   * @generated
   */
  String getNum();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatExpression_Var()
   * @model unique="false"
   * @generated
   */
  EList<String> getVar();

  /**
   * Returns the value of the '<em><b>Sz</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sz</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sz</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatExpression_Sz()
   * @model unique="false"
   * @generated
   */
  EList<String> getSz();

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatExpression_Count()
   * @model unique="false"
   * @generated
   */
  EList<String> getCount();

} // FormatExpression
