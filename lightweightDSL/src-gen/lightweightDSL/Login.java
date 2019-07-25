/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Login#isSession <em>Session</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getLogin()
 * @model
 * @generated
 */
public interface Login extends Phase {
	/**
	 * Returns the value of the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' attribute.
	 * @see #setSession(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getLogin_Session()
	 * @model
	 * @generated
	 */
	boolean isSession();

	/**
	 * Sets the value of the '{@link lightweightDSL.Login#isSession <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' attribute.
	 * @see #isSession()
	 * @generated
	 */
	void setSession(boolean value);

} // Login
