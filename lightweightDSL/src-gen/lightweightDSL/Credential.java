/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Credential#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.Credential#getProvider <em>Provider</em>}</li>
 *   <li>{@link lightweightDSL.Credential#getType <em>Type</em>}</li>
 *   <li>{@link lightweightDSL.Credential#getVerifmethod <em>Verifmethod</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getCredential()
 * @model
 * @generated
 */
public interface Credential extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lightweightDSL.LightweightDSLPackage#getCredential_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lightweightDSL.Credential#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.PROVIDER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see lightweightDSL.PROVIDER
	 * @see #setProvider(PROVIDER)
	 * @see lightweightDSL.LightweightDSLPackage#getCredential_Provider()
	 * @model
	 * @generated
	 */
	PROVIDER getProvider();

	/**
	 * Sets the value of the '{@link lightweightDSL.Credential#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see lightweightDSL.PROVIDER
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(PROVIDER value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.CredTYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lightweightDSL.CredTYPE
	 * @see #setType(CredTYPE)
	 * @see lightweightDSL.LightweightDSLPackage#getCredential_Type()
	 * @model
	 * @generated
	 */
	CredTYPE getType();

	/**
	 * Sets the value of the '{@link lightweightDSL.Credential#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lightweightDSL.CredTYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(CredTYPE value);

	/**
	 * Returns the value of the '<em><b>Verifmethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifmethod</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifmethod</em>' containment reference.
	 * @see #setVerifmethod(VerifMethod)
	 * @see lightweightDSL.LightweightDSLPackage#getCredential_Verifmethod()
	 * @model containment="true"
	 * @generated
	 */
	VerifMethod getVerifmethod();

	/**
	 * Sets the value of the '{@link lightweightDSL.Credential#getVerifmethod <em>Verifmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifmethod</em>' containment reference.
	 * @see #getVerifmethod()
	 * @generated
	 */
	void setVerifmethod(VerifMethod value);

} // Credential
