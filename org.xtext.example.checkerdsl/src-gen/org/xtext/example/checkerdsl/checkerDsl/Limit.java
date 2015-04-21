/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getSub <em>Sub</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getB <em>B</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getLimit()
 * @model
 * @generated
 */
public interface Limit extends EObject
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(Subtask)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getLimit_Sub()
   * @model containment="true"
   * @generated
   */
  Subtask getSub();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(Subtask value);

  /**
   * Returns the value of the '<em><b>A</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getLimit_A()
   * @model unique="false"
   * @generated
   */
  EList<String> getA();

  /**
   * Returns the value of the '<em><b>B</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getLimit_B()
   * @model unique="false"
   * @generated
   */
  EList<String> getB();

} // Limit
