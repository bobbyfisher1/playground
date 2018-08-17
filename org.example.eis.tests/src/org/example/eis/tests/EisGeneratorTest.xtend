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

	@Test def void testInput() {
		(beginning + '''
			define{
				input[ 
					variant int a;
					bool b;
				]
				output[	]
			}
			teststep(0, ""){
				set[ 
					b = 1 > -1; 
					a = 3*-4; 
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
										<Element xsi:type="Input" Name="a" Datatype="Variant@Int" Direction="Input" Value="-12" />
										<Element xsi:type="Input" Name="b" Datatype="Bool" Direction="Input" Value="true" />
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

	@Test def void testInputUdts() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						int b;
					}
				]
				output[	]
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
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="43" />
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

	@Test def void testInOuts() {
		(beginning + '''
			define{
				input[ ]
				output[	inout int a = 1 +/- 2 ; ]
			}
			teststep(0, ""){
				set[]
				assert[a=10043;]
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
									</Inputs>
									<Outputs>
										<Element xsi:type="Output" Name="a" Datatype="Int" Direction="InOut" Expect="10043" Range="2" />
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testMultipleInputUdts() {
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
									<Inputs>
										<Element xsi: type="InputUDT" Name="z" Datatype="allovertheplace" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="one" Datatype="String" Direction="Input" Value="zero" />
												<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
													<Elements>
														<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="0" />
														<Element xsi: type="InputUDT" Name="c" Datatype="typeC" Direction="Input">
															<Elements>
																<Element xsi:type="Input" Name="d" Datatype="Bool" Direction="Input" Value="false" />
															</Elements>
														</Element>
													</Elements>
												</Element>
											</Elements>
										</Element>
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="1" Description="">
									<Inputs>
										<Element xsi: type="InputUDT" Name="z" Datatype="allovertheplace" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="one" Datatype="String" Direction="Input" Value="one" />
												<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
													<Elements>
														<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="1" />
														<Element xsi: type="InputUDT" Name="c" Datatype="typeC" Direction="Input">
															<Elements>
																<Element xsi:type="Input" Name="d" Datatype="Bool" Direction="Input" Value="true" />
															</Elements>
														</Element>
													</Elements>
												</Element>
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

	@Test def void testErrorProneUseCase() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						int b;
					}
					int c;
				]
				output[	]
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
								<Teststep PlcCycle ="1" Description="">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="33" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="3" />
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

	@Test def void testInputsAndInOuts() {
		(beginning + '''
			define{
				input[	
					inout udt a(typeA){
						int b;
					}
					int c;
					udt aa(typeAA){
						int bb;
					}
					int cc;
				]
				output[]
			}
			teststep(1, ""){
				set[ 
					a.b = 3;
					aa.bb = 33;
					c = 6;
					cc = 66;
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
								<Teststep PlcCycle ="1" Description="">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="3" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="6" />
										<Element xsi: type="InputUDT" Name="aa" Datatype="typeAA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="bb" Datatype="Int" Direction="Input" Value="33" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="cc" Datatype="Int" Direction="Input" Value="66" />
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

	@Test def void testDefaultValues() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						int b = 46;
					}
					int c = 2;
				]
				output[	]
			}
			teststep(0,"zero"){ set[] assert[] }
			teststep(1, "one"){
				set[ 
					a.b = 3;
					c = 6;
				]
				assert[]
			}
			teststep(2,"two"){ set[] assert[] }
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
								<Teststep PlcCycle ="0" Description="zero">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="46" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="2" />
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="1" Description="one">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="3" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="6" />
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="2" Description="two">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="Input" Value="46" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="2" />
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

	@Test def void testDefaultValuesWithInouts() {
		(beginning + '''
			define{
				input[ variant bool x, y, z; 
					inout udt a(typeA){
						int b = 46;
					}
					int c = 2;
				]
				output[	]
			}
			teststep(0,"zero"){ set[] assert[] }
			teststep(1, "one"){
				set[ 
					a.b = 3;
					c = 6;
					x = true;
					y = true;
					z = true;
				]
				assert[]
			}
			teststep(2,"two"){ set[] assert[] }
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
								<Teststep PlcCycle ="0" Description="zero">
									<Inputs>
										<Element xsi:type="Input" Name="x" Datatype="Variant@Bool" Direction="Input" Value="false" />
										<Element xsi:type="Input" Name="y" Datatype="Variant@Bool" Direction="Input" Value="false" />
										<Element xsi:type="Input" Name="z" Datatype="Variant@Bool" Direction="Input" Value="false" />
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="46" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="2" />
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="1" Description="one">
									<Inputs>
										<Element xsi:type="Input" Name="x" Datatype="Variant@Bool" Direction="Input" Value="true" />
										<Element xsi:type="Input" Name="y" Datatype="Variant@Bool" Direction="Input" Value="true" />
										<Element xsi:type="Input" Name="z" Datatype="Variant@Bool" Direction="Input" Value="true" />
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="3" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="6" />
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="2" Description="two">
									<Inputs>
										<Element xsi:type="Input" Name="x" Datatype="Variant@Bool" Direction="Input" Value="false" />
										<Element xsi:type="Input" Name="y" Datatype="Variant@Bool" Direction="Input" Value="false" />
										<Element xsi:type="Input" Name="z" Datatype="Variant@Bool" Direction="Input" Value="false" />
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="46" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="Input" Value="2" />
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

	@Test def void testUdtRefs() {
		(beginning + '''
			define{
				input[ 
					udt a(typeA){
						variant	int b=22;
					}
					typeA c;
					
				] 
				output[	]
			}
			teststep(0,"zero"){ set[] assert[] }
			teststep(1,"one"){ set[c.b = 44; ] assert[] }
			teststep(2,"two"){ set[ ] assert[] }
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
								<Teststep PlcCycle ="0" Description="zero">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Variant@Int" Direction="Input" Value="22" />
											</Elements>
										</Element>
										<Element xsi: type="InputUDT" Name="c" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Variant@Int" Direction="Input" Value="22" />
											</Elements>
										</Element>
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="1" Description="one">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Variant@Int" Direction="Input" Value="22" />
											</Elements>
										</Element>
										<Element xsi: type="InputUDT" Name="c" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Variant@Int" Direction="Input" Value="44" />
											</Elements>
										</Element>
									</Inputs>
									<Outputs>
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="2" Description="two">
									<Inputs>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Variant@Int" Direction="Input" Value="22" />
											</Elements>
										</Element>
										<Element xsi: type="InputUDT" Name="c" Datatype="typeA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Variant@Int" Direction="Input" Value="22" />
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

	@Test def void testOutput() {
		(beginning + '''
			define{
				input[]
				output[	
					variant int a;
					bool b;
				]
			}
			teststep(0, ""){
				set[	]
				assert[
					b = true; 
					a = 12;
				]
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
									</Inputs>
									<Outputs>
										<Element xsi:type="Output" Name="a" Datatype="Variant@Int" Direction="Output" Expect="12" Range="" />
										<Element xsi:type="Output" Name="b" Datatype="Bool" Direction="Output" Expect="true" Range="" />
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testOutputsAndInOuts() {
		(beginning + '''
			define{
				input[]
				output[
					inout udt a(typeA){
						int b;
					}
					int c;
					udt aa(typeAA){
						int bb;
					}
					int cc;
				]
			}
			teststep(1, ""){
				assert[ 
					a.b = 3;
					aa.bb = 33;
					c = 6;
					cc = 66;
				]
				set[]
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
								<Teststep PlcCycle ="1" Description="">
									<Inputs>
									</Inputs>
									<Outputs>
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Output" Name="b" Datatype="Int" Direction="InOut" Expect="3" Range="" />
											</Elements>
										</Element>
										<Element xsi:type="Output" Name="c" Datatype="Int" Direction="Output" Expect="6" Range="" />
										<Element xsi: type="OutputUDT" Name="aa" Datatype="typeAA" Direction="Output">
											<Elements>
												<Element xsi:type="Output" Name="bb" Datatype="Int" Direction="Output" Expect="33" Range="" />
											</Elements>
										</Element>
										<Element xsi:type="Output" Name="cc" Datatype="Int" Direction="Output" Expect="66" Range="" />
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testAll() {
		(beginning + '''
			define{
				input[int a = 1;]
				output[ 
					int b = 2 +/- 3;
					inout int d = 4 +/- 5; 
					bool c;
				]
			}
			teststep(0, ""){
				set[]
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
											<Element xsi:type="Input" Name="a" Datatype="Int" Direction="Input" Value="1" />
										</Inputs>
										<Outputs>
											<Element xsi:type="Output" Name="b" Datatype="Int" Direction="Output" Expect="2" Range="3" />
											<Element xsi:type="Output" Name="d" Datatype="Int" Direction="InOut" Expect="4" Range="5" />
											<Element xsi:type="Output" Name="c" Datatype="Bool" Direction="Output" Expect="false" Range="" />
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testSignedInt() {
		(beginning + '''
			define{
				input[int a = -1; ]
				output[]
			}
			teststep(0, ""){
				set[]
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
											<Element xsi:type="Input" Name="a" Datatype="Int" Direction="Input" Value="-1" />
										</Inputs>
										<Outputs>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testReal() {
		(beginning + '''
			define{
				input[real a = -1.0; ]
				output[]
			}
			teststep(0, ""){
				set[
					a = -1.0 ;
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
											<Element xsi:type="Input" Name="a" Datatype="Real" Direction="Input" Value="-1.0" />
										</Inputs>
										<Outputs>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testChar() {
		(beginning + '''
			define{
						input[char a = '9'; ]
						output[]
					}
					teststep(0, ""){
						set[]
						assert[]
					}
		''' + ending) => [
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
										<Element xsi:type="Input" Name="a" Datatype="Char" Direction="Input" Value="9" />
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

	@Test def void testByte() {
		(beginning + '''
			define{
				input[byte a ; ]
				output[]
			}
			teststep(1, ""){
				set[ a = 16#aa; ]
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
									<Teststep PlcCycle ="1" Description="">
										<Inputs>
											<Element xsi:type="Input" Name="a" Datatype="Byte" Direction="Input" Value="16#AA" />
										</Inputs>
										<Outputs>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testWord() {
		(beginning + '''
			define{
				input[word a; ]
				output[]
			}
			teststep(1, ""){
				set[ a = 16#AAAA; ]
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
									<Teststep PlcCycle ="1" Description="">
										<Inputs>
											<Element xsi:type="Input" Name="a" Datatype="Word" Direction="Input" Value="16#AAAA" />
										</Inputs>
										<Outputs>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testDWord() {
		(beginning + '''
			define{
				input[dword a; ]
				output[]
			}
			teststep(1, ""){
				set[ a = 16#AAAA_AAAA; ]
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
									<Teststep PlcCycle ="1" Description="">
										<Inputs>
											<Element xsi:type="Input" Name="a" Datatype="DWord" Direction="Input" Value="16#AAAA_AAAA" />
										</Inputs>
										<Outputs>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testLWord() {
		(beginning + '''
			define{
				input[lword a; ]
				output[]
			}
			teststep(1, ""){
				set[ a = 16#Abcd_ef01_AAAA_AAAA; ]
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
									<Teststep PlcCycle ="1" Description="">
										<Inputs>
											<Element xsi:type="Input" Name="a" Datatype="LWord" Direction="Input" Value="16#ABCD_EF01_AAAA_AAAA" />
										</Inputs>
										<Outputs>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testUDInt() {
		(beginning + '''
			define{
				input[
					inout udint a; 
				]
				output[
					inout ulint b;
				]
			}
			teststep(1, ""){
				set[]
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
									<Teststep PlcCycle ="1" Description="">
										<Inputs>
											<Element xsi:type="Input" Name="a" Datatype="UDInt" Direction="InOut" Value="0" />
										</Inputs>
										<Outputs>
											<Element xsi:type="Output" Name="b" Datatype="ULInt" Direction="InOut" Expect="0" Range="" />
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

	@Test def void testTimes() {
		(beginning + '''
			define{
				input[
					inout time a = T#5d12M2s; 
				]
				output[
					inout ltime b = LT#99ms456us239ns;
				]
			}
			teststep(1, ""){
				set[]
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
									<Teststep PlcCycle ="1" Description="">
										<Inputs>
											<Element xsi:type="Input" Name="a" Datatype="Time" Direction="InOut" Value="T#5d12m2s" />
										</Inputs>
										<Outputs>
											<Element xsi:type="Output" Name="b" Datatype="LTime" Direction="InOut" Expect="LT#99ms456us239ns" Range="" />
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
	}

}
