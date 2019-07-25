/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Registration#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getRegistration()
 * @model
 * @generated
 */
public interface Registration extends Phase {
	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Credential}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getRegistration_Credentials()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Credential> getCredentials();

} // Registration
