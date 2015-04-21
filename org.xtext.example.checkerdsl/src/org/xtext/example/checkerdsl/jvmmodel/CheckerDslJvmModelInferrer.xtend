package org.xtext.example.checkerdsl.jvmmodel

import com.google.inject.Inject
import org.xtext.example.checkerdsl.checkerDsl.Class
import org.xtext.example.checkerdsl.checkerDsl.Method
import org.xtext.example.checkerdsl.checkerDsl.Property
import org.xtext.example.checkerdsl.checkerDsl.Limit
import org.xtext.example.checkerdsl.checkerDsl.Format
import org.xtext.example.checkerdsl.checkerDsl.InputFormat
import org.xtext.example.checkerdsl.checkerDsl.OutputFormat
import org.xtext.example.checkerdsl.checkerDsl.FormatExpression
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
      
          Property : {
          	
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
          	if (feature.limit != null){
          		tp = t2
          		//for (lim : feature.limit){
		          	members += feature.toMethod("validate"+feature.name.toFirstUpper, typeRef(boolean))[
		      			parameters += element.toParameter("value",tp)
		      			parameters += element.toParameter("subtask",typeRef(int))
		      			bd1 = "switch (subtask){\n"
		      			for (lim : feature.limit){
	      					bd1 = bd1 + lim.validateBody
	      				}
		      			body = '''
		      				«bd1»
		        		'''
		     		]
	     		//}
     		} else {
     			tp = t2
	          	members += feature.toMethod("validate"+feature.name.toFirstUpper, typeRef(boolean))[
	      			parameters += element.toParameter("value",tp)
	      			body = '''
	        			return true;
	        		'''
	     		]
     		}
          	
          	if (feature.sz.size() != 0){
          		t = typeRef(java.util.ArrayList)
          		
          		members += feature.toField(feature.name, t)
	            members += feature.toGetter(feature.name, t)
	            members += feature.toSetter(feature.name, t)
          		
          		if (feature.sz.size() == 1){
	          		members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
	          			parameters += element.toParameter("tokens",typeRef(String).addArrayTypeDimension)
	          			body = '''
	          				«feature.name» = new ArrayList();
	          				for (int i=0; i<«feature.sz.get(0)»; i++){
	          					«feature.name».add(«feature.type»Reader(tokens[i]));
	          					if (!validate«feature.name.toFirstUpper»((int)«feature.name».get(i))){
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
	          						if (!validate«feature.name.toFirstUpper»((int)temp.get(j))){
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
	            members += feature.toGetter(feature.name, t2)
	            members += feature.toSetter(feature.name, t2)
	            
	            members += feature.toMethod("read"+feature.name.toFirstUpper, typeRef(void))[
          			parameters += element.toParameter("token",typeRef(String))
          			body = '''
	        			«feature.name» = «feature.type»Reader(token);
	        			if (!validate«feature.name.toFirstUpper»(«feature.name»)){
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
        }
      }
      
	  members += element.toMethod("init", typeRef(void)) [
		body = '''
			sc = new Scanner(System.in);
			«class_name».cur_lines = 1;
			readInput();
			readOutput();
			writeOutput();
		'''
		]
      
    ]
  }
  
  def String validateBody(Limit element){
  	var bd = ""
	var idx = 0
	bd = "Case "+element.sub+" :\n"
	bd = bd+"if ("
	for (i : element.a){
		if (idx > 0) bd = bd+" || "
		bd = bd+"("+i+" <= value && value <= "+element.b.get(idx)+")"
		idx = idx+1
	}
	bd = bd+"){\n"
	bd = bd+"return true;\n"
	bd = bd+"} else {\n"
	bd = bd+"return false;\n"
	bd = bd+"}\n"
	bd = bd+"break;\n"
	return bd
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

