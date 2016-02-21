/**
 */
package org.slf.iot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slf.iot.Dispositivo;
import org.slf.iot.Estado;
import org.slf.iot.Etiqueta;
import org.slf.iot.Evento;
import org.slf.iot.IotPackage;
import org.slf.iot.Transicion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispositivo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.impl.DispositivoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slf.iot.impl.DispositivoImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.slf.iot.impl.DispositivoImpl#getEtiquetas <em>Etiquetas</em>}</li>
 *   <li>{@link org.slf.iot.impl.DispositivoImpl#getEstados <em>Estados</em>}</li>
 *   <li>{@link org.slf.iot.impl.DispositivoImpl#getEventos <em>Eventos</em>}</li>
 *   <li>{@link org.slf.iot.impl.DispositivoImpl#getTransiciones <em>Transiciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispositivoImpl extends MinimalEObjectImpl.Container implements Dispositivo
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Dispositivo superType;

  /**
   * The cached value of the '{@link #getEtiquetas() <em>Etiquetas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtiquetas()
   * @generated
   * @ordered
   */
  protected EList<Etiqueta> etiquetas;

  /**
   * The cached value of the '{@link #getEstados() <em>Estados</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstados()
   * @generated
   * @ordered
   */
  protected EList<Estado> estados;

  /**
   * The cached value of the '{@link #getEventos() <em>Eventos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventos()
   * @generated
   * @ordered
   */
  protected EList<Evento> eventos;

  /**
   * The cached value of the '{@link #getTransiciones() <em>Transiciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransiciones()
   * @generated
   * @ordered
   */
  protected EList<Transicion> transiciones;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DispositivoImpl()
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
    return IotPackage.Literals.DISPOSITIVO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.DISPOSITIVO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dispositivo getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Dispositivo)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotPackage.DISPOSITIVO__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dispositivo basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(Dispositivo newSuperType)
  {
    Dispositivo oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.DISPOSITIVO__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Etiqueta> getEtiquetas()
  {
    if (etiquetas == null)
    {
      etiquetas = new EObjectContainmentEList<Etiqueta>(Etiqueta.class, this, IotPackage.DISPOSITIVO__ETIQUETAS);
    }
    return etiquetas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Estado> getEstados()
  {
    if (estados == null)
    {
      estados = new EObjectContainmentEList<Estado>(Estado.class, this, IotPackage.DISPOSITIVO__ESTADOS);
    }
    return estados;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evento> getEventos()
  {
    if (eventos == null)
    {
      eventos = new EObjectContainmentEList<Evento>(Evento.class, this, IotPackage.DISPOSITIVO__EVENTOS);
    }
    return eventos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transicion> getTransiciones()
  {
    if (transiciones == null)
    {
      transiciones = new EObjectContainmentEList<Transicion>(Transicion.class, this, IotPackage.DISPOSITIVO__TRANSICIONES);
    }
    return transiciones;
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
      case IotPackage.DISPOSITIVO__ETIQUETAS:
        return ((InternalEList<?>)getEtiquetas()).basicRemove(otherEnd, msgs);
      case IotPackage.DISPOSITIVO__ESTADOS:
        return ((InternalEList<?>)getEstados()).basicRemove(otherEnd, msgs);
      case IotPackage.DISPOSITIVO__EVENTOS:
        return ((InternalEList<?>)getEventos()).basicRemove(otherEnd, msgs);
      case IotPackage.DISPOSITIVO__TRANSICIONES:
        return ((InternalEList<?>)getTransiciones()).basicRemove(otherEnd, msgs);
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
      case IotPackage.DISPOSITIVO__NAME:
        return getName();
      case IotPackage.DISPOSITIVO__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case IotPackage.DISPOSITIVO__ETIQUETAS:
        return getEtiquetas();
      case IotPackage.DISPOSITIVO__ESTADOS:
        return getEstados();
      case IotPackage.DISPOSITIVO__EVENTOS:
        return getEventos();
      case IotPackage.DISPOSITIVO__TRANSICIONES:
        return getTransiciones();
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
      case IotPackage.DISPOSITIVO__NAME:
        setName((String)newValue);
        return;
      case IotPackage.DISPOSITIVO__SUPER_TYPE:
        setSuperType((Dispositivo)newValue);
        return;
      case IotPackage.DISPOSITIVO__ETIQUETAS:
        getEtiquetas().clear();
        getEtiquetas().addAll((Collection<? extends Etiqueta>)newValue);
        return;
      case IotPackage.DISPOSITIVO__ESTADOS:
        getEstados().clear();
        getEstados().addAll((Collection<? extends Estado>)newValue);
        return;
      case IotPackage.DISPOSITIVO__EVENTOS:
        getEventos().clear();
        getEventos().addAll((Collection<? extends Evento>)newValue);
        return;
      case IotPackage.DISPOSITIVO__TRANSICIONES:
        getTransiciones().clear();
        getTransiciones().addAll((Collection<? extends Transicion>)newValue);
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
      case IotPackage.DISPOSITIVO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IotPackage.DISPOSITIVO__SUPER_TYPE:
        setSuperType((Dispositivo)null);
        return;
      case IotPackage.DISPOSITIVO__ETIQUETAS:
        getEtiquetas().clear();
        return;
      case IotPackage.DISPOSITIVO__ESTADOS:
        getEstados().clear();
        return;
      case IotPackage.DISPOSITIVO__EVENTOS:
        getEventos().clear();
        return;
      case IotPackage.DISPOSITIVO__TRANSICIONES:
        getTransiciones().clear();
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
      case IotPackage.DISPOSITIVO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IotPackage.DISPOSITIVO__SUPER_TYPE:
        return superType != null;
      case IotPackage.DISPOSITIVO__ETIQUETAS:
        return etiquetas != null && !etiquetas.isEmpty();
      case IotPackage.DISPOSITIVO__ESTADOS:
        return estados != null && !estados.isEmpty();
      case IotPackage.DISPOSITIVO__EVENTOS:
        return eventos != null && !eventos.isEmpty();
      case IotPackage.DISPOSITIVO__TRANSICIONES:
        return transiciones != null && !transiciones.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DispositivoImpl
