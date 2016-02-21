/**
 */
package org.slf.iot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispositivo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.Dispositivo#getName <em>Name</em>}</li>
 *   <li>{@link org.slf.iot.Dispositivo#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.slf.iot.Dispositivo#getEtiquetas <em>Etiquetas</em>}</li>
 *   <li>{@link org.slf.iot.Dispositivo#getEstados <em>Estados</em>}</li>
 *   <li>{@link org.slf.iot.Dispositivo#getEventos <em>Eventos</em>}</li>
 *   <li>{@link org.slf.iot.Dispositivo#getTransiciones <em>Transiciones</em>}</li>
 * </ul>
 *
 * @see org.slf.iot.IotPackage#getDispositivo()
 * @model
 * @generated
 */
public interface Dispositivo extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.slf.iot.IotPackage#getDispositivo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slf.iot.Dispositivo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Dispositivo)
   * @see org.slf.iot.IotPackage#getDispositivo_SuperType()
   * @model
   * @generated
   */
  Dispositivo getSuperType();

  /**
   * Sets the value of the '{@link org.slf.iot.Dispositivo#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Dispositivo value);

  /**
   * Returns the value of the '<em><b>Etiquetas</b></em>' containment reference list.
   * The list contents are of type {@link org.slf.iot.Etiqueta}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etiquetas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etiquetas</em>' containment reference list.
   * @see org.slf.iot.IotPackage#getDispositivo_Etiquetas()
   * @model containment="true"
   * @generated
   */
  EList<Etiqueta> getEtiquetas();

  /**
   * Returns the value of the '<em><b>Estados</b></em>' containment reference list.
   * The list contents are of type {@link org.slf.iot.Estado}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estados</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estados</em>' containment reference list.
   * @see org.slf.iot.IotPackage#getDispositivo_Estados()
   * @model containment="true"
   * @generated
   */
  EList<Estado> getEstados();

  /**
   * Returns the value of the '<em><b>Eventos</b></em>' containment reference list.
   * The list contents are of type {@link org.slf.iot.Evento}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eventos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eventos</em>' containment reference list.
   * @see org.slf.iot.IotPackage#getDispositivo_Eventos()
   * @model containment="true"
   * @generated
   */
  EList<Evento> getEventos();

  /**
   * Returns the value of the '<em><b>Transiciones</b></em>' containment reference list.
   * The list contents are of type {@link org.slf.iot.Transicion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transiciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transiciones</em>' containment reference list.
   * @see org.slf.iot.IotPackage#getDispositivo_Transiciones()
   * @model containment="true"
   * @generated
   */
  EList<Transicion> getTransiciones();

} // Dispositivo
