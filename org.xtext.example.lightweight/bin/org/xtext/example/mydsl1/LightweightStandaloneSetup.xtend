/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl1


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LightweightStandaloneSetup extends LightweightStandaloneSetupGenerated {

	def static void doSetup() {
		new LightweightStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}