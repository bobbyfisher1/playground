/*
 * generated by Xtext 2.12.0
 */
package org.example.eis.generator

import com.google.inject.Inject
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.example.eis.eis.DefineBlock
import org.example.eis.eis.DirectionBlock
import org.example.eis.eis.EisModel
import org.example.eis.eis.InOut
import org.example.eis.eis.Input
import org.example.eis.eis.Output
import org.example.eis.eis.TeststepBlock
import org.example.eis.eis.Udt
import org.example.eis.eis.UdtRef
import org.example.eis.eis.Variable
import org.example.eis.eis.Variables
import org.example.eis.interpreter.EisInterpreter
import org.example.eis.typing.DefineTypeComputer

class EisGenerator extends AbstractGenerator {

	@Inject extension EisInterpreter
	@Inject extension DefineTypeComputer
	
	
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.toIterable.filter(EisModel).head
		fsa.generateFile('''«model.plc_name»_Testfixture.xml''', model.compile)
	}
	
//
// generation methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def private CharSequence compile(EisModel model) {
		var testcaseID = 0
		'''
			<?xml version="1.0" encoding="utf-8"?>
			<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
				<TiaProjectName>«model.project_name»</TiaProjectName>
				<PlcName>«model.plc_name»</PlcName>
				<Author>«model.author_name»</Author>
				<TestCases>
			«FOR testcases : model.testcases»
					«val testblock = testcases?.testblock»
							<TestCase ID="«testcaseID++»"«IF testblock !== null» TestActive="«testblock.testActive.value»" Blockname="«testcases.testcase_name»" Blocktype="«testblock.blockType.value»" Description="«testblock.description»"«ENDIF»>
					«IF testblock?.define !== null»
				«testblock.define.compileTeststeps»
					«ENDIF»
							</TestCase>
			«ENDFOR»
				</TestCases>
			</TestFixture>
		'''
	}
	
	def private CharSequence compileTeststeps(DefineBlock define){
		val steps = define?.teststeps
		val inputs = define.direction.input.inputVariables
		val inouts = define.direction?.inout?.inoutVariables
		val outputs = define.direction.output.outputVariables
		
		val inputMap = new HashMap					// key: name, value: idiom
		val outputIdiomMap =  new HashMap		// key: name, value: idiom
		val outputRangeMap = new HashMap	// key: name, value: range
		
		var setMap = new HashMap
		var assertIdiomMap =  new HashMap
		var assertRangeMap = new HashMap
		
		val oneTab = "	"
		val twoTabs = oneTab + oneTab
		val fourTabs = twoTabs + twoTabs
		val fiveTabs = fourTabs + oneTab
		val sixTabs = fourTabs + twoTabs
		
		// add all variables to maps with default values if undefined
		if(!inputs.empty)
			inputMap.generateMap(inputs, '')
		if(!outputs.empty){
			outputIdiomMap.generateMap(outputs,'')
			outputRangeMap.generateRangeMap(outputs, '')	
		}
		if(inouts !== null){
			if(!inouts.empty){										
				inputMap.generateMap(inouts, '')
				outputIdiomMap.generateMap(inouts,'')
				outputRangeMap.generateRangeMap(inouts, '')
			}
		}
		
		val multiLineString = '''
		«IF !steps.empty»		
		«oneTab + twoTabs»<Teststeps>
		«FOR e : steps»
		«fourTabs»<Teststep PlcCycle ="«e.plcCycle»" Description="«e.description»">
		«fiveTabs»<Inputs>
		«setMap.clear»
		«setMap.putAll(inputMap)»
		«setMap.overwriteInput(e)»
		«inputs.compileIn(setMap,'', sixTabs)»
		«IF inouts !== null»«inouts.compileIn(setMap,'', sixTabs)»«ENDIF»
		«fiveTabs»</Inputs>
		«fiveTabs»<Outputs>
		«assertIdiomMap.clear»
		«assertRangeMap.clear»
		«assertIdiomMap.putAll(outputIdiomMap)»
		«assertRangeMap.putAll(outputRangeMap)»
		«assertIdiomMap.overwriteOutputIdiom(e)»
		«assertRangeMap.overwriteOutputRange(e)»
		«outputs.compileOut(assertIdiomMap, assertRangeMap, '', sixTabs)»
		«IF inouts !== null»«inouts.compileOut(assertIdiomMap, assertRangeMap,'', sixTabs)»«ENDIF»
		«fiveTabs»</Outputs>
		«fourTabs»</Teststep>
		«ENDFOR»
		«oneTab + twoTabs»</Teststeps>
		«ENDIF»
		'''
		
		return multiLineString
	}
				
	def private CharSequence compileIn(EList<Variables> variables, HashMap<Object, Object> setMap,  String _qualifiedName, String _indent) {
		var charSeq = ""
		var qualifiedName = _qualifiedName
		var indent = _indent
		
		for(variable : variables) {
			if(variable instanceof Variable) {
				val value = setMap.get(qualifiedName + variable.name).toString
				
				charSeq += indent +	'''<Element xsi:type="Input" Name="«variable.name»" Datatype="«variable.variableType.toString.toFirstUpper»" Direction="«variable.directionBlock»" Value="«value»" Variant="«variable.variantKeyword.toString»" />
				'''//newline
			} else if(variable instanceof Udt)	
				charSeq += buildUdt(setMap, qualifiedName, indent, variable) 
			 else if (variable instanceof UdtRef)				
				charSeq += buildUdtRef(setMap,qualifiedName,indent, variable)					
		}
		return charSeq
	}
	
	def private CharSequence buildUdt(HashMap<Object, Object> setMap, String _qualifiedName, String indent, Udt variable) {
		var charSeq = ""
		var qualifiedName = _qualifiedName 
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="InputUDT" Name="«variable.name»" Datatype="«variable.udtType.name»" Direction="«variable.directionBlock»">
		'''//newline				
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += variable.udtVariables.compileIn(setMap, qualifiedName + variable.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
	def private CharSequence buildUdtRef(HashMap<Object, Object> setMap, String _qualifiedName, String indent, UdtRef variable) {
		var charSeq = ""
		var qualifiedName = _qualifiedName 
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="InputUDT" Name="«variable.name»" Datatype="«variable.udtType.name.toString»" Direction="«variable.directionBlock»">
		'''//newline		
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += variable.udtVariables.compileIn(setMap, qualifiedName + variable.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
	def private CharSequence compileOut(EList <Variables> variables, HashMap<Object, Object> idiomMap,HashMap<Object, Object> rangeMap , String _qualifiedName, String _indent) {
		var charSeq = ""
		var qualifiedName = _qualifiedName
		var indent = _indent
		
		
		for (variable : variables) {
			if (variable instanceof Variable) {
				val idiom = idiomMap.get(qualifiedName + variable.name).toString
				val range = rangeMap.get(qualifiedName + variable.name).toString
					
				charSeq +=	indent + '''<Element xsi:type="Output" Name="«variable.name»" Datatype="«variable.variableType.toString.toFirstUpper»" Direction="«variable.directionBlock»" Expect="«idiom»" Range="«range»" Variant="«variable.variantKeyword.toString»" />
				''' // newline
					
			} else if (variable instanceof Udt)
				charSeq += buildUdt(variable, idiomMap, rangeMap, qualifiedName, indent)
			else if (variable instanceof UdtRef)
				charSeq += buildUdtRef(variable, idiomMap, rangeMap, qualifiedName, indent)
		}
		return charSeq
	}
		
	def private CharSequence buildUdt(Udt variable, HashMap<Object, Object> idiomMap, HashMap<Object, Object> rangeMap, String _qualifiedName, String indent) {
		var charSeq = ""
		var qualifiedName = _qualifiedName 
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="OutputUDT" Name="«variable.name»" Datatype="«variable.udtType.name»" Direction="«variable.directionBlock»">
		'''//newline				
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += variable.udtVariables.compileOut(idiomMap, rangeMap, qualifiedName + variable.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
	def private CharSequence buildUdtRef(UdtRef variable, HashMap<Object, Object> idiomMap, HashMap<Object, Object> rangeMap, String _qualifiedName, String indent) {
		var charSeq = ""
		var qualifiedName = _qualifiedName 
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="OutputUDT" Name="«variable.name»" Datatype="«variable.udtType.name.toString»" Direction="«variable.directionBlock»">
		'''//newline		
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += variable.udtVariables.compileOut(idiomMap, rangeMap, qualifiedName + variable.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//	
	def private void generateMap(HashMap<Object, Object> map, EList<Variables> variables, String _name) {
		var name = _name
		for(variable : variables){
			if(variable instanceof Variable)
				map.put(name + variable.name, variable?.idiom?.interpret?.toString ?: variable.defaultValue)
			 else if(variable instanceof Udt) 
				map.generateMap(variable.udtVariables, name + variable.name + '.')
			 else if(variable instanceof UdtRef)
				map.generateMap(variable.udtVariables, name + variable.name + '.')			
		}
	}
	
	def private void generateRangeMap(HashMap<Object, Object> map, EList<Variables> variables, String _name) {
		var name = _name
		for(variable : variables){
			if(variable instanceof Variable)
				map.put(name + variable.name, variable?.range?.interpret?.toString ?: variable.defaultRange)
			 else if(variable instanceof Udt) 
				map.generateRangeMap(variable.udtVariables, name + variable.name + '.')
			 else if(variable instanceof UdtRef)
				map.generateRangeMap(variable.udtVariables, name + variable.name + '.')			
		}
	}

	def private String defaultValue(Variable variable) {
		val type = variable.variableType.typeFor
		switch type{
			case type.isBoolType:	return "false"	
			case type.isIntType:	return "0"			
			case type.isStringType:	return ""
			case type.isRealType: return "0.0"
		}
	}
	
	def private String defaultRange(Variable variable) {
		val type = variable.variableType.typeFor
		switch type{
			case type.isBoolType:	return ""	
			case type.isIntType:	return "0"			
			case type.isStringType:	return ""
		}
	}
	
	def private void overwriteInput(HashMap<Object, Object> setMap, TeststepBlock teststep) {
		val statements = teststep.assertion.set.setVariables
		var name = ""
		
		for (e : statements) {
			name = e.variable.name.toString			
			if (!e.cascade.empty){
				for (c : e.cascade)
					name += '.' + c.udtVar.name.toString
			}
			
			if(setMap.containsKey(name))
				setMap.replace(name,e.idiom.interpret.toString	)
		}
	}
	
	def private void overwriteOutputIdiom(HashMap<Object, Object> idiomMap, TeststepBlock teststep) {
		val statements = teststep.assertion.assert.assertVariables
		var name = ""
		
		for (e : statements) {
			name = e.variable.name.toString			
			if (!e.cascade.empty){
				for (c : e.cascade)
					name += '.' + c.udtVar.name.toString
			}
			
			if(idiomMap.containsKey(name))
				idiomMap.replace(name,e.idiom.interpret.toString	)
		}
	}
	
	def private void overwriteOutputRange(HashMap<Object, Object> rangeMap, TeststepBlock teststep) {
		val statements = teststep.assertion.assert.assertVariables
		var name = ""
		
		for (e : statements) {
			if(e?.range !== null){
				name = e.variable.name.toString			
				if (!e.cascade.empty){
					for (c : e.cascade)
						name += '.' + c.udtVar.name.toString
				}
			
				if(rangeMap.containsKey(name))
					rangeMap.replace(name,e?.range?.interpret?.toString	)
			}
		}
	}
	
	def private String directionBlock(EObject context) { // context is variable to begin with
		val container = context.eContainer
		if (container instanceof DirectionBlock){
			return switch(context){
				Input: "Input"
				Output: "Output"
				InOut: "InOut"
			}
		} else
			container.directionBlock
	}
	
}
