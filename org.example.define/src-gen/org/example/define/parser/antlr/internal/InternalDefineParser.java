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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'{'", "'}'", "'input'", "'['", "']'", "'output'", "'inout'", "'variant'", "'='", "'+/-'", "';'", "'udt'", "'('", "')'", "'int'", "'bool'", "'float'", "'string'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'", "'.'"
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
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
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

                if ( (LA2_0==19||LA2_0==23||(LA2_0>=26 && LA2_0<=29)) ) {
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


    // $ANTLR start "entryRuleOutput"
    // InternalDefine.g:287:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalDefine.g:287:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalDefine.g:288:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalDefine.g:294:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_outputVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:300:2: ( (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:301:2: (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:301:2: (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:302:3: otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalDefine.g:306:3: ()
            // InternalDefine.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:317:3: ( (lv_outputVariables_3_0= ruleVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==23||(LA3_0>=26 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDefine.g:318:4: (lv_outputVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:318:4: (lv_outputVariables_3_0= ruleVariable )
            	    // InternalDefine.g:319:5: lv_outputVariables_3_0= ruleVariable
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
            	    break loop3;
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


    // $ANTLR start "entryRuleInout"
    // InternalDefine.g:344:1: entryRuleInout returns [EObject current=null] : iv_ruleInout= ruleInout EOF ;
    public final EObject entryRuleInout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInout = null;


        try {
            // InternalDefine.g:344:46: (iv_ruleInout= ruleInout EOF )
            // InternalDefine.g:345:2: iv_ruleInout= ruleInout EOF
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
    // InternalDefine.g:351:1: ruleInout returns [EObject current=null] : (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleInout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inoutVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:357:2: ( (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:358:2: (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:358:2: (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:359:3: otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInoutAccess().getInoutKeyword_0());
            		
            // InternalDefine.g:363:3: ()
            // InternalDefine.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInoutAccess().getInoutAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:374:3: ( (lv_inoutVariables_3_0= ruleVariable ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==23||(LA4_0>=26 && LA4_0<=29)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDefine.g:375:4: (lv_inoutVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:375:4: (lv_inoutVariables_3_0= ruleVariable )
            	    // InternalDefine.g:376:5: lv_inoutVariables_3_0= ruleVariable
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
            	    break loop4;
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
    // InternalDefine.g:408:1: ruleVariable returns [EObject current=null] : ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';' ) | ( (lv_udt_9_0= ruleUdt ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_variantKeyword_1_0=null;
        Token lv_variableName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_variableType_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_range_7_0 = null;

        EObject lv_udt_9_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:414:2: ( ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';' ) | ( (lv_udt_9_0= ruleUdt ) ) ) )
            // InternalDefine.g:415:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';' ) | ( (lv_udt_9_0= ruleUdt ) ) )
            {
            // InternalDefine.g:415:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';' ) | ( (lv_udt_9_0= ruleUdt ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19||(LA8_0>=26 && LA8_0<=29)) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDefine.g:416:3: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';' )
                    {
                    // InternalDefine.g:416:3: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';' )
                    // InternalDefine.g:417:4: () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleTypes ) ) ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? otherlv_8= ';'
                    {
                    // InternalDefine.g:417:4: ()
                    // InternalDefine.g:418:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVariableAccess().getVariableAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:424:4: ( (lv_variantKeyword_1_0= 'variant' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDefine.g:425:5: (lv_variantKeyword_1_0= 'variant' )
                            {
                            // InternalDefine.g:425:5: (lv_variantKeyword_1_0= 'variant' )
                            // InternalDefine.g:426:6: lv_variantKeyword_1_0= 'variant'
                            {
                            lv_variantKeyword_1_0=(Token)match(input,19,FOLLOW_9); 

                            						newLeafNode(lv_variantKeyword_1_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVariableRule());
                            						}
                            						setWithLastConsumed(current, "variantKeyword", true, "variant");
                            					

                            }


                            }
                            break;

                    }

                    // InternalDefine.g:438:4: ( (lv_variableType_2_0= ruleTypes ) )
                    // InternalDefine.g:439:5: (lv_variableType_2_0= ruleTypes )
                    {
                    // InternalDefine.g:439:5: (lv_variableType_2_0= ruleTypes )
                    // InternalDefine.g:440:6: lv_variableType_2_0= ruleTypes
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeTypesParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_variableType_2_0=ruleTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"variableType",
                    							lv_variableType_2_0,
                    							"org.example.define.Define.Types");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDefine.g:457:4: ( (lv_variableName_3_0= RULE_ID ) )
                    // InternalDefine.g:458:5: (lv_variableName_3_0= RULE_ID )
                    {
                    // InternalDefine.g:458:5: (lv_variableName_3_0= RULE_ID )
                    // InternalDefine.g:459:6: lv_variableName_3_0= RULE_ID
                    {
                    lv_variableName_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_variableName_3_0, grammarAccess.getVariableAccess().getVariableNameIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variableName",
                    							lv_variableName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalDefine.g:475:4: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDefine.g:476:5: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )?
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_0_4_0());
                            				
                            // InternalDefine.g:480:5: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalDefine.g:481:6: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalDefine.g:481:6: (lv_expression_5_0= ruleExpression )
                            // InternalDefine.g:482:7: lv_expression_5_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_0_4_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_expression_5_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"expression",
                            								lv_expression_5_0,
                            								"org.example.define.Define.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDefine.g:499:5: (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==21) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalDefine.g:500:6: otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) )
                                    {
                                    otherlv_6=(Token)match(input,21,FOLLOW_12); 

                                    						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_0_4_2_0());
                                    					
                                    // InternalDefine.g:504:6: ( (lv_range_7_0= ruleExpression ) )
                                    // InternalDefine.g:505:7: (lv_range_7_0= ruleExpression )
                                    {
                                    // InternalDefine.g:505:7: (lv_range_7_0= ruleExpression )
                                    // InternalDefine.g:506:8: lv_range_7_0= ruleExpression
                                    {

                                    								newCompositeNode(grammarAccess.getVariableAccess().getRangeExpressionParserRuleCall_0_4_2_1_0());
                                    							
                                    pushFollow(FOLLOW_14);
                                    lv_range_7_0=ruleExpression();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getVariableRule());
                                    								}
                                    								set(
                                    									current,
                                    									"range",
                                    									lv_range_7_0,
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

                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getSemicolonKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:531:3: ( (lv_udt_9_0= ruleUdt ) )
                    {
                    // InternalDefine.g:531:3: ( (lv_udt_9_0= ruleUdt ) )
                    // InternalDefine.g:532:4: (lv_udt_9_0= ruleUdt )
                    {
                    // InternalDefine.g:532:4: (lv_udt_9_0= ruleUdt )
                    // InternalDefine.g:533:5: lv_udt_9_0= ruleUdt
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_udt_9_0=ruleUdt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"udt",
                    						lv_udt_9_0,
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


    // $ANTLR start "entryRuleUdt"
    // InternalDefine.g:554:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalDefine.g:554:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalDefine.g:555:2: iv_ruleUdt= ruleUdt EOF
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
    // InternalDefine.g:561:1: ruleUdt returns [EObject current=null] : (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' ) ;
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
            // InternalDefine.g:567:2: ( (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' ) )
            // InternalDefine.g:568:2: (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' )
            {
            // InternalDefine.g:568:2: (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' )
            // InternalDefine.g:569:3: otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
            		
            // InternalDefine.g:573:3: ( (lv_udtName_1_0= RULE_ID ) )
            // InternalDefine.g:574:4: (lv_udtName_1_0= RULE_ID )
            {
            // InternalDefine.g:574:4: (lv_udtName_1_0= RULE_ID )
            // InternalDefine.g:575:5: lv_udtName_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDefine.g:595:3: ( (lv_udtTypes_3_0= ruleUdtType ) )
            // InternalDefine.g:596:4: (lv_udtTypes_3_0= ruleUdtType )
            {
            // InternalDefine.g:596:4: (lv_udtTypes_3_0= ruleUdtType )
            // InternalDefine.g:597:5: lv_udtTypes_3_0= ruleUdtType
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
            		
            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDefine.g:622:3: ( (lv_udtVariables_6_0= ruleVariable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==23||(LA9_0>=26 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDefine.g:623:4: (lv_udtVariables_6_0= ruleVariable )
            	    {
            	    // InternalDefine.g:623:4: (lv_udtVariables_6_0= ruleVariable )
            	    // InternalDefine.g:624:5: lv_udtVariables_6_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getUdtAccess().getUdtVariablesVariableParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop9;
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
    // InternalDefine.g:649:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalDefine.g:649:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalDefine.g:650:2: iv_ruleUdtType= ruleUdtType EOF
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
    // InternalDefine.g:656:1: ruleUdtType returns [EObject current=null] : ( (lv_udtTypeName_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_udtTypeName_0_0=null;


        	enterRule();

        try {
            // InternalDefine.g:662:2: ( ( (lv_udtTypeName_0_0= RULE_ID ) ) )
            // InternalDefine.g:663:2: ( (lv_udtTypeName_0_0= RULE_ID ) )
            {
            // InternalDefine.g:663:2: ( (lv_udtTypeName_0_0= RULE_ID ) )
            // InternalDefine.g:664:3: (lv_udtTypeName_0_0= RULE_ID )
            {
            // InternalDefine.g:664:3: (lv_udtTypeName_0_0= RULE_ID )
            // InternalDefine.g:665:4: lv_udtTypeName_0_0= RULE_ID
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


    // $ANTLR start "entryRuleTypes"
    // InternalDefine.g:684:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalDefine.g:684:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalDefine.g:685:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalDefine.g:691:1: ruleTypes returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'float' ) | ( () otherlv_7= 'string' ) ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDefine.g:697:2: ( ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'float' ) | ( () otherlv_7= 'string' ) ) )
            // InternalDefine.g:698:2: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'float' ) | ( () otherlv_7= 'string' ) )
            {
            // InternalDefine.g:698:2: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'float' ) | ( () otherlv_7= 'string' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 29:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDefine.g:699:3: ( () otherlv_1= 'int' )
                    {
                    // InternalDefine.g:699:3: ( () otherlv_1= 'int' )
                    // InternalDefine.g:700:4: () otherlv_1= 'int'
                    {
                    // InternalDefine.g:700:4: ()
                    // InternalDefine.g:701:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getIntAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypesAccess().getIntKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:713:3: ( () otherlv_3= 'bool' )
                    {
                    // InternalDefine.g:713:3: ( () otherlv_3= 'bool' )
                    // InternalDefine.g:714:4: () otherlv_3= 'bool'
                    {
                    // InternalDefine.g:714:4: ()
                    // InternalDefine.g:715:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getBoolAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypesAccess().getBoolKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:727:3: ( () otherlv_5= 'float' )
                    {
                    // InternalDefine.g:727:3: ( () otherlv_5= 'float' )
                    // InternalDefine.g:728:4: () otherlv_5= 'float'
                    {
                    // InternalDefine.g:728:4: ()
                    // InternalDefine.g:729:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getFloatAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypesAccess().getFloatKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:741:3: ( () otherlv_7= 'string' )
                    {
                    // InternalDefine.g:741:3: ( () otherlv_7= 'string' )
                    // InternalDefine.g:742:4: () otherlv_7= 'string'
                    {
                    // InternalDefine.g:742:4: ()
                    // InternalDefine.g:743:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getStringTypAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypesAccess().getStringKeyword_3_1());
                    			

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleExpression"
    // InternalDefine.g:758:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDefine.g:758:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDefine.g:759:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDefine.g:765:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:771:2: (this_Or_0= ruleOr )
            // InternalDefine.g:772:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalDefine.g:783:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalDefine.g:783:43: (iv_ruleOr= ruleOr EOF )
            // InternalDefine.g:784:2: iv_ruleOr= ruleOr EOF
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
    // InternalDefine.g:790:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:796:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalDefine.g:797:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalDefine.g:797:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalDefine.g:798:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:806:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDefine.g:807:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalDefine.g:807:4: ()
            	    // InternalDefine.g:808:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDefine.g:818:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalDefine.g:819:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalDefine.g:819:5: (lv_right_3_0= ruleAnd )
            	    // InternalDefine.g:820:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.define.Define.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDefine.g:842:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalDefine.g:842:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalDefine.g:843:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalDefine.g:849:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:855:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalDefine.g:856:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalDefine.g:856:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalDefine.g:857:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:865:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDefine.g:866:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalDefine.g:866:4: ()
            	    // InternalDefine.g:867:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDefine.g:877:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalDefine.g:878:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalDefine.g:878:5: (lv_right_3_0= ruleEquality )
            	    // InternalDefine.g:879:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.define.Define.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDefine.g:901:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalDefine.g:901:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalDefine.g:902:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalDefine.g:908:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:914:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalDefine.g:915:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalDefine.g:915:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalDefine.g:916:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:924:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=32 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDefine.g:925:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalDefine.g:925:4: ()
            	    // InternalDefine.g:926:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDefine.g:932:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalDefine.g:933:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalDefine.g:933:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalDefine.g:934:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalDefine.g:934:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==32) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==33) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalDefine.g:935:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:946:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_12); 

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

            	    // InternalDefine.g:959:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalDefine.g:960:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalDefine.g:960:5: (lv_right_3_0= ruleComparison )
            	    // InternalDefine.g:961:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.define.Define.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDefine.g:983:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalDefine.g:983:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalDefine.g:984:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalDefine.g:990:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalDefine.g:996:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalDefine.g:997:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalDefine.g:997:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalDefine.g:998:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:1006:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=37)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDefine.g:1007:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalDefine.g:1007:4: ()
            	    // InternalDefine.g:1008:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDefine.g:1014:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalDefine.g:1015:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalDefine.g:1015:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalDefine.g:1016:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalDefine.g:1016:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalDefine.g:1017:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:1028:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDefine.g:1039:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDefine.g:1050:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_12); 

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

            	    // InternalDefine.g:1063:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalDefine.g:1064:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalDefine.g:1064:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalDefine.g:1065:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.define.Define.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDefine.g:1087:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalDefine.g:1087:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalDefine.g:1088:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalDefine.g:1094:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:1100:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalDefine.g:1101:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalDefine.g:1101:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalDefine.g:1102:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:1110:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=38 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDefine.g:1111:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalDefine.g:1111:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==38) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==39) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalDefine.g:1112:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDefine.g:1112:5: ( () otherlv_2= '+' )
            	            // InternalDefine.g:1113:6: () otherlv_2= '+'
            	            {
            	            // InternalDefine.g:1113:6: ()
            	            // InternalDefine.g:1114:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,38,FOLLOW_12); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:1126:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDefine.g:1126:5: ( () otherlv_4= '-' )
            	            // InternalDefine.g:1127:6: () otherlv_4= '-'
            	            {
            	            // InternalDefine.g:1127:6: ()
            	            // InternalDefine.g:1128:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,39,FOLLOW_12); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDefine.g:1140:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalDefine.g:1141:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalDefine.g:1141:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalDefine.g:1142:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.example.define.Define.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDefine.g:1164:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalDefine.g:1164:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalDefine.g:1165:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalDefine.g:1171:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:1177:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalDefine.g:1178:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalDefine.g:1178:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalDefine.g:1179:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:1187:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDefine.g:1188:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalDefine.g:1188:4: ()
            	    // InternalDefine.g:1189:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDefine.g:1195:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalDefine.g:1196:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalDefine.g:1196:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalDefine.g:1197:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalDefine.g:1197:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==40) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==41) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalDefine.g:1198:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:1209:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_12); 

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

            	    // InternalDefine.g:1222:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalDefine.g:1223:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalDefine.g:1223:5: (lv_right_3_0= rulePrimary )
            	    // InternalDefine.g:1224:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.example.define.Define.Primary");
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalDefine.g:1246:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDefine.g:1246:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDefine.g:1247:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDefine.g:1253:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalDefine.g:1259:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalDefine.g:1260:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalDefine.g:1260:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 43:
            case 44:
            case 45:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDefine.g:1261:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDefine.g:1261:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDefine.g:1262:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:1280:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalDefine.g:1280:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalDefine.g:1281:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalDefine.g:1281:4: ()
                    // InternalDefine.g:1282:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalDefine.g:1292:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalDefine.g:1293:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalDefine.g:1293:5: (lv_expression_5_0= rulePrimary )
                    // InternalDefine.g:1294:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.example.define.Define.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:1313:3: this_Atomic_6= ruleAtomic
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
    // InternalDefine.g:1325:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalDefine.g:1325:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalDefine.g:1326:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalDefine.g:1332:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        EObject this_FloatConstant_8 = null;



        	enterRule();

        try {
            // InternalDefine.g:1338:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant ) )
            // InternalDefine.g:1339:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant )
            {
            // InternalDefine.g:1339:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=21 && LA23_1<=22)||LA23_1==25||(LA23_1>=30 && LA23_1<=41)) ) {
                    alt23=1;
                }
                else if ( (LA23_1==45) ) {
                    alt23=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case 43:
            case 44:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
                {
                alt23=4;
                }
                break;
            case 45:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDefine.g:1340:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDefine.g:1340:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDefine.g:1341:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDefine.g:1341:4: ()
                    // InternalDefine.g:1342:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1348:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDefine.g:1349:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDefine.g:1349:5: (lv_value_1_0= RULE_INT )
                    // InternalDefine.g:1350:6: lv_value_1_0= RULE_INT
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
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:1368:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalDefine.g:1368:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalDefine.g:1369:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDefine.g:1369:4: ()
                    // InternalDefine.g:1370:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1376:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDefine.g:1377:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDefine.g:1377:5: (lv_value_3_0= RULE_STRING )
                    // InternalDefine.g:1378:6: lv_value_3_0= RULE_STRING
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
                    // InternalDefine.g:1396:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalDefine.g:1396:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalDefine.g:1397:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalDefine.g:1397:4: ()
                    // InternalDefine.g:1398:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1404:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalDefine.g:1405:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalDefine.g:1405:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalDefine.g:1406:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalDefine.g:1406:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==43) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==44) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalDefine.g:1407:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,43,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDefine.g:1418:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,44,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
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
                    // InternalDefine.g:1433:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDefine.g:1433:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalDefine.g:1434:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalDefine.g:1434:4: ()
                    // InternalDefine.g:1435:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1441:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDefine.g:1442:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDefine.g:1442:5: (otherlv_7= RULE_ID )
                    // InternalDefine.g:1443:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDefine.g:1456:3: this_FloatConstant_8= ruleFloatConstant
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getFloatConstantParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatConstant_8=ruleFloatConstant();

                    state._fsp--;


                    			current = this_FloatConstant_8;
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleFloatConstant"
    // InternalDefine.g:1468:1: entryRuleFloatConstant returns [EObject current=null] : iv_ruleFloatConstant= ruleFloatConstant EOF ;
    public final EObject entryRuleFloatConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatConstant = null;


        try {
            // InternalDefine.g:1468:54: (iv_ruleFloatConstant= ruleFloatConstant EOF )
            // InternalDefine.g:1469:2: iv_ruleFloatConstant= ruleFloatConstant EOF
            {
             newCompositeNode(grammarAccess.getFloatConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatConstant=ruleFloatConstant();

            state._fsp--;

             current =iv_ruleFloatConstant; 
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
    // $ANTLR end "entryRuleFloatConstant"


    // $ANTLR start "ruleFloatConstant"
    // InternalDefine.g:1475:1: ruleFloatConstant returns [EObject current=null] : ( () ( ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) | ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) ) | ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? ) ) ) ;
    public final EObject ruleFloatConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_valueOfDecimal_3_0=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token lv_valueOfDecimal_6_0=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token lv_valueOfDecimal_9_0=null;


        	enterRule();

        try {
            // InternalDefine.g:1481:2: ( ( () ( ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) | ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) ) | ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? ) ) ) )
            // InternalDefine.g:1482:2: ( () ( ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) | ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) ) | ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? ) ) )
            {
            // InternalDefine.g:1482:2: ( () ( ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) | ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) ) | ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? ) ) )
            // InternalDefine.g:1483:3: () ( ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) | ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) ) | ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? ) )
            {
            // InternalDefine.g:1483:3: ()
            // InternalDefine.g:1484:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatConstantAccess().getEFloatAction_0(),
            					current);
            			

            }

            // InternalDefine.g:1490:3: ( ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) | ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) ) | ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==45) ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3==RULE_INT) ) {
                        alt26=1;
                    }
                    else if ( (LA26_3==EOF||(LA26_3>=21 && LA26_3<=22)||LA26_3==25||(LA26_3>=30 && LA26_3<=41)) ) {
                        alt26=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0==45) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDefine.g:1491:4: ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) )
                    {
                    // InternalDefine.g:1491:4: ( ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) )
                    // InternalDefine.g:1492:5: ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) )
                    {
                    // InternalDefine.g:1492:5: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDefine.g:1493:6: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDefine.g:1493:6: (lv_value_1_0= RULE_INT )
                    // InternalDefine.g:1494:7: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    							newLeafNode(lv_value_1_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFloatConstantRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_1_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,45,FOLLOW_25); 

                    					newLeafNode(otherlv_2, grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_0_1());
                    				
                    // InternalDefine.g:1514:5: ( (lv_valueOfDecimal_3_0= RULE_INT ) )
                    // InternalDefine.g:1515:6: (lv_valueOfDecimal_3_0= RULE_INT )
                    {
                    // InternalDefine.g:1515:6: (lv_valueOfDecimal_3_0= RULE_INT )
                    // InternalDefine.g:1516:7: lv_valueOfDecimal_3_0= RULE_INT
                    {
                    lv_valueOfDecimal_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_valueOfDecimal_3_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFloatConstantRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"valueOfDecimal",
                    								lv_valueOfDecimal_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:1534:4: ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) )
                    {
                    // InternalDefine.g:1534:4: ( ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) ) )
                    // InternalDefine.g:1535:5: ( (lv_value_4_0= RULE_INT ) )? otherlv_5= '.' ( (lv_valueOfDecimal_6_0= RULE_INT ) )
                    {
                    // InternalDefine.g:1535:5: ( (lv_value_4_0= RULE_INT ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_INT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalDefine.g:1536:6: (lv_value_4_0= RULE_INT )
                            {
                            // InternalDefine.g:1536:6: (lv_value_4_0= RULE_INT )
                            // InternalDefine.g:1537:7: lv_value_4_0= RULE_INT
                            {
                            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                            							newLeafNode(lv_value_4_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFloatConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_4_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_25); 

                    					newLeafNode(otherlv_5, grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_1_1());
                    				
                    // InternalDefine.g:1557:5: ( (lv_valueOfDecimal_6_0= RULE_INT ) )
                    // InternalDefine.g:1558:6: (lv_valueOfDecimal_6_0= RULE_INT )
                    {
                    // InternalDefine.g:1558:6: (lv_valueOfDecimal_6_0= RULE_INT )
                    // InternalDefine.g:1559:7: lv_valueOfDecimal_6_0= RULE_INT
                    {
                    lv_valueOfDecimal_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_valueOfDecimal_6_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFloatConstantRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"valueOfDecimal",
                    								lv_valueOfDecimal_6_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:1577:4: ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? )
                    {
                    // InternalDefine.g:1577:4: ( ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )? )
                    // InternalDefine.g:1578:5: ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' ( (lv_valueOfDecimal_9_0= RULE_INT ) )?
                    {
                    // InternalDefine.g:1578:5: ( (lv_value_7_0= RULE_INT ) )
                    // InternalDefine.g:1579:6: (lv_value_7_0= RULE_INT )
                    {
                    // InternalDefine.g:1579:6: (lv_value_7_0= RULE_INT )
                    // InternalDefine.g:1580:7: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    							newLeafNode(lv_value_7_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFloatConstantRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_7_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,45,FOLLOW_26); 

                    					newLeafNode(otherlv_8, grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_2_1());
                    				
                    // InternalDefine.g:1600:5: ( (lv_valueOfDecimal_9_0= RULE_INT ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_INT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalDefine.g:1601:6: (lv_valueOfDecimal_9_0= RULE_INT )
                            {
                            // InternalDefine.g:1601:6: (lv_valueOfDecimal_9_0= RULE_INT )
                            // InternalDefine.g:1602:7: lv_valueOfDecimal_9_0= RULE_INT
                            {
                            lv_valueOfDecimal_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_valueOfDecimal_9_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFloatConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"valueOfDecimal",
                            								lv_valueOfDecimal_9_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }
                            break;

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
    // $ANTLR end "ruleFloatConstant"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003C890000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00003C0001000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003C882000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000022L});

}
