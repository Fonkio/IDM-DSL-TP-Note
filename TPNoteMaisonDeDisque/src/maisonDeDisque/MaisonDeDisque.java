/**
 */
package maisonDeDisque;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maison De Disque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maisonDeDisque.MaisonDeDisque#getChansons <em>Chansons</em>}</li>
 *   <li>{@link maisonDeDisque.MaisonDeDisque#getAlbums <em>Albums</em>}</li>
 *   <li>{@link maisonDeDisque.MaisonDeDisque#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 *
 * @see maisonDeDisque.MaisonDeDisquePackage#getMaisonDeDisque()
 * @model
 * @generated
 */
public interface MaisonDeDisque extends EObject {
	/**
	 * Returns the value of the '<em><b>Chansons</b></em>' containment reference list.
	 * The list contents are of type {@link maisonDeDisque.Chanson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chansons</em>' containment reference list.
	 * @see maisonDeDisque.MaisonDeDisquePackage#getMaisonDeDisque_Chansons()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Chanson> getChansons();

	/**
	 * Returns the value of the '<em><b>Albums</b></em>' containment reference list.
	 * The list contents are of type {@link maisonDeDisque.Album}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albums</em>' containment reference list.
	 * @see maisonDeDisque.MaisonDeDisquePackage#getMaisonDeDisque_Albums()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Album> getAlbums();

	/**
	 * Returns the value of the '<em><b>Personnes</b></em>' containment reference list.
	 * The list contents are of type {@link maisonDeDisque.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' containment reference list.
	 * @see maisonDeDisque.MaisonDeDisquePackage#getMaisonDeDisque_Personnes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Personne> getPersonnes();

} // MaisonDeDisque
