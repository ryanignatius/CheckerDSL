/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Score Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getSubtask <em>Subtask</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkScoreExpression()
 * @model
 * @generated
 */
public interface ChkScoreExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Subtask</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtask</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtask</em>' attribute.
   * @see #setSubtask(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkScoreExpression_Subtask()
   * @model
   * @generated
   */
  String getSubtask();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getSubtask <em>Subtask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtask</em>' attribute.
   * @see #getSubtask()
   * @generated
   */
  void setSubtask(String value);

  /**
   * Returns the value of the '<em><b>Score</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Score</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Score</em>' attribute.
   * @see #setScore(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkScoreExpression_Score()
   * @model
   * @generated
   */
  String getScore();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getScore <em>Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Score</em>' attribute.
   * @see #getScore()
   * @generated
   */
  void setScore(String value);

} // ChkScoreExpression
