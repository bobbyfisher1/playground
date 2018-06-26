/*
 * generated by Xtext 2.13.0
 */
grammar InternalEis;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.example.eis.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.example.eis.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.eis.services.EisGrammarAccess;

}
@parser::members {
	private EisGrammarAccess grammarAccess;

	public void setGrammarAccess(EisGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleEisModel
entryRuleEisModel
:
{ before(grammarAccess.getEisModelRule()); }
	 ruleEisModel
{ after(grammarAccess.getEisModelRule()); } 
	 EOF 
;

// Rule EisModel
ruleEisModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEisModelAccess().getGroup()); }
		(rule__EisModel__Group__0)
		{ after(grammarAccess.getEisModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTestcase
entryRuleTestcase
:
{ before(grammarAccess.getTestcaseRule()); }
	 ruleTestcase
{ after(grammarAccess.getTestcaseRule()); } 
	 EOF 
;

// Rule Testcase
ruleTestcase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTestcaseAccess().getGroup()); }
		(rule__Testcase__Group__0)
		{ after(grammarAccess.getTestcaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTestblock
entryRuleTestblock
:
{ before(grammarAccess.getTestblockRule()); }
	 ruleTestblock
{ after(grammarAccess.getTestblockRule()); } 
	 EOF 
;

// Rule Testblock
ruleTestblock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTestblockAccess().getGroup()); }
		(rule__Testblock__Group__0)
		{ after(grammarAccess.getTestblockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolConstant
entryRuleBoolConstant
:
{ before(grammarAccess.getBoolConstantRule()); }
	 ruleBoolConstant
{ after(grammarAccess.getBoolConstantRule()); } 
	 EOF 
;

// Rule BoolConstant
ruleBoolConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBoolConstantAccess().getValueAssignment()); }
		(rule__BoolConstant__ValueAssignment)
		{ after(grammarAccess.getBoolConstantAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBlockConstant
entryRuleBlockConstant
:
{ before(grammarAccess.getBlockConstantRule()); }
	 ruleBlockConstant
{ after(grammarAccess.getBlockConstantRule()); } 
	 EOF 
;

// Rule BlockConstant
ruleBlockConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBlockConstantAccess().getValueAssignment()); }
		(rule__BlockConstant__ValueAssignment)
		{ after(grammarAccess.getBlockConstantAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefineBlock
entryRuleDefineBlock
:
{ before(grammarAccess.getDefineBlockRule()); }
	 ruleDefineBlock
{ after(grammarAccess.getDefineBlockRule()); } 
	 EOF 
;

// Rule DefineBlock
ruleDefineBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefineBlockAccess().getDefineKeyword()); }
		'define'
		{ after(grammarAccess.getDefineBlockAccess().getDefineKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTeststepBlock
entryRuleTeststepBlock
:
{ before(grammarAccess.getTeststepBlockRule()); }
	 ruleTeststepBlock
{ after(grammarAccess.getTeststepBlockRule()); } 
	 EOF 
;

// Rule TeststepBlock
ruleTeststepBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTeststepBlockAccess().getTeststepKeyword()); }
		'teststep'
		{ after(grammarAccess.getTeststepBlockAccess().getTeststepKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BoolConstant__ValueAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoolConstantAccess().getValueTrueKeyword_0_0()); }
		'true'
		{ after(grammarAccess.getBoolConstantAccess().getValueTrueKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBoolConstantAccess().getValueFalseKeyword_0_1()); }
		'false'
		{ after(grammarAccess.getBoolConstantAccess().getValueFalseKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockConstant__ValueAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockConstantAccess().getValueFCKeyword_0_0()); }
		'FC'
		{ after(grammarAccess.getBlockConstantAccess().getValueFCKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBlockConstantAccess().getValueFBKeyword_0_1()); }
		'FB'
		{ after(grammarAccess.getBlockConstantAccess().getValueFBKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__0__Impl
	rule__EisModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getProjectKeyword_0()); }
	'project'
	{ after(grammarAccess.getEisModelAccess().getProjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__1__Impl
	rule__EisModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getEisModelAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__2__Impl
	rule__EisModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getProject_nameAssignment_2()); }
	(rule__EisModel__Project_nameAssignment_2)
	{ after(grammarAccess.getEisModelAccess().getProject_nameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__3__Impl
	rule__EisModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getEisModelAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__4__Impl
	rule__EisModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getPlcnameKeyword_4()); }
	'plcname'
	{ after(grammarAccess.getEisModelAccess().getPlcnameKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__5__Impl
	rule__EisModel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getEqualsSignKeyword_5()); }
	'='
	{ after(grammarAccess.getEisModelAccess().getEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__6__Impl
	rule__EisModel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getPlc_nameAssignment_6()); }
	(rule__EisModel__Plc_nameAssignment_6)
	{ after(grammarAccess.getEisModelAccess().getPlc_nameAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__7__Impl
	rule__EisModel__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getEisModelAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__8__Impl
	rule__EisModel__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getAuthorKeyword_8()); }
	'author'
	{ after(grammarAccess.getEisModelAccess().getAuthorKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__9__Impl
	rule__EisModel__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getEqualsSignKeyword_9()); }
	'='
	{ after(grammarAccess.getEisModelAccess().getEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__10__Impl
	rule__EisModel__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getAuthor_nameAssignment_10()); }
	(rule__EisModel__Author_nameAssignment_10)
	{ after(grammarAccess.getEisModelAccess().getAuthor_nameAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__11__Impl
	rule__EisModel__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getEisModelAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EisModel__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEisModelAccess().getTestcasesAssignment_12()); }
	(rule__EisModel__TestcasesAssignment_12)*
	{ after(grammarAccess.getEisModelAccess().getTestcasesAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Testcase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testcase__Group__0__Impl
	rule__Testcase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); }
	'testcase'
	{ after(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testcase__Group__1__Impl
	rule__Testcase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestcaseAccess().getTestcase_nameAssignment_1()); }
	(rule__Testcase__Testcase_nameAssignment_1)
	{ after(grammarAccess.getTestcaseAccess().getTestcase_nameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testcase__Group__2__Impl
	rule__Testcase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testcase__Group__3__Impl
	rule__Testcase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestcaseAccess().getTestblockAssignment_3()); }
	(rule__Testcase__TestblockAssignment_3)?
	{ after(grammarAccess.getTestcaseAccess().getTestblockAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testcase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Testblock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__0__Impl
	rule__Testblock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getTestActiveKeyword_0()); }
	'testActive'
	{ after(grammarAccess.getTestblockAccess().getTestActiveKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__1__Impl
	rule__Testblock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getTestblockAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__2__Impl
	rule__Testblock__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getTestActiveAssignment_2()); }
	(rule__Testblock__TestActiveAssignment_2)
	{ after(grammarAccess.getTestblockAccess().getTestActiveAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__3__Impl
	rule__Testblock__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getTestblockAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__4__Impl
	rule__Testblock__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getBlockTypeKeyword_4()); }
	'blockType'
	{ after(grammarAccess.getTestblockAccess().getBlockTypeKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__5__Impl
	rule__Testblock__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getEqualsSignKeyword_5()); }
	'='
	{ after(grammarAccess.getTestblockAccess().getEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__6__Impl
	rule__Testblock__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getBlockTypeAssignment_6()); }
	(rule__Testblock__BlockTypeAssignment_6)
	{ after(grammarAccess.getTestblockAccess().getBlockTypeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__7__Impl
	rule__Testblock__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTestblockAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__8__Impl
	rule__Testblock__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getDescriptionKeyword_8()); }
	'description'
	{ after(grammarAccess.getTestblockAccess().getDescriptionKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__9__Impl
	rule__Testblock__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getEqualsSignKeyword_9()); }
	'='
	{ after(grammarAccess.getTestblockAccess().getEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__10__Impl
	rule__Testblock__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getDescriptionAssignment_10()); }
	(rule__Testblock__DescriptionAssignment_10)
	{ after(grammarAccess.getTestblockAccess().getDescriptionAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__11__Impl
	rule__Testblock__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTestblockAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__12__Impl
	rule__Testblock__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getDefineBlockParserRuleCall_12()); }
	ruleDefineBlock
	{ after(grammarAccess.getTestblockAccess().getDefineBlockParserRuleCall_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Testblock__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestblockAccess().getTeststepBlockParserRuleCall_13()); }
	ruleTeststepBlock
	{ after(grammarAccess.getTestblockAccess().getTeststepBlockParserRuleCall_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EisModel__Project_nameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEisModelAccess().getProject_nameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getEisModelAccess().getProject_nameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Plc_nameAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEisModelAccess().getPlc_nameSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getEisModelAccess().getPlc_nameSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__Author_nameAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEisModelAccess().getAuthor_nameSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getEisModelAccess().getAuthor_nameSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EisModel__TestcasesAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEisModelAccess().getTestcasesTestcaseParserRuleCall_12_0()); }
		ruleTestcase
		{ after(grammarAccess.getEisModelAccess().getTestcasesTestcaseParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__Testcase_nameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTestcaseAccess().getTestcase_nameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTestcaseAccess().getTestcase_nameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testcase__TestblockAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTestcaseAccess().getTestblockTestblockParserRuleCall_3_0()); }
		ruleTestblock
		{ after(grammarAccess.getTestcaseAccess().getTestblockTestblockParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__TestActiveAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTestblockAccess().getTestActiveBoolConstantParserRuleCall_2_0()); }
		ruleBoolConstant
		{ after(grammarAccess.getTestblockAccess().getTestActiveBoolConstantParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__BlockTypeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTestblockAccess().getBlockTypeBlockConstantParserRuleCall_6_0()); }
		ruleBlockConstant
		{ after(grammarAccess.getTestblockAccess().getBlockTypeBlockConstantParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Testblock__DescriptionAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTestblockAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getTestblockAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BoolConstant__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoolConstantAccess().getValueAlternatives_0()); }
		(rule__BoolConstant__ValueAlternatives_0)
		{ after(grammarAccess.getBoolConstantAccess().getValueAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockConstant__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockConstantAccess().getValueAlternatives_0()); }
		(rule__BlockConstant__ValueAlternatives_0)
		{ after(grammarAccess.getBlockConstantAccess().getValueAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
