/**
 */
package maisonDeDisque.impl;

import java.util.Collection;

import maisonDeDisque.Album;
import maisonDeDisque.Chanson;
import maisonDeDisque.MaisonDeDisque;
import maisonDeDisque.MaisonDeDisquePackage;
import maisonDeDisque.Personne;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maison De Disque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maisonDeDisque.impl.MaisonDeDisqueImpl#getChansons <em>Chansons</em>}</li>
 *   <li>{@link maisonDeDisque.impl.MaisonDeDisqueImpl#getAlbums <em>Albums</em>}</li>
 *   <li>{@link maisonDeDisque.impl.MaisonDeDisqueImpl#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaisonDeDisqueImpl extends MinimalEObjectImpl.Container implements MaisonDeDisque {
	/**
	 * The cached value of the '{@link #getChansons() <em>Chansons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChansons()
	 * @generated
	 * @ordered
	 */
	protected EList<Chanson> chansons;

	/**
	 * The cached value of the '{@link #getAlbums() <em>Albums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbums()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> albums;

	/**
	 * The cached value of the '{@link #getPersonnes() <em>Personnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> personnes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaisonDeDisqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaisonDeDisquePackage.Literals.MAISON_DE_DISQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chanson> getChansons() {
		if (chansons == null) {
			chansons = new EObjectContainmentEList<Chanson>(Chanson.class, this, MaisonDeDisquePackage.MAISON_DE_DISQUE__CHANSONS);
		}
		return chansons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getAlbums() {
		if (albums == null) {
			albums = new EObjectContainmentEList<Album>(Album.class, this, MaisonDeDisquePackage.MAISON_DE_DISQUE__ALBUMS);
		}
		return albums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectContainmentEList<Personne>(Personne.class, this, MaisonDeDisquePackage.MAISON_DE_DISQUE__PERSONNES);
		}
		return personnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__CHANSONS:
				return ((InternalEList<?>)getChansons()).basicRemove(otherEnd, msgs);
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__ALBUMS:
				return ((InternalEList<?>)getAlbums()).basicRemove(otherEnd, msgs);
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__PERSONNES:
				return ((InternalEList<?>)getPersonnes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__CHANSONS:
				return getChansons();
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__ALBUMS:
				return getAlbums();
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__PERSONNES:
				return getPersonnes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__CHANSONS:
				getChansons().clear();
				getChansons().addAll((Collection<? extends Chanson>)newValue);
				return;
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__ALBUMS:
				getAlbums().clear();
				getAlbums().addAll((Collection<? extends Album>)newValue);
				return;
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__PERSONNES:
				getPersonnes().clear();
				getPersonnes().addAll((Collection<? extends Personne>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__CHANSONS:
				getChansons().clear();
				return;
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__ALBUMS:
				getAlbums().clear();
				return;
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__PERSONNES:
				getPersonnes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__CHANSONS:
				return chansons != null && !chansons.isEmpty();
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__ALBUMS:
				return albums != null && !albums.isEmpty();
			case MaisonDeDisquePackage.MAISON_DE_DISQUE__PERSONNES:
				return personnes != null && !personnes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaisonDeDisqueImpl
