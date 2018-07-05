/*
 * generated by Xtext 2.13.0
 */
package org.example.define.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.example.define.define.And;
import org.example.define.define.Bool;
import org.example.define.define.BoolConstant;
import org.example.define.define.Comparison;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.DirectionBlock;
import org.example.define.define.EFloat;
import org.example.define.define.Equality;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.Int;
import org.example.define.define.IntConstant;
import org.example.define.define.Minus;
import org.example.define.define.MulOrDiv;
import org.example.define.define.Not;
import org.example.define.define.Or;
import org.example.define.define.Output;
import org.example.define.define.Plus;
import org.example.define.define.StringConstant;
import org.example.define.define.StringTyp;
import org.example.define.define.Udt;
import org.example.define.define.UdtType;
import org.example.define.define.Variable;
import org.example.define.define.VariableRef;
import org.example.define.services.DefineGrammarAccess;

@SuppressWarnings("all")
public class DefineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DefineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DefinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DefinePackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case DefinePackage.BOOL:
				sequence_Types(context, (Bool) semanticObject); 
				return; 
			case DefinePackage.BOOL_CONSTANT:
				sequence_Atomic(context, (BoolConstant) semanticObject); 
				return; 
			case DefinePackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case DefinePackage.DEFINE_BLOCK:
				sequence_DefineBlock(context, (DefineBlock) semanticObject); 
				return; 
			case DefinePackage.DIRECTION_BLOCK:
				sequence_DirectionBlock(context, (DirectionBlock) semanticObject); 
				return; 
			case DefinePackage.EFLOAT:
				sequence_FloatConstant(context, (EFloat) semanticObject); 
				return; 
			case DefinePackage.EQUALITY:
				sequence_Equality(context, (Equality) semanticObject); 
				return; 
			case DefinePackage.FLOAT:
				sequence_Types(context, (org.example.define.define.Float) semanticObject); 
				return; 
			case DefinePackage.INOUT:
				sequence_Inout(context, (Inout) semanticObject); 
				return; 
			case DefinePackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case DefinePackage.INT:
				sequence_Types(context, (Int) semanticObject); 
				return; 
			case DefinePackage.INT_CONSTANT:
				sequence_Atomic(context, (IntConstant) semanticObject); 
				return; 
			case DefinePackage.MINUS:
				sequence_PlusOrMinus(context, (Minus) semanticObject); 
				return; 
			case DefinePackage.MUL_OR_DIV:
				sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
				return; 
			case DefinePackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case DefinePackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case DefinePackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case DefinePackage.PLUS:
				sequence_PlusOrMinus(context, (Plus) semanticObject); 
				return; 
			case DefinePackage.STRING_CONSTANT:
				sequence_Atomic(context, (StringConstant) semanticObject); 
				return; 
			case DefinePackage.STRING_TYP:
				sequence_Types(context, (StringTyp) semanticObject); 
				return; 
			case DefinePackage.UDT:
				sequence_Udt(context, (Udt) semanticObject); 
				return; 
			case DefinePackage.UDT_TYPE:
				sequence_UdtType(context, (UdtType) semanticObject); 
				return; 
			case DefinePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case DefinePackage.VARIABLE_REF:
				sequence_Atomic(context, (VariableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Equality returns And
	 *     Equality.Equality_1_0 returns And
	 *     Comparison returns And
	 *     Comparison.Comparison_1_0 returns And
	 *     PlusOrMinus returns And
	 *     PlusOrMinus.Plus_1_0_0_0 returns And
	 *     PlusOrMinus.Minus_1_0_1_0 returns And
	 *     MulOrDiv returns And
	 *     MulOrDiv.MulOrDiv_1_0 returns And
	 *     Primary returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BoolConstant
	 *     Or returns BoolConstant
	 *     Or.Or_1_0 returns BoolConstant
	 *     And returns BoolConstant
	 *     And.And_1_0 returns BoolConstant
	 *     Equality returns BoolConstant
	 *     Equality.Equality_1_0 returns BoolConstant
	 *     Comparison returns BoolConstant
	 *     Comparison.Comparison_1_0 returns BoolConstant
	 *     PlusOrMinus returns BoolConstant
	 *     PlusOrMinus.Plus_1_0_0_0 returns BoolConstant
	 *     PlusOrMinus.Minus_1_0_1_0 returns BoolConstant
	 *     MulOrDiv returns BoolConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns BoolConstant
	 *     Primary returns BoolConstant
	 *     Atomic returns BoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntConstant
	 *     Or returns IntConstant
	 *     Or.Or_1_0 returns IntConstant
	 *     And returns IntConstant
	 *     And.And_1_0 returns IntConstant
	 *     Equality returns IntConstant
	 *     Equality.Equality_1_0 returns IntConstant
	 *     Comparison returns IntConstant
	 *     Comparison.Comparison_1_0 returns IntConstant
	 *     PlusOrMinus returns IntConstant
	 *     PlusOrMinus.Plus_1_0_0_0 returns IntConstant
	 *     PlusOrMinus.Minus_1_0_1_0 returns IntConstant
	 *     MulOrDiv returns IntConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns IntConstant
	 *     Primary returns IntConstant
	 *     Atomic returns IntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringConstant
	 *     Or returns StringConstant
	 *     Or.Or_1_0 returns StringConstant
	 *     And returns StringConstant
	 *     And.And_1_0 returns StringConstant
	 *     Equality returns StringConstant
	 *     Equality.Equality_1_0 returns StringConstant
	 *     Comparison returns StringConstant
	 *     Comparison.Comparison_1_0 returns StringConstant
	 *     PlusOrMinus returns StringConstant
	 *     PlusOrMinus.Plus_1_0_0_0 returns StringConstant
	 *     PlusOrMinus.Minus_1_0_1_0 returns StringConstant
	 *     MulOrDiv returns StringConstant
	 *     MulOrDiv.MulOrDiv_1_0 returns StringConstant
	 *     Primary returns StringConstant
	 *     Atomic returns StringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns VariableRef
	 *     Or returns VariableRef
	 *     Or.Or_1_0 returns VariableRef
	 *     And returns VariableRef
	 *     And.And_1_0 returns VariableRef
	 *     Equality returns VariableRef
	 *     Equality.Equality_1_0 returns VariableRef
	 *     Comparison returns VariableRef
	 *     Comparison.Comparison_1_0 returns VariableRef
	 *     PlusOrMinus returns VariableRef
	 *     PlusOrMinus.Plus_1_0_0_0 returns VariableRef
	 *     PlusOrMinus.Minus_1_0_1_0 returns VariableRef
	 *     MulOrDiv returns VariableRef
	 *     MulOrDiv.MulOrDiv_1_0 returns VariableRef
	 *     Primary returns VariableRef
	 *     Atomic returns VariableRef
	 *
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Atomic(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1(), semanticObject.eGet(DefinePackage.Literals.VARIABLE_REF__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Comparison
	 *     Or returns Comparison
	 *     Or.Or_1_0 returns Comparison
	 *     And returns Comparison
	 *     And.And_1_0 returns Comparison
	 *     Equality returns Comparison
	 *     Equality.Equality_1_0 returns Comparison
	 *     Comparison returns Comparison
	 *     Comparison.Comparison_1_0 returns Comparison
	 *     PlusOrMinus returns Comparison
	 *     PlusOrMinus.Plus_1_0_0_0 returns Comparison
	 *     PlusOrMinus.Minus_1_0_1_0 returns Comparison
	 *     MulOrDiv returns Comparison
	 *     MulOrDiv.MulOrDiv_1_0 returns Comparison
	 *     Primary returns Comparison
	 *
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=PlusOrMinus)
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefineBlock returns DefineBlock
	 *
	 * Constraint:
	 *     direction=DirectionBlock
	 */
	protected void sequence_DefineBlock(ISerializationContext context, DefineBlock semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.DEFINE_BLOCK__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.DEFINE_BLOCK__DIRECTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefineBlockAccess().getDirectionDirectionBlockParserRuleCall_2_0(), semanticObject.getDirection());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DirectionBlock returns DirectionBlock
	 *
	 * Constraint:
	 *     (input=Input | inout=Inout | output=Output)+
	 */
	protected void sequence_DirectionBlock(ISerializationContext context, DirectionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Equality
	 *     Or returns Equality
	 *     Or.Or_1_0 returns Equality
	 *     And returns Equality
	 *     And.And_1_0 returns Equality
	 *     Equality returns Equality
	 *     Equality.Equality_1_0 returns Equality
	 *     Comparison returns Equality
	 *     Comparison.Comparison_1_0 returns Equality
	 *     PlusOrMinus returns Equality
	 *     PlusOrMinus.Plus_1_0_0_0 returns Equality
	 *     PlusOrMinus.Minus_1_0_1_0 returns Equality
	 *     MulOrDiv returns Equality
	 *     MulOrDiv.MulOrDiv_1_0 returns Equality
	 *     Primary returns Equality
	 *
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 */
	protected void sequence_Equality(ISerializationContext context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns EFloat
	 *     Or returns EFloat
	 *     Or.Or_1_0 returns EFloat
	 *     And returns EFloat
	 *     And.And_1_0 returns EFloat
	 *     Equality returns EFloat
	 *     Equality.Equality_1_0 returns EFloat
	 *     Comparison returns EFloat
	 *     Comparison.Comparison_1_0 returns EFloat
	 *     PlusOrMinus returns EFloat
	 *     PlusOrMinus.Plus_1_0_0_0 returns EFloat
	 *     PlusOrMinus.Minus_1_0_1_0 returns EFloat
	 *     MulOrDiv returns EFloat
	 *     MulOrDiv.MulOrDiv_1_0 returns EFloat
	 *     Primary returns EFloat
	 *     Atomic returns EFloat
	 *     FloatConstant returns EFloat
	 *
	 * Constraint:
	 *     ((value=INT valueOfDecimal=INT) | (value=INT? valueOfDecimal=INT) | (value=INT valueOfDecimal=INT?))
	 */
	protected void sequence_FloatConstant(ISerializationContext context, EFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inout returns Inout
	 *
	 * Constraint:
	 *     inoutVariables+=Variable*
	 */
	protected void sequence_Inout(ISerializationContext context, Inout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     inputVariables+=Variable*
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns MulOrDiv
	 *     Or returns MulOrDiv
	 *     Or.Or_1_0 returns MulOrDiv
	 *     And returns MulOrDiv
	 *     And.And_1_0 returns MulOrDiv
	 *     Equality returns MulOrDiv
	 *     Equality.Equality_1_0 returns MulOrDiv
	 *     Comparison returns MulOrDiv
	 *     Comparison.Comparison_1_0 returns MulOrDiv
	 *     PlusOrMinus returns MulOrDiv
	 *     PlusOrMinus.Plus_1_0_0_0 returns MulOrDiv
	 *     PlusOrMinus.Minus_1_0_1_0 returns MulOrDiv
	 *     MulOrDiv returns MulOrDiv
	 *     MulOrDiv.MulOrDiv_1_0 returns MulOrDiv
	 *     Primary returns MulOrDiv
	 *
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/') right=Primary)
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     Equality returns Or
	 *     Equality.Equality_1_0 returns Or
	 *     Comparison returns Or
	 *     Comparison.Comparison_1_0 returns Or
	 *     PlusOrMinus returns Or
	 *     PlusOrMinus.Plus_1_0_0_0 returns Or
	 *     PlusOrMinus.Minus_1_0_1_0 returns Or
	 *     MulOrDiv returns Or
	 *     MulOrDiv.MulOrDiv_1_0 returns Or
	 *     Primary returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     outputVariables+=Variable*
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Minus
	 *     Or returns Minus
	 *     Or.Or_1_0 returns Minus
	 *     And returns Minus
	 *     And.And_1_0 returns Minus
	 *     Equality returns Minus
	 *     Equality.Equality_1_0 returns Minus
	 *     Comparison returns Minus
	 *     Comparison.Comparison_1_0 returns Minus
	 *     PlusOrMinus returns Minus
	 *     PlusOrMinus.Plus_1_0_0_0 returns Minus
	 *     PlusOrMinus.Minus_1_0_1_0 returns Minus
	 *     MulOrDiv returns Minus
	 *     MulOrDiv.MulOrDiv_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Plus
	 *     Or returns Plus
	 *     Or.Or_1_0 returns Plus
	 *     And returns Plus
	 *     And.And_1_0 returns Plus
	 *     Equality returns Plus
	 *     Equality.Equality_1_0 returns Plus
	 *     Comparison returns Plus
	 *     Comparison.Comparison_1_0 returns Plus
	 *     PlusOrMinus returns Plus
	 *     PlusOrMinus.Plus_1_0_0_0 returns Plus
	 *     PlusOrMinus.Minus_1_0_1_0 returns Plus
	 *     MulOrDiv returns Plus
	 *     MulOrDiv.MulOrDiv_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Equality returns Not
	 *     Equality.Equality_1_0 returns Not
	 *     Comparison returns Not
	 *     Comparison.Comparison_1_0 returns Not
	 *     PlusOrMinus returns Not
	 *     PlusOrMinus.Plus_1_0_0_0 returns Not
	 *     PlusOrMinus.Minus_1_0_1_0 returns Not
	 *     MulOrDiv returns Not
	 *     MulOrDiv.MulOrDiv_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.NOT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Bool
	 *
	 * Constraint:
	 *     {Bool}
	 */
	protected void sequence_Types(ISerializationContext context, Bool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Float
	 *
	 * Constraint:
	 *     {Float}
	 */
	protected void sequence_Types(ISerializationContext context, org.example.define.define.Float semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Int
	 *
	 * Constraint:
	 *     {Int}
	 */
	protected void sequence_Types(ISerializationContext context, Int semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Types returns StringTyp
	 *
	 * Constraint:
	 *     {StringTyp}
	 */
	protected void sequence_Types(ISerializationContext context, StringTyp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UdtType returns UdtType
	 *
	 * Constraint:
	 *     udtTypeName=ID
	 */
	protected void sequence_UdtType(ISerializationContext context, UdtType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.UDT_TYPE__UDT_TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.UDT_TYPE__UDT_TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUdtTypeAccess().getUdtTypeNameIDTerminalRuleCall_0(), semanticObject.getUdtTypeName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Udt returns Udt
	 *
	 * Constraint:
	 *     (udtName=ID udtTypes=UdtType udtVariables+=Variable*)
	 */
	protected void sequence_Udt(ISerializationContext context, Udt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     ((variantKeyword?='variant'? variableType=Types variableName=ID (expression=Expression range=Expression?)?) | udt=Udt)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
