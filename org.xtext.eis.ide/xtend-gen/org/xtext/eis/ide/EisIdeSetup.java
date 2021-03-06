/**
 * generated by Xtext 2.14.0
 */
package org.xtext.eis.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.eis.EisRuntimeModule;
import org.xtext.eis.EisStandaloneSetup;
import org.xtext.eis.ide.EisIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EisIdeSetup extends EisStandaloneSetup {
  @Override
  public Injector createInjector() {
    EisRuntimeModule _eisRuntimeModule = new EisRuntimeModule();
    EisIdeModule _eisIdeModule = new EisIdeModule();
    return Guice.createInjector(Modules2.mixin(_eisRuntimeModule, _eisIdeModule));
  }
}
