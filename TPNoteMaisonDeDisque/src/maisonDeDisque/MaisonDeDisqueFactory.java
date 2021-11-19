/**
 */
package maisonDeDisque;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maisonDeDisque.MaisonDeDisquePackage
 * @generated
 */
public interface MaisonDeDisqueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaisonDeDisqueFactory eINSTANCE = maisonDeDisque.impl.MaisonDeDisqueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Maison De Disque</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maison De Disque</em>'.
	 * @generated
	 */
	MaisonDeDisque createMaisonDeDisque();

	/**
	 * Returns a new object of class '<em>Chanson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chanson</em>'.
	 * @generated
	 */
	Chanson createChanson();

	/**
	 * Returns a new object of class '<em>Album</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Album</em>'.
	 * @generated
	 */
	Album createAlbum();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaisonDeDisquePackage getMaisonDeDisquePackage();

} //MaisonDeDisqueFactory
