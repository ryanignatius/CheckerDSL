/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chk Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getOpr <em>Opr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV2 <em>V2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkAssignment()
 * @model
 * @generated
 */
public interface ChkAssignment extends ChkGeneralExpressions
{
  /**
   * Returns the value of the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V1</em>' containment reference.
   * @see #setV1(ChkVariable)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkAssignment_V1()
   * @model containment="true"
   * @generated
   */
  ChkVariable getV1();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV1 <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V1</em>' containment reference.
   * @see #getV1()
   * @generated
   */
  void setV1(ChkVariable value);

  /**
   * Returns the value of the '<em><b>Opr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opr</em>' attribute.
   * @see #setOpr(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkAssignment_Opr()
   * @model
   * @generated
   */
  String getOpr();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getOpr <em>Opr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opr</em>' attribute.
   * @see #getOpr()
   * @generated
   */
  void setOpr(String value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' containment reference.
   * @see #setV2(EObject)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getChkAssignment_V2()
   * @model containment="true"
   * @generated
   */
  EObject getV2();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV2 <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V2</em>' containment reference.
   * @see #getV2()
   * @generated
   */
  void setV2(EObject value);

} // ChkAssignment
