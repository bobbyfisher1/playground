/**
 * generated by Xtext 2.14.0
 */
package org.example.define;

import org.example.define.DefineStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DefineStandaloneSetup extends DefineStandaloneSetupGenerated {
  public static void doSetup() {
    new DefineStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
