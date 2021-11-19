/**
 */
package maisonDeDisque.impl;

import java.util.Collection;

import maisonDeDisque.Album;
import maisonDeDisque.AlbumType;
import maisonDeDisque.Chanson;
import maisonDeDisque.MaisonDeDisquePackage;

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
 *   <li>{@link maisonDeDisque.impl.AlbumImpl#getChansons <em>Chansons</em>}</li>
 *   <li>{@link maisonDeDisque.impl.AlbumImpl#getName <em>Name</em>}</li>
 *   <li>{@link maisonDeDisque.impl.AlbumImpl#getAnneeSortie <em>Annee Sortie</em>}</li>
 *   <li>{@link maisonDeDisque.impl.AlbumImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlbumImpl extends MinimalEObjectImpl.Container implements Album {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnneeSortie() <em>Annee Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeSortie()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNEE_SORTIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnneeSortie() <em>Annee Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeSortie()
	 * @generated
	 * @ordered
	 */
	protected String anneeSortie = ANNEE_SORTIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AlbumType TYPE_EDEFAULT = AlbumType.SINGLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AlbumType type = TYPE_EDEFAULT;

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
		return MaisonDeDisquePackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chanson> getChansons() {
		if (chansons == null) {
			chansons = new EObjectResolvingEList<Chanson>(Chanson.class, this, MaisonDeDisquePackage.ALBUM__CHANSONS);
		}
		return chansons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaisonDeDisquePackage.ALBUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnneeSortie() {
		return anneeSortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnneeSortie(String newAnneeSortie) {
		String oldAnneeSortie = anneeSortie;
		anneeSortie = newAnneeSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaisonDeDisquePackage.ALBUM__ANNEE_SORTIE, oldAnneeSortie, anneeSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlbumType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AlbumType newType) {
		AlbumType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaisonDeDisquePackage.ALBUM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaisonDeDisquePackage.ALBUM__CHANSONS:
				return getChansons();
			case MaisonDeDisquePackage.ALBUM__NAME:
				return getName();
			case MaisonDeDisquePackage.ALBUM__ANNEE_SORTIE:
				return getAnneeSortie();
			case MaisonDeDisquePackage.ALBUM__TYPE:
				return getType();
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
			case MaisonDeDisquePackage.ALBUM__CHANSONS:
				getChansons().clear();
				getChansons().addAll((Collection<? extends Chanson>)newValue);
				return;
			case MaisonDeDisquePackage.ALBUM__NAME:
				setName((String)newValue);
				return;
			case MaisonDeDisquePackage.ALBUM__ANNEE_SORTIE:
				setAnneeSortie((String)newValue);
				return;
			case MaisonDeDisquePackage.ALBUM__TYPE:
				setType((AlbumType)newValue);
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
			case MaisonDeDisquePackage.ALBUM__CHANSONS:
				getChansons().clear();
				return;
			case MaisonDeDisquePackage.ALBUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MaisonDeDisquePackage.ALBUM__ANNEE_SORTIE:
				setAnneeSortie(ANNEE_SORTIE_EDEFAULT);
				return;
			case MaisonDeDisquePackage.ALBUM__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MaisonDeDisquePackage.ALBUM__CHANSONS:
				return chansons != null && !chansons.isEmpty();
			case MaisonDeDisquePackage.ALBUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MaisonDeDisquePackage.ALBUM__ANNEE_SORTIE:
				return ANNEE_SORTIE_EDEFAULT == null ? anneeSortie != null : !ANNEE_SORTIE_EDEFAULT.equals(anneeSortie);
			case MaisonDeDisquePackage.ALBUM__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", anneeSortie: ");
		result.append(anneeSortie);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
