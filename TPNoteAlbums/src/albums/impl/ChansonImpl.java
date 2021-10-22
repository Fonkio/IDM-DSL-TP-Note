/**
 */
package albums.impl;

import albums.AlbumsPackage;
import albums.Chanson;
import albums.Personne;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chanson</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link albums.impl.ChansonImpl#getChanteurs <em>Chanteurs</em>}</li>
 *   <li>{@link albums.impl.ChansonImpl#getAuteur <em>Auteur</em>}</li>
 *   <li>{@link albums.impl.ChansonImpl#getId <em>Id</em>}</li>
 *   <li>{@link albums.impl.ChansonImpl#getTitre <em>Titre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChansonImpl extends MinimalEObjectImpl.Container implements Chanson {
	/**
	 * The cached value of the '{@link #getChanteurs() <em>Chanteurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanteurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> chanteurs;

	/**
	 * The cached value of the '{@link #getAuteur() <em>Auteur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> auteur;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChansonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlbumsPackage.Literals.CHANSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getChanteurs() {
		if (chanteurs == null) {
			chanteurs = new EObjectWithInverseResolvingEList.ManyInverse<Personne>(Personne.class, this, AlbumsPackage.CHANSON__CHANTEURS, AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR);
		}
		return chanteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getAuteur() {
		if (auteur == null) {
			auteur = new EObjectWithInverseResolvingEList.ManyInverse<Personne>(Personne.class, this, AlbumsPackage.CHANSON__AUTEUR, AlbumsPackage.PERSONNE__CHANSONS_AUTEUR);
		}
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.CHANSON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.CHANSON__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlbumsPackage.CHANSON__CHANTEURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChanteurs()).basicAdd(otherEnd, msgs);
			case AlbumsPackage.CHANSON__AUTEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuteur()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlbumsPackage.CHANSON__CHANTEURS:
				return ((InternalEList<?>)getChanteurs()).basicRemove(otherEnd, msgs);
			case AlbumsPackage.CHANSON__AUTEUR:
				return ((InternalEList<?>)getAuteur()).basicRemove(otherEnd, msgs);
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
			case AlbumsPackage.CHANSON__CHANTEURS:
				return getChanteurs();
			case AlbumsPackage.CHANSON__AUTEUR:
				return getAuteur();
			case AlbumsPackage.CHANSON__ID:
				return getId();
			case AlbumsPackage.CHANSON__TITRE:
				return getTitre();
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
			case AlbumsPackage.CHANSON__CHANTEURS:
				getChanteurs().clear();
				getChanteurs().addAll((Collection<? extends Personne>)newValue);
				return;
			case AlbumsPackage.CHANSON__AUTEUR:
				getAuteur().clear();
				getAuteur().addAll((Collection<? extends Personne>)newValue);
				return;
			case AlbumsPackage.CHANSON__ID:
				setId((String)newValue);
				return;
			case AlbumsPackage.CHANSON__TITRE:
				setTitre((String)newValue);
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
			case AlbumsPackage.CHANSON__CHANTEURS:
				getChanteurs().clear();
				return;
			case AlbumsPackage.CHANSON__AUTEUR:
				getAuteur().clear();
				return;
			case AlbumsPackage.CHANSON__ID:
				setId(ID_EDEFAULT);
				return;
			case AlbumsPackage.CHANSON__TITRE:
				setTitre(TITRE_EDEFAULT);
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
			case AlbumsPackage.CHANSON__CHANTEURS:
				return chanteurs != null && !chanteurs.isEmpty();
			case AlbumsPackage.CHANSON__AUTEUR:
				return auteur != null && !auteur.isEmpty();
			case AlbumsPackage.CHANSON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AlbumsPackage.CHANSON__TITRE:
				return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", titre: ");
		result.append(titre);
		result.append(')');
		return result.toString();
	}

} //ChansonImpl
