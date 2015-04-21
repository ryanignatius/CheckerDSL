/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Subtask#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getSubtask()
 * @model
 * @generated
 */
public interface Subtask extends EObject
{
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
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getSubtask_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Subtask#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

} // Subtask
