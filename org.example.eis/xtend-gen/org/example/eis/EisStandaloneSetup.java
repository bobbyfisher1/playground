/**
 * generated by Xtext 2.13.0
 */
package org.example.eis;

import org.example.eis.EisStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EisStandaloneSetup extends EisStandaloneSetupGenerated {
  public static void doSetup() {
    new EisStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
