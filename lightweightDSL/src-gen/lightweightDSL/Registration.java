/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Registration#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getRegistration()
 * @model
 * @generated
 */
public interface Registration extends Phase {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link lightweightDSL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getRegistration_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Registration
