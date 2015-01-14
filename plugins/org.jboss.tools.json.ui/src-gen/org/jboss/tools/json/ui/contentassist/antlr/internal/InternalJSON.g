/*
* generated by Xtext
*/
grammar InternalJSON;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.jboss.tools.json.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.jboss.tools.json.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.jboss.tools.json.services.JSONGrammarAccess;

}

@parser::members {
 
 	private JSONGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(JSONGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleJSONModel
entryRuleJSONModel 
:
{ before(grammarAccess.getJSONModelRule()); }
	 ruleJSONModel
{ after(grammarAccess.getJSONModelRule()); } 
	 EOF 
;

// Rule JSONModel
ruleJSONModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getJSONModelAccess().getRootObjectAssignment()); }
(rule__JSONModel__RootObjectAssignment)?
{ after(grammarAccess.getJSONModelAccess().getRootObjectAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleJSONObject
entryRuleJSONObject 
@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getJSONObjectRule()); }
	 ruleJSONObject
{ after(grammarAccess.getJSONObjectRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule JSONObject
ruleJSONObject
    @init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getJSONObjectAccess().getGroup()); }
(rule__JSONObject__Group__0)
{ after(grammarAccess.getJSONObjectAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}



// Entry rule entryRulePair
entryRulePair 
@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getPairRule()); }
	 rulePair
{ after(grammarAccess.getPairRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Pair
rulePair
    @init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPairAccess().getGroup()); }
(rule__Pair__Group__0)
{ after(grammarAccess.getPairAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}



// Entry rule entryRuleKey
entryRuleKey 
:
{ before(grammarAccess.getKeyRule()); }
	 ruleKey
{ after(grammarAccess.getKeyRule()); } 
	 EOF 
;

// Rule Key
ruleKey
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getKeyAccess().getNameAssignment()); }
(rule__Key__NameAssignment)
{ after(grammarAccess.getKeyAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleJSONArray
entryRuleJSONArray 
@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getJSONArrayRule()); }
	 ruleJSONArray
{ after(grammarAccess.getJSONArrayRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule JSONArray
ruleJSONArray
    @init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getJSONArrayAccess().getGroup()); }
(rule__JSONArray__Group__0)
{ after(grammarAccess.getJSONArrayAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}



// Entry rule entryRuleValue
entryRuleValue 
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueAccess().getAlternatives()); }
(rule__Value__Alternatives)
{ after(grammarAccess.getValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleJSONSimpleValue
entryRuleJSONSimpleValue 
:
{ before(grammarAccess.getJSONSimpleValueRule()); }
	 ruleJSONSimpleValue
{ after(grammarAccess.getJSONSimpleValueRule()); } 
	 EOF 
;

// Rule JSONSimpleValue
ruleJSONSimpleValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getJSONSimpleValueAccess().getAlternatives()); }
(rule__JSONSimpleValue__Alternatives)
{ after(grammarAccess.getJSONSimpleValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQuotedChars
entryRuleQuotedChars 
:
{ before(grammarAccess.getQuotedCharsRule()); }
	 ruleQuotedChars
{ after(grammarAccess.getQuotedCharsRule()); } 
	 EOF 
;

// Rule QuotedChars
ruleQuotedChars
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQuotedCharsAccess().getValueAssignment()); }
(rule__QuotedChars__ValueAssignment)
{ after(grammarAccess.getQuotedCharsAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNumber
entryRuleNumber 
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNumberAccess().getValueAssignment()); }
(rule__Number__ValueAssignment)
{ after(grammarAccess.getNumberAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNull
entryRuleNull 
:
{ before(grammarAccess.getNullRule()); }
	 ruleNull
{ after(grammarAccess.getNullRule()); } 
	 EOF 
;

// Rule Null
ruleNull
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNullAccess().getValueAssignment()); }
(rule__Null__ValueAssignment)
{ after(grammarAccess.getNullAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFalse
entryRuleFalse 
:
{ before(grammarAccess.getFalseRule()); }
	 ruleFalse
{ after(grammarAccess.getFalseRule()); } 
	 EOF 
;

// Rule False
ruleFalse
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFalseAccess().getValueAssignment()); }
(rule__False__ValueAssignment)
{ after(grammarAccess.getFalseAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTrue
entryRuleTrue 
:
{ before(grammarAccess.getTrueRule()); }
	 ruleTrue
{ after(grammarAccess.getTrueRule()); } 
	 EOF 
;

// Rule True
ruleTrue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTrueAccess().getValueAssignment()); }
(rule__True__ValueAssignment)
{ after(grammarAccess.getTrueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Value__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getJSONArrayParserRuleCall_0()); }
	ruleJSONArray
{ after(grammarAccess.getValueAccess().getJSONArrayParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getValueAccess().getJSONObjectParserRuleCall_1()); }
	ruleJSONObject
{ after(grammarAccess.getValueAccess().getJSONObjectParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getValueAccess().getJSONSimpleValueParserRuleCall_2()); }
	ruleJSONSimpleValue
{ after(grammarAccess.getValueAccess().getJSONSimpleValueParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__JSONSimpleValue__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONSimpleValueAccess().getQuotedCharsParserRuleCall_0()); }
	ruleQuotedChars
{ after(grammarAccess.getJSONSimpleValueAccess().getQuotedCharsParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getJSONSimpleValueAccess().getNumberParserRuleCall_1()); }
	ruleNumber
{ after(grammarAccess.getJSONSimpleValueAccess().getNumberParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getJSONSimpleValueAccess().getNullParserRuleCall_2()); }
	ruleNull
{ after(grammarAccess.getJSONSimpleValueAccess().getNullParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getJSONSimpleValueAccess().getTrueParserRuleCall_3()); }
	ruleTrue
{ after(grammarAccess.getJSONSimpleValueAccess().getTrueParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getJSONSimpleValueAccess().getFalseParserRuleCall_4()); }
	ruleFalse
{ after(grammarAccess.getJSONSimpleValueAccess().getFalseParserRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__JSONObject__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group__0__Impl
	rule__JSONObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getJSONObjectAction_0()); }
