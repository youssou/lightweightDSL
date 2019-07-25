/**
 */
package lightweightDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Factor Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage#getFactorValue()
 * @model
 * @generated
 */
public enum FactorValue implements Enumerator {
	/**
	 * The '<em><b>PK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_VALUE
	 * @generated
	 * @ordered
	 */
	PK(0, "PK", "PK"),

	/**
	 * The '<em><b>STBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STBP_VALUE
	 * @generated
	 * @ordered
	 */
	STBP(1, "STBP", "STBP"),
	/**
	 * The '<em><b>PASSPHRASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PASSPHRASE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSPHRASE(2, "PASSPHRASE", "PASSPHRASE"),

	/**
	 * The '<em><b>PASSFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSFACE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSFACE(3, "PASSFACE", "PASSFACE"),

	/**
	 * The '<em><b>FINGERPRINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINGERPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	FINGERPRINT(5, "FINGERPRINT", "FINGERPRINT"),
	/**
	 * The '<em><b>IRIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #IRIS_VALUE
	 * @generated
	 * @ordered
	 */
	IRIS(6, "IRIS", "IRIS"),

	/**
	 * The '<em><b>TOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(7, "TOKEN", "TOKEN"),
	/**
	 * The '<em><b>PREFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCE(8, "PREFERENCE", "PREFERENCE"),
	/**
	 * The '<em><b>LTBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LTBP_VALUE
	 * @generated
	 * @ordered
	 */
	LTBP(9, "LTBP", "LTBP"),
	/**
	 * The '<em><b>DEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(9, "DEVICE", "DEVICE"),
	/**
	 * The '<em><b>PIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PIN_VALUE
	 * @generated
	 * @ordered
	 */
	PIN(10, "PIN", "PIN");

	/**
	 * The '<em><b>PK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_VALUE = 0;

	/**
	 * The '<em><b>STBP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STBP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STBP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STBP_VALUE = 1;

	/**
	 * The '<em><b>PASSPHRASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSPHRASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSPHRASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSPHRASE_VALUE = 2;

	/**
	 * The '<em><b>PASSFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSFACE_VALUE = 3;

	/**
	 * The '<em><b>FINGERPRINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINGERPRINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINGERPRINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINGERPRINT_VALUE = 5;

	/**
	 * The '<em><b>IRIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IRIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRIS_VALUE = 6;

	/**
	 * The '<em><b>TOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOKEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 7;

	/**
	 * The '<em><b>PREFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_VALUE = 8;

	/**
	 * The '<em><b>LTBP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LTBP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LTBP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTBP_VALUE = 9;

	/**
	 * The '<em><b>DEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 9;

	/**
	 * The '<em><b>PIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_VALUE = 10;

	/**
	 * An array of all the '<em><b>Factor Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FactorValue[] VALUES_ARRAY = new FactorValue[] { PK, STBP, PASSPHRASE, PASSFACE, FINGERPRINT,
			IRIS, TOKEN, PREFERENCE, LTBP, DEVICE, PIN, };

	/**
	 * A public read-only list of all the '<em><b>Factor Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FactorValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Factor Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FactorValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FactorValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Factor Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FactorValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FactorValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Factor Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FactorValue get(int value) {
		switch (value) {
		case PK_VALUE:
			return PK;
		case STBP_VALUE:
			return STBP;
		case PASSPHRASE_VALUE:
			return PASSPHRASE;
		case PASSFACE_VALUE:
			return PASSFACE;
		case FINGERPRINT_VALUE:
			return FINGERPRINT;
		case IRIS_VALUE:
			return IRIS;
		case TOKEN_VALUE:
			return TOKEN;
		case PREFERENCE_VALUE:
			return PREFERENCE;
		case LTBP_VALUE:
			return LTBP;
		case PIN_VALUE:
			return PIN;
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
	private FactorValue(int value, String name, String literal) {
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

} //FactorValue
