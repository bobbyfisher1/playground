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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LONG", "RULE_NEGATIVE_LONG", "RULE_REAL", "RULE_BYTE", "RULE_WORD", "RULE_DWORD", "RULE_LWORD", "RULE_CHAR", "RULE_TIME", "RULE_LTIME", "RULE_DATE", "RULE_X", "RULE_HEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'", "'author'", "'testcase'", "'{'", "'}'", "'testActive'", "'blockType'", "'description'", "'FC'", "'FB'", "'true'", "'false'", "'define'", "'input'", "'['", "']'", "'output'", "'inout'", "'variant'", "'+/-'", "','", "'udt'", "'('", "')'", "'teststep'", "'set'", "'assert'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'null'", "'int'", "'bool'", "'real'", "'string'", "'char'", "'byte'", "'word'", "'dword'", "'lword'", "'usint'", "'uint'", "'udint'", "'ulint'", "'sint'", "'dint'", "'lint'", "'time'", "'ltime'", "'date'", "'lreal'", "'wchar'"
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
    public static final int T__88=88;
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
    public static final int T__87=87;

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

                if ( (LA6_0==50) ) {
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
    // InternalEis.g:599:1: ruleDirectionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_input_1_0 = null;

        EObject lv_output_2_0 = null;

        EObject lv_inout_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:605:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:606:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:606:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:607:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:607:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:608:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:611:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?)
            // InternalEis.g:612:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:612:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_2_0= ruleOutput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) ) )+
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
            	case 3 :
            	    // InternalEis.g:669:3: ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) )
            	    {
            	    // InternalEis.g:669:3: ({...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) ) )
            	    // InternalEis.g:670:4: {...}? => ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEis.g:670:108: ( ({...}? => ( (lv_inout_3_0= ruleInOut ) ) ) )
            	    // InternalEis.g:671:5: ({...}? => ( (lv_inout_3_0= ruleInOut ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalEis.g:674:8: ({...}? => ( (lv_inout_3_0= ruleInOut ) ) )
            	    // InternalEis.g:674:9: {...}? => ( (lv_inout_3_0= ruleInOut ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalEis.g:674:18: ( (lv_inout_3_0= ruleInOut ) )
            	    // InternalEis.g:674:19: (lv_inout_3_0= ruleInOut )
            	    {
            	    // InternalEis.g:674:19: (lv_inout_3_0= ruleInOut )
            	    // InternalEis.g:675:9: lv_inout_3_0= ruleInOut
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInoutInOutParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_20);
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
    // InternalEis.g:708:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalEis.g:708:46: (iv_ruleInput= ruleInput EOF )
            // InternalEis.g:709:2: iv_ruleInput= ruleInput EOF
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
    // InternalEis.g:715:1: ruleInput returns [EObject current=null] : ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:721:2: ( ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:722:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:722:2: ( ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:723:3: ( (lv_name_0_0= 'input' ) ) otherlv_1= '[' ( (lv_inputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:723:3: ( (lv_name_0_0= 'input' ) )
            // InternalEis.g:724:4: (lv_name_0_0= 'input' )
            {
            // InternalEis.g:724:4: (lv_name_0_0= 'input' )
            // InternalEis.g:725:5: lv_name_0_0= 'input'
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
            		
            // InternalEis.g:741:3: ( (lv_inputVariables_2_0= ruleVariables ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==44||LA8_0==47||(LA8_0>=67 && LA8_0<=88)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEis.g:742:4: (lv_inputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:742:4: (lv_inputVariables_2_0= ruleVariables )
            	    // InternalEis.g:743:5: lv_inputVariables_2_0= ruleVariables
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
    // InternalEis.g:768:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalEis.g:768:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalEis.g:769:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalEis.g:775:1: ruleOutput returns [EObject current=null] : ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_outputVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:781:2: ( ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:782:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:782:2: ( ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:783:3: ( (lv_name_0_0= 'output' ) ) otherlv_1= '[' ( (lv_outputVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:783:3: ( (lv_name_0_0= 'output' ) )
            // InternalEis.g:784:4: (lv_name_0_0= 'output' )
            {
            // InternalEis.g:784:4: (lv_name_0_0= 'output' )
            // InternalEis.g:785:5: lv_name_0_0= 'output'
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
            		
            // InternalEis.g:801:3: ( (lv_outputVariables_2_0= ruleVariables ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==44||LA9_0==47||(LA9_0>=67 && LA9_0<=88)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEis.g:802:4: (lv_outputVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:802:4: (lv_outputVariables_2_0= ruleVariables )
            	    // InternalEis.g:803:5: lv_outputVariables_2_0= ruleVariables
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


    // $ANTLR start "entryRuleInOut"
    // InternalEis.g:828:1: entryRuleInOut returns [EObject current=null] : iv_ruleInOut= ruleInOut EOF ;
    public final EObject entryRuleInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOut = null;


        try {
            // InternalEis.g:828:46: (iv_ruleInOut= ruleInOut EOF )
            // InternalEis.g:829:2: iv_ruleInOut= ruleInOut EOF
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
    // InternalEis.g:835:1: ruleInOut returns [EObject current=null] : ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) ;
    public final EObject ruleInOut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inoutVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:841:2: ( ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' ) )
            // InternalEis.g:842:2: ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            {
            // InternalEis.g:842:2: ( ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']' )
            // InternalEis.g:843:3: ( (lv_name_0_0= 'inout' ) ) otherlv_1= '[' ( (lv_inoutVariables_2_0= ruleVariables ) )* otherlv_3= ']'
            {
            // InternalEis.g:843:3: ( (lv_name_0_0= 'inout' ) )
            // InternalEis.g:844:4: (lv_name_0_0= 'inout' )
            {
            // InternalEis.g:844:4: (lv_name_0_0= 'inout' )
            // InternalEis.g:845:5: lv_name_0_0= 'inout'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInOutAccess().getNameInoutKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInOutRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "inout");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getInOutAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:861:3: ( (lv_inoutVariables_2_0= ruleVariables ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==44||LA10_0==47||(LA10_0>=67 && LA10_0<=88)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEis.g:862:4: (lv_inoutVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:862:4: (lv_inoutVariables_2_0= ruleVariables )
            	    // InternalEis.g:863:5: lv_inoutVariables_2_0= ruleVariables
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
    // InternalEis.g:888:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalEis.g:888:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalEis.g:889:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalEis.g:895:1: ruleVariables returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Udt_1 = null;

        EObject this_UdtRef_2 = null;



        	enterRule();

        try {
            // InternalEis.g:901:2: ( (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef ) )
            // InternalEis.g:902:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            {
            // InternalEis.g:902:2: (this_Variable_0= ruleVariable | this_Udt_1= ruleUdt | this_UdtRef_2= ruleUdtRef )
            int alt11=3;
            switch ( input.LA(1) ) {
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
            case 87:
            case 88:
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
                else if ( ((LA11_2>=24 && LA11_2<=25)||LA11_2==46) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
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
                    // InternalEis.g:903:3: this_Variable_0= ruleVariable
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
                    // InternalEis.g:912:3: this_Udt_1= ruleUdt
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
                    // InternalEis.g:921:3: this_UdtRef_2= ruleUdtRef
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
    // InternalEis.g:933:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEis.g:933:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEis.g:934:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEis.g:940:1: ruleVariable returns [EObject current=null] : ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) ;
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
            // InternalEis.g:946:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) )
            // InternalEis.g:947:2: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
            {
            // InternalEis.g:947:2: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
            // InternalEis.g:948:3: () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
            {
            // InternalEis.g:948:3: ()
            // InternalEis.g:949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalEis.g:955:3: ( (lv_variantKeyword_1_0= 'variant' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEis.g:956:4: (lv_variantKeyword_1_0= 'variant' )
                    {
                    // InternalEis.g:956:4: (lv_variantKeyword_1_0= 'variant' )
                    // InternalEis.g:957:5: lv_variantKeyword_1_0= 'variant'
                    {
                    lv_variantKeyword_1_0=(Token)match(input,44,FOLLOW_23); 

                    					newLeafNode(lv_variantKeyword_1_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "variantKeyword", true, "variant");
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:969:3: ( (lv_variableType_2_0= ruleBasicType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=67 && LA13_0<=88)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEis.g:970:4: (lv_variableType_2_0= ruleBasicType )
                    {
                    // InternalEis.g:970:4: (lv_variableType_2_0= ruleBasicType )
                    // InternalEis.g:971:5: lv_variableType_2_0= ruleBasicType
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
                    						"org.xtext.eis.Eis.BasicType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEis.g:988:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalEis.g:989:4: (lv_name_3_0= RULE_ID )
            {
            // InternalEis.g:989:4: (lv_name_3_0= RULE_ID )
            // InternalEis.g:990:5: lv_name_3_0= RULE_ID
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
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            // InternalEis.g:1006:3: (otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEis.g:1007:4: otherlv_4= '=' ( (lv_idiom_5_0= ruleIdiom ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )?
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalEis.g:1011:4: ( (lv_idiom_5_0= ruleIdiom ) )
                    // InternalEis.g:1012:5: (lv_idiom_5_0= ruleIdiom )
                    {
                    // InternalEis.g:1012:5: (lv_idiom_5_0= ruleIdiom )
                    // InternalEis.g:1013:6: lv_idiom_5_0= ruleIdiom
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
                    							"org.xtext.eis.Eis.Idiom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEis.g:1030:4: (otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==45) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEis.g:1031:5: otherlv_6= '+/-' ( (lv_range_7_0= ruleIdiom ) )
                            {
                            otherlv_6=(Token)match(input,45,FOLLOW_25); 

                            					newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_4_2_0());
                            				
                            // InternalEis.g:1035:5: ( (lv_range_7_0= ruleIdiom ) )
                            // InternalEis.g:1036:6: (lv_range_7_0= ruleIdiom )
                            {
                            // InternalEis.g:1036:6: (lv_range_7_0= ruleIdiom )
                            // InternalEis.g:1037:7: lv_range_7_0= ruleIdiom
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

            // InternalEis.g:1056:3: (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
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
                    // InternalEis.g:1057:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getSemicolonKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalEis.g:1062:4: ( (lv_nextVariable_9_0= ',' ) )
                    {
                    // InternalEis.g:1062:4: ( (lv_nextVariable_9_0= ',' ) )
                    // InternalEis.g:1063:5: (lv_nextVariable_9_0= ',' )
                    {
                    // InternalEis.g:1063:5: (lv_nextVariable_9_0= ',' )
                    // InternalEis.g:1064:6: lv_nextVariable_9_0= ','
                    {
                    lv_nextVariable_9_0=(Token)match(input,46,FOLLOW_2); 

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
    // InternalEis.g:1081:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalEis.g:1081:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalEis.g:1082:2: iv_ruleUdt= ruleUdt EOF
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
    // InternalEis.g:1088:1: ruleUdt returns [EObject current=null] : (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' ) ;
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
            // InternalEis.g:1094:2: ( (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' ) )
            // InternalEis.g:1095:2: (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' )
            {
            // InternalEis.g:1095:2: (otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}' )
            // InternalEis.g:1096:3: otherlv_0= 'udt' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtType_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariables ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
            		
            // InternalEis.g:1100:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEis.g:1101:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEis.g:1101:4: (lv_name_1_0= RULE_ID )
            // InternalEis.g:1102:5: lv_name_1_0= RULE_ID
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
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEis.g:1122:3: ( (lv_udtType_3_0= ruleUdtType ) )
            // InternalEis.g:1123:4: (lv_udtType_3_0= ruleUdtType )
            {
            // InternalEis.g:1123:4: (lv_udtType_3_0= ruleUdtType )
            // InternalEis.g:1124:5: lv_udtType_3_0= ruleUdtType
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
            						"org.xtext.eis.Eis.UdtType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getUdtAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEis.g:1149:3: ( (lv_udtVariables_6_0= ruleVariables ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==44||LA17_0==47||(LA17_0>=67 && LA17_0<=88)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEis.g:1150:4: (lv_udtVariables_6_0= ruleVariables )
            	    {
            	    // InternalEis.g:1150:4: (lv_udtVariables_6_0= ruleVariables )
            	    // InternalEis.g:1151:5: lv_udtVariables_6_0= ruleVariables
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
            	    						"org.xtext.eis.Eis.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalEis.g:1176:1: entryRuleUdtRef returns [EObject current=null] : iv_ruleUdtRef= ruleUdtRef EOF ;
    public final EObject entryRuleUdtRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtRef = null;


        try {
            // InternalEis.g:1176:47: (iv_ruleUdtRef= ruleUdtRef EOF )
            // InternalEis.g:1177:2: iv_ruleUdtRef= ruleUdtRef EOF
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
    // InternalEis.g:1183:1: ruleUdtRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleUdtRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_udtVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1189:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' ) )
            // InternalEis.g:1190:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' )
            {
            // InternalEis.g:1190:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';' )
            // InternalEis.g:1191:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_udtVariables_2_0= ruleVariables ) )* otherlv_3= ';'
            {
            // InternalEis.g:1191:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:1192:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:1192:4: (otherlv_0= RULE_ID )
            // InternalEis.g:1193:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getUdtRefAccess().getUdtTypeUdtTypeCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:1204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEis.g:1205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEis.g:1205:4: (lv_name_1_0= RULE_ID )
            // InternalEis.g:1206:5: lv_name_1_0= RULE_ID
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
            						"org.xtext.eis.Eis.ID");
            				

            }


            }

            // InternalEis.g:1222:3: ( (lv_udtVariables_2_0= ruleVariables ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==44||LA18_0==47||(LA18_0>=67 && LA18_0<=88)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEis.g:1223:4: (lv_udtVariables_2_0= ruleVariables )
            	    {
            	    // InternalEis.g:1223:4: (lv_udtVariables_2_0= ruleVariables )
            	    // InternalEis.g:1224:5: lv_udtVariables_2_0= ruleVariables
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
    // InternalEis.g:1249:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalEis.g:1249:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalEis.g:1250:2: iv_ruleUdtType= ruleUdtType EOF
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
    // InternalEis.g:1256:1: ruleUdtType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEis.g:1262:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEis.g:1263:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEis.g:1263:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEis.g:1264:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEis.g:1264:3: (lv_name_0_0= RULE_ID )
            // InternalEis.g:1265:4: lv_name_0_0= RULE_ID
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
    // InternalEis.g:1284:1: entryRuleTeststepBlock returns [EObject current=null] : iv_ruleTeststepBlock= ruleTeststepBlock EOF ;
    public final EObject entryRuleTeststepBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeststepBlock = null;


        try {
            // InternalEis.g:1284:54: (iv_ruleTeststepBlock= ruleTeststepBlock EOF )
            // InternalEis.g:1285:2: iv_ruleTeststepBlock= ruleTeststepBlock EOF
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
    // InternalEis.g:1291:1: ruleTeststepBlock returns [EObject current=null] : ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) ;
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
            // InternalEis.g:1297:2: ( ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' ) )
            // InternalEis.g:1298:2: ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            {
            // InternalEis.g:1298:2: ( ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}' )
            // InternalEis.g:1299:3: ( (lv_teststepKeyword_0_0= 'teststep' ) ) otherlv_1= '(' ( (lv_plcCycle_2_0= RULE_LONG ) ) otherlv_3= ',' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_assertion_7_0= ruleAssertionBlock ) ) otherlv_8= '}'
            {
            // InternalEis.g:1299:3: ( (lv_teststepKeyword_0_0= 'teststep' ) )
            // InternalEis.g:1300:4: (lv_teststepKeyword_0_0= 'teststep' )
            {
            // InternalEis.g:1300:4: (lv_teststepKeyword_0_0= 'teststep' )
            // InternalEis.g:1301:5: lv_teststepKeyword_0_0= 'teststep'
            {
            lv_teststepKeyword_0_0=(Token)match(input,50,FOLLOW_28); 

            					newLeafNode(lv_teststepKeyword_0_0, grammarAccess.getTeststepBlockAccess().getTeststepKeywordTeststepKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeststepBlockRule());
            					}
            					setWithLastConsumed(current, "teststepKeyword", lv_teststepKeyword_0_0, "teststep");
            				

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getTeststepBlockAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEis.g:1317:3: ( (lv_plcCycle_2_0= RULE_LONG ) )
            // InternalEis.g:1318:4: (lv_plcCycle_2_0= RULE_LONG )
            {
            // InternalEis.g:1318:4: (lv_plcCycle_2_0= RULE_LONG )
            // InternalEis.g:1319:5: lv_plcCycle_2_0= RULE_LONG
            {
            lv_plcCycle_2_0=(Token)match(input,RULE_LONG,FOLLOW_33); 

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
            		
            // InternalEis.g:1339:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalEis.g:1340:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalEis.g:1340:4: (lv_description_4_0= RULE_STRING )
            // InternalEis.g:1341:5: lv_description_4_0= RULE_STRING
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
            						"org.xtext.eis.Eis.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTeststepBlockAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getTeststepBlockAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalEis.g:1365:3: ( (lv_assertion_7_0= ruleAssertionBlock ) )
            // InternalEis.g:1366:4: (lv_assertion_7_0= ruleAssertionBlock )
            {
            // InternalEis.g:1366:4: (lv_assertion_7_0= ruleAssertionBlock )
            // InternalEis.g:1367:5: lv_assertion_7_0= ruleAssertionBlock
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
    // InternalEis.g:1392:1: entryRuleAssertionBlock returns [EObject current=null] : iv_ruleAssertionBlock= ruleAssertionBlock EOF ;
    public final EObject entryRuleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBlock = null;


        try {
            // InternalEis.g:1392:55: (iv_ruleAssertionBlock= ruleAssertionBlock EOF )
            // InternalEis.g:1393:2: iv_ruleAssertionBlock= ruleAssertionBlock EOF
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
    // InternalEis.g:1399:1: ruleAssertionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAssertionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_set_1_0 = null;

        EObject lv_assert_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1405:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) ) )
            // InternalEis.g:1406:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalEis.g:1406:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) ) )
            // InternalEis.g:1407:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            {
            // InternalEis.g:1407:3: ( ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?) )
            // InternalEis.g:1408:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAssertionBlockAccess().getUnorderedGroup());
            			
            // InternalEis.g:1411:4: ( ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?)
            // InternalEis.g:1412:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+ {...}?
            {
            // InternalEis.g:1412:5: ( ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEis.g:1413:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    {
            	    // InternalEis.g:1413:3: ({...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) ) )
            	    // InternalEis.g:1414:4: {...}? => ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEis.g:1414:108: ( ({...}? => ( (lv_set_1_0= ruleSet ) ) ) )
            	    // InternalEis.g:1415:5: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEis.g:1418:8: ({...}? => ( (lv_set_1_0= ruleSet ) ) )
            	    // InternalEis.g:1418:9: {...}? => ( (lv_set_1_0= ruleSet ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:1418:18: ( (lv_set_1_0= ruleSet ) )
            	    // InternalEis.g:1418:19: (lv_set_1_0= ruleSet )
            	    {
            	    // InternalEis.g:1418:19: (lv_set_1_0= ruleSet )
            	    // InternalEis.g:1419:9: lv_set_1_0= ruleSet
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getSetSetParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_35);
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
            	    // InternalEis.g:1441:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    {
            	    // InternalEis.g:1441:3: ({...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) ) )
            	    // InternalEis.g:1442:4: {...}? => ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEis.g:1442:108: ( ({...}? => ( (lv_assert_2_0= ruleAssert ) ) ) )
            	    // InternalEis.g:1443:5: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEis.g:1446:8: ({...}? => ( (lv_assert_2_0= ruleAssert ) ) )
            	    // InternalEis.g:1446:9: {...}? => ( (lv_assert_2_0= ruleAssert ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssertionBlock", "true");
            	    }
            	    // InternalEis.g:1446:18: ( (lv_assert_2_0= ruleAssert ) )
            	    // InternalEis.g:1446:19: (lv_assert_2_0= ruleAssert )
            	    {
            	    // InternalEis.g:1446:19: (lv_assert_2_0= ruleAssert )
            	    // InternalEis.g:1447:9: lv_assert_2_0= ruleAssert
            	    {

            	    									newCompositeNode(grammarAccess.getAssertionBlockAccess().getAssertAssertParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_35);
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
    // InternalEis.g:1480:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalEis.g:1480:44: (iv_ruleSet= ruleSet EOF )
            // InternalEis.g:1481:2: iv_ruleSet= ruleSet EOF
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
    // InternalEis.g:1487:1: ruleSet returns [EObject current=null] : ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_setVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1493:2: ( ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:1494:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:1494:2: ( ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:1495:3: ( (lv_name_0_0= 'set' ) ) otherlv_1= '[' ( (lv_setVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:1495:3: ( (lv_name_0_0= 'set' ) )
            // InternalEis.g:1496:4: (lv_name_0_0= 'set' )
            {
            // InternalEis.g:1496:4: (lv_name_0_0= 'set' )
            // InternalEis.g:1497:5: lv_name_0_0= 'set'
            {
            lv_name_0_0=(Token)match(input,51,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSetAccess().getNameSetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "set");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:1513:3: ( (lv_setVariables_2_0= ruleStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEis.g:1514:4: (lv_setVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:1514:4: (lv_setVariables_2_0= ruleStatement )
            	    // InternalEis.g:1515:5: lv_setVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSetAccess().getSetVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
    // InternalEis.g:1540:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalEis.g:1540:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalEis.g:1541:2: iv_ruleAssert= ruleAssert EOF
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
    // InternalEis.g:1547:1: ruleAssert returns [EObject current=null] : ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assertVariables_2_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1553:2: ( ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' ) )
            // InternalEis.g:1554:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            {
            // InternalEis.g:1554:2: ( ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']' )
            // InternalEis.g:1555:3: ( (lv_name_0_0= 'assert' ) ) otherlv_1= '[' ( (lv_assertVariables_2_0= ruleStatement ) )* otherlv_3= ']'
            {
            // InternalEis.g:1555:3: ( (lv_name_0_0= 'assert' ) )
            // InternalEis.g:1556:4: (lv_name_0_0= 'assert' )
            {
            // InternalEis.g:1556:4: (lv_name_0_0= 'assert' )
            // InternalEis.g:1557:5: lv_name_0_0= 'assert'
            {
            lv_name_0_0=(Token)match(input,52,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssertAccess().getNameAssertKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "assert");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEis.g:1573:3: ( (lv_assertVariables_2_0= ruleStatement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEis.g:1574:4: (lv_assertVariables_2_0= ruleStatement )
            	    {
            	    // InternalEis.g:1574:4: (lv_assertVariables_2_0= ruleStatement )
            	    // InternalEis.g:1575:5: lv_assertVariables_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getAssertAccess().getAssertVariablesStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
    // InternalEis.g:1600:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEis.g:1600:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEis.g:1601:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalEis.g:1607:1: ruleStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' ) ;
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
            // InternalEis.g:1613:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' ) )
            // InternalEis.g:1614:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' )
            {
            // InternalEis.g:1614:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';' )
            // InternalEis.g:1615:3: ( (otherlv_0= RULE_ID ) ) ( (lv_cascade_1_0= ruleCascade ) )* otherlv_2= '=' ( (lv_idiom_3_0= ruleIdiom ) ) (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )? otherlv_6= ';'
            {
            // InternalEis.g:1615:3: ( (otherlv_0= RULE_ID ) )
            // InternalEis.g:1616:4: (otherlv_0= RULE_ID )
            {
            // InternalEis.g:1616:4: (otherlv_0= RULE_ID )
            // InternalEis.g:1617:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVariableVariablesCrossReference_0_0());
            				

            }


            }

            // InternalEis.g:1628:3: ( (lv_cascade_1_0= ruleCascade ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==53) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEis.g:1629:4: (lv_cascade_1_0= ruleCascade )
            	    {
            	    // InternalEis.g:1629:4: (lv_cascade_1_0= ruleCascade )
            	    // InternalEis.g:1630:5: lv_cascade_1_0= ruleCascade
            	    {

            	    					newCompositeNode(grammarAccess.getStatementAccess().getCascadeCascadeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalEis.g:1651:3: ( (lv_idiom_3_0= ruleIdiom ) )
            // InternalEis.g:1652:4: (lv_idiom_3_0= ruleIdiom )
            {
            // InternalEis.g:1652:4: (lv_idiom_3_0= ruleIdiom )
            // InternalEis.g:1653:5: lv_idiom_3_0= ruleIdiom
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getIdiomIdiomParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalEis.g:1670:3: (otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEis.g:1671:4: otherlv_4= '+/-' ( (lv_range_5_0= ruleIdiom ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getPlusSignSolidusHyphenMinusKeyword_4_0());
                    			
                    // InternalEis.g:1675:4: ( (lv_range_5_0= ruleIdiom ) )
                    // InternalEis.g:1676:5: (lv_range_5_0= ruleIdiom )
                    {
                    // InternalEis.g:1676:5: (lv_range_5_0= ruleIdiom )
                    // InternalEis.g:1677:6: lv_range_5_0= ruleIdiom
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
    // InternalEis.g:1703:1: entryRuleCascade returns [EObject current=null] : iv_ruleCascade= ruleCascade EOF ;
    public final EObject entryRuleCascade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCascade = null;


        try {
            // InternalEis.g:1703:48: (iv_ruleCascade= ruleCascade EOF )
            // InternalEis.g:1704:2: iv_ruleCascade= ruleCascade EOF
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
    // InternalEis.g:1710:1: ruleCascade returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCascade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEis.g:1716:2: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalEis.g:1717:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalEis.g:1717:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // InternalEis.g:1718:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCascadeAccess().getFullStopKeyword_0());
            		
            // InternalEis.g:1722:3: ( (otherlv_1= RULE_ID ) )
            // InternalEis.g:1723:4: (otherlv_1= RULE_ID )
            {
            // InternalEis.g:1723:4: (otherlv_1= RULE_ID )
            // InternalEis.g:1724:5: otherlv_1= RULE_ID
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
    // InternalEis.g:1739:1: entryRuleIdiom returns [EObject current=null] : iv_ruleIdiom= ruleIdiom EOF ;
    public final EObject entryRuleIdiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdiom = null;


        try {
            // InternalEis.g:1739:46: (iv_ruleIdiom= ruleIdiom EOF )
            // InternalEis.g:1740:2: iv_ruleIdiom= ruleIdiom EOF
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
    // InternalEis.g:1746:1: ruleIdiom returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleIdiom() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1752:2: (this_Or_0= ruleOr )
            // InternalEis.g:1753:2: this_Or_0= ruleOr
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
    // InternalEis.g:1764:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalEis.g:1764:43: (iv_ruleOr= ruleOr EOF )
            // InternalEis.g:1765:2: iv_ruleOr= ruleOr EOF
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
    // InternalEis.g:1771:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1777:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalEis.g:1778:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalEis.g:1778:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalEis.g:1779:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1787:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEis.g:1788:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalEis.g:1788:4: ()
            	    // InternalEis.g:1789:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalEis.g:1799:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalEis.g:1800:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalEis.g:1800:5: (lv_right_3_0= ruleAnd )
            	    // InternalEis.g:1801:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalEis.g:1823:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalEis.g:1823:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalEis.g:1824:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalEis.g:1830:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1836:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalEis.g:1837:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalEis.g:1837:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalEis.g:1838:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1846:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEis.g:1847:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalEis.g:1847:4: ()
            	    // InternalEis.g:1848:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalEis.g:1858:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalEis.g:1859:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalEis.g:1859:5: (lv_right_3_0= ruleEquality )
            	    // InternalEis.g:1860:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalEis.g:1882:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalEis.g:1882:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalEis.g:1883:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalEis.g:1889:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:1895:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalEis.g:1896:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalEis.g:1896:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalEis.g:1897:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1905:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=56 && LA27_0<=57)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEis.g:1906:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalEis.g:1906:4: ()
            	    // InternalEis.g:1907:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1913:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalEis.g:1914:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalEis.g:1914:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalEis.g:1915:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalEis.g:1915:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==56) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==57) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalEis.g:1916:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,56,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:1927:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,57,FOLLOW_25); 

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

            	    // InternalEis.g:1940:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalEis.g:1941:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalEis.g:1941:5: (lv_right_3_0= ruleComparison )
            	    // InternalEis.g:1942:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
            	    break loop27;
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
    // InternalEis.g:1964:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEis.g:1964:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEis.g:1965:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEis.g:1971:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalEis.g:1977:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalEis.g:1978:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalEis.g:1978:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalEis.g:1979:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:1987:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=58 && LA29_0<=61)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEis.g:1988:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalEis.g:1988:4: ()
            	    // InternalEis.g:1989:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:1995:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalEis.g:1996:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalEis.g:1996:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalEis.g:1997:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalEis.g:1997:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case 58:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalEis.g:1998:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,58,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:2009:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,59,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalEis.g:2020:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,60,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalEis.g:2031:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,61,FOLLOW_25); 

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

            	    // InternalEis.g:2044:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalEis.g:2045:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalEis.g:2045:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalEis.g:2046:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
            	    break loop29;
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
    // InternalEis.g:2068:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalEis.g:2068:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalEis.g:2069:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalEis.g:2075:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2081:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalEis.g:2082:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalEis.g:2082:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalEis.g:2083:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:2091:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=62 && LA31_0<=63)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEis.g:2092:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalEis.g:2092:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==62) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==63) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalEis.g:2093:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalEis.g:2093:5: ( () otherlv_2= '+' )
            	            // InternalEis.g:2094:6: () otherlv_2= '+'
            	            {
            	            // InternalEis.g:2094:6: ()
            	            // InternalEis.g:2095:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,62,FOLLOW_25); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:2107:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalEis.g:2107:5: ( () otherlv_4= '-' )
            	            // InternalEis.g:2108:6: () otherlv_4= '-'
            	            {
            	            // InternalEis.g:2108:6: ()
            	            // InternalEis.g:2109:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,63,FOLLOW_25); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEis.g:2121:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalEis.g:2122:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalEis.g:2122:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalEis.g:2123:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop31;
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
    // InternalEis.g:2145:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalEis.g:2145:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalEis.g:2146:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalEis.g:2152:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEis.g:2158:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalEis.g:2159:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalEis.g:2159:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalEis.g:2160:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEis.g:2168:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=64 && LA33_0<=65)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEis.g:2169:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalEis.g:2169:4: ()
            	    // InternalEis.g:2170:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEis.g:2176:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalEis.g:2177:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalEis.g:2177:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalEis.g:2178:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalEis.g:2178:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==64) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==65) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalEis.g:2179:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,64,FOLLOW_25); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalEis.g:2190:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,65,FOLLOW_25); 

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

            	    // InternalEis.g:2203:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalEis.g:2204:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalEis.g:2204:5: (lv_right_3_0= rulePrimary )
            	    // InternalEis.g:2205:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop33;
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
    // InternalEis.g:2227:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalEis.g:2227:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalEis.g:2228:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalEis.g:2234:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalEis.g:2240:2: ( ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalEis.g:2241:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalEis.g:2241:2: ( (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt34=1;
                }
                break;
            case 66:
                {
                alt34=2;
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
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalEis.g:2242:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    {
                    // InternalEis.g:2242:3: (otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')' )
                    // InternalEis.g:2243:4: otherlv_0= '(' this_Idiom_1= ruleIdiom otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getIdiomParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_29);
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
                    // InternalEis.g:2261:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    {
                    // InternalEis.g:2261:3: ( () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) ) )
                    // InternalEis.g:2262:4: () otherlv_4= '!' ( (lv_idiom_5_0= rulePrimary ) )
                    {
                    // InternalEis.g:2262:4: ()
                    // InternalEis.g:2263:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,66,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalEis.g:2273:4: ( (lv_idiom_5_0= rulePrimary ) )
                    // InternalEis.g:2274:5: (lv_idiom_5_0= rulePrimary )
                    {
                    // InternalEis.g:2274:5: (lv_idiom_5_0= rulePrimary )
                    // InternalEis.g:2275:6: lv_idiom_5_0= rulePrimary
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
                    // InternalEis.g:2294:3: this_Atomic_6= ruleAtomic
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
    // InternalEis.g:2306:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalEis.g:2306:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalEis.g:2307:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalEis.g:2313:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) ) ;
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
            // InternalEis.g:2319:2: ( ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) ) )
            // InternalEis.g:2320:2: ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) )
            {
            // InternalEis.g:2320:2: ( ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_BoolConstant_4= ruleBoolConstant | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_BYTE ) ) ) | ( () ( (lv_value_12_0= RULE_WORD ) ) ) | ( () ( (lv_value_14_0= RULE_DWORD ) ) ) | ( () ( (lv_value_16_0= RULE_LWORD ) ) ) | ( () ( (lv_value_18_0= RULE_CHAR ) ) ) | ( () ( (lv_value_20_0= RULE_TIME ) ) ) | ( () ( (lv_value_22_0= RULE_LTIME ) ) ) | ( () ( (lv_value_24_0= RULE_DATE ) ) ) )
            int alt36=13;
            switch ( input.LA(1) ) {
            case RULE_LONG:
            case RULE_NEGATIVE_LONG:
                {
                alt36=1;
                }
                break;
            case RULE_STRING:
                {
                alt36=2;
                }
                break;
            case 36:
            case 37:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
                {
                alt36=4;
                }
                break;
            case RULE_REAL:
                {
                alt36=5;
                }
                break;
            case RULE_BYTE:
                {
                alt36=6;
                }
                break;
            case RULE_WORD:
                {
                alt36=7;
                }
                break;
            case RULE_DWORD:
                {
                alt36=8;
                }
                break;
            case RULE_LWORD:
                {
                alt36=9;
                }
                break;
            case RULE_CHAR:
                {
                alt36=10;
                }
                break;
            case RULE_TIME:
                {
                alt36=11;
                }
                break;
            case RULE_LTIME:
                {
                alt36=12;
                }
                break;
            case RULE_DATE:
                {
                alt36=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalEis.g:2321:3: ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) )
                    {
                    // InternalEis.g:2321:3: ( () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) ) )
                    // InternalEis.g:2322:4: () ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) )
                    {
                    // InternalEis.g:2322:4: ()
                    // InternalEis.g:2323:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2329:4: ( ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) ) )
                    // InternalEis.g:2330:5: ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) )
                    {
                    // InternalEis.g:2330:5: ( (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG ) )
                    // InternalEis.g:2331:6: (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG )
                    {
                    // InternalEis.g:2331:6: (lv_value_1_1= RULE_LONG | lv_value_1_2= RULE_NEGATIVE_LONG )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_LONG) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_NEGATIVE_LONG) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalEis.g:2332:7: lv_value_1_1= RULE_LONG
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
                            // InternalEis.g:2347:7: lv_value_1_2= RULE_NEGATIVE_LONG
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
                    // InternalEis.g:2366:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalEis.g:2366:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalEis.g:2367:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEis.g:2367:4: ()
                    // InternalEis.g:2368:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2374:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEis.g:2375:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEis.g:2375:5: (lv_value_3_0= RULE_STRING )
                    // InternalEis.g:2376:6: lv_value_3_0= RULE_STRING
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
                    // InternalEis.g:2394:3: this_BoolConstant_4= ruleBoolConstant
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
                    // InternalEis.g:2403:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalEis.g:2403:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalEis.g:2404:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalEis.g:2404:4: ()
                    // InternalEis.g:2405:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2411:4: ( (otherlv_6= RULE_ID ) )
                    // InternalEis.g:2412:5: (otherlv_6= RULE_ID )
                    {
                    // InternalEis.g:2412:5: (otherlv_6= RULE_ID )
                    // InternalEis.g:2413:6: otherlv_6= RULE_ID
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
                    // InternalEis.g:2426:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    {
                    // InternalEis.g:2426:3: ( () ( (lv_value_8_0= RULE_REAL ) ) )
                    // InternalEis.g:2427:4: () ( (lv_value_8_0= RULE_REAL ) )
                    {
                    // InternalEis.g:2427:4: ()
                    // InternalEis.g:2428:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getRealConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2434:4: ( (lv_value_8_0= RULE_REAL ) )
                    // InternalEis.g:2435:5: (lv_value_8_0= RULE_REAL )
                    {
                    // InternalEis.g:2435:5: (lv_value_8_0= RULE_REAL )
                    // InternalEis.g:2436:6: lv_value_8_0= RULE_REAL
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
                    // InternalEis.g:2454:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    {
                    // InternalEis.g:2454:3: ( () ( (lv_value_10_0= RULE_BYTE ) ) )
                    // InternalEis.g:2455:4: () ( (lv_value_10_0= RULE_BYTE ) )
                    {
                    // InternalEis.g:2455:4: ()
                    // InternalEis.g:2456:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getByteConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2462:4: ( (lv_value_10_0= RULE_BYTE ) )
                    // InternalEis.g:2463:5: (lv_value_10_0= RULE_BYTE )
                    {
                    // InternalEis.g:2463:5: (lv_value_10_0= RULE_BYTE )
                    // InternalEis.g:2464:6: lv_value_10_0= RULE_BYTE
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
                    // InternalEis.g:2482:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    {
                    // InternalEis.g:2482:3: ( () ( (lv_value_12_0= RULE_WORD ) ) )
                    // InternalEis.g:2483:4: () ( (lv_value_12_0= RULE_WORD ) )
                    {
                    // InternalEis.g:2483:4: ()
                    // InternalEis.g:2484:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getWordConstantAction_6_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2490:4: ( (lv_value_12_0= RULE_WORD ) )
                    // InternalEis.g:2491:5: (lv_value_12_0= RULE_WORD )
                    {
                    // InternalEis.g:2491:5: (lv_value_12_0= RULE_WORD )
                    // InternalEis.g:2492:6: lv_value_12_0= RULE_WORD
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
                    // InternalEis.g:2510:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    {
                    // InternalEis.g:2510:3: ( () ( (lv_value_14_0= RULE_DWORD ) ) )
                    // InternalEis.g:2511:4: () ( (lv_value_14_0= RULE_DWORD ) )
                    {
                    // InternalEis.g:2511:4: ()
                    // InternalEis.g:2512:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDWordConstantAction_7_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2518:4: ( (lv_value_14_0= RULE_DWORD ) )
                    // InternalEis.g:2519:5: (lv_value_14_0= RULE_DWORD )
                    {
                    // InternalEis.g:2519:5: (lv_value_14_0= RULE_DWORD )
                    // InternalEis.g:2520:6: lv_value_14_0= RULE_DWORD
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
                    // InternalEis.g:2538:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    {
                    // InternalEis.g:2538:3: ( () ( (lv_value_16_0= RULE_LWORD ) ) )
                    // InternalEis.g:2539:4: () ( (lv_value_16_0= RULE_LWORD ) )
                    {
                    // InternalEis.g:2539:4: ()
                    // InternalEis.g:2540:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLWordConstantAction_8_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2546:4: ( (lv_value_16_0= RULE_LWORD ) )
                    // InternalEis.g:2547:5: (lv_value_16_0= RULE_LWORD )
                    {
                    // InternalEis.g:2547:5: (lv_value_16_0= RULE_LWORD )
                    // InternalEis.g:2548:6: lv_value_16_0= RULE_LWORD
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
                    // InternalEis.g:2566:3: ( () ( (lv_value_18_0= RULE_CHAR ) ) )
                    {
                    // InternalEis.g:2566:3: ( () ( (lv_value_18_0= RULE_CHAR ) ) )
                    // InternalEis.g:2567:4: () ( (lv_value_18_0= RULE_CHAR ) )
                    {
                    // InternalEis.g:2567:4: ()
                    // InternalEis.g:2568:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getCharConstantAction_9_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2574:4: ( (lv_value_18_0= RULE_CHAR ) )
                    // InternalEis.g:2575:5: (lv_value_18_0= RULE_CHAR )
                    {
                    // InternalEis.g:2575:5: (lv_value_18_0= RULE_CHAR )
                    // InternalEis.g:2576:6: lv_value_18_0= RULE_CHAR
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
                    // InternalEis.g:2594:3: ( () ( (lv_value_20_0= RULE_TIME ) ) )
                    {
                    // InternalEis.g:2594:3: ( () ( (lv_value_20_0= RULE_TIME ) ) )
                    // InternalEis.g:2595:4: () ( (lv_value_20_0= RULE_TIME ) )
                    {
                    // InternalEis.g:2595:4: ()
                    // InternalEis.g:2596:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getTimeConstantAction_10_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2602:4: ( (lv_value_20_0= RULE_TIME ) )
                    // InternalEis.g:2603:5: (lv_value_20_0= RULE_TIME )
                    {
                    // InternalEis.g:2603:5: (lv_value_20_0= RULE_TIME )
                    // InternalEis.g:2604:6: lv_value_20_0= RULE_TIME
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
                    // InternalEis.g:2622:3: ( () ( (lv_value_22_0= RULE_LTIME ) ) )
                    {
                    // InternalEis.g:2622:3: ( () ( (lv_value_22_0= RULE_LTIME ) ) )
                    // InternalEis.g:2623:4: () ( (lv_value_22_0= RULE_LTIME ) )
                    {
                    // InternalEis.g:2623:4: ()
                    // InternalEis.g:2624:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getLTimeConstantAction_11_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2630:4: ( (lv_value_22_0= RULE_LTIME ) )
                    // InternalEis.g:2631:5: (lv_value_22_0= RULE_LTIME )
                    {
                    // InternalEis.g:2631:5: (lv_value_22_0= RULE_LTIME )
                    // InternalEis.g:2632:6: lv_value_22_0= RULE_LTIME
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
                    // InternalEis.g:2650:3: ( () ( (lv_value_24_0= RULE_DATE ) ) )
                    {
                    // InternalEis.g:2650:3: ( () ( (lv_value_24_0= RULE_DATE ) ) )
                    // InternalEis.g:2651:4: () ( (lv_value_24_0= RULE_DATE ) )
                    {
                    // InternalEis.g:2651:4: ()
                    // InternalEis.g:2652:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDateConstantAction_12_0(),
                    						current);
                    				

                    }

                    // InternalEis.g:2658:4: ( (lv_value_24_0= RULE_DATE ) )
                    // InternalEis.g:2659:5: (lv_value_24_0= RULE_DATE )
                    {
                    // InternalEis.g:2659:5: (lv_value_24_0= RULE_DATE )
                    // InternalEis.g:2660:6: lv_value_24_0= RULE_DATE
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
    // InternalEis.g:2681:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) ) ;
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
            // InternalEis.g:2687:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) ) )
            // InternalEis.g:2688:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) )
            {
            // InternalEis.g:2688:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'string' ) | (enumLiteral_5= 'char' ) | (enumLiteral_6= 'byte' ) | (enumLiteral_7= 'word' ) | (enumLiteral_8= 'dword' ) | (enumLiteral_9= 'lword' ) | (enumLiteral_10= 'usint' ) | (enumLiteral_11= 'uint' ) | (enumLiteral_12= 'udint' ) | (enumLiteral_13= 'ulint' ) | (enumLiteral_14= 'sint' ) | (enumLiteral_15= 'dint' ) | (enumLiteral_16= 'lint' ) | (enumLiteral_17= 'time' ) | (enumLiteral_18= 'ltime' ) | (enumLiteral_19= 'date' ) | (enumLiteral_20= 'lreal' ) | (enumLiteral_21= 'wchar' ) )
            int alt37=22;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt37=1;
                }
                break;
            case 68:
                {
                alt37=2;
                }
                break;
            case 69:
                {
                alt37=3;
                }
                break;
            case 70:
                {
                alt37=4;
                }
                break;
            case 71:
                {
                alt37=5;
                }
                break;
            case 72:
                {
                alt37=6;
                }
                break;
            case 73:
                {
                alt37=7;
                }
                break;
            case 74:
                {
                alt37=8;
                }
                break;
            case 75:
                {
                alt37=9;
                }
                break;
            case 76:
                {
                alt37=10;
                }
                break;
            case 77:
                {
                alt37=11;
                }
                break;
            case 78:
                {
                alt37=12;
                }
                break;
            case 79:
                {
                alt37=13;
                }
                break;
            case 80:
                {
                alt37=14;
                }
                break;
            case 81:
                {
                alt37=15;
                }
                break;
            case 82:
                {
                alt37=16;
                }
                break;
            case 83:
                {
                alt37=17;
                }
                break;
            case 84:
                {
                alt37=18;
                }
                break;
            case 85:
                {
                alt37=19;
                }
                break;
            case 86:
                {
                alt37=20;
                }
                break;
            case 87:
                {
                alt37=21;
                }
                break;
            case 88:
                {
                alt37=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalEis.g:2689:3: (enumLiteral_0= 'null' )
                    {
                    // InternalEis.g:2689:3: (enumLiteral_0= 'null' )
                    // InternalEis.g:2690:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEis.g:2697:3: (enumLiteral_1= 'int' )
                    {
                    // InternalEis.g:2697:3: (enumLiteral_1= 'int' )
                    // InternalEis.g:2698:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEis.g:2705:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalEis.g:2705:3: (enumLiteral_2= 'bool' )
                    // InternalEis.g:2706:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEis.g:2713:3: (enumLiteral_3= 'real' )
                    {
                    // InternalEis.g:2713:3: (enumLiteral_3= 'real' )
                    // InternalEis.g:2714:4: enumLiteral_3= 'real'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getREALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEis.g:2721:3: (enumLiteral_4= 'string' )
                    {
                    // InternalEis.g:2721:3: (enumLiteral_4= 'string' )
                    // InternalEis.g:2722:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEis.g:2729:3: (enumLiteral_5= 'char' )
                    {
                    // InternalEis.g:2729:3: (enumLiteral_5= 'char' )
                    // InternalEis.g:2730:4: enumLiteral_5= 'char'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getCHAREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEis.g:2737:3: (enumLiteral_6= 'byte' )
                    {
                    // InternalEis.g:2737:3: (enumLiteral_6= 'byte' )
                    // InternalEis.g:2738:4: enumLiteral_6= 'byte'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalEis.g:2745:3: (enumLiteral_7= 'word' )
                    {
                    // InternalEis.g:2745:3: (enumLiteral_7= 'word' )
                    // InternalEis.g:2746:4: enumLiteral_7= 'word'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getWORDEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalEis.g:2753:3: (enumLiteral_8= 'dword' )
                    {
                    // InternalEis.g:2753:3: (enumLiteral_8= 'dword' )
                    // InternalEis.g:2754:4: enumLiteral_8= 'dword'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getDWORDEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalEis.g:2761:3: (enumLiteral_9= 'lword' )
                    {
                    // InternalEis.g:2761:3: (enumLiteral_9= 'lword' )
                    // InternalEis.g:2762:4: enumLiteral_9= 'lword'
                    {
                    enumLiteral_9=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getLWORDEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalEis.g:2769:3: (enumLiteral_10= 'usint' )
                    {
                    // InternalEis.g:2769:3: (enumLiteral_10= 'usint' )
                    // InternalEis.g:2770:4: enumLiteral_10= 'usint'
                    {
                    enumLiteral_10=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUSINTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getUSINTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalEis.g:2777:3: (enumLiteral_11= 'uint' )
                    {
                    // InternalEis.g:2777:3: (enumLiteral_11= 'uint' )
                    // InternalEis.g:2778:4: enumLiteral_11= 'uint'
                    {
                    enumLiteral_11=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUINTEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBasicTypeAccess().getUINTEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalEis.g:2785:3: (enumLiteral_12= 'udint' )
                    {
                    // InternalEis.g:2785:3: (enumLiteral_12= 'udint' )
                    // InternalEis.g:2786:4: enumLiteral_12= 'udint'
                    {
                    enumLiteral_12=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUDINTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getBasicTypeAccess().getUDINTEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalEis.g:2793:3: (enumLiteral_13= 'ulint' )
                    {
                    // InternalEis.g:2793:3: (enumLiteral_13= 'ulint' )
                    // InternalEis.g:2794:4: enumLiteral_13= 'ulint'
                    {
                    enumLiteral_13=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getULINTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getBasicTypeAccess().getULINTEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalEis.g:2801:3: (enumLiteral_14= 'sint' )
                    {
                    // InternalEis.g:2801:3: (enumLiteral_14= 'sint' )
                    // InternalEis.g:2802:4: enumLiteral_14= 'sint'
                    {
                    enumLiteral_14=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSINTEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getBasicTypeAccess().getSINTEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalEis.g:2809:3: (enumLiteral_15= 'dint' )
                    {
                    // InternalEis.g:2809:3: (enumLiteral_15= 'dint' )
                    // InternalEis.g:2810:4: enumLiteral_15= 'dint'
                    {
                    enumLiteral_15=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDINTEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getBasicTypeAccess().getDINTEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalEis.g:2817:3: (enumLiteral_16= 'lint' )
                    {
                    // InternalEis.g:2817:3: (enumLiteral_16= 'lint' )
                    // InternalEis.g:2818:4: enumLiteral_16= 'lint'
                    {
                    enumLiteral_16=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLINTEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getBasicTypeAccess().getLINTEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalEis.g:2825:3: (enumLiteral_17= 'time' )
                    {
                    // InternalEis.g:2825:3: (enumLiteral_17= 'time' )
                    // InternalEis.g:2826:4: enumLiteral_17= 'time'
                    {
                    enumLiteral_17=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getTIMEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getBasicTypeAccess().getTIMEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalEis.g:2833:3: (enumLiteral_18= 'ltime' )
                    {
                    // InternalEis.g:2833:3: (enumLiteral_18= 'ltime' )
                    // InternalEis.g:2834:4: enumLiteral_18= 'ltime'
                    {
                    enumLiteral_18=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLTIMEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getBasicTypeAccess().getLTIMEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalEis.g:2841:3: (enumLiteral_19= 'date' )
                    {
                    // InternalEis.g:2841:3: (enumLiteral_19= 'date' )
                    // InternalEis.g:2842:4: enumLiteral_19= 'date'
                    {
                    enumLiteral_19=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalEis.g:2849:3: (enumLiteral_20= 'lreal' )
                    {
                    // InternalEis.g:2849:3: (enumLiteral_20= 'lreal' )
                    // InternalEis.g:2850:4: enumLiteral_20= 'lreal'
                    {
                    enumLiteral_20=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLREALEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getBasicTypeAccess().getLREALEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalEis.g:2857:3: (enumLiteral_21= 'wchar' )
                    {
                    // InternalEis.g:2857:3: (enumLiteral_21= 'wchar' )
                    // InternalEis.g:2858:4: enumLiteral_21= 'wchar'
                    {
                    enumLiteral_21=(Token)match(input,88,FOLLOW_2); 

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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000C8000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000C8000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000920000000020L,0x0000000001FFFFF8L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L,0x0000000001FFFFF8L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400003000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000100300001FFF0L,0x0000000000000004L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000600002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000900040000020L,0x0000000001FFFFF8L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000900002000020L,0x0000000001FFFFF8L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});

}
