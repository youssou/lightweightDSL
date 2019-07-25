/**
 */
package lightweightDSL.impl;

import java.util.Collection;

import lightweightDSL.App;
import lightweightDSL.AuthMethod;
import lightweightDSL.Authenticator;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Phase;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
