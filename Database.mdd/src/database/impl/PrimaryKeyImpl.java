/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package database.impl;

import database.Column;
import database.DatabasePackage;
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
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link database.impl.PrimaryKeyImpl#getPrimaryKeyColumn <em>Primary Key Column</em>}</li>
 *   <li>{@link database.impl.PrimaryKeyImpl#getPrimaryKeyTable <em>Primary Key Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyImpl extends EObjectImpl implements PrimaryKey {
	/**
	 * The cached value of the '{@link #getPrimaryKeyColumn() <em>Primary Key Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> primaryKeyColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.PRIMARY_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getPrimaryKeyColumn() {
		if (primaryKeyColumn == null) {
			primaryKeyColumn = new EObjectResolvingEList<Column>(Column.class, this, DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_COLUMN);
		}
		return primaryKeyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getPrimaryKeyTable() {
		if (eContainerFeatureID() != DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKeyTable(Table newPrimaryKeyTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrimaryKeyTable, DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyTable(Table newPrimaryKeyTable) {
		if (newPrimaryKeyTable != eInternalContainer() || (eContainerFeatureID() != DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE && newPrimaryKeyTable != null)) {
			if (EcoreUtil.isAncestor(this, newPrimaryKeyTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrimaryKeyTable != null)
				msgs = ((InternalEObject)newPrimaryKeyTable).eInverseAdd(this, DatabasePackage.TABLE__TABLE_PRIMARY_KEY, Table.class, msgs);
			msgs = basicSetPrimaryKeyTable(newPrimaryKeyTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE, newPrimaryKeyTable, newPrimaryKeyTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrimaryKeyTable((Table)otherEnd, msgs);
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
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				return basicSetPrimaryKeyTable(null, msgs);
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
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				return eInternalContainer().eInverseRemove(this, DatabasePackage.TABLE__TABLE_PRIMARY_KEY, Table.class, msgs);
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
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_COLUMN:
				return getPrimaryKeyColumn();
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				return getPrimaryKeyTable();
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
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_COLUMN:
				getPrimaryKeyColumn().clear();
				getPrimaryKeyColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				setPrimaryKeyTable((Table)newValue);
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
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_COLUMN:
				getPrimaryKeyColumn().clear();
				return;
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				setPrimaryKeyTable((Table)null);
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
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_COLUMN:
				return primaryKeyColumn != null && !primaryKeyColumn.isEmpty();
			case DatabasePackage.PRIMARY_KEY__PRIMARY_KEY_TABLE:
				return getPrimaryKeyTable() != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
