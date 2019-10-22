/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Risk#getInstance <em>Instance</em>}</li>
 *   <li>{@link lightweightDSL.Risk#getValue <em>Value</em>}</li>
 *   <li>{@link lightweightDSL.Risk#getMessage <em>Message</em>}</li>
 *   <li>{@link lightweightDSL.Risk#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getRisk()
 * @model
 * @generated
 */
public interface Risk extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see lightweightDSL.LightweightDSLPackage#getRisk_Instance()
	 * @model
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link lightweightDSL.Risk#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link lightweightDSL.LEVEL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.LEVEL
	 * @see #setValue(LEVEL)
	 * @see lightweightDSL.LightweightDSLPackage#getRisk_Value()
	 * @model
	 * @generated
	 */
	LEVEL getValue();

	/**
	 * Sets the value of the '{@link lightweightDSL.Risk#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see lightweightDSL.LEVEL
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LEVEL value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see lightweightDSL.LightweightDSLPackage#getRisk_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link lightweightDSL.Risk#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see lightweightDSL.LightweightDSLPackage#getRisk_Information()
	 * @model
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link lightweightDSL.Risk#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

} // Risk
