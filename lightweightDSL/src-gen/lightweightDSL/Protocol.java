/**
 */
package lightweightDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage#getProtocol()
 * @model
 * @generated
 */
public enum Protocol implements Enumerator {
	/**
	 * The '<em><b>EBIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIA_VALUE
	 * @generated
	 * @ordered
	 */
	EBIA(0, "EBIA", "EBIA"),

	/**
	 * The '<em><b>SMS BASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	SMS_BASED(1, "SMS_BASED", "SMS_BASED"),
	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(2, "LOCAL", "LOCAL");

	/**
	 * The '<em><b>EBIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EBIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EBIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EBIA_VALUE = 0;

	/**
	 * The '<em><b>SMS BASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMS BASED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMS_BASED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMS_BASED_VALUE = 1;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Protocol[] VALUES_ARRAY = new Protocol[] { EBIA, SMS_BASED, LOCAL, };

	/**
	 * A public read-only list of all the '<em><b>Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Protocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Protocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Protocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Protocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Protocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Protocol get(int value) {
		switch (value) {
		case EBIA_VALUE:
			return EBIA;
		case SMS_BASED_VALUE:
			return SMS_BASED;
		case LOCAL_VALUE:
			return LOCAL;
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
	private Protocol(int value, String name, String literal) {
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

} //Protocol
