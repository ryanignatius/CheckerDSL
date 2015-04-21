/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMr <em>Mr</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getNum <em>Num</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMrExp <em>Mr Exp</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getFollowup <em>Followup</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.MR#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR()
 * @model
 * @generated
 */
public interface MR extends Feature
{
  /**
   * Returns the value of the '<em><b>Mr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mr</em>' attribute.
   * @see #setMr(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_Mr()
   * @model
   * @generated
   */
  String getMr();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMr <em>Mr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mr</em>' attribute.
   * @see #getMr()
   * @generated
   */
  void setMr(String value);

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

  /**
   * Returns the value of the '<em><b>Mr Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mr Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mr Exp</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_MrExp()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getMrExp();

  /**
   * Returns the value of the '<em><b>Followup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Followup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Followup</em>' containment reference.
   * @see #setFollowup(FollowUp)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_Followup()
   * @model containment="true"
   * @generated
   */
  FollowUp getFollowup();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getFollowup <em>Followup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Followup</em>' containment reference.
   * @see #getFollowup()
   * @generated
   */
  void setFollowup(FollowUp value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(Property)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getMR_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

} // MR
