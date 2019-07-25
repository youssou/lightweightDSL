/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enroll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Enroll#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link lightweightDSL.Enroll#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getEnroll()
 * @model
 * @generated
 */
public interface Enroll extends EObject {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Secret}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secrets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getEnroll_Secrets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getEnroll_Identifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

} // Enroll
