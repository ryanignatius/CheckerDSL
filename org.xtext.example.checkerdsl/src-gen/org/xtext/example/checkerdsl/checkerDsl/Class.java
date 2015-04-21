/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Class#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Class#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(JvmTypeReference)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getClass_SuperType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Class#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getClass_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Class
