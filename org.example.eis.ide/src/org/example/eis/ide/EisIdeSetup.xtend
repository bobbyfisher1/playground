/*
 * generated by Xtext 2.14.0
 */
package org.example.eis.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.example.eis.EisRuntimeModule
import org.example.eis.EisStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EisIdeSetup extends EisStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EisRuntimeModule, new EisIdeModule))
	}
	
}
