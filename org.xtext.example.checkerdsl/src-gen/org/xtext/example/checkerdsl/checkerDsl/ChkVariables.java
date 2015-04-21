/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getVa <em>Va</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getNu <em>Nu</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getGr <em>Gr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariables()
 * @model
 * @generated
 */
public interface ChkVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Va</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Va</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Va</em>' containment reference.
   * @see #setVa(ChkVariable)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariables_Va()
   * @model containment="true"
   * @generated
   */
  ChkVariable getVa();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getVa <em>Va</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Va</em>' containment reference.
   * @see #getVa()
   * @generated
   */
  void setVa(ChkVariable value);

  /**
   * Returns the value of the '<em><b>Nu</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nu</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nu</em>' attribute.
   * @see #setNu(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariables_Nu()
   * @model
   * @generated
   */
  String getNu();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getNu <em>Nu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nu</em>' attribute.
   * @see #getNu()
   * @generated
   */
  void setNu(String value);

  /**
   * Returns the value of the '<em><b>Gr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gr</em>' containment reference.
   * @see #setGr(ChkItemGroup)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkVariables_Gr()
   * @model containment="true"
   * @generated
   */
  ChkItemGroup getGr();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getGr <em>Gr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gr</em>' containment reference.
   * @see #getGr()
   * @generated
   */
  void setGr(ChkItemGroup value);

} // ChkVariables
