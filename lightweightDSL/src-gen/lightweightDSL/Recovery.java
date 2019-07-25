/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Recovery#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link lightweightDSL.Recovery#getAuthenticator <em>Authenticator</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getRecovery()
 * @model
 * @generated
 */
public interface Recovery extends Phase {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see lightweightDSL.Protocol
	 * @see #setProtocol(Protocol)
	 * @see lightweightDSL.LightweightDSLPackage#getRecovery_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link lightweightDSL.Recovery#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see lightweightDSL.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

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
	 * @see lightweightDSL.LightweightDSLPackage#getRecovery_Authenticator()
	 * @model
	 * @generated
	 */
	Authenticator getAuthenticator();

	/**
	 * Sets the value of the '{@link lightweightDSL.Recovery#getAuthenticator <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator</em>' reference.
	 * @see #getAuthenticator()
	 * @generated
	 */
	void setAuthenticator(Authenticator value);

} // Recovery
