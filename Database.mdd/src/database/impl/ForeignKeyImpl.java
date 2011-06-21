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
import database.PrimaryKey;
import database.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link database.impl.ForeignKeyImpl#getSourceTable <em>Source Table</em>}</li>
 *   <li>{@link database.impl.ForeignKeyImpl#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link database.impl.ForeignKeyImpl#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link database.impl.ForeignKeyImpl#getTargetColumn <em>Target Column</em>}</li>
 *   <li>{@link database.impl.ForeignKeyImpl#getTargetPrimaryKey <em>Target Primary Key</em>}</li>
 *   <li>{@link database.impl.ForeignKeyImpl#getDbFkRoot <em>Db Fk Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends EObjectImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getSourceTable() <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTable()
	 * @generated
	 * @ordered
	 */
	protected Table sourceTable;

	/**
	 * The cached value of the '{@link #getTargetTable() <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTable()
	 * @generated
	 * @ordered
	 */
	protected Table targetTable;

	/**
	 * The cached value of the '{@link #getSourceColumn() <em>Source Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> sourceColumn;

	/**
	 * The cached value of the '{@link #getTargetColumn() <em>Target Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> targetColumn;

	/**
	 * The cached value of the '{@link #getTargetPrimaryKey() <em>Target Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey targetPrimaryKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getSourceTable() {
		if (sourceTable != null && sourceTable.eIsProxy()) {
			InternalEObject oldSourceTable = (InternalEObject)sourceTable;
			sourceTable = (Table)eResolveProxy(oldSourceTable);
			if (sourceTable != oldSourceTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.FOREIGN_KEY__SOURCE_TABLE, oldSourceTable, sourceTable));
			}
		}
		return sourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetSourceTable() {
		return sourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTable(Table newSourceTable) {
		Table oldSourceTable = sourceTable;
		sourceTable = newSourceTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY__SOURCE_TABLE, oldSourceTable, sourceTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTargetTable() {
		if (targetTable != null && targetTable.eIsProxy()) {
			InternalEObject oldTargetTable = (InternalEObject)targetTable;
			targetTable = (Table)eResolveProxy(oldTargetTable);
			if (targetTable != oldTargetTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.FOREIGN_KEY__TARGET_TABLE, oldTargetTable, targetTable));
			}
		}
		return targetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTargetTable() {
		return targetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTable(Table newTargetTable) {
		Table oldTargetTable = targetTable;
		targetTable = newTargetTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY__TARGET_TABLE, oldTargetTable, targetTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getSourceColumn() {
		if (sourceColumn == null) {
			sourceColumn = new EObjectResolvingEList<Column>(Column.class, this, DatabasePackage.FOREIGN_KEY__SOURCE_COLUMN);
		}
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getTargetColumn() {
		if (targetColumn == null) {
			targetColumn = new EObjectResolvingEList<Column>(Column.class, this, DatabasePackage.FOREIGN_KEY__TARGET_COLUMN);
		}
		return targetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getTargetPrimaryKey() {
		if (targetPrimaryKey != null && targetPrimaryKey.eIsProxy()) {
			InternalEObject oldTargetPrimaryKey = (InternalEObject)targetPrimaryKey;
			targetPrimaryKey = (PrimaryKey)eResolveProxy(oldTargetPrimaryKey);
			if (targetPrimaryKey != oldTargetPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.FOREIGN_KEY__TARGET_PRIMARY_KEY, oldTargetPrimaryKey, targetPrimaryKey));
			}
		}
		return targetPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetTargetPrimaryKey() {
		return targetPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPrimaryKey(PrimaryKey newTargetPrimaryKey) {
		PrimaryKey oldTargetPrimaryKey = targetPrimaryKey;
		targetPrimaryKey = newTargetPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY__TARGET_PRIMARY_KEY, oldTargetPrimaryKey, targetPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDbFkRoot() {
		if (eContainerFeatureID() != DatabasePackage.FOREIGN_KEY__DB_FK_ROOT) return null;
		return (Database)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbFkRoot(Database newDbFkRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDbFkRoot, DatabasePackage.FOREIGN_KEY__DB_FK_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbFkRoot(Database newDbFkRoot) {
		if (newDbFkRoot != eInternalContainer() || (eContainerFeatureID() != DatabasePackage.FOREIGN_KEY__DB_FK_ROOT && newDbFkRoot != null)) {
			if (EcoreUtil.isAncestor(this, newDbFkRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDbFkRoot != null)
				msgs = ((InternalEObject)newDbFkRoot).eInverseAdd(this, DatabasePackage.DATABASE__DB_FK, Database.class, msgs);
			msgs = basicSetDbFkRoot(newDbFkRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY__DB_FK_ROOT, newDbFkRoot, newDbFkRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDbFkRoot((Database)otherEnd, msgs);
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
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				return basicSetDbFkRoot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				return eInternalContainer().eInverseRemove(this, DatabasePackage.DATABASE__DB_FK, Database.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY__SOURCE_TABLE:
				if (resolve) return getSourceTable();
				return basicGetSourceTable();
			case DatabasePackage.FOREIGN_KEY__TARGET_TABLE:
				if (resolve) return getTargetTable();
				return basicGetTargetTable();
			case DatabasePackage.FOREIGN_KEY__SOURCE_COLUMN:
				return getSourceColumn();
			case DatabasePackage.FOREIGN_KEY__TARGET_COLUMN:
				return getTargetColumn();
			case DatabasePackage.FOREIGN_KEY__TARGET_PRIMARY_KEY:
				if (resolve) return getTargetPrimaryKey();
				return basicGetTargetPrimaryKey();
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				return getDbFkRoot();
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
			case DatabasePackage.FOREIGN_KEY__SOURCE_TABLE:
				setSourceTable((Table)newValue);
				return;
			case DatabasePackage.FOREIGN_KEY__TARGET_TABLE:
				setTargetTable((Table)newValue);
				return;
			case DatabasePackage.FOREIGN_KEY__SOURCE_COLUMN:
				getSourceColumn().clear();
				getSourceColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabasePackage.FOREIGN_KEY__TARGET_COLUMN:
				getTargetColumn().clear();
				getTargetColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabasePackage.FOREIGN_KEY__TARGET_PRIMARY_KEY:
				setTargetPrimaryKey((PrimaryKey)newValue);
				return;
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				setDbFkRoot((Database)newValue);
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
			case DatabasePackage.FOREIGN_KEY__SOURCE_TABLE:
				setSourceTable((Table)null);
				return;
			case DatabasePackage.FOREIGN_KEY__TARGET_TABLE:
				setTargetTable((Table)null);
				return;
			case DatabasePackage.FOREIGN_KEY__SOURCE_COLUMN:
				getSourceColumn().clear();
				return;
			case DatabasePackage.FOREIGN_KEY__TARGET_COLUMN:
				getTargetColumn().clear();
				return;
			case DatabasePackage.FOREIGN_KEY__TARGET_PRIMARY_KEY:
				setTargetPrimaryKey((PrimaryKey)null);
				return;
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				setDbFkRoot((Database)null);
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
			case DatabasePackage.FOREIGN_KEY__SOURCE_TABLE:
				return sourceTable != null;
			case DatabasePackage.FOREIGN_KEY__TARGET_TABLE:
				return targetTable != null;
			case DatabasePackage.FOREIGN_KEY__SOURCE_COLUMN:
				return sourceColumn != null && !sourceColumn.isEmpty();
			case DatabasePackage.FOREIGN_KEY__TARGET_COLUMN:
				return targetColumn != null && !targetColumn.isEmpty();
			case DatabasePackage.FOREIGN_KEY__TARGET_PRIMARY_KEY:
				return targetPrimaryKey != null;
			case DatabasePackage.FOREIGN_KEY__DB_FK_ROOT:
				return getDbFkRoot() != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
