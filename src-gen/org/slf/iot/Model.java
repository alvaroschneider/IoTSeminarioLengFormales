/**
 */
package org.slf.iot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.Model#getDispositivos <em>Dispositivos</em>}</li>
 * </ul>
 *
 * @see org.slf.iot.IotPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Dispositivos</b></em>' containment reference list.
   * The list contents are of type {@link org.slf.iot.Dispositivo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dispositivos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dispositivos</em>' containment reference list.
   * @see org.slf.iot.IotPackage#getModel_Dispositivos()
   * @model containment="true"
   * @generated
   */
  EList<Dispositivo> getDispositivos();

} // Model
