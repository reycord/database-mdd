/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CSharp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CSharp.Namespace#getClasses <em>Classes</em>}</li>
 *   <li>{@link CSharp.Namespace#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link CSharp.Namespace#isIsImported <em>Is Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @see CSharp.CSharpPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends Element {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link CSharp.Class}.
	 * It is bidirectional and its opposite is '{@link CSharp.Class#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see CSharp.CSharpPackage#getNamespace_Classes()
	 * @see CSharp.Class#getNamespace
	 * @model opposite="namespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<CSharp.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link CSharp.Enumeration}.
	 * It is bidirectional and its opposite is '{@link CSharp.Enumeration#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see CSharp.CSharpPackage#getNamespace_Enumerations()
	 * @see CSharp.Enumeration#getNamespace
	 * @model opposite="namespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Is Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Imported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Imported</em>' attribute.
	 * @see #setIsImported(boolean)
	 * @see CSharp.CSharpPackage#getNamespace_IsImported()
	 * @model unique="false" dataType="CSharp.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsImported();

	/**
	 * Sets the value of the '{@link CSharp.Namespace#isIsImported <em>Is Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Imported</em>' attribute.
	 * @see #isIsImported()
	 * @generated
	 */
	void setIsImported(boolean value);

} // Namespace
