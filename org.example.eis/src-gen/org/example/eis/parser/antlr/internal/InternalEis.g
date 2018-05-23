/*
 * generated by Xtext 2.13.0
 */
grammar InternalEis;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.example.eis.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='project'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getProjectKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_project_name_2_0=RULE_ID
				{
					newLeafNode(lv_project_name_2_0, grammarAccess.getModelAccess().getProject_nameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"project_name",
						lv_project_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSemicolonKeyword_3());
		}
		otherlv_4='plcname'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPlcnameKeyword_4());
		}
		otherlv_5='='
		{
			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getEqualsSignKeyword_5());
		}
		(
			(
				lv_plc_name_6_0=RULE_ID
				{
					newLeafNode(lv_plc_name_6_0, grammarAccess.getModelAccess().getPlc_nameIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"plc_name",
						lv_plc_name_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getSemicolonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTestcasesTestcaseParserRuleCall_8_0());
				}
				lv_testcases_8_0=ruleTestcase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"testcases",
						lv_testcases_8_0,
						"org.example.eis.Eis.Testcase");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTestcase
entryRuleTestcase returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTestcaseRule()); }
	iv_ruleTestcase=ruleTestcase
	{ $current=$iv_ruleTestcase.current.getText(); }
	EOF;

// Rule Testcase
ruleTestcase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='<>'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getTestcaseAccess().getLessThanSignGreaterThanSignKeyword());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
