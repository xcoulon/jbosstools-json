/**
 */
package org.jboss.tools.json.json.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jboss.tools.json.json.JsonPackage;
import org.jboss.tools.json.json.Key;
import org.jboss.tools.json.json.Pair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.tools.json.json.impl.PairImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.jboss.tools.json.json.impl.PairImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PairImpl extends MinimalEObjectImpl.Container implements Pair
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected Key key;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EObject value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PairImpl()
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
    return JsonPackage.Literals.PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(Key newKey, NotificationChain msgs)
  {
    Key oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonPackage.PAIR__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Key newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonPackage.PAIR__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonPackage.PAIR__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.PAIR__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs)
  {
    EObject oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonPackage.PAIR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(EObject newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonPackage.PAIR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonPackage.PAIR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.PAIR__VALUE, newValue, newValue));
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
      case JsonPackage.PAIR__KEY:
        return basicSetKey(null, msgs);
      case JsonPackage.PAIR__VALUE:
        return basicSetValue(null, msgs);
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
      case JsonPackage.PAIR__KEY:
        return getKey();
      case JsonPackage.PAIR__VALUE:
        return getValue();
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
      case JsonPackage.PAIR__KEY:
        setKey((Key)newValue);
        return;
      case JsonPackage.PAIR__VALUE:
        setValue((EObject)newValue);
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
      case JsonPackage.PAIR__KEY:
        setKey((Key)null);
        return;
      case JsonPackage.PAIR__VALUE:
        setValue((EObject)null);
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
      case JsonPackage.PAIR__KEY:
        return key != null;
      case JsonPackage.PAIR__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //PairImpl
