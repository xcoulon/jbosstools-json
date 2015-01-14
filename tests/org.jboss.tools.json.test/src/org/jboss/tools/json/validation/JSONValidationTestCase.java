package org.jboss.tools.json.validation;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.jboss.tools.json.JSONInjectorProvider;
import org.jboss.tools.json.util.AbstractCommonTestCase;
import org.jboss.tools.json.util.JSONModelAssertions;
import org.jboss.tools.json.util.JSONTestFile;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@InjectWith(JSONInjectorProvider.class)
@RunWith(XtextRunner.class)
public class JSONValidationTestCase extends AbstractCommonTestCase {

	@Inject
	JSONModelAssertions assertions;

	private JSONTestFile file(final String filename) throws IOException,
			CoreException {
		return JSONTestFile.openFile(project, filename);
	}

	@Test
	@Ignore("Ignored for now: model would be null")
	public void shouldValidateEmptyFile() throws Exception {
		assertions.assertThat(file("empty_file.json")).hasNoError();
	}

	@Test
	public void shouldValidateEmptyObject() throws Exception {
		assertions.assertThat(file("empty_object.json")).hasNoError();
	}

	@Test
	public void shouldValidateSimplePair() throws Exception {
		assertions.assertThat(file("simple_pair.json")).hasNoError();
	}

	@Test
	public void shouldValidateSimplePairWithArray() throws Exception {
		assertions.assertThat(file("simple_pair_with_array.json")).hasNoError();
	}

	@Test
	public void shouldNotValidateSimplePairWithExtraComma() throws Exception {
		assertions.assertThat(
				file("simple_pair_with_array.json").replace("\"value2\"]")
						.with("\"value2\"],")).hasErrors(1);
	}

	@Test
	public void shouldValidateSimplePairWithArrayOfAllTypes() throws Exception {
		assertions.assertThat(file("simple_pair_with_array_of_all_types.json"))
				.hasNoError();
	}

	@Test
	public void shouldValidateMultiplePairsWithArrays() throws Exception {
		assertions.assertThat(file("multiple_pairs_with_arrays.json")).hasNoError();
	}

	@Test
	public void shouldValidateMultipleNestedPairsWithArrays() throws Exception {
		assertions.assertThat(file("multiple_nested_pairs_with_arrays.json")).hasNoError();
	}

}