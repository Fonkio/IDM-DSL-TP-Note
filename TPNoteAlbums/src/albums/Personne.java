/**
 */
package albums;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link albums.Personne#getNom <em>Nom</em>}</li>
 *   <li>{@link albums.Personne#getChansonsChanteur <em>Chansons Chanteur</em>}</li>
 *   <li>{@link albums.Personne#getChansonsAuteur <em>Chansons Auteur</em>}</li>
 * </ul>
 *
 * @see albums.AlbumsPackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see albums.AlbumsPackage#getPersonne_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link albums.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Chansons Chanteur</b></em>' reference list.
	 * The list contents are of type {@link albums.Chanson}.
	 * It is bidirectional and its opposite is '{@link albums.Chanson#getChanteurs <em>Chanteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chansons Chanteur</em>' reference list.
	 * @see albums.AlbumsPackage#getPersonne_ChansonsChanteur()
	 * @see albums.Chanson#getChanteurs
	 * @model opposite="chanteurs"
	 * @generated
	 */
	EList<Chanson> getChansonsChanteur();

	/**
	 * Returns the value of the '<em><b>Chansons Auteur</b></em>' reference list.
	 * The list contents are of type {@link albums.Chanson}.
	 * It is bidirectional and its opposite is '{@link albums.Chanson#getAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chansons Auteur</em>' reference list.
	 * @see albums.AlbumsPackage#getPersonne_ChansonsAuteur()
	 * @see albums.Chanson#getAuteur
	 * @model opposite="auteur"
	 * @generated
	 */
	EList<Chanson> getChansonsAuteur();

} // Personne
