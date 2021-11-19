/**
 */
package maisonDeDisque.impl;

import maisonDeDisque.Album;
import maisonDeDisque.AlbumType;
import maisonDeDisque.Chanson;
import maisonDeDisque.MaisonDeDisque;
import maisonDeDisque.MaisonDeDisqueFactory;
import maisonDeDisque.MaisonDeDisquePackage;
import maisonDeDisque.Personne;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaisonDeDisquePackageImpl extends EPackageImpl implements MaisonDeDisquePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maisonDeDisqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chansonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum albumTypeEEnum = null;

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
	 * @see maisonDeDisque.MaisonDeDisquePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaisonDeDisquePackageImpl() {
		super(eNS_URI, MaisonDeDisqueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaisonDeDisquePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaisonDeDisquePackage init() {
		if (isInited) return (MaisonDeDisquePackage)EPackage.Registry.INSTANCE.getEPackage(MaisonDeDisquePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMaisonDeDisquePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MaisonDeDisquePackageImpl theMaisonDeDisquePackage = registeredMaisonDeDisquePackage instanceof MaisonDeDisquePackageImpl ? (MaisonDeDisquePackageImpl)registeredMaisonDeDisquePackage : new MaisonDeDisquePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMaisonDeDisquePackage.createPackageContents();

		// Initialize created meta-data
		theMaisonDeDisquePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaisonDeDisquePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaisonDeDisquePackage.eNS_URI, theMaisonDeDisquePackage);
		return theMaisonDeDisquePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaisonDeDisque() {
		return maisonDeDisqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaisonDeDisque_Chansons() {
		return (EReference)maisonDeDisqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaisonDeDisque_Albums() {
		return (EReference)maisonDeDisqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaisonDeDisque_Personnes() {
		return (EReference)maisonDeDisqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChanson() {
		return chansonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChanson_Auteurs() {
		return (EReference)chansonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChanson_Chanteurs() {
		return (EReference)chansonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChanson_Name() {
		return (EAttribute)chansonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlbum() {
		return albumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlbum_Chansons() {
		return (EReference)albumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Name() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_AnneeSortie() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Type() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Name() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlbumType() {
		return albumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaisonDeDisqueFactory getMaisonDeDisqueFactory() {
		return (MaisonDeDisqueFactory)getEFactoryInstance();
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

		// Create classes and their features
		maisonDeDisqueEClass = createEClass(MAISON_DE_DISQUE);
		createEReference(maisonDeDisqueEClass, MAISON_DE_DISQUE__CHANSONS);
		createEReference(maisonDeDisqueEClass, MAISON_DE_DISQUE__ALBUMS);
		createEReference(maisonDeDisqueEClass, MAISON_DE_DISQUE__PERSONNES);

		chansonEClass = createEClass(CHANSON);
		createEReference(chansonEClass, CHANSON__AUTEURS);
		createEReference(chansonEClass, CHANSON__CHANTEURS);
		createEAttribute(chansonEClass, CHANSON__NAME);

		albumEClass = createEClass(ALBUM);
		createEReference(albumEClass, ALBUM__CHANSONS);
		createEAttribute(albumEClass, ALBUM__NAME);
		createEAttribute(albumEClass, ALBUM__ANNEE_SORTIE);
		createEAttribute(albumEClass, ALBUM__TYPE);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NAME);

		// Create enums
		albumTypeEEnum = createEEnum(ALBUM_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(maisonDeDisqueEClass, MaisonDeDisque.class, "MaisonDeDisque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaisonDeDisque_Chansons(), this.getChanson(), null, "chansons", null, 1, -1, MaisonDeDisque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaisonDeDisque_Albums(), this.getAlbum(), null, "albums", null, 1, -1, MaisonDeDisque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaisonDeDisque_Personnes(), this.getPersonne(), null, "personnes", null, 1, -1, MaisonDeDisque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chansonEClass, Chanson.class, "Chanson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChanson_Auteurs(), this.getPersonne(), null, "auteurs", null, 1, -1, Chanson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChanson_Chanteurs(), this.getPersonne(), null, "chanteurs", null, 1, -1, Chanson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChanson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Chanson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(albumEClass, Album.class, "Album", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlbum_Chansons(), this.getChanson(), null, "chansons", null, 1, -1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Name(), ecorePackage.getEString(), "name", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_AnneeSortie(), ecorePackage.getEString(), "anneeSortie", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Type(), this.getAlbumType(), "type", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Name(), ecorePackage.getEString(), "name", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(albumTypeEEnum, AlbumType.class, "AlbumType");
		addEEnumLiteral(albumTypeEEnum, AlbumType.SINGLE);
		addEEnumLiteral(albumTypeEEnum, AlbumType.COMPILATION);

		// Create resource
		createResource(eNS_URI);
	}

} //MaisonDeDisquePackageImpl
