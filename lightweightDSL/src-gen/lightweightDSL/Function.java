/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Function#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.Function#getDescription <em>Description</em>}</li>
 *   <li>{@link lightweightDSL.Function#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link lightweightDSL.Function#getGuard <em>Guard</em>}</li>
 *   <li>{@link lightweightDSL.Function#getCredential <em>Credential</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
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
	 * @see lightweightDSL.LightweightDSLPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lightweightDSL.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see lightweightDSL.LightweightDSLPackage#getFunction_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link lightweightDSL.Function#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see lightweightDSL.LightweightDSLPackage#getFunction_SecurityLevel()
	 * @model
	 * @generated
	 */
	double getSecurityLevel();

	/**
	 * Sets the value of the '{@link lightweightDSL.Function#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(double value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(AuthMethod)
	 * @see lightweightDSL.LightweightDSLPackage#getFunction_Guard()
	 * @model
	 * @generated
	 */
	AuthMethod getGuard();

	/**
	 * Sets the value of the '{@link lightweightDSL.Function#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(AuthMethod value);

	/**
	 * Returns the value of the '<em><b>Credential</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credential</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential</em>' reference.
	 * @see #setCredential(Credential)
	 * @see lightweightDSL.LightweightDSLPackage#getFunction_Credential()
	 * @model
	 * @generated
	 */
	Credential getCredential();

	/**
	 * Sets the value of the '{@link lightweightDSL.Function#getCredential <em>Credential</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' reference.
	 * @see #getCredential()
	 * @generated
	 */
	void setCredential(Credential value);

} // Function
