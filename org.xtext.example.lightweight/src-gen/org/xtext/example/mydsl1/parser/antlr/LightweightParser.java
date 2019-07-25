/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl1.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl1.parser.antlr.internal.InternalLightweightParser;
import org.xtext.example.mydsl1.services.LightweightGrammarAccess;

public class LightweightParser extends AbstractAntlrParser {

	@Inject
	private LightweightGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLightweightParser createParser(XtextTokenStream stream) {
		return new InternalLightweightParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "App";
	}

	public LightweightGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LightweightGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
