package org.jboss.tools.json.formatting;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.formatting.INodeModelFormatter.IFormattedRegion;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.validation.AbstractValidatorTester;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.jboss.tools.json.JSONInjectorProvider;
import org.jboss.tools.json.junit4.ExpectedXtextResource;
import org.jboss.tools.json.junit4.InputFile;
import org.jboss.tools.json.junit4.InputXtextResource;
import org.jboss.tools.json.junit4.XtextResourcesLoader;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(XtextRunner.class)
@InjectWith(JSONInjectorProvider.class)
public class JSONFormatterTest extends AbstractValidatorTester {

	private static final Logger LOGGER = LogManager
			.getLogger(JSONFormatterTest.class);

	@Rule
	public XtextResourcesLoader resourcesReader = new XtextResourcesLoader(this);

	@Inject
	@InputXtextResource
	public XtextResource inputResource;

	@Inject
	@ExpectedXtextResource
	public XtextResource expectedResource;

	@Inject
	protected INodeModelFormatter formatter;

	@Test
	@InputFile("org/jboss/tools/web/jsoneditor/formatting/multiple_nested_pairs_with_arrays.json")
	public void test_formatting_multiple_nested_pairs_with_arrays() {
		assertFormattingMatch();
	}

	@Test
	@InputFile("org/jboss/tools/web/jsoneditor/formatting/multiple_pairs_with_arrays.json")
	public void test_formatting_multiple_pairs_with_arrays() {
		assertFormattingMatch();
	}

	@Test
	@InputFile("org/jboss/tools/web/jsoneditor/formatting/simple_pair_with_array_of_all_types.json")
	public void test_formatting_simple_pair_with_array_of_all_types() {
		assertFormattingMatch();
	}

	@Test
	@InputFile("org/jboss/tools/web/jsoneditor/formatting/multiple_pairs_with_nested_object.json")
	public void test_formatting_multiple_pairs_with_nested_object() {
		assertFormattingMatch();
	}

	/**
	 * Assert that formatting on {@link JSONFormatterTest#inputResource} gives the
	 * exact same the output than the unchanged content of
	 * {@link JSONFormatterTest#expectedResource}.
	 */
	private void assertFormattingMatch() {
		ICompositeNode rootNode = inputResource.getParseResult().getRootNode();
		final String initialText = rootNode.getText();
		IFormattedRegion r = formatter.format(rootNode, 0,
				rootNode.getTotalLength());
		String formattedText = r.getFormattedText();
		String expectedText = expectedResource.getParseResult().getRootNode()
				.getText();
		LOGGER.info("\nInput content>>>\n" + initialText + "<<< (end)"
				+ "\n--- is formatted into ---\n" + formattedText + "<<< (end)"
				+ "\n--- and is then compared with ---\n" + expectedText + "<<< (end)");
		assertEquals("Unmatched format", expectedText, formattedText);
	}
}