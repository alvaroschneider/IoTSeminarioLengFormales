/**
 */
package org.slf.iot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.Estado#getName <em>Name</em>}</li>
 *   <li>{@link org.slf.iot.Estado#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see org.slf.iot.IotPackage#getEstado()
 * @model
 * @generated
 */
public interface Estado extends EObject
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
   * @see org.slf.iot.IotPackage#getEstado_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slf.iot.Estado#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
   * The list contents are of type {@link org.slf.iot.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementos</em>' containment reference list.
   * @see org.slf.iot.IotPackage#getEstado_Elementos()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElementos();

} // Estado
