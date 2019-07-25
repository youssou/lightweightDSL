/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.App#getPhases <em>Phases</em>}</li>
 *   <li>{@link lightweightDSL.App#getAuthenticators <em>Authenticators</em>}</li>
 *   <li>{@link lightweightDSL.App#getAuthMethods <em>Auth Methods</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Phase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getApp_Phases()
	 * @model containment="true" lower="4"
	 * @generated
	 */
	EList<Phase> getPhases();

	/**
	 * Returns the value of the '<em><b>Authenticators</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Authenticator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticators</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getApp_Authenticators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Authenticator> getAuthenticators();

	/**
	 * Returns the value of the '<em><b>Auth Methods</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.AuthMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Methods</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getApp_AuthMethods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AuthMethod> getAuthMethods();

} // App
