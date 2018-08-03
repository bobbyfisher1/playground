/*
 * generated by Xtext 2.14.0
 */
package org.example.eis.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.example.eis.ui.internal.EisActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EisExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EisActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EisActivator activator = EisActivator.getInstance();
		return activator != null ? activator.getInjector(EisActivator.ORG_EXAMPLE_EIS_EIS) : null;
	}

}
