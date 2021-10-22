/**
 */
package albums;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maison De Disques</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link albums.MaisonDeDisques#getAlbums <em>Albums</em>}</li>
 *   <li>{@link albums.MaisonDeDisques#getChansons <em>Chansons</em>}</li>
 *   <li>{@link albums.MaisonDeDisques#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 *
 * @see albums.AlbumsPackage#getMaisonDeDisques()
 * @model
 * @generated
 */
public interface MaisonDeDisques extends EObject {
	/**
	 * Returns the value of the '<em><b>Albums</b></em>' containment reference list.
	 * The list contents are of type {@link albums.Album}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albums</em>' containment reference list.
	 * @see albums.AlbumsPackage#getMaisonDeDisques_Albums()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Album> getAlbums();

	/**
	 * Returns the value of the '<em><b>Chansons</b></em>' containment reference list.
	 * The list contents are of type {@link albums.Chanson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chansons</em>' containment reference list.
	 * @see albums.AlbumsPackage#getMaisonDeDisques_Chansons()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Chanson> getChansons();

	/**
	 * Returns the value of the '<em><b>Personnes</b></em>' containment reference list.
	 * The list contents are of type {@link albums.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' containment reference list.
	 * @see albums.AlbumsPackage#getMaisonDeDisques_Personnes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Personne> getPersonnes();

} // MaisonDeDisques
