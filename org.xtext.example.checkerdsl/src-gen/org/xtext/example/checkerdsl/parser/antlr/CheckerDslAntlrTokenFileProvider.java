/*
* generated by Xtext
*/
package org.xtext.example.checkerdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CheckerDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/checkerdsl/parser/antlr/internal/InternalCheckerDsl.tokens");
	}
}