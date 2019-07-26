/**
 */
package lightweightDSL.impl;

import lightweightDSL.CredTYPE;
import lightweightDSL.Credential;
import lightweightDSL.LightweightDSLPackage;

import lightweightDSL.PROVIDER;
import lightweightDSL.Risk;
import lightweightDSL.VerifMethod;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.CredentialImpl#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.impl.CredentialImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link lightweightDSL.impl.CredentialImpl#getType <em>Type</em>}</li>
 *   <li>{@link lightweightDSL.impl.CredentialImpl#getVerifmethod <em>Verifmethod</em>}</li>
 *   <li>{@link lightweightDSL.impl.CredentialImpl#getRisk <em>Risk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialImpl extends MinimalEObjectImpl.Container implements Credential {
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
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final PROVIDER PROVIDER_EDEFAULT = PROVIDER.ID_P;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected PROVIDER provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CredTYPE TYPE_EDEFAULT = CredTYPE.DIGITAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CredTYPE type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerifmethod() <em>Verifmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifmethod()
	 * @generated
	 * @ordered
	 */
	protected VerifMethod verifmethod;

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
	protected CredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.CREDENTIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.CREDENTIAL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROVIDER getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(PROVIDER newProvider) {
		PROVIDER oldProvider = provider;
		provider = newProvider == null ? PROVIDER_EDEFAULT : newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.CREDENTIAL__PROVIDER,
					oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredTYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CredTYPE newType) {
		CredTYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.CREDENTIAL__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifMethod getVerifmethod() {
		return verifmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerifmethod(VerifMethod newVerifmethod, NotificationChain msgs) {
		VerifMethod oldVerifmethod = verifmethod;
		verifmethod = newVerifmethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LightweightDSLPackage.CREDENTIAL__VERIFMETHOD, oldVerifmethod, newVerifmethod);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifmethod(VerifMethod newVerifmethod) {
		if (newVerifmethod != verifmethod) {
			NotificationChain msgs = null;
			if (verifmethod != null)
				msgs = ((InternalEObject) verifmethod).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LightweightDSLPackage.CREDENTIAL__VERIFMETHOD, null, msgs);
			if (newVerifmethod != null)
				msgs = ((InternalEObject) newVerifmethod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LightweightDSLPackage.CREDENTIAL__VERIFMETHOD, null, msgs);
			msgs = basicSetVerifmethod(newVerifmethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.CREDENTIAL__VERIFMETHOD,
					newVerifmethod, newVerifmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk getRisk() {
		if (risk != null && risk.eIsProxy()) {
			InternalEObject oldRisk = (InternalEObject) risk;
			risk = (Risk) eResolveProxy(oldRisk);
			if (risk != oldRisk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LightweightDSLPackage.CREDENTIAL__RISK,
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
	public void setRisk(Risk newRisk) {
		Risk oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.CREDENTIAL__RISK, oldRisk,
					risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LightweightDSLPackage.CREDENTIAL__VERIFMETHOD:
			return basicSetVerifmethod(null, msgs);
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
		case LightweightDSLPackage.CREDENTIAL__NAME:
			return getName();
		case LightweightDSLPackage.CREDENTIAL__PROVIDER:
			return getProvider();
		case LightweightDSLPackage.CREDENTIAL__TYPE:
			return getType();
		case LightweightDSLPackage.CREDENTIAL__VERIFMETHOD:
			return getVerifmethod();
		case LightweightDSLPackage.CREDENTIAL__RISK:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LightweightDSLPackage.CREDENTIAL__NAME:
			setName((String) newValue);
			return;
		case LightweightDSLPackage.CREDENTIAL__PROVIDER:
			setProvider((PROVIDER) newValue);
			return;
		case LightweightDSLPackage.CREDENTIAL__TYPE:
			setType((CredTYPE) newValue);
			return;
		case LightweightDSLPackage.CREDENTIAL__VERIFMETHOD:
			setVerifmethod((VerifMethod) newValue);
			return;
		case LightweightDSLPackage.CREDENTIAL__RISK:
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
		case LightweightDSLPackage.CREDENTIAL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LightweightDSLPackage.CREDENTIAL__PROVIDER:
			setProvider(PROVIDER_EDEFAULT);
			return;
		case LightweightDSLPackage.CREDENTIAL__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case LightweightDSLPackage.CREDENTIAL__VERIFMETHOD:
			setVerifmethod((VerifMethod) null);
			return;
		case LightweightDSLPackage.CREDENTIAL__RISK:
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
		case LightweightDSLPackage.CREDENTIAL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LightweightDSLPackage.CREDENTIAL__PROVIDER:
			return provider != PROVIDER_EDEFAULT;
		case LightweightDSLPackage.CREDENTIAL__TYPE:
			return type != TYPE_EDEFAULT;
		case LightweightDSLPackage.CREDENTIAL__VERIFMETHOD:
			return verifmethod != null;
		case LightweightDSLPackage.CREDENTIAL__RISK:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", provider: ");
		result.append(provider);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CredentialImpl
