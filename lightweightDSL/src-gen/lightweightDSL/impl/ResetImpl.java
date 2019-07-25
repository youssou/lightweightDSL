/**
 */
package lightweightDSL.impl;

import lightweightDSL.Authenticator;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Reset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.ResetImpl#getAuthenticator <em>Authenticator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResetImpl extends PhaseImpl implements Reset {
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
	protected ResetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.RESET;
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
							LightweightDSLPackage.RESET__AUTHENTICATOR, oldAuthenticator, authenticator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RESET__AUTHENTICATOR,
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
		case LightweightDSLPackage.RESET__AUTHENTICATOR:
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
		case LightweightDSLPackage.RESET__AUTHENTICATOR:
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
		case LightweightDSLPackage.RESET__AUTHENTICATOR:
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
		case LightweightDSLPackage.RESET__AUTHENTICATOR:
			return authenticator != null;
		}
		return super.eIsSet(featureID);
	}

} //ResetImpl
