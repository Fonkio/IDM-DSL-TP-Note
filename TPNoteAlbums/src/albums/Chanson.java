/**
 */
package albums;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chanson</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link albums.Chanson#getChanteurs <em>Chanteurs</em>}</li>
 *   <li>{@link albums.Chanson#getAuteur <em>Auteur</em>}</li>
 *   <li>{@link albums.Chanson#getId <em>Id</em>}</li>
 *   <li>{@link albums.Chanson#getTitre <em>Titre</em>}</li>
 * </ul>
 *
 * @see albums.AlbumsPackage#getChanson()
 * @model
 * @generated
 */
public interface Chanson extends EObject {
	/**
	 * Returns the value of the '<em><b>Chanteurs</b></em>' reference list.
	 * The list contents are of type {@link albums.Personne}.
	 * It is bidirectional and its opposite is '{@link albums.Personne#getChansonsChanteur <em>Chansons Chanteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chanteurs</em>' reference list.
	 * @see albums.AlbumsPackage#getChanson_Chanteurs()
	 * @see albums.Personne#getChansonsChanteur
	 * @model opposite="chansonsChanteur" required="true"
	 * @generated
	 */
	EList<Personne> getChanteurs();

	/**
	 * Returns the value of the '<em><b>Auteur</b></em>' reference list.
	 * The list contents are of type {@link albums.Personne}.
	 * It is bidirectional and its opposite is '{@link albums.Personne#getChansonsAuteur <em>Chansons Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteur</em>' reference list.
	 * @see albums.AlbumsPackage#getChanson_Auteur()
	 * @see albums.Personne#getChansonsAuteur
	 * @model opposite="chansonsAuteur" required="true"
	 * @generated
	 */
	EList<Personne> getAuteur();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see albums.AlbumsPackage#getChanson_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link albums.Chanson#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see albums.AlbumsPackage#getChanson_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link albums.Chanson#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

} // Chanson
