/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Check#getCheck <em>Check</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Check#getChk <em>Chk</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Feature
{
  /**
   * Returns the value of the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check</em>' attribute.
   * @see #setCheck(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getCheck_Check()
   * @model
   * @generated
   */
  String getCheck();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Check#getCheck <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check</em>' attribute.
   * @see #getCheck()
   * @generated
   */
  void setCheck(String value);

  /**
   * Returns the value of the '<em><b>Chk</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chk</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chk</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getCheck_Chk()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getChk();

} // Check
