/**
 */
package albums.impl;

import albums.Album;
import albums.AlbumsPackage;
import albums.AlbumsType;
import albums.Chanson;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link albums.impl.AlbumImpl#getAnneeSortie <em>Annee Sortie</em>}</li>
 *   <li>{@link albums.impl.AlbumImpl#getType <em>Type</em>}</li>
 *   <li>{@link albums.impl.AlbumImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link albums.impl.AlbumImpl#getChansons <em>Chansons</em>}</li>
 *   <li>{@link albums.impl.AlbumImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlbumImpl extends MinimalEObjectImpl.Container implements Album {
	/**
	 * The default value of the '{@link #getAnneeSortie() <em>Annee Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeSortie()
	 * @generated
	 * @ordered
	 */
	protected static final Date ANNEE_SORTIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnneeSortie() <em>Annee Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeSortie()
	 * @generated
	 * @ordered
	 */
	protected Date anneeSortie = ANNEE_SORTIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AlbumsType TYPE_EDEFAULT = AlbumsType.SINGLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AlbumsType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getChansons() <em>Chansons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChansons()
	 * @generated
	 * @ordered
	 */
	protected EList<Chanson> chansons;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlbumsPackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAnneeSortie() {
		return anneeSortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnneeSortie(Date newAnneeSortie) {
		Date oldAnneeSortie = anneeSortie;
		anneeSortie = newAnneeSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.ALBUM__ANNEE_SORTIE, oldAnneeSortie, anneeSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlbumsType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AlbumsType newType) {
		AlbumsType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.ALBUM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.ALBUM__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chanson> getChansons() {
		if (chansons == null) {
			chansons = new EObjectResolvingEList<Chanson>(Chanson.class, this, AlbumsPackage.ALBUM__CHANSONS);
		}
		return chansons;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlbumsPackage.ALBUM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlbumsPackage.ALBUM__ANNEE_SORTIE:
				return getAnneeSortie();
			case AlbumsPackage.ALBUM__TYPE:
				return getType();
			case AlbumsPackage.ALBUM__NOM:
				return getNom();
			case AlbumsPackage.ALBUM__CHANSONS:
				return getChansons();
			case AlbumsPackage.ALBUM__ID:
				return getId();
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
			case AlbumsPackage.ALBUM__ANNEE_SORTIE:
				setAnneeSortie((Date)newValue);
				return;
			case AlbumsPackage.ALBUM__TYPE:
				setType((AlbumsType)newValue);
				return;
			case AlbumsPackage.ALBUM__NOM:
				setNom((String)newValue);
				return;
			case AlbumsPackage.ALBUM__CHANSONS:
				getChansons().clear();
				getChansons().addAll((Collection<? extends Chanson>)newValue);
				return;
			case AlbumsPackage.ALBUM__ID:
				setId((String)newValue);
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
			case AlbumsPackage.ALBUM__ANNEE_SORTIE:
				setAnneeSortie(ANNEE_SORTIE_EDEFAULT);
				return;
			case AlbumsPackage.ALBUM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AlbumsPackage.ALBUM__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlbumsPackage.ALBUM__CHANSONS:
				getChansons().clear();
				return;
			case AlbumsPackage.ALBUM__ID:
				setId(ID_EDEFAULT);
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
			case AlbumsPackage.ALBUM__ANNEE_SORTIE:
				return ANNEE_SORTIE_EDEFAULT == null ? anneeSortie != null : !ANNEE_SORTIE_EDEFAULT.equals(anneeSortie);
			case AlbumsPackage.ALBUM__TYPE:
				return type != TYPE_EDEFAULT;
			case AlbumsPackage.ALBUM__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlbumsPackage.ALBUM__CHANSONS:
				return chansons != null && !chansons.isEmpty();
			case AlbumsPackage.ALBUM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (anneeSortie: ");
		result.append(anneeSortie);
		result.append(", type: ");
		result.append(type);
		result.append(", nom: ");
		result.append(nom);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
