/**
 */
package lightweightDSL.impl;

import lightweightDSL.KVALUE;
import lightweightDSL.Knowledge;
import lightweightDSL.LightweightDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.KnowledgeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lightweightDSL.impl.KnowledgeImpl#isLimitedAttempts <em>Limited Attempts</em>}</li>
 *   <li>{@link lightweightDSL.impl.KnowledgeImpl#isAutofilled <em>Autofilled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeImpl extends AuthenticatorImpl implements Knowledge {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final KVALUE VALUE_EDEFAULT = KVALUE.PASSPHRASE;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected KVALUE value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLimitedAttempts() <em>Limited Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitedAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIMITED_ATTEMPTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLimitedAttempts() <em>Limited Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitedAttempts()
	 * @generated
	 * @ordered
	 */
	protected boolean limitedAttempts = LIMITED_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutofilled() <em>Autofilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOFILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutofilled() <em>Autofilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofilled()
	 * @generated
	 * @ordered
	 */
	protected boolean autofilled = AUTOFILLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.KNOWLEDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KVALUE getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(KVALUE newValue) {
		KVALUE oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.KNOWLEDGE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLimitedAttempts() {
		return limitedAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimitedAttempts(boolean newLimitedAttempts) {
		boolean oldLimitedAttempts = limitedAttempts;
		limitedAttempts = newLimitedAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.KNOWLEDGE__LIMITED_ATTEMPTS,
					oldLimitedAttempts, limitedAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutofilled() {
		return autofilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutofilled(boolean newAutofilled) {
		boolean oldAutofilled = autofilled;
		autofilled = newAutofilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.KNOWLEDGE__AUTOFILLED,
					oldAutofilled, autofilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.KNOWLEDGE__VALUE:
			return getValue();
		case LightweightDSLPackage.KNOWLEDGE__LIMITED_ATTEMPTS:
			return isLimitedAttempts();
		case LightweightDSLPackage.KNOWLEDGE__AUTOFILLED:
			return isAutofilled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LightweightDSLPackage.KNOWLEDGE__VALUE:
			setValue((KVALUE) newValue);
			return;
		case LightweightDSLPackage.KNOWLEDGE__LIMITED_ATTEMPTS:
			setLimitedAttempts((Boolean) newValue);
			return;
		case LightweightDSLPackage.KNOWLEDGE__AUTOFILLED:
			setAutofilled((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LightweightDSLPackage.KNOWLEDGE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case LightweightDSLPackage.KNOWLEDGE__LIMITED_ATTEMPTS:
			setLimitedAttempts(LIMITED_ATTEMPTS_EDEFAULT);
			return;
		case LightweightDSLPackage.KNOWLEDGE__AUTOFILLED:
			setAutofilled(AUTOFILLED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LightweightDSLPackage.KNOWLEDGE__VALUE:
			return value != VALUE_EDEFAULT;
		case LightweightDSLPackage.KNOWLEDGE__LIMITED_ATTEMPTS:
			return limitedAttempts != LIMITED_ATTEMPTS_EDEFAULT;
		case LightweightDSLPackage.KNOWLEDGE__AUTOFILLED:
			return autofilled != AUTOFILLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", limitedAttempts: ");
		result.append(limitedAttempts);
		result.append(", autofilled: ");
		result.append(autofilled);
		result.append(')');
		return result.toString();
	}

} //KnowledgeImpl
