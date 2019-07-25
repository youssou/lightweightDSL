/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authenticator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Authenticator#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.Authenticator#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getAuthenticator()
 * @model abstract="true"
 * @generated
 */
public interface Authenticator extends EObject {
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
	 * @see lightweightDSL.LightweightDSLPackage#getAuthenticator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lightweightDSL.Authenticator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.LEVEL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see lightweightDSL.LEVEL
	 * @see #setLevel(LEVEL)
	 * @see lightweightDSL.LightweightDSLPackage#getAuthenticator_Level()
	 * @model
	 * @generated
	 */
	LEVEL getLevel();

	/**
	 * Sets the value of the '{@link lightweightDSL.Authenticator#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see lightweightDSL.LEVEL
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LEVEL value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LEVEL computeLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void newOperation2();

} // Authenticator
