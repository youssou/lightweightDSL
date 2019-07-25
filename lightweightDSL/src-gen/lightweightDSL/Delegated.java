/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Delegated#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getDelegated()
 * @model
 * @generated
 */
public interface Delegated extends AuthMethod {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Secret)
	 * @see lightweightDSL.LightweightDSLPackage#getDelegated_Token()
	 * @model required="true"
	 * @generated
	 */
	Secret getToken();

	/**
	 * Sets the value of the '{@link lightweightDSL.Delegated#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Secret value);

} // Delegated
