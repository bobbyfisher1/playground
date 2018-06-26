package org.example.eis.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'", "'author'", "'testcase'", "'{'", "'}'", "'testActive'", "'blockType'", "'description'", "'true'", "'false'", "'FC'", "'FB'", "'define'", "'teststep'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalEis.g:64:1: entryRuleEisModel returns [EObject current=null] : iv_ruleEisModel= ruleEisModel EOF ;
    public final EObject entryRuleEisModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEisModel = null;


        try {
            // InternalEis.g:64:49: (iv_ruleEisModel= ruleEisModel EOF )
            // InternalEis.g:65:2: iv_ruleEisModel= ruleEisModel EOF
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
    // InternalEis.g:71:1: ruleEisModel returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* ) ;
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
            // InternalEis.g:77:2: ( (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* ) )
            // InternalEis.g:78:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* )
            {
            // InternalEis.g:78:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )* )
            // InternalEis.g:79:3: otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'author' otherlv_9= '=' ( (lv_author_name_10_0= RULE_STRING ) ) otherlv_11= ';' ( (lv_testcases_12_0= ruleTestcase ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEisModelAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEisModelAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:87:3: ( (lv_project_name_2_0= RULE_STRING ) )
            // InternalEis.g:88:4: (lv_project_name_2_0= RULE_STRING )
            {
            // InternalEis.g:88:4: (lv_project_name_2_0= RULE_STRING )
            // InternalEis.g:89:5: lv_project_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEisModelAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEisModelAccess().getPlcnameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getEisModelAccess().getEqualsSignKeyword_5());
            		
            // InternalEis.g:117:3: ( (lv_plc_name_6_0= RULE_STRING ) )
            // InternalEis.g:118:4: (lv_plc_name_6_0= RULE_STRING )
            {
            // InternalEis.g:118:4: (lv_plc_name_6_0= RULE_STRING )
            // InternalEis.g:119:5: lv_plc_name_6_0= RULE_STRING
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

            otherlv_7=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEisModelAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getEisModelAccess().getAuthorKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getEisModelAccess().getEqualsSignKeyword_9());
            		
            // InternalEis.g:147:3: ( (lv_author_name_10_0= RULE_STRING ) )
            // InternalEis.g:148:4: (lv_author_name_10_0= RULE_STRING )
            {
            // InternalEis.g:148:4: (lv_author_name_10_0= RULE_STRING )
            // InternalEis.g:149:5: lv_author_name_10_0= RULE_STRING
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

            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getEisModelAccess().getSemicolonKeyword_11());
            		
            // InternalEis.g:169:3: ( (lv_testcases_12_0= ruleTestcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:170:4: (lv_testcases_12_0= ruleTestcase )
            	    {
            	    // InternalEis.g:170:4: (lv_testcases_12_0= ruleTestcase )
            	    // InternalEis.g:171:5: lv_testcases_12_0= ruleTestcase
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
    // InternalEis.g:192:1: entryRuleTestcase returns [EObject current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final EObject entryRuleTestcase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestcase = null;


        try {
            // InternalEis.g:192:49: (iv_ruleTestcase= ruleTestcase EOF )
            // InternalEis.g:193:2: iv_ruleTestcase= ruleTestcase EOF
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
    // InternalEis.g:199:1: ruleTestcase returns [EObject current=null] : (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' ) ;
    public final EObject ruleTestcase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_testcase_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_testblock_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:205:2: ( (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' ) )
            // InternalEis.g:206:2: (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' )
            {
            // InternalEis.g:206:2: (otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}' )
            // InternalEis.g:207:3: otherlv_0= 'testcase' ( (lv_testcase_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_testblock_3_0= ruleTestblock ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0());
            		
            // InternalEis.g:211:3: ( (lv_testcase_name_1_0= RULE_ID ) )
            // InternalEis.g:212:4: (lv_testcase_name_1_0= RULE_ID )
            {
            // InternalEis.g:212:4: (lv_testcase_name_1_0= RULE_ID )
            // InternalEis.g:213:5: lv_testcase_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEis.g:233:3: ( (lv_testblock_3_0= ruleTestblock ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEis.g:234:4: (lv_testblock_3_0= ruleTestblock )
                    {
                    // InternalEis.g:234:4: (lv_testblock_3_0= ruleTestblock )
                    // InternalEis.g:235:5: lv_testblock_3_0= ruleTestblock
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalEis.g:260:1: entryRuleTestblock returns [EObject current=null] : iv_ruleTestblock= ruleTestblock EOF ;
    public final EObject entryRuleTestblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestblock = null;


        try {
            // InternalEis.g:260:50: (iv_ruleTestblock= ruleTestblock EOF )
            // InternalEis.g:261:2: iv_ruleTestblock= ruleTestblock EOF
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
    // InternalEis.g:267:1: ruleTestblock returns [EObject current=null] : (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ruleDefineBlock ruleTeststepBlock ) ;
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



        	enterRule();

        try {
            // InternalEis.g:273:2: ( (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ruleDefineBlock ruleTeststepBlock ) )
            // InternalEis.g:274:2: (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ruleDefineBlock ruleTeststepBlock )
            {
            // InternalEis.g:274:2: (otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ruleDefineBlock ruleTeststepBlock )
            // InternalEis.g:275:3: otherlv_0= 'testActive' otherlv_1= '=' ( (lv_testActive_2_0= ruleBoolConstant ) ) otherlv_3= ';' otherlv_4= 'blockType' otherlv_5= '=' ( (lv_blockType_6_0= ruleBlockConstant ) ) otherlv_7= ';' otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ruleDefineBlock ruleTeststepBlock
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestblockAccess().getTestActiveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTestblockAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:283:3: ( (lv_testActive_2_0= ruleBoolConstant ) )
            // InternalEis.g:284:4: (lv_testActive_2_0= ruleBoolConstant )
            {
            // InternalEis.g:284:4: (lv_testActive_2_0= ruleBoolConstant )
            // InternalEis.g:285:5: lv_testActive_2_0= ruleBoolConstant
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

            otherlv_3=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTestblockAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTestblockAccess().getBlockTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getTestblockAccess().getEqualsSignKeyword_5());
            		
            // InternalEis.g:314:3: ( (lv_blockType_6_0= ruleBlockConstant ) )
            // InternalEis.g:315:4: (lv_blockType_6_0= ruleBlockConstant )
            {
            // InternalEis.g:315:4: (lv_blockType_6_0= ruleBlockConstant )
            // InternalEis.g:316:5: lv_blockType_6_0= ruleBlockConstant
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

            otherlv_7=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getTestblockAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTestblockAccess().getDescriptionKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getTestblockAccess().getEqualsSignKeyword_9());
            		
            // InternalEis.g:345:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalEis.g:346:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalEis.g:346:4: (lv_description_10_0= RULE_STRING )
            // InternalEis.g:347:5: lv_description_10_0= RULE_STRING
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

            otherlv_11=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTestblockAccess().getSemicolonKeyword_11());
            		

            			newCompositeNode(grammarAccess.getTestblockAccess().getDefineBlockParserRuleCall_12());
            		
            pushFollow(FOLLOW_18);
            ruleDefineBlock();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getTestblockAccess().getTeststepBlockParserRuleCall_13());
            		
            pushFollow(FOLLOW_2);
            ruleTeststepBlock();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // InternalEis.g:385:1: entryRuleBoolConstant returns [EObject current=null] : iv_ruleBoolConstant= ruleBoolConstant EOF ;
    public final EObject entryRuleBoolConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstant = null;


        try {
            // InternalEis.g:385:53: (iv_ruleBoolConstant= ruleBoolConstant EOF )
            // InternalEis.g:386:2: iv_ruleBoolConstant= ruleBoolConstant EOF
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
    // InternalEis.g:392:1: ruleBoolConstant returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEis.g:398:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalEis.g:399:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalEis.g:399:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalEis.g:400:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalEis.g:400:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalEis.g:401:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalEis.g:401:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEis.g:402:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolConstantAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEis.g:413:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalEis.g:429:1: entryRuleBlockConstant returns [EObject current=null] : iv_ruleBlockConstant= ruleBlockConstant EOF ;
    public final EObject entryRuleBlockConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockConstant = null;


        try {
            // InternalEis.g:429:54: (iv_ruleBlockConstant= ruleBlockConstant EOF )
            // InternalEis.g:430:2: iv_ruleBlockConstant= ruleBlockConstant EOF
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
    // InternalEis.g:436:1: ruleBlockConstant returns [EObject current=null] : ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) ) ;
    public final EObject ruleBlockConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEis.g:442:2: ( ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) ) )
            // InternalEis.g:443:2: ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) )
            {
            // InternalEis.g:443:2: ( ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) ) )
            // InternalEis.g:444:3: ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) )
            {
            // InternalEis.g:444:3: ( (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' ) )
            // InternalEis.g:445:4: (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' )
            {
            // InternalEis.g:445:4: (lv_value_0_1= 'FC' | lv_value_0_2= 'FB' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEis.g:446:5: lv_value_0_1= 'FC'
                    {
                    lv_value_0_1=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBlockConstantAccess().getValueFCKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBlockConstantRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEis.g:457:5: lv_value_0_2= 'FB'
                    {
                    lv_value_0_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEis.g:473:1: entryRuleDefineBlock returns [String current=null] : iv_ruleDefineBlock= ruleDefineBlock EOF ;
    public final String entryRuleDefineBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefineBlock = null;


        try {
            // InternalEis.g:473:51: (iv_ruleDefineBlock= ruleDefineBlock EOF )
            // InternalEis.g:474:2: iv_ruleDefineBlock= ruleDefineBlock EOF
            {
             newCompositeNode(grammarAccess.getDefineBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineBlock=ruleDefineBlock();

            state._fsp--;

             current =iv_ruleDefineBlock.getText(); 
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
    // InternalEis.g:480:1: ruleDefineBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'define' ;
    public final AntlrDatatypeRuleToken ruleDefineBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEis.g:486:2: (kw= 'define' )
            // InternalEis.g:487:2: kw= 'define'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDefineBlockAccess().getDefineKeyword());
            	

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


    // $ANTLR start "entryRuleTeststepBlock"
    // InternalEis.g:495:1: entryRuleTeststepBlock returns [String current=null] : iv_ruleTeststepBlock= ruleTeststepBlock EOF ;
    public final String entryRuleTeststepBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTeststepBlock = null;


        try {
            // InternalEis.g:495:53: (iv_ruleTeststepBlock= ruleTeststepBlock EOF )
            // InternalEis.g:496:2: iv_ruleTeststepBlock= ruleTeststepBlock EOF
            {
             newCompositeNode(grammarAccess.getTeststepBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeststepBlock=ruleTeststepBlock();

            state._fsp--;

             current =iv_ruleTeststepBlock.getText(); 
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
    // InternalEis.g:502:1: ruleTeststepBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'teststep' ;
    public final AntlrDatatypeRuleToken ruleTeststepBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEis.g:508:2: (kw= 'teststep' )
            // InternalEis.g:509:2: kw= 'teststep'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTeststepBlockAccess().getTeststepKeyword());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});

}