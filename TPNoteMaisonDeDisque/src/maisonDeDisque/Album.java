/**
 */
package maisonDeDisque;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maisonDeDisque.Album#getChansons <em>Chansons</em>}</li>
 *   <li>{@link maisonDeDisque.Album#getName <em>Name</em>}</li>
 *   <li>{@link maisonDeDisque.Album#getAnneeSortie <em>Annee Sortie</em>}</li>
 *   <li>{@link maisonDeDisque.Album#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see maisonDeDisque.MaisonDeDisquePackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends EObject {
	/**
	 * Returns the value of the '<em><b>Chansons</b></em>' reference list.
	 * The list contents are of type {@link maisonDeDisque.Chanson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chansons</em>' reference list.
	 * @see maisonDeDisque.MaisonDeDisquePackage#getAlbum_Chansons()
	 * @model required="true"
	 * @generated
	 */
	EList<Chanson> getChansons();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maisonDeDisque.MaisonDeDisquePackage#getAlbum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maisonDeDisque.Album#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annee Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee Sortie</em>' attribute.
	 * @see #setAnneeSortie(String)
	 * @see maisonDeDisque.MaisonDeDisquePackage#getAlbum_AnneeSortie()
	 * @model
	 * @generated
	 */
	String getAnneeSortie();

	/**
	 * Sets the value of the '{@link maisonDeDisque.Album#getAnneeSortie <em>Annee Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee Sortie</em>' attribute.
	 * @see #getAnneeSortie()
	 * @generated
	 */
	void setAnneeSortie(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link maisonDeDisque.AlbumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see maisonDeDisque.AlbumType
	 * @see #setType(AlbumType)
	 * @see maisonDeDisque.MaisonDeDisquePackage#getAlbum_Type()
	 * @model
	 * @generated
	 */
	AlbumType getType();

	/**
	 * Sets the value of the '{@link maisonDeDisque.Album#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see maisonDeDisque.AlbumType
	 * @see #getType()
	 * @generated
	 */
	void setType(AlbumType value);

} // Album
