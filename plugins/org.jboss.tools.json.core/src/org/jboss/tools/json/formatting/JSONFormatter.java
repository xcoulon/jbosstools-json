/*
 * generated by Xtext
 */
package org.jboss.tools.json.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.jboss.tools.json.services.JSONGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class JSONFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(final FormattingConfig config) {
		JSONGrammarAccess grammar = (JSONGrammarAccess) getGrammarAccess();
		// line wrap and indent inside a JSON Object
		//config.setLinewrap(1).bounds(left, right)(grammar.getTERMINAL_COMMARule(), grammar.getPairRule());
		// line wrap if a pair is followed by a comma (meaning there's another pair after this one
		config.setLinewrap(1).between(grammar.getTERMINAL_COMMARule(), grammar.getPairRule());
		// no space between a value and a following comma character
		config.setNoSpace().between(grammar.getValueRule(), grammar.getTERMINAL_COMMARule());
		
		//config.setAutoLinewrap(120);
		
		// linewrap and increment indent after first, linewrap and decrement after second
		for(Pair<Keyword, Keyword> pair : grammar.findKeywordPairs("{", "}")) {
			config.setLinewrap().after(pair.getFirst());
			config.setLinewrap().before(pair.getSecond());
			config.setIndentation(pair.getFirst(), pair.getSecond());
			//config.setLinewrap().before(pair.getSecond());
			//config.setIndentationDecrement().before(keyword);
		}
		// linewrap and increment indent after first, linewrap and decrement after second
		for(Pair<Keyword, Keyword> pair : grammar.findKeywordPairs("[", "]")) {
			config.setNoSpace().after(pair.getFirst());
			config.setNoSpace().before(pair.getSecond());
			config.setNoLinewrap().between(pair.getFirst(), pair.getSecond());
			config.setNoSpace().between(pair.getFirst(), pair.getSecond());
			//config.setLinewrap().after(pair.getFirst());
			//config.setIndentation(pair.getFirst(), pair.getSecond());
			//config.setLinewrap().after(pair.getSecond());
			//config.setIndentationDecrement().before(keyword);
		}
		// no space before and 1 space after
		for(Keyword keyword : grammar.findKeywords(",", ":")) {
			config.setNoSpace().before(keyword);
			config.setSpace(" ").after(keyword);
		}
		// no space after
		for(Keyword keyword : grammar.findKeywords("[")) {
			config.setNoSpace().after(keyword);
		}
		// no space before
		for(Keyword keyword : grammar.findKeywords("]")) {
			config.setNoSpace().before(keyword);
		}	}
}
