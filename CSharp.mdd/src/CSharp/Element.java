/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CSharp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CSharp.Element#getName <em>Name</em>}</li>
 *   <li>{@link CSharp.Element#getOwningModel <em>Owning Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see CSharp.CSharpPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
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
	 * @see CSharp.CSharpPackage#getElement_Name()
	 * @model unique="false" dataType="CSharp.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CSharp.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CSharp.Model#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Model</em>' container reference.
	 * @see #setOwningModel(Model)
	 * @see CSharp.CSharpPackage#getElement_OwningModel()
	 * @see CSharp.Model#getOwnedMember
	 * @model opposite="ownedMember" transient="false"
	 * @generated
	 */
	Model getOwningModel();

	/**
	 * Sets the value of the '{@link CSharp.Element#getOwningModel <em>Owning Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Model</em>' container reference.
	 * @see #getOwningModel()
	 * @generated
	 */
	void setOwningModel(Model value);

} // Element
