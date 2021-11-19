/**
 */
package maisonDeDisque;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maisonDeDisque.MaisonDeDisqueFactory
 * @model kind="package"
 * @generated
 */
public interface MaisonDeDisquePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maisonDeDisque";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ups/m2dl/TP1/maisonDeDisque";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mdd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaisonDeDisquePackage eINSTANCE = maisonDeDisque.impl.MaisonDeDisquePackageImpl.init();

	/**
	 * The meta object id for the '{@link maisonDeDisque.impl.MaisonDeDisqueImpl <em>Maison De Disque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maisonDeDisque.impl.MaisonDeDisqueImpl
	 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getMaisonDeDisque()
	 * @generated
	 */
	int MAISON_DE_DISQUE = 0;

	/**
	 * The feature id for the '<em><b>Chansons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUE__CHANSONS = 0;

	/**
	 * The feature id for the '<em><b>Albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUE__ALBUMS = 1;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUE__PERSONNES = 2;

	/**
	 * The number of structural features of the '<em>Maison De Disque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Maison De Disque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maisonDeDisque.impl.ChansonImpl <em>Chanson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maisonDeDisque.impl.ChansonImpl
	 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getChanson()
	 * @generated
	 */
	int CHANSON = 1;

	/**
	 * The feature id for the '<em><b>Auteurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__AUTEURS = 0;

	/**
	 * The feature id for the '<em><b>Chanteurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__CHANTEURS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>Chanson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Chanson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maisonDeDisque.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maisonDeDisque.impl.AlbumImpl
	 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 2;

	/**
	 * The feature id for the '<em><b>Chansons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__CHANSONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Annee Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ANNEE_SORTIE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maisonDeDisque.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maisonDeDisque.impl.PersonneImpl
	 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maisonDeDisque.AlbumType <em>Album Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maisonDeDisque.AlbumType
	 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getAlbumType()
	 * @generated
	 */
	int ALBUM_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link maisonDeDisque.MaisonDeDisque <em>Maison De Disque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maison De Disque</em>'.
	 * @see maisonDeDisque.MaisonDeDisque
	 * @generated
	 */
	EClass getMaisonDeDisque();

	/**
	 * Returns the meta object for the containment reference list '{@link maisonDeDisque.MaisonDeDisque#getChansons <em>Chansons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chansons</em>'.
	 * @see maisonDeDisque.MaisonDeDisque#getChansons()
	 * @see #getMaisonDeDisque()
	 * @generated
	 */
	EReference getMaisonDeDisque_Chansons();

	/**
	 * Returns the meta object for the containment reference list '{@link maisonDeDisque.MaisonDeDisque#getAlbums <em>Albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Albums</em>'.
	 * @see maisonDeDisque.MaisonDeDisque#getAlbums()
	 * @see #getMaisonDeDisque()
	 * @generated
	 */
	EReference getMaisonDeDisque_Albums();

	/**
	 * Returns the meta object for the containment reference list '{@link maisonDeDisque.MaisonDeDisque#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personnes</em>'.
	 * @see maisonDeDisque.MaisonDeDisque#getPersonnes()
	 * @see #getMaisonDeDisque()
	 * @generated
	 */
	EReference getMaisonDeDisque_Personnes();

	/**
	 * Returns the meta object for class '{@link maisonDeDisque.Chanson <em>Chanson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chanson</em>'.
	 * @see maisonDeDisque.Chanson
	 * @generated
	 */
	EClass getChanson();

	/**
	 * Returns the meta object for the reference list '{@link maisonDeDisque.Chanson#getAuteurs <em>Auteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auteurs</em>'.
	 * @see maisonDeDisque.Chanson#getAuteurs()
	 * @see #getChanson()
	 * @generated
	 */
	EReference getChanson_Auteurs();

	/**
	 * Returns the meta object for the reference list '{@link maisonDeDisque.Chanson#getChanteurs <em>Chanteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chanteurs</em>'.
	 * @see maisonDeDisque.Chanson#getChanteurs()
	 * @see #getChanson()
	 * @generated
	 */
	EReference getChanson_Chanteurs();

	/**
	 * Returns the meta object for the attribute '{@link maisonDeDisque.Chanson#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maisonDeDisque.Chanson#getName()
	 * @see #getChanson()
	 * @generated
	 */
	EAttribute getChanson_Name();

	/**
	 * Returns the meta object for class '{@link maisonDeDisque.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see maisonDeDisque.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the reference list '{@link maisonDeDisque.Album#getChansons <em>Chansons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chansons</em>'.
	 * @see maisonDeDisque.Album#getChansons()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Chansons();

	/**
	 * Returns the meta object for the attribute '{@link maisonDeDisque.Album#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maisonDeDisque.Album#getName()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Name();

	/**
	 * Returns the meta object for the attribute '{@link maisonDeDisque.Album#getAnneeSortie <em>Annee Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee Sortie</em>'.
	 * @see maisonDeDisque.Album#getAnneeSortie()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_AnneeSortie();

	/**
	 * Returns the meta object for the attribute '{@link maisonDeDisque.Album#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maisonDeDisque.Album#getType()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Type();

	/**
	 * Returns the meta object for class '{@link maisonDeDisque.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see maisonDeDisque.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link maisonDeDisque.Personne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maisonDeDisque.Personne#getName()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Name();

	/**
	 * Returns the meta object for enum '{@link maisonDeDisque.AlbumType <em>Album Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Album Type</em>'.
	 * @see maisonDeDisque.AlbumType
	 * @generated
	 */
	EEnum getAlbumType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaisonDeDisqueFactory getMaisonDeDisqueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maisonDeDisque.impl.MaisonDeDisqueImpl <em>Maison De Disque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maisonDeDisque.impl.MaisonDeDisqueImpl
		 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getMaisonDeDisque()
		 * @generated
		 */
		EClass MAISON_DE_DISQUE = eINSTANCE.getMaisonDeDisque();

		/**
		 * The meta object literal for the '<em><b>Chansons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAISON_DE_DISQUE__CHANSONS = eINSTANCE.getMaisonDeDisque_Chansons();

		/**
		 * The meta object literal for the '<em><b>Albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAISON_DE_DISQUE__ALBUMS = eINSTANCE.getMaisonDeDisque_Albums();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAISON_DE_DISQUE__PERSONNES = eINSTANCE.getMaisonDeDisque_Personnes();

		/**
		 * The meta object literal for the '{@link maisonDeDisque.impl.ChansonImpl <em>Chanson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maisonDeDisque.impl.ChansonImpl
		 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getChanson()
		 * @generated
		 */
		EClass CHANSON = eINSTANCE.getChanson();

		/**
		 * The meta object literal for the '<em><b>Auteurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANSON__AUTEURS = eINSTANCE.getChanson_Auteurs();

		/**
		 * The meta object literal for the '<em><b>Chanteurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANSON__CHANTEURS = eINSTANCE.getChanson_Chanteurs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANSON__NAME = eINSTANCE.getChanson_Name();

		/**
		 * The meta object literal for the '{@link maisonDeDisque.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maisonDeDisque.impl.AlbumImpl
		 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Chansons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__CHANSONS = eINSTANCE.getAlbum_Chansons();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NAME = eINSTANCE.getAlbum_Name();

		/**
		 * The meta object literal for the '<em><b>Annee Sortie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__ANNEE_SORTIE = eINSTANCE.getAlbum_AnneeSortie();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__TYPE = eINSTANCE.getAlbum_Type();

		/**
		 * The meta object literal for the '{@link maisonDeDisque.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maisonDeDisque.impl.PersonneImpl
		 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NAME = eINSTANCE.getPersonne_Name();

		/**
		 * The meta object literal for the '{@link maisonDeDisque.AlbumType <em>Album Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maisonDeDisque.AlbumType
		 * @see maisonDeDisque.impl.MaisonDeDisquePackageImpl#getAlbumType()
		 * @generated
		 */
		EEnum ALBUM_TYPE = eINSTANCE.getAlbumType();

	}

} //MaisonDeDisquePackage
