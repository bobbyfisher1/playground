/*
 * generated by Xtext 2.14.0
 */
package org.example.define.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.example.define.ui.internal.DefineActivator;

public class DefineUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DefineActivator.getInstance().getInjector("org.example.define.Define");
	}

}
