package org.xtext.eis.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.eis.services.EisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LONG", "RULE_NEGATIVE_LONG", "RULE_REAL", "RULE_BYTE", "RULE_WORD", "RULE_DWORD", "RULE_LWORD", "RULE_CHAR", "RULE_TIME", "RULE_LTIME", "RULE_DATE", "RULE_X", "RULE_HEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'", "'author'", "'testcase'", "'('", "','", "')'", "'{'", "'}'", "'true'", "'false'", "'FC'", "'FB'", "'define'", "'input'", "'['", "']'", "'output'", "'inout'", "'variant'", "'+/-'", "'udt'", "'teststep'", "'set'", "'assert'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'null'", "'int'", "'bool'", "'real'", "'string'", "'char'", "'byte'", "'word'", "'dword'", "'lword'", "'usint'", "'uint'", "'udint'", "'ulint'", "'sint'", "'dint'", "'lint'", "'time'", "'ltime'", "'date'", "'lreal'", "'wchar'"
    };
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
    public static final int RULE_NEGATIVE_LONG=7;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int RULE_LONG=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__43=43;

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

        public InternalEisParser(TokenStream input, EisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EisModel";
       	}

       	@Override
       	protected EisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEisModel"
    // InternalEis.g:65:1: entryRuleEisModel returns [EObject current=null] : iv_ruleEisModel= ruleEisModel EOF ;
    public final EObject entryRuleEisModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEisModel = null;


        try {
            // InternalEis.g:65:49: (iv_ruleEisModel= ruleEisModel EOF )
            // InternalEis.g:66:2: iv_ruleEisModel= ruleEisModel EOF
            {
             newCompositeNode(grammarAccess.getEisModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEisModel=ruleEisModel();

            state._fsp--;

             current =iv_ruleEisModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEisModel"


    // $ANTLR start "ruleEisModel"
    // InternalEis.g:72:1: ruleEisModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_testcases_13_0= ruleTestcase ) )* ) ;
    public final EObject ruleEisModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_projectName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_plcName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_authorName_11_0=null;
        Token otherlv_12=null;
        EObject lv_testcases_13_0 = null;



        	enterRule();

        try {
            // InternalEis.g:78:2: ( ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_testcases_13_0= ruleTestcase ) )* ) )
            // InternalEis.g:79:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_testcases_13_0= ruleTestcase ) )* )
            {
            // InternalEis.g:79:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_testcases_13_0= ruleTestcase ) )* )
            // InternalEis.g:80:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_testcases_13_0= ruleTestcase ) )*
            {
            // InternalEis.g:80:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:81:4: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:81:4: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // InternalEis.g:82:5: ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEisModelAccess().getUnorderedGroup_0());
            				
            // InternalEis.g:85:5: ( ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // InternalEis.g:86:6: ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // InternalEis.g:86:6: ( ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 2) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:87:4: ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // InternalEis.g:87:4: ({...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) ) )
            	    // InternalEis.g:88:5: {...}? => ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEisModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalEis.g:88:105: ( ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) ) )
            	    // InternalEis.g:89:6: ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalEis.g:92:9: ({...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            	    // InternalEis.g:92:10: {...}? => (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEisModel", "true");
            	    }
            	    // InternalEis.g:92:19: (otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';' )
            	    // InternalEis.g:92:20: otherlv_1= 'project' otherlv_2= '=' ( (lv_projectName_3_0= RULE_STRING ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_1, grammarAccess.getEisModelAccess().getProjectKeyword_0_0_0());
            	    								
            	    otherlv_2=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEisModelAccess().getEqualsSignKeyword_0_0_1());
            	    								
            	    // InternalEis.g:100:9: ( (lv_projectName_3_0= RULE_STRING ) )
            	    // InternalEis.g:101:10: (lv_projectName_3_0= RULE_STRING )
            	    {
            	    // InternalEis.g:101:10: (lv_projectName_3_0= RULE_STRING )
            	    // InternalEis.g:102:11: lv_projectName_3_0= RULE_STRING
            	    {
            	    lv_projectName_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    											newLeafNode(lv_projectName_3_0, grammarAccess.getEisModelAccess().getProjectNameSTRINGTerminalRuleCall_0_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEisModelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"projectName",
            	    												lv_projectName_3_0,
            	    												"org.xtext.eis.Eis.STRING");
            	    										

            	    }


            	    }

            	    otherlv_4=(Token)match(input,25,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEisModelAccess().getSemicolonKeyword_0_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEisModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEis.g:128:4: ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalEis.g:128:4: ({...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
            	    // InternalEis.g:129:5: {...}? => ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEisModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalEis.g:129:105: ( ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
            	    // InternalEis.g:130:6: ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalEis.g:133:9: ({...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            	    // InternalEis.g:133:10: {...}? => (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEisModel", "true");
            	    }
            	    // InternalEis.g:133:19: (otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';' )
            	    // InternalEis.g:133:20: otherlv_5= 'plcname' otherlv_6= '=' ( (lv_plcName_7_0= RULE_STRING ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEisModelAccess().getPlcnameKeyword_0_1_0());
            	    								
            	    otherlv_6=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEisModelAccess().getEqualsSignKeyword_0_1_1());
            	    								
            	    // InternalEis.g:141:9: ( (lv_plcName_7_0= RULE_STRING ) )
            	    // InternalEis.g:142:10: (lv_plcName_7_0= RULE_STRING )
            	    {
            	    // InternalEis.g:142:10: (lv_plcName_7_0= RULE_STRING )
            	    // InternalEis.g:143:11: lv_plcName_7_0= RULE_STRING
            	    {
            	    lv_plcName_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    											newLeafNode(lv_plcName_7_0, grammarAccess.getEisModelAccess().getPlcNameSTRINGTerminalRuleCall_0_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEisModelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"plcName",
            	    												lv_plcName_7_0,
            	    												"org.xtext.eis.Eis.STRING");
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,25,FOLLOW_6); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEisModelAccess().getSemicolonKeyword_0_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEisModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEis.g:169:4: ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // InternalEis.g:169:4: ({...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
            	    // InternalEis.g:170:5: {...}? => ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEisModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalEis.g:170:105: ( ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
            	    // InternalEis.g:171:6: ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEisModelAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalEis.g:174:9: ({...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
            	    // InternalEis.g:174:10: {...}? => (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEisModel", "true");
            	    }
            	    // InternalEis.g:174:19: (otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';' )
            	    // InternalEis.g:174:20: otherlv_9= 'author' otherlv_10= '=' ( (lv_authorName_11_0= RULE_STRING ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEisModelAccess().getAuthorKeyword_0_2_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEisModelAccess().getEqualsSignKeyword_0_2_1());
            	    								
            	    // InternalEis.g:182:9: ( (lv_authorName_11_0= RULE_STRING ) )
            	    // InternalEis.g:183:10: (lv_authorName_11_0= RULE_STRING )
            	    {
            	    // InternalEis.g:183:10: (lv_authorName_11_0= RULE_STRING )
            	    // InternalEis.g:184:11: lv_authorName_11_0= RULE_STRING
            	    {
            	    lv_authorName_11_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    											newLeafNode(lv_authorName_11_0, grammarAccess.getEisModelAccess().getAuthorNameSTRINGTerminalRuleCall_0_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEisModelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"authorName",
            	    												lv_authorName_11_0,
            	    												"org.xtext.eis.Eis.STRING");
            	    										

            	    }


            	    }

            	    otherlv_12=(Token)match(input,25,FOLLOW_6); 

            	    									newLeafNode(otherlv_12, grammarAccess.getEisModelAccess().getSemicolonKeyword_0_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEisModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEisModelAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleEisModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getEisModelAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEisModelAccess().getUnorderedGroup_0());
            				

            }

            // InternalEis.g:218:3: ( (lv_testcases_13_0= ruleTestcase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEis.g:219:4: (lv_testcases_13_0= ruleTestcase )
            	    {
            	    // InternalEis.g:219:4: (lv_testcases_13_0= ruleTestcase )
            	    // InternalEis.g:220:5: lv_testcases_13_0= ruleTestcase
            	    {

            	    					newCompositeNode(grammarAccess.getEisModelAccess().getTestcasesTestcaseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_testcases_13_0=ruleTestcase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEisModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testcases",
            	    						lv_testcases_13_0,
            	    						"org.xtext.eis.Eis.Testcase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleEisModel"


    // $ANTLR start "entryRuleTestcase"
    // InternalEis.g:241:1: entryRuleTestcase returns [EObject current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final EObject entryRuleTestcase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestcase = null;


        try {
            // InternalEis.g:241:49: (iv_ruleTestcase= ruleTestcase EOF )
            // InternalEis.g:242:2: iv_ruleTestcase= ruleTestcase EOF
            {
             newCompositeNode(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestcase=ruleTestcase();

            state._fsp--;

             current =iv_ruleTestcase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestcase"


    // $ANTLR start "ruleTestcase"
    // InternalEis.g:248:1: ruleTestcase returns [EObject current=null] : (otherlv_0= 'testcase' ( (lv_testcaseName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_testActive_3_0= ruleBoolConstant ) ) otherlv_4= ',' ( (lv_blockType_5_0= ruleBlockConstant ) ) otherlv_6= ',' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_define_10_0= ruleDefineBlock ) )? otherlv_11= '}' ) ;
    public final EObject ruleTestcase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_testcaseName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_testActive_3_0 = null;

        EObject lv_blockType_5_0 = null;

        EObject lv_define_10_0 = null;



        	enterRule();

        try {
            // InternalEis.g:254:2: ( (otherlv_0= 'testcase' ( (lv_testcaseName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_testActive_3_0= ruleBoolConstant ) ) otherlv_4= ',' ( (lv_blockType_5_0= ruleBlockConstant ) ) otherlv_6= ',' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_define_10_0= ruleDefineBlock ) )? otherlv_11= '}' ) )
            // InternalEis.g:255:2: (otherlv_0= 'testcase' ( (lv_testcaseName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_testActive_3_0= ruleBoolConstant ) ) otherlv_4= ',' ( (lv_blockType_5_0= ruleBlockConstant ) ) otherlv_6= ',' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_define_10_0= ruleDefineBlock ) )? otherlv_11= '}' )
            {
            // InternalEis.g:255:2: (otherlv_0= 'testcase' ( (lv_testcaseName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_testActive_3_0= ruleBoolConstant ) ) otherlv_4= ',' ( (lv_blockType_5_0= ruleBlockConstant ) ) otherlv_6= ',' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_define_10_0= ruleDefineBlock ) )? otherlv_11= '}' )
            // InternalEis.g:256:3: otherlv_0= 'testcase' ( (lv_testcaseName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_testActive_3_0= ruleBoolConstant ) ) otherlv_4= ',' ( (lv_blockType_5_0= ruleBlockConstant ) ) otherlv_6= ',' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_define_10_0= ruleDefineBlock ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0());
            		
            // InternalEis.g:260:3: ( (lv_testcaseName_1_0= RULE_ID ) )
            // InternalEis.g:261:4: (lv_testcaseName_1_0= RULE_ID )
            {
            // InternalEis.g:261:4: (lv_testcaseName_1_0= RULE_ID )
            // InternalEis.g:262:5: lv_testcaseName_1_0= RULE_ID
            {
            lv_testcaseName_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_testcaseName_1_0, grammarAccess.getTestcaseAccess().getTestcaseNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestcaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"testcaseName",
            						lv_testcaseName_1_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTestcaseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEis.g:282:3: ( (lv_testActive_3_0= ruleBoolConstant ) )
            // InternalEis.g:283:4: (lv_testActive_3_0= ruleBoolConstant )
            {
            // InternalEis.g:283:4: (lv_testActive_3_0= ruleBoolConstant )
            // InternalEis.g:284:5: lv_testActive_3_0= ruleBoolConstant
            {

            					newCompositeNode(grammarAccess.getTestcaseAccess().getTestActiveBoolConstantParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_testActive_3_0=ruleBoolConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestcaseRule());
            					}
            					set(
            						current,
            						"testActive",
            						lv_testActive_3_0,
            						"org.xtext.eis.Eis.BoolConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getTestcaseAccess().getCommaKeyword_4());
            		
            // InternalEis.g:305:3: ( (lv_blockType_5_0= ruleBlockConstant ) )
            // InternalEis.g:306:4: (lv_blockType_5_0= ruleBlockConstant )
            {
            // InternalEis.g:306:4: (lv_blockType_5_0= ruleBlockConstant )
            // InternalEis.g:307:5: lv_blockType_5_0= ruleBlockConstant
            {

            					newCompositeNode(grammarAccess.getTestcaseAccess().getBlockTypeBlockConstantParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_blockType_5_0=ruleBlockConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestcaseRule());
            					}
            					set(
            						current,
            						"blockType",
            						lv_blockType_5_0,
            						"org.xtext.eis.Eis.BlockConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getTestcaseAccess().getCommaKeyword_6());
            		
            // InternalEis.g:328:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalEis.g:329:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalEis.g:329:4: (lv_description_7_0= RULE_STRING )
            // InternalEis.g:330:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_description_7_0, grammarAccess.getTestcaseAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestcaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getTestcaseAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalEis.g:354:3: ( (lv_define_10_0= ruleDefineBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEis.g:355:4: (lv_define_10_0= ruleDefineBlock )
                    {
                    // InternalEis.g:355:4: (lv_define_10_0= ruleDefineBlock )
                    // InternalEis.g:356:5: lv_define_10_0= ruleDefineBlock
                    {

                    					newCompositeNode(grammarAccess.getTestcaseAccess().getDefineDefineBlockParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_define_10_0=ruleDefineBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestcaseRule());
                    					}
                    					set(
                    						current,
                    						"define",
                    						lv_define_10_0,
                    						"org.xtext.eis.Eis.DefineBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleTestcase"


    // $ANTLR start "entryRuleBoolConstant"
    // InternalEis.g:381:1: entryRuleBoolConstant returns [EObject current=null] : iv_ruleBoolConstant= ruleBoolConstant EOF ;
    public final EObject entryRuleBoolConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstant = null;


        try {
            // InternalEis.g:381:53: (iv_ruleBoolConstant= ruleBoolConstant EOF )
            // InternalEis.g:382:2: iv_ruleBoolConstant= ruleBoolConstant EOF
            {
             newCompositeNode(grammarAccess.getBoolConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolConstant=ruleBoolConstant();

            state._fsp--;

             current =iv_ruleBoolConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolConstant"


    // $ANTLR start "ruleBoolConstant"
    // InternalEis.g:388:1: ruleBoolConstant returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEis.g:394:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalEis.g:395:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalEis.g:395:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalEis.g:396:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalEis.g:396:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalEis.g:397:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalEis.g:397:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEis.g:398:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolConstantAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEis.g:409:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBoolConstantAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleBoolConstant"


    // $ANTLR start "entryRuleBlockConstant"
    // InternalEis.g:425:1: entryRuleBlockConstant returns [EObject current=null] : iv_ruleBlockConstant= ruleBlockConstant EOF ;
    public final EObject entryRuleBlockConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockConstant = null;


        try {
            // InternalEis.g:425:54: (iv_ruleBlockConstant= ruleBlockConstant EOF )
            // InternalEis.g:426:2: iv_ruleBlockConstant= ruleBlockConstant EOF
            {
             newCompositeNode(grammarAccess.getBlockConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockConstant=ruleBlockConstant();

            state._fsp--;

             current =iv_ruleBlockConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlockConstant"


    // $ANTLR start "ruleBlockConstant"
    // InternalEis.g:432:1: ruleBlockConstant returns [EObject current=null] : ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) ) ;
    public final EObject ruleBlockConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEis.g:438:2: ( ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) ) )
            // InternalEis.g:439:2: ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) )
            {
            // InternalEis.g:439:2: ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) )
            // InternalEis.g:440:3: ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) )
            {
            // InternalEis.g:440:3: ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) )
            // InternalEis.g:441:4: (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' )
            {
            // InternalEis.g:441:4: (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEis.g:442:5: lv_value_0_1= 'FC'
                    {
                    lv_value_0_1=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBlockConstantAccess().getValueFCKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBlockConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEis.g:453:5: lv_value_0_2= 'FB'
                    {
                    lv_value_0_2=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBlockConstantAccess().getValueFBKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBlockConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
        }
        return current;
    }
    // $ANTLR end "ruleBlockConstant"


    // $ANTLR start "entryRuleDefineBlock"
    // InternalEis.g:469:1: entryRuleDefineBlock returns [EObject current=null] : iv_ruleDefineBlock= ruleDefineBlock EOF ;
    public final EObject entryRuleDefineBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineBlock = null;


        try {
            // InternalEis.g:469:52: (iv_ruleDefineBlock= ruleDefineBlock EOF )
            // InternalEis.g:470:2: iv_ruleDefineBlock= ruleDefineBlock EOF
            {
             newCompositeNode(grammarAccess.getDefineBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineBlock=ruleDefineBlock();

            state._fsp--;

             current =iv_ruleDefineBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefineBlock"


    // $ANTLR start "ruleDefineBlock"
    // InternalEis.g:476:1: ruleDefineBlock returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* ) ;
    public final EObject ruleDefineBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_direction_2_0 = null;

        EObject lv_teststeps_4_0 = null;



        	enterRule();

        try {
            // InternalEis.g:482:2: ( (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* ) )
            // InternalEis.g:483:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* )
            {
            // InternalEis.g:483:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* )
            // InternalEis.g:484:3: otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineBlockAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEis.g:492:3: ( (lv_direction_2_0= ruleDirectionBlock ) )
            // InternalEis.g:493:4: (lv_direction_2_0= ruleDirectionBlock )
            {
            // InternalEis.g:493:4: (lv_direction_2_0= ruleDirectionBlock )
            // InternalEis.g:494:5: lv_direction_2_0= ruleDirectionBlock
            {

            					newCompositeNode(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_direction_2_0=ruleDirectionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineBlockRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"org.xtext.eis.Eis.DirectionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalEis.g:515:3: ( (lv_teststeps_4_0= ruleTeststepBlock ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==47) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEis.g:516:4: (lv_teststeps_4_0= ruleTeststepBlock )
            	    {
            	    // InternalEis.g:516:4: (lv_teststeps_4_0= ruleTeststepBlock )
            	    // InternalEis.g:517:5: lv_teststeps_4_0= ruleTeststepBlock
            	    {

            	    					newCompositeNode(grammarAccess.getDefineBlockAccess().getTeststepsTeststepBlockParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_teststeps_4_0=ruleTeststepBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefineBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teststeps",
            	    						lv_teststeps_4_0,
            	    						"org.xtext.eis.Eis.TeststepBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleDefineBlock"


    // $ANTLR start "entryRuleDirectionBlock"
    // InternalEis.g:538:1: entryRuleDirectionBlock returns [EObject current=null] : iv_ruleDirectionBlock= ruleDirectionBlock EOF ;
    public final EObject entryRuleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionBlock = null;


        try {
            // InternalEis.g:538:55: (iv_ruleDirectionBlock= ruleDirectionBlock EOF )
            // InternalEis.g:539:2: iv_ruleDirectionBlock= ruleDirectionBlock EOF
            {
             newCompositeNode(grammarAccess.getDirectionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectionBlock=ruleDirectionBlock();

            state._fsp--;

             current =iv_ruleDirectionBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDirectionBlock"


    // $ANTLR start "ruleDirectionBlock"
    // InternalEis.g:545:1: ruleDirectionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_input_1_0 = null;

        EObject lv_output_2_0 = null;

        EObject lv_inout_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:551:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:552:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:552:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:553:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:553:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:554:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:557:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?)
            // InternalEis.g:558:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:558:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEis.g:559:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    {
            	    // InternalEis.g:559:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    // InternalEis.g:560:4: {...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:560:108: ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    // InternalEis.g:561:5: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:564:8: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    // InternalEis.g:564:9: {...}? => ( (lv_input_1_0= ruleInput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:564:18: ( (lv_input_1_0= ruleInput ) )
            	    // InternalEis.g:564:19: (lv_input_1_0= ruleInput )
            	    {
            	    // InternalEis.g:564:19: (lv_input_1_0= ruleInput )
            	    // InternalEis.g:565:9: lv_input_1_0= ruleInput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInputInputParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_19);
            	    lv_input_1_0=ruleInput();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"input",
            	    										lv_input_1_0,
            	    										"org.xtext.eis.Eis.Input");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEis.g:587:3: ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) )
            	    {
            	    // InternalEis.g:587:3: ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) )
            	    // InternalEis.g:588:4: {...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:588:108: ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) )
            	    // InternalEis.g:589:5: ({...}? => ( (lv_output_2_0= ruleOutput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:592:8: ({...}? => ( (lv_output_2_0= ruleOutput ) ) )
            	    // InternalEis.g:592:9: {...}? => ( (lv_output_2_0= ruleOutput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:592:18: ( (lv_output_2_0= ruleOutput ) )
            	    // InternalEis.g:592:19: (lv_output_2_0= ruleOutput )
            	    {
            	    // InternalEis.g:592:19: (lv_output_2_0= ruleOutput )
            	    // InternalEis.g:593:9: lv_output_2_0= ruleOutput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_19);
            	    lv_output_2_0=ruleOutput();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"output",
            	    										lv_output_2_0,
            	    										"org.xtext.eis.Eis.Output");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEis.g:615:3: ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) )
            	    {
            	    // InternalEis.g:615:3: ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) )
            	    // InternalEis.g:616:4: {...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEis.g:616:108: ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) )
            	    // InternalEis.g:617:5: ({...}? => ( (lv_inout_3_0= ruleInOut ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalEis.g:620:8: ({...}? => ( (lv_inout_3_0= ruleInOut ) ) )
            	    // InternalEis.g:620:9: {...}? => ( (lv_inout_3_0= ruleInOut ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:620:18: ( (lv_inout_3_0= ruleInOut ) )
            	    // InternalEis.g:620:19: (lv_inout_3_0= ruleInOut )
            	    {
            	    // InternalEis.g:620:19: (lv_inout_3_0= ruleInOut )
            	    // InternalEis.g:621:9: lv_inout_3_0= ruleInOut
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInoutInOutParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_19);
            	    lv_inout_3_0=ruleInOut();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"inout",
            	    										lv_inout_3_0,
            	    										"org.xtext.eis.Eis.InOut");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canLeave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleDirectionBlock"


    // $ANTLR start "entryRuleInput"
    // InternalEis.g:654:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalEis.g:654:46: (iv_ruleInput= ruleInput EOF )
            // InternalEis.g:655:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalEis.g:661:1: ruleInput returns [EObject current=null] : ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:667:2: ( ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:668:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:668:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:669:3: ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:669:3: ( (lv_name_0_0= 'input' ) )
            // InternalEis.g:670:4: (lv_name_0_0= 'input' )
            {
            // InternalEis.g:670:4: (lv_name_0_0= 'input' )
            // InternalEis.g:671:5: lv_name_0_0= 'input'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInputAccess().getNameInputKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "input");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:687:3: ( (lv_inputVariables_2_0= ruleVariables ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==44||LA8_0==46||(LA8_0>=64 && LA8_0<=85)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEis.g:688:4: (lv_inputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:688:4: (lv_inputVariables_2_0= ruleVariables )
            	    // InternalEis.g:689:5: lv_inputVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getInputVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_inputVariables_2_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputVariables",
            	    						lv_inputVariables_2_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalEis.g:714:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalEis.g:714:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalEis.g:715:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalEis.g:721:1: ruleOutput returns [EObject current=null] : ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_outputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:727:2: ( ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:728:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:728:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:729:3: ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:729:3: ( (lv_name_0_0= 'output' ) )
            // InternalEis.g:730:4: (lv_name_0_0= 'output' )
            {
            // InternalEis.g:730:4: (lv_name_0_0= 'output' )
            // InternalEis.g:731:5: lv_name_0_0= 'output'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOutputAccess().getNameOutputKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "output");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:747:3: ( (lv_outputVariables_2_0= ruleVariables ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==44||LA9_0==46||(LA9_0>=64 && LA9_0<=85)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEis.g:748:4: (lv_outputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:748:4: (lv_outputVariables_2_0= ruleVariables )
            	    // InternalEis.g:749:5: lv_outputVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getOutputAccess().getOutputVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_outputVariables_2_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputVariables",
            	    						lv_outputVariables_2_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInOut"
    // InternalEis.g:774:1: entryRuleInOut returns [EObject current=null] : iv_ruleInOut= ruleInOut EOF ;
    public final EObject entryRuleInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOut = null;


        try {
            // InternalEis.g:774:46: (iv_ruleInOut= ruleInOut EOF )
            // InternalEis.g:775:2: iv_ruleInOut= ruleInOut EOF
            {
             newCompositeNode(grammarAccess.getInOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInOut=ruleInOut();

            state._fsp--;

             current =iv_ruleInOut; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInOut"


    // $ANTLR start "ruleInOut"
    // InternalEis.g:781:1: ruleInOut returns [EObject current=null] : ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInOut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inoutVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:787:2: ( ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:788:2: ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:788:2: ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:789:3: ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:789:3: ( (lv_name_0_0= 'inout' ) )
            // InternalEis.g:790:4: (lv_name_0_0= 'inout' )
            {
            // InternalEis.g:790:4: (lv_name_0_0= 'inout' )
            // InternalEis.g:791:5: lv_name_0_0= 'inout'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInOutAccess().getNameInoutKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInOutRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "inout");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getInOutAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:807:3: ( (lv_inoutVariables_2_0= ruleVariables ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==44||LA10_0==46||(LA10_0>=64 && LA10_0<=85)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEis.g:808:4: (lv_inoutVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:808:4: (lv_inoutVariables_2_0= ruleVariables )
            	    // InternalEis.g:809:5: lv_inoutVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getInOutAccess().getInoutVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_inoutVariables_2_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInOutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inoutVariables",
            	    						lv_inoutVariables_2_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInOutAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInOut"


    // $ANTLR start "entryRuleVariables"
    // InternalEis.g:834:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalEis.g:834:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalEis.g:835:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalEis.g:841:1: ruleVariables returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Udt_1 = null;

        EObject this_UdtRef_2 = null;



        	enterRule();

        try {
            // InternalEis.g:847:2: ( (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) )
            // InternalEis.g:848:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            {
            // InternalEis.g:848:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 44:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID) ) {
                    alt11=3;
                }
                else if ( ((LA11_2>=24 && LA11_2<=25)||LA11_2==30) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEis.g:849:3: this_Variable_0= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getVariablesAccess().getVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEis.g:858:3: this_Udt_1= ruleUdt
                    {

                    			newCompositeNode(grammarAccess.getVariablesAccess().getUdtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Udt_1=ruleUdt();

                    state._fsp--;


                    			current = this_Udt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEis.g:867:3: this_UdtRef_2= ruleUdtRef
                    {

                    			newCompositeNode(grammarAccess.getVariablesAccess().getUdtRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UdtRef_2=ruleUdtRef();

                    state._fsp--;


                    			current = this_UdtRef_2;
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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleVariable"
    // InternalEis.g:879:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEis.g:879:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEis.g:880:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEis.g:886:1: ruleVariable returns [EObject current=null] : ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_variantKeyword_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_nextVariable_9_0=null;
        Enumerator lv_variableType_2_0 = null;

        EObject lv_idiom_5_0 = null;

        EObject lv_range_7_0 = null;



        	enterRule();

        try {
            // InternalEis.g:892:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) )
            // InternalEis.g:893:2: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
            {
            // InternalEis.g:893:2: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
            // InternalEis.g:894:3: () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
            {
            // InternalEis.g:894:3: ()
            // InternalEis.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalEis.g:901:3: ( (lv_variantKeyword_1_0= 'variant' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEis.g:902:4: (lv_variantKeyword_1_0= 'variant' )
                    {
                    // InternalEis.g:902:4: (lv_variantKeyword_1_0= 'variant' )
                    // InternalEis.g:903:5: lv_variantKeyword_1_0= 'variant'
                    {
                    lv_variantKeyword_1_0=(Token)match(input,44,FOLLOW_22); 

                    					newLeafNode(lv_variantKeyword_1_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "variantKeyword", true, "variant");
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:915:3: ( (lv_variableType_2_0= ruleBasicType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=64 && LA13_0<=85)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEis.g:916:4: (lv_variableType_2_0= ruleBasicType )
                    {
                    // InternalEis.g:916:4: (lv_variableType_2_0= ruleBasicType )
                    // InternalEis.g:917:5: lv_variableType_2_0= ruleBasicType
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeBasicTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_variableType_2_0=ruleBasicType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"variableType",
                    						lv_variableType_2_0,
                    						"org.xtext.eis.Eis.BasicType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:934:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalEis.g:935:4: (lv_name_3_0= RULE_ID )
            {
            // InternalEis.g:935:4: (lv_name_3_0= RULE_ID )
            // InternalEis.g:936:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            // InternalEis.g:952:3: (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEis.g:953:4: otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )?
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalEis.g:957:4: ( (lv_idiom_5_0= ruleIdiom ) )
                    // InternalEis.g:958:5: (lv_idiom_5_0= ruleIdiom )
                    {
                    // InternalEis.g:958:5: (lv_idiom_5_0= ruleIdiom )
                    // InternalEis.g:959:6: lv_idiom_5_0= ruleIdiom
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getIdiomIdiomParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_idiom_5_0=ruleIdiom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"idiom",
                    							lv_idiom_5_0,
                    							"org.xtext.eis.Eis.Idiom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEis.g:976:4: (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==45) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEis.g:977:5: otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) )
                            {
                            otherlv_6=(Token)match(input,45,FOLLOW_24); 

                            					newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_4_2_0());
                            				
                            // InternalEis.g:981:5: ( (lv_range_7_0= ruleIdiom ) )
                            // InternalEis.g:982:6: (lv_range_7_0= ruleIdiom )
                            {
                            // InternalEis.g:982:6: (lv_range_7_0= ruleIdiom )
                            // InternalEis.g:983:7: lv_range_7_0= ruleIdiom
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getRangeIdiomParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_range_7_0=ruleIdiom();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"range",
                            								lv_range_7_0,
                            								"org.xtext.eis.Eis.Idiom");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:1002:3: (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEis.g:1003:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getSemicolonKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEis.g:1008:4: ( (lv_nextVariable_9_0= ',' ) )
                    {
                    // InternalEis.g:1008:4: ( (lv_nextVariable_9_0= ',' ) )
                    // InternalEis.g:1009:5: (lv_nextVariable_9_0= ',' )
                    {
                    // InternalEis.g:1009:5: (lv_nextVariable_9_0= ',' )
                    // InternalEis.g:1010:6: lv_nextVariable_9_0= ','
                    {
                    lv_nextVariable_9_0=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_nextVariable_9_0, grammarAccess.getVariableAccess().getNextVariableCommaKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(current, "nextVariable", true, ",");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUdt"
    // InternalEis.g:1027:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalEis.g:1027:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalEis.g:1028:2: iv_ruleUdt= ruleUdt EOF
            {
             newCompositeNode(grammarAccess.getUdtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUdt=ruleUdt();

            state._fsp--;

             current =iv_ruleUdt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUdt"


    // $ANTLR start "ruleUdt"
    // InternalEis.g:1034:1: ruleUdt returns [EObject current=null] : (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' ) ;
    public final EObject ruleUdt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_udtType_3_0 = null;

        EObject lv_udtVariables_6_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1040:2: ( (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' ) )
            // InternalEis.g:1041:2: (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' )
            {
            // InternalEis.g:1041:2: (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' )
            // InternalEis.g:1042:3: otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
            		
            // InternalEis.g:1046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEis.g:1047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEis.g:1047:4: (lv_name_1_0= RULE_ID )
            // InternalEis.g:1048:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUdtAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEis.g:1068:3: ( (lv_udtType_3_0= ruleUdtType ) )
            // InternalEis.g:1069:4: (lv_udtType_3_0= ruleUdtType )
            {
            // InternalEis.g:1069:4: (lv_udtType_3_0= ruleUdtType )
            // InternalEis.g:1070:5: lv_udtType_3_0= ruleUdtType
            {

            					newCompositeNode(grammarAccess.getUdtAccess().getUdtTypeUdtTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_udtType_3_0=ruleUdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUdtRule());
            					}
            					set(
            						current,
            						"udtType",
            						lv_udtType_3_0,
            						"org.xtext.eis.Eis.UdtType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getUdtAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEis.g:1095:3: ( (lv_udtVariables_6_0= ruleVariables ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==44||LA17_0==46||(LA17_0>=64 && LA17_0<=85)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEis.g:1096:4: (lv_udtVariables_6_0= ruleVariables )
            	    {
            	    // InternalEis.g:1096:4: (lv_udtVariables_6_0= ruleVariables )
            	    // InternalEis.g:1097:5: lv_udtVariables_6_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getUdtAccess().getUdtVariablesVariablesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_udtVariables_6_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_6_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUdtAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleUdt"


    // $ANTLR start "entryRuleUdtRef"
    // InternalEis.g:1122:1: entryRuleUdtRef returns [EObject current=null] : iv_ruleUdtRef= ruleUdtRef EOF ;
    public final EObject entryRuleUdtRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtRef = null;


        try {
            // InternalEis.g:1122:47: (iv_ruleUdtRef= ruleUdtRef EOF )
            // InternalEis.g:1123:2: iv_ruleUdtRef= ruleUdtRef EOF
            {
             newCompositeNode(grammarAccess.getUdtRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUdtRef=ruleUdtRef();

            state._fsp--;

             current =iv_ruleUdtRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUdtRef"


    // $ANTLR start "ruleUdtRef"
    // InternalEis.g:1129:1: ruleUdtRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleUdtRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_udtVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1135:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' ) )
            // InternalEis.g:1136:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' )
            {
            // InternalEis.g:1136:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' )
            // InternalEis.g:1137:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';'
            {
            // InternalEis.g:1137:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:1138:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:1138:4: (otherlv_0= RULE_ID )
            // InternalEis.g:1139:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getUdtRefAccess().getUdtTypeUdtTypeCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:1150:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEis.g:1151:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEis.g:1151:4: (lv_name_1_0= RULE_ID )
            // InternalEis.g:1152:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUdtRefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            // InternalEis.g:1168:3: ( (lv_udtVariables_2_0= ruleVariables ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==44||LA18_0==46||(LA18_0>=64 && LA18_0<=85)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEis.g:1169:4: (lv_udtVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:1169:4: (lv_udtVariables_2_0= ruleVariables )
            	    // InternalEis.g:1170:5: lv_udtVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getUdtRefAccess().getUdtVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_udtVariables_2_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_2_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUdtRefAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleUdtRef"


    // $ANTLR start "entryRuleUdtType"
    // InternalEis.g:1195:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalEis.g:1195:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalEis.g:1196:2: iv_ruleUdtType= ruleUdtType EOF
            {
             newCompositeNode(grammarAccess.getUdtTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUdtType=ruleUdtType();

            state._fsp--;

             current =iv_ruleUdtType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUdtType"


    // $ANTLR start "ruleUdtType"
    // InternalEis.g:1202:1: ruleUdtType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEis.g:1208:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEis.g:1209:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEis.g:1209:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEis.g:1210:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEis.g:1210:3: (lv_name_0_0= RULE_ID )
            // InternalEis.g:1211:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUdtTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUdtTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.eis.Eis.ID");
            			

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
    // $ANTLR end "ruleUdtType"


    // $ANTLR start "entryRuleTeststepBlock"
    // InternalEis.g:1230:1: entryRuleTeststepBlock returns [EObject current=null] : iv_ruleTeststepBlock= ruleTeststepBlock EOF ;
    public final EObject entryRuleTeststepBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeststepBlock = null;


        try {
            // InternalEis.g:1230:54: (iv_ruleTeststepBlock= ruleTeststepBlock EOF )
            // InternalEis.g:1231:2: iv_ruleTeststepBlock= ruleTeststepBlock EOF
            {
             newCompositeNode(grammarAccess.getTeststepBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeststepBlock=ruleTeststepBlock();

            state._fsp--;

             current =iv_ruleTeststepBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTeststepBlock"


    // $ANTLR start "ruleTeststepBlock"
    // InternalEis.g:1237:1: ruleTeststepBlock returns [EObject current=null] : ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) ;
    public final EObject ruleTeststepBlock() throws RecognitionException {
        EObject current = null;

        Token lv_teststepKeyword_0_0=null;
        Token otherlv_1=null;
        Token lv_plcCycle_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_assertion_7_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1243:2: ( ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) )
            // InternalEis.g:1244:2: ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            {
            // InternalEis.g:1244:2: ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            // InternalEis.g:1245:3: ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}'
            {
            // InternalEis.g:1245:3: ( (lv_teststepKeyword_0_0= 'teststep' ) )
            // InternalEis.g:1246:4: (lv_teststepKeyword_0_0= 'teststep' )
            {
            // InternalEis.g:1246:4: (lv_teststepKeyword_0_0= 'teststep' )
            // InternalEis.g:1247:5: lv_teststepKeyword_0_0= 'teststep'
            {
            lv_teststepKeyword_0_0=(Token)match(input,47,FOLLOW_9); 

            					newLeafNode(lv_teststepKeyword_0_0, grammarAccess.getTeststepBlockAccess().getTeststepKeywordTeststepKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeststepBlockRule());
            					}
            					setWithLastConsumed(current, "teststepKeyword", lv_teststepKeyword_0_0, "teststep");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTeststepBlockAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEis.g:1263:3: ( (lv_plcCycle_2_0= RULE_LONG ) )
            // InternalEis.g:1264:4: (lv_plcCycle_2_0= RULE_LONG )
            {
            // InternalEis.g:1264:4: (lv_plcCycle_2_0= RULE_LONG )
            // InternalEis.g:1265:5: lv_plcCycle_2_0= RULE_LONG
            {
            lv_plcCycle_2_0=(Token)match(input,RULE_LONG,FOLLOW_11); 

            					newLeafNode(lv_plcCycle_2_0, grammarAccess.getTeststepBlockAccess().getPlcCycleLONGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeststepBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"plcCycle",
            						lv_plcCycle_2_0,
            						"org.xtext.eis.Eis.LONG");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTeststepBlockAccess().getCommaKeyword_3());
            		
            // InternalEis.g:1285:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalEis.g:1286:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalEis.g:1286:4: (lv_description_4_0= RULE_STRING )
            // InternalEis.g:1287:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_description_4_0, grammarAccess.getTeststepBlockAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeststepBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getTeststepBlockAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getTeststepBlockAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalEis.g:1311:3: ( (lv_assertion_7_0= ruleAssertionBlock ) )
            // InternalEis.g:1312:4: (lv_assertion_7_0= ruleAssertionBlock )
            {
            // InternalEis.g:1312:4: (lv_assertion_7_0= ruleAssertionBlock )
            // InternalEis.g:1313:5: lv_assertion_7_0= ruleAssertionBlock
            {

            					newCompositeNode(grammarAccess.getTeststepBlockAccess().getAssertionAssertionBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
            lv_assertion_7_0=ruleAssertionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeststepBlockRule());
            					}
            					set(
            						current,
            						"assertion",
            						lv_assertion_7_0,
            						"org.xtext.eis.Eis.AssertionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTeststepBlockAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleTeststepBlock"


    // $ANTLR start "entryRuleAssertionBlock"
    // InternalEis.g:1338:1: entryRuleAssertionBlock returns [EObject current=null] : iv_ruleAssertionBlock= ruleAssertionBlock EOF ;
    public final EObject entryRuleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBlock = null;


        try {
            // InternalEis.g:1338:55: (iv_ruleAssertionBlock= ruleAssertionBlock EOF )
            // InternalEis.g:1339:2: iv_ruleAssertionBlock= ruleAssertionBlock EOF
            {
             newCompositeNode(grammarAccess.getAssertionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionBlock=ruleAssertionBlock();

            state._fsp--;

             current =iv_ruleAssertionBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssertionBlock"


    // $ANTLR start "ruleAssertionBlock"
    // InternalEis.g:1345:1: ruleAssertionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_set_1_0 = null;

        EObject lv_assert_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1351:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:1352:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:1352:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:1353:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:1353:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:1354:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:1357:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            // InternalEis.g:1358:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:1358:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEis.g:1359:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    {
            	    // InternalEis.g:1359:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    // InternalEis.g:1360:4: {...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:1360:108: ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    // InternalEis.g:1361:5: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:1364:8: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    // InternalEis.g:1364:9: {...}? => ( (lv_set_1_0= ruleSet ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:1364:18: ( (lv_set_1_0= ruleSet ) )
            	    // InternalEis.g:1364:19: (lv_set_1_0= ruleSet )
            	    {
            	    // InternalEis.g:1364:19: (lv_set_1_0= ruleSet )
            	    // InternalEis.g:1365:9: lv_set_1_0= ruleSet
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getSetSetParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_31);
            	    lv_set_1_0=ruleSet();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getAssertionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"set",
            	    										lv_set_1_0,
            	    										"org.xtext.eis.Eis.Set");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEis.g:1387:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    {
            	    // InternalEis.g:1387:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    // InternalEis.g:1388:4: {...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:1388:108: ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    // InternalEis.g:1389:5: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:1392:8: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    // InternalEis.g:1392:9: {...}? => ( (lv_assert_2_0= ruleAssert ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:1392:18: ( (lv_assert_2_0= ruleAssert ) )
            	    // InternalEis.g:1392:19: (lv_assert_2_0= ruleAssert )
            	    {
            	    // InternalEis.g:1392:19: (lv_assert_2_0= ruleAssert )
            	    // InternalEis.g:1393:9: lv_assert_2_0= ruleAssert
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getAssertAssertParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_31);
            	    lv_assert_2_0=ruleAssert();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getAssertionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"assert",
            	    										lv_assert_2_0,
            	    										"org.xtext.eis.Eis.Assert");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssertionBlockAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssertionBlockAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleAssertionBlock"


    // $ANTLR start "entryRuleSet"
    // InternalEis.g:1426:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalEis.g:1426:44: (iv_ruleSet= ruleSet EOF )
            // InternalEis.g:1427:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalEis.g:1433:1: ruleSet returns [EObject current=null] : ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_setVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1439:2: ( ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:1440:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:1440:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:1441:3: ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:1441:3: ( (lv_name_0_0= 'set' ) )
            // InternalEis.g:1442:4: (lv_name_0_0= 'set' )
            {
            // InternalEis.g:1442:4: (lv_name_0_0= 'set' )
            // InternalEis.g:1443:5: lv_name_0_0= 'set'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSetAccess().getNameSetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "set");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:1459:3: ( (lv_setVariables_2_0= ruleStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEis.g:1460:4: (lv_setVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:1460:4: (lv_setVariables_2_0= ruleStatement )
            	    // InternalEis.g:1461:5: lv_setVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSetAccess().getSetVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_setVariables_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"setVariables",
            	    						lv_setVariables_2_0,
            	    						"org.xtext.eis.Eis.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSetAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleAssert"
    // InternalEis.g:1486:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalEis.g:1486:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalEis.g:1487:2: iv_ruleAssert= ruleAssert EOF
            {
             newCompositeNode(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssert=ruleAssert();

            state._fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // InternalEis.g:1493:1: ruleAssert returns [EObject current=null] : ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assertVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1499:2: ( ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:1500:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:1500:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:1501:3: ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:1501:3: ( (lv_name_0_0= 'assert' ) )
            // InternalEis.g:1502:4: (lv_name_0_0= 'assert' )
            {
            // InternalEis.g:1502:4: (lv_name_0_0= 'assert' )
            // InternalEis.g:1503:5: lv_name_0_0= 'assert'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssertAccess().getNameAssertKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "assert");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:1519:3: ( (lv_assertVariables_2_0= ruleStatement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEis.g:1520:4: (lv_assertVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:1520:4: (lv_assertVariables_2_0= ruleStatement )
            	    // InternalEis.g:1521:5: lv_assertVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getAssertAccess().getAssertVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_assertVariables_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssertRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertVariables",
            	    						lv_assertVariables_2_0,
            	    						"org.xtext.eis.Eis.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleStatement"
    // InternalEis.g:1546:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEis.g:1546:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEis.g:1547:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEis.g:1553:1: ruleStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* (otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? )? otherlv_6= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cascade_1_0 = null;

        EObject lv_idiom_3_0 = null;

        EObject lv_range_5_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1559:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* (otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? )? otherlv_6= ';' ) )
            // InternalEis.g:1560:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* (otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? )? otherlv_6= ';' )
            {
            // InternalEis.g:1560:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* (otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? )? otherlv_6= ';' )
            // InternalEis.g:1561:3: ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* (otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? )? otherlv_6= ';'
            {
            // InternalEis.g:1561:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:1562:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:1562:4: (otherlv_0= RULE_ID )
            // InternalEis.g:1563:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVariableVariablesCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:1574:3: ( (lv_cascade_1_0= ruleCascade ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEis.g:1575:4: (lv_cascade_1_0= ruleCascade )
            	    {
            	    // InternalEis.g:1575:4: (lv_cascade_1_0= ruleCascade )
            	    // InternalEis.g:1576:5: lv_cascade_1_0= ruleCascade
            	    {

            	    					newCompositeNode(grammarAccess.getStatementAccess().getCascadeCascadeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_cascade_1_0=ruleCascade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cascade",
            	    						lv_cascade_1_0,
            	    						"org.xtext.eis.Eis.Cascade");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalEis.g:1593:3: (otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEis.g:1594:4: otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )?
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalEis.g:1598:4: ( (lv_idiom_3_0= ruleIdiom ) )
                    // InternalEis.g:1599:5: (lv_idiom_3_0= ruleIdiom )
                    {
                    // InternalEis.g:1599:5: (lv_idiom_3_0= ruleIdiom )
                    // InternalEis.g:1600:6: lv_idiom_3_0= ruleIdiom
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getIdiomIdiomParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_idiom_3_0=ruleIdiom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"idiom",
                    							lv_idiom_3_0,
                    							"org.xtext.eis.Eis.Idiom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEis.g:1617:4: (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==45) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalEis.g:1618:5: otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) )
                            {
                            otherlv_4=(Token)match(input,45,FOLLOW_24); 

                            					newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getPlusSignSolidusHyphenMinusKeyword_2_2_0());
                            				
                            // InternalEis.g:1622:5: ( (lv_range_5_0= ruleIdiom ) )
                            // InternalEis.g:1623:6: (lv_range_5_0= ruleIdiom )
                            {
                            // InternalEis.g:1623:6: (lv_range_5_0= ruleIdiom )
                            // InternalEis.g:1624:7: lv_range_5_0= ruleIdiom
                            {

                            							newCompositeNode(grammarAccess.getStatementAccess().getRangeIdiomParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_range_5_0=ruleIdiom();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStatementRule());
                            							}
                            							set(
                            								current,
                            								"range",
                            								lv_range_5_0,
                            								"org.xtext.eis.Eis.Idiom");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCascade"
    // InternalEis.g:1651:1: entryRuleCascade returns [EObject current=null] : iv_ruleCascade= ruleCascade EOF ;
    public final EObject entryRuleCascade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCascade = null;


        try {
            // InternalEis.g:1651:48: (iv_ruleCascade= ruleCascade EOF )
            // InternalEis.g:1652:2: iv_ruleCascade= ruleCascade EOF
            {
             newCompositeNode(grammarAccess.getCascadeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCascade=ruleCascade();

            state._fsp--;

             current =iv_ruleCascade; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCascade"


    // $ANTLR start "ruleCascade"
    // InternalEis.g:1658:1: ruleCascade returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCascade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEis.g:1664:2: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEis.g:1665:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEis.g:1665:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // InternalEis.g:1666:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCascadeAccess().getFullStopKeyword_0());
            		
            // InternalEis.g:1670:3: ( (otherlv_1= RULE_ID ) )
            // InternalEis.g:1671:4: (otherlv_1= RULE_ID )
            {
            // InternalEis.g:1671:4: (otherlv_1= RULE_ID )
            // InternalEis.g:1672:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCascadeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCascadeAccess().getUdtVarVariablesCrossReference_1_0());
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleCascade"


    // $ANTLR start "entryRuleIdiom"
    // InternalEis.g:1687:1: entryRuleIdiom returns [EObject current=null] : iv_ruleIdiom= ruleIdiom EOF ;
    public final EObject entryRuleIdiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdiom = null;


        try {
            // InternalEis.g:1687:46: (iv_ruleIdiom= ruleIdiom EOF )
            // InternalEis.g:1688:2: iv_ruleIdiom= ruleIdiom EOF
            {
             newCompositeNode(grammarAccess.getIdiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdiom=ruleIdiom();

            state._fsp--;

             current =iv_ruleIdiom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdiom"


    // $ANTLR start "ruleIdiom"
    // InternalEis.g:1694:1: ruleIdiom returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleIdiom() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1700:2: (this_Or_0= ruleOr )
            // InternalEis.g:1701:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getIdiomAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleIdiom"


    // $ANTLR start "entryRuleOr"
    // InternalEis.g:1712:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalEis.g:1712:43: (iv_ruleOr= ruleOr EOF )
            // InternalEis.g:1713:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalEis.g:1719:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1725:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalEis.g:1726:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalEis.g:1726:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalEis.g:1727:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1735:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==51) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEis.g:1736:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalEis.g:1736:4: ()
            	    // InternalEis.g:1737:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEis.g:1747:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalEis.g:1748:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalEis.g:1748:5: (lv_right_3_0= ruleAnd )
            	    // InternalEis.g:1749:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.eis.Eis.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalEis.g:1771:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalEis.g:1771:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalEis.g:1772:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalEis.g:1778:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1784:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalEis.g:1785:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalEis.g:1785:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalEis.g:1786:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1794:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==52) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEis.g:1795:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalEis.g:1795:4: ()
            	    // InternalEis.g:1796:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEis.g:1806:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalEis.g:1807:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalEis.g:1807:5: (lv_right_3_0= ruleEquality )
            	    // InternalEis.g:1808:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.eis.Eis.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalEis.g:1830:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalEis.g:1830:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalEis.g:1831:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalEis.g:1837:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1843:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalEis.g:1844:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalEis.g:1844:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalEis.g:1845:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1853:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=53 && LA28_0<=54)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEis.g:1854:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalEis.g:1854:4: ()
            	    // InternalEis.g:1855:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1861:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalEis.g:1862:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalEis.g:1862:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalEis.g:1863:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalEis.g:1863:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==53) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==54) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalEis.g:1864:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,53,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1875:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,54,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalEis.g:1888:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalEis.g:1889:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalEis.g:1889:5: (lv_right_3_0= ruleComparison )
            	    // InternalEis.g:1890:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.eis.Eis.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalEis.g:1912:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEis.g:1912:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEis.g:1913:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalEis.g:1919:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1925:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalEis.g:1926:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalEis.g:1926:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalEis.g:1927:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1935:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=55 && LA30_0<=58)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEis.g:1936:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalEis.g:1936:4: ()
            	    // InternalEis.g:1937:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1943:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalEis.g:1944:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalEis.g:1944:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalEis.g:1945:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalEis.g:1945:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case 55:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalEis.g:1946:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,55,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1957:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,56,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalEis.g:1968:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,57,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalEis.g:1979:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,58,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalEis.g:1992:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalEis.g:1993:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalEis.g:1993:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalEis.g:1994:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.eis.Eis.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalEis.g:2016:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalEis.g:2016:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalEis.g:2017:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalEis.g:2023:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2029:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalEis.g:2030:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalEis.g:2030:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalEis.g:2031:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:2039:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=59 && LA32_0<=60)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEis.g:2040:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalEis.g:2040:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==59) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==60) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalEis.g:2041:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalEis.g:2041:5: ( () otherlv_2= '+' )
            	            // InternalEis.g:2042:6: () otherlv_2= '+'
            	            {
            	            // InternalEis.g:2042:6: ()
            	            // InternalEis.g:2043:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,59,FOLLOW_24); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:2055:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalEis.g:2055:5: ( () otherlv_4= '-' )
            	            // InternalEis.g:2056:6: () otherlv_4= '-'
            	            {
            	            // InternalEis.g:2056:6: ()
            	            // InternalEis.g:2057:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,60,FOLLOW_24); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEis.g:2069:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalEis.g:2070:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalEis.g:2070:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalEis.g:2071:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.eis.Eis.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalEis.g:2093:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalEis.g:2093:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalEis.g:2094:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalEis.g:2100:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2106:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalEis.g:2107:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalEis.g:2107:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalEis.g:2108:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:2116:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=61 && LA34_0<=62)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEis.g:2117:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalEis.g:2117:4: ()
            	    // InternalEis.g:2118:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:2124:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalEis.g:2125:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalEis.g:2125:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalEis.g:2126:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalEis.g:2126:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==61) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==62) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalEis.g:2127:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,61,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:2138:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,62,FOLLOW_24); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalEis.g:2151:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalEis.g:2152:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalEis.g:2152:5: (lv_right_3_0= rulePrimary )
            	    // InternalEis.g:2153:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.eis.Eis.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalEis.g:2175:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEis.g:2175:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEis.g:2176:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalEis.g:2182:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Idiom_1 = null;

        EObject lv_idiom_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalEis.g:2188:2: ( ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalEis.g:2189:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalEis.g:2189:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt35=1;
                }
                break;
            case 63:
                {
                alt35=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_LONG:
            case RULE_NEGATIVE_LONG:
            case RULE_REAL:
            case RULE_BYTE:
            case RULE_WORD:
            case RULE_DWORD:
            case RULE_LWORD:
            case RULE_CHAR:
            case RULE_TIME:
            case RULE_LTIME:
            case RULE_DATE:
            case 34:
            case 35:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalEis.g:2190:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    {
                    // InternalEis.g:2190:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    // InternalEis.g:2191:4: otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getIdiomParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_Idiom_1=ruleIdiom();

                    state._fsp--;


                    				current = this_Idiom_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:2209:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    {
                    // InternalEis.g:2209:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    // InternalEis.g:2210:4: () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) )
                    {
                    // InternalEis.g:2210:4: ()
                    // InternalEis.g:2211:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,63,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalEis.g:2221:4: ( (lv_idiom_5_0= rulePrimary ) )
                    // InternalEis.g:2222:5: (lv_idiom_5_0= rulePrimary )
                    {
                    // InternalEis.g:2222:5: (lv_idiom_5_0= rulePrimary )
                    // InternalEis.g:2223:6: lv_idiom_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getIdiomPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_idiom_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"idiom",
                    							lv_idiom_5_0,
                    							"org.xtext.eis.Eis.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:2242:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalEis.g:2254:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalEis.g:2254:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalEis.g:2255:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalEis.g:2261:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_3_0=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        Token lv_value_12_0=null;
        Token lv_value_14_0=null;
        Token lv_value_16_0=null;
        Token lv_value_18_0=null;
        Token lv_value_20_0=null;
        Token lv_value_22_0=null;
        Token lv_value_24_0=null;
        EObject this_BoolConstant_4 = null;



        	enterRule();

        try {
            // InternalEis.g:2267:2: ( ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) ) )
            // InternalEis.g:2268:2: ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) )
            {
            // InternalEis.g:2268:2: ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) )
            int alt37=13;
            switch ( input.LA(1) ) {
            case RULE_LONG:
            case RULE_NEGATIVE_LONG:
                {
                alt37=1;
                }
                break;
            case RULE_STRING:
                {
                alt37=2;
                }
                break;
            case 34:
            case 35:
                {
                alt37=3;
                }
                break;
            case RULE_ID:
                {
                alt37=4;
                }
                break;
            case RULE_REAL:
                {
                alt37=5;
                }
                break;
            case RULE_BYTE:
                {
                alt37=6;
                }
                break;
            case RULE_WORD:
                {
                alt37=7;
                }
                break;
            case RULE_DWORD:
                {
                alt37=8;
                }
                break;
            case RULE_LWORD:
                {
                alt37=9;
                }
                break;
            case RULE_CHAR:
                {
                alt37=10;
                }
                break;
            case RULE_TIME:
                {
                alt37=11;
                }
                break;
            case RULE_LTIME:
                {
                alt37=12;
                }
                break;
            case RULE_DATE:
                {
                alt37=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalEis.g:2269:3: ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) )
                    {
                    // InternalEis.g:2269:3: ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) )
                    // InternalEis.g:2270:4: () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) )
                    {
                    // InternalEis.g:2270:4: ()
                    // InternalEis.g:2271:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2277:4: ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) )
                    // InternalEis.g:2278:5: ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) )
                    {
                    // InternalEis.g:2278:5: ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) )
                    // InternalEis.g:2279:6: (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG )
                    {
                    // InternalEis.g:2279:6: (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_LONG) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_NEGATIVE_LONG) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalEis.g:2280:7: lv_value_1_1= RULE_LONG
                            {
                            lv_value_1_1=(Token)match(input,RULE_LONG,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueLONGTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_1,
                            								"org.xtext.eis.Eis.LONG");
                            						

                            }
                            break;
                        case 2 :
                            // InternalEis.g:2295:7: lv_value_1_2= RULE_NEGATIVE_LONG
                            {
                            lv_value_1_2=(Token)match(input,RULE_NEGATIVE_LONG,FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getAtomicAccess().getValueNEGATIVE_LONGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_2,
                            								"org.xtext.eis.Eis.NEGATIVE_LONG");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:2314:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalEis.g:2314:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalEis.g:2315:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEis.g:2315:4: ()
                    // InternalEis.g:2316:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2322:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEis.g:2323:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEis.g:2323:5: (lv_value_3_0= RULE_STRING )
                    // InternalEis.g:2324:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.eis.Eis.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:2342:3: this_BoolConstant_4= ruleBoolConstant
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getBoolConstantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolConstant_4=ruleBoolConstant();

                    state._fsp--;


                    			current = this_BoolConstant_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEis.g:2351:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalEis.g:2351:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalEis.g:2352:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalEis.g:2352:4: ()
                    // InternalEis.g:2353:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2359:4: ( (otherlv_6= RULE_ID ) )
                    // InternalEis.g:2360:5: (otherlv_6= RULE_ID )
                    {
                    // InternalEis.g:2360:5: (otherlv_6= RULE_ID )
                    // InternalEis.g:2361:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEis.g:2374:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    {
                    // InternalEis.g:2374:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    // InternalEis.g:2375:4: () ( (lv_value_8_0= RULE_REAL ) )
                    {
                    // InternalEis.g:2375:4: ()
                    // InternalEis.g:2376:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getRealConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2382:4: ( (lv_value_8_0= RULE_REAL ) )
                    // InternalEis.g:2383:5: (lv_value_8_0= RULE_REAL )
                    {
                    // InternalEis.g:2383:5: (lv_value_8_0= RULE_REAL )
                    // InternalEis.g:2384:6: lv_value_8_0= RULE_REAL
                    {
                    lv_value_8_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    						newLeafNode(lv_value_8_0, grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"org.xtext.eis.Eis.REAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalEis.g:2402:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    {
                    // InternalEis.g:2402:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    // InternalEis.g:2403:4: () ( (lv_value_10_0= RULE_BYTE ) )
                    {
                    // InternalEis.g:2403:4: ()
                    // InternalEis.g:2404:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getByteConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2410:4: ( (lv_value_10_0= RULE_BYTE ) )
                    // InternalEis.g:2411:5: (lv_value_10_0= RULE_BYTE )
                    {
                    // InternalEis.g:2411:5: (lv_value_10_0= RULE_BYTE )
                    // InternalEis.g:2412:6: lv_value_10_0= RULE_BYTE
                    {
                    lv_value_10_0=(Token)match(input,RULE_BYTE,FOLLOW_2); 

                    						newLeafNode(lv_value_10_0, grammarAccess.getAtomicAccess().getValueBYTETerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"org.xtext.eis.Eis.BYTE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalEis.g:2430:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    {
                    // InternalEis.g:2430:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    // InternalEis.g:2431:4: () ( (lv_value_12_0= RULE_WORD ) )
                    {
                    // InternalEis.g:2431:4: ()
                    // InternalEis.g:2432:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getWordConstantAction_6_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2438:4: ( (lv_value_12_0= RULE_WORD ) )
                    // InternalEis.g:2439:5: (lv_value_12_0= RULE_WORD )
                    {
                    // InternalEis.g:2439:5: (lv_value_12_0= RULE_WORD )
                    // InternalEis.g:2440:6: lv_value_12_0= RULE_WORD
                    {
                    lv_value_12_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

                    						newLeafNode(lv_value_12_0, grammarAccess.getAtomicAccess().getValueWORDTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"org.xtext.eis.Eis.WORD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalEis.g:2458:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    {
                    // InternalEis.g:2458:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    // InternalEis.g:2459:4: () ( (lv_value_14_0= RULE_DWORD ) )
                    {
                    // InternalEis.g:2459:4: ()
                    // InternalEis.g:2460:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDWordConstantAction_7_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2466:4: ( (lv_value_14_0= RULE_DWORD ) )
                    // InternalEis.g:2467:5: (lv_value_14_0= RULE_DWORD )
                    {
                    // InternalEis.g:2467:5: (lv_value_14_0= RULE_DWORD )
                    // InternalEis.g:2468:6: lv_value_14_0= RULE_DWORD
                    {
                    lv_value_14_0=(Token)match(input,RULE_DWORD,FOLLOW_2); 

                    						newLeafNode(lv_value_14_0, grammarAccess.getAtomicAccess().getValueDWORDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_14_0,
                    							"org.xtext.eis.Eis.DWORD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalEis.g:2486:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    {
                    // InternalEis.g:2486:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    // InternalEis.g:2487:4: () ( (lv_value_16_0= RULE_LWORD ) )
                    {
                    // InternalEis.g:2487:4: ()
                    // InternalEis.g:2488:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLWordConstantAction_8_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2494:4: ( (lv_value_16_0= RULE_LWORD ) )
                    // InternalEis.g:2495:5: (lv_value_16_0= RULE_LWORD )
                    {
                    // InternalEis.g:2495:5: (lv_value_16_0= RULE_LWORD )
                    // InternalEis.g:2496:6: lv_value_16_0= RULE_LWORD
                    {
                    lv_value_16_0=(Token)match(input,RULE_LWORD,FOLLOW_2); 

                    						newLeafNode(lv_value_16_0, grammarAccess.getAtomicAccess().getValueLWORDTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_16_0,
                    							"org.xtext.eis.Eis.LWORD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalEis.g:2514:3: ( () ( (lv_value_18_0= RULE_CHAR ) ) )
                    {
                    // InternalEis.g:2514:3: ( () ( (lv_value_18_0= RULE_CHAR ) ) )
                    // InternalEis.g:2515:4: () ( (lv_value_18_0= RULE_CHAR ) )
                    {
                    // InternalEis.g:2515:4: ()
                    // InternalEis.g:2516:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getCharConstantAction_9_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2522:4: ( (lv_value_18_0= RULE_CHAR ) )
                    // InternalEis.g:2523:5: (lv_value_18_0= RULE_CHAR )
                    {
                    // InternalEis.g:2523:5: (lv_value_18_0= RULE_CHAR )
                    // InternalEis.g:2524:6: lv_value_18_0= RULE_CHAR
                    {
                    lv_value_18_0=(Token)match(input,RULE_CHAR,FOLLOW_2); 

                    						newLeafNode(lv_value_18_0, grammarAccess.getAtomicAccess().getValueCHARTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_18_0,
                    							"org.xtext.eis.Eis.CHAR");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalEis.g:2542:3: ( () ( (lv_value_20_0= RULE_TIME ) ) )
                    {
                    // InternalEis.g:2542:3: ( () ( (lv_value_20_0= RULE_TIME ) ) )
                    // InternalEis.g:2543:4: () ( (lv_value_20_0= RULE_TIME ) )
                    {
                    // InternalEis.g:2543:4: ()
                    // InternalEis.g:2544:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getTimeConstantAction_10_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2550:4: ( (lv_value_20_0= RULE_TIME ) )
                    // InternalEis.g:2551:5: (lv_value_20_0= RULE_TIME )
                    {
                    // InternalEis.g:2551:5: (lv_value_20_0= RULE_TIME )
                    // InternalEis.g:2552:6: lv_value_20_0= RULE_TIME
                    {
                    lv_value_20_0=(Token)match(input,RULE_TIME,FOLLOW_2); 

                    						newLeafNode(lv_value_20_0, grammarAccess.getAtomicAccess().getValueTIMETerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_20_0,
                    							"org.xtext.eis.Eis.TIME");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalEis.g:2570:3: ( () ( (lv_value_22_0= RULE_LTIME ) ) )
                    {
                    // InternalEis.g:2570:3: ( () ( (lv_value_22_0= RULE_LTIME ) ) )
                    // InternalEis.g:2571:4: () ( (lv_value_22_0= RULE_LTIME ) )
                    {
                    // InternalEis.g:2571:4: ()
                    // InternalEis.g:2572:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLTimeConstantAction_11_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2578:4: ( (lv_value_22_0= RULE_LTIME ) )
                    // InternalEis.g:2579:5: (lv_value_22_0= RULE_LTIME )
                    {
                    // InternalEis.g:2579:5: (lv_value_22_0= RULE_LTIME )
                    // InternalEis.g:2580:6: lv_value_22_0= RULE_LTIME
                    {
                    lv_value_22_0=(Token)match(input,RULE_LTIME,FOLLOW_2); 

                    						newLeafNode(lv_value_22_0, grammarAccess.getAtomicAccess().getValueLTIMETerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_22_0,
                    							"org.xtext.eis.Eis.LTIME");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalEis.g:2598:3: ( () ( (lv_value_24_0= RULE_DATE ) ) )
                    {
                    // InternalEis.g:2598:3: ( () ( (lv_value_24_0= RULE_DATE ) ) )
                    // InternalEis.g:2599:4: () ( (lv_value_24_0= RULE_DATE ) )
                    {
                    // InternalEis.g:2599:4: ()
                    // InternalEis.g:2600:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDateConstantAction_12_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2606:4: ( (lv_value_24_0= RULE_DATE ) )
                    // InternalEis.g:2607:5: (lv_value_24_0= RULE_DATE )
                    {
                    // InternalEis.g:2607:5: (lv_value_24_0= RULE_DATE )
                    // InternalEis.g:2608:6: lv_value_24_0= RULE_DATE
                    {
                    lv_value_24_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

                    						newLeafNode(lv_value_24_0, grammarAccess.getAtomicAccess().getValueDATETerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_24_0,
                    							"org.xtext.eis.Eis.DATE");
                    					

                    }


                    }


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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "ruleBasicType"
    // InternalEis.g:2629:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;


        	enterRule();

        try {
            // InternalEis.g:2635:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) ) )
            // InternalEis.g:2636:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) )
            {
            // InternalEis.g:2636:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) )
            int alt38=22;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt38=1;
                }
                break;
            case 65:
                {
                alt38=2;
                }
                break;
            case 66:
                {
                alt38=3;
                }
                break;
            case 67:
                {
                alt38=4;
                }
                break;
            case 68:
                {
                alt38=5;
                }
                break;
            case 69:
                {
                alt38=6;
                }
                break;
            case 70:
                {
                alt38=7;
                }
                break;
            case 71:
                {
                alt38=8;
                }
                break;
            case 72:
                {
                alt38=9;
                }
                break;
            case 73:
                {
                alt38=10;
                }
                break;
            case 74:
                {
                alt38=11;
                }
                break;
            case 75:
                {
                alt38=12;
                }
                break;
            case 76:
                {
                alt38=13;
                }
                break;
            case 77:
                {
                alt38=14;
                }
                break;
            case 78:
                {
                alt38=15;
                }
                break;
            case 79:
                {
                alt38=16;
                }
                break;
            case 80:
                {
                alt38=17;
                }
                break;
            case 81:
                {
                alt38=18;
                }
                break;
            case 82:
                {
                alt38=19;
                }
                break;
            case 83:
                {
                alt38=20;
                }
                break;
            case 84:
                {
                alt38=21;
                }
                break;
            case 85:
                {
                alt38=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalEis.g:2637:3: (enumLiteral_0= 'null' )
                    {
                    // InternalEis.g:2637:3: (enumLiteral_0= 'null' )
                    // InternalEis.g:2638:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:2645:3: (enumLiteral_1= 'int' )
                    {
                    // InternalEis.g:2645:3: (enumLiteral_1= 'int' )
                    // InternalEis.g:2646:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:2653:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalEis.g:2653:3: (enumLiteral_2= 'bool' )
                    // InternalEis.g:2654:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEis.g:2661:3: (enumLiteral_3= 'real' )
                    {
                    // InternalEis.g:2661:3: (enumLiteral_3= 'real' )
                    // InternalEis.g:2662:4: enumLiteral_3= 'real'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEis.g:2669:3: (enumLiteral_4= 'string' )
                    {
                    // InternalEis.g:2669:3: (enumLiteral_4= 'string' )
                    // InternalEis.g:2670:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEis.g:2677:3: (enumLiteral_5= 'char' )
                    {
                    // InternalEis.g:2677:3: (enumLiteral_5= 'char' )
                    // InternalEis.g:2678:4: enumLiteral_5= 'char'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getCHAREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEis.g:2685:3: (enumLiteral_6= 'byte' )
                    {
                    // InternalEis.g:2685:3: (enumLiteral_6= 'byte' )
                    // InternalEis.g:2686:4: enumLiteral_6= 'byte'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalEis.g:2693:3: (enumLiteral_7= 'word' )
                    {
                    // InternalEis.g:2693:3: (enumLiteral_7= 'word' )
                    // InternalEis.g:2694:4: enumLiteral_7= 'word'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalEis.g:2701:3: (enumLiteral_8= 'dword' )
                    {
                    // InternalEis.g:2701:3: (enumLiteral_8= 'dword' )
                    // InternalEis.g:2702:4: enumLiteral_8= 'dword'
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalEis.g:2709:3: (enumLiteral_9= 'lword' )
                    {
                    // InternalEis.g:2709:3: (enumLiteral_9= 'lword' )
                    // InternalEis.g:2710:4: enumLiteral_9= 'lword'
                    {
                    enumLiteral_9=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalEis.g:2717:3: (enumLiteral_10= 'usint' )
                    {
                    // InternalEis.g:2717:3: (enumLiteral_10= 'usint' )
                    // InternalEis.g:2718:4: enumLiteral_10= 'usint'
                    {
                    enumLiteral_10=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUSINTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getUSINTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalEis.g:2725:3: (enumLiteral_11= 'uint' )
                    {
                    // InternalEis.g:2725:3: (enumLiteral_11= 'uint' )
                    // InternalEis.g:2726:4: enumLiteral_11= 'uint'
                    {
                    enumLiteral_11=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUINTEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBasicTypeAccess().getUINTEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalEis.g:2733:3: (enumLiteral_12= 'udint' )
                    {
                    // InternalEis.g:2733:3: (enumLiteral_12= 'udint' )
                    // InternalEis.g:2734:4: enumLiteral_12= 'udint'
                    {
                    enumLiteral_12=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUDINTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getBasicTypeAccess().getUDINTEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalEis.g:2741:3: (enumLiteral_13= 'ulint' )
                    {
                    // InternalEis.g:2741:3: (enumLiteral_13= 'ulint' )
                    // InternalEis.g:2742:4: enumLiteral_13= 'ulint'
                    {
                    enumLiteral_13=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getULINTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getBasicTypeAccess().getULINTEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalEis.g:2749:3: (enumLiteral_14= 'sint' )
                    {
                    // InternalEis.g:2749:3: (enumLiteral_14= 'sint' )
                    // InternalEis.g:2750:4: enumLiteral_14= 'sint'
                    {
                    enumLiteral_14=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSINTEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getBasicTypeAccess().getSINTEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalEis.g:2757:3: (enumLiteral_15= 'dint' )
                    {
                    // InternalEis.g:2757:3: (enumLiteral_15= 'dint' )
                    // InternalEis.g:2758:4: enumLiteral_15= 'dint'
                    {
                    enumLiteral_15=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDINTEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getBasicTypeAccess().getDINTEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalEis.g:2765:3: (enumLiteral_16= 'lint' )
                    {
                    // InternalEis.g:2765:3: (enumLiteral_16= 'lint' )
                    // InternalEis.g:2766:4: enumLiteral_16= 'lint'
                    {
                    enumLiteral_16=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLINTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getBasicTypeAccess().getLINTEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalEis.g:2773:3: (enumLiteral_17= 'time' )
                    {
                    // InternalEis.g:2773:3: (enumLiteral_17= 'time' )
                    // InternalEis.g:2774:4: enumLiteral_17= 'time'
                    {
                    enumLiteral_17=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getTIMEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getBasicTypeAccess().getTIMEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalEis.g:2781:3: (enumLiteral_18= 'ltime' )
                    {
                    // InternalEis.g:2781:3: (enumLiteral_18= 'ltime' )
                    // InternalEis.g:2782:4: enumLiteral_18= 'ltime'
                    {
                    enumLiteral_18=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLTIMEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getBasicTypeAccess().getLTIMEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalEis.g:2789:3: (enumLiteral_19= 'date' )
                    {
                    // InternalEis.g:2789:3: (enumLiteral_19= 'date' )
                    // InternalEis.g:2790:4: enumLiteral_19= 'date'
                    {
                    enumLiteral_19=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalEis.g:2797:3: (enumLiteral_20= 'lreal' )
                    {
                    // InternalEis.g:2797:3: (enumLiteral_20= 'lreal' )
                    // InternalEis.g:2798:4: enumLiteral_20= 'lreal'
                    {
                    enumLiteral_20=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLREALEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getBasicTypeAccess().getLREALEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalEis.g:2805:3: (enumLiteral_21= 'wchar' )
                    {
                    // InternalEis.g:2805:3: (enumLiteral_21= 'wchar' )
                    // InternalEis.g:2806:4: enumLiteral_21= 'wchar'
                    {
                    enumLiteral_21=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getWCHAREnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getBasicTypeAccess().getWCHAREnumLiteralDeclaration_21());
                    			

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
    // $ANTLR end "ruleBasicType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001C800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000C8000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000C8000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000520000000020L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000043000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8000000C2001FFF0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200042000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000500200000020L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000500002000020L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000003000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x6000000000000002L});

}
