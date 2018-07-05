/*
 * generated by Xtext 2.13.0
 */
grammar InternalDefine;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.example.define.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDefineBlock
entryRuleDefineBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefineBlockRule()); }
	iv_ruleDefineBlock=ruleDefineBlock
	{ $current=$iv_ruleDefineBlock.current; }
	EOF;

// Rule DefineBlock
ruleDefineBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='define'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefineBlockAccess().getDefineKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDefineBlockAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0());
				}
				lv_direction_2_0=ruleDirectionBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefineBlockRule());
					}
					set(
						$current,
						"direction",
						lv_direction_2_0,
						"org.example.define.Define.DirectionBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getDefineBlockAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleDirectionBlock
entryRuleDirectionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectionBlockRule()); }
	iv_ruleDirectionBlock=ruleDirectionBlock
	{ $current=$iv_ruleDirectionBlock.current; }
	EOF;

// Rule DirectionBlock
ruleDirectionBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 0);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInputInputParserRuleCall_0_0());
								}
								lv_input_1_0=ruleInput
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
									}
									set(
										$current,
										"input",
										lv_input_1_0,
										"org.example.define.Define.Input");
									afterParserOrEnumRuleCall();
								}
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 1);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getDirectionBlockAccess().getInoutInoutParserRuleCall_1_0());
								}
								lv_inout_2_0=ruleInout
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
									}
									set(
										$current,
										"inout",
										lv_inout_2_0,
										"org.example.define.Define.Inout");
									afterParserOrEnumRuleCall();
								}
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), 2);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getDirectionBlockAccess().getOutputOutputParserRuleCall_2_0());
								}
								lv_output_3_0=ruleOutput
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getDirectionBlockRule());
									}
									set(
										$current,
										"output",
										lv_output_3_0,
										"org.example.define.Define.Output");
									afterParserOrEnumRuleCall();
								}
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getDirectionBlockAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='input'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInputAccess().getInputAction_1(),
					$current);
			}
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInputAccess().getInputVariablesVariableParserRuleCall_3_0());
				}
				lv_inputVariables_3_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInputRule());
					}
					add(
						$current,
						"inputVariables",
						lv_inputVariables_3_0,
						"org.example.define.Define.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='output'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOutputAccess().getOutputAction_1(),
					$current);
			}
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOutputAccess().getOutputVariablesVariableParserRuleCall_3_0());
				}
				lv_outputVariables_3_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutputRule());
					}
					add(
						$current,
						"outputVariables",
						lv_outputVariables_3_0,
						"org.example.define.Define.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInout
entryRuleInout returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInoutRule()); }
	iv_ruleInout=ruleInout
	{ $current=$iv_ruleInout.current; }
	EOF;

// Rule Inout
ruleInout returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='inout'
		{
			newLeafNode(otherlv_0, grammarAccess.getInoutAccess().getInoutKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInoutAccess().getInoutAction_1(),
					$current);
			}
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInoutAccess().getInoutVariablesVariableParserRuleCall_3_0());
				}
				lv_inoutVariables_3_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInoutRule());
					}
					add(
						$current,
						"inoutVariables",
						lv_inoutVariables_3_0,
						"org.example.define.Define.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getInoutAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getVariableAccess().getVariableAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_variantKeyword_1_0='variant'
					{
						newLeafNode(lv_variantKeyword_1_0, grammarAccess.getVariableAccess().getVariantKeywordVariantKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVariableRule());
						}
						setWithLastConsumed($current, "variantKeyword", true, "variant");
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getVariableTypeTypesParserRuleCall_0_2_0());
					}
					lv_variableType_2_0=ruleTypes
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"variableType",
							lv_variableType_2_0,
							"org.example.define.Define.Types");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_variableName_3_0=RULE_ID
					{
						newLeafNode(lv_variableName_3_0, grammarAccess.getVariableAccess().getVariableNameIDTerminalRuleCall_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVariableRule());
						}
						setWithLastConsumed(
							$current,
							"variableName",
							lv_variableName_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				otherlv_4='='
				{
					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_0_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_0_4_1_0());
						}
						lv_expression_5_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVariableRule());
							}
							set(
								$current,
								"expression",
								lv_expression_5_0,
								"org.example.define.Define.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_6='+/-'
					{
						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getPlusSignSolidusHyphenMinusKeyword_0_4_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getVariableAccess().getRangeExpressionParserRuleCall_0_4_2_1_0());
							}
							lv_range_7_0=ruleExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getVariableRule());
								}
								set(
									$current,
									"range",
									lv_range_7_0,
									"org.example.define.Define.Expression");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
			)?
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getSemicolonKeyword_0_5());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getUdtUdtParserRuleCall_1_0());
				}
				lv_udt_9_0=ruleUdt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"udt",
						lv_udt_9_0,
						"org.example.define.Define.Udt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUdt
