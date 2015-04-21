/**
 */
package org.xtext.example.checkerdsl.checkerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.OutputFormat#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getOutputFormat()
 * @model
 * @generated
 */
public interface OutputFormat extends Format
{
  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getOutputFormat_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.OutputFormat#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

} // OutputFormat
