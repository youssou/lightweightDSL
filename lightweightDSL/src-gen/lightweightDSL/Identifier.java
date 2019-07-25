/**
 */
package lightweightDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Identifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link lightweightDSL.Identifier#getVerifProtocol <em>Verif Protocol</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends Credential {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see lightweightDSL.Visibility
	 * @see #setVisibility(Visibility)
	 * @see lightweightDSL.LightweightDSLPackage#getIdentifier_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link lightweightDSL.Identifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see lightweightDSL.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Verif Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verif Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verif Protocol</em>' attribute.
	 * @see lightweightDSL.Protocol
	 * @see #setVerifProtocol(Protocol)
	 * @see lightweightDSL.LightweightDSLPackage#getIdentifier_VerifProtocol()
	 * @model
	 * @generated
	 */
	Protocol getVerifProtocol();

	/**
	 * Sets the value of the '{@link lightweightDSL.Identifier#getVerifProtocol <em>Verif Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verif Protocol</em>' attribute.
	 * @see lightweightDSL.Protocol
	 * @see #getVerifProtocol()
	 * @generated
	 */
	void setVerifProtocol(Protocol value);

} // Identifier
