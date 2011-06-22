/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java.impl;

import Java.Enumeration;
import Java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link Java.impl.PackageImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link Java.impl.PackageImpl#isIsImported <em>Is Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends ElementImpl implements Java.Package {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Java.Class> classes;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;

	/**
	 * The default value of the '{@link #isIsImported() <em>Is Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImported() <em>Is Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImported()
	 * @generated
	 * @ordered
	 */
	protected boolean isImported = IS_IMPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Java.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<Java.Class>(Java.Class.class, this, JavaPackage.PACKAGE__CLASSES, JavaPackage.CLASS__PACKAGE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentWithInverseEList<Enumeration>(Enumeration.class, this, JavaPackage.PACKAGE__ENUMERATIONS, JavaPackage.ENUMERATION__PACKAGE);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImported() {
		return isImported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImported(boolean newIsImported) {
		boolean oldIsImported = isImported;
		isImported = newIsImported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.PACKAGE__IS_IMPORTED, oldIsImported, isImported));
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
			case JavaPackage.PACKAGE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case JavaPackage.PACKAGE__ENUMERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerations()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case JavaPackage.PACKAGE__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.PACKAGE__CLASSES:
				return getClasses();
			case JavaPackage.PACKAGE__ENUMERATIONS:
				return getEnumerations();
			case JavaPackage.PACKAGE__IS_IMPORTED:
				return isIsImported();
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
			case JavaPackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Java.Class>)newValue);
				return;
			case JavaPackage.PACKAGE__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case JavaPackage.PACKAGE__IS_IMPORTED:
				setIsImported((Boolean)newValue);
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
			case JavaPackage.PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case JavaPackage.PACKAGE__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case JavaPackage.PACKAGE__IS_IMPORTED:
				setIsImported(IS_IMPORTED_EDEFAULT);
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
			case JavaPackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case JavaPackage.PACKAGE__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case JavaPackage.PACKAGE__IS_IMPORTED:
				return isImported != IS_IMPORTED_EDEFAULT;
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
		result.append(" (isImported: ");
		result.append(isImported);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
