/**
 */
package lightweightDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PROVIDER</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage#getPROVIDER()
 * @model
 * @generated
 */
public enum PROVIDER implements Enumerator {
	/**
	 * The '<em><b>Id P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_P_VALUE
	 * @generated
	 * @ordered
	 */
	ID_P(0, "IdP", "IdP"),

	/**
	 * The '<em><b>SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_VALUE
	 * @generated
	 * @ordered
	 */
	SELF(1, "SELF", "SELF"),

	/**
	 * The '<em><b>INSTITUTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTITUTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INSTITUTIONAL(2, "INSTITUTIONAL", "INSTITUTIONAL");

	/**
	 * The '<em><b>Id P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_P
	 * @model name="IdP"
	 * @generated
	 * @ordered
	 */
	public static final int ID_P_VALUE = 0;

	/**
	 * The '<em><b>SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELF_VALUE = 1;

	/**
	 * The '<em><b>INSTITUTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTITUTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTITUTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTITUTIONAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>PROVIDER</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PROVIDER[] VALUES_ARRAY = new PROVIDER[] { ID_P, SELF, INSTITUTIONAL, };

	/**
	 * A public read-only list of all the '<em><b>PROVIDER</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PROVIDER> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PROVIDER</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PROVIDER get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROVIDER result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROVIDER</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PROVIDER getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROVIDER result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROVIDER</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PROVIDER get(int value) {
		switch (value) {
		case ID_P_VALUE:
			return ID_P;
		case SELF_VALUE:
			return SELF;
		case INSTITUTIONAL_VALUE:
			return INSTITUTIONAL;
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
	private PROVIDER(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //PROVIDER
