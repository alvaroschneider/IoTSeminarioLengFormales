/**
 */
package org.slf.iot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slf.iot.Estado;
import org.slf.iot.Evento;
import org.slf.iot.IotPackage;
import org.slf.iot.Transicion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.impl.TransicionImpl#getEvento <em>Evento</em>}</li>
 *   <li>{@link org.slf.iot.impl.TransicionImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransicionImpl extends MinimalEObjectImpl.Container implements Transicion
{
  /**
   * The cached value of the '{@link #getEvento() <em>Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvento()
   * @generated
   * @ordered
   */
  protected Evento evento;

  /**
   * The cached value of the '{@link #getEstado() <em>Estado</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstado()
   * @generated
   * @ordered
   */
  protected Estado estado;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransicionImpl()
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
    return IotPackage.Literals.TRANSICION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento getEvento()
  {
    if (evento != null && evento.eIsProxy())
    {
      InternalEObject oldEvento = (InternalEObject)evento;
      evento = (Evento)eResolveProxy(oldEvento);
      if (evento != oldEvento)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotPackage.TRANSICION__EVENTO, oldEvento, evento));
      }
    }
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evento basicGetEvento()
  {
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvento(Evento newEvento)
  {
    Evento oldEvento = evento;
    evento = newEvento;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.TRANSICION__EVENTO, oldEvento, evento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estado getEstado()
  {
    if (estado != null && estado.eIsProxy())
    {
      InternalEObject oldEstado = (InternalEObject)estado;
      estado = (Estado)eResolveProxy(oldEstado);
      if (estado != oldEstado)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotPackage.TRANSICION__ESTADO, oldEstado, estado));
      }
    }
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estado basicGetEstado()
  {
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstado(Estado newEstado)
  {
    Estado oldEstado = estado;
    estado = newEstado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.TRANSICION__ESTADO, oldEstado, estado));
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
      case IotPackage.TRANSICION__EVENTO:
        if (resolve) return getEvento();
        return basicGetEvento();
      case IotPackage.TRANSICION__ESTADO:
        if (resolve) return getEstado();
        return basicGetEstado();
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
      case IotPackage.TRANSICION__EVENTO:
        setEvento((Evento)newValue);
        return;
      case IotPackage.TRANSICION__ESTADO:
        setEstado((Estado)newValue);
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
      case IotPackage.TRANSICION__EVENTO:
        setEvento((Evento)null);
        return;
      case IotPackage.TRANSICION__ESTADO:
        setEstado((Estado)null);
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
      case IotPackage.TRANSICION__EVENTO:
        return evento != null;
      case IotPackage.TRANSICION__ESTADO:
        return estado != null;
    }
    return super.eIsSet(featureID);
  }

} //TransicionImpl
