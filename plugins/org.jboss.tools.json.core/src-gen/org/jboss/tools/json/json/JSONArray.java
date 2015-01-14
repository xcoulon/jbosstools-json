/**
 */
package org.jboss.tools.json.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.json.json.JSONArray#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.json.json.JsonPackage#getJSONArray()
 * @model
 * @generated
 */
public interface JSONArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.jboss.tools.json.json.JsonPackage#getJSONArray_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

} // JSONArray
