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
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Database#getDbFK <em>Db FK</em>}</li>
 *   <li>{@link database.Database#getDbTable <em>Db Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Db FK</b></em>' containment reference list.
	 * The list contents are of type {@link database.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link database.ForeignKey#getDbFkRoot <em>Db Fk Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db FK</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db FK</em>' containment reference list.
	 * @see database.DatabasePackage#getDatabase_DbFK()
	 * @see database.ForeignKey#getDbFkRoot
	 * @model opposite="DbFkRoot" containment="true"
	 * @generated
	 */
	EList<ForeignKey> getDbFK();

	/**
	 * Returns the value of the '<em><b>Db Table</b></em>' containment reference list.
	 * The list contents are of type {@link database.Table}.
	 * It is bidirectional and its opposite is '{@link database.Table#getDbTableRoot <em>Db Table Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table</em>' containment reference list.
	 * @see database.DatabasePackage#getDatabase_DbTable()
	 * @see database.Table#getDbTableRoot
	 * @model opposite="DbTableRoot" containment="true"
	 * @generated
	 */
	EList<Table> getDbTable();

} // Database
