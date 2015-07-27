package org.xtext.example.checkerdsl.jvmmodel

import com.google.inject.Inject
import org.xtext.example.checkerdsl.checkerDsl.Class
import org.xtext.example.checkerdsl.checkerDsl.Method
import org.xtext.example.checkerdsl.checkerDsl.ChkVariableDeclaration
import org.xtext.example.checkerdsl.checkerDsl.Limit
import org.xtext.example.checkerdsl.checkerDsl.Subtask
import org.xtext.example.checkerdsl.checkerDsl.Format
import org.xtext.example.checkerdsl.checkerDsl.InputFormat
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat
import org.xtext.example.checkerdsl.checkerDsl.Check
import org.xtext.example.checkerdsl.checkerDsl.ChkVariable
import org.xtext.example.checkerdsl.checkerDsl.ChkVariables
import org.xtext.example.checkerdsl.checkerDsl.FormatVariable
import org.xtext.example.checkerdsl.checkerDsl.MR
import org.xtext.example.checkerdsl.checkerDsl.Score
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression
import org.xtext.example.checkerdsl.checkerDsl.ForFormatExpression
import org.xtext.example.checkerdsl.checkerDsl.ChkOperation
import org.xtext.example.checkerdsl.checkerDsl.ChkExpression
import org.xtext.example.checkerdsl.checkerDsl.ChkLoopExpression
import org.xtext.example.checkerdsl.checkerDsl.Helper
import org.xtext.example.checkerdsl.checkerDsl.ChkRelationalExpression
import org.xtext.example.checkerdsl.checkerDsl.MethodCall
import org.xtext.example.checkerdsl.checkerDsl.ChkAssignment
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.impl.JvmVoidImpl
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import java.util.Scanner
import java.util.ArrayList
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.eclipse.xtext.common.types.impl.JvmFormalParameterImpl

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class CheckerDslJvmModelInferrer extends AbstractModelInferrer {

    /**
   * a builder API to programmatically create Jvm elements 
   * in readable way.
   */
  @Inject extension JvmTypesBuilder
  //@Inject extension BufferedReader
  //@Inject extension File
  //@Inject extension FileReader
  //@Inject extension Scanner
  @Inject extension IQualifiedNameProvider
	
	String bd1;
	String bd2;
	String bd3;
	String bd2a;
	String bd3a;
	String bd2b;
	String bd3b;
	String bd2d;
	String bd2c;
	String mr_list = "";
	String mr_chk = "";
	String mr_gen = "";
	String copy_var = "";
	int sz;
	int num_mr=0;
	int num_subtask=0;
	String class_name = "GeneratedClass"
	String lib_class_name = "LibraryFunction"
	JvmTypeReference tp;
  
  def dispatch void infer(Class element, 
                IJvmDeclaredTypeAcceptor acceptor, 
                boolean isPrelinkingPhase) {
      acceptor.accept(
      element.toClass( class_name )
    ).initializeLater [
      documentation = element.documentation
      if (element.superType != null)
        superTypes += element.superType.cloneWithProxies
      members += element.toField("sc",typeRef(java.util.Scanner))
      members += element.toField("buf",typeRef(java.io.BufferedReader))
      members += element.toField("fr",typeRef(java.io.FileReader))
      members += element.toField("fl",typeRef(java.io.File))
      members += element.toField("fw",typeRef(java.io.FileWriter))
      members += element.toField("writer",typeRef(java.io.BufferedWriter))
      members += element.toField("current_subtask",typeRef(int))
      members += element.toField("current_testcase",typeRef(int))
      members += element.toField("current_mr",typeRef(int))
      members += element.toField("num_mr",typeRef(int))
      members += element.toField("num_tc",typeRef(int))
      members += element.toField("max_tc",typeRef(int))
      members += element.toField("num_subtask",typeRef(int))
      members += element.toField("loop_counter",typeRef(int))
      members += element.toField("max_loop_counter",typeRef(int))
      members += element.toField("is_valid",typeRef(boolean))[
      	static = true
      ]
      members += element.toMethod("getIs_valid",typeRef(boolean))[
      	static = true
      	body = '''
      		return is_valid;
      	'''
      ]
      members += element.toMethod("setIs_valid",typeRef(void))[
      	parameters += element.toParameter("new_valid",typeRef(boolean))
      	static = true
      	body = '''
      		is_valid = new_valid;
      	'''
      ]
      
      members += element.toField("cur_lines",typeRef(int))[
      	static = true
      ]
      members += element.toMethod("die", typeRef(void))[
      	static = true
      	parameters += element.toParameter("message",typeRef(String))
		body = '''
      		System.out.println(message);
      		is_valid = false;
      		//System.exit(0);
		'''
      ]
      
      members += element.toMethod("intReader", typeRef(int)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			int ret = 0;
			try {
				ret = Integer.parseInt(token);
			} catch (Exception e){
				«class_name».die("not int");
			}
			return ret;
		'''
		]
      members += element.toMethod("longReader", typeRef(long)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			long ret = 0;
			try {
				ret = Long.parseLong(token);
			} catch (Exception e){
				«class_name».die("not long");
			}
			return ret;
		'''
		]
	  members += element.toMethod("floatReader", typeRef(float)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			float ret = 0;
			try {
				ret = Float.parseFloat(token);
			} catch (Exception e){
				«class_name».die("not float");
			}
			return ret;
		'''
		]
	  members += element.toMethod("doubleReader", typeRef(double)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			double ret = 0;
			try {
				ret = Double.parseDouble(token);
			} catch (Exception e){
				«class_name».die("not double");
			}
			return ret;
		'''
		]
	  members += element.toMethod("booleanReader", typeRef(boolean)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			boolean ret = false;
			try {
				ret = Boolean.parseBoolean(token);
			} catch (Exception e){
				«class_name».die("not boolean");
			}
			return ret;
		'''
		]
	  members += element.toMethod("charReader", typeRef(char)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			char ret = ' ';
			if (token.length() == 1){
				ret = token.charAt(0);
			} else {
				«class_name».die("not char");
			}
			return ret;
		'''
		]
	  members += element.toMethod("stringReader", typeRef(java.lang.String)) [
		parameters += element.toParameter("token",typeRef(String))
		body = '''
			return token;
		'''
		]
      
      for (feature : element.features) {
        switch feature {
      
          ChkVariableDeclaration : {
          	
          	var t = typeRef(void);
          	var t2 = typeRef(void);
          	if (feature.type == 'int'){
          		t2 = typeRef(int)
          	} else if (feature.type == 'long'){
          		t2 = typeRef(long)
          	} else if (feature.type == 'float'){
          		t2 = typeRef(float)
          	} else if (feature.type == 'double'){
          		t2 = typeRef(double)
          	} else if (feature.type == 'boolean'){
          		t2 = typeRef(boolean)
          	} else if (feature.type == 'char'){
          		t2 = typeRef(char)
          	} else if (feature.type == 'string'){
          		t2 = typeRef(java.lang.String)
          	}
          	if (feature.limit1 != null){
          		tp = t2
          		//for (lim : feature.limit){
		          	members += feature.toMethod("validate"+feature.name.toFirstUpper, typeRef(boolean))[
		      			parameters += element.toParameter("value",tp)
		      			parameters += element.toParameter("subtask",typeRef(int))
		      			body = '''
		      				switch (subtask){
		      				«var validateBody=feature.limit1.validateBody»
		      				«var defaultSwitch = false»
		      				«for (lim : feature.limit){
		      					validateBody = validateBody.concat(lim.validateBody)
		      					if (lim.sub == null) defaultSwitch = true
		      					else {}
		      				}»
		      				«if (feature.limit1.sub != null && defaultSwitch == false){
		      					validateBody = validateBody+"default:\nreturn true;\n"
		      				} else {validateBody}»
		      				}
		        		'''
		     		]
	     		//}
     		} else {
     			tp = t2
	          	members += feature.toMethod("validate"+feature.name.toFirstUpper, typeRef(boolean))[
	      			parameters += element.toParameter("value",tp)
	      			parameters += element.toParameter("subtask",typeRef(int))
	      			body = '''
	        			return true;
	        		'''
	     		]
     		}
          	
          	if (feature.sz.size() != 0){
          		t = typeRef(java.util.ArrayList)
          		
          		members += feature.toField(feature.name, t)
          		members += feature.toField(feature.name+"_2", t)
          		copy_var = copy_var+feature.name+"_2 = new ArrayList("+feature.name+");\n"
	            members += feature.toGetter(feature.name, t)
	            members += feature.toSetter(feature.name, t)
          		
          		if (feature.sz.size() == 1){
	          		members += feature.toMethod("get"+feature.name.toFirstUpper, t2)[
          				parameters += element.toParameter("id1",typeRef(int))
	          			body = '''
	          				«var typeReturn=chkType(feature)»
	          				return («typeReturn»)«feature.name».get(id1);
	          			'''
 	         		]
 	         		
 	         		members += feature.toMethod("set"+feature.name.toFirstUpper, typeRef(void))[
          				parameters += element.toParameter("id1",typeRef(int))
	          			parameters += element.toParameter("val",typeRef(Object))
	          			body = '''
	          				«feature.name».set(id1,val);
	          			'''
 	         		]
 	         		
 	         		members += feature.toMethod("get"+feature.name.toFirstUpper+"_2", t2)[
          				parameters += element.toParameter("id1",typeRef(int))
	          			body = '''
	          				«var typeReturn=chkType(feature)»
	          				return («typeReturn»)«feature.name»_2.get(id1);
	          			'''
 	         		]
 	         		
 	         		members += feature.toMethod("set"+feature.name.toFirstUpper+"_2", typeRef(void))[
          				parameters += element.toParameter("id1",typeRef(int))
	          			parameters += element.toParameter("val",typeRef(Object))
	          			body = '''
	          				«feature.name»_2.set(id1,val);
	          			'''
 	         		]
	          		
	          		members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += element.toParameter("tokens",typeRef(String).addArrayTypeDimension)
	          			body = '''
	          				«feature.name» = new ArrayList();
	          				for (int i=0; i<«feature.sz.get(0)»; i++){
	          					«feature.name».add(«feature.type»Reader(tokens[i]));
	          					if (!validate«feature.name.toFirstUpper»((int)«feature.name».get(i),current_subtask)){
	          						«class_name».die("value not in valid range");
	          					}
	          				}
	          			'''
     	     		]
     	     		members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += element.toParameter("token",typeRef(String))
	          			parameters += feature.toParameter("idx",typeRef(int))
	          			body = '''
	          				«feature.name».set(idx,«feature.type»Reader(token));
	          			'''
     	     		]
     	     		
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			body = '''
	          				try {
	          					for (int i=0; i<«feature.sz.get(0)»; i++){
	          						if (i > 0) writer.write(" ");
	          						writer.write(""+(«chkType(feature)»)«feature.name».get(i));
	          					}
	          					writer.write(System.lineSeparator());
	          				} catch (Exception e){}
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx",typeRef(int))
	          			body = '''
	          				try {
	          					writer.write(""+(«chkType(feature)»)«feature.name».get(idx));
	          				} catch (Exception e){}
	          			'''
     	     		]
     	     		
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			body = '''
		          			try {
		          				for (int i=0; i<«feature.sz.get(0)»_2; i++){
		          					if (i > 0) writer.write(" ");
		          					writer.write(""+(«chkType(feature)»)«feature.name»_2.get(i));
		          				}
		          				writer.write(System.lineSeparator());
		          			} catch (Exception e){}
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			parameters += feature.toParameter("idx",typeRef(int))
	          			body = '''
	          				try {
	          					writer.write(""+(«chkType(feature)»)«feature.name»_2.get(idx));
	          				} catch (Exception e){}
	          			'''
     	     		]
     	     		
     	     		mr_chk = mr_chk+"for (int i=0; i<"+feature.sz.get(0)+"_2; i++){\n"
     	     		mr_chk = mr_chk+"if (("+chkType(feature)+")"+feature.name+"_2.get(i) != ("+chkType(feature)+")ans."+feature.name+".get(i)) return false;\n"
     	     		mr_chk = mr_chk+"}\n"
          		} else if (feature.sz.size() == 2){
          			/*
          			members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			body = '''
	          				«feature.name» = new ArrayList();
	          				for (int i=0; i<«feature.sz.get(0)»; i++){
	          					ArrayList temp = new ArrayList();
	          					for (int j=0; j<«feature.sz.get(1)»; j++){
	          						temp.add(«feature.type»Reader());
	          						if (!validate«feature.name.toFirstUpper»((int)temp.get(j),current_subtask)){
	          							«class_name».die("value not in valid range");
	          						}
	          					}
	          					«feature.name».add(temp);
	          				}
	          			'''
     	     		]
     	     		*/
     	     		members += feature.toMethod("get"+feature.name.toFirstUpper, typeRef(ArrayList))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			body = '''
	          				return (ArrayList)«feature.name».get(idx1);
	          			'''
     	     		]
     	     		members += feature.toMethod("get"+feature.name.toFirstUpper, t2)[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				ArrayList temp = (ArrayList)«feature.name».get(idx1);
	          				return («chkType(feature)»)temp.get(idx2);
	          			'''
     	     		]
     	     		members += feature.toMethod("set"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("val",typeRef(ArrayList))
	          			body = '''
	          				«feature.name».set(idx1,val);
	          			'''
     	     		]
     	     		members += feature.toMethod("set"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			parameters += feature.toParameter("val",typeRef(Object))
	          			body = '''
	          				ArrayList temp = (ArrayList)«feature.name».get(idx1);
	          				temp.set(idx2,(«chkType(feature)»)val);
	          				«feature.name».set(idx1,temp);
	          			'''
     	     		]
     	     		members += feature.toMethod("get"+feature.name.toFirstUpper+"_2", typeRef(ArrayList))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			body = '''
	          				return (ArrayList)«feature.name»_2.get(idx1);
	          			'''
     	     		]
     	     		members += feature.toMethod("get"+feature.name.toFirstUpper+"_2", t2)[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				ArrayList temp = (ArrayList)«feature.name»_2.get(idx1);
	          				return («chkType(feature)»)temp.get(idx2);
	          			'''
     	     		]
     	     		members += feature.toMethod("set"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("val",typeRef(ArrayList))
	          			body = '''
	          				«feature.name»_2.set(idx1,val);
	          			'''
     	     		]
     	     		members += feature.toMethod("set"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			parameters += feature.toParameter("val",typeRef(Object))
	          			body = '''
	          				ArrayList temp = (ArrayList)«feature.name»_2.get(idx1);
	          				temp.set(idx2,(«chkType(feature)»)val);
	          				«feature.name»_2.set(idx1,temp);
	          			'''
     	     		]
     	     		
     	     		members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += element.toParameter("tokens",typeRef(String).addArrayTypeDimension)
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			body = '''
	          				if (idx1 == 0) «feature.name» = new ArrayList();
	          				ArrayList temp = new ArrayList();
	          				for (int i=0; i<«feature.sz.get(1)»; i++){
	          					temp.add(«feature.type»Reader(tokens[i]));
	          					if (!validate«feature.name.toFirstUpper»((int)temp.get(i),current_subtask)){
	          						«class_name».die("value not in valid range");
	          					}
	          				}
	          				«feature.name».add(temp);
	          			'''
     	     		]
     	     		members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += element.toParameter("token",typeRef(String))
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				ArrayList atemp = (ArrayList) «feature.name».get(idx1);
	          				atemp.set(idx2,«feature.type»Reader(token));
	          				«feature.name».set(idx1,atemp);
	          			'''
     	     		]
     	     		
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			body = '''
		          			try {
		          				for (int i=0; i<«feature.sz.get(0)»; i++){
		          					for (int j=0; j<«feature.sz.get(1)»; j++){
		          						if (j > 0) writer.write(" ");
		          						writer.write(""+(«chkType(feature)»)((ArrayList)«feature.name».get(i)).get(j));
		          					}
		          					writer.write(System.lineSeparator());
		          				}
		          			} catch (Exception e){}
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				try {
	          					writer.write(""+(«chkType(feature)»)((ArrayList)«feature.name».get(idx1)).get(idx2));
	          				} catch (Exception e){}
	          			'''
     	     		]
     	     		
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			body = '''
		          			try {
		          				for (int i=0; i<«feature.sz.get(0)»; i++){
		          					for (int j=0; j<«feature.sz.get(1)»; j++){
		          						if (j > 0) writer.write(" ");
		          						writer.write(""+(«chkType(feature)»)((ArrayList)«feature.name»_2.get(i)).get(j));
		          					}
		          					writer.write(System.lineSeparator());
		          				}
		          			} catch (Exception e){}
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			body = '''
		          			try {
		          				ArrayList temp = (ArrayList)«feature.name».get(idx1);
		          				for (int j=0; j<«feature.sz.get(1)»; j++){
		          					if (j > 0) writer.write(" ");
		          					writer.write(""+(«chkType(feature)»)temp.get(j));
		          				}
		          				writer.write(System.lineSeparator());
		          			} catch (Exception e){}
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper+"_2", typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				try {
	          					writer.write(""+(«chkType(feature)»)((ArrayList)«feature.name»_2.get(idx1)).get(idx2));
	          				} catch (Exception e){}
	          			'''
     	     		]
     	     		
     	     		mr_chk = mr_chk+"for (int i=0; i<"+feature.sz.get(0)+"_2; i++){\n"
     	     		mr_chk = mr_chk+"for (int j=0; j<"+feature.sz.get(1)+"_2; j++){\n"
     	     		mr_chk = mr_chk+"if (("+chkType(feature)+")((ArrayList)"+feature.name+"_2.get(i)).get(j) != ("+chkType(feature)+")((ArrayList)ans."+feature.name+".get(i)).get(j)) return false;\n"
     	     		mr_chk = mr_chk+"}\n"
     	     		mr_chk = mr_chk+"}\n"
          		}
      		} else {
      			members += feature.toField(feature.name, t2)
	            members += feature.toField(feature.name+"_2", t2)
          		copy_var = copy_var+feature.name+"_2 = "+feature.name+";\n"
          		members += feature.toGetter(feature.name, t2)
	            members += feature.toSetter(feature.name, t2)
	            members += feature.toGetter(feature.name+"_2", t2)
	            members += feature.toSetter(feature.name+"_2", t2)
	            
	            members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
          			parameters += element.toParameter("token",typeRef(String))
          			body = '''
	        			«feature.name» = «feature.type»Reader(token);
	        			if (!validate«feature.name.toFirstUpper»(«feature.name»,current_subtask)){
	        				«class_name».die("value not in valid range");
	        			}
	        		'''
 	     		]
 	     		
 	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
          			body = '''
	        			try {
	        				writer.write(""+(«chkType(feature)»)«feature.name»);
	        			} catch (Exception e){}
	        		'''
 	     		]
 	     		
 	     		members += feature.toMethod("write"+feature.name.toFirstUpper+"_2", typeRef(void))[
          			body = '''
	        			try {
	        				writer.write(""+(«chkType(feature)»)«feature.name»_2);
	        			} catch (Exception e){}
	        		'''
 	     		]
 	     		
 	     		mr_chk = mr_chk+"if (("+chkType(feature)+")"+feature.name+"_2 != ("+chkType(feature)+")ans."+feature.name+") return false;\n"
      		}
          }
      
          Method : {
            members += feature.toMethod(feature.name, feature.type) [
              documentation = feature.documentation
              for (p : feature.params) {
                parameters += p.toParameter(p.name, p.parameterType)
              }
              body = feature.body
            ]
          }
          
          InputFormat : {
          	members += feature.toMethod("readInput", typeRef(void)) [
          		documentation = feature.documentation
          		parameters += element.toParameter("num",typeRef(int))
	      		bd2 = "int sz = 0;\n"
	      		bd2 = bd2+class_name+".is_valid = true;\n"
	      		bd2 = bd2+"String line;\n"
	      		bd2 = bd2+"String[] tokens;\n"
	      		bd2 = bd2+"try{\n"
	      		bd2 = bd2+"BufferedReader reader = new BufferedReader(new FileReader(new File(\"tc/Subtask\"+current_subtask+\"/in/\"+num+\"/\"+current_testcase+\".in\")));\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd2 = bd2.concat(p.inputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	
	          	bd2 = bd2+"if (reader.readLine() != null){\n"
	          	bd2 = bd2+class_name+".die(\"number of lines not match\");\n"
				bd2 = bd2+"}\n"
	          	bd2 = bd2+"reader.close();\n"
	          	bd2 = bd2+"} catch (Exception e){}\n"
	          	body = '''
		      		«bd2»
	          	'''
          	]
          	
          	members += feature.toMethod("readInput", typeRef(void)) [
          		documentation = feature.documentation
          		parameters += element.toParameter("path",typeRef(java.lang.String))
	      		bd2b = "int sz = 0;\n"
	      		bd2b = bd2b+class_name+".is_valid = true;\n"
	      		bd2b = bd2b+"String line;\n"
	      		bd2b = bd2b+"String[] tokens;\n"
	      		bd2b = bd2b+"try{\n"
	      		bd2b = bd2b+"BufferedReader reader = new BufferedReader(new FileReader(new File(path)));\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd2b = bd2b.concat(p.inputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	
	          	bd2b = bd2b+"if (reader.readLine() != null){\n"
	          	bd2b = bd2b+class_name+".die(\"number of lines not match\");\n"
				bd2b = bd2b+"}\n"
	          	bd2b = bd2b+"reader.close();\n"
	          	bd2b = bd2b+"} catch (Exception e){}\n"
	          	body = '''
		      		«bd2b»
	          	'''
          	]
          	
          	members += feature.toMethod("writeInput", typeRef(void)) [
          		documentation = feature.documentation
	      		parameters += element.toParameter("mr",typeRef(int))
	      		parameters += element.toParameter("tc",typeRef(int))
	      		bd2a = "try {\n"
	      		bd2a = bd2a+"File wfile = new File(\"tc/Subtask\"+current_subtask+\"/in/\"+mr+\"/\"+tc+\".in\");\n"
	      		bd2a = bd2a+"if(!wfile.exists()) wfile.createNewFile();\n"
	      		bd2a = bd2a+"fw = new FileWriter(wfile);\n"
	      		bd2a = bd2a+"writer = new BufferedWriter(fw);\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd2a = bd2a.concat(p.outputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	bd2a = bd2a+"writer.close();\n"
	          	bd2a = bd2a+"} catch(Exception e){}\n"
	          	body = '''
		      		«bd2a»
	          	'''
          	]
          	
          	members += feature.toMethod("writeInput", typeRef(void)) [
          		documentation = feature.documentation
	      		parameters += element.toParameter("path",typeRef(java.lang.String))
	      		bd2d = "try {\n"
	      		bd2d = bd2d+"File wfile = new File(path);\n"
	      		bd2d = bd2d+"if(!wfile.exists()) wfile.createNewFile();\n"
	      		bd2d = bd2d+"fw = new FileWriter(wfile);\n"
	      		bd2d = bd2d+"writer = new BufferedWriter(fw);\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd2d = bd2d.concat(p.outputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	bd2d = bd2d+"writer.close();\n"
	          	bd2d = bd2d+"} catch(Exception e){}\n"
	          	body = '''
		      		«bd2d»
	          	'''
          	]
          }
          
          OutputFormat : {
          	members += feature.toMethod("readOutput", typeRef(void)) [
          		documentation = feature.documentation
	      		parameters += element.toParameter("num",typeRef(int))
	      		bd3a = "int sz = 0;\n"
	      		bd3a = bd3a+"String line;\n"
	      		bd3a = bd3a+"String[] tokens;\n"
	      		bd3a = bd3a+"try{\n"
	      		bd3a = bd3a+"BufferedReader reader = new BufferedReader(new FileReader(new File(\"tc/Subtask\"+current_subtask+\"/out/\"+num+\"/\"+current_testcase+\".out\")));\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd3a = bd3a.concat(p.inputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	bd3a = bd3a+"if (reader.readLine() != null){\n"
	          	bd3a = bd3a+class_name+".die(\"number of lines not match\");\n"
				bd3a = bd3a+"}\n"
	          	bd3a = bd3a+"reader.close();\n"
	          	bd3a = bd3a+"} catch (Exception e){}\n"
	          	bd3a = bd3a+"if ("+class_name+".is_valid){\n"
	          	bd3a = bd3a+"if (num == 0){\n"
	          	bd3a = bd3a+"mr_start();\n"
	          	bd3a = bd3a+"current_mr = 0;\n"
	          	bd3a = bd3a+"for (int i=1; i<=num_mr; i++){\n"
	          	bd3a = bd3a+"readInput(i);\n"
				bd3a = bd3a+"readOutput(i);\n"
				bd3a = bd3a+"}\n"
				bd3a = bd3a+"current_testcase++;\n"
				bd3a = bd3a+"if (current_testcase <= max_tc){\n"
				bd3a = bd3a+"readInput(0);\n"
				bd3a = bd3a+"readOutput(0);\n"
				bd3a = bd3a+"}\n"
	          	bd3a = bd3a+"} else {\n"
	          	bd3a = bd3a+"initMRVar();\n"
				bd3a = bd3a+"num_tc++;\n"
				bd3a = bd3a+"if (num_tc <= max_tc){\n"
				bd3a = bd3a+"writeInput(0,num_tc);\n"
    			bd3a = bd3a+"writeOutput(0,num_tc);\n"
				bd3a = bd3a+"}\n"
	          	bd3a = bd3a+"}\n}\n"
	          	body = '''
		      		«bd3a»
	          	'''
          	]
          	
          	members += feature.toMethod("readOutput", typeRef(void)) [
          		documentation = feature.documentation
	      		parameters += element.toParameter("path",typeRef(java.lang.String))
	      		bd3b = "int sz = 0;\n"
	      		bd3b = bd3b+"String line;\n"
	      		bd3b = bd3b+"String[] tokens;\n"
	      		bd3b = bd3b+"try{\n"
	      		bd3b = bd3b+"BufferedReader reader = new BufferedReader(new FileReader(new File(path)));\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd3b = bd3b.concat(p.inputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	bd3b = bd3b+"if (reader.readLine() != null){\n"
	          	bd3b = bd3b+class_name+".die(\"number of lines not match\");\n"
				bd3b = bd3b+"}\n"
	          	bd3b = bd3b+"reader.close();\n"
	          	bd3b = bd3b+"} catch (Exception e){}\n"
	          	body = '''
		      		«bd3b»
	          	'''
          	]
          	
          	members += feature.toMethod("writeOutput", typeRef(void)) [
          		documentation = feature.documentation
	      		parameters += element.toParameter("mr",typeRef(int))
	      		parameters += element.toParameter("tc",typeRef(int))
	      		bd3 = "try {\n"
	      		bd3 = bd3+"File wfile = new File(\"tc/Subtask\"+current_subtask+\"/out/\"+mr+\"/\"+tc+\".out\");\n"
	      		bd3 = bd3+"if(!wfile.exists()) wfile.createNewFile();\n"
	      		bd3 = bd3+"fw = new FileWriter(wfile);\n"
	      		bd3 = bd3+"writer = new BufferedWriter(fw);\n"
	      		for (p : feature.exp) {
	      			switch (p){
	      				FormatExpression:{
	      					bd3 = bd3.concat(p.outputBody)
	      				}
	      				ForFormatExpression:{
	      					
	      				}
	      			}
	            	
	          	}
	          	bd3 = bd3+"writer.close();\n"
	          	bd3 = bd3+"} catch(Exception e){}\n"
	          	body = '''
		      		«bd3»
	          	'''
          	]
          	
          }
          
          Check:{
          	members += element.toMethod("output_check", typeRef(boolean)) [
				parameters += element.toParameter("inPath",typeRef(java.lang.String))
	      		parameters += element.toParameter("outPath",typeRef(java.lang.String))
	      		parameters += element.toParameter("ansPath",typeRef(java.lang.String))
	      		body = '''
					«var checkBody1 = class_name+" ans = new "+class_name+"();\n"»
					«var checkBody = ""»
					«var condArr = "ArrayList cond_arr;\n"»
					«for (ch : feature.chk){
		          		switch ch{
		          			ChkExpression:{
		          				checkBody = checkBody+checkExp(ch)
		          			}
		          			ChkLoopExpression:{
		          				checkBody = checkBody+checkLoopExp(ch)
		          			}
		          		}
		          	}»
					«checkBody1»
					ans.init();
					readInput(inPath);
					readOutput(outPath);
					ans.readInput(inPath);
					ans.readOutput(ansPath);
					boolean ok = true;
					«condArr»
					«checkBody»
					return ok;
				'''
				]
          }
          
          MR:{
          	num_mr = num_mr+1
          	mr_list = mr_list+"mr_followup_"+feature.num+"();\n"
          	mr_list = mr_list+"writeInput(current_mr,current_testcase);\n"
			mr_list = mr_list+"writeOutput(current_mr,current_testcase);\n"
          	
          	mr_gen = mr_gen+'writer.write("				g.setIs_valid(true);");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("				g.readInput(inFile);");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("				g.mr_followup_'+feature.num+'();");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("				g.writeInput(inFile2);");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("				if (g.getIs_valid()){");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("					execute(inFile2,outFile2);");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	mr_gen = mr_gen+'writer.write("				}");\n'
          	mr_gen = mr_gen+"writer.write(System.lineSeparator());\n"
          	
          	members += element.toMethod("mr_followup_"+feature.num, typeRef(void)) [
				body = '''
					initMRVar();
					current_mr++;
					«var condArr = "ArrayList cond_arr;\n"»
					«var genExp = ""»
					«for (me : feature.mrExp){
		          		switch me{
		          			ChkExpression:{
		          				genExp = genExp+checkExp(me)
		          			}
		          			ChkLoopExpression:{
		          				genExp = genExp+checkLoopExp(me)
		          			}
		          		}
		          	}»
					«for (fo : feature.followup.followups){
						switch fo{
		          			ChkExpression:{
		          				genExp = genExp+checkExp(fo)
		          			}
		          			ChkLoopExpression:{
		          				genExp = genExp+checkLoopExp(fo)
		          			}
		          		}
					}»
					«for (pr : feature.property.properties){
						switch pr{
		          			ChkExpression:{
		          				genExp = genExp+checkExp(pr)
		          			}
		          			ChkLoopExpression:{
		          				genExp = genExp+checkLoopExp(pr)
		          			}
		          		}
					}»
					«condArr»
					«genExp»
				'''
				]
			members += element.toMethod("mr_check_"+feature.num, typeRef(void)) [
				body = '''
					initMRVar();
					«var checkBody = "boolean ok = true;\n"»
					«var condArr = "ArrayList cond_arr;\n"»
					«var genExp = ""»
					«for (me : feature.mrExp){
		          		switch me{
		          			ChkExpression:{
		          				genExp = genExp+checkExp(me)
		          			}
		          			ChkLoopExpression:{
		          				genExp = genExp+checkLoopExp(me)
		          			}
		          		}
		          	}»
					«for (pr : feature.property.properties){
						switch pr{
		          			ChkExpression:{
		          				genExp = genExp+checkExp(pr)
		          			}
		          			ChkLoopExpression:{
		          				genExp = genExp+checkLoopExp(pr)
		          			}
		          		}
					}»
					«checkBody»
					«condArr»
					«genExp»
				'''
				]
          }
          
          Score:{
          	num_subtask = feature.scores.size()
          	members += element.toMethod("printScore", typeRef(void)) [
				body = '''
					«var scoreBody = "File sfile;\n"»
					«for (score : feature.scores){
						scoreBody = scoreBody+"try {\n"
			      		scoreBody = scoreBody+"sfile = new File(\"tc/"+score.subtask+".score\");\n"
			      		scoreBody = scoreBody+"if(!sfile.exists()) sfile.createNewFile();\n"
			      		scoreBody = scoreBody+"fw = new FileWriter(sfile);\n"
			      		scoreBody = scoreBody+"writer = new BufferedWriter(fw);\n"
			      		scoreBody = scoreBody+"writer.write(\"\"+"+score.score+");\n"
			      		scoreBody = scoreBody+"writer.write(System.lineSeparator());\n"
			          	scoreBody = scoreBody+"writer.close();\n"
			          	scoreBody = scoreBody+"} catch(Exception e){}\n"
					}»
					«scoreBody»
				'''
				]
          }
        }
      }
      
      members += element.toMethod("initMRVar", typeRef(void)) [
		body = '''
			«copy_var»
		'''
		]
	  members += element.toMethod("mr_start", typeRef(void)) [
		body = '''
			«mr_list»
		'''
		]
	  members += element.toMethod("init", typeRef(void)) [
		body = '''
			sc = new Scanner(System.in);
			max_loop_counter = 1000;
			loop_counter = 0;
		'''
		]
	  members += element.toMethod("mr_check", typeRef(boolean)) [
		parameters += element.toParameter("inPath",typeRef(java.lang.String))
		parameters += element.toParameter("outPath",typeRef(java.lang.String))
		body = '''
			GeneratedClass ans = new GeneratedClass();
			ans.init();
			ans.readInput(inPath);
			ans.readOutput(outPath);
			if (!ans.getIs_valid()) return false;
			boolean ok = true;
			«mr_chk»
			return ok;
		'''
		]
	  members += element.toMethod("generateOutputChecker", typeRef(void)) [
		parameters += element.toParameter("mx_subtask",typeRef(int))
		parameters += element.toParameter("mx_tc",typeRef(int))
		body = '''
			«generateOutputChecker()»
		'''
		]
	  members += element.toMethod("generateOutputCheckerMT", typeRef(void)) [
		parameters += element.toParameter("mx_subtask",typeRef(int))
		parameters += element.toParameter("mx_tc",typeRef(int))
		body = '''
			«generateOutputCheckerMT()»
		'''
		]
	  members += element.toMethod("generate", typeRef(void)) [
		parameters += element.toParameter("tc",typeRef(int))
		parameters += element.toParameter("mtc",typeRef(int))
		body = '''
			num_mr = «num_mr»;
			max_tc = mtc;
			num_subtask = «num_subtask»;
			«class_name».cur_lines = 1;
			printScore();
			generateOutputChecker(num_subtask,max_tc);
			generateOutputCheckerMT(num_subtask,max_tc);
			for (int i=1; i<=num_subtask; i++){
				current_subtask = i;
				current_testcase = 1;
				current_mr = 0;
				num_tc = tc;
				readInput(0);
				readOutput(0);
			}
		'''
		]
      
    ]
  }
  
  def String chkVar(ChkVariable element){
  	var cc = ""
  	if (element.pref != null) cc = cc+element.pref.type+"."
  	if (element.v.size() == 0){
  		//cc = cc+"get"+element.^var.toFirstUpper
  		//if (element.newtest != null) cc = cc+"_2"
  		//cc = cc+"()"
  		cc = cc+element.^var
  		if (element.newtest != null) cc = cc+"_2"
  	} else {
  		cc = cc+"get"+element.^var.toFirstUpper
  		if (element.newtest != null) cc = cc+"_2"
  		cc = cc+"("
  		var i=0
  		for (v : element.v){
  			if (i>0) cc = cc+","
  			cc = cc+v
  			i = i+1
  		}
  		cc = cc+")"
  	}
  	println("var "+cc)
  	return cc
  }
  
  def String chkVar2(ChkVariable element){
  	var cc = ""
  	if (element.pref != null) cc = cc+element.pref.type+"."
  	//if (element.v.size() == 0){
  		//cc = cc+"get"+element.^var.toFirstUpper
  		//if (element.newtest != null) cc = cc+"_2"
  		//cc = cc+"()"
  		cc = cc+element.^var
  		if (element.newtest != null) cc = cc+"_2"
  	/*} else {
  		cc = cc+"get"+element.^var.toFirstUpper
  		if (element.newtest != null) cc = cc+"_2"
  		cc = cc+"("
  		for (v : element.v){
  			cc = cc+v
  		}
  		cc = cc+")"
  	}*/
  	println("var2 "+cc)
  	return cc
  }
  
  def String chkVars(ChkVariables element){
  	var cc = ""
  	if (element.va != null){
  		cc = cc+chkVar(element.va)
  	}
  	if (element.nu != null){
  		cc = cc+element.nu
  	}
  	println("vars "+cc)
  	return cc
  }
  
  def String relationalExp(ChkRelationalExpression element){
  	var cc = ""
  	cc = cc+chkVars(element.v1)
  	cc = cc+element.opr
  	cc = cc+chkVars(element.v2)
  	println("rel "+cc)
  	return cc
  }
  
  def String chkOp(ChkOperation element){
  	var cc = ""
  	var xx = -1
  	for (op : element.operand){
  		if (xx >= 0) cc = cc+element.operator.get(xx)
  		cc = cc+chkVars(op)
  		xx = xx+1
  	}
  	println("op "+cc)
  	return cc
  }
  
  def String checkExp(ChkExpression element){
  	var cc = ""
  	var lt = ""
  	//todo if (element.asg != null) lt = lt+"int "+element.asg+" = "
	var exp = element.exp
	switch exp{
		Helper:{
			if (exp.select != null){
				// special where handling
				for (vv : exp.vars){
					cc = cc+"int "+vv+";\n"
				}
				cc = cc+"loop_counter = 0;\n"
				cc = cc+"do {"
				for (vv : exp.vars){
					cc = cc+vv+" = "+lib_class_name+".select("+chkVars(exp.var3)+","+chkVars(exp.var4)+");\n"
				}
				cc = cc+"loop_counter++;\n"
				cc = cc+"if (loop_counter >= max_loop_counter){\n"
				cc = cc+"is_valid = false;\n"
				cc = cc+"break;\n"
				cc = cc+"}\n"
				cc = cc+"} while (!("
				var xx = -1
				for (co : element.cond){
					if (xx >= 0){
						if (element.type.get(xx).equals("and")) cc = cc+" && "
						if (element.type.get(xx).equals("or")) cc = cc+" || "
					}
					switch co{
						ChkRelationalExpression:{
							cc = cc+relationalExp(co)
						}
					}
					xx = xx+1
				}
				cc = cc+"));\n"
			} else if (exp.sum != null || exp.max != null || exp.min != null
				|| (exp.remove != null && exp.var3 == null)
			){
				//  general where handling
				var xx = -1
				cc = cc+"cond_arr = new ArrayList<Boolean>();\n"
				if (element.where != null){
					cc = cc+"for (int i=0; i<"+chkVar(exp.^var)+".size(); i++){\n"
					cc = cc+"if ("
					for (co : element.cond){
						if (xx >= 0){
							if (element.type.get(xx).equals("and")) cc = cc+" && "
							if (element.type.get(xx).equals("or")) cc = cc+" || "
						}
						switch co{
							ChkRelationalExpression:{
								cc = cc+relationalExp(co)
							}
						}
						xx = xx+1
					}
					cc = cc+") cond_arr.add(true);\n"
					cc = cc+"else cond_arr.add(false);\n"
					cc = cc+"}\n"
				} else {
					cc = cc+"for (int i=0; i<"+chkVar(exp.^var)+".size(); i++){\n"
					cc = cc+"cond_arr.add(true);\n"
					cc = cc+"}\n"
				}
				if (element.op != null){
			  		cc = cc+"if (!("
			  	}
			  	cc = cc+lt
			  	cc = cc+lib_class_name+"."
				if (exp.sum != null){
					cc = cc+"sum("+chkVar(exp.^var)+", cond_arr)"
				} else if (exp.max != null){
					cc = cc+"max("+chkVar(exp.^var)+", cond_arr)"
				} else if (exp.min != null){
					cc = cc+"min("+chkVar(exp.^var)+", cond_arr)"
				} else if (exp.remove != null){
					cc = cc+"remove("+chkVar(exp.^var)+", cond_arr)"
				}
			} else {
				if (element.op != null){
			  		cc = cc+"if (!("
			  	}
			  	cc = cc+lt
			  	cc = cc+lib_class_name+"."
				// no where
				if (exp.prime != null){
					cc = cc+"prime("+chkVars(exp.var3)+");"
				} else if (exp.random != null){
					cc = cc+"random("+chkVars(exp.var3)+","+chkVars(exp.var4)+")"
				} else if (exp.size != null){
					cc = cc+"size("+chkVar(exp.^var)+")"
				} else if (exp.swap != null){
					cc = cc+"swap("+chkVar(exp.^var)+","+exp.var1+","+exp.var2+")"
				} else if (exp.add != null){
					cc = cc+"add("+chkVar(exp.^var)+","+chkVars(exp.var3)+")"
				} else if (exp.remove != null){
					cc = cc+"remove("+chkVar(exp.^var)+","+chkVars(exp.var3)+")"
				} else if (exp.plus != null){
					cc = cc+"plus("+chkVar(exp.^var)+","+chkVars(exp.var3)+")"
				} else if (exp.multiply != null){
					cc = cc+"multiply("+chkVar(exp.^var)+","+chkVars(exp.var3)+")"
				} else if (exp.swapCol != null){
					cc = cc+"swapColumn("+chkVar(exp.^var)+","+exp.var1+","+exp.var2+")"
				} else if (exp.addRow != null){
					cc = cc+"addRow("+chkVar(exp.^var)+")"
				} else if (exp.addCol != null){
					cc = cc+"addColumn("+chkVar(exp.^var)+")"
				}
			}
			
		}
		ChkRelationalExpression:{
			cc = cc+lt
			cc = cc+"if (!("+relationalExp(exp)+")) ok = false"
		}
		MethodCall:{
			if (element.op != null){
		  		cc = cc+"if (!("
		  	}
		  	cc = cc+lt
			cc = cc+exp.name+"("
			var first=true
			for (p : exp.params){
				if (first) first = false
				else cc = cc+","
				cc = cc+p
			}
			cc = cc+")\n"
		}
		ChkAssignment:{
			var lf = ""
			if (exp.def != null){
				lf = "int "
			}
			var rg = ""
			if (exp.v1.v.size() == 0){
				lf = lf+chkVar(exp.v1)+" = "
				rg = rg+";\n"
			} else {
				if (exp.v1.pref != null) lf = lf+exp.v1.pref.type+"."
				lf = lf+"set"+exp.v1.^var.toFirstUpper
				if (exp.v1.newtest != null) lf = lf+"_2"
				lf = lf+"("
				for (id : exp.v1.v){
					lf = lf+id+","
				}
				rg = rg+");\n"
			}
					
			var expv2 = exp.v2
			switch expv2 {
				ChkOperation:{
					cc = cc+lf
					cc = cc+chkOp(expv2)
					cc = cc+rg
				}
				Helper:{
					// copy from helper
					if (expv2.select != null){
						// special where handling
						for (vv : expv2.vars){
							cc = cc+"int "+vv+";\n"
						}
						cc = cc+"loop_counter = 0;\n"
						cc = cc+"do {"
						for (vv : expv2.vars){
							cc = cc+vv+" = "+lib_class_name+".select();\n"
						}
						cc = cc+"loop_counter++;\n"
						cc = cc+"if (loop_counter >= max_loop_counter){\n"
						cc = cc+"is_valid = false;\n"
						cc = cc+"break;\n"
						cc = cc+"}\n"
						cc = cc+"} while (!("
						var xx = -1
						for (co : element.cond){
							if (xx >= 0){
								if (element.type.get(xx).equals("and")) cc = cc+" && "
								if (element.type.get(xx).equals("or")) cc = cc+" || "
							}
							switch co{
								ChkRelationalExpression:{
									cc = cc+relationalExp(co)
								}
							}
							xx = xx+1
						}
						cc = cc+"));\n"
					} else if (expv2.sum != null || expv2.max != null || expv2.min != null
						|| (expv2.remove != null && expv2.var3 == null)
					){
						//  general where handling
						var xx = -1
						cc = cc+"cond_arr = new ArrayList<Boolean>();\n"
						if (element.where != null){
							cc = cc+"for (int i=0; i<"+chkVar(expv2.^var)+".size(); i++){\n"
							cc = cc+"if ("
							for (co : element.cond){
								if (xx >= 0){
									if (element.type.get(xx).equals("and")) cc = cc+" && "
									if (element.type.get(xx).equals("or")) cc = cc+" || "
								}
								switch co{
									ChkRelationalExpression:{
										cc = cc+relationalExp(co)
									}
								}
								xx = xx+1
							}
							cc = cc+") cond_arr.add(true);\n"
							cc = cc+"else cond_arr.add(false);\n"
							cc = cc+"}\n"
						} else {
							cc = cc+"for (int i=0; i<"+chkVar(expv2.^var)+".size(); i++){\n"
							cc = cc+"cond_arr.add(true);\n"
							cc = cc+"}\n"
						}
						if (element.op != null){
					  		cc = cc+"if (!("
					  	}
					  	cc = cc+lf
					  	cc = cc+lib_class_name+"."
						if (expv2.sum != null){
							cc = cc+"sum("+chkVar(expv2.^var)+", cond_arr)"
						} else if (expv2.max != null){
							cc = cc+"max("+chkVar(expv2.^var)+", cond_arr)"
						} else if (expv2.min != null){
							cc = cc+"min("+chkVar(expv2.^var)+", cond_arr)"
						} else if (expv2.remove != null){
							cc = cc+"remove("+chkVar(expv2.^var)+", cond_arr)"
						}
						cc = cc+rg
					} else {
						if (element.op != null){
					  		cc = cc+"if (!("
					  	}
					  	cc = cc+lf
					  	cc = cc+lib_class_name+"."
						// no where
						if (expv2.prime != null){
							cc = cc+"prime("+chkVars(expv2.var3)+");"
						} else if (expv2.random != null){
							cc = cc+"random("+chkVars(expv2.var3)+","+chkVars(expv2.var4)+")"
						} else if (expv2.size != null){
							cc = cc+"size("+chkVar(expv2.^var)+")"
						} else if (expv2.swap != null){
							cc = cc+"swap("+chkVar(expv2.^var)+","+expv2.var1+","+expv2.var2+")"
						} else if (expv2.add != null){
							cc = cc+"add("+chkVar(expv2.^var)+","+chkVars(expv2.var3)+")"
						} else if (expv2.remove != null){
							cc = cc+"remove("+chkVar(expv2.^var)+","+chkVars(expv2.var3)+")"
						} else if (expv2.plus != null){
							cc = cc+"plus("+chkVar(expv2.^var)+","+chkVars(expv2.var3)+")"
						} else if (expv2.multiply != null){
							cc = cc+"multiply("+chkVar(expv2.^var)+","+chkVars(expv2.var3)+")"
						} else if (expv2.swapCol != null){
							cc = cc+"swapColumn("+chkVar(expv2.^var)+","+expv2.var1+","+expv2.var2+")"
						} else if (expv2.addRow != null){
							cc = cc+"addRow("+chkVar(expv2.^var)+")"
						} else if (expv2.addCol != null){
							cc = cc+"addColumn("+chkVar(expv2.^var)+")"
						}
						cc = cc+rg
					}
				}
			}
		}
	}
	if (element.op != null){
		cc = cc+element.op
		cc = cc+chkVar(element.v)+")) ok = false;\n"
	} else cc = cc+";\n"
	println("check "+cc)
	return cc
  }
  
  def String checkLoopExp(ChkLoopExpression element){
  	var v = chkVar(element.index)
  	var m = chkVars(element.maxIndex)
  	var cc = "for (int "+v+"=0; "+v+"<"+m+"; "+v+"++){\n"
  	for (chkex : element.ex){
  		cc = cc+checkExp(chkex)
  	}
  	cc = cc+"}\n"
	return cc
  }
  
  def String validateBody(Limit element){
  	var cc = ""
	var idx = 0
	if (element.sub != null) cc = "case "+element.sub.num+" :\n"
	else cc = "default :\n"
	cc = cc+"if ("
	for (i : element.a){
		if (idx > 0) cc = cc+" || "
		cc = cc+"("+i+" <= value && value <= "+element.b.get(idx)+")"
		idx = idx+1
	}
	cc = cc+"){\n"
	cc = cc+"return true;\n"
	cc = cc+"} else {\n"
	cc = cc+"return false;\n"
	cc = cc+"}\n"
	//cc = cc+"break;\n"
	return cc
  }
  
  def String inputBody(FormatExpression element) {
	var i = 0
	var cc = ""
	var tm = ""
	if (!element.num.equals("1")) cc = cc+"for (int i=0; i<"+element.num+"; i++){\n"
	sz = 0
	//sz = element.^var.size() - element.count.size()
	cc = cc+"sz = "+sz
	for (v : element.^var){
		if (v.count != null) cc = cc+"+"+v.count
		else cc = cc+"+1"
	}
	//for (e : element.count){
	//	if (e.equals("i")){
	//		cc = cc+("+1")
	//	} else {
	//		cc = cc+("+"+e)
	//	}
	//}
	cc = cc+";\n"
	cc = cc+"if ((line = reader.readLine()) != null){\n"
	cc = cc+"line = line.trim();\n"
	cc = cc+"line = line.replaceAll(\"\\\\s+\", \" \");\n"
	cc = cc+"tokens = line.split(\" \");\n"
	cc = cc+"if (tokens.length == sz){\n"
	for (v : element.^var){
		if (v.count == null){
			val temp = "read"+chkVar(v.fv).toFirstUpper+"(tokens["+i+"]);\n"
			cc = cc+temp
		} else {
			if (v.fv.v.size() == 0) tm = tm+"read"+chkVar(v.fv).toFirstUpper+"(tokens);\n"
			else tm = tm+"read"+chkVar2(v.fv).toFirstUpper+"(tokens,"+v.fv.v.get(0)+");\n"
			cc = cc+tm
		}
		i = i+1
	}
	cc = cc+"} else {\n"
	cc = cc+class_name+".die(\"number of elements in lines not match\");\n"
	cc = cc+"}\n"
	cc = cc+"} else {\n"
	cc = cc+class_name+".die(\"number of lines not match\");\n"
	cc = cc+"}\n"
	if (!element.num.equals("1")) cc = cc+"}\n"
	return cc
  }
  
  def String outputBody(FormatExpression element) {
	var i = 0
	var cc = ""
	if (!element.num.equals("1")) cc = cc+"for (int i=0; i<"+element.num+"; i++){\n"
	for (e : element.^var){
		if (i > 0) cc = cc+"writer.write(\" \");\n"
		if (e.fv.v.size() == 0) cc = cc+"write"+chkVar(e.fv).toFirstUpper+"_2();\n"
		else cc = cc+"write"+chkVar2(e.fv).toFirstUpper+"_2("+e.fv.v.get(0)+");\n"
		i = i+1
	}
	if (element.^var.get(element.^var.size()-1).count == null) cc = cc+"writer.write(System.lineSeparator());\n"
	if (!element.num.equals("1")) cc = cc+"}\n"
	return cc
  }
  
  def String chkType(ChkVariableDeclaration element) {
	return element.type
  }
  
  def String generateOutputCheckerMT(){
  	var aa = ""
  	aa = "try {\n"
	aa = aa+"File wfile = new File(\"OutputCheckerMT.java\");\n"
	aa = aa+"if(!wfile.exists()) wfile.createNewFile();\n"
	aa = aa+"fw = new FileWriter(wfile);\n"
	aa = aa+"writer = new BufferedWriter(fw);\n"
	var bb = ""
  	bb = bb+"writer.close();\n"
  	bb = bb+"} catch(Exception e){}\n"
  	var cc = ""
  	cc = cc + 'writer.write("import java.io.*;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("import java.util.*;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("public class OutputCheckerMT {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	private static GeneratedClass g;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	private static String exeFile;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"	
	cc = cc + 'writer.write("	public static void pipeStream(InputStream input, OutputStream output) throws IOException {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		byte buffer[] = new byte[1024];");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int numRead = 0;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		do {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			numRead = input.read(buffer);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			output.write(buffer, 0, numRead);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		} while (input.available() > 0);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		output.flush();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"	
	cc = cc + 'writer.write("	public static void execute(String inF, String outF){");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		try {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			FileInputStream fileIn = new FileInputStream(inF);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			FileOutputStream fileOut = new FileOutputStream(outF);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			OutputStream procIn = null;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			InputStream procOut = null;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			Process process = null;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			process = Runtime.getRuntime().exec(exeFile);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			procIn = process.getOutputStream();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			procOut = process.getInputStream();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			pipeStream(fileIn, procIn);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			pipeStream(procOut, fileOut);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			process.destroy();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		} catch (Exception e){};");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	public static void main(String[] args) {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int subtask = "+mx_subtask+";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int tc = "+mx_tc+";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int score = 0;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		boolean ok = true;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		boolean mr_ok = true;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		exeFile = args[0];");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		if (args.length >= 2) subtask = Integer.parseInt(args[1]);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		if (args.length >= 3) tc = Integer.parseInt(args[2]);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		for (int s=1; s<=subtask; s++){");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			for (int t=1; t<=tc; t++){");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String inFile = \\\"tc/Subtask\\\"+s+\\\"/in/0/\\\"+t+\\\".in\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String inFile2 = \\\"bufferIn.temp\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String outFile = \\\"bufferOut.temp\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String outFile2 = \\\"bufferOut2.temp\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				g = new GeneratedClass();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				execute(inFile,outFile);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				g.readInput(inFile);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				g.readOutput(outFile);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				mr_ok = true;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + mr_gen
	cc = cc + 'writer.write("				if (mr_ok) System.out.println(\\\"Correct\\\");");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				else {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					ok = false;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					System.out.println(\\\"Wrong Answer\\\");");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			try {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				InputStream fisOut = new FileInputStream(\\\"tc/\\\"+s+\\\".score\\\");");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				BufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String line = brOut.readLine();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				if (ok) score += Integer.parseInt(line);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				brOut.close();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			} catch (Exception e){}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		System.out.println(\\\"Score : \\\"+score);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
  	return aa+cc+bb
  }
  
  def String generateOutputChecker(){
  	var aa = ""
  	aa = "try {\n"
	aa = aa+"File wfile = new File(\"OutputChecker.java\");\n"
	aa = aa+"if(!wfile.exists()) wfile.createNewFile();\n"
	aa = aa+"fw = new FileWriter(wfile);\n"
	aa = aa+"writer = new BufferedWriter(fw);\n"
	var bb = ""
  	bb = bb+"writer.close();\n"
  	bb = bb+"} catch(Exception e){}\n"
  	var cc = ""
  	cc = cc + 'writer.write("import java.io.*;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("import java.util.*;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("public class OutputChecker {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	private static GeneratedClass g;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	public static void pipeStream(InputStream input, OutputStream output) throws IOException");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	{");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		byte buffer[] = new byte[1024];");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int numRead = 0;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		do");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		{");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			numRead = input.read(buffer);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			output.write(buffer, 0, numRead);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		} while (input.available() > 0);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		output.flush();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	public static void main(String[] args) {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int subtask = "+mx_subtask+";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int tc = "+mx_tc+";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		int score = 0;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		boolean ok = true;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		if (args.length >= 2) subtask = Integer.parseInt(args[1]);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		if (args.length >= 3) tc = Integer.parseInt(args[2]);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		for (int s=1; s<=subtask; s++){");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			for (int t=1; t<=tc; t++){");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String inFile = \\\"tc/Subtask\\\"+s+\\\"/in/0/\\\"+t+\\\".in\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String outFile = \\\"bufferOut.temp\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String ansFile = \\\"tc/Subtask\\\"+s+\\\"/out/0/\\\"+t+\\\".out\\\";");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				g = new GeneratedClass();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				try {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					FileInputStream fileIn = new FileInputStream(inFile);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					FileOutputStream fileOut = new FileOutputStream(outFile);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					OutputStream procIn = null;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					InputStream procOut = null;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					Process process = null;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					process = Runtime.getRuntime().exec(args[0]);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					procIn = process.getOutputStream();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					procOut = process.getInputStream();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					pipeStream(fileIn, procIn);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					pipeStream(procOut, fileOut);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					process.destroy();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				} catch (Exception e){};");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				if (g.output_check(inFile,outFile,ansFile)) System.out.println(\\\"Correct\\\");");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				else {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					ok = false;");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("					System.out.println(\\\"Wrong Answer\\\");");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			try {");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				InputStream fisOut = new FileInputStream(\\\"tc/\\\"+s+\\\".score\\\");");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				BufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				String line = brOut.readLine();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				if (ok) score += Integer.parseInt(line);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("				brOut.close();");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("			} catch (Exception e){}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("		System.out.println(\\\"Score : \\\"+score);");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("	}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("");\n' cc = cc+"writer.write(System.lineSeparator());\n"
	cc = cc + 'writer.write("}");\n' cc = cc+"writer.write(System.lineSeparator());\n"
  	return aa+cc+bb
  }
  
}

