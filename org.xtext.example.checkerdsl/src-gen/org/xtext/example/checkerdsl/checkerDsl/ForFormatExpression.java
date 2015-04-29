/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Format Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getMaxIndex <em>Max Index</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getForFormatExpression()
 * @model
 * @generated
 */
public interface ForFormatExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(ChkVariable)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getForFormatExpression_Index()
   * @model containment="true"
   * @generated
   */
  ChkVariable getIndex();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(ChkVariable value);

  /**
   * Returns the value of the '<em><b>Max Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Index</em>' containment reference.
   * @see #setMaxIndex(ChkVariables)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getForFormatExpression_MaxIndex()
   * @model containment="true"
   * @generated
   */
  ChkVariables getMaxIndex();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getMaxIndex <em>Max Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Index</em>' containment reference.
   * @see #getMaxIndex()
   * @generated
   */
  void setMaxIndex(ChkVariables value);

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getForFormatExpression_Ex()
   * @model containment="true"
   * @generated
   */
  EList<FormatExpression> getEx();

} // ForFormatExpression
