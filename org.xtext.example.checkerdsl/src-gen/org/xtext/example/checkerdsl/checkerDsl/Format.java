/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Format#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormat()
 * @model
 * @generated
 */
public interface Format extends Feature
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getFormat_Exp()
   * @model containment="true"
   * @generated
   */
  EList<FormatExpression> getExp();

} // Format
