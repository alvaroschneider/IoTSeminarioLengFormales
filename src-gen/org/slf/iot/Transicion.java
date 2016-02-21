/**
 */
package org.slf.iot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.Transicion#getEvento <em>Evento</em>}</li>
 *   <li>{@link org.slf.iot.Transicion#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see org.slf.iot.IotPackage#getTransicion()
 * @model
 * @generated
 */
public interface Transicion extends EObject
{
  /**
   * Returns the value of the '<em><b>Evento</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evento</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evento</em>' reference.
   * @see #setEvento(Evento)
   * @see org.slf.iot.IotPackage#getTransicion_Evento()
   * @model
   * @generated
   */
  Evento getEvento();

  /**
   * Sets the value of the '{@link org.slf.iot.Transicion#getEvento <em>Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evento</em>' reference.
   * @see #getEvento()
   * @generated
   */
  void setEvento(Evento value);

  /**
   * Returns the value of the '<em><b>Estado</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estado</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estado</em>' reference.
   * @see #setEstado(Estado)
   * @see org.slf.iot.IotPackage#getTransicion_Estado()
   * @model
   * @generated
   */
  Estado getEstado();

  /**
   * Sets the value of the '{@link org.slf.iot.Transicion#getEstado <em>Estado</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estado</em>' reference.
   * @see #getEstado()
   * @generated
   */
  void setEstado(Estado value);

} // Transicion
