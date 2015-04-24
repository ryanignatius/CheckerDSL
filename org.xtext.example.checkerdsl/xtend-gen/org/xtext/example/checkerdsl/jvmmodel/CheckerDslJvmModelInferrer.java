package org.xtext.example.checkerdsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
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
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkScoreExpression;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration;
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables;
import org.xtext.example.checkerdsl.checkerDsl.Feature;
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression;
import org.xtext.example.checkerdsl.checkerDsl.Helper;
import org.xtext.example.checkerdsl.checkerDsl.InputFormat;
import org.xtext.example.checkerdsl.checkerDsl.Limit;
import org.xtext.example.checkerdsl.checkerDsl.MR;
import org.xtext.example.checkerdsl.checkerDsl.Method;
import org.xtext.example.checkerdsl.checkerDsl.MethodCall;
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat;
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
  
  private String copy_var = "";
  
  private int sz;
  
  private String class_name = "GeneratedClass";
  
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
        JvmTypeReference _typeRef_1 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        JvmField _field_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "current_subtask", _typeRef_1);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _typeRef_2 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setStatic(true);
          }
        };
        JvmField _field_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "cur_lines", _typeRef_2, _function);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _typeRef_3 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
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
                _builder.append("System.exit(0);");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "die", _typeRef_3, _function_1);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method);
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _typeRef_4 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "intReader", _typeRef_4, _function_2);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_1);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeRef_5 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_2 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "longReader", _typeRef_5, _function_3);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_2);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeRef_6 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(float.class);
        final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_3 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "floatReader", _typeRef_6, _function_4);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _method_3);
        EList<JvmMember> _members_7 = it.getMembers();
        JvmTypeReference _typeRef_7 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(double.class);
        final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_4 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "doubleReader", _typeRef_7, _function_5);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _method_4);
        EList<JvmMember> _members_8 = it.getMembers();
        JvmTypeReference _typeRef_8 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
        final Procedure1<JvmOperation> _function_6 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_5 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "booleanReader", _typeRef_8, _function_6);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_8, _method_5);
        EList<JvmMember> _members_9 = it.getMembers();
        JvmTypeReference _typeRef_9 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(char.class);
        final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_6 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "charReader", _typeRef_9, _function_7);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_9, _method_6);
        EList<JvmMember> _members_10 = it.getMembers();
        JvmTypeReference _typeRef_10 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
        final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_7 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "stringReader", _typeRef_10, _function_8);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_10, _method_7);
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
                JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                t2 = _typeRef_11;
              } else {
                String _type_1 = ((ChkVariableDeclaration)feature).getType();
                boolean _equals_1 = Objects.equal(_type_1, "long");
                if (_equals_1) {
                  JvmTypeReference _typeRef_12 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
                  t2 = _typeRef_12;
                } else {
                  String _type_2 = ((ChkVariableDeclaration)feature).getType();
                  boolean _equals_2 = Objects.equal(_type_2, "float");
                  if (_equals_2) {
                    JvmTypeReference _typeRef_13 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(float.class);
                    t2 = _typeRef_13;
                  } else {
                    String _type_3 = ((ChkVariableDeclaration)feature).getType();
                    boolean _equals_3 = Objects.equal(_type_3, "double");
                    if (_equals_3) {
                      JvmTypeReference _typeRef_14 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(double.class);
                      t2 = _typeRef_14;
                    } else {
                      String _type_4 = ((ChkVariableDeclaration)feature).getType();
                      boolean _equals_4 = Objects.equal(_type_4, "boolean");
                      if (_equals_4) {
                        JvmTypeReference _typeRef_15 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
                        t2 = _typeRef_15;
                      } else {
                        String _type_5 = ((ChkVariableDeclaration)feature).getType();
                        boolean _equals_5 = Objects.equal(_type_5, "char");
                        if (_equals_5) {
                          JvmTypeReference _typeRef_16 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(char.class);
                          t2 = _typeRef_16;
                        } else {
                          String _type_6 = ((ChkVariableDeclaration)feature).getType();
                          boolean _equals_6 = Objects.equal(_type_6, "string");
                          if (_equals_6) {
                            JvmTypeReference _typeRef_17 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                            t2 = _typeRef_17;
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
                EList<JvmMember> _members_11 = it.getMembers();
                String _name = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                String _plus = ("validate" + _firstUpper);
                JvmTypeReference _typeRef_18 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
                final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
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
                JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus, _typeRef_18, _function_9);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
              } else {
                CheckerDslJvmModelInferrer.this.tp = t2;
                EList<JvmMember> _members_12 = it.getMembers();
                String _name_1 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
                String _plus_1 = ("validate" + _firstUpper_1);
                JvmTypeReference _typeRef_19 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
                final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
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
                JvmOperation _method_9 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_1, _typeRef_19, _function_10);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_12, _method_9);
              }
              EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
              int _size = _sz.size();
              boolean _notEquals_2 = (_size != 0);
              if (_notEquals_2) {
                JvmTypeReference _typeRef_20 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                t = _typeRef_20;
                EList<JvmMember> _members_13 = it.getMembers();
                String _name_2 = ((ChkVariableDeclaration)feature).getName();
                JvmField _field_3 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _name_2, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_13, _field_3);
                EList<JvmMember> _members_14 = it.getMembers();
                String _name_3 = ((ChkVariableDeclaration)feature).getName();
                String _plus_2 = (_name_3 + "_2");
                JvmField _field_4 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _plus_2, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_14, _field_4);
                String _name_4 = ((ChkVariableDeclaration)feature).getName();
                String _plus_3 = (CheckerDslJvmModelInferrer.this.copy_var + _name_4);
                String _plus_4 = (_plus_3 + "_2 = new ArrayList(");
                String _name_5 = ((ChkVariableDeclaration)feature).getName();
                String _plus_5 = (_plus_4 + _name_5);
                String _plus_6 = (_plus_5 + ");\n");
                CheckerDslJvmModelInferrer.this.copy_var = _plus_6;
                EList<JvmMember> _members_15 = it.getMembers();
                String _name_6 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _getter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toGetter(feature, _name_6, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_15, _getter);
                EList<JvmMember> _members_16 = it.getMembers();
                String _name_7 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _setter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toSetter(feature, _name_7, t);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_16, _setter);
                EList<String> _sz_1 = ((ChkVariableDeclaration)feature).getSz();
                int _size_1 = _sz_1.size();
                boolean _equals_7 = (_size_1 == 1);
                if (_equals_7) {
                  EList<JvmMember> _members_17 = it.getMembers();
                  String _name_8 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
                  String _plus_7 = ("read" + _firstUpper_2);
                  JvmTypeReference _typeRef_21 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_11 = new Procedure1<JvmOperation>() {
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
                  JvmOperation _method_10 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_7, _typeRef_21, _function_11);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_17, _method_10);
                  EList<JvmMember> _members_18 = it.getMembers();
                  String _name_9 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_3 = StringExtensions.toFirstUpper(_name_9);
                  String _plus_8 = ("read" + _firstUpper_3);
                  JvmTypeReference _typeRef_22 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
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
                  JvmOperation _method_11 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_8, _typeRef_22, _function_12);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_18, _method_11);
                  EList<JvmMember> _members_19 = it.getMembers();
                  String _name_10 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_4 = StringExtensions.toFirstUpper(_name_10);
                  String _plus_9 = ("write" + _firstUpper_4);
                  JvmTypeReference _typeRef_23 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("for (int i=0; i<");
                          EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                          String _get = _sz.get(0);
                          _builder.append(_get, "");
                          _builder.append("; i++){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("if (i > 0) System.out.print(\" \");");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("System.out.print(");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "\t");
                          _builder.append(".get(i));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("System.out.println();");
                          _builder.newLine();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_12 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_9, _typeRef_23, _function_13);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_19, _method_12);
                  EList<JvmMember> _members_20 = it.getMembers();
                  String _name_11 = ((ChkVariableDeclaration)feature).getName();
                  String _firstUpper_5 = StringExtensions.toFirstUpper(_name_11);
                  String _plus_10 = ("write" + _firstUpper_5);
                  JvmTypeReference _typeRef_24 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
                      JvmFormalParameter _parameter = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(feature, "idx", _typeRef);
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("System.out.print(");
                          String _name = ((ChkVariableDeclaration)feature).getName();
                          _builder.append(_name, "");
                          _builder.append(".get(idx));");
                          _builder.newLineIfNotEmpty();
                        }
                      };
                      CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_13 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_10, _typeRef_24, _function_14);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_20, _method_13);
                } else {
                  EList<String> _sz_2 = ((ChkVariableDeclaration)feature).getSz();
                  int _size_2 = _sz_2.size();
                  boolean _equals_8 = (_size_2 == 2);
                  if (_equals_8) {
                    EList<JvmMember> _members_21 = it.getMembers();
                    String _name_12 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_12);
                    String _plus_11 = ("read" + _firstUpper_6);
                    JvmTypeReference _typeRef_25 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
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
                            _builder.append("ArrayList temp = new ArrayList();");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("for (int j=0; j<");
                            EList<String> _sz_1 = ((ChkVariableDeclaration)feature).getSz();
                            String _get_1 = _sz_1.get(1);
                            _builder.append(_get_1, "\t");
                            _builder.append("; j++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("temp.add(");
                            String _type = ((ChkVariableDeclaration)feature).getType();
                            _builder.append(_type, "\t\t");
                            _builder.append("Reader());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("if (!validate");
                            String _name_1 = ((ChkVariableDeclaration)feature).getName();
                            String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                            _builder.append(_firstUpper, "\t\t");
                            _builder.append("((int)temp.get(j),current_subtask)){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append(CheckerDslJvmModelInferrer.this.class_name, "\t\t\t");
                            _builder.append(".die(\"value not in valid range\");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t");
                            String _name_2 = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name_2, "\t");
                            _builder.append(".add(temp);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_14 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_11, _typeRef_25, _function_15);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_21, _method_14);
                    EList<JvmMember> _members_22 = it.getMembers();
                    String _name_13 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_13);
                    String _plus_12 = ("read" + _firstUpper_7);
                    JvmTypeReference _typeRef_26 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_16 = new Procedure1<JvmOperation>() {
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
                            _builder.append("ArrayList atemp = (ArrayList) ");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".get(idx1);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("atemp.set(idx2,");
                            String _type = ((ChkVariableDeclaration)feature).getType();
                            _builder.append(_type, "");
                            _builder.append("Reader());");
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
                    JvmOperation _method_15 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_12, _typeRef_26, _function_16);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_22, _method_15);
                    EList<JvmMember> _members_23 = it.getMembers();
                    String _name_14 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_8 = StringExtensions.toFirstUpper(_name_14);
                    String _plus_13 = ("write" + _firstUpper_8);
                    JvmTypeReference _typeRef_27 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_17 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        StringConcatenationClient _client = new StringConcatenationClient() {
                          @Override
                          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                            _builder.append("for (int i=0; i<");
                            EList<String> _sz = ((ChkVariableDeclaration)feature).getSz();
                            String _get = _sz.get(0);
                            _builder.append(_get, "");
                            _builder.append("; i++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("for (int j=0; j<");
                            EList<String> _sz_1 = ((ChkVariableDeclaration)feature).getSz();
                            String _get_1 = _sz_1.get(1);
                            _builder.append(_get_1, "\t");
                            _builder.append("; j++){");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("if (j > 0) System.out.print(\" \");");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("System.out.print(((ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "\t\t");
                            _builder.append(".get(i)).get(j));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("System.out.println();");
                            _builder.newLine();
                            _builder.append("}");
                            _builder.newLine();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_16 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_13, _typeRef_27, _function_17);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_23, _method_16);
                    EList<JvmMember> _members_24 = it.getMembers();
                    String _name_15 = ((ChkVariableDeclaration)feature).getName();
                    String _firstUpper_9 = StringExtensions.toFirstUpper(_name_15);
                    String _plus_14 = ("write" + _firstUpper_9);
                    JvmTypeReference _typeRef_28 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                    final Procedure1<JvmOperation> _function_18 = new Procedure1<JvmOperation>() {
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
                            _builder.append("System.out.print(((ArrayList)");
                            String _name = ((ChkVariableDeclaration)feature).getName();
                            _builder.append(_name, "");
                            _builder.append(".get(idx1)).get(idx2));");
                            _builder.newLineIfNotEmpty();
                          }
                        };
                        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                      }
                    };
                    JvmOperation _method_17 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_14, _typeRef_28, _function_18);
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_24, _method_17);
                  }
                }
              } else {
                EList<JvmMember> _members_25 = it.getMembers();
                String _name_16 = ((ChkVariableDeclaration)feature).getName();
                JvmField _field_5 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _name_16, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_25, _field_5);
                EList<JvmMember> _members_26 = it.getMembers();
                String _name_17 = ((ChkVariableDeclaration)feature).getName();
                String _plus_15 = (_name_17 + "_2");
                JvmField _field_6 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toField(feature, _plus_15, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_26, _field_6);
                String _name_18 = ((ChkVariableDeclaration)feature).getName();
                String _plus_16 = (CheckerDslJvmModelInferrer.this.copy_var + _name_18);
                String _plus_17 = (_plus_16 + "_2 = ");
                String _name_19 = ((ChkVariableDeclaration)feature).getName();
                String _plus_18 = (_plus_17 + _name_19);
                String _plus_19 = (_plus_18 + ";\n");
                CheckerDslJvmModelInferrer.this.copy_var = _plus_19;
                EList<JvmMember> _members_27 = it.getMembers();
                String _name_20 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _getter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toGetter(feature, _name_20, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _getter_1);
                EList<JvmMember> _members_28 = it.getMembers();
                String _name_21 = ((ChkVariableDeclaration)feature).getName();
                JvmOperation _setter_1 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toSetter(feature, _name_21, t2);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _setter_1);
                EList<JvmMember> _members_29 = it.getMembers();
                String _name_22 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_10 = StringExtensions.toFirstUpper(_name_22);
                String _plus_20 = ("read" + _firstUpper_10);
                JvmTypeReference _typeRef_29 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                final Procedure1<JvmOperation> _function_19 = new Procedure1<JvmOperation>() {
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
                JvmOperation _method_18 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_20, _typeRef_29, _function_19);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_29, _method_18);
                EList<JvmMember> _members_30 = it.getMembers();
                String _name_23 = ((ChkVariableDeclaration)feature).getName();
                String _firstUpper_11 = StringExtensions.toFirstUpper(_name_23);
                String _plus_21 = ("write" + _firstUpper_11);
                JvmTypeReference _typeRef_30 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                final Procedure1<JvmOperation> _function_20 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        _builder.append("System.out.print(");
                        String _name = ((ChkVariableDeclaration)feature).getName();
                        _builder.append(_name, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    };
                    CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_19 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _plus_21, _typeRef_30, _function_20);
                CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_30, _method_19);
              }
            }
          }
          if (!_matched) {
            if (feature instanceof Method) {
              _matched=true;
              EList<JvmMember> _members_11 = it.getMembers();
              String _name = ((Method)feature).getName();
              JvmTypeReference _type = ((Method)feature).getType();
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
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
              JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, _name, _type, _function_9);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
            }
          }
          if (!_matched) {
            if (feature instanceof InputFormat) {
              _matched=true;
              EList<JvmMember> _members_11 = it.getMembers();
              JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  CheckerDslJvmModelInferrer.this.bd2 = "int sz = 0;\n";
                  EList<FormatExpression> _exp = ((InputFormat)feature).getExp();
                  for (final FormatExpression p : _exp) {
                    String _inputBody = CheckerDslJvmModelInferrer.this.inputBody(p);
                    String _concat = CheckerDslJvmModelInferrer.this.bd2.concat(_inputBody);
                    CheckerDslJvmModelInferrer.this.bd2 = _concat;
                  }
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
              JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "readInput", _typeRef_11, _function_9);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
            }
          }
          if (!_matched) {
            if (feature instanceof OutputFormat) {
              _matched=true;
              EList<JvmMember> _members_11 = it.getMembers();
              JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  CheckerDslJvmModelInferrer.this.bd3a = "int sz = 0;\n";
                  EList<FormatExpression> _exp = ((OutputFormat)feature).getExp();
                  for (final FormatExpression p : _exp) {
                    String _inputBody = CheckerDslJvmModelInferrer.this.inputBody(p);
                    String _concat = CheckerDslJvmModelInferrer.this.bd3a.concat(_inputBody);
                    CheckerDslJvmModelInferrer.this.bd3a = _concat;
                  }
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
              JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "readOutput", _typeRef_11, _function_9);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
              EList<JvmMember> _members_12 = it.getMembers();
              JvmTypeReference _typeRef_12 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(feature);
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  CheckerDslJvmModelInferrer.this.bd3 = "";
                  EList<FormatExpression> _exp = ((OutputFormat)feature).getExp();
                  for (final FormatExpression p : _exp) {
                    String _outputBody = CheckerDslJvmModelInferrer.this.outputBody(p);
                    String _concat = CheckerDslJvmModelInferrer.this.bd3.concat(_outputBody);
                    CheckerDslJvmModelInferrer.this.bd3 = _concat;
                  }
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
              JvmOperation _method_9 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(feature, "writeOutput", _typeRef_12, _function_10);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_12, _method_9);
            }
          }
          if (!_matched) {
            if (feature instanceof Check) {
              _matched=true;
              EList<JvmMember> _members_11 = it.getMembers();
              JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      String checkBody = "boolean ok = true;\n";
                      _builder.newLineIfNotEmpty();
                      EList<EObject> _chk = ((Check)feature).getChk();
                      for (final EObject ch : _chk) {
                        boolean _matched = false;
                        if (!_matched) {
                          if (ch instanceof ChkExpression) {
                            _matched=true;
                            String _checkExp = CheckerDslJvmModelInferrer.this.checkExp(((ChkExpression)ch));
                            String _plus = ((checkBody + "if (!(") + _checkExp);
                            String _plus_1 = (_plus + ")) ok = false;\n");
                            checkBody = _plus_1;
                          }
                        }
                        if (!_matched) {
                          if (ch instanceof ChkLoopExpression) {
                            _matched=true;
                          }
                        }
                      }
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
              JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "output_check", _typeRef_11, _function_9);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
            }
          }
          if (!_matched) {
            if (feature instanceof MR) {
              _matched=true;
              EList<JvmMember> _members_11 = it.getMembers();
              int _num = ((MR)feature).getNum();
              String _plus = ("mr_followup_" + Integer.valueOf(_num));
              JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append("initMRVar();");
                      _builder.newLine();
                      _builder.newLine();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, _plus, _typeRef_11, _function_9);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
              EList<JvmMember> _members_12 = it.getMembers();
              int _num_1 = ((MR)feature).getNum();
              String _plus_1 = ("mr_check_" + Integer.valueOf(_num_1));
              JvmTypeReference _typeRef_12 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      _builder.append("initMRVar();");
                      _builder.newLine();
                      _builder.newLine();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_9 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, _plus_1, _typeRef_12, _function_10);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_12, _method_9);
            }
          }
          if (!_matched) {
            if (feature instanceof Score) {
              _matched=true;
              EList<JvmMember> _members_11 = it.getMembers();
              JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  StringConcatenationClient _client = new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                      String scoreBody = "";
                      _builder.newLineIfNotEmpty();
                      EList<ChkScoreExpression> _scores = ((Score)feature).getScores();
                      for (final ChkScoreExpression score : _scores) {
                        String _subtask = score.getSubtask();
                        String _plus = ((scoreBody + "System.out.println(\"Subtask : ") + _subtask);
                        String _plus_1 = (_plus + ", Score : ");
                        String _score = score.getScore();
                        String _plus_2 = (_plus_1 + _score);
                        String _plus_3 = (_plus_2 + "\");\n");
                        scoreBody = _plus_3;
                      }
                      _builder.newLineIfNotEmpty();
                      _builder.append(scoreBody, "");
                      _builder.newLineIfNotEmpty();
                    }
                  };
                  CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                }
              };
              JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "printScore", _typeRef_11, _function_9);
              CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
            }
          }
        }
        EList<JvmMember> _members_11 = it.getMembers();
        JvmTypeReference _typeRef_11 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
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
        JvmOperation _method_8 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "initMRVar", _typeRef_11, _function_9);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _method_8);
        EList<JvmMember> _members_12 = it.getMembers();
        JvmTypeReference _typeRef_12 = CheckerDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("sc = new Scanner(System.in);");
                _builder.newLine();
                _builder.append("current_subtask = 1;");
                _builder.newLine();
                _builder.append(CheckerDslJvmModelInferrer.this.class_name, "");
                _builder.append(".cur_lines = 1;");
                _builder.newLineIfNotEmpty();
                _builder.append("readInput();");
                _builder.newLine();
                _builder.append("readOutput();");
                _builder.newLine();
                _builder.append("writeOutput();");
                _builder.newLine();
              }
            };
            CheckerDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_9 = CheckerDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "init", _typeRef_12, _function_10);
        CheckerDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_12, _method_9);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public String chkVar(final ChkVariable element) {
    String cc = "";
    String _var = element.getVar();
    String _plus = (cc + _var);
    cc = _plus;
    EList<String> _v = element.getV();
    for (final String v : _v) {
      cc = (((cc + "[") + v) + "]");
    }
    InputOutput.<String>println(("var " + cc));
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
  
  public String checkExp(final ChkExpression element) {
    String cc = "";
    String cond = "";
    String _where = element.getWhere();
    boolean _notEquals = (!Objects.equal(_where, null));
    if (_notEquals) {
      EList<ChkRelationalExpression> _cond = element.getCond();
      ChkRelationalExpression _get = _cond.get(0);
      String _relationalExp = this.relationalExp(_get);
      String _plus = ((cond + "(") + _relationalExp);
      cond = _plus;
    } else {
      cond = "true";
    }
    String _asg = element.getAsg();
    boolean _notEquals_1 = (!Objects.equal(_asg, null));
    if (_notEquals_1) {
      String _asg_1 = element.getAsg();
      String _plus_1 = ((cc + "int ") + _asg_1);
      String _plus_2 = (_plus_1 + " = ");
      cc = _plus_2;
    }
    ChkGeneralExpressions exp = element.getExp();
    boolean _matched = false;
    if (!_matched) {
      if (exp instanceof Helper) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (exp instanceof ChkRelationalExpression) {
        _matched=true;
        String _relationalExp_1 = this.relationalExp(((ChkRelationalExpression)exp));
        String _plus_3 = (cc + _relationalExp_1);
        cc = _plus_3;
      }
    }
    if (!_matched) {
      if (exp instanceof MethodCall) {
        _matched=true;
        String _name = ((MethodCall)exp).getName();
        String _plus_3 = (cc + _name);
        String _plus_4 = (_plus_3 + "(");
        cc = _plus_4;
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
      }
    }
    InputOutput.<String>println(("check " + cc));
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
    EList<String> _var = element.getVar();
    int _size = _var.size();
    EList<String> _count = element.getCount();
    int _size_1 = _count.size();
    int _minus = (_size - _size_1);
    this.sz = _minus;
    cc = ("sz = " + Integer.valueOf(this.sz));
    EList<String> _count_1 = element.getCount();
    for (final String e : _count_1) {
      boolean _equals = e.equals("i");
      if (_equals) {
        cc = (cc + "+1");
      } else {
        cc = (cc + ("+" + e));
      }
    }
    cc = (cc + ";\n");
    cc = (cc + "if (sc.hasNextLine()){\n");
    cc = (cc + "String st = sc.nextLine();\n");
    cc = (cc + "st = st.trim();\n");
    cc = (cc + "st = st.replaceAll(\"\\\\s+\", \" \");\n");
    cc = (cc + "String[] tokens = st.split(\" \");\n");
    cc = (cc + "if (tokens.length == sz){\n");
    EList<String> _var_1 = element.getVar();
    for (final String v : _var_1) {
      {
        EList<String> _count_2 = element.getCount();
        int _size_2 = _count_2.size();
        boolean _equals_1 = (_size_2 == 0);
        if (_equals_1) {
          String _firstUpper = StringExtensions.toFirstUpper(v);
          String _plus = ("read" + _firstUpper);
          String _plus_1 = (_plus + "(tokens[");
          String _plus_2 = (_plus_1 + Integer.valueOf(i));
          final String temp = (_plus_2 + "]);\n");
          cc = (cc + temp);
        } else {
          String _firstUpper_1 = StringExtensions.toFirstUpper(v);
          String _plus_3 = ("read" + _firstUpper_1);
          final String temp_1 = (_plus_3 + "(tokens);\n");
          cc = (cc + temp_1);
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
    EList<String> _var = element.getVar();
    for (final String e : _var) {
      {
        if ((i > 0)) {
          cc = (cc + "System.out.println(\" \");\n");
        }
        String _firstUpper = StringExtensions.toFirstUpper(e);
        String _plus_2 = ((cc + "write") + _firstUpper);
        String _plus_3 = (_plus_2 + "();\n");
        cc = _plus_3;
      }
    }
    EList<String> _count = element.getCount();
    int _size = _count.size();
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
      cc = (cc + "System.out.println();\n");
    }
    String _num_2 = element.getNum();
    boolean _equals_2 = _num_2.equals("1");
    boolean _not_1 = (!_equals_2);
    if (_not_1) {
      cc = (cc + "}\n");
    }
    return cc;
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
