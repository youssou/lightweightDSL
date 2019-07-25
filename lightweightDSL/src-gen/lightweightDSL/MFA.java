/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.MFA#getValidation <em>Validation</em>}</li>
 *   <li>{@link lightweightDSL.MFA#isCorrelation <em>Correlation</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getMFA()
 * @model
 * @generated
 */
public interface MFA extends AuthMethod {
	/**
	 * Returns the value of the '<em><b>Validation</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.ValidationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' attribute.
	 * @see lightweightDSL.ValidationType
	 * @see #setValidation(ValidationType)
	 * @see lightweightDSL.LightweightDSLPackage#getMFA_Validation()
	 * @model
	 * @generated
	 */
	ValidationType getValidation();

	/**
	 * Sets the value of the '{@link lightweightDSL.MFA#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' attribute.
	 * @see lightweightDSL.ValidationType
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(ValidationType value);

	/**
	 * Returns the value of the '<em><b>Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation</em>' attribute.
	 * @see #setCorrelation(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getMFA_Correlation()
	 * @model
	 * @generated
	 */
	boolean isCorrelation();

	/**
	 * Sets the value of the '{@link lightweightDSL.MFA#isCorrelation <em>Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation</em>' attribute.
	 * @see #isCorrelation()
	 * @generated
	 */
	void setCorrelation(boolean value);

} // MFA
