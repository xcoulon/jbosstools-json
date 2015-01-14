package org.jboss.tools.json.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONLexer extends Lexer {
    public static final int RULE_EXP=12;
    public static final int RULE_ID=14;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_TERMINAL_NULL=7;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=18;
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
    public static final int RULE_DIGIT=11;
    public static final int RULE_TERMINAL_NUMBER=6;

    // delegates
    // delegators

    public InternalJSONLexer() {;} 
    public InternalJSONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJSONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:11:7: ( '{' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:12:7: ( '}' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:13:7: ( ':' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:14:7: ( '[' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:15:7: ( ']' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_TERMINAL_QUOTED_CHARS"
    public final void mRULE_TERMINAL_QUOTED_CHARS() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_QUOTED_CHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1220:28: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1220:30: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1220:34: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1220:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1220:80: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_QUOTED_CHARS"

    // $ANTLR start "RULE_TERMINAL_NUMBER"
    public final void mRULE_TERMINAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:22: ( ( '-' )? ( '0' | RULE_DIGIT_1_9 ( RULE_DIGIT )* ) ( '.' ( RULE_DIGIT )+ )? ( RULE_EXP ( RULE_PLUS_MINUS )? ( RULE_DIGIT )+ )? )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:24: ( '-' )? ( '0' | RULE_DIGIT_1_9 ( RULE_DIGIT )* ) ( '.' ( RULE_DIGIT )+ )? ( RULE_EXP ( RULE_PLUS_MINUS )? ( RULE_DIGIT )+ )?
            {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:24: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:24: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:29: ( '0' | RULE_DIGIT_1_9 ( RULE_DIGIT )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:30: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:34: RULE_DIGIT_1_9 ( RULE_DIGIT )*
                    {
                    mRULE_DIGIT_1_9(); 
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:49: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:49: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:62: ( '.' ( RULE_DIGIT )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:63: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:67: ( RULE_DIGIT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:67: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:81: ( RULE_EXP ( RULE_PLUS_MINUS )? ( RULE_DIGIT )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:82: RULE_EXP ( RULE_PLUS_MINUS )? ( RULE_DIGIT )+
                    {
                    mRULE_EXP(); 
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:91: ( RULE_PLUS_MINUS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:91: RULE_PLUS_MINUS
                            {
                            mRULE_PLUS_MINUS(); 

                            }
                            break;

                    }

                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:108: ( RULE_DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1222:108: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_NUMBER"

    // $ANTLR start "RULE_DIGIT_1_9"
    public final void mRULE_DIGIT_1_9() throws RecognitionException {
        try {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1224:25: ( '1' .. '9' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1224:27: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_1_9"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1226:21: ( '0' .. '9' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1226:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXP"
    public final void mRULE_EXP() throws RecognitionException {
        try {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1228:19: ( ( 'e' | 'E' ) )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1228:21: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP"

    // $ANTLR start "RULE_PLUS_MINUS"
    public final void mRULE_PLUS_MINUS() throws RecognitionException {
        try {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1230:26: ( ( '+' | '-' ) )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1230:28: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS_MINUS"

    // $ANTLR start "RULE_TERMINAL_NULL"
    public final void mRULE_TERMINAL_NULL() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1232:20: ( 'null' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1232:22: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_NULL"

    // $ANTLR start "RULE_TERMINAL_FALSE"
    public final void mRULE_TERMINAL_FALSE() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1234:21: ( 'false' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1234:23: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_FALSE"

    // $ANTLR start "RULE_TERMINAL_TRUE"
    public final void mRULE_TERMINAL_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1236:20: ( 'true' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1236:22: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_TRUE"

    // $ANTLR start "RULE_TERMINAL_COMMA"
    public final void mRULE_TERMINAL_COMMA() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1238:21: ( ',' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1238:23: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_COMMA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1240:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1240:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1240:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1240:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1240:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1242:10: ( ( '0' .. '9' )+ )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1242:12: ( '0' .. '9' )+
            {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1242:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1242:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1244:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1246:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1246:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1246:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1246:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1248:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1250:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1250:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1250:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1252:16: ( . )
            // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1252:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_TERMINAL_QUOTED_CHARS | RULE_TERMINAL_NUMBER | RULE_TERMINAL_NULL | RULE_TERMINAL_FALSE | RULE_TERMINAL_TRUE | RULE_TERMINAL_COMMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=18;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:40: RULE_TERMINAL_QUOTED_CHARS
                {
                mRULE_TERMINAL_QUOTED_CHARS(); 

                }
                break;
            case 7 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:67: RULE_TERMINAL_NUMBER
                {
                mRULE_TERMINAL_NUMBER(); 

                }
                break;
            case 8 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:88: RULE_TERMINAL_NULL
                {
                mRULE_TERMINAL_NULL(); 

                }
                break;
            case 9 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:107: RULE_TERMINAL_FALSE
                {
                mRULE_TERMINAL_FALSE(); 

                }
                break;
            case 10 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:127: RULE_TERMINAL_TRUE
                {
                mRULE_TERMINAL_TRUE(); 

                }
                break;
            case 11 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:146: RULE_TERMINAL_COMMA
                {
                mRULE_TERMINAL_COMMA(); 

                }
                break;
            case 12 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:166: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:174: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:183: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:195: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:227: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../org.jboss.tools.json.ui/src-gen/org/jboss/tools/json/ui/contentassist/antlr/internal/InternalJSON.g:1:235: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\6\uffff\2\23\2\34\3\40\1\uffff\1\23\1\uffff\2\23\14\uffff\1\34\1\40\1\uffff\2\40\7\uffff\3\40\1\60\1\40\1\62\1\uffff\1\63\2\uffff";
    static final String DFA21_eofS =
        "\64\uffff";
    static final String DFA21_minS =
        "\1\0\5\uffff\1\0\3\60\1\165\1\141\1\162\1\uffff\1\101\1\uffff\1\0\1\52\7\uffff\2\0\3\uffff\1\60\1\154\1\uffff\1\154\1\165\5\uffff\1\0\1\uffff\1\154\1\163\1\145\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\5\uffff\1\uffff\3\71\1\165\1\141\1\162\1\uffff\1\172\1\uffff\1\uffff\1\57\7\uffff\2\uffff\3\uffff\1\71\1\154\1\uffff\1\154\1\165\5\uffff\1\uffff\1\uffff\1\154\1\163\1\145\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\7\uffff\1\13\1\uffff\1\14\2\uffff\1\21\1\22\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\1\15\2\uffff\1\14\2\uffff\1\13\1\16\1\17\1\20\1\21\1\uffff\1\6\6\uffff\1\10\1\uffff\1\12\1\11";
    static final String DFA21_specialS =
        "\1\2\5\uffff\1\3\11\uffff\1\0\10\uffff\1\1\1\4\15\uffff\1\5\13\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\6\4\23\1\20\4\23\1\15\1\7\1\23\1\21\1\10\11\11\1\3\6\23\32\17\1\4\1\23\1\5\1\16\1\17\1\23\5\17\1\13\7\17\1\12\5\17\1\14\6\17\1\1\1\23\1\2\uff82\23",
            "",
            "",
            "",
            "",
            "",
            "\42\32\1\33\71\32\1\31\uffa3\32",
            "\12\34",
            "\12\35",
            "\12\36",
            "\1\37",
            "\1\41",
            "\1\42",
            "",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\42\44\1\50\4\44\1\50\64\44\1\50\5\44\1\50\3\44\1\50\7\44\1\50\3\44\1\50\1\44\2\50\uff8a\44",
            "\42\32\1\33\71\32\1\31\uffa3\32",
            "",
            "",
            "",
            "\12\36",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "\42\32\1\33\71\32\1\31\uffa3\32",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\61",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_TERMINAL_QUOTED_CHARS | RULE_TERMINAL_NUMBER | RULE_TERMINAL_NULL | RULE_TERMINAL_FALSE | RULE_TERMINAL_TRUE | RULE_TERMINAL_COMMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_16 = input.LA(1);

                        s = -1;
                        if ( ((LA21_16>='\u0000' && LA21_16<='\uFFFF')) ) {s = 36;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_25 = input.LA(1);

                        s = -1;
                        if ( (LA21_25=='\"'||LA21_25=='\''||LA21_25=='\\'||LA21_25=='b'||LA21_25=='f'||LA21_25=='n'||LA21_25=='r'||(LA21_25>='t' && LA21_25<='u')) ) {s = 40;}

                        else if ( ((LA21_25>='\u0000' && LA21_25<='!')||(LA21_25>='#' && LA21_25<='&')||(LA21_25>='(' && LA21_25<='[')||(LA21_25>=']' && LA21_25<='a')||(LA21_25>='c' && LA21_25<='e')||(LA21_25>='g' && LA21_25<='m')||(LA21_25>='o' && LA21_25<='q')||LA21_25=='s'||(LA21_25>='v' && LA21_25<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='{') ) {s = 1;}

                        else if ( (LA21_0=='}') ) {s = 2;}

                        else if ( (LA21_0==':') ) {s = 3;}

                        else if ( (LA21_0=='[') ) {s = 4;}

                        else if ( (LA21_0==']') ) {s = 5;}

                        else if ( (LA21_0=='\"') ) {s = 6;}

                        else if ( (LA21_0=='-') ) {s = 7;}

                        else if ( (LA21_0=='0') ) {s = 8;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 9;}

                        else if ( (LA21_0=='n') ) {s = 10;}

                        else if ( (LA21_0=='f') ) {s = 11;}

                        else if ( (LA21_0=='t') ) {s = 12;}

                        else if ( (LA21_0==',') ) {s = 13;}

                        else if ( (LA21_0=='^') ) {s = 14;}

                        else if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='e')||(LA21_0>='g' && LA21_0<='m')||(LA21_0>='o' && LA21_0<='s')||(LA21_0>='u' && LA21_0<='z')) ) {s = 15;}

                        else if ( (LA21_0=='\'') ) {s = 16;}

                        else if ( (LA21_0=='/') ) {s = 17;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 18;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='+')||LA21_0=='.'||(LA21_0>=';' && LA21_0<='@')||LA21_0=='\\'||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_6 = input.LA(1);

                        s = -1;
                        if ( (LA21_6=='\\') ) {s = 25;}

                        else if ( ((LA21_6>='\u0000' && LA21_6<='!')||(LA21_6>='#' && LA21_6<='[')||(LA21_6>=']' && LA21_6<='\uFFFF')) ) {s = 26;}

                        else if ( (LA21_6=='\"') ) {s = 27;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_26 = input.LA(1);

                        s = -1;
                        if ( (LA21_26=='\"') ) {s = 27;}

                        else if ( (LA21_26=='\\') ) {s = 25;}

                        else if ( ((LA21_26>='\u0000' && LA21_26<='!')||(LA21_26>='#' && LA21_26<='[')||(LA21_26>=']' && LA21_26<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_40 = input.LA(1);

                        s = -1;
                        if ( (LA21_40=='\"') ) {s = 27;}

                        else if ( (LA21_40=='\\') ) {s = 25;}

                        else if ( ((LA21_40>='\u0000' && LA21_40<='!')||(LA21_40>='#' && LA21_40<='[')||(LA21_40>=']' && LA21_40<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}