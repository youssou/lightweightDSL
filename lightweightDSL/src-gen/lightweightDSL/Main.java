/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Main#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link lightweightDSL.Main#getFunctions <em>Functions</em>}</li>
 *   <li>{@link lightweightDSL.Main#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(Enroll)
	 * @see lightweightDSL.LightweightDSLPackage#getMain_Initializer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Enroll getInitializer();

	/**
	 * Sets the value of the '{@link lightweightDSL.Main#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Enroll value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getMain_Functions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.AuthMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getMain_Methods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AuthMethod> getMethods();

} // Main
