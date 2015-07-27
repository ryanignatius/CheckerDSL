package org.xtext.example.checkerdsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.checkerdsl.checkerDsl.Check;
import org.xtext.example.checkerdsl.checkerDsl.ChkAssignment;
import org.xtext.example.checkerdsl.checkerDsl.ChkExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkGeneralExpressions;
import org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkOperation;
import org.xtext.example.checkerdsl.checkerDsl.ChkPrefix;
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;
import org.xtext.example.checkerdsl.checkerDsl.Feature;
import org.xtext.example.checkerdsl.checkerDsl.FollowUp;
import org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression;
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression;
import org.xtext.example.checkerdsl.checkerDsl.FormatVariable;
import org.xtext.example.checkerdsl.checkerDsl.Helper;
import org.xtext.example.checkerdsl.checkerDsl.InputFormat;
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.MR;
import org.xtext.example.checkerdsl.checkerDsl.Method;
import org.xtext.example.checkerdsl.checkerDsl.MethodCall;
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat;
import org.xtext.example.checkerdsl.checkerDsl.Property;
import org.xtext.example.checkerdsl.checkerDsl.Score;
import org.xtext.example.checkerdsl.checkerDsl.Subtask;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class CheckerDslJvmModelInferrer extends AbstractModelInferrer {
  /**
   * a builder API to programmatically create Jvm elements
   * in readable way.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private String bd1;
  
  private String bd2;
  
  private String bd3;
  
  private String bd2a;
  
  private String bd3a;
  
  private String bd2b;
  
  private String bd3b;
  
  private String bd2d;
  
  private String bd2c;
  
  private String mr_list = "";
  
  private String mr_chk = "";
  
  private String mr_gen = "";
  
  private String copy_var = "";
  
  private int sz;
  
  private int num_mr = 0;
  
  private int num_subtask = 0;
  
  private String class_name = "GeneratedClass";
  
  private String lib_class_name = "LibraryFunction";
  
  private JvmTypeReference tp;
  
  protected void _infer(final org.xtext.example.checkerdsl.checkerDsl.Class element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, this.class_name);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        JvmTypeReference _superType = element.getSuperType();
        boolean _notEquals = (!Objects.equal(_superType, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _superType_1 = element.getSuperType();
          JvmTypeReference _cloneWithProxies = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_superType_1);
          CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
        }
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Scanner.class);
        JvmField _field = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "sc", _typeRef);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(BufferedReader.class);
        JvmField _field_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "buf", _typeRef_1);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _typeRef_2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(FileReader.class);
        JvmField _field_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "fr", _typeRef_2);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _typeRef_3 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(File.class);
        JvmField _field_3 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "fl", _typeRef_3);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_3, _field_3);
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _typeRef_4 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(FileWriter.class);
        JvmField _field_4 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "fw", _typeRef_4);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_4, _field_4);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeRef_5 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(BufferedWriter.class);
        JvmField _field_5 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "writer", _typeRef_5);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_5, _field_5);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeRef_6 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_6 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "current_subtask", _typeRef_6);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_6, _field_6);
        EList<JvmMember> _members_7 = it.getMembers();
        JvmTypeReference _typeRef_7 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_7 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "current_testcase", _typeRef_7);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_7, _field_7);
        EList<JvmMember> _members_8 = it.getMembers();
        JvmTypeReference _typeRef_8 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "current_mr", _typeRef_8);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_8, _field_8);
        EList<JvmMember> _members_9 = it.getMembers();
        JvmTypeReference _typeRef_9 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_9 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "num_mr", _typeRef_9);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_9, _field_9);
        EList<JvmMember> _members_10 = it.getMembers();
        JvmTypeReference _typeRef_10 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "num_tc", _typeRef_10);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_10, _field_10);
        EList<JvmMember> _members_11 = it.getMembers();
        JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "max_tc", _typeRef_11);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_11, _field_11);
        EList<JvmMember> _members_12 = it.getMembers();
        JvmTypeReference _typeRef_12 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_12 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "num_subtask", _typeRef_12);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_12, _field_12);
        EList<JvmMember> _members_13 = it.getMembers();
        JvmTypeReference _typeRef_13 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_13 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "loop_counter", _typeRef_13);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_13, _field_13);
        EList<JvmMember> _members_14 = it.getMembers();
        JvmTypeReference _typeRef_14 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_14 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "max_loop_counter", _typeRef_14);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_14, _field_14);
        EList<JvmMember> _members_15 = it.getMembers();
        JvmTypeReference _typeRef_15 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
        final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setStatic(true);
          }
        };
        JvmField _field_15 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "is_valid", _typeRef_15, _function);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_15, _field_15);
        EList<JvmMember> _members_16 = it.getMembers();
        JvmTypeReference _typeRef_16 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return is_valid;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getIs_valid", _typeRef_16, _function_1);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_16, _method);
        EList<JvmMember> _members_17 = it.getMembers();
        JvmTypeReference _typeRef_17 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "new_valid", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            it.setStatic(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("is_valid = new_valid;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "setIs_valid", _typeRef_17, _function_2);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_17, _method_1);
        EList<JvmMember> _members_18 = it.getMembers();
        JvmTypeReference _typeRef_18 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setStatic(true);
          }
        };
        JvmField _field_16 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "cur_lines", _typeRef_18, _function_3);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_18, _field_16);
        EList<JvmMember> _members_19 = it.getMembers();
        JvmTypeReference _typeRef_19 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "message", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("System.out.println(message);");
                _builder.newLine();
                _builder.append("is_valid = false;");
                _builder.newLine();
                _builder.append("//System.exit(0);");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "die", _typeRef_19, _function_4);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_19, _method_2);
        EList<JvmMember> _members_20 = it.getMembers();
        JvmTypeReference _typeRef_20 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("int ret = 0;");
                _builder.newLine();
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("ret = Integer.parseInt(token);");
                _builder.newLine();
                _builder.append("} catch (Exception e){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                _builder.append(".die(\"not int\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return ret;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_3 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "intReader", _typeRef_20, _function_5);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_20, _method_3);
        EList<JvmMember> _members_21 = it.getMembers();
        JvmTypeReference _typeRef_21 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
        final Procedure1<JvmOperation> _function_6 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("long ret = 0;");
                _builder.newLine();
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("ret = Long.parseLong(token);");
                _builder.newLine();
                _builder.append("} catch (Exception e){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                _builder.append(".die(\"not long\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return ret;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_4 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "longReader", _typeRef_21, _function_6);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_21, _method_4);
        EList<JvmMember> _members_22 = it.getMembers();
        JvmTypeReference _typeRef_22 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(float.class);
        final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("float ret = 0;");
                _builder.newLine();
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("ret = Float.parseFloat(token);");
                _builder.newLine();
                _builder.append("} catch (Exception e){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                _builder.append(".die(\"not float\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return ret;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_5 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "floatReader", _typeRef_22, _function_7);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_22, _method_5);
        EList<JvmMember> _members_23 = it.getMembers();
        JvmTypeReference _typeRef_23 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(double.class);
        final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("double ret = 0;");
                _builder.newLine();
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("ret = Double.parseDouble(token);");
                _builder.newLine();
                _builder.append("} catch (Exception e){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                _builder.append(".die(\"not double\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return ret;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_6 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "doubleReader", _typeRef_23, _function_8);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_23, _method_6);
        EList<JvmMember> _members_24 = it.getMembers();
        JvmTypeReference _typeRef_24 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
        final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("boolean ret = false;");
                _builder.newLine();
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("ret = Boolean.parseBoolean(token);");
                _builder.newLine();
                _builder.append("} catch (Exception e){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                _builder.append(".die(\"not boolean\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return ret;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_7 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "booleanReader", _typeRef_24, _function_9);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_24, _method_7);
        EList<JvmMember> _members_25 = it.getMembers();
        JvmTypeReference _typeRef_25 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(char.class);
        final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("char ret = \' \';");
                _builder.newLine();
                _builder.append("if (token.length() == 1){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("ret = token.charAt(0);");
                _builder.newLine();
                _builder.append("} else {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                _builder.append(".die(\"not char\");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return ret;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "charReader", _typeRef_25, _function_10);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_25, _method_8);
        EList<JvmMember> _members_26 = it.getMembers();
        JvmTypeReference _typeRef_26 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
        final Procedure1<JvmOperation> _function_11 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return token;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_9 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "stringReader", _typeRef_26, _function_11);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_26, _method_9);
        EList<Feature> _features = element.getFeatures();
        for (final Feature feature : _features) {
          boolean _matched = false;
          if (!_matched) {
            if (feature instanceof ChkVariableDeclaration) {
              _matched=true;
              JvmTypeReference t = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              JvmTypeReference t2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              String _type = ((ChkVariableDeclaration)feature).getType();
              boolean _equals = Objects.equal(_type, "int");
              if (_equals) {
                JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                t2 = _typeRef_27;
              } else {
                String _type_1 = ((ChkVariableDeclaration)feature).getType();
                boolean _equals_1 = Objects.equal(_type_1, "long");
                if (_equals_1) {
                  JvmTypeReference _typeRef_28 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
                  t2 = _typeRef_28;
                } else {
                  String _type_2 = ((ChkVariableDeclaration)feature).getType();
                  boolean _equals_2 = Objects.equal(_type_2, "float");
                  if (_equals_2) {
                    JvmTypeReference _typeRef_29 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(float.class);
                    t2 = _typeRef_29;
                  } else {
                    String _type_3 = ((ChkVariableDeclaration)feature).getType();
                    boolean _equals_3 = Objects.equal(_type_3, "double");
                    if (_equals_3) {
                      JvmTypeReference _typeRef_30 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(double.class);
                      t2 = _typeRef_30;
                    } else {
                      String _type_4 = ((ChkVariableDeclaration)feature).getType();
                      boolean _equals_4 = Objects.equal(_type_4, "boolean");
                      if (_equals_4) {
                        JvmTypeReference _typeRef_31 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
                        t2 = _typeRef_31;
                      } else {
                        String _type_5 = ((ChkVariableDeclaration)feature).getType();
                        boolean _equals_5 = Objects.equal(_type_5, "char");
                        if (_equals_5) {
                          JvmTypeReference _typeRef_32 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(char.class);
                          t2 = _typeRef_32;
                        } else {
                          String _type_6 = ((ChkVariableDeclaration)feature).getType();
                          boolean _equals_6 = Objects.equal(_type_6, "string");
                          if (_equals_6) {
                            JvmTypeReference _typeRef_33 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                            t2 = _typeRef_33;
                          }
                        }
                      }
                    }
                  }
                }
              }
              Limit _limit1 = ((ChkVariableDeclaration)feature).getLimit1();
              boolean _notEquals_1 = (!Objects.equal(_limit1, null));
              if (_notEquals_1) {
                CheckerDslJvmModelInferrer.this.tp = t2;
                EList<JvmMember> _members_27 = it.getMembers();
                String _name = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                String _plus = ("validate" + _firstUpper);
                JvmTypeReference _typeRef_34 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
                final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "value", CheckerDslJvmModelInferrer.this.tp);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                    JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                    JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "subtask", _typeRef);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        _builder.append("switch (subtask){");
                        _builder.newLine();
                        Limit _limit1 = ((ChkVariableDeclaration)feature).getLimit1();
                        String validateBody = CheckerDslJvmModelInferrer.this.validateBody(_limit1);
                        _builder.newLineIfNotEmpty();
                        boolean defaultSwitch = false;
                        _builder.newLineIfNotEmpty();
                        EList<Limit> _limit = ((ChkVariableDeclaration)feature).getLimit();
                        for (final Limit lim : _limit) {
                          {
                            String _validateBody = CheckerDslJvmModelInferrer.this.validateBody(lim);
                            String _concat = validateBody.concat(_validateBody);
                            validateBody = _concat;
                            Subtask _sub = lim.getSub();
                            boolean _equals = Objects.equal(_sub, null);
                            if (_equals) {
                              defaultSwitch = true;
                            } else {
                            }
                          }
                        }
                        _builder.newLineIfNotEmpty();
                        String _xifexpression = null;
                        boolean _and = false;
                        Limit _limit1_1 = ((ChkVariableDeclaration)feature).getLimit1();
                        Subtask _sub = _limit1_1.getSub();
                        boolean _notEquals = (!Objects.equal(_sub, null));
                        if (!_notEquals) {
                          _and = false;
                        } else {
                          _and = (defaultSwitch == false);
                        }
                        if (_and) {
                          _xifexpression = validateBody = (validateBody + "default:\nreturn true;\n");
                        } else {
                          _xifexpression = validateBody;
                        }
                        _builder.append(_xifexpression, "");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      }
                    };
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus, _typeRef_34, _function_12);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
              } else {
                CheckerDslJvmModelInferrer.this.tp = t2;
                EList<JvmMember> _members_28 = it.getMembers();
                String _name_1 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
                String _plus_1 = ("validate" + _firstUpper_1);
                JvmTypeReference _typeRef_35 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
                final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "value", CheckerDslJvmModelInferrer.this.tp);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                    JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                    JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "subtask", _typeRef);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        _builder.append("return true;");
                        _builder.newLine();
                      }
                    };
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_1, _typeRef_35, _function_13);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _method_11);
              }
              EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
              int _size = _sz.size();
              boolean _notEquals_2 = (_size != 0);
              if (_notEquals_2) {
                JvmTypeReference _typeRef_36 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                t = _typeRef_36;
                EList<JvmMember> _members_29 = it.getMembers();
                String _name_2 = ((ChkVariableDeclaration)feature).getName();
                JvmField _field_17 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _name_2, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_29, _field_17);
                EList<JvmMember> _members_30 = it.getMembers();
                String _name_3 = ((ChkVariableDeclaration)feature).getName();
                String _plus_2 = (_name_3 + "_2");
                JvmField _field_18 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _plus_2, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_30, _field_18);
                String _name_4 = ((ChkVariableDeclaration)feature).getName();
                String _plus_3 = (CheckerDslJvmModelInferrer.this.copy_var + _name_4);
                String _plus_4 = (_plus_3 + "_2 = new ArrayList(");
                String _name_5 = ((ChkVariableDeclaration)feature).getName();
                String _plus_5 = (_plus_4 + _name_5);
                String _plus_6 = (_plus_5 + ");\n");
                CheckerDslJvmModelInferrer.this.copy_var = _plus_6;
                EList<JvmMember> _members_31 = it.getMembers();
                String _name_6 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _getter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toGetter(feature, _name_6, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_31, _getter);
                EList<JvmMember> _members_32 = it.getMembers();
                String _name_7 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _setter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toSetter(feature, _name_7, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_32, _setter);
                EList<String> _sz_1 = ((ChkVariableDeclaration)feature).getSz();
                int _size_1 = _sz_1.size();
                boolean _equals_7 = (_size_1 == 1);
                if (_equals_7) {
                  EList<JvmMember> _members_33 = it.getMembers();
                  String _name_8 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
                  String _plus_7 = ("get" + _firstUpper_2);
                  final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "id1", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          String typeReturn = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                          _builder.newLineIfNotEmpty();
                          _builder.append("return (");
                          _builder.append(typeReturn, "");
                          _builder.append(")");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append(".get(id1);");
                          _builder.newLineIfNotEmpty();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_12 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_7, t2, _function_14);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_33, _method_12);
                  EList<JvmMember> _members_34 = it.getMembers();
                  String _name_9 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_3 = StringExtensions.toFirstUpper(_name_9);
                  String _plus_8 = ("set" + _firstUpper_3);
                  JvmTypeReference _typeRef_37 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "id1", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                      JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class);
                      JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "val", _typeRef_1);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append(".set(id1,val);");
                          _builder.newLineIfNotEmpty();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_13 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_8, _typeRef_37, _function_15);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_34, _method_13);
                  EList<JvmMember> _members_35 = it.getMembers();
                  String _name_10 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_4 = StringExtensions.toFirstUpper(_name_10);
                  String _plus_9 = ("get" + _firstUpper_4);
                  String _plus_10 = (_plus_9 + "_2");
                  final Procedure1<JvmOperation> _function_16 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "id1", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          String typeReturn = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                          _builder.newLineIfNotEmpty();
                          _builder.append("return (");
                          _builder.append(typeReturn, "");
                          _builder.append(")");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append("_2.get(id1);");
                          _builder.newLineIfNotEmpty();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_14 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_10, t2, _function_16);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_35, _method_14);
                  EList<JvmMember> _members_36 = it.getMembers();
                  String _name_11 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_5 = StringExtensions.toFirstUpper(_name_11);
                  String _plus_11 = ("set" + _firstUpper_5);
                  String _plus_12 = (_plus_11 + "_2");
                  JvmTypeReference _typeRef_38 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_17 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "id1", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                      JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class);
                      JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "val", _typeRef_1);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append("_2.set(id1,val);");
                          _builder.newLineIfNotEmpty();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_15 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_12, _typeRef_38, _function_17);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_36, _method_15);
                  EList<JvmMember> _members_37 = it.getMembers();
                  String _name_12 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_6 = StringExtensions.toFirstUpper(_name_12);
                  String _plus_13 = ("read" + _firstUpper_6);
                  JvmTypeReference _typeRef_39 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_18 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                      JvmTypeReference _addArrayTypeDimension = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeRef);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "tokens", _addArrayTypeDimension);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append(" = new ArrayList();");
                          _builder.newLineIfNotEmpty();
                          _builder.append("for (int i=0; i<");
                          EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                          String _get = _sz.get(0);
                          _builder.append(_get, "");
                          _builder.append("; i++){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          String _name_1 = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name_1, "\t");
                          _builder.append(".add(");
                          String _type = ((ChkVariableDeclaration)feature).getType();
                          _builder.append(_type, "\t");
                          _builder.append("Reader(tokens[i]));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("if (!validate");
                          String _name_2 = ((ChkVariableDeclaration)feature).getName();
                          String _firstUpper = StringExtensions.toFirstUpper(_name_2);
                          _builder.append(_firstUpper, "\t");
                          _builder.append("((int)");
                          String _name_3 = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name_3, "\t");
                          _builder.append(".get(i),current_subtask)){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t\t");
                          _builder.append(".die(\"value not in valid range\");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("}");
                          _builder.newLine();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_16 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_13, _typeRef_39, _function_18);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_37, _method_16);
                  EList<JvmMember> _members_38 = it.getMembers();
                  String _name_13 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_7 = StringExtensions.toFirstUpper(_name_13);
                  String _plus_14 = ("read" + _firstUpper_7);
                  JvmTypeReference _typeRef_40 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_19 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                      JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx", _typeRef_1);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append(".set(idx,");
                          String _type = ((ChkVariableDeclaration)feature).getType();
                          _builder.append(_type, "");
                          _builder.append("Reader(token));");
                          _builder.newLineIfNotEmpty();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_17 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_14, _typeRef_40, _function_19);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_38, _method_17);
                  EList<JvmMember> _members_39 = it.getMembers();
                  String _name_14 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_8 = StringExtensions.toFirstUpper(_name_14);
                  String _plus_15 = ("write" + _firstUpper_8);
                  JvmTypeReference _typeRef_41 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_20 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("try {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("for (int i=0; i<");
                          EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                          String _get = _sz.get(0);
                          _builder.append(_get, "\t");
                          _builder.append("; i++){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("if (i > 0) writer.write(\" \");");
                          _builder.newLine();
                          _builder.append("\t\t");
                          _builder.append("writer.write(\"\"+(");
                          String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                          _builder.append(_chkType, "\t\t");
                          _builder.append(")");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "\t\t");
                          _builder.append(".get(i));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("writer.write(System.lineSeparator());");
                          _builder.newLine();
                          _builder.append("} catch (Exception e){}");
                          _builder.newLine();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_18 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_15, _typeRef_41, _function_20);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_39, _method_18);
                  EList<JvmMember> _members_40 = it.getMembers();
                  String _name_15 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_9 = StringExtensions.toFirstUpper(_name_15);
                  String _plus_16 = ("write" + _firstUpper_9);
                  JvmTypeReference _typeRef_42 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_21 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("try {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("writer.write(\"\"+(");
                          String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                          _builder.append(_chkType, "\t");
                          _builder.append(")");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "\t");
                          _builder.append(".get(idx));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("} catch (Exception e){}");
                          _builder.newLine();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_19 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_16, _typeRef_42, _function_21);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_40, _method_19);
                  EList<JvmMember> _members_41 = it.getMembers();
                  String _name_16 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_10 = StringExtensions.toFirstUpper(_name_16);
                  String _plus_17 = ("write" + _firstUpper_10);
                  String _plus_18 = (_plus_17 + "_2");
                  JvmTypeReference _typeRef_43 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_22 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("try {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("for (int i=0; i<");
                          EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                          String _get = _sz.get(0);
                          _builder.append(_get, "\t");
                          _builder.append("_2; i++){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("if (i > 0) writer.write(\" \");");
                          _builder.newLine();
                          _builder.append("\t\t");
                          _builder.append("writer.write(\"\"+(");
                          String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                          _builder.append(_chkType, "\t\t");
                          _builder.append(")");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "\t\t");
                          _builder.append("_2.get(i));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("writer.write(System.lineSeparator());");
                          _builder.newLine();
                          _builder.append("} catch (Exception e){}");
                          _builder.newLine();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_20 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_18, _typeRef_43, _function_22);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_41, _method_20);
                  EList<JvmMember> _members_42 = it.getMembers();
                  String _name_17 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_11 = StringExtensions.toFirstUpper(_name_17);
                  String _plus_19 = ("write" + _firstUpper_11);
                  String _plus_20 = (_plus_19 + "_2");
                  JvmTypeReference _typeRef_44 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_23 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("try {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("writer.write(\"\"+(");
                          String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                          _builder.append(_chkType, "\t");
                          _builder.append(")");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "\t");
                          _builder.append("_2.get(idx));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("} catch (Exception e){}");
                          _builder.newLine();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_21 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_20, _typeRef_44, _function_23);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_42, _method_21);
                  EList<String> _sz_2 = ((ChkVariableDeclaration)feature).getSz();
                  String _get = _sz_2.get(0);
                  String _plus_21 = ((CheckerDslJvmModelInferrer.this.mr_chk + "for (int i=0; i<") + _get);
                  String _plus_22 = (_plus_21 + "_2; i++){\n");
                  CheckerDslJvmModelInferrer.this.mr_chk = _plus_22;
                  String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                  String _plus_23 = ((CheckerDslJvmModelInferrer.this.mr_chk + "if ((") + _chkType);
                  String _plus_24 = (_plus_23 + ")");
                  String _name_18 = ((ChkVariableDeclaration)feature).getName();
                  String _plus_25 = (_plus_24 + _name_18);
                  String _plus_26 = (_plus_25 + "_2.get(i) != (");
                  String _chkType_1 = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                  String _plus_27 = (_plus_26 + _chkType_1);
                  String _plus_28 = (_plus_27 + ")ans.");
                  String _name_19 = ((ChkVariableDeclaration)feature).getName();
                  String _plus_29 = (_plus_28 + _name_19);
                  String _plus_30 = (_plus_29 + ".get(i)) return false;\n");
                  CheckerDslJvmModelInferrer.this.mr_chk = _plus_30;
                  CheckerDslJvmModelInferrer.this.mr_chk = (CheckerDslJvmModelInferrer.this.mr_chk + "}\n");
                } else {
                  EList<String> _sz_3 = ((ChkVariableDeclaration)feature).getSz();
                  int _size_2 = _sz_3.size();
                  boolean _equals_8 = (_size_2 == 2);
                  if (_equals_8) {
                    EList<JvmMember> _members_43 = it.getMembers();
                    String _name_20 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_12 = StringExtensions.toFirstUpper(_name_20);
                    String _plus_31 = ("get" + _firstUpper_12);
                    JvmTypeReference _typeRef_45 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                    final Procedure1<JvmOperation> _function_24 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("return (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".get(idx1);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_22 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_31, _typeRef_45, _function_24);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_43, _method_22);
                    EList<JvmMember> _members_44 = it.getMembers();
                    String _name_21 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_13 = StringExtensions.toFirstUpper(_name_21);
                    String _plus_32 = ("get" + _firstUpper_13);
                    final Procedure1<JvmOperation> _function_25 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("ArrayList temp = (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("return (");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "");
                            _builder.append(")temp.get(idx2);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_23 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_32, t2, _function_25);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_44, _method_23);
                    EList<JvmMember> _members_45 = it.getMembers();
                    String _name_22 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_14 = StringExtensions.toFirstUpper(_name_22);
                    String _plus_33 = ("set" + _firstUpper_14);
                    JvmTypeReference _typeRef_46 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_26 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "val", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".set(idx1,val);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_24 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_33, _typeRef_46, _function_26);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_45, _method_24);
                    EList<JvmMember> _members_46 = it.getMembers();
                    String _name_23 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_15 = StringExtensions.toFirstUpper(_name_23);
                    String _plus_34 = ("set" + _firstUpper_15);
                    JvmTypeReference _typeRef_47 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_27 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                        JvmTypeReference _typeRef_2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class);
                        JvmFormalParameter _parameter_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "val", _typeRef_2);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("ArrayList temp = (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("temp.set(idx2,(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "");
                            _builder.append(")val);");
                            _builder.newLineIfNotEmpty();
                            String _name_1 = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name_1, "");
                            _builder.append(".set(idx1,temp);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_25 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_34, _typeRef_47, _function_27);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_46, _method_25);
                    EList<JvmMember> _members_47 = it.getMembers();
                    String _name_24 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_16 = StringExtensions.toFirstUpper(_name_24);
                    String _plus_35 = ("get" + _firstUpper_16);
                    String _plus_36 = (_plus_35 + "_2");
                    JvmTypeReference _typeRef_48 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                    final Procedure1<JvmOperation> _function_28 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("return (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append("_2.get(idx1);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_26 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_36, _typeRef_48, _function_28);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_47, _method_26);
                    EList<JvmMember> _members_48 = it.getMembers();
                    String _name_25 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_17 = StringExtensions.toFirstUpper(_name_25);
                    String _plus_37 = ("get" + _firstUpper_17);
                    String _plus_38 = (_plus_37 + "_2");
                    final Procedure1<JvmOperation> _function_29 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("ArrayList temp = (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append("_2.get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("return (");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "");
                            _builder.append(")temp.get(idx2);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_27 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_38, t2, _function_29);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_48, _method_27);
                    EList<JvmMember> _members_49 = it.getMembers();
                    String _name_26 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_18 = StringExtensions.toFirstUpper(_name_26);
                    String _plus_39 = ("set" + _firstUpper_18);
                    String _plus_40 = (_plus_39 + "_2");
                    JvmTypeReference _typeRef_49 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_30 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "val", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append("_2.set(idx1,val);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_28 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_40, _typeRef_49, _function_30);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_49, _method_28);
                    EList<JvmMember> _members_50 = it.getMembers();
                    String _name_27 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_19 = StringExtensions.toFirstUpper(_name_27);
                    String _plus_41 = ("set" + _firstUpper_19);
                    String _plus_42 = (_plus_41 + "_2");
                    JvmTypeReference _typeRef_50 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_31 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                        JvmTypeReference _typeRef_2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class);
                        JvmFormalParameter _parameter_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "val", _typeRef_2);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("ArrayList temp = (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append("_2.get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("temp.set(idx2,(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "");
                            _builder.append(")val);");
                            _builder.newLineIfNotEmpty();
                            String _name_1 = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name_1, "");
                            _builder.append("_2.set(idx1,temp);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_29 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_42, _typeRef_50, _function_31);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_50, _method_29);
                    EList<JvmMember> _members_51 = it.getMembers();
                    String _name_28 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_20 = StringExtensions.toFirstUpper(_name_28);
                    String _plus_43 = ("read" + _firstUpper_20);
                    JvmTypeReference _typeRef_51 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_32 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                        JvmTypeReference _addArrayTypeDimension = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeRef);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "tokens", _addArrayTypeDimension);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("if (idx1 == 0) ");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(" = new ArrayList();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("ArrayList temp = new ArrayList();");
                            _builder.newLine();
                            _builder.append("for (int i=0; i<");
                            EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                            String _get = _sz.get(1);
                            _builder.append(_get, "");
                            _builder.append("; i++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("temp.add(");
                            String _type = ((ChkVariableDeclaration)feature).getType();
                            _builder.append(_type, "\t");
                            _builder.append("Reader(tokens[i]));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("if (!validate");
                            String _name_1 = ((ChkVariableDeclaration)feature).getName();
                            String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                            _builder.append(_firstUpper, "\t");
                            _builder.append("((int)temp.get(i),current_subtask)){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t\t");
                            _builder.append(".die(\"value not in valid range\");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("}");
                            _builder.newLine();
                            String _name_2 = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name_2, "");
                            _builder.append(".add(temp);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_30 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_43, _typeRef_51, _function_32);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_51, _method_30);
                    EList<JvmMember> _members_52 = it.getMembers();
                    String _name_29 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_21 = StringExtensions.toFirstUpper(_name_29);
                    String _plus_44 = ("read" + _firstUpper_21);
                    JvmTypeReference _typeRef_52 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_33 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                        JvmTypeReference _typeRef_2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_2);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("ArrayList atemp = (ArrayList) ");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("atemp.set(idx2,");
                            String _type = ((ChkVariableDeclaration)feature).getType();
                            _builder.append(_type, "");
                            _builder.append("Reader(token));");
                            _builder.newLineIfNotEmpty();
                            String _name_1 = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name_1, "");
                            _builder.append(".set(idx1,atemp);");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_31 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_44, _typeRef_52, _function_33);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_52, _method_31);
                    EList<JvmMember> _members_53 = it.getMembers();
                    String _name_30 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_22 = StringExtensions.toFirstUpper(_name_30);
                    String _plus_45 = ("write" + _firstUpper_22);
                    JvmTypeReference _typeRef_53 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_34 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("try {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("for (int i=0; i<");
                            EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                            String _get = _sz.get(0);
                            _builder.append(_get, "\t");
                            _builder.append("; i++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("for (int j=0; j<");
                            EList<String> _sz_1 = ((ChkVariableDeclaration)feature).getSz();
                            String _get_1 = _sz_1.get(1);
                            _builder.append(_get_1, "\t\t");
                            _builder.append("; j++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("if (j > 0) writer.write(\" \");");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("writer.write(\"\"+(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "\t\t\t");
                            _builder.append(")((ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "\t\t\t");
                            _builder.append(".get(i)).get(j));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("writer.write(System.lineSeparator());");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("} catch (Exception e){}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_32 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_45, _typeRef_53, _function_34);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_53, _method_32);
                    EList<JvmMember> _members_54 = it.getMembers();
                    String _name_31 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_23 = StringExtensions.toFirstUpper(_name_31);
                    String _plus_46 = ("write" + _firstUpper_23);
                    JvmTypeReference _typeRef_54 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_35 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("try {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("writer.write(\"\"+(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "\t");
                            _builder.append(")((ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "\t");
                            _builder.append(".get(idx1)).get(idx2));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("} catch (Exception e){}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_33 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_46, _typeRef_54, _function_35);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_54, _method_33);
                    EList<JvmMember> _members_55 = it.getMembers();
                    String _name_32 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_24 = StringExtensions.toFirstUpper(_name_32);
                    String _plus_47 = ("write" + _firstUpper_24);
                    String _plus_48 = (_plus_47 + "_2");
                    JvmTypeReference _typeRef_55 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_36 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("try {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("for (int i=0; i<");
                            EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                            String _get = _sz.get(0);
                            _builder.append(_get, "\t");
                            _builder.append("; i++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("for (int j=0; j<");
                            EList<String> _sz_1 = ((ChkVariableDeclaration)feature).getSz();
                            String _get_1 = _sz_1.get(1);
                            _builder.append(_get_1, "\t\t");
                            _builder.append("; j++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("if (j > 0) writer.write(\" \");");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("writer.write(\"\"+(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "\t\t\t");
                            _builder.append(")((ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "\t\t\t");
                            _builder.append("_2.get(i)).get(j));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("writer.write(System.lineSeparator());");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("} catch (Exception e){}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_34 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_48, _typeRef_55, _function_36);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_55, _method_34);
                    EList<JvmMember> _members_56 = it.getMembers();
                    String _name_33 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_25 = StringExtensions.toFirstUpper(_name_33);
                    String _plus_49 = ("write" + _firstUpper_25);
                    String _plus_50 = (_plus_49 + "_2");
                    JvmTypeReference _typeRef_56 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_37 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("try {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("ArrayList temp = (ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "\t");
                            _builder.append(".get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("for (int j=0; j<");
                            EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                            String _get = _sz.get(1);
                            _builder.append(_get, "\t");
                            _builder.append("; j++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("if (j > 0) writer.write(\" \");");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("writer.write(\"\"+(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "\t\t");
                            _builder.append(")temp.get(j));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("writer.write(System.lineSeparator());");
                            _builder.newLine();
                            _builder.append("} catch (Exception e){}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_35 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_50, _typeRef_56, _function_37);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_56, _method_35);
                    EList<JvmMember> _members_57 = it.getMembers();
                    String _name_34 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_26 = StringExtensions.toFirstUpper(_name_34);
                    String _plus_51 = ("write" + _firstUpper_26);
                    String _plus_52 = (_plus_51 + "_2");
                    JvmTypeReference _typeRef_57 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_38 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = it.getParameters();
                        JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx1", _typeRef);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                        JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx2", _typeRef_1);
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("try {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("writer.write(\"\"+(");
                            String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                            _builder.append(_chkType, "\t");
                            _builder.append(")((ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "\t");
                            _builder.append("_2.get(idx1)).get(idx2));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("} catch (Exception e){}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_36 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_52, _typeRef_57, _function_38);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_57, _method_36);
                    EList<String> _sz_4 = ((ChkVariableDeclaration)feature).getSz();
                    String _get_1 = _sz_4.get(0);
                    String _plus_53 = ((CheckerDslJvmModelInferrer.this.mr_chk + "for (int i=0; i<") + _get_1);
                    String _plus_54 = (_plus_53 + "_2; i++){\n");
                    CheckerDslJvmModelInferrer.this.mr_chk = _plus_54;
                    EList<String> _sz_5 = ((ChkVariableDeclaration)feature).getSz();
                    String _get_2 = _sz_5.get(1);
                    String _plus_55 = ((CheckerDslJvmModelInferrer.this.mr_chk + "for (int j=0; j<") + _get_2);
                    String _plus_56 = (_plus_55 + "_2; j++){\n");
                    CheckerDslJvmModelInferrer.this.mr_chk = _plus_56;
                    String _chkType_2 = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                    String _plus_57 = ((CheckerDslJvmModelInferrer.this.mr_chk + "if ((") + _chkType_2);
                    String _plus_58 = (_plus_57 + ")((ArrayList)");
                    String _name_35 = ((ChkVariableDeclaration)feature).getName();
                    String _plus_59 = (_plus_58 + _name_35);
                    String _plus_60 = (_plus_59 + "_2.get(i)).get(j) != (");
                    String _chkType_3 = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                    String _plus_61 = (_plus_60 + _chkType_3);
                    String _plus_62 = (_plus_61 + ")((ArrayList)ans.");
                    String _name_36 = ((ChkVariableDeclaration)feature).getName();
                    String _plus_63 = (_plus_62 + _name_36);
                    String _plus_64 = (_plus_63 + ".get(i)).get(j)) return false;\n");
                    CheckerDslJvmModelInferrer.this.mr_chk = _plus_64;
                    CheckerDslJvmModelInferrer.this.mr_chk = (CheckerDslJvmModelInferrer.this.mr_chk + "}\n");
                    CheckerDslJvmModelInferrer.this.mr_chk = (CheckerDslJvmModelInferrer.this.mr_chk + "}\n");
                  }
                }
              } else {
                EList<JvmMember> _members_58 = it.getMembers();
                String _name_37 = ((ChkVariableDeclaration)feature).getName();
                JvmField _field_19 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _name_37, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_58, _field_19);
                EList<JvmMember> _members_59 = it.getMembers();
                String _name_38 = ((ChkVariableDeclaration)feature).getName();
                String _plus_65 = (_name_38 + "_2");
                JvmField _field_20 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _plus_65, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_59, _field_20);
                String _name_39 = ((ChkVariableDeclaration)feature).getName();
                String _plus_66 = (CheckerDslJvmModelInferrer.this.copy_var + _name_39);
                String _plus_67 = (_plus_66 + "_2 = ");
                String _name_40 = ((ChkVariableDeclaration)feature).getName();
                String _plus_68 = (_plus_67 + _name_40);
                String _plus_69 = (_plus_68 + ";\n");
                CheckerDslJvmModelInferrer.this.copy_var = _plus_69;
                EList<JvmMember> _members_60 = it.getMembers();
                String _name_41 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _getter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toGetter(feature, _name_41, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_60, _getter_1);
                EList<JvmMember> _members_61 = it.getMembers();
                String _name_42 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _setter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toSetter(feature, _name_42, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_61, _setter_1);
                EList<JvmMember> _members_62 = it.getMembers();
                String _name_43 = ((ChkVariableDeclaration)feature).getName();
                String _plus_70 = (_name_43 + "_2");
                JvmOperation _getter_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toGetter(feature, _plus_70, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_62, _getter_2);
                EList<JvmMember> _members_63 = it.getMembers();
                String _name_44 = ((ChkVariableDeclaration)feature).getName();
                String _plus_71 = (_name_44 + "_2");
                JvmOperation _setter_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toSetter(feature, _plus_71, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_63, _setter_2);
                EList<JvmMember> _members_64 = it.getMembers();
                String _name_45 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_27 = StringExtensions.toFirstUpper(_name_45);
                String _plus_72 = ("read" + _firstUpper_27);
                JvmTypeReference _typeRef_58 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                final Procedure1<JvmOperation> _function_39 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                    JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "token", _typeRef);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        String _name = ((ChkVariableDeclaration)feature).getName();
                        _builder.append(_name, "");
                        _builder.append(" = ");
                        String _type = ((ChkVariableDeclaration)feature).getType();
                        _builder.append(_type, "");
                        _builder.append("Reader(token);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("if (!validate");
                        String _name_1 = ((ChkVariableDeclaration)feature).getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                        _builder.append(_firstUpper, "");
                        _builder.append("(");
                        String _name_2 = ((ChkVariableDeclaration)feature).getName();
                        _builder.append(_name_2, "");
                        _builder.append(",current_subtask)){");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t");
                        _builder.append(".die(\"value not in valid range\");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      }
                    };
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_37 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_72, _typeRef_58, _function_39);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_64, _method_37);
                EList<JvmMember> _members_65 = it.getMembers();
                String _name_46 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_28 = StringExtensions.toFirstUpper(_name_46);
                String _plus_73 = ("write" + _firstUpper_28);
                JvmTypeReference _typeRef_59 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                final Procedure1<JvmOperation> _function_40 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        _builder.append("try {");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("writer.write(\"\"+(");
                        String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                        _builder.append(_chkType, "\t");
                        _builder.append(")");
                        String _name = ((ChkVariableDeclaration)feature).getName();
                        _builder.append(_name, "\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("} catch (Exception e){}");
                        _builder.newLine();
                      }
                    };
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_38 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_73, _typeRef_59, _function_40);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_65, _method_38);
                EList<JvmMember> _members_66 = it.getMembers();
                String _name_47 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_29 = StringExtensions.toFirstUpper(_name_47);
                String _plus_74 = ("write" + _firstUpper_29);
                String _plus_75 = (_plus_74 + "_2");
                JvmTypeReference _typeRef_60 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                final Procedure1<JvmOperation> _function_41 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        _builder.append("try {");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("writer.write(\"\"+(");
                        String _chkType = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                        _builder.append(_chkType, "\t");
                        _builder.append(")");
                        String _name = ((ChkVariableDeclaration)feature).getName();
                        _builder.append(_name, "\t");
                        _builder.append("_2);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("} catch (Exception e){}");
                        _builder.newLine();
                      }
                    };
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_39 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_75, _typeRef_60, _function_41);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_66, _method_39);
                String _chkType_4 = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                String _plus_76 = ((CheckerDslJvmModelInferrer.this.mr_chk + "if ((") + _chkType_4);
                String _plus_77 = (_plus_76 + ")");
                String _name_48 = ((ChkVariableDeclaration)feature).getName();
                String _plus_78 = (_plus_77 + _name_48);
                String _plus_79 = (_plus_78 + "_2 != (");
                String _chkType_5 = CheckerDslJvmModelInferrer.this.chkType(((ChkVariableDeclaration)feature));
                String _plus_80 = (_plus_79 + _chkType_5);
                String _plus_81 = (_plus_80 + ")ans.");
                String _name_49 = ((ChkVariableDeclaration)feature).getName();
                String _plus_82 = (_plus_81 + _name_49);
                String _plus_83 = (_plus_82 + ") return false;\n");
                CheckerDslJvmModelInferrer.this.mr_chk = _plus_83;
              }
            }
          }
          if (!_matched) {
            if (feature instanceof Method) {
              _matched=true;
              EList<JvmMember> _members_27 = it.getMembers();
              String _name = ((Method)feature).getName();
              JvmTypeReference _type = ((Method)feature).getType();
              final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _params = ((Method)feature).getParams();
                  for (final JvmFormalParameter p : _params) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    String _name = p.getName();
                    JvmTypeReference _parameterType = p.getParameterType();
                    JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  }
                  XExpression _body = ((Method)feature).getBody();
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                }
              };
              JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _name, _type, _function_12);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
            }
          }
          if (!_matched) {
            if (feature instanceof InputFormat) {
              _matched=true;
              EList<JvmMember> _members_27 = it.getMembers();
              JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "num", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  CheckerDslJvmModelInferrer.this.bd2 = "int sz = 0;\n";
                  CheckerDslJvmModelInferrer.this.bd2 = ((CheckerDslJvmModelInferrer.this.bd2 + CheckerDslJvmModelInferrer.this.class_name) + ".is_valid = true;\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "String line;\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "String[] tokens;\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "try{\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "BufferedReader reader = new BufferedReader(new FileReader(new File(\"tc/Subtask\"+current_subtask+\"/in/\"+num+\"/\"+current_testcase+\".in\")));\n");
                  EList<EObject> _exp = ((InputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _inputBody = CheckerDslJvmModelInferrer.this.inputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd2.concat(_inputBody);
                        CheckerDslJvmModelInferrer.this.bd2 = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "if (reader.readLine() != null){\n");
                  CheckerDslJvmModelInferrer.this.bd2 = ((CheckerDslJvmModelInferrer.this.bd2 + CheckerDslJvmModelInferrer.this.class_name) + ".die(\"number of lines not match\");\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "}\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "reader.close();\n");
                  CheckerDslJvmModelInferrer.this.bd2 = (CheckerDslJvmModelInferrer.this.bd2 + "} catch (Exception e){}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd2, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "readInput", _typeRef_27, _function_12);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
              EList<JvmMember> _members_28 = it.getMembers();
              JvmTypeReference _typeRef_28 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "path", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  CheckerDslJvmModelInferrer.this.bd2b = "int sz = 0;\n";
                  CheckerDslJvmModelInferrer.this.bd2b = ((CheckerDslJvmModelInferrer.this.bd2b + CheckerDslJvmModelInferrer.this.class_name) + ".is_valid = true;\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "String line;\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "String[] tokens;\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "try{\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "BufferedReader reader = new BufferedReader(new FileReader(new File(path)));\n");
                  EList<EObject> _exp = ((InputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _inputBody = CheckerDslJvmModelInferrer.this.inputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd2b.concat(_inputBody);
                        CheckerDslJvmModelInferrer.this.bd2b = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "if (reader.readLine() != null){\n");
                  CheckerDslJvmModelInferrer.this.bd2b = ((CheckerDslJvmModelInferrer.this.bd2b + CheckerDslJvmModelInferrer.this.class_name) + ".die(\"number of lines not match\");\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "}\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "reader.close();\n");
                  CheckerDslJvmModelInferrer.this.bd2b = (CheckerDslJvmModelInferrer.this.bd2b + "} catch (Exception e){}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd2b, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "readInput", _typeRef_28, _function_13);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _method_11);
              EList<JvmMember> _members_29 = it.getMembers();
              JvmTypeReference _typeRef_29 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mr", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                  JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                  JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "tc", _typeRef_1);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                  CheckerDslJvmModelInferrer.this.bd2a = "try {\n";
                  CheckerDslJvmModelInferrer.this.bd2a = (CheckerDslJvmModelInferrer.this.bd2a + "File wfile = new File(\"tc/Subtask\"+current_subtask+\"/in/\"+mr+\"/\"+tc+\".in\");\n");
                  CheckerDslJvmModelInferrer.this.bd2a = (CheckerDslJvmModelInferrer.this.bd2a + "if(!wfile.exists()) wfile.createNewFile();\n");
                  CheckerDslJvmModelInferrer.this.bd2a = (CheckerDslJvmModelInferrer.this.bd2a + "fw = new FileWriter(wfile);\n");
                  CheckerDslJvmModelInferrer.this.bd2a = (CheckerDslJvmModelInferrer.this.bd2a + "writer = new BufferedWriter(fw);\n");
                  EList<EObject> _exp = ((InputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _outputBody = CheckerDslJvmModelInferrer.this.outputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd2a.concat(_outputBody);
                        CheckerDslJvmModelInferrer.this.bd2a = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd2a = (CheckerDslJvmModelInferrer.this.bd2a + "writer.close();\n");
                  CheckerDslJvmModelInferrer.this.bd2a = (CheckerDslJvmModelInferrer.this.bd2a + "} catch(Exception e){}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd2a, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_12 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "writeInput", _typeRef_29, _function_14);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_29, _method_12);
              EList<JvmMember> _members_30 = it.getMembers();
              JvmTypeReference _typeRef_30 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "path", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  CheckerDslJvmModelInferrer.this.bd2d = "try {\n";
                  CheckerDslJvmModelInferrer.this.bd2d = (CheckerDslJvmModelInferrer.this.bd2d + "File wfile = new File(path);\n");
                  CheckerDslJvmModelInferrer.this.bd2d = (CheckerDslJvmModelInferrer.this.bd2d + "if(!wfile.exists()) wfile.createNewFile();\n");
                  CheckerDslJvmModelInferrer.this.bd2d = (CheckerDslJvmModelInferrer.this.bd2d + "fw = new FileWriter(wfile);\n");
                  CheckerDslJvmModelInferrer.this.bd2d = (CheckerDslJvmModelInferrer.this.bd2d + "writer = new BufferedWriter(fw);\n");
                  EList<EObject> _exp = ((InputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _outputBody = CheckerDslJvmModelInferrer.this.outputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd2d.concat(_outputBody);
                        CheckerDslJvmModelInferrer.this.bd2d = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd2d = (CheckerDslJvmModelInferrer.this.bd2d + "writer.close();\n");
                  CheckerDslJvmModelInferrer.this.bd2d = (CheckerDslJvmModelInferrer.this.bd2d + "} catch(Exception e){}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd2d, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_13 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "writeInput", _typeRef_30, _function_15);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_30, _method_13);
            }
          }
          if (!_matched) {
            if (feature instanceof OutputFormat) {
              _matched=true;
              EList<JvmMember> _members_27 = it.getMembers();
              JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "num", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  CheckerDslJvmModelInferrer.this.bd3a = "int sz = 0;\n";
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "String line;\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "String[] tokens;\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "try{\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "BufferedReader reader = new BufferedReader(new FileReader(new File(\"tc/Subtask\"+current_subtask+\"/out/\"+num+\"/\"+current_testcase+\".out\")));\n");
                  EList<EObject> _exp = ((OutputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _inputBody = CheckerDslJvmModelInferrer.this.inputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd3a.concat(_inputBody);
                        CheckerDslJvmModelInferrer.this.bd3a = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "if (reader.readLine() != null){\n");
                  CheckerDslJvmModelInferrer.this.bd3a = ((CheckerDslJvmModelInferrer.this.bd3a + CheckerDslJvmModelInferrer.this.class_name) + ".die(\"number of lines not match\");\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "}\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "reader.close();\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "} catch (Exception e){}\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (((CheckerDslJvmModelInferrer.this.bd3a + "if (") + CheckerDslJvmModelInferrer.this.class_name) + ".is_valid){\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "if (num == 0){\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "mr_start();\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "current_mr = 0;\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "for (int i=1; i<=num_mr; i++){\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "readInput(i);\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "readOutput(i);\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "}\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "current_testcase++;\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "if (current_testcase <= max_tc){\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "readInput(0);\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "readOutput(0);\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "}\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "} else {\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "initMRVar();\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "num_tc++;\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "if (num_tc <= max_tc){\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "writeInput(0,num_tc);\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "writeOutput(0,num_tc);\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "}\n");
                  CheckerDslJvmModelInferrer.this.bd3a = (CheckerDslJvmModelInferrer.this.bd3a + "}\n}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd3a, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "readOutput", _typeRef_27, _function_12);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
              EList<JvmMember> _members_28 = it.getMembers();
              JvmTypeReference _typeRef_28 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "path", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  CheckerDslJvmModelInferrer.this.bd3b = "int sz = 0;\n";
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "String line;\n");
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "String[] tokens;\n");
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "try{\n");
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "BufferedReader reader = new BufferedReader(new FileReader(new File(path)));\n");
                  EList<EObject> _exp = ((OutputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _inputBody = CheckerDslJvmModelInferrer.this.inputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd3b.concat(_inputBody);
                        CheckerDslJvmModelInferrer.this.bd3b = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "if (reader.readLine() != null){\n");
                  CheckerDslJvmModelInferrer.this.bd3b = ((CheckerDslJvmModelInferrer.this.bd3b + CheckerDslJvmModelInferrer.this.class_name) + ".die(\"number of lines not match\");\n");
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "}\n");
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "reader.close();\n");
                  CheckerDslJvmModelInferrer.this.bd3b = (CheckerDslJvmModelInferrer.this.bd3b + "} catch (Exception e){}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd3b, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "readOutput", _typeRef_28, _function_13);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _method_11);
              EList<JvmMember> _members_29 = it.getMembers();
              JvmTypeReference _typeRef_29 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mr", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                  JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                  JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "tc", _typeRef_1);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                  CheckerDslJvmModelInferrer.this.bd3 = "try {\n";
                  CheckerDslJvmModelInferrer.this.bd3 = (CheckerDslJvmModelInferrer.this.bd3 + "File wfile = new File(\"tc/Subtask\"+current_subtask+\"/out/\"+mr+\"/\"+tc+\".out\");\n");
                  CheckerDslJvmModelInferrer.this.bd3 = (CheckerDslJvmModelInferrer.this.bd3 + "if(!wfile.exists()) wfile.createNewFile();\n");
                  CheckerDslJvmModelInferrer.this.bd3 = (CheckerDslJvmModelInferrer.this.bd3 + "fw = new FileWriter(wfile);\n");
                  CheckerDslJvmModelInferrer.this.bd3 = (CheckerDslJvmModelInferrer.this.bd3 + "writer = new BufferedWriter(fw);\n");
                  EList<EObject> _exp = ((OutputFormat)feature).getExp();
                  for (final EObject p : _exp) {
                    boolean _matched = false;
                    if (!_matched) {
                      if (p instanceof FormatExpression) {
                        _matched=true;
                        String _outputBody = CheckerDslJvmModelInferrer.this.outputBody(((FormatExpression)p));
                        String _concat = CheckerDslJvmModelInferrer.this.bd3.concat(_outputBody);
                        CheckerDslJvmModelInferrer.this.bd3 = _concat;
                      }
                    }
                    if (!_matched) {
                      if (p instanceof ForFormatExpression) {
                        _matched=true;
                      }
                    }
                  }
                  CheckerDslJvmModelInferrer.this.bd3 = (CheckerDslJvmModelInferrer.this.bd3 + "writer.close();\n");
                  CheckerDslJvmModelInferrer.this.bd3 = (CheckerDslJvmModelInferrer.this.bd3 + "} catch(Exception e){}\n");
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append(CheckerDslJvmModelInferrer.this.bd3, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_12 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "writeOutput", _typeRef_29, _function_14);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_29, _method_12);
            }
          }
          if (!_matched) {
            if (feature instanceof Check) {
              _matched=true;
              EList<JvmMember> _members_27 = it.getMembers();
              JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
              final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                  JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "inPath", _typeRef);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                  JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                  JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "outPath", _typeRef_1);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                  EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                  JvmTypeReference _typeRef_2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                  JvmFormalParameter _parameter_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "ansPath", _typeRef_2);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      String checkBody1 = (((CheckerDslJvmModelInferrer.this.class_name + " ans = new ") + CheckerDslJvmModelInferrer.this.class_name) + "();\n");
                      _builder.newLineIfNotEmpty();
                      String checkBody = "";
                      _builder.newLineIfNotEmpty();
                      String condArr = "ArrayList cond_arr;\n";
                      _builder.newLineIfNotEmpty();
                      EList<EObject> _chk = ((Check)feature).getChk();
                      for (final EObject ch : _chk) {
                        boolean _matched = false;
                        if (!_matched) {
                          if (ch instanceof ChkExpression) {
                            _matched=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)ch));
                            String _plus = (checkBody + _checkExp);
                            checkBody = _plus;
                          }
                        }
                        if (!_matched) {
                          if (ch instanceof ChkLoopExpression) {
                            _matched=true;
                            String _checkLoopExp = CheckerDslJvmModelInferrer.this.checkLoopExp(((ChkLoopExpression)ch));
                            String _plus = (checkBody + _checkLoopExp);
                            checkBody = _plus;
                          }
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      _builder.append(checkBody1, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append("ans.init();");
                      _builder.newLine();
                      _builder.append("readInput(inPath);");
                      _builder.newLine();
                      _builder.append("readOutput(outPath);");
                      _builder.newLine();
                      _builder.append("ans.readInput(inPath);");
                      _builder.newLine();
                      _builder.append("ans.readOutput(ansPath);");
                      _builder.newLine();
                      _builder.append("boolean ok = true;");
                      _builder.newLine();
                      _builder.append(condArr, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append(checkBody, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append("return ok;");
                      _builder.newLine();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "output_check", _typeRef_27, _function_12);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
            }
          }
          if (!_matched) {
            if (feature instanceof MR) {
              _matched=true;
              CheckerDslJvmModelInferrer.this.num_mr = (CheckerDslJvmModelInferrer.this.num_mr + 1);
              int _num = ((MR)feature).getNum();
              String _plus = ((CheckerDslJvmModelInferrer.this.mr_list + "mr_followup_") + Integer.valueOf(_num));
              String _plus_1 = (_plus + "();\n");
              CheckerDslJvmModelInferrer.this.mr_list = _plus_1;
              CheckerDslJvmModelInferrer.this.mr_list = (CheckerDslJvmModelInferrer.this.mr_list + "writeInput(current_mr,current_testcase);\n");
              CheckerDslJvmModelInferrer.this.mr_list = (CheckerDslJvmModelInferrer.this.mr_list + "writeOutput(current_mr,current_testcase);\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\tg.setIs_valid(true);\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\tg.readInput(inFile);\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              int _num_1 = ((MR)feature).getNum();
              String _plus_2 = ((CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\tg.mr_followup_") + Integer.valueOf(_num_1));
              String _plus_3 = (_plus_2 + "();\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = _plus_3;
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\tg.writeInput(inFile2);\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\tif (g.getIs_valid()) g.readInput(inFile2);\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\tif (g.getIs_valid()){\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\t\texecute(inFile2,outFile2);\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\t\tif (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(\"\t\t\t\t}\");\n");
              CheckerDslJvmModelInferrer.this.mr_gen = (CheckerDslJvmModelInferrer.this.mr_gen + "writer.write(System.lineSeparator());\n");
              EList<JvmMember> _members_27 = it.getMembers();
              int _num_2 = ((MR)feature).getNum();
              String _plus_4 = ("mr_followup_" + Integer.valueOf(_num_2));
              JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append("initMRVar();");
                      _builder.newLine();
                      _builder.append("current_mr++;");
                      _builder.newLine();
                      String condArr = "ArrayList cond_arr;\n";
                      _builder.newLineIfNotEmpty();
                      String genExp = "";
                      _builder.newLineIfNotEmpty();
                      EList<EObject> _mrExp = ((MR)feature).getMrExp();
                      for (final EObject me : _mrExp) {
                        boolean _matched = false;
                        if (!_matched) {
                          if (me instanceof ChkExpression) {
                            _matched=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)me));
                            String _plus = (genExp + _checkExp);
                            genExp = _plus;
                          }
                        }
                        if (!_matched) {
                          if (me instanceof ChkLoopExpression) {
                            _matched=true;
                            String _checkLoopExp = CheckerDslJvmModelInferrer.this.checkLoopExp(((ChkLoopExpression)me));
                            String _plus = (genExp + _checkLoopExp);
                            genExp = _plus;
                          }
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      FollowUp _followup = ((MR)feature).getFollowup();
                      EList<EObject> _followups = _followup.getFollowups();
                      for (final EObject fo : _followups) {
                        boolean _matched_1 = false;
                        if (!_matched_1) {
                          if (fo instanceof ChkExpression) {
                            _matched_1=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)fo));
                            String _plus = (genExp + _checkExp);
                            genExp = _plus;
                          }
                        }
                        if (!_matched_1) {
                          if (fo instanceof ChkLoopExpression) {
                            _matched_1=true;
                            String _checkLoopExp = CheckerDslJvmModelInferrer.this.checkLoopExp(((ChkLoopExpression)fo));
                            String _plus = (genExp + _checkLoopExp);
                            genExp = _plus;
                          }
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      Property _property = ((MR)feature).getProperty();
                      EList<EObject> _properties = _property.getProperties();
                      for (final EObject pr : _properties) {
                        boolean _matched_2 = false;
                        if (!_matched_2) {
                          if (pr instanceof ChkExpression) {
                            _matched_2=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)pr));
                            String _plus = (genExp + _checkExp);
                            genExp = _plus;
                          }
                        }
                        if (!_matched_2) {
                          if (pr instanceof ChkLoopExpression) {
                            _matched_2=true;
                            String _checkLoopExp = CheckerDslJvmModelInferrer.this.checkLoopExp(((ChkLoopExpression)pr));
                            String _plus = (genExp + _checkLoopExp);
                            genExp = _plus;
                          }
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      _builder.append(condArr, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append(genExp, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, _plus_4, _typeRef_27, _function_12);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
              EList<JvmMember> _members_28 = it.getMembers();
              int _num_3 = ((MR)feature).getNum();
              String _plus_5 = ("mr_check_" + Integer.valueOf(_num_3));
              JvmTypeReference _typeRef_28 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append("initMRVar();");
                      _builder.newLine();
                      String checkBody = "boolean ok = true;\n";
                      _builder.newLineIfNotEmpty();
                      String condArr = "ArrayList cond_arr;\n";
                      _builder.newLineIfNotEmpty();
                      String genExp = "";
                      _builder.newLineIfNotEmpty();
                      EList<EObject> _mrExp = ((MR)feature).getMrExp();
                      for (final EObject me : _mrExp) {
                        boolean _matched = false;
                        if (!_matched) {
                          if (me instanceof ChkExpression) {
                            _matched=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)me));
                            String _plus = (genExp + _checkExp);
                            genExp = _plus;
                          }
                        }
                        if (!_matched) {
                          if (me instanceof ChkLoopExpression) {
                            _matched=true;
                            String _checkLoopExp = CheckerDslJvmModelInferrer.this.checkLoopExp(((ChkLoopExpression)me));
                            String _plus = (genExp + _checkLoopExp);
                            genExp = _plus;
                          }
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      Property _property = ((MR)feature).getProperty();
                      EList<EObject> _properties = _property.getProperties();
                      for (final EObject pr : _properties) {
                        boolean _matched_1 = false;
                        if (!_matched_1) {
                          if (pr instanceof ChkExpression) {
                            _matched_1=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)pr));
                            String _plus = (genExp + _checkExp);
                            genExp = _plus;
                          }
                        }
                        if (!_matched_1) {
                          if (pr instanceof ChkLoopExpression) {
                            _matched_1=true;
                            String _checkLoopExp = CheckerDslJvmModelInferrer.this.checkLoopExp(((ChkLoopExpression)pr));
                            String _plus = (genExp + _checkLoopExp);
                            genExp = _plus;
                          }
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      _builder.append(checkBody, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append(condArr, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append(genExp, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, _plus_5, _typeRef_28, _function_13);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _method_11);
            }
          }
          if (!_matched) {
            if (feature instanceof Score) {
              _matched=true;
              EList<ChkScoreExpression> _scores = ((Score)feature).getScores();
              int _size = _scores.size();
              CheckerDslJvmModelInferrer.this.num_subtask = _size;
              EList<JvmMember> _members_27 = it.getMembers();
              JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      String scoreBody = "File sfile;\n";
                      _builder.newLineIfNotEmpty();
                      EList<ChkScoreExpression> _scores = ((Score)feature).getScores();
                      for (final ChkScoreExpression score : _scores) {
                        {
                          scoreBody = (scoreBody + "try {\n");
                          String _subtask = score.getSubtask();
                          String _plus = ((scoreBody + "sfile = new File(\"tc/") + _subtask);
                          String _plus_1 = (_plus + ".score\");\n");
                          scoreBody = _plus_1;
                          scoreBody = (scoreBody + "if(!sfile.exists()) sfile.createNewFile();\n");
                          scoreBody = (scoreBody + "fw = new FileWriter(sfile);\n");
                          scoreBody = (scoreBody + "writer = new BufferedWriter(fw);\n");
                          String _score = score.getScore();
                          String _plus_2 = ((scoreBody + "writer.write(\"\"+") + _score);
                          String _plus_3 = (_plus_2 + ");\n");
                          scoreBody = _plus_3;
                          scoreBody = (scoreBody + "writer.write(System.lineSeparator());\n");
                          scoreBody = (scoreBody + "writer.close();\n");
                          scoreBody = (scoreBody + "} catch(Exception e){}\n");
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      _builder.append(scoreBody, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "printScore", _typeRef_27, _function_12);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
            }
          }
        }
        EList<JvmMember> _members_27 = it.getMembers();
        JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append(CheckerDslJvmModelInferrer.this.copy_var, "");
                _builder.newLineIfNotEmpty();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "initMRVar", _typeRef_27, _function_12);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _method_10);
        EList<JvmMember> _members_28 = it.getMembers();
        JvmTypeReference _typeRef_28 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append(CheckerDslJvmModelInferrer.this.mr_list, "");
                _builder.newLineIfNotEmpty();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "mr_start", _typeRef_28, _function_13);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _method_11);
        EList<JvmMember> _members_29 = it.getMembers();
        JvmTypeReference _typeRef_29 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("sc = new Scanner(System.in);");
                _builder.newLine();
                _builder.append("max_loop_counter = 1000;");
                _builder.newLine();
                _builder.append("loop_counter = 0;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_12 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "init", _typeRef_29, _function_14);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_29, _method_12);
        EList<JvmMember> _members_30 = it.getMembers();
        JvmTypeReference _typeRef_30 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
        final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "inPath", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "outPath", _typeRef_1);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("GeneratedClass ans = new GeneratedClass();");
                _builder.newLine();
                _builder.append("ans.init();");
                _builder.newLine();
                _builder.append("ans.readInput(inPath);");
                _builder.newLine();
                _builder.append("ans.readOutput(outPath);");
                _builder.newLine();
                _builder.append("if (!ans.getIs_valid()) return false;");
                _builder.newLine();
                _builder.append("boolean ok = true;");
                _builder.newLine();
                _builder.append(CheckerDslJvmModelInferrer.this.mr_chk, "");
                _builder.newLineIfNotEmpty();
                _builder.append("return ok;");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_13 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "mr_check", _typeRef_30, _function_15);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_30, _method_13);
        EList<JvmMember> _members_31 = it.getMembers();
        JvmTypeReference _typeRef_31 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_16 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mx_subtask", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
            JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mx_tc", _typeRef_1);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                String _generateOutputChecker = CheckerDslJvmModelInferrer.this.generateOutputChecker();
                _builder.append(_generateOutputChecker, "");
                _builder.newLineIfNotEmpty();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_14 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generateOutputChecker", _typeRef_31, _function_16);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_31, _method_14);
        EList<JvmMember> _members_32 = it.getMembers();
        JvmTypeReference _typeRef_32 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_17 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mx_subtask", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
            JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mx_tc", _typeRef_1);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                String _generateOutputCheckerMT = CheckerDslJvmModelInferrer.this.generateOutputCheckerMT();
                _builder.append(_generateOutputCheckerMT, "");
                _builder.newLineIfNotEmpty();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_15 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generateOutputCheckerMT", _typeRef_32, _function_17);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_32, _method_15);
        EList<JvmMember> _members_33 = it.getMembers();
        JvmTypeReference _typeRef_33 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_18 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
            JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "tc", _typeRef);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
            JvmFormalParameter _parameter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "mtc", _typeRef_1);
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("num_mr = ");
                _builder.append(CheckerDslJvmModelInferrer.this.num_mr, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("max_tc = mtc;");
                _builder.newLine();
                _builder.append("num_subtask = ");
                _builder.append(CheckerDslJvmModelInferrer.this.num_subtask, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "");
                _builder.append(".cur_lines = 1;");
                _builder.newLineIfNotEmpty();
                _builder.append("printScore();");
                _builder.newLine();
                _builder.append("generateOutputChecker(num_subtask,max_tc);");
                _builder.newLine();
                _builder.append("generateOutputCheckerMT(num_subtask,max_tc);");
                _builder.newLine();
                _builder.append("for (int i=1; i<=num_subtask; i++){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("current_subtask = i;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("current_testcase = 1;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("current_mr = 0;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("num_tc = tc;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("readInput(0);");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("readOutput(0);");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_16 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _typeRef_33, _function_18);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_33, _method_16);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public String chkVar(final ChkVariable element) {
    String cc = "";
    ChkPrefix _pref = element.getPref();
    boolean _notEquals = (!Objects.equal(_pref, null));
    if (_notEquals) {
      ChkPrefix _pref_1 = element.getPref();
      String _type = _pref_1.getType();
      String _plus = (cc + _type);
      String _plus_1 = (_plus + ".");
      cc = _plus_1;
    }
    EList<String> _v = element.getV();
    int _size = _v.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      String _var = element.getVar();
      String _plus_2 = (cc + _var);
      cc = _plus_2;
      String _newtest = element.getNewtest();
      boolean _notEquals_1 = (!Objects.equal(_newtest, null));
      if (_notEquals_1) {
        cc = (cc + "_2");
      }
    } else {
      String _var_1 = element.getVar();
      String _firstUpper = StringExtensions.toFirstUpper(_var_1);
      String _plus_3 = ((cc + "get") + _firstUpper);
      cc = _plus_3;
      String _newtest_1 = element.getNewtest();
      boolean _notEquals_2 = (!Objects.equal(_newtest_1, null));
      if (_notEquals_2) {
        cc = (cc + "_2");
      }
      cc = (cc + "(");
      int i = 0;
      EList<String> _v_1 = element.getV();
      for (final String v : _v_1) {
        {
          if ((i > 0)) {
            cc = (cc + ",");
          }
          cc = (cc + v);
          i = (i + 1);
        }
      }
      cc = (cc + ")");
    }
    InputOutput.<String>println(("var " + cc));
    return cc;
  }
  
  public String chkVar2(final ChkVariable element) {
    String cc = "";
    ChkPrefix _pref = element.getPref();
    boolean _notEquals = (!Objects.equal(_pref, null));
    if (_notEquals) {
      ChkPrefix _pref_1 = element.getPref();
      String _type = _pref_1.getType();
      String _plus = (cc + _type);
      String _plus_1 = (_plus + ".");
      cc = _plus_1;
    }
    String _var = element.getVar();
    String _plus_2 = (cc + _var);
    cc = _plus_2;
    String _newtest = element.getNewtest();
    boolean _notEquals_1 = (!Objects.equal(_newtest, null));
    if (_notEquals_1) {
      cc = (cc + "_2");
    }
    InputOutput.<String>println(("var2 " + cc));
    return cc;
  }
  
  public String chkVars(final ChkVariables element) {
    String cc = "";
    ChkVariable _va = element.getVa();
    boolean _notEquals = (!Objects.equal(_va, null));
    if (_notEquals) {
      ChkVariable _va_1 = element.getVa();
      String _chkVar = this.chkVar(_va_1);
      String _plus = (cc + _chkVar);
      cc = _plus;
    }
    String _nu = element.getNu();
    boolean _notEquals_1 = (!Objects.equal(_nu, null));
    if (_notEquals_1) {
      String _nu_1 = element.getNu();
      String _plus_1 = (cc + _nu_1);
      cc = _plus_1;
    }
    InputOutput.<String>println(("vars " + cc));
    return cc;
  }
  
  public String relationalExp(final ChkRelationalExpression element) {
    String cc = "";
    ChkVariables _v1 = element.getV1();
    String _chkVars = this.chkVars(_v1);
    String _plus = (cc + _chkVars);
    cc = _plus;
    String _opr = element.getOpr();
    String _plus_1 = (cc + _opr);
    cc = _plus_1;
    ChkVariables _v2 = element.getV2();
    String _chkVars_1 = this.chkVars(_v2);
    String _plus_2 = (cc + _chkVars_1);
    cc = _plus_2;
    InputOutput.<String>println(("rel " + cc));
    return cc;
  }
  
  public String chkOp(final ChkOperation element) {
    String cc = "";
    int xx = (-1);
    EList<ChkVariables> _operand = element.getOperand();
    for (final ChkVariables op : _operand) {
      {
        if ((xx >= 0)) {
          EList<String> _operator = element.getOperator();
          String _get = _operator.get(xx);
          String _plus = (cc + _get);
          cc = _plus;
        }
        String _chkVars = this.chkVars(op);
        String _plus_1 = (cc + _chkVars);
        cc = _plus_1;
        xx = (xx + 1);
      }
    }
    InputOutput.<String>println(("op " + cc));
    return cc;
  }
  
  public String checkExp(final ChkExpression element) {
    String cc = "";
    String lt = "";
    ChkGeneralExpressions exp = element.getExp();
    boolean _matched = false;
    if (!_matched) {
      if (exp instanceof Helper) {
        _matched=true;
        String _select = ((Helper)exp).getSelect();
        boolean _notEquals = (!Objects.equal(_select, null));
        if (_notEquals) {
          EList<String> _vars = ((Helper)exp).getVars();
          for (final String vv : _vars) {
            cc = (((cc + "int ") + vv) + ";\n");
          }
          cc = (cc + "loop_counter = 0;\n");
          cc = (cc + "do {");
          EList<String> _vars_1 = ((Helper)exp).getVars();
          for (final String vv_1 : _vars_1) {
            ChkVariables _var3 = ((Helper)exp).getVar3();
            String _chkVars = this.chkVars(_var3);
            String _plus = (((((cc + vv_1) + " = ") + this.lib_class_name) + ".select(") + _chkVars);
            String _plus_1 = (_plus + ",");
            ChkVariables _var4 = ((Helper)exp).getVar4();
            String _chkVars_1 = this.chkVars(_var4);
            String _plus_2 = (_plus_1 + _chkVars_1);
            String _plus_3 = (_plus_2 + ");\n");
            cc = _plus_3;
          }
          cc = (cc + "loop_counter++;\n");
          cc = (cc + "if (loop_counter >= max_loop_counter){\n");
          cc = (cc + "is_valid = false;\n");
          cc = (cc + "break;\n");
          cc = (cc + "}\n");
          cc = (cc + "} while (!(");
          int xx = (-1);
          EList<ChkGeneralExpressions> _cond = element.getCond();
          for (final ChkGeneralExpressions co : _cond) {
            {
              if ((xx >= 0)) {
                EList<String> _type = element.getType();
                String _get = _type.get(xx);
                boolean _equals = _get.equals("and");
                if (_equals) {
                  cc = (cc + " && ");
                }
                EList<String> _type_1 = element.getType();
                String _get_1 = _type_1.get(xx);
                boolean _equals_1 = _get_1.equals("or");
                if (_equals_1) {
                  cc = (cc + " || ");
                }
              }
              boolean _matched_1 = false;
              if (!_matched_1) {
                if (co instanceof ChkRelationalExpression) {
                  _matched_1=true;
                  String _relationalExp = this.relationalExp(((ChkRelationalExpression)co));
                  String _plus_4 = (cc + _relationalExp);
                  cc = _plus_4;
                }
              }
              xx = (xx + 1);
            }
          }
          cc = (cc + "));\n");
        } else {
          boolean _or = false;
          boolean _or_1 = false;
          boolean _or_2 = false;
          String _sum = ((Helper)exp).getSum();
          boolean _notEquals_1 = (!Objects.equal(_sum, null));
          if (_notEquals_1) {
            _or_2 = true;
          } else {
            String _max = ((Helper)exp).getMax();
            boolean _notEquals_2 = (!Objects.equal(_max, null));
            _or_2 = _notEquals_2;
          }
          if (_or_2) {
            _or_1 = true;
          } else {
            String _min = ((Helper)exp).getMin();
            boolean _notEquals_3 = (!Objects.equal(_min, null));
            _or_1 = _notEquals_3;
          }
          if (_or_1) {
            _or = true;
          } else {
            boolean _and = false;
            String _remove = ((Helper)exp).getRemove();
            boolean _notEquals_4 = (!Objects.equal(_remove, null));
            if (!_notEquals_4) {
              _and = false;
            } else {
              ChkVariables _var3_1 = ((Helper)exp).getVar3();
              boolean _equals = Objects.equal(_var3_1, null);
              _and = _equals;
            }
            _or = _and;
          }
          if (_or) {
            int xx_1 = (-1);
            cc = (cc + "cond_arr = new ArrayList<Boolean>();\n");
            String _where = element.getWhere();
            boolean _notEquals_5 = (!Objects.equal(_where, null));
            if (_notEquals_5) {
              ChkVariable _var = ((Helper)exp).getVar();
              String _chkVar = this.chkVar(_var);
              String _plus_4 = ((cc + "for (int i=0; i<") + _chkVar);
              String _plus_5 = (_plus_4 + ".size(); i++){\n");
              cc = _plus_5;
              cc = (cc + "if (");
              EList<ChkGeneralExpressions> _cond_1 = element.getCond();
              for (final ChkGeneralExpressions co_1 : _cond_1) {
                {
                  if ((xx_1 >= 0)) {
                    EList<String> _type = element.getType();
                    String _get = _type.get(xx_1);
                    boolean _equals_1 = _get.equals("and");
                    if (_equals_1) {
                      cc = (cc + " && ");
                    }
                    EList<String> _type_1 = element.getType();
                    String _get_1 = _type_1.get(xx_1);
                    boolean _equals_2 = _get_1.equals("or");
                    if (_equals_2) {
                      cc = (cc + " || ");
                    }
                  }
                  boolean _matched_1 = false;
                  if (!_matched_1) {
                    if (co_1 instanceof ChkRelationalExpression) {
                      _matched_1=true;
                      String _relationalExp = this.relationalExp(((ChkRelationalExpression)co_1));
                      String _plus_6 = (cc + _relationalExp);
                      cc = _plus_6;
                    }
                  }
                  xx_1 = (xx_1 + 1);
                }
              }
              cc = (cc + ") cond_arr.add(true);\n");
              cc = (cc + "else cond_arr.add(false);\n");
              cc = (cc + "}\n");
            } else {
              ChkVariable _var_1 = ((Helper)exp).getVar();
              String _chkVar_1 = this.chkVar(_var_1);
              String _plus_6 = ((cc + "for (int i=0; i<") + _chkVar_1);
              String _plus_7 = (_plus_6 + ".size(); i++){\n");
              cc = _plus_7;
              cc = (cc + "cond_arr.add(true);\n");
              cc = (cc + "}\n");
            }
            String _op = element.getOp();
            boolean _notEquals_6 = (!Objects.equal(_op, null));
            if (_notEquals_6) {
              cc = (cc + "if (!(");
            }
            cc = (cc + lt);
            cc = ((cc + this.lib_class_name) + ".");
            String _sum_1 = ((Helper)exp).getSum();
            boolean _notEquals_7 = (!Objects.equal(_sum_1, null));
            if (_notEquals_7) {
              ChkVariable _var_2 = ((Helper)exp).getVar();
              String _chkVar_2 = this.chkVar(_var_2);
              String _plus_8 = ((cc + "sum(") + _chkVar_2);
              String _plus_9 = (_plus_8 + ", cond_arr)");
              cc = _plus_9;
            } else {
              String _max_1 = ((Helper)exp).getMax();
              boolean _notEquals_8 = (!Objects.equal(_max_1, null));
              if (_notEquals_8) {
                ChkVariable _var_3 = ((Helper)exp).getVar();
                String _chkVar_3 = this.chkVar(_var_3);
                String _plus_10 = ((cc + "max(") + _chkVar_3);
                String _plus_11 = (_plus_10 + ", cond_arr)");
                cc = _plus_11;
              } else {
                String _min_1 = ((Helper)exp).getMin();
                boolean _notEquals_9 = (!Objects.equal(_min_1, null));
                if (_notEquals_9) {
                  ChkVariable _var_4 = ((Helper)exp).getVar();
                  String _chkVar_4 = this.chkVar(_var_4);
                  String _plus_12 = ((cc + "min(") + _chkVar_4);
                  String _plus_13 = (_plus_12 + ", cond_arr)");
                  cc = _plus_13;
                } else {
                  String _remove_1 = ((Helper)exp).getRemove();
                  boolean _notEquals_10 = (!Objects.equal(_remove_1, null));
                  if (_notEquals_10) {
                    ChkVariable _var_5 = ((Helper)exp).getVar();
                    String _chkVar_5 = this.chkVar(_var_5);
                    String _plus_14 = ((cc + "remove(") + _chkVar_5);
                    String _plus_15 = (_plus_14 + ", cond_arr)");
                    cc = _plus_15;
                  }
                }
              }
            }
          } else {
            String _op_1 = element.getOp();
            boolean _notEquals_11 = (!Objects.equal(_op_1, null));
            if (_notEquals_11) {
              cc = (cc + "if (!(");
            }
            cc = (cc + lt);
            cc = ((cc + this.lib_class_name) + ".");
            String _prime = ((Helper)exp).getPrime();
            boolean _notEquals_12 = (!Objects.equal(_prime, null));
            if (_notEquals_12) {
              ChkVariables _var3_2 = ((Helper)exp).getVar3();
              String _chkVars_2 = this.chkVars(_var3_2);
              String _plus_16 = ((cc + "prime(") + _chkVars_2);
              String _plus_17 = (_plus_16 + ");");
              cc = _plus_17;
            } else {
              String _random = ((Helper)exp).getRandom();
              boolean _notEquals_13 = (!Objects.equal(_random, null));
              if (_notEquals_13) {
                ChkVariables _var3_3 = ((Helper)exp).getVar3();
                String _chkVars_3 = this.chkVars(_var3_3);
                String _plus_18 = ((cc + "random(") + _chkVars_3);
                String _plus_19 = (_plus_18 + ",");
                ChkVariables _var4_1 = ((Helper)exp).getVar4();
                String _chkVars_4 = this.chkVars(_var4_1);
                String _plus_20 = (_plus_19 + _chkVars_4);
                String _plus_21 = (_plus_20 + ")");
                cc = _plus_21;
              } else {
                String _size = ((Helper)exp).getSize();
                boolean _notEquals_14 = (!Objects.equal(_size, null));
                if (_notEquals_14) {
                  ChkVariable _var_6 = ((Helper)exp).getVar();
                  String _chkVar_6 = this.chkVar(_var_6);
                  String _plus_22 = ((cc + "size(") + _chkVar_6);
                  String _plus_23 = (_plus_22 + ")");
                  cc = _plus_23;
                } else {
                  String _swap = ((Helper)exp).getSwap();
                  boolean _notEquals_15 = (!Objects.equal(_swap, null));
                  if (_notEquals_15) {
                    ChkVariable _var_7 = ((Helper)exp).getVar();
                    String _chkVar_7 = this.chkVar(_var_7);
                    String _plus_24 = ((cc + "swap(") + _chkVar_7);
                    String _plus_25 = (_plus_24 + ",");
                    String _var1 = ((Helper)exp).getVar1();
                    String _plus_26 = (_plus_25 + _var1);
                    String _plus_27 = (_plus_26 + ",");
                    String _var2 = ((Helper)exp).getVar2();
                    String _plus_28 = (_plus_27 + _var2);
                    String _plus_29 = (_plus_28 + ")");
                    cc = _plus_29;
                  } else {
                    String _add = ((Helper)exp).getAdd();
                    boolean _notEquals_16 = (!Objects.equal(_add, null));
                    if (_notEquals_16) {
                      ChkVariable _var_8 = ((Helper)exp).getVar();
                      String _chkVar_8 = this.chkVar(_var_8);
                      String _plus_30 = ((cc + "add(") + _chkVar_8);
                      String _plus_31 = (_plus_30 + ",");
                      ChkVariables _var3_4 = ((Helper)exp).getVar3();
                      String _chkVars_5 = this.chkVars(_var3_4);
                      String _plus_32 = (_plus_31 + _chkVars_5);
                      String _plus_33 = (_plus_32 + ")");
                      cc = _plus_33;
                    } else {
                      String _remove_2 = ((Helper)exp).getRemove();
                      boolean _notEquals_17 = (!Objects.equal(_remove_2, null));
                      if (_notEquals_17) {
                        ChkVariable _var_9 = ((Helper)exp).getVar();
                        String _chkVar_9 = this.chkVar(_var_9);
                        String _plus_34 = ((cc + "remove(") + _chkVar_9);
                        String _plus_35 = (_plus_34 + ",");
                        ChkVariables _var3_5 = ((Helper)exp).getVar3();
                        String _chkVars_6 = this.chkVars(_var3_5);
                        String _plus_36 = (_plus_35 + _chkVars_6);
                        String _plus_37 = (_plus_36 + ")");
                        cc = _plus_37;
                      } else {
                        String _plus_38 = ((Helper)exp).getPlus();
                        boolean _notEquals_18 = (!Objects.equal(_plus_38, null));
                        if (_notEquals_18) {
                          ChkVariable _var_10 = ((Helper)exp).getVar();
                          String _chkVar_10 = this.chkVar(_var_10);
                          String _plus_39 = ((cc + "plus(") + _chkVar_10);
                          String _plus_40 = (_plus_39 + ",");
                          ChkVariables _var3_6 = ((Helper)exp).getVar3();
                          String _chkVars_7 = this.chkVars(_var3_6);
                          String _plus_41 = (_plus_40 + _chkVars_7);
                          String _plus_42 = (_plus_41 + ")");
                          cc = _plus_42;
                        } else {
                          String _multiply = ((Helper)exp).getMultiply();
                          boolean _notEquals_19 = (!Objects.equal(_multiply, null));
                          if (_notEquals_19) {
                            ChkVariable _var_11 = ((Helper)exp).getVar();
                            String _chkVar_11 = this.chkVar(_var_11);
                            String _plus_43 = ((cc + "multiply(") + _chkVar_11);
                            String _plus_44 = (_plus_43 + ",");
                            ChkVariables _var3_7 = ((Helper)exp).getVar3();
                            String _chkVars_8 = this.chkVars(_var3_7);
                            String _plus_45 = (_plus_44 + _chkVars_8);
                            String _plus_46 = (_plus_45 + ")");
                            cc = _plus_46;
                          } else {
                            String _swapCol = ((Helper)exp).getSwapCol();
                            boolean _notEquals_20 = (!Objects.equal(_swapCol, null));
                            if (_notEquals_20) {
                              ChkVariable _var_12 = ((Helper)exp).getVar();
                              String _chkVar_12 = this.chkVar(_var_12);
                              String _plus_47 = ((cc + "swapColumn(") + _chkVar_12);
                              String _plus_48 = (_plus_47 + ",");
                              String _var1_1 = ((Helper)exp).getVar1();
                              String _plus_49 = (_plus_48 + _var1_1);
                              String _plus_50 = (_plus_49 + ",");
                              String _var2_1 = ((Helper)exp).getVar2();
                              String _plus_51 = (_plus_50 + _var2_1);
                              String _plus_52 = (_plus_51 + ")");
                              cc = _plus_52;
                            } else {
                              String _addRow = ((Helper)exp).getAddRow();
                              boolean _notEquals_21 = (!Objects.equal(_addRow, null));
                              if (_notEquals_21) {
                                ChkVariable _var_13 = ((Helper)exp).getVar();
                                String _chkVar_13 = this.chkVar(_var_13);
                                String _plus_53 = ((cc + "addRow(") + _chkVar_13);
                                String _plus_54 = (_plus_53 + ")");
                                cc = _plus_54;
                              } else {
                                String _addCol = ((Helper)exp).getAddCol();
                                boolean _notEquals_22 = (!Objects.equal(_addCol, null));
                                if (_notEquals_22) {
                                  ChkVariable _var_14 = ((Helper)exp).getVar();
                                  String _chkVar_14 = this.chkVar(_var_14);
                                  String _plus_55 = ((cc + "addColumn(") + _chkVar_14);
                                  String _plus_56 = (_plus_55 + ")");
                                  cc = _plus_56;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    if (!_matched) {
      if (exp instanceof ChkRelationalExpression) {
        _matched=true;
        cc = (cc + lt);
        String _relationalExp = this.relationalExp(((ChkRelationalExpression)exp));
        String _plus = ((cc + "if (!(") + _relationalExp);
        String _plus_1 = (_plus + ")) ok = false");
        cc = _plus_1;
      }
    }
    if (!_matched) {
      if (exp instanceof MethodCall) {
        _matched=true;
        String _op = element.getOp();
        boolean _notEquals = (!Objects.equal(_op, null));
        if (_notEquals) {
          cc = (cc + "if (!(");
        }
        cc = (cc + lt);
        String _name = ((MethodCall)exp).getName();
        String _plus = (cc + _name);
        String _plus_1 = (_plus + "(");
        cc = _plus_1;
        boolean first = true;
        EList<String> _params = ((MethodCall)exp).getParams();
        for (final String p : _params) {
          {
            if (first) {
              first = false;
            } else {
              cc = (cc + ",");
            }
            cc = (cc + p);
          }
        }
        cc = (cc + ")\n");
      }
    }
    if (!_matched) {
      if (exp instanceof ChkAssignment) {
        _matched=true;
        String lf = "";
        String _def = ((ChkAssignment)exp).getDef();
        boolean _notEquals = (!Objects.equal(_def, null));
        if (_notEquals) {
          lf = "int ";
        }
        String rg = "";
        ChkVariable _v1 = ((ChkAssignment)exp).getV1();
        EList<String> _v = _v1.getV();
        int _size = _v.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          ChkVariable _v1_1 = ((ChkAssignment)exp).getV1();
          String _chkVar = this.chkVar(_v1_1);
          String _plus = (lf + _chkVar);
          String _plus_1 = (_plus + " = ");
          lf = _plus_1;
          rg = (rg + ";\n");
        } else {
          ChkVariable _v1_2 = ((ChkAssignment)exp).getV1();
          ChkPrefix _pref = _v1_2.getPref();
          boolean _notEquals_1 = (!Objects.equal(_pref, null));
          if (_notEquals_1) {
            ChkVariable _v1_3 = ((ChkAssignment)exp).getV1();
            ChkPrefix _pref_1 = _v1_3.getPref();
            String _type = _pref_1.getType();
            String _plus_2 = (lf + _type);
            String _plus_3 = (_plus_2 + ".");
            lf = _plus_3;
          }
          ChkVariable _v1_4 = ((ChkAssignment)exp).getV1();
          String _var = _v1_4.getVar();
          String _firstUpper = StringExtensions.toFirstUpper(_var);
          String _plus_4 = ((lf + "set") + _firstUpper);
          lf = _plus_4;
          ChkVariable _v1_5 = ((ChkAssignment)exp).getV1();
          String _newtest = _v1_5.getNewtest();
          boolean _notEquals_2 = (!Objects.equal(_newtest, null));
          if (_notEquals_2) {
            lf = (lf + "_2");
          }
          lf = (lf + "(");
          ChkVariable _v1_6 = ((ChkAssignment)exp).getV1();
          EList<String> _v_1 = _v1_6.getV();
          for (final String id : _v_1) {
            lf = ((lf + id) + ",");
          }
          rg = (rg + ");\n");
        }
        EObject expv2 = ((ChkAssignment)exp).getV2();
        boolean _matched_1 = false;
        if (!_matched_1) {
          if (expv2 instanceof ChkOperation) {
            _matched_1=true;
            cc = (cc + lf);
            String _chkOp = this.chkOp(((ChkOperation)expv2));
            String _plus_5 = (cc + _chkOp);
            cc = _plus_5;
            cc = (cc + rg);
          }
        }
        if (!_matched_1) {
          if (expv2 instanceof Helper) {
            _matched_1=true;
            String _select = ((Helper)expv2).getSelect();
            boolean _notEquals_3 = (!Objects.equal(_select, null));
            if (_notEquals_3) {
              EList<String> _vars = ((Helper)expv2).getVars();
              for (final String vv : _vars) {
                cc = (((cc + "int ") + vv) + ";\n");
              }
              cc = (cc + "loop_counter = 0;\n");
              cc = (cc + "do {");
              EList<String> _vars_1 = ((Helper)expv2).getVars();
              for (final String vv_1 : _vars_1) {
                cc = ((((cc + vv_1) + " = ") + this.lib_class_name) + ".select();\n");
              }
              cc = (cc + "loop_counter++;\n");
              cc = (cc + "if (loop_counter >= max_loop_counter){\n");
              cc = (cc + "is_valid = false;\n");
              cc = (cc + "break;\n");
              cc = (cc + "}\n");
              cc = (cc + "} while (!(");
              int xx = (-1);
              EList<ChkGeneralExpressions> _cond = element.getCond();
              for (final ChkGeneralExpressions co : _cond) {
                {
                  if ((xx >= 0)) {
                    EList<String> _type_1 = element.getType();
                    String _get = _type_1.get(xx);
                    boolean _equals_1 = _get.equals("and");
                    if (_equals_1) {
                      cc = (cc + " && ");
                    }
                    EList<String> _type_2 = element.getType();
                    String _get_1 = _type_2.get(xx);
                    boolean _equals_2 = _get_1.equals("or");
                    if (_equals_2) {
                      cc = (cc + " || ");
                    }
                  }
                  boolean _matched_2 = false;
                  if (!_matched_2) {
                    if (co instanceof ChkRelationalExpression) {
                      _matched_2=true;
                      String _relationalExp = this.relationalExp(((ChkRelationalExpression)co));
                      String _plus_5 = (cc + _relationalExp);
                      cc = _plus_5;
                    }
                  }
                  xx = (xx + 1);
                }
              }
              cc = (cc + "));\n");
            } else {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _or_2 = false;
              String _sum = ((Helper)expv2).getSum();
              boolean _notEquals_4 = (!Objects.equal(_sum, null));
              if (_notEquals_4) {
                _or_2 = true;
              } else {
                String _max = ((Helper)expv2).getMax();
                boolean _notEquals_5 = (!Objects.equal(_max, null));
                _or_2 = _notEquals_5;
              }
              if (_or_2) {
                _or_1 = true;
              } else {
                String _min = ((Helper)expv2).getMin();
                boolean _notEquals_6 = (!Objects.equal(_min, null));
                _or_1 = _notEquals_6;
              }
              if (_or_1) {
                _or = true;
              } else {
                boolean _and = false;
                String _remove = ((Helper)expv2).getRemove();
                boolean _notEquals_7 = (!Objects.equal(_remove, null));
                if (!_notEquals_7) {
                  _and = false;
                } else {
                  ChkVariables _var3 = ((Helper)expv2).getVar3();
                  boolean _equals_1 = Objects.equal(_var3, null);
                  _and = _equals_1;
                }
                _or = _and;
              }
              if (_or) {
                int xx_1 = (-1);
                cc = (cc + "cond_arr = new ArrayList<Boolean>();\n");
                String _where = element.getWhere();
                boolean _notEquals_8 = (!Objects.equal(_where, null));
                if (_notEquals_8) {
                  ChkVariable _var_1 = ((Helper)expv2).getVar();
                  String _chkVar_1 = this.chkVar(_var_1);
                  String _plus_5 = ((cc + "for (int i=0; i<") + _chkVar_1);
                  String _plus_6 = (_plus_5 + ".size(); i++){\n");
                  cc = _plus_6;
                  cc = (cc + "if (");
                  EList<ChkGeneralExpressions> _cond_1 = element.getCond();
                  for (final ChkGeneralExpressions co_1 : _cond_1) {
                    {
                      if ((xx_1 >= 0)) {
                        EList<String> _type_1 = element.getType();
                        String _get = _type_1.get(xx_1);
                        boolean _equals_2 = _get.equals("and");
                        if (_equals_2) {
                          cc = (cc + " && ");
                        }
                        EList<String> _type_2 = element.getType();
                        String _get_1 = _type_2.get(xx_1);
                        boolean _equals_3 = _get_1.equals("or");
                        if (_equals_3) {
                          cc = (cc + " || ");
                        }
                      }
                      boolean _matched_2 = false;
                      if (!_matched_2) {
                        if (co_1 instanceof ChkRelationalExpression) {
                          _matched_2=true;
                          String _relationalExp = this.relationalExp(((ChkRelationalExpression)co_1));
                          String _plus_7 = (cc + _relationalExp);
                          cc = _plus_7;
                        }
                      }
                      xx_1 = (xx_1 + 1);
                    }
                  }
                  cc = (cc + ") cond_arr.add(true);\n");
                  cc = (cc + "else cond_arr.add(false);\n");
                  cc = (cc + "}\n");
                } else {
                  ChkVariable _var_2 = ((Helper)expv2).getVar();
                  String _chkVar_2 = this.chkVar(_var_2);
                  String _plus_7 = ((cc + "for (int i=0; i<") + _chkVar_2);
                  String _plus_8 = (_plus_7 + ".size(); i++){\n");
                  cc = _plus_8;
                  cc = (cc + "cond_arr.add(true);\n");
                  cc = (cc + "}\n");
                }
                String _op = element.getOp();
                boolean _notEquals_9 = (!Objects.equal(_op, null));
                if (_notEquals_9) {
                  cc = (cc + "if (!(");
                }
                cc = (cc + lf);
                cc = ((cc + this.lib_class_name) + ".");
                String _sum_1 = ((Helper)expv2).getSum();
                boolean _notEquals_10 = (!Objects.equal(_sum_1, null));
                if (_notEquals_10) {
                  ChkVariable _var_3 = ((Helper)expv2).getVar();
                  String _chkVar_3 = this.chkVar(_var_3);
                  String _plus_9 = ((cc + "sum(") + _chkVar_3);
                  String _plus_10 = (_plus_9 + ", cond_arr)");
                  cc = _plus_10;
                } else {
                  String _max_1 = ((Helper)expv2).getMax();
                  boolean _notEquals_11 = (!Objects.equal(_max_1, null));
                  if (_notEquals_11) {
                    ChkVariable _var_4 = ((Helper)expv2).getVar();
                    String _chkVar_4 = this.chkVar(_var_4);
                    String _plus_11 = ((cc + "max(") + _chkVar_4);
                    String _plus_12 = (_plus_11 + ", cond_arr)");
                    cc = _plus_12;
                  } else {
                    String _min_1 = ((Helper)expv2).getMin();
                    boolean _notEquals_12 = (!Objects.equal(_min_1, null));
                    if (_notEquals_12) {
                      ChkVariable _var_5 = ((Helper)expv2).getVar();
                      String _chkVar_5 = this.chkVar(_var_5);
                      String _plus_13 = ((cc + "min(") + _chkVar_5);
                      String _plus_14 = (_plus_13 + ", cond_arr)");
                      cc = _plus_14;
                    } else {
                      String _remove_1 = ((Helper)expv2).getRemove();
                      boolean _notEquals_13 = (!Objects.equal(_remove_1, null));
                      if (_notEquals_13) {
                        ChkVariable _var_6 = ((Helper)expv2).getVar();
                        String _chkVar_6 = this.chkVar(_var_6);
                        String _plus_15 = ((cc + "remove(") + _chkVar_6);
                        String _plus_16 = (_plus_15 + ", cond_arr)");
                        cc = _plus_16;
                      }
                    }
                  }
                }
                cc = (cc + rg);
              } else {
                String _op_1 = element.getOp();
                boolean _notEquals_14 = (!Objects.equal(_op_1, null));
                if (_notEquals_14) {
                  cc = (cc + "if (!(");
                }
                cc = (cc + lf);
                cc = ((cc + this.lib_class_name) + ".");
                String _prime = ((Helper)expv2).getPrime();
                boolean _notEquals_15 = (!Objects.equal(_prime, null));
                if (_notEquals_15) {
                  ChkVariables _var3_1 = ((Helper)expv2).getVar3();
                  String _chkVars = this.chkVars(_var3_1);
                  String _plus_17 = ((cc + "prime(") + _chkVars);
                  String _plus_18 = (_plus_17 + ");");
                  cc = _plus_18;
                } else {
                  String _random = ((Helper)expv2).getRandom();
                  boolean _notEquals_16 = (!Objects.equal(_random, null));
                  if (_notEquals_16) {
                    ChkVariables _var3_2 = ((Helper)expv2).getVar3();
                    String _chkVars_1 = this.chkVars(_var3_2);
                    String _plus_19 = ((cc + "random(") + _chkVars_1);
                    String _plus_20 = (_plus_19 + ",");
                    ChkVariables _var4 = ((Helper)expv2).getVar4();
                    String _chkVars_2 = this.chkVars(_var4);
                    String _plus_21 = (_plus_20 + _chkVars_2);
                    String _plus_22 = (_plus_21 + ")");
                    cc = _plus_22;
                  } else {
                    String _size_1 = ((Helper)expv2).getSize();
                    boolean _notEquals_17 = (!Objects.equal(_size_1, null));
                    if (_notEquals_17) {
                      ChkVariable _var_7 = ((Helper)expv2).getVar();
                      String _chkVar_7 = this.chkVar(_var_7);
                      String _plus_23 = ((cc + "size(") + _chkVar_7);
                      String _plus_24 = (_plus_23 + ")");
                      cc = _plus_24;
                    } else {
                      String _swap = ((Helper)expv2).getSwap();
                      boolean _notEquals_18 = (!Objects.equal(_swap, null));
                      if (_notEquals_18) {
                        ChkVariable _var_8 = ((Helper)expv2).getVar();
                        String _chkVar_8 = this.chkVar(_var_8);
                        String _plus_25 = ((cc + "swap(") + _chkVar_8);
                        String _plus_26 = (_plus_25 + ",");
                        String _var1 = ((Helper)expv2).getVar1();
                        String _plus_27 = (_plus_26 + _var1);
                        String _plus_28 = (_plus_27 + ",");
                        String _var2 = ((Helper)expv2).getVar2();
                        String _plus_29 = (_plus_28 + _var2);
                        String _plus_30 = (_plus_29 + ")");
                        cc = _plus_30;
                      } else {
                        String _add = ((Helper)expv2).getAdd();
                        boolean _notEquals_19 = (!Objects.equal(_add, null));
                        if (_notEquals_19) {
                          ChkVariable _var_9 = ((Helper)expv2).getVar();
                          String _chkVar_9 = this.chkVar(_var_9);
                          String _plus_31 = ((cc + "add(") + _chkVar_9);
                          String _plus_32 = (_plus_31 + ",");
                          ChkVariables _var3_3 = ((Helper)expv2).getVar3();
                          String _chkVars_3 = this.chkVars(_var3_3);
                          String _plus_33 = (_plus_32 + _chkVars_3);
                          String _plus_34 = (_plus_33 + ")");
                          cc = _plus_34;
                        } else {
                          String _remove_2 = ((Helper)expv2).getRemove();
                          boolean _notEquals_20 = (!Objects.equal(_remove_2, null));
                          if (_notEquals_20) {
                            ChkVariable _var_10 = ((Helper)expv2).getVar();
                            String _chkVar_10 = this.chkVar(_var_10);
                            String _plus_35 = ((cc + "remove(") + _chkVar_10);
                            String _plus_36 = (_plus_35 + ",");
                            ChkVariables _var3_4 = ((Helper)expv2).getVar3();
                            String _chkVars_4 = this.chkVars(_var3_4);
                            String _plus_37 = (_plus_36 + _chkVars_4);
                            String _plus_38 = (_plus_37 + ")");
                            cc = _plus_38;
                          } else {
                            String _plus_39 = ((Helper)expv2).getPlus();
                            boolean _notEquals_21 = (!Objects.equal(_plus_39, null));
                            if (_notEquals_21) {
                              ChkVariable _var_11 = ((Helper)expv2).getVar();
                              String _chkVar_11 = this.chkVar(_var_11);
                              String _plus_40 = ((cc + "plus(") + _chkVar_11);
                              String _plus_41 = (_plus_40 + ",");
                              ChkVariables _var3_5 = ((Helper)expv2).getVar3();
                              String _chkVars_5 = this.chkVars(_var3_5);
                              String _plus_42 = (_plus_41 + _chkVars_5);
                              String _plus_43 = (_plus_42 + ")");
                              cc = _plus_43;
                            } else {
                              String _multiply = ((Helper)expv2).getMultiply();
                              boolean _notEquals_22 = (!Objects.equal(_multiply, null));
                              if (_notEquals_22) {
                                ChkVariable _var_12 = ((Helper)expv2).getVar();
                                String _chkVar_12 = this.chkVar(_var_12);
                                String _plus_44 = ((cc + "multiply(") + _chkVar_12);
                                String _plus_45 = (_plus_44 + ",");
                                ChkVariables _var3_6 = ((Helper)expv2).getVar3();
                                String _chkVars_6 = this.chkVars(_var3_6);
                                String _plus_46 = (_plus_45 + _chkVars_6);
                                String _plus_47 = (_plus_46 + ")");
                                cc = _plus_47;
                              } else {
                                String _swapCol = ((Helper)expv2).getSwapCol();
                                boolean _notEquals_23 = (!Objects.equal(_swapCol, null));
                                if (_notEquals_23) {
                                  ChkVariable _var_13 = ((Helper)expv2).getVar();
                                  String _chkVar_13 = this.chkVar(_var_13);
                                  String _plus_48 = ((cc + "swapColumn(") + _chkVar_13);
                                  String _plus_49 = (_plus_48 + ",");
                                  String _var1_1 = ((Helper)expv2).getVar1();
                                  String _plus_50 = (_plus_49 + _var1_1);
                                  String _plus_51 = (_plus_50 + ",");
                                  String _var2_1 = ((Helper)expv2).getVar2();
                                  String _plus_52 = (_plus_51 + _var2_1);
                                  String _plus_53 = (_plus_52 + ")");
                                  cc = _plus_53;
                                } else {
                                  String _addRow = ((Helper)expv2).getAddRow();
                                  boolean _notEquals_24 = (!Objects.equal(_addRow, null));
                                  if (_notEquals_24) {
                                    ChkVariable _var_14 = ((Helper)expv2).getVar();
                                    String _chkVar_14 = this.chkVar(_var_14);
                                    String _plus_54 = ((cc + "addRow(") + _chkVar_14);
                                    String _plus_55 = (_plus_54 + ")");
                                    cc = _plus_55;
                                  } else {
                                    String _addCol = ((Helper)expv2).getAddCol();
                                    boolean _notEquals_25 = (!Objects.equal(_addCol, null));
                                    if (_notEquals_25) {
                                      ChkVariable _var_15 = ((Helper)expv2).getVar();
                                      String _chkVar_15 = this.chkVar(_var_15);
                                      String _plus_56 = ((cc + "addColumn(") + _chkVar_15);
                                      String _plus_57 = (_plus_56 + ")");
                                      cc = _plus_57;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                cc = (cc + rg);
              }
            }
          }
        }
      }
    }
    String _op = element.getOp();
    boolean _notEquals = (!Objects.equal(_op, null));
    if (_notEquals) {
      String _op_1 = element.getOp();
      String _plus = (cc + _op_1);
      cc = _plus;
      ChkVariable _v = element.getV();
      String _chkVar = this.chkVar(_v);
      String _plus_1 = (cc + _chkVar);
      String _plus_2 = (_plus_1 + ")) ok = false;\n");
      cc = _plus_2;
    } else {
      cc = (cc + ";\n");
    }
    InputOutput.<String>println(("check " + cc));
    return cc;
  }
  
  public String checkLoopExp(final ChkLoopExpression element) {
    ChkVariable _index = element.getIndex();
    String v = this.chkVar(_index);
    ChkVariables _maxIndex = element.getMaxIndex();
    String m = this.chkVars(_maxIndex);
    String cc = (((((((("for (int " + v) + "=0; ") + v) + "<") + m) + "; ") + v) + "++){\n");
    EList<ChkExpression> _ex = element.getEx();
    for (final ChkExpression chkex : _ex) {
      String _checkExp = this.checkExp(chkex);
      String _plus = (cc + _checkExp);
      cc = _plus;
    }
    cc = (cc + "}\n");
    return cc;
  }
  
  public String validateBody(final Limit element) {
    String cc = "";
    int idx = 0;
    Subtask _sub = element.getSub();
    boolean _notEquals = (!Objects.equal(_sub, null));
    if (_notEquals) {
      Subtask _sub_1 = element.getSub();
      int _num = _sub_1.getNum();
      String _plus = ("case " + Integer.valueOf(_num));
      String _plus_1 = (_plus + " :\n");
      cc = _plus_1;
    } else {
      cc = "default :\n";
    }
    cc = (cc + "if (");
    EList<String> _a = element.getA();
    for (final String i : _a) {
      {
        if ((idx > 0)) {
          cc = (cc + " || ");
        }
        EList<String> _b = element.getB();
        String _get = _b.get(idx);
        String _plus_2 = ((((cc + "(") + i) + " <= value && value <= ") + _get);
        String _plus_3 = (_plus_2 + ")");
        cc = _plus_3;
        idx = (idx + 1);
      }
    }
    cc = (cc + "){\n");
    cc = (cc + "return true;\n");
    cc = (cc + "} else {\n");
    cc = (cc + "return false;\n");
    cc = (cc + "}\n");
    return cc;
  }
  
  public String inputBody(final FormatExpression element) {
    int i = 0;
    String cc = "";
    String tm = "";
    String _num = element.getNum();
    boolean _equals = _num.equals("1");
    boolean _not = (!_equals);
    if (_not) {
      String _num_1 = element.getNum();
      String _plus = ((cc + "for (int i=0; i<") + _num_1);
      String _plus_1 = (_plus + "; i++){\n");
      cc = _plus_1;
    }
    this.sz = 0;
    cc = ((cc + "sz = ") + Integer.valueOf(this.sz));
    EList<FormatVariable> _var = element.getVar();
    for (final FormatVariable v : _var) {
      String _count = v.getCount();
      boolean _notEquals = (!Objects.equal(_count, null));
      if (_notEquals) {
        String _count_1 = v.getCount();
        String _plus_2 = ((cc + "+") + _count_1);
        cc = _plus_2;
      } else {
        cc = (cc + "+1");
      }
    }
    cc = (cc + ";\n");
    cc = (cc + "if ((line = reader.readLine()) != null){\n");
    cc = (cc + "line = line.trim();\n");
    cc = (cc + "line = line.replaceAll(\"\\\\s+\", \" \");\n");
    cc = (cc + "tokens = line.split(\" \");\n");
    cc = (cc + "if (tokens.length == sz){\n");
    EList<FormatVariable> _var_1 = element.getVar();
    for (final FormatVariable v_1 : _var_1) {
      {
        String _count_2 = v_1.getCount();
        boolean _equals_1 = Objects.equal(_count_2, null);
        if (_equals_1) {
          ChkVariable _fv = v_1.getFv();
          String _chkVar = this.chkVar(_fv);
          String _firstUpper = StringExtensions.toFirstUpper(_chkVar);
          String _plus_3 = ("read" + _firstUpper);
          String _plus_4 = (_plus_3 + "(tokens[");
          String _plus_5 = (_plus_4 + Integer.valueOf(i));
          final String temp = (_plus_5 + "]);\n");
          cc = (cc + temp);
        } else {
          ChkVariable _fv_1 = v_1.getFv();
          EList<String> _v = _fv_1.getV();
          int _size = _v.size();
          boolean _equals_2 = (_size == 0);
          if (_equals_2) {
            ChkVariable _fv_2 = v_1.getFv();
            String _chkVar_1 = this.chkVar(_fv_2);
            String _firstUpper_1 = StringExtensions.toFirstUpper(_chkVar_1);
            String _plus_6 = ((tm + "read") + _firstUpper_1);
            String _plus_7 = (_plus_6 + "(tokens);\n");
            tm = _plus_7;
          } else {
            ChkVariable _fv_3 = v_1.getFv();
            String _chkVar2 = this.chkVar2(_fv_3);
            String _firstUpper_2 = StringExtensions.toFirstUpper(_chkVar2);
            String _plus_8 = ((tm + "read") + _firstUpper_2);
            String _plus_9 = (_plus_8 + "(tokens,");
            ChkVariable _fv_4 = v_1.getFv();
            EList<String> _v_1 = _fv_4.getV();
            String _get = _v_1.get(0);
            String _plus_10 = (_plus_9 + _get);
            String _plus_11 = (_plus_10 + ");\n");
            tm = _plus_11;
          }
          cc = (cc + tm);
        }
        i = (i + 1);
      }
    }
    cc = (cc + "} else {\n");
    cc = ((cc + this.class_name) + ".die(\"number of elements in lines not match\");\n");
    cc = (cc + "}\n");
    cc = (cc + "} else {\n");
    cc = ((cc + this.class_name) + ".die(\"number of lines not match\");\n");
    cc = (cc + "}\n");
    String _num_2 = element.getNum();
    boolean _equals_1 = _num_2.equals("1");
    boolean _not_1 = (!_equals_1);
    if (_not_1) {
      cc = (cc + "}\n");
    }
    return cc;
  }
  
  public String outputBody(final FormatExpression element) {
    int i = 0;
    String cc = "";
    String _num = element.getNum();
    boolean _equals = _num.equals("1");
    boolean _not = (!_equals);
    if (_not) {
      String _num_1 = element.getNum();
      String _plus = ((cc + "for (int i=0; i<") + _num_1);
      String _plus_1 = (_plus + "; i++){\n");
      cc = _plus_1;
    }
    EList<FormatVariable> _var = element.getVar();
    for (final FormatVariable e : _var) {
      {
        if ((i > 0)) {
          cc = (cc + "writer.write(\" \");\n");
        }
        ChkVariable _fv = e.getFv();
        EList<String> _v = _fv.getV();
        int _size = _v.size();
        boolean _equals_1 = (_size == 0);
        if (_equals_1) {
          ChkVariable _fv_1 = e.getFv();
          String _chkVar = this.chkVar(_fv_1);
          String _firstUpper = StringExtensions.toFirstUpper(_chkVar);
          String _plus_2 = ((cc + "write") + _firstUpper);
          String _plus_3 = (_plus_2 + "_2();\n");
          cc = _plus_3;
        } else {
          ChkVariable _fv_2 = e.getFv();
          String _chkVar2 = this.chkVar2(_fv_2);
          String _firstUpper_1 = StringExtensions.toFirstUpper(_chkVar2);
          String _plus_4 = ((cc + "write") + _firstUpper_1);
          String _plus_5 = (_plus_4 + "_2(");
          ChkVariable _fv_3 = e.getFv();
          EList<String> _v_1 = _fv_3.getV();
          String _get = _v_1.get(0);
          String _plus_6 = (_plus_5 + _get);
          String _plus_7 = (_plus_6 + ");\n");
          cc = _plus_7;
        }
        i = (i + 1);
      }
    }
    EList<FormatVariable> _var_1 = element.getVar();
    EList<FormatVariable> _var_2 = element.getVar();
    int _size = _var_2.size();
    int _minus = (_size - 1);
    FormatVariable _get = _var_1.get(_minus);
    String _count = _get.getCount();
    boolean _equals_1 = Objects.equal(_count, null);
    if (_equals_1) {
      cc = (cc + "writer.write(System.lineSeparator());\n");
    }
    String _num_2 = element.getNum();
    boolean _equals_2 = _num_2.equals("1");
    boolean _not_1 = (!_equals_2);
    if (_not_1) {
      cc = (cc + "}\n");
    }
    return cc;
  }
  
  public String chkType(final ChkVariableDeclaration element) {
    return element.getType();
  }
  
  public String generateOutputCheckerMT() {
    String aa = "";
    aa = "try {\n";
    aa = (aa + "File wfile = new File(\"OutputCheckerMT.java\");\n");
    aa = (aa + "if(!wfile.exists()) wfile.createNewFile();\n");
    aa = (aa + "fw = new FileWriter(wfile);\n");
    aa = (aa + "writer = new BufferedWriter(fw);\n");
    String bb = "";
    bb = (bb + "writer.close();\n");
    bb = (bb + "} catch(Exception e){}\n");
    String cc = "";
    cc = (cc + "writer.write(\"import java.io.*;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"import java.util.*;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"public class OutputCheckerMT {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tprivate static GeneratedClass g;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tprivate static String exeFile;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tpublic static void pipeStream(InputStream input, OutputStream output) throws IOException {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tbyte buffer[] = new byte[1024];\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint numRead = 0;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tdo {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tnumRead = input.read(buffer);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\toutput.write(buffer, 0, numRead);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t} while (input.available() > 0);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\toutput.flush();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tpublic static void execute(String inF, String outF){\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\ttry {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tFileInputStream fileIn = new FileInputStream(inF);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tFileOutputStream fileOut = new FileOutputStream(outF);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tOutputStream procIn = null;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tInputStream procOut = null;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tProcess process = null;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tprocess = Runtime.getRuntime().exec(exeFile);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tprocIn = process.getOutputStream();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tprocOut = process.getInputStream();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tpipeStream(fileIn, procIn);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tpipeStream(procOut, fileOut);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tprocess.destroy();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t} catch (Exception e){};\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tpublic static void main(String[] args) {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint subtask = \"+mx_subtask+\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint tc = \"+mx_tc+\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint score = 0;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tboolean ok = true;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tboolean mr_ok = true;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\texeFile = args[0];\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tif (args.length >= 2) subtask = Integer.parseInt(args[1]);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tif (args.length >= 3) tc = Integer.parseInt(args[2]);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tfor (int s=1; s<=subtask; s++){\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tfor (int t=1; t<=tc; t++){\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString inFile = \\\"tc/Subtask\\\"+s+\\\"/in/0/\\\"+t+\\\".in\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString inFile2 = \\\"bufferIn.temp\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString outFile = \\\"bufferOut.temp\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString outFile2 = \\\"bufferOut2.temp\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tg = new GeneratedClass();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\texecute(inFile,outFile);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tg.readInput(inFile);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tg.readOutput(outFile);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tmr_ok = true;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + this.mr_gen);
    cc = (cc + "writer.write(\"\t\t\t\tif (mr_ok) System.out.println(\\\"Correct\\\");\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\telse {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tok = false;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tSystem.out.println(\\\"Wrong Answer\\\");\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\ttry {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tInputStream fisOut = new FileInputStream(\\\"tc/\\\"+s+\\\".score\\\");\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tBufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString line = brOut.readLine();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tif (ok) score += Integer.parseInt(line);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tbrOut.close();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t} catch (Exception e){}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tSystem.out.println(\\\"Score : \\\"+score);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    return ((aa + cc) + bb);
  }
  
  public String generateOutputChecker() {
    String aa = "";
    aa = "try {\n";
    aa = (aa + "File wfile = new File(\"OutputChecker.java\");\n");
    aa = (aa + "if(!wfile.exists()) wfile.createNewFile();\n");
    aa = (aa + "fw = new FileWriter(wfile);\n");
    aa = (aa + "writer = new BufferedWriter(fw);\n");
    String bb = "";
    bb = (bb + "writer.close();\n");
    bb = (bb + "} catch(Exception e){}\n");
    String cc = "";
    cc = (cc + "writer.write(\"import java.io.*;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"import java.util.*;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"public class OutputChecker {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tprivate static GeneratedClass g;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tpublic static void pipeStream(InputStream input, OutputStream output) throws IOException\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t{\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tbyte buffer[] = new byte[1024];\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint numRead = 0;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tdo\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t{\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tnumRead = input.read(buffer);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\toutput.write(buffer, 0, numRead);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t} while (input.available() > 0);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\toutput.flush();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\tpublic static void main(String[] args) {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint subtask = \"+mx_subtask+\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint tc = \"+mx_tc+\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tint score = 0;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tboolean ok = true;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tif (args.length >= 2) subtask = Integer.parseInt(args[1]);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tif (args.length >= 3) tc = Integer.parseInt(args[2]);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tfor (int s=1; s<=subtask; s++){\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\tfor (int t=1; t<=tc; t++){\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString inFile = \\\"tc/Subtask\\\"+s+\\\"/in/0/\\\"+t+\\\".in\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString outFile = \\\"bufferOut.temp\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString ansFile = \\\"tc/Subtask\\\"+s+\\\"/out/0/\\\"+t+\\\".out\\\";\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tg = new GeneratedClass();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\ttry {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tFileInputStream fileIn = new FileInputStream(inFile);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tFileOutputStream fileOut = new FileOutputStream(outFile);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tOutputStream procIn = null;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tInputStream procOut = null;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tProcess process = null;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tprocess = Runtime.getRuntime().exec(args[0]);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tprocIn = process.getOutputStream();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tprocOut = process.getInputStream();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tpipeStream(fileIn, procIn);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tpipeStream(procOut, fileOut);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tprocess.destroy();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t} catch (Exception e){};\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tif (g.output_check(inFile,outFile,ansFile)) System.out.println(\\\"Correct\\\");\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\telse {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tok = false;\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t\tSystem.out.println(\\\"Wrong Answer\\\");\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\ttry {\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tInputStream fisOut = new FileInputStream(\\\"tc/\\\"+s+\\\".score\\\");\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tBufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tString line = brOut.readLine();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tif (ok) score += Integer.parseInt(line);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t\tbrOut.close();\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t\t} catch (Exception e){}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t\tSystem.out.println(\\\"Score : \\\"+score);\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\t}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    cc = (cc + "writer.write(\"}\");\n");
    cc = (cc + "writer.write(System.lineSeparator());\n");
    return ((aa + cc) + bb);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (element instanceof org.xtext.example.checkerdsl.checkerDsl.Class) {
      _infer((org.xtext.example.checkerdsl.checkerDsl.Class)element, acceptor, isPrelinkingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPrelinkingPhase).toString());
    }
  }
}
