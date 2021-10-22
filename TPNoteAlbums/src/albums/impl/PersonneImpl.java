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
 * An implementation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link albums.impl.PersonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link albums.impl.PersonneImpl#getChansonsChanteur <em>Chansons Chanteur</em>}</li>
 *   <li>{@link albums.impl.PersonneImpl#getChansonsAuteur <em>Chansons Auteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonneImpl extends MinimalEObjectImpl.Container implements Personne {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChansonsChanteur() <em>Chansons Chanteur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChansonsChanteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Chanson> chansonsChanteur;

	/**
	 * The cached value of the '{@link #getChansonsAuteur() <em>Chansons Auteur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChansonsAuteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Chanson> chansonsAuteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlbumsPackage.Literals.PERSONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.PERSONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chanson> getChansonsChanteur() {
		if (chansonsChanteur == null) {
			chansonsChanteur = new EObjectWithInverseResolvingEList.ManyInverse<Chanson>(Chanson.class, this, AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR, AlbumsPackage.CHANSON__CHANTEURS);
		}
		return chansonsChanteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chanson> getChansonsAuteur() {
		if (chansonsAuteur == null) {
			chansonsAuteur = new EObjectWithInverseResolvingEList.ManyInverse<Chanson>(Chanson.class, this, AlbumsPackage.PERSONNE__CHANSONS_AUTEUR, AlbumsPackage.CHANSON__AUTEUR);
		}
		return chansonsAuteur;
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
			case AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChansonsChanteur()).basicAdd(otherEnd, msgs);
			case AlbumsPackage.PERSONNE__CHANSONS_AUTEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChansonsAuteur()).basicAdd(otherEnd, msgs);
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
			case AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR:
				return ((InternalEList<?>)getChansonsChanteur()).basicRemove(otherEnd, msgs);
			case AlbumsPackage.PERSONNE__CHANSONS_AUTEUR:
				return ((InternalEList<?>)getChansonsAuteur()).basicRemove(otherEnd, msgs);
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
			case AlbumsPackage.PERSONNE__NOM:
				return getNom();
			case AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR:
				return getChansonsChanteur();
			case AlbumsPackage.PERSONNE__CHANSONS_AUTEUR:
				return getChansonsAuteur();
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
			case AlbumsPackage.PERSONNE__NOM:
				setNom((String)newValue);
				return;
			case AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR:
				getChansonsChanteur().clear();
				getChansonsChanteur().addAll((Collection<? extends Chanson>)newValue);
				return;
			case AlbumsPackage.PERSONNE__CHANSONS_AUTEUR:
				getChansonsAuteur().clear();
				getChansonsAuteur().addAll((Collection<? extends Chanson>)newValue);
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
			case AlbumsPackage.PERSONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR:
				getChansonsChanteur().clear();
				return;
			case AlbumsPackage.PERSONNE__CHANSONS_AUTEUR:
				getChansonsAuteur().clear();
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
			case AlbumsPackage.PERSONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlbumsPackage.PERSONNE__CHANSONS_CHANTEUR:
				return chansonsChanteur != null && !chansonsChanteur.isEmpty();
			case AlbumsPackage.PERSONNE__CHANSONS_AUTEUR:
				return chansonsAuteur != null && !chansonsAuteur.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //PersonneImpl
