/*
 * generated by Xtext
 */
package org.jboss.tools.json.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.jboss.tools.json.ui.internal.JSONActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JSONExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return JSONActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return JSONActivator.getInstance().getInjector(JSONActivator.ORG_JBOSS_TOOLS_JSON_JSON);
	}
	
}
