/**
 * 
 */
package org.jboss.tools.json.util;

import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.jboss.tools.json.json.JSONModel;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author xcoulon
 * 
 */
public class JSONModelAssertions {

	@Inject
	ValidationTestHelper validationTestHelper;

	@Inject
	ParseHelper<JSONModel> parser;

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	public JSONModelAssert assertThat(final JSONTestFile testFile) throws Exception {
		final JSONModel domainModel = parser.parse(testFile.getContent(), testFile.getUriToUse(), resourceSetProvider.get());
		return new JSONModelAssert(domainModel, validationTestHelper);
	}


}
