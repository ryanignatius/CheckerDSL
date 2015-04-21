/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getPref <em>Pref</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariable()
 * @model
 * @generated
 */
public interface ChkVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Pref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pref</em>' containment reference.
   * @see #setPref(ChkPrefix)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariable_Pref()
   * @model containment="true"
   * @generated
   */
  ChkPrefix getPref();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getPref <em>Pref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pref</em>' containment reference.
   * @see #getPref()
   * @generated
   */
  void setPref(ChkPrefix value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariable_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariable_V()
   * @model unique="false"
   * @generated
   */
  EList<String> getV();

} // ChkVariable
