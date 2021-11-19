/**
 */
package maisonDeDisque.impl;

import java.util.Collection;

import maisonDeDisque.Chanson;
import maisonDeDisque.MaisonDeDisquePackage;
import maisonDeDisque.Personne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chanson</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maisonDeDisque.impl.ChansonImpl#getAuteurs <em>Auteurs</em>}</li>
 *   <li>{@link maisonDeDisque.impl.ChansonImpl#getChanteurs <em>Chanteurs</em>}</li>
 *   <li>{@link maisonDeDisque.impl.ChansonImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChansonImpl extends MinimalEObjectImpl.Container implements Chanson {
	/**
	 * The cached value of the '{@link #getAuteurs() <em>Auteurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> auteurs;

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
		return MaisonDeDisquePackage.Literals.CHANSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getAuteurs() {
		if (auteurs == null) {
			auteurs = new EObjectResolvingEList<Personne>(Personne.class, this, MaisonDeDisquePackage.CHANSON__AUTEURS);
		}
		return auteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getChanteurs() {
		if (chanteurs == null) {
			chanteurs = new EObjectResolvingEList<Personne>(Personne.class, this, MaisonDeDisquePackage.CHANSON__CHANTEURS);
		}
		return chanteurs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaisonDeDisquePackage.CHANSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaisonDeDisquePackage.CHANSON__AUTEURS:
				return getAuteurs();
			case MaisonDeDisquePackage.CHANSON__CHANTEURS:
				return getChanteurs();
			case MaisonDeDisquePackage.CHANSON__NAME:
				return getName();
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
			case MaisonDeDisquePackage.CHANSON__AUTEURS:
				getAuteurs().clear();
				getAuteurs().addAll((Collection<? extends Personne>)newValue);
				return;
			case MaisonDeDisquePackage.CHANSON__CHANTEURS:
				getChanteurs().clear();
				getChanteurs().addAll((Collection<? extends Personne>)newValue);
				return;
			case MaisonDeDisquePackage.CHANSON__NAME:
				setName((String)newValue);
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
			case MaisonDeDisquePackage.CHANSON__AUTEURS:
				getAuteurs().clear();
				return;
			case MaisonDeDisquePackage.CHANSON__CHANTEURS:
				getChanteurs().clear();
				return;
			case MaisonDeDisquePackage.CHANSON__NAME:
				setName(NAME_EDEFAULT);
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
			case MaisonDeDisquePackage.CHANSON__AUTEURS:
				return auteurs != null && !auteurs.isEmpty();
			case MaisonDeDisquePackage.CHANSON__CHANTEURS:
				return chanteurs != null && !chanteurs.isEmpty();
			case MaisonDeDisquePackage.CHANSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //ChansonImpl
