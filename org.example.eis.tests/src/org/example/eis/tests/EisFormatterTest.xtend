package org.example.eis.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EisInjectorProvider)
class EisFormatterTest {

	@Inject extension FormatterTestHelper

//
// tests -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
	@Test def void testEisModel() {
		assertFormatted[
			toBeFormatted = '''project="proj"     ;   plcname="name"	;		author="Bob"			;		'''
			expectation = '''
			project = "proj";
			plcname = "name";
			author  = "Bob";'''
		]
	}

	@Test def void testEmptyTestcase() {
		assertFormatted[
			toBeFormatted = '''
				project="proj"	;plcname="name";author="Bob";	
				testcase   One           {
					
				}
			'''
			expectation = '''
				project = "proj";
				plcname = "name";
				author  = "Bob";
				testcase One {}
			'''
		]
	}

	@Test def void testTestblock() {
		assertFormatted[
			toBeFormatted = '''
				project="proj";plcname="name";author="Bob";	
				testcase One { testActive=true	;		blockType=FC;description="string";}
			'''
			expectation = '''
				project = "proj";
				plcname = "name";
				author  = "Bob";
				testcase One {
					testActive  = true;
					blockType   = FC;
					description = "string";
				}
			'''
		]
	}

	@Test def void testDefineBlock() {
		assertFormatted [
			toBeFormatted = '''
				project="proj";plcname="name";author="Bob";	
				testcase One { testActive=true	;		blockType=FC;description="string";
				define{  input[]output[]	}
				}
			'''
			expectation = '''
				project = "proj";
				plcname = "name";
				author  = "Bob";
				testcase One {
					testActive  = true;
					blockType   = FC;
					description = "string";
					define {
						input[]
						output[]
					}
				}
			'''
		]
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//       