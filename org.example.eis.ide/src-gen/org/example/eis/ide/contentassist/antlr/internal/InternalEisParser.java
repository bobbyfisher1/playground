package org.example.eis.ide.contentassist.antlr.internal;

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
import org.example.eis.services.EisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEisParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEisParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEis.g"; }


    	private EisGrammarAccess grammarAccess;

    	public void setGrammarAccess(EisGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalEis.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEis.g:54:1: ( ruleModel EOF )
            // InternalEis.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEis.g:62:1: ruleModel : ( ( rule__Model__EisAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:66:2: ( ( ( rule__Model__EisAssignment )* ) )
            // InternalEis.g:67:2: ( ( rule__Model__EisAssignment )* )
            {
            // InternalEis.g:67:2: ( ( rule__Model__EisAssignment )* )
            // InternalEis.g:68:3: ( rule__Model__EisAssignment )*
            {
             before(grammarAccess.getModelAccess().getEisAssignment()); 
            // InternalEis.g:69:3: ( rule__Model__EisAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:69:4: rule__Model__EisAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EisAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEisAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEisType"
    // InternalEis.g:78:1: entryRuleEisType : ruleEisType EOF ;
    public final void entryRuleEisType() throws RecognitionException {
        try {
            // InternalEis.g:79:1: ( ruleEisType EOF )
            // InternalEis.g:80:1: ruleEisType EOF
            {
             before(grammarAccess.getEisTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEisType();

            state._fsp--;

             after(grammarAccess.getEisTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEisType"


    // $ANTLR start "ruleEisType"
    // InternalEis.g:87:1: ruleEisType : ( ( rule__EisType__Alternatives ) ) ;
    public final void ruleEisType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:91:2: ( ( ( rule__EisType__Alternatives ) ) )
            // InternalEis.g:92:2: ( ( rule__EisType__Alternatives ) )
            {
            // InternalEis.g:92:2: ( ( rule__EisType__Alternatives ) )
            // InternalEis.g:93:3: ( rule__EisType__Alternatives )
            {
             before(grammarAccess.getEisTypeAccess().getAlternatives()); 
            // InternalEis.g:94:3: ( rule__EisType__Alternatives )
            // InternalEis.g:94:4: rule__EisType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EisType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEisTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEisType"


    // $ANTLR start "entryRuleTiaProjectName"
    // InternalEis.g:103:1: entryRuleTiaProjectName : ruleTiaProjectName EOF ;
    public final void entryRuleTiaProjectName() throws RecognitionException {
        try {
            // InternalEis.g:104:1: ( ruleTiaProjectName EOF )
            // InternalEis.g:105:1: ruleTiaProjectName EOF
            {
             before(grammarAccess.getTiaProjectNameRule()); 
            pushFollow(FOLLOW_1);
            ruleTiaProjectName();

            state._fsp--;

             after(grammarAccess.getTiaProjectNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTiaProjectName"


    // $ANTLR start "ruleTiaProjectName"
    // InternalEis.g:112:1: ruleTiaProjectName : ( ( rule__TiaProjectName__Group__0 ) ) ;
    public final void ruleTiaProjectName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:116:2: ( ( ( rule__TiaProjectName__Group__0 ) ) )
            // InternalEis.g:117:2: ( ( rule__TiaProjectName__Group__0 ) )
            {
            // InternalEis.g:117:2: ( ( rule__TiaProjectName__Group__0 ) )
            // InternalEis.g:118:3: ( rule__TiaProjectName__Group__0 )
            {
             before(grammarAccess.getTiaProjectNameAccess().getGroup()); 
            // InternalEis.g:119:3: ( rule__TiaProjectName__Group__0 )
            // InternalEis.g:119:4: rule__TiaProjectName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TiaProjectName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTiaProjectNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTiaProjectName"


    // $ANTLR start "entryRulePLCName"
    // InternalEis.g:128:1: entryRulePLCName : rulePLCName EOF ;
    public final void entryRulePLCName() throws RecognitionException {
        try {
            // InternalEis.g:129:1: ( rulePLCName EOF )
            // InternalEis.g:130:1: rulePLCName EOF
            {
             before(grammarAccess.getPLCNameRule()); 
            pushFollow(FOLLOW_1);
            rulePLCName();

            state._fsp--;

             after(grammarAccess.getPLCNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePLCName"


    // $ANTLR start "rulePLCName"
    // InternalEis.g:137:1: rulePLCName : ( ( rule__PLCName__Group__0 ) ) ;
    public final void rulePLCName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:141:2: ( ( ( rule__PLCName__Group__0 ) ) )
            // InternalEis.g:142:2: ( ( rule__PLCName__Group__0 ) )
            {
            // InternalEis.g:142:2: ( ( rule__PLCName__Group__0 ) )
            // InternalEis.g:143:3: ( rule__PLCName__Group__0 )
            {
             before(grammarAccess.getPLCNameAccess().getGroup()); 
            // InternalEis.g:144:3: ( rule__PLCName__Group__0 )
            // InternalEis.g:144:4: rule__PLCName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PLCName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPLCNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePLCName"


    // $ANTLR start "rule__EisType__Alternatives"
    // InternalEis.g:152:1: rule__EisType__Alternatives : ( ( ruleTiaProjectName ) | ( rulePLCName ) );
    public final void rule__EisType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:156:1: ( ( ruleTiaProjectName ) | ( rulePLCName ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEis.g:157:2: ( ruleTiaProjectName )
                    {
                    // InternalEis.g:157:2: ( ruleTiaProjectName )
                    // InternalEis.g:158:3: ruleTiaProjectName
                    {
                     before(grammarAccess.getEisTypeAccess().getTiaProjectNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTiaProjectName();

                    state._fsp--;

                     after(grammarAccess.getEisTypeAccess().getTiaProjectNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:163:2: ( rulePLCName )
                    {
                    // InternalEis.g:163:2: ( rulePLCName )
                    // InternalEis.g:164:3: rulePLCName
                    {
                     before(grammarAccess.getEisTypeAccess().getPLCNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePLCName();

                    state._fsp--;

                     after(grammarAccess.getEisTypeAccess().getPLCNameParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EisType__Alternatives"


    // $ANTLR start "rule__TiaProjectName__Group__0"
    // InternalEis.g:173:1: rule__TiaProjectName__Group__0 : rule__TiaProjectName__Group__0__Impl rule__TiaProjectName__Group__1 ;
    public final void rule__TiaProjectName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:177:1: ( rule__TiaProjectName__Group__0__Impl rule__TiaProjectName__Group__1 )
            // InternalEis.g:178:2: rule__TiaProjectName__Group__0__Impl rule__TiaProjectName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TiaProjectName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TiaProjectName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__0"


    // $ANTLR start "rule__TiaProjectName__Group__0__Impl"
    // InternalEis.g:185:1: rule__TiaProjectName__Group__0__Impl : ( 'project' ) ;
    public final void rule__TiaProjectName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:189:1: ( ( 'project' ) )
            // InternalEis.g:190:1: ( 'project' )
            {
            // InternalEis.g:190:1: ( 'project' )
            // InternalEis.g:191:2: 'project'
            {
             before(grammarAccess.getTiaProjectNameAccess().getProjectKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTiaProjectNameAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__0__Impl"


    // $ANTLR start "rule__TiaProjectName__Group__1"
    // InternalEis.g:200:1: rule__TiaProjectName__Group__1 : rule__TiaProjectName__Group__1__Impl rule__TiaProjectName__Group__2 ;
    public final void rule__TiaProjectName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:204:1: ( rule__TiaProjectName__Group__1__Impl rule__TiaProjectName__Group__2 )
            // InternalEis.g:205:2: rule__TiaProjectName__Group__1__Impl rule__TiaProjectName__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TiaProjectName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TiaProjectName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__1"


    // $ANTLR start "rule__TiaProjectName__Group__1__Impl"
    // InternalEis.g:212:1: rule__TiaProjectName__Group__1__Impl : ( '=' ) ;
    public final void rule__TiaProjectName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:216:1: ( ( '=' ) )
            // InternalEis.g:217:1: ( '=' )
            {
            // InternalEis.g:217:1: ( '=' )
            // InternalEis.g:218:2: '='
            {
             before(grammarAccess.getTiaProjectNameAccess().getEqualsSignKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTiaProjectNameAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__1__Impl"


    // $ANTLR start "rule__TiaProjectName__Group__2"
    // InternalEis.g:227:1: rule__TiaProjectName__Group__2 : rule__TiaProjectName__Group__2__Impl rule__TiaProjectName__Group__3 ;
    public final void rule__TiaProjectName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:231:1: ( rule__TiaProjectName__Group__2__Impl rule__TiaProjectName__Group__3 )
            // InternalEis.g:232:2: rule__TiaProjectName__Group__2__Impl rule__TiaProjectName__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TiaProjectName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TiaProjectName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__2"


    // $ANTLR start "rule__TiaProjectName__Group__2__Impl"
    // InternalEis.g:239:1: rule__TiaProjectName__Group__2__Impl : ( ( rule__TiaProjectName__NameAssignment_2 ) ) ;
    public final void rule__TiaProjectName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:243:1: ( ( ( rule__TiaProjectName__NameAssignment_2 ) ) )
            // InternalEis.g:244:1: ( ( rule__TiaProjectName__NameAssignment_2 ) )
            {
            // InternalEis.g:244:1: ( ( rule__TiaProjectName__NameAssignment_2 ) )
            // InternalEis.g:245:2: ( rule__TiaProjectName__NameAssignment_2 )
            {
             before(grammarAccess.getTiaProjectNameAccess().getNameAssignment_2()); 
            // InternalEis.g:246:2: ( rule__TiaProjectName__NameAssignment_2 )
            // InternalEis.g:246:3: rule__TiaProjectName__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TiaProjectName__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTiaProjectNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__2__Impl"


    // $ANTLR start "rule__TiaProjectName__Group__3"
    // InternalEis.g:254:1: rule__TiaProjectName__Group__3 : rule__TiaProjectName__Group__3__Impl ;
    public final void rule__TiaProjectName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:258:1: ( rule__TiaProjectName__Group__3__Impl )
            // InternalEis.g:259:2: rule__TiaProjectName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TiaProjectName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__3"


    // $ANTLR start "rule__TiaProjectName__Group__3__Impl"
    // InternalEis.g:265:1: rule__TiaProjectName__Group__3__Impl : ( ';' ) ;
    public final void rule__TiaProjectName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:269:1: ( ( ';' ) )
            // InternalEis.g:270:1: ( ';' )
            {
            // InternalEis.g:270:1: ( ';' )
            // InternalEis.g:271:2: ';'
            {
             before(grammarAccess.getTiaProjectNameAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTiaProjectNameAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__Group__3__Impl"


    // $ANTLR start "rule__PLCName__Group__0"
    // InternalEis.g:281:1: rule__PLCName__Group__0 : rule__PLCName__Group__0__Impl rule__PLCName__Group__1 ;
    public final void rule__PLCName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:285:1: ( rule__PLCName__Group__0__Impl rule__PLCName__Group__1 )
            // InternalEis.g:286:2: rule__PLCName__Group__0__Impl rule__PLCName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PLCName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLCName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__0"


    // $ANTLR start "rule__PLCName__Group__0__Impl"
    // InternalEis.g:293:1: rule__PLCName__Group__0__Impl : ( 'plcname' ) ;
    public final void rule__PLCName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:297:1: ( ( 'plcname' ) )
            // InternalEis.g:298:1: ( 'plcname' )
            {
            // InternalEis.g:298:1: ( 'plcname' )
            // InternalEis.g:299:2: 'plcname'
            {
             before(grammarAccess.getPLCNameAccess().getPlcnameKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPLCNameAccess().getPlcnameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__0__Impl"


    // $ANTLR start "rule__PLCName__Group__1"
    // InternalEis.g:308:1: rule__PLCName__Group__1 : rule__PLCName__Group__1__Impl rule__PLCName__Group__2 ;
    public final void rule__PLCName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:312:1: ( rule__PLCName__Group__1__Impl rule__PLCName__Group__2 )
            // InternalEis.g:313:2: rule__PLCName__Group__1__Impl rule__PLCName__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PLCName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLCName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__1"


    // $ANTLR start "rule__PLCName__Group__1__Impl"
    // InternalEis.g:320:1: rule__PLCName__Group__1__Impl : ( '=' ) ;
    public final void rule__PLCName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:324:1: ( ( '=' ) )
            // InternalEis.g:325:1: ( '=' )
            {
            // InternalEis.g:325:1: ( '=' )
            // InternalEis.g:326:2: '='
            {
             before(grammarAccess.getPLCNameAccess().getEqualsSignKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPLCNameAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__1__Impl"


    // $ANTLR start "rule__PLCName__Group__2"
    // InternalEis.g:335:1: rule__PLCName__Group__2 : rule__PLCName__Group__2__Impl rule__PLCName__Group__3 ;
    public final void rule__PLCName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:339:1: ( rule__PLCName__Group__2__Impl rule__PLCName__Group__3 )
            // InternalEis.g:340:2: rule__PLCName__Group__2__Impl rule__PLCName__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PLCName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLCName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__2"


    // $ANTLR start "rule__PLCName__Group__2__Impl"
    // InternalEis.g:347:1: rule__PLCName__Group__2__Impl : ( ( rule__PLCName__NameAssignment_2 ) ) ;
    public final void rule__PLCName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:351:1: ( ( ( rule__PLCName__NameAssignment_2 ) ) )
            // InternalEis.g:352:1: ( ( rule__PLCName__NameAssignment_2 ) )
            {
            // InternalEis.g:352:1: ( ( rule__PLCName__NameAssignment_2 ) )
            // InternalEis.g:353:2: ( rule__PLCName__NameAssignment_2 )
            {
             before(grammarAccess.getPLCNameAccess().getNameAssignment_2()); 
            // InternalEis.g:354:2: ( rule__PLCName__NameAssignment_2 )
            // InternalEis.g:354:3: rule__PLCName__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PLCName__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPLCNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__2__Impl"


    // $ANTLR start "rule__PLCName__Group__3"
    // InternalEis.g:362:1: rule__PLCName__Group__3 : rule__PLCName__Group__3__Impl ;
    public final void rule__PLCName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:366:1: ( rule__PLCName__Group__3__Impl )
            // InternalEis.g:367:2: rule__PLCName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PLCName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__3"


    // $ANTLR start "rule__PLCName__Group__3__Impl"
    // InternalEis.g:373:1: rule__PLCName__Group__3__Impl : ( ';' ) ;
    public final void rule__PLCName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:377:1: ( ( ';' ) )
            // InternalEis.g:378:1: ( ';' )
            {
            // InternalEis.g:378:1: ( ';' )
            // InternalEis.g:379:2: ';'
            {
             before(grammarAccess.getPLCNameAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPLCNameAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__Group__3__Impl"


    // $ANTLR start "rule__Model__EisAssignment"
    // InternalEis.g:389:1: rule__Model__EisAssignment : ( ruleEisType ) ;
    public final void rule__Model__EisAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:393:1: ( ( ruleEisType ) )
            // InternalEis.g:394:2: ( ruleEisType )
            {
            // InternalEis.g:394:2: ( ruleEisType )
            // InternalEis.g:395:3: ruleEisType
            {
             before(grammarAccess.getModelAccess().getEisEisTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEisType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEisEisTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EisAssignment"


    // $ANTLR start "rule__TiaProjectName__NameAssignment_2"
    // InternalEis.g:404:1: rule__TiaProjectName__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TiaProjectName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:408:1: ( ( RULE_ID ) )
            // InternalEis.g:409:2: ( RULE_ID )
            {
            // InternalEis.g:409:2: ( RULE_ID )
            // InternalEis.g:410:3: RULE_ID
            {
             before(grammarAccess.getTiaProjectNameAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTiaProjectNameAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TiaProjectName__NameAssignment_2"


    // $ANTLR start "rule__PLCName__NameAssignment_2"
    // InternalEis.g:419:1: rule__PLCName__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PLCName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEis.g:423:1: ( ( RULE_ID ) )
            // InternalEis.g:424:2: ( RULE_ID )
            {
            // InternalEis.g:424:2: ( RULE_ID )
            // InternalEis.g:425:3: RULE_ID
            {
             before(grammarAccess.getPLCNameAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPLCNameAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLCName__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}