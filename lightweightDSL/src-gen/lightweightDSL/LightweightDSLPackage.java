/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLFactory
 * @model kind="package"
 * @generated
 */
public interface LightweightDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lightweightDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/lightweightDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lightweightDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LightweightDSLPackage eINSTANCE = lightweightDSL.impl.LightweightDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.AuthMethodImpl <em>Auth Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.AuthMethodImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getAuthMethod()
	 * @generated
	 */
	int AUTH_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Authenticators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD__AUTHENTICATORS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD__RISK = 3;

	/**
	 * The number of structural features of the '<em>Auth Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD___COMPUTE_LEVEL = 0;

	/**
	 * The number of operations of the '<em>Auth Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_METHOD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.PhaseImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Auth Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__AUTH_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__RISK = 3;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE___COMPUTE_LEVEL = 0;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.RegistrationImpl <em>Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.RegistrationImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getRegistration()
	 * @generated
	 */
	int REGISTRATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__NAME = PHASE__NAME;

	/**
	 * The feature id for the '<em><b>Auth Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__AUTH_METHODS = PHASE__AUTH_METHODS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__TYPE = PHASE__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__RISK = PHASE__RISK;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__CREDENTIALS = PHASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_FEATURE_COUNT = PHASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION___COMPUTE_LEVEL = PHASE___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.RecoveryImpl <em>Recovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.RecoveryImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getRecovery()
	 * @generated
	 */
	int RECOVERY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__NAME = PHASE__NAME;

	/**
	 * The feature id for the '<em><b>Auth Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__AUTH_METHODS = PHASE__AUTH_METHODS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__TYPE = PHASE__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__RISK = PHASE__RISK;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__PROTOCOL = PHASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__AUTHENTICATOR = PHASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_FEATURE_COUNT = PHASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY___COMPUTE_LEVEL = PHASE___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Recovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.LoginImpl <em>Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.LoginImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getLogin()
	 * @generated
	 */
	int LOGIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__NAME = PHASE__NAME;

	/**
	 * The feature id for the '<em><b>Auth Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__AUTH_METHODS = PHASE__AUTH_METHODS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__TYPE = PHASE__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__RISK = PHASE__RISK;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__SESSION = PHASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FEATURE_COUNT = PHASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN___COMPUTE_LEVEL = PHASE___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.ResetImpl <em>Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.ResetImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getReset()
	 * @generated
	 */
	int RESET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__NAME = PHASE__NAME;

	/**
	 * The feature id for the '<em><b>Auth Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__AUTH_METHODS = PHASE__AUTH_METHODS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__TYPE = PHASE__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__RISK = PHASE__RISK;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__AUTHENTICATOR = PHASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_FEATURE_COUNT = PHASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET___COMPUTE_LEVEL = PHASE___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.AppImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getApp()
	 * @generated
	 */
	int APP = 5;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__PHASES = 0;

	/**
	 * The feature id for the '<em><b>Authenticators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__AUTHENTICATORS = 1;

	/**
	 * The feature id for the '<em><b>Auth Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__AUTH_METHODS = 2;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__RISKS = 3;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__REGISTRATION = 4;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.CredentialImpl <em>Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.CredentialImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getCredential()
	 * @generated
	 */
	int CREDENTIAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Verifmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__VERIFMETHOD = 3;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__RISK = 4;

	/**
	 * The number of structural features of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.AuthenticatorImpl <em>Authenticator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.AuthenticatorImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getAuthenticator()
	 * @generated
	 */
	int AUTHENTICATOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__RISK = 2;

	/**
	 * The number of structural features of the '<em>Authenticator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR___COMPUTE_LEVEL = 0;

	/**
	 * The number of operations of the '<em>Authenticator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.VerifMethodImpl <em>Verif Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.VerifMethodImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getVerifMethod()
	 * @generated
	 */
	int VERIF_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIF_METHOD__VALIDITY = 0;

	/**
	 * The feature id for the '<em><b>Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIF_METHOD__UNIQUENESS = 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIF_METHOD__BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIF_METHOD__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Verif Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIF_METHOD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Verif Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIF_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.MFAImpl <em>MFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.MFAImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getMFA()
	 * @generated
	 */
	int MFA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__NAME = AUTH_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Authenticators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__AUTHENTICATORS = AUTH_METHOD__AUTHENTICATORS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__TYPE = AUTH_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__RISK = AUTH_METHOD__RISK;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__VALIDATION = AUTH_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA__CORRELATION = AUTH_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA_FEATURE_COUNT = AUTH_METHOD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA___COMPUTE_LEVEL = AUTH_METHOD___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>MFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFA_OPERATION_COUNT = AUTH_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.SFAImpl <em>SFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.SFAImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getSFA()
	 * @generated
	 */
	int SFA = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA__NAME = AUTH_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Authenticators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA__AUTHENTICATORS = AUTH_METHOD__AUTHENTICATORS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA__TYPE = AUTH_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA__RISK = AUTH_METHOD__RISK;

	/**
	 * The number of structural features of the '<em>SFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA_FEATURE_COUNT = AUTH_METHOD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA___COMPUTE_LEVEL = AUTH_METHOD___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>SFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFA_OPERATION_COUNT = AUTH_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.KnowledgeImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__NAME = AUTHENTICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__TYPE = AUTHENTICATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__RISK = AUTHENTICATOR__RISK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__VALUE = AUTHENTICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limited Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__LIMITED_ATTEMPTS = AUTHENTICATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Autofilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__AUTOFILLED = AUTHENTICATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_FEATURE_COUNT = AUTHENTICATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE___COMPUTE_LEVEL = AUTHENTICATOR___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_OPERATION_COUNT = AUTHENTICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.PossessionImpl <em>Possession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.PossessionImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPossession()
	 * @generated
	 */
	int POSSESSION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__NAME = AUTHENTICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__TYPE = AUTHENTICATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__RISK = AUTHENTICATOR__RISK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__VALUE = AUTHENTICATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Possession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_FEATURE_COUNT = AUTHENTICATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION___COMPUTE_LEVEL = AUTHENTICATOR___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Possession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_OPERATION_COUNT = AUTHENTICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.BiometricsImpl <em>Biometrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.BiometricsImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getBiometrics()
	 * @generated
	 */
	int BIOMETRICS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS__NAME = AUTHENTICATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS__TYPE = AUTHENTICATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS__RISK = AUTHENTICATOR__RISK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS__VALUE = AUTHENTICATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Biometrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS_FEATURE_COUNT = AUTHENTICATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS___COMPUTE_LEVEL = AUTHENTICATOR___COMPUTE_LEVEL;

	/**
	 * The number of operations of the '<em>Biometrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRICS_OPERATION_COUNT = AUTHENTICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.impl.RiskImpl
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 15;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__INFORMATION = 3;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lightweightDSL.LEVEL <em>LEVEL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.LEVEL
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getLEVEL()
	 * @generated
	 */
	int LEVEL = 16;

	/**
	 * The meta object id for the '{@link lightweightDSL.CredTYPE <em>Cred TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.CredTYPE
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getCredTYPE()
	 * @generated
	 */
	int CRED_TYPE = 17;

	/**
	 * The meta object id for the '{@link lightweightDSL.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.Protocol
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 18;

	/**
	 * The meta object id for the '{@link lightweightDSL.ValidationType <em>Validation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.ValidationType
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getValidationType()
	 * @generated
	 */
	int VALIDATION_TYPE = 19;

	/**
	 * The meta object id for the '{@link lightweightDSL.BVALUE <em>BVALUE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.BVALUE
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getBVALUE()
	 * @generated
	 */
	int BVALUE = 20;

	/**
	 * The meta object id for the '{@link lightweightDSL.PROVIDER <em>PROVIDER</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.PROVIDER
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPROVIDER()
	 * @generated
	 */
	int PROVIDER = 21;

	/**
	 * The meta object id for the '{@link lightweightDSL.KVALUE <em>KVALUE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.KVALUE
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getKVALUE()
	 * @generated
	 */
	int KVALUE = 22;

	/**
	 * The meta object id for the '{@link lightweightDSL.PVALUE <em>PVALUE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightweightDSL.PVALUE
	 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPVALUE()
	 * @generated
	 */
	int PVALUE = 23;

	/**
	 * Returns the meta object for class '{@link lightweightDSL.AuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth Method</em>'.
	 * @see lightweightDSL.AuthMethod
	 * @generated
	 */
	EClass getAuthMethod();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.AuthMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lightweightDSL.AuthMethod#getName()
	 * @see #getAuthMethod()
	 * @generated
	 */
	EAttribute getAuthMethod_Name();

	/**
	 * Returns the meta object for the reference list '{@link lightweightDSL.AuthMethod#getAuthenticators <em>Authenticators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authenticators</em>'.
	 * @see lightweightDSL.AuthMethod#getAuthenticators()
	 * @see #getAuthMethod()
	 * @generated
	 */
	EReference getAuthMethod_Authenticators();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.AuthMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lightweightDSL.AuthMethod#getType()
	 * @see #getAuthMethod()
	 * @generated
	 */
	EAttribute getAuthMethod_Type();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.AuthMethod#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk</em>'.
	 * @see lightweightDSL.AuthMethod#getRisk()
	 * @see #getAuthMethod()
	 * @generated
	 */
	EReference getAuthMethod_Risk();

	/**
	 * Returns the meta object for the '{@link lightweightDSL.AuthMethod#computeLevel() <em>Compute Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Level</em>' operation.
	 * @see lightweightDSL.AuthMethod#computeLevel()
	 * @generated
	 */
	EOperation getAuthMethod__ComputeLevel();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Registration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration</em>'.
	 * @see lightweightDSL.Registration
	 * @generated
	 */
	EClass getRegistration();

	/**
	 * Returns the meta object for the containment reference list '{@link lightweightDSL.Registration#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credentials</em>'.
	 * @see lightweightDSL.Registration#getCredentials()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_Credentials();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Recovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery</em>'.
	 * @see lightweightDSL.Recovery
	 * @generated
	 */
	EClass getRecovery();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Recovery#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see lightweightDSL.Recovery#getProtocol()
	 * @see #getRecovery()
	 * @generated
	 */
	EAttribute getRecovery_Protocol();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.Recovery#getAuthenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authenticator</em>'.
	 * @see lightweightDSL.Recovery#getAuthenticator()
	 * @see #getRecovery()
	 * @generated
	 */
	EReference getRecovery_Authenticator();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Login <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login</em>'.
	 * @see lightweightDSL.Login
	 * @generated
	 */
	EClass getLogin();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Login#isSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session</em>'.
	 * @see lightweightDSL.Login#isSession()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_Session();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset</em>'.
	 * @see lightweightDSL.Reset
	 * @generated
	 */
	EClass getReset();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.Reset#getAuthenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authenticator</em>'.
	 * @see lightweightDSL.Reset#getAuthenticator()
	 * @see #getReset()
	 * @generated
	 */
	EReference getReset_Authenticator();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see lightweightDSL.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference list '{@link lightweightDSL.App#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see lightweightDSL.App#getPhases()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Phases();

	/**
	 * Returns the meta object for the containment reference list '{@link lightweightDSL.App#getAuthenticators <em>Authenticators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authenticators</em>'.
	 * @see lightweightDSL.App#getAuthenticators()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Authenticators();

	/**
	 * Returns the meta object for the containment reference list '{@link lightweightDSL.App#getAuthMethods <em>Auth Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auth Methods</em>'.
	 * @see lightweightDSL.App#getAuthMethods()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_AuthMethods();

	/**
	 * Returns the meta object for the reference list '{@link lightweightDSL.App#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Risks</em>'.
	 * @see lightweightDSL.App#getRisks()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Risks();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.App#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registration</em>'.
	 * @see lightweightDSL.App#getRegistration()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Registration();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see lightweightDSL.Credential
	 * @generated
	 */
	EClass getCredential();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Credential#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lightweightDSL.Credential#getName()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Name();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Credential#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see lightweightDSL.Credential#getProvider()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Provider();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Credential#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lightweightDSL.Credential#getType()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Type();

	/**
	 * Returns the meta object for the containment reference '{@link lightweightDSL.Credential#getVerifmethod <em>Verifmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verifmethod</em>'.
	 * @see lightweightDSL.Credential#getVerifmethod()
	 * @see #getCredential()
	 * @generated
	 */
	EReference getCredential_Verifmethod();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.Credential#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk</em>'.
	 * @see lightweightDSL.Credential#getRisk()
	 * @see #getCredential()
	 * @generated
	 */
	EReference getCredential_Risk();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see lightweightDSL.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Phase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lightweightDSL.Phase#getName()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Name();

	/**
	 * Returns the meta object for the reference list '{@link lightweightDSL.Phase#getAuthMethods <em>Auth Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auth Methods</em>'.
	 * @see lightweightDSL.Phase#getAuthMethods()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_AuthMethods();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Phase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lightweightDSL.Phase#getType()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Type();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.Phase#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk</em>'.
	 * @see lightweightDSL.Phase#getRisk()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Risk();

	/**
	 * Returns the meta object for the '{@link lightweightDSL.Phase#computeLevel() <em>Compute Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Level</em>' operation.
	 * @see lightweightDSL.Phase#computeLevel()
	 * @generated
	 */
	EOperation getPhase__ComputeLevel();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Authenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticator</em>'.
	 * @see lightweightDSL.Authenticator
	 * @generated
	 */
	EClass getAuthenticator();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Authenticator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lightweightDSL.Authenticator#getName()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_Name();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Authenticator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lightweightDSL.Authenticator#getType()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_Type();

	/**
	 * Returns the meta object for the reference '{@link lightweightDSL.Authenticator#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk</em>'.
	 * @see lightweightDSL.Authenticator#getRisk()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EReference getAuthenticator_Risk();

	/**
	 * Returns the meta object for the '{@link lightweightDSL.Authenticator#computeLevel() <em>Compute Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Level</em>' operation.
	 * @see lightweightDSL.Authenticator#computeLevel()
	 * @generated
	 */
	EOperation getAuthenticator__ComputeLevel();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.VerifMethod <em>Verif Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verif Method</em>'.
	 * @see lightweightDSL.VerifMethod
	 * @generated
	 */
	EClass getVerifMethod();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.VerifMethod#isValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see lightweightDSL.VerifMethod#isValidity()
	 * @see #getVerifMethod()
	 * @generated
	 */
	EAttribute getVerifMethod_Validity();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.VerifMethod#isUniqueness <em>Uniqueness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueness</em>'.
	 * @see lightweightDSL.VerifMethod#isUniqueness()
	 * @see #getVerifMethod()
	 * @generated
	 */
	EAttribute getVerifMethod_Uniqueness();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.VerifMethod#isBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bindings</em>'.
	 * @see lightweightDSL.VerifMethod#isBindings()
	 * @see #getVerifMethod()
	 * @generated
	 */
	EAttribute getVerifMethod_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.VerifMethod#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see lightweightDSL.VerifMethod#getLevel()
	 * @see #getVerifMethod()
	 * @generated
	 */
	EAttribute getVerifMethod_Level();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.MFA <em>MFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFA</em>'.
	 * @see lightweightDSL.MFA
	 * @generated
	 */
	EClass getMFA();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.MFA#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation</em>'.
	 * @see lightweightDSL.MFA#getValidation()
	 * @see #getMFA()
	 * @generated
	 */
	EAttribute getMFA_Validation();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.MFA#isCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation</em>'.
	 * @see lightweightDSL.MFA#isCorrelation()
	 * @see #getMFA()
	 * @generated
	 */
	EAttribute getMFA_Correlation();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.SFA <em>SFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFA</em>'.
	 * @see lightweightDSL.SFA
	 * @generated
	 */
	EClass getSFA();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge</em>'.
	 * @see lightweightDSL.Knowledge
	 * @generated
	 */
	EClass getKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Knowledge#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lightweightDSL.Knowledge#getValue()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_Value();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Knowledge#isLimitedAttempts <em>Limited Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limited Attempts</em>'.
	 * @see lightweightDSL.Knowledge#isLimitedAttempts()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_LimitedAttempts();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Knowledge#isAutofilled <em>Autofilled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autofilled</em>'.
	 * @see lightweightDSL.Knowledge#isAutofilled()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_Autofilled();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Possession <em>Possession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possession</em>'.
	 * @see lightweightDSL.Possession
	 * @generated
	 */
	EClass getPossession();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Possession#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lightweightDSL.Possession#getValue()
	 * @see #getPossession()
	 * @generated
	 */
	EAttribute getPossession_Value();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Biometrics <em>Biometrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biometrics</em>'.
	 * @see lightweightDSL.Biometrics
	 * @generated
	 */
	EClass getBiometrics();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Biometrics#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lightweightDSL.Biometrics#getValue()
	 * @see #getBiometrics()
	 * @generated
	 */
	EAttribute getBiometrics_Value();

	/**
	 * Returns the meta object for class '{@link lightweightDSL.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see lightweightDSL.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Risk#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see lightweightDSL.Risk#getInstance()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Instance();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Risk#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lightweightDSL.Risk#getValue()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Value();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Risk#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see lightweightDSL.Risk#getMessage()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Message();

	/**
	 * Returns the meta object for the attribute '{@link lightweightDSL.Risk#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see lightweightDSL.Risk#getInformation()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Information();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.LEVEL <em>LEVEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LEVEL</em>'.
	 * @see lightweightDSL.LEVEL
	 * @generated
	 */
	EEnum getLEVEL();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.CredTYPE <em>Cred TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cred TYPE</em>'.
	 * @see lightweightDSL.CredTYPE
	 * @generated
	 */
	EEnum getCredTYPE();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see lightweightDSL.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.ValidationType <em>Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Type</em>'.
	 * @see lightweightDSL.ValidationType
	 * @generated
	 */
	EEnum getValidationType();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.BVALUE <em>BVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BVALUE</em>'.
	 * @see lightweightDSL.BVALUE
	 * @generated
	 */
	EEnum getBVALUE();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.PROVIDER <em>PROVIDER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PROVIDER</em>'.
	 * @see lightweightDSL.PROVIDER
	 * @generated
	 */
	EEnum getPROVIDER();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.KVALUE <em>KVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KVALUE</em>'.
	 * @see lightweightDSL.KVALUE
	 * @generated
	 */
	EEnum getKVALUE();

	/**
	 * Returns the meta object for enum '{@link lightweightDSL.PVALUE <em>PVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PVALUE</em>'.
	 * @see lightweightDSL.PVALUE
	 * @generated
	 */
	EEnum getPVALUE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LightweightDSLFactory getLightweightDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.AuthMethodImpl <em>Auth Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.AuthMethodImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getAuthMethod()
		 * @generated
		 */
		EClass AUTH_METHOD = eINSTANCE.getAuthMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_METHOD__NAME = eINSTANCE.getAuthMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Authenticators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTH_METHOD__AUTHENTICATORS = eINSTANCE.getAuthMethod_Authenticators();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_METHOD__TYPE = eINSTANCE.getAuthMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTH_METHOD__RISK = eINSTANCE.getAuthMethod_Risk();

		/**
		 * The meta object literal for the '<em><b>Compute Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTH_METHOD___COMPUTE_LEVEL = eINSTANCE.getAuthMethod__ComputeLevel();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.RegistrationImpl <em>Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.RegistrationImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getRegistration()
		 * @generated
		 */
		EClass REGISTRATION = eINSTANCE.getRegistration();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__CREDENTIALS = eINSTANCE.getRegistration_Credentials();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.RecoveryImpl <em>Recovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.RecoveryImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getRecovery()
		 * @generated
		 */
		EClass RECOVERY = eINSTANCE.getRecovery();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOVERY__PROTOCOL = eINSTANCE.getRecovery_Protocol();

		/**
		 * The meta object literal for the '<em><b>Authenticator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY__AUTHENTICATOR = eINSTANCE.getRecovery_Authenticator();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.LoginImpl <em>Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.LoginImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getLogin()
		 * @generated
		 */
		EClass LOGIN = eINSTANCE.getLogin();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__SESSION = eINSTANCE.getLogin_Session();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.ResetImpl <em>Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.ResetImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getReset()
		 * @generated
		 */
		EClass RESET = eINSTANCE.getReset();

		/**
		 * The meta object literal for the '<em><b>Authenticator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET__AUTHENTICATOR = eINSTANCE.getReset_Authenticator();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.AppImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__PHASES = eINSTANCE.getApp_Phases();

		/**
		 * The meta object literal for the '<em><b>Authenticators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__AUTHENTICATORS = eINSTANCE.getApp_Authenticators();

		/**
		 * The meta object literal for the '<em><b>Auth Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__AUTH_METHODS = eINSTANCE.getApp_AuthMethods();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__RISKS = eINSTANCE.getApp_Risks();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__REGISTRATION = eINSTANCE.getApp_Registration();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.CredentialImpl <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.CredentialImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getCredential()
		 * @generated
		 */
		EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__NAME = eINSTANCE.getCredential_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__PROVIDER = eINSTANCE.getCredential_Provider();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__TYPE = eINSTANCE.getCredential_Type();

		/**
		 * The meta object literal for the '<em><b>Verifmethod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDENTIAL__VERIFMETHOD = eINSTANCE.getCredential_Verifmethod();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDENTIAL__RISK = eINSTANCE.getCredential_Risk();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.PhaseImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__NAME = eINSTANCE.getPhase_Name();

		/**
		 * The meta object literal for the '<em><b>Auth Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__AUTH_METHODS = eINSTANCE.getPhase_AuthMethods();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__TYPE = eINSTANCE.getPhase_Type();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__RISK = eINSTANCE.getPhase_Risk();

		/**
		 * The meta object literal for the '<em><b>Compute Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PHASE___COMPUTE_LEVEL = eINSTANCE.getPhase__ComputeLevel();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.AuthenticatorImpl <em>Authenticator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.AuthenticatorImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getAuthenticator()
		 * @generated
		 */
		EClass AUTHENTICATOR = eINSTANCE.getAuthenticator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__NAME = eINSTANCE.getAuthenticator_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__TYPE = eINSTANCE.getAuthenticator_Type();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATOR__RISK = eINSTANCE.getAuthenticator_Risk();

		/**
		 * The meta object literal for the '<em><b>Compute Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATOR___COMPUTE_LEVEL = eINSTANCE.getAuthenticator__ComputeLevel();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.VerifMethodImpl <em>Verif Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.VerifMethodImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getVerifMethod()
		 * @generated
		 */
		EClass VERIF_METHOD = eINSTANCE.getVerifMethod();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIF_METHOD__VALIDITY = eINSTANCE.getVerifMethod_Validity();

		/**
		 * The meta object literal for the '<em><b>Uniqueness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIF_METHOD__UNIQUENESS = eINSTANCE.getVerifMethod_Uniqueness();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIF_METHOD__BINDINGS = eINSTANCE.getVerifMethod_Bindings();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIF_METHOD__LEVEL = eINSTANCE.getVerifMethod_Level();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.MFAImpl <em>MFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.MFAImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getMFA()
		 * @generated
		 */
		EClass MFA = eINSTANCE.getMFA();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFA__VALIDATION = eINSTANCE.getMFA_Validation();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFA__CORRELATION = eINSTANCE.getMFA_Correlation();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.SFAImpl <em>SFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.SFAImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getSFA()
		 * @generated
		 */
		EClass SFA = eINSTANCE.getSFA();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.KnowledgeImpl <em>Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.KnowledgeImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getKnowledge()
		 * @generated
		 */
		EClass KNOWLEDGE = eINSTANCE.getKnowledge();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__VALUE = eINSTANCE.getKnowledge_Value();

		/**
		 * The meta object literal for the '<em><b>Limited Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__LIMITED_ATTEMPTS = eINSTANCE.getKnowledge_LimitedAttempts();

		/**
		 * The meta object literal for the '<em><b>Autofilled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__AUTOFILLED = eINSTANCE.getKnowledge_Autofilled();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.PossessionImpl <em>Possession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.PossessionImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPossession()
		 * @generated
		 */
		EClass POSSESSION = eINSTANCE.getPossession();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSESSION__VALUE = eINSTANCE.getPossession_Value();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.BiometricsImpl <em>Biometrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.BiometricsImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getBiometrics()
		 * @generated
		 */
		EClass BIOMETRICS = eINSTANCE.getBiometrics();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRICS__VALUE = eINSTANCE.getBiometrics_Value();

		/**
		 * The meta object literal for the '{@link lightweightDSL.impl.RiskImpl <em>Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.impl.RiskImpl
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getRisk()
		 * @generated
		 */
		EClass RISK = eINSTANCE.getRisk();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__INSTANCE = eINSTANCE.getRisk_Instance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__VALUE = eINSTANCE.getRisk_Value();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__MESSAGE = eINSTANCE.getRisk_Message();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__INFORMATION = eINSTANCE.getRisk_Information();

		/**
		 * The meta object literal for the '{@link lightweightDSL.LEVEL <em>LEVEL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.LEVEL
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getLEVEL()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLEVEL();

		/**
		 * The meta object literal for the '{@link lightweightDSL.CredTYPE <em>Cred TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.CredTYPE
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getCredTYPE()
		 * @generated
		 */
		EEnum CRED_TYPE = eINSTANCE.getCredTYPE();

		/**
		 * The meta object literal for the '{@link lightweightDSL.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.Protocol
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link lightweightDSL.ValidationType <em>Validation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.ValidationType
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getValidationType()
		 * @generated
		 */
		EEnum VALIDATION_TYPE = eINSTANCE.getValidationType();

		/**
		 * The meta object literal for the '{@link lightweightDSL.BVALUE <em>BVALUE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.BVALUE
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getBVALUE()
		 * @generated
		 */
		EEnum BVALUE = eINSTANCE.getBVALUE();

		/**
		 * The meta object literal for the '{@link lightweightDSL.PROVIDER <em>PROVIDER</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.PROVIDER
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPROVIDER()
		 * @generated
		 */
		EEnum PROVIDER = eINSTANCE.getPROVIDER();

		/**
		 * The meta object literal for the '{@link lightweightDSL.KVALUE <em>KVALUE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.KVALUE
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getKVALUE()
		 * @generated
		 */
		EEnum KVALUE = eINSTANCE.getKVALUE();

		/**
		 * The meta object literal for the '{@link lightweightDSL.PVALUE <em>PVALUE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightweightDSL.PVALUE
		 * @see lightweightDSL.impl.LightweightDSLPackageImpl#getPVALUE()
		 * @generated
		 */
		EEnum PVALUE = eINSTANCE.getPVALUE();

	}

} //LightweightDSLPackage
