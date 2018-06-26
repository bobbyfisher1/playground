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
import org.example.define.define.BoolConstant;
import org.example.define.define.DefineBlock;
import org.example.define.define.DefinePackage;
import org.example.define.define.DirectionBlock;
import org.example.define.define.Inout;
import org.example.define.define.Input;
import org.example.define.define.IntConstant;
import org.example.define.define.Output;
import org.example.define.define.StringConstant;
import org.example.define.define.Udt;
import org.example.define.define.Variable;
import org.example.define.define.VariableDefinition;
import org.example.define.define.VariableRef;
import org.example.define.define.Variant;
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
			case DefinePackage.BOOL_CONSTANT:
				sequence_Expression(context, (BoolConstant) semanticObject); 
				return; 
			case DefinePackage.DEFINE_BLOCK:
				sequence_DefineBlock(context, (DefineBlock) semanticObject); 
				return; 
			case DefinePackage.DIRECTION_BLOCK:
				sequence_DirectionBlock(context, (DirectionBlock) semanticObject); 
				return; 
			case DefinePackage.INOUT:
				sequence_Inout(context, (Inout) semanticObject); 
				return; 
			case DefinePackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case DefinePackage.INT_CONSTANT:
				sequence_Expression(context, (IntConstant) semanticObject); 
				return; 
			case DefinePackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case DefinePackage.STRING_CONSTANT:
				sequence_Expression(context, (StringConstant) semanticObject); 
				return; 
			case DefinePackage.UDT:
				sequence_Udt(context, (Udt) semanticObject); 
				return; 
			case DefinePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case DefinePackage.VARIABLE_DEFINITION:
				sequence_VariableDefinition(context, (VariableDefinition) semanticObject); 
				return; 
			case DefinePackage.VARIABLE_REF:
				sequence_Expression(context, (VariableRef) semanticObject); 
				return; 
			case DefinePackage.VARIANT:
				sequence_Variant(context, (Variant) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     Expression returns BoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Expression(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Expression(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Expression(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns VariableRef
	 *
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Expression(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DefinePackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DefinePackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1(), semanticObject.eGet(DefinePackage.Literals.VARIABLE_REF__VARIABLE, false));
		feeder.finish();
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
	 *     Udt returns Udt
	 *
	 * Constraint:
	 *     (udtName=ID udtType=ID udtVariables+=Variable*)
	 */
	protected void sequence_Udt(ISerializationContext context, Udt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableDefinition returns VariableDefinition
	 *
	 * Constraint:
	 *     (variableName=ID (expression=Expression range=Expression?)? nextVariable?=','?)
	 */
	protected void sequence_VariableDefinition(ISerializationContext context, VariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     ((variableType=VariableType? variableDefinition=VariableDefinition) | udt=Udt | variant=Variant)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variant returns Variant
	 *
	 * Constraint:
	 *     (variantName=ID variantType=VariableType nextVariant?=','?)
	 */
	protected void sequence_Variant(ISerializationContext context, Variant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
