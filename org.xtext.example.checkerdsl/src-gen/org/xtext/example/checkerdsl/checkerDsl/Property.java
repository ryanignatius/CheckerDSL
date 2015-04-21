/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Property#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Property#getSz <em>Sz</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.checkerdsl.checkerDsl.Property#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getProperty_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Property#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Sz</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sz</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sz</em>' attribute list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getProperty_Sz()
   * @model unique="false"
   * @generated
   */
  EList<String> getSz();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.checkerdsl.checkerDsl.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.checkerdsl.checkerDsl.Limit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference list.
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#getProperty_Limit()
   * @model containment="true"
   * @generated
   */
  EList<Limit> getLimit();

} // Property
