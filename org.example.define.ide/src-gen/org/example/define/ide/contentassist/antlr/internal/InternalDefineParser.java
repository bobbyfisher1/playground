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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'int'", "'bool'", "'float'", "'true'", "'false'", "'define'", "'{'", "'}'", "'input'", "'['", "']'", "'inout'", "'output'", "'='", "'+/-'", "'('", "')'", "'udt'", "'variant'", "','"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleInout"
    // InternalDefine.g:128:1: entryRuleInout : ruleInout EOF ;
    public final void entryRuleInout() throws RecognitionException {
        try {
            // InternalDefine.g:129:1: ( ruleInout EOF )
            // InternalDefine.g:130:1: ruleInout EOF
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
    // InternalDefine.g:137:1: ruleInout : ( ( rule__Inout__Group__0 ) ) ;
    public final void ruleInout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:141:2: ( ( ( rule__Inout__Group__0 ) ) )
            // InternalDefine.g:142:2: ( ( rule__Inout__Group__0 ) )
            {
            // InternalDefine.g:142:2: ( ( rule__Inout__Group__0 ) )
            // InternalDefine.g:143:3: ( rule__Inout__Group__0 )
            {
             before(grammarAccess.getInoutAccess().getGroup()); 
            // InternalDefine.g:144:3: ( rule__Inout__Group__0 )
            // InternalDefine.g:144:4: rule__Inout__Group__0
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


    // $ANTLR start "entryRuleOutput"
    // InternalDefine.g:153:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalDefine.g:154:1: ( ruleOutput EOF )
            // InternalDefine.g:155:1: ruleOutput EOF
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
    // InternalDefine.g:162:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:166:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalDefine.g:167:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalDefine.g:167:2: ( ( rule__Output__Group__0 ) )
            // InternalDefine.g:168:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalDefine.g:169:3: ( rule__Output__Group__0 )
            // InternalDefine.g:169:4: rule__Output__Group__0
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


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalDefine.g:203:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // InternalDefine.g:204:1: ( ruleVariableDefinition EOF )
            // InternalDefine.g:205:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalDefine.g:212:1: ruleVariableDefinition : ( ( rule__VariableDefinition__Group__0 ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:216:2: ( ( ( rule__VariableDefinition__Group__0 ) ) )
            // InternalDefine.g:217:2: ( ( rule__VariableDefinition__Group__0 ) )
            {
            // InternalDefine.g:217:2: ( ( rule__VariableDefinition__Group__0 ) )
            // InternalDefine.g:218:3: ( rule__VariableDefinition__Group__0 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getGroup()); 
            // InternalDefine.g:219:3: ( rule__VariableDefinition__Group__0 )
            // InternalDefine.g:219:4: rule__VariableDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariant"
    // InternalDefine.g:228:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // InternalDefine.g:229:1: ( ruleVariant EOF )
            // InternalDefine.g:230:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalDefine.g:237:1: ruleVariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:241:2: ( ( ( rule__Variant__Group__0 ) ) )
            // InternalDefine.g:242:2: ( ( rule__Variant__Group__0 ) )
            {
            // InternalDefine.g:242:2: ( ( rule__Variant__Group__0 ) )
            // InternalDefine.g:243:3: ( rule__Variant__Group__0 )
            {
             before(grammarAccess.getVariantAccess().getGroup()); 
            // InternalDefine.g:244:3: ( rule__Variant__Group__0 )
            // InternalDefine.g:244:4: rule__Variant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getGroup()); 

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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleUdt"
    // InternalDefine.g:253:1: entryRuleUdt : ruleUdt EOF ;
    public final void entryRuleUdt() throws RecognitionException {
        try {
            // InternalDefine.g:254:1: ( ruleUdt EOF )
            // InternalDefine.g:255:1: ruleUdt EOF
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
    // InternalDefine.g:262:1: ruleUdt : ( ( rule__Udt__Group__0 ) ) ;
    public final void ruleUdt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:266:2: ( ( ( rule__Udt__Group__0 ) ) )
            // InternalDefine.g:267:2: ( ( rule__Udt__Group__0 ) )
            {
            // InternalDefine.g:267:2: ( ( rule__Udt__Group__0 ) )
            // InternalDefine.g:268:3: ( rule__Udt__Group__0 )
            {
             before(grammarAccess.getUdtAccess().getGroup()); 
            // InternalDefine.g:269:3: ( rule__Udt__Group__0 )
            // InternalDefine.g:269:4: rule__Udt__Group__0
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
    // InternalDefine.g:278:1: entryRuleUdtType : ruleUdtType EOF ;
    public final void entryRuleUdtType() throws RecognitionException {
        try {
            // InternalDefine.g:279:1: ( ruleUdtType EOF )
            // InternalDefine.g:280:1: ruleUdtType EOF
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
    // InternalDefine.g:287:1: ruleUdtType : ( ( rule__UdtType__UdtTypeNameAssignment ) ) ;
    public final void ruleUdtType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:291:2: ( ( ( rule__UdtType__UdtTypeNameAssignment ) ) )
            // InternalDefine.g:292:2: ( ( rule__UdtType__UdtTypeNameAssignment ) )
            {
            // InternalDefine.g:292:2: ( ( rule__UdtType__UdtTypeNameAssignment ) )
            // InternalDefine.g:293:3: ( rule__UdtType__UdtTypeNameAssignment )
            {
             before(grammarAccess.getUdtTypeAccess().getUdtTypeNameAssignment()); 
            // InternalDefine.g:294:3: ( rule__UdtType__UdtTypeNameAssignment )
            // InternalDefine.g:294:4: rule__UdtType__UdtTypeNameAssignment
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


    // $ANTLR start "entryRuleVariableType"
    // InternalDefine.g:303:1: entryRuleVariableType : ruleVariableType EOF ;
    public final void entryRuleVariableType() throws RecognitionException {
        try {
            // InternalDefine.g:304:1: ( ruleVariableType EOF )
            // InternalDefine.g:305:1: ruleVariableType EOF
            {
             before(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableTypeRule()); 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalDefine.g:312:1: ruleVariableType : ( ( rule__VariableType__Group__0 ) ) ;
    public final void ruleVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:316:2: ( ( ( rule__VariableType__Group__0 ) ) )
            // InternalDefine.g:317:2: ( ( rule__VariableType__Group__0 ) )
            {
            // InternalDefine.g:317:2: ( ( rule__VariableType__Group__0 ) )
            // InternalDefine.g:318:3: ( rule__VariableType__Group__0 )
            {
             before(grammarAccess.getVariableTypeAccess().getGroup()); 
            // InternalDefine.g:319:3: ( rule__VariableType__Group__0 )
            // InternalDefine.g:319:4: rule__VariableType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleExpression"
    // InternalDefine.g:328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDefine.g:329:1: ( ruleExpression EOF )
            // InternalDefine.g:330:1: ruleExpression EOF
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
    // InternalDefine.g:337:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:341:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalDefine.g:342:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalDefine.g:342:2: ( ( rule__Expression__Alternatives ) )
            // InternalDefine.g:343:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalDefine.g:344:3: ( rule__Expression__Alternatives )
            // InternalDefine.g:344:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalDefine.g:352:1: rule__Variable__Alternatives : ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__UdtAssignment_2 ) ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:356:1: ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__UdtAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID||LA1_2==11||LA1_2==25||LA1_2==31) ) {
                    alt1=1;
                }
                else if ( (LA1_2==27) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDefine.g:357:2: ( ( rule__Variable__Group_0__0 ) )
                    {
                    // InternalDefine.g:357:2: ( ( rule__Variable__Group_0__0 ) )
                    // InternalDefine.g:358:3: ( rule__Variable__Group_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0()); 
                    // InternalDefine.g:359:3: ( rule__Variable__Group_0__0 )
                    // InternalDefine.g:359:4: rule__Variable__Group_0__0
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
                    // InternalDefine.g:363:2: ( ( rule__Variable__Group_1__0 ) )
                    {
                    // InternalDefine.g:363:2: ( ( rule__Variable__Group_1__0 ) )
                    // InternalDefine.g:364:3: ( rule__Variable__Group_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1()); 
                    // InternalDefine.g:365:3: ( rule__Variable__Group_1__0 )
                    // InternalDefine.g:365:4: rule__Variable__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:369:2: ( ( rule__Variable__UdtAssignment_2 ) )
                    {
                    // InternalDefine.g:369:2: ( ( rule__Variable__UdtAssignment_2 ) )
                    // InternalDefine.g:370:3: ( rule__Variable__UdtAssignment_2 )
                    {
                     before(grammarAccess.getVariableAccess().getUdtAssignment_2()); 
                    // InternalDefine.g:371:3: ( rule__Variable__UdtAssignment_2 )
                    // InternalDefine.g:371:4: rule__Variable__UdtAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__UdtAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getUdtAssignment_2()); 

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


    // $ANTLR start "rule__VariableDefinition__Alternatives_2"
    // InternalDefine.g:379:1: rule__VariableDefinition__Alternatives_2 : ( ( ';' ) | ( ( rule__VariableDefinition__NextVariableAssignment_2_1 ) ) );
    public final void rule__VariableDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:383:1: ( ( ';' ) | ( ( rule__VariableDefinition__NextVariableAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDefine.g:384:2: ( ';' )
                    {
                    // InternalDefine.g:384:2: ( ';' )
                    // InternalDefine.g:385:3: ';'
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:390:2: ( ( rule__VariableDefinition__NextVariableAssignment_2_1 ) )
                    {
                    // InternalDefine.g:390:2: ( ( rule__VariableDefinition__NextVariableAssignment_2_1 ) )
                    // InternalDefine.g:391:3: ( rule__VariableDefinition__NextVariableAssignment_2_1 )
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getNextVariableAssignment_2_1()); 
                    // InternalDefine.g:392:3: ( rule__VariableDefinition__NextVariableAssignment_2_1 )
                    // InternalDefine.g:392:4: rule__VariableDefinition__NextVariableAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__NextVariableAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDefinitionAccess().getNextVariableAssignment_2_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Alternatives_2"


    // $ANTLR start "rule__Variant__Alternatives_4"
    // InternalDefine.g:400:1: rule__Variant__Alternatives_4 : ( ( ';' ) | ( ( rule__Variant__NextVariantAssignment_4_1 ) ) );
    public final void rule__Variant__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:404:1: ( ( ';' ) | ( ( rule__Variant__NextVariantAssignment_4_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDefine.g:405:2: ( ';' )
                    {
                    // InternalDefine.g:405:2: ( ';' )
                    // InternalDefine.g:406:3: ';'
                    {
                     before(grammarAccess.getVariantAccess().getSemicolonKeyword_4_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVariantAccess().getSemicolonKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:411:2: ( ( rule__Variant__NextVariantAssignment_4_1 ) )
                    {
                    // InternalDefine.g:411:2: ( ( rule__Variant__NextVariantAssignment_4_1 ) )
                    // InternalDefine.g:412:3: ( rule__Variant__NextVariantAssignment_4_1 )
                    {
                     before(grammarAccess.getVariantAccess().getNextVariantAssignment_4_1()); 
                    // InternalDefine.g:413:3: ( rule__Variant__NextVariantAssignment_4_1 )
                    // InternalDefine.g:413:4: rule__Variant__NextVariantAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variant__NextVariantAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariantAccess().getNextVariantAssignment_4_1()); 

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
    // $ANTLR end "rule__Variant__Alternatives_4"


    // $ANTLR start "rule__VariableType__Alternatives_1"
    // InternalDefine.g:421:1: rule__VariableType__Alternatives_1 : ( ( ( rule__VariableType__BasicTypesAssignment_1_0 ) ) | ( ( rule__VariableType__SpecifiedUdtTypeAssignment_1_1 ) ) );
    public final void rule__VariableType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:425:1: ( ( ( rule__VariableType__BasicTypesAssignment_1_0 ) ) | ( ( rule__VariableType__SpecifiedUdtTypeAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=12 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDefine.g:426:2: ( ( rule__VariableType__BasicTypesAssignment_1_0 ) )
                    {
                    // InternalDefine.g:426:2: ( ( rule__VariableType__BasicTypesAssignment_1_0 ) )
                    // InternalDefine.g:427:3: ( rule__VariableType__BasicTypesAssignment_1_0 )
                    {
                     before(grammarAccess.getVariableTypeAccess().getBasicTypesAssignment_1_0()); 
                    // InternalDefine.g:428:3: ( rule__VariableType__BasicTypesAssignment_1_0 )
                    // InternalDefine.g:428:4: rule__VariableType__BasicTypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableType__BasicTypesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableTypeAccess().getBasicTypesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:432:2: ( ( rule__VariableType__SpecifiedUdtTypeAssignment_1_1 ) )
                    {
                    // InternalDefine.g:432:2: ( ( rule__VariableType__SpecifiedUdtTypeAssignment_1_1 ) )
                    // InternalDefine.g:433:3: ( rule__VariableType__SpecifiedUdtTypeAssignment_1_1 )
                    {
                     before(grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeAssignment_1_1()); 
                    // InternalDefine.g:434:3: ( rule__VariableType__SpecifiedUdtTypeAssignment_1_1 )
                    // InternalDefine.g:434:4: rule__VariableType__SpecifiedUdtTypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableType__SpecifiedUdtTypeAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__VariableType__Alternatives_1"


    // $ANTLR start "rule__VariableType__BasicTypesAlternatives_1_0_0"
    // InternalDefine.g:442:1: rule__VariableType__BasicTypesAlternatives_1_0_0 : ( ( 'int' ) | ( 'bool' ) | ( 'float' ) );
    public final void rule__VariableType__BasicTypesAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:446:1: ( ( 'int' ) | ( 'bool' ) | ( 'float' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
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
                    // InternalDefine.g:447:2: ( 'int' )
                    {
                    // InternalDefine.g:447:2: ( 'int' )
                    // InternalDefine.g:448:3: 'int'
                    {
                     before(grammarAccess.getVariableTypeAccess().getBasicTypesIntKeyword_1_0_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getBasicTypesIntKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:453:2: ( 'bool' )
                    {
                    // InternalDefine.g:453:2: ( 'bool' )
                    // InternalDefine.g:454:3: 'bool'
                    {
                     before(grammarAccess.getVariableTypeAccess().getBasicTypesBoolKeyword_1_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getBasicTypesBoolKeyword_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:459:2: ( 'float' )
                    {
                    // InternalDefine.g:459:2: ( 'float' )
                    // InternalDefine.g:460:3: 'float'
                    {
                     before(grammarAccess.getVariableTypeAccess().getBasicTypesFloatKeyword_1_0_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getBasicTypesFloatKeyword_1_0_0_2()); 

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
    // $ANTLR end "rule__VariableType__BasicTypesAlternatives_1_0_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalDefine.g:469:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:473:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 15:
            case 16:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDefine.g:474:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalDefine.g:474:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalDefine.g:475:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalDefine.g:476:3: ( rule__Expression__Group_0__0 )
                    // InternalDefine.g:476:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:480:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalDefine.g:480:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalDefine.g:481:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalDefine.g:482:3: ( rule__Expression__Group_1__0 )
                    // InternalDefine.g:482:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:486:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalDefine.g:486:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalDefine.g:487:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalDefine.g:488:3: ( rule__Expression__Group_2__0 )
                    // InternalDefine.g:488:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:492:2: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // InternalDefine.g:492:2: ( ( rule__Expression__Group_3__0 ) )
                    // InternalDefine.g:493:3: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // InternalDefine.g:494:3: ( rule__Expression__Group_3__0 )
                    // InternalDefine.g:494:4: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Expression__ValueAlternatives_2_1_0"
    // InternalDefine.g:502:1: rule__Expression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Expression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:506:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDefine.g:507:2: ( 'true' )
                    {
                    // InternalDefine.g:507:2: ( 'true' )
                    // InternalDefine.g:508:3: 'true'
                    {
                     before(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:513:2: ( 'false' )
                    {
                    // InternalDefine.g:513:2: ( 'false' )
                    // InternalDefine.g:514:3: 'false'
                    {
                     before(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Expression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__DefineBlock__Group__0"
    // InternalDefine.g:523:1: rule__DefineBlock__Group__0 : rule__DefineBlock__Group__0__Impl rule__DefineBlock__Group__1 ;
    public final void rule__DefineBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:527:1: ( rule__DefineBlock__Group__0__Impl rule__DefineBlock__Group__1 )
            // InternalDefine.g:528:2: rule__DefineBlock__Group__0__Impl rule__DefineBlock__Group__1
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
    // InternalDefine.g:535:1: rule__DefineBlock__Group__0__Impl : ( 'define' ) ;
    public final void rule__DefineBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:539:1: ( ( 'define' ) )
            // InternalDefine.g:540:1: ( 'define' )
            {
            // InternalDefine.g:540:1: ( 'define' )
            // InternalDefine.g:541:2: 'define'
            {
             before(grammarAccess.getDefineBlockAccess().getDefineKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDefine.g:550:1: rule__DefineBlock__Group__1 : rule__DefineBlock__Group__1__Impl rule__DefineBlock__Group__2 ;
    public final void rule__DefineBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:554:1: ( rule__DefineBlock__Group__1__Impl rule__DefineBlock__Group__2 )
            // InternalDefine.g:555:2: rule__DefineBlock__Group__1__Impl rule__DefineBlock__Group__2
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
    // InternalDefine.g:562:1: rule__DefineBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DefineBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:566:1: ( ( '{' ) )
            // InternalDefine.g:567:1: ( '{' )
            {
            // InternalDefine.g:567:1: ( '{' )
            // InternalDefine.g:568:2: '{'
            {
             before(grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDefine.g:577:1: rule__DefineBlock__Group__2 : rule__DefineBlock__Group__2__Impl rule__DefineBlock__Group__3 ;
    public final void rule__DefineBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:581:1: ( rule__DefineBlock__Group__2__Impl rule__DefineBlock__Group__3 )
            // InternalDefine.g:582:2: rule__DefineBlock__Group__2__Impl rule__DefineBlock__Group__3
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
    // InternalDefine.g:589:1: rule__DefineBlock__Group__2__Impl : ( ( rule__DefineBlock__DirectionAssignment_2 ) ) ;
    public final void rule__DefineBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:593:1: ( ( ( rule__DefineBlock__DirectionAssignment_2 ) ) )
            // InternalDefine.g:594:1: ( ( rule__DefineBlock__DirectionAssignment_2 ) )
            {
            // InternalDefine.g:594:1: ( ( rule__DefineBlock__DirectionAssignment_2 ) )
            // InternalDefine.g:595:2: ( rule__DefineBlock__DirectionAssignment_2 )
            {
             before(grammarAccess.getDefineBlockAccess().getDirectionAssignment_2()); 
            // InternalDefine.g:596:2: ( rule__DefineBlock__DirectionAssignment_2 )
            // InternalDefine.g:596:3: rule__DefineBlock__DirectionAssignment_2
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
    // InternalDefine.g:604:1: rule__DefineBlock__Group__3 : rule__DefineBlock__Group__3__Impl ;
    public final void rule__DefineBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:608:1: ( rule__DefineBlock__Group__3__Impl )
            // InternalDefine.g:609:2: rule__DefineBlock__Group__3__Impl
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
    // InternalDefine.g:615:1: rule__DefineBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__DefineBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:619:1: ( ( '}' ) )
            // InternalDefine.g:620:1: ( '}' )
            {
            // InternalDefine.g:620:1: ( '}' )
            // InternalDefine.g:621:2: '}'
            {
             before(grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDefine.g:631:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:635:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalDefine.g:636:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalDefine.g:643:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:647:1: ( ( 'input' ) )
            // InternalDefine.g:648:1: ( 'input' )
            {
            // InternalDefine.g:648:1: ( 'input' )
            // InternalDefine.g:649:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDefine.g:658:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:662:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalDefine.g:663:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalDefine.g:670:1: rule__Input__Group__1__Impl : ( () ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:674:1: ( ( () ) )
            // InternalDefine.g:675:1: ( () )
            {
            // InternalDefine.g:675:1: ( () )
            // InternalDefine.g:676:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_1()); 
            // InternalDefine.g:677:2: ()
            // InternalDefine.g:677:3: 
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
    // InternalDefine.g:685:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:689:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalDefine.g:690:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalDefine.g:697:1: rule__Input__Group__2__Impl : ( '[' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:701:1: ( ( '[' ) )
            // InternalDefine.g:702:1: ( '[' )
            {
            // InternalDefine.g:702:1: ( '[' )
            // InternalDefine.g:703:2: '['
            {
             before(grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDefine.g:712:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:716:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalDefine.g:717:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalDefine.g:724:1: rule__Input__Group__3__Impl : ( ( rule__Input__InputVariablesAssignment_3 )* ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:728:1: ( ( ( rule__Input__InputVariablesAssignment_3 )* ) )
            // InternalDefine.g:729:1: ( ( rule__Input__InputVariablesAssignment_3 )* )
            {
            // InternalDefine.g:729:1: ( ( rule__Input__InputVariablesAssignment_3 )* )
            // InternalDefine.g:730:2: ( rule__Input__InputVariablesAssignment_3 )*
            {
             before(grammarAccess.getInputAccess().getInputVariablesAssignment_3()); 
            // InternalDefine.g:731:2: ( rule__Input__InputVariablesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=12 && LA8_0<=14)||(LA8_0>=29 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDefine.g:731:3: rule__Input__InputVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Input__InputVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDefine.g:739:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:743:1: ( rule__Input__Group__4__Impl )
            // InternalDefine.g:744:2: rule__Input__Group__4__Impl
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
    // InternalDefine.g:750:1: rule__Input__Group__4__Impl : ( ']' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:754:1: ( ( ']' ) )
            // InternalDefine.g:755:1: ( ']' )
            {
            // InternalDefine.g:755:1: ( ']' )
            // InternalDefine.g:756:2: ']'
            {
             before(grammarAccess.getInputAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Inout__Group__0"
    // InternalDefine.g:766:1: rule__Inout__Group__0 : rule__Inout__Group__0__Impl rule__Inout__Group__1 ;
    public final void rule__Inout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:770:1: ( rule__Inout__Group__0__Impl rule__Inout__Group__1 )
            // InternalDefine.g:771:2: rule__Inout__Group__0__Impl rule__Inout__Group__1
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
    // InternalDefine.g:778:1: rule__Inout__Group__0__Impl : ( 'inout' ) ;
    public final void rule__Inout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:782:1: ( ( 'inout' ) )
            // InternalDefine.g:783:1: ( 'inout' )
            {
            // InternalDefine.g:783:1: ( 'inout' )
            // InternalDefine.g:784:2: 'inout'
            {
             before(grammarAccess.getInoutAccess().getInoutKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDefine.g:793:1: rule__Inout__Group__1 : rule__Inout__Group__1__Impl rule__Inout__Group__2 ;
    public final void rule__Inout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:797:1: ( rule__Inout__Group__1__Impl rule__Inout__Group__2 )
            // InternalDefine.g:798:2: rule__Inout__Group__1__Impl rule__Inout__Group__2
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
    // InternalDefine.g:805:1: rule__Inout__Group__1__Impl : ( () ) ;
    public final void rule__Inout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:809:1: ( ( () ) )
            // InternalDefine.g:810:1: ( () )
            {
            // InternalDefine.g:810:1: ( () )
            // InternalDefine.g:811:2: ()
            {
             before(grammarAccess.getInoutAccess().getInoutAction_1()); 
            // InternalDefine.g:812:2: ()
            // InternalDefine.g:812:3: 
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
    // InternalDefine.g:820:1: rule__Inout__Group__2 : rule__Inout__Group__2__Impl rule__Inout__Group__3 ;
    public final void rule__Inout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:824:1: ( rule__Inout__Group__2__Impl rule__Inout__Group__3 )
            // InternalDefine.g:825:2: rule__Inout__Group__2__Impl rule__Inout__Group__3
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
    // InternalDefine.g:832:1: rule__Inout__Group__2__Impl : ( '[' ) ;
    public final void rule__Inout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:836:1: ( ( '[' ) )
            // InternalDefine.g:837:1: ( '[' )
            {
            // InternalDefine.g:837:1: ( '[' )
            // InternalDefine.g:838:2: '['
            {
             before(grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDefine.g:847:1: rule__Inout__Group__3 : rule__Inout__Group__3__Impl rule__Inout__Group__4 ;
    public final void rule__Inout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:851:1: ( rule__Inout__Group__3__Impl rule__Inout__Group__4 )
            // InternalDefine.g:852:2: rule__Inout__Group__3__Impl rule__Inout__Group__4
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
    // InternalDefine.g:859:1: rule__Inout__Group__3__Impl : ( ( rule__Inout__InoutVariablesAssignment_3 )* ) ;
    public final void rule__Inout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:863:1: ( ( ( rule__Inout__InoutVariablesAssignment_3 )* ) )
            // InternalDefine.g:864:1: ( ( rule__Inout__InoutVariablesAssignment_3 )* )
            {
            // InternalDefine.g:864:1: ( ( rule__Inout__InoutVariablesAssignment_3 )* )
            // InternalDefine.g:865:2: ( rule__Inout__InoutVariablesAssignment_3 )*
            {
             before(grammarAccess.getInoutAccess().getInoutVariablesAssignment_3()); 
            // InternalDefine.g:866:2: ( rule__Inout__InoutVariablesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=12 && LA9_0<=14)||(LA9_0>=29 && LA9_0<=30)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDefine.g:866:3: rule__Inout__InoutVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Inout__InoutVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDefine.g:874:1: rule__Inout__Group__4 : rule__Inout__Group__4__Impl ;
    public final void rule__Inout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:878:1: ( rule__Inout__Group__4__Impl )
            // InternalDefine.g:879:2: rule__Inout__Group__4__Impl
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
    // InternalDefine.g:885:1: rule__Inout__Group__4__Impl : ( ']' ) ;
    public final void rule__Inout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:889:1: ( ( ']' ) )
            // InternalDefine.g:890:1: ( ']' )
            {
            // InternalDefine.g:890:1: ( ']' )
            // InternalDefine.g:891:2: ']'
            {
             before(grammarAccess.getInoutAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Output__Group__0"
    // InternalDefine.g:901:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:905:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalDefine.g:906:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalDefine.g:913:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:917:1: ( ( 'output' ) )
            // InternalDefine.g:918:1: ( 'output' )
            {
            // InternalDefine.g:918:1: ( 'output' )
            // InternalDefine.g:919:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDefine.g:928:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:932:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalDefine.g:933:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalDefine.g:940:1: rule__Output__Group__1__Impl : ( () ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:944:1: ( ( () ) )
            // InternalDefine.g:945:1: ( () )
            {
            // InternalDefine.g:945:1: ( () )
            // InternalDefine.g:946:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_1()); 
            // InternalDefine.g:947:2: ()
            // InternalDefine.g:947:3: 
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
    // InternalDefine.g:955:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:959:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalDefine.g:960:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalDefine.g:967:1: rule__Output__Group__2__Impl : ( '[' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:971:1: ( ( '[' ) )
            // InternalDefine.g:972:1: ( '[' )
            {
            // InternalDefine.g:972:1: ( '[' )
            // InternalDefine.g:973:2: '['
            {
             before(grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDefine.g:982:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:986:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalDefine.g:987:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalDefine.g:994:1: rule__Output__Group__3__Impl : ( ( rule__Output__OutputVariablesAssignment_3 )* ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:998:1: ( ( ( rule__Output__OutputVariablesAssignment_3 )* ) )
            // InternalDefine.g:999:1: ( ( rule__Output__OutputVariablesAssignment_3 )* )
            {
            // InternalDefine.g:999:1: ( ( rule__Output__OutputVariablesAssignment_3 )* )
            // InternalDefine.g:1000:2: ( rule__Output__OutputVariablesAssignment_3 )*
            {
             before(grammarAccess.getOutputAccess().getOutputVariablesAssignment_3()); 
            // InternalDefine.g:1001:2: ( rule__Output__OutputVariablesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=12 && LA10_0<=14)||(LA10_0>=29 && LA10_0<=30)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDefine.g:1001:3: rule__Output__OutputVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Output__OutputVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDefine.g:1009:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1013:1: ( rule__Output__Group__4__Impl )
            // InternalDefine.g:1014:2: rule__Output__Group__4__Impl
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
    // InternalDefine.g:1020:1: rule__Output__Group__4__Impl : ( ']' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1024:1: ( ( ']' ) )
            // InternalDefine.g:1025:1: ( ']' )
            {
            // InternalDefine.g:1025:1: ( ']' )
            // InternalDefine.g:1026:2: ']'
            {
             before(grammarAccess.getOutputAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Variable__Group_0__0"
    // InternalDefine.g:1036:1: rule__Variable__Group_0__0 : rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 ;
    public final void rule__Variable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1040:1: ( rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 )
            // InternalDefine.g:1041:2: rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1
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
    // InternalDefine.g:1048:1: rule__Variable__Group_0__0__Impl : ( ( rule__Variable__VariableTypeAssignment_0_0 )? ) ;
    public final void rule__Variable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1052:1: ( ( ( rule__Variable__VariableTypeAssignment_0_0 )? ) )
            // InternalDefine.g:1053:1: ( ( rule__Variable__VariableTypeAssignment_0_0 )? )
            {
            // InternalDefine.g:1053:1: ( ( rule__Variable__VariableTypeAssignment_0_0 )? )
            // InternalDefine.g:1054:2: ( rule__Variable__VariableTypeAssignment_0_0 )?
            {
             before(grammarAccess.getVariableAccess().getVariableTypeAssignment_0_0()); 
            // InternalDefine.g:1055:2: ( rule__Variable__VariableTypeAssignment_0_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=14)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalDefine.g:1055:3: rule__Variable__VariableTypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__VariableTypeAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getVariableTypeAssignment_0_0()); 

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
    // $ANTLR end "rule__Variable__Group_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_0__1"
    // InternalDefine.g:1063:1: rule__Variable__Group_0__1 : rule__Variable__Group_0__1__Impl ;
    public final void rule__Variable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1067:1: ( rule__Variable__Group_0__1__Impl )
            // InternalDefine.g:1068:2: rule__Variable__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_0__1__Impl();

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
    // InternalDefine.g:1074:1: rule__Variable__Group_0__1__Impl : ( ( rule__Variable__VariableDefinitionAssignment_0_1 ) ) ;
    public final void rule__Variable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1078:1: ( ( ( rule__Variable__VariableDefinitionAssignment_0_1 ) ) )
            // InternalDefine.g:1079:1: ( ( rule__Variable__VariableDefinitionAssignment_0_1 ) )
            {
            // InternalDefine.g:1079:1: ( ( rule__Variable__VariableDefinitionAssignment_0_1 ) )
            // InternalDefine.g:1080:2: ( rule__Variable__VariableDefinitionAssignment_0_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableDefinitionAssignment_0_1()); 
            // InternalDefine.g:1081:2: ( rule__Variable__VariableDefinitionAssignment_0_1 )
            // InternalDefine.g:1081:3: rule__Variable__VariableDefinitionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableDefinitionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableDefinitionAssignment_0_1()); 

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


    // $ANTLR start "rule__Variable__Group_1__0"
    // InternalDefine.g:1090:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1094:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // InternalDefine.g:1095:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1__1();

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
    // $ANTLR end "rule__Variable__Group_1__0"


    // $ANTLR start "rule__Variable__Group_1__0__Impl"
    // InternalDefine.g:1102:1: rule__Variable__Group_1__0__Impl : ( ( rule__Variable__VariantKeywordAssignment_1_0 )? ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1106:1: ( ( ( rule__Variable__VariantKeywordAssignment_1_0 )? ) )
            // InternalDefine.g:1107:1: ( ( rule__Variable__VariantKeywordAssignment_1_0 )? )
            {
            // InternalDefine.g:1107:1: ( ( rule__Variable__VariantKeywordAssignment_1_0 )? )
            // InternalDefine.g:1108:2: ( rule__Variable__VariantKeywordAssignment_1_0 )?
            {
             before(grammarAccess.getVariableAccess().getVariantKeywordAssignment_1_0()); 
            // InternalDefine.g:1109:2: ( rule__Variable__VariantKeywordAssignment_1_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDefine.g:1109:3: rule__Variable__VariantKeywordAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__VariantKeywordAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getVariantKeywordAssignment_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1__1"
    // InternalDefine.g:1117:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1121:1: ( rule__Variable__Group_1__1__Impl )
            // InternalDefine.g:1122:2: rule__Variable__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_1__1"


    // $ANTLR start "rule__Variable__Group_1__1__Impl"
    // InternalDefine.g:1128:1: rule__Variable__Group_1__1__Impl : ( ( rule__Variable__VariantAssignment_1_1 ) ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1132:1: ( ( ( rule__Variable__VariantAssignment_1_1 ) ) )
            // InternalDefine.g:1133:1: ( ( rule__Variable__VariantAssignment_1_1 ) )
            {
            // InternalDefine.g:1133:1: ( ( rule__Variable__VariantAssignment_1_1 ) )
            // InternalDefine.g:1134:2: ( rule__Variable__VariantAssignment_1_1 )
            {
             before(grammarAccess.getVariableAccess().getVariantAssignment_1_1()); 
            // InternalDefine.g:1135:2: ( rule__Variable__VariantAssignment_1_1 )
            // InternalDefine.g:1135:3: rule__Variable__VariantAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariantAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariantAssignment_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__0"
    // InternalDefine.g:1144:1: rule__VariableDefinition__Group__0 : rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 ;
    public final void rule__VariableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1148:1: ( rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 )
            // InternalDefine.g:1149:2: rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VariableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__1();

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
    // $ANTLR end "rule__VariableDefinition__Group__0"


    // $ANTLR start "rule__VariableDefinition__Group__0__Impl"
    // InternalDefine.g:1156:1: rule__VariableDefinition__Group__0__Impl : ( ( rule__VariableDefinition__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1160:1: ( ( ( rule__VariableDefinition__VariableNameAssignment_0 ) ) )
            // InternalDefine.g:1161:1: ( ( rule__VariableDefinition__VariableNameAssignment_0 ) )
            {
            // InternalDefine.g:1161:1: ( ( rule__VariableDefinition__VariableNameAssignment_0 ) )
            // InternalDefine.g:1162:2: ( rule__VariableDefinition__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableNameAssignment_0()); 
            // InternalDefine.g:1163:2: ( rule__VariableDefinition__VariableNameAssignment_0 )
            // InternalDefine.g:1163:3: rule__VariableDefinition__VariableNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__VariableNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getVariableNameAssignment_0()); 

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
    // $ANTLR end "rule__VariableDefinition__Group__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__1"
    // InternalDefine.g:1171:1: rule__VariableDefinition__Group__1 : rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 ;
    public final void rule__VariableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1175:1: ( rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 )
            // InternalDefine.g:1176:2: rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VariableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__2();

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
    // $ANTLR end "rule__VariableDefinition__Group__1"


    // $ANTLR start "rule__VariableDefinition__Group__1__Impl"
    // InternalDefine.g:1183:1: rule__VariableDefinition__Group__1__Impl : ( ( rule__VariableDefinition__Group_1__0 )? ) ;
    public final void rule__VariableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1187:1: ( ( ( rule__VariableDefinition__Group_1__0 )? ) )
            // InternalDefine.g:1188:1: ( ( rule__VariableDefinition__Group_1__0 )? )
            {
            // InternalDefine.g:1188:1: ( ( rule__VariableDefinition__Group_1__0 )? )
            // InternalDefine.g:1189:2: ( rule__VariableDefinition__Group_1__0 )?
            {
             before(grammarAccess.getVariableDefinitionAccess().getGroup_1()); 
            // InternalDefine.g:1190:2: ( rule__VariableDefinition__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDefine.g:1190:3: rule__VariableDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDefinitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Group__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__2"
    // InternalDefine.g:1198:1: rule__VariableDefinition__Group__2 : rule__VariableDefinition__Group__2__Impl ;
    public final void rule__VariableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1202:1: ( rule__VariableDefinition__Group__2__Impl )
            // InternalDefine.g:1203:2: rule__VariableDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__VariableDefinition__Group__2"


    // $ANTLR start "rule__VariableDefinition__Group__2__Impl"
    // InternalDefine.g:1209:1: rule__VariableDefinition__Group__2__Impl : ( ( rule__VariableDefinition__Alternatives_2 ) ) ;
    public final void rule__VariableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1213:1: ( ( ( rule__VariableDefinition__Alternatives_2 ) ) )
            // InternalDefine.g:1214:1: ( ( rule__VariableDefinition__Alternatives_2 ) )
            {
            // InternalDefine.g:1214:1: ( ( rule__VariableDefinition__Alternatives_2 ) )
            // InternalDefine.g:1215:2: ( rule__VariableDefinition__Alternatives_2 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getAlternatives_2()); 
            // InternalDefine.g:1216:2: ( rule__VariableDefinition__Alternatives_2 )
            // InternalDefine.g:1216:3: rule__VariableDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__VariableDefinition__Group__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__0"
    // InternalDefine.g:1225:1: rule__VariableDefinition__Group_1__0 : rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1 ;
    public final void rule__VariableDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1229:1: ( rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1 )
            // InternalDefine.g:1230:2: rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__VariableDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__1();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__0"


    // $ANTLR start "rule__VariableDefinition__Group_1__0__Impl"
    // InternalDefine.g:1237:1: rule__VariableDefinition__Group_1__0__Impl : ( '=' ) ;
    public final void rule__VariableDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1241:1: ( ( '=' ) )
            // InternalDefine.g:1242:1: ( '=' )
            {
            // InternalDefine.g:1242:1: ( '=' )
            // InternalDefine.g:1243:2: '='
            {
             before(grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__1"
    // InternalDefine.g:1252:1: rule__VariableDefinition__Group_1__1 : rule__VariableDefinition__Group_1__1__Impl rule__VariableDefinition__Group_1__2 ;
    public final void rule__VariableDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1256:1: ( rule__VariableDefinition__Group_1__1__Impl rule__VariableDefinition__Group_1__2 )
            // InternalDefine.g:1257:2: rule__VariableDefinition__Group_1__1__Impl rule__VariableDefinition__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__VariableDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__2();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__1"


    // $ANTLR start "rule__VariableDefinition__Group_1__1__Impl"
    // InternalDefine.g:1264:1: rule__VariableDefinition__Group_1__1__Impl : ( ( rule__VariableDefinition__ExpressionAssignment_1_1 ) ) ;
    public final void rule__VariableDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1268:1: ( ( ( rule__VariableDefinition__ExpressionAssignment_1_1 ) ) )
            // InternalDefine.g:1269:1: ( ( rule__VariableDefinition__ExpressionAssignment_1_1 ) )
            {
            // InternalDefine.g:1269:1: ( ( rule__VariableDefinition__ExpressionAssignment_1_1 ) )
            // InternalDefine.g:1270:2: ( rule__VariableDefinition__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getExpressionAssignment_1_1()); 
            // InternalDefine.g:1271:2: ( rule__VariableDefinition__ExpressionAssignment_1_1 )
            // InternalDefine.g:1271:3: rule__VariableDefinition__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getExpressionAssignment_1_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__2"
    // InternalDefine.g:1279:1: rule__VariableDefinition__Group_1__2 : rule__VariableDefinition__Group_1__2__Impl ;
    public final void rule__VariableDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1283:1: ( rule__VariableDefinition__Group_1__2__Impl )
            // InternalDefine.g:1284:2: rule__VariableDefinition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__2__Impl();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__2"


    // $ANTLR start "rule__VariableDefinition__Group_1__2__Impl"
    // InternalDefine.g:1290:1: rule__VariableDefinition__Group_1__2__Impl : ( ( rule__VariableDefinition__Group_1_2__0 )? ) ;
    public final void rule__VariableDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1294:1: ( ( ( rule__VariableDefinition__Group_1_2__0 )? ) )
            // InternalDefine.g:1295:1: ( ( rule__VariableDefinition__Group_1_2__0 )? )
            {
            // InternalDefine.g:1295:1: ( ( rule__VariableDefinition__Group_1_2__0 )? )
            // InternalDefine.g:1296:2: ( rule__VariableDefinition__Group_1_2__0 )?
            {
             before(grammarAccess.getVariableDefinitionAccess().getGroup_1_2()); 
            // InternalDefine.g:1297:2: ( rule__VariableDefinition__Group_1_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDefine.g:1297:3: rule__VariableDefinition__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDefinitionAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1_2__0"
    // InternalDefine.g:1306:1: rule__VariableDefinition__Group_1_2__0 : rule__VariableDefinition__Group_1_2__0__Impl rule__VariableDefinition__Group_1_2__1 ;
    public final void rule__VariableDefinition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1310:1: ( rule__VariableDefinition__Group_1_2__0__Impl rule__VariableDefinition__Group_1_2__1 )
            // InternalDefine.g:1311:2: rule__VariableDefinition__Group_1_2__0__Impl rule__VariableDefinition__Group_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__VariableDefinition__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1_2__1();

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
    // $ANTLR end "rule__VariableDefinition__Group_1_2__0"


    // $ANTLR start "rule__VariableDefinition__Group_1_2__0__Impl"
    // InternalDefine.g:1318:1: rule__VariableDefinition__Group_1_2__0__Impl : ( '+/-' ) ;
    public final void rule__VariableDefinition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1322:1: ( ( '+/-' ) )
            // InternalDefine.g:1323:1: ( '+/-' )
            {
            // InternalDefine.g:1323:1: ( '+/-' )
            // InternalDefine.g:1324:2: '+/-'
            {
             before(grammarAccess.getVariableDefinitionAccess().getPlusSignSolidusHyphenMinusKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getPlusSignSolidusHyphenMinusKeyword_1_2_0()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1_2__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1_2__1"
    // InternalDefine.g:1333:1: rule__VariableDefinition__Group_1_2__1 : rule__VariableDefinition__Group_1_2__1__Impl ;
    public final void rule__VariableDefinition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1337:1: ( rule__VariableDefinition__Group_1_2__1__Impl )
            // InternalDefine.g:1338:2: rule__VariableDefinition__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__VariableDefinition__Group_1_2__1"


    // $ANTLR start "rule__VariableDefinition__Group_1_2__1__Impl"
    // InternalDefine.g:1344:1: rule__VariableDefinition__Group_1_2__1__Impl : ( ( rule__VariableDefinition__RangeAssignment_1_2_1 ) ) ;
    public final void rule__VariableDefinition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1348:1: ( ( ( rule__VariableDefinition__RangeAssignment_1_2_1 ) ) )
            // InternalDefine.g:1349:1: ( ( rule__VariableDefinition__RangeAssignment_1_2_1 ) )
            {
            // InternalDefine.g:1349:1: ( ( rule__VariableDefinition__RangeAssignment_1_2_1 ) )
            // InternalDefine.g:1350:2: ( rule__VariableDefinition__RangeAssignment_1_2_1 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getRangeAssignment_1_2_1()); 
            // InternalDefine.g:1351:2: ( rule__VariableDefinition__RangeAssignment_1_2_1 )
            // InternalDefine.g:1351:3: rule__VariableDefinition__RangeAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__RangeAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getRangeAssignment_1_2_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1_2__1__Impl"


    // $ANTLR start "rule__Variant__Group__0"
    // InternalDefine.g:1360:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1364:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // InternalDefine.g:1365:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Variant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variant__Group__1();

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
    // $ANTLR end "rule__Variant__Group__0"


    // $ANTLR start "rule__Variant__Group__0__Impl"
    // InternalDefine.g:1372:1: rule__Variant__Group__0__Impl : ( ( rule__Variant__VariantNameAssignment_0 ) ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1376:1: ( ( ( rule__Variant__VariantNameAssignment_0 ) ) )
            // InternalDefine.g:1377:1: ( ( rule__Variant__VariantNameAssignment_0 ) )
            {
            // InternalDefine.g:1377:1: ( ( rule__Variant__VariantNameAssignment_0 ) )
            // InternalDefine.g:1378:2: ( rule__Variant__VariantNameAssignment_0 )
            {
             before(grammarAccess.getVariantAccess().getVariantNameAssignment_0()); 
            // InternalDefine.g:1379:2: ( rule__Variant__VariantNameAssignment_0 )
            // InternalDefine.g:1379:3: rule__Variant__VariantNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__VariantNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getVariantNameAssignment_0()); 

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
    // $ANTLR end "rule__Variant__Group__0__Impl"


    // $ANTLR start "rule__Variant__Group__1"
    // InternalDefine.g:1387:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1391:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // InternalDefine.g:1392:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Variant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variant__Group__2();

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
    // $ANTLR end "rule__Variant__Group__1"


    // $ANTLR start "rule__Variant__Group__1__Impl"
    // InternalDefine.g:1399:1: rule__Variant__Group__1__Impl : ( '(' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1403:1: ( ( '(' ) )
            // InternalDefine.g:1404:1: ( '(' )
            {
            // InternalDefine.g:1404:1: ( '(' )
            // InternalDefine.g:1405:2: '('
            {
             before(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Variant__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__2"
    // InternalDefine.g:1414:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1418:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // InternalDefine.g:1419:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Variant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variant__Group__3();

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
    // $ANTLR end "rule__Variant__Group__2"


    // $ANTLR start "rule__Variant__Group__2__Impl"
    // InternalDefine.g:1426:1: rule__Variant__Group__2__Impl : ( ( rule__Variant__VariantTypeAssignment_2 ) ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1430:1: ( ( ( rule__Variant__VariantTypeAssignment_2 ) ) )
            // InternalDefine.g:1431:1: ( ( rule__Variant__VariantTypeAssignment_2 ) )
            {
            // InternalDefine.g:1431:1: ( ( rule__Variant__VariantTypeAssignment_2 ) )
            // InternalDefine.g:1432:2: ( rule__Variant__VariantTypeAssignment_2 )
            {
             before(grammarAccess.getVariantAccess().getVariantTypeAssignment_2()); 
            // InternalDefine.g:1433:2: ( rule__Variant__VariantTypeAssignment_2 )
            // InternalDefine.g:1433:3: rule__Variant__VariantTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variant__VariantTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getVariantTypeAssignment_2()); 

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
    // $ANTLR end "rule__Variant__Group__2__Impl"


    // $ANTLR start "rule__Variant__Group__3"
    // InternalDefine.g:1441:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl rule__Variant__Group__4 ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1445:1: ( rule__Variant__Group__3__Impl rule__Variant__Group__4 )
            // InternalDefine.g:1446:2: rule__Variant__Group__3__Impl rule__Variant__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Variant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variant__Group__4();

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
    // $ANTLR end "rule__Variant__Group__3"


    // $ANTLR start "rule__Variant__Group__3__Impl"
    // InternalDefine.g:1453:1: rule__Variant__Group__3__Impl : ( ')' ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1457:1: ( ( ')' ) )
            // InternalDefine.g:1458:1: ( ')' )
            {
            // InternalDefine.g:1458:1: ( ')' )
            // InternalDefine.g:1459:2: ')'
            {
             before(grammarAccess.getVariantAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariantAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Variant__Group__3__Impl"


    // $ANTLR start "rule__Variant__Group__4"
    // InternalDefine.g:1468:1: rule__Variant__Group__4 : rule__Variant__Group__4__Impl ;
    public final void rule__Variant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1472:1: ( rule__Variant__Group__4__Impl )
            // InternalDefine.g:1473:2: rule__Variant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group__4__Impl();

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
    // $ANTLR end "rule__Variant__Group__4"


    // $ANTLR start "rule__Variant__Group__4__Impl"
    // InternalDefine.g:1479:1: rule__Variant__Group__4__Impl : ( ( rule__Variant__Alternatives_4 ) ) ;
    public final void rule__Variant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1483:1: ( ( ( rule__Variant__Alternatives_4 ) ) )
            // InternalDefine.g:1484:1: ( ( rule__Variant__Alternatives_4 ) )
            {
            // InternalDefine.g:1484:1: ( ( rule__Variant__Alternatives_4 ) )
            // InternalDefine.g:1485:2: ( rule__Variant__Alternatives_4 )
            {
             before(grammarAccess.getVariantAccess().getAlternatives_4()); 
            // InternalDefine.g:1486:2: ( rule__Variant__Alternatives_4 )
            // InternalDefine.g:1486:3: rule__Variant__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Variant__Group__4__Impl"


    // $ANTLR start "rule__Udt__Group__0"
    // InternalDefine.g:1495:1: rule__Udt__Group__0 : rule__Udt__Group__0__Impl rule__Udt__Group__1 ;
    public final void rule__Udt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1499:1: ( rule__Udt__Group__0__Impl rule__Udt__Group__1 )
            // InternalDefine.g:1500:2: rule__Udt__Group__0__Impl rule__Udt__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDefine.g:1507:1: rule__Udt__Group__0__Impl : ( 'udt' ) ;
    public final void rule__Udt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1511:1: ( ( 'udt' ) )
            // InternalDefine.g:1512:1: ( 'udt' )
            {
            // InternalDefine.g:1512:1: ( 'udt' )
            // InternalDefine.g:1513:2: 'udt'
            {
             before(grammarAccess.getUdtAccess().getUdtKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDefine.g:1522:1: rule__Udt__Group__1 : rule__Udt__Group__1__Impl rule__Udt__Group__2 ;
    public final void rule__Udt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1526:1: ( rule__Udt__Group__1__Impl rule__Udt__Group__2 )
            // InternalDefine.g:1527:2: rule__Udt__Group__1__Impl rule__Udt__Group__2
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
    // InternalDefine.g:1534:1: rule__Udt__Group__1__Impl : ( ( rule__Udt__UdtNameAssignment_1 ) ) ;
    public final void rule__Udt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1538:1: ( ( ( rule__Udt__UdtNameAssignment_1 ) ) )
            // InternalDefine.g:1539:1: ( ( rule__Udt__UdtNameAssignment_1 ) )
            {
            // InternalDefine.g:1539:1: ( ( rule__Udt__UdtNameAssignment_1 ) )
            // InternalDefine.g:1540:2: ( rule__Udt__UdtNameAssignment_1 )
            {
             before(grammarAccess.getUdtAccess().getUdtNameAssignment_1()); 
            // InternalDefine.g:1541:2: ( rule__Udt__UdtNameAssignment_1 )
            // InternalDefine.g:1541:3: rule__Udt__UdtNameAssignment_1
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
    // InternalDefine.g:1549:1: rule__Udt__Group__2 : rule__Udt__Group__2__Impl rule__Udt__Group__3 ;
    public final void rule__Udt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1553:1: ( rule__Udt__Group__2__Impl rule__Udt__Group__3 )
            // InternalDefine.g:1554:2: rule__Udt__Group__2__Impl rule__Udt__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDefine.g:1561:1: rule__Udt__Group__2__Impl : ( '(' ) ;
    public final void rule__Udt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1565:1: ( ( '(' ) )
            // InternalDefine.g:1566:1: ( '(' )
            {
            // InternalDefine.g:1566:1: ( '(' )
            // InternalDefine.g:1567:2: '('
            {
             before(grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDefine.g:1576:1: rule__Udt__Group__3 : rule__Udt__Group__3__Impl rule__Udt__Group__4 ;
    public final void rule__Udt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1580:1: ( rule__Udt__Group__3__Impl rule__Udt__Group__4 )
            // InternalDefine.g:1581:2: rule__Udt__Group__3__Impl rule__Udt__Group__4
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
    // InternalDefine.g:1588:1: rule__Udt__Group__3__Impl : ( ( rule__Udt__UdtTypesAssignment_3 ) ) ;
    public final void rule__Udt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1592:1: ( ( ( rule__Udt__UdtTypesAssignment_3 ) ) )
            // InternalDefine.g:1593:1: ( ( rule__Udt__UdtTypesAssignment_3 ) )
            {
            // InternalDefine.g:1593:1: ( ( rule__Udt__UdtTypesAssignment_3 ) )
            // InternalDefine.g:1594:2: ( rule__Udt__UdtTypesAssignment_3 )
            {
             before(grammarAccess.getUdtAccess().getUdtTypesAssignment_3()); 
            // InternalDefine.g:1595:2: ( rule__Udt__UdtTypesAssignment_3 )
            // InternalDefine.g:1595:3: rule__Udt__UdtTypesAssignment_3
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
    // InternalDefine.g:1603:1: rule__Udt__Group__4 : rule__Udt__Group__4__Impl rule__Udt__Group__5 ;
    public final void rule__Udt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1607:1: ( rule__Udt__Group__4__Impl rule__Udt__Group__5 )
            // InternalDefine.g:1608:2: rule__Udt__Group__4__Impl rule__Udt__Group__5
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
    // InternalDefine.g:1615:1: rule__Udt__Group__4__Impl : ( ')' ) ;
    public final void rule__Udt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1619:1: ( ( ')' ) )
            // InternalDefine.g:1620:1: ( ')' )
            {
            // InternalDefine.g:1620:1: ( ')' )
            // InternalDefine.g:1621:2: ')'
            {
             before(grammarAccess.getUdtAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDefine.g:1630:1: rule__Udt__Group__5 : rule__Udt__Group__5__Impl rule__Udt__Group__6 ;
    public final void rule__Udt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1634:1: ( rule__Udt__Group__5__Impl rule__Udt__Group__6 )
            // InternalDefine.g:1635:2: rule__Udt__Group__5__Impl rule__Udt__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalDefine.g:1642:1: rule__Udt__Group__5__Impl : ( '{' ) ;
    public final void rule__Udt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1646:1: ( ( '{' ) )
            // InternalDefine.g:1647:1: ( '{' )
            {
            // InternalDefine.g:1647:1: ( '{' )
            // InternalDefine.g:1648:2: '{'
            {
             before(grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDefine.g:1657:1: rule__Udt__Group__6 : rule__Udt__Group__6__Impl rule__Udt__Group__7 ;
    public final void rule__Udt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1661:1: ( rule__Udt__Group__6__Impl rule__Udt__Group__7 )
            // InternalDefine.g:1662:2: rule__Udt__Group__6__Impl rule__Udt__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalDefine.g:1669:1: rule__Udt__Group__6__Impl : ( ( rule__Udt__UdtVariablesAssignment_6 )* ) ;
    public final void rule__Udt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1673:1: ( ( ( rule__Udt__UdtVariablesAssignment_6 )* ) )
            // InternalDefine.g:1674:1: ( ( rule__Udt__UdtVariablesAssignment_6 )* )
            {
            // InternalDefine.g:1674:1: ( ( rule__Udt__UdtVariablesAssignment_6 )* )
            // InternalDefine.g:1675:2: ( rule__Udt__UdtVariablesAssignment_6 )*
            {
             before(grammarAccess.getUdtAccess().getUdtVariablesAssignment_6()); 
            // InternalDefine.g:1676:2: ( rule__Udt__UdtVariablesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=12 && LA15_0<=14)||(LA15_0>=29 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDefine.g:1676:3: rule__Udt__UdtVariablesAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Udt__UdtVariablesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDefine.g:1684:1: rule__Udt__Group__7 : rule__Udt__Group__7__Impl ;
    public final void rule__Udt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1688:1: ( rule__Udt__Group__7__Impl )
            // InternalDefine.g:1689:2: rule__Udt__Group__7__Impl
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
    // InternalDefine.g:1695:1: rule__Udt__Group__7__Impl : ( '}' ) ;
    public final void rule__Udt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1699:1: ( ( '}' ) )
            // InternalDefine.g:1700:1: ( '}' )
            {
            // InternalDefine.g:1700:1: ( '}' )
            // InternalDefine.g:1701:2: '}'
            {
             before(grammarAccess.getUdtAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__VariableType__Group__0"
    // InternalDefine.g:1711:1: rule__VariableType__Group__0 : rule__VariableType__Group__0__Impl rule__VariableType__Group__1 ;
    public final void rule__VariableType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1715:1: ( rule__VariableType__Group__0__Impl rule__VariableType__Group__1 )
            // InternalDefine.g:1716:2: rule__VariableType__Group__0__Impl rule__VariableType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__VariableType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableType__Group__1();

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
    // $ANTLR end "rule__VariableType__Group__0"


    // $ANTLR start "rule__VariableType__Group__0__Impl"
    // InternalDefine.g:1723:1: rule__VariableType__Group__0__Impl : ( () ) ;
    public final void rule__VariableType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1727:1: ( ( () ) )
            // InternalDefine.g:1728:1: ( () )
            {
            // InternalDefine.g:1728:1: ( () )
            // InternalDefine.g:1729:2: ()
            {
             before(grammarAccess.getVariableTypeAccess().getVariableTypeAction_0()); 
            // InternalDefine.g:1730:2: ()
            // InternalDefine.g:1730:3: 
            {
            }

             after(grammarAccess.getVariableTypeAccess().getVariableTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__Group__0__Impl"


    // $ANTLR start "rule__VariableType__Group__1"
    // InternalDefine.g:1738:1: rule__VariableType__Group__1 : rule__VariableType__Group__1__Impl ;
    public final void rule__VariableType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1742:1: ( rule__VariableType__Group__1__Impl )
            // InternalDefine.g:1743:2: rule__VariableType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Group__1__Impl();

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
    // $ANTLR end "rule__VariableType__Group__1"


    // $ANTLR start "rule__VariableType__Group__1__Impl"
    // InternalDefine.g:1749:1: rule__VariableType__Group__1__Impl : ( ( rule__VariableType__Alternatives_1 ) ) ;
    public final void rule__VariableType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1753:1: ( ( ( rule__VariableType__Alternatives_1 ) ) )
            // InternalDefine.g:1754:1: ( ( rule__VariableType__Alternatives_1 ) )
            {
            // InternalDefine.g:1754:1: ( ( rule__VariableType__Alternatives_1 ) )
            // InternalDefine.g:1755:2: ( rule__VariableType__Alternatives_1 )
            {
             before(grammarAccess.getVariableTypeAccess().getAlternatives_1()); 
            // InternalDefine.g:1756:2: ( rule__VariableType__Alternatives_1 )
            // InternalDefine.g:1756:3: rule__VariableType__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__VariableType__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalDefine.g:1765:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1769:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalDefine.g:1770:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalDefine.g:1777:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1781:1: ( ( () ) )
            // InternalDefine.g:1782:1: ( () )
            {
            // InternalDefine.g:1782:1: ( () )
            // InternalDefine.g:1783:2: ()
            {
             before(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 
            // InternalDefine.g:1784:2: ()
            // InternalDefine.g:1784:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalDefine.g:1792:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1796:1: ( rule__Expression__Group_0__1__Impl )
            // InternalDefine.g:1797:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalDefine.g:1803:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__ValueAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1807:1: ( ( ( rule__Expression__ValueAssignment_0_1 ) ) )
            // InternalDefine.g:1808:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            {
            // InternalDefine.g:1808:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            // InternalDefine.g:1809:2: ( rule__Expression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 
            // InternalDefine.g:1810:2: ( rule__Expression__ValueAssignment_0_1 )
            // InternalDefine.g:1810:3: rule__Expression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalDefine.g:1819:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1823:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalDefine.g:1824:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalDefine.g:1831:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1835:1: ( ( () ) )
            // InternalDefine.g:1836:1: ( () )
            {
            // InternalDefine.g:1836:1: ( () )
            // InternalDefine.g:1837:2: ()
            {
             before(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 
            // InternalDefine.g:1838:2: ()
            // InternalDefine.g:1838:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalDefine.g:1846:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1850:1: ( rule__Expression__Group_1__1__Impl )
            // InternalDefine.g:1851:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalDefine.g:1857:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1861:1: ( ( ( rule__Expression__ValueAssignment_1_1 ) ) )
            // InternalDefine.g:1862:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            {
            // InternalDefine.g:1862:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            // InternalDefine.g:1863:2: ( rule__Expression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 
            // InternalDefine.g:1864:2: ( rule__Expression__ValueAssignment_1_1 )
            // InternalDefine.g:1864:3: rule__Expression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalDefine.g:1873:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1877:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalDefine.g:1878:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

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
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalDefine.g:1885:1: rule__Expression__Group_2__0__Impl : ( () ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1889:1: ( ( () ) )
            // InternalDefine.g:1890:1: ( () )
            {
            // InternalDefine.g:1890:1: ( () )
            // InternalDefine.g:1891:2: ()
            {
             before(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 
            // InternalDefine.g:1892:2: ()
            // InternalDefine.g:1892:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalDefine.g:1900:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1904:1: ( rule__Expression__Group_2__1__Impl )
            // InternalDefine.g:1905:2: rule__Expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalDefine.g:1911:1: rule__Expression__Group_2__1__Impl : ( ( rule__Expression__ValueAssignment_2_1 ) ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1915:1: ( ( ( rule__Expression__ValueAssignment_2_1 ) ) )
            // InternalDefine.g:1916:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            {
            // InternalDefine.g:1916:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            // InternalDefine.g:1917:2: ( rule__Expression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 
            // InternalDefine.g:1918:2: ( rule__Expression__ValueAssignment_2_1 )
            // InternalDefine.g:1918:3: rule__Expression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // InternalDefine.g:1927:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1931:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // InternalDefine.g:1932:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1();

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
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // InternalDefine.g:1939:1: rule__Expression__Group_3__0__Impl : ( () ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1943:1: ( ( () ) )
            // InternalDefine.g:1944:1: ( () )
            {
            // InternalDefine.g:1944:1: ( () )
            // InternalDefine.g:1945:2: ()
            {
             before(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); 
            // InternalDefine.g:1946:2: ()
            // InternalDefine.g:1946:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // InternalDefine.g:1954:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1958:1: ( rule__Expression__Group_3__1__Impl )
            // InternalDefine.g:1959:2: rule__Expression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // InternalDefine.g:1965:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__VariableAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:1969:1: ( ( ( rule__Expression__VariableAssignment_3_1 ) ) )
            // InternalDefine.g:1970:1: ( ( rule__Expression__VariableAssignment_3_1 ) )
            {
            // InternalDefine.g:1970:1: ( ( rule__Expression__VariableAssignment_3_1 ) )
            // InternalDefine.g:1971:2: ( rule__Expression__VariableAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); 
            // InternalDefine.g:1972:2: ( rule__Expression__VariableAssignment_3_1 )
            // InternalDefine.g:1972:3: rule__Expression__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); 

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
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__DirectionBlock__UnorderedGroup"
    // InternalDefine.g:1981:1: rule__DirectionBlock__UnorderedGroup : rule__DirectionBlock__UnorderedGroup__0 {...}?;
    public final void rule__DirectionBlock__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
        	
        try {
            // InternalDefine.g:1986:1: ( rule__DirectionBlock__UnorderedGroup__0 {...}?)
            // InternalDefine.g:1987:2: rule__DirectionBlock__UnorderedGroup__0 {...}?
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
    // InternalDefine.g:1995:1: rule__DirectionBlock__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) ) ;
    public final void rule__DirectionBlock__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDefine.g:2000:1: ( ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) ) )
            // InternalDefine.g:2001:3: ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) )
            {
            // InternalDefine.g:2001:3: ( ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                alt16=2;
            }
            else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDefine.g:2002:3: ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) )
                    {
                    // InternalDefine.g:2002:3: ({...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) ) )
                    // InternalDefine.g:2003:4: {...}? => ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalDefine.g:2003:108: ( ( ( rule__DirectionBlock__InputAssignment_0 ) ) )
                    // InternalDefine.g:2004:5: ( ( rule__DirectionBlock__InputAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDefine.g:2010:5: ( ( rule__DirectionBlock__InputAssignment_0 ) )
                    // InternalDefine.g:2011:6: ( rule__DirectionBlock__InputAssignment_0 )
                    {
                     before(grammarAccess.getDirectionBlockAccess().getInputAssignment_0()); 
                    // InternalDefine.g:2012:6: ( rule__DirectionBlock__InputAssignment_0 )
                    // InternalDefine.g:2012:7: rule__DirectionBlock__InputAssignment_0
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
                    // InternalDefine.g:2017:3: ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) )
                    {
                    // InternalDefine.g:2017:3: ({...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) ) )
                    // InternalDefine.g:2018:4: {...}? => ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalDefine.g:2018:108: ( ( ( rule__DirectionBlock__InoutAssignment_1 ) ) )
                    // InternalDefine.g:2019:5: ( ( rule__DirectionBlock__InoutAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDefine.g:2025:5: ( ( rule__DirectionBlock__InoutAssignment_1 ) )
                    // InternalDefine.g:2026:6: ( rule__DirectionBlock__InoutAssignment_1 )
                    {
                     before(grammarAccess.getDirectionBlockAccess().getInoutAssignment_1()); 
                    // InternalDefine.g:2027:6: ( rule__DirectionBlock__InoutAssignment_1 )
                    // InternalDefine.g:2027:7: rule__DirectionBlock__InoutAssignment_1
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
                    // InternalDefine.g:2032:3: ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) )
                    {
                    // InternalDefine.g:2032:3: ({...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) ) )
                    // InternalDefine.g:2033:4: {...}? => ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DirectionBlock__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalDefine.g:2033:108: ( ( ( rule__DirectionBlock__OutputAssignment_2 ) ) )
                    // InternalDefine.g:2034:5: ( ( rule__DirectionBlock__OutputAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDefine.g:2040:5: ( ( rule__DirectionBlock__OutputAssignment_2 ) )
                    // InternalDefine.g:2041:6: ( rule__DirectionBlock__OutputAssignment_2 )
                    {
                     before(grammarAccess.getDirectionBlockAccess().getOutputAssignment_2()); 
                    // InternalDefine.g:2042:6: ( rule__DirectionBlock__OutputAssignment_2 )
                    // InternalDefine.g:2042:7: rule__DirectionBlock__OutputAssignment_2
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
    // InternalDefine.g:2055:1: rule__DirectionBlock__UnorderedGroup__0 : rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__1 )? ;
    public final void rule__DirectionBlock__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2059:1: ( rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__1 )? )
            // InternalDefine.g:2060:2: rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__DirectionBlock__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDefine.g:2061:2: ( rule__DirectionBlock__UnorderedGroup__1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDefine.g:2061:2: rule__DirectionBlock__UnorderedGroup__1
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
    // InternalDefine.g:2067:1: rule__DirectionBlock__UnorderedGroup__1 : rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__2 )? ;
    public final void rule__DirectionBlock__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2071:1: ( rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__2 )? )
            // InternalDefine.g:2072:2: rule__DirectionBlock__UnorderedGroup__Impl ( rule__DirectionBlock__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_22);
            rule__DirectionBlock__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDefine.g:2073:2: ( rule__DirectionBlock__UnorderedGroup__2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDefine.g:2073:2: rule__DirectionBlock__UnorderedGroup__2
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
    // InternalDefine.g:2079:1: rule__DirectionBlock__UnorderedGroup__2 : rule__DirectionBlock__UnorderedGroup__Impl ;
    public final void rule__DirectionBlock__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2083:1: ( rule__DirectionBlock__UnorderedGroup__Impl )
            // InternalDefine.g:2084:2: rule__DirectionBlock__UnorderedGroup__Impl
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
    // InternalDefine.g:2091:1: rule__DefineBlock__DirectionAssignment_2 : ( ruleDirectionBlock ) ;
    public final void rule__DefineBlock__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2095:1: ( ( ruleDirectionBlock ) )
            // InternalDefine.g:2096:2: ( ruleDirectionBlock )
            {
            // InternalDefine.g:2096:2: ( ruleDirectionBlock )
            // InternalDefine.g:2097:3: ruleDirectionBlock
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
    // InternalDefine.g:2106:1: rule__DirectionBlock__InputAssignment_0 : ( ruleInput ) ;
    public final void rule__DirectionBlock__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2110:1: ( ( ruleInput ) )
            // InternalDefine.g:2111:2: ( ruleInput )
            {
            // InternalDefine.g:2111:2: ( ruleInput )
            // InternalDefine.g:2112:3: ruleInput
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
    // InternalDefine.g:2121:1: rule__DirectionBlock__InoutAssignment_1 : ( ruleInout ) ;
    public final void rule__DirectionBlock__InoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2125:1: ( ( ruleInout ) )
            // InternalDefine.g:2126:2: ( ruleInout )
            {
            // InternalDefine.g:2126:2: ( ruleInout )
            // InternalDefine.g:2127:3: ruleInout
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
    // InternalDefine.g:2136:1: rule__DirectionBlock__OutputAssignment_2 : ( ruleOutput ) ;
    public final void rule__DirectionBlock__OutputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2140:1: ( ( ruleOutput ) )
            // InternalDefine.g:2141:2: ( ruleOutput )
            {
            // InternalDefine.g:2141:2: ( ruleOutput )
            // InternalDefine.g:2142:3: ruleOutput
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
    // InternalDefine.g:2151:1: rule__Input__InputVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Input__InputVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2155:1: ( ( ruleVariable ) )
            // InternalDefine.g:2156:2: ( ruleVariable )
            {
            // InternalDefine.g:2156:2: ( ruleVariable )
            // InternalDefine.g:2157:3: ruleVariable
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


    // $ANTLR start "rule__Inout__InoutVariablesAssignment_3"
    // InternalDefine.g:2166:1: rule__Inout__InoutVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Inout__InoutVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2170:1: ( ( ruleVariable ) )
            // InternalDefine.g:2171:2: ( ruleVariable )
            {
            // InternalDefine.g:2171:2: ( ruleVariable )
            // InternalDefine.g:2172:3: ruleVariable
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


    // $ANTLR start "rule__Output__OutputVariablesAssignment_3"
    // InternalDefine.g:2181:1: rule__Output__OutputVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Output__OutputVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2185:1: ( ( ruleVariable ) )
            // InternalDefine.g:2186:2: ( ruleVariable )
            {
            // InternalDefine.g:2186:2: ( ruleVariable )
            // InternalDefine.g:2187:3: ruleVariable
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


    // $ANTLR start "rule__Variable__VariableTypeAssignment_0_0"
    // InternalDefine.g:2196:1: rule__Variable__VariableTypeAssignment_0_0 : ( ruleVariableType ) ;
    public final void rule__Variable__VariableTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2200:1: ( ( ruleVariableType ) )
            // InternalDefine.g:2201:2: ( ruleVariableType )
            {
            // InternalDefine.g:2201:2: ( ruleVariableType )
            // InternalDefine.g:2202:3: ruleVariableType
            {
             before(grammarAccess.getVariableAccess().getVariableTypeVariableTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableTypeVariableTypeParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Variable__VariableTypeAssignment_0_0"


    // $ANTLR start "rule__Variable__VariableDefinitionAssignment_0_1"
    // InternalDefine.g:2211:1: rule__Variable__VariableDefinitionAssignment_0_1 : ( ruleVariableDefinition ) ;
    public final void rule__Variable__VariableDefinitionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2215:1: ( ( ruleVariableDefinition ) )
            // InternalDefine.g:2216:2: ( ruleVariableDefinition )
            {
            // InternalDefine.g:2216:2: ( ruleVariableDefinition )
            // InternalDefine.g:2217:3: ruleVariableDefinition
            {
             before(grammarAccess.getVariableAccess().getVariableDefinitionVariableDefinitionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableDefinitionVariableDefinitionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Variable__VariableDefinitionAssignment_0_1"


    // $ANTLR start "rule__Variable__VariantKeywordAssignment_1_0"
    // InternalDefine.g:2226:1: rule__Variable__VariantKeywordAssignment_1_0 : ( ( 'variant' ) ) ;
    public final void rule__Variable__VariantKeywordAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2230:1: ( ( ( 'variant' ) ) )
            // InternalDefine.g:2231:2: ( ( 'variant' ) )
            {
            // InternalDefine.g:2231:2: ( ( 'variant' ) )
            // InternalDefine.g:2232:3: ( 'variant' )
            {
             before(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0_0()); 
            // InternalDefine.g:2233:3: ( 'variant' )
            // InternalDefine.g:2234:4: 'variant'
            {
             before(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0_0()); 

            }

             after(grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Variable__VariantKeywordAssignment_1_0"


    // $ANTLR start "rule__Variable__VariantAssignment_1_1"
    // InternalDefine.g:2245:1: rule__Variable__VariantAssignment_1_1 : ( ruleVariant ) ;
    public final void rule__Variable__VariantAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2249:1: ( ( ruleVariant ) )
            // InternalDefine.g:2250:2: ( ruleVariant )
            {
            // InternalDefine.g:2250:2: ( ruleVariant )
            // InternalDefine.g:2251:3: ruleVariant
            {
             before(grammarAccess.getVariableAccess().getVariantVariantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariantVariantParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Variable__VariantAssignment_1_1"


    // $ANTLR start "rule__Variable__UdtAssignment_2"
    // InternalDefine.g:2260:1: rule__Variable__UdtAssignment_2 : ( ruleUdt ) ;
    public final void rule__Variable__UdtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2264:1: ( ( ruleUdt ) )
            // InternalDefine.g:2265:2: ( ruleUdt )
            {
            // InternalDefine.g:2265:2: ( ruleUdt )
            // InternalDefine.g:2266:3: ruleUdt
            {
             before(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUdt();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variable__UdtAssignment_2"


    // $ANTLR start "rule__VariableDefinition__VariableNameAssignment_0"
    // InternalDefine.g:2275:1: rule__VariableDefinition__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2279:1: ( ( RULE_ID ) )
            // InternalDefine.g:2280:2: ( RULE_ID )
            {
            // InternalDefine.g:2280:2: ( RULE_ID )
            // InternalDefine.g:2281:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVariableNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VariableNameAssignment_0"


    // $ANTLR start "rule__VariableDefinition__ExpressionAssignment_1_1"
    // InternalDefine.g:2290:1: rule__VariableDefinition__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableDefinition__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2294:1: ( ( ruleExpression ) )
            // InternalDefine.g:2295:2: ( ruleExpression )
            {
            // InternalDefine.g:2295:2: ( ruleExpression )
            // InternalDefine.g:2296:3: ruleExpression
            {
             before(grammarAccess.getVariableDefinitionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__VariableDefinition__ExpressionAssignment_1_1"


    // $ANTLR start "rule__VariableDefinition__RangeAssignment_1_2_1"
    // InternalDefine.g:2305:1: rule__VariableDefinition__RangeAssignment_1_2_1 : ( ruleExpression ) ;
    public final void rule__VariableDefinition__RangeAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2309:1: ( ( ruleExpression ) )
            // InternalDefine.g:2310:2: ( ruleExpression )
            {
            // InternalDefine.g:2310:2: ( ruleExpression )
            // InternalDefine.g:2311:3: ruleExpression
            {
             before(grammarAccess.getVariableDefinitionAccess().getRangeExpressionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getRangeExpressionParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__VariableDefinition__RangeAssignment_1_2_1"


    // $ANTLR start "rule__VariableDefinition__NextVariableAssignment_2_1"
    // InternalDefine.g:2320:1: rule__VariableDefinition__NextVariableAssignment_2_1 : ( ( ',' ) ) ;
    public final void rule__VariableDefinition__NextVariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2324:1: ( ( ( ',' ) ) )
            // InternalDefine.g:2325:2: ( ( ',' ) )
            {
            // InternalDefine.g:2325:2: ( ( ',' ) )
            // InternalDefine.g:2326:3: ( ',' )
            {
             before(grammarAccess.getVariableDefinitionAccess().getNextVariableCommaKeyword_2_1_0()); 
            // InternalDefine.g:2327:3: ( ',' )
            // InternalDefine.g:2328:4: ','
            {
             before(grammarAccess.getVariableDefinitionAccess().getNextVariableCommaKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getNextVariableCommaKeyword_2_1_0()); 

            }

             after(grammarAccess.getVariableDefinitionAccess().getNextVariableCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__VariableDefinition__NextVariableAssignment_2_1"


    // $ANTLR start "rule__Variant__VariantNameAssignment_0"
    // InternalDefine.g:2339:1: rule__Variant__VariantNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variant__VariantNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2343:1: ( ( RULE_ID ) )
            // InternalDefine.g:2344:2: ( RULE_ID )
            {
            // InternalDefine.g:2344:2: ( RULE_ID )
            // InternalDefine.g:2345:3: RULE_ID
            {
             before(grammarAccess.getVariantAccess().getVariantNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariantAccess().getVariantNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variant__VariantNameAssignment_0"


    // $ANTLR start "rule__Variant__VariantTypeAssignment_2"
    // InternalDefine.g:2354:1: rule__Variant__VariantTypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__Variant__VariantTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2358:1: ( ( ruleVariableType ) )
            // InternalDefine.g:2359:2: ( ruleVariableType )
            {
            // InternalDefine.g:2359:2: ( ruleVariableType )
            // InternalDefine.g:2360:3: ruleVariableType
            {
             before(grammarAccess.getVariantAccess().getVariantTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getVariantTypeVariableTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variant__VariantTypeAssignment_2"


    // $ANTLR start "rule__Variant__NextVariantAssignment_4_1"
    // InternalDefine.g:2369:1: rule__Variant__NextVariantAssignment_4_1 : ( ( ',' ) ) ;
    public final void rule__Variant__NextVariantAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2373:1: ( ( ( ',' ) ) )
            // InternalDefine.g:2374:2: ( ( ',' ) )
            {
            // InternalDefine.g:2374:2: ( ( ',' ) )
            // InternalDefine.g:2375:3: ( ',' )
            {
             before(grammarAccess.getVariantAccess().getNextVariantCommaKeyword_4_1_0()); 
            // InternalDefine.g:2376:3: ( ',' )
            // InternalDefine.g:2377:4: ','
            {
             before(grammarAccess.getVariantAccess().getNextVariantCommaKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariantAccess().getNextVariantCommaKeyword_4_1_0()); 

            }

             after(grammarAccess.getVariantAccess().getNextVariantCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Variant__NextVariantAssignment_4_1"


    // $ANTLR start "rule__Udt__UdtNameAssignment_1"
    // InternalDefine.g:2388:1: rule__Udt__UdtNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Udt__UdtNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2392:1: ( ( RULE_ID ) )
            // InternalDefine.g:2393:2: ( RULE_ID )
            {
            // InternalDefine.g:2393:2: ( RULE_ID )
            // InternalDefine.g:2394:3: RULE_ID
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
    // InternalDefine.g:2403:1: rule__Udt__UdtTypesAssignment_3 : ( ruleUdtType ) ;
    public final void rule__Udt__UdtTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2407:1: ( ( ruleUdtType ) )
            // InternalDefine.g:2408:2: ( ruleUdtType )
            {
            // InternalDefine.g:2408:2: ( ruleUdtType )
            // InternalDefine.g:2409:3: ruleUdtType
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
    // InternalDefine.g:2418:1: rule__Udt__UdtVariablesAssignment_6 : ( ruleVariable ) ;
    public final void rule__Udt__UdtVariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2422:1: ( ( ruleVariable ) )
            // InternalDefine.g:2423:2: ( ruleVariable )
            {
            // InternalDefine.g:2423:2: ( ruleVariable )
            // InternalDefine.g:2424:3: ruleVariable
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
    // InternalDefine.g:2433:1: rule__UdtType__UdtTypeNameAssignment : ( RULE_ID ) ;
    public final void rule__UdtType__UdtTypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2437:1: ( ( RULE_ID ) )
            // InternalDefine.g:2438:2: ( RULE_ID )
            {
            // InternalDefine.g:2438:2: ( RULE_ID )
            // InternalDefine.g:2439:3: RULE_ID
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


    // $ANTLR start "rule__VariableType__BasicTypesAssignment_1_0"
    // InternalDefine.g:2448:1: rule__VariableType__BasicTypesAssignment_1_0 : ( ( rule__VariableType__BasicTypesAlternatives_1_0_0 ) ) ;
    public final void rule__VariableType__BasicTypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2452:1: ( ( ( rule__VariableType__BasicTypesAlternatives_1_0_0 ) ) )
            // InternalDefine.g:2453:2: ( ( rule__VariableType__BasicTypesAlternatives_1_0_0 ) )
            {
            // InternalDefine.g:2453:2: ( ( rule__VariableType__BasicTypesAlternatives_1_0_0 ) )
            // InternalDefine.g:2454:3: ( rule__VariableType__BasicTypesAlternatives_1_0_0 )
            {
             before(grammarAccess.getVariableTypeAccess().getBasicTypesAlternatives_1_0_0()); 
            // InternalDefine.g:2455:3: ( rule__VariableType__BasicTypesAlternatives_1_0_0 )
            // InternalDefine.g:2455:4: rule__VariableType__BasicTypesAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__BasicTypesAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getBasicTypesAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__VariableType__BasicTypesAssignment_1_0"


    // $ANTLR start "rule__VariableType__SpecifiedUdtTypeAssignment_1_1"
    // InternalDefine.g:2463:1: rule__VariableType__SpecifiedUdtTypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableType__SpecifiedUdtTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2467:1: ( ( ( RULE_ID ) ) )
            // InternalDefine.g:2468:2: ( ( RULE_ID ) )
            {
            // InternalDefine.g:2468:2: ( ( RULE_ID ) )
            // InternalDefine.g:2469:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeUdtTypeCrossReference_1_1_0()); 
            // InternalDefine.g:2470:3: ( RULE_ID )
            // InternalDefine.g:2471:4: RULE_ID
            {
             before(grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeUdtTypeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeUdtTypeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeUdtTypeCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__VariableType__SpecifiedUdtTypeAssignment_1_1"


    // $ANTLR start "rule__Expression__ValueAssignment_0_1"
    // InternalDefine.g:2482:1: rule__Expression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Expression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2486:1: ( ( RULE_INT ) )
            // InternalDefine.g:2487:2: ( RULE_INT )
            {
            // InternalDefine.g:2487:2: ( RULE_INT )
            // InternalDefine.g:2488:3: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_0_1"


    // $ANTLR start "rule__Expression__ValueAssignment_1_1"
    // InternalDefine.g:2497:1: rule__Expression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2501:1: ( ( RULE_STRING ) )
            // InternalDefine.g:2502:2: ( RULE_STRING )
            {
            // InternalDefine.g:2502:2: ( RULE_STRING )
            // InternalDefine.g:2503:3: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_1_1"


    // $ANTLR start "rule__Expression__ValueAssignment_2_1"
    // InternalDefine.g:2512:1: rule__Expression__ValueAssignment_2_1 : ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Expression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2516:1: ( ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) )
            // InternalDefine.g:2517:2: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            {
            // InternalDefine.g:2517:2: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            // InternalDefine.g:2518:3: ( rule__Expression__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 
            // InternalDefine.g:2519:3: ( rule__Expression__ValueAlternatives_2_1_0 )
            // InternalDefine.g:2519:4: rule__Expression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_2_1"


    // $ANTLR start "rule__Expression__VariableAssignment_3_1"
    // InternalDefine.g:2527:1: rule__Expression__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Expression__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDefine.g:2531:1: ( ( ( RULE_ID ) ) )
            // InternalDefine.g:2532:2: ( ( RULE_ID ) )
            {
            // InternalDefine.g:2532:2: ( ( RULE_ID ) )
            // InternalDefine.g:2533:3: ( RULE_ID )
            {
             before(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); 
            // InternalDefine.g:2534:3: ( RULE_ID )
            // InternalDefine.g:2535:4: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Expression__VariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001900000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060407010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000060007012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000082000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060087010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001900002L});

}
