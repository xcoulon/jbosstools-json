/**
 */
package org.jboss.tools.json.json;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jboss.tools.json.json.JsonFactory
 * @model kind="package"
 * @generated
 */
public interface JsonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "json";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jboss.org/tools/json/JSON";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "json";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonPackage eINSTANCE = org.jboss.tools.json.json.impl.JsonPackageImpl.init();

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.JSONModelImpl <em>JSON Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.JSONModelImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONModel()
   * @generated
   */
  int JSON_MODEL = 0;

  /**
   * The feature id for the '<em><b>Root Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_MODEL__ROOT_OBJECT = 0;

  /**
   * The number of structural features of the '<em>JSON Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.JSONObjectImpl <em>JSON Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.JSONObjectImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONObject()
   * @generated
   */
  int JSON_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__PAIRS = 0;

  /**
   * The number of structural features of the '<em>JSON Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.PairImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.KeyImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getKey()
   * @generated
   */
  int KEY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__NAME = 0;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.JSONArrayImpl <em>JSON Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.JSONArrayImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONArray()
   * @generated
   */
  int JSON_ARRAY = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>JSON Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.JSONSimpleValueImpl <em>JSON Simple Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.JSONSimpleValueImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONSimpleValue()
   * @generated
   */
  int JSON_SIMPLE_VALUE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SIMPLE_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>JSON Simple Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SIMPLE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.QuotedCharsImpl <em>Quoted Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.QuotedCharsImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getQuotedChars()
   * @generated
   */
  int QUOTED_CHARS = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_CHARS__VALUE = JSON_SIMPLE_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Quoted Chars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_CHARS_FEATURE_COUNT = JSON_SIMPLE_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.NumberImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = JSON_SIMPLE_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = JSON_SIMPLE_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.NullImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getNull()
   * @generated
   */
  int NULL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__VALUE = JSON_SIMPLE_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = JSON_SIMPLE_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.FalseImpl <em>False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.FalseImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getFalse()
   * @generated
   */
  int FALSE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE__VALUE = JSON_SIMPLE_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE_FEATURE_COUNT = JSON_SIMPLE_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jboss.tools.json.json.impl.TrueImpl <em>True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jboss.tools.json.json.impl.TrueImpl
   * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getTrue()
   * @generated
   */
  int TRUE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE__VALUE = JSON_SIMPLE_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_FEATURE_COUNT = JSON_SIMPLE_VALUE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.JSONModel <em>JSON Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JSON Model</em>'.
   * @see org.jboss.tools.json.json.JSONModel
   * @generated
   */
  EClass getJSONModel();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.tools.json.json.JSONModel#getRootObject <em>Root Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Object</em>'.
   * @see org.jboss.tools.json.json.JSONModel#getRootObject()
   * @see #getJSONModel()
   * @generated
   */
  EReference getJSONModel_RootObject();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.JSONObject <em>JSON Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JSON Object</em>'.
   * @see org.jboss.tools.json.json.JSONObject
   * @generated
   */
  EClass getJSONObject();

  /**
   * Returns the meta object for the containment reference list '{@link org.jboss.tools.json.json.JSONObject#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see org.jboss.tools.json.json.JSONObject#getPairs()
   * @see #getJSONObject()
   * @generated
   */
  EReference getJSONObject_Pairs();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see org.jboss.tools.json.json.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.tools.json.json.Pair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.jboss.tools.json.json.Pair#getKey()
   * @see #getPair()
   * @generated
   */
  EReference getPair_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.jboss.tools.json.json.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.jboss.tools.json.json.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EReference getPair_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see org.jboss.tools.json.json.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.tools.json.json.Key#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jboss.tools.json.json.Key#getName()
   * @see #getKey()
   * @generated
   */
  EAttribute getKey_Name();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.JSONArray <em>JSON Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JSON Array</em>'.
   * @see org.jboss.tools.json.json.JSONArray
   * @generated
   */
  EClass getJSONArray();

  /**
   * Returns the meta object for the containment reference list '{@link org.jboss.tools.json.json.JSONArray#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.jboss.tools.json.json.JSONArray#getElements()
   * @see #getJSONArray()
   * @generated
   */
  EReference getJSONArray_Elements();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.JSONSimpleValue <em>JSON Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JSON Simple Value</em>'.
   * @see org.jboss.tools.json.json.JSONSimpleValue
   * @generated
   */
  EClass getJSONSimpleValue();

  /**
   * Returns the meta object for the attribute '{@link org.jboss.tools.json.json.JSONSimpleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jboss.tools.json.json.JSONSimpleValue#getValue()
   * @see #getJSONSimpleValue()
   * @generated
   */
  EAttribute getJSONSimpleValue_Value();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.QuotedChars <em>Quoted Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quoted Chars</em>'.
   * @see org.jboss.tools.json.json.QuotedChars
   * @generated
   */
  EClass getQuotedChars();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see org.jboss.tools.json.json.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see org.jboss.tools.json.json.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.False <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>False</em>'.
   * @see org.jboss.tools.json.json.False
   * @generated
   */
  EClass getFalse();

  /**
   * Returns the meta object for class '{@link org.jboss.tools.json.json.True <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True</em>'.
   * @see org.jboss.tools.json.json.True
   * @generated
   */
  EClass getTrue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JsonFactory getJsonFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.JSONModelImpl <em>JSON Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.JSONModelImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONModel()
     * @generated
     */
    EClass JSON_MODEL = eINSTANCE.getJSONModel();

    /**
     * The meta object literal for the '<em><b>Root Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_MODEL__ROOT_OBJECT = eINSTANCE.getJSONModel_RootObject();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.JSONObjectImpl <em>JSON Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.JSONObjectImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONObject()
     * @generated
     */
    EClass JSON_OBJECT = eINSTANCE.getJSONObject();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT__PAIRS = eINSTANCE.getJSONObject_Pairs();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.PairImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR__KEY = eINSTANCE.getPair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR__VALUE = eINSTANCE.getPair_Value();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.KeyImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY__NAME = eINSTANCE.getKey_Name();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.JSONArrayImpl <em>JSON Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.JSONArrayImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONArray()
     * @generated
     */
    EClass JSON_ARRAY = eINSTANCE.getJSONArray();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_ARRAY__ELEMENTS = eINSTANCE.getJSONArray_Elements();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.JSONSimpleValueImpl <em>JSON Simple Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.JSONSimpleValueImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getJSONSimpleValue()
     * @generated
     */
    EClass JSON_SIMPLE_VALUE = eINSTANCE.getJSONSimpleValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_SIMPLE_VALUE__VALUE = eINSTANCE.getJSONSimpleValue_Value();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.QuotedCharsImpl <em>Quoted Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.QuotedCharsImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getQuotedChars()
     * @generated
     */
    EClass QUOTED_CHARS = eINSTANCE.getQuotedChars();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.NumberImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.NullImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.FalseImpl <em>False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.FalseImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getFalse()
     * @generated
     */
    EClass FALSE = eINSTANCE.getFalse();

    /**
     * The meta object literal for the '{@link org.jboss.tools.json.json.impl.TrueImpl <em>True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jboss.tools.json.json.impl.TrueImpl
     * @see org.jboss.tools.json.json.impl.JsonPackageImpl#getTrue()
     * @generated
     */
    EClass TRUE = eINSTANCE.getTrue();

  }

} //JsonPackage
