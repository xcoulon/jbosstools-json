/*
 * generated by Xtext
 */
package org.jboss.tools.json.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class JSONUiModule extends org.jboss.tools.json.ui.AbstractJSONUiModule {
	public JSONUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// manual moidification of the method contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.eclipse.xtext.ui.editor.IXtextEditorCallback.NullImpl.class;
	}
}
