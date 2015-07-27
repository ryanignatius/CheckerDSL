/**
 */
package org.xtext.example.checkerdsl.checkerDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslFactory
 * @model kind="package"
 * @generated
 */
public interface CheckerDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "checkerDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/checkerdsl/CheckerDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "checkerDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CheckerDslPackage eINSTANCE = org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.DslImpl <em>Dsl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.DslImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getDsl()
   * @generated
   */
  int DSL = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL__IMPORT_SECTION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.AbstractElementImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.PackageDeclarationImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ClassImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FEATURES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.FeatureImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.MethodImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkScoreExpressionImpl <em>Chk Score Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkScoreExpressionImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkScoreExpression()
   * @generated
   */
  int CHK_SCORE_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Subtask</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_SCORE_EXPRESSION__SUBTASK = 0;

  /**
   * The feature id for the '<em><b>Score</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_SCORE_EXPRESSION__SCORE = 1;

  /**
   * The number of structural features of the '<em>Chk Score Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_SCORE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ScoreImpl <em>Score</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ScoreImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getScore()
   * @generated
   */
  int SCORE = 7;

  /**
   * The feature id for the '<em><b>Scores</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCORE__SCORES = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Score</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCORE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FollowUpImpl <em>Follow Up</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.FollowUpImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFollowUp()
   * @generated
   */
  int FOLLOW_UP = 8;

  /**
   * The feature id for the '<em><b>Fol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_UP__FOL = 0;

  /**
   * The feature id for the '<em><b>Followups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_UP__FOLLOWUPS = 1;

  /**
   * The number of structural features of the '<em>Follow Up</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_UP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PROP = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl <em>MR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getMR()
   * @generated
   */
  int MR = 10;

  /**
   * The feature id for the '<em><b>Mr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR__MR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR__NUM = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mr Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR__MR_EXP = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Followup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR__FOLLOWUP = FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR__PROPERTY = FEATURE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl <em>Chk Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkVariableDeclaration()
   * @generated
   */
  int CHK_VARIABLE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sz</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION__SZ = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION__NAME = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Limit1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION__LIMIT1 = FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Limit</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION__LIMIT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Sp Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION__SP_VALUE = FEATURE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Chk Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_DECLARATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkGeneralExpressionsImpl <em>Chk General Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkGeneralExpressionsImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkGeneralExpressions()
   * @generated
   */
  int CHK_GENERAL_EXPRESSIONS = 20;

  /**
   * The number of structural features of the '<em>Chk General Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.MethodCallImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__NAME = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__PARAMS = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkPrefixImpl <em>Chk Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkPrefixImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkPrefix()
   * @generated
   */
  int CHK_PREFIX = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_PREFIX__TYPE = 0;

  /**
   * The number of structural features of the '<em>Chk Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl <em>Chk Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkVariable()
   * @generated
   */
  int CHK_VARIABLE = 14;

  /**
   * The feature id for the '<em><b>Pref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE__PREF = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE__VAR = 1;

  /**
   * The feature id for the '<em><b>Newtest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE__NEWTEST = 2;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE__V = 3;

  /**
   * The number of structural features of the '<em>Chk Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl <em>Chk Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkVariables()
   * @generated
   */
  int CHK_VARIABLES = 15;

  /**
   * The feature id for the '<em><b>Va</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLES__VA = 0;

  /**
   * The feature id for the '<em><b>Nu</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLES__NU = 1;

  /**
   * The feature id for the '<em><b>Gr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLES__GR = 2;

  /**
   * The number of structural features of the '<em>Chk Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_VARIABLES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkItemGroupImpl <em>Chk Item Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkItemGroupImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkItemGroup()
   * @generated
   */
  int CHK_ITEM_GROUP = 16;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ITEM_GROUP__VARS = 0;

  /**
   * The number of structural features of the '<em>Chk Item Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ITEM_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl <em>Helper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getHelper()
   * @generated
   */
  int HELPER = 17;

  /**
   * The feature id for the '<em><b>Sum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__SUM = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__VAR = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__MAX = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__MIN = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Prime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__PRIME = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Var3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__VAR3 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Swap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__SWAP = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__VAR1 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__VAR2 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__SELECT = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Vars</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__VARS = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Var4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__VAR4 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Add</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__ADD = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Remove</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__REMOVE = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Random</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__RANDOM = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__SIZE = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Reverse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__REVERSE = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Contains</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__CONTAINS = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Add Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__ADD_ROW = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Add Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__ADD_COL = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Swap Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__SWAP_ROW = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Swap Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__SWAP_COL = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Remove Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__REMOVE_ROW = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Remove Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__REMOVE_COL = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Permute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__PERMUTE = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Plus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__PLUS = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__MULTIPLY = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Invert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__INVERT = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>Include</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__INCLUDE = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>Exclude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__EXCLUDE = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 29;

  /**
   * The feature id for the '<em><b>Compositional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__COMPOSITIONAL = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 30;

  /**
   * The number of structural features of the '<em>Helper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_FEATURE_COUNT = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 31;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl <em>Chk Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkRelationalExpression()
   * @generated
   */
  int CHK_RELATIONAL_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_RELATIONAL_EXPRESSION__V1 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_RELATIONAL_EXPRESSION__OPR = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_RELATIONAL_EXPRESSION__V2 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chk Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_RELATIONAL_EXPRESSION_FEATURE_COUNT = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl <em>Chk Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkAssignment()
   * @generated
   */
  int CHK_ASSIGNMENT = 19;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ASSIGNMENT__DEF = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ASSIGNMENT__V1 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ASSIGNMENT__OPR = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ASSIGNMENT__V2 = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Chk Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_ASSIGNMENT_FEATURE_COUNT = CHK_GENERAL_EXPRESSIONS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkOperationImpl <em>Chk Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkOperationImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkOperation()
   * @generated
   */
  int CHK_OPERATION = 21;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_OPERATION__OPERAND = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_OPERATION__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Chk Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkLoopExpressionImpl <em>Chk Loop Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkLoopExpressionImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkLoopExpression()
   * @generated
   */
  int CHK_LOOP_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_LOOP_EXPRESSION__INDEX = 0;

  /**
   * The feature id for the '<em><b>Max Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_LOOP_EXPRESSION__MAX_INDEX = 1;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_LOOP_EXPRESSION__EX = 2;

  /**
   * The number of structural features of the '<em>Chk Loop Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_LOOP_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl <em>Chk Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkExpression()
   * @generated
   */
  int CHK_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__WHERE = 1;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__NOT = 2;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__COND = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__TYPE = 4;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__OP = 5;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION__V = 6;

  /**
   * The number of structural features of the '<em>Chk Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHK_EXPRESSION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 24;

  /**
   * The feature id for the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__CHECK = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Chk</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__CHK = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.SpValueImpl <em>Sp Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.SpValueImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getSpValue()
   * @generated
   */
  int SP_VALUE = 25;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VALUE__VAL = 0;

  /**
   * The number of structural features of the '<em>Sp Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl <em>Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getLimit()
   * @generated
   */
  int LIMIT = 26;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__SUB = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__A = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__B = 2;

  /**
   * The number of structural features of the '<em>Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.SubtaskImpl <em>Subtask</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.SubtaskImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getSubtask()
   * @generated
   */
  int SUBTASK = 27;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTASK__NUM = 0;

  /**
   * The number of structural features of the '<em>Subtask</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTASK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatImpl <em>Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.FormatImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFormat()
   * @generated
   */
  int FORMAT = 28;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT__EXP = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl <em>For Format Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getForFormatExpression()
   * @generated
   */
  int FOR_FORMAT_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FORMAT_EXPRESSION__INDEX = 0;

  /**
   * The feature id for the '<em><b>Max Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FORMAT_EXPRESSION__MAX_INDEX = 1;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FORMAT_EXPRESSION__EX = 2;

  /**
   * The number of structural features of the '<em>For Format Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FORMAT_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.InputFormatImpl <em>Input Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.InputFormatImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getInputFormat()
   * @generated
   */
  int INPUT_FORMAT = 30;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FORMAT__EXP = FORMAT__EXP;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FORMAT__INPUT = FORMAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FORMAT_FEATURE_COUNT = FORMAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.OutputFormatImpl <em>Output Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.OutputFormatImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getOutputFormat()
   * @generated
   */
  int OUTPUT_FORMAT = 31;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FORMAT__EXP = FORMAT__EXP;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FORMAT__OUTPUT = FORMAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FORMAT_FEATURE_COUNT = FORMAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.HiddenFormatImpl <em>Hidden Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.HiddenFormatImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getHiddenFormat()
   * @generated
   */
  int HIDDEN_FORMAT = 32;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDDEN_FORMAT__EXP = FORMAT__EXP;

  /**
   * The feature id for the '<em><b>Hid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDDEN_FORMAT__HID = FORMAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hidden Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDDEN_FORMAT_FEATURE_COUNT = FORMAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl <em>Format Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFormatExpression()
   * @generated
   */
  int FORMAT_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_EXPRESSION__NUM = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_EXPRESSION__VAR = 1;

  /**
   * The number of structural features of the '<em>Format Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatVariableImpl <em>Format Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.FormatVariableImpl
   * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFormatVariable()
   * @generated
   */
  int FORMAT_VARIABLE = 34;

  /**
   * The feature id for the '<em><b>Fv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_VARIABLE__FV = 0;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_VARIABLE__COUNT = 1;

  /**
   * The number of structural features of the '<em>Format Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_VARIABLE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Dsl <em>Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Dsl
   * @generated
   */
  EClass getDsl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Dsl#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Dsl#getImportSection()
   * @see #getDsl()
   * @generated
   */
  EReference getDsl_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Dsl#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Dsl#getElements()
   * @see #getDsl()
   * @generated
   */
  EReference getDsl_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Class#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Class#getSuperType()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Class#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Class#getFeatures()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression <em>Chk Score Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Score Expression</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression
   * @generated
   */
  EClass getChkScoreExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getSubtask <em>Subtask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subtask</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getSubtask()
   * @see #getChkScoreExpression()
   * @generated
   */
  EAttribute getChkScoreExpression_Subtask();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getScore <em>Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Score</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression#getScore()
   * @see #getChkScoreExpression()
   * @generated
   */
  EAttribute getChkScoreExpression_Score();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Score <em>Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Score</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Score
   * @generated
   */
  EClass getScore();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Score#getScores <em>Scores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scores</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Score#getScores()
   * @see #getScore()
   * @generated
   */
  EReference getScore_Scores();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.FollowUp <em>Follow Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Follow Up</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FollowUp
   * @generated
   */
  EClass getFollowUp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFol <em>Fol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fol</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFol()
   * @see #getFollowUp()
   * @generated
   */
  EAttribute getFollowUp_Fol();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFollowups <em>Followups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Followups</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FollowUp#getFollowups()
   * @see #getFollowUp()
   * @generated
   */
  EReference getFollowUp_Followups();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Property#getProp <em>Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Property#getProp()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Prop();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Property#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Property#getProperties()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.MR <em>MR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MR</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR
   * @generated
   */
  EClass getMR();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMr <em>Mr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mr</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR#getMr()
   * @see #getMR()
   * @generated
   */
  EAttribute getMR_Mr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR#getNum()
   * @see #getMR()
   * @generated
   */
  EAttribute getMR_Num();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getMrExp <em>Mr Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mr Exp</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR#getMrExp()
   * @see #getMR()
   * @generated
   */
  EReference getMR_MrExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getFollowup <em>Followup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Followup</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR#getFollowup()
   * @see #getMR()
   * @generated
   */
  EReference getMR_Followup();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.MR#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR#getProperty()
   * @see #getMR()
   * @generated
   */
  EReference getMR_Property();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration <em>Chk Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Variable Declaration</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration
   * @generated
   */
  EClass getChkVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getType()
   * @see #getChkVariableDeclaration()
   * @generated
   */
  EAttribute getChkVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSz <em>Sz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sz</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSz()
   * @see #getChkVariableDeclaration()
   * @generated
   */
  EAttribute getChkVariableDeclaration_Sz();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getName()
   * @see #getChkVariableDeclaration()
   * @generated
   */
  EAttribute getChkVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit1 <em>Limit1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit1</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit1()
   * @see #getChkVariableDeclaration()
   * @generated
   */
  EReference getChkVariableDeclaration_Limit1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Limit</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getLimit()
   * @see #getChkVariableDeclaration()
   * @generated
   */
  EReference getChkVariableDeclaration_Limit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSpValue <em>Sp Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sp Value</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration#getSpValue()
   * @see #getChkVariableDeclaration()
   * @generated
   */
  EReference getChkVariableDeclaration_SpValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.MethodCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MethodCall#getName()
   * @see #getMethodCall()
   * @generated
   */
  EAttribute getMethodCall_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.MethodCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.MethodCall#getParams()
   * @see #getMethodCall()
   * @generated
   */
  EAttribute getMethodCall_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix <em>Chk Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Prefix</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkPrefix
   * @generated
   */
  EClass getChkPrefix();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkPrefix#getType()
   * @see #getChkPrefix()
   * @generated
   */
  EAttribute getChkPrefix_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable <em>Chk Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Variable</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariable
   * @generated
   */
  EClass getChkVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pref</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getPref()
   * @see #getChkVariable()
   * @generated
   */
  EReference getChkVariable_Pref();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getVar()
   * @see #getChkVariable()
   * @generated
   */
  EAttribute getChkVariable_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getNewtest <em>Newtest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Newtest</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getNewtest()
   * @see #getChkVariable()
   * @generated
   */
  EAttribute getChkVariable_Newtest();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>V</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariable#getV()
   * @see #getChkVariable()
   * @generated
   */
  EAttribute getChkVariable_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables <em>Chk Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Variables</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariables
   * @generated
   */
  EClass getChkVariables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getVa <em>Va</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Va</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getVa()
   * @see #getChkVariables()
   * @generated
   */
  EReference getChkVariables_Va();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getNu <em>Nu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nu</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getNu()
   * @see #getChkVariables()
   * @generated
   */
  EAttribute getChkVariables_Nu();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getGr <em>Gr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gr</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariables#getGr()
   * @see #getChkVariables()
   * @generated
   */
  EReference getChkVariables_Gr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkItemGroup <em>Chk Item Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Item Group</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkItemGroup
   * @generated
   */
  EClass getChkItemGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkItemGroup#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkItemGroup#getVars()
   * @see #getChkItemGroup()
   * @generated
   */
  EReference getChkItemGroup_Vars();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Helper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper
   * @generated
   */
  EClass getHelper();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sum</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getSum()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Sum();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getVar()
   * @see #getHelper()
   * @generated
   */
  EReference getHelper_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getMax()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Max();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getMin()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Min();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPrime <em>Prime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prime</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getPrime()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Prime();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar3 <em>Var3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var3</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getVar3()
   * @see #getHelper()
   * @generated
   */
  EReference getHelper_Var3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwap <em>Swap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Swap</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getSwap()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Swap();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var1</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getVar1()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Var1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var2</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getVar2()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Var2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Select</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getSelect()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Select();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vars</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getVars()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Vars();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getVar4 <em>Var4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var4</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getVar4()
   * @see #getHelper()
   * @generated
   */
  EReference getHelper_Var4();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAdd <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getAdd()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Add();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getRemove()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Remove();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRandom <em>Random</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Random</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getRandom()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Random();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getSize()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Size();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getReverse <em>Reverse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reverse</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getReverse()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Reverse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contains</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getContains()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Contains();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAddRow <em>Add Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add Row</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getAddRow()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_AddRow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getAddCol <em>Add Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add Col</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getAddCol()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_AddCol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapRow <em>Swap Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Swap Row</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapRow()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_SwapRow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapCol <em>Swap Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Swap Col</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getSwapCol()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_SwapCol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveRow <em>Remove Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove Row</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveRow()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_RemoveRow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveCol <em>Remove Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove Col</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getRemoveCol()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_RemoveCol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPermute <em>Permute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Permute</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getPermute()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Permute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getPlus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plus</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getPlus()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Plus();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getMultiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiply</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getMultiply()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Multiply();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getInvert <em>Invert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Invert</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getInvert()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Invert();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getInclude <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getInclude()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Include();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getExclude <em>Exclude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclude</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getExclude()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Exclude();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Helper#getCompositional <em>Compositional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compositional</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper#getCompositional()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Compositional();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression <em>Chk Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Relational Expression</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression
   * @generated
   */
  EClass getChkRelationalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV1 <em>V1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V1</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV1()
   * @see #getChkRelationalExpression()
   * @generated
   */
  EReference getChkRelationalExpression_V1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getOpr <em>Opr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opr</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getOpr()
   * @see #getChkRelationalExpression()
   * @generated
   */
  EAttribute getChkRelationalExpression_Opr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V2</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression#getV2()
   * @see #getChkRelationalExpression()
   * @generated
   */
  EReference getChkRelationalExpression_V2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment <em>Chk Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Assignment</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkAssignment
   * @generated
   */
  EClass getChkAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getDef()
   * @see #getChkAssignment()
   * @generated
   */
  EAttribute getChkAssignment_Def();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV1 <em>V1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V1</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV1()
   * @see #getChkAssignment()
   * @generated
   */
  EReference getChkAssignment_V1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getOpr <em>Opr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opr</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getOpr()
   * @see #getChkAssignment()
   * @generated
   */
  EAttribute getChkAssignment_Opr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V2</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkAssignment#getV2()
   * @see #getChkAssignment()
   * @generated
   */
  EReference getChkAssignment_V2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkGeneralExpressions <em>Chk General Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk General Expressions</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkGeneralExpressions
   * @generated
   */
  EClass getChkGeneralExpressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkOperation <em>Chk Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Operation</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkOperation
   * @generated
   */
  EClass getChkOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operand</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkOperation#getOperand()
   * @see #getChkOperation()
   * @generated
   */
  EReference getChkOperation_Operand();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkOperation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkOperation#getOperator()
   * @see #getChkOperation()
   * @generated
   */
  EAttribute getChkOperation_Operator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression <em>Chk Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Loop Expression</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression
   * @generated
   */
  EClass getChkLoopExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression#getIndex()
   * @see #getChkLoopExpression()
   * @generated
   */
  EReference getChkLoopExpression_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression#getMaxIndex <em>Max Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Index</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression#getMaxIndex()
   * @see #getChkLoopExpression()
   * @generated
   */
  EReference getChkLoopExpression_MaxIndex();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ex</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression#getEx()
   * @see #getChkLoopExpression()
   * @generated
   */
  EReference getChkLoopExpression_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression <em>Chk Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chk Expression</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression
   * @generated
   */
  EClass getChkExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getExp()
   * @see #getChkExpression()
   * @generated
   */
  EReference getChkExpression_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Where</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getWhere()
   * @see #getChkExpression()
   * @generated
   */
  EAttribute getChkExpression_Where();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getNot()
   * @see #getChkExpression()
   * @generated
   */
  EAttribute getChkExpression_Not();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cond</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getCond()
   * @see #getChkExpression()
   * @generated
   */
  EReference getChkExpression_Cond();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getType()
   * @see #getChkExpression()
   * @generated
   */
  EAttribute getChkExpression_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getOp()
   * @see #getChkExpression()
   * @generated
   */
  EAttribute getChkExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression#getV()
   * @see #getChkExpression()
   * @generated
   */
  EReference getChkExpression_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Check#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Check#getCheck()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_Check();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Check#getChk <em>Chk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chk</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Check#getChk()
   * @see #getCheck()
   * @generated
   */
  EReference getCheck_Chk();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.SpValue <em>Sp Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sp Value</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.SpValue
   * @generated
   */
  EClass getSpValue();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.SpValue#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.SpValue#getVal()
   * @see #getSpValue()
   * @generated
   */
  EAttribute getSpValue_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Limit
   * @generated
   */
  EClass getLimit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Limit#getSub()
   * @see #getLimit()
   * @generated
   */
  EReference getLimit_Sub();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>A</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Limit#getA()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_A();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.checkerdsl.checkerDsl.Limit#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>B</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Limit#getB()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_B();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Subtask <em>Subtask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtask</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Subtask
   * @generated
   */
  EClass getSubtask();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.Subtask#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Subtask#getNum()
   * @see #getSubtask()
   * @generated
   */
  EAttribute getSubtask_Num();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.Format <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Format</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Format
   * @generated
   */
  EClass getFormat();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.Format#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.Format#getExp()
   * @see #getFormat()
   * @generated
   */
  EReference getFormat_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression <em>For Format Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Format Expression</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression
   * @generated
   */
  EClass getForFormatExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getIndex()
   * @see #getForFormatExpression()
   * @generated
   */
  EReference getForFormatExpression_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getMaxIndex <em>Max Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Index</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getMaxIndex()
   * @see #getForFormatExpression()
   * @generated
   */
  EReference getForFormatExpression_MaxIndex();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ex</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression#getEx()
   * @see #getForFormatExpression()
   * @generated
   */
  EReference getForFormatExpression_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.InputFormat <em>Input Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Format</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.InputFormat
   * @generated
   */
  EClass getInputFormat();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.InputFormat#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.InputFormat#getInput()
   * @see #getInputFormat()
   * @generated
   */
  EAttribute getInputFormat_Input();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.OutputFormat <em>Output Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Format</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.OutputFormat
   * @generated
   */
  EClass getOutputFormat();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.OutputFormat#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.OutputFormat#getOutput()
   * @see #getOutputFormat()
   * @generated
   */
  EAttribute getOutputFormat_Output();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.HiddenFormat <em>Hidden Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hidden Format</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.HiddenFormat
   * @generated
   */
  EClass getHiddenFormat();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.HiddenFormat#getHid <em>Hid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hid</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.HiddenFormat#getHid()
   * @see #getHiddenFormat()
   * @generated
   */
  EAttribute getHiddenFormat_Hid();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression <em>Format Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Format Expression</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatExpression
   * @generated
   */
  EClass getFormatExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getNum()
   * @see #getFormatExpression()
   * @generated
   */
  EAttribute getFormatExpression_Num();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatExpression#getVar()
   * @see #getFormatExpression()
   * @generated
   */
  EReference getFormatExpression_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable <em>Format Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Format Variable</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatVariable
   * @generated
   */
  EClass getFormatVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getFv <em>Fv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fv</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getFv()
   * @see #getFormatVariable()
   * @generated
   */
  EReference getFormatVariable_Fv();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatVariable#getCount()
   * @see #getFormatVariable()
   * @generated
   */
  EAttribute getFormatVariable_Count();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CheckerDslFactory getCheckerDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.DslImpl <em>Dsl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.DslImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getDsl()
     * @generated
     */
    EClass DSL = eINSTANCE.getDsl();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL__IMPORT_SECTION = eINSTANCE.getDsl_ImportSection();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL__ELEMENTS = eINSTANCE.getDsl_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.AbstractElementImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.PackageDeclarationImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ClassImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER_TYPE = eINSTANCE.getClass_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__FEATURES = eINSTANCE.getClass_Features();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.FeatureImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.MethodImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkScoreExpressionImpl <em>Chk Score Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkScoreExpressionImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkScoreExpression()
     * @generated
     */
    EClass CHK_SCORE_EXPRESSION = eINSTANCE.getChkScoreExpression();

    /**
     * The meta object literal for the '<em><b>Subtask</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_SCORE_EXPRESSION__SUBTASK = eINSTANCE.getChkScoreExpression_Subtask();

    /**
     * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_SCORE_EXPRESSION__SCORE = eINSTANCE.getChkScoreExpression_Score();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ScoreImpl <em>Score</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ScoreImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getScore()
     * @generated
     */
    EClass SCORE = eINSTANCE.getScore();

    /**
     * The meta object literal for the '<em><b>Scores</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCORE__SCORES = eINSTANCE.getScore_Scores();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FollowUpImpl <em>Follow Up</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.FollowUpImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFollowUp()
     * @generated
     */
    EClass FOLLOW_UP = eINSTANCE.getFollowUp();

    /**
     * The meta object literal for the '<em><b>Fol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOLLOW_UP__FOL = eINSTANCE.getFollowUp_Fol();

    /**
     * The meta object literal for the '<em><b>Followups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLLOW_UP__FOLLOWUPS = eINSTANCE.getFollowUp_Followups();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.PropertyImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Prop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__PROP = eINSTANCE.getProperty_Prop();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__PROPERTIES = eINSTANCE.getProperty_Properties();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl <em>MR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.MRImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getMR()
     * @generated
     */
    EClass MR = eINSTANCE.getMR();

    /**
     * The meta object literal for the '<em><b>Mr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MR__MR = eINSTANCE.getMR_Mr();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MR__NUM = eINSTANCE.getMR_Num();

    /**
     * The meta object literal for the '<em><b>Mr Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MR__MR_EXP = eINSTANCE.getMR_MrExp();

    /**
     * The meta object literal for the '<em><b>Followup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MR__FOLLOWUP = eINSTANCE.getMR_Followup();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MR__PROPERTY = eINSTANCE.getMR_Property();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl <em>Chk Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableDeclarationImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkVariableDeclaration()
     * @generated
     */
    EClass CHK_VARIABLE_DECLARATION = eINSTANCE.getChkVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLE_DECLARATION__TYPE = eINSTANCE.getChkVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Sz</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLE_DECLARATION__SZ = eINSTANCE.getChkVariableDeclaration_Sz();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLE_DECLARATION__NAME = eINSTANCE.getChkVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Limit1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_VARIABLE_DECLARATION__LIMIT1 = eINSTANCE.getChkVariableDeclaration_Limit1();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_VARIABLE_DECLARATION__LIMIT = eINSTANCE.getChkVariableDeclaration_Limit();

    /**
     * The meta object literal for the '<em><b>Sp Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_VARIABLE_DECLARATION__SP_VALUE = eINSTANCE.getChkVariableDeclaration_SpValue();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.MethodCallImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_CALL__NAME = eINSTANCE.getMethodCall_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_CALL__PARAMS = eINSTANCE.getMethodCall_Params();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkPrefixImpl <em>Chk Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkPrefixImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkPrefix()
     * @generated
     */
    EClass CHK_PREFIX = eINSTANCE.getChkPrefix();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_PREFIX__TYPE = eINSTANCE.getChkPrefix_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl <em>Chk Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariableImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkVariable()
     * @generated
     */
    EClass CHK_VARIABLE = eINSTANCE.getChkVariable();

    /**
     * The meta object literal for the '<em><b>Pref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_VARIABLE__PREF = eINSTANCE.getChkVariable_Pref();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLE__VAR = eINSTANCE.getChkVariable_Var();

    /**
     * The meta object literal for the '<em><b>Newtest</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLE__NEWTEST = eINSTANCE.getChkVariable_Newtest();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLE__V = eINSTANCE.getChkVariable_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl <em>Chk Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkVariablesImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkVariables()
     * @generated
     */
    EClass CHK_VARIABLES = eINSTANCE.getChkVariables();

    /**
     * The meta object literal for the '<em><b>Va</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_VARIABLES__VA = eINSTANCE.getChkVariables_Va();

    /**
     * The meta object literal for the '<em><b>Nu</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_VARIABLES__NU = eINSTANCE.getChkVariables_Nu();

    /**
     * The meta object literal for the '<em><b>Gr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_VARIABLES__GR = eINSTANCE.getChkVariables_Gr();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkItemGroupImpl <em>Chk Item Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkItemGroupImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkItemGroup()
     * @generated
     */
    EClass CHK_ITEM_GROUP = eINSTANCE.getChkItemGroup();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_ITEM_GROUP__VARS = eINSTANCE.getChkItemGroup_Vars();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl <em>Helper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.HelperImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getHelper()
     * @generated
     */
    EClass HELPER = eINSTANCE.getHelper();

    /**
     * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__SUM = eINSTANCE.getHelper_Sum();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER__VAR = eINSTANCE.getHelper_Var();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__MAX = eINSTANCE.getHelper_Max();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__MIN = eINSTANCE.getHelper_Min();

    /**
     * The meta object literal for the '<em><b>Prime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__PRIME = eINSTANCE.getHelper_Prime();

    /**
     * The meta object literal for the '<em><b>Var3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER__VAR3 = eINSTANCE.getHelper_Var3();

    /**
     * The meta object literal for the '<em><b>Swap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__SWAP = eINSTANCE.getHelper_Swap();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__VAR1 = eINSTANCE.getHelper_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__VAR2 = eINSTANCE.getHelper_Var2();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__SELECT = eINSTANCE.getHelper_Select();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__VARS = eINSTANCE.getHelper_Vars();

    /**
     * The meta object literal for the '<em><b>Var4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER__VAR4 = eINSTANCE.getHelper_Var4();

    /**
     * The meta object literal for the '<em><b>Add</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__ADD = eINSTANCE.getHelper_Add();

    /**
     * The meta object literal for the '<em><b>Remove</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__REMOVE = eINSTANCE.getHelper_Remove();

    /**
     * The meta object literal for the '<em><b>Random</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__RANDOM = eINSTANCE.getHelper_Random();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__SIZE = eINSTANCE.getHelper_Size();

    /**
     * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__REVERSE = eINSTANCE.getHelper_Reverse();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__CONTAINS = eINSTANCE.getHelper_Contains();

    /**
     * The meta object literal for the '<em><b>Add Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__ADD_ROW = eINSTANCE.getHelper_AddRow();

    /**
     * The meta object literal for the '<em><b>Add Col</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__ADD_COL = eINSTANCE.getHelper_AddCol();

    /**
     * The meta object literal for the '<em><b>Swap Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__SWAP_ROW = eINSTANCE.getHelper_SwapRow();

    /**
     * The meta object literal for the '<em><b>Swap Col</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__SWAP_COL = eINSTANCE.getHelper_SwapCol();

    /**
     * The meta object literal for the '<em><b>Remove Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__REMOVE_ROW = eINSTANCE.getHelper_RemoveRow();

    /**
     * The meta object literal for the '<em><b>Remove Col</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__REMOVE_COL = eINSTANCE.getHelper_RemoveCol();

    /**
     * The meta object literal for the '<em><b>Permute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__PERMUTE = eINSTANCE.getHelper_Permute();

    /**
     * The meta object literal for the '<em><b>Plus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__PLUS = eINSTANCE.getHelper_Plus();

    /**
     * The meta object literal for the '<em><b>Multiply</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__MULTIPLY = eINSTANCE.getHelper_Multiply();

    /**
     * The meta object literal for the '<em><b>Invert</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__INVERT = eINSTANCE.getHelper_Invert();

    /**
     * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__INCLUDE = eINSTANCE.getHelper_Include();

    /**
     * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__EXCLUDE = eINSTANCE.getHelper_Exclude();

    /**
     * The meta object literal for the '<em><b>Compositional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__COMPOSITIONAL = eINSTANCE.getHelper_Compositional();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl <em>Chk Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkRelationalExpressionImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkRelationalExpression()
     * @generated
     */
    EClass CHK_RELATIONAL_EXPRESSION = eINSTANCE.getChkRelationalExpression();

    /**
     * The meta object literal for the '<em><b>V1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_RELATIONAL_EXPRESSION__V1 = eINSTANCE.getChkRelationalExpression_V1();

    /**
     * The meta object literal for the '<em><b>Opr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_RELATIONAL_EXPRESSION__OPR = eINSTANCE.getChkRelationalExpression_Opr();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_RELATIONAL_EXPRESSION__V2 = eINSTANCE.getChkRelationalExpression_V2();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl <em>Chk Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkAssignmentImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkAssignment()
     * @generated
     */
    EClass CHK_ASSIGNMENT = eINSTANCE.getChkAssignment();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_ASSIGNMENT__DEF = eINSTANCE.getChkAssignment_Def();

    /**
     * The meta object literal for the '<em><b>V1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_ASSIGNMENT__V1 = eINSTANCE.getChkAssignment_V1();

    /**
     * The meta object literal for the '<em><b>Opr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_ASSIGNMENT__OPR = eINSTANCE.getChkAssignment_Opr();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_ASSIGNMENT__V2 = eINSTANCE.getChkAssignment_V2();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkGeneralExpressionsImpl <em>Chk General Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkGeneralExpressionsImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkGeneralExpressions()
     * @generated
     */
    EClass CHK_GENERAL_EXPRESSIONS = eINSTANCE.getChkGeneralExpressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkOperationImpl <em>Chk Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkOperationImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkOperation()
     * @generated
     */
    EClass CHK_OPERATION = eINSTANCE.getChkOperation();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_OPERATION__OPERAND = eINSTANCE.getChkOperation_Operand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_OPERATION__OPERATOR = eINSTANCE.getChkOperation_Operator();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkLoopExpressionImpl <em>Chk Loop Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkLoopExpressionImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkLoopExpression()
     * @generated
     */
    EClass CHK_LOOP_EXPRESSION = eINSTANCE.getChkLoopExpression();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_LOOP_EXPRESSION__INDEX = eINSTANCE.getChkLoopExpression_Index();

    /**
     * The meta object literal for the '<em><b>Max Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_LOOP_EXPRESSION__MAX_INDEX = eINSTANCE.getChkLoopExpression_MaxIndex();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_LOOP_EXPRESSION__EX = eINSTANCE.getChkLoopExpression_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl <em>Chk Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ChkExpressionImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getChkExpression()
     * @generated
     */
    EClass CHK_EXPRESSION = eINSTANCE.getChkExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_EXPRESSION__EXP = eINSTANCE.getChkExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_EXPRESSION__WHERE = eINSTANCE.getChkExpression_Where();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_EXPRESSION__NOT = eINSTANCE.getChkExpression_Not();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_EXPRESSION__COND = eINSTANCE.getChkExpression_Cond();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_EXPRESSION__TYPE = eINSTANCE.getChkExpression_Type();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHK_EXPRESSION__OP = eINSTANCE.getChkExpression_Op();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHK_EXPRESSION__V = eINSTANCE.getChkExpression_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__CHECK = eINSTANCE.getCheck_Check();

    /**
     * The meta object literal for the '<em><b>Chk</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK__CHK = eINSTANCE.getCheck_Chk();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.SpValueImpl <em>Sp Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.SpValueImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getSpValue()
     * @generated
     */
    EClass SP_VALUE = eINSTANCE.getSpValue();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VALUE__VAL = eINSTANCE.getSpValue_Val();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl <em>Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.LimitImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getLimit()
     * @generated
     */
    EClass LIMIT = eINSTANCE.getLimit();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIMIT__SUB = eINSTANCE.getLimit_Sub();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMIT__A = eINSTANCE.getLimit_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMIT__B = eINSTANCE.getLimit_B();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.SubtaskImpl <em>Subtask</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.SubtaskImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getSubtask()
     * @generated
     */
    EClass SUBTASK = eINSTANCE.getSubtask();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBTASK__NUM = eINSTANCE.getSubtask_Num();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatImpl <em>Format</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.FormatImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFormat()
     * @generated
     */
    EClass FORMAT = eINSTANCE.getFormat();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT__EXP = eINSTANCE.getFormat_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl <em>For Format Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.ForFormatExpressionImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getForFormatExpression()
     * @generated
     */
    EClass FOR_FORMAT_EXPRESSION = eINSTANCE.getForFormatExpression();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_FORMAT_EXPRESSION__INDEX = eINSTANCE.getForFormatExpression_Index();

    /**
     * The meta object literal for the '<em><b>Max Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_FORMAT_EXPRESSION__MAX_INDEX = eINSTANCE.getForFormatExpression_MaxIndex();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_FORMAT_EXPRESSION__EX = eINSTANCE.getForFormatExpression_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.InputFormatImpl <em>Input Format</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.InputFormatImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getInputFormat()
     * @generated
     */
    EClass INPUT_FORMAT = eINSTANCE.getInputFormat();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_FORMAT__INPUT = eINSTANCE.getInputFormat_Input();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.OutputFormatImpl <em>Output Format</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.OutputFormatImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getOutputFormat()
     * @generated
     */
    EClass OUTPUT_FORMAT = eINSTANCE.getOutputFormat();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_FORMAT__OUTPUT = eINSTANCE.getOutputFormat_Output();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.HiddenFormatImpl <em>Hidden Format</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.HiddenFormatImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getHiddenFormat()
     * @generated
     */
    EClass HIDDEN_FORMAT = eINSTANCE.getHiddenFormat();

    /**
     * The meta object literal for the '<em><b>Hid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HIDDEN_FORMAT__HID = eINSTANCE.getHiddenFormat_Hid();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl <em>Format Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.FormatExpressionImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFormatExpression()
     * @generated
     */
    EClass FORMAT_EXPRESSION = eINSTANCE.getFormatExpression();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAT_EXPRESSION__NUM = eINSTANCE.getFormatExpression_Num();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_EXPRESSION__VAR = eINSTANCE.getFormatExpression_Var();

    /**
     * The meta object literal for the '{@link org.xtext.example.checkerdsl.checkerDsl.impl.FormatVariableImpl <em>Format Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.FormatVariableImpl
     * @see org.xtext.example.checkerdsl.checkerDsl.impl.CheckerDslPackageImpl#getFormatVariable()
     * @generated
     */
    EClass FORMAT_VARIABLE = eINSTANCE.getFormatVariable();

    /**
     * The meta object literal for the '<em><b>Fv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_VARIABLE__FV = eINSTANCE.getFormatVariable_Fv();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAT_VARIABLE__COUNT = eINSTANCE.getFormatVariable_Count();

  }

} //CheckerDslPackage
