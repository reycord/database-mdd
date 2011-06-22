/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CSharp.PrimitiveTypes.impl;

import CSharp.CSharpPackage;

import CSharp.PrimitiveTypes.PrimitiveTypesFactory;
import CSharp.PrimitiveTypes.PrimitiveTypesPackage;

import CSharp.impl.CSharpPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveTypesPackageImpl extends EPackageImpl implements PrimitiveTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CSharp.PrimitiveTypes.PrimitiveTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrimitiveTypesPackageImpl() {
		super(eNS_URI, PrimitiveTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PrimitiveTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrimitiveTypesPackage init() {
		if (isInited) return (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);

		// Obtain or create and register package
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrimitiveTypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CSharpPackageImpl theCSharpPackage = (CSharpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CSharpPackage.eNS_URI) instanceof CSharpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CSharpPackage.eNS_URI) : CSharpPackage.eINSTANCE);

		// Create package meta-data objects
		thePrimitiveTypesPackage.createPackageContents();
		theCSharpPackage.createPackageContents();

		// Initialize created meta-data
		thePrimitiveTypesPackage.initializePackageContents();
		theCSharpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrimitiveTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrimitiveTypesPackage.eNS_URI, thePrimitiveTypesPackage);
		return thePrimitiveTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypesFactory getPrimitiveTypesFactory() {
		return (PrimitiveTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create data types
		stringEDataType = createEDataType(STRING);
		integerEDataType = createEDataType(INTEGER);
		booleanEDataType = createEDataType(BOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //PrimitiveTypesPackageImpl
