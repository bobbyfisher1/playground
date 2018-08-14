package org.example.eis.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEisLexer extends Lexer {
    public static final int RULE_HEX=16;
    public static final int T__50=50;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_WORD=10;
    public static final int RULE_LWORD=12;
    public static final int RULE_STRING=6;
    public static final int RULE_BYTE=9;
    public static final int RULE_SL_COMMENT=18;
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
    public static final int RULE_WS=19;
    public static final int RULE_X=15;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_LONG=4;
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

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:11:7: ( 'FC' )
            // InternalEis.g:11:9: 'FC'
            {
            match("FC"); 


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
            // InternalEis.g:12:7: ( 'FB' )
            // InternalEis.g:12:9: 'FB'
            {
            match("FB"); 


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
            // InternalEis.g:13:7: ( 'true' )
            // InternalEis.g:13:9: 'true'
            {
            match("true"); 


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
            // InternalEis.g:14:7: ( 'false' )
            // InternalEis.g:14:9: 'false'
            {
            match("false"); 


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
            // InternalEis.g:15:7: ( ';' )
            // InternalEis.g:15:9: ';'
            {
            match(';'); 

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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:37:7: ( 'ulint' )
            // InternalEis.g:37:9: 'ulint'
            {
            match("ulint"); 


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
            // InternalEis.g:38:7: ( 'sint' )
            // InternalEis.g:38:9: 'sint'
            {
            match("sint"); 


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
            // InternalEis.g:39:7: ( 'dint' )
            // InternalEis.g:39:9: 'dint'
            {
            match("dint"); 


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
            // InternalEis.g:40:7: ( 'lint' )
            // InternalEis.g:40:9: 'lint'
            {
            match("lint"); 


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
            // InternalEis.g:41:7: ( 'time' )
            // InternalEis.g:41:9: 'time'
            {
            match("time"); 


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
            // InternalEis.g:42:7: ( 'ltime' )
            // InternalEis.g:42:9: 'ltime'
            {
            match("ltime"); 


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
            // InternalEis.g:43:7: ( 'project' )
            // InternalEis.g:43:9: 'project'
            {
            match("project"); 


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
            // InternalEis.g:44:7: ( '=' )
            // InternalEis.g:44:9: '='
            {
            match('='); 

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
            // InternalEis.g:45:7: ( 'plcname' )
            // InternalEis.g:45:9: 'plcname'
            {
            match("plcname"); 


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
            // InternalEis.g:46:7: ( 'author' )
            // InternalEis.g:46:9: 'author'
            {
            match("author"); 


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
            // InternalEis.g:47:7: ( 'testcase' )
            // InternalEis.g:47:9: 'testcase'
            {
            match("testcase"); 


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
            // InternalEis.g:48:7: ( '{' )
            // InternalEis.g:48:9: '{'
            {
            match('{'); 

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
            // InternalEis.g:49:7: ( '}' )
            // InternalEis.g:49:9: '}'
            {
            match('}'); 

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
            // InternalEis.g:50:7: ( 'testActive' )
            // InternalEis.g:50:9: 'testActive'
            {
            match("testActive"); 


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
            // InternalEis.g:51:7: ( 'blockType' )
            // InternalEis.g:51:9: 'blockType'
            {
            match("blockType"); 


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
            // InternalEis.g:52:7: ( 'description' )
            // InternalEis.g:52:9: 'description'
            {
            match("description"); 


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
            // InternalEis.g:53:7: ( 'define' )
            // InternalEis.g:53:9: 'define'
            {
            match("define"); 


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
            // InternalEis.g:54:7: ( '[' )
            // InternalEis.g:54:9: '['
            {
            match('['); 

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
            // InternalEis.g:55:7: ( ']' )
            // InternalEis.g:55:9: ']'
            {
            match(']'); 

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
            // InternalEis.g:56:7: ( '+/-' )
            // InternalEis.g:56:9: '+/-'
            {
            match("+/-"); 


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
            // InternalEis.g:57:7: ( 'udt' )
            // InternalEis.g:57:9: 'udt'
            {
            match("udt"); 


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
            // InternalEis.g:58:7: ( '(' )
            // InternalEis.g:58:9: '('
            {
            match('('); 

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
            // InternalEis.g:59:7: ( ')' )
            // InternalEis.g:59:9: ')'
            {
            match(')'); 

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
            // InternalEis.g:60:7: ( '||' )
            // InternalEis.g:60:9: '||'
            {
            match("||"); 


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
            // InternalEis.g:61:7: ( '&&' )
            // InternalEis.g:61:9: '&&'
            {
            match("&&"); 


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
            // InternalEis.g:62:7: ( '+' )
            // InternalEis.g:62:9: '+'
            {
            match('+'); 

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
            // InternalEis.g:63:7: ( '-' )
            // InternalEis.g:63:9: '-'
            {
            match('-'); 

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
            // InternalEis.g:64:7: ( '!' )
            // InternalEis.g:64:9: '!'
            {
            match('!'); 

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
            // InternalEis.g:65:7: ( 'teststep' )
            // InternalEis.g:65:9: 'teststep'
            {
            match("teststep"); 


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
            // InternalEis.g:66:7: ( ',' )
            // InternalEis.g:66:9: ','
            {
            match(','); 

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
            // InternalEis.g:67:7: ( '.' )
            // InternalEis.g:67:9: '.'
            {
            match('.'); 

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
            // InternalEis.g:68:7: ( 'input' )
            // InternalEis.g:68:9: 'input'
            {
            match("input"); 


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
            // InternalEis.g:69:7: ( 'output' )
            // InternalEis.g:69:9: 'output'
            {
            match("output"); 


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
            // InternalEis.g:70:7: ( 'inout' )
            // InternalEis.g:70:9: 'inout'
            {
            match("inout"); 


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
            // InternalEis.g:71:7: ( 'variant' )
            // InternalEis.g:71:9: 'variant'
            {
            match("variant"); 


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
            // InternalEis.g:72:7: ( 'set' )
            // InternalEis.g:72:9: 'set'
            {
            match("set"); 


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
            // InternalEis.g:73:7: ( 'assert' )
            // InternalEis.g:73:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "RULE_X"
    public final void mRULE_X() throws RecognitionException {
        try {
            // InternalEis.g:6826:17: ( '0' .. '9' )
            // InternalEis.g:6826:19: '0' .. '9'
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
            // InternalEis.g:6828:19: ( ( RULE_X | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalEis.g:6828:21: ( RULE_X | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalEis.g:6830:11: ( ( RULE_X )+ )
            // InternalEis.g:6830:13: ( RULE_X )+
            {
            // InternalEis.g:6830:13: ( RULE_X )+
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
            	    // InternalEis.g:6830:13: RULE_X
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
            // InternalEis.g:6832:20: ( '-' RULE_LONG )
            // InternalEis.g:6832:22: '-' RULE_LONG
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
            // InternalEis.g:6834:11: ( ( RULE_LONG | RULE_NEGATIVE_LONG ) '.' ( RULE_X )+ )
            // InternalEis.g:6834:13: ( RULE_LONG | RULE_NEGATIVE_LONG ) '.' ( RULE_X )+
            {
            // InternalEis.g:6834:13: ( RULE_LONG | RULE_NEGATIVE_LONG )
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
                    // InternalEis.g:6834:14: RULE_LONG
                    {
                    mRULE_LONG(); 

                    }
                    break;
                case 2 :
                    // InternalEis.g:6834:24: RULE_NEGATIVE_LONG
                    {
                    mRULE_NEGATIVE_LONG(); 

                    }
                    break;

            }

            match('.'); 
            // InternalEis.g:6834:48: ( RULE_X )+
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
            	    // InternalEis.g:6834:48: RULE_X
            	    {
            	    mRULE_X(); 

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
            // InternalEis.g:6836:11: ( '16#' RULE_HEX RULE_HEX )
            // InternalEis.g:6836:13: '16#' RULE_HEX RULE_HEX
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
            // InternalEis.g:6838:11: ( '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalEis.g:6838:13: '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
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
            // InternalEis.g:6840:12: ( '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalEis.g:6840:14: '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
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
            // InternalEis.g:6842:12: ( '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalEis.g:6842:14: '16#' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX '_' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
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

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6844:11: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) '\\'' )
            // InternalEis.g:6844:13: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) '\\''
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
            // InternalEis.g:6846:11: ( 'T#' ( '-' )? ( ( RULE_X )? RULE_X 'd' ( '_' )? )? ( ( RULE_X )? RULE_X 'h' ( '_' )? )? ( ( RULE_X )? RULE_X 'M' ( '_' )? )? ( ( RULE_X )? RULE_X 's' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' )? )
            // InternalEis.g:6846:13: 'T#' ( '-' )? ( ( RULE_X )? RULE_X 'd' ( '_' )? )? ( ( RULE_X )? RULE_X 'h' ( '_' )? )? ( ( RULE_X )? RULE_X 'M' ( '_' )? )? ( ( RULE_X )? RULE_X 's' ( '_' )? )? ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' )?
            {
            match("T#"); 

            // InternalEis.g:6846:18: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEis.g:6846:18: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalEis.g:6846:23: ( ( RULE_X )? RULE_X 'd' ( '_' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>='0' && LA7_1<='9')) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3=='d') ) {
                        alt7=1;
                    }
                }
                else if ( (LA7_1=='d') ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalEis.g:6846:24: ( RULE_X )? RULE_X 'd' ( '_' )?
                    {
                    // InternalEis.g:6846:24: ( RULE_X )?
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
                            // InternalEis.g:6846:24: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('d'); 
                    // InternalEis.g:6846:43: ( '_' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='_') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalEis.g:6846:43: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6846:50: ( ( RULE_X )? RULE_X 'h' ( '_' )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>='0' && LA10_1<='9')) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3=='h') ) {
                        alt10=1;
                    }
                }
                else if ( (LA10_1=='h') ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalEis.g:6846:51: ( RULE_X )? RULE_X 'h' ( '_' )?
                    {
                    // InternalEis.g:6846:51: ( RULE_X )?
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
                            // InternalEis.g:6846:51: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('h'); 
                    // InternalEis.g:6846:70: ( '_' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='_') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalEis.g:6846:70: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6846:77: ( ( RULE_X )? RULE_X 'M' ( '_' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='9')) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='M') ) {
                        alt13=1;
                    }
                }
                else if ( (LA13_1=='M') ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalEis.g:6846:78: ( RULE_X )? RULE_X 'M' ( '_' )?
                    {
                    // InternalEis.g:6846:78: ( RULE_X )?
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
                            // InternalEis.g:6846:78: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('M'); 
                    // InternalEis.g:6846:97: ( '_' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='_') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEis.g:6846:97: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6846:104: ( ( RULE_X )? RULE_X 's' ( '_' )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='9')) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3=='s') ) {
                        alt16=1;
                    }
                }
                else if ( (LA16_1=='s') ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalEis.g:6846:105: ( RULE_X )? RULE_X 's' ( '_' )?
                    {
                    // InternalEis.g:6846:105: ( RULE_X )?
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
                            // InternalEis.g:6846:105: RULE_X
                            {
                            mRULE_X(); 

                            }
                            break;

                    }

                    mRULE_X(); 
                    match('s'); 
                    // InternalEis.g:6846:124: ( '_' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='_') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEis.g:6846:124: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:6846:131: ( ( ( RULE_X )? RULE_X )? RULE_X 'ms' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEis.g:6846:132: ( ( RULE_X )? RULE_X )? RULE_X 'ms'
                    {
                    // InternalEis.g:6846:132: ( ( RULE_X )? RULE_X )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                        int LA18_1 = input.LA(2);

                        if ( ((LA18_1>='0' && LA18_1<='9')) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEis.g:6846:133: ( RULE_X )? RULE_X
                            {
                            // InternalEis.g:6846:133: ( RULE_X )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                                int LA17_1 = input.LA(2);

                                if ( ((LA17_1>='0' && LA17_1<='9')) ) {
                                    int LA17_2 = input.LA(3);

                                    if ( ((LA17_2>='0' && LA17_2<='9')) ) {
                                        alt17=1;
                                    }
                                }
                            }
                            switch (alt17) {
                                case 1 :
                                    // InternalEis.g:6846:133: RULE_X
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEis.g:6848:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEis.g:6848:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEis.g:6848:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEis.g:6848:11: '^'
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

            // InternalEis.g:6848:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    break loop21;
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
            // InternalEis.g:6850:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEis.g:6850:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEis.g:6850:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\"') ) {
                alt24=1;
            }
            else if ( (LA24_0=='\'') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEis.g:6850:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEis.g:6850:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\\') ) {
                            alt22=1;
                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalEis.g:6850:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEis.g:6850:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop22;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEis.g:6850:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEis.g:6850:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalEis.g:6850:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEis.g:6850:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop23;
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
            // InternalEis.g:6852:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEis.g:6852:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEis.g:6852:24: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='*') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='/') ) {
                        alt25=2;
                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEis.g:6852:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
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
            // InternalEis.g:6854:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEis.g:6854:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEis.g:6854:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEis.g:6854:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop26;
                }
            } while (true);

            // InternalEis.g:6854:40: ( ( '\\r' )? '\\n' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEis.g:6854:41: ( '\\r' )? '\\n'
                    {
                    // InternalEis.g:6854:41: ( '\\r' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\r') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalEis.g:6854:41: '\\r'
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
            // InternalEis.g:6856:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEis.g:6856:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEis.g:6856:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // InternalEis.g:6858:16: ( . )
            // InternalEis.g:6858:18: .
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
        // InternalEis.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_LONG | RULE_NEGATIVE_LONG | RULE_REAL | RULE_BYTE | RULE_WORD | RULE_DWORD | RULE_LWORD | RULE_CHAR | RULE_TIME | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=78;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalEis.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalEis.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalEis.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalEis.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalEis.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalEis.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalEis.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalEis.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalEis.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalEis.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalEis.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalEis.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalEis.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalEis.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalEis.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalEis.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalEis.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalEis.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalEis.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // InternalEis.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // InternalEis.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // InternalEis.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // InternalEis.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // InternalEis.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // InternalEis.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // InternalEis.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // InternalEis.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // InternalEis.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // InternalEis.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // InternalEis.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // InternalEis.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // InternalEis.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // InternalEis.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // InternalEis.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // InternalEis.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // InternalEis.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // InternalEis.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // InternalEis.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // InternalEis.g:1:238: T__59
                {
                mT__59(); 

                }
                break;
            case 40 :
                // InternalEis.g:1:244: T__60
                {
                mT__60(); 

                }
                break;
            case 41 :
                // InternalEis.g:1:250: T__61
                {
                mT__61(); 

                }
                break;
            case 42 :
                // InternalEis.g:1:256: T__62
                {
                mT__62(); 

                }
                break;
            case 43 :
                // InternalEis.g:1:262: T__63
                {
                mT__63(); 

                }
                break;
            case 44 :
                // InternalEis.g:1:268: T__64
                {
                mT__64(); 

                }
                break;
            case 45 :
                // InternalEis.g:1:274: T__65
                {
                mT__65(); 

                }
                break;
            case 46 :
                // InternalEis.g:1:280: T__66
                {
                mT__66(); 

                }
                break;
            case 47 :
                // InternalEis.g:1:286: T__67
                {
                mT__67(); 

                }
                break;
            case 48 :
                // InternalEis.g:1:292: T__68
                {
                mT__68(); 

                }
                break;
            case 49 :
                // InternalEis.g:1:298: T__69
                {
                mT__69(); 

                }
                break;
            case 50 :
                // InternalEis.g:1:304: T__70
                {
                mT__70(); 

                }
                break;
            case 51 :
                // InternalEis.g:1:310: T__71
                {
                mT__71(); 

                }
                break;
            case 52 :
                // InternalEis.g:1:316: T__72
                {
                mT__72(); 

                }
                break;
            case 53 :
                // InternalEis.g:1:322: T__73
                {
                mT__73(); 

                }
                break;
            case 54 :
                // InternalEis.g:1:328: T__74
                {
                mT__74(); 

                }
                break;
            case 55 :
                // InternalEis.g:1:334: T__75
                {
                mT__75(); 

                }
                break;
            case 56 :
                // InternalEis.g:1:340: T__76
                {
                mT__76(); 

                }
                break;
            case 57 :
                // InternalEis.g:1:346: T__77
                {
                mT__77(); 

                }
                break;
            case 58 :
                // InternalEis.g:1:352: T__78
                {
                mT__78(); 

                }
                break;
            case 59 :
                // InternalEis.g:1:358: T__79
                {
                mT__79(); 

                }
                break;
            case 60 :
                // InternalEis.g:1:364: T__80
                {
                mT__80(); 

                }
                break;
            case 61 :
                // InternalEis.g:1:370: T__81
                {
                mT__81(); 

                }
                break;
            case 62 :
                // InternalEis.g:1:376: T__82
                {
                mT__82(); 

                }
                break;
            case 63 :
                // InternalEis.g:1:382: T__83
                {
                mT__83(); 

                }
                break;
            case 64 :
                // InternalEis.g:1:388: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 65 :
                // InternalEis.g:1:398: RULE_NEGATIVE_LONG
                {
                mRULE_NEGATIVE_LONG(); 

                }
                break;
            case 66 :
                // InternalEis.g:1:417: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 67 :
                // InternalEis.g:1:427: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 68 :
                // InternalEis.g:1:437: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 69 :
                // InternalEis.g:1:447: RULE_DWORD
                {
                mRULE_DWORD(); 

                }
                break;
            case 70 :
                // InternalEis.g:1:458: RULE_LWORD
                {
                mRULE_LWORD(); 

                }
                break;
            case 71 :
                // InternalEis.g:1:469: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 72 :
                // InternalEis.g:1:479: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 73 :
                // InternalEis.g:1:489: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 74 :
                // InternalEis.g:1:497: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalEis.g:1:509: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalEis.g:1:525: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // InternalEis.g:1:541: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalEis.g:1:549: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA30_eotS =
        "\1\uffff\3\60\1\uffff\1\67\1\71\1\73\1\75\1\uffff\1\101\14\60\4\uffff\1\140\2\uffff\2\55\1\145\2\uffff\2\60\2\154\1\55\1\60\1\55\1\uffff\1\55\2\uffff\1\163\1\164\1\uffff\4\60\15\uffff\31\60\13\uffff\1\u0096\2\uffff\2\60\1\154\1\uffff\1\154\7\uffff\5\60\1\u00a0\10\60\1\u00a9\14\60\1\u00b6\5\60\1\uffff\2\60\2\uffff\1\u00c0\1\u00c1\2\60\1\u00c6\1\uffff\2\60\1\u00c9\1\u00ca\1\60\1\u00cc\1\60\1\u00ce\1\uffff\1\u00cf\1\u00d0\1\60\1\u00d2\3\60\1\u00d6\2\60\1\u00d9\1\60\1\uffff\7\60\4\uffff\3\60\1\u00e6\1\uffff\1\u00e7\1\u00e8\2\uffff\1\60\1\uffff\1\60\3\uffff\1\u00eb\1\uffff\2\60\1\u00ee\1\uffff\1\u00ef\1\u00f0\1\uffff\1\u00f1\1\u00f2\6\60\1\u00f9\3\60\3\uffff\1\60\1\u00ff\1\uffff\1\60\1\u0101\5\uffff\2\60\1\u0104\1\u0105\1\u0106\1\60\2\uffff\4\60\1\uffff\1\60\1\uffff\1\u010e\1\u010f\3\uffff\1\u0110\1\u0111\1\u0113\1\60\1\u0115\2\60\6\uffff\1\60\1\uffff\1\u011a\1\60\1\uffff\1\u011d\1\uffff\1\60\2\uffff\1\u0120\2\uffff\1\u0122\2\uffff";
    static final String DFA30_eofS =
        "\u0124\uffff";
    static final String DFA30_minS =
        "\1\0\1\102\1\145\1\141\1\uffff\4\75\1\uffff\1\52\1\165\1\156\1\154\2\145\1\150\1\157\1\145\1\151\1\144\1\154\1\163\4\uffff\1\57\2\uffff\1\174\1\46\1\60\2\uffff\1\165\1\141\2\56\1\0\1\43\1\101\1\uffff\1\0\2\uffff\2\60\1\uffff\1\165\1\155\1\163\1\154\15\uffff\1\154\2\157\1\164\1\157\1\141\1\162\1\156\1\164\1\141\1\162\1\157\1\156\1\146\1\157\1\156\2\151\1\156\2\151\1\157\1\143\1\164\1\163\13\uffff\1\56\2\uffff\1\164\1\162\1\43\1\uffff\1\56\1\uffff\1\0\5\uffff\2\145\1\164\1\163\1\154\1\60\2\165\1\154\1\145\1\143\1\154\1\151\1\164\1\60\1\162\1\144\1\162\1\164\1\143\1\151\1\162\1\164\1\155\1\156\1\164\1\156\1\60\1\156\1\152\1\156\1\150\1\145\1\uffff\1\160\1\151\1\60\1\uffff\2\60\1\101\1\145\1\60\1\uffff\2\164\2\60\1\153\1\60\1\156\1\60\1\uffff\2\60\1\144\1\60\1\162\1\156\1\144\1\60\1\145\1\164\1\60\1\164\1\uffff\1\164\1\145\1\141\1\157\1\162\1\165\1\141\1\60\3\uffff\1\141\1\143\1\164\1\60\1\uffff\2\60\2\uffff\1\124\1\uffff\1\147\3\uffff\1\60\1\uffff\1\151\1\145\1\60\1\uffff\2\60\1\uffff\2\60\1\143\1\155\1\162\2\164\1\156\1\60\1\163\1\164\1\145\3\uffff\1\171\1\60\1\uffff\1\160\1\60\5\uffff\1\164\1\145\3\60\1\164\1\uffff\1\60\1\145\1\151\2\160\1\uffff\1\164\1\uffff\2\60\3\uffff\1\60\1\137\1\60\1\166\1\60\1\145\1\151\4\uffff\1\60\1\uffff\1\145\1\uffff\1\60\1\157\2\60\1\uffff\1\156\1\60\1\uffff\2\60\1\uffff\1\137\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\1\103\1\162\1\141\1\uffff\4\75\1\uffff\1\57\1\165\1\156\1\171\1\145\1\164\1\150\1\157\2\167\1\163\1\162\1\165\4\uffff\1\57\2\uffff\1\174\1\46\1\71\2\uffff\1\165\1\141\2\71\1\uffff\1\43\1\172\1\uffff\1\uffff\2\uffff\2\172\1\uffff\1\165\1\155\1\163\1\154\15\uffff\1\154\1\164\1\157\1\164\1\157\1\141\1\162\1\156\1\164\1\141\1\162\1\157\1\156\1\163\1\157\1\156\2\151\1\156\1\164\1\151\1\157\1\143\1\164\1\163\13\uffff\1\71\2\uffff\1\164\1\162\1\71\1\uffff\1\71\1\uffff\1\uffff\5\uffff\2\145\1\164\1\163\1\154\1\172\2\165\1\154\1\145\1\143\1\154\1\151\1\164\1\172\1\162\1\144\1\162\1\164\1\143\1\151\1\162\1\164\1\155\1\156\1\164\1\156\1\172\1\156\1\152\1\156\1\150\1\145\1\uffff\1\160\1\151\1\146\1\uffff\2\172\1\163\1\145\1\172\1\uffff\2\164\2\172\1\153\1\172\1\156\1\172\1\uffff\2\172\1\144\1\172\1\162\1\156\1\144\1\172\1\145\1\164\1\172\1\164\1\uffff\1\164\1\145\1\141\1\157\1\162\1\165\1\141\1\146\3\uffff\1\141\1\143\1\164\1\172\1\uffff\2\172\2\uffff\1\124\1\uffff\1\147\3\uffff\1\172\1\uffff\1\151\1\145\1\172\1\uffff\2\172\1\uffff\2\172\1\143\1\155\1\162\2\164\1\156\1\146\1\163\1\164\1\145\3\uffff\1\171\1\172\1\uffff\1\160\1\172\5\uffff\1\164\1\145\3\172\1\164\1\uffff\1\146\1\145\1\151\2\160\1\uffff\1\164\1\uffff\2\172\3\uffff\1\172\1\137\1\172\1\166\1\172\1\145\1\151\4\uffff\1\146\1\uffff\1\145\1\uffff\1\172\1\157\1\146\1\172\1\uffff\1\156\1\146\1\uffff\1\172\1\146\1\uffff\1\137\2\uffff";
    static final String DFA30_acceptS =
        "\4\uffff\1\5\4\uffff\1\14\15\uffff\1\46\1\47\1\54\1\55\1\uffff\1\60\1\61\3\uffff\1\70\1\71\7\uffff\1\111\1\uffff\1\115\1\116\2\uffff\1\111\4\uffff\1\5\1\6\1\42\1\7\1\66\1\10\1\12\1\11\1\13\1\14\1\113\1\114\1\15\31\uffff\1\46\1\47\1\54\1\55\1\56\1\64\1\60\1\61\1\62\1\63\1\65\1\uffff\1\70\1\71\3\uffff\1\100\1\uffff\1\102\1\uffff\1\112\1\110\1\115\1\1\1\2\41\uffff\1\101\3\uffff\1\107\5\uffff\1\17\10\uffff\1\76\14\uffff\1\57\10\uffff\1\107\1\3\1\37\4\uffff\1\16\2\uffff\1\20\1\24\1\uffff\1\21\1\uffff\1\34\1\23\1\25\1\uffff\1\35\3\uffff\1\36\2\uffff\1\31\14\uffff\1\4\1\72\1\74\2\uffff\1\26\2\uffff\1\27\1\40\1\30\1\32\1\33\6\uffff\1\103\5\uffff\1\22\1\uffff\1\53\2\uffff\1\44\1\77\1\73\7\uffff\1\41\1\43\1\75\1\104\1\uffff\1\45\1\uffff\1\67\4\uffff\1\51\2\uffff\1\50\2\uffff\1\52\1\uffff\1\105\1\106";
    static final String DFA30_specialS =
        "\1\2\46\uffff\1\3\3\uffff\1\0\103\uffff\1\1\u00b4\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\6\1\53\3\55\1\37\1\47\1\34\1\35\1\11\1\33\1\41\1\40\1\42\1\12\1\46\1\45\10\46\1\55\1\4\1\10\1\5\1\7\2\55\5\52\1\1\15\52\1\50\6\52\1\31\1\55\1\32\1\51\1\52\1\55\1\26\1\15\1\20\1\22\1\52\1\3\2\52\1\14\2\52\1\23\1\52\1\13\1\43\1\25\1\52\1\16\1\17\1\2\1\24\1\44\1\21\3\52\1\27\1\36\1\30\uff82\55",
            "\1\57\1\56",
            "\1\63\3\uffff\1\62\10\uffff\1\61",
            "\1\64",
            "",
            "\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "\1\77\4\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\106\2\uffff\1\104\11\uffff\1\105",
            "\1\107",
            "\1\112\3\uffff\1\111\12\uffff\1\110",
            "\1\113",
            "\1\114",
            "\1\117\3\uffff\1\116\15\uffff\1\115",
            "\1\121\12\uffff\1\122\2\uffff\1\120",
            "\1\125\4\uffff\1\124\2\uffff\1\126\6\uffff\1\123",
            "\1\130\5\uffff\1\127",
            "\1\132\1\uffff\1\131",
            "",
            "",
            "",
            "",
            "\1\137",
            "",
            "",
            "\1\143",
            "\1\144",
            "\12\146",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\156\1\uffff\6\155\1\153\3\155",
            "\1\156\1\uffff\12\155",
            "\60\160\12\157\7\160\32\157\6\160\32\157\uff85\160",
            "\1\161",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\0\160",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
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
            "\1\171",
            "\1\174\1\173\3\uffff\1\172",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\14\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\12\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
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
            "\1\156\1\uffff\12\146",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\12\uffff\1\156\1\uffff\12\155",
            "",
            "\1\156\1\uffff\12\155",
            "",
            "\47\160\1\u009a\uffd8\160",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\12\u00be\7\uffff\6\u00be\32\uffff\6\u00be",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c3\41\uffff\1\u00c2\17\uffff\1\u00c4",
            "\1\u00c5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00cb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00cd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d7",
            "\1\u00d8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\u00e2\7\uffff\6\u00e2\32\uffff\6\u00e2",
            "",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\u00fa\7\uffff\6\u00fa\32\uffff\6\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "",
            "",
            "\1\u00fe",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0100",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0107",
            "",
            "\12\u0108\7\uffff\6\u0108\32\uffff\6\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0112",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0114",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "",
            "\12\u0118\7\uffff\6\u0118\32\uffff\6\u0118",
            "",
            "\1\u0119",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011b",
            "\12\u011c\7\uffff\6\u011c\32\uffff\6\u011c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u011e",
            "\12\u011f\7\uffff\6\u011f\32\uffff\6\u011f",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\u0121\7\uffff\6\u0121\32\uffff\6\u0121",
            "",
            "\1\u0123",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_LONG | RULE_NEGATIVE_LONG | RULE_REAL | RULE_BYTE | RULE_WORD | RULE_DWORD | RULE_LWORD | RULE_CHAR | RULE_TIME | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_43 = input.LA(1);

                        s = -1;
                        if ( ((LA30_43>='\u0000' && LA30_43<='\uFFFF')) ) {s = 112;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_111 = input.LA(1);

                        s = -1;
                        if ( (LA30_111=='\'') ) {s = 154;}

                        else if ( ((LA30_111>='\u0000' && LA30_111<='&')||(LA30_111>='(' && LA30_111<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='F') ) {s = 1;}

                        else if ( (LA30_0=='t') ) {s = 2;}

                        else if ( (LA30_0=='f') ) {s = 3;}

                        else if ( (LA30_0==';') ) {s = 4;}

                        else if ( (LA30_0=='=') ) {s = 5;}

                        else if ( (LA30_0=='!') ) {s = 6;}

                        else if ( (LA30_0=='>') ) {s = 7;}

                        else if ( (LA30_0=='<') ) {s = 8;}

                        else if ( (LA30_0=='*') ) {s = 9;}

                        else if ( (LA30_0=='/') ) {s = 10;}

                        else if ( (LA30_0=='n') ) {s = 11;}

                        else if ( (LA30_0=='i') ) {s = 12;}

                        else if ( (LA30_0=='b') ) {s = 13;}

                        else if ( (LA30_0=='r') ) {s = 14;}

                        else if ( (LA30_0=='s') ) {s = 15;}

                        else if ( (LA30_0=='c') ) {s = 16;}

                        else if ( (LA30_0=='w') ) {s = 17;}

                        else if ( (LA30_0=='d') ) {s = 18;}

                        else if ( (LA30_0=='l') ) {s = 19;}

                        else if ( (LA30_0=='u') ) {s = 20;}

                        else if ( (LA30_0=='p') ) {s = 21;}

                        else if ( (LA30_0=='a') ) {s = 22;}

                        else if ( (LA30_0=='{') ) {s = 23;}

                        else if ( (LA30_0=='}') ) {s = 24;}

                        else if ( (LA30_0=='[') ) {s = 25;}

                        else if ( (LA30_0==']') ) {s = 26;}

                        else if ( (LA30_0=='+') ) {s = 27;}

                        else if ( (LA30_0=='(') ) {s = 28;}

                        else if ( (LA30_0==')') ) {s = 29;}

                        else if ( (LA30_0=='|') ) {s = 30;}

                        else if ( (LA30_0=='&') ) {s = 31;}

                        else if ( (LA30_0=='-') ) {s = 32;}

                        else if ( (LA30_0==',') ) {s = 33;}

                        else if ( (LA30_0=='.') ) {s = 34;}

                        else if ( (LA30_0=='o') ) {s = 35;}

                        else if ( (LA30_0=='v') ) {s = 36;}

                        else if ( (LA30_0=='1') ) {s = 37;}

                        else if ( (LA30_0=='0'||(LA30_0>='2' && LA30_0<='9')) ) {s = 38;}

                        else if ( (LA30_0=='\'') ) {s = 39;}

                        else if ( (LA30_0=='T') ) {s = 40;}

                        else if ( (LA30_0=='^') ) {s = 41;}

                        else if ( ((LA30_0>='A' && LA30_0<='E')||(LA30_0>='G' && LA30_0<='S')||(LA30_0>='U' && LA30_0<='Z')||LA30_0=='_'||LA30_0=='e'||(LA30_0>='g' && LA30_0<='h')||(LA30_0>='j' && LA30_0<='k')||LA30_0=='m'||LA30_0=='q'||(LA30_0>='x' && LA30_0<='z')) ) {s = 42;}

                        else if ( (LA30_0=='\"') ) {s = 43;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 44;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||(LA30_0>='#' && LA30_0<='%')||LA30_0==':'||(LA30_0>='?' && LA30_0<='@')||LA30_0=='\\'||LA30_0=='`'||(LA30_0>='~' && LA30_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_39 = input.LA(1);

                        s = -1;
                        if ( ((LA30_39>='0' && LA30_39<='9')||(LA30_39>='A' && LA30_39<='Z')||(LA30_39>='a' && LA30_39<='z')) ) {s = 111;}

                        else if ( ((LA30_39>='\u0000' && LA30_39<='/')||(LA30_39>=':' && LA30_39<='@')||(LA30_39>='[' && LA30_39<='`')||(LA30_39>='{' && LA30_39<='\uFFFF')) ) {s = 112;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}