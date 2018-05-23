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
    // InternalEis.g:71:1: ruleModel returns [EObject current=null] : ( (lv_eis_0_0= ruleEisType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_eis_0_0 = null;



        	enterRule();

        try {
            // InternalEis.g:77:2: ( ( (lv_eis_0_0= ruleEisType ) )* )
            // InternalEis.g:78:2: ( (lv_eis_0_0= ruleEisType ) )*
            {
            // InternalEis.g:78:2: ( (lv_eis_0_0= ruleEisType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEis.g:79:3: (lv_eis_0_0= ruleEisType )
            	    {
            	    // InternalEis.g:79:3: (lv_eis_0_0= ruleEisType )
            	    // InternalEis.g:80:4: lv_eis_0_0= ruleEisType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEisEisTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_eis_0_0=ruleEisType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"eis",
            	    					lv_eis_0_0,
            	    					"org.example.eis.Eis.EisType");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleEisType"
    // InternalEis.g:100:1: entryRuleEisType returns [EObject current=null] : iv_ruleEisType= ruleEisType EOF ;
    public final EObject entryRuleEisType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEisType = null;


        try {
            // InternalEis.g:100:48: (iv_ruleEisType= ruleEisType EOF )
            // InternalEis.g:101:2: iv_ruleEisType= ruleEisType EOF
            {
             newCompositeNode(grammarAccess.getEisTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEisType=ruleEisType();

            state._fsp--;

             current =iv_ruleEisType; 
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
    // $ANTLR end "entryRuleEisType"


    // $ANTLR start "ruleEisType"
    // InternalEis.g:107:1: ruleEisType returns [EObject current=null] : (this_TiaProjectName_0= ruleTiaProjectName | this_PLCName_1= rulePLCName ) ;
    public final EObject ruleEisType() throws RecognitionException {
        EObject current = null;

        EObject this_TiaProjectName_0 = null;

        EObject this_PLCName_1 = null;



        	enterRule();

        try {
            // InternalEis.g:113:2: ( (this_TiaProjectName_0= ruleTiaProjectName | this_PLCName_1= rulePLCName ) )
            // InternalEis.g:114:2: (this_TiaProjectName_0= ruleTiaProjectName | this_PLCName_1= rulePLCName )
            {
            // InternalEis.g:114:2: (this_TiaProjectName_0= ruleTiaProjectName | this_PLCName_1= rulePLCName )
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
                    // InternalEis.g:115:3: this_TiaProjectName_0= ruleTiaProjectName
                    {

                    			newCompositeNode(grammarAccess.getEisTypeAccess().getTiaProjectNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TiaProjectName_0=ruleTiaProjectName();

                    state._fsp--;


                    			current = this_TiaProjectName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEis.g:124:3: this_PLCName_1= rulePLCName
                    {

                    			newCompositeNode(grammarAccess.getEisTypeAccess().getPLCNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PLCName_1=rulePLCName();

                    state._fsp--;


                    			current = this_PLCName_1;
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
    // $ANTLR end "ruleEisType"


    // $ANTLR start "entryRuleTiaProjectName"
    // InternalEis.g:136:1: entryRuleTiaProjectName returns [EObject current=null] : iv_ruleTiaProjectName= ruleTiaProjectName EOF ;
    public final EObject entryRuleTiaProjectName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTiaProjectName = null;


        try {
            // InternalEis.g:136:55: (iv_ruleTiaProjectName= ruleTiaProjectName EOF )
            // InternalEis.g:137:2: iv_ruleTiaProjectName= ruleTiaProjectName EOF
            {
             newCompositeNode(grammarAccess.getTiaProjectNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTiaProjectName=ruleTiaProjectName();

            state._fsp--;

             current =iv_ruleTiaProjectName; 
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
    // $ANTLR end "entryRuleTiaProjectName"


    // $ANTLR start "ruleTiaProjectName"
    // InternalEis.g:143:1: ruleTiaProjectName returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleTiaProjectName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEis.g:149:2: ( (otherlv_0= 'project' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalEis.g:150:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalEis.g:150:2: (otherlv_0= 'project' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalEis.g:151:3: otherlv_0= 'project' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTiaProjectNameAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTiaProjectNameAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:159:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEis.g:160:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEis.g:160:4: (lv_name_2_0= RULE_ID )
            // InternalEis.g:161:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTiaProjectNameAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTiaProjectNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTiaProjectNameAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleTiaProjectName"


    // $ANTLR start "entryRulePLCName"
    // InternalEis.g:185:1: entryRulePLCName returns [EObject current=null] : iv_rulePLCName= rulePLCName EOF ;
    public final EObject entryRulePLCName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLCName = null;


        try {
            // InternalEis.g:185:48: (iv_rulePLCName= rulePLCName EOF )
            // InternalEis.g:186:2: iv_rulePLCName= rulePLCName EOF
            {
             newCompositeNode(grammarAccess.getPLCNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePLCName=rulePLCName();

            state._fsp--;

             current =iv_rulePLCName; 
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
    // $ANTLR end "entryRulePLCName"


    // $ANTLR start "rulePLCName"
    // InternalEis.g:192:1: rulePLCName returns [EObject current=null] : (otherlv_0= 'plcname' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject rulePLCName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEis.g:198:2: ( (otherlv_0= 'plcname' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalEis.g:199:2: (otherlv_0= 'plcname' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalEis.g:199:2: (otherlv_0= 'plcname' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalEis.g:200:3: otherlv_0= 'plcname' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPLCNameAccess().getPlcnameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPLCNameAccess().getEqualsSignKeyword_1());
            		
            // InternalEis.g:208:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEis.g:209:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEis.g:209:4: (lv_name_2_0= RULE_ID )
            // InternalEis.g:210:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPLCNameAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPLCNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPLCNameAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulePLCName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}