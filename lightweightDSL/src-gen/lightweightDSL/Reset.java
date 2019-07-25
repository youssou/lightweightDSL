/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Reset#getAuthenticator <em>Authenticator</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getReset()
 * @model
 * @generated
 */
public interface Reset extends Phase {

	/**
	 * Returns the value of the '<em><b>Authenticator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticator</em>' reference.
	 * @see #setAuthenticator(Authenticator)
	 * @see lightweightDSL.LightweightDSLPackage#getReset_Authenticator()
	 * @model
	 * @generated
	 */
	Authenticator getAuthenticator();

	/**
	 * Sets the value of the '{@link lightweightDSL.Reset#getAuthenticator <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator</em>' reference.
	 * @see #getAuthenticator()
	 * @generated
	 */
	void setAuthenticator(Authenticator value);
} // Reset
