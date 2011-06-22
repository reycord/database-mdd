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
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CSharp.Statement#getName <em>Name</em>}</li>
 *   <li>{@link CSharp.Statement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see CSharp.CSharpPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
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
	 * @see CSharp.CSharpPackage#getStatement_Name()
	 * @model dataType="CSharp.PrimitiveTypes.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CSharp.Statement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see CSharp.CSharpPackage#getStatement_Body()
	 * @model dataType="CSharp.PrimitiveTypes.String" required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link CSharp.Statement#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Statement
