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
import database.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link database.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link database.impl.TableImpl#getDbTableRoot <em>Db Table Root</em>}</li>
 *   <li>{@link database.impl.TableImpl#getTableColumn <em>Table Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableColumn() <em>Table Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> tableColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDbTableRoot() {
		if (eContainerFeatureID() != DatabasePackage.TABLE__DB_TABLE_ROOT) return null;
		return (Database)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbTableRoot(Database newDbTableRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDbTableRoot, DatabasePackage.TABLE__DB_TABLE_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbTableRoot(Database newDbTableRoot) {
		if (newDbTableRoot != eInternalContainer() || (eContainerFeatureID() != DatabasePackage.TABLE__DB_TABLE_ROOT && newDbTableRoot != null)) {
			if (EcoreUtil.isAncestor(this, newDbTableRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDbTableRoot != null)
				msgs = ((InternalEObject)newDbTableRoot).eInverseAdd(this, DatabasePackage.DATABASE__DB_TABLE, Database.class, msgs);
			msgs = basicSetDbTableRoot(newDbTableRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__DB_TABLE_ROOT, newDbTableRoot, newDbTableRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getTableColumn() {
		if (tableColumn == null) {
			tableColumn = new EObjectContainmentWithInverseEList<Column>(Column.class, this, DatabasePackage.TABLE__TABLE_COLUMN, DatabasePackage.COLUMN__COLUMN_TABLE);
		}
		return tableColumn;
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
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDbTableRoot((Database)otherEnd, msgs);
			case DatabasePackage.TABLE__TABLE_COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTableColumn()).basicAdd(otherEnd, msgs);
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
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				return basicSetDbTableRoot(null, msgs);
			case DatabasePackage.TABLE__TABLE_COLUMN:
				return ((InternalEList<?>)getTableColumn()).basicRemove(otherEnd, msgs);
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
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				return eInternalContainer().eInverseRemove(this, DatabasePackage.DATABASE__DB_TABLE, Database.class, msgs);
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
			case DatabasePackage.TABLE__NAME:
				return getName();
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				return getDbTableRoot();
			case DatabasePackage.TABLE__TABLE_COLUMN:
				return getTableColumn();
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
			case DatabasePackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				setDbTableRoot((Database)newValue);
				return;
			case DatabasePackage.TABLE__TABLE_COLUMN:
				getTableColumn().clear();
				getTableColumn().addAll((Collection<? extends Column>)newValue);
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
			case DatabasePackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				setDbTableRoot((Database)null);
				return;
			case DatabasePackage.TABLE__TABLE_COLUMN:
				getTableColumn().clear();
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
			case DatabasePackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabasePackage.TABLE__DB_TABLE_ROOT:
				return getDbTableRoot() != null;
			case DatabasePackage.TABLE__TABLE_COLUMN:
				return tableColumn != null && !tableColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl
