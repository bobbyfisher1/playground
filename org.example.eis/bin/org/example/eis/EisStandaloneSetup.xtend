/*
 * generated by Xtext 2.12.0
 */
package org.example.eis


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EisStandaloneSetup extends EisStandaloneSetupGenerated {

	def static void doSetup() {
		new EisStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}