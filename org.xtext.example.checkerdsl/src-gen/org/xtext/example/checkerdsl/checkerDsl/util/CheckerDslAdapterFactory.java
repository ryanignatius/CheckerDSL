/**
 */
package org.xtext.example.checkerdsl.checkerDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.checkerdsl.checkerDsl.AbstractElement;
import org.xtext.example.checkerdsl.checkerDsl.Check;
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
import org.xtext.example.checkerdsl.checkerDsl.MR;
import org.xtext.example.checkerdsl.checkerDsl.Method;
import org.xtext.example.checkerdsl.checkerDsl.MethodCall;
import org.xtext.example.checkerdsl.checkerDsl.MrExpression;
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat;
import org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.Property;
import org.xtext.example.checkerdsl.checkerDsl.Subtask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.checkerdsl.checkerDsl.CheckerDslPackage
 * @generated
 */
public class CheckerDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CheckerDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckerDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CheckerDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckerDslSwitch<Adapter> modelSwitch =
    new CheckerDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDsl(Dsl object)
      {
        return createDslAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseClass(org.xtext.example.checkerdsl.checkerDsl.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseMR(MR object)
      {
        return createMRAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseMethodCall(MethodCall object)
      {
        return createMethodCallAdapter();
      }
      @Override
      public Adapter caseChkPrefix(ChkPrefix object)
      {
        return createChkPrefixAdapter();
      }
      @Override
      public Adapter caseChkVariable(ChkVariable object)
      {
        return createChkVariableAdapter();
      }
      @Override
      public Adapter caseChkVariables(ChkVariables object)
      {
        return createChkVariablesAdapter();
      }
      @Override
      public Adapter caseHelper(Helper object)
      {
        return createHelperAdapter();
      }
      @Override
      public Adapter caseChkRelationalExpression(ChkRelationalExpression object)
      {
        return createChkRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseChkAssignment(ChkAssignment object)
      {
        return createChkAssignmentAdapter();
      }
      @Override
      public Adapter caseChkRelationalExpressions(ChkRelationalExpressions object)
      {
        return createChkRelationalExpressionsAdapter();
      }
      @Override
      public Adapter caseChkExpression(ChkExpression object)
      {
        return createChkExpressionAdapter();
      }
      @Override
      public Adapter caseMrExpression(MrExpression object)
      {
        return createMrExpressionAdapter();
      }
      @Override
      public Adapter caseCheck(Check object)
      {
        return createCheckAdapter();
      }
      @Override
      public Adapter caseLimit(Limit object)
      {
        return createLimitAdapter();
      }
      @Override
      public Adapter caseSubtask(Subtask object)
      {
        return createSubtaskAdapter();
      }
      @Override
      public Adapter caseFormat(Format object)
      {
        return createFormatAdapter();
      }
      @Override
      public Adapter caseInputFormat(InputFormat object)
      {
        return createInputFormatAdapter();
      }
      @Override
      public Adapter caseOutputFormat(OutputFormat object)
      {
        return createOutputFormatAdapter();
      }
      @Override
      public Adapter caseFormatExpression(FormatExpression object)
      {
        return createFormatExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Dsl <em>Dsl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Dsl
   * @generated
   */
  public Adapter createDslAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.MR <em>MR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.MR
   * @generated
   */
  public Adapter createMRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.MethodCall
   * @generated
   */
  public Adapter createMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkPrefix <em>Chk Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkPrefix
   * @generated
   */
  public Adapter createChkPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariable <em>Chk Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariable
   * @generated
   */
  public Adapter createChkVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkVariables <em>Chk Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkVariables
   * @generated
   */
  public Adapter createChkVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Helper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Helper
   * @generated
   */
  public Adapter createHelperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression <em>Chk Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression
   * @generated
   */
  public Adapter createChkRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkAssignment <em>Chk Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkAssignment
   * @generated
   */
  public Adapter createChkAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpressions <em>Chk Relational Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpressions
   * @generated
   */
  public Adapter createChkRelationalExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.ChkExpression <em>Chk Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.ChkExpression
   * @generated
   */
  public Adapter createChkExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.MrExpression <em>Mr Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.MrExpression
   * @generated
   */
  public Adapter createMrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Check
   * @generated
   */
  public Adapter createCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Limit
   * @generated
   */
  public Adapter createLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Subtask <em>Subtask</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Subtask
   * @generated
   */
  public Adapter createSubtaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.Format <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.Format
   * @generated
   */
  public Adapter createFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.InputFormat <em>Input Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.InputFormat
   * @generated
   */
  public Adapter createInputFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.OutputFormat <em>Output Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.OutputFormat
   * @generated
   */
  public Adapter createOutputFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.checkerdsl.checkerDsl.FormatExpression <em>Format Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.checkerdsl.checkerDsl.FormatExpression
   * @generated
   */
  public Adapter createFormatExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CheckerDslAdapterFactory
