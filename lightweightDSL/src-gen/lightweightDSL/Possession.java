/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possession</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Possession#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getPossession()
 * @model
 * @generated
 */
public interface Possession extends Authenticator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.PVALUE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.PVALUE
	 * @see #setValue(PVALUE)
	 * @see lightweightDSL.LightweightDSLPackage#getPossession_Value()
	 * @model
	 * @generated
	 */
	PVALUE getValue();

	/**
	 * Sets the value of the '{@link lightweightDSL.Possession#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.PVALUE
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PVALUE value);

} // Possession
