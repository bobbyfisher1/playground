package org.example.eis.parser.antlr.internal;

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
import org.example.eis.services.EisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_BYTE", "RULE_WORD", "RULE_DWORD", "RULE_LWORD", "RULE_DIGIT", "RULE_HEXDIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'", "'author'", "'testcase'", "'{'", "'}'", "'testActive'", "'blockType'", "'description'", "'true'", "'false'", "'FC'", "'FB'", "'define'", "'input'", "'['", "']'", "'output'", "'inout'", "'variant'", "'+/-'", "','", "'udt'", "'('", "')'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'teststep'", "'set'", "'assert'", "'.'", "'null'", "'int'", "'bool'", "'real'", "'string'", "'byte'", "'word'", "'dword'", "'lword'"
    };
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
    public static final int RULE_WORD=9;
    public static final int RULE_LWORD=11;
    public static final int RULE_STRING=4;
    public static final int RULE_BYTE=8;
    public static final int RULE_SL_COMMENT=15;
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
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEisModelAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEisModelAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEisModelAccess().getPlcnameKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_4); 

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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEisModelAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getEisModelAccess().getAuthorKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_4); 

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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getEisModelAccess().getSemicolonKeyword_11());
            		
            // InternalEis.g:170:3: ( (lv_testcases_12_0= ruleTestcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
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
            	    						"org.example.eis.Eis.Testcase");
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
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEis.g:234:3: ( (lv_testblock_3_0= ruleTestblock ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
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
                    						"org.example.eis.Eis.Testblock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestblockAccess().getTestActiveKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

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
            						"org.example.eis.Eis.BoolConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTestblockAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTestblockAccess().getBlockTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_15); 

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
            						"org.example.eis.Eis.BlockConstant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getTestblockAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTestblockAccess().getDescriptionKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_4); 

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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTestblockAccess().getSemicolonKeyword_11());
            		
            // InternalEis.g:368:3: ( (lv_define_12_0= ruleDefineBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
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
                    						"org.example.eis.Eis.DefineBlock");
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
    // InternalEis.g:398:1: ruleBoolConstant returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEis.g:404:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalEis.g:405:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalEis.g:405:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalEis.g:406:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalEis.g:406:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalEis.g:407:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalEis.g:407:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEis.g:408:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolConstantAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEis.g:419:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,30,FOLLOW_2); 

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
    // InternalEis.g:435:1: entryRuleBlockConstant returns [EObject current=null] : iv_ruleBlockConstant= ruleBlockConstant EOF ;
    public final EObject entryRuleBlockConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockConstant = null;


        try {
            // InternalEis.g:435:54: (iv_ruleBlockConstant= ruleBlockConstant EOF )
            // InternalEis.g:436:2: iv_ruleBlockConstant= ruleBlockConstant EOF
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
    // InternalEis.g:442:1: ruleBlockConstant returns [EObject current=null] : ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) ) ;
    public final EObject ruleBlockConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEis.g:448:2: ( ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) ) )
            // InternalEis.g:449:2: ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) )
            {
            // InternalEis.g:449:2: ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) )
            // InternalEis.g:450:3: ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) )
            {
            // InternalEis.g:450:3: ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) )
            // InternalEis.g:451:4: (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' )
            {
            // InternalEis.g:451:4: (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEis.g:452:5: lv_value_0_1= 'FC'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBlockConstantAccess().getValueFCKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBlockConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEis.g:463:5: lv_value_0_2= 'FB'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalEis.g:479:1: entryRuleDefineBlock returns [EObject current=null] : iv_ruleDefineBlock= ruleDefineBlock EOF ;
    public final EObject entryRuleDefineBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineBlock = null;


        try {
            // InternalEis.g:479:52: (iv_ruleDefineBlock= ruleDefineBlock EOF )
            // InternalEis.g:480:2: iv_ruleDefineBlock= ruleDefineBlock EOF
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
    // InternalEis.g:486:1: ruleDefineBlock returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* ) ;
    public final EObject ruleDefineBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_direction_2_0 = null;

        EObject lv_teststeps_4_0 = null;



        	enterRule();

        try {
            // InternalEis.g:492:2: ( (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* ) )
            // InternalEis.g:493:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* )
            {
            // InternalEis.g:493:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )* )
            // InternalEis.g:494:3: otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ( (lv_teststeps_4_0= ruleTeststepBlock ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineBlockAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEis.g:502:3: ( (lv_direction_2_0= ruleDirectionBlock ) )
            // InternalEis.g:503:4: (lv_direction_2_0= ruleDirectionBlock )
            {
            // InternalEis.g:503:4: (lv_direction_2_0= ruleDirectionBlock )
            // InternalEis.g:504:5: lv_direction_2_0= ruleDirectionBlock
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
            						"org.example.eis.Eis.DirectionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalEis.g:525:3: ( (lv_teststeps_4_0= ruleTeststepBlock ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==58) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEis.g:526:4: (lv_teststeps_4_0= ruleTeststepBlock )
            	    {
            	    // InternalEis.g:526:4: (lv_teststeps_4_0= ruleTeststepBlock )
            	    // InternalEis.g:527:5: lv_teststeps_4_0= ruleTeststepBlock
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
            	    						"org.example.eis.Eis.TeststepBlock");
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
    // InternalEis.g:548:1: entryRuleDirectionBlock returns [EObject current=null] : iv_ruleDirectionBlock= ruleDirectionBlock EOF ;
    public final EObject entryRuleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionBlock = null;


        try {
            // InternalEis.g:548:55: (iv_ruleDirectionBlock= ruleDirectionBlock EOF )
            // InternalEis.g:549:2: iv_ruleDirectionBlock= ruleDirectionBlock EOF
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
    // InternalEis.g:555:1: ruleDirectionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_input_1_0 = null;

        EObject lv_inout_2_0 = null;

        EObject lv_output_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:561:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:562:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:562:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:563:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:563:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:564:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:567:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?)
            // InternalEis.g:568:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:568:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEis.g:569:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    {
            	    // InternalEis.g:569:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    // InternalEis.g:570:4: {...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:570:108: ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    // InternalEis.g:571:5: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:574:8: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    // InternalEis.g:574:9: {...}? => ( (lv_input_1_0= ruleInput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:574:18: ( (lv_input_1_0= ruleInput ) )
            	    // InternalEis.g:574:19: (lv_input_1_0= ruleInput )
            	    {
            	    // InternalEis.g:574:19: (lv_input_1_0= ruleInput )
            	    // InternalEis.g:575:9: lv_input_1_0= ruleInput
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
            	    										"org.example.eis.Eis.Input");
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
            	    // InternalEis.g:597:3: ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) )
            	    {
            	    // InternalEis.g:597:3: ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) ) )
            	    // InternalEis.g:598:4: {...}? => ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:598:108: ( ({...}? => ( (lv_inout_2_0= ruleInOut ) ) ) )
            	    // InternalEis.g:599:5: ({...}? => ( (lv_inout_2_0= ruleInOut ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:602:8: ({...}? => ( (lv_inout_2_0= ruleInOut ) ) )
            	    // InternalEis.g:602:9: {...}? => ( (lv_inout_2_0= ruleInOut ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:602:18: ( (lv_inout_2_0= ruleInOut ) )
            	    // InternalEis.g:602:19: (lv_inout_2_0= ruleInOut )
            	    {
            	    // InternalEis.g:602:19: (lv_inout_2_0= ruleInOut )
            	    // InternalEis.g:603:9: lv_inout_2_0= ruleInOut
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInoutInOutParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_20);
            	    lv_inout_2_0=ruleInOut();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"inout",
            	    										lv_inout_2_0,
            	    										"org.example.eis.Eis.InOut");
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
            	    // InternalEis.g:625:3: ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) )
            	    {
            	    // InternalEis.g:625:3: ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) )
            	    // InternalEis.g:626:4: {...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEis.g:626:108: ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) )
            	    // InternalEis.g:627:5: ({...}? => ( (lv_output_3_0= ruleOutput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalEis.g:630:8: ({...}? => ( (lv_output_3_0= ruleOutput ) ) )
            	    // InternalEis.g:630:9: {...}? => ( (lv_output_3_0= ruleOutput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:630:18: ( (lv_output_3_0= ruleOutput ) )
            	    // InternalEis.g:630:19: (lv_output_3_0= ruleOutput )
            	    {
            	    // InternalEis.g:630:19: (lv_output_3_0= ruleOutput )
            	    // InternalEis.g:631:9: lv_output_3_0= ruleOutput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_20);
            	    lv_output_3_0=ruleOutput();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"output",
            	    										lv_output_3_0,
            	    										"org.example.eis.Eis.Output");
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
    // InternalEis.g:664:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalEis.g:664:46: (iv_ruleInput= ruleInput EOF )
            // InternalEis.g:665:2: iv_ruleInput= ruleInput EOF
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
    // InternalEis.g:671:1: ruleInput returns [EObject current=null] : ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:677:2: ( ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:678:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:678:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:679:3: ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:679:3: ( (lv_name_0_0= 'input' ) )
            // InternalEis.g:680:4: (lv_name_0_0= 'input' )
            {
            // InternalEis.g:680:4: (lv_name_0_0= 'input' )
            // InternalEis.g:681:5: lv_name_0_0= 'input'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInputAccess().getNameInputKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "input");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:697:3: ( (lv_inputVariables_2_0= ruleVariables ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==39||LA8_0==42||(LA8_0>=62 && LA8_0<=70)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEis.g:698:4: (lv_inputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:698:4: (lv_inputVariables_2_0= ruleVariables )
            	    // InternalEis.g:699:5: lv_inputVariables_2_0= ruleVariables
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
            	    						"org.example.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalEis.g:724:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalEis.g:724:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalEis.g:725:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalEis.g:731:1: ruleOutput returns [EObject current=null] : ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_outputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:737:2: ( ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:738:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:738:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:739:3: ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:739:3: ( (lv_name_0_0= 'output' ) )
            // InternalEis.g:740:4: (lv_name_0_0= 'output' )
            {
            // InternalEis.g:740:4: (lv_name_0_0= 'output' )
            // InternalEis.g:741:5: lv_name_0_0= 'output'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOutputAccess().getNameOutputKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "output");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:757:3: ( (lv_outputVariables_2_0= ruleVariables ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==39||LA9_0==42||(LA9_0>=62 && LA9_0<=70)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEis.g:758:4: (lv_outputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:758:4: (lv_outputVariables_2_0= ruleVariables )
            	    // InternalEis.g:759:5: lv_outputVariables_2_0= ruleVariables
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
            	    						"org.example.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalEis.g:784:1: entryRuleInOut returns [EObject current=null] : iv_ruleInOut= ruleInOut EOF ;
    public final EObject entryRuleInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOut = null;


        try {
            // InternalEis.g:784:46: (iv_ruleInOut= ruleInOut EOF )
            // InternalEis.g:785:2: iv_ruleInOut= ruleInOut EOF
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
    // InternalEis.g:791:1: ruleInOut returns [EObject current=null] : ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInOut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inoutVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:797:2: ( ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:798:2: ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:798:2: ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:799:3: ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:799:3: ( (lv_name_0_0= 'inout' ) )
            // InternalEis.g:800:4: (lv_name_0_0= 'inout' )
            {
            // InternalEis.g:800:4: (lv_name_0_0= 'inout' )
            // InternalEis.g:801:5: lv_name_0_0= 'inout'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInOutAccess().getNameInoutKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInOutRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "inout");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getInOutAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:817:3: ( (lv_inoutVariables_2_0= ruleVariables ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==39||LA10_0==42||(LA10_0>=62 && LA10_0<=70)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEis.g:818:4: (lv_inoutVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:818:4: (lv_inoutVariables_2_0= ruleVariables )
            	    // InternalEis.g:819:5: lv_inoutVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getInOutAccess().getInoutVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_inoutVariables_2_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInOutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inoutVariables",
            	    						lv_inoutVariables_2_0,
            	    						"org.example.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalEis.g:844:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalEis.g:844:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalEis.g:845:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalEis.g:851:1: ruleVariables returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Udt_1 = null;

        EObject this_UdtRef_2 = null;



        	enterRule();

        try {
            // InternalEis.g:857:2: ( (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) )
            // InternalEis.g:858:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            {
            // InternalEis.g:858:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 39:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
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
                else if ( ((LA11_2>=19 && LA11_2<=20)||LA11_2==41) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
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
                    // InternalEis.g:859:3: this_Variable_0= ruleVariable
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
                    // InternalEis.g:868:3: this_Udt_1= ruleUdt
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
                    // InternalEis.g:877:3: this_UdtRef_2= ruleUdtRef
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
    // InternalEis.g:889:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEis.g:889:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEis.g:890:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEis.g:896:1: ruleVariable returns [EObject current=null] : ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) ;
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
            // InternalEis.g:902:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) )
            // InternalEis.g:903:2: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
            {
            // InternalEis.g:903:2: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
            // InternalEis.g:904:3: () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
            {
            // InternalEis.g:904:3: ()
            // InternalEis.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalEis.g:911:3: ( (lv_variantKeyword_1_0= 'variant' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEis.g:912:4: (lv_variantKeyword_1_0= 'variant' )
                    {
                    // InternalEis.g:912:4: (lv_variantKeyword_1_0= 'variant' )
                    // InternalEis.g:913:5: lv_variantKeyword_1_0= 'variant'
                    {
                    lv_variantKeyword_1_0=(Token)match(input,39,FOLLOW_23); 

                    					newLeafNode(lv_variantKeyword_1_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "variantKeyword", true, "variant");
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:925:3: ( (lv_variableType_2_0= ruleBasicType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=62 && LA13_0<=70)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEis.g:926:4: (lv_variableType_2_0= ruleBasicType )
                    {
                    // InternalEis.g:926:4: (lv_variableType_2_0= ruleBasicType )
                    // InternalEis.g:927:5: lv_variableType_2_0= ruleBasicType
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeBasicTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_variableType_2_0=ruleBasicType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"variableType",
                    						lv_variableType_2_0,
                    						"org.example.eis.Eis.BasicType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:944:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalEis.g:945:4: (lv_name_3_0= RULE_ID )
            {
            // InternalEis.g:945:4: (lv_name_3_0= RULE_ID )
            // InternalEis.g:946:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEis.g:962:3: (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEis.g:963:4: otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )?
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalEis.g:967:4: ( (lv_idiom_5_0= ruleIdiom ) )
                    // InternalEis.g:968:5: (lv_idiom_5_0= ruleIdiom )
                    {
                    // InternalEis.g:968:5: (lv_idiom_5_0= ruleIdiom )
                    // InternalEis.g:969:6: lv_idiom_5_0= ruleIdiom
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getIdiomIdiomParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_idiom_5_0=ruleIdiom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"idiom",
                    							lv_idiom_5_0,
                    							"org.example.eis.Eis.Idiom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEis.g:986:4: (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==40) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEis.g:987:5: otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) )
                            {
                            otherlv_6=(Token)match(input,40,FOLLOW_25); 

                            					newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_4_2_0());
                            				
                            // InternalEis.g:991:5: ( (lv_range_7_0= ruleIdiom ) )
                            // InternalEis.g:992:6: (lv_range_7_0= ruleIdiom )
                            {
                            // InternalEis.g:992:6: (lv_range_7_0= ruleIdiom )
                            // InternalEis.g:993:7: lv_range_7_0= ruleIdiom
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getRangeIdiomParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_range_7_0=ruleIdiom();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"range",
                            								lv_range_7_0,
                            								"org.example.eis.Eis.Idiom");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEis.g:1012:3: (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( (LA16_0==41) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEis.g:1013:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getSemicolonKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEis.g:1018:4: ( (lv_nextVariable_9_0= ',' ) )
                    {
                    // InternalEis.g:1018:4: ( (lv_nextVariable_9_0= ',' ) )
                    // InternalEis.g:1019:5: (lv_nextVariable_9_0= ',' )
                    {
                    // InternalEis.g:1019:5: (lv_nextVariable_9_0= ',' )
                    // InternalEis.g:1020:6: lv_nextVariable_9_0= ','
                    {
                    lv_nextVariable_9_0=(Token)match(input,41,FOLLOW_2); 

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
    // InternalEis.g:1037:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalEis.g:1037:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalEis.g:1038:2: iv_ruleUdt= ruleUdt EOF
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
    // InternalEis.g:1044:1: ruleUdt returns [EObject current=null] : (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' ) ;
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
            // InternalEis.g:1050:2: ( (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' ) )
            // InternalEis.g:1051:2: (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' )
            {
            // InternalEis.g:1051:2: (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' )
            // InternalEis.g:1052:3: otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
            		
            // InternalEis.g:1056:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEis.g:1057:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEis.g:1057:4: (lv_name_1_0= RULE_ID )
            // InternalEis.g:1058:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUdtAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEis.g:1078:3: ( (lv_udtType_3_0= ruleUdtType ) )
            // InternalEis.g:1079:4: (lv_udtType_3_0= ruleUdtType )
            {
            // InternalEis.g:1079:4: (lv_udtType_3_0= ruleUdtType )
            // InternalEis.g:1080:5: lv_udtType_3_0= ruleUdtType
            {

            					newCompositeNode(grammarAccess.getUdtAccess().getUdtTypeUdtTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_udtType_3_0=ruleUdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUdtRule());
            					}
            					set(
            						current,
            						"udtType",
            						lv_udtType_3_0,
            						"org.example.eis.Eis.UdtType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getUdtAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEis.g:1105:3: ( (lv_udtVariables_6_0= ruleVariables ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==39||LA17_0==42||(LA17_0>=62 && LA17_0<=70)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEis.g:1106:4: (lv_udtVariables_6_0= ruleVariables )
            	    {
            	    // InternalEis.g:1106:4: (lv_udtVariables_6_0= ruleVariables )
            	    // InternalEis.g:1107:5: lv_udtVariables_6_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getUdtAccess().getUdtVariablesVariablesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_udtVariables_6_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_6_0,
            	    						"org.example.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEis.g:1132:1: entryRuleUdtRef returns [EObject current=null] : iv_ruleUdtRef= ruleUdtRef EOF ;
    public final EObject entryRuleUdtRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtRef = null;


        try {
            // InternalEis.g:1132:47: (iv_ruleUdtRef= ruleUdtRef EOF )
            // InternalEis.g:1133:2: iv_ruleUdtRef= ruleUdtRef EOF
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
    // InternalEis.g:1139:1: ruleUdtRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleUdtRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_udtVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1145:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' ) )
            // InternalEis.g:1146:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' )
            {
            // InternalEis.g:1146:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' )
            // InternalEis.g:1147:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';'
            {
            // InternalEis.g:1147:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:1148:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:1148:4: (otherlv_0= RULE_ID )
            // InternalEis.g:1149:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getUdtRefAccess().getUdtTypeUdtTypeCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:1160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEis.g:1161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEis.g:1161:4: (lv_name_1_0= RULE_ID )
            // InternalEis.g:1162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUdtRefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEis.g:1178:3: ( (lv_udtVariables_2_0= ruleVariables ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==39||LA18_0==42||(LA18_0>=62 && LA18_0<=70)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEis.g:1179:4: (lv_udtVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:1179:4: (lv_udtVariables_2_0= ruleVariables )
            	    // InternalEis.g:1180:5: lv_udtVariables_2_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getUdtRefAccess().getUdtVariablesVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_udtVariables_2_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_2_0,
            	    						"org.example.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalEis.g:1205:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalEis.g:1205:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalEis.g:1206:2: iv_ruleUdtType= ruleUdtType EOF
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
    // InternalEis.g:1212:1: ruleUdtType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEis.g:1218:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEis.g:1219:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEis.g:1219:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEis.g:1220:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEis.g:1220:3: (lv_name_0_0= RULE_ID )
            // InternalEis.g:1221:4: lv_name_0_0= RULE_ID
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
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalEis.g:1240:1: entryRuleIdiom returns [EObject current=null] : iv_ruleIdiom= ruleIdiom EOF ;
    public final EObject entryRuleIdiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdiom = null;


        try {
            // InternalEis.g:1240:46: (iv_ruleIdiom= ruleIdiom EOF )
            // InternalEis.g:1241:2: iv_ruleIdiom= ruleIdiom EOF
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
    // InternalEis.g:1247:1: ruleIdiom returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleIdiom() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1253:2: (this_Or_0= ruleOr )
            // InternalEis.g:1254:2: this_Or_0= ruleOr
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
    // InternalEis.g:1265:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalEis.g:1265:43: (iv_ruleOr= ruleOr EOF )
            // InternalEis.g:1266:2: iv_ruleOr= ruleOr EOF
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
    // InternalEis.g:1272:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1278:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalEis.g:1279:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalEis.g:1279:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalEis.g:1280:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1288:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEis.g:1289:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalEis.g:1289:4: ()
            	    // InternalEis.g:1290:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEis.g:1300:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalEis.g:1301:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalEis.g:1301:5: (lv_right_3_0= ruleAnd )
            	    // InternalEis.g:1302:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.eis.Eis.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalEis.g:1324:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalEis.g:1324:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalEis.g:1325:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalEis.g:1331:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1337:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalEis.g:1338:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalEis.g:1338:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalEis.g:1339:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1347:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEis.g:1348:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalEis.g:1348:4: ()
            	    // InternalEis.g:1349:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEis.g:1359:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalEis.g:1360:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalEis.g:1360:5: (lv_right_3_0= ruleEquality )
            	    // InternalEis.g:1361:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.eis.Eis.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalEis.g:1383:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalEis.g:1383:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalEis.g:1384:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalEis.g:1390:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1396:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalEis.g:1397:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalEis.g:1397:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalEis.g:1398:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1406:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=47 && LA22_0<=48)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEis.g:1407:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalEis.g:1407:4: ()
            	    // InternalEis.g:1408:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1414:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalEis.g:1415:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalEis.g:1415:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalEis.g:1416:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalEis.g:1416:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==47) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==48) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalEis.g:1417:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1428:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,48,FOLLOW_25); 

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

            	    // InternalEis.g:1441:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalEis.g:1442:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalEis.g:1442:5: (lv_right_3_0= ruleComparison )
            	    // InternalEis.g:1443:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.eis.Eis.Comparison");
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalEis.g:1465:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEis.g:1465:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEis.g:1466:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEis.g:1472:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalEis.g:1478:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalEis.g:1479:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalEis.g:1479:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalEis.g:1480:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1488:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=49 && LA24_0<=52)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEis.g:1489:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalEis.g:1489:4: ()
            	    // InternalEis.g:1490:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1496:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalEis.g:1497:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalEis.g:1497:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalEis.g:1498:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalEis.g:1498:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 49:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalEis.g:1499:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,49,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1510:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,50,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalEis.g:1521:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,51,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalEis.g:1532:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,52,FOLLOW_25); 

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

            	    // InternalEis.g:1545:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalEis.g:1546:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalEis.g:1546:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalEis.g:1547:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.eis.Eis.PlusOrMinus");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalEis.g:1569:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalEis.g:1569:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalEis.g:1570:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalEis.g:1576:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1582:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalEis.g:1583:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalEis.g:1583:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalEis.g:1584:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1592:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEis.g:1593:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalEis.g:1593:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==53) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==54) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalEis.g:1594:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalEis.g:1594:5: ( () otherlv_2= '+' )
            	            // InternalEis.g:1595:6: () otherlv_2= '+'
            	            {
            	            // InternalEis.g:1595:6: ()
            	            // InternalEis.g:1596:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,53,FOLLOW_25); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1608:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalEis.g:1608:5: ( () otherlv_4= '-' )
            	            // InternalEis.g:1609:6: () otherlv_4= '-'
            	            {
            	            // InternalEis.g:1609:6: ()
            	            // InternalEis.g:1610:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,54,FOLLOW_25); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEis.g:1622:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalEis.g:1623:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalEis.g:1623:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalEis.g:1624:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.example.eis.Eis.MulOrDiv");
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalEis.g:1646:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalEis.g:1646:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalEis.g:1647:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalEis.g:1653:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1659:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalEis.g:1660:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalEis.g:1660:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalEis.g:1661:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1669:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=55 && LA28_0<=56)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEis.g:1670:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalEis.g:1670:4: ()
            	    // InternalEis.g:1671:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1677:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalEis.g:1678:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalEis.g:1678:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalEis.g:1679:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalEis.g:1679:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==55) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==56) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalEis.g:1680:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,55,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1691:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,56,FOLLOW_25); 

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

            	    // InternalEis.g:1704:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalEis.g:1705:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalEis.g:1705:5: (lv_right_3_0= rulePrimary )
            	    // InternalEis.g:1706:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.eis.Eis.Primary");
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalEis.g:1728:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEis.g:1728:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEis.g:1729:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEis.g:1735:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalEis.g:1741:2: ( ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalEis.g:1742:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalEis.g:1742:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt29=1;
                }
                break;
            case 57:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BYTE:
            case RULE_WORD:
            case RULE_DWORD:
            case RULE_LWORD:
            case 29:
            case 30:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalEis.g:1743:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    {
                    // InternalEis.g:1743:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    // InternalEis.g:1744:4: otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getIdiomParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_Idiom_1=ruleIdiom();

                    state._fsp--;


                    				current = this_Idiom_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:1762:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    {
                    // InternalEis.g:1762:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    // InternalEis.g:1763:4: () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) )
                    {
                    // InternalEis.g:1763:4: ()
                    // InternalEis.g:1764:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,57,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalEis.g:1774:4: ( (lv_idiom_5_0= rulePrimary ) )
                    // InternalEis.g:1775:5: (lv_idiom_5_0= rulePrimary )
                    {
                    // InternalEis.g:1775:5: (lv_idiom_5_0= rulePrimary )
                    // InternalEis.g:1776:6: lv_idiom_5_0= rulePrimary
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
                    							"org.example.eis.Eis.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:1795:3: this_Atomic_6= ruleAtomic
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
    // InternalEis.g:1807:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalEis.g:1807:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalEis.g:1808:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalEis.g:1814:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        Token lv_value_12_0=null;
        Token lv_value_14_0=null;
        Token lv_value_16_0=null;
        EObject this_BoolConstant_4 = null;



        	enterRule();

        try {
            // InternalEis.g:1820:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) ) )
            // InternalEis.g:1821:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) )
            {
            // InternalEis.g:1821:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) )
            int alt30=9;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt30=1;
                }
                break;
            case RULE_STRING:
                {
                alt30=2;
                }
                break;
            case 29:
            case 30:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
                {
                alt30=4;
                }
                break;
            case RULE_REAL:
                {
                alt30=5;
                }
                break;
            case RULE_BYTE:
                {
                alt30=6;
                }
                break;
            case RULE_WORD:
                {
                alt30=7;
                }
                break;
            case RULE_DWORD:
                {
                alt30=8;
                }
                break;
            case RULE_LWORD:
                {
                alt30=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalEis.g:1822:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalEis.g:1822:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalEis.g:1823:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalEis.g:1823:4: ()
                    // InternalEis.g:1824:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1830:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalEis.g:1831:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalEis.g:1831:5: (lv_value_1_0= RULE_INT )
                    // InternalEis.g:1832:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.example.eis.Eis.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:1850:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalEis.g:1850:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalEis.g:1851:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEis.g:1851:4: ()
                    // InternalEis.g:1852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1858:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEis.g:1859:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEis.g:1859:5: (lv_value_3_0= RULE_STRING )
                    // InternalEis.g:1860:6: lv_value_3_0= RULE_STRING
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
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:1878:3: this_BoolConstant_4= ruleBoolConstant
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
                    // InternalEis.g:1887:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalEis.g:1887:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalEis.g:1888:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalEis.g:1888:4: ()
                    // InternalEis.g:1889:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1895:4: ( (otherlv_6= RULE_ID ) )
                    // InternalEis.g:1896:5: (otherlv_6= RULE_ID )
                    {
                    // InternalEis.g:1896:5: (otherlv_6= RULE_ID )
                    // InternalEis.g:1897:6: otherlv_6= RULE_ID
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
                    // InternalEis.g:1910:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    {
                    // InternalEis.g:1910:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    // InternalEis.g:1911:4: () ( (lv_value_8_0= RULE_REAL ) )
                    {
                    // InternalEis.g:1911:4: ()
                    // InternalEis.g:1912:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getRealConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1918:4: ( (lv_value_8_0= RULE_REAL ) )
                    // InternalEis.g:1919:5: (lv_value_8_0= RULE_REAL )
                    {
                    // InternalEis.g:1919:5: (lv_value_8_0= RULE_REAL )
                    // InternalEis.g:1920:6: lv_value_8_0= RULE_REAL
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
                    							"org.example.eis.Eis.REAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalEis.g:1938:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    {
                    // InternalEis.g:1938:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    // InternalEis.g:1939:4: () ( (lv_value_10_0= RULE_BYTE ) )
                    {
                    // InternalEis.g:1939:4: ()
                    // InternalEis.g:1940:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getByteConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1946:4: ( (lv_value_10_0= RULE_BYTE ) )
                    // InternalEis.g:1947:5: (lv_value_10_0= RULE_BYTE )
                    {
                    // InternalEis.g:1947:5: (lv_value_10_0= RULE_BYTE )
                    // InternalEis.g:1948:6: lv_value_10_0= RULE_BYTE
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
                    							"org.example.eis.Eis.BYTE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalEis.g:1966:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    {
                    // InternalEis.g:1966:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    // InternalEis.g:1967:4: () ( (lv_value_12_0= RULE_WORD ) )
                    {
                    // InternalEis.g:1967:4: ()
                    // InternalEis.g:1968:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getWordConstantAction_6_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:1974:4: ( (lv_value_12_0= RULE_WORD ) )
                    // InternalEis.g:1975:5: (lv_value_12_0= RULE_WORD )
                    {
                    // InternalEis.g:1975:5: (lv_value_12_0= RULE_WORD )
                    // InternalEis.g:1976:6: lv_value_12_0= RULE_WORD
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
                    							"org.example.eis.Eis.WORD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalEis.g:1994:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    {
                    // InternalEis.g:1994:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    // InternalEis.g:1995:4: () ( (lv_value_14_0= RULE_DWORD ) )
                    {
                    // InternalEis.g:1995:4: ()
                    // InternalEis.g:1996:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDWordConstantAction_7_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2002:4: ( (lv_value_14_0= RULE_DWORD ) )
                    // InternalEis.g:2003:5: (lv_value_14_0= RULE_DWORD )
                    {
                    // InternalEis.g:2003:5: (lv_value_14_0= RULE_DWORD )
                    // InternalEis.g:2004:6: lv_value_14_0= RULE_DWORD
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
                    							"org.example.eis.Eis.DWORD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalEis.g:2022:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    {
                    // InternalEis.g:2022:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    // InternalEis.g:2023:4: () ( (lv_value_16_0= RULE_LWORD ) )
                    {
                    // InternalEis.g:2023:4: ()
                    // InternalEis.g:2024:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLWordConstantAction_8_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2030:4: ( (lv_value_16_0= RULE_LWORD ) )
                    // InternalEis.g:2031:5: (lv_value_16_0= RULE_LWORD )
                    {
                    // InternalEis.g:2031:5: (lv_value_16_0= RULE_LWORD )
                    // InternalEis.g:2032:6: lv_value_16_0= RULE_LWORD
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
                    							"org.example.eis.Eis.LWORD");
                    					

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
    // InternalEis.g:2053:1: entryRuleTeststepBlock returns [EObject current=null] : iv_ruleTeststepBlock= ruleTeststepBlock EOF ;
    public final EObject entryRuleTeststepBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeststepBlock = null;


        try {
            // InternalEis.g:2053:54: (iv_ruleTeststepBlock= ruleTeststepBlock EOF )
            // InternalEis.g:2054:2: iv_ruleTeststepBlock= ruleTeststepBlock EOF
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
    // InternalEis.g:2060:1: ruleTeststepBlock returns [EObject current=null] : (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) ;
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
            // InternalEis.g:2066:2: ( (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) )
            // InternalEis.g:2067:2: (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            {
            // InternalEis.g:2067:2: (otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            // InternalEis.g:2068:3: otherlv_0= 'teststep' otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getTeststepBlockAccess().getTeststepKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getTeststepBlockAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEis.g:2076:3: ( (lv_plcCycle_2_0= RULE_INT ) )
            // InternalEis.g:2077:4: (lv_plcCycle_2_0= RULE_INT )
            {
            // InternalEis.g:2077:4: (lv_plcCycle_2_0= RULE_INT )
            // InternalEis.g:2078:5: lv_plcCycle_2_0= RULE_INT
            {
            lv_plcCycle_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_plcCycle_2_0, grammarAccess.getTeststepBlockAccess().getPlcCycleINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeststepBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"plcCycle",
            						lv_plcCycle_2_0,
            						"org.example.eis.Eis.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTeststepBlockAccess().getCommaKeyword_3());
            		
            // InternalEis.g:2098:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalEis.g:2099:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalEis.g:2099:4: (lv_description_4_0= RULE_STRING )
            // InternalEis.g:2100:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_description_4_0, grammarAccess.getTeststepBlockAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeststepBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTeststepBlockAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getTeststepBlockAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalEis.g:2124:3: ( (lv_assertion_7_0= ruleAssertionBlock ) )
            // InternalEis.g:2125:4: (lv_assertion_7_0= ruleAssertionBlock )
            {
            // InternalEis.g:2125:4: (lv_assertion_7_0= ruleAssertionBlock )
            // InternalEis.g:2126:5: lv_assertion_7_0= ruleAssertionBlock
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
            						"org.example.eis.Eis.AssertionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEis.g:2151:1: entryRuleAssertionBlock returns [EObject current=null] : iv_ruleAssertionBlock= ruleAssertionBlock EOF ;
    public final EObject entryRuleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBlock = null;


        try {
            // InternalEis.g:2151:55: (iv_ruleAssertionBlock= ruleAssertionBlock EOF )
            // InternalEis.g:2152:2: iv_ruleAssertionBlock= ruleAssertionBlock EOF
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
    // InternalEis.g:2158:1: ruleAssertionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_set_1_0 = null;

        EObject lv_assert_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2164:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:2165:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:2165:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:2166:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:2166:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:2167:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:2170:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            // InternalEis.g:2171:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:2171:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEis.g:2172:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    {
            	    // InternalEis.g:2172:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    // InternalEis.g:2173:4: {...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:2173:108: ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    // InternalEis.g:2174:5: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:2177:8: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    // InternalEis.g:2177:9: {...}? => ( (lv_set_1_0= ruleSet ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:2177:18: ( (lv_set_1_0= ruleSet ) )
            	    // InternalEis.g:2177:19: (lv_set_1_0= ruleSet )
            	    {
            	    // InternalEis.g:2177:19: (lv_set_1_0= ruleSet )
            	    // InternalEis.g:2178:9: lv_set_1_0= ruleSet
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getSetSetParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_41);
            	    lv_set_1_0=ruleSet();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getAssertionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"set",
            	    										lv_set_1_0,
            	    										"org.example.eis.Eis.Set");
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
            	    // InternalEis.g:2200:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    {
            	    // InternalEis.g:2200:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    // InternalEis.g:2201:4: {...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:2201:108: ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    // InternalEis.g:2202:5: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:2205:8: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    // InternalEis.g:2205:9: {...}? => ( (lv_assert_2_0= ruleAssert ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:2205:18: ( (lv_assert_2_0= ruleAssert ) )
            	    // InternalEis.g:2205:19: (lv_assert_2_0= ruleAssert )
            	    {
            	    // InternalEis.g:2205:19: (lv_assert_2_0= ruleAssert )
            	    // InternalEis.g:2206:9: lv_assert_2_0= ruleAssert
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getAssertAssertParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_41);
            	    lv_assert_2_0=ruleAssert();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getAssertionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"assert",
            	    										lv_assert_2_0,
            	    										"org.example.eis.Eis.Assert");
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // InternalEis.g:2239:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalEis.g:2239:44: (iv_ruleSet= ruleSet EOF )
            // InternalEis.g:2240:2: iv_ruleSet= ruleSet EOF
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
    // InternalEis.g:2246:1: ruleSet returns [EObject current=null] : ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_setVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2252:2: ( ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:2253:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:2253:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:2254:3: ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:2254:3: ( (lv_name_0_0= 'set' ) )
            // InternalEis.g:2255:4: (lv_name_0_0= 'set' )
            {
            // InternalEis.g:2255:4: (lv_name_0_0= 'set' )
            // InternalEis.g:2256:5: lv_name_0_0= 'set'
            {
            lv_name_0_0=(Token)match(input,59,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSetAccess().getNameSetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "set");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:2272:3: ( (lv_setVariables_2_0= ruleStatement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEis.g:2273:4: (lv_setVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:2273:4: (lv_setVariables_2_0= ruleStatement )
            	    // InternalEis.g:2274:5: lv_setVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSetAccess().getSetVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_setVariables_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"setVariables",
            	    						lv_setVariables_2_0,
            	    						"org.example.eis.Eis.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalEis.g:2299:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalEis.g:2299:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalEis.g:2300:2: iv_ruleAssert= ruleAssert EOF
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
    // InternalEis.g:2306:1: ruleAssert returns [EObject current=null] : ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assertVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2312:2: ( ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:2313:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:2313:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:2314:3: ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:2314:3: ( (lv_name_0_0= 'assert' ) )
            // InternalEis.g:2315:4: (lv_name_0_0= 'assert' )
            {
            // InternalEis.g:2315:4: (lv_name_0_0= 'assert' )
            // InternalEis.g:2316:5: lv_name_0_0= 'assert'
            {
            lv_name_0_0=(Token)match(input,60,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssertAccess().getNameAssertKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "assert");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:2332:3: ( (lv_assertVariables_2_0= ruleStatement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEis.g:2333:4: (lv_assertVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:2333:4: (lv_assertVariables_2_0= ruleStatement )
            	    // InternalEis.g:2334:5: lv_assertVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getAssertAccess().getAssertVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_assertVariables_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssertRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertVariables",
            	    						lv_assertVariables_2_0,
            	    						"org.example.eis.Eis.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalEis.g:2359:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEis.g:2359:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEis.g:2360:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalEis.g:2366:1: ruleStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' ) ;
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
            // InternalEis.g:2372:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' ) )
            // InternalEis.g:2373:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' )
            {
            // InternalEis.g:2373:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' )
            // InternalEis.g:2374:3: ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';'
            {
            // InternalEis.g:2374:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:2375:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:2375:4: (otherlv_0= RULE_ID )
            // InternalEis.g:2376:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVariableVariablesCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:2387:3: ( (lv_cascade_1_0= ruleCascade ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==61) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEis.g:2388:4: (lv_cascade_1_0= ruleCascade )
            	    {
            	    // InternalEis.g:2388:4: (lv_cascade_1_0= ruleCascade )
            	    // InternalEis.g:2389:5: lv_cascade_1_0= ruleCascade
            	    {

            	    					newCompositeNode(grammarAccess.getStatementAccess().getCascadeCascadeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_cascade_1_0=ruleCascade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cascade",
            	    						lv_cascade_1_0,
            	    						"org.example.eis.Eis.Cascade");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_2=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalEis.g:2410:3: ( (lv_idiom_3_0= ruleIdiom ) )
            // InternalEis.g:2411:4: (lv_idiom_3_0= ruleIdiom )
            {
            // InternalEis.g:2411:4: (lv_idiom_3_0= ruleIdiom )
            // InternalEis.g:2412:5: lv_idiom_3_0= ruleIdiom
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getIdiomIdiomParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_idiom_3_0=ruleIdiom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"idiom",
            						lv_idiom_3_0,
            						"org.example.eis.Eis.Idiom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEis.g:2429:3: (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEis.g:2430:4: otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getPlusSignSolidusHyphenMinusKeyword_4_0());
                    			
                    // InternalEis.g:2434:4: ( (lv_range_5_0= ruleIdiom ) )
                    // InternalEis.g:2435:5: (lv_range_5_0= ruleIdiom )
                    {
                    // InternalEis.g:2435:5: (lv_range_5_0= ruleIdiom )
                    // InternalEis.g:2436:6: lv_range_5_0= ruleIdiom
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
                    							"org.example.eis.Eis.Idiom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalEis.g:2462:1: entryRuleCascade returns [EObject current=null] : iv_ruleCascade= ruleCascade EOF ;
    public final EObject entryRuleCascade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCascade = null;


        try {
            // InternalEis.g:2462:48: (iv_ruleCascade= ruleCascade EOF )
            // InternalEis.g:2463:2: iv_ruleCascade= ruleCascade EOF
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
    // InternalEis.g:2469:1: ruleCascade returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCascade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEis.g:2475:2: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEis.g:2476:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEis.g:2476:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // InternalEis.g:2477:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCascadeAccess().getFullStopKeyword_0());
            		
            // InternalEis.g:2481:3: ( (otherlv_1= RULE_ID ) )
            // InternalEis.g:2482:4: (otherlv_1= RULE_ID )
            {
            // InternalEis.g:2482:4: (otherlv_1= RULE_ID )
            // InternalEis.g:2483:5: otherlv_1= RULE_ID
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
    // InternalEis.g:2498:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'word' ) | (enumLiteral_7= 'dword' ) | (enumLiteral_8= 'lword' ) ) ;
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


        	enterRule();

        try {
            // InternalEis.g:2504:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'word' ) | (enumLiteral_7= 'dword' ) | (enumLiteral_8= 'lword' ) ) )
            // InternalEis.g:2505:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'word' ) | (enumLiteral_7= 'dword' ) | (enumLiteral_8= 'lword' ) )
            {
            // InternalEis.g:2505:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'word' ) | (enumLiteral_7= 'dword' ) | (enumLiteral_8= 'lword' ) )
            int alt36=9;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt36=1;
                }
                break;
            case 63:
                {
                alt36=2;
                }
                break;
            case 64:
                {
                alt36=3;
                }
                break;
            case 65:
                {
                alt36=4;
                }
                break;
            case 66:
                {
                alt36=5;
                }
                break;
            case 67:
                {
                alt36=6;
                }
                break;
            case 68:
                {
                alt36=7;
                }
                break;
            case 69:
                {
                alt36=8;
                }
                break;
            case 70:
                {
                alt36=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalEis.g:2506:3: (enumLiteral_0= 'null' )
                    {
                    // InternalEis.g:2506:3: (enumLiteral_0= 'null' )
                    // InternalEis.g:2507:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:2514:3: (enumLiteral_1= 'int' )
                    {
                    // InternalEis.g:2514:3: (enumLiteral_1= 'int' )
                    // InternalEis.g:2515:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getINTCONSTANTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getINTCONSTANTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:2522:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalEis.g:2522:3: (enumLiteral_2= 'bool' )
                    // InternalEis.g:2523:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEis.g:2530:3: (enumLiteral_3= 'real' )
                    {
                    // InternalEis.g:2530:3: (enumLiteral_3= 'real' )
                    // InternalEis.g:2531:4: enumLiteral_3= 'real'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEis.g:2538:3: (enumLiteral_4= 'string' )
                    {
                    // InternalEis.g:2538:3: (enumLiteral_4= 'string' )
                    // InternalEis.g:2539:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSTRINGTYPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getSTRINGTYPEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEis.g:2546:3: (enumLiteral_5= 'byte' )
                    {
                    // InternalEis.g:2546:3: (enumLiteral_5= 'byte' )
                    // InternalEis.g:2547:4: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEis.g:2554:3: (enumLiteral_6= 'word' )
                    {
                    // InternalEis.g:2554:3: (enumLiteral_6= 'word' )
                    // InternalEis.g:2555:4: enumLiteral_6= 'word'
                    {
                    enumLiteral_6=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalEis.g:2562:3: (enumLiteral_7= 'dword' )
                    {
                    // InternalEis.g:2562:3: (enumLiteral_7= 'dword' )
                    // InternalEis.g:2563:4: enumLiteral_7= 'dword'
                    {
                    enumLiteral_7=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalEis.g:2570:3: (enumLiteral_8= 'lword' )
                    {
                    // InternalEis.g:2570:3: (enumLiteral_8= 'lword' )
                    // InternalEis.g:2571:4: enumLiteral_8= 'lword'
                    {
                    enumLiteral_8=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_8());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006400000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xC000049000000020L,0x000000000000007FL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xC000000000000020L,0x000000000000007FL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000180000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200080060000FF0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000030000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xC000048002000020L,0x000000000000007FL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000048000100020L,0x000000000000007FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000100000L});

}
