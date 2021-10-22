/**
 */
package albums;

import java.util.Date;

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
 *   <li>{@link albums.Album#getAnneeSortie <em>Annee Sortie</em>}</li>
 *   <li>{@link albums.Album#getType <em>Type</em>}</li>
 *   <li>{@link albums.Album#getNom <em>Nom</em>}</li>
 *   <li>{@link albums.Album#getChansons <em>Chansons</em>}</li>
 *   <li>{@link albums.Album#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see albums.AlbumsPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends EObject {
	/**
	 * Returns the value of the '<em><b>Annee Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee Sortie</em>' attribute.
	 * @see #setAnneeSortie(Date)
	 * @see albums.AlbumsPackage#getAlbum_AnneeSortie()
	 * @model
	 * @generated
	 */
	Date getAnneeSortie();

	/**
	 * Sets the value of the '{@link albums.Album#getAnneeSortie <em>Annee Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee Sortie</em>' attribute.
	 * @see #getAnneeSortie()
	 * @generated
	 */
	void setAnneeSortie(Date value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link albums.AlbumsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see albums.AlbumsType
	 * @see #setType(AlbumsType)
	 * @see albums.AlbumsPackage#getAlbum_Type()
	 * @model
	 * @generated
	 */
	AlbumsType getType();

	/**
	 * Sets the value of the '{@link albums.Album#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see albums.AlbumsType
	 * @see #getType()
	 * @generated
	 */
	void setType(AlbumsType value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see albums.AlbumsPackage#getAlbum_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link albums.Album#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Chansons</b></em>' reference list.
	 * The list contents are of type {@link albums.Chanson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chansons</em>' reference list.
	 * @see albums.AlbumsPackage#getAlbum_Chansons()
	 * @model required="true"
	 * @generated
	 */
	EList<Chanson> getChansons();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see albums.AlbumsPackage#getAlbum_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link albums.Album#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Album
