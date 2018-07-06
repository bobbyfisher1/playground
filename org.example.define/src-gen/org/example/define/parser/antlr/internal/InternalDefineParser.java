package org.example.define.parser.antlr.internal;

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
import org.example.define.services.DefineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDefineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'{'", "'}'", "'input'", "'['", "']'", "'output'", "'inout'", "'variant'", "'='", "'+/-'", "';'", "','", "'udt'", "'('", "')'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'", "'.'", "'null'", "'int'", "'bool'", "'float'", "'string'"
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
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalDefine.g:65:1: entryRuleDefineBlock returns [EObject current=null] : iv_ruleDefineBlock= ruleDefineBlock EOF ;
    public final EObject entryRuleDefineBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineBlock = null;


        try {
            // InternalDefine.g:65:52: (iv_ruleDefineBlock= ruleDefineBlock EOF )
            // InternalDefine.g:66:2: iv_ruleDefineBlock= ruleDefineBlock EOF
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
    // InternalDefine.g:72:1: ruleDefineBlock returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleDefineBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:78:2: ( (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' ) )
            // InternalDefine.g:79:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' )
            {
            // InternalDefine.g:79:2: (otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}' )
            // InternalDefine.g:80:3: otherlv_0= 'define' otherlv_1= '{' ( (lv_direction_2_0= ruleDirectionBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineBlockAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefine.g:88:3: ( (lv_direction_2_0= ruleDirectionBlock ) )
            // InternalDefine.g:89:4: (lv_direction_2_0= ruleDirectionBlock )
            {
            // InternalDefine.g:89:4: (lv_direction_2_0= ruleDirectionBlock )
            // InternalDefine.g:90:5: lv_direction_2_0= ruleDirectionBlock
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
    // InternalDefine.g:115:1: entryRuleDirectionBlock returns [EObject current=null] : iv_ruleDirectionBlock= ruleDirectionBlock EOF ;
    public final EObject entryRuleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionBlock = null;


        try {
            // InternalDefine.g:115:55: (iv_ruleDirectionBlock= ruleDirectionBlock EOF )
            // InternalDefine.g:116:2: iv_ruleDirectionBlock= ruleDirectionBlock EOF
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
    // InternalDefine.g:122:1: ruleDirectionBlock returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDirectionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_input_1_0 = null;

        EObject lv_inout_2_0 = null;

        EObject lv_output_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:128:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDefine.g:129:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDefine.g:129:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) ) )
            // InternalDefine.g:130:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            {
            // InternalDefine.g:130:3: ( ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?) )
            // InternalDefine.g:131:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
            			
            // InternalDefine.g:134:4: ( ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?)
            // InternalDefine.g:135:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+ {...}?
            {
            // InternalDefine.g:135:5: ( ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) ) )+
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
            	    // InternalDefine.g:136:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    {
            	    // InternalDefine.g:136:3: ({...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) ) )
            	    // InternalDefine.g:137:4: {...}? => ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDefine.g:137:108: ( ({...}? => ( (lv_input_1_0= ruleInput ) ) ) )
            	    // InternalDefine.g:138:5: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDefine.g:141:8: ({...}? => ( (lv_input_1_0= ruleInput ) ) )
            	    // InternalDefine.g:141:9: {...}? => ( (lv_input_1_0= ruleInput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalDefine.g:141:18: ( (lv_input_1_0= ruleInput ) )
            	    // InternalDefine.g:141:19: (lv_input_1_0= ruleInput )
            	    {
            	    // InternalDefine.g:141:19: (lv_input_1_0= ruleInput )
            	    // InternalDefine.g:142:9: lv_input_1_0= ruleInput
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
            	    // InternalDefine.g:164:3: ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) )
            	    {
            	    // InternalDefine.g:164:3: ({...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) ) )
            	    // InternalDefine.g:165:4: {...}? => ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDefine.g:165:108: ( ({...}? => ( (lv_inout_2_0= ruleInout ) ) ) )
            	    // InternalDefine.g:166:5: ({...}? => ( (lv_inout_2_0= ruleInout ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDefine.g:169:8: ({...}? => ( (lv_inout_2_0= ruleInout ) ) )
            	    // InternalDefine.g:169:9: {...}? => ( (lv_inout_2_0= ruleInout ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalDefine.g:169:18: ( (lv_inout_2_0= ruleInout ) )
            	    // InternalDefine.g:169:19: (lv_inout_2_0= ruleInout )
            	    {
            	    // InternalDefine.g:169:19: (lv_inout_2_0= ruleInout )
            	    // InternalDefine.g:170:9: lv_inout_2_0= ruleInout
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
            	    // InternalDefine.g:192:3: ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) )
            	    {
            	    // InternalDefine.g:192:3: ({...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) ) )
            	    // InternalDefine.g:193:4: {...}? => ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDefine.g:193:108: ( ({...}? => ( (lv_output_3_0= ruleOutput ) ) ) )
            	    // InternalDefine.g:194:5: ({...}? => ( (lv_output_3_0= ruleOutput ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDefine.g:197:8: ({...}? => ( (lv_output_3_0= ruleOutput ) ) )
            	    // InternalDefine.g:197:9: {...}? => ( (lv_output_3_0= ruleOutput ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDirectionBlock", "true");
            	    }
            	    // InternalDefine.g:197:18: ( (lv_output_3_0= ruleOutput ) )
            	    // InternalDefine.g:197:19: (lv_output_3_0= ruleOutput )
            	    {
            	    // InternalDefine.g:197:19: (lv_output_3_0= ruleOutput )
            	    // InternalDefine.g:198:9: lv_output_3_0= ruleOutput
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
    // InternalDefine.g:231:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalDefine.g:231:46: (iv_ruleInput= ruleInput EOF )
            // InternalDefine.g:232:2: iv_ruleInput= ruleInput EOF
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
    // InternalDefine.g:238:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:244:2: ( (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:245:2: (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:245:2: (otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:246:3: otherlv_0= 'input' () otherlv_2= '[' ( (lv_inputVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalDefine.g:250:3: ()
            // InternalDefine.g:251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:261:3: ( (lv_inputVariables_3_0= ruleVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==19||LA2_0==24||(LA2_0>=43 && LA2_0<=47)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDefine.g:262:4: (lv_inputVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:262:4: (lv_inputVariables_3_0= ruleVariable )
            	    // InternalDefine.g:263:5: lv_inputVariables_3_0= ruleVariable
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
    // InternalDefine.g:288:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalDefine.g:288:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalDefine.g:289:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalDefine.g:295:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_outputVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:301:2: ( (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:302:2: (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:302:2: (otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:303:3: otherlv_0= 'output' () otherlv_2= '[' ( (lv_outputVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalDefine.g:307:3: ()
            // InternalDefine.g:308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:318:3: ( (lv_outputVariables_3_0= ruleVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==19||LA3_0==24||(LA3_0>=43 && LA3_0<=47)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDefine.g:319:4: (lv_outputVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:319:4: (lv_outputVariables_3_0= ruleVariable )
            	    // InternalDefine.g:320:5: lv_outputVariables_3_0= ruleVariable
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
    // InternalDefine.g:345:1: entryRuleInout returns [EObject current=null] : iv_ruleInout= ruleInout EOF ;
    public final EObject entryRuleInout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInout = null;


        try {
            // InternalDefine.g:345:46: (iv_ruleInout= ruleInout EOF )
            // InternalDefine.g:346:2: iv_ruleInout= ruleInout EOF
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
    // InternalDefine.g:352:1: ruleInout returns [EObject current=null] : (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) ;
    public final EObject ruleInout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inoutVariables_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:358:2: ( (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' ) )
            // InternalDefine.g:359:2: (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            {
            // InternalDefine.g:359:2: (otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']' )
            // InternalDefine.g:360:3: otherlv_0= 'inout' () otherlv_2= '[' ( (lv_inoutVariables_3_0= ruleVariable ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInoutAccess().getInoutKeyword_0());
            		
            // InternalDefine.g:364:3: ()
            // InternalDefine.g:365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInoutAccess().getInoutAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDefine.g:375:3: ( (lv_inoutVariables_3_0= ruleVariable ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==19||LA4_0==24||(LA4_0>=43 && LA4_0<=47)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDefine.g:376:4: (lv_inoutVariables_3_0= ruleVariable )
            	    {
            	    // InternalDefine.g:376:4: (lv_inoutVariables_3_0= ruleVariable )
            	    // InternalDefine.g:377:5: lv_inoutVariables_3_0= ruleVariable
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
    // InternalDefine.g:402:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDefine.g:402:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDefine.g:403:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDefine.g:409:1: ruleVariable returns [EObject current=null] : ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) | ( (lv_udt_10_0= ruleUdt ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_variantKeyword_1_0=null;
        Token lv_variableName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_nextVariable_9_0=null;
        Enumerator lv_variableType_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_range_7_0 = null;

        EObject lv_udt_10_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:415:2: ( ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) | ( (lv_udt_10_0= ruleUdt ) ) ) )
            // InternalDefine.g:416:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) | ( (lv_udt_10_0= ruleUdt ) ) )
            {
            // InternalDefine.g:416:2: ( ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) ) | ( (lv_udt_10_0= ruleUdt ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==19||(LA10_0>=43 && LA10_0<=47)) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDefine.g:417:3: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
                    {
                    // InternalDefine.g:417:3: ( () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) ) )
                    // InternalDefine.g:418:4: () ( (lv_variantKeyword_1_0= 'variant' ) )? ( (lv_variableType_2_0= ruleBasicType ) )? ( (lv_variableName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )? (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
                    {
                    // InternalDefine.g:418:4: ()
                    // InternalDefine.g:419:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVariableAccess().getVariableAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:425:4: ( (lv_variantKeyword_1_0= 'variant' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDefine.g:426:5: (lv_variantKeyword_1_0= 'variant' )
                            {
                            // InternalDefine.g:426:5: (lv_variantKeyword_1_0= 'variant' )
                            // InternalDefine.g:427:6: lv_variantKeyword_1_0= 'variant'
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

                    // InternalDefine.g:439:4: ( (lv_variableType_2_0= ruleBasicType ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=43 && LA6_0<=47)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDefine.g:440:5: (lv_variableType_2_0= ruleBasicType )
                            {
                            // InternalDefine.g:440:5: (lv_variableType_2_0= ruleBasicType )
                            // InternalDefine.g:441:6: lv_variableType_2_0= ruleBasicType
                            {

                            						newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeBasicTypeEnumRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_variableType_2_0=ruleBasicType();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getVariableRule());
                            						}
                            						set(
                            							current,
                            							"variableType",
                            							lv_variableType_2_0,
                            							"org.example.define.Define.BasicType");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalDefine.g:458:4: ( (lv_variableName_3_0= RULE_ID ) )
                    // InternalDefine.g:459:5: (lv_variableName_3_0= RULE_ID )
                    {
                    // InternalDefine.g:459:5: (lv_variableName_3_0= RULE_ID )
                    // InternalDefine.g:460:6: lv_variableName_3_0= RULE_ID
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

                    // InternalDefine.g:476:4: (otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )? )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDefine.g:477:5: otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )?
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_0_4_0());
                            				
                            // InternalDefine.g:481:5: ( (lv_expression_5_0= ruleExpression ) )
                            // InternalDefine.g:482:6: (lv_expression_5_0= ruleExpression )
                            {
                            // InternalDefine.g:482:6: (lv_expression_5_0= ruleExpression )
                            // InternalDefine.g:483:7: lv_expression_5_0= ruleExpression
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

                            // InternalDefine.g:500:5: (otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) ) )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==21) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalDefine.g:501:6: otherlv_6= '+/-' ( (lv_range_7_0= ruleExpression ) )
                                    {
                                    otherlv_6=(Token)match(input,21,FOLLOW_12); 

                                    						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_0_4_2_0());
                                    					
                                    // InternalDefine.g:505:6: ( (lv_range_7_0= ruleExpression ) )
                                    // InternalDefine.g:506:7: (lv_range_7_0= ruleExpression )
                                    {
                                    // InternalDefine.g:506:7: (lv_range_7_0= ruleExpression )
                                    // InternalDefine.g:507:8: lv_range_7_0= ruleExpression
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

                    // InternalDefine.g:526:4: (otherlv_8= ';' | ( (lv_nextVariable_9_0= ',' ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==23) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDefine.g:527:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,22,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getSemicolonKeyword_0_5_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDefine.g:532:5: ( (lv_nextVariable_9_0= ',' ) )
                            {
                            // InternalDefine.g:532:5: ( (lv_nextVariable_9_0= ',' ) )
                            // InternalDefine.g:533:6: (lv_nextVariable_9_0= ',' )
                            {
                            // InternalDefine.g:533:6: (lv_nextVariable_9_0= ',' )
                            // InternalDefine.g:534:7: lv_nextVariable_9_0= ','
                            {
                            lv_nextVariable_9_0=(Token)match(input,23,FOLLOW_2); 

                            							newLeafNode(lv_nextVariable_9_0, grammarAccess.getVariableAccess().getNextVariableCommaKeyword_0_5_1_0());
                            						

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
                    break;
                case 2 :
                    // InternalDefine.g:549:3: ( (lv_udt_10_0= ruleUdt ) )
                    {
                    // InternalDefine.g:549:3: ( (lv_udt_10_0= ruleUdt ) )
                    // InternalDefine.g:550:4: (lv_udt_10_0= ruleUdt )
                    {
                    // InternalDefine.g:550:4: (lv_udt_10_0= ruleUdt )
                    // InternalDefine.g:551:5: lv_udt_10_0= ruleUdt
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_udt_10_0=ruleUdt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"udt",
                    						lv_udt_10_0,
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
    // InternalDefine.g:572:1: entryRuleUdt returns [EObject current=null] : iv_ruleUdt= ruleUdt EOF ;
    public final EObject entryRuleUdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdt = null;


        try {
            // InternalDefine.g:572:44: (iv_ruleUdt= ruleUdt EOF )
            // InternalDefine.g:573:2: iv_ruleUdt= ruleUdt EOF
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
    // InternalDefine.g:579:1: ruleUdt returns [EObject current=null] : (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' ) ;
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
            // InternalDefine.g:585:2: ( (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' ) )
            // InternalDefine.g:586:2: (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' )
            {
            // InternalDefine.g:586:2: (otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}' )
            // InternalDefine.g:587:3: otherlv_0= 'udt' ( (lv_udtName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_udtTypes_3_0= ruleUdtType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_udtVariables_6_0= ruleVariable ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
            		
            // InternalDefine.g:591:3: ( (lv_udtName_1_0= RULE_ID ) )
            // InternalDefine.g:592:4: (lv_udtName_1_0= RULE_ID )
            {
            // InternalDefine.g:592:4: (lv_udtName_1_0= RULE_ID )
            // InternalDefine.g:593:5: lv_udtName_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDefine.g:613:3: ( (lv_udtTypes_3_0= ruleUdtType ) )
            // InternalDefine.g:614:4: (lv_udtTypes_3_0= ruleUdtType )
            {
            // InternalDefine.g:614:4: (lv_udtTypes_3_0= ruleUdtType )
            // InternalDefine.g:615:5: lv_udtTypes_3_0= ruleUdtType
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

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getUdtAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDefine.g:640:3: ( (lv_udtVariables_6_0= ruleVariable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==19||LA11_0==24||(LA11_0>=43 && LA11_0<=47)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDefine.g:641:4: (lv_udtVariables_6_0= ruleVariable )
            	    {
            	    // InternalDefine.g:641:4: (lv_udtVariables_6_0= ruleVariable )
            	    // InternalDefine.g:642:5: lv_udtVariables_6_0= ruleVariable
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
            	    break loop11;
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
    // InternalDefine.g:667:1: entryRuleUdtType returns [EObject current=null] : iv_ruleUdtType= ruleUdtType EOF ;
    public final EObject entryRuleUdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUdtType = null;


        try {
            // InternalDefine.g:667:48: (iv_ruleUdtType= ruleUdtType EOF )
            // InternalDefine.g:668:2: iv_ruleUdtType= ruleUdtType EOF
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
    // InternalDefine.g:674:1: ruleUdtType returns [EObject current=null] : ( (lv_udtTypeName_0_0= RULE_ID ) ) ;
    public final EObject ruleUdtType() throws RecognitionException {
        EObject current = null;

        Token lv_udtTypeName_0_0=null;


        	enterRule();

        try {
            // InternalDefine.g:680:2: ( ( (lv_udtTypeName_0_0= RULE_ID ) ) )
            // InternalDefine.g:681:2: ( (lv_udtTypeName_0_0= RULE_ID ) )
            {
            // InternalDefine.g:681:2: ( (lv_udtTypeName_0_0= RULE_ID ) )
            // InternalDefine.g:682:3: (lv_udtTypeName_0_0= RULE_ID )
            {
            // InternalDefine.g:682:3: (lv_udtTypeName_0_0= RULE_ID )
            // InternalDefine.g:683:4: lv_udtTypeName_0_0= RULE_ID
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


    // $ANTLR start "entryRuleExpression"
    // InternalDefine.g:702:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDefine.g:702:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDefine.g:703:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDefine.g:709:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:715:2: (this_Or_0= ruleOr )
            // InternalDefine.g:716:2: this_Or_0= ruleOr
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
    // InternalDefine.g:727:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalDefine.g:727:43: (iv_ruleOr= ruleOr EOF )
            // InternalDefine.g:728:2: iv_ruleOr= ruleOr EOF
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
    // InternalDefine.g:734:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:740:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalDefine.g:741:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalDefine.g:741:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalDefine.g:742:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:750:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDefine.g:751:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalDefine.g:751:4: ()
            	    // InternalDefine.g:752:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalDefine.g:762:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalDefine.g:763:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalDefine.g:763:5: (lv_right_3_0= ruleAnd )
            	    // InternalDefine.g:764:6: lv_right_3_0= ruleAnd
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalDefine.g:786:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalDefine.g:786:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalDefine.g:787:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalDefine.g:793:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:799:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalDefine.g:800:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalDefine.g:800:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalDefine.g:801:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:809:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDefine.g:810:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalDefine.g:810:4: ()
            	    // InternalDefine.g:811:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalDefine.g:821:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalDefine.g:822:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalDefine.g:822:5: (lv_right_3_0= ruleEquality )
            	    // InternalDefine.g:823:6: lv_right_3_0= ruleEquality
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
            	    break loop13;
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
    // InternalDefine.g:845:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalDefine.g:845:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalDefine.g:846:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalDefine.g:852:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:858:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalDefine.g:859:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalDefine.g:859:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalDefine.g:860:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:868:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDefine.g:869:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalDefine.g:869:4: ()
            	    // InternalDefine.g:870:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDefine.g:876:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalDefine.g:877:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalDefine.g:877:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalDefine.g:878:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalDefine.g:878:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==29) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==30) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalDefine.g:879:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:890:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,30,FOLLOW_12); 

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

            	    // InternalDefine.g:903:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalDefine.g:904:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalDefine.g:904:5: (lv_right_3_0= ruleComparison )
            	    // InternalDefine.g:905:6: lv_right_3_0= ruleComparison
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
            	    break loop15;
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
    // InternalDefine.g:927:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalDefine.g:927:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalDefine.g:928:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalDefine.g:934:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalDefine.g:940:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalDefine.g:941:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalDefine.g:941:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalDefine.g:942:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:950:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=31 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDefine.g:951:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalDefine.g:951:4: ()
            	    // InternalDefine.g:952:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDefine.g:958:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalDefine.g:959:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalDefine.g:959:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalDefine.g:960:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalDefine.g:960:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 34:
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
            	            // InternalDefine.g:961:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:972:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDefine.g:983:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDefine.g:994:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_12); 

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

            	    // InternalDefine.g:1007:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalDefine.g:1008:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalDefine.g:1008:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalDefine.g:1009:6: lv_right_3_0= rulePlusOrMinus
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
            	    break loop17;
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
    // InternalDefine.g:1031:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalDefine.g:1031:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalDefine.g:1032:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalDefine.g:1038:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:1044:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalDefine.g:1045:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalDefine.g:1045:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalDefine.g:1046:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:1054:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=35 && LA19_0<=36)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDefine.g:1055:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalDefine.g:1055:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==35) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==36) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalDefine.g:1056:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDefine.g:1056:5: ( () otherlv_2= '+' )
            	            // InternalDefine.g:1057:6: () otherlv_2= '+'
            	            {
            	            // InternalDefine.g:1057:6: ()
            	            // InternalDefine.g:1058:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,35,FOLLOW_12); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:1070:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDefine.g:1070:5: ( () otherlv_4= '-' )
            	            // InternalDefine.g:1071:6: () otherlv_4= '-'
            	            {
            	            // InternalDefine.g:1071:6: ()
            	            // InternalDefine.g:1072:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,36,FOLLOW_12); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDefine.g:1084:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalDefine.g:1085:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalDefine.g:1085:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalDefine.g:1086:6: lv_right_5_0= ruleMulOrDiv
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalDefine.g:1108:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalDefine.g:1108:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalDefine.g:1109:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalDefine.g:1115:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDefine.g:1121:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalDefine.g:1122:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalDefine.g:1122:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalDefine.g:1123:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDefine.g:1131:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDefine.g:1132:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalDefine.g:1132:4: ()
            	    // InternalDefine.g:1133:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDefine.g:1139:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalDefine.g:1140:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalDefine.g:1140:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalDefine.g:1141:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalDefine.g:1141:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==37) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==38) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalDefine.g:1142:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_12); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefine.g:1153:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_12); 

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

            	    // InternalDefine.g:1166:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalDefine.g:1167:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalDefine.g:1167:5: (lv_right_3_0= rulePrimary )
            	    // InternalDefine.g:1168:6: lv_right_3_0= rulePrimary
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalDefine.g:1190:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDefine.g:1190:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDefine.g:1191:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDefine.g:1197:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalDefine.g:1203:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalDefine.g:1204:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalDefine.g:1204:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 40:
            case 41:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDefine.g:1205:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDefine.g:1205:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDefine.g:1206:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:1224:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalDefine.g:1224:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalDefine.g:1225:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalDefine.g:1225:4: ()
                    // InternalDefine.g:1226:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalDefine.g:1236:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalDefine.g:1237:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalDefine.g:1237:5: (lv_expression_5_0= rulePrimary )
                    // InternalDefine.g:1238:6: lv_expression_5_0= rulePrimary
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
                    // InternalDefine.g:1257:3: this_Atomic_6= ruleAtomic
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
    // InternalDefine.g:1269:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalDefine.g:1269:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalDefine.g:1270:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalDefine.g:1276:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant ) ;
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
            // InternalDefine.g:1282:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant ) )
            // InternalDefine.g:1283:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant )
            {
            // InternalDefine.g:1283:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | this_FloatConstant_8= ruleFloatConstant )
            int alt24=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==42) ) {
                    alt24=5;
                }
                else if ( (LA24_1==EOF||(LA24_1>=21 && LA24_1<=23)||(LA24_1>=26 && LA24_1<=38)) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt24=2;
                }
                break;
            case 40:
            case 41:
                {
                alt24=3;
                }
                break;
            case RULE_ID:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDefine.g:1284:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDefine.g:1284:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDefine.g:1285:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDefine.g:1285:4: ()
                    // InternalDefine.g:1286:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1292:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDefine.g:1293:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDefine.g:1293:5: (lv_value_1_0= RULE_INT )
                    // InternalDefine.g:1294:6: lv_value_1_0= RULE_INT
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
                    // InternalDefine.g:1312:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalDefine.g:1312:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalDefine.g:1313:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDefine.g:1313:4: ()
                    // InternalDefine.g:1314:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1320:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDefine.g:1321:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDefine.g:1321:5: (lv_value_3_0= RULE_STRING )
                    // InternalDefine.g:1322:6: lv_value_3_0= RULE_STRING
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
                    // InternalDefine.g:1340:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalDefine.g:1340:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalDefine.g:1341:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalDefine.g:1341:4: ()
                    // InternalDefine.g:1342:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1348:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalDefine.g:1349:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalDefine.g:1349:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalDefine.g:1350:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalDefine.g:1350:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==40) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==41) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalDefine.g:1351:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,40,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDefine.g:1362:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,41,FOLLOW_2); 

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
                    // InternalDefine.g:1377:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalDefine.g:1377:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalDefine.g:1378:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalDefine.g:1378:4: ()
                    // InternalDefine.g:1379:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDefine.g:1385:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDefine.g:1386:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDefine.g:1386:5: (otherlv_7= RULE_ID )
                    // InternalDefine.g:1387:6: otherlv_7= RULE_ID
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
                    // InternalDefine.g:1400:3: this_FloatConstant_8= ruleFloatConstant
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
    // InternalDefine.g:1412:1: entryRuleFloatConstant returns [EObject current=null] : iv_ruleFloatConstant= ruleFloatConstant EOF ;
    public final EObject entryRuleFloatConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatConstant = null;


        try {
            // InternalDefine.g:1412:54: (iv_ruleFloatConstant= ruleFloatConstant EOF )
            // InternalDefine.g:1413:2: iv_ruleFloatConstant= ruleFloatConstant EOF
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
    // InternalDefine.g:1419:1: ruleFloatConstant returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_valueOfDecimal_3_0=null;


        	enterRule();

        try {
            // InternalDefine.g:1425:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) ) )
            // InternalDefine.g:1426:2: ( () ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) )
            {
            // InternalDefine.g:1426:2: ( () ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) ) )
            // InternalDefine.g:1427:3: () ( (lv_value_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_valueOfDecimal_3_0= RULE_INT ) )
            {
            // InternalDefine.g:1427:3: ()
            // InternalDefine.g:1428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatConstantAccess().getEFloatAction_0(),
            					current);
            			

            }

            // InternalDefine.g:1434:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalDefine.g:1435:4: (lv_value_1_0= RULE_INT )
            {
            // InternalDefine.g:1435:4: (lv_value_1_0= RULE_INT )
            // InternalDefine.g:1436:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_value_1_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,42,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatConstantAccess().getFullStopKeyword_2());
            		
            // InternalDefine.g:1456:3: ( (lv_valueOfDecimal_3_0= RULE_INT ) )
            // InternalDefine.g:1457:4: (lv_valueOfDecimal_3_0= RULE_INT )
            {
            // InternalDefine.g:1457:4: (lv_valueOfDecimal_3_0= RULE_INT )
            // InternalDefine.g:1458:5: lv_valueOfDecimal_3_0= RULE_INT
            {
            lv_valueOfDecimal_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_valueOfDecimal_3_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_3_0());
            				

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


    // $ANTLR start "ruleBasicType"
    // InternalDefine.g:1478:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'string' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDefine.g:1484:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'string' ) ) )
            // InternalDefine.g:1485:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'string' ) )
            {
            // InternalDefine.g:1485:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'string' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 44:
                {
                alt25=2;
                }
                break;
            case 45:
                {
                alt25=3;
                }
                break;
            case 46:
                {
                alt25=4;
                }
                break;
            case 47:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDefine.g:1486:3: (enumLiteral_0= 'null' )
                    {
                    // InternalDefine.g:1486:3: (enumLiteral_0= 'null' )
                    // InternalDefine.g:1487:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getNULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefine.g:1494:3: (enumLiteral_1= 'int' )
                    {
                    // InternalDefine.g:1494:3: (enumLiteral_1= 'int' )
                    // InternalDefine.g:1495:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDefine.g:1502:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalDefine.g:1502:3: (enumLiteral_2= 'bool' )
                    // InternalDefine.g:1503:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDefine.g:1510:3: (enumLiteral_3= 'float' )
                    {
                    // InternalDefine.g:1510:3: (enumLiteral_3= 'float' )
                    // InternalDefine.g:1511:4: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getFLOATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getFLOATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDefine.g:1518:3: (enumLiteral_4= 'string' )
                    {
                    // InternalDefine.g:1518:3: (enumLiteral_4= 'string' )
                    // InternalDefine.g:1519:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getSTRINGTYPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getSTRINGTYPEnumLiteralDeclaration_4());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000F80001090010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000F80000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000038002000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000F80001082010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});

}
