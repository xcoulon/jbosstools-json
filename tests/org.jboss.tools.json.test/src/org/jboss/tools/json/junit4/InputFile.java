/**
 * 
 */
package org.jboss.tools.json.junit4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate which input file to use during the test method
 * execution.
 * 
 * @author xcoulon
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InputFile {

	/** The file location relative to the current execution location. */
	String value();

}
