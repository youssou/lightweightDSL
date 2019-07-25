/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl1.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.lightweight.ui.internal.LightweightActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LightweightExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(LightweightActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		LightweightActivator activator = LightweightActivator.getInstance();
		return activator != null ? activator.getInjector(LightweightActivator.ORG_XTEXT_EXAMPLE_MYDSL1_LIGHTWEIGHT) : null;
	}

}
