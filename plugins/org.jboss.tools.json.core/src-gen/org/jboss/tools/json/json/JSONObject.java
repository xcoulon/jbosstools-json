/**
 */
package org.jboss.tools.json.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.json.json.JSONObject#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.json.json.JsonPackage#getJSONObject()
 * @model
 * @generated
 */
public interface JSONObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link org.jboss.tools.json.json.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see org.jboss.tools.json.json.JsonPackage#getJSONObject_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getPairs();

} // JSONObject
