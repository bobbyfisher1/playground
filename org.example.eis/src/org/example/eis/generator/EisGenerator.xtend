/*
 * generated by Xtext 2.12.0
 */
package org.example.eis.generator

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.example.eis.eis.DefineBlock
import org.example.eis.eis.DirectionBlock
import org.example.eis.eis.EisModel
import org.example.eis.eis.Input
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
// methods -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	def CharSequence compile(EisModel model) {
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
	
	def CharSequence compileTeststeps(DefineBlock define){
		val steps = define?.teststeps
		val inputs = define.direction.input.inputVariables
		val inouts = define.direction?.inout?.inoutVariables
		val outputs = define.direction.output.outputVariables
		val inputMap = new HashMap							// key: name, value: idiom
		val outputMap =  HashMultimap.create()		// key: name, value: [idiom, range]
		var setMap = new HashMap
		var assertMap =  HashMultimap.create()
		
		// add all variables to maps with default values if undefined
		if(!inputs.empty)
			inputMap.generateMap(inputs, '')
		if(!outputs.empty)
			outputMap.generateMultimap(outputs,'')
		if(inouts !== null){
			if(!inouts.empty){										
				inputMap.generateMap(inouts, '')
				outputMap.generateMultimap(inouts,'')
			}
		}
		
		return '''
		«IF !steps.empty»		
					<Teststeps>
		«FOR e : steps»
		«val set = e.assertion.set»
		«val assert = e.assertion.assert»
						<Teststep PlcCycle ="«e.plcCycle»" Description="«e.description»">
							«IF !set.setVariables.empty»
							<Inputs>
«setMap.clear»
«setMap.putAll(inputMap)»
«setMap.overwrite(e)»
«setMap.compileIn(inputs,'')»
							</Inputs>
							«ENDIF»
							«IF !assert.assertVariables.empty»
							<Outputs>
«assertMap.clear»
«assertMap.putAll(outputMap)»
«assertMap.overwrite(e)»
«assertMap.compileOut(e)»
							</Outputs>
							«ENDIF»
						</Teststep>
		«ENDFOR»
					</Teststeps>
		«ENDIF»
		'''
	}
	
	//	don't forget the variant
	// Inout should be InOut in Direction field					
	def CharSequence compileIn(HashMap<Object, Object> setMap, EList<Variables> variables, String name2) {
		var charSeq = ""
		var name = name2
					
		for(variable : variables) {
			if(variable instanceof Variable) {
				name += variable.name
				val value = setMap.get(name).toString
					
				charSeq += 	"						"  //6 TABS 
				charSeq += 	'''<Element xsi:type="Input" Name="«name»" Datatype="«variable.variableType.toString»" Direction="«variable.directionBlock.toString»" Value="«value»" Variant="«variable.variantKeyword.toString»" />'''
				charSeq += 	'''
										'''//newline				
			} else if(variable instanceof Udt){
				name += variable.name + '.'
				setMap.compileIn(variables, name)
			} else if (variable instanceof UdtRef){
				name += variable.name + '.'
				setMap.compileIn(variables, name)
			}
			
		}
		return charSeq
	}
	
	def void generateMap(HashMap<Object, Object> map, EList<Variables> variables, String name2) {
		var name = name2
		for(variable : variables){
			if(variable instanceof Variable){
					name += variable.name
					map.put(name, variable?.idiom?.interpret?.toString ?: variable.defaultValue)
					name = ""					
			} else if(variable instanceof Udt) {
				name += variable.name + '.'
				map.generateMap(variable.udtVariables, name)
			} else if(variable instanceof UdtRef){
				name += variable.name + '.'
				map.generateMap(variable.udtVariables, name)
			}
		}
	}
	
	def void generateMultimap(HashMultimap<Object, Object> multiMap, EList<Variables> variables, String name2) {
		var name = name2		
		for(variable : variables){
			var List<String> list = new ArrayList<String>
			if(variable instanceof Variable){
				list.add(variable?.idiom?.interpret?.toString ?: variable.defaultValue)
				list.add(variable?.range?.interpret?.toString ?: variable.defaultValue)
				name += variable.name
				multiMap.put(name, list)
				name = ''
			} else if(variable instanceof Udt){
				name += variable.name + '.'
				multiMap.generateMultimap(variable.udtVariables, name)
			} else if(variable instanceof UdtRef){
				name += variable.name + '.'
				multiMap.generateMultimap(variable.udtVariables, name)
			}
		}
	}

	def String defaultValue(Variable variable) {
		val type = variable.variableType.typeFor
		
		if(type.isBoolType)				return "false"		 
		else if(type.isIntType)			return "0"
		else if(type.isStringType)	return ""
	}
	
	def void overwrite(HashMap<Object, Object> setMap, TeststepBlock teststep) {
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
	
	def void overwrite(HashMultimap<Object, Object> assertMultiMap, TeststepBlock teststep) {
		val statements = teststep.assertion.assert.assertVariables
						
		for (e : statements) {
			var List<String> list = new ArrayList<String>	
			var name = e.variable.name.toString			
			
			if (!e.cascade.empty){
				for (c : e.cascade)
					name += '.' + c.udtVar.name.toString
			}
			
			if(assertMultiMap.containsKey(name)) {
				list.add(e.idiom.interpret.toString)
				
				if(e.cascade.empty)
					list.add(e?.range?.interpret?.toString ?: (e.variable as Variable).defaultValue)
				else
					list.add(e?.range?.interpret?.toString ?: (e.cascade.last.udtVar as Variable).defaultValue) 			
		
				assertMultiMap.replaceValues(name,list)			
			}
		}
	}
	
	def CharSequence compileOut(HashMultimap<Object, Object> assertMap, TeststepBlock teststep) {}

	def EObject directionBlock(EObject context) { // context is variable to begin with
		val container = context.eContainer
		if (container instanceof DirectionBlock)
			return context //returns Input, Output, InOut and not the container
		else
			container.directionBlock
	}
	
	def void funWithMaps(Input inputs) {
		val defaultMap = new HashMap
		val rangeMap = new HashMap
		for (in : inputs.inputVariables) {
			if (in instanceof Variable) {
				defaultMap.put(in.name, in?.idiom?.interpret)
				rangeMap.put(in.name, in?.range?.interpret)
			}
		}
		var newMap = new HashMap(defaultMap)

		newMap.replace('a', (inputs.inputVariables.last as Variable)?.range?.interpret)

		println("kawabunga")
		println()
	}
}
