/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package database;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see database.DatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface DatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://database/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "database";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabasePackage eINSTANCE = database.impl.DatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link database.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see database.impl.DatabaseImpl
	 * @see database.impl.DatabasePackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Db FK</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DB_FK = 0;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DB_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link database.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see database.impl.TableImpl
	 * @see database.impl.DatabasePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Table Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_PRIMARY_KEY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Db Table Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DB_TABLE_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Table Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_COLUMN = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link database.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see database.impl.ColumnImpl
	 * @see database.impl.DatabasePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link database.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see database.impl.ForeignKeyImpl
	 * @see database.impl.DatabasePackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__SOURCE_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TARGET_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Source Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__SOURCE_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Target Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TARGET_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TARGET_PRIMARY_KEY = 4;

	/**
	 * The feature id for the '<em><b>Db Fk Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DB_FK_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 6;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link database.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see database.impl.PrimaryKeyImpl
	 * @see database.impl.DatabasePackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 4;

	/**
	 * The feature id for the '<em><b>Primary Key Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__PRIMARY_KEY_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__PRIMARY_KEY_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link database.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see database.DataType
	 * @see database.impl.DatabasePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link database.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see database.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link database.Database#getDbFK <em>Db FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Db FK</em>'.
	 * @see database.Database#getDbFK()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_DbFK();

	/**
	 * Returns the meta object for the containment reference list '{@link database.Database#getDbTable <em>Db Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Db Table</em>'.
	 * @see database.Database#getDbTable()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_DbTable();

	/**
	 * Returns the meta object for class '{@link database.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see database.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link database.Table#getTablePrimaryKey <em>Table Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Primary Key</em>'.
	 * @see database.Table#getTablePrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TablePrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link database.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see database.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the container reference '{@link database.Table#getDbTableRoot <em>Db Table Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Db Table Root</em>'.
	 * @see database.Table#getDbTableRoot()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_DbTableRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link database.Table#getTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Column</em>'.
	 * @see database.Table#getTableColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableColumn();

	/**
	 * Returns the meta object for class '{@link database.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see database.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link database.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see database.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the container reference '{@link database.Column#getColumnTable <em>Column Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Column Table</em>'.
	 * @see database.Column#getColumnTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ColumnTable();

	/**
	 * Returns the meta object for the attribute '{@link database.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see database.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link database.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see database.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link database.ForeignKey#getSourceTable <em>Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Table</em>'.
	 * @see database.ForeignKey#getSourceTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_SourceTable();

	/**
	 * Returns the meta object for the reference '{@link database.ForeignKey#getTargetTable <em>Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Table</em>'.
	 * @see database.ForeignKey#getTargetTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TargetTable();

	/**
	 * Returns the meta object for the reference list '{@link database.ForeignKey#getSourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Column</em>'.
	 * @see database.ForeignKey#getSourceColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_SourceColumn();

	/**
	 * Returns the meta object for the reference list '{@link database.ForeignKey#getTargetColumn <em>Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Column</em>'.
	 * @see database.ForeignKey#getTargetColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TargetColumn();

	/**
	 * Returns the meta object for the reference '{@link database.ForeignKey#getTargetPrimaryKey <em>Target Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Primary Key</em>'.
	 * @see database.ForeignKey#getTargetPrimaryKey()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TargetPrimaryKey();

	/**
	 * Returns the meta object for the container reference '{@link database.ForeignKey#getDbFkRoot <em>Db Fk Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Db Fk Root</em>'.
	 * @see database.ForeignKey#getDbFkRoot()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_DbFkRoot();

	/**
	 * Returns the meta object for the attribute '{@link database.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see database.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for class '{@link database.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see database.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link database.PrimaryKey#getPrimaryKeyColumn <em>Primary Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary Key Column</em>'.
	 * @see database.PrimaryKey#getPrimaryKeyColumn()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_PrimaryKeyColumn();

	/**
	 * Returns the meta object for the container reference '{@link database.PrimaryKey#getPrimaryKeyTable <em>Primary Key Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Primary Key Table</em>'.
	 * @see database.PrimaryKey#getPrimaryKeyTable()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_PrimaryKeyTable();

	/**
	 * Returns the meta object for enum '{@link database.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see database.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseFactory getDatabaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link database.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see database.impl.DatabaseImpl
		 * @see database.impl.DatabasePackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Db FK</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__DB_FK = eINSTANCE.getDatabase_DbFK();

		/**
		 * The meta object literal for the '<em><b>Db Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__DB_TABLE = eINSTANCE.getDatabase_DbTable();

		/**
		 * The meta object literal for the '{@link database.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see database.impl.TableImpl
		 * @see database.impl.DatabasePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_PRIMARY_KEY = eINSTANCE.getTable_TablePrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Db Table Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DB_TABLE_ROOT = eINSTANCE.getTable_DbTableRoot();

		/**
		 * The meta object literal for the '<em><b>Table Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_COLUMN = eINSTANCE.getTable_TableColumn();

		/**
		 * The meta object literal for the '{@link database.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see database.impl.ColumnImpl
		 * @see database.impl.DatabasePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Column Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__COLUMN_TABLE = eINSTANCE.getColumn_ColumnTable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link database.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see database.impl.ForeignKeyImpl
		 * @see database.impl.DatabasePackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Source Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__SOURCE_TABLE = eINSTANCE.getForeignKey_SourceTable();

		/**
		 * The meta object literal for the '<em><b>Target Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TARGET_TABLE = eINSTANCE.getForeignKey_TargetTable();

		/**
		 * The meta object literal for the '<em><b>Source Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__SOURCE_COLUMN = eINSTANCE.getForeignKey_SourceColumn();

		/**
		 * The meta object literal for the '<em><b>Target Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TARGET_COLUMN = eINSTANCE.getForeignKey_TargetColumn();

		/**
		 * The meta object literal for the '<em><b>Target Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TARGET_PRIMARY_KEY = eINSTANCE.getForeignKey_TargetPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Db Fk Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__DB_FK_ROOT = eINSTANCE.getForeignKey_DbFkRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__NAME = eINSTANCE.getForeignKey_Name();

		/**
		 * The meta object literal for the '{@link database.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see database.impl.PrimaryKeyImpl
		 * @see database.impl.DatabasePackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Primary Key Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__PRIMARY_KEY_COLUMN = eINSTANCE.getPrimaryKey_PrimaryKeyColumn();

		/**
		 * The meta object literal for the '<em><b>Primary Key Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__PRIMARY_KEY_TABLE = eINSTANCE.getPrimaryKey_PrimaryKeyTable();

		/**
		 * The meta object literal for the '{@link database.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see database.DataType
		 * @see database.impl.DatabasePackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //DatabasePackage
