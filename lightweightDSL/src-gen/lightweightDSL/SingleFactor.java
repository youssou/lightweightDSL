/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.SingleFactor#isLimitedAttempts <em>Limited Attempts</em>}</li>
 *   <li>{@link lightweightDSL.SingleFactor#getSecret <em>Secret</em>}</li>
 *   <li>{@link lightweightDSL.SingleFactor#isAutofill <em>Autofill</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getSingleFactor()
 * @model
 * @generated
 */
public interface SingleFactor extends AuthMethod {
	/**
	 * Returns the value of the '<em><b>Limited Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limited Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limited Attempts</em>' attribute.
	 * @see #setLimitedAttempts(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getSingleFactor_LimitedAttempts()
	 * @model
	 * @generated
	 */
	boolean isLimitedAttempts();

	/**
	 * Sets the value of the '{@link lightweightDSL.SingleFactor#isLimitedAttempts <em>Limited Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Attempts</em>' attribute.
	 * @see #isLimitedAttempts()
	 * @generated
	 */
	void setLimitedAttempts(boolean value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' reference.
	 * @see #setSecret(Secret)
	 * @see lightweightDSL.LightweightDSLPackage#getSingleFactor_Secret()
	 * @model required="true"
	 * @generated
	 */
	Secret getSecret();

	/**
	 * Sets the value of the '{@link lightweightDSL.SingleFactor#getSecret <em>Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' reference.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(Secret value);

	/**
	 * Returns the value of the '<em><b>Autofill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autofill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofill</em>' attribute.
	 * @see #setAutofill(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getSingleFactor_Autofill()
	 * @model
	 * @generated
	 */
	boolean isAutofill();

	/**
	 * Sets the value of the '{@link lightweightDSL.SingleFactor#isAutofill <em>Autofill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofill</em>' attribute.
	 * @see #isAutofill()
	 * @generated
	 */
	void setAutofill(boolean value);

} // SingleFactor
