/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Up</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFol <em>Fol</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFollowups <em>Followups</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFollowUp()
 * @model
 * @generated
 */
public interface FollowUp extends EObject
{
  /**
   * Returns the value of the '<em><b>Fol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fol</em>' attribute.
   * @see #setFol(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFollowUp_Fol()
   * @model
   * @generated
   */
  String getFol();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFol <em>Fol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fol</em>' attribute.
   * @see #getFol()
   * @generated
   */
  void setFol(String value);

  /**
   * Returns the value of the '<em><b>Followups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Followups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Followups</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFollowUp_Followups()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getFollowups();

} // FollowUp