(

)
{ after(grammarAccess.getJSONObjectAccess().getJSONObjectAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONObject__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group__1__Impl
	rule__JSONObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getJSONObjectAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONObject__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group__2__Impl
	rule__JSONObject__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getGroup_2()); }
(rule__JSONObject__Group_2__0)?
{ after(grammarAccess.getJSONObjectAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONObject__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getJSONObjectAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__JSONObject__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group_2__0__Impl
	rule__JSONObject__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getPairsAssignment_2_0()); }
(rule__JSONObject__PairsAssignment_2_0)
{ after(grammarAccess.getJSONObjectAccess().getPairsAssignment_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONObject__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getGroup_2_1()); }
(rule__JSONObject__Group_2_1__0)*
{ after(grammarAccess.getJSONObjectAccess().getGroup_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__JSONObject__Group_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group_2_1__0__Impl
	rule__JSONObject__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getTERMINAL_COMMATerminalRuleCall_2_1_0()); }
	RULE_TERMINAL_COMMA
{ after(grammarAccess.getJSONObjectAccess().getTERMINAL_COMMATerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONObject__Group_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONObject__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__Group_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getPairsAssignment_2_1_1()); }
(rule__JSONObject__PairsAssignment_2_1_1)
{ after(grammarAccess.getJSONObjectAccess().getPairsAssignment_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Pair__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Pair__Group__0__Impl
	rule__Pair__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPairAccess().getKeyAssignment_0()); }
(rule__Pair__KeyAssignment_0)
{ after(grammarAccess.getPairAccess().getKeyAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Pair__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Pair__Group__1__Impl
	rule__Pair__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPairAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getPairAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Pair__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Pair__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPairAccess().getValueAssignment_2()); }
(rule__Pair__ValueAssignment_2)
{ after(grammarAccess.getPairAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__JSONArray__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONArray__Group__0__Impl
	rule__JSONArray__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getLeftSquareBracketKeyword_0()); }

	'[' 

{ after(grammarAccess.getJSONArrayAccess().getLeftSquareBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONArray__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONArray__Group__1__Impl
	rule__JSONArray__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getElementsAssignment_1()); }
(rule__JSONArray__ElementsAssignment_1)
{ after(grammarAccess.getJSONArrayAccess().getElementsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONArray__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONArray__Group__2__Impl
	rule__JSONArray__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getGroup_2()); }
