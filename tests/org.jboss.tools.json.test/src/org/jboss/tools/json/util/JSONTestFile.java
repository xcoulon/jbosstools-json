package org.jboss.tools.json.util;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

/**
 * File reader utility with support for char sequence replacements in series.
 * 
 * @author xcoulon
 * 
 */
public class JSONTestFile {

	public static JSONTestFile openFile(final IProject project,
			final String filepath) throws IOException, CoreException {
		final IFile file = project.getFile("src/" + filepath);
		final String content = IOUtils.toString(file.getContents());
		return new JSONTestFile(createFileURI(file), content);
	}

	private static URI createFileURI(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toPortableString(), true);
		return uri;
	}

	/** The file content (after reading and replacements). */
	private String content;

	private final URI uriToUse;

	private JSONTestFile(final URI uriToUse, final String content) {
		this.uriToUse = uriToUse;
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}



	/**
	 * @return the uriToUse
	 */
	public URI getUriToUse() {
		return uriToUse;
	}



	public ContentReplacer replace(final String source) {
		return new ContentReplacer(this, source);
	}
	
	public class ContentReplacer {

		private final JSONTestFile testFile;

		private final String source;

		public ContentReplacer(final JSONTestFile testFile, final String source) {
			this.testFile = testFile;
			this.source = source;
		}

		public JSONTestFile with(final String replacement) {
			assertThat(content.indexOf(source), not(equalTo(-1)));
			this.testFile.content = this.testFile.content.replace(source,
					replacement);
			return this.testFile;

		}

		public String toString() {
			throw new IllegalStateException(
					"toString() shouldn't be called just after 'replace(String)'.");
		}
	}


}
