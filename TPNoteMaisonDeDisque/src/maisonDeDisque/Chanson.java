/**
 */
package maisonDeDisque;

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
 *   <li>{@link maisonDeDisque.Chanson#getAuteurs <em>Auteurs</em>}</li>
 *   <li>{@link maisonDeDisque.Chanson#getChanteurs <em>Chanteurs</em>}</li>
 *   <li>{@link maisonDeDisque.Chanson#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see maisonDeDisque.MaisonDeDisquePackage#getChanson()
 * @model
 * @generated
 */
public interface Chanson extends EObject {
	/**
	 * Returns the value of the '<em><b>Auteurs</b></em>' reference list.
	 * The list contents are of type {@link maisonDeDisque.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteurs</em>' reference list.
	 * @see maisonDeDisque.MaisonDeDisquePackage#getChanson_Auteurs()
	 * @model required="true"
	 * @generated
	 */
	EList<Personne> getAuteurs();

	/**
	 * Returns the value of the '<em><b>Chanteurs</b></em>' reference list.
	 * The list contents are of type {@link maisonDeDisque.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chanteurs</em>' reference list.
	 * @see maisonDeDisque.MaisonDeDisquePackage#getChanson_Chanteurs()
	 * @model required="true"
	 * @generated
	 */
	EList<Personne> getChanteurs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maisonDeDisque.MaisonDeDisquePackage#getChanson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maisonDeDisque.Chanson#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Chanson
