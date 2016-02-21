/**
 */
package org.slf.iot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slf.iot.AbstractElement;
import org.slf.iot.IfBlock;
import org.slf.iot.IotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.impl.IfBlockImpl#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfBlockImpl extends MinimalEObjectImpl.Container implements IfBlock
{
  /**
   * The cached value of the '{@link #getElementos() <em>Elementos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementos()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elementos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfBlockImpl()
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
    return IotPackage.Literals.IF_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElementos()
  {
    if (elementos == null)
    {
      elementos = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, IotPackage.IF_BLOCK__ELEMENTOS);
    }
    return elementos;
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
      case IotPackage.IF_BLOCK__ELEMENTOS:
        return ((InternalEList<?>)getElementos()).basicRemove(otherEnd, msgs);
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
      case IotPackage.IF_BLOCK__ELEMENTOS:
        return getElementos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IotPackage.IF_BLOCK__ELEMENTOS:
        getElementos().clear();
        getElementos().addAll((Collection<? extends AbstractElement>)newValue);
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
      case IotPackage.IF_BLOCK__ELEMENTOS:
        getElementos().clear();
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
      case IotPackage.IF_BLOCK__ELEMENTOS:
        return elementos != null && !elementos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfBlockImpl
