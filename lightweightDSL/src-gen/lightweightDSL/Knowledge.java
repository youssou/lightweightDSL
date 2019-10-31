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
 *   <li>{@link lightweightDSL.Knowledge#getLimitedAttempts <em>Limited Attempts</em>}</li>
 *   <li>{@link lightweightDSL.Knowledge#getAutofilled <em>Autofilled</em>}</li>
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
	 * The literals are from the enumeration {@link lightweightDSL.Bool2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limited Attempts</em>' attribute.
	 * @see lightweightDSL.Bool2
	 * @see #setLimitedAttempts(Bool2)
	 * @see lightweightDSL.LightweightDSLPackage#getKnowledge_LimitedAttempts()
	 * @model
	 * @generated
	 */
	Bool2 getLimitedAttempts();

	/**
	 * Sets the value of the '{@link lightweightDSL.Knowledge#getLimitedAttempts <em>Limited Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Attempts</em>' attribute.
	 * @see lightweightDSL.Bool2
	 * @see #getLimitedAttempts()
	 * @generated
	 */
	void setLimitedAttempts(Bool2 value);

	/**
	 * Returns the value of the '<em><b>Autofilled</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.Bool2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofilled</em>' attribute.
	 * @see lightweightDSL.Bool2
	 * @see #setAutofilled(Bool2)
	 * @see lightweightDSL.LightweightDSLPackage#getKnowledge_Autofilled()
	 * @model
	 * @generated
	 */
	Bool2 getAutofilled();

	/**
	 * Sets the value of the '{@link lightweightDSL.Knowledge#getAutofilled <em>Autofilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofilled</em>' attribute.
	 * @see lightweightDSL.Bool2
	 * @see #getAutofilled()
	 * @generated
	 */
	void setAutofilled(Bool2 value);

} // Knowledge
