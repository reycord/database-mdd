/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java.Model#getName <em>Name</em>}</li>
 *   <li>{@link Java.Model#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java.JavaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see Java.JavaPackage#getModel_Name()
	 * @model dataType="Java.PrimitiveTypes.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Java.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link Java.Element}.
	 * It is bidirectional and its opposite is '{@link Java.Element#getOwningModel <em>Owning Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see Java.JavaPackage#getModel_OwnedMember()
	 * @see Java.Element#getOwningModel
	 * @model opposite="owningModel" containment="true"
	 * @generated
	 */
	EList<Element> getOwnedMember();

} // Model
