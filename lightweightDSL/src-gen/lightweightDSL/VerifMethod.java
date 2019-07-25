/**
 */
package lightweightDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verif Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.VerifMethod#isValidity <em>Validity</em>}</li>
 *   <li>{@link lightweightDSL.VerifMethod#isUniqueness <em>Uniqueness</em>}</li>
 *   <li>{@link lightweightDSL.VerifMethod#isBindings <em>Bindings</em>}</li>
 *   <li>{@link lightweightDSL.VerifMethod#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getVerifMethod()
 * @model
 * @generated
 */
public interface VerifMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getVerifMethod_Validity()
	 * @model
	 * @generated
	 */
	boolean isValidity();

	/**
	 * Sets the value of the '{@link lightweightDSL.VerifMethod#isValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #isValidity()
	 * @generated
	 */
	void setValidity(boolean value);

	/**
	 * Returns the value of the '<em><b>Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uniqueness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniqueness</em>' attribute.
	 * @see #setUniqueness(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getVerifMethod_Uniqueness()
	 * @model
	 * @generated
	 */
	boolean isUniqueness();

	/**
	 * Sets the value of the '{@link lightweightDSL.VerifMethod#isUniqueness <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniqueness</em>' attribute.
	 * @see #isUniqueness()
	 * @generated
	 */
	void setUniqueness(boolean value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' attribute.
	 * @see #setBindings(boolean)
	 * @see lightweightDSL.LightweightDSLPackage#getVerifMethod_Bindings()
	 * @model
	 * @generated
	 */
	boolean isBindings();

	/**
	 * Sets the value of the '{@link lightweightDSL.VerifMethod#isBindings <em>Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' attribute.
	 * @see #isBindings()
	 * @generated
	 */
	void setBindings(boolean value);

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
	 * @see lightweightDSL.LightweightDSLPackage#getVerifMethod_Level()
	 * @model
	 * @generated
	 */
	LEVEL getLevel();

	/**
	 * Sets the value of the '{@link lightweightDSL.VerifMethod#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see lightweightDSL.LEVEL
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LEVEL value);

} // VerifMethod
