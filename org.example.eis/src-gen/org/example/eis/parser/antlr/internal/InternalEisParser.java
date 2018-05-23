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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'='", "';'", "'plcname'", "'<>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
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

        public InternalEisParser(TokenStream input, EisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEis.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEis.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEis.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEis.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_ID ) ) otherlv_7= ';' ( (lv_testcases_8_0= ruleTestcase ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_project_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_plc_name_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_testcases_8_0 = null;



        	enterRule();

        try {
            // InternalEis.g:77:2: ( (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_ID ) ) otherlv_7= ';' ( (lv_testcases_8_0= ruleTestcase ) )* ) )
            // InternalEis.g:78:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_ID ) ) otherlv_7= ';' ( (lv_testcases_8_0= ruleTestcase ) )* )
            {
            // InternalEis.g:78:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_ID ) ) otherlv_7= ';' ( (lv_testcases_8_0= ruleTestcase ) )* )
            // InternalEis.g:79:3: otherlv_0= 'project' otherlv_1= '=' ( (lv_project_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'plcname' otherlv_5= '=' ( (lv_plc_name_6_0= RULE_ID ) ) otherlv_7= ';' ( (lv_testcases_8_0= ruleTestcase ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:87:3: ( (lv_project_name_2_0= RULE_ID ) )
            // InternalEis.g:88:4: (lv_project_name_2_0= RULE_ID )
            {
            // InternalEis.g:88:4: (lv_project_name_2_0= RULE_ID )
            // InternalEis.g:89:5: lv_project_name_2_0= RULE_ID
            {
            lv_project_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_project_name_2_0, grammarAccess.getModelAccess().getProject_nameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"project_name",
            						lv_project_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPlcnameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getEqualsSignKeyword_5());
            		
            // InternalEis.g:117:3: ( (lv_plc_name_6_0= RULE_ID ) )
            // InternalEis.g:118:4: (lv_plc_name_6_0= RULE_ID )
            {
            // InternalEis.g:118:4: (lv_plc_name_6_0= RULE_ID )
            // InternalEis.g:119:5: lv_plc_name_6_0= RULE_ID
            {
            lv_plc_name_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_plc_name_6_0, grammarAccess.getModelAccess().getPlc_nameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"plc_name",
            						lv_plc_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getSemicolonKeyword_7());
            		
            // InternalEis.g:139:3: ( (lv_testcases_8_0= ruleTestcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:140:4: (lv_testcases_8_0= ruleTestcase )
            	    {
            	    // InternalEis.g:140:4: (lv_testcases_8_0= ruleTestcase )
            	    // InternalEis.g:141:5: lv_testcases_8_0= ruleTestcase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTestcasesTestcaseParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_testcases_8_0=ruleTestcase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testcases",
            	    						lv_testcases_8_0,
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTestcase"
    // InternalEis.g:162:1: entryRuleTestcase returns [String current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final String entryRuleTestcase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcase = null;


        try {
            // InternalEis.g:162:48: (iv_ruleTestcase= ruleTestcase EOF )
            // InternalEis.g:163:2: iv_ruleTestcase= ruleTestcase EOF
            {
             newCompositeNode(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestcase=ruleTestcase();

            state._fsp--;

             current =iv_ruleTestcase.getText(); 
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
    // InternalEis.g:169:1: ruleTestcase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<>' ;
    public final AntlrDatatypeRuleToken ruleTestcase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEis.g:175:2: (kw= '<>' )
            // InternalEis.g:176:2: kw= '<>'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTestcaseAccess().getLessThanSignGreaterThanSignKeyword());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});

}