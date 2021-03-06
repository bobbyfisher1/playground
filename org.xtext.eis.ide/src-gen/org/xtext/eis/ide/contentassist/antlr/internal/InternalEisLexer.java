package org.xtext.eis.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEisLexer extends Lexer {
    public static final int RULE_HEX=18;
    public static final int T__50=50;
    public static final int RULE_LTIME=15;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_CHAR=13;
    public static final int T__56=56;
    public static final int RULE_TIME=14;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_NEGATIVE_LONG=5;
    public static final int RULE_ID=7;
    public static final int RULE_REAL=8;
    public static final int RULE_DATE=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_WORD=10;
    public static final int RULE_LWORD=12;
    public static final int RULE_STRING=6;
    public static final int RULE_BYTE=9;
    public static final int RULE_SL_COMMENT=20;
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
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_DWORD=11;
    public static final int T__83=83;
    public static final int RULE_WS=21;
    public static final int RULE_X=17;
    public static final int RULE_ANY_OTHER=22;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_LONG=4;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
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

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:11:7: ( ';' )
            // InternalEis.g:11:9: ';'
            {
            match(';'); 

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
            // InternalEis.g:12:7: ( 'true' )
            // InternalEis.g:12:9: 'true'
            {
            match("true"); 


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
            // InternalEis.g:13:7: ( 'false' )
            // InternalEis.g:13:9: 'false'
            {
            match("false"); 


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
            // InternalEis.g:14:7: ( 'FC' )
            // InternalEis.g:14:9: 'FC'
            {
            match("FC"); 


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
            // InternalEis.g:15:7: ( 'FB' )
            // InternalEis.g:15:9: 'FB'
            {
            match("FB"); 


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
            // InternalEis.g:16:7: ( '==' )
            // InternalEis.g:16:9: '=='
            {
            match("=="); 


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
            // InternalEis.g:17:7: ( '!=' )
            // InternalEis.g:17:9: '!='
            {
            match("!="); 


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
            // InternalEis.g:18:7: ( '>=' )
            // InternalEis.g:18:9: '>='
            {
            match(">="); 


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
            // InternalEis.g:19:7: ( '<=' )
            // InternalEis.g:19:9: '<='
            {
            match("<="); 


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
            // InternalEis.g:20:7: ( '>' )
            // InternalEis.g:20:9: '>'
            {
            match('>'); 

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
            // InternalEis.g:21:7: ( '<' )
            // InternalEis.g:21:9: '<'
            {
            match('<'); 

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
            // InternalEis.g:22:7: ( '*' )
            // InternalEis.g:22:9: '*'
            {
            match('*'); 

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
            // InternalEis.g:23:7: ( '/' )
            // InternalEis.g:23:9: '/'
            {
            match('/'); 

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
            // InternalEis.g:24:7: ( 'null' )
            // InternalEis.g:24:9: 'null'
            {
            match("null"); 


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
            // InternalEis.g:25:7: ( 'int' )
            // InternalEis.g:25:9: 'int'
            {
            match("int"); 


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
            // InternalEis.g:26:7: ( 'bool' )
            // InternalEis.g:26:9: 'bool'
            {
            match("bool"); 


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
            // InternalEis.g:27:7: ( 'real' )
            // InternalEis.g:27:9: 'real'
            {
            match("real"); 


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
            // InternalEis.g:28:7: ( 'string' )
            // InternalEis.g:28:9: 'string'
            {
            match("string"); 


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
            // InternalEis.g:29:7: ( 'char' )
            // InternalEis.g:29:9: 'char'
            {
            match("char"); 


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
            // InternalEis.g:30:7: ( 'byte' )
            // InternalEis.g:30:9: 'byte'
            {
            match("byte"); 


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
            // InternalEis.g:31:7: ( 'word' )
            // InternalEis.g:31:9: 'word'
            {
            match("word"); 


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
            // InternalEis.g:32:7: ( 'dword' )
            // InternalEis.g:32:9: 'dword'
            {
            match("dword"); 


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
            // InternalEis.g:33:7: ( 'lword' )
            // InternalEis.g:33:9: 'lword'
            {
            match("lword"); 


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
            // InternalEis.g:34:7: ( 'usint' )
            // InternalEis.g:34:9: 'usint'
            {
            match("usint"); 


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
            // InternalEis.g:35:7: ( 'uint' )
            // InternalEis.g:35:9: 'uint'
            {
            match("uint"); 


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
            // InternalEis.g:36:7: ( 'udint' )
            // InternalEis.g:36:9: 'udint'
            {
            match("udint"); 


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
            // InternalEis.g:37:7: ( 'sint' )
            // InternalEis.g:37:9: 'sint'
            {
            match("sint"); 


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
            // InternalEis.g:38:7: ( 'dint' )
            // InternalEis.g:38:9: 'dint'
            {
            match("dint"); 


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
            // InternalEis.g:39:7: ( 'lint' )
            // InternalEis.g:39:9: 'lint'
            {
            match("lint"); 


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
            // InternalEis.g:40:7: ( 'time' )
            // InternalEis.g:40:9: 'time'
            {
            match("time"); 


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
            // InternalEis.g:41:7: ( 'ltime' )
            // InternalEis.g:41:9: 'ltime'
            {
            match("ltime"); 


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
            // InternalEis.g:42:7: ( 'date' )
            // InternalEis.g:42:9: 'date'
            {
            match("date"); 


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
            // InternalEis.g:43:7: ( 'lreal' )
            // InternalEis.g:43:9: 'lreal'
            {
            match("lreal"); 


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
            // InternalEis.g:44:7: ( 'wchar' )
            // InternalEis.g:44:9: 'wchar'
            {
            match("wchar"); 


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
            // InternalEis.g:45:7: ( 'project' )
            // InternalEis.g:45:9: 'project'
            {
            match("project"); 


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
            // InternalEis.g:46:7: ( '=' )
            // InternalEis.g:46:9: '='
            {
            match('='); 

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
            // InternalEis.g:47:7: ( 'plcname' )
            // InternalEis.g:47:9: 'plcname'
            {
            match("plcname"); 


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
            // InternalEis.g:48:7: ( 'author' )
            // InternalEis.g:48:9: 'author'
            {
            match("author"); 


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
            // InternalEis.g:49:7: ( 'testcase' )
            // InternalEis.g:49:9: 'testcase'
            {
            match("testcase"); 


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
            // InternalEis.g:50:7: ( '(' )
            // InternalEis.g:50:9: '('
            {
            match('('); 

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
            // InternalEis.g:51:7: ( ',' )
            // InternalEis.g:51:9: ','
            {
            match(','); 

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
            // InternalEis.g:52:7: ( ')' )
            // InternalEis.g:52:9: ')'
            {
            match(')'); 

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
            // InternalEis.g:53:7: ( '{' )
            // InternalEis.g:53:9: '{'
            {
            match('{'); 

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
            // InternalEis.g:54:7: ( '}' )
            // InternalEis.g:54:9: '}'
            {
            match('}'); 

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
            // InternalEis.g:55:7: ( 'define' )
            // InternalEis.g:55:9: 'define'
            {
            match("define"); 


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
            // InternalEis.g:56:7: ( '[' )
            // InternalEis.g:56:9: '['
            {
            match('['); 

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
            // InternalEis.g:57:7: ( ']' )
            // InternalEis.g:57:9: ']'
            {
            match(']'); 

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
            // InternalEis.g:58:7: ( '+/-' )
            // InternalEis.g:58:9: '+/-'
            {
            match("+/-"); 


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
            // InternalEis.g:59:7: ( 'udt' )
            // InternalEis.g:59:9: 'udt'
            {
            match("udt"); 


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
            // InternalEis.g:60:7: ( '.' )
            // InternalEis.g:60:9: '.'
            {
            match('.'); 

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
            // InternalEis.g:61:7: ( '||' )
            // InternalEis.g:61:9: '||'
            {
            match("||"); 


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
            // InternalEis.g:62:7: ( '&&' )
            // InternalEis.g:62:9: '&&'
            {
            match("&&"); 


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
            // InternalEis.g:63:7: ( '+' )
            // InternalEis.g:63:9: '+'
            {
            match('+'); 

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
            // InternalEis.g:64:7: ( '-' )
            // InternalEis.g:64:9: '-'
            {
            match('-'); 

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
            // InternalEis.g:65:7: ( '!' )
            // InternalEis.g:65:9: '!'
            {
            match('!'); 

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
            // InternalEis.g:66:7: ( 'teststep' )
            // InternalEis.g:66:9: 'teststep'
            {
            match("teststep"); 


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
            // InternalEis.g:67:7: ( 'input' )
            // InternalEis.g:67:9: 'input'
            {
            match("input"); 


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
            // InternalEis.g:68:7: ( 'output' )
            // InternalEis.g:68:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:69:7: ( 'inout' )
            // InternalEis.g:69:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:70:7: ( 'variant' )
            // InternalEis.g:70:9: 'variant'
            {
            match("variant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:71:7: ( 'set' )
            // InternalEis.g:71:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:72:7: ( 'assert' )
            // InternalEis.g:72:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "RULE_X"
    public final void mRULE_X() throws RecognitionException {
        try {
            // InternalEis.g:6919:17: ( '0' .. '9' )
            // InternalEis.g:6919:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_X"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            // InternalEis.g:6921:19: ( ( RULE_X | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalEis.g:6921:21: ( RULE_X | 'A' .. 'F' | 'a' .. 'f' )
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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6923:11: ( ( RULE_X )+ )
            // InternalEis.g:6923:13: ( RULE_X )+
            {
            // InternalEis.g:6923:13: ( RULE_X )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:6923:13: RULE_X
            	    {
            	    mRULE_X(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_NEGATIVE_LONG"
    public final void mRULE_NEGATIVE_LONG() throws RecognitionException {
        try {
            int _type = RULE_NEGATIVE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6925:20: ( '-' RULE_LONG )
            // InternalEis.g:6925:22: '-' RULE_LONG
            {
            match('-'); 
            mRULE_LONG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEGATIVE_LONG"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6927:11: ( ( RULE_LONG | RULE_NEGATIVE_LONG ) '.' RULE_LONG ( ( 'e' | 'E' ) ( '-' | '+' )? ( ( RULE_X )? RULE_X )? RULE_X )? )
            // InternalEis.g:6927:13: ( RULE_LONG | RULE_NEGATIVE_LONG ) '.' RULE_LONG ( ( 'e' | 'E' ) ( '-' | '+' )? ( ( RULE_X )? RULE_X )? RULE_X )?
            {
            // InternalEis.g:6927:13: ( RULE_LONG | RULE_NEGATIVE_LONG )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='-') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEis.g:6927:14: RULE_LONG
                    {
                    mRULE_LONG(); 

                    }
                    break;
                case 2 :
                    // InternalEis.g:6927:24: RULE_NEGATIVE_LONG
                    {
                    mRULE_NEGATIVE_LONG(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_LONG(); 
            // InternalEis.g:6927:58: ( ( 'e' | 'E' ) ( '-' | '+' )? ( ( RULE_X )? RULE_X )? RULE_X )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEis.g:6927:59: ( 'e' | 'E' ) ( '-' | '+' )? ( ( RULE_X )? RULE_X )? RULE_X
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalEis.g:6927:69: ( '-' | '+' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='+'||LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalEis.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalEis.g:6927:80: ( ( RULE_X )? RULE_X )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        int LA5_1 = input.LA(2);

                        if ( ((LA5_1>='0' && LA5_1<='9')) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalEis.g:6927:81: ( RULE_X )? RULE_X
                            {
                            // InternalEis.g:6927:81: ( RULE_X )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                int LA4_1 = input.LA(2);

                                if ( ((LA4_1>='0' && LA4_1<='9')) ) {
                                    int LA4_2 = input.LA(3);

                                    if ( ((LA4_2>='0' && LA4_2<='9')) ) {
                                        alt4=1;
                                    }
                                }
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalEis.g:6927:81: RULE_X
                                    {
                                    mRULE_X(); 

                                    }
                                    break;

                            }

                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 

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
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6929:11: ( '16#' RULE_HEX RULE_HEX )
            // InternalEis.g:6929:13: '16#' RULE_HEX RULE_HEX
            {
            match("16#"); 

            mRULE_HEX(); 
            mRULE_HEX(); 

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
            // InternalEis.g:6931:11: ( '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalEis.g:6931:13: '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
            {
            match("16#"); 

            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 

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
            // InternalEis.g:6933:12: ( '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalEis.g:6933:14: '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
            {
            match("16#"); 

            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('_'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 

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
            // InternalEis.g:6935:12: ( '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalEis.g:6935:14: '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
            {
            match("16#"); 

            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('_'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('_'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            match('_'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LWORD"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6937:11: ( 'D#' RULE_X RULE_X RULE_X RULE_X '-' RULE_X RULE_X '-' RULE_X RULE_X )
            // InternalEis.g:6937:13: 'D#' RULE_X RULE_X RULE_X RULE_X '-' RULE_X RULE_X '-' RULE_X RULE_X
            {
            match("D#"); 

            mRULE_X(); 
            mRULE_X(); 
            mRULE_X(); 
            mRULE_X(); 
            match('-'); 
            mRULE_X(); 
            mRULE_X(); 
            match('-'); 
            mRULE_X(); 
            mRULE_X(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6939:11: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_X ) '\\'' )
            // InternalEis.g:6939:13: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_X ) '\\''
            {
            match('\''); 
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6941:11: ( 'T#' ( '-' )? ( ( RULE_X )? RULE_X 'd' ( '_' )? )? ( ( RULE_X )? RULE_X 'h' ( '_' )? )? ( ( RULE_X )? RULE_X 'M' ( '_' )? )? ( ( RULE_X )? RULE_X 's' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' )? )
            // InternalEis.g:6941:13: 'T#' ( '-' )? ( ( RULE_X )? RULE_X 'd' ( '_' )? )? ( ( RULE_X )? RULE_X 'h' ( '_' )? )? ( ( RULE_X )? RULE_X 'M' ( '_' )? )? ( ( RULE_X )? RULE_X 's' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' )?
            {
            match("T#"); 

            // InternalEis.g:6941:18: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEis.g:6941:18: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalEis.g:6941:23: ( ( RULE_X )? RULE_X 'd' ( '_' )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>='0' && LA10_1<='9')) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3=='d') ) {
                        alt10=1;
                    }
                }
                else if ( (LA10_1=='d') ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalEis.g:6941:24: ( RULE_X )? RULE_X 'd' ( '_' )?
                    {
                    // InternalEis.g:6941:24: ( RULE_X )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                        int LA8_1 = input.LA(2);

                        if ( ((LA8_1>='0' && LA8_1<='9')) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEis.g:6941:24: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('d'); 
                    // InternalEis.g:6941:43: ( '_' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='_') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalEis.g:6941:43: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6941:50: ( ( RULE_X )? RULE_X 'h' ( '_' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='9')) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='h') ) {
                        alt13=1;
                    }
                }
                else if ( (LA13_1=='h') ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalEis.g:6941:51: ( RULE_X )? RULE_X 'h' ( '_' )?
                    {
                    // InternalEis.g:6941:51: ( RULE_X )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                        int LA11_1 = input.LA(2);

                        if ( ((LA11_1>='0' && LA11_1<='9')) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEis.g:6941:51: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('h'); 
                    // InternalEis.g:6941:70: ( '_' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='_') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEis.g:6941:70: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6941:77: ( ( RULE_X )? RULE_X 'M' ( '_' )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='9')) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3=='M') ) {
                        alt16=1;
                    }
                }
                else if ( (LA16_1=='M') ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalEis.g:6941:78: ( RULE_X )? RULE_X 'M' ( '_' )?
                    {
                    // InternalEis.g:6941:78: ( RULE_X )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                        int LA14_1 = input.LA(2);

                        if ( ((LA14_1>='0' && LA14_1<='9')) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEis.g:6941:78: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('M'); 
                    // InternalEis.g:6941:97: ( '_' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='_') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEis.g:6941:97: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6941:104: ( ( RULE_X )? RULE_X 's' ( '_' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='9')) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='s') ) {
                        alt19=1;
                    }
                }
                else if ( (LA19_1=='s') ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalEis.g:6941:105: ( RULE_X )? RULE_X 's' ( '_' )?
                    {
                    // InternalEis.g:6941:105: ( RULE_X )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                        int LA17_1 = input.LA(2);

                        if ( ((LA17_1>='0' && LA17_1<='9')) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalEis.g:6941:105: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('s'); 
                    // InternalEis.g:6941:124: ( '_' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='_') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEis.g:6941:124: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6941:131: ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEis.g:6941:132: ( ( RULE_X )? RULE_X )? RULE_X 'ms'
                    {
                    // InternalEis.g:6941:132: ( ( RULE_X )? RULE_X )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                        int LA21_1 = input.LA(2);

                        if ( ((LA21_1>='0' && LA21_1<='9')) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalEis.g:6941:133: ( RULE_X )? RULE_X
                            {
                            // InternalEis.g:6941:133: ( RULE_X )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                                int LA20_1 = input.LA(2);

                                if ( ((LA20_1>='0' && LA20_1<='9')) ) {
                                    int LA20_2 = input.LA(3);

                                    if ( ((LA20_2>='0' && LA20_2<='9')) ) {
                                        alt20=1;
                                    }
                                }
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalEis.g:6941:133: RULE_X
                                    {
                                    mRULE_X(); 

                                    }
                                    break;

                            }

                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match("ms"); 


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
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_LTIME"
    public final void mRULE_LTIME() throws RecognitionException {
        try {
            int _type = RULE_LTIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6943:12: ( 'LT#' ( '-' )? ( ( ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X 'd' ( '_' )? )? ( ( RULE_X )? RULE_X 'h' ( '_' )? )? ( ( RULE_X )? RULE_X 'M' ( '_' )? )? ( ( RULE_X )? RULE_X 's' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'us' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ns' )? )
            // InternalEis.g:6943:14: 'LT#' ( '-' )? ( ( ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X 'd' ( '_' )? )? ( ( RULE_X )? RULE_X 'h' ( '_' )? )? ( ( RULE_X )? RULE_X 'M' ( '_' )? )? ( ( RULE_X )? RULE_X 's' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'us' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ns' )?
            {
            match("LT#"); 

            // InternalEis.g:6943:20: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='-') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEis.g:6943:20: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalEis.g:6943:25: ( ( ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X 'd' ( '_' )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>='0' && LA30_0<='9')) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>='0' && LA30_1<='9')) ) {
                    int LA30_3 = input.LA(3);

                    if ( ((LA30_3>='0' && LA30_3<='9')) ) {
                        int LA30_5 = input.LA(4);

                        if ( ((LA30_5>='0' && LA30_5<='9')||LA30_5=='d') ) {
                            alt30=1;
                        }
                    }
                    else if ( (LA30_3=='d') ) {
                        alt30=1;
                    }
                }
                else if ( (LA30_1=='d') ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalEis.g:6943:26: ( ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X 'd' ( '_' )?
                    {
                    // InternalEis.g:6943:26: ( ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                        int LA28_1 = input.LA(2);

                        if ( ((LA28_1>='0' && LA28_1<='9')) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalEis.g:6943:27: ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )? RULE_X
                            {
                            // InternalEis.g:6943:27: ( ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                                int LA27_1 = input.LA(2);

                                if ( ((LA27_1>='0' && LA27_1<='9')) ) {
                                    int LA27_2 = input.LA(3);

                                    if ( ((LA27_2>='0' && LA27_2<='9')) ) {
                                        alt27=1;
                                    }
                                }
                            }
                            switch (alt27) {
                                case 1 :
                                    // InternalEis.g:6943:28: ( ( ( RULE_X )? RULE_X )? RULE_X )? RULE_X
                                    {
                                    // InternalEis.g:6943:28: ( ( ( RULE_X )? RULE_X )? RULE_X )?
                                    int alt26=2;
                                    int LA26_0 = input.LA(1);

                                    if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                                        int LA26_1 = input.LA(2);

                                        if ( ((LA26_1>='0' && LA26_1<='9')) ) {
                                            int LA26_2 = input.LA(3);

                                            if ( ((LA26_2>='0' && LA26_2<='9')) ) {
                                                int LA26_3 = input.LA(4);

                                                if ( ((LA26_3>='0' && LA26_3<='9')) ) {
                                                    alt26=1;
                                                }
                                            }
                                        }
                                    }
                                    switch (alt26) {
                                        case 1 :
                                            // InternalEis.g:6943:29: ( ( RULE_X )? RULE_X )? RULE_X
                                            {
                                            // InternalEis.g:6943:29: ( ( RULE_X )? RULE_X )?
                                            int alt25=2;
                                            int LA25_0 = input.LA(1);

                                            if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                                                int LA25_1 = input.LA(2);

                                                if ( ((LA25_1>='0' && LA25_1<='9')) ) {
                                                    int LA25_2 = input.LA(3);

                                                    if ( ((LA25_2>='0' && LA25_2<='9')) ) {
                                                        int LA25_3 = input.LA(4);

                                                        if ( ((LA25_3>='0' && LA25_3<='9')) ) {
                                                            int LA25_4 = input.LA(5);

                                                            if ( ((LA25_4>='0' && LA25_4<='9')) ) {
                                                                alt25=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            switch (alt25) {
                                                case 1 :
                                                    // InternalEis.g:6943:30: ( RULE_X )? RULE_X
                                                    {
                                                    // InternalEis.g:6943:30: ( RULE_X )?
                                                    int alt24=2;
                                                    int LA24_0 = input.LA(1);

                                                    if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                                                        int LA24_1 = input.LA(2);

                                                        if ( ((LA24_1>='0' && LA24_1<='9')) ) {
                                                            int LA24_2 = input.LA(3);

                                                            if ( ((LA24_2>='0' && LA24_2<='9')) ) {
                                                                int LA24_3 = input.LA(4);

                                                                if ( ((LA24_3>='0' && LA24_3<='9')) ) {
                                                                    int LA24_4 = input.LA(5);

                                                                    if ( ((LA24_4>='0' && LA24_4<='9')) ) {
                                                                        int LA24_5 = input.LA(6);

                                                                        if ( ((LA24_5>='0' && LA24_5<='9')) ) {
                                                                            alt24=1;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    switch (alt24) {
                                                        case 1 :
                                                            // InternalEis.g:6943:30: RULE_X
                                                            {
                                                            mRULE_X(); 

                                                            }
                                                            break;

                                                    }

                                                    mRULE_X(); 

                                                    }
                                                    break;

                                            }

                                            mRULE_X(); 

                                            }
                                            break;

                                    }

                                    mRULE_X(); 

                                    }
                                    break;

                            }

                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('d'); 
                    // InternalEis.g:6943:85: ( '_' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='_') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalEis.g:6943:85: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6943:92: ( ( RULE_X )? RULE_X 'h' ( '_' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>='0' && LA33_0<='9')) ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>='0' && LA33_1<='9')) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3=='h') ) {
                        alt33=1;
                    }
                }
                else if ( (LA33_1=='h') ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalEis.g:6943:93: ( RULE_X )? RULE_X 'h' ( '_' )?
                    {
                    // InternalEis.g:6943:93: ( RULE_X )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                        int LA31_1 = input.LA(2);

                        if ( ((LA31_1>='0' && LA31_1<='9')) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalEis.g:6943:93: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('h'); 
                    // InternalEis.g:6943:112: ( '_' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='_') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalEis.g:6943:112: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6943:119: ( ( RULE_X )? RULE_X 'M' ( '_' )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>='0' && LA36_0<='9')) ) {
                int LA36_1 = input.LA(2);

                if ( ((LA36_1>='0' && LA36_1<='9')) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3=='M') ) {
                        alt36=1;
                    }
                }
                else if ( (LA36_1=='M') ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalEis.g:6943:120: ( RULE_X )? RULE_X 'M' ( '_' )?
                    {
                    // InternalEis.g:6943:120: ( RULE_X )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>='0' && LA34_0<='9')) ) {
                        int LA34_1 = input.LA(2);

                        if ( ((LA34_1>='0' && LA34_1<='9')) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalEis.g:6943:120: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('M'); 
                    // InternalEis.g:6943:139: ( '_' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='_') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalEis.g:6943:139: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6943:146: ( ( RULE_X )? RULE_X 's' ( '_' )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>='0' && LA39_0<='9')) ) {
                int LA39_1 = input.LA(2);

                if ( ((LA39_1>='0' && LA39_1<='9')) ) {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3=='s') ) {
                        alt39=1;
                    }
                }
                else if ( (LA39_1=='s') ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalEis.g:6943:147: ( RULE_X )? RULE_X 's' ( '_' )?
                    {
                    // InternalEis.g:6943:147: ( RULE_X )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>='0' && LA37_0<='9')) ) {
                        int LA37_1 = input.LA(2);

                        if ( ((LA37_1>='0' && LA37_1<='9')) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalEis.g:6943:147: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('s'); 
                    // InternalEis.g:6943:166: ( '_' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='_') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalEis.g:6943:166: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6943:173: ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' ( '_' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>='0' && LA43_0<='9')) ) {
                int LA43_1 = input.LA(2);

                if ( ((LA43_1>='0' && LA43_1<='9')) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3=='m') ) {
                        alt43=1;
                    }
                    else if ( ((LA43_3>='0' && LA43_3<='9')) ) {
                        int LA43_5 = input.LA(4);

                        if ( (LA43_5=='m') ) {
                            alt43=1;
                        }
                    }
                }
                else if ( (LA43_1=='m') ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalEis.g:6943:174: ( ( RULE_X )? RULE_X )? RULE_X 'ms' ( '_' )?
                    {
                    // InternalEis.g:6943:174: ( ( RULE_X )? RULE_X )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>='0' && LA41_0<='9')) ) {
                        int LA41_1 = input.LA(2);

                        if ( ((LA41_1>='0' && LA41_1<='9')) ) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalEis.g:6943:175: ( RULE_X )? RULE_X
                            {
                            // InternalEis.g:6943:175: ( RULE_X )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( ((LA40_0>='0' && LA40_0<='9')) ) {
                                int LA40_1 = input.LA(2);

                                if ( ((LA40_1>='0' && LA40_1<='9')) ) {
                                    int LA40_2 = input.LA(3);

                                    if ( ((LA40_2>='0' && LA40_2<='9')) ) {
                                        alt40=1;
                                    }
                                }
                            }
                            switch (alt40) {
                                case 1 :
                                    // InternalEis.g:6943:175: RULE_X
                                    {
                                    mRULE_X(); 

                                    }
                                    break;

                            }

                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match("ms"); 

                    // InternalEis.g:6943:204: ( '_' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='_') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalEis.g:6943:204: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6943:211: ( ( ( RULE_X )? RULE_X )? RULE_X 'us' ( '_' )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>='0' && LA47_0<='9')) ) {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>='0' && LA47_1<='9')) ) {
                    int LA47_3 = input.LA(3);

                    if ( ((LA47_3>='0' && LA47_3<='9')) ) {
                        int LA47_5 = input.LA(4);

                        if ( (LA47_5=='u') ) {
                            alt47=1;
                        }
                    }
                    else if ( (LA47_3=='u') ) {
                        alt47=1;
                    }
                }
                else if ( (LA47_1=='u') ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalEis.g:6943:212: ( ( RULE_X )? RULE_X )? RULE_X 'us' ( '_' )?
                    {
                    // InternalEis.g:6943:212: ( ( RULE_X )? RULE_X )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>='0' && LA45_0<='9')) ) {
                        int LA45_1 = input.LA(2);

                        if ( ((LA45_1>='0' && LA45_1<='9')) ) {
                            alt45=1;
                        }
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalEis.g:6943:213: ( RULE_X )? RULE_X
                            {
                            // InternalEis.g:6943:213: ( RULE_X )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( ((LA44_0>='0' && LA44_0<='9')) ) {
                                int LA44_1 = input.LA(2);

                                if ( ((LA44_1>='0' && LA44_1<='9')) ) {
                                    int LA44_2 = input.LA(3);

                                    if ( ((LA44_2>='0' && LA44_2<='9')) ) {
                                        alt44=1;
                                    }
                                }
                            }
                            switch (alt44) {
                                case 1 :
                                    // InternalEis.g:6943:213: RULE_X
                                    {
                                    mRULE_X(); 

                                    }
                                    break;

                            }

                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match("us"); 

                    // InternalEis.g:6943:242: ( '_' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0=='_') ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalEis.g:6943:242: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6943:249: ( ( ( RULE_X )? RULE_X )? RULE_X 'ns' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>='0' && LA50_0<='9')) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEis.g:6943:250: ( ( RULE_X )? RULE_X )? RULE_X 'ns'
                    {
                    // InternalEis.g:6943:250: ( ( RULE_X )? RULE_X )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>='0' && LA49_0<='9')) ) {
                        int LA49_1 = input.LA(2);

                        if ( ((LA49_1>='0' && LA49_1<='9')) ) {
                            alt49=1;
                        }
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEis.g:6943:251: ( RULE_X )? RULE_X
                            {
                            // InternalEis.g:6943:251: ( RULE_X )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( ((LA48_0>='0' && LA48_0<='9')) ) {
                                int LA48_1 = input.LA(2);

                                if ( ((LA48_1>='0' && LA48_1<='9')) ) {
                                    int LA48_2 = input.LA(3);

                                    if ( ((LA48_2>='0' && LA48_2<='9')) ) {
                                        alt48=1;
                                    }
                                }
                            }
                            switch (alt48) {
                                case 1 :
                                    // InternalEis.g:6943:251: RULE_X
                                    {
                                    mRULE_X(); 

                                    }
                                    break;

                            }

                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match("ns"); 


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
    // $ANTLR end "RULE_LTIME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6945:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEis.g:6945:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEis.g:6945:11: ( '^' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='^') ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEis.g:6945:11: '^'
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

            // InternalEis.g:6945:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>='0' && LA52_0<='9')||(LA52_0>='A' && LA52_0<='Z')||LA52_0=='_'||(LA52_0>='a' && LA52_0<='z')) ) {
                    alt52=1;
                }


                switch (alt52) {
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
            	    break loop52;
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
            // InternalEis.g:6947:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEis.g:6947:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEis.g:6947:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='\"') ) {
                alt55=1;
            }
            else if ( (LA55_0=='\'') ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalEis.g:6947:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEis.g:6947:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop53:
                    do {
                        int alt53=3;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0=='\\') ) {
                            alt53=1;
                        }
                        else if ( ((LA53_0>='\u0000' && LA53_0<='!')||(LA53_0>='#' && LA53_0<='[')||(LA53_0>=']' && LA53_0<='\uFFFF')) ) {
                            alt53=2;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalEis.g:6947:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEis.g:6947:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop53;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEis.g:6947:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEis.g:6947:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0=='\\') ) {
                            alt54=1;
                        }
                        else if ( ((LA54_0>='\u0000' && LA54_0<='&')||(LA54_0>='(' && LA54_0<='[')||(LA54_0>=']' && LA54_0<='\uFFFF')) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalEis.g:6947:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEis.g:6947:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop54;
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
            // InternalEis.g:6949:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEis.g:6949:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEis.g:6949:24: ( options {greedy=false; } : . )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0=='*') ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1=='/') ) {
                        alt56=2;
                    }
                    else if ( ((LA56_1>='\u0000' && LA56_1<='.')||(LA56_1>='0' && LA56_1<='\uFFFF')) ) {
                        alt56=1;
                    }


                }
                else if ( ((LA56_0>='\u0000' && LA56_0<=')')||(LA56_0>='+' && LA56_0<='\uFFFF')) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalEis.g:6949:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop56;
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
            // InternalEis.g:6951:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEis.g:6951:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEis.g:6951:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>='\u0000' && LA57_0<='\t')||(LA57_0>='\u000B' && LA57_0<='\f')||(LA57_0>='\u000E' && LA57_0<='\uFFFF')) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalEis.g:6951:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop57;
                }
            } while (true);

            // InternalEis.g:6951:40: ( ( '\\r' )? '\\n' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0=='\n'||LA59_0=='\r') ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalEis.g:6951:41: ( '\\r' )? '\\n'
                    {
                    // InternalEis.g:6951:41: ( '\\r' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0=='\r') ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalEis.g:6951:41: '\\r'
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
            // InternalEis.g:6953:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEis.g:6953:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEis.g:6953:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>='\t' && LA60_0<='\n')||LA60_0=='\r'||LA60_0==' ') ) {
                    alt60=1;
                }


                switch (alt60) {
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
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
            // InternalEis.g:6955:16: ( . )
            // InternalEis.g:6955:18: .
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
        // InternalEis.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_LONG | RULE_NEGATIVE_LONG | RULE_REAL | RULE_BYTE | RULE_WORD | RULE_DWORD | RULE_LWORD | RULE_DATE | RULE_CHAR | RULE_TIME | RULE_LTIME | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt61=79;
        alt61 = dfa61.predict(input);
        switch (alt61) {
            case 1 :
                // InternalEis.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // InternalEis.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // InternalEis.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // InternalEis.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // InternalEis.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // InternalEis.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // InternalEis.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // InternalEis.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // InternalEis.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // InternalEis.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // InternalEis.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // InternalEis.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // InternalEis.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // InternalEis.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // InternalEis.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // InternalEis.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // InternalEis.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // InternalEis.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // InternalEis.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // InternalEis.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // InternalEis.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // InternalEis.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // InternalEis.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // InternalEis.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // InternalEis.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // InternalEis.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // InternalEis.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // InternalEis.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // InternalEis.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // InternalEis.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // InternalEis.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // InternalEis.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // InternalEis.g:1:202: T__55
                {
                mT__55(); 

                }
                break;
            case 34 :
                // InternalEis.g:1:208: T__56
                {
                mT__56(); 

                }
                break;
            case 35 :
                // InternalEis.g:1:214: T__57
                {
                mT__57(); 

                }
                break;
            case 36 :
                // InternalEis.g:1:220: T__58
                {
                mT__58(); 

                }
                break;
            case 37 :
                // InternalEis.g:1:226: T__59
                {
                mT__59(); 

                }
                break;
            case 38 :
                // InternalEis.g:1:232: T__60
                {
                mT__60(); 

                }
                break;
            case 39 :
                // InternalEis.g:1:238: T__61
                {
                mT__61(); 

                }
                break;
            case 40 :
                // InternalEis.g:1:244: T__62
                {
                mT__62(); 

                }
                break;
            case 41 :
                // InternalEis.g:1:250: T__63
                {
                mT__63(); 

                }
                break;
            case 42 :
                // InternalEis.g:1:256: T__64
                {
                mT__64(); 

                }
                break;
            case 43 :
                // InternalEis.g:1:262: T__65
                {
                mT__65(); 

                }
                break;
            case 44 :
                // InternalEis.g:1:268: T__66
                {
                mT__66(); 

                }
                break;
            case 45 :
                // InternalEis.g:1:274: T__67
                {
                mT__67(); 

                }
                break;
            case 46 :
                // InternalEis.g:1:280: T__68
                {
                mT__68(); 

                }
                break;
            case 47 :
                // InternalEis.g:1:286: T__69
                {
                mT__69(); 

                }
                break;
            case 48 :
                // InternalEis.g:1:292: T__70
                {
                mT__70(); 

                }
                break;
            case 49 :
                // InternalEis.g:1:298: T__71
                {
                mT__71(); 

                }
                break;
            case 50 :
                // InternalEis.g:1:304: T__72
                {
                mT__72(); 

                }
                break;
            case 51 :
                // InternalEis.g:1:310: T__73
                {
                mT__73(); 

                }
                break;
            case 52 :
                // InternalEis.g:1:316: T__74
                {
                mT__74(); 

                }
                break;
            case 53 :
                // InternalEis.g:1:322: T__75
                {
                mT__75(); 

                }
                break;
            case 54 :
                // InternalEis.g:1:328: T__76
                {
                mT__76(); 

                }
                break;
            case 55 :
                // InternalEis.g:1:334: T__77
                {
                mT__77(); 

                }
                break;
            case 56 :
                // InternalEis.g:1:340: T__78
                {
                mT__78(); 

                }
                break;
            case 57 :
                // InternalEis.g:1:346: T__79
                {
                mT__79(); 

                }
                break;
            case 58 :
                // InternalEis.g:1:352: T__80
                {
                mT__80(); 

                }
                break;
            case 59 :
                // InternalEis.g:1:358: T__81
                {
                mT__81(); 

                }
                break;
            case 60 :
                // InternalEis.g:1:364: T__82
                {
                mT__82(); 

                }
                break;
            case 61 :
                // InternalEis.g:1:370: T__83
                {
                mT__83(); 

                }
                break;
            case 62 :
                // InternalEis.g:1:376: T__84
                {
                mT__84(); 

                }
                break;
            case 63 :
                // InternalEis.g:1:382: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 64 :
                // InternalEis.g:1:392: RULE_NEGATIVE_LONG
                {
                mRULE_NEGATIVE_LONG(); 

                }
                break;
            case 65 :
                // InternalEis.g:1:411: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 66 :
                // InternalEis.g:1:421: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 67 :
                // InternalEis.g:1:431: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 68 :
                // InternalEis.g:1:441: RULE_DWORD
                {
                mRULE_DWORD(); 

                }
                break;
            case 69 :
                // InternalEis.g:1:452: RULE_LWORD
                {
                mRULE_LWORD(); 

                }
                break;
            case 70 :
                // InternalEis.g:1:463: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 71 :
                // InternalEis.g:1:473: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 72 :
                // InternalEis.g:1:483: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 73 :
                // InternalEis.g:1:493: RULE_LTIME
                {
                mRULE_LTIME(); 

                }
                break;
            case 74 :
                // InternalEis.g:1:504: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // InternalEis.g:1:512: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 76 :
                // InternalEis.g:1:524: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // InternalEis.g:1:540: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 78 :
                // InternalEis.g:1:556: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // InternalEis.g:1:564: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA61_eotS =
        "\2\uffff\3\64\1\71\1\73\1\75\1\77\1\uffff\1\103\14\64\7\uffff\1\146\1\uffff\2\57\1\152\2\64\2\157\1\64\1\57\2\64\1\57\1\uffff\1\57\3\uffff\3\64\1\uffff\1\64\1\174\1\175\14\uffff\32\64\15\uffff\1\u009b\2\64\1\157\2\uffff\1\157\4\uffff\1\64\1\uffff\4\64\2\uffff\1\64\1\u00a6\7\64\1\u00ae\16\64\1\u00bd\4\64\1\uffff\2\64\3\uffff\1\u00c6\1\u00c7\2\64\1\u00cb\1\uffff\2\64\1\u00ce\1\u00cf\1\u00d0\1\64\1\u00d2\1\uffff\1\u00d3\1\u00d4\2\64\1\u00d7\1\u00d8\2\64\1\u00db\3\64\1\u00df\1\64\1\uffff\6\64\4\uffff\2\64\1\u00ea\1\uffff\1\u00eb\1\u00ec\3\uffff\1\64\3\uffff\1\u00ee\1\u00ef\2\uffff\1\64\1\u00f1\1\uffff\1\u00f2\1\u00f3\1\u00f4\1\uffff\1\u00f5\6\64\1\u00fc\2\64\3\uffff\1\u0100\2\uffff\1\u0101\5\uffff\2\64\1\u0104\1\u0105\1\u0106\1\64\2\uffff\2\64\2\uffff\1\u010b\1\u010c\3\uffff\1\u010d\1\u010e\1\u0110\1\u0111\12\uffff\1\u0116\2\uffff";
    static final String DFA61_eofS =
        "\u0118\uffff";
    static final String DFA61_minS =
        "\1\0\1\uffff\1\145\1\141\1\102\4\75\1\uffff\1\52\1\165\1\156\1\157\2\145\1\150\1\143\1\141\1\151\1\144\1\154\1\163\7\uffff\1\57\1\uffff\1\174\1\46\1\60\1\165\1\141\2\56\1\43\1\0\1\43\1\124\1\101\1\uffff\1\0\3\uffff\1\165\1\155\1\163\1\uffff\1\154\2\60\14\uffff\1\154\2\157\1\164\1\141\1\162\1\156\1\164\1\141\1\162\1\150\1\157\1\156\1\164\1\146\1\157\1\156\1\151\1\145\1\151\1\156\1\151\1\157\1\143\1\164\1\163\15\uffff\1\56\1\164\1\162\1\43\2\uffff\1\56\1\uffff\1\0\2\uffff\1\43\1\uffff\2\145\1\164\1\163\2\uffff\1\154\1\60\2\165\1\154\1\145\1\154\1\151\1\164\1\60\1\162\1\144\1\141\1\162\1\164\1\145\1\151\1\162\1\164\1\155\1\141\1\156\1\164\1\156\1\60\1\152\1\156\1\150\1\145\1\uffff\1\160\1\151\1\60\2\uffff\2\60\1\143\1\145\1\60\1\uffff\2\164\3\60\1\156\1\60\1\uffff\2\60\1\162\1\144\2\60\1\156\1\144\1\60\1\145\1\154\1\164\1\60\1\164\1\uffff\1\145\1\141\1\157\1\162\1\165\1\141\1\60\3\uffff\1\141\1\164\1\60\1\uffff\2\60\3\uffff\1\147\3\uffff\2\60\2\uffff\1\145\1\60\1\uffff\3\60\1\uffff\1\60\1\143\1\155\1\162\2\164\1\156\1\60\1\163\1\145\3\uffff\1\60\2\uffff\1\60\5\uffff\1\164\1\145\3\60\1\164\1\uffff\1\60\1\145\1\160\2\uffff\2\60\3\uffff\1\60\1\137\2\60\4\uffff\1\60\2\uffff\3\60\1\137\2\uffff";
    static final String DFA61_maxS =
        "\1\uffff\1\uffff\1\162\1\141\1\103\4\75\1\uffff\1\57\1\165\1\156\1\171\1\145\1\164\1\150\1\157\2\167\1\163\1\162\1\165\7\uffff\1\57\1\uffff\1\174\1\46\1\71\1\165\1\141\2\71\1\43\1\uffff\1\43\1\124\1\172\1\uffff\1\uffff\3\uffff\1\165\1\155\1\163\1\uffff\1\154\2\172\14\uffff\1\154\1\164\1\157\1\164\1\141\1\162\1\156\1\164\1\141\1\162\1\150\1\157\1\156\1\164\1\146\1\157\1\156\1\151\1\145\1\151\1\156\1\164\1\157\1\143\1\164\1\163\15\uffff\1\71\1\164\1\162\1\71\2\uffff\1\71\1\uffff\1\uffff\2\uffff\1\43\1\uffff\2\145\1\164\1\163\2\uffff\1\154\1\172\2\165\1\154\1\145\1\154\1\151\1\164\1\172\1\162\1\144\1\141\1\162\1\164\1\145\1\151\1\162\1\164\1\155\1\141\1\156\1\164\1\156\1\172\1\152\1\156\1\150\1\145\1\uffff\1\160\1\151\1\146\2\uffff\2\172\1\163\1\145\1\172\1\uffff\2\164\3\172\1\156\1\172\1\uffff\2\172\1\162\1\144\2\172\1\156\1\144\1\172\1\145\1\154\1\164\1\172\1\164\1\uffff\1\145\1\141\1\157\1\162\1\165\1\141\1\146\3\uffff\1\141\1\164\1\172\1\uffff\2\172\3\uffff\1\147\3\uffff\2\172\2\uffff\1\145\1\172\1\uffff\3\172\1\uffff\1\172\1\143\1\155\1\162\2\164\1\156\1\146\1\163\1\145\3\uffff\1\172\2\uffff\1\172\5\uffff\1\164\1\145\3\172\1\164\1\uffff\1\146\1\145\1\160\2\uffff\2\172\3\uffff\1\172\1\137\2\172\4\uffff\1\146\2\uffff\3\146\1\137\2\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\7\uffff\1\14\15\uffff\1\50\1\51\1\52\1\53\1\54\1\56\1\57\1\uffff\1\62\14\uffff\1\112\1\uffff\1\116\1\117\1\1\3\uffff\1\112\3\uffff\1\6\1\44\1\7\1\67\1\10\1\12\1\11\1\13\1\14\1\114\1\115\1\15\32\uffff\1\50\1\51\1\52\1\53\1\54\1\56\1\57\1\60\1\65\1\62\1\63\1\64\1\66\4\uffff\1\77\1\101\1\uffff\1\106\1\uffff\1\113\1\110\1\uffff\1\116\4\uffff\1\4\1\5\35\uffff\1\100\3\uffff\1\107\1\111\5\uffff\1\17\7\uffff\1\75\16\uffff\1\61\7\uffff\1\107\1\2\1\36\3\uffff\1\16\2\uffff\1\20\1\24\1\21\1\uffff\1\33\1\23\1\25\2\uffff\1\34\1\40\2\uffff\1\35\3\uffff\1\31\12\uffff\1\3\1\71\1\73\1\uffff\1\42\1\26\1\uffff\1\27\1\37\1\41\1\30\1\32\6\uffff\1\102\3\uffff\1\22\1\55\2\uffff\1\46\1\76\1\72\4\uffff\1\43\1\45\1\74\1\103\1\uffff\1\47\1\70\4\uffff\1\104\1\105";
    static final String DFA61_specialS =
        "\1\3\47\uffff\1\2\4\uffff\1\0\105\uffff\1\1\u00a4\uffff}>";
    static final String[] DFA61_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\6\1\55\3\57\1\41\1\50\1\27\1\31\1\11\1\36\1\30\1\42\1\37\1\12\1\46\1\45\10\46\1\57\1\1\1\10\1\5\1\7\2\57\3\54\1\47\1\54\1\4\5\54\1\52\7\54\1\51\6\54\1\34\1\57\1\35\1\53\1\54\1\57\1\26\1\15\1\20\1\22\1\54\1\3\2\54\1\14\2\54\1\23\1\54\1\13\1\43\1\25\1\54\1\16\1\17\1\2\1\24\1\44\1\21\3\54\1\32\1\40\1\33\uff82\57",
            "",
            "\1\63\3\uffff\1\62\10\uffff\1\61",
            "\1\65",
            "\1\67\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "",
            "\1\101\4\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106\11\uffff\1\107",
            "\1\110",
            "\1\113\3\uffff\1\112\12\uffff\1\111",
            "\1\114",
            "\1\116\13\uffff\1\115",
            "\1\121\3\uffff\1\122\3\uffff\1\120\15\uffff\1\117",
            "\1\124\10\uffff\1\126\1\uffff\1\125\2\uffff\1\123",
            "\1\131\4\uffff\1\130\11\uffff\1\127",
            "\1\133\5\uffff\1\132",
            "\1\135\1\uffff\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "",
            "\1\150",
            "\1\151",
            "\12\153",
            "\1\154",
            "\1\155",
            "\1\160\1\uffff\6\161\1\156\3\161",
            "\1\160\1\uffff\12\161",
            "\1\162",
            "\60\164\12\163\7\164\32\163\6\164\32\163\uff85\164",
            "\1\165",
            "\1\166",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\0\164",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            "",
            "\1\176",
            "\1\u0081\1\u0080\3\uffff\1\177",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\12\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
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
            "",
            "",
            "\1\160\1\uffff\12\153",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\12\uffff\1\160\1\uffff\12\161",
            "",
            "",
            "\1\160\1\uffff\12\161",
            "",
            "\47\164\1\u009f\uffd8\164",
            "",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\12\u00c4\7\uffff\6\u00c4\32\uffff\6\u00c4",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c8\17\uffff\1\u00c9",
            "\1\u00ca",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d5",
            "\1\u00d6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d9",
            "\1\u00da",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\u00e7\7\uffff\6\u00e7\32\uffff\6\u00e7",
            "",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u00ed",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u00f0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\u00fd\7\uffff\6\u00fd\32\uffff\6\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0107",
            "",
            "\12\u0108\7\uffff\6\u0108\32\uffff\6\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\12\u0112\7\uffff\6\u0112\32\uffff\6\u0112",
            "",
            "",
            "\12\u0113\7\uffff\6\u0113\32\uffff\6\u0113",
            "\12\u0114\7\uffff\6\u0114\32\uffff\6\u0114",
            "\12\u0115\7\uffff\6\u0115\32\uffff\6\u0115",
            "\1\u0117",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_LONG | RULE_NEGATIVE_LONG | RULE_REAL | RULE_BYTE | RULE_WORD | RULE_DWORD | RULE_LWORD | RULE_DATE | RULE_CHAR | RULE_TIME | RULE_LTIME | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_45 = input.LA(1);

                        s = -1;
                        if ( ((LA61_45>='\u0000' && LA61_45<='\uFFFF')) ) {s = 116;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_115 = input.LA(1);

                        s = -1;
                        if ( (LA61_115=='\'') ) {s = 159;}

                        else if ( ((LA61_115>='\u0000' && LA61_115<='&')||(LA61_115>='(' && LA61_115<='\uFFFF')) ) {s = 116;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_40 = input.LA(1);

                        s = -1;
                        if ( ((LA61_40>='0' && LA61_40<='9')||(LA61_40>='A' && LA61_40<='Z')||(LA61_40>='a' && LA61_40<='z')) ) {s = 115;}

                        else if ( ((LA61_40>='\u0000' && LA61_40<='/')||(LA61_40>=':' && LA61_40<='@')||(LA61_40>='[' && LA61_40<='`')||(LA61_40>='{' && LA61_40<='\uFFFF')) ) {s = 116;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_0 = input.LA(1);

                        s = -1;
                        if ( (LA61_0==';') ) {s = 1;}

                        else if ( (LA61_0=='t') ) {s = 2;}

                        else if ( (LA61_0=='f') ) {s = 3;}

                        else if ( (LA61_0=='F') ) {s = 4;}

                        else if ( (LA61_0=='=') ) {s = 5;}

                        else if ( (LA61_0=='!') ) {s = 6;}

                        else if ( (LA61_0=='>') ) {s = 7;}

                        else if ( (LA61_0=='<') ) {s = 8;}

                        else if ( (LA61_0=='*') ) {s = 9;}

                        else if ( (LA61_0=='/') ) {s = 10;}

                        else if ( (LA61_0=='n') ) {s = 11;}

                        else if ( (LA61_0=='i') ) {s = 12;}

                        else if ( (LA61_0=='b') ) {s = 13;}

                        else if ( (LA61_0=='r') ) {s = 14;}

                        else if ( (LA61_0=='s') ) {s = 15;}

                        else if ( (LA61_0=='c') ) {s = 16;}

                        else if ( (LA61_0=='w') ) {s = 17;}

                        else if ( (LA61_0=='d') ) {s = 18;}

                        else if ( (LA61_0=='l') ) {s = 19;}

                        else if ( (LA61_0=='u') ) {s = 20;}

                        else if ( (LA61_0=='p') ) {s = 21;}

                        else if ( (LA61_0=='a') ) {s = 22;}

                        else if ( (LA61_0=='(') ) {s = 23;}

                        else if ( (LA61_0==',') ) {s = 24;}

                        else if ( (LA61_0==')') ) {s = 25;}

                        else if ( (LA61_0=='{') ) {s = 26;}

                        else if ( (LA61_0=='}') ) {s = 27;}

                        else if ( (LA61_0=='[') ) {s = 28;}

                        else if ( (LA61_0==']') ) {s = 29;}

                        else if ( (LA61_0=='+') ) {s = 30;}

                        else if ( (LA61_0=='.') ) {s = 31;}

                        else if ( (LA61_0=='|') ) {s = 32;}

                        else if ( (LA61_0=='&') ) {s = 33;}

                        else if ( (LA61_0=='-') ) {s = 34;}

                        else if ( (LA61_0=='o') ) {s = 35;}

                        else if ( (LA61_0=='v') ) {s = 36;}

                        else if ( (LA61_0=='1') ) {s = 37;}

                        else if ( (LA61_0=='0'||(LA61_0>='2' && LA61_0<='9')) ) {s = 38;}

                        else if ( (LA61_0=='D') ) {s = 39;}

                        else if ( (LA61_0=='\'') ) {s = 40;}

                        else if ( (LA61_0=='T') ) {s = 41;}

                        else if ( (LA61_0=='L') ) {s = 42;}

                        else if ( (LA61_0=='^') ) {s = 43;}

                        else if ( ((LA61_0>='A' && LA61_0<='C')||LA61_0=='E'||(LA61_0>='G' && LA61_0<='K')||(LA61_0>='M' && LA61_0<='S')||(LA61_0>='U' && LA61_0<='Z')||LA61_0=='_'||LA61_0=='e'||(LA61_0>='g' && LA61_0<='h')||(LA61_0>='j' && LA61_0<='k')||LA61_0=='m'||LA61_0=='q'||(LA61_0>='x' && LA61_0<='z')) ) {s = 44;}

                        else if ( (LA61_0=='\"') ) {s = 45;}

                        else if ( ((LA61_0>='\t' && LA61_0<='\n')||LA61_0=='\r'||LA61_0==' ') ) {s = 46;}

                        else if ( ((LA61_0>='\u0000' && LA61_0<='\b')||(LA61_0>='\u000B' && LA61_0<='\f')||(LA61_0>='\u000E' && LA61_0<='\u001F')||(LA61_0>='#' && LA61_0<='%')||LA61_0==':'||(LA61_0>='?' && LA61_0<='@')||LA61_0=='\\'||LA61_0=='`'||(LA61_0>='~' && LA61_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}