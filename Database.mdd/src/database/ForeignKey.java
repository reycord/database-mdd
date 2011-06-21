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
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.ForeignKey#getSourceTable <em>Source Table</em>}</li>
 *   <li>{@link database.ForeignKey#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link database.ForeignKey#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link database.ForeignKey#getTargetColumn <em>Target Column</em>}</li>
 *   <li>{@link database.ForeignKey#getTargetPrimaryKey <em>Target Primary Key</em>}</li>
 *   <li>{@link database.ForeignKey#getDbFkRoot <em>Db Fk Root</em>}</li>
 *   <li>{@link database.ForeignKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Table</em>' reference.
	 * @see #setSourceTable(Table)
	 * @see database.DatabasePackage#getForeignKey_SourceTable()
	 * @model required="true"
	 * @generated
	 */
	Table getSourceTable();

	/**
	 * Sets the value of the '{@link database.ForeignKey#getSourceTable <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Table</em>' reference.
	 * @see #getSourceTable()
	 * @generated
	 */
	void setSourceTable(Table value);

	/**
	 * Returns the value of the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Table</em>' reference.
	 * @see #setTargetTable(Table)
	 * @see database.DatabasePackage#getForeignKey_TargetTable()
	 * @model required="true"
	 * @generated
	 */
	Table getTargetTable();

	/**
	 * Sets the value of the '{@link database.ForeignKey#getTargetTable <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table</em>' reference.
	 * @see #getTargetTable()
	 * @generated
	 */
	void setTargetTable(Table value);

	/**
	 * Returns the value of the '<em><b>Source Column</b></em>' reference list.
	 * The list contents are of type {@link database.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Column</em>' reference list.
	 * @see database.DatabasePackage#getForeignKey_SourceColumn()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getSourceColumn();

	/**
	 * Returns the value of the '<em><b>Target Column</b></em>' reference list.
	 * The list contents are of type {@link database.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column</em>' reference list.
	 * @see database.DatabasePackage#getForeignKey_TargetColumn()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getTargetColumn();

	/**
	 * Returns the value of the '<em><b>Target Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Primary Key</em>' reference.
	 * @see #setTargetPrimaryKey(PrimaryKey)
	 * @see database.DatabasePackage#getForeignKey_TargetPrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getTargetPrimaryKey();

	/**
	 * Sets the value of the '{@link database.ForeignKey#getTargetPrimaryKey <em>Target Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Primary Key</em>' reference.
	 * @see #getTargetPrimaryKey()
	 * @generated
	 */
	void setTargetPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Db Fk Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link database.Database#getDbFK <em>Db FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Fk Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Fk Root</em>' container reference.
	 * @see #setDbFkRoot(Database)
	 * @see database.DatabasePackage#getForeignKey_DbFkRoot()
	 * @see database.Database#getDbFK
	 * @model opposite="DbFK" required="true" transient="false"
	 * @generated
	 */
	Database getDbFkRoot();

	/**
	 * Sets the value of the '{@link database.ForeignKey#getDbFkRoot <em>Db Fk Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Fk Root</em>' container reference.
	 * @see #getDbFkRoot()
	 * @generated
	 */
	void setDbFkRoot(Database value);

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
	 * @see database.DatabasePackage#getForeignKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link database.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ForeignKey
