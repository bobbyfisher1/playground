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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LONG", "RULE_NEGATIVE_LONG", "RULE_REAL", "RULE_BYTE", "RULE_WORD", "RULE_DWORD", "RULE_LWORD", "RULE_CHAR", "RULE_TIME", "RULE_LTIME", "RULE_DATE", "RULE_X", "RULE_HEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'", "'author'", "'testcase'", "'{'", "'}'", "'testActive'", "'blockType'", "'description'", "'FC'", "'FB'", "'true'", "'false'", "'define'", "'input'", "'['", "']'", "'output'", "'inout'", "'variant'", "'+/-'", "','", "'udt'", "'('", "')'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'teststep'", "'set'", "'assert'", "'.'", "'null'", "'int'", "'bool'", "'real'", "'string'", "'char'", "'byte'", "'word'", "'dword'", "'lword'", "'usint'", "'uint'", "'udint'", "'ulint'", "'sint'", "'dint'", "'lint'", "'time'", "'ltime'", "'date'"
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
    public static final int T__86=86;
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
    // InternalEis.g:72:1: ruleEisModel returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* ) ;
    public final EObject ruleEisModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_project_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_plc_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_author_name_10_0=null;
        Token otherlv_11=null;
        EObject lv_testcases_12_0 = null;



        	enterRule();

        try {
            // InternalEis.g:78:2: ( (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* ) )
            // InternalEis.g:79:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* )
            {
            // InternalEis.g:79:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* )
            // InternalEis.g:80:3: otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEisModelAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEisModelAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:88:3: ( (lv_project_name_2_0= RULE_STRING ) )
            // InternalEis.g:89:4: (lv_project_name_2_0= RULE_STRING )
            {
            // InternalEis.g:89:4: (lv_project_name_2_0= RULE_STRING )
            // InternalEis.g:90:5: lv_project_name_2_0= RULE_STRING
            {
            lv_project_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_project_name_2_0, grammarAccess.getEisModelAccess().getProject_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEisModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"project_name",
            						lv_project_name_2_0,
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEisModelAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEisModelAccess().getPlcnameKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getEisModelAccess().getEqualsSignKeyword_5());
            		
            // InternalEis.g:118:3: ( (lv_plc_name_6_0= RULE_STRING ) )
            // InternalEis.g:119:4: (lv_plc_name_6_0= RULE_STRING )
            {
            // InternalEis.g:119:4: (lv_plc_name_6_0= RULE_STRING )
            // InternalEis.g:120:5: lv_plc_name_6_0= RULE_STRING
            {
            lv_plc_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_plc_name_6_0, grammarAccess.getEisModelAccess().getPlc_nameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEisModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"plc_name",
            						lv_plc_name_6_0,
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEisModelAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getEisModelAccess().getAuthorKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getEisModelAccess().getEqualsSignKeyword_9());
            		
            // InternalEis.g:148:3: ( (lv_author_name_10_0= RULE_STRING ) )
            // InternalEis.g:149:4: (lv_author_name_10_0= RULE_STRING )
            {
            // InternalEis.g:149:4: (lv_author_name_10_0= RULE_STRING )
            // InternalEis.g:150:5: lv_author_name_10_0= RULE_STRING
            {
            lv_author_name_10_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_author_name_10_0, grammarAccess.getEisModelAccess().getAuthor_nameSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEisModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author_name",
            						lv_author_name_10_0,
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getEisModelAccess().getSemicolonKeyword_11());
            		
            // InternalEis.g:170:3: ( (lv_testcases_12_0= ruleTestcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:171:4: (lv_testcases_12_0= ruleTestcase )
            	    {
            	    // InternalEis.g:171:4: (lv_testcases_12_0= ruleTestcase )
            	    // InternalEis.g:172:5: lv_testcases_12_0= ruleTestcase
            	    {

            	    					newCompositeNode(grammarAccess.getEisModelAccess().getTestcasesTestcaseParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_testcases_12_0=ruleTestcase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEisModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testcases",
            	    						lv_testcases_12_0,
            	    						"org.xtext.eis.Eis.Testcase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalEis.g:193:1: entryRuleTestcase returns [EObject current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final EObject entryRuleTestcase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestcase = null;


        try {
            // InternalEis.g:193:49: (iv_ruleTestcase= ruleTestcase EOF )
            // InternalEis.g:194:2: iv_ruleTestcase= ruleTestcase EOF
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
    // InternalEis.g:200:1: ruleTestcase returns [EObject current=null] : (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' ) ;
    public final EObject ruleTestcase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_testcase_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_testblock_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:206:2: ( (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' ) )
            // InternalEis.g:207:2: (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' )
            {
            // InternalEis.g:207:2: (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' )
            // InternalEis.g:208:3: otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0());
            		
            // InternalEis.g:212:3: ( (lv_testcase_name_1_0= RULE_ID ) )
            // InternalEis.g:213:4: (lv_testcase_name_1_0= RULE_ID )
            {
            // InternalEis.g:213:4: (lv_testcase_name_1_0= RULE_ID )
            // InternalEis.g:214:5: lv_testcase_name_1_0= RULE_ID
            {
            lv_testcase_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_testcase_name_1_0, grammarAccess.getTestcaseAccess().getTestcase_nameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestcaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"testcase_name",
            						lv_testcase_name_1_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEis.g:234:3: ( (lv_testblock_3_0= ruleTestblock ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEis.g:235:4: (lv_testblock_3_0= ruleTestblock )
                    {
                    // InternalEis.g:235:4: (lv_testblock_3_0= ruleTestblock )
                    // InternalEis.g:236:5: lv_testblock_3_0= ruleTestblock
                    {

                    					newCompositeNode(grammarAccess.getTestcaseAccess().getTestblockTestblockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_testblock_3_0=ruleTestblock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestcaseRule());
                    					}
                    					set(
                    						current,
                    						"testblock",
                    						lv_testblock_3_0,
                    						"org.xtext.eis.Eis.Testblock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleTestblock"
    // InternalEis.g:261:1: entryRuleTestblock returns [EObject current=null] : iv_ruleTestblock= ruleTestblock EOF ;
    public final EObject entryRuleTestblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestblock = null;


        try {
            // InternalEis.g:261:50: (iv_ruleTestblock= ruleTestblock EOF )
            // InternalEis.g:262:2: iv_ruleTestblock= ruleTestblock EOF
            {
             newCompositeNode(grammarAccess.getTestblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestblock=ruleTestblock();

            state._fsp--;

             current =iv_ruleTestblock; 
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
    // $ANTLR end "entryRuleTestblock"


    // $ANTLR start "ruleTestblock"
    // InternalEis.g:268:1: ruleTestblock returns [EObject current=null] : (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_define_12_0= ruleDefineBlock ) )? ) ;
    public final EObject ruleTestblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        EObject lv_testActive_2_0 = null;

        EObject lv_blockType_6_0 = null;

        EObject lv_define_12_0 = null;



        	enterRule();

        try {
            // InternalEis.g:274:2: ( (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_define_12_0= ruleDefineBlock ) )? ) )
            // InternalEis.g:275:2: (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_define_12_0= ruleDefineBlock ) )? )
            {
            // InternalEis.g:275:2: (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_define_12_0= ruleDefineBlock ) )? )
            // InternalEis.g:276:3: otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_define_12_0= ruleDefineBlock ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestblockAccess().getTestActiveKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTestblockAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:284:3: ( (lv_testActive_2_0= ruleBoolConstant ) )
            // InternalEis.g:285:4: (lv_testActive_2_0= ruleBoolConstant )
            {
            // InternalEis.g:285:4: (lv_testActive_2_0= ruleBoolConstant )
            // InternalEis.g:286:5: lv_testActive_2_0= ruleBoolConstant
            {

            					newCompositeNode(grammarAccess.getTestblockAccess().getTestActiveBoolConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_testActive_2_0=ruleBoolConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestblockRule());
            					}
            					set(
            						current,
            						"testActive",
            						lv_testActive_2_0,
            						"org.xtext.eis.Eis.BoolConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTestblockAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTestblockAccess().getBlockTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getTestblockAccess().getEqualsSignKeyword_5());
            		
            // InternalEis.g:315:3: ( (lv_blockType_6_0= ruleBlockConstant ) )
            // InternalEis.g:316:4: (lv_blockType_6_0= ruleBlockConstant )
            {
            // InternalEis.g:316:4: (lv_blockType_6_0= ruleBlockConstant )
            // InternalEis.g:317:5: lv_blockType_6_0= ruleBlockConstant
            {

            					newCompositeNode(grammarAccess.getTestblockAccess().getBlockTypeBlockConstantParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_blockType_6_0=ruleBlockConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestblockRule());
            					}
            					set(
            						current,
            						"blockType",
            						lv_blockType_6_0,
            						"org.xtext.eis.Eis.BlockConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getTestblockAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTestblockAccess().getDescriptionKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getTestblockAccess().getEqualsSignKeyword_9());
            		
            // InternalEis.g:346:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalEis.g:347:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalEis.g:347:4: (lv_description_10_0= RULE_STRING )
            // InternalEis.g:348:5: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_description_10_0, grammarAccess.getTestblockAccess().getDescriptionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestblockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_10_0,
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTestblockAccess().getSemicolonKeyword_11());
            		
            // InternalEis.g:368:3: ( (lv_define_12_0= ruleDefineBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEis.g:369:4: (lv_define_12_0= ruleDefineBlock )
                    {
                    // InternalEis.g:369:4: (lv_define_12_0= ruleDefineBlock )
                    // InternalEis.g:370:5: lv_define_12_0= ruleDefineBlock
                    {

                    					newCompositeNode(grammarAccess.getTestblockAccess().getDefineDefineBlockParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_define_12_0=ruleDefineBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestblockRule());
                    					}
                    					set(
                    						current,
                    						"define",
                    						lv_define_12_0,
                    						"org.xtext.eis.Eis.DefineBlock");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleTestblock"


    // $ANTLR start "entryRuleBoolConstant"
    // InternalEis.g:391:1: entryRuleBoolConstant returns [EObject current=null] : iv_ruleBoolConstant= ruleBoolConstant EOF ;
    public final EObject entryRuleBoolConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstant = null;


        try {
            // InternalEis.g:391:53: (iv_ruleBoolConstant= ruleBoolConstant EOF )
            // InternalEis.g:392:2: iv_ruleBoolConstant= ruleBoolConstant EOF
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
    // InternalEis.g:398:1: ruleBoolConstant returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEis.g:404:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalEis.g:405:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalEis.g:405:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalEis.g:406:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalEis.g:406:3: (lv_value_0_0= ruleBooleanValue )
            // InternalEis.g:407:4: lv_value_0_0= ruleBooleanValue
            {

            				newCompositeNode(grammarAccess.getBoolConstantAccess().getValueBooleanValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoolConstantRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.eis.Eis.BooleanValue");
            				afterParserOrEnumRuleCall();
            			

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
    // InternalEis.g:427:1: entryRuleBlockConstant returns [EObject current=null] : iv_ruleBlockConstant= ruleBlockConstant EOF ;
    public final EObject entryRuleBlockConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockConstant = null;


        try {
            // InternalEis.g:427:54: (iv_ruleBlockConstant= ruleBlockConstant EOF )
            // InternalEis.g:428:2: iv_ruleBlockConstant= ruleBlockConstant EOF
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
    // InternalEis.g:434:1: ruleBlockConstant returns [EObject current=null] : ( (lv_value_0_0= ruleBlockValue ) ) ;
    public final EObject ruleBlockConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEis.g:440:2: ( ( (lv_value_0_0= ruleBlockValue ) ) )
            // InternalEis.g:441:2: ( (lv_value_0_0= ruleBlockValue ) )
            {
            // InternalEis.g:441:2: ( (lv_value_0_0= ruleBlockValue ) )
            // InternalEis.g:442:3: (lv_value_0_0= ruleBlockValue )
            {
            // InternalEis.g:442:3: (lv_value_0_0= ruleBlockValue )
            // InternalEis.g:443:4: lv_value_0_0= ruleBlockValue
            {

            				newCompositeNode(grammarAccess.getBlockConstantAccess().getValueBlockValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBlockValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBlockConstantRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.eis.Eis.BlockValue");
            				afterParserOrEnumRuleCall();
            			

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


    // $ANTLR start "entryRuleBlockValue"
    // InternalEis.g:463:1: entryRuleBlockValue returns [String current=null] : iv_ruleBlockValue= ruleBlockValue EOF ;
    public final String entryRuleBlockValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockValue = null;


        try {
            // InternalEis.g:463:50: (iv_ruleBlockValue= ruleBlockValue EOF )
            // InternalEis.g:464:2: iv_ruleBlockValue= ruleBlockValue EOF
            {
             newCompositeNode(grammarAccess.getBlockValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockValue=ruleBlockValue();

            state._fsp--;

             current =iv_ruleBlockValue.getText(); 
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
    // $ANTLR end "entryRuleBlockValue"


    // $ANTLR start "ruleBlockValue"
    // InternalEis.g:470:1: ruleBlockValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FC' | kw= 'FB' ) ;
    public final AntlrDatatypeRuleToken ruleBlockValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEis.g:476:2: ( (kw= 'FC' | kw= 'FB' ) )
            // InternalEis.g:477:2: (kw= 'FC' | kw= 'FB' )
            {
            // InternalEis.g:477:2: (kw= 'FC' | kw= 'FB' )
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
                    // InternalEis.g:478:3: kw= 'FC'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlockValueAccess().getFCKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEis.g:484:3: kw= 'FB'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlockValueAccess().getFBKeyword_1());
                    		

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
    // $ANTLR end "ruleBlockValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalEis.g:493:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalEis.g:493:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalEis.g:494:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue.getText(); 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalEis.g:500:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEis.g:506:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEis.g:507:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEis.g:507:2: (kw= 'true' | kw= 'false' )
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
                    // InternalEis.g:508:3: kw= 'true'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEis.g:514:3: kw= 'false'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleDefineBlock"
    // InternalEis.g:523:1: entryRuleDefineBlock returns [EObject current=null] : iv_ruleDefineBlock= ruleDefineBlock EOF ;
    public final EObject entryRuleDefineBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineBlock = null;


        try {
            // InternalEis.g:523:52: (iv_ruleDefineBlock= ruleDefineBlock EOF )
            // InternalEis.g:524:2: iv_ruleDefineBlock= ruleDefineBlock EOF
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
    // InternalEis.g:530:1: ruleDefineBlock returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* ) ;
    public final EObject ruleDefineBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_direction_2_0 = null;

        EObject lv_teststeps_4_0 = null;



        	enterRule();

        try {
            // InternalEis.g:536:2: ( (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* ) )
            // InternalEis.g:537:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* )
            {
            // InternalEis.g:537:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* )
            // InternalEis.g:538:3: otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineBlockAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEis.g:546:3: ( (lv_direction_2_0= ruleDirectionBlock ) )
            // InternalEis.g:547:4: (lv_direction_2_0= ruleDirectionBlock )
            {
            // InternalEis.g:547:4: (lv_direction_2_0= ruleDirectionBlock )
            // InternalEis.g:548:5: lv_direction_2_0= ruleDirectionBlock
            {

            					newCompositeNode(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalEis.g:569:3: ( (lv_teststeps_4_0= ruleTeststepBlock ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==63) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEis.g:570:4: (lv_teststeps_4_0= ruleTeststepBlock )
            	    {
            	    // InternalEis.g:570:4: (lv_teststeps_4_0= ruleTeststepBlock )
            	    // InternalEis.g:571:5: lv_teststeps_4_0= ruleTeststepBlock
            	    {

            	    					newCompositeNode(grammarAccess.getDefineBlockAccess().getTeststepsTeststepBlockParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
    // InternalEis.g:592:1: entryRuleDirectionBlock returns [EObject current=null] : iv_ruleDirectionBlock= ruleDirectionBlock EOF ;
    public final EObject entryRuleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionBlock = null;


        try {
            // InternalEis.g:592:55: (iv_ruleDirectionBlock= ruleDirectionBlock EOF )
            // InternalEis.g:593:2: iv_ruleDirectionBlock= ruleDirectionBlock EOF
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
    // InternalEis.g:599:1: ruleDirectionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_input_1_0 = null;

        EObject lv_output_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:605:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:606:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:606:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:607:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:607:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:608:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:611:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?)
            // InternalEis.g:612:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:612:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEis.g:613:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    {
            	    // InternalEis.g:613:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    // InternalEis.g:614:4: {...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:614:108: ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    // InternalEis.g:615:5: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:618:8: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    // InternalEis.g:618:9: {...}? => ( (lv_input_1_0= ruleInput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:618:18: ( (lv_input_1_0= ruleInput ) )
            	    // InternalEis.g:618:19: (lv_input_1_0= ruleInput )
            	    {
            	    // InternalEis.g:618:19: (lv_input_1_0= ruleInput )
            	    // InternalEis.g:619:9: lv_input_1_0= ruleInput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInputInputParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_20);
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
            	    // InternalEis.g:641:3: ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) )
            	    {
            	    // InternalEis.g:641:3: ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) )
            	    // InternalEis.g:642:4: {...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:642:108: ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) )
            	    // InternalEis.g:643:5: ({...}? => ( (lv_output_2_0= ruleOutput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:646:8: ({...}? => ( (lv_output_2_0= ruleOutput ) ) )
            	    // InternalEis.g:646:9: {...}? => ( (lv_output_2_0= ruleOutput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:646:18: ( (lv_output_2_0= ruleOutput ) )
            	    // InternalEis.g:646:19: (lv_output_2_0= ruleOutput )
            	    {
            	    // InternalEis.g:646:19: (lv_output_2_0= ruleOutput )
            	    // InternalEis.g:647:9: lv_output_2_0= ruleOutput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_20);
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
    // InternalEis.g:680:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalEis.g:680:46: (iv_ruleInput= ruleInput EOF )
            // InternalEis.g:681:2: iv_ruleInput= ruleInput EOF
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
    // InternalEis.g:687:1: ruleInput returns [EObject current=null] : ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:693:2: ( ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:694:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:694:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:695:3: ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:695:3: ( (lv_name_0_0= 'input' ) )
            // InternalEis.g:696:4: (lv_name_0_0= 'input' )
            {
            // InternalEis.g:696:4: (lv_name_0_0= 'input' )
            // InternalEis.g:697:5: lv_name_0_0= 'input'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInputAccess().getNameInputKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "input");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:713:3: ( (lv_inputVariables_2_0= ruleVariables ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=43 && LA8_0<=44)||LA8_0==47||(LA8_0>=67 && LA8_0<=86)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEis.g:714:4: (lv_inputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:714:4: (lv_inputVariables_2_0= ruleVariables )
            	    // InternalEis.g:715:5: lv_inputVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getInputVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
    // InternalEis.g:740:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalEis.g:740:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalEis.g:741:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalEis.g:747:1: ruleOutput returns [EObject current=null] : ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_outputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:753:2: ( ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:754:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:754:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:755:3: ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:755:3: ( (lv_name_0_0= 'output' ) )
            // InternalEis.g:756:4: (lv_name_0_0= 'output' )
            {
            // InternalEis.g:756:4: (lv_name_0_0= 'output' )
            // InternalEis.g:757:5: lv_name_0_0= 'output'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOutputAccess().getNameOutputKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "output");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:773:3: ( (lv_outputVariables_2_0= ruleVariables ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=43 && LA9_0<=44)||LA9_0==47||(LA9_0>=67 && LA9_0<=86)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEis.g:774:4: (lv_outputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:774:4: (lv_outputVariables_2_0= ruleVariables )
            	    // InternalEis.g:775:5: lv_outputVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getOutputAccess().getOutputVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
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


    // $ANTLR start "entryRuleVariables"
    // InternalEis.g:800:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalEis.g:800:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalEis.g:801:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalEis.g:807:1: ruleVariables returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Udt_1 = null;

        EObject this_UdtRef_2 = null;



        	enterRule();

        try {
            // InternalEis.g:813:2: ( (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) )
            // InternalEis.g:814:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            {
            // InternalEis.g:814:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                switch ( input.LA(2) ) {
                case 47:
                    {
                    alt10=2;
                    }
                    break;
                case 44:
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
                case 86:
                    {
                    alt10=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>=24 && LA10_3<=25)||LA10_3==46) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==RULE_ID) ) {
                        alt10=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

                }
                break;
            case 44:
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
            case 86:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3>=24 && LA10_3<=25)||LA10_3==46) ) {
                    alt10=1;
                }
                else if ( (LA10_3==RULE_ID) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalEis.g:815:3: this_Variable_0= ruleVariable
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
                    // InternalEis.g:824:3: this_Udt_1= ruleUdt
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
                    // InternalEis.g:833:3: this_UdtRef_2= ruleUdtRef
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
    // InternalEis.g:845:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEis.g:845:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEis.g:846:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEis.g:852:1: ruleVariable returns [EObject current=null] : ( () ( (lv_inout_1_0= 'inout' ) )? ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variableType_3_0= ruleBasicType ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )? )? (otherlv_9= ';' | ( (lv_nextVariable_10_0= ',' ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_inout_1_0=null;
        Token lv_variantKeyword_2_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_nextVariable_10_0=null;
        Enumerator lv_variableType_3_0 = null;

        EObject lv_idiom_6_0 = null;

        EObject lv_range_8_0 = null;



        	enterRule();

        try {
            // InternalEis.g:858:2: ( ( () ( (lv_inout_1_0= 'inout' ) )? ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variableType_3_0= ruleBasicType ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )? )? (otherlv_9= ';' | ( (lv_nextVariable_10_0= ',' ) ) ) ) )
            // InternalEis.g:859:2: ( () ( (lv_inout_1_0= 'inout' ) )? ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variableType_3_0= ruleBasicType ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )? )? (otherlv_9= ';' | ( (lv_nextVariable_10_0= ',' ) ) ) )
            {
            // InternalEis.g:859:2: ( () ( (lv_inout_1_0= 'inout' ) )? ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variableType_3_0= ruleBasicType ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )? )? (otherlv_9= ';' | ( (lv_nextVariable_10_0= ',' ) ) ) )
            // InternalEis.g:860:3: () ( (lv_inout_1_0= 'inout' ) )? ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variableType_3_0= ruleBasicType ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )? )? (otherlv_9= ';' | ( (lv_nextVariable_10_0= ',' ) ) )
            {
            // InternalEis.g:860:3: ()
            // InternalEis.g:861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalEis.g:867:3: ( (lv_inout_1_0= 'inout' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEis.g:868:4: (lv_inout_1_0= 'inout' )
                    {
                    // InternalEis.g:868:4: (lv_inout_1_0= 'inout' )
                    // InternalEis.g:869:5: lv_inout_1_0= 'inout'
                    {
                    lv_inout_1_0=(Token)match(input,43,FOLLOW_23); 

                    					newLeafNode(lv_inout_1_0, grammarAccess.getVariableAccess().getInoutInoutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "inout", true, "inout");
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:881:3: ( (lv_variantKeyword_2_0= 'variant' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEis.g:882:4: (lv_variantKeyword_2_0= 'variant' )
                    {
                    // InternalEis.g:882:4: (lv_variantKeyword_2_0= 'variant' )
                    // InternalEis.g:883:5: lv_variantKeyword_2_0= 'variant'
                    {
                    lv_variantKeyword_2_0=(Token)match(input,44,FOLLOW_24); 

                    					newLeafNode(lv_variantKeyword_2_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "variantKeyword", true, "variant");
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:895:3: ( (lv_variableType_3_0= ruleBasicType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=67 && LA13_0<=86)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEis.g:896:4: (lv_variableType_3_0= ruleBasicType )
                    {
                    // InternalEis.g:896:4: (lv_variableType_3_0= ruleBasicType )
                    // InternalEis.g:897:5: lv_variableType_3_0= ruleBasicType
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeBasicTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_variableType_3_0=ruleBasicType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"variableType",
                    						lv_variableType_3_0,
                    						"org.xtext.eis.Eis.BasicType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:914:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalEis.g:915:4: (lv_name_4_0= RULE_ID )
            {
            // InternalEis.g:915:4: (lv_name_4_0= RULE_ID )
            // InternalEis.g:916:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_4_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            // InternalEis.g:932:3: (otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEis.g:933:4: otherlv_5= '=' ( (lv_idiom_6_0= ruleIdiom ) ) (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )?
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalEis.g:937:4: ( (lv_idiom_6_0= ruleIdiom ) )
                    // InternalEis.g:938:5: (lv_idiom_6_0= ruleIdiom )
                    {
                    // InternalEis.g:938:5: (lv_idiom_6_0= ruleIdiom )
                    // InternalEis.g:939:6: lv_idiom_6_0= ruleIdiom
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getIdiomIdiomParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_idiom_6_0=ruleIdiom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"idiom",
                    							lv_idiom_6_0,
                    							"org.xtext.eis.Eis.Idiom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEis.g:956:4: (otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==45) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEis.g:957:5: otherlv_7= '+/-' ( (lv_range_8_0= ruleIdiom ) )
                            {
                            otherlv_7=(Token)match(input,45,FOLLOW_26); 

                            					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_5_2_0());
                            				
                            // InternalEis.g:961:5: ( (lv_range_8_0= ruleIdiom ) )
                            // InternalEis.g:962:6: (lv_range_8_0= ruleIdiom )
                            {
                            // InternalEis.g:962:6: (lv_range_8_0= ruleIdiom )
                            // InternalEis.g:963:7: lv_range_8_0= ruleIdiom
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getRangeIdiomParserRuleCall_5_2_1_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_range_8_0=ruleIdiom();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"range",
                            								lv_range_8_0,
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

            // InternalEis.g:982:3: (otherlv_9= ';' | ( (lv_nextVariable_10_0= ',' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==46) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEis.g:983:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getSemicolonKeyword_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEis.g:988:4: ( (lv_nextVariable_10_0= ',' ) )
                    {
                    // InternalEis.g:988:4: ( (lv_nextVariable_10_0= ',' ) )
                    // InternalEis.g:989:5: (lv_nextVariable_10_0= ',' )
                    {
                    // InternalEis.g:989:5: (lv_nextVariable_10_0= ',' )
                    // InternalEis.g:990:6: lv_nextVariable_10_0= ','
                    {
                    lv_nextVariable_10_0=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_nextVariable_10_0, grammarAccess.getVariableAccess().getNextVariableCommaKeyword_6_1_0());
                    					

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
    // InternalEis.g:1007:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalEis.g:1007:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalEis.g:1008:2: iv_ruleUdt= ruleUdt EOF
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
    // InternalEis.g:1014:1: ruleUdt returns [EObject current=null] : ( ( (lv_inout_0_0= 'inout' ) )? otherlv_1= 'udt' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_udtType_4_0= ruleUdtType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_udtVariables_7_0= ruleVariables ) )* otherlv_8= '}' ) ;
    public final EObject ruleUdt() throws RecognitionException {
        EObject current = null;

        Token lv_inout_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_udtType_4_0 = null;

        EObject lv_udtVariables_7_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1020:2: ( ( ( (lv_inout_0_0= 'inout' ) )? otherlv_1= 'udt' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_udtType_4_0= ruleUdtType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_udtVariables_7_0= ruleVariables ) )* otherlv_8= '}' ) )
            // InternalEis.g:1021:2: ( ( (lv_inout_0_0= 'inout' ) )? otherlv_1= 'udt' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_udtType_4_0= ruleUdtType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_udtVariables_7_0= ruleVariables ) )* otherlv_8= '}' )
            {
            // InternalEis.g:1021:2: ( ( (lv_inout_0_0= 'inout' ) )? otherlv_1= 'udt' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_udtType_4_0= ruleUdtType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_udtVariables_7_0= ruleVariables ) )* otherlv_8= '}' )
            // InternalEis.g:1022:3: ( (lv_inout_0_0= 'inout' ) )? otherlv_1= 'udt' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_udtType_4_0= ruleUdtType ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_udtVariables_7_0= ruleVariables ) )* otherlv_8= '}'
            {
            // InternalEis.g:1022:3: ( (lv_inout_0_0= 'inout' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEis.g:1023:4: (lv_inout_0_0= 'inout' )
                    {
                    // InternalEis.g:1023:4: (lv_inout_0_0= 'inout' )
                    // InternalEis.g:1024:5: lv_inout_0_0= 'inout'
                    {
                    lv_inout_0_0=(Token)match(input,43,FOLLOW_29); 

                    					newLeafNode(lv_inout_0_0, grammarAccess.getUdtAccess().getInoutInoutKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUdtRule());
                    					}
                    					setWithLastConsumed(current, "inout", true, "inout");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUdtAccess().getUdtKeyword_1());
            		
            // InternalEis.g:1040:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEis.g:1041:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEis.g:1041:4: (lv_name_2_0= RULE_ID )
            // InternalEis.g:1042:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUdtAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEis.g:1062:3: ( (lv_udtType_4_0= ruleUdtType ) )
            // InternalEis.g:1063:4: (lv_udtType_4_0= ruleUdtType )
            {
            // InternalEis.g:1063:4: (lv_udtType_4_0= ruleUdtType )
            // InternalEis.g:1064:5: lv_udtType_4_0= ruleUdtType
            {

            					newCompositeNode(grammarAccess.getUdtAccess().getUdtTypeUdtTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_udtType_4_0=ruleUdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUdtRule());
            					}
            					set(
            						current,
            						"udtType",
            						lv_udtType_4_0,
            						"org.xtext.eis.Eis.UdtType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalEis.g:1089:3: ( (lv_udtVariables_7_0= ruleVariables ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=43 && LA18_0<=44)||LA18_0==47||(LA18_0>=67 && LA18_0<=86)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEis.g:1090:4: (lv_udtVariables_7_0= ruleVariables )
            	    {
            	    // InternalEis.g:1090:4: (lv_udtVariables_7_0= ruleVariables )
            	    // InternalEis.g:1091:5: lv_udtVariables_7_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getUdtAccess().getUdtVariablesVariablesParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_udtVariables_7_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_7_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUdtAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalEis.g:1116:1: entryRuleUdtRef returns [EObject current=null] : iv_ruleUdtRef= ruleUdtRef EOF ;
    public final EObject entryRuleUdtRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtRef = null;


        try {
            // InternalEis.g:1116:47: (iv_ruleUdtRef= ruleUdtRef EOF )
            // InternalEis.g:1117:2: iv_ruleUdtRef= ruleUdtRef EOF
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
    // InternalEis.g:1123:1: ruleUdtRef returns [EObject current=null] : ( ( (lv_inout_0_0= 'inout' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_udtVariables_3_0= ruleVariables ) )* otherlv_4= ';' ) ;
    public final EObject ruleUdtRef() throws RecognitionException {
        EObject current = null;

        Token lv_inout_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_udtVariables_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1129:2: ( ( ( (lv_inout_0_0= 'inout' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_udtVariables_3_0= ruleVariables ) )* otherlv_4= ';' ) )
            // InternalEis.g:1130:2: ( ( (lv_inout_0_0= 'inout' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_udtVariables_3_0= ruleVariables ) )* otherlv_4= ';' )
            {
            // InternalEis.g:1130:2: ( ( (lv_inout_0_0= 'inout' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_udtVariables_3_0= ruleVariables ) )* otherlv_4= ';' )
            // InternalEis.g:1131:3: ( (lv_inout_0_0= 'inout' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_udtVariables_3_0= ruleVariables ) )* otherlv_4= ';'
            {
            // InternalEis.g:1131:3: ( (lv_inout_0_0= 'inout' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEis.g:1132:4: (lv_inout_0_0= 'inout' )
                    {
                    // InternalEis.g:1132:4: (lv_inout_0_0= 'inout' )
                    // InternalEis.g:1133:5: lv_inout_0_0= 'inout'
                    {
                    lv_inout_0_0=(Token)match(input,43,FOLLOW_9); 

                    					newLeafNode(lv_inout_0_0, grammarAccess.getUdtRefAccess().getInoutInoutKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUdtRefRule());
                    					}
                    					setWithLastConsumed(current, "inout", true, "inout");
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:1145:3: ( (otherlv_1= RULE_ID ) )
            // InternalEis.g:1146:4: (otherlv_1= RULE_ID )
            {
            // InternalEis.g:1146:4: (otherlv_1= RULE_ID )
            // InternalEis.g:1147:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getUdtRefAccess().getUdtTypeUdtTypeCrossReference_1_0());
            				

            }


            }

            // InternalEis.g:1158:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEis.g:1159:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEis.g:1159:4: (lv_name_2_0= RULE_ID )
            // InternalEis.g:1160:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUdtRefAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            // InternalEis.g:1176:3: ( (lv_udtVariables_3_0= ruleVariables ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=43 && LA20_0<=44)||LA20_0==47||(LA20_0>=67 && LA20_0<=86)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEis.g:1177:4: (lv_udtVariables_3_0= ruleVariables )
            	    {
            	    // InternalEis.g:1177:4: (lv_udtVariables_3_0= ruleVariables )
            	    // InternalEis.g:1178:5: lv_udtVariables_3_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getUdtRefAccess().getUdtVariablesVariablesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_udtVariables_3_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_3_0,
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUdtRefAccess().getSemicolonKeyword_4());
            		

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
    // InternalEis.g:1203:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalEis.g:1203:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalEis.g:1204:2: iv_ruleUdtType= ruleUdtType EOF
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
    // InternalEis.g:1210:1: ruleUdtType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEis.g:1216:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEis.g:1217:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEis.g:1217:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEis.g:1218:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEis.g:1218:3: (lv_name_0_0= RULE_ID )
            // InternalEis.g:1219:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleIdiom"
    // InternalEis.g:1238:1: entryRuleIdiom returns [EObject current=null] : iv_ruleIdiom= ruleIdiom EOF ;
    public final EObject entryRuleIdiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdiom = null;


        try {
            // InternalEis.g:1238:46: (iv_ruleIdiom= ruleIdiom EOF )
            // InternalEis.g:1239:2: iv_ruleIdiom= ruleIdiom EOF
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
    // InternalEis.g:1245:1: ruleIdiom returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleIdiom() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1251:2: (this_Or_0= ruleOr )
            // InternalEis.g:1252:2: this_Or_0= ruleOr
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
    // InternalEis.g:1263:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalEis.g:1263:43: (iv_ruleOr= ruleOr EOF )
            // InternalEis.g:1264:2: iv_ruleOr= ruleOr EOF
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
    // InternalEis.g:1270:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1276:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalEis.g:1277:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalEis.g:1277:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalEis.g:1278:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1286:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEis.g:1287:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalEis.g:1287:4: ()
            	    // InternalEis.g:1288:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEis.g:1298:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalEis.g:1299:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalEis.g:1299:5: (lv_right_3_0= ruleAnd )
            	    // InternalEis.g:1300:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop21;
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
    // InternalEis.g:1322:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalEis.g:1322:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalEis.g:1323:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalEis.g:1329:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1335:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalEis.g:1336:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalEis.g:1336:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalEis.g:1337:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1345:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEis.g:1346:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalEis.g:1346:4: ()
            	    // InternalEis.g:1347:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEis.g:1357:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalEis.g:1358:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalEis.g:1358:5: (lv_right_3_0= ruleEquality )
            	    // InternalEis.g:1359:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop22;
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
    // InternalEis.g:1381:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalEis.g:1381:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalEis.g:1382:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalEis.g:1388:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1394:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalEis.g:1395:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalEis.g:1395:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalEis.g:1396:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1404:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=52 && LA24_0<=53)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEis.g:1405:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalEis.g:1405:4: ()
            	    // InternalEis.g:1406:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1412:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalEis.g:1413:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalEis.g:1413:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalEis.g:1414:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalEis.g:1414:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==52) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==53) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalEis.g:1415:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,52,FOLLOW_26); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1426:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,53,FOLLOW_26); 

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

            	    // InternalEis.g:1439:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalEis.g:1440:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalEis.g:1440:5: (lv_right_3_0= ruleComparison )
            	    // InternalEis.g:1441:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop24;
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
    // InternalEis.g:1463:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEis.g:1463:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEis.g:1464:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEis.g:1470:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalEis.g:1476:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalEis.g:1477:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalEis.g:1477:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalEis.g:1478:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1486:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=54 && LA26_0<=57)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEis.g:1487:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalEis.g:1487:4: ()
            	    // InternalEis.g:1488:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1494:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalEis.g:1495:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalEis.g:1495:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalEis.g:1496:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalEis.g:1496:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case 54:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalEis.g:1497:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,54,FOLLOW_26); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1508:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,55,FOLLOW_26); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalEis.g:1519:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,56,FOLLOW_26); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalEis.g:1530:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,57,FOLLOW_26); 

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

            	    // InternalEis.g:1543:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalEis.g:1544:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalEis.g:1544:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalEis.g:1545:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalEis.g:1567:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalEis.g:1567:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalEis.g:1568:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalEis.g:1574:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1580:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalEis.g:1581:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalEis.g:1581:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalEis.g:1582:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1590:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=58 && LA28_0<=59)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEis.g:1591:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalEis.g:1591:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==58) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==59) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalEis.g:1592:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalEis.g:1592:5: ( () otherlv_2= '+' )
            	            // InternalEis.g:1593:6: () otherlv_2= '+'
            	            {
            	            // InternalEis.g:1593:6: ()
            	            // InternalEis.g:1594:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,58,FOLLOW_26); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1606:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalEis.g:1606:5: ( () otherlv_4= '-' )
            	            // InternalEis.g:1607:6: () otherlv_4= '-'
            	            {
            	            // InternalEis.g:1607:6: ()
            	            // InternalEis.g:1608:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,59,FOLLOW_26); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEis.g:1620:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalEis.g:1621:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalEis.g:1621:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalEis.g:1622:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalEis.g:1644:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalEis.g:1644:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalEis.g:1645:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalEis.g:1651:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1657:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalEis.g:1658:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalEis.g:1658:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalEis.g:1659:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1667:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=60 && LA30_0<=61)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEis.g:1668:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalEis.g:1668:4: ()
            	    // InternalEis.g:1669:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1675:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalEis.g:1676:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalEis.g:1676:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalEis.g:1677:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalEis.g:1677:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==60) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==61) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalEis.g:1678:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,60,FOLLOW_26); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1689:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,61,FOLLOW_26); 

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

            	    // InternalEis.g:1702:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalEis.g:1703:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalEis.g:1703:5: (lv_right_3_0= rulePrimary )
            	    // InternalEis.g:1704:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalEis.g:1726:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEis.g:1726:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEis.g:1727:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEis.g:1733:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalEis.g:1739:2: ( ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalEis.g:1740:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalEis.g:1740:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt31=1;
                }
                break;
            case 62:
                {
                alt31=2;
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
            case 36:
            case 37:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalEis.g:1741:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    {
                    // InternalEis.g:1741:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    // InternalEis.g:1742:4: otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getIdiomParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_31);
                    this_Idiom_1=ruleIdiom();

                    state._fsp--;


                    				current = this_Idiom_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:1760:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    {
                    // InternalEis.g:1760:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    // InternalEis.g:1761:4: () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) )
                    {
                    // InternalEis.g:1761:4: ()
                    // InternalEis.g:1762:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,62,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalEis.g:1772:4: ( (lv_idiom_5_0= rulePrimary ) )
                    // InternalEis.g:1773:5: (lv_idiom_5_0= rulePrimary )
                    {
                    // InternalEis.g:1773:5: (lv_idiom_5_0= rulePrimary )
                    // InternalEis.g:1774:6: lv_idiom_5_0= rulePrimary
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
                    // InternalEis.g:1793:3: this_Atomic_6= ruleAtomic
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
    // InternalEis.g:1805:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalEis.g:1805:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalEis.g:1806:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalEis.g:1812:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) ) ;
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
            // InternalEis.g:1818:2: ( ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) ) )
            // InternalEis.g:1819:2: ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) )
            {
            // InternalEis.g:1819:2: ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) )
            int alt33=13;
            switch ( input.LA(1) ) {
            case RULE_LONG:
            case RULE_NEGATIVE_LONG:
                {
                alt33=1;
                }
                break;
            case RULE_STRING:
                {
                alt33=2;
                }
                break;
            case 36:
            case 37:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
                {
                alt33=4;
                }
                break;
            case RULE_REAL:
                {
                alt33=5;
                }
                break;
            case RULE_BYTE:
                {
                alt33=6;
                }
                break;
            case RULE_WORD:
                {
                alt33=7;
                }
                break;
            case RULE_DWORD:
                {
                alt33=8;
                }
                break;
            case RULE_LWORD:
                {
                alt33=9;
                }
                break;
            case RULE_CHAR:
                {
                alt33=10;
                }
                break;
            case RULE_TIME:
                {
                alt33=11;
                }
                break;
            case RULE_LTIME:
                {
                alt33=12;
                }
                break;
            case RULE_DATE:
                {
                alt33=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalEis.g:1820:3: ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) )
                    {
                    // InternalEis.g:1820:3: ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) )
                    // InternalEis.g:1821:4: () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) )
                    {
                    // InternalEis.g:1821:4: ()
                    // InternalEis.g:1822:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1828:4: ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) )
                    // InternalEis.g:1829:5: ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) )
                    {
                    // InternalEis.g:1829:5: ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) )
                    // InternalEis.g:1830:6: (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG )
                    {
                    // InternalEis.g:1830:6: (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_LONG) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_NEGATIVE_LONG) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalEis.g:1831:7: lv_value_1_1= RULE_LONG
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
                            // InternalEis.g:1846:7: lv_value_1_2= RULE_NEGATIVE_LONG
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
                    // InternalEis.g:1865:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalEis.g:1865:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalEis.g:1866:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEis.g:1866:4: ()
                    // InternalEis.g:1867:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1873:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEis.g:1874:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEis.g:1874:5: (lv_value_3_0= RULE_STRING )
                    // InternalEis.g:1875:6: lv_value_3_0= RULE_STRING
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
                    // InternalEis.g:1893:3: this_BoolConstant_4= ruleBoolConstant
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
                    // InternalEis.g:1902:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalEis.g:1902:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalEis.g:1903:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalEis.g:1903:4: ()
                    // InternalEis.g:1904:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1910:4: ( (otherlv_6= RULE_ID ) )
                    // InternalEis.g:1911:5: (otherlv_6= RULE_ID )
                    {
                    // InternalEis.g:1911:5: (otherlv_6= RULE_ID )
                    // InternalEis.g:1912:6: otherlv_6= RULE_ID
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
                    // InternalEis.g:1925:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    {
                    // InternalEis.g:1925:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    // InternalEis.g:1926:4: () ( (lv_value_8_0= RULE_REAL ) )
                    {
                    // InternalEis.g:1926:4: ()
                    // InternalEis.g:1927:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getRealConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1933:4: ( (lv_value_8_0= RULE_REAL ) )
                    // InternalEis.g:1934:5: (lv_value_8_0= RULE_REAL )
                    {
                    // InternalEis.g:1934:5: (lv_value_8_0= RULE_REAL )
                    // InternalEis.g:1935:6: lv_value_8_0= RULE_REAL
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
                    // InternalEis.g:1953:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    {
                    // InternalEis.g:1953:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    // InternalEis.g:1954:4: () ( (lv_value_10_0= RULE_BYTE ) )
                    {
                    // InternalEis.g:1954:4: ()
                    // InternalEis.g:1955:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getByteConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1961:4: ( (lv_value_10_0= RULE_BYTE ) )
                    // InternalEis.g:1962:5: (lv_value_10_0= RULE_BYTE )
                    {
                    // InternalEis.g:1962:5: (lv_value_10_0= RULE_BYTE )
                    // InternalEis.g:1963:6: lv_value_10_0= RULE_BYTE
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
                    // InternalEis.g:1981:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    {
                    // InternalEis.g:1981:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    // InternalEis.g:1982:4: () ( (lv_value_12_0= RULE_WORD ) )
                    {
                    // InternalEis.g:1982:4: ()
                    // InternalEis.g:1983:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getWordConstantAction_6_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1989:4: ( (lv_value_12_0= RULE_WORD ) )
                    // InternalEis.g:1990:5: (lv_value_12_0= RULE_WORD )
                    {
                    // InternalEis.g:1990:5: (lv_value_12_0= RULE_WORD )
                    // InternalEis.g:1991:6: lv_value_12_0= RULE_WORD
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
                    // InternalEis.g:2009:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    {
                    // InternalEis.g:2009:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    // InternalEis.g:2010:4: () ( (lv_value_14_0= RULE_DWORD ) )
                    {
                    // InternalEis.g:2010:4: ()
                    // InternalEis.g:2011:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDWordConstantAction_7_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2017:4: ( (lv_value_14_0= RULE_DWORD ) )
                    // InternalEis.g:2018:5: (lv_value_14_0= RULE_DWORD )
                    {
                    // InternalEis.g:2018:5: (lv_value_14_0= RULE_DWORD )
                    // InternalEis.g:2019:6: lv_value_14_0= RULE_DWORD
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
                    // InternalEis.g:2037:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    {
                    // InternalEis.g:2037:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    // InternalEis.g:2038:4: () ( (lv_value_16_0= RULE_LWORD ) )
                    {
                    // InternalEis.g:2038:4: ()
                    // InternalEis.g:2039:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLWordConstantAction_8_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2045:4: ( (lv_value_16_0= RULE_LWORD ) )
                    // InternalEis.g:2046:5: (lv_value_16_0= RULE_LWORD )
                    {
                    // InternalEis.g:2046:5: (lv_value_16_0= RULE_LWORD )
                    // InternalEis.g:2047:6: lv_value_16_0= RULE_LWORD
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
                    // InternalEis.g:2065:3: ( () ( (lv_value_18_0= RULE_CHAR ) ) )
                    {
                    // InternalEis.g:2065:3: ( () ( (lv_value_18_0= RULE_CHAR ) ) )
                    // InternalEis.g:2066:4: () ( (lv_value_18_0= RULE_CHAR ) )
                    {
                    // InternalEis.g:2066:4: ()
                    // InternalEis.g:2067:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getCharConstantAction_9_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2073:4: ( (lv_value_18_0= RULE_CHAR ) )
                    // InternalEis.g:2074:5: (lv_value_18_0= RULE_CHAR )
                    {
                    // InternalEis.g:2074:5: (lv_value_18_0= RULE_CHAR )
                    // InternalEis.g:2075:6: lv_value_18_0= RULE_CHAR
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
                    // InternalEis.g:2093:3: ( () ( (lv_value_20_0= RULE_TIME ) ) )
                    {
                    // InternalEis.g:2093:3: ( () ( (lv_value_20_0= RULE_TIME ) ) )
                    // InternalEis.g:2094:4: () ( (lv_value_20_0= RULE_TIME ) )
                    {
                    // InternalEis.g:2094:4: ()
                    // InternalEis.g:2095:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getTimeConstantAction_10_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2101:4: ( (lv_value_20_0= RULE_TIME ) )
                    // InternalEis.g:2102:5: (lv_value_20_0= RULE_TIME )
                    {
                    // InternalEis.g:2102:5: (lv_value_20_0= RULE_TIME )
                    // InternalEis.g:2103:6: lv_value_20_0= RULE_TIME
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
                    // InternalEis.g:2121:3: ( () ( (lv_value_22_0= RULE_LTIME ) ) )
                    {
                    // InternalEis.g:2121:3: ( () ( (lv_value_22_0= RULE_LTIME ) ) )
                    // InternalEis.g:2122:4: () ( (lv_value_22_0= RULE_LTIME ) )
                    {
                    // InternalEis.g:2122:4: ()
                    // InternalEis.g:2123:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLTimeConstantAction_11_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2129:4: ( (lv_value_22_0= RULE_LTIME ) )
                    // InternalEis.g:2130:5: (lv_value_22_0= RULE_LTIME )
                    {
                    // InternalEis.g:2130:5: (lv_value_22_0= RULE_LTIME )
                    // InternalEis.g:2131:6: lv_value_22_0= RULE_LTIME
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
                    // InternalEis.g:2149:3: ( () ( (lv_value_24_0= RULE_DATE ) ) )
                    {
                    // InternalEis.g:2149:3: ( () ( (lv_value_24_0= RULE_DATE ) ) )
                    // InternalEis.g:2150:4: () ( (lv_value_24_0= RULE_DATE ) )
                    {
                    // InternalEis.g:2150:4: ()
                    // InternalEis.g:2151:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDateConstantAction_12_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2157:4: ( (lv_value_24_0= RULE_DATE ) )
                    // InternalEis.g:2158:5: (lv_value_24_0= RULE_DATE )
                    {
                    // InternalEis.g:2158:5: (lv_value_24_0= RULE_DATE )
                    // InternalEis.g:2159:6: lv_value_24_0= RULE_DATE
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


    // $ANTLR start "entryRuleTeststepBlock"
    // InternalEis.g:2180:1: entryRuleTeststepBlock returns [EObject current=null] : iv_ruleTeststepBlock= ruleTeststepBlock EOF ;
    public final EObject entryRuleTeststepBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeststepBlock = null;


        try {
            // InternalEis.g:2180:54: (iv_ruleTeststepBlock= ruleTeststepBlock EOF )
            // InternalEis.g:2181:2: iv_ruleTeststepBlock= ruleTeststepBlock EOF
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
    // InternalEis.g:2187:1: ruleTeststepBlock returns [EObject current=null] : (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) ;
    public final EObject ruleTeststepBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
            // InternalEis.g:2193:2: ( (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) )
            // InternalEis.g:2194:2: (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            {
            // InternalEis.g:2194:2: (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            // InternalEis.g:2195:3: otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTeststepBlockAccess().getTeststepKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getTeststepBlockAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEis.g:2203:3: ( (lv_plcCycle_2_0= RULE_LONG ) )
            // InternalEis.g:2204:4: (lv_plcCycle_2_0= RULE_LONG )
            {
            // InternalEis.g:2204:4: (lv_plcCycle_2_0= RULE_LONG )
            // InternalEis.g:2205:5: lv_plcCycle_2_0= RULE_LONG
            {
            lv_plcCycle_2_0=(Token)match(input,RULE_LONG,FOLLOW_41); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTeststepBlockAccess().getCommaKeyword_3());
            		
            // InternalEis.g:2225:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalEis.g:2226:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalEis.g:2226:4: (lv_description_4_0= RULE_STRING )
            // InternalEis.g:2227:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            otherlv_5=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTeststepBlockAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_42); 

            			newLeafNode(otherlv_6, grammarAccess.getTeststepBlockAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalEis.g:2251:3: ( (lv_assertion_7_0= ruleAssertionBlock ) )
            // InternalEis.g:2252:4: (lv_assertion_7_0= ruleAssertionBlock )
            {
            // InternalEis.g:2252:4: (lv_assertion_7_0= ruleAssertionBlock )
            // InternalEis.g:2253:5: lv_assertion_7_0= ruleAssertionBlock
            {

            					newCompositeNode(grammarAccess.getTeststepBlockAccess().getAssertionAssertionBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

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
    // InternalEis.g:2278:1: entryRuleAssertionBlock returns [EObject current=null] : iv_ruleAssertionBlock= ruleAssertionBlock EOF ;
    public final EObject entryRuleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBlock = null;


        try {
            // InternalEis.g:2278:55: (iv_ruleAssertionBlock= ruleAssertionBlock EOF )
            // InternalEis.g:2279:2: iv_ruleAssertionBlock= ruleAssertionBlock EOF
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
    // InternalEis.g:2285:1: ruleAssertionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_set_1_0 = null;

        EObject lv_assert_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2291:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:2292:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:2292:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:2293:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:2293:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:2294:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:2297:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            // InternalEis.g:2298:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:2298:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEis.g:2299:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    {
            	    // InternalEis.g:2299:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    // InternalEis.g:2300:4: {...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:2300:108: ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    // InternalEis.g:2301:5: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:2304:8: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    // InternalEis.g:2304:9: {...}? => ( (lv_set_1_0= ruleSet ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:2304:18: ( (lv_set_1_0= ruleSet ) )
            	    // InternalEis.g:2304:19: (lv_set_1_0= ruleSet )
            	    {
            	    // InternalEis.g:2304:19: (lv_set_1_0= ruleSet )
            	    // InternalEis.g:2305:9: lv_set_1_0= ruleSet
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getSetSetParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_43);
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
            	    // InternalEis.g:2327:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    {
            	    // InternalEis.g:2327:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    // InternalEis.g:2328:4: {...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:2328:108: ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    // InternalEis.g:2329:5: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:2332:8: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    // InternalEis.g:2332:9: {...}? => ( (lv_assert_2_0= ruleAssert ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:2332:18: ( (lv_assert_2_0= ruleAssert ) )
            	    // InternalEis.g:2332:19: (lv_assert_2_0= ruleAssert )
            	    {
            	    // InternalEis.g:2332:19: (lv_assert_2_0= ruleAssert )
            	    // InternalEis.g:2333:9: lv_assert_2_0= ruleAssert
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getAssertAssertParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_43);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // InternalEis.g:2366:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalEis.g:2366:44: (iv_ruleSet= ruleSet EOF )
            // InternalEis.g:2367:2: iv_ruleSet= ruleSet EOF
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
    // InternalEis.g:2373:1: ruleSet returns [EObject current=null] : ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_setVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2379:2: ( ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:2380:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:2380:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:2381:3: ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:2381:3: ( (lv_name_0_0= 'set' ) )
            // InternalEis.g:2382:4: (lv_name_0_0= 'set' )
            {
            // InternalEis.g:2382:4: (lv_name_0_0= 'set' )
            // InternalEis.g:2383:5: lv_name_0_0= 'set'
            {
            lv_name_0_0=(Token)match(input,64,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSetAccess().getNameSetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "set");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:2399:3: ( (lv_setVariables_2_0= ruleStatement ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEis.g:2400:4: (lv_setVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:2400:4: (lv_setVariables_2_0= ruleStatement )
            	    // InternalEis.g:2401:5: lv_setVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSetAccess().getSetVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
            	    break loop35;
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
    // InternalEis.g:2426:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalEis.g:2426:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalEis.g:2427:2: iv_ruleAssert= ruleAssert EOF
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
    // InternalEis.g:2433:1: ruleAssert returns [EObject current=null] : ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assertVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2439:2: ( ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:2440:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:2440:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:2441:3: ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:2441:3: ( (lv_name_0_0= 'assert' ) )
            // InternalEis.g:2442:4: (lv_name_0_0= 'assert' )
            {
            // InternalEis.g:2442:4: (lv_name_0_0= 'assert' )
            // InternalEis.g:2443:5: lv_name_0_0= 'assert'
            {
            lv_name_0_0=(Token)match(input,65,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssertAccess().getNameAssertKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "assert");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:2459:3: ( (lv_assertVariables_2_0= ruleStatement ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEis.g:2460:4: (lv_assertVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:2460:4: (lv_assertVariables_2_0= ruleStatement )
            	    // InternalEis.g:2461:5: lv_assertVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getAssertAccess().getAssertVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
            	    break loop36;
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
    // InternalEis.g:2486:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEis.g:2486:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEis.g:2487:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalEis.g:2493:1: ruleStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' ) ;
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
            // InternalEis.g:2499:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' ) )
            // InternalEis.g:2500:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' )
            {
            // InternalEis.g:2500:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' )
            // InternalEis.g:2501:3: ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';'
            {
            // InternalEis.g:2501:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:2502:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:2502:4: (otherlv_0= RULE_ID )
            // InternalEis.g:2503:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVariableVariablesCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:2514:3: ( (lv_cascade_1_0= ruleCascade ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==66) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEis.g:2515:4: (lv_cascade_1_0= ruleCascade )
            	    {
            	    // InternalEis.g:2515:4: (lv_cascade_1_0= ruleCascade )
            	    // InternalEis.g:2516:5: lv_cascade_1_0= ruleCascade
            	    {

            	    					newCompositeNode(grammarAccess.getStatementAccess().getCascadeCascadeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop37;
                }
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalEis.g:2537:3: ( (lv_idiom_3_0= ruleIdiom ) )
            // InternalEis.g:2538:4: (lv_idiom_3_0= ruleIdiom )
            {
            // InternalEis.g:2538:4: (lv_idiom_3_0= ruleIdiom )
            // InternalEis.g:2539:5: lv_idiom_3_0= ruleIdiom
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getIdiomIdiomParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalEis.g:2556:3: (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEis.g:2557:4: otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getPlusSignSolidusHyphenMinusKeyword_4_0());
                    			
                    // InternalEis.g:2561:4: ( (lv_range_5_0= ruleIdiom ) )
                    // InternalEis.g:2562:5: (lv_range_5_0= ruleIdiom )
                    {
                    // InternalEis.g:2562:5: (lv_range_5_0= ruleIdiom )
                    // InternalEis.g:2563:6: lv_range_5_0= ruleIdiom
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getRangeIdiomParserRuleCall_4_1_0());
                    					
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

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_5());
            		

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
    // InternalEis.g:2589:1: entryRuleCascade returns [EObject current=null] : iv_ruleCascade= ruleCascade EOF ;
    public final EObject entryRuleCascade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCascade = null;


        try {
            // InternalEis.g:2589:48: (iv_ruleCascade= ruleCascade EOF )
            // InternalEis.g:2590:2: iv_ruleCascade= ruleCascade EOF
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
    // InternalEis.g:2596:1: ruleCascade returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCascade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEis.g:2602:2: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEis.g:2603:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEis.g:2603:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // InternalEis.g:2604:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCascadeAccess().getFullStopKeyword_0());
            		
            // InternalEis.g:2608:3: ( (otherlv_1= RULE_ID ) )
            // InternalEis.g:2609:4: (otherlv_1= RULE_ID )
            {
            // InternalEis.g:2609:4: (otherlv_1= RULE_ID )
            // InternalEis.g:2610:5: otherlv_1= RULE_ID
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


    // $ANTLR start "ruleBasicType"
    // InternalEis.g:2625:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) ) ;
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


        	enterRule();

        try {
            // InternalEis.g:2631:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) ) )
            // InternalEis.g:2632:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) )
            {
            // InternalEis.g:2632:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) )
            int alt39=20;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt39=1;
                }
                break;
            case 68:
                {
                alt39=2;
                }
                break;
            case 69:
                {
                alt39=3;
                }
                break;
            case 70:
                {
                alt39=4;
                }
                break;
            case 71:
                {
                alt39=5;
                }
                break;
            case 72:
                {
                alt39=6;
                }
                break;
            case 73:
                {
                alt39=7;
                }
                break;
            case 74:
                {
                alt39=8;
                }
                break;
            case 75:
                {
                alt39=9;
                }
                break;
            case 76:
                {
                alt39=10;
                }
                break;
            case 77:
                {
                alt39=11;
                }
                break;
            case 78:
                {
                alt39=12;
                }
                break;
            case 79:
                {
                alt39=13;
                }
                break;
            case 80:
                {
                alt39=14;
                }
                break;
            case 81:
                {
                alt39=15;
                }
                break;
            case 82:
                {
                alt39=16;
                }
                break;
            case 83:
                {
                alt39=17;
                }
                break;
            case 84:
                {
                alt39=18;
                }
                break;
            case 85:
                {
                alt39=19;
                }
                break;
            case 86:
                {
                alt39=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalEis.g:2633:3: (enumLiteral_0= 'null' )
                    {
                    // InternalEis.g:2633:3: (enumLiteral_0= 'null' )
                    // InternalEis.g:2634:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:2641:3: (enumLiteral_1= 'int' )
                    {
                    // InternalEis.g:2641:3: (enumLiteral_1= 'int' )
                    // InternalEis.g:2642:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:2649:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalEis.g:2649:3: (enumLiteral_2= 'bool' )
                    // InternalEis.g:2650:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEis.g:2657:3: (enumLiteral_3= 'real' )
                    {
                    // InternalEis.g:2657:3: (enumLiteral_3= 'real' )
                    // InternalEis.g:2658:4: enumLiteral_3= 'real'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEis.g:2665:3: (enumLiteral_4= 'string' )
                    {
                    // InternalEis.g:2665:3: (enumLiteral_4= 'string' )
                    // InternalEis.g:2666:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEis.g:2673:3: (enumLiteral_5= 'char' )
                    {
                    // InternalEis.g:2673:3: (enumLiteral_5= 'char' )
                    // InternalEis.g:2674:4: enumLiteral_5= 'char'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getCHAREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEis.g:2681:3: (enumLiteral_6= 'byte' )
                    {
                    // InternalEis.g:2681:3: (enumLiteral_6= 'byte' )
                    // InternalEis.g:2682:4: enumLiteral_6= 'byte'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalEis.g:2689:3: (enumLiteral_7= 'word' )
                    {
                    // InternalEis.g:2689:3: (enumLiteral_7= 'word' )
                    // InternalEis.g:2690:4: enumLiteral_7= 'word'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalEis.g:2697:3: (enumLiteral_8= 'dword' )
                    {
                    // InternalEis.g:2697:3: (enumLiteral_8= 'dword' )
                    // InternalEis.g:2698:4: enumLiteral_8= 'dword'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalEis.g:2705:3: (enumLiteral_9= 'lword' )
                    {
                    // InternalEis.g:2705:3: (enumLiteral_9= 'lword' )
                    // InternalEis.g:2706:4: enumLiteral_9= 'lword'
                    {
                    enumLiteral_9=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalEis.g:2713:3: (enumLiteral_10= 'usint' )
                    {
                    // InternalEis.g:2713:3: (enumLiteral_10= 'usint' )
                    // InternalEis.g:2714:4: enumLiteral_10= 'usint'
                    {
                    enumLiteral_10=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUSINTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getUSINTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalEis.g:2721:3: (enumLiteral_11= 'uint' )
                    {
                    // InternalEis.g:2721:3: (enumLiteral_11= 'uint' )
                    // InternalEis.g:2722:4: enumLiteral_11= 'uint'
                    {
                    enumLiteral_11=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUINTEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBasicTypeAccess().getUINTEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalEis.g:2729:3: (enumLiteral_12= 'udint' )
                    {
                    // InternalEis.g:2729:3: (enumLiteral_12= 'udint' )
                    // InternalEis.g:2730:4: enumLiteral_12= 'udint'
                    {
                    enumLiteral_12=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUDINTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getBasicTypeAccess().getUDINTEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalEis.g:2737:3: (enumLiteral_13= 'ulint' )
                    {
                    // InternalEis.g:2737:3: (enumLiteral_13= 'ulint' )
                    // InternalEis.g:2738:4: enumLiteral_13= 'ulint'
                    {
                    enumLiteral_13=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getULINTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getBasicTypeAccess().getULINTEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalEis.g:2745:3: (enumLiteral_14= 'sint' )
                    {
                    // InternalEis.g:2745:3: (enumLiteral_14= 'sint' )
                    // InternalEis.g:2746:4: enumLiteral_14= 'sint'
                    {
                    enumLiteral_14=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSINTEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getBasicTypeAccess().getSINTEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalEis.g:2753:3: (enumLiteral_15= 'dint' )
                    {
                    // InternalEis.g:2753:3: (enumLiteral_15= 'dint' )
                    // InternalEis.g:2754:4: enumLiteral_15= 'dint'
                    {
                    enumLiteral_15=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDINTEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getBasicTypeAccess().getDINTEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalEis.g:2761:3: (enumLiteral_16= 'lint' )
                    {
                    // InternalEis.g:2761:3: (enumLiteral_16= 'lint' )
                    // InternalEis.g:2762:4: enumLiteral_16= 'lint'
                    {
                    enumLiteral_16=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLINTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getBasicTypeAccess().getLINTEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalEis.g:2769:3: (enumLiteral_17= 'time' )
                    {
                    // InternalEis.g:2769:3: (enumLiteral_17= 'time' )
                    // InternalEis.g:2770:4: enumLiteral_17= 'time'
                    {
                    enumLiteral_17=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getTIMEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getBasicTypeAccess().getTIMEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalEis.g:2777:3: (enumLiteral_18= 'ltime' )
                    {
                    // InternalEis.g:2777:3: (enumLiteral_18= 'ltime' )
                    // InternalEis.g:2778:4: enumLiteral_18= 'ltime'
                    {
                    enumLiteral_18=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLTIMEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getBasicTypeAccess().getLTIMEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalEis.g:2785:3: (enumLiteral_19= 'date' )
                    {
                    // InternalEis.g:2785:3: (enumLiteral_19= 'date' )
                    // InternalEis.g:2786:4: enumLiteral_19= 'date'
                    {
                    enumLiteral_19=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_19());
                    			

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00009A0000000020L,0x00000000007FFFF8L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000020L,0x00000000007FFFF8L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L,0x00000000007FFFF8L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400003000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x400100300001FFF0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000600002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000980040000020L,0x00000000007FFFF8L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000980002000020L,0x00000000007FFFF8L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200002000000L});

}
