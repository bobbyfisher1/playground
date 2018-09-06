package org.xtext.eis.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.eis.eis.EisModel

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
		testcase Testcase(false, FC, "description") {
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
		(beginning + ending + '''testcase Test1(false, FC, "" ) {} testcase Test2(false, FC, "" ) {}''') => [
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
						<TestCase ID="1" TestActive="false" Blockname="Test1" Blocktype="FC" Description="">
						</TestCase>
						<TestCase ID="2" TestActive="false" Blockname="Test2" Blocktype="FC" Description="">
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
				inout[]
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
				inout[]
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
				output[	]
				inout[ int a,b; ]
			}
			teststep(0, ""){
				set[ a = 43;	]
				assert[b=99;]
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
										<Element xsi:type="Input" Name="a" Datatype="Int" Direction="InOut" Value="43" />
									</Inputs>
									<Outputs>
										<Element xsi:type="Output" Name="b" Datatype="Int" Direction="InOut" Expect="99" Range="" />
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testInOutsExcessively() {
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ int a,b; ]
			}
			teststep(0, ""){
				set[ a = 43;	]
				assert[b=99;]
			}
			teststep(1, ""){
				assert[ a = 43;]
				set[b=99;]
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
										<Element xsi:type="Input" Name="a" Datatype="Int" Direction="InOut" Value="43" />
									</Inputs>
									<Outputs>
										<Element xsi:type="Output" Name="b" Datatype="Int" Direction="InOut" Expect="99" Range="" />
									</Outputs>
								</Teststep>
								<Teststep PlcCycle ="1" Description="">
									<Inputs>
										<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="99" />
									</Inputs>
									<Outputs>
										<Element xsi:type="Output" Name="a" Datatype="Int" Direction="InOut" Expect="43" Range="" />
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testInOutsExcessively2() {
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						int b;
						int c;
					}
					]
			}
			teststep(0, ""){
				set[ a.b = 43; a.c=99;	]
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
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="43" />
											</Elements>
										</Element>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="99" />
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
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						int b;
						int c;
					}
					]
			}
			teststep(0, ""){
				set[ a.b = 43; 	]
				assert[a.c=99;]
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
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="43" />
											</Elements>
										</Element>
									</Inputs>
									<Outputs>
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Output" Name="c" Datatype="Int" Direction="InOut" Expect="99" Range="" />
											</Elements>
										</Element>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						int b;
						int c;
					}
					]
			}
			teststep(0, ""){
				set[ a.c=99; 	]
				assert[a.b = 43;]
			}
		''' + ending ) => [
			parse.assertNoErrors
			assertCompilesTo('''
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
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="99" />
											</Elements>
										</Element>
									</Inputs>
									<Outputs>
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Output" Name="b" Datatype="Int" Direction="InOut" Expect="43" Range="" />
											</Elements>
										</Element>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
	}

	@Test def void testInOutsExcessively3() {
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						udt b(typeB){
							int c;
						}
					}
					]
			}
			teststep(0, ""){
				set[ a.b.c = 43; ]
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
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="InputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="43" />
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
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						udt b(typeB){
							int c,d;
						}
						
					}
					]
			}
			teststep(0, ""){
				set[ a.b.c = 43; a.b.d =2; ]
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
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="InputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="43" />
													</Elements>
												</Element>
											</Elements>
										</Element>
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="InputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Input" Name="d" Datatype="Int" Direction="InOut" Value="2" />
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

		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						udt b(typeB){
							int c,d;
						}
						
					}
					]
			}
			teststep(0, ""){
				set[  ]
				assert[a.b.c = 43; a.b.d =2;]
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
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="OutputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Output" Name="c" Datatype="Int" Direction="InOut" Expect="43" Range="" />
													</Elements>
												</Element>
											</Elements>
										</Element>
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="OutputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Output" Name="d" Datatype="Int" Direction="InOut" Expect="2" Range="" />
													</Elements>
												</Element>
											</Elements>
										</Element>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						udt b(typeB){
							 variant int c,d;
						}
						
					}
					]
			}
			teststep(0, ""){
				set[  ]
				assert[a.b.c = 43; a.b.d =2;]
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
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="OutputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Output" Name="c" Datatype="Variant@Int" Direction="InOut" Expect="43" Range="" />
													</Elements>
												</Element>
											</Elements>
										</Element>
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="OutputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Output" Name="d" Datatype="Variant@Int" Direction="InOut" Expect="2" Range="" />
													</Elements>
												</Element>
											</Elements>
										</Element>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					udt a(typeA){
						udt b(typeB){
							int c,d;
						}
						
					}
					]
			}
			teststep(0, ""){
				set[  ]
				assert[a.b.c = 43; a.b.d =2;]
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
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="OutputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Output" Name="c" Datatype="Int" Direction="InOut" Expect="43" Range="" />
													</Elements>
												</Element>
											</Elements>
										</Element>
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi: type="OutputUDT" Name="b" Datatype="typeB" Direction="InOut">
													<Elements>
														<Element xsi:type="Output" Name="d" Datatype="Int" Direction="InOut" Expect="2" Range="" />
													</Elements>
												</Element>
											</Elements>
										</Element>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
					int a = 1 +/- 2;	
					
				]
			}
			teststep(0, ""){
				set[  ]
				assert[a = 5;]
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
										<Element xsi:type="Output" Name="a" Datatype="Int" Direction="InOut" Expect="5" Range="2" />
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
		]
		(beginning + '''
			define{
				input[ ]
				output[	]
				inout[ 
				udt a(typeA){
					int a = 1 +/- 2;	
					}
				]
			}
			teststep(0, ""){
				set[  ]
				assert[a.a = 5;]
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
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Output" Name="a" Datatype="Int" Direction="InOut" Expect="5" Range="2" />
											</Elements>
										</Element>
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
				inout[ 
					udt a(typeA){
						int b;
					}
					int c;
				]
				output[	]
				input[]
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
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="33" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="3" />
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
				inout[ 
					udt a(typeA){
						int b;
					}
					int c;
				]
				output[	]
				input[ 
					udt aa(typeAA){
						int bb;
					}
					int cc;
				]
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
										<Element xsi: type="InputUDT" Name="aa" Datatype="typeAA" Direction="Input">
											<Elements>
												<Element xsi:type="Input" Name="bb" Datatype="Int" Direction="Input" Value="33" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="cc" Datatype="Int" Direction="Input" Value="66" />
										<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Input" Name="b" Datatype="Int" Direction="InOut" Value="3" />
											</Elements>
										</Element>
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="6" />
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
				input[ variant bool x, y, z; ] 
				inout[
					udt a(typeA){
						int b = 46;
					}
					int c = 2;
				]
				output[	]
			}
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
										<Element xsi:type="Input" Name="c" Datatype="Int" Direction="InOut" Value="6" />
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
				inout[ 
					udt a(typeA){
						int b;
					}
					int c;
				]
				input[	]
				output[ 
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
										<Element xsi: type="OutputUDT" Name="aa" Datatype="typeAA" Direction="Output">
											<Elements>
												<Element xsi:type="Output" Name="bb" Datatype="Int" Direction="Output" Expect="33" Range="" />
											</Elements>
										</Element>
										<Element xsi:type="Output" Name="cc" Datatype="Int" Direction="Output" Expect="66" Range="" />
										<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
											<Elements>
												<Element xsi:type="Output" Name="b" Datatype="Int" Direction="InOut" Expect="3" Range="" />
											</Elements>
										</Element>
										<Element xsi:type="Output" Name="c" Datatype="Int" Direction="InOut" Expect="6" Range="" />
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
				input[]
				output[
				 	 udt All(TypeAll){
				 	 variant int a = 14 +/- 3;
				 	 variant bool b = true;
				 	 variant real c = 3.4 +/- 1.1;
				 	 variant string d = "hahaha" ;
				 	 variant char e = '9';						
				 	 variant byte f = 16#02;		
				 	 variant word g = 16#1234;
				 	 variant dword h = 16#9876_5432;
				 	 variant lword i = 16#abcd_efAB_CDEF_0123;
				 	 variant usint j = 1 +/- 5;
				 	 variant uint k = 256 +/- 7;
				 	 variant udint l = 123456 +/- 987654;
				 	 variant ulint m = 123456798 +/- 3;
				 	 variant sint n = -1 +/- -25;
				 	 variant dint o = -25600 +/- (-8545000);
				 	 variant lint p = -222222222 +/- 9999999;
				 	 variant time q = T#40s;		
				 	 variant ltime r = LT#400d9ns;
				 	 variant date s = D#2018-08-22;
					 variant wchar t = 'w';
					 variant lreal u = 1.2;
					}
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
									</Inputs>
									<Outputs>
										<Element xsi: type="OutputUDT" Name="All" Datatype="TypeAll" Direction="Output">
											<Elements>
												<Element xsi:type="Output" Name="a" Datatype="Variant@Int" Direction="Output" Expect="14" Range="3" />
												<Element xsi:type="Output" Name="b" Datatype="Variant@Bool" Direction="Output" Expect="true" Range="" />
												<Element xsi:type="Output" Name="c" Datatype="Variant@Real" Direction="Output" Expect="3.4" Range="1.1" />
												<Element xsi:type="Output" Name="d" Datatype="Variant@String" Direction="Output" Expect="hahaha" Range="" />
												<Element xsi:type="Output" Name="e" Datatype="Variant@Char" Direction="Output" Expect="9" Range="" />
												<Element xsi:type="Output" Name="f" Datatype="Variant@Byte" Direction="Output" Expect="16#02" Range="" />
												<Element xsi:type="Output" Name="g" Datatype="Variant@Word" Direction="Output" Expect="16#1234" Range="" />
												<Element xsi:type="Output" Name="h" Datatype="Variant@DWord" Direction="Output" Expect="16#9876_5432" Range="" />
												<Element xsi:type="Output" Name="i" Datatype="Variant@LWord" Direction="Output" Expect="16#ABCD_EFAB_CDEF_0123" Range="" />
												<Element xsi:type="Output" Name="j" Datatype="Variant@USInt" Direction="Output" Expect="1" Range="5" />
												<Element xsi:type="Output" Name="k" Datatype="Variant@UInt" Direction="Output" Expect="256" Range="7" />
												<Element xsi:type="Output" Name="l" Datatype="Variant@UDInt" Direction="Output" Expect="123456" Range="987654" />
												<Element xsi:type="Output" Name="m" Datatype="Variant@ULInt" Direction="Output" Expect="123456798" Range="3" />
												<Element xsi:type="Output" Name="n" Datatype="Variant@SInt" Direction="Output" Expect="-1" Range="-25" />
												<Element xsi:type="Output" Name="o" Datatype="Variant@DInt" Direction="Output" Expect="-25600" Range="-8545000" />
												<Element xsi:type="Output" Name="p" Datatype="Variant@LInt" Direction="Output" Expect="-222222222" Range="9999999" />
												<Element xsi:type="Output" Name="q" Datatype="Variant@Time" Direction="Output" Expect="T#40s" Range="" />
												<Element xsi:type="Output" Name="r" Datatype="Variant@LTime" Direction="Output" Expect="LT#400d9ns" Range="" />
												<Element xsi:type="Output" Name="s" Datatype="Variant@Date" Direction="Output" Expect="D#2018-08-22" Range="" />
												<Element xsi:type="Output" Name="t" Datatype="Variant@WChar" Direction="Output" Expect="w" Range="" />
												<Element xsi:type="Output" Name="u" Datatype="Variant@LReal" Direction="Output" Expect="1.2" Range="" />
											</Elements>
										</Element>
									</Outputs>
								</Teststep>
							</Teststeps>
						</TestCase>
					</TestCases>
				</TestFixture>
			''')
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
				input[
					real a = -1.0000000000000009; //another decimal and the real rounds the digit
				]
				output[]
			}
			teststep(0, ""){
				set[	]
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
											<Element xsi:type="Input" Name="a" Datatype="Real" Direction="Input" Value="-1.0000000000000009" />
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
				input[ udint a; ]
				output[ ulint b; ]
			}
			teststep(1, ""){
				set[ a=0; ]
				assert[ b=0;]
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
											<Element xsi:type="Input" Name="a" Datatype="UDInt" Direction="Input" Value="0" />
										</Inputs>
										<Outputs>
											<Element xsi:type="Output" Name="b" Datatype="ULInt" Direction="Output" Expect="0" Range="" />
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
					 time a = T#5d12M2s; 
				]
				output[
					 ltime b = LT#99ms456us239ns;
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
											<Element xsi:type="Input" Name="a" Datatype="Time" Direction="Input" Value="T#5d12m2s" />
										</Inputs>
										<Outputs>
											<Element xsi:type="Output" Name="b" Datatype="LTime" Direction="Output" Expect="LT#99ms456us239ns" Range="" />
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

	@Test def void testUdtRef() {
		var ref = '''	
		define{
			input[
				udt a(typeA){
					time b=T#4s;
				}
				typeA z; 
			]
			output[
		
			]
		}
		teststep(1, ""){
			set[]
			assert[]
		}'''

		(beginning + ref + ending) => [
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
													<Element xsi:type="Input" Name="b" Datatype="Time" Direction="Input" Value="T#4s" />
												</Elements>
											</Element>
											<Element xsi: type="InputUDT" Name="z" Datatype="typeA" Direction="Input">
												<Elements>
													<Element xsi:type="Input" Name="b" Datatype="Time" Direction="Input" Value="T#4s" />
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
				'''
			)
		]
		ref = '''	
		define{
			output[
				udt a(typeA){
					lint b=14 +/-9;
				}
				typeA z; 
			]
			input[
		
			]
		}
		teststep(1, ""){
			set[]
			assert[]
		}'''

		(beginning + ref + ending) => [
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
											<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="Output">
												<Elements>
													<Element xsi:type="Output" Name="b" Datatype="LInt" Direction="Output" Expect="14" Range="9" />
												</Elements>
											</Element>
											<Element xsi: type="OutputUDT" Name="z" Datatype="typeA" Direction="Output">
												<Elements>
													<Element xsi:type="Output" Name="b" Datatype="LInt" Direction="Output" Expect="14" Range="9" />
												</Elements>
											</Element>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
		ref = '''	
		define{
			output[
				udt a(typeA){
					lint b=14 +/-9;
					udt c(typeC){ 
						udt f(typeF){
							date dd=D#2053-05-23;
						}
					}
				}
				typeA z; 
			]
			input[]
		}
		teststep(1, ""){
			set[]
			assert[]
		}'''

		(beginning + ref + ending) => [
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
											<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="Output">
												<Elements>
													<Element xsi:type="Output" Name="b" Datatype="LInt" Direction="Output" Expect="14" Range="9" />
													<Element xsi: type="OutputUDT" Name="c" Datatype="typeC" Direction="Output">
														<Elements>
															<Element xsi: type="OutputUDT" Name="f" Datatype="typeF" Direction="Output">
																<Elements>
																	<Element xsi:type="Output" Name="dd" Datatype="Date" Direction="Output" Expect="D#2053-05-23" Range="" />
																</Elements>
															</Element>
														</Elements>
													</Element>
												</Elements>
											</Element>
											<Element xsi: type="OutputUDT" Name="z" Datatype="typeA" Direction="Output">
												<Elements>
													<Element xsi:type="Output" Name="b" Datatype="LInt" Direction="Output" Expect="14" Range="9" />
													<Element xsi: type="OutputUDT" Name="c" Datatype="typeC" Direction="Output">
														<Elements>
															<Element xsi: type="OutputUDT" Name="f" Datatype="typeF" Direction="Output">
																<Elements>
																	<Element xsi:type="Output" Name="dd" Datatype="Date" Direction="Output" Expect="D#2053-05-23" Range="" />
																</Elements>
															</Element>
														</Elements>
													</Element>
												</Elements>
											</Element>
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]
		ref = '''	
		define{
			output[]
			inout[
				udt a(typeA){
					lint b;
					udt c(typeC){ 
						udt f(typeF){
							date dd;
						}
					}
				}
				typeA z; 
			]
			input[]
		}
		teststep(1, ""){
			set[
				a.b = 14;
				a.c.f.dd = D#2053-05-23;
				z.b = 140;
				z.c.f.dd = D#2000-09-01;
			]
			assert[]
		}'''

		(beginning + ref + ending) => [
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
													<Element xsi:type="Input" Name="b" Datatype="LInt" Direction="InOut" Value="14" />
												</Elements>
											</Element>
											<Element xsi: type="InputUDT" Name="a" Datatype="typeA" Direction="InOut">
												<Elements>
													<Element xsi: type="InputUDT" Name="c" Datatype="typeC" Direction="InOut">
														<Elements>
															<Element xsi: type="InputUDT" Name="f" Datatype="typeF" Direction="InOut">
																<Elements>
																	<Element xsi:type="Input" Name="dd" Datatype="Date" Direction="InOut" Value="D#2053-05-23" />
																</Elements>
															</Element>
														</Elements>
													</Element>
												</Elements>
											</Element>
											<Element xsi: type="InputUDT" Name="z" Datatype="typeA" Direction="InOut">
												<Elements>
													<Element xsi:type="Input" Name="b" Datatype="LInt" Direction="InOut" Value="140" />
												</Elements>
											</Element>
											<Element xsi: type="InputUDT" Name="z" Datatype="typeA" Direction="InOut">
												<Elements>
													<Element xsi: type="InputUDT" Name="c" Datatype="typeC" Direction="InOut">
														<Elements>
															<Element xsi: type="InputUDT" Name="f" Datatype="typeF" Direction="InOut">
																<Elements>
																	<Element xsi:type="Input" Name="dd" Datatype="Date" Direction="InOut" Value="D#2000-09-01" />
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
				'''
			)
		]

		ref = '''	
		define{
			output[]
			inout[
				udt a(typeA){
					lint b;
					udt c(typeC){ 
						udt f(typeF){
							date dd;
						}
					}
				}
				typeA z; 
			]
			input[]
		}
		teststep(1, ""){
			set[
				
			]
			assert[a.b = 14 +/- 9;
				a.c.f.dd = D#2053-05-23;
				z.b = 140 +/- 50;
				z.c.f.dd = D#2000-09-01;]
		}'''

		(beginning + ref + ending) => [
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
													<Element xsi:type="Output" Name="b" Datatype="LInt" Direction="InOut" Expect="14" Range="9" />
												</Elements>
											</Element>
											<Element xsi: type="OutputUDT" Name="a" Datatype="typeA" Direction="InOut">
												<Elements>
													<Element xsi: type="OutputUDT" Name="c" Datatype="typeC" Direction="InOut">
														<Elements>
															<Element xsi: type="OutputUDT" Name="f" Datatype="typeF" Direction="InOut">
																<Elements>
																	<Element xsi:type="Output" Name="dd" Datatype="Date" Direction="InOut" Expect="D#2053-05-23" Range="" />
																</Elements>
															</Element>
														</Elements>
													</Element>
												</Elements>
											</Element>
											<Element xsi: type="OutputUDT" Name="z" Datatype="typeA" Direction="InOut">
												<Elements>
													<Element xsi:type="Output" Name="b" Datatype="LInt" Direction="InOut" Expect="140" Range="50" />
												</Elements>
											</Element>
											<Element xsi: type="OutputUDT" Name="z" Datatype="typeA" Direction="InOut">
												<Elements>
													<Element xsi: type="OutputUDT" Name="c" Datatype="typeC" Direction="InOut">
														<Elements>
															<Element xsi: type="OutputUDT" Name="f" Datatype="typeF" Direction="InOut">
																<Elements>
																	<Element xsi:type="Output" Name="dd" Datatype="Date" Direction="InOut" Expect="D#2000-09-01" Range="" />
																</Elements>
															</Element>
														</Elements>
													</Element>
												</Elements>
											</Element>
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

	@Test def void testEmptyStatement() {
		var ref = '''	
		define{
			input[ int a = 40; ]
			output[]
		}
		teststep(1, ""){
			set[a;]
			assert[]
		}'''

		(beginning + ref + ending) => [
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
											<Element xsi:type="Input" Name="a" Datatype="Int" Direction="Input" Value="40" />
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

		ref = '''	
			define{
				input[]
				output[ int a = 30 +/- 9;]
			}
			teststep(1, ""){
				set[]
				assert[ a = 8 ; ]
			}		
		'''

		(beginning + ref + ending) => [
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
											<Element xsi:type="Output" Name="a" Datatype="Int" Direction="Output" Expect="8" Range="9" />
										</Outputs>
									</Teststep>
								</Teststeps>
							</TestCase>
						</TestCases>
					</TestFixture>
				'''
			)
		]

		ref = '''	
			define{
				input[]
				output[]
				inout[ int a = 94 +/- 3;]
			}
			teststep(1, ""){
				set[]
				assert[a;]
			}
		'''

		(beginning + ref + ending) => [
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
											<Element xsi:type="Output" Name="a" Datatype="Int" Direction="InOut" Expect="94" Range="3" />
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
