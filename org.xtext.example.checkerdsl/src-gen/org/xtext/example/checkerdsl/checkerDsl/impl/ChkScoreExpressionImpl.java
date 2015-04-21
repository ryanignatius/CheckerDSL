/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chk Score Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkScoreExpressionImpl#getSubtask <em>Subtask</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkScoreExpressionImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChkScoreExpressionImpl extends MinimalEObjectImpl.Container implements ChkScoreExpression
{
  /**
   * The default value of the '{@link #getSubtask() <em>Subtask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtask()
   * @generated
   * @ordered
   */
  protected static final String SUBTASK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubtask() <em>Subtask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtask()
   * @generated
   * @ordered
   */
  protected String subtask = SUBTASK_EDEFAULT;

  /**
   * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScore()
   * @generated
   * @ordered
   */
  protected static final String SCORE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScore()
   * @generated
   * @ordered
   */
  protected String score = SCORE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChkScoreExpressionImpl()
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
    return CheckerDslPackage.Literals.CHK_SCORE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubtask()
  {
    return subtask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtask(String newSubtask)
  {
    String oldSubtask = subtask;
    subtask = newSubtask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_SCORE_EXPRESSION__SUBTASK, oldSubtask, subtask));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScore()
  {
    return score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScore(String newScore)
  {
    String oldScore = score;
    score = newScore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheckerDslPackage.CHK_SCORE_EXPRESSION__SCORE, oldScore, score));
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
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SUBTASK:
        return getSubtask();
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SCORE:
        return getScore();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SUBTASK:
        setSubtask((String)newValue);
        return;
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SCORE:
        setScore((String)newValue);
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
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SUBTASK:
        setSubtask(SUBTASK_EDEFAULT);
        return;
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SCORE:
        setScore(SCORE_EDEFAULT);
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
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SUBTASK:
        return SUBTASK_EDEFAULT == null ? subtask != null : !SUBTASK_EDEFAULT.equals(subtask);
      case CheckerDslPackage.CHK_SCORE_EXPRESSION__SCORE:
        return SCORE_EDEFAULT == null ? score != null : !SCORE_EDEFAULT.equals(score);
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
    result.append(" (subtask: ");
    result.append(subtask);
    result.append(", score: ");
    result.append(score);
    result.append(')');
    return result.toString();
  }

} //ChkScoreExpressionImpl
