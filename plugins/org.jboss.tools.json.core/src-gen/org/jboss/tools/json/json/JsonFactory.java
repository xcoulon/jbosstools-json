/**
 */
package org.jboss.tools.json.json;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jboss.tools.json.json.JsonPackage
 * @generated
 */
public interface JsonFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonFactory eINSTANCE = org.jboss.tools.json.json.impl.JsonFactoryImpl.init();

  /**
   * Returns a new object of class '<em>JSON Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Model</em>'.
   * @generated
   */
  JSONModel createJSONModel();

  /**
   * Returns a new object of class '<em>JSON Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Object</em>'.
   * @generated
   */
  JSONObject createJSONObject();

  /**
   * Returns a new object of class '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pair</em>'.
   * @generated
   */
  Pair createPair();

  /**
   * Returns a new object of class '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key</em>'.
   * @generated
   */
  Key createKey();

  /**
   * Returns a new object of class '<em>JSON Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Array</em>'.
   * @generated
   */
  JSONArray createJSONArray();

  /**
   * Returns a new object of class '<em>JSON Simple Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Simple Value</em>'.
   * @generated
   */
  JSONSimpleValue createJSONSimpleValue();

  /**
   * Returns a new object of class '<em>Quoted Chars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quoted Chars</em>'.
   * @generated
   */
  QuotedChars createQuotedChars();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns a new object of class '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null</em>'.
   * @generated
   */
  Null createNull();

  /**
   * Returns a new object of class '<em>False</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>False</em>'.
   * @generated
   */
  False createFalse();

  /**
   * Returns a new object of class '<em>True</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>True</em>'.
   * @generated
   */
  True createTrue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JsonPackage getJsonPackage();

} //JsonFactory
