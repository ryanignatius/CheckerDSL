/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage
 * @generated
 */
public interface CheckerDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CheckerDslFactory eINSTANCE = org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl</em>'.
   * @generated
   */
  Dsl createDsl();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>MR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MR</em>'.
   * @generated
   */
  MR createMR();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Call</em>'.
   * @generated
   */
  MethodCall createMethodCall();

  /**
   * Returns a new object of class '<em>Chk Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Prefix</em>'.
   * @generated
   */
  ChkPrefix createChkPrefix();

  /**
   * Returns a new object of class '<em>Chk Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Variable</em>'.
   * @generated
   */
  ChkVariable createChkVariable();

  /**
   * Returns a new object of class '<em>Chk Variables</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Variables</em>'.
   * @generated
   */
  ChkVariables createChkVariables();

  /**
   * Returns a new object of class '<em>Helper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helper</em>'.
   * @generated
   */
  Helper createHelper();

  /**
   * Returns a new object of class '<em>Chk Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Relational Expression</em>'.
   * @generated
   */
  ChkRelationalExpression createChkRelationalExpression();

  /**
   * Returns a new object of class '<em>Chk Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Assignment</em>'.
   * @generated
   */
  ChkAssignment createChkAssignment();

  /**
   * Returns a new object of class '<em>Chk Relational Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Relational Expressions</em>'.
   * @generated
   */
  ChkRelationalExpressions createChkRelationalExpressions();

  /**
   * Returns a new object of class '<em>Chk Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chk Expression</em>'.
   * @generated
   */
  ChkExpression createChkExpression();

  /**
   * Returns a new object of class '<em>Mr Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mr Expression</em>'.
   * @generated
   */
  MrExpression createMrExpression();

  /**
   * Returns a new object of class '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check</em>'.
   * @generated
   */
  Check createCheck();

  /**
   * Returns a new object of class '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit</em>'.
   * @generated
   */
  Limit createLimit();

  /**
   * Returns a new object of class '<em>Subtask</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtask</em>'.
   * @generated
   */
  Subtask createSubtask();

  /**
   * Returns a new object of class '<em>Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Format</em>'.
   * @generated
   */
  Format createFormat();

  /**
   * Returns a new object of class '<em>Input Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Format</em>'.
   * @generated
   */
  InputFormat createInputFormat();

  /**
   * Returns a new object of class '<em>Output Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Format</em>'.
   * @generated
   */
  OutputFormat createOutputFormat();

  /**
   * Returns a new object of class '<em>Format Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Format Expression</em>'.
   * @generated
   */
  FormatExpression createFormatExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CheckerDslPackage getCheckerDslPackage();

} //CheckerDslFactory
