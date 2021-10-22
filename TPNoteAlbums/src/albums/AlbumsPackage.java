/**
 */
package albums;

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
 * @see albums.AlbumsFactory
 * @model kind="package"
 * @generated
 */
public interface AlbumsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "albums";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ups/m2/TPNote/albums";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlbumsPackage eINSTANCE = albums.impl.AlbumsPackageImpl.init();

	/**
	 * The meta object id for the '{@link albums.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see albums.impl.AlbumImpl
	 * @see albums.impl.AlbumsPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 0;

	/**
	 * The feature id for the '<em><b>Annee Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ANNEE_SORTIE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NOM = 2;

	/**
	 * The feature id for the '<em><b>Chansons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__CHANSONS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ID = 4;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link albums.impl.ChansonImpl <em>Chanson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see albums.impl.ChansonImpl
	 * @see albums.impl.AlbumsPackageImpl#getChanson()
	 * @generated
	 */
	int CHANSON = 1;

	/**
	 * The feature id for the '<em><b>Chanteurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__CHANTEURS = 0;

	/**
	 * The feature id for the '<em><b>Auteur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__AUTEUR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__ID = 2;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON__TITRE = 3;

	/**
	 * The number of structural features of the '<em>Chanson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Chanson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link albums.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see albums.impl.PersonneImpl
	 * @see albums.impl.AlbumsPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Chansons Chanteur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__CHANSONS_CHANTEUR = 1;

	/**
	 * The feature id for the '<em><b>Chansons Auteur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__CHANSONS_AUTEUR = 2;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link albums.impl.MaisonDeDisquesImpl <em>Maison De Disques</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see albums.impl.MaisonDeDisquesImpl
	 * @see albums.impl.AlbumsPackageImpl#getMaisonDeDisques()
	 * @generated
	 */
	int MAISON_DE_DISQUES = 3;

	/**
	 * The feature id for the '<em><b>Albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUES__ALBUMS = 0;

	/**
	 * The feature id for the '<em><b>Chansons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUES__CHANSONS = 1;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUES__PERSONNES = 2;

	/**
	 * The number of structural features of the '<em>Maison De Disques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Maison De Disques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAISON_DE_DISQUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link albums.AlbumsType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see albums.AlbumsType
	 * @see albums.impl.AlbumsPackageImpl#getAlbumsType()
	 * @generated
	 */
	int ALBUMS_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link albums.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see albums.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link albums.Album#getAnneeSortie <em>Annee Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee Sortie</em>'.
	 * @see albums.Album#getAnneeSortie()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_AnneeSortie();

	/**
	 * Returns the meta object for the attribute '{@link albums.Album#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see albums.Album#getType()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Type();

	/**
	 * Returns the meta object for the attribute '{@link albums.Album#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see albums.Album#getNom()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Nom();

	/**
	 * Returns the meta object for the reference list '{@link albums.Album#getChansons <em>Chansons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chansons</em>'.
	 * @see albums.Album#getChansons()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Chansons();

	/**
	 * Returns the meta object for the attribute '{@link albums.Album#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see albums.Album#getId()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Id();

	/**
	 * Returns the meta object for class '{@link albums.Chanson <em>Chanson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chanson</em>'.
	 * @see albums.Chanson
	 * @generated
	 */
	EClass getChanson();

	/**
	 * Returns the meta object for the reference list '{@link albums.Chanson#getChanteurs <em>Chanteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chanteurs</em>'.
	 * @see albums.Chanson#getChanteurs()
	 * @see #getChanson()
	 * @generated
	 */
	EReference getChanson_Chanteurs();

	/**
	 * Returns the meta object for the reference list '{@link albums.Chanson#getAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auteur</em>'.
	 * @see albums.Chanson#getAuteur()
	 * @see #getChanson()
	 * @generated
	 */
	EReference getChanson_Auteur();

	/**
	 * Returns the meta object for the attribute '{@link albums.Chanson#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see albums.Chanson#getId()
	 * @see #getChanson()
	 * @generated
	 */
	EAttribute getChanson_Id();

	/**
	 * Returns the meta object for the attribute '{@link albums.Chanson#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see albums.Chanson#getTitre()
	 * @see #getChanson()
	 * @generated
	 */
	EAttribute getChanson_Titre();

	/**
	 * Returns the meta object for class '{@link albums.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see albums.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link albums.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see albums.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the reference list '{@link albums.Personne#getChansonsChanteur <em>Chansons Chanteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chansons Chanteur</em>'.
	 * @see albums.Personne#getChansonsChanteur()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_ChansonsChanteur();

	/**
	 * Returns the meta object for the reference list '{@link albums.Personne#getChansonsAuteur <em>Chansons Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chansons Auteur</em>'.
	 * @see albums.Personne#getChansonsAuteur()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_ChansonsAuteur();

	/**
	 * Returns the meta object for class '{@link albums.MaisonDeDisques <em>Maison De Disques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maison De Disques</em>'.
	 * @see albums.MaisonDeDisques
	 * @generated
	 */
	EClass getMaisonDeDisques();

	/**
	 * Returns the meta object for the containment reference list '{@link albums.MaisonDeDisques#getAlbums <em>Albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Albums</em>'.
	 * @see albums.MaisonDeDisques#getAlbums()
	 * @see #getMaisonDeDisques()
	 * @generated
	 */
	EReference getMaisonDeDisques_Albums();

	/**
	 * Returns the meta object for the containment reference list '{@link albums.MaisonDeDisques#getChansons <em>Chansons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chansons</em>'.
	 * @see albums.MaisonDeDisques#getChansons()
	 * @see #getMaisonDeDisques()
	 * @generated
	 */
	EReference getMaisonDeDisques_Chansons();

	/**
	 * Returns the meta object for the containment reference list '{@link albums.MaisonDeDisques#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personnes</em>'.
	 * @see albums.MaisonDeDisques#getPersonnes()
	 * @see #getMaisonDeDisques()
	 * @generated
	 */
	EReference getMaisonDeDisques_Personnes();

	/**
	 * Returns the meta object for enum '{@link albums.AlbumsType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see albums.AlbumsType
	 * @generated
	 */
	EEnum getAlbumsType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlbumsFactory getAlbumsFactory();

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
		 * The meta object literal for the '{@link albums.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see albums.impl.AlbumImpl
		 * @see albums.impl.AlbumsPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NOM = eINSTANCE.getAlbum_Nom();

		/**
		 * The meta object literal for the '<em><b>Chansons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__CHANSONS = eINSTANCE.getAlbum_Chansons();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__ID = eINSTANCE.getAlbum_Id();

		/**
		 * The meta object literal for the '{@link albums.impl.ChansonImpl <em>Chanson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see albums.impl.ChansonImpl
		 * @see albums.impl.AlbumsPackageImpl#getChanson()
		 * @generated
		 */
		EClass CHANSON = eINSTANCE.getChanson();

		/**
		 * The meta object literal for the '<em><b>Chanteurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANSON__CHANTEURS = eINSTANCE.getChanson_Chanteurs();

		/**
		 * The meta object literal for the '<em><b>Auteur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANSON__AUTEUR = eINSTANCE.getChanson_Auteur();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANSON__ID = eINSTANCE.getChanson_Id();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANSON__TITRE = eINSTANCE.getChanson_Titre();

		/**
		 * The meta object literal for the '{@link albums.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see albums.impl.PersonneImpl
		 * @see albums.impl.AlbumsPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Chansons Chanteur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__CHANSONS_CHANTEUR = eINSTANCE.getPersonne_ChansonsChanteur();

		/**
		 * The meta object literal for the '<em><b>Chansons Auteur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__CHANSONS_AUTEUR = eINSTANCE.getPersonne_ChansonsAuteur();

		/**
		 * The meta object literal for the '{@link albums.impl.MaisonDeDisquesImpl <em>Maison De Disques</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see albums.impl.MaisonDeDisquesImpl
		 * @see albums.impl.AlbumsPackageImpl#getMaisonDeDisques()
		 * @generated
		 */
		EClass MAISON_DE_DISQUES = eINSTANCE.getMaisonDeDisques();

		/**
		 * The meta object literal for the '<em><b>Albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAISON_DE_DISQUES__ALBUMS = eINSTANCE.getMaisonDeDisques_Albums();

		/**
		 * The meta object literal for the '<em><b>Chansons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAISON_DE_DISQUES__CHANSONS = eINSTANCE.getMaisonDeDisques_Chansons();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAISON_DE_DISQUES__PERSONNES = eINSTANCE.getMaisonDeDisques_Personnes();

		/**
		 * The meta object literal for the '{@link albums.AlbumsType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see albums.AlbumsType
		 * @see albums.impl.AlbumsPackageImpl#getAlbumsType()
		 * @generated
		 */
		EEnum ALBUMS_TYPE = eINSTANCE.getAlbumsType();

	}

} //AlbumsPackage
