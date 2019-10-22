/**
 */
package lightweightDSL.util;

import lightweightDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage
 * @generated
 */
public class LightweightDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LightweightDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightweightDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LightweightDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightweightDSLSwitch<Adapter> modelSwitch = new LightweightDSLSwitch<Adapter>() {
		@Override
		public Adapter caseAuthMethod(AuthMethod object) {
			return createAuthMethodAdapter();
		}

		@Override
		public Adapter caseRegistration(Registration object) {
			return createRegistrationAdapter();
		}

		@Override
		public Adapter caseRecovery(Recovery object) {
			return createRecoveryAdapter();
		}

		@Override
		public Adapter caseLogin(Login object) {
			return createLoginAdapter();
		}

		@Override
		public Adapter caseReset(Reset object) {
			return createResetAdapter();
		}

		@Override
		public Adapter caseApp(App object) {
			return createAppAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter casePhase(Phase object) {
			return createPhaseAdapter();
		}

		@Override
		public Adapter caseAuthenticator(Authenticator object) {
			return createAuthenticatorAdapter();
		}

		@Override
		public Adapter caseVerifMethod(VerifMethod object) {
			return createVerifMethodAdapter();
		}

		@Override
		public Adapter caseMFA(MFA object) {
			return createMFAAdapter();
		}

		@Override
		public Adapter caseSFA(SFA object) {
			return createSFAAdapter();
		}

		@Override
		public Adapter caseKnowledge(Knowledge object) {
			return createKnowledgeAdapter();
		}

		@Override
		public Adapter casePossession(Possession object) {
			return createPossessionAdapter();
		}

		@Override
		public Adapter caseBiometrics(Biometrics object) {
			return createBiometricsAdapter();
		}

		@Override
		public Adapter caseRisk(Risk object) {
			return createRiskAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.AuthMethod <em>Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.AuthMethod
	 * @generated
	 */
	public Adapter createAuthMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Registration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Registration
	 * @generated
	 */
	public Adapter createRegistrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Recovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Recovery
	 * @generated
	 */
	public Adapter createRecoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Login <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Login
	 * @generated
	 */
	public Adapter createLoginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Reset
	 * @generated
	 */
	public Adapter createResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.App
	 * @generated
	 */
	public Adapter createAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Authenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Authenticator
	 * @generated
	 */
	public Adapter createAuthenticatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.VerifMethod <em>Verif Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.VerifMethod
	 * @generated
	 */
	public Adapter createVerifMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.MFA <em>MFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.MFA
	 * @generated
	 */
	public Adapter createMFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.SFA <em>SFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.SFA
	 * @generated
	 */
	public Adapter createSFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Knowledge
	 * @generated
	 */
	public Adapter createKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Possession <em>Possession</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Possession
	 * @generated
	 */
	public Adapter createPossessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Biometrics <em>Biometrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Biometrics
	 * @generated
	 */
	public Adapter createBiometricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lightweightDSL.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lightweightDSL.Risk
	 * @generated
	 */
	public Adapter createRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LightweightDSLAdapterFactory
