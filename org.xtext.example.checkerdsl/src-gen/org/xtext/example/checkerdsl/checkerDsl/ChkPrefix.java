/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix#getNewtest <em>Newtest</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkPrefix()
 * @model
 * @generated
 */
public interface ChkPrefix extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkPrefix_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Newtest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Newtest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Newtest</em>' attribute.
   * @see #setNewtest(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkPrefix_Newtest()
   * @model
   * @generated
   */
  String getNewtest();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix#getNewtest <em>Newtest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Newtest</em>' attribute.
   * @see #getNewtest()
   * @generated
   */
  void setNewtest(String value);

} // ChkPrefix
