/**
 * 
 */
package org.jboss.tools.json.junit4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.xtext.resource.XtextResource;

/**
 * Annotation to identify a field as an input resource that should be of type
 * {@link XtextResource}
 * 
 * @author xcoulon
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InputXtextResource {

}
