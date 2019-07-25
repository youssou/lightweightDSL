/**
 */
package lightweightDSL.impl;

import lightweightDSL.Authenticator;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Protocol;
import lightweightDSL.Recovery;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.RecoveryImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link lightweightDSL.impl.RecoveryImpl#getAuthenticator <em>Authenticator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecoveryImpl extends PhaseImpl implements Recovery {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.EBIA;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthenticator() <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected Authenticator authenticator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.RECOVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RECOVERY__PROTOCOL, oldProtocol,
					protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator getAuthenticator() {
		if (authenticator != null && authenticator.eIsProxy()) {
			InternalEObject oldAuthenticator = (InternalEObject) authenticator;
			authenticator = (Authenticator) eResolveProxy(oldAuthenticator);
			if (authenticator != oldAuthenticator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LightweightDSLPackage.RECOVERY__AUTHENTICATOR, oldAuthenticator, authenticator));
			}
		}
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator basicGetAuthenticator() {
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticator(Authenticator newAuthenticator) {
		Authenticator oldAuthenticator = authenticator;
		authenticator = newAuthenticator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RECOVERY__AUTHENTICATOR,
					oldAuthenticator, authenticator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.RECOVERY__PROTOCOL:
			return getProtocol();
		case LightweightDSLPackage.RECOVERY__AUTHENTICATOR:
			if (resolve)
				return getAuthenticator();
			return basicGetAuthenticator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LightweightDSLPackage.RECOVERY__PROTOCOL:
			setProtocol((Protocol) newValue);
			return;
		case LightweightDSLPackage.RECOVERY__AUTHENTICATOR:
			setAuthenticator((Authenticator) newValue);
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
		case LightweightDSLPackage.RECOVERY__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case LightweightDSLPackage.RECOVERY__AUTHENTICATOR:
			setAuthenticator((Authenticator) null);
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
		case LightweightDSLPackage.RECOVERY__PROTOCOL:
			return protocol != PROTOCOL_EDEFAULT;
		case LightweightDSLPackage.RECOVERY__AUTHENTICATOR:
			return authenticator != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //RecoveryImpl
