/**
 */
package org.slf.iot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slf.iot.IfBlock#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see org.slf.iot.IotPackage#getIfBlock()
 * @model
 * @generated
 */
public interface IfBlock extends EObject
{
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
   * @see org.slf.iot.IotPackage#getIfBlock_Elementos()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElementos();

} // IfBlock
