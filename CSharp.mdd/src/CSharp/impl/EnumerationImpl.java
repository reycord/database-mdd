/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CSharp.impl;

import CSharp.CSharpPackage;
import CSharp.Enumeration;
import CSharp.EnumerationLiteral;
import CSharp.Namespace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CSharp.impl.EnumerationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CSharp.impl.EnumerationImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends TypeImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> enumerationLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != CSharpPackage.ENUMERATION__NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, CSharpPackage.ENUMERATION__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != CSharpPackage.ENUMERATION__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CSharpPackage.NAMESPACE__ENUMERATIONS, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.ENUMERATION__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getEnumerationLiterals() {
		if (enumerationLiterals == null) {
			enumerationLiterals = new EObjectContainmentWithInverseEList<EnumerationLiteral>(EnumerationLiteral.class, this, CSharpPackage.ENUMERATION__ENUMERATION_LITERALS, CSharpPackage.ENUMERATION_LITERAL__ENUMERATION);
		}
		return enumerationLiterals;
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case CSharpPackage.ENUMERATION__ENUMERATION_LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerationLiterals()).basicAdd(otherEnd, msgs);
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CSharpPackage.ENUMERATION__ENUMERATION_LITERALS:
				return ((InternalEList<?>)getEnumerationLiterals()).basicRemove(otherEnd, msgs);
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, CSharpPackage.NAMESPACE__ENUMERATIONS, Namespace.class, msgs);
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				return getNamespace();
			case CSharpPackage.ENUMERATION__ENUMERATION_LITERALS:
				return getEnumerationLiterals();
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case CSharpPackage.ENUMERATION__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				getEnumerationLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case CSharpPackage.ENUMERATION__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
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
			case CSharpPackage.ENUMERATION__NAMESPACE:
				return getNamespace() != null;
			case CSharpPackage.ENUMERATION__ENUMERATION_LITERALS:
				return enumerationLiterals != null && !enumerationLiterals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationImpl
