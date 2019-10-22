/**
 */
package lightweightDSL.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import lightweightDSL.AuthMethod;
import lightweightDSL.Authenticator;
import lightweightDSL.LEVEL;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Risk;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.AuthMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.impl.AuthMethodImpl#getAuthenticators <em>Authenticators</em>}</li>
 *   <li>{@link lightweightDSL.impl.AuthMethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link lightweightDSL.impl.AuthMethodImpl#getRisk <em>Risk</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthMethodImpl extends MinimalEObjectImpl.Container implements AuthMethod {
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
	 * The cached value of the '{@link #getAuthenticators() <em>Authenticators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected EList<Authenticator> authenticators;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected Risk risk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.AUTH_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.AUTH_METHOD__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Authenticator> getAuthenticators() {
		if (authenticators == null) {
			authenticators = new EObjectResolvingEList<Authenticator>(Authenticator.class, this,
					LightweightDSLPackage.AUTH_METHOD__AUTHENTICATORS);
		}
		return authenticators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.AUTH_METHOD__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Risk getRisk() {
		if (risk != null && risk.eIsProxy()) {
			InternalEObject oldRisk = (InternalEObject) risk;
			risk = (Risk) eResolveProxy(oldRisk);
			if (risk != oldRisk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LightweightDSLPackage.AUTH_METHOD__RISK,
							oldRisk, risk));
			}
		}
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk basicGetRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRisk(Risk newRisk) {
		Risk oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.AUTH_METHOD__RISK, oldRisk,
					risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEVEL computeLevel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.AUTH_METHOD__NAME:
			return getName();
		case LightweightDSLPackage.AUTH_METHOD__AUTHENTICATORS:
			return getAuthenticators();
		case LightweightDSLPackage.AUTH_METHOD__TYPE:
			return getType();
		case LightweightDSLPackage.AUTH_METHOD__RISK:
			if (resolve)
				return getRisk();
			return basicGetRisk();
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
		case LightweightDSLPackage.AUTH_METHOD__NAME:
			setName((String) newValue);
			return;
		case LightweightDSLPackage.AUTH_METHOD__AUTHENTICATORS:
			getAuthenticators().clear();
			getAuthenticators().addAll((Collection<? extends Authenticator>) newValue);
			return;
		case LightweightDSLPackage.AUTH_METHOD__TYPE:
			setType((String) newValue);
			return;
		case LightweightDSLPackage.AUTH_METHOD__RISK:
			setRisk((Risk) newValue);
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
		case LightweightDSLPackage.AUTH_METHOD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LightweightDSLPackage.AUTH_METHOD__AUTHENTICATORS:
			getAuthenticators().clear();
			return;
		case LightweightDSLPackage.AUTH_METHOD__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case LightweightDSLPackage.AUTH_METHOD__RISK:
			setRisk((Risk) null);
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
		case LightweightDSLPackage.AUTH_METHOD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LightweightDSLPackage.AUTH_METHOD__AUTHENTICATORS:
			return authenticators != null && !authenticators.isEmpty();
		case LightweightDSLPackage.AUTH_METHOD__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case LightweightDSLPackage.AUTH_METHOD__RISK:
			return risk != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case LightweightDSLPackage.AUTH_METHOD___COMPUTE_LEVEL:
			return computeLevel();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AuthMethodImpl
