/**
 * 
 */
package org.jboss.tools.json.util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.jboss.tools.json.json.JSONModel;

/**
 * @author xcoulon
 * 
 */
public class JSONModelAssert {

	private static final Logger LOGGER = LogManager
			.getLogger(JSONModelAssert.class);

	private final JSONModel model;

	private final ValidationTestHelper validationTestHelper;
	
	public JSONModelAssert(final JSONModel model, final ValidationTestHelper validationTestHelper) {
		this.model = model;
		this.validationTestHelper = validationTestHelper;
	}

	public void hasNoError() {
		hasErrors(0);
	}

	public void hasErrors(int i) {
		final List<Issue> issues = validationTestHelper.validate(model);
		for (Issue issue : issues) {
			LOGGER.error(issue);
		}
		assertEquals("Wrong number of errors after model validation", i,
				issues.size());
	}

}
