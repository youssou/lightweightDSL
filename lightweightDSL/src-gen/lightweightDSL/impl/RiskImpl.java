/**
 */
package lightweightDSL.impl;

import lightweightDSL.LEVEL;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Risk;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.RiskImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link lightweightDSL.impl.RiskImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lightweightDSL.impl.RiskImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link lightweightDSL.impl.RiskImpl#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskImpl extends MinimalEObjectImpl.Container implements Risk {
	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected String instance = INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final LEVEL VALUE_EDEFAULT = LEVEL.LOW;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected LEVEL value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstance(String newInstance) {
		String oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RISK__INSTANCE, oldInstance,
					instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEVEL getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(LEVEL newValue) {
		LEVEL oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RISK__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RISK__MESSAGE, oldMessage,
					message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.RISK__INFORMATION,
					oldInformation, information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.RISK__INSTANCE:
			return getInstance();
		case LightweightDSLPackage.RISK__VALUE:
			return getValue();
		case LightweightDSLPackage.RISK__MESSAGE:
			return getMessage();
		case LightweightDSLPackage.RISK__INFORMATION:
			return getInformation();
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
		case LightweightDSLPackage.RISK__INSTANCE:
			setInstance((String) newValue);
			return;
		case LightweightDSLPackage.RISK__VALUE:
			setValue((LEVEL) newValue);
			return;
		case LightweightDSLPackage.RISK__MESSAGE:
			setMessage((String) newValue);
			return;
		case LightweightDSLPackage.RISK__INFORMATION:
			setInformation((String) newValue);
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
		case LightweightDSLPackage.RISK__INSTANCE:
			setInstance(INSTANCE_EDEFAULT);
			return;
		case LightweightDSLPackage.RISK__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case LightweightDSLPackage.RISK__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case LightweightDSLPackage.RISK__INFORMATION:
			setInformation(INFORMATION_EDEFAULT);
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
		case LightweightDSLPackage.RISK__INSTANCE:
			return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
		case LightweightDSLPackage.RISK__VALUE:
			return value != VALUE_EDEFAULT;
		case LightweightDSLPackage.RISK__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		case LightweightDSLPackage.RISK__INFORMATION:
			return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
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
		result.append(" (instance: ");
		result.append(instance);
		result.append(", value: ");
		result.append(value);
		result.append(", message: ");
		result.append(message);
		result.append(", information: ");
		result.append(information);
		result.append(')');
		return result.toString();
	}

} //RiskImpl
