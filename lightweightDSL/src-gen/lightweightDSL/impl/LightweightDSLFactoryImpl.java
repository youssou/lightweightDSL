/**
 */
package lightweightDSL.impl;

import lightweightDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LightweightDSLFactoryImpl extends EFactoryImpl implements LightweightDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LightweightDSLFactory init() {
		try {
			LightweightDSLFactory theLightweightDSLFactory = (LightweightDSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(LightweightDSLPackage.eNS_URI);
			if (theLightweightDSLFactory != null) {
				return theLightweightDSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LightweightDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightweightDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LightweightDSLPackage.REGISTRATION:
			return createRegistration();
		case LightweightDSLPackage.RECOVERY:
			return createRecovery();
		case LightweightDSLPackage.LOGIN:
			return createLogin();
		case LightweightDSLPackage.RESET:
			return createReset();
		case LightweightDSLPackage.APP:
			return createApp();
		case LightweightDSLPackage.CREDENTIAL:
			return createCredential();
		case LightweightDSLPackage.VERIF_METHOD:
			return createVerifMethod();
		case LightweightDSLPackage.MFA:
			return createMFA();
		case LightweightDSLPackage.SFA:
			return createSFA();
		case LightweightDSLPackage.KNOWLEDGE:
			return createKnowledge();
		case LightweightDSLPackage.POSSESSION:
			return createPossession();
		case LightweightDSLPackage.BIOMETRICS:
			return createBiometrics();
		case LightweightDSLPackage.RISK:
			return createRisk();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case LightweightDSLPackage.LEVEL:
			return createLEVELFromString(eDataType, initialValue);
		case LightweightDSLPackage.CRED_TYPE:
			return createCredTYPEFromString(eDataType, initialValue);
		case LightweightDSLPackage.PROTOCOL:
			return createProtocolFromString(eDataType, initialValue);
		case LightweightDSLPackage.VALIDATION_TYPE:
			return createValidationTypeFromString(eDataType, initialValue);
		case LightweightDSLPackage.BVALUE:
			return createBVALUEFromString(eDataType, initialValue);
		case LightweightDSLPackage.PROVIDER:
			return createPROVIDERFromString(eDataType, initialValue);
		case LightweightDSLPackage.KVALUE:
			return createKVALUEFromString(eDataType, initialValue);
		case LightweightDSLPackage.PVALUE:
			return createPVALUEFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case LightweightDSLPackage.LEVEL:
			return convertLEVELToString(eDataType, instanceValue);
		case LightweightDSLPackage.CRED_TYPE:
			return convertCredTYPEToString(eDataType, instanceValue);
		case LightweightDSLPackage.PROTOCOL:
			return convertProtocolToString(eDataType, instanceValue);
		case LightweightDSLPackage.VALIDATION_TYPE:
			return convertValidationTypeToString(eDataType, instanceValue);
		case LightweightDSLPackage.BVALUE:
			return convertBVALUEToString(eDataType, instanceValue);
		case LightweightDSLPackage.PROVIDER:
			return convertPROVIDERToString(eDataType, instanceValue);
		case LightweightDSLPackage.KVALUE:
			return convertKVALUEToString(eDataType, instanceValue);
		case LightweightDSLPackage.PVALUE:
			return convertPVALUEToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registration createRegistration() {
		RegistrationImpl registration = new RegistrationImpl();
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recovery createRecovery() {
		RecoveryImpl recovery = new RecoveryImpl();
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Login createLogin() {
		LoginImpl login = new LoginImpl();
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reset createReset() {
		ResetImpl reset = new ResetImpl();
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credential createCredential() {
		CredentialImpl credential = new CredentialImpl();
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifMethod createVerifMethod() {
		VerifMethodImpl verifMethod = new VerifMethodImpl();
		return verifMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA createMFA() {
		MFAImpl mfa = new MFAImpl();
		return mfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFA createSFA() {
		SFAImpl sfa = new SFAImpl();
		return sfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge createKnowledge() {
		KnowledgeImpl knowledge = new KnowledgeImpl();
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Possession createPossession() {
		PossessionImpl possession = new PossessionImpl();
		return possession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biometrics createBiometrics() {
		BiometricsImpl biometrics = new BiometricsImpl();
		return biometrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk createRisk() {
		RiskImpl risk = new RiskImpl();
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEVEL createLEVELFromString(EDataType eDataType, String initialValue) {
		LEVEL result = LEVEL.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEVELToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredTYPE createCredTYPEFromString(EDataType eDataType, String initialValue) {
		CredTYPE result = CredTYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCredTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationType createValidationTypeFromString(EDataType eDataType, String initialValue) {
		ValidationType result = ValidationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BVALUE createBVALUEFromString(EDataType eDataType, String initialValue) {
		BVALUE result = BVALUE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBVALUEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROVIDER createPROVIDERFromString(EDataType eDataType, String initialValue) {
		PROVIDER result = PROVIDER.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROVIDERToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KVALUE createKVALUEFromString(EDataType eDataType, String initialValue) {
		KVALUE result = KVALUE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKVALUEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PVALUE createPVALUEFromString(EDataType eDataType, String initialValue) {
		PVALUE result = PVALUE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPVALUEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightweightDSLPackage getLightweightDSLPackage() {
		return (LightweightDSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LightweightDSLPackage getPackage() {
		return LightweightDSLPackage.eINSTANCE;
	}

} //LightweightDSLFactoryImpl
