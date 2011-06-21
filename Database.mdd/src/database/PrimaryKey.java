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
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.PrimaryKey#getPrimaryKeyColumn <em>Primary Key Column</em>}</li>
 *   <li>{@link database.PrimaryKey#getPrimaryKeyTable <em>Primary Key Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary Key Column</b></em>' reference list.
	 * The list contents are of type {@link database.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Column</em>' reference list.
	 * @see database.DatabasePackage#getPrimaryKey_PrimaryKeyColumn()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getPrimaryKeyColumn();

	/**
	 * Returns the value of the '<em><b>Primary Key Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link database.Table#getTablePrimaryKey <em>Table Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Table</em>' container reference.
	 * @see #setPrimaryKeyTable(Table)
	 * @see database.DatabasePackage#getPrimaryKey_PrimaryKeyTable()
	 * @see database.Table#getTablePrimaryKey
	 * @model opposite="TablePrimaryKey" required="true" transient="false"
	 * @generated
	 */
	Table getPrimaryKeyTable();

	/**
	 * Sets the value of the '{@link database.PrimaryKey#getPrimaryKeyTable <em>Primary Key Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Table</em>' container reference.
	 * @see #getPrimaryKeyTable()
	 * @generated
	 */
	void setPrimaryKeyTable(Table value);

} // PrimaryKey
