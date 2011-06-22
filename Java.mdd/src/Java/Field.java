/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java.Field#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java.JavaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends ClassMember {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' attribute.
	 * @see #setInitializer(String)
	 * @see Java.JavaPackage#getField_Initializer()
	 * @model unique="false" dataType="Java.PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getInitializer();

	/**
	 * Sets the value of the '{@link Java.Field#getInitializer <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' attribute.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(String value);

} // Field
