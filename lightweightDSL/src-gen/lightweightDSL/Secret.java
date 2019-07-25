/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Secret#getFactor <em>Factor</em>}</li>
 *   <li>{@link lightweightDSL.Secret#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link lightweightDSL.Secret#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getSecret()
 * @model
 * @generated
 */
public interface Secret extends Credential {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.Factor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see lightweightDSL.Factor
	 * @see #setFactor(Factor)
	 * @see lightweightDSL.LightweightDSLPackage#getSecret_Factor()
	 * @model
	 * @generated
	 */
	Factor getFactor();

	/**
	 * Sets the value of the '{@link lightweightDSL.Secret#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see lightweightDSL.Factor
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Factor value);

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #setSecurityLevel(double)
	 * @see lightweightDSL.LightweightDSLPackage#getSecret_SecurityLevel()
	 * @model
	 * @generated
	 */
	double getSecurityLevel();

	/**
	 * Sets the value of the '{@link lightweightDSL.Secret#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(double value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.FactorValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.FactorValue
	 * @see #setValue(FactorValue)
	 * @see lightweightDSL.LightweightDSLPackage#getSecret_Value()
	 * @model
	 * @generated
	 */
	FactorValue getValue();

	/**
	 * Sets the value of the '{@link lightweightDSL.Secret#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.FactorValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FactorValue value);

} // Secret
