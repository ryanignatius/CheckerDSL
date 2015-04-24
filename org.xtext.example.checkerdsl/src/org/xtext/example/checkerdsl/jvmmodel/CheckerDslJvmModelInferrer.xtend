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
import org.xtext.example.checkerdsl.checkerDsl.MR
import org.xtext.example.checkerdsl.checkerDsl.Score
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression
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
  //@Inject extension Scanner
  @Inject extension IQualifiedNameProvider
	
	String bd1;
	String bd2;
	String bd3;
	String bd2a;
	String bd3a;
	String copy_var = "";
	int sz;
	String class_name = "GeneratedClass"
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
      members += element.toField("current_subtask",typeRef(int))
      
      members += element.toField("cur_lines",typeRef(int))[
      	static = true
      ]
      members += element.toMethod("die", typeRef(void))[
      	static = true
      	parameters += element.toParameter("message",typeRef(String))
		body = '''
      		System.out.println(message);
      		System.exit(0);
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
	          				for (int i=0; i<«feature.sz.get(0)»; i++){
	          					if (i > 0) System.out.print(" ");
	          					System.out.print(«feature.name».get(i));
	          				}
	          				System.out.println();
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx",typeRef(int))
	          			body = '''
	          				System.out.print(«feature.name».get(idx));
	          			'''
     	     		]
          		} else if (feature.sz.size() == 2){
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
     	     		members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				ArrayList atemp = (ArrayList) «feature.name».get(idx1);
	          				atemp.set(idx2,«feature.type»Reader());
	          				«feature.name».set(idx1,atemp);
	          			'''
     	     		]
     	     		
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			body = '''
	          				for (int i=0; i<«feature.sz.get(0)»; i++){
	          					for (int j=0; j<«feature.sz.get(1)»; j++){
	          						if (j > 0) System.out.print(" ");
	          						System.out.print(((ArrayList)«feature.name».get(i)).get(j));
	          					}
	          					System.out.println();
	          				}
	          			'''
     	     		]
     	     		members += feature.toMethod("write"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += feature.toParameter("idx1",typeRef(int))
	          			parameters += feature.toParameter("idx2",typeRef(int))
	          			body = '''
	          				System.out.print(((ArrayList)«feature.name».get(idx1)).get(idx2));
	          			'''
     	     		]
          		}
      		} else {
      			members += feature.toField(feature.name, t2)
	            members += feature.toField(feature.name+"_2", t2)
          		copy_var = copy_var+feature.name+"_2 = "+feature.name+";\n"
          		members += feature.toGetter(feature.name, t2)
	            members += feature.toSetter(feature.name, t2)
	            
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
	        			System.out.print(«feature.name»);
	        		'''
 	     		]
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
	      		bd2 = "int sz = 0;\n"
	      		for (p : feature.exp) {
	            	bd2 = bd2.concat(p.inputBody)
	          	}
	          	/*
	          	bd2 = bd2+"if (sc.hasNextLine()){\n"
	          	bd2 = bd2+class_name+".die(\"number of lines not match\");\n"
				bd2 = bd2+"}\n"
	          	*/
	          	body = '''
		      		«bd2»
	          	'''
          	]
          }
          
          OutputFormat : {
          	members += feature.toMethod("readOutput", typeRef(void)) [
          		documentation = feature.documentation
	      		bd3a = "int sz = 0;\n"
	      		for (p : feature.exp) {
	            	bd3a = bd3a.concat(p.inputBody)
	          	}
	          	/*
	          	bd3a = bd3a+"if (sc.hasNextLine()){\n"
	          	bd3a = bd3a+class_name+".die(\"number of lines not match\");\n"
				bd3a = bd3a+"}\n"
				*/
	          	body = '''
		      		«bd3a»
	          	'''
          	]
          	
          	members += feature.toMethod("writeOutput", typeRef(void)) [
          		documentation = feature.documentation
	      		bd3 = ""
	      		for (p : feature.exp) {
	            	bd3 = bd3.concat(p.outputBody)
	          	}
	          	body = '''
		      		«bd3»
	          	'''
          	]
          }
          
          Check:{
          	members += element.toMethod("output_check", typeRef(boolean)) [
				body = '''
					«var checkBody = "boolean ok = true;\n"»
					«for (ch : feature.chk){
		          		switch ch{
		          			ChkExpression:{
		          				checkBody = checkBody+"if (!("+checkExp(ch)+")) ok = false;\n"
		          			}
		          			ChkLoopExpression:{
		          				
		          			}
		          		}
		          	}»
					«checkBody»
					return ok;
				'''
				]
          }
          
          MR:{
          	members += element.toMethod("mr_followup_"+feature.num, typeRef(void)) [
				body = '''
					initMRVar();
					
				'''
				]
			members += element.toMethod("mr_check_"+feature.num, typeRef(void)) [
				body = '''
					initMRVar();
					
				'''
				]
          }
          
          Score:{
          	members += element.toMethod("printScore", typeRef(void)) [
				body = '''
					«var scoreBody = ""»
					«for (score : feature.scores){
						scoreBody = scoreBody+"System.out.println(\"Subtask : "+score.subtask+", Score : "+score.score+"\");\n"
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
	  members += element.toMethod("init", typeRef(void)) [
		body = '''
			sc = new Scanner(System.in);
			current_subtask = 1;
			«class_name».cur_lines = 1;
			readInput();
			readOutput();
			writeOutput();
		'''
		]
      
    ]
  }
  
  def String chkVar(ChkVariable element){
  	var cc = ""
  	// todo prefix
  	cc = cc+element.^var
  	// todo newtest
  	for (v : element.v){
  		cc = cc+"["+v+"]"
  	}
  	println("var "+cc)
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
  
  def String checkExp(ChkExpression element){
  	var cc = ""
  	var cond = ""
  	if (element.where != null){
  		cond = cond+"("+relationalExp(element.cond.get(0));
  	} else cond = "true"
	if (element.asg != null) cc = cc+"int "+element.asg+" = "
	var exp = element.exp
	switch exp{
		Helper:{
			
		}
		ChkRelationalExpression:{
			cc = cc+relationalExp(exp)
		}
		MethodCall:{
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
			
		}
	}
	println("check "+cc)
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
	sz = element.^var.size() - element.count.size()
	cc = "sz = "+sz
	for (e : element.count){
		if (e.equals("i")){
			cc = cc+("+1")
		} else {
			cc = cc+("+"+e)
		}
	}
	cc = cc+";\n"
	cc = cc+"if (sc.hasNextLine()){\n"
	cc = cc+"String st = sc.nextLine();\n"
	cc = cc+"st = st.trim();\n"
	cc = cc+"st = st.replaceAll(\"\\\\s+\", \" \");\n"
	cc = cc+"String[] tokens = st.split(\" \");\n"
	cc = cc+"if (tokens.length == sz){\n"
	for (v : element.^var){
		if (element.count.size() == 0){
			val temp = "read"+v.toFirstUpper+"(tokens["+i+"]);\n"
			cc = cc+temp;
		} else {
			val temp = "read"+v.toFirstUpper+"(tokens);\n"
			cc = cc+temp;
		}
		i = i+1
	}
	cc = cc+"} else {\n"
	cc = cc+class_name+".die(\"number of elements in lines not match\");\n"
	cc = cc+"}\n"
	cc = cc+"} else {\n"
	cc = cc+class_name+".die(\"number of lines not match\");\n"
	cc = cc+"}\n"
	return cc
  }
  
  def String outputBody(FormatExpression element) {
	var i = 0
	var cc = ""
	if (!element.num.equals("1")) cc = cc+"for (int i=0; i<"+element.num+"; i++){\n"
	for (e : element.^var){
		if (i > 0) cc = cc+"System.out.println(\" \");\n"
		cc = cc+"write"+e.toFirstUpper+"();\n"
	}
	if (element.count.size() == 0) cc = cc+"System.out.println();\n"
	if (!element.num.equals("1")) cc = cc+"}\n"
	return cc
  }
  
}

