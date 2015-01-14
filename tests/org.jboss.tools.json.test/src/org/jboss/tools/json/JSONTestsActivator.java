/**
 * 
 */
package org.jboss.tools.json;

import org.eclipse.core.runtime.Plugin;

import org.osgi.framework.BundleContext;

/**
 * @author xcoulon
 *
 */
public class JSONTestsActivator extends Plugin {

	public static final String PLUGIN_ID = "org.jboss.tools.web.jsoneditor.tests"; //$NON-NLS-1$

	// The shared instance
	private static JSONTestsActivator plugin;
	
	/**
	 * The constructor
	 */
	public JSONTestsActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static JSONTestsActivator getDefault() {
		return plugin;
	}

}