entryRuleUdt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUdtRule()); }
	iv_ruleUdt=ruleUdt
	{ $current=$iv_ruleUdt.current; }
	EOF;

// Rule Udt
ruleUdt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='udt'
		{
			newLeafNode(otherlv_0, grammarAccess.getUdtAccess().getUdtKeyword_0());
		}
		(
			(
				lv_udtName_1_0=RULE_ID
				{
					newLeafNode(lv_udtName_1_0, grammarAccess.getUdtAccess().getUdtNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUdtRule());
					}
					setWithLastConsumed(
						$current,
						"udtName",
						lv_udtName_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getUdtAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUdtAccess().getUdtTypesUdtTypeParserRuleCall_3_0());
				}
				lv_udtTypes_3_0=ruleUdtType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUdtRule());
					}
					set(
						$current,
						"udtTypes",
						lv_udtTypes_3_0,
						"org.example.define.Define.UdtType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getUdtAccess().getRightParenthesisKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getUdtAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUdtAccess().getUdtVariablesVariableParserRuleCall_6_0());
				}
				lv_udtVariables_6_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUdtRule());
					}
					add(
						$current,
						"udtVariables",
						lv_udtVariables_6_0,
						"org.example.define.Define.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getUdtAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleUdtType
entryRuleUdtType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUdtTypeRule()); }
	iv_ruleUdtType=ruleUdtType
	{ $current=$iv_ruleUdtType.current; }
	EOF;

// Rule UdtType
ruleUdtType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_udtTypeName_0_0=RULE_ID
			{
				newLeafNode(lv_udtTypeName_0_0, grammarAccess.getUdtTypeAccess().getUdtTypeNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUdtTypeRule());
				}
				setWithLastConsumed(
					$current,
					"udtTypeName",
					lv_udtTypeName_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleTypes
entryRuleTypes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypesRule()); }
	iv_ruleTypes=ruleTypes
	{ $current=$iv_ruleTypes.current; }
	EOF;

// Rule Types
ruleTypes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypesAccess().getIntAction_0_0(),
						$current);
				}
			)
			otherlv_1='int'
			{
				newLeafNode(otherlv_1, grammarAccess.getTypesAccess().getIntKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypesAccess().getBoolAction_1_0(),
						$current);
				}
			)
			otherlv_3='bool'
			{
				newLeafNode(otherlv_3, grammarAccess.getTypesAccess().getBoolKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypesAccess().getFloatAction_2_0(),
						$current);
				}
			)
			otherlv_5='float'
			{
				newLeafNode(otherlv_5, grammarAccess.getTypesAccess().getFloatKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypesAccess().getStringTypAction_3_0(),
						$current);
				}
			)
			otherlv_7='string'
			{
				newLeafNode(otherlv_7, grammarAccess.getTypesAccess().getStringKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
	}
	this_Or_0=ruleOr
	{
		$current = $this_Or_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	iv_ruleOr=ruleOr
	{ $current=$iv_ruleOr.current; }
	EOF;

// Rule Or
ruleOr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
		}
		this_And_0=ruleAnd
		{
			$current = $this_And_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='||'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.example.define.Define.And");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
		}
		this_Equality_0=ruleEquality
		{
			$current = $this_Equality_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='&&'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleEquality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.example.define.Define.Equality");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEquality
entryRuleEquality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualityRule()); }
	iv_ruleEquality=ruleEquality
	{ $current=$iv_ruleEquality.current; }
	EOF;

