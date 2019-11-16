/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Knowledge#getValue <em>Value</em>}</li>
 *   <li>{@link lightweightDSL.Knowledge#isLimitedAttempts <em>Limited Attempts</em>}</li>
 *   <li>{@link lightweightDSL.Knowledge#isAutofilled <em>Autofilled</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getKnowledge()
 * @model
 * @generated
 */
public interface Knowledge extends Authenticator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.KVALUE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.KVALUE
	 * @see #setValue(KVALUE)
	 * @see lightweightDSL.LightweightDSLPackage#getKnowledge_Value()
	 * @model
	 * @generated
	 */
	KVALUE getValue();

	/**
	 * Sets the value of the '{@link lightweightDSL.Knowledge#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.KVALUE
	 * @see #getValue()
	 * @generated
	 */
	void setValue(KVALUE value);

	/**
	 * Returns the value of the '<em><b>Limited Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limited Attempts</em>' attribute.
	 * @see #setLimitedAttempts(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getKnowledge_LimitedAttempts()
	 * @model
	 * @generated
	 */
	boolean isLimitedAttempts();

	/**
	 * Sets the value of the '{@link lightweightDSL.Knowledge#isLimitedAttempts <em>Limited Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Attempts</em>' attribute.
	 * @see #isLimitedAttempts()
	 * @generated
	 */
	void setLimitedAttempts(boolean value);

	/**
	 * Returns the value of the '<em><b>Autofilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofilled</em>' attribute.
	 * @see #setAutofilled(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getKnowledge_Autofilled()
	 * @model
	 * @generated
	 */
	boolean isAutofilled();

	/**
	 * Sets the value of the '{@link lightweightDSL.Knowledge#isAutofilled <em>Autofilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofilled</em>' attribute.
	 * @see #isAutofilled()
	 * @generated
	 */
	void setAutofilled(boolean value);

} // Knowledge
