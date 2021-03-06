/*
* generated by Xtext
*/
package org.jboss.tools.json.ui.labeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.jboss.tools.json.json.JSONArray;
import org.jboss.tools.json.json.JSONObject;
import org.jboss.tools.json.json.JSONSimpleValue;
import org.jboss.tools.json.json.Pair;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
public class JSONLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	public JSONLabelProvider(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	protected StyledString text(Pair pair) {
		final String keyName = pair.getKey().getName().replaceAll("\"", "");
		final StringBuilder builder = new StringBuilder(keyName);
		boolean hasQualifier = false;
		if (pair.getValue() instanceof JSONArray) {
			builder.append(" [Array]");
			hasQualifier = true;
		} else if (pair.getValue() instanceof JSONObject) {
			builder.append(" {Object}");
			hasQualifier = true;
		}
		final String label = builder.toString();
		final StyledString styledString = new StyledString(label);
		if (hasQualifier) {
			styledString.setStyle(keyName.length() + 1,
					builder.length() - keyName.length() - 1,
					StyledString.QUALIFIER_STYLER);
		}
		return styledString;
	}

	protected String image(Pair pair) {
		final EObject value = pair.getValue();
		if (value instanceof JSONSimpleValue) {
			return "JSONSimpleValue.gif";
		}
		if (value instanceof JSONArray) {
			return "JSONArray.gif";
		}
		if (value instanceof JSONObject) {
			return "JSONObject.gif";
		}
		return null;
	}

	protected String image(JSONSimpleValue value) {
		return "JSONSimpleValue.gif";
	}
}
