/**
 */
package lightweightDSL.impl;

import lightweightDSL.App;
import lightweightDSL.AuthMethod;
import lightweightDSL.Authenticator;
import lightweightDSL.Biometrics;
import lightweightDSL.CredTYPE;
import lightweightDSL.Credential;
import lightweightDSL.Knowledge;
import lightweightDSL.LightweightDSLFactory;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Login;
import lightweightDSL.Phase;
import lightweightDSL.Possession;
import lightweightDSL.Protocol;
import lightweightDSL.Recovery;
import lightweightDSL.Registration;
import lightweightDSL.Reset;
import lightweightDSL.Risk;
import lightweightDSL.ValidationType;
import lightweightDSL.VerifMethod;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LightweightDSLPackageImpl extends EPackageImpl implements LightweightDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biometricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum credTYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bvalueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kvalueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pvalueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lightweightDSL.LightweightDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LightweightDSLPackageImpl() {
		super(eNS_URI, LightweightDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LightweightDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LightweightDSLPackage init() {
		if (isInited)
			return (LightweightDSLPackage) EPackage.Registry.INSTANCE.getEPackage(LightweightDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLightweightDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LightweightDSLPackageImpl theLightweightDSLPackage = registeredLightweightDSLPackage instanceof LightweightDSLPackageImpl
				? (LightweightDSLPackageImpl) registeredLightweightDSLPackage
				: new LightweightDSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLightweightDSLPackage.createPackageContents();

		// Initialize created meta-data
		theLightweightDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLightweightDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LightweightDSLPackage.eNS_URI, theLightweightDSLPackage);
		return theLightweightDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthMethod() {
		return authMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthMethod_Name() {
		return (EAttribute) authMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthMethod_Authenticators() {
		return (EReference) authMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthMethod_Type() {
		return (EAttribute) authMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthMethod_Risk() {
		return (EReference) authMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthMethod__ComputeLevel() {
		return authMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistration() {
		return registrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_Credentials() {
		return (EReference) registrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecovery() {
		return recoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecovery_Protocol() {
		return (EAttribute) recoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecovery_Authenticator() {
		return (EReference) recoveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogin() {
		return loginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogin_Session() {
		return (EAttribute) loginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReset() {
		return resetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReset_Authenticator() {
		return (EReference) resetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Phases() {
		return (EReference) appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Authenticators() {
		return (EReference) appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_AuthMethods() {
		return (EReference) appEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Risks() {
		return (EReference) appEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Registration() {
		return (EReference) appEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredential() {
		return credentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Name() {
		return (EAttribute) credentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Provider() {
		return (EAttribute) credentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Type() {
		return (EAttribute) credentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCredential_Verifmethod() {
		return (EReference) credentialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCredential_Risk() {
		return (EReference) credentialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Name() {
		return (EAttribute) phaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_AuthMethods() {
		return (EReference) phaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Type() {
		return (EAttribute) phaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_Risk() {
		return (EReference) phaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPhase__ComputeLevel() {
		return phaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticator() {
		return authenticatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticator_Name() {
		return (EAttribute) authenticatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticator_Type() {
		return (EAttribute) authenticatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticator_Risk() {
		return (EReference) authenticatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthenticator__ComputeLevel() {
		return authenticatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifMethod() {
		return verifMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifMethod_Validity() {
		return (EAttribute) verifMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifMethod_Uniqueness() {
		return (EAttribute) verifMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifMethod_Bindings() {
		return (EAttribute) verifMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifMethod_Level() {
		return (EAttribute) verifMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFA() {
		return mfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFA_Validation() {
		return (EAttribute) mfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFA_Correlation() {
		return (EAttribute) mfaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFA() {
		return sfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledge() {
		return knowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_Value() {
		return (EAttribute) knowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_LimitedAttempts() {
		return (EAttribute) knowledgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_Autofilled() {
		return (EAttribute) knowledgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossession() {
		return possessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPossession_Value() {
		return (EAttribute) possessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiometrics() {
		return biometricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiometrics_Value() {
		return (EAttribute) biometricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRisk() {
		return riskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRisk_Instance() {
		return (EAttribute) riskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRisk_Value() {
		return (EAttribute) riskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRisk_Message() {
		return (EAttribute) riskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRisk_Information() {
		return (EAttribute) riskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLEVEL() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCredTYPE() {
		return credTYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidationType() {
		return validationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBVALUE() {
		return bvalueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPROVIDER() {
		return providerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKVALUE() {
		return kvalueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPVALUE() {
		return pvalueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightweightDSLFactory getLightweightDSLFactory() {
		return (LightweightDSLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		authMethodEClass = createEClass(AUTH_METHOD);
		createEAttribute(authMethodEClass, AUTH_METHOD__NAME);
		createEReference(authMethodEClass, AUTH_METHOD__AUTHENTICATORS);
		createEAttribute(authMethodEClass, AUTH_METHOD__TYPE);
		createEReference(authMethodEClass, AUTH_METHOD__RISK);
		createEOperation(authMethodEClass, AUTH_METHOD___COMPUTE_LEVEL);

		registrationEClass = createEClass(REGISTRATION);
		createEReference(registrationEClass, REGISTRATION__CREDENTIALS);

		recoveryEClass = createEClass(RECOVERY);
		createEAttribute(recoveryEClass, RECOVERY__PROTOCOL);
		createEReference(recoveryEClass, RECOVERY__AUTHENTICATOR);

		loginEClass = createEClass(LOGIN);
		createEAttribute(loginEClass, LOGIN__SESSION);

		resetEClass = createEClass(RESET);
		createEReference(resetEClass, RESET__AUTHENTICATOR);

		appEClass = createEClass(APP);
		createEReference(appEClass, APP__PHASES);
		createEReference(appEClass, APP__AUTHENTICATORS);
		createEReference(appEClass, APP__AUTH_METHODS);
		createEReference(appEClass, APP__RISKS);
		createEReference(appEClass, APP__REGISTRATION);

		credentialEClass = createEClass(CREDENTIAL);
		createEAttribute(credentialEClass, CREDENTIAL__NAME);
		createEAttribute(credentialEClass, CREDENTIAL__PROVIDER);
		createEAttribute(credentialEClass, CREDENTIAL__TYPE);
		createEReference(credentialEClass, CREDENTIAL__VERIFMETHOD);
		createEReference(credentialEClass, CREDENTIAL__RISK);

		phaseEClass = createEClass(PHASE);
		createEAttribute(phaseEClass, PHASE__NAME);
		createEReference(phaseEClass, PHASE__AUTH_METHODS);
		createEAttribute(phaseEClass, PHASE__TYPE);
		createEReference(phaseEClass, PHASE__RISK);
		createEOperation(phaseEClass, PHASE___COMPUTE_LEVEL);

		authenticatorEClass = createEClass(AUTHENTICATOR);
		createEAttribute(authenticatorEClass, AUTHENTICATOR__NAME);
		createEAttribute(authenticatorEClass, AUTHENTICATOR__TYPE);
		createEReference(authenticatorEClass, AUTHENTICATOR__RISK);
		createEOperation(authenticatorEClass, AUTHENTICATOR___COMPUTE_LEVEL);

		verifMethodEClass = createEClass(VERIF_METHOD);
		createEAttribute(verifMethodEClass, VERIF_METHOD__VALIDITY);
		createEAttribute(verifMethodEClass, VERIF_METHOD__UNIQUENESS);
		createEAttribute(verifMethodEClass, VERIF_METHOD__BINDINGS);
		createEAttribute(verifMethodEClass, VERIF_METHOD__LEVEL);

		mfaEClass = createEClass(MFA);
		createEAttribute(mfaEClass, MFA__VALIDATION);
		createEAttribute(mfaEClass, MFA__CORRELATION);

		sfaEClass = createEClass(SFA);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__VALUE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__LIMITED_ATTEMPTS);
		createEAttribute(knowledgeEClass, KNOWLEDGE__AUTOFILLED);

		possessionEClass = createEClass(POSSESSION);
		createEAttribute(possessionEClass, POSSESSION__VALUE);

		biometricsEClass = createEClass(BIOMETRICS);
		createEAttribute(biometricsEClass, BIOMETRICS__VALUE);

		riskEClass = createEClass(RISK);
		createEAttribute(riskEClass, RISK__INSTANCE);
		createEAttribute(riskEClass, RISK__VALUE);
		createEAttribute(riskEClass, RISK__MESSAGE);
		createEAttribute(riskEClass, RISK__INFORMATION);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
		credTYPEEEnum = createEEnum(CRED_TYPE);
		protocolEEnum = createEEnum(PROTOCOL);
		validationTypeEEnum = createEEnum(VALIDATION_TYPE);
		bvalueEEnum = createEEnum(BVALUE);
		providerEEnum = createEEnum(PROVIDER);
		kvalueEEnum = createEEnum(KVALUE);
		pvalueEEnum = createEEnum(PVALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		registrationEClass.getESuperTypes().add(this.getPhase());
		recoveryEClass.getESuperTypes().add(this.getPhase());
		loginEClass.getESuperTypes().add(this.getPhase());
		resetEClass.getESuperTypes().add(this.getPhase());
		mfaEClass.getESuperTypes().add(this.getAuthMethod());
		sfaEClass.getESuperTypes().add(this.getAuthMethod());
		knowledgeEClass.getESuperTypes().add(this.getAuthenticator());
		possessionEClass.getESuperTypes().add(this.getAuthenticator());
		biometricsEClass.getESuperTypes().add(this.getAuthenticator());

		// Initialize classes, features, and operations; add parameters
		initEClass(authMethodEClass, AuthMethod.class, "AuthMethod", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, AuthMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthMethod_Authenticators(), this.getAuthenticator(), null, "authenticators", null, 1, 2,
				AuthMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthMethod_Type(), ecorePackage.getEString(), "type", null, 0, 1, AuthMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthMethod_Risk(), this.getRisk(), null, "risk", null, 0, 1, AuthMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getAuthMethod__ComputeLevel(), this.getLEVEL(), "computeLevel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registrationEClass, Registration.class, "Registration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistration_Credentials(), this.getCredential(), null, "credentials", null, 1, -1,
				Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recoveryEClass, Recovery.class, "Recovery", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecovery_Protocol(), this.getProtocol(), "protocol", null, 0, 1, Recovery.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecovery_Authenticator(), this.getAuthenticator(), null, "authenticator", null, 0, 1,
				Recovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginEClass, Login.class, "Login", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogin_Session(), ecorePackage.getEBoolean(), "session", null, 0, 1, Login.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetEClass, Reset.class, "Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReset_Authenticator(), this.getAuthenticator(), null, "authenticator", null, 0, 1,
				Reset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApp_Phases(), this.getPhase(), null, "phases", null, 4, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_Authenticators(), this.getAuthenticator(), null, "authenticators", null, 1, -1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_AuthMethods(), this.getAuthMethod(), null, "authMethods", null, 1, -1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_Risks(), this.getRisk(), null, "risks", null, 0, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_Registration(), this.getRegistration(), null, "registration", null, 0, 1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(credentialEClass, Credential.class, "Credential", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCredential_Name(), ecorePackage.getEString(), "name", null, 0, 1, Credential.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Provider(), this.getPROVIDER(), "provider", null, 0, 1, Credential.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Type(), this.getCredTYPE(), "type", null, 0, 1, Credential.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCredential_Verifmethod(), this.getVerifMethod(), null, "verifmethod", null, 0, 1,
				Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCredential_Risk(), this.getRisk(), null, "risk", null, 0, 1, Credential.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(phaseEClass, Phase.class, "Phase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Phase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_AuthMethods(), this.getAuthMethod(), null, "authMethods", null, 0, -1, Phase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Type(), ecorePackage.getEString(), "type", null, 0, 1, Phase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Risk(), this.getRisk(), null, "risk", null, 0, 1, Phase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getPhase__ComputeLevel(), this.getLEVEL(), "computeLevel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authenticatorEClass, Authenticator.class, "Authenticator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Authenticator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticator_Type(), ecorePackage.getEString(), "type", null, 0, 1, Authenticator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthenticator_Risk(), this.getRisk(), null, "risk", null, 0, 1, Authenticator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAuthenticator__ComputeLevel(), this.getLEVEL(), "computeLevel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(verifMethodEClass, VerifMethod.class, "VerifMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerifMethod_Validity(), ecorePackage.getEBoolean(), "validity", null, 0, 1, VerifMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerifMethod_Uniqueness(), ecorePackage.getEBoolean(), "uniqueness", null, 0, 1,
				VerifMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerifMethod_Bindings(), ecorePackage.getEBoolean(), "bindings", null, 0, 1, VerifMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerifMethod_Level(), this.getLEVEL(), "level", null, 0, 1, VerifMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mfaEClass, lightweightDSL.MFA.class, "MFA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMFA_Validation(), this.getValidationType(), "validation", null, 0, 1,
				lightweightDSL.MFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFA_Correlation(), ecorePackage.getEBoolean(), "correlation", null, 0, 1,
				lightweightDSL.MFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sfaEClass, lightweightDSL.SFA.class, "SFA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledge_Value(), this.getKVALUE(), "value", null, 0, 1, Knowledge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledge_LimitedAttempts(), ecorePackage.getEBoolean(), "limitedAttempts", null, 0, 1,
				Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledge_Autofilled(), ecorePackage.getEBoolean(), "autofilled", null, 0, 1, Knowledge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(possessionEClass, Possession.class, "Possession", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPossession_Value(), this.getPVALUE(), "value", null, 0, 1, Possession.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biometricsEClass, Biometrics.class, "Biometrics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiometrics_Value(), this.getBVALUE(), "value", null, 0, 1, Biometrics.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskEClass, Risk.class, "Risk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRisk_Instance(), ecorePackage.getEString(), "instance", null, 0, 1, Risk.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_Value(), this.getLEVEL(), "value", null, 0, 1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_Message(), ecorePackage.getEString(), "message", null, 0, 1, Risk.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_Information(), ecorePackage.getEString(), "information", null, 0, 1, Risk.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, lightweightDSL.LEVEL.class, "LEVEL");
		addEEnumLiteral(levelEEnum, lightweightDSL.LEVEL.LOW);
		addEEnumLiteral(levelEEnum, lightweightDSL.LEVEL.MEDIUM);
		addEEnumLiteral(levelEEnum, lightweightDSL.LEVEL.HIGH);

		initEEnum(credTYPEEEnum, CredTYPE.class, "CredTYPE");
		addEEnumLiteral(credTYPEEEnum, CredTYPE.DIGITAL);
		addEEnumLiteral(credTYPEEEnum, CredTYPE.PHYSICAL);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.EBIA);
		addEEnumLiteral(protocolEEnum, Protocol.SMS_BASED);
		addEEnumLiteral(protocolEEnum, Protocol.LOCAL);

		initEEnum(validationTypeEEnum, ValidationType.class, "ValidationType");
		addEEnumLiteral(validationTypeEEnum, ValidationType.LOCAL);
		addEEnumLiteral(validationTypeEEnum, ValidationType.REMOTE);

		initEEnum(bvalueEEnum, lightweightDSL.BVALUE.class, "BVALUE");
		addEEnumLiteral(bvalueEEnum, lightweightDSL.BVALUE.FINGERPRINT);
		addEEnumLiteral(bvalueEEnum, lightweightDSL.BVALUE.IRIS);

		initEEnum(providerEEnum, lightweightDSL.PROVIDER.class, "PROVIDER");
		addEEnumLiteral(providerEEnum, lightweightDSL.PROVIDER.ID_P);
		addEEnumLiteral(providerEEnum, lightweightDSL.PROVIDER.SELF);
		addEEnumLiteral(providerEEnum, lightweightDSL.PROVIDER.INSTITUTIONAL);

		initEEnum(kvalueEEnum, lightweightDSL.KVALUE.class, "KVALUE");
		addEEnumLiteral(kvalueEEnum, lightweightDSL.KVALUE.PASSPHRASE);
		addEEnumLiteral(kvalueEEnum, lightweightDSL.KVALUE.STBP);
		addEEnumLiteral(kvalueEEnum, lightweightDSL.KVALUE.LTBP);
		addEEnumLiteral(kvalueEEnum, lightweightDSL.KVALUE.PIN);
		addEEnumLiteral(kvalueEEnum, lightweightDSL.KVALUE.PREFERENCES);

		initEEnum(pvalueEEnum, lightweightDSL.PVALUE.class, "PVALUE");
		addEEnumLiteral(pvalueEEnum, lightweightDSL.PVALUE.DEVICE);
		addEEnumLiteral(pvalueEEnum, lightweightDSL.PVALUE.TOKEN);

		// Create resource
		createResource(eNS_URI);
	}

} //LightweightDSLPackageImpl