// Rule Equality
ruleEquality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
		}
		this_Comparison_0=ruleComparison
		{
			$current = $this_Comparison_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1='=='
						{
							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_1, null);
						}
						    |
						lv_op_2_2='!='
						{
							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEqualityRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparison
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualityRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.example.define.Define.Comparison");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
		}
		this_PlusOrMinus_0=rulePlusOrMinus
		{
			$current = $this_PlusOrMinus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1='>='
						{
							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_1, null);
						}
						    |
						lv_op_2_2='<='
						{
							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
						    |
						lv_op_2_3='>'
						{
							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_3, null);
						}
						    |
						lv_op_2_4='<'
						{
							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_4, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePlusOrMinus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparisonRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.example.define.Define.PlusOrMinus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusOrMinusRule()); }
	iv_rulePlusOrMinus=rulePlusOrMinus
	{ $current=$iv_rulePlusOrMinus.current; }
	EOF;

// Rule PlusOrMinus
rulePlusOrMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
		}
		this_MulOrDiv_0=ruleMulOrDiv
		{
			$current = $this_MulOrDiv_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='+'
					{
						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='-'
					{
						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleMulOrDiv
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"org.example.define.Define.MulOrDiv");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMulOrDivRule()); }
	iv_ruleMulOrDiv=ruleMulOrDiv
	{ $current=$iv_ruleMulOrDiv.current; }
	EOF;

// Rule MulOrDiv
ruleMulOrDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_2_1='*'
						{
							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMulOrDivRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_1, null);
						}
						    |
						lv_op_2_2='/'
						{
							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMulOrDivRule());
							}
							setWithLastConsumed($current, "op", lv_op_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMulOrDivRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.example.define.Define.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
						$current);
				}
			)
			otherlv_4='!'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
					}
					lv_expression_5_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"expression",
							lv_expression_5_0,
							"org.example.define.Define.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
		}
		this_Atomic_6=ruleAtomic
		{
			$current = $this_Atomic_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	iv_ruleAtomic=ruleAtomic
	{ $current=$iv_ruleAtomic.current; }
	EOF;

// Rule Atomic
ruleAtomic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0=RULE_STRING
					{
						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_5_1='true'
						{
							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtomicRule());
							}
							setWithLastConsumed($current, "value", lv_value_5_1, null);
						}
						    |
						lv_value_5_2='false'
						{
							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtomicRule());
							}
							setWithLastConsumed($current, "value", lv_value_5_2, null);
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0());
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getAtomicAccess().getFloatConstantParserRuleCall_4());
		}
		this_FloatConstant_8=ruleFloatConstant
		{
			$current = $this_FloatConstant_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFloatConstant
entryRuleFloatConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloatConstantRule()); }
	iv_ruleFloatConstant=ruleFloatConstant
	{ $current=$iv_ruleFloatConstant.current; }
	EOF;

// Rule FloatConstant
ruleFloatConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFloatConstantAccess().getEFloatAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						lv_value_1_0=RULE_INT
						{
							newLeafNode(lv_value_1_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFloatConstantRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_1_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_0_1());
				}
				(
					(
						lv_valueOfDecimal_3_0=RULE_INT
						{
							newLeafNode(lv_valueOfDecimal_3_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_0_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFloatConstantRule());
							}
							setWithLastConsumed(
								$current,
								"valueOfDecimal",
								lv_valueOfDecimal_3_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)
			    |
			(
				(
					(
						lv_value_4_0=RULE_INT
						{
							newLeafNode(lv_value_4_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFloatConstantRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_4_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)?
				otherlv_5='.'
				{
					newLeafNode(otherlv_5, grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_1_1());
				}
				(
					(
						lv_valueOfDecimal_6_0=RULE_INT
						{
							newLeafNode(lv_valueOfDecimal_6_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFloatConstantRule());
							}
							setWithLastConsumed(
								$current,
								"valueOfDecimal",
								lv_valueOfDecimal_6_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)
			    |
			(
				(
					(
						lv_value_7_0=RULE_INT
						{
							newLeafNode(lv_value_7_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_1_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFloatConstantRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_7_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				otherlv_8='.'
				{
					newLeafNode(otherlv_8, grammarAccess.getFloatConstantAccess().getFullStopKeyword_1_2_1());
				}
				(
					(
						lv_valueOfDecimal_9_0=RULE_INT
						{
							newLeafNode(lv_valueOfDecimal_9_0, grammarAccess.getFloatConstantAccess().getValueOfDecimalINTTerminalRuleCall_1_2_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFloatConstantRule());
							}
							setWithLastConsumed(
								$current,
								"valueOfDecimal",
								lv_valueOfDecimal_9_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)?
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
