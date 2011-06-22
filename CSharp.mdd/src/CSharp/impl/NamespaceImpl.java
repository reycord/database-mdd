/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CSharp.impl;

import CSharp.CSharpPackage;
import CSharp.Enumeration;
import CSharp.Namespace;

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
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CSharp.impl.NamespaceImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link CSharp.impl.NamespaceImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link CSharp.impl.NamespaceImpl#isIsImported <em>Is Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceImpl extends ElementImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharp.Class> classes;

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
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharp.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<CSharp.Class>(CSharp.Class.class, this, CSharpPackage.NAMESPACE__CLASSES, CSharpPackage.CLASS__NAMESPACE);
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
			enumerations = new EObjectContainmentWithInverseEList<Enumeration>(Enumeration.class, this, CSharpPackage.NAMESPACE__ENUMERATIONS, CSharpPackage.ENUMERATION__NAMESPACE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.NAMESPACE__IS_IMPORTED, oldIsImported, isImported));
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
			case CSharpPackage.NAMESPACE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case CSharpPackage.NAMESPACE__ENUMERATIONS:
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
			case CSharpPackage.NAMESPACE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case CSharpPackage.NAMESPACE__ENUMERATIONS:
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
			case CSharpPackage.NAMESPACE__CLASSES:
				return getClasses();
			case CSharpPackage.NAMESPACE__ENUMERATIONS:
				return getEnumerations();
			case CSharpPackage.NAMESPACE__IS_IMPORTED:
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
			case CSharpPackage.NAMESPACE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends CSharp.Class>)newValue);
				return;
			case CSharpPackage.NAMESPACE__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case CSharpPackage.NAMESPACE__IS_IMPORTED:
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
			case CSharpPackage.NAMESPACE__CLASSES:
				getClasses().clear();
				return;
			case CSharpPackage.NAMESPACE__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case CSharpPackage.NAMESPACE__IS_IMPORTED:
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
			case CSharpPackage.NAMESPACE__CLASSES:
				return classes != null && !classes.isEmpty();
			case CSharpPackage.NAMESPACE__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case CSharpPackage.NAMESPACE__IS_IMPORTED:
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

} //NamespaceImpl
