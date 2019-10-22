/**
 */
package lightweightDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>KVALUE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lightweightDSL.LightweightDSLPackage#getKVALUE()
 * @model
 * @generated
 */
public enum KVALUE implements Enumerator {
	/**
	 * The '<em><b>PASSPHRASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSPHRASE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSPHRASE(0, "PASSPHRASE", "PASSPHRASE"),

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
	 * The '<em><b>LTBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTBP_VALUE
	 * @generated
	 * @ordered
	 */
	LTBP(2, "LTBP", "LTBP"),

	/**
	 * The '<em><b>PIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_VALUE
	 * @generated
	 * @ordered
	 */
	PIN(3, "PIN", "PIN"),

	/**
	 * The '<em><b>PREFERENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCES(4, "PREFERENCES", "PREFERENCES");

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
	public static final int PASSPHRASE_VALUE = 0;

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
	public static final int LTBP_VALUE = 2;

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
	public static final int PIN_VALUE = 3;

	/**
	 * The '<em><b>PREFERENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREFERENCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERENCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCES_VALUE = 4;

	/**
	 * An array of all the '<em><b>KVALUE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KVALUE[] VALUES_ARRAY = new KVALUE[] { PASSPHRASE, STBP, LTBP, PIN, PREFERENCES, };

	/**
	 * A public read-only list of all the '<em><b>KVALUE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KVALUE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>KVALUE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KVALUE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KVALUE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>KVALUE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KVALUE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KVALUE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>KVALUE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KVALUE get(int value) {
		switch (value) {
		case PASSPHRASE_VALUE:
			return PASSPHRASE;
		case STBP_VALUE:
			return STBP;
		case LTBP_VALUE:
			return LTBP;
		case PIN_VALUE:
			return PIN;
		case PREFERENCES_VALUE:
			return PREFERENCES;
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
	private KVALUE(int value, String name, String literal) {
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

} //KVALUE
