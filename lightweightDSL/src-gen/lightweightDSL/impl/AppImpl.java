/**
 */
package lightweightDSL.impl;

import java.util.Collection;

import lightweightDSL.App;
import lightweightDSL.AuthMethod;
import lightweightDSL.Authenticator;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Phase;

import lightweightDSL.Registration;
import lightweightDSL.Risk;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.AppImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link lightweightDSL.impl.AppImpl#getAuthenticators <em>Authenticators</em>}</li>
 *   <li>{@link lightweightDSL.impl.AppImpl#getAuthMethods <em>Auth Methods</em>}</li>
 *   <li>{@link lightweightDSL.impl.AppImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link lightweightDSL.impl.AppImpl#getRegistration <em>Registration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends MinimalEObjectImpl.Container implements App {
	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phases;

	/**
	 * The cached value of the '{@link #getAuthenticators() <em>Authenticators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected EList<Authenticator> authenticators;

	/**
	 * The cached value of the '{@link #getAuthMethods() <em>Auth Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthMethod> authMethods;

	/**
	 * The cached value of the '{@link #getRisks() <em>Risks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisks()
	 * @generated
	 * @ordered
	 */
	protected EList<Risk> risks;

	/**
	 * The cached value of the '{@link #getRegistration() <em>Registration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected Registration registration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Phase> getPhases() {
		if (phases == null) {
			phases = new EObjectContainmentEList<Phase>(Phase.class, this, LightweightDSLPackage.APP__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Authenticator> getAuthenticators() {
		if (authenticators == null) {
			authenticators = new EObjectContainmentEList<Authenticator>(Authenticator.class, this,
					LightweightDSLPackage.APP__AUTHENTICATORS);
		}
		return authenticators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthMethod> getAuthMethods() {
		if (authMethods == null) {
			authMethods = new EObjectContainmentEList<AuthMethod>(AuthMethod.class, this,
					LightweightDSLPackage.APP__AUTH_METHODS);
		}
		return authMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Risk> getRisks() {
		if (risks == null) {
			risks = new EObjectResolvingEList<Risk>(Risk.class, this, LightweightDSLPackage.APP__RISKS);
		}
		return risks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Registration getRegistration() {
		if (registration != null && registration.eIsProxy()) {
			InternalEObject oldRegistration = (InternalEObject) registration;
			registration = (Registration) eResolveProxy(oldRegistration);
			if (registration != oldRegistration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LightweightDSLPackage.APP__REGISTRATION,
							oldRegistration, registration));
			}
		}
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registration basicGetRegistration() {
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistration(Registration newRegistration) {
		Registration oldRegistration = registration;
		registration = newRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.APP__REGISTRATION,
					oldRegistration, registration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LightweightDSLPackage.APP__PHASES:
			return ((InternalEList<?>) getPhases()).basicRemove(otherEnd, msgs);
		case LightweightDSLPackage.APP__AUTHENTICATORS:
			return ((InternalEList<?>) getAuthenticators()).basicRemove(otherEnd, msgs);
		case LightweightDSLPackage.APP__AUTH_METHODS:
			return ((InternalEList<?>) getAuthMethods()).basicRemove(otherEnd, msgs);
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
		case LightweightDSLPackage.APP__PHASES:
			return getPhases();
		case LightweightDSLPackage.APP__AUTHENTICATORS:
			return getAuthenticators();
		case LightweightDSLPackage.APP__AUTH_METHODS:
			return getAuthMethods();
		case LightweightDSLPackage.APP__RISKS:
			return getRisks();
		case LightweightDSLPackage.APP__REGISTRATION:
			if (resolve)
				return getRegistration();
			return basicGetRegistration();
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
		case LightweightDSLPackage.APP__PHASES:
			getPhases().clear();
			getPhases().addAll((Collection<? extends Phase>) newValue);
			return;
		case LightweightDSLPackage.APP__AUTHENTICATORS:
			getAuthenticators().clear();
			getAuthenticators().addAll((Collection<? extends Authenticator>) newValue);
			return;
		case LightweightDSLPackage.APP__AUTH_METHODS:
			getAuthMethods().clear();
			getAuthMethods().addAll((Collection<? extends AuthMethod>) newValue);
			return;
		case LightweightDSLPackage.APP__RISKS:
			getRisks().clear();
			getRisks().addAll((Collection<? extends Risk>) newValue);
			return;
		case LightweightDSLPackage.APP__REGISTRATION:
			setRegistration((Registration) newValue);
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
		case LightweightDSLPackage.APP__PHASES:
			getPhases().clear();
			return;
		case LightweightDSLPackage.APP__AUTHENTICATORS:
			getAuthenticators().clear();
			return;
		case LightweightDSLPackage.APP__AUTH_METHODS:
			getAuthMethods().clear();
			return;
		case LightweightDSLPackage.APP__RISKS:
			getRisks().clear();
			return;
		case LightweightDSLPackage.APP__REGISTRATION:
			setRegistration((Registration) null);
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
		case LightweightDSLPackage.APP__PHASES:
			return phases != null && !phases.isEmpty();
		case LightweightDSLPackage.APP__AUTHENTICATORS:
			return authenticators != null && !authenticators.isEmpty();
		case LightweightDSLPackage.APP__AUTH_METHODS:
			return authMethods != null && !authMethods.isEmpty();
		case LightweightDSLPackage.APP__RISKS:
			return risks != null && !risks.isEmpty();
		case LightweightDSLPackage.APP__REGISTRATION:
			return registration != null;
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
