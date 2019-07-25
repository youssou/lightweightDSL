/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biometrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Biometrics#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getBiometrics()
 * @model
 * @generated
 */
public interface Biometrics extends Authenticator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.BVALUE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.BVALUE
	 * @see #setValue(BVALUE)
	 * @see lightweightDSL.LightweightDSLPackage#getBiometrics_Value()
	 * @model
	 * @generated
	 */
	BVALUE getValue();

	/**
	 * Sets the value of the '{@link lightweightDSL.Biometrics#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.BVALUE
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BVALUE value);

} // Biometrics
