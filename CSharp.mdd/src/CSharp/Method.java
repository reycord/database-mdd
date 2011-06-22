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
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CSharp.Method#getBody <em>Body</em>}</li>
 *   <li>{@link CSharp.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link CSharp.Method#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see CSharp.CSharpPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends ClassMember {
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
	 * @see CSharp.CSharpPackage#getMethod_Body()
	 * @model unique="false" dataType="CSharp.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link CSharp.Method#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link CSharp.MethodParameter}.
	 * It is bidirectional and its opposite is '{@link CSharp.MethodParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see CSharp.CSharpPackage#getMethod_Parameters()
	 * @see CSharp.MethodParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<MethodParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link CSharp.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see CSharp.CSharpPackage#getMethod_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Method
