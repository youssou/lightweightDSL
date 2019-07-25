/**
 */
package lightweightDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.Phase#getLevel <em>Level</em>}</li>
 *   <li>{@link lightweightDSL.Phase#getName <em>Name</em>}</li>
 *   <li>{@link lightweightDSL.Phase#getAuthMethods <em>Auth Methods</em>}</li>
 * </ul>
 *
 * @see lightweightDSL.LightweightDSLPackage#getPhase()
 * @model abstract="true"
 * @generated
 */
public interface Phase extends EObject {
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
	 * @see lightweightDSL.LightweightDSLPackage#getPhase_Level()
	 * @model
	 * @generated
	 */
	LEVEL getLevel();

	/**
	 * Sets the value of the '{@link lightweightDSL.Phase#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see lightweightDSL.LEVEL
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LEVEL value);

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
	 * @see lightweightDSL.LightweightDSLPackage#getPhase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lightweightDSL.Phase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Auth Methods</b></em>' reference list.
	 * The list contents are of type {@link lightweightDSL.AuthMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Methods</em>' reference list.
	 * @see lightweightDSL.LightweightDSLPackage#getPhase_AuthMethods()
	 * @model
	 * @generated
	 */
	EList<AuthMethod> getAuthMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LEVEL computeLevel();

} // Phase
