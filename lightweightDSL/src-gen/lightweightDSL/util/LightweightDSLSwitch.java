/**
 */
package lightweightDSL.util;

import lightweightDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage
 * @generated
 */
public class LightweightDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LightweightDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightweightDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = LightweightDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LightweightDSLPackage.AUTH_METHOD: {
			AuthMethod authMethod = (AuthMethod) theEObject;
			T result = caseAuthMethod(authMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.REGISTRATION: {
			Registration registration = (Registration) theEObject;
			T result = caseRegistration(registration);
			if (result == null)
				result = casePhase(registration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.RECOVERY: {
			Recovery recovery = (Recovery) theEObject;
			T result = caseRecovery(recovery);
			if (result == null)
				result = casePhase(recovery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.LOGIN: {
			Login login = (Login) theEObject;
			T result = caseLogin(login);
			if (result == null)
				result = casePhase(login);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.RESET: {
			Reset reset = (Reset) theEObject;
			T result = caseReset(reset);
			if (result == null)
				result = casePhase(reset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.APP: {
			App app = (App) theEObject;
			T result = caseApp(app);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.PHASE: {
			Phase phase = (Phase) theEObject;
			T result = casePhase(phase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.AUTHENTICATOR: {
			Authenticator authenticator = (Authenticator) theEObject;
			T result = caseAuthenticator(authenticator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.VERIF_METHOD: {
			VerifMethod verifMethod = (VerifMethod) theEObject;
			T result = caseVerifMethod(verifMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.MFA: {
			MFA mfa = (MFA) theEObject;
			T result = caseMFA(mfa);
			if (result == null)
				result = caseAuthMethod(mfa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.SFA: {
			SFA sfa = (SFA) theEObject;
			T result = caseSFA(sfa);
			if (result == null)
				result = caseAuthMethod(sfa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.KNOWLEDGE: {
			Knowledge knowledge = (Knowledge) theEObject;
			T result = caseKnowledge(knowledge);
			if (result == null)
				result = caseAuthenticator(knowledge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.POSSESSION: {
			Possession possession = (Possession) theEObject;
			T result = casePossession(possession);
			if (result == null)
				result = caseAuthenticator(possession);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.BIOMETRICS: {
			Biometrics biometrics = (Biometrics) theEObject;
			T result = caseBiometrics(biometrics);
			if (result == null)
				result = caseAuthenticator(biometrics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LightweightDSLPackage.RISK: {
			Risk risk = (Risk) theEObject;
			T result = caseRisk(risk);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auth Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auth Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthMethod(AuthMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistration(Registration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecovery(Recovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogin(Login object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReset(Reset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp(App object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhase(Phase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticator(Authenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verif Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verif Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifMethod(VerifMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFA(MFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFA(SFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledge(Knowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossession(Possession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biometrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biometrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiometrics(Biometrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisk(Risk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LightweightDSLSwitch
