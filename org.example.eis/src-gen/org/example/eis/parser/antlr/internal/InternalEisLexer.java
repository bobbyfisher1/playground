package org.example.eis.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEisLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_HEXDIGIT=13;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_REAL=7;
    public static final int RULE_DIGIT=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_WORD=9;
    public static final int RULE_LWORD=11;
    public static final int RULE_STRING=4;
    public static final int RULE_BYTE=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_DWORD=10;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalEisLexer() {;} 
    public InternalEisLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEisLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEis.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:11:7: ( 'project' )
            // InternalEis.g:11:9: 'project'
            {
            match("project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:12:7: ( '=' )
            // InternalEis.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:13:7: ( ';' )
            // InternalEis.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:14:7: ( 'plcname' )
            // InternalEis.g:14:9: 'plcname'
            {
            match("plcname"); 


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
            // InternalEis.g:15:7: ( 'author' )
            // InternalEis.g:15:9: 'author'
            {
            match("author"); 


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
            // InternalEis.g:16:7: ( 'testcase' )
            // InternalEis.g:16:9: 'testcase'
            {
            match("testcase"); 


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
            // InternalEis.g:17:7: ( '{' )
            // InternalEis.g:17:9: '{'
            {
            match('{'); 

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
            // InternalEis.g:18:7: ( '}' )
            // InternalEis.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:19:7: ( 'testActive' )
            // InternalEis.g:19:9: 'testActive'
            {
            match("testActive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:20:7: ( 'blockType' )
            // InternalEis.g:20:9: 'blockType'
            {
            match("blockType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:21:7: ( 'description' )
            // InternalEis.g:21:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:22:7: ( 'FC' )
            // InternalEis.g:22:9: 'FC'
            {
            match("FC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:23:7: ( 'FB' )
            // InternalEis.g:23:9: 'FB'
            {
            match("FB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:24:7: ( 'true' )
            // InternalEis.g:24:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:25:7: ( 'false' )
            // InternalEis.g:25:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:26:7: ( 'define' )
            // InternalEis.g:26:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:27:7: ( 'input' )
            // InternalEis.g:27:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:28:7: ( '[' )
            // InternalEis.g:28:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:29:7: ( ']' )
            // InternalEis.g:29:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:30:7: ( 'output' )
            // InternalEis.g:30:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:31:7: ( 'inout' )
            // InternalEis.g:31:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:32:7: ( 'variant' )
            // InternalEis.g:32:9: 'variant'
            {
            match("variant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:33:7: ( '+/-' )
            // InternalEis.g:33:9: '+/-'
            {
            match("+/-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:34:7: ( ',' )
            // InternalEis.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:35:7: ( 'udt' )
            // InternalEis.g:35:9: 'udt'
            {
            match("udt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:36:7: ( '(' )
            // InternalEis.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:37:7: ( ')' )
            // InternalEis.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:38:7: ( '||' )
            // InternalEis.g:38:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:39:7: ( '&&' )
            // InternalEis.g:39:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:40:7: ( '==' )
            // InternalEis.g:40:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:41:7: ( '!=' )
            // InternalEis.g:41:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:42:7: ( '>=' )
            // InternalEis.g:42:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:43:7: ( '<=' )
            // InternalEis.g:43:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:44:7: ( '>' )
            // InternalEis.g:44:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:45:7: ( '<' )
            // InternalEis.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:46:7: ( '+' )
            // InternalEis.g:46:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:47:7: ( '-' )
            // InternalEis.g:47:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:48:7: ( '*' )
            // InternalEis.g:48:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:49:7: ( '/' )
            // InternalEis.g:49:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:50:7: ( '!' )
            // InternalEis.g:50:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:51:7: ( 'teststep' )
            // InternalEis.g:51:9: 'teststep'
            {
            match("teststep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:52:7: ( 'set' )
            // InternalEis.g:52:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:53:7: ( 'assert' )
            // InternalEis.g:53:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:54:7: ( '.' )
            // InternalEis.g:54:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:55:7: ( 'null' )
            // InternalEis.g:55:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:56:7: ( 'int' )
            // InternalEis.g:56:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:57:7: ( 'bool' )
            // InternalEis.g:57:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:58:7: ( 'real' )
            // InternalEis.g:58:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:59:7: ( 'string' )
            // InternalEis.g:59:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:60:7: ( 'byte' )
            // InternalEis.g:60:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:61:7: ( 'word' )
            // InternalEis.g:61:9: 'word'
            {
            match("word"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:62:7: ( 'dword' )
            // InternalEis.g:62:9: 'dword'
            {
            match("dword"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:63:7: ( 'lword' )
            // InternalEis.g:63:9: 'lword'
            {
            match("lword"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:64:7: ( 'usint' )
            // InternalEis.g:64:9: 'usint'
            {
            match("usint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:65:7: ( 'uint' )
            // InternalEis.g:65:9: 'uint'
            {
            match("uint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:66:7: ( 'udint' )
            // InternalEis.g:66:9: 'udint'
            {
            match("udint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:67:7: ( 'ulint' )
            // InternalEis.g:67:9: 'ulint'
            {
            match("ulint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:68:7: ( 'sint' )
            // InternalEis.g:68:9: 'sint'
            {
            match("sint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:69:7: ( 'dint' )
            // InternalEis.g:69:9: 'dint'
            {
            match("dint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:70:7: ( 'lint' )
            // InternalEis.g:70:9: 'lint'
            {
            match("lint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:71:7: ( 'char' )
            // InternalEis.g:71:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:72:7: ( 'time' )
            // InternalEis.g:72:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:73:7: ( 's5time' )
            // InternalEis.g:73:9: 's5time'
            {
            match("s5time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalEis.g:2704:21: ( '0' .. '9' )
            // InternalEis.g:2704:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEXDIGIT"
    public final void mRULE_HEXDIGIT() throws RecognitionException {
        try {
            // InternalEis.g:2706:24: ( ( RULE_DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalEis.g:2706:26: ( RULE_DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
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
    // $ANTLR end "RULE_HEXDIGIT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2708:10: ( ( '-' )? ( '0' .. '9' )+ )
            // InternalEis.g:2708:12: ( '-' )? ( '0' .. '9' )+
            {
            // InternalEis.g:2708:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEis.g:2708:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalEis.g:2708:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEis.g:2708:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2710:11: ( RULE_INT '.' ( RULE_DIGIT )+ )
            // InternalEis.g:2710:13: RULE_INT '.' ( RULE_DIGIT )+
            {
            mRULE_INT(); 
            match('.'); 
            // InternalEis.g:2710:26: ( RULE_DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEis.g:2710:26: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2712:11: ( '16#' RULE_HEXDIGIT RULE_HEXDIGIT )
            // InternalEis.g:2712:13: '16#' RULE_HEXDIGIT RULE_HEXDIGIT
            {
            match("16#"); 

            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2714:11: ( '16#' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT )
            // InternalEis.g:2714:13: '16#' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT
            {
            match("16#"); 

            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_DWORD"
    public final void mRULE_DWORD() throws RecognitionException {
        try {
            int _type = RULE_DWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2716:12: ( '16#' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT )
            // InternalEis.g:2716:14: '16#' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT
            {
            match("16#"); 

            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            match('_'); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DWORD"

    // $ANTLR start "RULE_LWORD"
    public final void mRULE_LWORD() throws RecognitionException {
        try {
            int _type = RULE_LWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2718:12: ( '16#' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT )
            // InternalEis.g:2718:14: '16#' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT '_' RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT
            {
            match("16#"); 

            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            match('_'); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            match('_'); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            match('_'); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 
            mRULE_HEXDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LWORD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2720:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEis.g:2720:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEis.g:2720:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEis.g:2720:11: '^'
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

            // InternalEis.g:2720:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEis.g:
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
            	    break loop5;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:2722:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEis.g:2722:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEis.g:2722:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEis.g:2722:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEis.g:2722:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEis.g:2722:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEis.g:2722:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEis.g:2722:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEis.g:2722:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEis.g:2722:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEis.g:2722:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalEis.g:2724:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEis.g:2724:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEis.g:2724:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEis.g:2724:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalEis.g:2726:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEis.g:2726:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEis.g:2726:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEis.g:2726:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalEis.g:2726:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEis.g:2726:41: ( '\\r' )? '\\n'
                    {
                    // InternalEis.g:2726:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEis.g:2726:41: '\\r'
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
            // InternalEis.g:2728:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEis.g:2728:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEis.g:2728:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEis.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalEis.g:2730:16: ( . )
            // InternalEis.g:2730:18: .
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
        // InternalEis.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_INT | RULE_REAL | RULE_BYTE | RULE_WORD | RULE_DWORD | RULE_LWORD | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=75;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalEis.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalEis.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalEis.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalEis.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalEis.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalEis.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalEis.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalEis.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalEis.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalEis.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalEis.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalEis.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalEis.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalEis.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalEis.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalEis.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalEis.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalEis.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalEis.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalEis.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalEis.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalEis.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalEis.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalEis.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalEis.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalEis.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalEis.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalEis.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalEis.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalEis.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalEis.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalEis.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalEis.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalEis.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalEis.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalEis.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalEis.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalEis.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalEis.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalEis.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalEis.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalEis.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalEis.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalEis.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalEis.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalEis.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalEis.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalEis.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalEis.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalEis.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalEis.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalEis.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalEis.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalEis.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalEis.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalEis.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalEis.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalEis.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalEis.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalEis.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalEis.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalEis.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalEis.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalEis.g:1:388: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // InternalEis.g:1:397: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 66 :
                // InternalEis.g:1:407: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 67 :
                // InternalEis.g:1:417: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 68 :
                // InternalEis.g:1:427: RULE_DWORD
                {
                mRULE_DWORD(); 

                }
                break;
            case 69 :
                // InternalEis.g:1:438: RULE_LWORD
                {
                mRULE_LWORD(); 

                }
                break;
            case 70 :
                // InternalEis.g:1:449: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // InternalEis.g:1:457: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalEis.g:1:469: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // InternalEis.g:1:485: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // InternalEis.g:1:501: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalEis.g:1:509: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\57\1\61\1\uffff\2\57\2\uffff\5\57\2\uffff\2\57\1\111\1\uffff\1\57\2\uffff\2\54\1\124\1\126\1\130\1\131\1\uffff\1\136\1\57\1\uffff\5\57\2\153\1\54\1\uffff\2\54\2\uffff\2\57\4\uffff\5\57\2\uffff\6\57\1\175\1\176\2\57\2\uffff\2\57\3\uffff\4\57\13\uffff\1\153\4\uffff\4\57\1\uffff\6\57\1\153\4\uffff\16\57\2\uffff\3\57\1\u00a6\2\57\1\u00a9\4\57\1\u00ae\11\57\1\uffff\5\57\1\u00c0\1\u00c1\1\57\1\u00c3\1\u00c4\3\57\1\u00c8\3\57\1\uffff\2\57\1\uffff\2\57\1\u00d0\1\57\1\uffff\1\57\1\u00d3\1\57\1\u00d5\1\u00d6\1\u00d7\1\57\1\u00d9\1\u00da\1\uffff\7\57\2\uffff\1\57\2\uffff\2\57\1\u00e6\1\uffff\1\u00e7\1\u00e8\1\u00e9\2\57\1\u00ec\1\u00ed\1\uffff\1\u00ee\1\57\1\uffff\1\57\3\uffff\1\u00f1\2\uffff\1\u00f2\2\57\1\u00f6\1\u00f7\5\57\1\u00fd\4\uffff\1\u00fe\1\57\3\uffff\1\u0100\1\u0101\3\uffff\1\u0103\1\u0104\2\uffff\5\57\2\uffff\1\u010a\2\uffff\1\u010b\2\uffff\1\u010d\1\57\1\u010f\2\57\4\uffff\1\57\1\uffff\1\u0114\1\57\1\uffff\1\u0117\1\uffff\1\57\2\uffff\1\u011a\2\uffff\1\u011c\2\uffff";
    static final String DFA14_eofS =
        "\u011e\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\1\75\1\uffff\1\163\1\145\2\uffff\1\154\1\145\1\102\1\141\1\156\2\uffff\1\165\1\141\1\57\1\uffff\1\144\2\uffff\1\174\1\46\3\75\1\60\1\uffff\1\52\1\65\1\uffff\1\165\1\145\1\157\1\151\1\150\2\56\1\101\1\uffff\2\0\2\uffff\1\157\1\143\4\uffff\1\164\2\163\1\165\1\155\2\uffff\2\157\1\164\1\146\1\157\1\156\2\60\1\154\1\157\2\uffff\1\164\1\162\3\uffff\2\151\1\156\1\151\13\uffff\1\56\4\uffff\1\164\1\162\1\156\1\164\1\uffff\1\154\1\141\1\162\1\157\1\156\1\141\1\43\4\uffff\1\152\1\156\1\150\1\145\1\164\2\145\1\143\1\154\1\145\1\143\1\151\1\162\1\164\2\uffff\1\163\2\165\1\60\1\160\1\151\1\60\2\156\1\164\1\156\1\60\1\151\1\164\1\151\2\154\1\144\1\162\1\164\1\162\1\60\1\145\1\141\1\157\1\162\1\101\2\60\1\153\2\60\1\162\1\156\1\144\1\60\1\145\2\164\1\uffff\1\165\1\141\1\uffff\2\164\1\60\1\164\1\uffff\1\156\1\60\1\155\3\60\1\144\3\60\1\143\1\155\1\162\1\164\1\141\1\143\1\164\2\uffff\1\124\2\uffff\1\151\1\145\1\60\1\uffff\3\60\1\164\1\156\2\60\1\uffff\1\60\1\147\1\uffff\1\145\3\uffff\1\60\2\uffff\1\60\1\164\1\145\2\60\1\163\1\164\1\145\1\171\1\160\1\60\4\uffff\1\60\1\164\3\uffff\2\60\2\uffff\3\60\2\uffff\1\145\1\151\2\160\1\164\2\uffff\1\60\2\uffff\1\137\2\uffff\1\60\1\166\1\60\1\145\1\151\2\uffff\1\60\1\uffff\1\145\1\uffff\1\60\1\157\2\60\1\uffff\1\156\1\60\1\uffff\2\60\1\uffff\1\137\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\162\1\75\1\uffff\1\165\1\162\2\uffff\1\171\1\167\1\103\1\141\1\156\2\uffff\1\165\1\141\1\57\1\uffff\1\163\2\uffff\1\174\1\46\3\75\1\71\1\uffff\1\57\1\164\1\uffff\1\165\1\145\1\157\1\167\1\150\2\71\1\172\1\uffff\2\uffff\2\uffff\1\157\1\143\4\uffff\1\164\2\163\1\165\1\155\2\uffff\2\157\1\164\1\163\1\157\1\156\2\172\1\154\1\164\2\uffff\1\164\1\162\3\uffff\1\164\1\151\1\156\1\151\13\uffff\1\71\4\uffff\1\164\1\162\1\156\1\164\1\uffff\1\154\1\141\1\162\1\157\1\156\1\141\1\71\4\uffff\1\152\1\156\1\150\1\145\1\164\2\145\1\143\1\154\1\145\1\143\1\151\1\162\1\164\2\uffff\1\163\2\165\1\172\1\160\1\151\1\172\2\156\1\164\1\156\1\172\1\151\1\164\1\151\2\154\1\144\1\162\1\164\1\162\1\146\1\145\1\141\1\157\1\162\1\163\2\172\1\153\2\172\1\162\1\156\1\144\1\172\1\145\2\164\1\uffff\1\165\1\141\1\uffff\2\164\1\172\1\164\1\uffff\1\156\1\172\1\155\3\172\1\144\2\172\1\146\1\143\1\155\1\162\1\164\1\141\1\143\1\164\2\uffff\1\124\2\uffff\1\151\1\145\1\172\1\uffff\3\172\1\164\1\156\2\172\1\uffff\1\172\1\147\1\uffff\1\145\3\uffff\1\172\2\uffff\1\146\1\164\1\145\2\172\1\163\1\164\1\145\1\171\1\160\1\172\4\uffff\1\172\1\164\3\uffff\2\172\2\uffff\1\146\2\172\2\uffff\1\145\1\151\2\160\1\164\2\uffff\1\172\2\uffff\1\137\2\uffff\1\172\1\166\1\172\1\145\1\151\2\uffff\1\146\1\uffff\1\145\1\uffff\1\172\1\157\1\146\1\172\1\uffff\1\156\1\146\1\uffff\1\172\1\146\1\uffff\1\137\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\2\uffff\1\7\1\10\5\uffff\1\22\1\23\3\uffff\1\30\1\uffff\1\32\1\33\6\uffff\1\46\2\uffff\1\54\10\uffff\1\106\2\uffff\1\112\1\113\2\uffff\1\106\1\36\1\2\1\3\5\uffff\1\7\1\10\12\uffff\1\22\1\23\2\uffff\1\27\1\44\1\30\4\uffff\1\32\1\33\1\34\1\35\1\37\1\50\1\40\1\42\1\41\1\43\1\45\1\uffff\1\46\1\110\1\111\1\47\4\uffff\1\54\7\uffff\1\100\1\101\1\107\1\112\16\uffff\1\14\1\15\47\uffff\1\56\2\uffff\1\31\4\uffff\1\52\21\uffff\1\16\1\76\1\uffff\1\57\1\62\3\uffff\1\73\7\uffff\1\67\2\uffff\1\72\1\uffff\1\55\1\60\1\63\1\uffff\1\74\1\75\13\uffff\1\64\1\17\1\21\1\25\2\uffff\1\70\1\66\1\71\2\uffff\1\65\1\102\3\uffff\1\5\1\53\5\uffff\1\20\1\24\1\uffff\1\61\1\77\1\uffff\1\1\1\4\5\uffff\1\26\1\103\1\uffff\1\6\1\uffff\1\51\4\uffff\1\12\2\uffff\1\11\2\uffff\1\13\1\uffff\1\104\1\105";
    static final String DFA14_specialS =
        "\1\2\50\uffff\1\0\1\1\u00f3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\30\1\51\3\54\1\27\1\52\1\24\1\25\1\34\1\21\1\22\1\33\1\37\1\35\1\46\1\45\10\46\1\54\1\3\1\32\1\2\1\31\2\54\5\50\1\12\24\50\1\15\1\54\1\16\1\47\1\50\1\54\1\4\1\10\1\44\1\11\1\50\1\13\2\50\1\14\2\50\1\43\1\50\1\40\1\17\1\1\1\50\1\41\1\36\1\5\1\23\1\20\1\42\3\50\1\6\1\26\1\7\uff82\54",
            "\1\56\5\uffff\1\55",
            "\1\60",
            "",
            "\1\64\1\uffff\1\63",
            "\1\65\3\uffff\1\67\10\uffff\1\66",
            "",
            "",
            "\1\72\2\uffff\1\73\11\uffff\1\74",
            "\1\75\3\uffff\1\77\15\uffff\1\76",
            "\1\101\1\100",
            "\1\102",
            "\1\103",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\113\4\uffff\1\115\2\uffff\1\116\6\uffff\1\114",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\125",
            "\1\127",
            "\12\132",
            "",
            "\1\134\4\uffff\1\135",
            "\1\142\57\uffff\1\137\3\uffff\1\141\12\uffff\1\140",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\150\15\uffff\1\147",
            "\1\151",
            "\1\154\1\uffff\6\132\1\152\3\132",
            "\1\154\1\uffff\12\132",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\155",
            "\0\155",
            "",
            "",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\14\uffff\1\171",
            "\1\173",
            "\1\174",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\177",
            "\1\u0081\1\u0080\3\uffff\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "\1\u0086\12\uffff\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154\1\uffff\12\132",
            "",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\12\uffff\1\154\1\uffff\12\132",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a7",
            "\1\u00a8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\u00b8\7\uffff\6\u00b8\32\uffff\6\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\41\uffff\1\u00bd\17\uffff\1\u00bf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\u00db\7\uffff\6\u00db\32\uffff\6\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ea",
            "\1\u00eb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\u00f3\7\uffff\6\u00f3\32\uffff\6\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ff",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\u0102\7\uffff\6\u0102\32\uffff\6\u0102",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u010c",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0110",
            "\1\u0111",
            "",
            "",
            "\12\u0112\7\uffff\6\u0112\32\uffff\6\u0112",
            "",
            "\1\u0113",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0115",
            "\12\u0116\7\uffff\6\u0116\32\uffff\6\u0116",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0118",
            "\12\u0119\7\uffff\6\u0119\32\uffff\6\u0119",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\u011b\7\uffff\6\u011b\32\uffff\6\u011b",
            "",
            "\1\u011d",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_INT | RULE_REAL | RULE_BYTE | RULE_WORD | RULE_DWORD | RULE_LWORD | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_41 = input.LA(1);

                        s = -1;
                        if ( ((LA14_41>='\u0000' && LA14_41<='\uFFFF')) ) {s = 109;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_42 = input.LA(1);

                        s = -1;
                        if ( ((LA14_42>='\u0000' && LA14_42<='\uFFFF')) ) {s = 109;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='p') ) {s = 1;}

                        else if ( (LA14_0=='=') ) {s = 2;}

                        else if ( (LA14_0==';') ) {s = 3;}

                        else if ( (LA14_0=='a') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='{') ) {s = 6;}

                        else if ( (LA14_0=='}') ) {s = 7;}

                        else if ( (LA14_0=='b') ) {s = 8;}

                        else if ( (LA14_0=='d') ) {s = 9;}

                        else if ( (LA14_0=='F') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='i') ) {s = 12;}

                        else if ( (LA14_0=='[') ) {s = 13;}

                        else if ( (LA14_0==']') ) {s = 14;}

                        else if ( (LA14_0=='o') ) {s = 15;}

                        else if ( (LA14_0=='v') ) {s = 16;}

                        else if ( (LA14_0=='+') ) {s = 17;}

                        else if ( (LA14_0==',') ) {s = 18;}

                        else if ( (LA14_0=='u') ) {s = 19;}

                        else if ( (LA14_0=='(') ) {s = 20;}

                        else if ( (LA14_0==')') ) {s = 21;}

                        else if ( (LA14_0=='|') ) {s = 22;}

                        else if ( (LA14_0=='&') ) {s = 23;}

                        else if ( (LA14_0=='!') ) {s = 24;}

                        else if ( (LA14_0=='>') ) {s = 25;}

                        else if ( (LA14_0=='<') ) {s = 26;}

                        else if ( (LA14_0=='-') ) {s = 27;}

                        else if ( (LA14_0=='*') ) {s = 28;}

                        else if ( (LA14_0=='/') ) {s = 29;}

                        else if ( (LA14_0=='s') ) {s = 30;}

                        else if ( (LA14_0=='.') ) {s = 31;}

                        else if ( (LA14_0=='n') ) {s = 32;}

                        else if ( (LA14_0=='r') ) {s = 33;}

                        else if ( (LA14_0=='w') ) {s = 34;}

                        else if ( (LA14_0=='l') ) {s = 35;}

                        else if ( (LA14_0=='c') ) {s = 36;}

                        else if ( (LA14_0=='1') ) {s = 37;}

                        else if ( (LA14_0=='0'||(LA14_0>='2' && LA14_0<='9')) ) {s = 38;}

                        else if ( (LA14_0=='^') ) {s = 39;}

                        else if ( ((LA14_0>='A' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='e'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||LA14_0=='q'||(LA14_0>='x' && LA14_0<='z')) ) {s = 40;}

                        else if ( (LA14_0=='\"') ) {s = 41;}

                        else if ( (LA14_0=='\'') ) {s = 42;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 43;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0==':'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}