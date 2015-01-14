package org.jboss.tools.json.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.jboss.tools.json.services.JSONGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TERMINAL_COMMA", "RULE_TERMINAL_QUOTED_CHARS", "RULE_TERMINAL_NUMBER", "RULE_TERMINAL_NULL", "RULE_TERMINAL_FALSE", "RULE_TERMINAL_TRUE", "RULE_DIGIT_1_9", "RULE_DIGIT", "RULE_EXP", "RULE_PLUS_MINUS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "'['", "']'"
    };
    public static final int RULE_ID=14;
    public static final int RULE_EXP=12;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_TERMINAL_NULL=7;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=18;
    public static final int EOF=-1;
    public static final int RULE_TERMINAL_QUOTED_CHARS=5;
    public static final int RULE_TERMINAL_TRUE=9;
    public static final int RULE_ML_COMMENT=17;
    public static final int RULE_TERMINAL_COMMA=4;
    public static final int RULE_PLUS_MINUS=13;
    public static final int RULE_STRING=16;
    public static final int RULE_TERMINAL_FALSE=8;
    public static final int RULE_INT=15;
    public static final int RULE_DIGIT_1_9=10;
    public static final int RULE_WS=19;
    public static final int RULE_TERMINAL_NUMBER=6;
    public static final int RULE_DIGIT=11;

    // delegates
    // delegators


        public InternalJSONParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJSONParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJSONParser.tokenNames; }
    public String getGrammarFileName() { return "../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g"; }



     	private JSONGrammarAccess grammarAccess;
     	
        public InternalJSONParser(TokenStream input, JSONGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "JSONModel";	
       	}
       	
       	@Override
       	protected JSONGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJSONModel"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:67:1: entryRuleJSONModel returns [EObject current=null] : iv_ruleJSONModel= ruleJSONModel EOF ;
    public final EObject entryRuleJSONModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONModel = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:68:2: (iv_ruleJSONModel= ruleJSONModel EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:69:2: iv_ruleJSONModel= ruleJSONModel EOF
            {
             newCompositeNode(grammarAccess.getJSONModelRule()); 
            pushFollow(FOLLOW_ruleJSONModel_in_entryRuleJSONModel75);
            iv_ruleJSONModel=ruleJSONModel();

            state._fsp--;

             current =iv_ruleJSONModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJSONModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSONModel"


    // $ANTLR start "ruleJSONModel"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:76:1: ruleJSONModel returns [EObject current=null] : ( (lv_rootObject_0_0= ruleJSONObject ) )? ;
    public final EObject ruleJSONModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rootObject_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:79:28: ( ( (lv_rootObject_0_0= ruleJSONObject ) )? )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:80:1: ( (lv_rootObject_0_0= ruleJSONObject ) )?
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:80:1: ( (lv_rootObject_0_0= ruleJSONObject ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:81:1: (lv_rootObject_0_0= ruleJSONObject )
                    {
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:81:1: (lv_rootObject_0_0= ruleJSONObject )
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:82:3: lv_rootObject_0_0= ruleJSONObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getJSONModelAccess().getRootObjectJSONObjectParserRuleCall_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJSONObject_in_ruleJSONModel130);
                    lv_rootObject_0_0=ruleJSONObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJSONModelRule());
                    	        }
                           		set(
                           			current, 
                           			"rootObject",
                            		lv_rootObject_0_0, 
                            		"JSONObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONModel"


    // $ANTLR start "entryRuleJSONObject"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:106:1: entryRuleJSONObject returns [EObject current=null] : iv_ruleJSONObject= ruleJSONObject EOF ;
    public final EObject entryRuleJSONObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONObject = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:110:2: (iv_ruleJSONObject= ruleJSONObject EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:111:2: iv_ruleJSONObject= ruleJSONObject EOF
            {
             newCompositeNode(grammarAccess.getJSONObjectRule()); 
            pushFollow(FOLLOW_ruleJSONObject_in_entryRuleJSONObject172);
            iv_ruleJSONObject=ruleJSONObject();

            state._fsp--;

             current =iv_ruleJSONObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJSONObject182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJSONObject"


    // $ANTLR start "ruleJSONObject"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:121:1: ruleJSONObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJSONObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TERMINAL_COMMA_3=null;
        Token otherlv_5=null;
        EObject lv_pairs_2_0 = null;

        EObject lv_pairs_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:125:28: ( ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:126:1: ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:126:1: ( () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}' )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:126:2: () otherlv_1= '{' ( ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )* )? otherlv_5= '}'
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:126:2: ()
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:127:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJSONObjectAccess().getJSONObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJSONObject232); 

                	newLeafNode(otherlv_1, grammarAccess.getJSONObjectAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:136:1: ( ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TERMINAL_QUOTED_CHARS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:136:2: ( (lv_pairs_2_0= rulePair ) ) (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )*
                    {
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:136:2: ( (lv_pairs_2_0= rulePair ) )
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:137:1: (lv_pairs_2_0= rulePair )
                    {
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:137:1: (lv_pairs_2_0= rulePair )
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:138:3: lv_pairs_2_0= rulePair
                    {
                     
                    	        newCompositeNode(grammarAccess.getJSONObjectAccess().getPairsPairParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePair_in_ruleJSONObject254);
                    lv_pairs_2_0=rulePair();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJSONObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"pairs",
                            		lv_pairs_2_0, 
                            		"Pair");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:154:2: (this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_TERMINAL_COMMA) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:154:3: this_TERMINAL_COMMA_3= RULE_TERMINAL_COMMA ( (lv_pairs_4_0= rulePair ) )
                    	    {
                    	    this_TERMINAL_COMMA_3=(Token)match(input,RULE_TERMINAL_COMMA,FOLLOW_RULE_TERMINAL_COMMA_in_ruleJSONObject266); 
                    	     
                    	        newLeafNode(this_TERMINAL_COMMA_3, grammarAccess.getJSONObjectAccess().getTERMINAL_COMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:158:1: ( (lv_pairs_4_0= rulePair ) )
                    	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:159:1: (lv_pairs_4_0= rulePair )
                    	    {
                    	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:159:1: (lv_pairs_4_0= rulePair )
                    	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:160:3: lv_pairs_4_0= rulePair
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJSONObjectAccess().getPairsPairParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePair_in_ruleJSONObject286);
                    	    lv_pairs_4_0=rulePair();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJSONObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pairs",
                    	            		lv_pairs_4_0, 
                    	            		"Pair");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleJSONObject302); 

                	newLeafNode(otherlv_5, grammarAccess.getJSONObjectAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJSONObject"


    // $ANTLR start "entryRulePair"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:191:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:195:2: (iv_rulePair= rulePair EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:196:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair348);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:206:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:210:28: ( ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:211:1: ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:211:1: ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:211:2: ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:211:2: ( (lv_key_0_0= ruleKey ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:212:1: (lv_key_0_0= ruleKey )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:212:1: (lv_key_0_0= ruleKey )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:213:3: lv_key_0_0= ruleKey
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getKeyKeyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleKey_in_rulePair408);
            lv_key_0_0=ruleKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"Key");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulePair420); 

                	newLeafNode(otherlv_1, grammarAccess.getPairAccess().getColonKeyword_1());
                
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:233:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:234:1: (lv_value_2_0= ruleValue )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:234:1: (lv_value_2_0= ruleValue )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:235:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePair441);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleKey"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:262:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:263:2: (iv_ruleKey= ruleKey EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:264:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey481);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:271:1: ruleKey returns [EObject current=null] : ( (lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:274:28: ( ( (lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:275:1: ( (lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:275:1: ( (lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:276:1: (lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:276:1: (lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:277:3: lv_name_0_0= RULE_TERMINAL_QUOTED_CHARS
            {
            lv_name_0_0=(Token)match(input,RULE_TERMINAL_QUOTED_CHARS,FOLLOW_RULE_TERMINAL_QUOTED_CHARS_in_ruleKey532); 

            			newLeafNode(lv_name_0_0, grammarAccess.getKeyAccess().getNameTERMINAL_QUOTED_CHARSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TERMINAL_QUOTED_CHARS");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleJSONArray"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:301:1: entryRuleJSONArray returns [EObject current=null] : iv_ruleJSONArray= ruleJSONArray EOF ;
    public final EObject entryRuleJSONArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONArray = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:305:2: (iv_ruleJSONArray= ruleJSONArray EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:306:2: iv_ruleJSONArray= ruleJSONArray EOF
            {
             newCompositeNode(grammarAccess.getJSONArrayRule()); 
            pushFollow(FOLLOW_ruleJSONArray_in_entryRuleJSONArray578);
            iv_ruleJSONArray=ruleJSONArray();

            state._fsp--;

             current =iv_ruleJSONArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJSONArray588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJSONArray"


    // $ANTLR start "ruleJSONArray"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:316:1: ruleJSONArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleValue ) ) (this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleJSONArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_TERMINAL_COMMA_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:320:28: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleValue ) ) (this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) ) )* otherlv_4= ']' ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:321:1: (otherlv_0= '[' ( (lv_elements_1_0= ruleValue ) ) (this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) ) )* otherlv_4= ']' )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:321:1: (otherlv_0= '[' ( (lv_elements_1_0= ruleValue ) ) (this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) ) )* otherlv_4= ']' )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:321:3: otherlv_0= '[' ( (lv_elements_1_0= ruleValue ) ) (this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleJSONArray629); 

                	newLeafNode(otherlv_0, grammarAccess.getJSONArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:325:1: ( (lv_elements_1_0= ruleValue ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:326:1: (lv_elements_1_0= ruleValue )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:326:1: (lv_elements_1_0= ruleValue )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:327:3: lv_elements_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getJSONArrayAccess().getElementsValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleJSONArray650);
            lv_elements_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJSONArrayRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_1_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:343:2: (this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TERMINAL_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:343:3: this_TERMINAL_COMMA_2= RULE_TERMINAL_COMMA ( (lv_elements_3_0= ruleValue ) )
            	    {
            	    this_TERMINAL_COMMA_2=(Token)match(input,RULE_TERMINAL_COMMA,FOLLOW_RULE_TERMINAL_COMMA_in_ruleJSONArray662); 
            	     
            	        newLeafNode(this_TERMINAL_COMMA_2, grammarAccess.getJSONArrayAccess().getTERMINAL_COMMATerminalRuleCall_2_0()); 
            	        
            	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:347:1: ( (lv_elements_3_0= ruleValue ) )
            	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:348:1: (lv_elements_3_0= ruleValue )
            	    {
            	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:348:1: (lv_elements_3_0= ruleValue )
            	    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:349:3: lv_elements_3_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJSONArrayAccess().getElementsValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleJSONArray682);
            	    lv_elements_3_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJSONArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleJSONArray696); 

                	newLeafNode(otherlv_4, grammarAccess.getJSONArrayAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJSONArray"


    // $ANTLR start "entryRuleValue"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:380:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:381:2: (iv_ruleValue= ruleValue EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:382:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue736);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue746); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:389:1: ruleValue returns [EObject current=null] : (this_JSONArray_0= ruleJSONArray | this_JSONObject_1= ruleJSONObject | this_JSONSimpleValue_2= ruleJSONSimpleValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_JSONArray_0 = null;

        EObject this_JSONObject_1 = null;

        EObject this_JSONSimpleValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:392:28: ( (this_JSONArray_0= ruleJSONArray | this_JSONObject_1= ruleJSONObject | this_JSONSimpleValue_2= ruleJSONSimpleValue ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:393:1: (this_JSONArray_0= ruleJSONArray | this_JSONObject_1= ruleJSONObject | this_JSONSimpleValue_2= ruleJSONSimpleValue )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:393:1: (this_JSONArray_0= ruleJSONArray | this_JSONObject_1= ruleJSONObject | this_JSONSimpleValue_2= ruleJSONSimpleValue )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case RULE_TERMINAL_QUOTED_CHARS:
            case RULE_TERMINAL_NUMBER:
            case RULE_TERMINAL_NULL:
            case RULE_TERMINAL_FALSE:
            case RULE_TERMINAL_TRUE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:394:5: this_JSONArray_0= ruleJSONArray
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getJSONArrayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJSONArray_in_ruleValue793);
                    this_JSONArray_0=ruleJSONArray();

                    state._fsp--;

                     
                            current = this_JSONArray_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:404:5: this_JSONObject_1= ruleJSONObject
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getJSONObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJSONObject_in_ruleValue820);
                    this_JSONObject_1=ruleJSONObject();

                    state._fsp--;

                     
                            current = this_JSONObject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:414:5: this_JSONSimpleValue_2= ruleJSONSimpleValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getJSONSimpleValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleJSONSimpleValue_in_ruleValue847);
                    this_JSONSimpleValue_2=ruleJSONSimpleValue();

                    state._fsp--;

                     
                            current = this_JSONSimpleValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleJSONSimpleValue"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:430:1: entryRuleJSONSimpleValue returns [EObject current=null] : iv_ruleJSONSimpleValue= ruleJSONSimpleValue EOF ;
    public final EObject entryRuleJSONSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONSimpleValue = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:431:2: (iv_ruleJSONSimpleValue= ruleJSONSimpleValue EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:432:2: iv_ruleJSONSimpleValue= ruleJSONSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getJSONSimpleValueRule()); 
            pushFollow(FOLLOW_ruleJSONSimpleValue_in_entryRuleJSONSimpleValue882);
            iv_ruleJSONSimpleValue=ruleJSONSimpleValue();

            state._fsp--;

             current =iv_ruleJSONSimpleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJSONSimpleValue892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSONSimpleValue"


    // $ANTLR start "ruleJSONSimpleValue"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:439:1: ruleJSONSimpleValue returns [EObject current=null] : (this_QuotedChars_0= ruleQuotedChars | this_Number_1= ruleNumber | this_Null_2= ruleNull | this_True_3= ruleTrue | this_False_4= ruleFalse ) ;
    public final EObject ruleJSONSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject this_QuotedChars_0 = null;

        EObject this_Number_1 = null;

        EObject this_Null_2 = null;

        EObject this_True_3 = null;

        EObject this_False_4 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:442:28: ( (this_QuotedChars_0= ruleQuotedChars | this_Number_1= ruleNumber | this_Null_2= ruleNull | this_True_3= ruleTrue | this_False_4= ruleFalse ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:443:1: (this_QuotedChars_0= ruleQuotedChars | this_Number_1= ruleNumber | this_Null_2= ruleNull | this_True_3= ruleTrue | this_False_4= ruleFalse )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:443:1: (this_QuotedChars_0= ruleQuotedChars | this_Number_1= ruleNumber | this_Null_2= ruleNull | this_True_3= ruleTrue | this_False_4= ruleFalse )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_TERMINAL_QUOTED_CHARS:
                {
                alt6=1;
                }
                break;
            case RULE_TERMINAL_NUMBER:
                {
                alt6=2;
                }
                break;
            case RULE_TERMINAL_NULL:
                {
                alt6=3;
                }
                break;
            case RULE_TERMINAL_TRUE:
                {
                alt6=4;
                }
                break;
            case RULE_TERMINAL_FALSE:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:444:5: this_QuotedChars_0= ruleQuotedChars
                    {
                     
                            newCompositeNode(grammarAccess.getJSONSimpleValueAccess().getQuotedCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQuotedChars_in_ruleJSONSimpleValue939);
                    this_QuotedChars_0=ruleQuotedChars();

                    state._fsp--;

                     
                            current = this_QuotedChars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:454:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getJSONSimpleValueAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleJSONSimpleValue966);
                    this_Number_1=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:464:5: this_Null_2= ruleNull
                    {
                     
                            newCompositeNode(grammarAccess.getJSONSimpleValueAccess().getNullParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNull_in_ruleJSONSimpleValue993);
                    this_Null_2=ruleNull();

                    state._fsp--;

                     
                            current = this_Null_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:474:5: this_True_3= ruleTrue
                    {
                     
                            newCompositeNode(grammarAccess.getJSONSimpleValueAccess().getTrueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTrue_in_ruleJSONSimpleValue1020);
                    this_True_3=ruleTrue();

                    state._fsp--;

                     
                            current = this_True_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:484:5: this_False_4= ruleFalse
                    {
                     
                            newCompositeNode(grammarAccess.getJSONSimpleValueAccess().getFalseParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFalse_in_ruleJSONSimpleValue1047);
                    this_False_4=ruleFalse();

                    state._fsp--;

                     
                            current = this_False_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONSimpleValue"


    // $ANTLR start "entryRuleQuotedChars"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:500:1: entryRuleQuotedChars returns [EObject current=null] : iv_ruleQuotedChars= ruleQuotedChars EOF ;
    public final EObject entryRuleQuotedChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedChars = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:501:2: (iv_ruleQuotedChars= ruleQuotedChars EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:502:2: iv_ruleQuotedChars= ruleQuotedChars EOF
            {
             newCompositeNode(grammarAccess.getQuotedCharsRule()); 
            pushFollow(FOLLOW_ruleQuotedChars_in_entryRuleQuotedChars1082);
            iv_ruleQuotedChars=ruleQuotedChars();

            state._fsp--;

             current =iv_ruleQuotedChars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedChars1092); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedChars"


    // $ANTLR start "ruleQuotedChars"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:509:1: ruleQuotedChars returns [EObject current=null] : ( (lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS ) ) ;
    public final EObject ruleQuotedChars() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:512:28: ( ( (lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:513:1: ( (lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:513:1: ( (lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:514:1: (lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:514:1: (lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:515:3: lv_value_0_0= RULE_TERMINAL_QUOTED_CHARS
            {
            lv_value_0_0=(Token)match(input,RULE_TERMINAL_QUOTED_CHARS,FOLLOW_RULE_TERMINAL_QUOTED_CHARS_in_ruleQuotedChars1133); 

            			newLeafNode(lv_value_0_0, grammarAccess.getQuotedCharsAccess().getValueTERMINAL_QUOTED_CHARSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuotedCharsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TERMINAL_QUOTED_CHARS");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotedChars"


    // $ANTLR start "entryRuleNumber"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:539:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:540:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:541:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1173);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1183); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:548:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_TERMINAL_NUMBER ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:551:28: ( ( (lv_value_0_0= RULE_TERMINAL_NUMBER ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:552:1: ( (lv_value_0_0= RULE_TERMINAL_NUMBER ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:552:1: ( (lv_value_0_0= RULE_TERMINAL_NUMBER ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:553:1: (lv_value_0_0= RULE_TERMINAL_NUMBER )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:553:1: (lv_value_0_0= RULE_TERMINAL_NUMBER )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:554:3: lv_value_0_0= RULE_TERMINAL_NUMBER
            {
            lv_value_0_0=(Token)match(input,RULE_TERMINAL_NUMBER,FOLLOW_RULE_TERMINAL_NUMBER_in_ruleNumber1224); 

            			newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueTERMINAL_NUMBERTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TERMINAL_NUMBER");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleNull"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:578:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:579:2: (iv_ruleNull= ruleNull EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:580:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_ruleNull_in_entryRuleNull1264);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNull1274); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:587:1: ruleNull returns [EObject current=null] : ( (lv_value_0_0= RULE_TERMINAL_NULL ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:590:28: ( ( (lv_value_0_0= RULE_TERMINAL_NULL ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:591:1: ( (lv_value_0_0= RULE_TERMINAL_NULL ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:591:1: ( (lv_value_0_0= RULE_TERMINAL_NULL ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:592:1: (lv_value_0_0= RULE_TERMINAL_NULL )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:592:1: (lv_value_0_0= RULE_TERMINAL_NULL )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:593:3: lv_value_0_0= RULE_TERMINAL_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_TERMINAL_NULL,FOLLOW_RULE_TERMINAL_NULL_in_ruleNull1315); 

            			newLeafNode(lv_value_0_0, grammarAccess.getNullAccess().getValueTERMINAL_NULLTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TERMINAL_NULL");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleFalse"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:617:1: entryRuleFalse returns [EObject current=null] : iv_ruleFalse= ruleFalse EOF ;
    public final EObject entryRuleFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalse = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:618:2: (iv_ruleFalse= ruleFalse EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:619:2: iv_ruleFalse= ruleFalse EOF
            {
             newCompositeNode(grammarAccess.getFalseRule()); 
            pushFollow(FOLLOW_ruleFalse_in_entryRuleFalse1355);
            iv_ruleFalse=ruleFalse();

            state._fsp--;

             current =iv_ruleFalse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFalse1365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFalse"


    // $ANTLR start "ruleFalse"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:626:1: ruleFalse returns [EObject current=null] : ( (lv_value_0_0= RULE_TERMINAL_FALSE ) ) ;
    public final EObject ruleFalse() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:629:28: ( ( (lv_value_0_0= RULE_TERMINAL_FALSE ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:630:1: ( (lv_value_0_0= RULE_TERMINAL_FALSE ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:630:1: ( (lv_value_0_0= RULE_TERMINAL_FALSE ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:631:1: (lv_value_0_0= RULE_TERMINAL_FALSE )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:631:1: (lv_value_0_0= RULE_TERMINAL_FALSE )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:632:3: lv_value_0_0= RULE_TERMINAL_FALSE
            {
            lv_value_0_0=(Token)match(input,RULE_TERMINAL_FALSE,FOLLOW_RULE_TERMINAL_FALSE_in_ruleFalse1406); 

            			newLeafNode(lv_value_0_0, grammarAccess.getFalseAccess().getValueTERMINAL_FALSETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFalseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TERMINAL_FALSE");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFalse"


    // $ANTLR start "entryRuleTrue"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:656:1: entryRuleTrue returns [EObject current=null] : iv_ruleTrue= ruleTrue EOF ;
    public final EObject entryRuleTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrue = null;


        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:657:2: (iv_ruleTrue= ruleTrue EOF )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:658:2: iv_ruleTrue= ruleTrue EOF
            {
             newCompositeNode(grammarAccess.getTrueRule()); 
            pushFollow(FOLLOW_ruleTrue_in_entryRuleTrue1446);
            iv_ruleTrue=ruleTrue();

            state._fsp--;

             current =iv_ruleTrue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrue1456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrue"


    // $ANTLR start "ruleTrue"
    // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:665:1: ruleTrue returns [EObject current=null] : ( (lv_value_0_0= RULE_TERMINAL_TRUE ) ) ;
    public final EObject ruleTrue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:668:28: ( ( (lv_value_0_0= RULE_TERMINAL_TRUE ) ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:669:1: ( (lv_value_0_0= RULE_TERMINAL_TRUE ) )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:669:1: ( (lv_value_0_0= RULE_TERMINAL_TRUE ) )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:670:1: (lv_value_0_0= RULE_TERMINAL_TRUE )
            {
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:670:1: (lv_value_0_0= RULE_TERMINAL_TRUE )
            // ../org.jboss.tools.json.core/src-gen/org/jboss/tools/json/parser/antlr/internal/InternalJSON.g:671:3: lv_value_0_0= RULE_TERMINAL_TRUE
            {
            lv_value_0_0=(Token)match(input,RULE_TERMINAL_TRUE,FOLLOW_RULE_TERMINAL_TRUE_in_ruleTrue1497); 

            			newLeafNode(lv_value_0_0, grammarAccess.getTrueAccess().getValueTERMINAL_TRUETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TERMINAL_TRUE");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJSONModel_in_entryRuleJSONModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJSONModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONObject_in_ruleJSONModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONObject_in_entryRuleJSONObject172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJSONObject182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJSONObject232 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rulePair_in_ruleJSONObject254 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_TERMINAL_COMMA_in_ruleJSONObject266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePair_in_ruleJSONObject286 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleJSONObject302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rulePair408 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePair420 = new BitSet(new long[]{0x00000000012003E0L});
    public static final BitSet FOLLOW_ruleValue_in_rulePair441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERMINAL_QUOTED_CHARS_in_ruleKey532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONArray_in_entryRuleJSONArray578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJSONArray588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleJSONArray629 = new BitSet(new long[]{0x00000000012003E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleJSONArray650 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_RULE_TERMINAL_COMMA_in_ruleJSONArray662 = new BitSet(new long[]{0x00000000012003E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleJSONArray682 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleJSONArray696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONArray_in_ruleValue793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONObject_in_ruleValue820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONSimpleValue_in_ruleValue847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSONSimpleValue_in_entryRuleJSONSimpleValue882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJSONSimpleValue892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedChars_in_ruleJSONSimpleValue939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleJSONSimpleValue966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_ruleJSONSimpleValue993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrue_in_ruleJSONSimpleValue1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalse_in_ruleJSONSimpleValue1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedChars_in_entryRuleQuotedChars1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedChars1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERMINAL_QUOTED_CHARS_in_ruleQuotedChars1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERMINAL_NUMBER_in_ruleNumber1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNull_in_entryRuleNull1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNull1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERMINAL_NULL_in_ruleNull1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalse_in_entryRuleFalse1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFalse1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERMINAL_FALSE_in_ruleFalse1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrue_in_entryRuleTrue1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrue1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TERMINAL_TRUE_in_ruleTrue1497 = new BitSet(new long[]{0x0000000000000002L});

}