/**
 */
package org.jboss.tools.json.json.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jboss.tools.json.json.False;
import org.jboss.tools.json.json.JSONArray;
import org.jboss.tools.json.json.JSONModel;
import org.jboss.tools.json.json.JSONObject;
import org.jboss.tools.json.json.JSONSimpleValue;
import org.jboss.tools.json.json.JsonFactory;
import org.jboss.tools.json.json.JsonPackage;
import org.jboss.tools.json.json.Key;
import org.jboss.tools.json.json.Null;
import org.jboss.tools.json.json.Pair;
import org.jboss.tools.json.json.QuotedChars;
import org.jboss.tools.json.json.True;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonFactoryImpl extends EFactoryImpl implements JsonFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonFactory init()
  {
    try
    {
      JsonFactory theJsonFactory = (JsonFactory)EPackage.Registry.INSTANCE.getEFactory(JsonPackage.eNS_URI);
      if (theJsonFactory != null)
      {
        return theJsonFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JsonFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JsonPackage.JSON_MODEL: return createJSONModel();
      case JsonPackage.JSON_OBJECT: return createJSONObject();
      case JsonPackage.PAIR: return createPair();
      case JsonPackage.KEY: return createKey();
      case JsonPackage.JSON_ARRAY: return createJSONArray();
      case JsonPackage.JSON_SIMPLE_VALUE: return createJSONSimpleValue();
      case JsonPackage.QUOTED_CHARS: return createQuotedChars();
      case JsonPackage.NUMBER: return createNumber();
      case JsonPackage.NULL: return createNull();
      case JsonPackage.FALSE: return createFalse();
      case JsonPackage.TRUE: return createTrue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONModel createJSONModel()
  {
    JSONModelImpl jsonModel = new JSONModelImpl();
    return jsonModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONObject createJSONObject()
  {
    JSONObjectImpl jsonObject = new JSONObjectImpl();
    return jsonObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONArray createJSONArray()
  {
    JSONArrayImpl jsonArray = new JSONArrayImpl();
    return jsonArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONSimpleValue createJSONSimpleValue()
  {
    JSONSimpleValueImpl jsonSimpleValue = new JSONSimpleValueImpl();
    return jsonSimpleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotedChars createQuotedChars()
  {
    QuotedCharsImpl quotedChars = new QuotedCharsImpl();
    return quotedChars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.jboss.tools.json.json.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public False createFalse()
  {
    FalseImpl false_ = new FalseImpl();
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public True createTrue()
  {
    TrueImpl true_ = new TrueImpl();
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonPackage getJsonPackage()
  {
    return (JsonPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JsonPackage getPackage()
  {
    return JsonPackage.eINSTANCE;
  }

} //JsonFactoryImpl
