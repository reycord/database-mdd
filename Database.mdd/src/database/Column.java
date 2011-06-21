/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package database;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Column#getName <em>Name</em>}</li>
 *   <li>{@link database.Column#getColumnTable <em>Column Table</em>}</li>
 *   <li>{@link database.Column#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
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
	 * @see database.DatabasePackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link database.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link database.Table#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Table</em>' container reference.
	 * @see #setColumnTable(Table)
	 * @see database.DatabasePackage#getColumn_ColumnTable()
	 * @see database.Table#getTableColumn
	 * @model opposite="TableColumn" required="true" transient="false"
	 * @generated
	 */
	Table getColumnTable();

	/**
	 * Sets the value of the '{@link database.Column#getColumnTable <em>Column Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Table</em>' container reference.
	 * @see #getColumnTable()
	 * @generated
	 */
	void setColumnTable(Table value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link database.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see database.DataType
	 * @see #setType(DataType)
	 * @see database.DatabasePackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link database.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see database.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Column
