/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CSharp.impl;

import CSharp.CSharpPackage;
import CSharp.ClassMember;
import CSharp.Namespace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CSharp.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#getActualTypeParameters <em>Actual Type Parameters</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link CSharp.impl.ClassImpl#isIsPartial <em>Is Partial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements CSharp.Class {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean isInterface = IS_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharp.Class> superClasses;

	/**
	 * The cached value of the '{@link #getActualTypeParameters() <em>Actual Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<CSharp.Class> actualTypeParameters;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassMember> members;

	/**
	 * The default value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartial = IS_PARTIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSharpPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.CLASS__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInterface() {
		return isInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterface(boolean newIsInterface) {
		boolean oldIsInterface = isInterface;
		isInterface = newIsInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.CLASS__IS_INTERFACE, oldIsInterface, isInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharp.Class> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<CSharp.Class>(CSharp.Class.class, this, CSharpPackage.CLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSharp.Class> getActualTypeParameters() {
		if (actualTypeParameters == null) {
			actualTypeParameters = new EObjectResolvingEList<CSharp.Class>(CSharp.Class.class, this, CSharpPackage.CLASS__ACTUAL_TYPE_PARAMETERS);
		}
		return actualTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != CSharpPackage.CLASS__NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, CSharpPackage.CLASS__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != CSharpPackage.CLASS__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CSharpPackage.NAMESPACE__CLASSES, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.CLASS__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<ClassMember>(ClassMember.class, this, CSharpPackage.CLASS__MEMBERS, CSharpPackage.CLASS_MEMBER__OWNER);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartial() {
		return isPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartial(boolean newIsPartial) {
		boolean oldIsPartial = isPartial;
		isPartial = newIsPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSharpPackage.CLASS__IS_PARTIAL, oldIsPartial, isPartial));
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
			case CSharpPackage.CLASS__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case CSharpPackage.CLASS__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
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
			case CSharpPackage.CLASS__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CSharpPackage.CLASS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case CSharpPackage.CLASS__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, CSharpPackage.NAMESPACE__CLASSES, Namespace.class, msgs);
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
			case CSharpPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case CSharpPackage.CLASS__IS_PUBLIC:
				return isIsPublic();
			case CSharpPackage.CLASS__IS_INTERFACE:
				return isIsInterface();
			case CSharpPackage.CLASS__SUPER_CLASSES:
				return getSuperClasses();
			case CSharpPackage.CLASS__ACTUAL_TYPE_PARAMETERS:
				return getActualTypeParameters();
			case CSharpPackage.CLASS__NAMESPACE:
				return getNamespace();
			case CSharpPackage.CLASS__MEMBERS:
				return getMembers();
			case CSharpPackage.CLASS__IS_PARTIAL:
				return isIsPartial();
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
			case CSharpPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case CSharpPackage.CLASS__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case CSharpPackage.CLASS__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case CSharpPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends CSharp.Class>)newValue);
				return;
			case CSharpPackage.CLASS__ACTUAL_TYPE_PARAMETERS:
				getActualTypeParameters().clear();
				getActualTypeParameters().addAll((Collection<? extends CSharp.Class>)newValue);
				return;
			case CSharpPackage.CLASS__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case CSharpPackage.CLASS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends ClassMember>)newValue);
				return;
			case CSharpPackage.CLASS__IS_PARTIAL:
				setIsPartial((Boolean)newValue);
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
			case CSharpPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case CSharpPackage.CLASS__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case CSharpPackage.CLASS__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case CSharpPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case CSharpPackage.CLASS__ACTUAL_TYPE_PARAMETERS:
				getActualTypeParameters().clear();
				return;
			case CSharpPackage.CLASS__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case CSharpPackage.CLASS__MEMBERS:
				getMembers().clear();
				return;
			case CSharpPackage.CLASS__IS_PARTIAL:
				setIsPartial(IS_PARTIAL_EDEFAULT);
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
			case CSharpPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case CSharpPackage.CLASS__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case CSharpPackage.CLASS__IS_INTERFACE:
				return isInterface != IS_INTERFACE_EDEFAULT;
			case CSharpPackage.CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case CSharpPackage.CLASS__ACTUAL_TYPE_PARAMETERS:
				return actualTypeParameters != null && !actualTypeParameters.isEmpty();
			case CSharpPackage.CLASS__NAMESPACE:
				return getNamespace() != null;
			case CSharpPackage.CLASS__MEMBERS:
				return members != null && !members.isEmpty();
			case CSharpPackage.CLASS__IS_PARTIAL:
				return isPartial != IS_PARTIAL_EDEFAULT;
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(", isInterface: ");
		result.append(isInterface);
		result.append(", isPartial: ");
		result.append(isPartial);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
