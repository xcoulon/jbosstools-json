/**
 * 
 */
package org.jboss.tools.json.junit4;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import com.google.inject.Inject;

/**
 * This utility class reads the content from a file in the runtime classpath.
 * The file location is given by the {@link InputFile} annotation on the test
 * method that is being executed.
 * 
 * Then, this utility class read the file content and extracts 2 lists of lines
 * that should be separated by a line starting with '---'.
 * 
 * The first list of lines is loaded into a field of the test class that must be
 * of type {@link XtextResource} that must be annotated with both {@link Inject}
 * and {@link InputXtextResource} annotations. The {@link Inject} annotations
 * ensures that the initial value is injected by the underlying Xtext framework,
 * while the {@link InputXtextResource} identifies this particular field as the
 * Input XtextResource that should be tested.
 * 
 * The second list of lines is loaded into another {@link XtextResource} which
 * must also be annotated with both {@link Inject} and
 * {@link ExpectedXtextResource}.
 * 
 * 
 * @author xcoulon
 * 
 */
public class XtextResourcesLoader implements TestRule {

	/**
	 * The test class on which this test rule applies. Required as reflection is
	 * going to be performed.
	 */
	private final Object testClass;

	/**
	 * Constructor.
	 * 
	 * @param testClass
	 *            The test class on which this test rule applies.
	 */
	public XtextResourcesLoader(final Object testClass) {
		this.testClass = testClass;
	}

	@Override
	public Statement apply(Statement base, Description description) {
		final InputFile inputFileAnnotation = description
				.getAnnotation(InputFile.class);
		if (inputFileAnnotation != null) {
			try {
				final InputStream stream = Thread.currentThread()
						.getContextClassLoader()
						.getResourceAsStream(inputFileAnnotation.value());
				final List<String> fileLines = readFile(stream);
				for (Field field : description.getTestClass()
						.getDeclaredFields()) {
					if (field.isAnnotationPresent(ExpectedXtextResource.class)) {
						loadContentIntoResource(field,
								getExpectedContent(fileLines));
					} else if (field
							.isAnnotationPresent(InputXtextResource.class)) {
						loadContentIntoResource(field,
								getSourceContent(fileLines));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				fail("Failed to input content into class field:" + e);
			}
		}
		return base;
	}

	/**
	 * Loads the content into the given XtextResource
	 * 
	 * @param field
	 *            the field containing the XtextResource in which the content
	 *            should be loaded
	 * @param lines
	 *            the content as a list of lines.
	 * @throws IOException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	private void loadContentIntoResource(Field field, List<String> lines)
			throws IOException, IllegalArgumentException,
			IllegalAccessException {
		final XtextResource resource = (XtextResource) field.get(testClass);

		final StringBuilder mergedLines = new StringBuilder();
		for (Iterator<String> iterator = lines.iterator(); iterator.hasNext();) {
			String line = iterator.next();
			mergedLines.append(line);
			if (iterator.hasNext()) {
				mergedLines.append(System.getProperty("line.separator"));
			}
		}
		final InputStream stream = IOUtils.toInputStream(mergedLines);
		resource.load(stream, null); // no specific options needed.
		field.set(testClass, resource);
	}

	/**
	 * Reads the whole file content
	 * 
	 * @param stream
	 *            the file inputStream
	 * @return the file content as a String
	 * @throws IOException
	 */
	private List<String> readFile(final InputStream stream) throws IOException {
		return IOUtils.readLines(stream);
	}

	/**
	 * Reads the lines and returns the ones that appear *before* the '---'
	 * sequence, ignoring the comments (lines starting with '//' or '#')
	 * 
	 * @param rawContent
	 *            the whole set of lines from the input file
	 * @return the list of lines that represent the expected content
	 */
	private List<String> getSourceContent(List<String> rawContent) {
		final List<String> filteredLines = new ArrayList<String>();
		for (String line : rawContent) {
			// move until after the '---' sequence
			if (line.startsWith("---")) {
				break;
			}
			// excluding optional comments
			if (line.startsWith("//") || line.startsWith("#")) {
				continue;
			}

			// keep those lines
			filteredLines.add(line);
		}
		return filteredLines;
	}

	/**
	 * Reads the lines and returns the ones that appear after the '---'
	 * sequence, ignoring the comments (lines starting with '//' or '#')
	 * 
	 * @param rawContent
	 *            the whole set of lines from the input file
	 * @return the list of lines that represent the expected content
	 */
	private List<String> getExpectedContent(List<String> rawContent) {
		final List<String> filteredLines = new ArrayList<String>();
		boolean found = false;
		for (String line : rawContent) {
			// move until after the '---' sequence
			if (line.startsWith("---")) {
				found = true;
				continue;
			}
			// ignore content before '---'
			if (!found) {
				continue;
			}
			// excluding optional comments
			if (line.startsWith("//") || line.startsWith("#")) {
				continue;
			}
			// keep those lines
			filteredLines.add(line);
		}
		return filteredLines;
	}

}
