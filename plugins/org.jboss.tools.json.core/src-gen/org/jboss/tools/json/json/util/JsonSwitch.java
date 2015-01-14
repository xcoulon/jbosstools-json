/**
 */
package org.jboss.tools.json.json.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.jboss.tools.json.json.False;
import org.jboss.tools.json.json.JSONArray;
import org.jboss.tools.json.json.JSONModel;
import org.jboss.tools.json.json.JSONObject;
import org.jboss.tools.json.json.JSONSimpleValue;
import org.jboss.tools.json.json.JsonPackage;
import org.jboss.tools.json.json.Key;
import org.jboss.tools.json.json.Null;
import org.jboss.tools.json.json.Pair;
import org.jboss.tools.json.json.QuotedChars;
import org.jboss.tools.json.json.True;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jboss.tools.json.json.JsonPackage
 * @generated
 */
public class JsonSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JsonPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JsonPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JsonPackage.JSON_MODEL:
      {
        JSONModel jsonModel = (JSONModel)theEObject;
        T result = caseJSONModel(jsonModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.JSON_OBJECT:
      {
        JSONObject jsonObject = (JSONObject)theEObject;
        T result = caseJSONObject(jsonObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.PAIR:
      {
        Pair pair = (Pair)theEObject;
        T result = casePair(pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.KEY:
      {
        Key key = (Key)theEObject;
        T result = caseKey(key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.JSON_ARRAY:
      {
        JSONArray jsonArray = (JSONArray)theEObject;
        T result = caseJSONArray(jsonArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.JSON_SIMPLE_VALUE:
      {
        JSONSimpleValue jsonSimpleValue = (JSONSimpleValue)theEObject;
        T result = caseJSONSimpleValue(jsonSimpleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.QUOTED_CHARS:
      {
        QuotedChars quotedChars = (QuotedChars)theEObject;
        T result = caseQuotedChars(quotedChars);
        if (result == null) result = caseJSONSimpleValue(quotedChars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.NUMBER:
      {
        org.jboss.tools.json.json.Number number = (org.jboss.tools.json.json.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseJSONSimpleValue(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.NULL:
      {
        Null null_ = (Null)theEObject;
        T result = caseNull(null_);
        if (result == null) result = caseJSONSimpleValue(null_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.FALSE:
      {
        False false_ = (False)theEObject;
        T result = caseFalse(false_);
        if (result == null) result = caseJSONSimpleValue(false_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JsonPackage.TRUE:
      {
        True true_ = (True)theEObject;
        T result = caseTrue(true_);
        if (result == null) result = caseJSONSimpleValue(true_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JSON Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JSON Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSONModel(JSONModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JSON Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JSON Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSONObject(JSONObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePair(Pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKey(Key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JSON Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JSON Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSONArray(JSONArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JSON Simple Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JSON Simple Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSONSimpleValue(JSONSimpleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quoted Chars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quoted Chars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotedChars(QuotedChars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.jboss.tools.json.json.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNull(Null object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFalse(False object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>True</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>True</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrue(True object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JsonSwitch
