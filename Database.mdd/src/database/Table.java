/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Table#getName <em>Name</em>}</li>
 *   <li>{@link database.Table#getDbTableRoot <em>Db Table Root</em>}</li>
 *   <li>{@link database.Table#getTableColumn <em>Table Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see database.DatabasePackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link database.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Db Table Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link database.Database#getDbTable <em>Db Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Table Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table Root</em>' container reference.
	 * @see #setDbTableRoot(Database)
	 * @see database.DatabasePackage#getTable_DbTableRoot()
	 * @see database.Database#getDbTable
	 * @model opposite="DbTable" required="true" transient="false"
	 * @generated
	 */
	Database getDbTableRoot();

	/**
	 * Sets the value of the '{@link database.Table#getDbTableRoot <em>Db Table Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Table Root</em>' container reference.
	 * @see #getDbTableRoot()
	 * @generated
	 */
	void setDbTableRoot(Database value);

	/**
	 * Returns the value of the '<em><b>Table Column</b></em>' containment reference list.
	 * The list contents are of type {@link database.Column}.
	 * It is bidirectional and its opposite is '{@link database.Column#getColumnTable <em>Column Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column</em>' containment reference list.
	 * @see database.DatabasePackage#getTable_TableColumn()
	 * @see database.Column#getColumnTable
	 * @model opposite="ColumnTable" containment="true" required="true"
	 * @generated
	 */
	EList<Column> getTableColumn();

} // Table
