/*
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.generator

import com.google.inject.Inject
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.eis.EisModelUtil
import org.xtext.eis.eis.Cascade
import org.xtext.eis.eis.DefineBlock
import org.xtext.eis.eis.DirectionBlock
import org.xtext.eis.eis.EisModel
import org.xtext.eis.eis.InOut
import org.xtext.eis.eis.Input
import org.xtext.eis.eis.Output
import org.xtext.eis.eis.Statement
import org.xtext.eis.eis.TeststepBlock
import org.xtext.eis.eis.Udt
import org.xtext.eis.eis.UdtRef
import org.xtext.eis.eis.Variable
import org.xtext.eis.eis.Variables
import org.xtext.eis.eis.impl.UdtImpl
import org.xtext.eis.eis.impl.UdtTypeImpl
import org.xtext.eis.eis.impl.VariableImpl
import org.xtext.eis.interpreter.EisInterpreter
import org.xtext.eis.typing.DefineTypeComputer

class EisGenerator extends AbstractGenerator {


	@Inject extension EisInterpreter
	@Inject extension DefineTypeComputer
	@Inject extension EisModelUtil
		
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.toIterable.filter(EisModel).head
		fsa.generateFile('''«model.plcName»_Testfixture.xml''', model.compile)
	}
	
//
// generation methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def private CharSequence compile(EisModel model) {
		var testcaseID = 0
		'''
			<?xml version="1.0" encoding="utf-8"?>
			<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
				<TiaProjectName>«model.projectName»</TiaProjectName>
				<PlcName>«model.plcName»</PlcName>
				<Author>«model.authorName»</Author>
				<TestCases>
			«FOR testcases : model.testcases»
					«val testblock = testcases?.testblock»
							<TestCase ID="«testcaseID++»"«IF testblock !== null» TestActive="«testblock.testActive.value»" Blockname="«testcases.testcaseName»" Blocktype="«testblock.blockType.value»" Description="«testblock.description»"«ENDIF»>
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
		val outputs = define.direction.output.outputVariables
		var inouts = define.direction?.inout?.inoutVariables
		
		
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
		
		val multiLineString = '''
		«IF !steps.empty»		
		«oneTab + twoTabs»<Teststeps>
		«FOR e : steps»
		«fourTabs»<Teststep PlcCycle ="«e.plcCycle.intValue»" Description="«e.description»">
		«fiveTabs»<Inputs>
		«setMap.clear»
		«setMap.putAll(inputMap)»
		«setMap.overwriteInput(e)»
		«inputs.compileIn(setMap,'', sixTabs)»
		«IF inouts !== null»
		«inouts?.clear»
		«IF (inouts += addInoutsInSet(setMap, e))»«ENDIF»		
		«IF inouts !== null»«inouts.compileIn(setMap, '', sixTabs)»«ENDIF»
		«ENDIF»
		«fiveTabs»</Inputs>
		«fiveTabs»<Outputs>
		«assertIdiomMap.clear»
		«assertRangeMap.clear»
		«assertIdiomMap.putAll(outputIdiomMap)»
		«assertRangeMap.putAll(outputRangeMap)»
		«assertIdiomMap.overwriteOutputIdiom(e)»
		«assertRangeMap.overwriteOutputRange(e)»
		«outputs.compileOut(assertIdiomMap, assertRangeMap, '', sixTabs)»
		«IF inouts !== null»
		«inouts?.clear»
		«IF inouts += addInoutsInAssert(assertIdiomMap, assertRangeMap, e)»«ENDIF»
		«IF inouts !== null»«inouts.compileOut(assertIdiomMap, assertRangeMap, '', sixTabs)»«ENDIF»
		«ENDIF»
		«fiveTabs»</Outputs>
		«fourTabs»</Teststep>
		«ENDFOR»
		«oneTab + twoTabs»</Teststeps>
		«ENDIF»
		'''
		
		return multiLineString
	}	
	
	def private CharSequence compileIn(EList<Variables> variables, HashMap<Object, Object> setMap,  String qualifiedName, String indent) {
		var charSeq = ""
		
		for(variable : variables) {		
			if(variable instanceof Variable) {
				val value = setMap.get(qualifiedName + variable.name).toString

				charSeq += indent +	'''<Element xsi:type="Input" Name="«variable.name»" «variable.datatype»" Direction="«variable.directionBlock»" Value="«value»" />
				'''//newline
			} else if(variable instanceof Udt)	
				charSeq += buildUdt(setMap, qualifiedName, indent, variable) 
		 	else if (variable instanceof UdtRef)				
				charSeq += buildUdtRef(setMap,qualifiedName,indent, variable)					
		}		
		return charSeq
	}
		
	def private CharSequence buildUdt(HashMap<Object, Object> setMap, String qualifiedName, String indent, Udt udt) {
		var charSeq = ""
		val tab = "	"
				
		charSeq += indent
		charSeq += '''<Element xsi: type="InputUDT" Name="«udt.name»" '''
		charSeq += '''Datatype="«udt.udtType.name»" '''
		charSeq += '''Direction="«udt.directionBlock»">
		'''//newline				
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += udt.udtVariables.compileIn(setMap, qualifiedName + udt.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
	def private CharSequence buildUdtRef(HashMap<Object, Object> setMap, String qualifiedName, String indent, UdtRef udtRef) {
		var charSeq = ""
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="InputUDT" Name="«udtRef.name»" Datatype="«udtRef.udtType.name.toString»" Direction="«udtRef.directionBlock»">
		'''//newline		
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += udtRef.udtVariables.compileIn(setMap, qualifiedName + udtRef.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
	def private CharSequence compileOut(EList <Variables> variables, HashMap<Object, Object> idiomMap,HashMap<Object, Object> rangeMap , String qualifiedName, String indent) {
		var charSeq = ""

		for (variable : variables) {
			if (variable instanceof Variable) {
				val idiom = idiomMap.get(qualifiedName + variable.name).toString
				val range = rangeMap.get(qualifiedName + variable.name).toString
					
				charSeq +=	indent + '''<Element xsi:type="Output" Name="«variable.name»" «variable.datatype»" Direction="«variable.directionBlock»" Expect="«idiom»" Range="«range»" />
				''' // newline
					
			} else if (variable instanceof Udt)
				charSeq += buildUdt(variable, idiomMap, rangeMap, qualifiedName, indent)
			else if (variable instanceof UdtRef)
				charSeq += buildUdtRef(variable, idiomMap, rangeMap, qualifiedName, indent)
		}
		return charSeq
	}
		
	def private CharSequence buildUdt(Udt udt, HashMap<Object, Object> idiomMap, HashMap<Object, Object> rangeMap, String qualifiedName, String indent) {
		var charSeq = "" 
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="OutputUDT" Name="«udt.name»" ''' 
		charSeq += '''Datatype="«udt.udtType.name»" '''
		charSeq += '''Direction="«udt.directionBlock»">
		'''//newline				
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += udt.udtVariables.compileOut(idiomMap, rangeMap, qualifiedName + udt.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
	def private CharSequence buildUdtRef(UdtRef udtRef, HashMap<Object, Object> idiomMap, HashMap<Object, Object> rangeMap, String qualifiedName, String indent) {
		var charSeq = "" 
		val tab = "	"
		
		charSeq += indent
		charSeq += '''<Element xsi: type="OutputUDT" Name="«udtRef.name»" Datatype="«udtRef.udtType.name.toString»" Direction="«udtRef.directionBlock»">
		'''//newline		
				
		val indentPlus = indent + tab //indent++ 
		charSeq += indentPlus + '''<Elements>
		''' //newline
				
		val indentPlusPlus = indentPlus + tab //indent++
		charSeq += udtRef.udtVariables.compileOut(idiomMap, rangeMap, qualifiedName + udtRef.name + '.', indentPlusPlus)
								
		charSeq += indentPlus + '''</Elements>
		'''//newline
				
		charSeq += indent + '''</Element>
		'''//newline
		
		return charSeq
	}
	
//
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//	
	def private CharSequence getDatatype(Variable variable){
		var _char = ""
		var type = variable.variableType
		var string = type.toString.toFirstUpper
		
		_char += '''Datatype="'''		
		
		if(variable.variantKeyword){
			_char += "Variant@"		
		}
		if(type.typeFor.isSecondLetterCapitalized || type.isSecondLetterCapitalized){
			string =	string.toCharUpper(1)
		}
		if(type.typeFor.isThirdLetterCapitalized){
			string = string.toCharUpper(2)
		}
		
		_char += string
		
		return _char
	}

	def private void generateMap(HashMap<Object, Object> map, EList<Variables> variables, String name) {
		for(variable : variables){
			if(variable instanceof Variable)
				map.put(name + variable.name, variable?.idiom?.interpret?.toString ?: variable.defaultValue)
			 else if(variable instanceof Udt) 
				map.generateMap(variable.udtVariables, name + variable.name + '.')
			 else if(variable instanceof UdtRef)
				map.generateMap(variable.udtVariables, name + variable.name + '.')			
		}
	}
	
	def private void generateRangeMap(HashMap<Object, Object> map, EList<Variables> variables, String name) {
		for(variable : variables){
			if(variable instanceof Variable)
				map.put(name + variable.name, variable?.range?.interpret?.toString ?: '')
			 else if(variable instanceof Udt) 
				map.generateRangeMap(variable.udtVariables, name + variable.name + '.')
			 else if(variable instanceof UdtRef)
				map.generateRangeMap(variable.udtVariables, name + variable.name + '.')			
		}
	}

	def private String defaultValue(Variable variable) {
		val type = variable.variableType.typeFor
		switch type{
			case type.isBoolType:	"false"	
			case type.isIntSuperType:	  "0"			
			case type.isStringType: ""
			case type.isRealType:  "0.0"
			case type.isByteType:  "16#00"
			case type.isWordType:  "16#0000"
			case type.isDWordType:  "16#0000_0000"
			case type.isLWordType:  "16#0000_0000_0000_0000"
			default: ''
		}		
	}
	
	def private void overwriteInput(HashMap<Object, Object> setMap, TeststepBlock teststep) {
		val statements = teststep.assertion.set.setVariables
		var name = ""		
		
		for (e : statements) {
			name = buildName(e)
			
			if(!(e.variable.eContainer.directionBlock == "InOut"))		
				 if(setMap.containsKey(name))
					setMap.replace(name, e.checkIfIdiomNull	)
		}
	}
	
	def private List<Variables> addInoutsInSet(HashMap<Object, Object> setMap, TeststepBlock teststep) {
		val statements = teststep.assertion.set.setVariables						
		var LinkedList<Variables> inoutsInSet = new LinkedList	
		
		for (e : statements) {
			if(e.variable.eContainer.directionBlock == "InOut"){															
				if(e.cascade.empty){							
					var newVariable = new VariableImpl		
					newVariable.name = e.variable.name
					newVariable.variableType = (e.variable as Variable).variableType 
					newVariable.variantKeyword = (e.variable as Variable).variantKeyword
					inoutsInSet.add(newVariable)
				}			
				else {	
					var newUdt = new UdtImpl
					newUdt.name = e.variable.name
					var newUdtType = new UdtTypeImpl;					
					if(e.variable instanceof Udt)
						newUdtType.name = (e.variable as Udt).udtType.name
					else if(e.variable instanceof UdtRef)
						newUdtType.name = (e.variable as UdtRef).udtType.name
					newUdt.udtType = newUdtType					
					newUdt.udtVariables.add(generateUdtVariables(e.cascade))
					inoutsInSet.add(newUdt)					
				}							
				setMap.put(buildName(e), e.checkIfIdiomNull)											
			}
		}
		return inoutsInSet
	}
	
	def private String checkIfIdiomNull(Statement e){
		var idiom = e?.idiom?.interpret?.toString 
				
		if( idiom === null){
			if(e.cascade.empty){
				idiom = (e.variable as Variable)?.idiom?.interpret?.toString ?: ""
			} else {						
				idiom = (e.cascade.last.udtVar as Variable)?.idiom?.interpret?.toString ?: ""
			}
		}				
		 return idiom
	}
	
	def private String checkIfRangeNull(Statement e){
		var range = e?.range?.interpret?.toString
				
		if(range === null){
			if(e.cascade.empty){
				range = (e.variable as Variable)?.range?.interpret?.toString ?: ""
			} else {						
				range = (e.cascade.last.udtVar as Variable)?.range?.interpret?.toString ?: ""
			}
		}				
		 return range
	}
	
	def private List<Variables> addInoutsInAssert(HashMap<Object, Object> assertIdiomMap, HashMap<Object, Object> assertRangeMap, TeststepBlock teststep) {
		val statements = teststep.assertion.assert.assertVariables		
		var LinkedList<Variables> inoutsInAssert = new LinkedList 		
		
		for (e : statements) {
			if(e.variable.eContainer.directionBlock == "InOut"){
				if(e.cascade.empty){							
					var newVariable = new VariableImpl		
					newVariable.name = e.variable.name
					newVariable.variableType = (e.variable as Variable).variableType 
					newVariable.variantKeyword = (e.variable as Variable).variantKeyword
					inoutsInAssert.add(newVariable)
				}			
				else {	
					var newUdt = new UdtImpl
					newUdt.name = e.variable.name					
					var newUdtType = new UdtTypeImpl
					if(e.variable instanceof Udt)
						newUdtType.name = (e.variable as Udt).udtType.name
					else if(e.variable instanceof UdtRef)
						newUdtType.name = (e.variable as UdtRef).udtType.name
					newUdt.udtType = newUdtType
					newUdt.udtVariables.add(generateUdtVariables(e.cascade))
					inoutsInAssert.add(newUdt)
				}
				assertIdiomMap.put(buildName(e), e.checkIfIdiomNull)				
				assertRangeMap.put(buildName(e), e.checkIfRangeNull)					
			}
		}
		return inoutsInAssert
	}
	
	def private Variables generateUdtVariables(Iterable<Cascade> cascade) {
		if(cascade.length > 1){
			var newUdt = new UdtImpl
			newUdt.name = cascade.get(0).udtVar.name			
			var newUdtType = new UdtTypeImpl
			
			if(cascade.get(0).udtVar instanceof Udt)
				newUdtType.name = (cascade.get(0).udtVar as Udt).udtType.name
			else if(cascade.get(0).udtVar instanceof UdtRef)				 
				newUdtType.name = (cascade.get(0).udtVar as UdtRef).udtType.name
			newUdt.udtType = newUdtType
			newUdt.udtVariables.add(generateUdtVariables(cascade.drop(1)))
			return newUdt
		} else {
			var newVariable = new VariableImpl	
			newVariable.name = (cascade.get(0).udtVar as Variable).name
			newVariable.variableType = (cascade.get(0).udtVar as Variable).variableType 
			newVariable.variantKeyword = (cascade.get(0).udtVar as Variable).variantKeyword
			return newVariable					
		}
	}
	
	def private void overwriteOutputIdiom(HashMap<Object, Object> idiomMap, TeststepBlock teststep) {
		val statements = teststep.assertion.assert.assertVariables
		var name = ""
		
		for (e : statements) {
			name = buildName(e)

			if(!(e.variable.eContainer.directionBlock == "InOut"))
			 	if(idiomMap.containsKey(name))
					idiomMap.replace(name,e.checkIfIdiomNull)
		}
	}
	
	def private String buildName(Statement e) {
		var name = e.variable.name.toString			
			if (!e.cascade.empty){
				for (c : e.cascade)
					name += '.' + c.udtVar.name.toString
			}
		return name
	}
	
	def private void overwriteOutputRange(HashMap<Object, Object> rangeMap, TeststepBlock teststep) {
		val statements = teststep.assertion.assert.assertVariables
		var name = ""
		
		for (e : statements) {
			name = buildName(e)			

			if(e?.range !== null){			
				if(!(e.variable.eContainer instanceof InOut))
			 		if(rangeMap.containsKey(name))
						rangeMap.replace(name, e.checkIfRangeNull)				
			}  
//			else if(e.variable.directionBlock === "InOut"){ // range is not defined in statement but does it have a default value?
//				if(e.cascade.empty) {
//					val range = (e.variable as Variable)?.range					
//					if(range !== null)
//						rangeMap.put(name, range.interpret.toString)				
//				}//cascade is not empty 
//				else {
//					val range = (e.cascade.last as Variable)?.range
//						if(range !== null)
//						rangeMap.put(name, range.interpret.toString)			
//				}								
//			}
		}
	}
	
	def private String directionBlock(EObject context) { // context is variable to begin with
		val container = context?.eContainer
		if (container instanceof DirectionBlock){
			return switch(context){
				Input: "Input"
				Output: "Output"
				InOut: "InOut"
			}
		} else if(container === null)
			return  "InOut"
		else
			container.directionBlock
	}
		
}
