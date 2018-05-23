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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
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
		{ before(grammarAccess.getTestcaseAccess().getLessThanSignGreaterThanSignKeyword()); }
		'<>'
		{ after(grammarAccess.getTestcaseAccess().getLessThanSignGreaterThanSignKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getProjectKeyword_0()); }
	'project'
	{ after(grammarAccess.getModelAccess().getProjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getModelAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getProject_nameAssignment_2()); }
	(rule__Model__Project_nameAssignment_2)
	{ after(grammarAccess.getModelAccess().getProject_nameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getModelAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__4__Impl
	rule__Model__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getPlcnameKeyword_4()); }
	'plcname'
	{ after(grammarAccess.getModelAccess().getPlcnameKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__5__Impl
	rule__Model__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getEqualsSignKeyword_5()); }
	'='
	{ after(grammarAccess.getModelAccess().getEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__6__Impl
	rule__Model__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getPlc_nameAssignment_6()); }
	(rule__Model__Plc_nameAssignment_6)
	{ after(grammarAccess.getModelAccess().getPlc_nameAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__7__Impl
	rule__Model__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getModelAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getTestcasesAssignment_8()); }
	(rule__Model__TestcasesAssignment_8)*
	{ after(grammarAccess.getModelAccess().getTestcasesAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Project_nameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getProject_nameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getModelAccess().getProject_nameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Plc_nameAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getPlc_nameIDTerminalRuleCall_6_0()); }
		RULE_ID
		{ after(grammarAccess.getModelAccess().getPlc_nameIDTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__TestcasesAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getTestcasesTestcaseParserRuleCall_8_0()); }
		ruleTestcase
		{ after(grammarAccess.getModelAccess().getTestcasesTestcaseParserRuleCall_8_0()); }
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
