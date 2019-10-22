/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage
 * @generated
 */
public interface LightweightDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LightweightDSLFactory eINSTANCE = lightweightDSL.impl.LightweightDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Registration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration</em>'.
	 * @generated
	 */
	Registration createRegistration();

	/**
	 * Returns a new object of class '<em>Recovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recovery</em>'.
	 * @generated
	 */
	Recovery createRecovery();

	/**
	 * Returns a new object of class '<em>Login</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login</em>'.
	 * @generated
	 */
	Login createLogin();

	/**
	 * Returns a new object of class '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset</em>'.
	 * @generated
	 */
	Reset createReset();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	App createApp();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Verif Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verif Method</em>'.
	 * @generated
	 */
	VerifMethod createVerifMethod();

	/**
	 * Returns a new object of class '<em>MFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MFA</em>'.
	 * @generated
	 */
	MFA createMFA();

	/**
	 * Returns a new object of class '<em>SFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFA</em>'.
	 * @generated
	 */
	SFA createSFA();

	/**
	 * Returns a new object of class '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge</em>'.
	 * @generated
	 */
	Knowledge createKnowledge();

	/**
	 * Returns a new object of class '<em>Possession</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possession</em>'.
	 * @generated
	 */
	Possession createPossession();

	/**
	 * Returns a new object of class '<em>Biometrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biometrics</em>'.
	 * @generated
	 */
	Biometrics createBiometrics();

	/**
	 * Returns a new object of class '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk</em>'.
	 * @generated
	 */
	Risk createRisk();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LightweightDSLPackage getLightweightDSLPackage();

} //LightweightDSLFactory
