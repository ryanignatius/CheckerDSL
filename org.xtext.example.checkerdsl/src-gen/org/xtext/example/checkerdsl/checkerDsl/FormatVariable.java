/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getFv <em>Fv</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatVariable()
 * @model
 * @generated
 */
public interface FormatVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Fv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fv</em>' containment reference.
   * @see #setFv(ChkVariable)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatVariable_Fv()
   * @model containment="true"
   * @generated
   */
  ChkVariable getFv();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getFv <em>Fv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fv</em>' containment reference.
   * @see #getFv()
   * @generated
   */
  void setFv(ChkVariable value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormatVariable_Count()
   * @model
   * @generated
   */
  String getCount();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(String value);

} // FormatVariable
