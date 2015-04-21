/**
 */
package org.xtext.example.checkerdsl.checkerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.InputFormat#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getInputFormat()
 * @model
 * @generated
 */
public interface InputFormat extends Format
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getInputFormat_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.InputFormat#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

} // InputFormat
