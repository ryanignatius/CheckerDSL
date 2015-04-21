/**
 */
package org.xtext.example.checkerdsl.checkerDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.xtext.example.checkerdsl.checkerDsl.AbstractElement;
import org.xtext.example.checkerdsl.checkerDsl.Check;
import org.xtext.example.checkerdsl.checkerDsl.CheckerDslFactory;
import org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage;
import org.xtext.example.checkerdsl.checkerDsl.ChkAssignment;
import org.xtext.example.checkerdsl.checkerDsl.ChkExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkPrefix;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpressions;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;
import org.xtext.example.checkerdsl.checkerDsl.Dsl;
import org.xtext.example.checkerdsl.checkerDsl.Feature;
import org.xtext.example.checkerdsl.checkerDsl.Format;
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression;
import org.xtext.example.checkerdsl.checkerDsl.Helper;
import org.xtext.example.checkerdsl.checkerDsl.InputFormat;
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.Method;
import org.xtext.example.checkerdsl.checkerDsl.MethodCall;
import org.xtext.example.checkerdsl.checkerDsl.MrExpression;
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat;
import org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.Property;
import org.xtext.example.checkerdsl.checkerDsl.Subtask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckerDslPackageImpl extends EPackageImpl implements CheckerDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkPrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkVariablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkRelationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkRelationalExpressionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chkExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formatExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CheckerDslPackageImpl()
  {
    super(eNS_URI, CheckerDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CheckerDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CheckerDslPackage init()
  {
    if (isInited) return (CheckerDslPackage)EPackage.Registry.INSTANCE.getEPackage(CheckerDslPackage.eNS_URI);

    // Obtain or create and register package
    CheckerDslPackageImpl theCheckerDslPackage = (CheckerDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CheckerDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CheckerDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCheckerDslPackage.createPackageContents();

    // Initialize created meta-data
    theCheckerDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCheckerDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CheckerDslPackage.eNS_URI, theCheckerDslPackage);
    return theCheckerDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDsl()
  {
    return dslEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDsl_ImportSection()
  {
    return (EReference)dslEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDsl_Elements()
  {
    return (EReference)dslEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_SuperType()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Features()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Type()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Params()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Body()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMR()
  {
    return mrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMR_Mr()
  {
    return (EAttribute)mrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMR_Num()
  {
    return (EAttribute)mrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMR_MrExpression()
  {
    return (EReference)mrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Type()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Sz()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Limit()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodCall()
  {
    return methodCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodCall_Name()
  {
    return (EAttribute)methodCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodCall_Params()
  {
    return (EAttribute)methodCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkPrefix()
  {
    return chkPrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkPrefix_Type()
  {
    return (EAttribute)chkPrefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkPrefix_Newtest()
  {
    return (EAttribute)chkPrefixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkVariable()
  {
    return chkVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkVariable_Pref()
  {
    return (EReference)chkVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkVariable_Var()
  {
    return (EAttribute)chkVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkVariable_V()
  {
    return (EAttribute)chkVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkVariables()
  {
    return chkVariablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkVariables_Va()
  {
    return (EReference)chkVariablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkVariables_Nu()
  {
    return (EAttribute)chkVariablesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelper()
  {
    return helperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Sum()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelper_Var()
  {
    return (EReference)helperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Max()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Min()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Prime()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Swap()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Var1()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Var2()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Select()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Vars()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Add()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelper_Var3()
  {
    return (EReference)helperEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkRelationalExpression()
  {
    return chkRelationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkRelationalExpression_V1()
  {
    return (EReference)chkRelationalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkRelationalExpression_Opr()
  {
    return (EAttribute)chkRelationalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkRelationalExpression_V2()
  {
    return (EReference)chkRelationalExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkAssignment()
  {
    return chkAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkAssignment_V1()
  {
    return (EReference)chkAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkAssignment_Opr()
  {
    return (EAttribute)chkAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkAssignment_V2()
  {
    return (EReference)chkAssignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkRelationalExpressions()
  {
    return chkRelationalExpressionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChkExpression()
  {
    return chkExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkExpression_Asg()
  {
    return (EAttribute)chkExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkExpression_Exp()
  {
    return (EReference)chkExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkExpression_Where()
  {
    return (EAttribute)chkExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkExpression_Cond()
  {
    return (EReference)chkExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkExpression_Type()
  {
    return (EAttribute)chkExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChkExpression_Op()
  {
    return (EAttribute)chkExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChkExpression_V()
  {
    return (EReference)chkExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMrExpression()
  {
    return mrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMrExpression_Asg()
  {
    return (EAttribute)mrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMrExpression_Exp()
  {
    return (EReference)mrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMrExpression_Where()
  {
    return (EAttribute)mrExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMrExpression_Cond()
  {
    return (EReference)mrExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMrExpression_Type()
  {
    return (EAttribute)mrExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMrExpression_Op()
  {
    return (EAttribute)mrExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMrExpression_V()
  {
    return (EReference)mrExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheck()
  {
    return checkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheck_Check()
  {
    return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheck_Chk()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimit()
  {
    return limitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimit_Sub()
  {
    return (EReference)limitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimit_A()
  {
    return (EAttribute)limitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimit_B()
  {
    return (EAttribute)limitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtask()
  {
    return subtaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubtask_Num()
  {
    return (EAttribute)subtaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormat()
  {
    return formatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormat_Exp()
  {
    return (EReference)formatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputFormat()
  {
    return inputFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputFormat_Input()
  {
    return (EAttribute)inputFormatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputFormat()
  {
    return outputFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputFormat_Output()
  {
    return (EAttribute)outputFormatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormatExpression()
  {
    return formatExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormatExpression_Num()
  {
    return (EAttribute)formatExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormatExpression_Var()
  {
    return (EAttribute)formatExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormatExpression_Count()
  {
    return (EAttribute)formatExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckerDslFactory getCheckerDslFactory()
  {
    return (CheckerDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dslEClass = createEClass(DSL);
    createEReference(dslEClass, DSL__IMPORT_SECTION);
    createEReference(dslEClass, DSL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    classEClass = createEClass(CLASS);
    createEReference(classEClass, CLASS__SUPER_TYPE);
    createEReference(classEClass, CLASS__FEATURES);

    featureEClass = createEClass(FEATURE);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__TYPE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMS);
    createEReference(methodEClass, METHOD__BODY);

    mrEClass = createEClass(MR);
    createEAttribute(mrEClass, MR__MR);
    createEAttribute(mrEClass, MR__NUM);
    createEReference(mrEClass, MR__MR_EXPRESSION);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__TYPE);
    createEAttribute(propertyEClass, PROPERTY__SZ);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__LIMIT);

    methodCallEClass = createEClass(METHOD_CALL);
    createEAttribute(methodCallEClass, METHOD_CALL__NAME);
    createEAttribute(methodCallEClass, METHOD_CALL__PARAMS);

    chkPrefixEClass = createEClass(CHK_PREFIX);
    createEAttribute(chkPrefixEClass, CHK_PREFIX__TYPE);
    createEAttribute(chkPrefixEClass, CHK_PREFIX__NEWTEST);

    chkVariableEClass = createEClass(CHK_VARIABLE);
    createEReference(chkVariableEClass, CHK_VARIABLE__PREF);
    createEAttribute(chkVariableEClass, CHK_VARIABLE__VAR);
    createEAttribute(chkVariableEClass, CHK_VARIABLE__V);

    chkVariablesEClass = createEClass(CHK_VARIABLES);
    createEReference(chkVariablesEClass, CHK_VARIABLES__VA);
    createEAttribute(chkVariablesEClass, CHK_VARIABLES__NU);

    helperEClass = createEClass(HELPER);
    createEAttribute(helperEClass, HELPER__SUM);
    createEReference(helperEClass, HELPER__VAR);
    createEAttribute(helperEClass, HELPER__MAX);
    createEAttribute(helperEClass, HELPER__MIN);
    createEAttribute(helperEClass, HELPER__PRIME);
    createEAttribute(helperEClass, HELPER__SWAP);
    createEAttribute(helperEClass, HELPER__VAR1);
    createEAttribute(helperEClass, HELPER__VAR2);
    createEAttribute(helperEClass, HELPER__SELECT);
    createEAttribute(helperEClass, HELPER__VARS);
    createEAttribute(helperEClass, HELPER__ADD);
    createEReference(helperEClass, HELPER__VAR3);

    chkRelationalExpressionEClass = createEClass(CHK_RELATIONAL_EXPRESSION);
    createEReference(chkRelationalExpressionEClass, CHK_RELATIONAL_EXPRESSION__V1);
    createEAttribute(chkRelationalExpressionEClass, CHK_RELATIONAL_EXPRESSION__OPR);
    createEReference(chkRelationalExpressionEClass, CHK_RELATIONAL_EXPRESSION__V2);

    chkAssignmentEClass = createEClass(CHK_ASSIGNMENT);
    createEReference(chkAssignmentEClass, CHK_ASSIGNMENT__V1);
    createEAttribute(chkAssignmentEClass, CHK_ASSIGNMENT__OPR);
    createEReference(chkAssignmentEClass, CHK_ASSIGNMENT__V2);

    chkRelationalExpressionsEClass = createEClass(CHK_RELATIONAL_EXPRESSIONS);

    chkExpressionEClass = createEClass(CHK_EXPRESSION);
    createEAttribute(chkExpressionEClass, CHK_EXPRESSION__ASG);
    createEReference(chkExpressionEClass, CHK_EXPRESSION__EXP);
    createEAttribute(chkExpressionEClass, CHK_EXPRESSION__WHERE);
    createEReference(chkExpressionEClass, CHK_EXPRESSION__COND);
    createEAttribute(chkExpressionEClass, CHK_EXPRESSION__TYPE);
    createEAttribute(chkExpressionEClass, CHK_EXPRESSION__OP);
    createEReference(chkExpressionEClass, CHK_EXPRESSION__V);

    mrExpressionEClass = createEClass(MR_EXPRESSION);
    createEAttribute(mrExpressionEClass, MR_EXPRESSION__ASG);
    createEReference(mrExpressionEClass, MR_EXPRESSION__EXP);
    createEAttribute(mrExpressionEClass, MR_EXPRESSION__WHERE);
    createEReference(mrExpressionEClass, MR_EXPRESSION__COND);
    createEAttribute(mrExpressionEClass, MR_EXPRESSION__TYPE);
    createEAttribute(mrExpressionEClass, MR_EXPRESSION__OP);
    createEReference(mrExpressionEClass, MR_EXPRESSION__V);

    checkEClass = createEClass(CHECK);
    createEAttribute(checkEClass, CHECK__CHECK);
    createEReference(checkEClass, CHECK__CHK);

    limitEClass = createEClass(LIMIT);
    createEReference(limitEClass, LIMIT__SUB);
    createEAttribute(limitEClass, LIMIT__A);
    createEAttribute(limitEClass, LIMIT__B);

    subtaskEClass = createEClass(SUBTASK);
    createEAttribute(subtaskEClass, SUBTASK__NUM);

    formatEClass = createEClass(FORMAT);
    createEReference(formatEClass, FORMAT__EXP);

    inputFormatEClass = createEClass(INPUT_FORMAT);
    createEAttribute(inputFormatEClass, INPUT_FORMAT__INPUT);

    outputFormatEClass = createEClass(OUTPUT_FORMAT);
    createEAttribute(outputFormatEClass, OUTPUT_FORMAT__OUTPUT);

    formatExpressionEClass = createEClass(FORMAT_EXPRESSION);
    createEAttribute(formatExpressionEClass, FORMAT_EXPRESSION__NUM);
    createEAttribute(formatExpressionEClass, FORMAT_EXPRESSION__VAR);
    createEAttribute(formatExpressionEClass, FORMAT_EXPRESSION__COUNT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    classEClass.getESuperTypes().add(this.getAbstractElement());
    methodEClass.getESuperTypes().add(this.getFeature());
    mrEClass.getESuperTypes().add(this.getFeature());
    propertyEClass.getESuperTypes().add(this.getFeature());
    methodCallEClass.getESuperTypes().add(this.getChkRelationalExpressions());
    helperEClass.getESuperTypes().add(this.getChkRelationalExpressions());
    chkRelationalExpressionEClass.getESuperTypes().add(this.getChkRelationalExpressions());
    checkEClass.getESuperTypes().add(this.getFeature());
    formatEClass.getESuperTypes().add(this.getFeature());
    inputFormatEClass.getESuperTypes().add(this.getFormat());
    outputFormatEClass.getESuperTypes().add(this.getFormat());

    // Initialize classes and features; add operations and parameters
    initEClass(dslEClass, Dsl.class, "Dsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDsl_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDsl_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Dsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, org.xtext.example.checkerdsl.checkerDsl.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClass_SuperType(), theTypesPackage.getJvmTypeReference(), null, "superType", null, 0, 1, org.xtext.example.checkerdsl.checkerDsl.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Features(), this.getFeature(), null, "features", null, 0, -1, org.xtext.example.checkerdsl.checkerDsl.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Params(), theTypesPackage.getJvmFormalParameter(), null, "params", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mrEClass, org.xtext.example.checkerdsl.checkerDsl.MR.class, "MR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMR_Mr(), ecorePackage.getEString(), "mr", null, 0, 1, org.xtext.example.checkerdsl.checkerDsl.MR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMR_Num(), ecorePackage.getEInt(), "num", null, 0, 1, org.xtext.example.checkerdsl.checkerDsl.MR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMR_MrExpression(), this.getMrExpression(), null, "mrExpression", null, 0, -1, org.xtext.example.checkerdsl.checkerDsl.MR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Sz(), ecorePackage.getEString(), "sz", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Limit(), this.getLimit(), null, "limit", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodCall_Params(), ecorePackage.getEString(), "params", null, 0, -1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chkPrefixEClass, ChkPrefix.class, "ChkPrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChkPrefix_Type(), ecorePackage.getEString(), "type", null, 0, 1, ChkPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkPrefix_Newtest(), ecorePackage.getEString(), "newtest", null, 0, 1, ChkPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chkVariableEClass, ChkVariable.class, "ChkVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChkVariable_Pref(), this.getChkPrefix(), null, "pref", null, 0, 1, ChkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkVariable_Var(), ecorePackage.getEString(), "var", null, 0, 1, ChkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkVariable_V(), ecorePackage.getEString(), "v", null, 0, -1, ChkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chkVariablesEClass, ChkVariables.class, "ChkVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChkVariables_Va(), this.getChkVariable(), null, "va", null, 0, 1, ChkVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkVariables_Nu(), ecorePackage.getEInt(), "nu", null, 0, 1, ChkVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHelper_Sum(), ecorePackage.getEString(), "sum", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelper_Var(), ecorePackage.getEObject(), null, "var", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Max(), ecorePackage.getEString(), "max", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Min(), ecorePackage.getEString(), "min", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Prime(), ecorePackage.getEString(), "prime", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Swap(), ecorePackage.getEString(), "swap", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Var1(), ecorePackage.getEString(), "var1", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Var2(), ecorePackage.getEString(), "var2", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Select(), ecorePackage.getEString(), "select", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Vars(), ecorePackage.getEString(), "vars", null, 0, -1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHelper_Add(), ecorePackage.getEString(), "add", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelper_Var3(), this.getChkVariables(), null, "var3", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chkRelationalExpressionEClass, ChkRelationalExpression.class, "ChkRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChkRelationalExpression_V1(), this.getChkVariables(), null, "v1", null, 0, 1, ChkRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkRelationalExpression_Opr(), ecorePackage.getEString(), "opr", null, 0, 1, ChkRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChkRelationalExpression_V2(), this.getChkVariables(), null, "v2", null, 0, 1, ChkRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chkAssignmentEClass, ChkAssignment.class, "ChkAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChkAssignment_V1(), this.getChkVariables(), null, "v1", null, 0, 1, ChkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkAssignment_Opr(), ecorePackage.getEString(), "opr", null, 0, 1, ChkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChkAssignment_V2(), this.getChkVariables(), null, "v2", null, 0, 1, ChkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chkRelationalExpressionsEClass, ChkRelationalExpressions.class, "ChkRelationalExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(chkExpressionEClass, ChkExpression.class, "ChkExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChkExpression_Asg(), ecorePackage.getEString(), "asg", null, 0, 1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChkExpression_Exp(), this.getChkRelationalExpressions(), null, "exp", null, 0, 1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkExpression_Where(), ecorePackage.getEString(), "where", null, 0, 1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChkExpression_Cond(), this.getChkRelationalExpression(), null, "cond", null, 0, -1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkExpression_Type(), ecorePackage.getEString(), "type", null, 0, -1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChkExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChkExpression_V(), this.getChkVariable(), null, "v", null, 0, 1, ChkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mrExpressionEClass, MrExpression.class, "MrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMrExpression_Asg(), ecorePackage.getEString(), "asg", null, 0, 1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMrExpression_Exp(), this.getChkRelationalExpressions(), null, "exp", null, 0, 1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMrExpression_Where(), ecorePackage.getEString(), "where", null, 0, 1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMrExpression_Cond(), this.getChkRelationalExpression(), null, "cond", null, 0, -1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMrExpression_Type(), ecorePackage.getEString(), "type", null, 0, -1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMrExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMrExpression_V(), this.getChkVariable(), null, "v", null, 0, 1, MrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCheck_Check(), ecorePackage.getEString(), "check", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheck_Chk(), this.getChkExpression(), null, "chk", null, 0, -1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLimit_Sub(), this.getSubtask(), null, "sub", null, 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLimit_A(), ecorePackage.getEString(), "a", null, 0, -1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLimit_B(), ecorePackage.getEString(), "b", null, 0, -1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subtaskEClass, Subtask.class, "Subtask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubtask_Num(), ecorePackage.getEInt(), "num", null, 0, 1, Subtask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formatEClass, Format.class, "Format", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormat_Exp(), this.getFormatExpression(), null, "exp", null, 0, -1, Format.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputFormatEClass, InputFormat.class, "InputFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputFormat_Input(), ecorePackage.getEString(), "input", null, 0, 1, InputFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputFormatEClass, OutputFormat.class, "OutputFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputFormat_Output(), ecorePackage.getEString(), "output", null, 0, 1, OutputFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formatExpressionEClass, FormatExpression.class, "FormatExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormatExpression_Num(), ecorePackage.getEString(), "num", null, 0, 1, FormatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormatExpression_Var(), ecorePackage.getEString(), "var", null, 0, -1, FormatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormatExpression_Count(), ecorePackage.getEString(), "count", null, 0, -1, FormatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CheckerDslPackageImpl
