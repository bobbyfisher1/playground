package org.example.eis.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.example.eis.eis.EisModel
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class EisGeneratorTest {
	@Inject extension ParseHelper<EisModel>
	@Inject extension ValidationTestHelper
	@Inject extension CompilationTestHelper

//
// variables -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	val beginning = '''	
		project = "project";
		plcname = "plcname";
		author 	= "author";
		testcase Testcase{
			testActive = false;
			blockType = FC;
			description = "description";
	'''
	val ending = "}"

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testEmptiness() {
		'''
			project = "project";
			plcname = "plcname";
			author 	= "author";
			testcase Testcase{}
		''' => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0">
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testBeginning() {
		(beginning + ending) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testMultipleEmptyTestCases() {
		(beginning + ending + "testcase Test1{} testcase Test2{}") => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
						</TestCase>
						<TestCase ID="1">
						</TestCase>
						<TestCase ID="2">
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testEmptyDefineBlock() {
		(beginning + '''
			define{
				input[]
				output[]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testDefineBlockWithVariables() {
		(beginning + '''
			define{
				input[ 
					variant int a;
					bool b;
				]
				output[	]
				inout[  ]
			}
			teststep(0, ""){
				set[ 
					b = true; 
					a = 12; 
				]
				assert[]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
							<Teststeps>
								<Teststep PlcCycle ="0" Description="">
									<Inputs>
										<Element xsi:type="Input" Name="a" Datatype="int" Direction="Input" Value="12" Variant="true" />
										<Element xsi:type="Input" Name="b" Datatype="bool" Direction="Input" Value="true" Variant="false" />
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testDefineBlockWithUdts() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						int b;
					}
				]
				output[	]
				inout[  ]
			}
			teststep(0, ""){
				set[ 
					a.b = 43;
				]
				assert[]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
							<Teststeps>
								<Teststep PlcCycle ="0" Description="">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="int" Direction="Input" Value="43" Variant="false" />
											</Elements>
										</Element>
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testDefineBlockWithUdtsAndInOuts() {
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ int a; ]
			}
			teststep(0, ""){
				set[ 
					a = 43;
				]
				assert[]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
							<Teststeps>
								<Teststep PlcCycle ="0" Description="">
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testDefineBlockWithCrazyUdts() {
		(beginning + '''
			define{
				input[ 
					udt z(allovertheplace){
						string one = "zero";
						udt a(typeA){
							int b;
							udt c(typeC){
								bool d;
							}
						}
					}
				]
				output[	]
				//inout[  ]
			}
			teststep(0, ""){
				set[]
				assert[]
			}
			teststep(1, ""){
				set[ 
					z.a.b = 1;
					z.a.c.d = true;
					z.one = "one";
				]
				assert[]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
							<Teststeps>
								<Teststep PlcCycle ="0" Description="">
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testAbgespeckt() {
		(beginning + '''
			define{
				inout[ 
					udt a(typeA){
						int b;
					}
					int c;
				]
				output[	]
				input[  ]
			}
			teststep(0, ""){
				set[]
				assert[]
			}
			teststep(1, ""){
				set[ 
					a.b = 33;
					c = 3;
				]
				assert[]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo(
		'''
				<?xml version="1.0" encoding="utf-8"?>
				<TestFixture xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<TiaProjectName>project</TiaProjectName>
					<PlcName>plcname</PlcName>
					<Author>author</Author>
					<TestCases>
						<TestCase ID="0" TestActive="false" Blockname="Testcase" Blocktype="FC" Description="description">
							<Teststeps>
								<Teststep PlcCycle ="0" Description="">
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}
}
