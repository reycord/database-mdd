/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package database.impl;

import database.Column;
import database.Database;
import database.DatabasePackage;
import database.ForeignKey;
import database.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link database.impl.DatabaseImpl#getDbFK <em>Db FK</em>}</li>
 *   <li>{@link database.impl.DatabaseImpl#getDbTable <em>Db Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends EObjectImpl implements Database {
	/**
	 * The cached value of the '{@link #getDbFK() <em>Db FK</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbFK()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> dbFK;

	/**
	 * The cached value of the '{@link #getDbTable() <em>Db Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> dbTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getDbFK() {
		if (dbFK == null) {
			dbFK = new EObjectContainmentWithInverseEList<ForeignKey>(ForeignKey.class, this, DatabasePackage.DATABASE__DB_FK, DatabasePackage.FOREIGN_KEY__DB_FK_ROOT);
		}
		return dbFK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getDbTable() {
		if (dbTable == null) {
			dbTable = new EObjectContainmentWithInverseEList<Table>(Table.class, this, DatabasePackage.DATABASE__DB_TABLE, DatabasePackage.TABLE__DB_TABLE_ROOT);
		}
		return dbTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.DATABASE__DB_FK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDbFK()).basicAdd(otherEnd, msgs);
			case DatabasePackage.DATABASE__DB_TABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDbTable()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.DATABASE__DB_FK:
				return ((InternalEList<?>)getDbFK()).basicRemove(otherEnd, msgs);
			case DatabasePackage.DATABASE__DB_TABLE:
				return ((InternalEList<?>)getDbTable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.DATABASE__DB_FK:
				return getDbFK();
			case DatabasePackage.DATABASE__DB_TABLE:
				return getDbTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.DATABASE__DB_FK:
				getDbFK().clear();
				getDbFK().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case DatabasePackage.DATABASE__DB_TABLE:
				getDbTable().clear();
				getDbTable().addAll((Collection<? extends Table>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatabasePackage.DATABASE__DB_FK:
				getDbFK().clear();
				return;
			case DatabasePackage.DATABASE__DB_TABLE:
				getDbTable().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabasePackage.DATABASE__DB_FK:
				return dbFK != null && !dbFK.isEmpty();
			case DatabasePackage.DATABASE__DB_TABLE:
				return dbTable != null && !dbTable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
