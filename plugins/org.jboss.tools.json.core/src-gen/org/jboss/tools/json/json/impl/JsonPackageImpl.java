/**
 */
package org.jboss.tools.json.json.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonPackageImpl extends EPackageImpl implements JsonPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonSimpleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quotedCharsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass falseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trueEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.jboss.tools.json.json.JsonPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JsonPackageImpl()
  {
    super(eNS_URI, JsonFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JsonPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JsonPackage init()
  {
    if (isInited) return (JsonPackage)EPackage.Registry.INSTANCE.getEPackage(JsonPackage.eNS_URI);

    // Obtain or create and register package
    JsonPackageImpl theJsonPackage = (JsonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JsonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JsonPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJsonPackage.createPackageContents();

    // Initialize created meta-data
    theJsonPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJsonPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JsonPackage.eNS_URI, theJsonPackage);
    return theJsonPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJSONModel()
  {
    return jsonModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSONModel_RootObject()
  {
    return (EReference)jsonModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJSONObject()
  {
    return jsonObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSONObject_Pairs()
  {
    return (EReference)jsonObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPair()
  {
    return pairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPair_Key()
  {
    return (EReference)pairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPair_Value()
  {
    return (EReference)pairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKey()
  {
    return keyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKey_Name()
  {
    return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJSONArray()
  {
    return jsonArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSONArray_Elements()
  {
    return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJSONSimpleValue()
  {
    return jsonSimpleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJSONSimpleValue_Value()
  {
    return (EAttribute)jsonSimpleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotedChars()
  {
    return quotedCharsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNull()
  {
    return nullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFalse()
  {
    return falseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrue()
  {
    return trueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonFactory getJsonFactory()
  {
    return (JsonFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jsonModelEClass = createEClass(JSON_MODEL);
    createEReference(jsonModelEClass, JSON_MODEL__ROOT_OBJECT);

    jsonObjectEClass = createEClass(JSON_OBJECT);
    createEReference(jsonObjectEClass, JSON_OBJECT__PAIRS);

    pairEClass = createEClass(PAIR);
    createEReference(pairEClass, PAIR__KEY);
    createEReference(pairEClass, PAIR__VALUE);

    keyEClass = createEClass(KEY);
    createEAttribute(keyEClass, KEY__NAME);

    jsonArrayEClass = createEClass(JSON_ARRAY);
    createEReference(jsonArrayEClass, JSON_ARRAY__ELEMENTS);

    jsonSimpleValueEClass = createEClass(JSON_SIMPLE_VALUE);
    createEAttribute(jsonSimpleValueEClass, JSON_SIMPLE_VALUE__VALUE);

    quotedCharsEClass = createEClass(QUOTED_CHARS);

    numberEClass = createEClass(NUMBER);

    nullEClass = createEClass(NULL);

    falseEClass = createEClass(FALSE);

    trueEClass = createEClass(TRUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    quotedCharsEClass.getESuperTypes().add(this.getJSONSimpleValue());
    numberEClass.getESuperTypes().add(this.getJSONSimpleValue());
    nullEClass.getESuperTypes().add(this.getJSONSimpleValue());
    falseEClass.getESuperTypes().add(this.getJSONSimpleValue());
    trueEClass.getESuperTypes().add(this.getJSONSimpleValue());

    // Initialize classes and features; add operations and parameters
    initEClass(jsonModelEClass, JSONModel.class, "JSONModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJSONModel_RootObject(), this.getJSONObject(), null, "rootObject", null, 0, 1, JSONModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonObjectEClass, JSONObject.class, "JSONObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJSONObject_Pairs(), this.getPair(), null, "pairs", null, 0, -1, JSONObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPair_Key(), this.getKey(), null, "key", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPair_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKey_Name(), ecorePackage.getEString(), "name", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonArrayEClass, JSONArray.class, "JSONArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJSONArray_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, JSONArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonSimpleValueEClass, JSONSimpleValue.class, "JSONSimpleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJSONSimpleValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, JSONSimpleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quotedCharsEClass, QuotedChars.class, "QuotedChars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberEClass, org.jboss.tools.json.json.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullEClass, Null.class, "Null", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(falseEClass, False.class, "False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //JsonPackageImpl
