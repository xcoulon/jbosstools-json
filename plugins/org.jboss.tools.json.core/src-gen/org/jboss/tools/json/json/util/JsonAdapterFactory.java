/**
 */
package org.jboss.tools.json.json.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jboss.tools.json.json.JsonPackage
 * @generated
 */
public class JsonAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JsonPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JsonPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonSwitch<Adapter> modelSwitch =
    new JsonSwitch<Adapter>()
    {
      @Override
      public Adapter caseJSONModel(JSONModel object)
      {
        return createJSONModelAdapter();
      }
      @Override
      public Adapter caseJSONObject(JSONObject object)
      {
        return createJSONObjectAdapter();
      }
      @Override
      public Adapter casePair(Pair object)
      {
        return createPairAdapter();
      }
      @Override
      public Adapter caseKey(Key object)
      {
        return createKeyAdapter();
      }
      @Override
      public Adapter caseJSONArray(JSONArray object)
      {
        return createJSONArrayAdapter();
      }
      @Override
      public Adapter caseJSONSimpleValue(JSONSimpleValue object)
      {
        return createJSONSimpleValueAdapter();
      }
      @Override
      public Adapter caseQuotedChars(QuotedChars object)
      {
        return createQuotedCharsAdapter();
      }
      @Override
      public Adapter caseNumber(org.jboss.tools.json.json.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseNull(Null object)
      {
        return createNullAdapter();
      }
      @Override
      public Adapter caseFalse(False object)
      {
        return createFalseAdapter();
      }
      @Override
      public Adapter caseTrue(True object)
      {
        return createTrueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.JSONModel <em>JSON Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.JSONModel
   * @generated
   */
  public Adapter createJSONModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.JSONObject <em>JSON Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.JSONObject
   * @generated
   */
  public Adapter createJSONObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.Pair
   * @generated
   */
  public Adapter createPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.Key
   * @generated
   */
  public Adapter createKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.JSONArray <em>JSON Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.JSONArray
   * @generated
   */
  public Adapter createJSONArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.JSONSimpleValue <em>JSON Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.JSONSimpleValue
   * @generated
   */
  public Adapter createJSONSimpleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.QuotedChars <em>Quoted Chars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.QuotedChars
   * @generated
   */
  public Adapter createQuotedCharsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.Null
   * @generated
   */
  public Adapter createNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.False <em>False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.False
   * @generated
   */
  public Adapter createFalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jboss.tools.json.json.True <em>True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jboss.tools.json.json.True
   * @generated
   */
  public Adapter createTrueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JsonAdapterFactory