(rule__JSONArray__Group_2__0)*
{ after(grammarAccess.getJSONArrayAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONArray__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONArray__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getRightSquareBracketKeyword_3()); }

	']' 

{ after(grammarAccess.getJSONArrayAccess().getRightSquareBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__JSONArray__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONArray__Group_2__0__Impl
	rule__JSONArray__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getTERMINAL_COMMATerminalRuleCall_2_0()); }
	RULE_TERMINAL_COMMA
{ after(grammarAccess.getJSONArrayAccess().getTERMINAL_COMMATerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__JSONArray__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__JSONArray__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getElementsAssignment_2_1()); }
(rule__JSONArray__ElementsAssignment_2_1)
{ after(grammarAccess.getJSONArrayAccess().getElementsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__JSONModel__RootObjectAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONModelAccess().getRootObjectJSONObjectParserRuleCall_0()); }
	ruleJSONObject{ after(grammarAccess.getJSONModelAccess().getRootObjectJSONObjectParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__PairsAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getPairsPairParserRuleCall_2_0_0()); }
	rulePair{ after(grammarAccess.getJSONObjectAccess().getPairsPairParserRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__JSONObject__PairsAssignment_2_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONObjectAccess().getPairsPairParserRuleCall_2_1_1_0()); }
	rulePair{ after(grammarAccess.getJSONObjectAccess().getPairsPairParserRuleCall_2_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__KeyAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPairAccess().getKeyKeyParserRuleCall_0_0()); }
	ruleKey{ after(grammarAccess.getPairAccess().getKeyKeyParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); }
	ruleValue{ after(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Key__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getKeyAccess().getNameTERMINAL_QUOTED_CHARSTerminalRuleCall_0()); }
	RULE_TERMINAL_QUOTED_CHARS{ after(grammarAccess.getKeyAccess().getNameTERMINAL_QUOTED_CHARSTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__ElementsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getElementsValueParserRuleCall_1_0()); }
	ruleValue{ after(grammarAccess.getJSONArrayAccess().getElementsValueParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__JSONArray__ElementsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getJSONArrayAccess().getElementsValueParserRuleCall_2_1_0()); }
	ruleValue{ after(grammarAccess.getJSONArrayAccess().getElementsValueParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__QuotedChars__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQuotedCharsAccess().getValueTERMINAL_QUOTED_CHARSTerminalRuleCall_0()); }
	RULE_TERMINAL_QUOTED_CHARS{ after(grammarAccess.getQuotedCharsAccess().getValueTERMINAL_QUOTED_CHARSTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Number__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNumberAccess().getValueTERMINAL_NUMBERTerminalRuleCall_0()); }
	RULE_TERMINAL_NUMBER{ after(grammarAccess.getNumberAccess().getValueTERMINAL_NUMBERTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Null__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNullAccess().getValueTERMINAL_NULLTerminalRuleCall_0()); }
	RULE_TERMINAL_NULL{ after(grammarAccess.getNullAccess().getValueTERMINAL_NULLTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__False__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFalseAccess().getValueTERMINAL_FALSETerminalRuleCall_0()); }
	RULE_TERMINAL_FALSE{ after(grammarAccess.getFalseAccess().getValueTERMINAL_FALSETerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__True__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTrueAccess().getValueTERMINAL_TRUETerminalRuleCall_0()); }
	RULE_TERMINAL_TRUE{ after(grammarAccess.getTrueAccess().getValueTERMINAL_TRUETerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_TERMINAL_QUOTED_CHARS : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_TERMINAL_NUMBER : '-'? ('0'|RULE_DIGIT_1_9 RULE_DIGIT*) ('.' RULE_DIGIT+)? (RULE_EXP RULE_PLUS_MINUS? RULE_DIGIT+)?;

fragment RULE_DIGIT_1_9 : '1'..'9';

fragment RULE_DIGIT : '0'..'9';

fragment RULE_EXP : ('e'|'E');

fragment RULE_PLUS_MINUS : ('+'|'-');

RULE_TERMINAL_NULL : 'null';

RULE_TERMINAL_FALSE : 'false';

RULE_TERMINAL_TRUE : 'true';

RULE_TERMINAL_COMMA : ',';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

