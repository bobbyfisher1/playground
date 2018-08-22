/*
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.eis.ide.contentassist.antlr.internal.InternalEisParser;
import org.xtext.eis.services.EisGrammarAccess;

public class EisParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EisGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EisGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBlockValueAccess().getAlternatives(), "rule__BlockValue__Alternatives");
			builder.put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
			builder.put(grammarAccess.getVariablesAccess().getAlternatives(), "rule__Variables__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives_5(), "rule__Variable__Alternatives_5");
			builder.put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0(), "rule__MulOrDiv__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getValueAlternatives_0_1_0(), "rule__Atomic__ValueAlternatives_0_1_0");
			builder.put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
			builder.put(grammarAccess.getEisModelAccess().getGroup(), "rule__EisModel__Group__0");
			builder.put(grammarAccess.getTestcaseAccess().getGroup(), "rule__Testcase__Group__0");
			builder.put(grammarAccess.getTestblockAccess().getGroup(), "rule__Testblock__Group__0");
			builder.put(grammarAccess.getDefineBlockAccess().getGroup(), "rule__DefineBlock__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getInOutAccess().getGroup(), "rule__InOut__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_4(), "rule__Variable__Group_4__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_4_2(), "rule__Variable__Group_4_2__0");
			builder.put(grammarAccess.getUdtAccess().getGroup(), "rule__Udt__Group__0");
			builder.put(grammarAccess.getUdtRefAccess().getGroup(), "rule__UdtRef__Group__0");
			builder.put(grammarAccess.getTeststepBlockAccess().getGroup(), "rule__TeststepBlock__Group__0");
			builder.put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
			builder.put(grammarAccess.getAssertAccess().getGroup(), "rule__Assert__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_4(), "rule__Statement__Group_4__0");
			builder.put(grammarAccess.getCascadeAccess().getGroup(), "rule__Cascade__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_5(), "rule__Atomic__Group_5__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_6(), "rule__Atomic__Group_6__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_7(), "rule__Atomic__Group_7__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_8(), "rule__Atomic__Group_8__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_9(), "rule__Atomic__Group_9__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_10(), "rule__Atomic__Group_10__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_11(), "rule__Atomic__Group_11__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_12(), "rule__Atomic__Group_12__0");
			builder.put(grammarAccess.getEisModelAccess().getProject_nameAssignment_2(), "rule__EisModel__Project_nameAssignment_2");
			builder.put(grammarAccess.getEisModelAccess().getPlc_nameAssignment_6(), "rule__EisModel__Plc_nameAssignment_6");
			builder.put(grammarAccess.getEisModelAccess().getAuthor_nameAssignment_10(), "rule__EisModel__Author_nameAssignment_10");
			builder.put(grammarAccess.getEisModelAccess().getTestcasesAssignment_12(), "rule__EisModel__TestcasesAssignment_12");
			builder.put(grammarAccess.getTestcaseAccess().getTestcase_nameAssignment_1(), "rule__Testcase__Testcase_nameAssignment_1");
			builder.put(grammarAccess.getTestcaseAccess().getTestblockAssignment_3(), "rule__Testcase__TestblockAssignment_3");
			builder.put(grammarAccess.getTestblockAccess().getTestActiveAssignment_2(), "rule__Testblock__TestActiveAssignment_2");
			builder.put(grammarAccess.getTestblockAccess().getBlockTypeAssignment_6(), "rule__Testblock__BlockTypeAssignment_6");
			builder.put(grammarAccess.getTestblockAccess().getDescriptionAssignment_10(), "rule__Testblock__DescriptionAssignment_10");
			builder.put(grammarAccess.getTestblockAccess().getDefineAssignment_12(), "rule__Testblock__DefineAssignment_12");
			builder.put(grammarAccess.getBoolConstantAccess().getValueAssignment(), "rule__BoolConstant__ValueAssignment");
			builder.put(grammarAccess.getBlockConstantAccess().getValueAssignment(), "rule__BlockConstant__ValueAssignment");
			builder.put(grammarAccess.getDefineBlockAccess().getDirectionAssignment_2(), "rule__DefineBlock__DirectionAssignment_2");
			builder.put(grammarAccess.getDefineBlockAccess().getTeststepsAssignment_4(), "rule__DefineBlock__TeststepsAssignment_4");
			builder.put(grammarAccess.getDirectionBlockAccess().getInputAssignment_0(), "rule__DirectionBlock__InputAssignment_0");
			builder.put(grammarAccess.getDirectionBlockAccess().getOutputAssignment_1(), "rule__DirectionBlock__OutputAssignment_1");
			builder.put(grammarAccess.getDirectionBlockAccess().getInoutAssignment_2(), "rule__DirectionBlock__InoutAssignment_2");
			builder.put(grammarAccess.getInputAccess().getNameAssignment_0(), "rule__Input__NameAssignment_0");
			builder.put(grammarAccess.getInputAccess().getInputVariablesAssignment_2(), "rule__Input__InputVariablesAssignment_2");
			builder.put(grammarAccess.getOutputAccess().getNameAssignment_0(), "rule__Output__NameAssignment_0");
			builder.put(grammarAccess.getOutputAccess().getOutputVariablesAssignment_2(), "rule__Output__OutputVariablesAssignment_2");
			builder.put(grammarAccess.getInOutAccess().getNameAssignment_0(), "rule__InOut__NameAssignment_0");
			builder.put(grammarAccess.getInOutAccess().getInoutVariablesAssignment_2(), "rule__InOut__InoutVariablesAssignment_2");
			builder.put(grammarAccess.getVariableAccess().getVariantKeywordAssignment_1(), "rule__Variable__VariantKeywordAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getVariableTypeAssignment_2(), "rule__Variable__VariableTypeAssignment_2");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_3(), "rule__Variable__NameAssignment_3");
			builder.put(grammarAccess.getVariableAccess().getIdiomAssignment_4_1(), "rule__Variable__IdiomAssignment_4_1");
			builder.put(grammarAccess.getVariableAccess().getRangeAssignment_4_2_1(), "rule__Variable__RangeAssignment_4_2_1");
			builder.put(grammarAccess.getVariableAccess().getNextVariableAssignment_5_1(), "rule__Variable__NextVariableAssignment_5_1");
			builder.put(grammarAccess.getUdtAccess().getNameAssignment_1(), "rule__Udt__NameAssignment_1");
			builder.put(grammarAccess.getUdtAccess().getUdtTypeAssignment_3(), "rule__Udt__UdtTypeAssignment_3");
			builder.put(grammarAccess.getUdtAccess().getUdtVariablesAssignment_6(), "rule__Udt__UdtVariablesAssignment_6");
			builder.put(grammarAccess.getUdtRefAccess().getUdtTypeAssignment_0(), "rule__UdtRef__UdtTypeAssignment_0");
			builder.put(grammarAccess.getUdtRefAccess().getNameAssignment_1(), "rule__UdtRef__NameAssignment_1");
			builder.put(grammarAccess.getUdtRefAccess().getUdtVariablesAssignment_2(), "rule__UdtRef__UdtVariablesAssignment_2");
			builder.put(grammarAccess.getUdtTypeAccess().getNameAssignment(), "rule__UdtType__NameAssignment");
			builder.put(grammarAccess.getTeststepBlockAccess().getTeststepKeywordAssignment_0(), "rule__TeststepBlock__TeststepKeywordAssignment_0");
			builder.put(grammarAccess.getTeststepBlockAccess().getPlcCycleAssignment_2(), "rule__TeststepBlock__PlcCycleAssignment_2");
			builder.put(grammarAccess.getTeststepBlockAccess().getDescriptionAssignment_4(), "rule__TeststepBlock__DescriptionAssignment_4");
			builder.put(grammarAccess.getTeststepBlockAccess().getAssertionAssignment_7(), "rule__TeststepBlock__AssertionAssignment_7");
			builder.put(grammarAccess.getAssertionBlockAccess().getSetAssignment_0(), "rule__AssertionBlock__SetAssignment_0");
			builder.put(grammarAccess.getAssertionBlockAccess().getAssertAssignment_1(), "rule__AssertionBlock__AssertAssignment_1");
			builder.put(grammarAccess.getSetAccess().getNameAssignment_0(), "rule__Set__NameAssignment_0");
			builder.put(grammarAccess.getSetAccess().getSetVariablesAssignment_2(), "rule__Set__SetVariablesAssignment_2");
			builder.put(grammarAccess.getAssertAccess().getNameAssignment_0(), "rule__Assert__NameAssignment_0");
			builder.put(grammarAccess.getAssertAccess().getAssertVariablesAssignment_2(), "rule__Assert__AssertVariablesAssignment_2");
			builder.put(grammarAccess.getStatementAccess().getVariableAssignment_0(), "rule__Statement__VariableAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getCascadeAssignment_1(), "rule__Statement__CascadeAssignment_1");
			builder.put(grammarAccess.getStatementAccess().getIdiomAssignment_3(), "rule__Statement__IdiomAssignment_3");
			builder.put(grammarAccess.getStatementAccess().getRangeAssignment_4_1(), "rule__Statement__RangeAssignment_4_1");
			builder.put(grammarAccess.getCascadeAccess().getUdtVarAssignment_1(), "rule__Cascade__UdtVarAssignment_1");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1(), "rule__MulOrDiv__OpAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2(), "rule__MulOrDiv__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getIdiomAssignment_1_2(), "rule__Primary__IdiomAssignment_1_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getVariableAssignment_3_1(), "rule__Atomic__VariableAssignment_3_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_4_1(), "rule__Atomic__ValueAssignment_4_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_5_1(), "rule__Atomic__ValueAssignment_5_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_6_1(), "rule__Atomic__ValueAssignment_6_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_7_1(), "rule__Atomic__ValueAssignment_7_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_8_1(), "rule__Atomic__ValueAssignment_8_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_9_1(), "rule__Atomic__ValueAssignment_9_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_10_1(), "rule__Atomic__ValueAssignment_10_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_11_1(), "rule__Atomic__ValueAssignment_11_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_12_1(), "rule__Atomic__ValueAssignment_12_1");
			builder.put(grammarAccess.getDirectionBlockAccess().getUnorderedGroup(), "rule__DirectionBlock__UnorderedGroup");
			builder.put(grammarAccess.getAssertionBlockAccess().getUnorderedGroup(), "rule__AssertionBlock__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EisGrammarAccess grammarAccess;

	@Override
	protected InternalEisParser createParser() {
		InternalEisParser result = new InternalEisParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EisGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EisGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
