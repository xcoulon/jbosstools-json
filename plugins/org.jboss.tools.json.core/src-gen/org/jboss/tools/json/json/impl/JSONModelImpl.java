/**
 */
package org.jboss.tools.json.json.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jboss.tools.json.json.JSONModel;
import org.jboss.tools.json.json.JSONObject;
import org.jboss.tools.json.json.JsonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.tools.json.json.impl.JSONModelImpl#getRootObject <em>Root Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSONModelImpl extends MinimalEObjectImpl.Container implements JSONModel
{
  /**
   * The cached value of the '{@link #getRootObject() <em>Root Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootObject()
   * @generated
   * @ordered
   */
  protected JSONObject rootObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JSONModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JsonPackage.Literals.JSON_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONObject getRootObject()
  {
    return rootObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootObject(JSONObject newRootObject, NotificationChain msgs)
  {
    JSONObject oldRootObject = rootObject;
    rootObject = newRootObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_MODEL__ROOT_OBJECT, oldRootObject, newRootObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootObject(JSONObject newRootObject)
  {
    if (newRootObject != rootObject)
    {
      NotificationChain msgs = null;
      if (rootObject != null)
        msgs = ((InternalEObject)rootObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonPackage.JSON_MODEL__ROOT_OBJECT, null, msgs);
      if (newRootObject != null)
        msgs = ((InternalEObject)newRootObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonPackage.JSON_MODEL__ROOT_OBJECT, null, msgs);
      msgs = basicSetRootObject(newRootObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_MODEL__ROOT_OBJECT, newRootObject, newRootObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JsonPackage.JSON_MODEL__ROOT_OBJECT:
        return basicSetRootObject(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JsonPackage.JSON_MODEL__ROOT_OBJECT:
        return getRootObject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JsonPackage.JSON_MODEL__ROOT_OBJECT:
        setRootObject((JSONObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JsonPackage.JSON_MODEL__ROOT_OBJECT:
        setRootObject((JSONObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JsonPackage.JSON_MODEL__ROOT_OBJECT:
        return rootObject != null;
    }
    return super.eIsSet(featureID);
  }

} //JSONModelImpl
