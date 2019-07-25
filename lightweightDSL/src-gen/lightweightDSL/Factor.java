/**
 */
package lightweightDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Factor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage#getFactor()
 * @model
 * @generated
 */
public enum Factor implements Enumerator {
	/**
	 * The '<em><b>KNOWLEDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	KNOWLEDGE(0, "KNOWLEDGE", "KNOWLEDGE"),
	/**
	 * The '<em><b>POSSESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #POSSESSION_VALUE
	 * @generated
	 * @ordered
	 */
	POSSESSION(1, "POSSESSION", "POSSESSION"),
	/**
	 * The '<em><b>BIOMETRICS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BIOMETRICS_VALUE
	 * @generated
	 * @ordered
	 */
	BIOMETRICS(2, "BIOMETRICS", "BIOMETRICS");

	/**
	 * The '<em><b>KNOWLEDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNOWLEDGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOWLEDGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KNOWLEDGE_VALUE = 0;

	/**
	 * The '<em><b>POSSESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSSESSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSSESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSSESSION_VALUE = 1;

	/**
	 * The '<em><b>BIOMETRICS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIOMETRICS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOMETRICS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIOMETRICS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Factor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Factor[] VALUES_ARRAY = new Factor[] { KNOWLEDGE, POSSESSION, BIOMETRICS, };

	/**
	 * A public read-only list of all the '<em><b>Factor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Factor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Factor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Factor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Factor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Factor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Factor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Factor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Factor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Factor get(int value) {
		switch (value) {
		case KNOWLEDGE_VALUE:
			return KNOWLEDGE;
		case POSSESSION_VALUE:
			return POSSESSION;
		case BIOMETRICS_VALUE:
			return BIOMETRICS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Factor(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Factor
