/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.Attribute#getProvider <em>Provider</em>}</li>
 *   <li>{@link lightweightDSL.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link lightweightDSL.Attribute#getVerifmethod <em>Verifmethod</em>}</li>
 *   <li>{@link lightweightDSL.Attribute#getRisk <em>Risk</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lightweightDSL.LightweightDSLPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lightweightDSL.Attribute#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see lightweightDSL.PROVIDER
	 * @see #setProvider(PROVIDER)
	 * @see lightweightDSL.LightweightDSLPackage#getAttribute_Provider()
	 * @model
	 * @generated
	 */
	PROVIDER getProvider();

	/**
	 * Sets the value of the '{@link lightweightDSL.Attribute#getProvider <em>Provider</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lightweightDSL.CredTYPE
	 * @see #setType(CredTYPE)
	 * @see lightweightDSL.LightweightDSLPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	CredTYPE getType();

	/**
	 * Sets the value of the '{@link lightweightDSL.Attribute#getType <em>Type</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifmethod</em>' containment reference.
	 * @see #setVerifmethod(VerifMethod)
	 * @see lightweightDSL.LightweightDSLPackage#getAttribute_Verifmethod()
	 * @model containment="true"
	 * @generated
	 */
	VerifMethod getVerifmethod();

	/**
	 * Sets the value of the '{@link lightweightDSL.Attribute#getVerifmethod <em>Verifmethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifmethod</em>' containment reference.
	 * @see #getVerifmethod()
	 * @generated
	 */
	void setVerifmethod(VerifMethod value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' reference.
	 * @see #setRisk(Risk)
	 * @see lightweightDSL.LightweightDSLPackage#getAttribute_Risk()
	 * @model
	 * @generated
	 */
	Risk getRisk();

	/**
	 * Sets the value of the '{@link lightweightDSL.Attribute#getRisk <em>Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' reference.
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(Risk value);

} // Attribute
