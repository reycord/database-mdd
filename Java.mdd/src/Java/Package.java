/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link Java.Package#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link Java.Package#isIsImported <em>Is Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java.JavaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Element {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link Java.Class}.
	 * It is bidirectional and its opposite is '{@link Java.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see Java.JavaPackage#getPackage_Classes()
	 * @see Java.Class#getPackage
	 * @model opposite="package" containment="true" ordered="false"
	 * @generated
	 */
	EList<Java.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link Java.Enumeration}.
	 * It is bidirectional and its opposite is '{@link Java.Enumeration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see Java.JavaPackage#getPackage_Enumerations()
	 * @see Java.Enumeration#getPackage
	 * @model opposite="package" containment="true" ordered="false"
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
	 * @see Java.JavaPackage#getPackage_IsImported()
	 * @model unique="false" dataType="Java.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsImported();

	/**
	 * Sets the value of the '{@link Java.Package#isIsImported <em>Is Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Imported</em>' attribute.
	 * @see #isIsImported()
	 * @generated
	 */
	void setIsImported(boolean value);

} // Package
