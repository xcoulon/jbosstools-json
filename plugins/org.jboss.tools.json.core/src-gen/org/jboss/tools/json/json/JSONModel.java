/**
 */
package org.jboss.tools.json.json;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.json.json.JSONModel#getRootObject <em>Root Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.json.json.JsonPackage#getJSONModel()
 * @model
 * @generated
 */
public interface JSONModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Root Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Object</em>' containment reference.
   * @see #setRootObject(JSONObject)
   * @see org.jboss.tools.json.json.JsonPackage#getJSONModel_RootObject()
   * @model containment="true"
   * @generated
   */
  JSONObject getRootObject();

  /**
   * Sets the value of the '{@link org.jboss.tools.json.json.JSONModel#getRootObject <em>Root Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Object</em>' containment reference.
   * @see #getRootObject()
   * @generated
   */
  void setRootObject(JSONObject value);

} // JSONModel
