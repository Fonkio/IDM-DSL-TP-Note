/**
 */
package albums.impl;

import albums.Album;
import albums.AlbumsPackage;
import albums.Chanson;
import albums.MaisonDeDisques;
import albums.Personne;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maison De Disques</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link albums.impl.MaisonDeDisquesImpl#getAlbums <em>Albums</em>}</li>
 *   <li>{@link albums.impl.MaisonDeDisquesImpl#getChansons <em>Chansons</em>}</li>
 *   <li>{@link albums.impl.MaisonDeDisquesImpl#getPersonnes <em>Personnes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaisonDeDisquesImpl extends MinimalEObjectImpl.Container implements MaisonDeDisques {
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
	 * The cached value of the '{@link #getChansons() <em>Chansons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChansons()
	 * @generated
	 * @ordered
	 */
	protected EList<Chanson> chansons;

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
	protected MaisonDeDisquesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlbumsPackage.Literals.MAISON_DE_DISQUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getAlbums() {
		if (albums == null) {
			albums = new EObjectContainmentEList<Album>(Album.class, this, AlbumsPackage.MAISON_DE_DISQUES__ALBUMS);
		}
		return albums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chanson> getChansons() {
		if (chansons == null) {
			chansons = new EObjectContainmentEList<Chanson>(Chanson.class, this, AlbumsPackage.MAISON_DE_DISQUES__CHANSONS);
		}
		return chansons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectContainmentEList<Personne>(Personne.class, this, AlbumsPackage.MAISON_DE_DISQUES__PERSONNES);
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
			case AlbumsPackage.MAISON_DE_DISQUES__ALBUMS:
				return ((InternalEList<?>)getAlbums()).basicRemove(otherEnd, msgs);
			case AlbumsPackage.MAISON_DE_DISQUES__CHANSONS:
				return ((InternalEList<?>)getChansons()).basicRemove(otherEnd, msgs);
			case AlbumsPackage.MAISON_DE_DISQUES__PERSONNES:
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
			case AlbumsPackage.MAISON_DE_DISQUES__ALBUMS:
				return getAlbums();
			case AlbumsPackage.MAISON_DE_DISQUES__CHANSONS:
				return getChansons();
			case AlbumsPackage.MAISON_DE_DISQUES__PERSONNES:
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
			case AlbumsPackage.MAISON_DE_DISQUES__ALBUMS:
				getAlbums().clear();
				getAlbums().addAll((Collection<? extends Album>)newValue);
				return;
			case AlbumsPackage.MAISON_DE_DISQUES__CHANSONS:
				getChansons().clear();
				getChansons().addAll((Collection<? extends Chanson>)newValue);
				return;
			case AlbumsPackage.MAISON_DE_DISQUES__PERSONNES:
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
			case AlbumsPackage.MAISON_DE_DISQUES__ALBUMS:
				getAlbums().clear();
				return;
			case AlbumsPackage.MAISON_DE_DISQUES__CHANSONS:
				getChansons().clear();
				return;
			case AlbumsPackage.MAISON_DE_DISQUES__PERSONNES:
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
			case AlbumsPackage.MAISON_DE_DISQUES__ALBUMS:
				return albums != null && !albums.isEmpty();
			case AlbumsPackage.MAISON_DE_DISQUES__CHANSONS:
				return chansons != null && !chansons.isEmpty();
			case AlbumsPackage.MAISON_DE_DISQUES__PERSONNES:
				return personnes != null && !personnes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaisonDeDisquesImpl
