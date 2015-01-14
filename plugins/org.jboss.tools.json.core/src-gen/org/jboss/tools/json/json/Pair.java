/**
 */
package org.jboss.tools.json.json;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.json.json.Pair#getKey <em>Key</em>}</li>
 *   <li>{@link org.jboss.tools.json.json.Pair#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.json.json.JsonPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(Key)
   * @see org.jboss.tools.json.json.JsonPackage#getPair_Key()
   * @model containment="true"
   * @generated
   */
  Key getKey();

  /**
   * Sets the value of the '{@link org.jboss.tools.json.json.Pair#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(Key value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(EObject)
   * @see org.jboss.tools.json.json.JsonPackage#getPair_Value()
   * @model containment="true"
   * @generated
   */
  EObject getValue();

  /**
   * Sets the value of the '{@link org.jboss.tools.json.json.Pair#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EObject value);

} // Pair
