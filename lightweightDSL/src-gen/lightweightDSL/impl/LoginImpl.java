/**
 */
package lightweightDSL.impl;

import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Login;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.LoginImpl#isSession <em>Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginImpl extends PhaseImpl implements Login {
	/**
	 * The default value of the '{@link #isSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSession()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SESSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSession()
	 * @generated
	 * @ordered
	 */
	protected boolean session = SESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.LOGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSession(boolean newSession) {
		boolean oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.LOGIN__SESSION, oldSession,
					session));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.LOGIN__SESSION:
			return isSession();
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
		case LightweightDSLPackage.LOGIN__SESSION:
			setSession((Boolean) newValue);
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
		case LightweightDSLPackage.LOGIN__SESSION:
			setSession(SESSION_EDEFAULT);
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
		case LightweightDSLPackage.LOGIN__SESSION:
			return session != SESSION_EDEFAULT;
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
		result.append(" (session: ");
		result.append(session);
		result.append(')');
		return result.toString();
	}

} //LoginImpl
