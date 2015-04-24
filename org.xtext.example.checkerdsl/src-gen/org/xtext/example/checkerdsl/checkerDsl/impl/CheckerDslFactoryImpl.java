/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.checkerdsl.checkerDsl.AbstractElement;
import org.xtext.example.checkerdsl.checkerDsl.Check;
import org.xtext.example.checkerdsl.checkerDsl.CheckerDslFactory;
import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkAssignment;
import org.xtext.example.checkerdsl.checkerDsl.ChkExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkGeneralExpressions;
import org.xtext.example.checkerdsl.checkerDsl.ChkItemGroup;
import org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkOperation;
import org.xtext.example.checkerdsl.checkerDsl.ChkPrefix;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;
import org.xtext.example.checkerdsl.checkerDsl.Dsl;
import org.xtext.example.checkerdsl.checkerDsl.Feature;
import org.xtext.example.checkerdsl.checkerDsl.FollowUp;
import org.xtext.example.checkerdsl.checkerDsl.Format;
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression;
import org.xtext.example.checkerdsl.checkerDsl.Helper;
import org.xtext.example.checkerdsl.checkerDsl.InputFormat;
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.MR;
import org.xtext.example.checkerdsl.checkerDsl.Method;
import org.xtext.example.checkerdsl.checkerDsl.MethodCall;
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat;
import org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.Property;
import org.xtext.example.checkerdsl.checkerDsl.Score;
import org.xtext.example.checkerdsl.checkerDsl.SpValue;
import org.xtext.example.checkerdsl.checkerDsl.Subtask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckerDslFactoryImpl extends EFactoryImpl implements CheckerDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CheckerDslFactory init()
  {
    try
    {
      CheckerDslFactory theCheckerDslFactory = (CheckerDslFactory)EPackage.Registry.INSTANCE.getEFactory(CheckerDslPackage.eNS_URI);
      if (theCheckerDslFactory != null)
      {
        return theCheckerDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CheckerDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckerDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CheckerDslPackage.DSL: return createDsl();
      case CheckerDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case CheckerDslPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case CheckerDslPackage.CLASS: return createClass();
      case CheckerDslPackage.FEATURE: return createFeature();
      case CheckerDslPackage.METHOD: return createMethod();
      case CheckerDslPackage.CHK_SCORE_EXPRESSION: return createChkScoreExpression();
      case CheckerDslPackage.SCORE: return createScore();
      case CheckerDslPackage.FOLLOW_UP: return createFollowUp();
      case CheckerDslPackage.PROPERTY: return createProperty();
      case CheckerDslPackage.MR: return createMR();
      case CheckerDslPackage.CHK_VARIABLE_DECLARATION: return createChkVariableDeclaration();
      case CheckerDslPackage.METHOD_CALL: return createMethodCall();
      case CheckerDslPackage.CHK_PREFIX: return createChkPrefix();
      case CheckerDslPackage.CHK_VARIABLE: return createChkVariable();
      case CheckerDslPackage.CHK_VARIABLES: return createChkVariables();
      case CheckerDslPackage.CHK_ITEM_GROUP: return createChkItemGroup();
      case CheckerDslPackage.HELPER: return createHelper();
      case CheckerDslPackage.CHK_RELATIONAL_EXPRESSION: return createChkRelationalExpression();
      case CheckerDslPackage.CHK_ASSIGNMENT: return createChkAssignment();
      case CheckerDslPackage.CHK_GENERAL_EXPRESSIONS: return createChkGeneralExpressions();
      case CheckerDslPackage.CHK_OPERATION: return createChkOperation();
      case CheckerDslPackage.CHK_LOOP_EXPRESSION: return createChkLoopExpression();
      case CheckerDslPackage.CHK_EXPRESSION: return createChkExpression();
      case CheckerDslPackage.CHECK: return createCheck();
      case CheckerDslPackage.SP_VALUE: return createSpValue();
      case CheckerDslPackage.LIMIT: return createLimit();
      case CheckerDslPackage.SUBTASK: return createSubtask();
      case CheckerDslPackage.FORMAT: return createFormat();
      case CheckerDslPackage.INPUT_FORMAT: return createInputFormat();
      case CheckerDslPackage.OUTPUT_FORMAT: return createOutputFormat();
      case CheckerDslPackage.FORMAT_EXPRESSION: return createFormatExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dsl createDsl()
  {
    DslImpl dsl = new DslImpl();
    return dsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.checkerdsl.checkerDsl.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkScoreExpression createChkScoreExpression()
  {
    ChkScoreExpressionImpl chkScoreExpression = new ChkScoreExpressionImpl();
    return chkScoreExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Score createScore()
  {
    ScoreImpl score = new ScoreImpl();
    return score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FollowUp createFollowUp()
  {
    FollowUpImpl followUp = new FollowUpImpl();
    return followUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MR createMR()
  {
    MRImpl mr = new MRImpl();
    return mr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariableDeclaration createChkVariableDeclaration()
  {
    ChkVariableDeclarationImpl chkVariableDeclaration = new ChkVariableDeclarationImpl();
    return chkVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkPrefix createChkPrefix()
  {
    ChkPrefixImpl chkPrefix = new ChkPrefixImpl();
    return chkPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariable createChkVariable()
  {
    ChkVariableImpl chkVariable = new ChkVariableImpl();
    return chkVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkVariables createChkVariables()
  {
    ChkVariablesImpl chkVariables = new ChkVariablesImpl();
    return chkVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkItemGroup createChkItemGroup()
  {
    ChkItemGroupImpl chkItemGroup = new ChkItemGroupImpl();
    return chkItemGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Helper createHelper()
  {
    HelperImpl helper = new HelperImpl();
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkRelationalExpression createChkRelationalExpression()
  {
    ChkRelationalExpressionImpl chkRelationalExpression = new ChkRelationalExpressionImpl();
    return chkRelationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkAssignment createChkAssignment()
  {
    ChkAssignmentImpl chkAssignment = new ChkAssignmentImpl();
    return chkAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkGeneralExpressions createChkGeneralExpressions()
  {
    ChkGeneralExpressionsImpl chkGeneralExpressions = new ChkGeneralExpressionsImpl();
    return chkGeneralExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkOperation createChkOperation()
  {
    ChkOperationImpl chkOperation = new ChkOperationImpl();
    return chkOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkLoopExpression createChkLoopExpression()
  {
    ChkLoopExpressionImpl chkLoopExpression = new ChkLoopExpressionImpl();
    return chkLoopExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChkExpression createChkExpression()
  {
    ChkExpressionImpl chkExpression = new ChkExpressionImpl();
    return chkExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpValue createSpValue()
  {
    SpValueImpl spValue = new SpValueImpl();
    return spValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit createLimit()
  {
    LimitImpl limit = new LimitImpl();
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtask createSubtask()
  {
    SubtaskImpl subtask = new SubtaskImpl();
    return subtask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Format createFormat()
  {
    FormatImpl format = new FormatImpl();
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputFormat createInputFormat()
  {
    InputFormatImpl inputFormat = new InputFormatImpl();
    return inputFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputFormat createOutputFormat()
  {
    OutputFormatImpl outputFormat = new OutputFormatImpl();
    return outputFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatExpression createFormatExpression()
  {
    FormatExpressionImpl formatExpression = new FormatExpressionImpl();
    return formatExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckerDslPackage getCheckerDslPackage()
  {
    return (CheckerDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CheckerDslPackage getPackage()
  {
    return CheckerDslPackage.eINSTANCE;
  }

} //CheckerDslFactoryImpl
