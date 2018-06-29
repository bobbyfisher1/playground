package org.example.define.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.define.services.DefineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDefineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'{'", "'}'", "'input'", "'['", "']'", "'inout'", "'output'", "'variant'", "'='", "'+/-'", "';'", "','", "'('", "')'", "'udt'", "'int'", "'bool'", "'float'", "'true'", "'false'"
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

        public InternalDefineParser(TokenStream input, DefineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DefineBlock";
       	}

       	@Override
       	protected DefineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDefineBlock"
    // InternalDefine.g:64:1: entryRuleDefineBlock returns [EObject current=null] : iv_ruleDefineBlock= ruleDefineBlock EOF ;
    public final EObject entryRuleDefineBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineBlock = null;


        try {
            // InternalDefine.g:64:52: (iv_ruleDefineBlock= ruleDefineBlock EOF )
            // InternalDefine.g:65:2: iv_ruleDefineBlock= ruleDefineBlock EOF
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
    // InternalDefine.g:71:1: ruleDefineBlock returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleDefineBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:77:2: ( (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ) )
            // InternalDefine.g:78:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' )
            {
            // InternalDefine.g:78:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' )
            // InternalDefine.g:79:3: otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineBlockAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefine.g:87:3: ( (lv_direction_2_0= ruleDirectionBlock ) )
            // InternalDefine.g:88:4: (lv_direction_2_0= ruleDirectionBlock )
            {
            // InternalDefine.g:88:4: (lv_direction_2_0= ruleDirectionBlock )
            // InternalDefine.g:89:5: lv_direction_2_0= ruleDirectionBlock
            {

            					newCompositeNode(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_direction_2_0=ruleDirectionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineBlockRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"org.example.define.Define.DirectionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalDefine.g:114:1: entryRuleDirectionBlock returns [EObject current=null] : iv_ruleDirectionBlock= ruleDirectionBlock EOF ;
    public final EObject entryRuleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionBlock = null;


        try {
            // InternalDefine.g:114:55: (iv_ruleDirectionBlock= ruleDirectionBlock EOF )
            // InternalDefine.g:115:2: iv_ruleDirectionBlock= ruleDirectionBlock EOF
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
    // InternalDefine.g:121:1: ruleDirectionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_input_1_0 = null;

        EObject lv_inout_2_0 = null;

        EObject lv_output_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:127:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDefine.g:128:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDefine.g:128:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            // InternalDefine.g:129:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            {
            // InternalDefine.g:129:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            // InternalDefine.g:130:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			
            // InternalDefine.g:133:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?)
            // InternalDefine.g:134:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?
            {
            // InternalDefine.g:134:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDefine.g:135:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    {
            	    // InternalDefine.g:135:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    // InternalDefine.g:136:4: {...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDefine.g:136:108: ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    // InternalDefine.g:137:5: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDefine.g:140:8: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    // InternalDefine.g:140:9: {...}? => ( (lv_input_1_0= ruleInput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalDefine.g:140:18: ( (lv_input_1_0= ruleInput ) )
            	    // InternalDefine.g:140:19: (lv_input_1_0= ruleInput )
            	    {
            	    // InternalDefine.g:140:19: (lv_input_1_0= ruleInput )
            	    // InternalDefine.g:141:9: lv_input_1_0= ruleInput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInputInputParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_6);
            	    lv_input_1_0=ruleInput();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"input",
            	    										lv_input_1_0,
            	    										"org.example.define.Define.Input");
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
            	    // InternalDefine.g:163:3: ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) )
            	    {
            	    // InternalDefine.g:163:3: ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) )
            	    // InternalDefine.g:164:4: {...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDefine.g:164:108: ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) )
            	    // InternalDefine.g:165:5: ({...}? => ( (lv_inout_2_0= ruleInout ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDefine.g:168:8: ({...}? => ( (lv_inout_2_0= ruleInout ) ) )
            	    // InternalDefine.g:168:9: {...}? => ( (lv_inout_2_0= ruleInout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalDefine.g:168:18: ( (lv_inout_2_0= ruleInout ) )
            	    // InternalDefine.g:168:19: (lv_inout_2_0= ruleInout )
            	    {
            	    // InternalDefine.g:168:19: (lv_inout_2_0= ruleInout )
            	    // InternalDefine.g:169:9: lv_inout_2_0= ruleInout
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInoutInoutParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_6);
            	    lv_inout_2_0=ruleInout();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"inout",
            	    										lv_inout_2_0,
            	    										"org.example.define.Define.Inout");
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
            	    // InternalDefine.g:191:3: ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) )
            	    {
            	    // InternalDefine.g:191:3: ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) )
            	    // InternalDefine.g:192:4: {...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDefine.g:192:108: ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) )
            	    // InternalDefine.g:193:5: ({...}? => ( (lv_output_3_0= ruleOutput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDefine.g:196:8: ({...}? => ( (lv_output_3_0= ruleOutput ) ) )
            	    // InternalDefine.g:196:9: {...}? => ( (lv_output_3_0= ruleOutput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalDefine.g:196:18: ( (lv_output_3_0= ruleOutput ) )
            	    // InternalDefine.g:196:19: (lv_output_3_0= ruleOutput )
            	    {
            	    // InternalDefine.g:196:19: (lv_output_3_0= ruleOutput )
            	    // InternalDefine.g:197:9: lv_output_3_0= ruleOutput
            	    {

            	    									newCompositeNode(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_6);
            	    lv_output_3_0=ruleOutput();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
            	    									}
            	    									set(
            	    										current,
            	    										"output",
            	    										lv_output_3_0,
            	    										"org.example.define.Define.Output");
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // InternalDefine.g:230:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalDefine.g:230:46: (iv_ruleInput= ruleInput EOF )
            // InternalDefine.g:231:2: iv_ruleInput= ruleInput EOF
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
    // InternalDefine.g:237:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:243:2: ( (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:244:2: (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:244:2: (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:245:3: otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalDefine.g:249:3: ()
            // InternalDefine.g:250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:260:3: ( (lv_inputVariables_3_0= ruleVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==19||(LA2_0>=26 && LA2_0<=29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDefine.g:261:4: (lv_inputVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:261:4: (lv_inputVariables_3_0= ruleVariable )
            	    // InternalDefine.g:262:5: lv_inputVariables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getInputVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_inputVariables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputVariables",
            	    						lv_inputVariables_3_0,
            	    						"org.example.define.Define.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleInout"
    // InternalDefine.g:287:1: entryRuleInout returns [EObject current=null] : iv_ruleInout= ruleInout EOF ;
    public final EObject entryRuleInout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInout = null;


        try {
            // InternalDefine.g:287:46: (iv_ruleInout= ruleInout EOF )
            // InternalDefine.g:288:2: iv_ruleInout= ruleInout EOF
            {
             newCompositeNode(grammarAccess.getInoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInout=ruleInout();

            state._fsp--;

             current =iv_ruleInout; 
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
    // $ANTLR end "entryRuleInout"


    // $ANTLR start "ruleInout"
    // InternalDefine.g:294:1: ruleInout returns [EObject current=null] : (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleInout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inoutVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:300:2: ( (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:301:2: (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:301:2: (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:302:3: otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInoutAccess().getInoutKeyword_0());
            		
            // InternalDefine.g:306:3: ()
            // InternalDefine.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInoutAccess().getInoutAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:317:3: ( (lv_inoutVariables_3_0= ruleVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==19||(LA3_0>=26 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDefine.g:318:4: (lv_inoutVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:318:4: (lv_inoutVariables_3_0= ruleVariable )
            	    // InternalDefine.g:319:5: lv_inoutVariables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getInoutAccess().getInoutVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_inoutVariables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inoutVariables",
            	    						lv_inoutVariables_3_0,
            	    						"org.example.define.Define.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInoutAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInout"


    // $ANTLR start "entryRuleOutput"
    // InternalDefine.g:344:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalDefine.g:344:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalDefine.g:345:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalDefine.g:351:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_outputVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:357:2: ( (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:358:2: (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:358:2: (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:359:3: otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalDefine.g:363:3: ()
            // InternalDefine.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:374:3: ( (lv_outputVariables_3_0= ruleVariable ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==19||(LA4_0>=26 && LA4_0<=29)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDefine.g:375:4: (lv_outputVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:375:4: (lv_outputVariables_3_0= ruleVariable )
            	    // InternalDefine.g:376:5: lv_outputVariables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getOutputAccess().getOutputVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_outputVariables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputVariables",
            	    						lv_outputVariables_3_0,
            	    						"org.example.define.Define.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleVariable"
    // InternalDefine.g:401:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDefine.g:401:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDefine.g:402:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDefine.g:408:1: ruleVariable returns [EObject current=null] : ( ( ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) ) ) | ( ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) ) ) | ( (lv_udt_4_0= ruleUdt ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_variantKeyword_2_0=null;
        EObject lv_variableType_0_0 = null;

        EObject lv_variableDefinition_1_0 = null;

        EObject lv_variant_3_0 = null;

        EObject lv_udt_4_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:414:2: ( ( ( ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) ) ) | ( ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) ) ) | ( (lv_udt_4_0= ruleUdt ) ) ) )
            // InternalDefine.g:415:2: ( ( ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) ) ) | ( ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) ) ) | ( (lv_udt_4_0= ruleUdt ) ) )
            {
            // InternalDefine.g:415:2: ( ( ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) ) ) | ( ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) ) ) | ( (lv_udt_4_0= ruleUdt ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
            case 29:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==24) ) {
                    alt7=2;
                }
                else if ( (LA7_2==RULE_ID||LA7_2==20||(LA7_2>=22 && LA7_2<=23)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 26:
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
                    // InternalDefine.g:416:3: ( ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) ) )
                    {
                    // InternalDefine.g:416:3: ( ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) ) )
                    // InternalDefine.g:417:4: ( (lv_variableType_0_0= ruleVariableType ) )? ( (lv_variableDefinition_1_0= ruleVariableDefinition ) )
                    {
                    // InternalDefine.g:417:4: ( (lv_variableType_0_0= ruleVariableType ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=27 && LA5_0<=29)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_ID) ) {
                        int LA5_2 = input.LA(2);

                        if ( (LA5_2==RULE_ID) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDefine.g:418:5: (lv_variableType_0_0= ruleVariableType )
                            {
                            // InternalDefine.g:418:5: (lv_variableType_0_0= ruleVariableType )
                            // InternalDefine.g:419:6: lv_variableType_0_0= ruleVariableType
                            {

                            						newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeVariableTypeParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_variableType_0_0=ruleVariableType();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getVariableRule());
                            						}
                            						set(
                            							current,
                            							"variableType",
                            							lv_variableType_0_0,
                            							"org.example.define.Define.VariableType");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalDefine.g:436:4: ( (lv_variableDefinition_1_0= ruleVariableDefinition ) )
                    // InternalDefine.g:437:5: (lv_variableDefinition_1_0= ruleVariableDefinition )
                    {
                    // InternalDefine.g:437:5: (lv_variableDefinition_1_0= ruleVariableDefinition )
                    // InternalDefine.g:438:6: lv_variableDefinition_1_0= ruleVariableDefinition
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getVariableDefinitionVariableDefinitionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variableDefinition_1_0=ruleVariableDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"variableDefinition",
                    							lv_variableDefinition_1_0,
                    							"org.example.define.Define.VariableDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:457:3: ( ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) ) )
                    {
                    // InternalDefine.g:457:3: ( ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) ) )
                    // InternalDefine.g:458:4: ( (lv_variantKeyword_2_0= 'variant' ) )? ( (lv_variant_3_0= ruleVariant ) )
                    {
                    // InternalDefine.g:458:4: ( (lv_variantKeyword_2_0= 'variant' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDefine.g:459:5: (lv_variantKeyword_2_0= 'variant' )
                            {
                            // InternalDefine.g:459:5: (lv_variantKeyword_2_0= 'variant' )
                            // InternalDefine.g:460:6: lv_variantKeyword_2_0= 'variant'
                            {
                            lv_variantKeyword_2_0=(Token)match(input,19,FOLLOW_10); 

                            						newLeafNode(lv_variantKeyword_2_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVariableRule());
                            						}
                            						setWithLastConsumed(current, "variantKeyword", true, "variant");
                            					

                            }


                            }
                            break;

                    }

                    // InternalDefine.g:472:4: ( (lv_variant_3_0= ruleVariant ) )
                    // InternalDefine.g:473:5: (lv_variant_3_0= ruleVariant )
                    {
                    // InternalDefine.g:473:5: (lv_variant_3_0= ruleVariant )
                    // InternalDefine.g:474:6: lv_variant_3_0= ruleVariant
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getVariantVariantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variant_3_0=ruleVariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"variant",
                    							lv_variant_3_0,
                    							"org.example.define.Define.Variant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:493:3: ( (lv_udt_4_0= ruleUdt ) )
                    {
                    // InternalDefine.g:493:3: ( (lv_udt_4_0= ruleUdt ) )
                    // InternalDefine.g:494:4: (lv_udt_4_0= ruleUdt )
                    {
                    // InternalDefine.g:494:4: (lv_udt_4_0= ruleUdt )
                    // InternalDefine.g:495:5: lv_udt_4_0= ruleUdt
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_udt_4_0=ruleUdt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"udt",
                    						lv_udt_4_0,
                    						"org.example.define.Define.Udt");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalDefine.g:516:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalDefine.g:516:59: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalDefine.g:517:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalDefine.g:523:1: ruleVariableDefinition returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )? )? (otherlv_5= ';' | ( (lv_nextVariable_6_0= ',' ) ) ) ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_nextVariable_6_0=null;
        EObject lv_expression_2_0 = null;

        EObject lv_range_4_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:529:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )? )? (otherlv_5= ';' | ( (lv_nextVariable_6_0= ',' ) ) ) ) )
            // InternalDefine.g:530:2: ( ( (lv_variableName_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )? )? (otherlv_5= ';' | ( (lv_nextVariable_6_0= ',' ) ) ) )
            {
            // InternalDefine.g:530:2: ( ( (lv_variableName_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )? )? (otherlv_5= ';' | ( (lv_nextVariable_6_0= ',' ) ) ) )
            // InternalDefine.g:531:3: ( (lv_variableName_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )? )? (otherlv_5= ';' | ( (lv_nextVariable_6_0= ',' ) ) )
            {
            // InternalDefine.g:531:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalDefine.g:532:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalDefine.g:532:4: (lv_variableName_0_0= RULE_ID )
            // InternalDefine.g:533:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_variableName_0_0, grammarAccess.getVariableDefinitionAccess().getVariableNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variableName",
            						lv_variableName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDefine.g:549:3: (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDefine.g:550:4: otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalDefine.g:554:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalDefine.g:555:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalDefine.g:555:5: (lv_expression_2_0= ruleExpression )
                    // InternalDefine.g:556:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDefinitionAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.example.define.Define.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDefine.g:573:4: (otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDefine.g:574:5: otherlv_3= '+/-' ( (lv_range_4_0= ruleExpression ) )
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionAccess().getPlusSignSolidusHyphenMinusKeyword_1_2_0());
                            				
                            // InternalDefine.g:578:5: ( (lv_range_4_0= ruleExpression ) )
                            // InternalDefine.g:579:6: (lv_range_4_0= ruleExpression )
                            {
                            // InternalDefine.g:579:6: (lv_range_4_0= ruleExpression )
                            // InternalDefine.g:580:7: lv_range_4_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getVariableDefinitionAccess().getRangeExpressionParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_range_4_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                            							}
                            							set(
                            								current,
                            								"range",
                            								lv_range_4_0,
                            								"org.example.define.Define.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDefine.g:599:3: (otherlv_5= ';' | ( (lv_nextVariable_6_0= ',' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDefine.g:600:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDefine.g:605:4: ( (lv_nextVariable_6_0= ',' ) )
                    {
                    // InternalDefine.g:605:4: ( (lv_nextVariable_6_0= ',' ) )
                    // InternalDefine.g:606:5: (lv_nextVariable_6_0= ',' )
                    {
                    // InternalDefine.g:606:5: (lv_nextVariable_6_0= ',' )
                    // InternalDefine.g:607:6: lv_nextVariable_6_0= ','
                    {
                    lv_nextVariable_6_0=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_nextVariable_6_0, grammarAccess.getVariableDefinitionAccess().getNextVariableCommaKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariant"
    // InternalDefine.g:624:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // InternalDefine.g:624:48: (iv_ruleVariant= ruleVariant EOF )
            // InternalDefine.g:625:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalDefine.g:631:1: ruleVariant returns [EObject current=null] : ( ( (lv_variantName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_variantType_2_0= ruleVariableType ) ) otherlv_3= ')' (otherlv_4= ';' | ( (lv_nextVariant_5_0= ',' ) ) ) ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token lv_variantName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_nextVariant_5_0=null;
        EObject lv_variantType_2_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:637:2: ( ( ( (lv_variantName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_variantType_2_0= ruleVariableType ) ) otherlv_3= ')' (otherlv_4= ';' | ( (lv_nextVariant_5_0= ',' ) ) ) ) )
            // InternalDefine.g:638:2: ( ( (lv_variantName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_variantType_2_0= ruleVariableType ) ) otherlv_3= ')' (otherlv_4= ';' | ( (lv_nextVariant_5_0= ',' ) ) ) )
            {
            // InternalDefine.g:638:2: ( ( (lv_variantName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_variantType_2_0= ruleVariableType ) ) otherlv_3= ')' (otherlv_4= ';' | ( (lv_nextVariant_5_0= ',' ) ) ) )
            // InternalDefine.g:639:3: ( (lv_variantName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_variantType_2_0= ruleVariableType ) ) otherlv_3= ')' (otherlv_4= ';' | ( (lv_nextVariant_5_0= ',' ) ) )
            {
            // InternalDefine.g:639:3: ( (lv_variantName_0_0= RULE_ID ) )
            // InternalDefine.g:640:4: (lv_variantName_0_0= RULE_ID )
            {
            // InternalDefine.g:640:4: (lv_variantName_0_0= RULE_ID )
            // InternalDefine.g:641:5: lv_variantName_0_0= RULE_ID
            {
            lv_variantName_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_variantName_0_0, grammarAccess.getVariantAccess().getVariantNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variantName",
            						lv_variantName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDefine.g:661:3: ( (lv_variantType_2_0= ruleVariableType ) )
            // InternalDefine.g:662:4: (lv_variantType_2_0= ruleVariableType )
            {
            // InternalDefine.g:662:4: (lv_variantType_2_0= ruleVariableType )
            // InternalDefine.g:663:5: lv_variantType_2_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getVariantTypeVariableTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_variantType_2_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"variantType",
            						lv_variantType_2_0,
            						"org.example.define.Define.VariableType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getVariantAccess().getRightParenthesisKeyword_3());
            		
            // InternalDefine.g:684:3: (otherlv_4= ';' | ( (lv_nextVariant_5_0= ',' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDefine.g:685:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDefine.g:690:4: ( (lv_nextVariant_5_0= ',' ) )
                    {
                    // InternalDefine.g:690:4: ( (lv_nextVariant_5_0= ',' ) )
                    // InternalDefine.g:691:5: (lv_nextVariant_5_0= ',' )
                    {
                    // InternalDefine.g:691:5: (lv_nextVariant_5_0= ',' )
                    // InternalDefine.g:692:6: lv_nextVariant_5_0= ','
                    {
                    lv_nextVariant_5_0=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_nextVariant_5_0, grammarAccess.getVariantAccess().getNextVariantCommaKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariantRule());
                    						}
                    						setWithLastConsumed(current, "nextVariant", true, ",");
                    					

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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleUdt"
    // InternalDefine.g:709:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalDefine.g:709:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalDefine.g:710:2: iv_ruleUdt= ruleUdt EOF
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
    // InternalDefine.g:716:1: ruleUdt returns [EObject current=null] : (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' ) ;
    public final EObject ruleUdt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_udtName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_udtTypes_3_0 = null;

        EObject lv_udtVariables_6_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:722:2: ( (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' ) )
            // InternalDefine.g:723:2: (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' )
            {
            // InternalDefine.g:723:2: (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' )
            // InternalDefine.g:724:3: otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
            		
            // InternalDefine.g:728:3: ( (lv_udtName_1_0= RULE_ID ) )
            // InternalDefine.g:729:4: (lv_udtName_1_0= RULE_ID )
            {
            // InternalDefine.g:729:4: (lv_udtName_1_0= RULE_ID )
            // InternalDefine.g:730:5: lv_udtName_1_0= RULE_ID
            {
            lv_udtName_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_udtName_1_0, grammarAccess.getUdtAccess().getUdtNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUdtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"udtName",
            						lv_udtName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDefine.g:750:3: ( (lv_udtTypes_3_0= ruleUdtType ) )
            // InternalDefine.g:751:4: (lv_udtTypes_3_0= ruleUdtType )
            {
            // InternalDefine.g:751:4: (lv_udtTypes_3_0= ruleUdtType )
            // InternalDefine.g:752:5: lv_udtTypes_3_0= ruleUdtType
            {

            					newCompositeNode(grammarAccess.getUdtAccess().getUdtTypesUdtTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_udtTypes_3_0=ruleUdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUdtRule());
            					}
            					set(
            						current,
            						"udtTypes",
            						lv_udtTypes_3_0,
            						"org.example.define.Define.UdtType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getUdtAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDefine.g:777:3: ( (lv_udtVariables_6_0= ruleVariable ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==19||(LA12_0>=26 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDefine.g:778:4: (lv_udtVariables_6_0= ruleVariable )
            	    {
            	    // InternalDefine.g:778:4: (lv_udtVariables_6_0= ruleVariable )
            	    // InternalDefine.g:779:5: lv_udtVariables_6_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getUdtAccess().getUdtVariablesVariableParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_udtVariables_6_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUdtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"udtVariables",
            	    						lv_udtVariables_6_0,
            	    						"org.example.define.Define.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUdtType"
    // InternalDefine.g:804:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalDefine.g:804:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalDefine.g:805:2: iv_ruleUdtType= ruleUdtType EOF
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
    // InternalDefine.g:811:1: ruleUdtType returns [EObject current=null] : ( (lv_udtTypeName_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_udtTypeName_0_0=null;


        	enterRule();

        try {
            // InternalDefine.g:817:2: ( ( (lv_udtTypeName_0_0= RULE_ID ) ) )
            // InternalDefine.g:818:2: ( (lv_udtTypeName_0_0= RULE_ID ) )
            {
            // InternalDefine.g:818:2: ( (lv_udtTypeName_0_0= RULE_ID ) )
            // InternalDefine.g:819:3: (lv_udtTypeName_0_0= RULE_ID )
            {
            // InternalDefine.g:819:3: (lv_udtTypeName_0_0= RULE_ID )
            // InternalDefine.g:820:4: lv_udtTypeName_0_0= RULE_ID
            {
            lv_udtTypeName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_udtTypeName_0_0, grammarAccess.getUdtTypeAccess().getUdtTypeNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUdtTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"udtTypeName",
            					lv_udtTypeName_0_0,
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


    // $ANTLR start "entryRuleVariableType"
    // InternalDefine.g:839:1: entryRuleVariableType returns [EObject current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final EObject entryRuleVariableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableType = null;


        try {
            // InternalDefine.g:839:53: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalDefine.g:840:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType; 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalDefine.g:846:1: ruleVariableType returns [EObject current=null] : ( () ( ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleVariableType() throws RecognitionException {
        EObject current = null;

        Token lv_basicTypes_1_1=null;
        Token lv_basicTypes_1_2=null;
        Token lv_basicTypes_1_3=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDefine.g:852:2: ( ( () ( ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalDefine.g:853:2: ( () ( ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalDefine.g:853:2: ( () ( ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDefine.g:854:3: () ( ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDefine.g:854:3: ()
            // InternalDefine.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableTypeAccess().getVariableTypeAction_0(),
            					current);
            			

            }

            // InternalDefine.g:861:3: ( ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=27 && LA14_0<=29)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDefine.g:862:4: ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) )
                    {
                    // InternalDefine.g:862:4: ( ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) ) )
                    // InternalDefine.g:863:5: ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) )
                    {
                    // InternalDefine.g:863:5: ( (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' ) )
                    // InternalDefine.g:864:6: (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' )
                    {
                    // InternalDefine.g:864:6: (lv_basicTypes_1_1= 'int' | lv_basicTypes_1_2= 'bool' | lv_basicTypes_1_3= 'float' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt13=1;
                        }
                        break;
                    case 28:
                        {
                        alt13=2;
                        }
                        break;
                    case 29:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalDefine.g:865:7: lv_basicTypes_1_1= 'int'
                            {
                            lv_basicTypes_1_1=(Token)match(input,27,FOLLOW_2); 

                            							newLeafNode(lv_basicTypes_1_1, grammarAccess.getVariableTypeAccess().getBasicTypesIntKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVariableTypeRule());
                            							}
                            							setWithLastConsumed(current, "basicTypes", lv_basicTypes_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDefine.g:876:7: lv_basicTypes_1_2= 'bool'
                            {
                            lv_basicTypes_1_2=(Token)match(input,28,FOLLOW_2); 

                            							newLeafNode(lv_basicTypes_1_2, grammarAccess.getVariableTypeAccess().getBasicTypesBoolKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVariableTypeRule());
                            							}
                            							setWithLastConsumed(current, "basicTypes", lv_basicTypes_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalDefine.g:887:7: lv_basicTypes_1_3= 'float'
                            {
                            lv_basicTypes_1_3=(Token)match(input,29,FOLLOW_2); 

                            							newLeafNode(lv_basicTypes_1_3, grammarAccess.getVariableTypeAccess().getBasicTypesFloatKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVariableTypeRule());
                            							}
                            							setWithLastConsumed(current, "basicTypes", lv_basicTypes_1_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:901:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalDefine.g:901:4: ( (otherlv_2= RULE_ID ) )
                    // InternalDefine.g:902:5: (otherlv_2= RULE_ID )
                    {
                    // InternalDefine.g:902:5: (otherlv_2= RULE_ID )
                    // InternalDefine.g:903:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableTypeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getVariableTypeAccess().getSpecifiedUdtTypeUdtTypeCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleExpression"
    // InternalDefine.g:919:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDefine.g:919:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDefine.g:920:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDefine.g:926:1: ruleExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDefine.g:932:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalDefine.g:933:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalDefine.g:933:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case 30:
            case 31:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDefine.g:934:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDefine.g:934:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDefine.g:935:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDefine.g:935:4: ()
                    // InternalDefine.g:936:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:942:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDefine.g:943:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDefine.g:943:5: (lv_value_1_0= RULE_INT )
                    // InternalDefine.g:944:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:962:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalDefine.g:962:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalDefine.g:963:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDefine.g:963:4: ()
                    // InternalDefine.g:964:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:970:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDefine.g:971:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDefine.g:971:5: (lv_value_3_0= RULE_STRING )
                    // InternalDefine.g:972:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
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
                    // InternalDefine.g:990:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalDefine.g:990:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalDefine.g:991:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalDefine.g:991:4: ()
                    // InternalDefine.g:992:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:998:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalDefine.g:999:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalDefine.g:999:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalDefine.g:1000:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalDefine.g:1000:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==30) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==31) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDefine.g:1001:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,30,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDefine.g:1012:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,31,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:1027:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDefine.g:1027:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalDefine.g:1028:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalDefine.g:1028:4: ()
                    // InternalDefine.g:1029:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1035:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDefine.g:1036:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDefine.g:1036:5: (otherlv_7= RULE_ID )
                    // InternalDefine.g:1037:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0());
                    					

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
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003C090010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C0000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003C082010L});

}
