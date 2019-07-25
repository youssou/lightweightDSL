/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.MultiFactor#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link lightweightDSL.MultiFactor#isLimitedAttempts <em>Limited Attempts</em>}</li>
 *   <li>{@link lightweightDSL.MultiFactor#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getMultiFactor()
 * @model
 * @generated
 */
public interface MultiFactor extends AuthMethod {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' reference list.
	 * The list contents are of type {@link lightweightDSL.Secret}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secrets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getMultiFactor_Secrets()
	 * @model lower="2"
	 * @generated
	 */
	EList<Secret> getSecrets();

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
	 * @see lightweightDSL.LightweightDSLPackage#getMultiFactor_LimitedAttempts()
	 * @model
	 * @generated
	 */
	boolean isLimitedAttempts();

	/**
	 * Sets the value of the '{@link lightweightDSL.MultiFactor#isLimitedAttempts <em>Limited Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Attempts</em>' attribute.
	 * @see #isLimitedAttempts()
	 * @generated
	 */
	void setLimitedAttempts(boolean value);

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
	 * @see lightweightDSL.LightweightDSLPackage#getMultiFactor_Validation()
	 * @model
	 * @generated
	 */
	ValidationType getValidation();

	/**
	 * Sets the value of the '{@link lightweightDSL.MultiFactor#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' attribute.
	 * @see lightweightDSL.ValidationType
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(ValidationType value);

} // MultiFactor
