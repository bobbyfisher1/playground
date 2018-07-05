package org.example.define.ide.contentassist.antlr.internal;

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
import org.example.define.services.DefineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDefineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'true'", "'false'", "'define'", "'{'", "'}'", "'input'", "'['", "']'", "'output'", "'inout'", "';'", "'='", "'+/-'", "'udt'", "'('", "')'", "'int'", "'bool'", "'float'", "'string'", "'||'", "'&&'", "'+'", "'-'", "'!'", "'.'", "'variant'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDefineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDefineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDefineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDefine.g"; }


    	private DefineGrammarAccess grammarAccess;

    	public void setGrammarAccess(DefineGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDefineBlock"
    // InternalDefine.g:53:1: entryRuleDefineBlock : ruleDefineBlock EOF ;
    public final void entryRuleDefineBlock() throws RecognitionException {
        try {
            // InternalDefine.g:54:1: ( ruleDefineBlock EOF )
            // InternalDefine.g:55:1: ruleDefineBlock EOF
            {
             before(grammarAccess.getDefineBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleDefineBlock();

            state._fsp--;

             after(grammarAccess.getDefineBlockRule()); 
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
    // $ANTLR end "entryRuleDefineBlock"


    // $ANTLR start "ruleDefineBlock"
    // InternalDefine.g:62:1: ruleDefineBlock : ( ( rule__DefineBlock__Group__0 ) ) ;
    public final void ruleDefineBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:66:2: ( ( ( rule__DefineBlock__Group__0 ) ) )
            // InternalDefine.g:67:2: ( ( rule__DefineBlock__Group__0 ) )
            {
            // InternalDefine.g:67:2: ( ( rule__DefineBlock__Group__0 ) )
            // InternalDefine.g:68:3: ( rule__DefineBlock__Group__0 )
            {
             before(grammarAccess.getDefineBlockAccess().getGroup()); 
            // InternalDefine.g:69:3: ( rule__DefineBlock__Group__0 )
            // InternalDefine.g:69:4: rule__DefineBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefineBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleDefineBlock"


    // $ANTLR start "entryRuleDirectionBlock"
    // InternalDefine.g:78:1: entryRuleDirectionBlock : ruleDirectionBlock EOF ;
    public final void entryRuleDirectionBlock() throws RecognitionException {
        try {
            // InternalDefine.g:79:1: ( ruleDirectionBlock EOF )
            // InternalDefine.g:80:1: ruleDirectionBlock EOF
            {
             before(grammarAccess.getDirectionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectionBlock();

            state._fsp--;

             after(grammarAccess.getDirectionBlockRule()); 
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
    // $ANTLR end "entryRuleDirectionBlock"


    // $ANTLR start "ruleDirectionBlock"
    // InternalDefine.g:87:1: ruleDirectionBlock : ( ( rule__DirectionBlock__UnorderedGroup ) ) ;
    public final void ruleDirectionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:91:2: ( ( ( rule__DirectionBlock__UnorderedGroup ) ) )
            // InternalDefine.g:92:2: ( ( rule__DirectionBlock__UnorderedGroup ) )
            {
            // InternalDefine.g:92:2: ( ( rule__DirectionBlock__UnorderedGroup ) )
            // InternalDefine.g:93:3: ( rule__DirectionBlock__UnorderedGroup )
            {
             before(grammarAccess.getDirectionBlockAccess().getUnorderedGroup()); 
            // InternalDefine.g:94:3: ( rule__DirectionBlock__UnorderedGroup )
            // InternalDefine.g:94:4: rule__DirectionBlock__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__DirectionBlock__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getDirectionBlockAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleDirectionBlock"


    // $ANTLR start "entryRuleInput"
    // InternalDefine.g:103:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalDefine.g:104:1: ( ruleInput EOF )
            // InternalDefine.g:105:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalDefine.g:112:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:116:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalDefine.g:117:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalDefine.g:117:2: ( ( rule__Input__Group__0 ) )
            // InternalDefine.g:118:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalDefine.g:119:3: ( rule__Input__Group__0 )
            // InternalDefine.g:119:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalDefine.g:128:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalDefine.g:129:1: ( ruleOutput EOF )
            // InternalDefine.g:130:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalDefine.g:137:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:141:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalDefine.g:142:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalDefine.g:142:2: ( ( rule__Output__Group__0 ) )
            // InternalDefine.g:143:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalDefine.g:144:3: ( rule__Output__Group__0 )
            // InternalDefine.g:144:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInout"
    // InternalDefine.g:153:1: entryRuleInout : ruleInout EOF ;
    public final void entryRuleInout() throws RecognitionException {
        try {
            // InternalDefine.g:154:1: ( ruleInout EOF )
            // InternalDefine.g:155:1: ruleInout EOF
            {
             before(grammarAccess.getInoutRule()); 
            pushFollow(FOLLOW_1);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getInoutRule()); 
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
    // $ANTLR end "entryRuleInout"


    // $ANTLR start "ruleInout"
    // InternalDefine.g:162:1: ruleInout : ( ( rule__Inout__Group__0 ) ) ;
    public final void ruleInout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:166:2: ( ( ( rule__Inout__Group__0 ) ) )
            // InternalDefine.g:167:2: ( ( rule__Inout__Group__0 ) )
            {
            // InternalDefine.g:167:2: ( ( rule__Inout__Group__0 ) )
            // InternalDefine.g:168:3: ( rule__Inout__Group__0 )
            {
             before(grammarAccess.getInoutAccess().getGroup()); 
            // InternalDefine.g:169:3: ( rule__Inout__Group__0 )
            // InternalDefine.g:169:4: rule__Inout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInoutAccess().getGroup()); 

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
    // $ANTLR end "ruleInout"


    // $ANTLR start "entryRuleVariable"
    // InternalDefine.g:178:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDefine.g:179:1: ( ruleVariable EOF )
            // InternalDefine.g:180:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDefine.g:187:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:191:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalDefine.g:192:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalDefine.g:192:2: ( ( rule__Variable__Alternatives ) )
            // InternalDefine.g:193:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalDefine.g:194:3: ( rule__Variable__Alternatives )
            // InternalDefine.g:194:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUdt"
    // InternalDefine.g:203:1: entryRuleUdt : ruleUdt EOF ;
    public final void entryRuleUdt() throws RecognitionException {
        try {
            // InternalDefine.g:204:1: ( ruleUdt EOF )
            // InternalDefine.g:205:1: ruleUdt EOF
            {
             before(grammarAccess.getUdtRule()); 
            pushFollow(FOLLOW_1);
            ruleUdt();

            state._fsp--;

             after(grammarAccess.getUdtRule()); 
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
    // $ANTLR end "entryRuleUdt"


    // $ANTLR start "ruleUdt"
    // InternalDefine.g:212:1: ruleUdt : ( ( rule__Udt__Group__0 ) ) ;
    public final void ruleUdt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:216:2: ( ( ( rule__Udt__Group__0 ) ) )
            // InternalDefine.g:217:2: ( ( rule__Udt__Group__0 ) )
            {
            // InternalDefine.g:217:2: ( ( rule__Udt__Group__0 ) )
            // InternalDefine.g:218:3: ( rule__Udt__Group__0 )
            {
             before(grammarAccess.getUdtAccess().getGroup()); 
            // InternalDefine.g:219:3: ( rule__Udt__Group__0 )
            // InternalDefine.g:219:4: rule__Udt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Udt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUdtAccess().getGroup()); 

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
    // $ANTLR end "ruleUdt"


    // $ANTLR start "entryRuleUdtType"
    // InternalDefine.g:228:1: entryRuleUdtType : ruleUdtType EOF ;
    public final void entryRuleUdtType() throws RecognitionException {
        try {
            // InternalDefine.g:229:1: ( ruleUdtType EOF )
            // InternalDefine.g:230:1: ruleUdtType EOF
            {
             before(grammarAccess.getUdtTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUdtType();

            state._fsp--;

             after(grammarAccess.getUdtTypeRule()); 
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
    // $ANTLR end "entryRuleUdtType"


    // $ANTLR start "ruleUdtType"
    // InternalDefine.g:237:1: ruleUdtType : ( ( rule__UdtType__UdtTypeNameAssignment ) ) ;
    public final void ruleUdtType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:241:2: ( ( ( rule__UdtType__UdtTypeNameAssignment ) ) )
            // InternalDefine.g:242:2: ( ( rule__UdtType__UdtTypeNameAssignment ) )
            {
            // InternalDefine.g:242:2: ( ( rule__UdtType__UdtTypeNameAssignment ) )
            // InternalDefine.g:243:3: ( rule__UdtType__UdtTypeNameAssignment )
            {
             before(grammarAccess.getUdtTypeAccess().getUdtTypeNameAssignment()); 
            // InternalDefine.g:244:3: ( rule__UdtType__UdtTypeNameAssignment )
            // InternalDefine.g:244:4: rule__UdtType__UdtTypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UdtType__UdtTypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUdtTypeAccess().getUdtTypeNameAssignment()); 

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
    // $ANTLR end "ruleUdtType"


    // $ANTLR start "entryRuleTypes"
    // InternalDefine.g:253:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // InternalDefine.g:254:1: ( ruleTypes EOF )
            // InternalDefine.g:255:1: ruleTypes EOF
            {
             before(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getTypesRule()); 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalDefine.g:262:1: ruleTypes : ( ( rule__Types__Alternatives ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:266:2: ( ( ( rule__Types__Alternatives ) ) )
            // InternalDefine.g:267:2: ( ( rule__Types__Alternatives ) )
            {
            // InternalDefine.g:267:2: ( ( rule__Types__Alternatives ) )
            // InternalDefine.g:268:3: ( rule__Types__Alternatives )
            {
             before(grammarAccess.getTypesAccess().getAlternatives()); 
            // InternalDefine.g:269:3: ( rule__Types__Alternatives )
            // InternalDefine.g:269:4: rule__Types__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Types__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleExpression"
    // InternalDefine.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDefine.g:279:1: ( ruleExpression EOF )
            // InternalDefine.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDefine.g:287:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:291:2: ( ( ruleOr ) )
            // InternalDefine.g:292:2: ( ruleOr )
            {
            // InternalDefine.g:292:2: ( ruleOr )
            // InternalDefine.g:293:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalDefine.g:303:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalDefine.g:304:1: ( ruleOr EOF )
            // InternalDefine.g:305:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalDefine.g:312:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:316:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalDefine.g:317:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalDefine.g:317:2: ( ( rule__Or__Group__0 ) )
            // InternalDefine.g:318:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalDefine.g:319:3: ( rule__Or__Group__0 )
            // InternalDefine.g:319:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalDefine.g:328:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalDefine.g:329:1: ( ruleAnd EOF )
            // InternalDefine.g:330:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalDefine.g:337:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:341:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalDefine.g:342:2: ( ( rule__And__Group__0 ) )
            {
            // InternalDefine.g:342:2: ( ( rule__And__Group__0 ) )
            // InternalDefine.g:343:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalDefine.g:344:3: ( rule__And__Group__0 )
            // InternalDefine.g:344:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalDefine.g:353:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalDefine.g:354:1: ( ruleEquality EOF )
            // InternalDefine.g:355:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalDefine.g:362:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:366:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalDefine.g:367:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalDefine.g:367:2: ( ( rule__Equality__Group__0 ) )
            // InternalDefine.g:368:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalDefine.g:369:3: ( rule__Equality__Group__0 )
            // InternalDefine.g:369:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalDefine.g:378:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalDefine.g:379:1: ( ruleComparison EOF )
            // InternalDefine.g:380:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalDefine.g:387:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:391:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalDefine.g:392:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalDefine.g:392:2: ( ( rule__Comparison__Group__0 ) )
            // InternalDefine.g:393:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalDefine.g:394:3: ( rule__Comparison__Group__0 )
            // InternalDefine.g:394:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalDefine.g:403:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalDefine.g:404:1: ( rulePlusOrMinus EOF )
            // InternalDefine.g:405:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalDefine.g:412:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:416:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalDefine.g:417:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalDefine.g:417:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalDefine.g:418:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalDefine.g:419:3: ( rule__PlusOrMinus__Group__0 )
            // InternalDefine.g:419:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalDefine.g:428:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalDefine.g:429:1: ( ruleMulOrDiv EOF )
            // InternalDefine.g:430:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalDefine.g:437:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:441:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalDefine.g:442:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalDefine.g:442:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalDefine.g:443:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalDefine.g:444:3: ( rule__MulOrDiv__Group__0 )
            // InternalDefine.g:444:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalDefine.g:453:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalDefine.g:454:1: ( rulePrimary EOF )
            // InternalDefine.g:455:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDefine.g:462:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:466:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalDefine.g:467:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalDefine.g:467:2: ( ( rule__Primary__Alternatives ) )
            // InternalDefine.g:468:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalDefine.g:469:3: ( rule__Primary__Alternatives )
            // InternalDefine.g:469:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalDefine.g:478:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalDefine.g:479:1: ( ruleAtomic EOF )
            // InternalDefine.g:480:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalDefine.g:487:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:491:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalDefine.g:492:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalDefine.g:492:2: ( ( rule__Atomic__Alternatives ) )
            // InternalDefine.g:493:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalDefine.g:494:3: ( rule__Atomic__Alternatives )
            // InternalDefine.g:494:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleFloatConstant"
    // InternalDefine.g:503:1: entryRuleFloatConstant : ruleFloatConstant EOF ;
    public final void entryRuleFloatConstant() throws RecognitionException {
        try {
            // InternalDefine.g:504:1: ( ruleFloatConstant EOF )
            // InternalDefine.g:505:1: ruleFloatConstant EOF
            {
             before(grammarAccess.getFloatConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatConstant();

            state._fsp--;

             after(grammarAccess.getFloatConstantRule()); 
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
    // $ANTLR end "entryRuleFloatConstant"


    // $ANTLR start "ruleFloatConstant"
    // InternalDefine.g:512:1: ruleFloatConstant : ( ( rule__FloatConstant__Group__0 ) ) ;
    public final void ruleFloatConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:516:2: ( ( ( rule__FloatConstant__Group__0 ) ) )
            // InternalDefine.g:517:2: ( ( rule__FloatConstant__Group__0 ) )
            {
            // InternalDefine.g:517:2: ( ( rule__FloatConstant__Group__0 ) )
            // InternalDefine.g:518:3: ( rule__FloatConstant__Group__0 )
            {
             before(grammarAccess.getFloatConstantAccess().getGroup()); 
            // InternalDefine.g:519:3: ( rule__FloatConstant__Group__0 )
            // InternalDefine.g:519:4: rule__FloatConstant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantAccess().getGroup()); 

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
    // $ANTLR end "ruleFloatConstant"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalDefine.g:527:1: rule__Variable__Alternatives : ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__UdtAssignment_1 ) ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:531:1: ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__UdtAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=35 && LA1_0<=38)||LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDefine.g:532:2: ( ( rule__Variable__Group_0__0 ) )
                    {
                    // InternalDefine.g:532:2: ( ( rule__Variable__Group_0__0 ) )
                    // InternalDefine.g:533:3: ( rule__Variable__Group_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0()); 
                    // InternalDefine.g:534:3: ( rule__Variable__Group_0__0 )
                    // InternalDefine.g:534:4: rule__Variable__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:538:2: ( ( rule__Variable__UdtAssignment_1 ) )
                    {
                    // InternalDefine.g:538:2: ( ( rule__Variable__UdtAssignment_1 ) )
                    // InternalDefine.g:539:3: ( rule__Variable__UdtAssignment_1 )
                    {
                     before(grammarAccess.getVariableAccess().getUdtAssignment_1()); 
                    // InternalDefine.g:540:3: ( rule__Variable__UdtAssignment_1 )
                    // InternalDefine.g:540:4: rule__Variable__UdtAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__UdtAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getUdtAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Types__Alternatives"
    // InternalDefine.g:548:1: rule__Types__Alternatives : ( ( ( rule__Types__Group_0__0 ) ) | ( ( rule__Types__Group_1__0 ) ) | ( ( rule__Types__Group_2__0 ) ) | ( ( rule__Types__Group_3__0 ) ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:552:1: ( ( ( rule__Types__Group_0__0 ) ) | ( ( rule__Types__Group_1__0 ) ) | ( ( rule__Types__Group_2__0 ) ) | ( ( rule__Types__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDefine.g:553:2: ( ( rule__Types__Group_0__0 ) )
                    {
                    // InternalDefine.g:553:2: ( ( rule__Types__Group_0__0 ) )
                    // InternalDefine.g:554:3: ( rule__Types__Group_0__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_0()); 
                    // InternalDefine.g:555:3: ( rule__Types__Group_0__0 )
                    // InternalDefine.g:555:4: rule__Types__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:559:2: ( ( rule__Types__Group_1__0 ) )
                    {
                    // InternalDefine.g:559:2: ( ( rule__Types__Group_1__0 ) )
                    // InternalDefine.g:560:3: ( rule__Types__Group_1__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_1()); 
                    // InternalDefine.g:561:3: ( rule__Types__Group_1__0 )
                    // InternalDefine.g:561:4: rule__Types__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:565:2: ( ( rule__Types__Group_2__0 ) )
                    {
                    // InternalDefine.g:565:2: ( ( rule__Types__Group_2__0 ) )
                    // InternalDefine.g:566:3: ( rule__Types__Group_2__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_2()); 
                    // InternalDefine.g:567:3: ( rule__Types__Group_2__0 )
                    // InternalDefine.g:567:4: rule__Types__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:571:2: ( ( rule__Types__Group_3__0 ) )
                    {
                    // InternalDefine.g:571:2: ( ( rule__Types__Group_3__0 ) )
                    // InternalDefine.g:572:3: ( rule__Types__Group_3__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_3()); 
                    // InternalDefine.g:573:3: ( rule__Types__Group_3__0 )
                    // InternalDefine.g:573:4: rule__Types__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Types__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalDefine.g:581:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:585:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDefine.g:586:2: ( '==' )
                    {
                    // InternalDefine.g:586:2: ( '==' )
                    // InternalDefine.g:587:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:592:2: ( '!=' )
                    {
                    // InternalDefine.g:592:2: ( '!=' )
                    // InternalDefine.g:593:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalDefine.g:602:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:606:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDefine.g:607:2: ( '>=' )
                    {
                    // InternalDefine.g:607:2: ( '>=' )
                    // InternalDefine.g:608:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:613:2: ( '<=' )
                    {
                    // InternalDefine.g:613:2: ( '<=' )
                    // InternalDefine.g:614:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:619:2: ( '>' )
                    {
                    // InternalDefine.g:619:2: ( '>' )
                    // InternalDefine.g:620:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:625:2: ( '<' )
                    {
                    // InternalDefine.g:625:2: ( '<' )
                    // InternalDefine.g:626:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalDefine.g:635:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:639:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDefine.g:640:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalDefine.g:640:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalDefine.g:641:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalDefine.g:642:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalDefine.g:642:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:646:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalDefine.g:646:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalDefine.g:647:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalDefine.g:648:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalDefine.g:648:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // InternalDefine.g:656:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:660:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDefine.g:661:2: ( '*' )
                    {
                    // InternalDefine.g:661:2: ( '*' )
                    // InternalDefine.g:662:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:667:2: ( '/' )
                    {
                    // InternalDefine.g:667:2: ( '/' )
                    // InternalDefine.g:668:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalDefine.g:677:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:681:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 19:
            case 20:
            case 44:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDefine.g:682:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalDefine.g:682:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalDefine.g:683:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalDefine.g:684:3: ( rule__Primary__Group_0__0 )
                    // InternalDefine.g:684:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:688:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalDefine.g:688:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalDefine.g:689:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalDefine.g:690:3: ( rule__Primary__Group_1__0 )
                    // InternalDefine.g:690:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:694:2: ( ruleAtomic )
                    {
                    // InternalDefine.g:694:2: ( ruleAtomic )
                    // InternalDefine.g:695:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalDefine.g:704:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleFloatConstant ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:708:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleFloatConstant ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=11 && LA8_1<=18)||LA8_1==29||LA8_1==31||LA8_1==34||(LA8_1>=39 && LA8_1<=42)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==44) ) {
                    alt8=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 19:
            case 20:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case 44:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDefine.g:709:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalDefine.g:709:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalDefine.g:710:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalDefine.g:711:3: ( rule__Atomic__Group_0__0 )
                    // InternalDefine.g:711:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:715:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalDefine.g:715:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalDefine.g:716:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalDefine.g:717:3: ( rule__Atomic__Group_1__0 )
                    // InternalDefine.g:717:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:721:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalDefine.g:721:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalDefine.g:722:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalDefine.g:723:3: ( rule__Atomic__Group_2__0 )
                    // InternalDefine.g:723:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:727:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalDefine.g:727:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalDefine.g:728:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalDefine.g:729:3: ( rule__Atomic__Group_3__0 )
                    // InternalDefine.g:729:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDefine.g:733:2: ( ruleFloatConstant )
                    {
                    // InternalDefine.g:733:2: ( ruleFloatConstant )
                    // InternalDefine.g:734:3: ruleFloatConstant
                    {
                     before(grammarAccess.getAtomicAccess().getFloatConstantParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatConstant();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getFloatConstantParserRuleCall_4()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalDefine.g:743:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:747:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDefine.g:748:2: ( 'true' )
                    {
                    // InternalDefine.g:748:2: ( 'true' )
                    // InternalDefine.g:749:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:754:2: ( 'false' )
                    {
                    // InternalDefine.g:754:2: ( 'false' )
                    // InternalDefine.g:755:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__FloatConstant__Alternatives_1"
    // InternalDefine.g:764:1: rule__FloatConstant__Alternatives_1 : ( ( ( rule__FloatConstant__Group_1_0__0 ) ) | ( ( rule__FloatConstant__Group_1_1__0 ) ) | ( ( rule__FloatConstant__Group_1_2__0 ) ) );
    public final void rule__FloatConstant__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:768:1: ( ( ( rule__FloatConstant__Group_1_0__0 ) ) | ( ( rule__FloatConstant__Group_1_1__0 ) ) | ( ( rule__FloatConstant__Group_1_2__0 ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==44) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==RULE_INT) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==EOF||(LA10_3>=11 && LA10_3<=18)||LA10_3==29||LA10_3==31||LA10_3==34||(LA10_3>=39 && LA10_3<=42)) ) {
                        alt10=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDefine.g:769:2: ( ( rule__FloatConstant__Group_1_0__0 ) )
                    {
                    // InternalDefine.g:769:2: ( ( rule__FloatConstant__Group_1_0__0 ) )
                    // InternalDefine.g:770:3: ( rule__FloatConstant__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatConstantAccess().getGroup_1_0()); 
                    // InternalDefine.g:771:3: ( rule__FloatConstant__Group_1_0__0 )
                    // InternalDefine.g:771:4: rule__FloatConstant__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatConstant__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatConstantAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:775:2: ( ( rule__FloatConstant__Group_1_1__0 ) )
                    {
                    // InternalDefine.g:775:2: ( ( rule__FloatConstant__Group_1_1__0 ) )
                    // InternalDefine.g:776:3: ( rule__FloatConstant__Group_1_1__0 )
                    {
                     before(grammarAccess.getFloatConstantAccess().getGroup_1_1()); 
                    // InternalDefine.g:777:3: ( rule__FloatConstant__Group_1_1__0 )
                    // InternalDefine.g:777:4: rule__FloatConstant__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatConstant__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatConstantAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:781:2: ( ( rule__FloatConstant__Group_1_2__0 ) )
                    {
                    // InternalDefine.g:781:2: ( ( rule__FloatConstant__Group_1_2__0 ) )
                    // InternalDefine.g:782:3: ( rule__FloatConstant__Group_1_2__0 )
                    {
                     before(grammarAccess.getFloatConstantAccess().getGroup_1_2()); 
                    // InternalDefine.g:783:3: ( rule__FloatConstant__Group_1_2__0 )
                    // InternalDefine.g:783:4: rule__FloatConstant__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatConstant__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatConstantAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__FloatConstant__Alternatives_1"


    // $ANTLR start "rule__DefineBlock__Group__0"
    // InternalDefine.g:791:1: rule__DefineBlock__Group__0 : rule__DefineBlock__Group__0__Impl rule__DefineBlock__Group__1 ;
    public final void rule__DefineBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:795:1: ( rule__DefineBlock__Group__0__Impl rule__DefineBlock__Group__1 )
            // InternalDefine.g:796:2: rule__DefineBlock__Group__0__Impl rule__DefineBlock__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DefineBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineBlock__Group__1();

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
    // $ANTLR end "rule__DefineBlock__Group__0"


    // $ANTLR start "rule__DefineBlock__Group__0__Impl"
    // InternalDefine.g:803:1: rule__DefineBlock__Group__0__Impl : ( 'define' ) ;
    public final void rule__DefineBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:807:1: ( ( 'define' ) )
            // InternalDefine.g:808:1: ( 'define' )
            {
            // InternalDefine.g:808:1: ( 'define' )
            // InternalDefine.g:809:2: 'define'
            {
             before(grammarAccess.getDefineBlockAccess().getDefineKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefineBlockAccess().getDefineKeyword_0()); 

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
    // $ANTLR end "rule__DefineBlock__Group__0__Impl"


    // $ANTLR start "rule__DefineBlock__Group__1"
    // InternalDefine.g:818:1: rule__DefineBlock__Group__1 : rule__DefineBlock__Group__1__Impl rule__DefineBlock__Group__2 ;
    public final void rule__DefineBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:822:1: ( rule__DefineBlock__Group__1__Impl rule__DefineBlock__Group__2 )
            // InternalDefine.g:823:2: rule__DefineBlock__Group__1__Impl rule__DefineBlock__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DefineBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineBlock__Group__2();

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
    // $ANTLR end "rule__DefineBlock__Group__1"


    // $ANTLR start "rule__DefineBlock__Group__1__Impl"
    // InternalDefine.g:830:1: rule__DefineBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DefineBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:834:1: ( ( '{' ) )
            // InternalDefine.g:835:1: ( '{' )
            {
            // InternalDefine.g:835:1: ( '{' )
            // InternalDefine.g:836:2: '{'
            {
             before(grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__DefineBlock__Group__1__Impl"


    // $ANTLR start "rule__DefineBlock__Group__2"
    // InternalDefine.g:845:1: rule__DefineBlock__Group__2 : rule__DefineBlock__Group__2__Impl rule__DefineBlock__Group__3 ;
    public final void rule__DefineBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:849:1: ( rule__DefineBlock__Group__2__Impl rule__DefineBlock__Group__3 )
            // InternalDefine.g:850:2: rule__DefineBlock__Group__2__Impl rule__DefineBlock__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DefineBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefineBlock__Group__3();

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
    // $ANTLR end "rule__DefineBlock__Group__2"


    // $ANTLR start "rule__DefineBlock__Group__2__Impl"
    // InternalDefine.g:857:1: rule__DefineBlock__Group__2__Impl : ( ( rule__DefineBlock__DirectionAssignment_2 ) ) ;
    public final void rule__DefineBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:861:1: ( ( ( rule__DefineBlock__DirectionAssignment_2 ) ) )
            // InternalDefine.g:862:1: ( ( rule__DefineBlock__DirectionAssignment_2 ) )
            {
            // InternalDefine.g:862:1: ( ( rule__DefineBlock__DirectionAssignment_2 ) )
            // InternalDefine.g:863:2: ( rule__DefineBlock__DirectionAssignment_2 )
            {
             before(grammarAccess.getDefineBlockAccess().getDirectionAssignment_2()); 
            // InternalDefine.g:864:2: ( rule__DefineBlock__DirectionAssignment_2 )
            // InternalDefine.g:864:3: rule__DefineBlock__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefineBlock__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineBlockAccess().getDirectionAssignment_2()); 

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
    // $ANTLR end "rule__DefineBlock__Group__2__Impl"


    // $ANTLR start "rule__DefineBlock__Group__3"
    // InternalDefine.g:872:1: rule__DefineBlock__Group__3 : rule__DefineBlock__Group__3__Impl ;
    public final void rule__DefineBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:876:1: ( rule__DefineBlock__Group__3__Impl )
            // InternalDefine.g:877:2: rule__DefineBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefineBlock__Group__3__Impl();

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
    // $ANTLR end "rule__DefineBlock__Group__3"


    // $ANTLR start "rule__DefineBlock__Group__3__Impl"
    // InternalDefine.g:883:1: rule__DefineBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__DefineBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:887:1: ( ( '}' ) )
            // InternalDefine.g:888:1: ( '}' )
            {
            // InternalDefine.g:888:1: ( '}' )
            // InternalDefine.g:889:2: '}'
            {
             before(grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DefineBlock__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalDefine.g:899:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:903:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalDefine.g:904:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalDefine.g:911:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:915:1: ( ( 'input' ) )
            // InternalDefine.g:916:1: ( 'input' )
            {
            // InternalDefine.g:916:1: ( 'input' )
            // InternalDefine.g:917:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

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
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalDefine.g:926:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:930:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalDefine.g:931:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalDefine.g:938:1: rule__Input__Group__1__Impl : ( () ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:942:1: ( ( () ) )
            // InternalDefine.g:943:1: ( () )
            {
            // InternalDefine.g:943:1: ( () )
            // InternalDefine.g:944:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_1()); 
            // InternalDefine.g:945:2: ()
            // InternalDefine.g:945:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalDefine.g:953:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:957:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalDefine.g:958:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalDefine.g:965:1: rule__Input__Group__2__Impl : ( '[' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:969:1: ( ( '[' ) )
            // InternalDefine.g:970:1: ( '[' )
            {
            // InternalDefine.g:970:1: ( '[' )
            // InternalDefine.g:971:2: '['
            {
             before(grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalDefine.g:980:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:984:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalDefine.g:985:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

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
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalDefine.g:992:1: rule__Input__Group__3__Impl : ( ( rule__Input__InputVariablesAssignment_3 )* ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:996:1: ( ( ( rule__Input__InputVariablesAssignment_3 )* ) )
            // InternalDefine.g:997:1: ( ( rule__Input__InputVariablesAssignment_3 )* )
            {
            // InternalDefine.g:997:1: ( ( rule__Input__InputVariablesAssignment_3 )* )
            // InternalDefine.g:998:2: ( rule__Input__InputVariablesAssignment_3 )*
            {
             before(grammarAccess.getInputAccess().getInputVariablesAssignment_3()); 
            // InternalDefine.g:999:2: ( rule__Input__InputVariablesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32||(LA11_0>=35 && LA11_0<=38)||LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDefine.g:999:3: rule__Input__InputVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Input__InputVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getInputVariablesAssignment_3()); 

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
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalDefine.g:1007:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1011:1: ( rule__Input__Group__4__Impl )
            // InternalDefine.g:1012:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

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
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalDefine.g:1018:1: rule__Input__Group__4__Impl : ( ']' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1022:1: ( ( ']' ) )
            // InternalDefine.g:1023:1: ( ']' )
            {
            // InternalDefine.g:1023:1: ( ']' )
            // InternalDefine.g:1024:2: ']'
            {
             before(grammarAccess.getInputAccess().getRightSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalDefine.g:1034:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1038:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalDefine.g:1039:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalDefine.g:1046:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1050:1: ( ( 'output' ) )
            // InternalDefine.g:1051:1: ( 'output' )
            {
            // InternalDefine.g:1051:1: ( 'output' )
            // InternalDefine.g:1052:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

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
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalDefine.g:1061:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1065:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalDefine.g:1066:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalDefine.g:1073:1: rule__Output__Group__1__Impl : ( () ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1077:1: ( ( () ) )
            // InternalDefine.g:1078:1: ( () )
            {
            // InternalDefine.g:1078:1: ( () )
            // InternalDefine.g:1079:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_1()); 
            // InternalDefine.g:1080:2: ()
            // InternalDefine.g:1080:3: 
            {
            }

             after(grammarAccess.getOutputAccess().getOutputAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalDefine.g:1088:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1092:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalDefine.g:1093:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

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
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalDefine.g:1100:1: rule__Output__Group__2__Impl : ( '[' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1104:1: ( ( '[' ) )
            // InternalDefine.g:1105:1: ( '[' )
            {
            // InternalDefine.g:1105:1: ( '[' )
            // InternalDefine.g:1106:2: '['
            {
             before(grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalDefine.g:1115:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1119:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalDefine.g:1120:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

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
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalDefine.g:1127:1: rule__Output__Group__3__Impl : ( ( rule__Output__OutputVariablesAssignment_3 )* ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1131:1: ( ( ( rule__Output__OutputVariablesAssignment_3 )* ) )
            // InternalDefine.g:1132:1: ( ( rule__Output__OutputVariablesAssignment_3 )* )
            {
            // InternalDefine.g:1132:1: ( ( rule__Output__OutputVariablesAssignment_3 )* )
            // InternalDefine.g:1133:2: ( rule__Output__OutputVariablesAssignment_3 )*
            {
             before(grammarAccess.getOutputAccess().getOutputVariablesAssignment_3()); 
            // InternalDefine.g:1134:2: ( rule__Output__OutputVariablesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32||(LA12_0>=35 && LA12_0<=38)||LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDefine.g:1134:3: rule__Output__OutputVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Output__OutputVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getOutputVariablesAssignment_3()); 

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
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalDefine.g:1142:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1146:1: ( rule__Output__Group__4__Impl )
            // InternalDefine.g:1147:2: rule__Output__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__4__Impl();

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
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalDefine.g:1153:1: rule__Output__Group__4__Impl : ( ']' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1157:1: ( ( ']' ) )
            // InternalDefine.g:1158:1: ( ']' )
            {
            // InternalDefine.g:1158:1: ( ']' )
            // InternalDefine.g:1159:2: ']'
            {
             before(grammarAccess.getOutputAccess().getRightSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Inout__Group__0"
    // InternalDefine.g:1169:1: rule__Inout__Group__0 : rule__Inout__Group__0__Impl rule__Inout__Group__1 ;
    public final void rule__Inout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1173:1: ( rule__Inout__Group__0__Impl rule__Inout__Group__1 )
            // InternalDefine.g:1174:2: rule__Inout__Group__0__Impl rule__Inout__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Inout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inout__Group__1();

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
    // $ANTLR end "rule__Inout__Group__0"


    // $ANTLR start "rule__Inout__Group__0__Impl"
    // InternalDefine.g:1181:1: rule__Inout__Group__0__Impl : ( 'inout' ) ;
    public final void rule__Inout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1185:1: ( ( 'inout' ) )
            // InternalDefine.g:1186:1: ( 'inout' )
            {
            // InternalDefine.g:1186:1: ( 'inout' )
            // InternalDefine.g:1187:2: 'inout'
            {
             before(grammarAccess.getInoutAccess().getInoutKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInoutAccess().getInoutKeyword_0()); 

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
    // $ANTLR end "rule__Inout__Group__0__Impl"


    // $ANTLR start "rule__Inout__Group__1"
    // InternalDefine.g:1196:1: rule__Inout__Group__1 : rule__Inout__Group__1__Impl rule__Inout__Group__2 ;
    public final void rule__Inout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1200:1: ( rule__Inout__Group__1__Impl rule__Inout__Group__2 )
            // InternalDefine.g:1201:2: rule__Inout__Group__1__Impl rule__Inout__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Inout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inout__Group__2();

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
    // $ANTLR end "rule__Inout__Group__1"


    // $ANTLR start "rule__Inout__Group__1__Impl"
    // InternalDefine.g:1208:1: rule__Inout__Group__1__Impl : ( () ) ;
    public final void rule__Inout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1212:1: ( ( () ) )
            // InternalDefine.g:1213:1: ( () )
            {
            // InternalDefine.g:1213:1: ( () )
            // InternalDefine.g:1214:2: ()
            {
             before(grammarAccess.getInoutAccess().getInoutAction_1()); 
            // InternalDefine.g:1215:2: ()
            // InternalDefine.g:1215:3: 
            {
            }

             after(grammarAccess.getInoutAccess().getInoutAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inout__Group__1__Impl"


    // $ANTLR start "rule__Inout__Group__2"
    // InternalDefine.g:1223:1: rule__Inout__Group__2 : rule__Inout__Group__2__Impl rule__Inout__Group__3 ;
    public final void rule__Inout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1227:1: ( rule__Inout__Group__2__Impl rule__Inout__Group__3 )
            // InternalDefine.g:1228:2: rule__Inout__Group__2__Impl rule__Inout__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Inout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inout__Group__3();

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
    // $ANTLR end "rule__Inout__Group__2"


    // $ANTLR start "rule__Inout__Group__2__Impl"
    // InternalDefine.g:1235:1: rule__Inout__Group__2__Impl : ( '[' ) ;
    public final void rule__Inout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1239:1: ( ( '[' ) )
            // InternalDefine.g:1240:1: ( '[' )
            {
            // InternalDefine.g:1240:1: ( '[' )
            // InternalDefine.g:1241:2: '['
            {
             before(grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Inout__Group__2__Impl"


    // $ANTLR start "rule__Inout__Group__3"
    // InternalDefine.g:1250:1: rule__Inout__Group__3 : rule__Inout__Group__3__Impl rule__Inout__Group__4 ;
    public final void rule__Inout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1254:1: ( rule__Inout__Group__3__Impl rule__Inout__Group__4 )
            // InternalDefine.g:1255:2: rule__Inout__Group__3__Impl rule__Inout__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Inout__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inout__Group__4();

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
    // $ANTLR end "rule__Inout__Group__3"


    // $ANTLR start "rule__Inout__Group__3__Impl"
    // InternalDefine.g:1262:1: rule__Inout__Group__3__Impl : ( ( rule__Inout__InoutVariablesAssignment_3 )* ) ;
    public final void rule__Inout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1266:1: ( ( ( rule__Inout__InoutVariablesAssignment_3 )* ) )
            // InternalDefine.g:1267:1: ( ( rule__Inout__InoutVariablesAssignment_3 )* )
            {
            // InternalDefine.g:1267:1: ( ( rule__Inout__InoutVariablesAssignment_3 )* )
            // InternalDefine.g:1268:2: ( rule__Inout__InoutVariablesAssignment_3 )*
            {
             before(grammarAccess.getInoutAccess().getInoutVariablesAssignment_3()); 
            // InternalDefine.g:1269:2: ( rule__Inout__InoutVariablesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32||(LA13_0>=35 && LA13_0<=38)||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDefine.g:1269:3: rule__Inout__InoutVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Inout__InoutVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInoutAccess().getInoutVariablesAssignment_3()); 

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
    // $ANTLR end "rule__Inout__Group__3__Impl"


    // $ANTLR start "rule__Inout__Group__4"
    // InternalDefine.g:1277:1: rule__Inout__Group__4 : rule__Inout__Group__4__Impl ;
    public final void rule__Inout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1281:1: ( rule__Inout__Group__4__Impl )
            // InternalDefine.g:1282:2: rule__Inout__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inout__Group__4__Impl();

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
    // $ANTLR end "rule__Inout__Group__4"


    // $ANTLR start "rule__Inout__Group__4__Impl"
    // InternalDefine.g:1288:1: rule__Inout__Group__4__Impl : ( ']' ) ;
    public final void rule__Inout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1292:1: ( ( ']' ) )
            // InternalDefine.g:1293:1: ( ']' )
            {
            // InternalDefine.g:1293:1: ( ']' )
            // InternalDefine.g:1294:2: ']'
            {
             before(grammarAccess.getInoutAccess().getRightSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInoutAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Inout__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group_0__0"
    // InternalDefine.g:1304:1: rule__Variable__Group_0__0 : rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 ;
    public final void rule__Variable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1308:1: ( rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 )
            // InternalDefine.g:1309:2: rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__1();

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
    // $ANTLR end "rule__Variable__Group_0__0"


    // $ANTLR start "rule__Variable__Group_0__0__Impl"
    // InternalDefine.g:1316:1: rule__Variable__Group_0__0__Impl : ( () ) ;
    public final void rule__Variable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1320:1: ( ( () ) )
            // InternalDefine.g:1321:1: ( () )
            {
            // InternalDefine.g:1321:1: ( () )
            // InternalDefine.g:1322:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0_0()); 
            // InternalDefine.g:1323:2: ()
            // InternalDefine.g:1323:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_0__1"
    // InternalDefine.g:1331:1: rule__Variable__Group_0__1 : rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 ;
    public final void rule__Variable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1335:1: ( rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 )
            // InternalDefine.g:1336:2: rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__2();

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
    // $ANTLR end "rule__Variable__Group_0__1"


    // $ANTLR start "rule__Variable__Group_0__1__Impl"
    // InternalDefine.g:1343:1: rule__Variable__Group_0__1__Impl : ( ( rule__Variable__VariantKeywordAssignment_0_1 )? ) ;
    public final void rule__Variable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1347:1: ( ( ( rule__Variable__VariantKeywordAssignment_0_1 )? ) )
            // InternalDefine.g:1348:1: ( ( rule__Variable__VariantKeywordAssignment_0_1 )? )
            {
            // InternalDefine.g:1348:1: ( ( rule__Variable__VariantKeywordAssignment_0_1 )? )
            // InternalDefine.g:1349:2: ( rule__Variable__VariantKeywordAssignment_0_1 )?
            {
             before(grammarAccess.getVariableAccess().getVariantKeywordAssignment_0_1()); 
            // InternalDefine.g:1350:2: ( rule__Variable__VariantKeywordAssignment_0_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDefine.g:1350:3: rule__Variable__VariantKeywordAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__VariantKeywordAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getVariantKeywordAssignment_0_1()); 

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
    // $ANTLR end "rule__Variable__Group_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_0__2"
    // InternalDefine.g:1358:1: rule__Variable__Group_0__2 : rule__Variable__Group_0__2__Impl rule__Variable__Group_0__3 ;
    public final void rule__Variable__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1362:1: ( rule__Variable__Group_0__2__Impl rule__Variable__Group_0__3 )
            // InternalDefine.g:1363:2: rule__Variable__Group_0__2__Impl rule__Variable__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__3();

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
    // $ANTLR end "rule__Variable__Group_0__2"


    // $ANTLR start "rule__Variable__Group_0__2__Impl"
    // InternalDefine.g:1370:1: rule__Variable__Group_0__2__Impl : ( ( rule__Variable__VariableTypeAssignment_0_2 ) ) ;
    public final void rule__Variable__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1374:1: ( ( ( rule__Variable__VariableTypeAssignment_0_2 ) ) )
            // InternalDefine.g:1375:1: ( ( rule__Variable__VariableTypeAssignment_0_2 ) )
            {
            // InternalDefine.g:1375:1: ( ( rule__Variable__VariableTypeAssignment_0_2 ) )
            // InternalDefine.g:1376:2: ( rule__Variable__VariableTypeAssignment_0_2 )
            {
             before(grammarAccess.getVariableAccess().getVariableTypeAssignment_0_2()); 
            // InternalDefine.g:1377:2: ( rule__Variable__VariableTypeAssignment_0_2 )
            // InternalDefine.g:1377:3: rule__Variable__VariableTypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableTypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableTypeAssignment_0_2()); 

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
    // $ANTLR end "rule__Variable__Group_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_0__3"
    // InternalDefine.g:1385:1: rule__Variable__Group_0__3 : rule__Variable__Group_0__3__Impl rule__Variable__Group_0__4 ;
    public final void rule__Variable__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1389:1: ( rule__Variable__Group_0__3__Impl rule__Variable__Group_0__4 )
            // InternalDefine.g:1390:2: rule__Variable__Group_0__3__Impl rule__Variable__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__4();

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
    // $ANTLR end "rule__Variable__Group_0__3"


    // $ANTLR start "rule__Variable__Group_0__3__Impl"
    // InternalDefine.g:1397:1: rule__Variable__Group_0__3__Impl : ( ( rule__Variable__VariableNameAssignment_0_3 ) ) ;
    public final void rule__Variable__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1401:1: ( ( ( rule__Variable__VariableNameAssignment_0_3 ) ) )
            // InternalDefine.g:1402:1: ( ( rule__Variable__VariableNameAssignment_0_3 ) )
            {
            // InternalDefine.g:1402:1: ( ( rule__Variable__VariableNameAssignment_0_3 ) )
            // InternalDefine.g:1403:2: ( rule__Variable__VariableNameAssignment_0_3 )
            {
             before(grammarAccess.getVariableAccess().getVariableNameAssignment_0_3()); 
            // InternalDefine.g:1404:2: ( rule__Variable__VariableNameAssignment_0_3 )
            // InternalDefine.g:1404:3: rule__Variable__VariableNameAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableNameAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableNameAssignment_0_3()); 

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
    // $ANTLR end "rule__Variable__Group_0__3__Impl"


    // $ANTLR start "rule__Variable__Group_0__4"
    // InternalDefine.g:1412:1: rule__Variable__Group_0__4 : rule__Variable__Group_0__4__Impl rule__Variable__Group_0__5 ;
    public final void rule__Variable__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1416:1: ( rule__Variable__Group_0__4__Impl rule__Variable__Group_0__5 )
            // InternalDefine.g:1417:2: rule__Variable__Group_0__4__Impl rule__Variable__Group_0__5
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__5();

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
    // $ANTLR end "rule__Variable__Group_0__4"


    // $ANTLR start "rule__Variable__Group_0__4__Impl"
    // InternalDefine.g:1424:1: rule__Variable__Group_0__4__Impl : ( ( rule__Variable__Group_0_4__0 )? ) ;
    public final void rule__Variable__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1428:1: ( ( ( rule__Variable__Group_0_4__0 )? ) )
            // InternalDefine.g:1429:1: ( ( rule__Variable__Group_0_4__0 )? )
            {
            // InternalDefine.g:1429:1: ( ( rule__Variable__Group_0_4__0 )? )
            // InternalDefine.g:1430:2: ( rule__Variable__Group_0_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_0_4()); 
            // InternalDefine.g:1431:2: ( rule__Variable__Group_0_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDefine.g:1431:3: rule__Variable__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_0_4()); 

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
    // $ANTLR end "rule__Variable__Group_0__4__Impl"


    // $ANTLR start "rule__Variable__Group_0__5"
    // InternalDefine.g:1439:1: rule__Variable__Group_0__5 : rule__Variable__Group_0__5__Impl ;
    public final void rule__Variable__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1443:1: ( rule__Variable__Group_0__5__Impl )
            // InternalDefine.g:1444:2: rule__Variable__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__5__Impl();

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
    // $ANTLR end "rule__Variable__Group_0__5"


    // $ANTLR start "rule__Variable__Group_0__5__Impl"
    // InternalDefine.g:1450:1: rule__Variable__Group_0__5__Impl : ( ';' ) ;
    public final void rule__Variable__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1454:1: ( ( ';' ) )
            // InternalDefine.g:1455:1: ( ';' )
            {
            // InternalDefine.g:1455:1: ( ';' )
            // InternalDefine.g:1456:2: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_0_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getSemicolonKeyword_0_5()); 

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
    // $ANTLR end "rule__Variable__Group_0__5__Impl"


    // $ANTLR start "rule__Variable__Group_0_4__0"
    // InternalDefine.g:1466:1: rule__Variable__Group_0_4__0 : rule__Variable__Group_0_4__0__Impl rule__Variable__Group_0_4__1 ;
    public final void rule__Variable__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1470:1: ( rule__Variable__Group_0_4__0__Impl rule__Variable__Group_0_4__1 )
            // InternalDefine.g:1471:2: rule__Variable__Group_0_4__0__Impl rule__Variable__Group_0_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_4__1();

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
    // $ANTLR end "rule__Variable__Group_0_4__0"


    // $ANTLR start "rule__Variable__Group_0_4__0__Impl"
    // InternalDefine.g:1478:1: rule__Variable__Group_0_4__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1482:1: ( ( '=' ) )
            // InternalDefine.g:1483:1: ( '=' )
            {
            // InternalDefine.g:1483:1: ( '=' )
            // InternalDefine.g:1484:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_0_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_0_4_0()); 

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
    // $ANTLR end "rule__Variable__Group_0_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_0_4__1"
    // InternalDefine.g:1493:1: rule__Variable__Group_0_4__1 : rule__Variable__Group_0_4__1__Impl rule__Variable__Group_0_4__2 ;
    public final void rule__Variable__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1497:1: ( rule__Variable__Group_0_4__1__Impl rule__Variable__Group_0_4__2 )
            // InternalDefine.g:1498:2: rule__Variable__Group_0_4__1__Impl rule__Variable__Group_0_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_4__2();

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
    // $ANTLR end "rule__Variable__Group_0_4__1"


    // $ANTLR start "rule__Variable__Group_0_4__1__Impl"
    // InternalDefine.g:1505:1: rule__Variable__Group_0_4__1__Impl : ( ( rule__Variable__ExpressionAssignment_0_4_1 ) ) ;
    public final void rule__Variable__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1509:1: ( ( ( rule__Variable__ExpressionAssignment_0_4_1 ) ) )
            // InternalDefine.g:1510:1: ( ( rule__Variable__ExpressionAssignment_0_4_1 ) )
            {
            // InternalDefine.g:1510:1: ( ( rule__Variable__ExpressionAssignment_0_4_1 ) )
            // InternalDefine.g:1511:2: ( rule__Variable__ExpressionAssignment_0_4_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_0_4_1()); 
            // InternalDefine.g:1512:2: ( rule__Variable__ExpressionAssignment_0_4_1 )
            // InternalDefine.g:1512:3: rule__Variable__ExpressionAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_0_4_1()); 

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
    // $ANTLR end "rule__Variable__Group_0_4__1__Impl"


    // $ANTLR start "rule__Variable__Group_0_4__2"
    // InternalDefine.g:1520:1: rule__Variable__Group_0_4__2 : rule__Variable__Group_0_4__2__Impl ;
    public final void rule__Variable__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1524:1: ( rule__Variable__Group_0_4__2__Impl )
            // InternalDefine.g:1525:2: rule__Variable__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_4__2__Impl();

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
    // $ANTLR end "rule__Variable__Group_0_4__2"


    // $ANTLR start "rule__Variable__Group_0_4__2__Impl"
    // InternalDefine.g:1531:1: rule__Variable__Group_0_4__2__Impl : ( ( rule__Variable__Group_0_4_2__0 )? ) ;
    public final void rule__Variable__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1535:1: ( ( ( rule__Variable__Group_0_4_2__0 )? ) )
            // InternalDefine.g:1536:1: ( ( rule__Variable__Group_0_4_2__0 )? )
            {
            // InternalDefine.g:1536:1: ( ( rule__Variable__Group_0_4_2__0 )? )
            // InternalDefine.g:1537:2: ( rule__Variable__Group_0_4_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_0_4_2()); 
            // InternalDefine.g:1538:2: ( rule__Variable__Group_0_4_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDefine.g:1538:3: rule__Variable__Group_0_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_0_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_0_4_2()); 

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
    // $ANTLR end "rule__Variable__Group_0_4__2__Impl"


    // $ANTLR start "rule__Variable__Group_0_4_2__0"
    // InternalDefine.g:1547:1: rule__Variable__Group_0_4_2__0 : rule__Variable__Group_0_4_2__0__Impl rule__Variable__Group_0_4_2__1 ;
    public final void rule__Variable__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1551:1: ( rule__Variable__Group_0_4_2__0__Impl rule__Variable__Group_0_4_2__1 )
            // InternalDefine.g:1552:2: rule__Variable__Group_0_4_2__0__Impl rule__Variable__Group_0_4_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group_0_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_4_2__1();

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
    // $ANTLR end "rule__Variable__Group_0_4_2__0"


    // $ANTLR start "rule__Variable__Group_0_4_2__0__Impl"
    // InternalDefine.g:1559:1: rule__Variable__Group_0_4_2__0__Impl : ( '+/-' ) ;
    public final void rule__Variable__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1563:1: ( ( '+/-' ) )
            // InternalDefine.g:1564:1: ( '+/-' )
            {
            // InternalDefine.g:1564:1: ( '+/-' )
            // InternalDefine.g:1565:2: '+/-'
            {
             before(grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_0_4_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_0_4_2_0()); 

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
    // $ANTLR end "rule__Variable__Group_0_4_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_0_4_2__1"
    // InternalDefine.g:1574:1: rule__Variable__Group_0_4_2__1 : rule__Variable__Group_0_4_2__1__Impl ;
    public final void rule__Variable__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1578:1: ( rule__Variable__Group_0_4_2__1__Impl )
            // InternalDefine.g:1579:2: rule__Variable__Group_0_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_4_2__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_0_4_2__1"


    // $ANTLR start "rule__Variable__Group_0_4_2__1__Impl"
    // InternalDefine.g:1585:1: rule__Variable__Group_0_4_2__1__Impl : ( ( rule__Variable__RangeAssignment_0_4_2_1 ) ) ;
    public final void rule__Variable__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1589:1: ( ( ( rule__Variable__RangeAssignment_0_4_2_1 ) ) )
            // InternalDefine.g:1590:1: ( ( rule__Variable__RangeAssignment_0_4_2_1 ) )
            {
            // InternalDefine.g:1590:1: ( ( rule__Variable__RangeAssignment_0_4_2_1 ) )
            // InternalDefine.g:1591:2: ( rule__Variable__RangeAssignment_0_4_2_1 )
            {
             before(grammarAccess.getVariableAccess().getRangeAssignment_0_4_2_1()); 
            // InternalDefine.g:1592:2: ( rule__Variable__RangeAssignment_0_4_2_1 )
            // InternalDefine.g:1592:3: rule__Variable__RangeAssignment_0_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__RangeAssignment_0_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getRangeAssignment_0_4_2_1()); 

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
    // $ANTLR end "rule__Variable__Group_0_4_2__1__Impl"


    // $ANTLR start "rule__Udt__Group__0"
    // InternalDefine.g:1601:1: rule__Udt__Group__0 : rule__Udt__Group__0__Impl rule__Udt__Group__1 ;
    public final void rule__Udt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1605:1: ( rule__Udt__Group__0__Impl rule__Udt__Group__1 )
            // InternalDefine.g:1606:2: rule__Udt__Group__0__Impl rule__Udt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Udt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__1();

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
    // $ANTLR end "rule__Udt__Group__0"


    // $ANTLR start "rule__Udt__Group__0__Impl"
    // InternalDefine.g:1613:1: rule__Udt__Group__0__Impl : ( 'udt' ) ;
    public final void rule__Udt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1617:1: ( ( 'udt' ) )
            // InternalDefine.g:1618:1: ( 'udt' )
            {
            // InternalDefine.g:1618:1: ( 'udt' )
            // InternalDefine.g:1619:2: 'udt'
            {
             before(grammarAccess.getUdtAccess().getUdtKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUdtAccess().getUdtKeyword_0()); 

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
    // $ANTLR end "rule__Udt__Group__0__Impl"


    // $ANTLR start "rule__Udt__Group__1"
    // InternalDefine.g:1628:1: rule__Udt__Group__1 : rule__Udt__Group__1__Impl rule__Udt__Group__2 ;
    public final void rule__Udt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1632:1: ( rule__Udt__Group__1__Impl rule__Udt__Group__2 )
            // InternalDefine.g:1633:2: rule__Udt__Group__1__Impl rule__Udt__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Udt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__2();

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
    // $ANTLR end "rule__Udt__Group__1"


    // $ANTLR start "rule__Udt__Group__1__Impl"
    // InternalDefine.g:1640:1: rule__Udt__Group__1__Impl : ( ( rule__Udt__UdtNameAssignment_1 ) ) ;
    public final void rule__Udt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1644:1: ( ( ( rule__Udt__UdtNameAssignment_1 ) ) )
            // InternalDefine.g:1645:1: ( ( rule__Udt__UdtNameAssignment_1 ) )
            {
            // InternalDefine.g:1645:1: ( ( rule__Udt__UdtNameAssignment_1 ) )
            // InternalDefine.g:1646:2: ( rule__Udt__UdtNameAssignment_1 )
            {
             before(grammarAccess.getUdtAccess().getUdtNameAssignment_1()); 
            // InternalDefine.g:1647:2: ( rule__Udt__UdtNameAssignment_1 )
            // InternalDefine.g:1647:3: rule__Udt__UdtNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Udt__UdtNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUdtAccess().getUdtNameAssignment_1()); 

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
    // $ANTLR end "rule__Udt__Group__1__Impl"


    // $ANTLR start "rule__Udt__Group__2"
    // InternalDefine.g:1655:1: rule__Udt__Group__2 : rule__Udt__Group__2__Impl rule__Udt__Group__3 ;
    public final void rule__Udt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1659:1: ( rule__Udt__Group__2__Impl rule__Udt__Group__3 )
            // InternalDefine.g:1660:2: rule__Udt__Group__2__Impl rule__Udt__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Udt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__3();

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
    // $ANTLR end "rule__Udt__Group__2"


    // $ANTLR start "rule__Udt__Group__2__Impl"
    // InternalDefine.g:1667:1: rule__Udt__Group__2__Impl : ( '(' ) ;
    public final void rule__Udt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1671:1: ( ( '(' ) )
            // InternalDefine.g:1672:1: ( '(' )
            {
            // InternalDefine.g:1672:1: ( '(' )
            // InternalDefine.g:1673:2: '('
            {
             before(grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Udt__Group__2__Impl"


    // $ANTLR start "rule__Udt__Group__3"
    // InternalDefine.g:1682:1: rule__Udt__Group__3 : rule__Udt__Group__3__Impl rule__Udt__Group__4 ;
    public final void rule__Udt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1686:1: ( rule__Udt__Group__3__Impl rule__Udt__Group__4 )
            // InternalDefine.g:1687:2: rule__Udt__Group__3__Impl rule__Udt__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Udt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__4();

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
    // $ANTLR end "rule__Udt__Group__3"


    // $ANTLR start "rule__Udt__Group__3__Impl"
    // InternalDefine.g:1694:1: rule__Udt__Group__3__Impl : ( ( rule__Udt__UdtTypesAssignment_3 ) ) ;
    public final void rule__Udt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1698:1: ( ( ( rule__Udt__UdtTypesAssignment_3 ) ) )
            // InternalDefine.g:1699:1: ( ( rule__Udt__UdtTypesAssignment_3 ) )
            {
            // InternalDefine.g:1699:1: ( ( rule__Udt__UdtTypesAssignment_3 ) )
            // InternalDefine.g:1700:2: ( rule__Udt__UdtTypesAssignment_3 )
            {
             before(grammarAccess.getUdtAccess().getUdtTypesAssignment_3()); 
            // InternalDefine.g:1701:2: ( rule__Udt__UdtTypesAssignment_3 )
            // InternalDefine.g:1701:3: rule__Udt__UdtTypesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Udt__UdtTypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUdtAccess().getUdtTypesAssignment_3()); 

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
    // $ANTLR end "rule__Udt__Group__3__Impl"


    // $ANTLR start "rule__Udt__Group__4"
    // InternalDefine.g:1709:1: rule__Udt__Group__4 : rule__Udt__Group__4__Impl rule__Udt__Group__5 ;
    public final void rule__Udt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1713:1: ( rule__Udt__Group__4__Impl rule__Udt__Group__5 )
            // InternalDefine.g:1714:2: rule__Udt__Group__4__Impl rule__Udt__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Udt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__5();

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
    // $ANTLR end "rule__Udt__Group__4"


    // $ANTLR start "rule__Udt__Group__4__Impl"
    // InternalDefine.g:1721:1: rule__Udt__Group__4__Impl : ( ')' ) ;
    public final void rule__Udt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1725:1: ( ( ')' ) )
            // InternalDefine.g:1726:1: ( ')' )
            {
            // InternalDefine.g:1726:1: ( ')' )
            // InternalDefine.g:1727:2: ')'
            {
             before(grammarAccess.getUdtAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUdtAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Udt__Group__4__Impl"


    // $ANTLR start "rule__Udt__Group__5"
    // InternalDefine.g:1736:1: rule__Udt__Group__5 : rule__Udt__Group__5__Impl rule__Udt__Group__6 ;
    public final void rule__Udt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1740:1: ( rule__Udt__Group__5__Impl rule__Udt__Group__6 )
            // InternalDefine.g:1741:2: rule__Udt__Group__5__Impl rule__Udt__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Udt__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__6();

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
    // $ANTLR end "rule__Udt__Group__5"


    // $ANTLR start "rule__Udt__Group__5__Impl"
    // InternalDefine.g:1748:1: rule__Udt__Group__5__Impl : ( '{' ) ;
    public final void rule__Udt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1752:1: ( ( '{' ) )
            // InternalDefine.g:1753:1: ( '{' )
            {
            // InternalDefine.g:1753:1: ( '{' )
            // InternalDefine.g:1754:2: '{'
            {
             before(grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Udt__Group__5__Impl"


    // $ANTLR start "rule__Udt__Group__6"
    // InternalDefine.g:1763:1: rule__Udt__Group__6 : rule__Udt__Group__6__Impl rule__Udt__Group__7 ;
    public final void rule__Udt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1767:1: ( rule__Udt__Group__6__Impl rule__Udt__Group__7 )
            // InternalDefine.g:1768:2: rule__Udt__Group__6__Impl rule__Udt__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Udt__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Udt__Group__7();

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
    // $ANTLR end "rule__Udt__Group__6"


    // $ANTLR start "rule__Udt__Group__6__Impl"
    // InternalDefine.g:1775:1: rule__Udt__Group__6__Impl : ( ( rule__Udt__UdtVariablesAssignment_6 )* ) ;
    public final void rule__Udt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1779:1: ( ( ( rule__Udt__UdtVariablesAssignment_6 )* ) )
            // InternalDefine.g:1780:1: ( ( rule__Udt__UdtVariablesAssignment_6 )* )
            {
            // InternalDefine.g:1780:1: ( ( rule__Udt__UdtVariablesAssignment_6 )* )
            // InternalDefine.g:1781:2: ( rule__Udt__UdtVariablesAssignment_6 )*
            {
             before(grammarAccess.getUdtAccess().getUdtVariablesAssignment_6()); 
            // InternalDefine.g:1782:2: ( rule__Udt__UdtVariablesAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32||(LA17_0>=35 && LA17_0<=38)||LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDefine.g:1782:3: rule__Udt__UdtVariablesAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Udt__UdtVariablesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getUdtAccess().getUdtVariablesAssignment_6()); 

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
    // $ANTLR end "rule__Udt__Group__6__Impl"


    // $ANTLR start "rule__Udt__Group__7"
    // InternalDefine.g:1790:1: rule__Udt__Group__7 : rule__Udt__Group__7__Impl ;
    public final void rule__Udt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1794:1: ( rule__Udt__Group__7__Impl )
            // InternalDefine.g:1795:2: rule__Udt__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Udt__Group__7__Impl();

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
    // $ANTLR end "rule__Udt__Group__7"


    // $ANTLR start "rule__Udt__Group__7__Impl"
    // InternalDefine.g:1801:1: rule__Udt__Group__7__Impl : ( '}' ) ;
    public final void rule__Udt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1805:1: ( ( '}' ) )
            // InternalDefine.g:1806:1: ( '}' )
            {
            // InternalDefine.g:1806:1: ( '}' )
            // InternalDefine.g:1807:2: '}'
            {
             before(grammarAccess.getUdtAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUdtAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Udt__Group__7__Impl"


    // $ANTLR start "rule__Types__Group_0__0"
    // InternalDefine.g:1817:1: rule__Types__Group_0__0 : rule__Types__Group_0__0__Impl rule__Types__Group_0__1 ;
    public final void rule__Types__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1821:1: ( rule__Types__Group_0__0__Impl rule__Types__Group_0__1 )
            // InternalDefine.g:1822:2: rule__Types__Group_0__0__Impl rule__Types__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Types__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_0__1();

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
    // $ANTLR end "rule__Types__Group_0__0"


    // $ANTLR start "rule__Types__Group_0__0__Impl"
    // InternalDefine.g:1829:1: rule__Types__Group_0__0__Impl : ( () ) ;
    public final void rule__Types__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1833:1: ( ( () ) )
            // InternalDefine.g:1834:1: ( () )
            {
            // InternalDefine.g:1834:1: ( () )
            // InternalDefine.g:1835:2: ()
            {
             before(grammarAccess.getTypesAccess().getIntAction_0_0()); 
            // InternalDefine.g:1836:2: ()
            // InternalDefine.g:1836:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getIntAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_0__0__Impl"


    // $ANTLR start "rule__Types__Group_0__1"
    // InternalDefine.g:1844:1: rule__Types__Group_0__1 : rule__Types__Group_0__1__Impl ;
    public final void rule__Types__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1848:1: ( rule__Types__Group_0__1__Impl )
            // InternalDefine.g:1849:2: rule__Types__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_0__1__Impl();

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
    // $ANTLR end "rule__Types__Group_0__1"


    // $ANTLR start "rule__Types__Group_0__1__Impl"
    // InternalDefine.g:1855:1: rule__Types__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Types__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1859:1: ( ( 'int' ) )
            // InternalDefine.g:1860:1: ( 'int' )
            {
            // InternalDefine.g:1860:1: ( 'int' )
            // InternalDefine.g:1861:2: 'int'
            {
             before(grammarAccess.getTypesAccess().getIntKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getIntKeyword_0_1()); 

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
    // $ANTLR end "rule__Types__Group_0__1__Impl"


    // $ANTLR start "rule__Types__Group_1__0"
    // InternalDefine.g:1871:1: rule__Types__Group_1__0 : rule__Types__Group_1__0__Impl rule__Types__Group_1__1 ;
    public final void rule__Types__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1875:1: ( rule__Types__Group_1__0__Impl rule__Types__Group_1__1 )
            // InternalDefine.g:1876:2: rule__Types__Group_1__0__Impl rule__Types__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Types__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_1__1();

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
    // $ANTLR end "rule__Types__Group_1__0"


    // $ANTLR start "rule__Types__Group_1__0__Impl"
    // InternalDefine.g:1883:1: rule__Types__Group_1__0__Impl : ( () ) ;
    public final void rule__Types__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1887:1: ( ( () ) )
            // InternalDefine.g:1888:1: ( () )
            {
            // InternalDefine.g:1888:1: ( () )
            // InternalDefine.g:1889:2: ()
            {
             before(grammarAccess.getTypesAccess().getBoolAction_1_0()); 
            // InternalDefine.g:1890:2: ()
            // InternalDefine.g:1890:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getBoolAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_1__0__Impl"


    // $ANTLR start "rule__Types__Group_1__1"
    // InternalDefine.g:1898:1: rule__Types__Group_1__1 : rule__Types__Group_1__1__Impl ;
    public final void rule__Types__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1902:1: ( rule__Types__Group_1__1__Impl )
            // InternalDefine.g:1903:2: rule__Types__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_1__1__Impl();

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
    // $ANTLR end "rule__Types__Group_1__1"


    // $ANTLR start "rule__Types__Group_1__1__Impl"
    // InternalDefine.g:1909:1: rule__Types__Group_1__1__Impl : ( 'bool' ) ;
    public final void rule__Types__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1913:1: ( ( 'bool' ) )
            // InternalDefine.g:1914:1: ( 'bool' )
            {
            // InternalDefine.g:1914:1: ( 'bool' )
            // InternalDefine.g:1915:2: 'bool'
            {
             before(grammarAccess.getTypesAccess().getBoolKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getBoolKeyword_1_1()); 

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
    // $ANTLR end "rule__Types__Group_1__1__Impl"


    // $ANTLR start "rule__Types__Group_2__0"
    // InternalDefine.g:1925:1: rule__Types__Group_2__0 : rule__Types__Group_2__0__Impl rule__Types__Group_2__1 ;
    public final void rule__Types__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1929:1: ( rule__Types__Group_2__0__Impl rule__Types__Group_2__1 )
            // InternalDefine.g:1930:2: rule__Types__Group_2__0__Impl rule__Types__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Types__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_2__1();

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
    // $ANTLR end "rule__Types__Group_2__0"


    // $ANTLR start "rule__Types__Group_2__0__Impl"
    // InternalDefine.g:1937:1: rule__Types__Group_2__0__Impl : ( () ) ;
    public final void rule__Types__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1941:1: ( ( () ) )
            // InternalDefine.g:1942:1: ( () )
            {
            // InternalDefine.g:1942:1: ( () )
            // InternalDefine.g:1943:2: ()
            {
             before(grammarAccess.getTypesAccess().getFloatAction_2_0()); 
            // InternalDefine.g:1944:2: ()
            // InternalDefine.g:1944:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getFloatAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_2__0__Impl"


    // $ANTLR start "rule__Types__Group_2__1"
    // InternalDefine.g:1952:1: rule__Types__Group_2__1 : rule__Types__Group_2__1__Impl ;
    public final void rule__Types__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1956:1: ( rule__Types__Group_2__1__Impl )
            // InternalDefine.g:1957:2: rule__Types__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_2__1__Impl();

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
    // $ANTLR end "rule__Types__Group_2__1"


    // $ANTLR start "rule__Types__Group_2__1__Impl"
    // InternalDefine.g:1963:1: rule__Types__Group_2__1__Impl : ( 'float' ) ;
    public final void rule__Types__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1967:1: ( ( 'float' ) )
            // InternalDefine.g:1968:1: ( 'float' )
            {
            // InternalDefine.g:1968:1: ( 'float' )
            // InternalDefine.g:1969:2: 'float'
            {
             before(grammarAccess.getTypesAccess().getFloatKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getFloatKeyword_2_1()); 

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
    // $ANTLR end "rule__Types__Group_2__1__Impl"


    // $ANTLR start "rule__Types__Group_3__0"
    // InternalDefine.g:1979:1: rule__Types__Group_3__0 : rule__Types__Group_3__0__Impl rule__Types__Group_3__1 ;
    public final void rule__Types__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1983:1: ( rule__Types__Group_3__0__Impl rule__Types__Group_3__1 )
            // InternalDefine.g:1984:2: rule__Types__Group_3__0__Impl rule__Types__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Types__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_3__1();

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
    // $ANTLR end "rule__Types__Group_3__0"


    // $ANTLR start "rule__Types__Group_3__0__Impl"
    // InternalDefine.g:1991:1: rule__Types__Group_3__0__Impl : ( () ) ;
    public final void rule__Types__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1995:1: ( ( () ) )
            // InternalDefine.g:1996:1: ( () )
            {
            // InternalDefine.g:1996:1: ( () )
            // InternalDefine.g:1997:2: ()
            {
             before(grammarAccess.getTypesAccess().getStringTypAction_3_0()); 
            // InternalDefine.g:1998:2: ()
            // InternalDefine.g:1998:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getStringTypAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_3__0__Impl"


    // $ANTLR start "rule__Types__Group_3__1"
    // InternalDefine.g:2006:1: rule__Types__Group_3__1 : rule__Types__Group_3__1__Impl ;
    public final void rule__Types__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2010:1: ( rule__Types__Group_3__1__Impl )
            // InternalDefine.g:2011:2: rule__Types__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_3__1__Impl();

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
    // $ANTLR end "rule__Types__Group_3__1"


    // $ANTLR start "rule__Types__Group_3__1__Impl"
    // InternalDefine.g:2017:1: rule__Types__Group_3__1__Impl : ( 'string' ) ;
    public final void rule__Types__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2021:1: ( ( 'string' ) )
            // InternalDefine.g:2022:1: ( 'string' )
            {
            // InternalDefine.g:2022:1: ( 'string' )
            // InternalDefine.g:2023:2: 'string'
            {
             before(grammarAccess.getTypesAccess().getStringKeyword_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getStringKeyword_3_1()); 

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
    // $ANTLR end "rule__Types__Group_3__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalDefine.g:2033:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2037:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalDefine.g:2038:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalDefine.g:2045:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2049:1: ( ( ruleAnd ) )
            // InternalDefine.g:2050:1: ( ruleAnd )
            {
            // InternalDefine.g:2050:1: ( ruleAnd )
            // InternalDefine.g:2051:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalDefine.g:2060:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2064:1: ( rule__Or__Group__1__Impl )
            // InternalDefine.g:2065:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalDefine.g:2071:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2075:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalDefine.g:2076:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalDefine.g:2076:1: ( ( rule__Or__Group_1__0 )* )
            // InternalDefine.g:2077:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalDefine.g:2078:2: ( rule__Or__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDefine.g:2078:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalDefine.g:2087:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2091:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalDefine.g:2092:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalDefine.g:2099:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2103:1: ( ( () ) )
            // InternalDefine.g:2104:1: ( () )
            {
            // InternalDefine.g:2104:1: ( () )
            // InternalDefine.g:2105:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalDefine.g:2106:2: ()
            // InternalDefine.g:2106:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalDefine.g:2114:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2118:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalDefine.g:2119:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalDefine.g:2126:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2130:1: ( ( '||' ) )
            // InternalDefine.g:2131:1: ( '||' )
            {
            // InternalDefine.g:2131:1: ( '||' )
            // InternalDefine.g:2132:2: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalDefine.g:2141:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2145:1: ( rule__Or__Group_1__2__Impl )
            // InternalDefine.g:2146:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalDefine.g:2152:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2156:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalDefine.g:2157:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalDefine.g:2157:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalDefine.g:2158:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalDefine.g:2159:2: ( rule__Or__RightAssignment_1_2 )
            // InternalDefine.g:2159:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalDefine.g:2168:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2172:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalDefine.g:2173:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalDefine.g:2180:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2184:1: ( ( ruleEquality ) )
            // InternalDefine.g:2185:1: ( ruleEquality )
            {
            // InternalDefine.g:2185:1: ( ruleEquality )
            // InternalDefine.g:2186:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalDefine.g:2195:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2199:1: ( rule__And__Group__1__Impl )
            // InternalDefine.g:2200:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalDefine.g:2206:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2210:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalDefine.g:2211:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalDefine.g:2211:1: ( ( rule__And__Group_1__0 )* )
            // InternalDefine.g:2212:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalDefine.g:2213:2: ( rule__And__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDefine.g:2213:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalDefine.g:2222:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2226:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalDefine.g:2227:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalDefine.g:2234:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2238:1: ( ( () ) )
            // InternalDefine.g:2239:1: ( () )
            {
            // InternalDefine.g:2239:1: ( () )
            // InternalDefine.g:2240:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalDefine.g:2241:2: ()
            // InternalDefine.g:2241:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalDefine.g:2249:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2253:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalDefine.g:2254:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalDefine.g:2261:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2265:1: ( ( '&&' ) )
            // InternalDefine.g:2266:1: ( '&&' )
            {
            // InternalDefine.g:2266:1: ( '&&' )
            // InternalDefine.g:2267:2: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalDefine.g:2276:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2280:1: ( rule__And__Group_1__2__Impl )
            // InternalDefine.g:2281:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalDefine.g:2287:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2291:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalDefine.g:2292:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalDefine.g:2292:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalDefine.g:2293:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalDefine.g:2294:2: ( rule__And__RightAssignment_1_2 )
            // InternalDefine.g:2294:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalDefine.g:2303:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2307:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalDefine.g:2308:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalDefine.g:2315:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2319:1: ( ( ruleComparison ) )
            // InternalDefine.g:2320:1: ( ruleComparison )
            {
            // InternalDefine.g:2320:1: ( ruleComparison )
            // InternalDefine.g:2321:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalDefine.g:2330:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2334:1: ( rule__Equality__Group__1__Impl )
            // InternalDefine.g:2335:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalDefine.g:2341:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2345:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalDefine.g:2346:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalDefine.g:2346:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalDefine.g:2347:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalDefine.g:2348:2: ( rule__Equality__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDefine.g:2348:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalDefine.g:2357:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2361:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalDefine.g:2362:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalDefine.g:2369:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2373:1: ( ( () ) )
            // InternalDefine.g:2374:1: ( () )
            {
            // InternalDefine.g:2374:1: ( () )
            // InternalDefine.g:2375:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalDefine.g:2376:2: ()
            // InternalDefine.g:2376:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalDefine.g:2384:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2388:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalDefine.g:2389:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalDefine.g:2396:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2400:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalDefine.g:2401:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalDefine.g:2401:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalDefine.g:2402:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalDefine.g:2403:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalDefine.g:2403:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalDefine.g:2411:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2415:1: ( rule__Equality__Group_1__2__Impl )
            // InternalDefine.g:2416:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalDefine.g:2422:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2426:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalDefine.g:2427:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalDefine.g:2427:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalDefine.g:2428:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalDefine.g:2429:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalDefine.g:2429:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalDefine.g:2438:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2442:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalDefine.g:2443:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalDefine.g:2450:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2454:1: ( ( rulePlusOrMinus ) )
            // InternalDefine.g:2455:1: ( rulePlusOrMinus )
            {
            // InternalDefine.g:2455:1: ( rulePlusOrMinus )
            // InternalDefine.g:2456:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalDefine.g:2465:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2469:1: ( rule__Comparison__Group__1__Impl )
            // InternalDefine.g:2470:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalDefine.g:2476:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2480:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalDefine.g:2481:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalDefine.g:2481:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalDefine.g:2482:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalDefine.g:2483:2: ( rule__Comparison__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=13 && LA21_0<=16)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDefine.g:2483:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalDefine.g:2492:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2496:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalDefine.g:2497:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalDefine.g:2504:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2508:1: ( ( () ) )
            // InternalDefine.g:2509:1: ( () )
            {
            // InternalDefine.g:2509:1: ( () )
            // InternalDefine.g:2510:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalDefine.g:2511:2: ()
            // InternalDefine.g:2511:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalDefine.g:2519:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2523:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalDefine.g:2524:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalDefine.g:2531:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2535:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalDefine.g:2536:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalDefine.g:2536:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalDefine.g:2537:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalDefine.g:2538:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalDefine.g:2538:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalDefine.g:2546:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2550:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalDefine.g:2551:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalDefine.g:2557:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2561:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalDefine.g:2562:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalDefine.g:2562:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalDefine.g:2563:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalDefine.g:2564:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalDefine.g:2564:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalDefine.g:2573:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2577:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalDefine.g:2578:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalDefine.g:2585:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2589:1: ( ( ruleMulOrDiv ) )
            // InternalDefine.g:2590:1: ( ruleMulOrDiv )
            {
            // InternalDefine.g:2590:1: ( ruleMulOrDiv )
            // InternalDefine.g:2591:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalDefine.g:2600:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2604:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalDefine.g:2605:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalDefine.g:2611:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2615:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalDefine.g:2616:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalDefine.g:2616:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalDefine.g:2617:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalDefine.g:2618:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDefine.g:2618:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalDefine.g:2627:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2631:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalDefine.g:2632:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalDefine.g:2639:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2643:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalDefine.g:2644:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalDefine.g:2644:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalDefine.g:2645:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalDefine.g:2646:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalDefine.g:2646:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalDefine.g:2654:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2658:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalDefine.g:2659:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalDefine.g:2665:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2669:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalDefine.g:2670:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalDefine.g:2670:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalDefine.g:2671:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalDefine.g:2672:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalDefine.g:2672:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalDefine.g:2681:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2685:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalDefine.g:2686:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_30);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalDefine.g:2693:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2697:1: ( ( () ) )
            // InternalDefine.g:2698:1: ( () )
            {
            // InternalDefine.g:2698:1: ( () )
            // InternalDefine.g:2699:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalDefine.g:2700:2: ()
            // InternalDefine.g:2700:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalDefine.g:2708:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2712:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalDefine.g:2713:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalDefine.g:2719:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2723:1: ( ( '+' ) )
            // InternalDefine.g:2724:1: ( '+' )
            {
            // InternalDefine.g:2724:1: ( '+' )
            // InternalDefine.g:2725:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalDefine.g:2735:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2739:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalDefine.g:2740:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_28);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalDefine.g:2747:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2751:1: ( ( () ) )
            // InternalDefine.g:2752:1: ( () )
            {
            // InternalDefine.g:2752:1: ( () )
            // InternalDefine.g:2753:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalDefine.g:2754:2: ()
            // InternalDefine.g:2754:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalDefine.g:2762:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2766:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalDefine.g:2767:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalDefine.g:2773:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2777:1: ( ( '-' ) )
            // InternalDefine.g:2778:1: ( '-' )
            {
            // InternalDefine.g:2778:1: ( '-' )
            // InternalDefine.g:2779:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalDefine.g:2789:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2793:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalDefine.g:2794:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalDefine.g:2801:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2805:1: ( ( rulePrimary ) )
            // InternalDefine.g:2806:1: ( rulePrimary )
            {
            // InternalDefine.g:2806:1: ( rulePrimary )
            // InternalDefine.g:2807:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalDefine.g:2816:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2820:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalDefine.g:2821:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalDefine.g:2827:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2831:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalDefine.g:2832:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalDefine.g:2832:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalDefine.g:2833:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalDefine.g:2834:2: ( rule__MulOrDiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDefine.g:2834:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalDefine.g:2843:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2847:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalDefine.g:2848:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalDefine.g:2855:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2859:1: ( ( () ) )
            // InternalDefine.g:2860:1: ( () )
            {
            // InternalDefine.g:2860:1: ( () )
            // InternalDefine.g:2861:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalDefine.g:2862:2: ()
            // InternalDefine.g:2862:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalDefine.g:2870:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2874:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalDefine.g:2875:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalDefine.g:2882:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2886:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalDefine.g:2887:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalDefine.g:2887:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalDefine.g:2888:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalDefine.g:2889:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalDefine.g:2889:3: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // InternalDefine.g:2897:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2901:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalDefine.g:2902:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // InternalDefine.g:2908:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2912:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalDefine.g:2913:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalDefine.g:2913:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalDefine.g:2914:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalDefine.g:2915:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalDefine.g:2915:3: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalDefine.g:2924:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2928:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalDefine.g:2929:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalDefine.g:2936:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2940:1: ( ( '(' ) )
            // InternalDefine.g:2941:1: ( '(' )
            {
            // InternalDefine.g:2941:1: ( '(' )
            // InternalDefine.g:2942:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalDefine.g:2951:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2955:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalDefine.g:2956:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalDefine.g:2963:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2967:1: ( ( ruleExpression ) )
            // InternalDefine.g:2968:1: ( ruleExpression )
            {
            // InternalDefine.g:2968:1: ( ruleExpression )
            // InternalDefine.g:2969:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalDefine.g:2978:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2982:1: ( rule__Primary__Group_0__2__Impl )
            // InternalDefine.g:2983:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalDefine.g:2989:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2993:1: ( ( ')' ) )
            // InternalDefine.g:2994:1: ( ')' )
            {
            // InternalDefine.g:2994:1: ( ')' )
            // InternalDefine.g:2995:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalDefine.g:3005:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3009:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalDefine.g:3010:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalDefine.g:3017:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3021:1: ( ( () ) )
            // InternalDefine.g:3022:1: ( () )
            {
            // InternalDefine.g:3022:1: ( () )
            // InternalDefine.g:3023:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalDefine.g:3024:2: ()
            // InternalDefine.g:3024:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalDefine.g:3032:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3036:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalDefine.g:3037:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalDefine.g:3044:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3048:1: ( ( '!' ) )
            // InternalDefine.g:3049:1: ( '!' )
            {
            // InternalDefine.g:3049:1: ( '!' )
            // InternalDefine.g:3050:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalDefine.g:3059:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3063:1: ( rule__Primary__Group_1__2__Impl )
            // InternalDefine.g:3064:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalDefine.g:3070:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3074:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalDefine.g:3075:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalDefine.g:3075:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalDefine.g:3076:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalDefine.g:3077:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalDefine.g:3077:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalDefine.g:3086:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3090:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalDefine.g:3091:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalDefine.g:3098:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3102:1: ( ( () ) )
            // InternalDefine.g:3103:1: ( () )
            {
            // InternalDefine.g:3103:1: ( () )
            // InternalDefine.g:3104:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalDefine.g:3105:2: ()
            // InternalDefine.g:3105:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalDefine.g:3113:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3117:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalDefine.g:3118:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalDefine.g:3124:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3128:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalDefine.g:3129:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalDefine.g:3129:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalDefine.g:3130:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalDefine.g:3131:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalDefine.g:3131:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalDefine.g:3140:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3144:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalDefine.g:3145:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalDefine.g:3152:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3156:1: ( ( () ) )
            // InternalDefine.g:3157:1: ( () )
            {
            // InternalDefine.g:3157:1: ( () )
            // InternalDefine.g:3158:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalDefine.g:3159:2: ()
            // InternalDefine.g:3159:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalDefine.g:3167:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3171:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalDefine.g:3172:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalDefine.g:3178:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3182:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalDefine.g:3183:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalDefine.g:3183:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalDefine.g:3184:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalDefine.g:3185:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalDefine.g:3185:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalDefine.g:3194:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3198:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalDefine.g:3199:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalDefine.g:3206:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3210:1: ( ( () ) )
            // InternalDefine.g:3211:1: ( () )
            {
            // InternalDefine.g:3211:1: ( () )
            // InternalDefine.g:3212:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalDefine.g:3213:2: ()
            // InternalDefine.g:3213:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalDefine.g:3221:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3225:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalDefine.g:3226:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalDefine.g:3232:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3236:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalDefine.g:3237:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalDefine.g:3237:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalDefine.g:3238:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalDefine.g:3239:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalDefine.g:3239:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalDefine.g:3248:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3252:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalDefine.g:3253:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalDefine.g:3260:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3264:1: ( ( () ) )
            // InternalDefine.g:3265:1: ( () )
            {
            // InternalDefine.g:3265:1: ( () )
            // InternalDefine.g:3266:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 
            // InternalDefine.g:3267:2: ()
            // InternalDefine.g:3267:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalDefine.g:3275:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3279:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalDefine.g:3280:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalDefine.g:3286:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__VariableAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3290:1: ( ( ( rule__Atomic__VariableAssignment_3_1 ) ) )
            // InternalDefine.g:3291:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            {
            // InternalDefine.g:3291:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            // InternalDefine.g:3292:2: ( rule__Atomic__VariableAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 
            // InternalDefine.g:3293:2: ( rule__Atomic__VariableAssignment_3_1 )
            // InternalDefine.g:3293:3: rule__Atomic__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__FloatConstant__Group__0"
    // InternalDefine.g:3302:1: rule__FloatConstant__Group__0 : rule__FloatConstant__Group__0__Impl rule__FloatConstant__Group__1 ;
    public final void rule__FloatConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3306:1: ( rule__FloatConstant__Group__0__Impl rule__FloatConstant__Group__1 )
            // InternalDefine.g:3307:2: rule__FloatConstant__Group__0__Impl rule__FloatConstant__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FloatConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group__1();

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
    // $ANTLR end "rule__FloatConstant__Group__0"


    // $ANTLR start "rule__FloatConstant__Group__0__Impl"
    // InternalDefine.g:3314:1: rule__FloatConstant__Group__0__Impl : ( () ) ;
    public final void rule__FloatConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3318:1: ( ( () ) )
            // InternalDefine.g:3319:1: ( () )
            {
            // InternalDefine.g:3319:1: ( () )
            // InternalDefine.g:3320:2: ()
            {
             before(grammarAccess.getFloatConstantAccess().getEFloatAction_0()); 
            // InternalDefine.g:3321:2: ()
            // InternalDefine.g:3321:3: 
            {
            }

             after(grammarAccess.getFloatConstantAccess().getEFloatAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatConstant__Group__0__Impl"


    // $ANTLR start "rule__FloatConstant__Group__1"
    // InternalDefine.g:3329:1: rule__FloatConstant__Group__1 : rule__FloatConstant__Group__1__Impl ;
    public final void rule__FloatConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3333:1: ( rule__FloatConstant__Group__1__Impl )
            // InternalDefine.g:3334:2: rule__FloatConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group__1__Impl();

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
    // $ANTLR end "rule__FloatConstant__Group__1"


    // $ANTLR start "rule__FloatConstant__Group__1__Impl"
    // InternalDefine.g:3340:1: rule__FloatConstant__Group__1__Impl : ( ( rule__FloatConstant__Alternatives_1 ) ) ;
    public final void rule__FloatConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3344:1: ( ( ( rule__FloatConstant__Alternatives_1 ) ) )
            // InternalDefine.g:3345:1: ( ( rule__FloatConstant__Alternatives_1 ) )
            {
            // InternalDefine.g:3345:1: ( ( rule__FloatConstant__Alternatives_1 ) )
            // InternalDefine.g:3346:2: ( rule__FloatConstant__Alternatives_1 )
            {
             before(grammarAccess.getFloatConstantAccess().getAlternatives_1()); 
            // InternalDefine.g:3347:2: ( rule__FloatConstant__Alternatives_1 )
            // InternalDefine.g:3347:3: rule__FloatConstant__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__FloatConstant__Group__1__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_0__0"
    // InternalDefine.g:3356:1: rule__FloatConstant__Group_1_0__0 : rule__FloatConstant__Group_1_0__0__Impl rule__FloatConstant__Group_1_0__1 ;
    public final void rule__FloatConstant__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3360:1: ( rule__FloatConstant__Group_1_0__0__Impl rule__FloatConstant__Group_1_0__1 )
            // InternalDefine.g:3361:2: rule__FloatConstant__Group_1_0__0__Impl rule__FloatConstant__Group_1_0__1
            {
            pushFollow(FOLLOW_37);
            rule__FloatConstant__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_0__1();

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
    // $ANTLR end "rule__FloatConstant__Group_1_0__0"


    // $ANTLR start "rule__FloatConstant__Group_1_0__0__Impl"
    // InternalDefine.g:3368:1: rule__FloatConstant__Group_1_0__0__Impl : ( ( rule__FloatConstant__ValueAssignment_1_0_0 ) ) ;
    public final void rule__FloatConstant__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3372:1: ( ( ( rule__FloatConstant__ValueAssignment_1_0_0 ) ) )
            // InternalDefine.g:3373:1: ( ( rule__FloatConstant__ValueAssignment_1_0_0 ) )
            {
            // InternalDefine.g:3373:1: ( ( rule__FloatConstant__ValueAssignment_1_0_0 ) )
            // InternalDefine.g:3374:2: ( rule__FloatConstant__ValueAssignment_1_0_0 )
            {
             before(grammarAccess.getFloatConstantAccess().getValueAssignment_1_0_0()); 
            // InternalDefine.g:3375:2: ( rule__FloatConstant__ValueAssignment_1_0_0 )
            // InternalDefine.g:3375:3: rule__FloatConstant__ValueAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__ValueAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantAccess().getValueAssignment_1_0_0()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_0__0__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_0__1"
    // InternalDefine.g:3383:1: rule__FloatConstant__Group_1_0__1 : rule__FloatConstant__Group_1_0__1__Impl rule__FloatConstant__Group_1_0__2 ;
    public final void rule__FloatConstant__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3387:1: ( rule__FloatConstant__Group_1_0__1__Impl rule__FloatConstant__Group_1_0__2 )
            // InternalDefine.g:3388:2: rule__FloatConstant__Group_1_0__1__Impl rule__FloatConstant__Group_1_0__2
            {
            pushFollow(FOLLOW_34);
            rule__FloatConstant__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_0__2();

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
    // $ANTLR end "rule__FloatConstant__Group_1_0__1"


    // $ANTLR start "rule__FloatConstant__Group_1_0__1__Impl"
    // InternalDefine.g:3395:1: rule__FloatConstant__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__FloatConstant__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3399:1: ( ( '.' ) )
            // InternalDefine.g:3400:1: ( '.' )
            {
            // InternalDefine.g:3400:1: ( '.' )
            // InternalDefine.g:3401:2: '.'
            {
             before(grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_0_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_0_1()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_0__1__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_0__2"
    // InternalDefine.g:3410:1: rule__FloatConstant__Group_1_0__2 : rule__FloatConstant__Group_1_0__2__Impl ;
    public final void rule__FloatConstant__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3414:1: ( rule__FloatConstant__Group_1_0__2__Impl )
            // InternalDefine.g:3415:2: rule__FloatConstant__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__FloatConstant__Group_1_0__2"


    // $ANTLR start "rule__FloatConstant__Group_1_0__2__Impl"
    // InternalDefine.g:3421:1: rule__FloatConstant__Group_1_0__2__Impl : ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 ) ) ;
    public final void rule__FloatConstant__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3425:1: ( ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 ) ) )
            // InternalDefine.g:3426:1: ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 ) )
            {
            // InternalDefine.g:3426:1: ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 ) )
            // InternalDefine.g:3427:2: ( rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 )
            {
             before(grammarAccess.getFloatConstantAccess().getValueOfDecimalAssignment_1_0_2()); 
            // InternalDefine.g:3428:2: ( rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 )
            // InternalDefine.g:3428:3: rule__FloatConstant__ValueOfDecimalAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__ValueOfDecimalAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantAccess().getValueOfDecimalAssignment_1_0_2()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_0__2__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_1__0"
    // InternalDefine.g:3437:1: rule__FloatConstant__Group_1_1__0 : rule__FloatConstant__Group_1_1__0__Impl rule__FloatConstant__Group_1_1__1 ;
    public final void rule__FloatConstant__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3441:1: ( rule__FloatConstant__Group_1_1__0__Impl rule__FloatConstant__Group_1_1__1 )
            // InternalDefine.g:3442:2: rule__FloatConstant__Group_1_1__0__Impl rule__FloatConstant__Group_1_1__1
            {
            pushFollow(FOLLOW_38);
            rule__FloatConstant__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_1__1();

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
    // $ANTLR end "rule__FloatConstant__Group_1_1__0"


    // $ANTLR start "rule__FloatConstant__Group_1_1__0__Impl"
    // InternalDefine.g:3449:1: rule__FloatConstant__Group_1_1__0__Impl : ( ( rule__FloatConstant__ValueAssignment_1_1_0 )? ) ;
    public final void rule__FloatConstant__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3453:1: ( ( ( rule__FloatConstant__ValueAssignment_1_1_0 )? ) )
            // InternalDefine.g:3454:1: ( ( rule__FloatConstant__ValueAssignment_1_1_0 )? )
            {
            // InternalDefine.g:3454:1: ( ( rule__FloatConstant__ValueAssignment_1_1_0 )? )
            // InternalDefine.g:3455:2: ( rule__FloatConstant__ValueAssignment_1_1_0 )?
            {
             before(grammarAccess.getFloatConstantAccess().getValueAssignment_1_1_0()); 
            // InternalDefine.g:3456:2: ( rule__FloatConstant__ValueAssignment_1_1_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDefine.g:3456:3: rule__FloatConstant__ValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatConstant__ValueAssignment_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatConstantAccess().getValueAssignment_1_1_0()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_1__0__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_1__1"
    // InternalDefine.g:3464:1: rule__FloatConstant__Group_1_1__1 : rule__FloatConstant__Group_1_1__1__Impl rule__FloatConstant__Group_1_1__2 ;
    public final void rule__FloatConstant__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3468:1: ( rule__FloatConstant__Group_1_1__1__Impl rule__FloatConstant__Group_1_1__2 )
            // InternalDefine.g:3469:2: rule__FloatConstant__Group_1_1__1__Impl rule__FloatConstant__Group_1_1__2
            {
            pushFollow(FOLLOW_34);
            rule__FloatConstant__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_1__2();

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
    // $ANTLR end "rule__FloatConstant__Group_1_1__1"


    // $ANTLR start "rule__FloatConstant__Group_1_1__1__Impl"
    // InternalDefine.g:3476:1: rule__FloatConstant__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__FloatConstant__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3480:1: ( ( '.' ) )
            // InternalDefine.g:3481:1: ( '.' )
            {
            // InternalDefine.g:3481:1: ( '.' )
            // InternalDefine.g:3482:2: '.'
            {
             before(grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_1_1()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_1__1__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_1__2"
    // InternalDefine.g:3491:1: rule__FloatConstant__Group_1_1__2 : rule__FloatConstant__Group_1_1__2__Impl ;
    public final void rule__FloatConstant__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3495:1: ( rule__FloatConstant__Group_1_1__2__Impl )
            // InternalDefine.g:3496:2: rule__FloatConstant__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__FloatConstant__Group_1_1__2"


    // $ANTLR start "rule__FloatConstant__Group_1_1__2__Impl"
    // InternalDefine.g:3502:1: rule__FloatConstant__Group_1_1__2__Impl : ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 ) ) ;
    public final void rule__FloatConstant__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3506:1: ( ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 ) ) )
            // InternalDefine.g:3507:1: ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 ) )
            {
            // InternalDefine.g:3507:1: ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 ) )
            // InternalDefine.g:3508:2: ( rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 )
            {
             before(grammarAccess.getFloatConstantAccess().getValueOfDecimalAssignment_1_1_2()); 
            // InternalDefine.g:3509:2: ( rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 )
            // InternalDefine.g:3509:3: rule__FloatConstant__ValueOfDecimalAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__ValueOfDecimalAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantAccess().getValueOfDecimalAssignment_1_1_2()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_1__2__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_2__0"
    // InternalDefine.g:3518:1: rule__FloatConstant__Group_1_2__0 : rule__FloatConstant__Group_1_2__0__Impl rule__FloatConstant__Group_1_2__1 ;
    public final void rule__FloatConstant__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3522:1: ( rule__FloatConstant__Group_1_2__0__Impl rule__FloatConstant__Group_1_2__1 )
            // InternalDefine.g:3523:2: rule__FloatConstant__Group_1_2__0__Impl rule__FloatConstant__Group_1_2__1
            {
            pushFollow(FOLLOW_37);
            rule__FloatConstant__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_2__1();

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
    // $ANTLR end "rule__FloatConstant__Group_1_2__0"


    // $ANTLR start "rule__FloatConstant__Group_1_2__0__Impl"
    // InternalDefine.g:3530:1: rule__FloatConstant__Group_1_2__0__Impl : ( ( rule__FloatConstant__ValueAssignment_1_2_0 ) ) ;
    public final void rule__FloatConstant__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3534:1: ( ( ( rule__FloatConstant__ValueAssignment_1_2_0 ) ) )
            // InternalDefine.g:3535:1: ( ( rule__FloatConstant__ValueAssignment_1_2_0 ) )
            {
            // InternalDefine.g:3535:1: ( ( rule__FloatConstant__ValueAssignment_1_2_0 ) )
            // InternalDefine.g:3536:2: ( rule__FloatConstant__ValueAssignment_1_2_0 )
            {
             before(grammarAccess.getFloatConstantAccess().getValueAssignment_1_2_0()); 
            // InternalDefine.g:3537:2: ( rule__FloatConstant__ValueAssignment_1_2_0 )
            // InternalDefine.g:3537:3: rule__FloatConstant__ValueAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__ValueAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatConstantAccess().getValueAssignment_1_2_0()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_2__0__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_2__1"
    // InternalDefine.g:3545:1: rule__FloatConstant__Group_1_2__1 : rule__FloatConstant__Group_1_2__1__Impl rule__FloatConstant__Group_1_2__2 ;
    public final void rule__FloatConstant__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3549:1: ( rule__FloatConstant__Group_1_2__1__Impl rule__FloatConstant__Group_1_2__2 )
            // InternalDefine.g:3550:2: rule__FloatConstant__Group_1_2__1__Impl rule__FloatConstant__Group_1_2__2
            {
            pushFollow(FOLLOW_34);
            rule__FloatConstant__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_2__2();

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
    // $ANTLR end "rule__FloatConstant__Group_1_2__1"


    // $ANTLR start "rule__FloatConstant__Group_1_2__1__Impl"
    // InternalDefine.g:3557:1: rule__FloatConstant__Group_1_2__1__Impl : ( '.' ) ;
    public final void rule__FloatConstant__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3561:1: ( ( '.' ) )
            // InternalDefine.g:3562:1: ( '.' )
            {
            // InternalDefine.g:3562:1: ( '.' )
            // InternalDefine.g:3563:2: '.'
            {
             before(grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_2_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_2_1()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_2__1__Impl"


    // $ANTLR start "rule__FloatConstant__Group_1_2__2"
    // InternalDefine.g:3572:1: rule__FloatConstant__Group_1_2__2 : rule__FloatConstant__Group_1_2__2__Impl ;
    public final void rule__FloatConstant__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3576:1: ( rule__FloatConstant__Group_1_2__2__Impl )
            // InternalDefine.g:3577:2: rule__FloatConstant__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatConstant__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__FloatConstant__Group_1_2__2"


    // $ANTLR start "rule__FloatConstant__Group_1_2__2__Impl"
    // InternalDefine.g:3583:1: rule__FloatConstant__Group_1_2__2__Impl : ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 )? ) ;
    public final void rule__FloatConstant__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3587:1: ( ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 )? ) )
            // InternalDefine.g:3588:1: ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 )? )
            {
            // InternalDefine.g:3588:1: ( ( rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 )? )
            // InternalDefine.g:3589:2: ( rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 )?
            {
             before(grammarAccess.getFloatConstantAccess().getValueOfDecimalAssignment_1_2_2()); 
            // InternalDefine.g:3590:2: ( rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDefine.g:3590:3: rule__FloatConstant__ValueOfDecimalAssignment_1_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatConstant__ValueOfDecimalAssignment_1_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatConstantAccess().getValueOfDecimalAssignment_1_2_2()); 

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
    // $ANTLR end "rule__FloatConstant__Group_1_2__2__Impl"


    // $ANTLR start "rule__DirectionBlock__UnorderedGroup"
    // InternalDefine.g:3599:1: rule__DirectionBlock__UnorderedGroup : rule__DirectionBlock__UnorderedGroup__0 {...}?;
    public final void rule__DirectionBlock__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
        	
        try {
            // InternalDefine.g:3604:1: ( rule__DirectionBlock__UnorderedGroup__0 {...}?)
            // InternalDefine.g:3605:2: rule__DirectionBlock__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__DirectionBlock__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionBlock__UnorderedGroup"


    // $ANTLR start "rule__DirectionBlock__UnorderedGroup__Impl"
    // InternalDefine.g:3613:1: rule__DirectionBlock__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) ) ;
    public final void rule__DirectionBlock__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDefine.g:3618:1: ( ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) ) )
            // InternalDefine.g:3619:3: ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) )
            {
            // InternalDefine.g:3619:3: ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                alt26=2;
            }
            else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                alt26=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDefine.g:3620:3: ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) )
                    {
                    // InternalDefine.g:3620:3: ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) )
                    // InternalDefine.g:3621:4: {...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalDefine.g:3621:108: ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) )
                    // InternalDefine.g:3622:5: ( ( rule__DirectionBlock__InputAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDefine.g:3628:5: ( ( rule__DirectionBlock__InputAssignment_0 ) )
                    // InternalDefine.g:3629:6: ( rule__DirectionBlock__InputAssignment_0 )
                    {
                     before(grammarAccess.getDirectionBlockAccess().getInputAssignment_0()); 
                    // InternalDefine.g:3630:6: ( rule__DirectionBlock__InputAssignment_0 )
                    // InternalDefine.g:3630:7: rule__DirectionBlock__InputAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectionBlock__InputAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionBlockAccess().getInputAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:3635:3: ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) )
                    {
                    // InternalDefine.g:3635:3: ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) )
                    // InternalDefine.g:3636:4: {...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalDefine.g:3636:108: ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) )
                    // InternalDefine.g:3637:5: ( ( rule__DirectionBlock__InoutAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDefine.g:3643:5: ( ( rule__DirectionBlock__InoutAssignment_1 ) )
                    // InternalDefine.g:3644:6: ( rule__DirectionBlock__InoutAssignment_1 )
                    {
                     before(grammarAccess.getDirectionBlockAccess().getInoutAssignment_1()); 
                    // InternalDefine.g:3645:6: ( rule__DirectionBlock__InoutAssignment_1 )
                    // InternalDefine.g:3645:7: rule__DirectionBlock__InoutAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectionBlock__InoutAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionBlockAccess().getInoutAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:3650:3: ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) )
                    {
                    // InternalDefine.g:3650:3: ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) )
                    // InternalDefine.g:3651:4: {...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalDefine.g:3651:108: ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) )
                    // InternalDefine.g:3652:5: ( ( rule__DirectionBlock__OutputAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDefine.g:3658:5: ( ( rule__DirectionBlock__OutputAssignment_2 ) )
                    // InternalDefine.g:3659:6: ( rule__DirectionBlock__OutputAssignment_2 )
                    {
                     before(grammarAccess.getDirectionBlockAccess().getOutputAssignment_2()); 
                    // InternalDefine.g:3660:6: ( rule__DirectionBlock__OutputAssignment_2 )
                    // InternalDefine.g:3660:7: rule__DirectionBlock__OutputAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectionBlock__OutputAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionBlockAccess().getOutputAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionBlock__UnorderedGroup__Impl"


    // $ANTLR start "rule__DirectionBlock__UnorderedGroup__0"
    // InternalDefine.g:3673:1: rule__DirectionBlock__UnorderedGroup__0 : rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__1 )? ;
    public final void rule__DirectionBlock__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3677:1: ( rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__1 )? )
            // InternalDefine.g:3678:2: rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_39);
            rule__DirectionBlock__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDefine.g:3679:2: ( rule__DirectionBlock__UnorderedGroup__1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDefine.g:3679:2: rule__DirectionBlock__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectionBlock__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__DirectionBlock__UnorderedGroup__0"


    // $ANTLR start "rule__DirectionBlock__UnorderedGroup__1"
    // InternalDefine.g:3685:1: rule__DirectionBlock__UnorderedGroup__1 : rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__2 )? ;
    public final void rule__DirectionBlock__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3689:1: ( rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__2 )? )
            // InternalDefine.g:3690:2: rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_39);
            rule__DirectionBlock__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDefine.g:3691:2: ( rule__DirectionBlock__UnorderedGroup__2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDefine.g:3691:2: rule__DirectionBlock__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectionBlock__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__DirectionBlock__UnorderedGroup__1"


    // $ANTLR start "rule__DirectionBlock__UnorderedGroup__2"
    // InternalDefine.g:3697:1: rule__DirectionBlock__UnorderedGroup__2 : rule__DirectionBlock__UnorderedGroup__Impl ;
    public final void rule__DirectionBlock__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3701:1: ( rule__DirectionBlock__UnorderedGroup__Impl )
            // InternalDefine.g:3702:2: rule__DirectionBlock__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectionBlock__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__DirectionBlock__UnorderedGroup__2"


    // $ANTLR start "rule__DefineBlock__DirectionAssignment_2"
    // InternalDefine.g:3709:1: rule__DefineBlock__DirectionAssignment_2 : ( ruleDirectionBlock ) ;
    public final void rule__DefineBlock__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3713:1: ( ( ruleDirectionBlock ) )
            // InternalDefine.g:3714:2: ( ruleDirectionBlock )
            {
            // InternalDefine.g:3714:2: ( ruleDirectionBlock )
            // InternalDefine.g:3715:3: ruleDirectionBlock
            {
             before(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectionBlock();

            state._fsp--;

             after(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DefineBlock__DirectionAssignment_2"


    // $ANTLR start "rule__DirectionBlock__InputAssignment_0"
    // InternalDefine.g:3724:1: rule__DirectionBlock__InputAssignment_0 : ( ruleInput ) ;
    public final void rule__DirectionBlock__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3728:1: ( ( ruleInput ) )
            // InternalDefine.g:3729:2: ( ruleInput )
            {
            // InternalDefine.g:3729:2: ( ruleInput )
            // InternalDefine.g:3730:3: ruleInput
            {
             before(grammarAccess.getDirectionBlockAccess().getInputInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getDirectionBlockAccess().getInputInputParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DirectionBlock__InputAssignment_0"


    // $ANTLR start "rule__DirectionBlock__InoutAssignment_1"
    // InternalDefine.g:3739:1: rule__DirectionBlock__InoutAssignment_1 : ( ruleInout ) ;
    public final void rule__DirectionBlock__InoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3743:1: ( ( ruleInout ) )
            // InternalDefine.g:3744:2: ( ruleInout )
            {
            // InternalDefine.g:3744:2: ( ruleInout )
            // InternalDefine.g:3745:3: ruleInout
            {
             before(grammarAccess.getDirectionBlockAccess().getInoutInoutParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getDirectionBlockAccess().getInoutInoutParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DirectionBlock__InoutAssignment_1"


    // $ANTLR start "rule__DirectionBlock__OutputAssignment_2"
    // InternalDefine.g:3754:1: rule__DirectionBlock__OutputAssignment_2 : ( ruleOutput ) ;
    public final void rule__DirectionBlock__OutputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3758:1: ( ( ruleOutput ) )
            // InternalDefine.g:3759:2: ( ruleOutput )
            {
            // InternalDefine.g:3759:2: ( ruleOutput )
            // InternalDefine.g:3760:3: ruleOutput
            {
             before(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DirectionBlock__OutputAssignment_2"


    // $ANTLR start "rule__Input__InputVariablesAssignment_3"
    // InternalDefine.g:3769:1: rule__Input__InputVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Input__InputVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3773:1: ( ( ruleVariable ) )
            // InternalDefine.g:3774:2: ( ruleVariable )
            {
            // InternalDefine.g:3774:2: ( ruleVariable )
            // InternalDefine.g:3775:3: ruleVariable
            {
             before(grammarAccess.getInputAccess().getInputVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getInputAccess().getInputVariablesVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Input__InputVariablesAssignment_3"


    // $ANTLR start "rule__Output__OutputVariablesAssignment_3"
    // InternalDefine.g:3784:1: rule__Output__OutputVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Output__OutputVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3788:1: ( ( ruleVariable ) )
            // InternalDefine.g:3789:2: ( ruleVariable )
            {
            // InternalDefine.g:3789:2: ( ruleVariable )
            // InternalDefine.g:3790:3: ruleVariable
            {
             before(grammarAccess.getOutputAccess().getOutputVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getOutputVariablesVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Output__OutputVariablesAssignment_3"


    // $ANTLR start "rule__Inout__InoutVariablesAssignment_3"
    // InternalDefine.g:3799:1: rule__Inout__InoutVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Inout__InoutVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3803:1: ( ( ruleVariable ) )
            // InternalDefine.g:3804:2: ( ruleVariable )
            {
            // InternalDefine.g:3804:2: ( ruleVariable )
            // InternalDefine.g:3805:3: ruleVariable
            {
             before(grammarAccess.getInoutAccess().getInoutVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getInoutAccess().getInoutVariablesVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Inout__InoutVariablesAssignment_3"


    // $ANTLR start "rule__Variable__VariantKeywordAssignment_0_1"
    // InternalDefine.g:3814:1: rule__Variable__VariantKeywordAssignment_0_1 : ( ( 'variant' ) ) ;
    public final void rule__Variable__VariantKeywordAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3818:1: ( ( ( 'variant' ) ) )
            // InternalDefine.g:3819:2: ( ( 'variant' ) )
            {
            // InternalDefine.g:3819:2: ( ( 'variant' ) )
            // InternalDefine.g:3820:3: ( 'variant' )
            {
             before(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_0_1_0()); 
            // InternalDefine.g:3821:3: ( 'variant' )
            // InternalDefine.g:3822:4: 'variant'
            {
             before(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_0_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_0_1_0()); 

            }

             after(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Variable__VariantKeywordAssignment_0_1"


    // $ANTLR start "rule__Variable__VariableTypeAssignment_0_2"
    // InternalDefine.g:3833:1: rule__Variable__VariableTypeAssignment_0_2 : ( ruleTypes ) ;
    public final void rule__Variable__VariableTypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3837:1: ( ( ruleTypes ) )
            // InternalDefine.g:3838:2: ( ruleTypes )
            {
            // InternalDefine.g:3838:2: ( ruleTypes )
            // InternalDefine.g:3839:3: ruleTypes
            {
             before(grammarAccess.getVariableAccess().getVariableTypeTypesParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableTypeTypesParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Variable__VariableTypeAssignment_0_2"


    // $ANTLR start "rule__Variable__VariableNameAssignment_0_3"
    // InternalDefine.g:3848:1: rule__Variable__VariableNameAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__Variable__VariableNameAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3852:1: ( ( RULE_ID ) )
            // InternalDefine.g:3853:2: ( RULE_ID )
            {
            // InternalDefine.g:3853:2: ( RULE_ID )
            // InternalDefine.g:3854:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getVariableNameIDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableNameIDTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Variable__VariableNameAssignment_0_3"


    // $ANTLR start "rule__Variable__ExpressionAssignment_0_4_1"
    // InternalDefine.g:3863:1: rule__Variable__ExpressionAssignment_0_4_1 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3867:1: ( ( ruleExpression ) )
            // InternalDefine.g:3868:2: ( ruleExpression )
            {
            // InternalDefine.g:3868:2: ( ruleExpression )
            // InternalDefine.g:3869:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_0_4_1_0()); 

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
    // $ANTLR end "rule__Variable__ExpressionAssignment_0_4_1"


    // $ANTLR start "rule__Variable__RangeAssignment_0_4_2_1"
    // InternalDefine.g:3878:1: rule__Variable__RangeAssignment_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__Variable__RangeAssignment_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3882:1: ( ( ruleExpression ) )
            // InternalDefine.g:3883:2: ( ruleExpression )
            {
            // InternalDefine.g:3883:2: ( ruleExpression )
            // InternalDefine.g:3884:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getRangeExpressionParserRuleCall_0_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getRangeExpressionParserRuleCall_0_4_2_1_0()); 

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
    // $ANTLR end "rule__Variable__RangeAssignment_0_4_2_1"


    // $ANTLR start "rule__Variable__UdtAssignment_1"
    // InternalDefine.g:3893:1: rule__Variable__UdtAssignment_1 : ( ruleUdt ) ;
    public final void rule__Variable__UdtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3897:1: ( ( ruleUdt ) )
            // InternalDefine.g:3898:2: ( ruleUdt )
            {
            // InternalDefine.g:3898:2: ( ruleUdt )
            // InternalDefine.g:3899:3: ruleUdt
            {
             before(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUdt();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__UdtAssignment_1"


    // $ANTLR start "rule__Udt__UdtNameAssignment_1"
    // InternalDefine.g:3908:1: rule__Udt__UdtNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Udt__UdtNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3912:1: ( ( RULE_ID ) )
            // InternalDefine.g:3913:2: ( RULE_ID )
            {
            // InternalDefine.g:3913:2: ( RULE_ID )
            // InternalDefine.g:3914:3: RULE_ID
            {
             before(grammarAccess.getUdtAccess().getUdtNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUdtAccess().getUdtNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Udt__UdtNameAssignment_1"


    // $ANTLR start "rule__Udt__UdtTypesAssignment_3"
    // InternalDefine.g:3923:1: rule__Udt__UdtTypesAssignment_3 : ( ruleUdtType ) ;
    public final void rule__Udt__UdtTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3927:1: ( ( ruleUdtType ) )
            // InternalDefine.g:3928:2: ( ruleUdtType )
            {
            // InternalDefine.g:3928:2: ( ruleUdtType )
            // InternalDefine.g:3929:3: ruleUdtType
            {
             before(grammarAccess.getUdtAccess().getUdtTypesUdtTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUdtType();

            state._fsp--;

             after(grammarAccess.getUdtAccess().getUdtTypesUdtTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Udt__UdtTypesAssignment_3"


    // $ANTLR start "rule__Udt__UdtVariablesAssignment_6"
    // InternalDefine.g:3938:1: rule__Udt__UdtVariablesAssignment_6 : ( ruleVariable ) ;
    public final void rule__Udt__UdtVariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3942:1: ( ( ruleVariable ) )
            // InternalDefine.g:3943:2: ( ruleVariable )
            {
            // InternalDefine.g:3943:2: ( ruleVariable )
            // InternalDefine.g:3944:3: ruleVariable
            {
             before(grammarAccess.getUdtAccess().getUdtVariablesVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getUdtAccess().getUdtVariablesVariableParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Udt__UdtVariablesAssignment_6"


    // $ANTLR start "rule__UdtType__UdtTypeNameAssignment"
    // InternalDefine.g:3953:1: rule__UdtType__UdtTypeNameAssignment : ( RULE_ID ) ;
    public final void rule__UdtType__UdtTypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3957:1: ( ( RULE_ID ) )
            // InternalDefine.g:3958:2: ( RULE_ID )
            {
            // InternalDefine.g:3958:2: ( RULE_ID )
            // InternalDefine.g:3959:3: RULE_ID
            {
             before(grammarAccess.getUdtTypeAccess().getUdtTypeNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUdtTypeAccess().getUdtTypeNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__UdtType__UdtTypeNameAssignment"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalDefine.g:3968:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3972:1: ( ( ruleAnd ) )
            // InternalDefine.g:3973:2: ( ruleAnd )
            {
            // InternalDefine.g:3973:2: ( ruleAnd )
            // InternalDefine.g:3974:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalDefine.g:3983:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:3987:1: ( ( ruleEquality ) )
            // InternalDefine.g:3988:2: ( ruleEquality )
            {
            // InternalDefine.g:3988:2: ( ruleEquality )
            // InternalDefine.g:3989:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalDefine.g:3998:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4002:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalDefine.g:4003:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalDefine.g:4003:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalDefine.g:4004:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalDefine.g:4005:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalDefine.g:4005:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalDefine.g:4013:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4017:1: ( ( ruleComparison ) )
            // InternalDefine.g:4018:2: ( ruleComparison )
            {
            // InternalDefine.g:4018:2: ( ruleComparison )
            // InternalDefine.g:4019:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalDefine.g:4028:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4032:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalDefine.g:4033:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalDefine.g:4033:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalDefine.g:4034:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalDefine.g:4035:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalDefine.g:4035:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalDefine.g:4043:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4047:1: ( ( rulePlusOrMinus ) )
            // InternalDefine.g:4048:2: ( rulePlusOrMinus )
            {
            // InternalDefine.g:4048:2: ( rulePlusOrMinus )
            // InternalDefine.g:4049:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalDefine.g:4058:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4062:1: ( ( ruleMulOrDiv ) )
            // InternalDefine.g:4063:2: ( ruleMulOrDiv )
            {
            // InternalDefine.g:4063:2: ( ruleMulOrDiv )
            // InternalDefine.g:4064:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // InternalDefine.g:4073:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4077:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalDefine.g:4078:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalDefine.g:4078:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalDefine.g:4079:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalDefine.g:4080:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalDefine.g:4080:4: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // InternalDefine.g:4088:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4092:1: ( ( rulePrimary ) )
            // InternalDefine.g:4093:2: ( rulePrimary )
            {
            // InternalDefine.g:4093:2: ( rulePrimary )
            // InternalDefine.g:4094:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalDefine.g:4103:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4107:1: ( ( rulePrimary ) )
            // InternalDefine.g:4108:2: ( rulePrimary )
            {
            // InternalDefine.g:4108:2: ( rulePrimary )
            // InternalDefine.g:4109:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalDefine.g:4118:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4122:1: ( ( RULE_INT ) )
            // InternalDefine.g:4123:2: ( RULE_INT )
            {
            // InternalDefine.g:4123:2: ( RULE_INT )
            // InternalDefine.g:4124:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalDefine.g:4133:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4137:1: ( ( RULE_STRING ) )
            // InternalDefine.g:4138:2: ( RULE_STRING )
            {
            // InternalDefine.g:4138:2: ( RULE_STRING )
            // InternalDefine.g:4139:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalDefine.g:4148:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4152:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalDefine.g:4153:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalDefine.g:4153:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalDefine.g:4154:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalDefine.g:4155:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalDefine.g:4155:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_3_1"
    // InternalDefine.g:4163:1: rule__Atomic__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4167:1: ( ( ( RULE_ID ) ) )
            // InternalDefine.g:4168:2: ( ( RULE_ID ) )
            {
            // InternalDefine.g:4168:2: ( ( RULE_ID ) )
            // InternalDefine.g:4169:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
            // InternalDefine.g:4170:3: ( RULE_ID )
            // InternalDefine.g:4171:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__VariableAssignment_3_1"


    // $ANTLR start "rule__FloatConstant__ValueAssignment_1_0_0"
    // InternalDefine.g:4182:1: rule__FloatConstant__ValueAssignment_1_0_0 : ( RULE_INT ) ;
    public final void rule__FloatConstant__ValueAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4186:1: ( ( RULE_INT ) )
            // InternalDefine.g:4187:2: ( RULE_INT )
            {
            // InternalDefine.g:4187:2: ( RULE_INT )
            // InternalDefine.g:4188:3: RULE_INT
            {
             before(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__FloatConstant__ValueAssignment_1_0_0"


    // $ANTLR start "rule__FloatConstant__ValueOfDecimalAssignment_1_0_2"
    // InternalDefine.g:4197:1: rule__FloatConstant__ValueOfDecimalAssignment_1_0_2 : ( RULE_INT ) ;
    public final void rule__FloatConstant__ValueOfDecimalAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4201:1: ( ( RULE_INT ) )
            // InternalDefine.g:4202:2: ( RULE_INT )
            {
            // InternalDefine.g:4202:2: ( RULE_INT )
            // InternalDefine.g:4203:3: RULE_INT
            {
             before(grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__FloatConstant__ValueOfDecimalAssignment_1_0_2"


    // $ANTLR start "rule__FloatConstant__ValueAssignment_1_1_0"
    // InternalDefine.g:4212:1: rule__FloatConstant__ValueAssignment_1_1_0 : ( RULE_INT ) ;
    public final void rule__FloatConstant__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4216:1: ( ( RULE_INT ) )
            // InternalDefine.g:4217:2: ( RULE_INT )
            {
            // InternalDefine.g:4217:2: ( RULE_INT )
            // InternalDefine.g:4218:3: RULE_INT
            {
             before(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__FloatConstant__ValueAssignment_1_1_0"


    // $ANTLR start "rule__FloatConstant__ValueOfDecimalAssignment_1_1_2"
    // InternalDefine.g:4227:1: rule__FloatConstant__ValueOfDecimalAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__FloatConstant__ValueOfDecimalAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4231:1: ( ( RULE_INT ) )
            // InternalDefine.g:4232:2: ( RULE_INT )
            {
            // InternalDefine.g:4232:2: ( RULE_INT )
            // InternalDefine.g:4233:3: RULE_INT
            {
             before(grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__FloatConstant__ValueOfDecimalAssignment_1_1_2"


    // $ANTLR start "rule__FloatConstant__ValueAssignment_1_2_0"
    // InternalDefine.g:4242:1: rule__FloatConstant__ValueAssignment_1_2_0 : ( RULE_INT ) ;
    public final void rule__FloatConstant__ValueAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4246:1: ( ( RULE_INT ) )
            // InternalDefine.g:4247:2: ( RULE_INT )
            {
            // InternalDefine.g:4247:2: ( RULE_INT )
            // InternalDefine.g:4248:3: RULE_INT
            {
             before(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_2_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__FloatConstant__ValueAssignment_1_2_0"


    // $ANTLR start "rule__FloatConstant__ValueOfDecimalAssignment_1_2_2"
    // InternalDefine.g:4257:1: rule__FloatConstant__ValueOfDecimalAssignment_1_2_2 : ( RULE_INT ) ;
    public final void rule__FloatConstant__ValueOfDecimalAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:4261:1: ( ( RULE_INT ) )
            // InternalDefine.g:4262:2: ( RULE_INT )
            {
            // InternalDefine.g:4262:2: ( RULE_INT )
            // InternalDefine.g:4263:3: RULE_INT
            {
             before(grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__FloatConstant__ValueOfDecimalAssignment_1_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000019000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000207904000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000207900000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000207800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000180200180070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000207900800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000019000002L});

}
