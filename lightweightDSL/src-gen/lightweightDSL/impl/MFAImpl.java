/**
 */
package lightweightDSL.impl;

import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.MFA;
import lightweightDSL.ValidationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.MFAImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link lightweightDSL.impl.MFAImpl#isCorrelation <em>Correlation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFAImpl extends AuthMethodImpl implements MFA {
	/**
	 * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationType VALIDATION_EDEFAULT = ValidationType.LOCAL;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected ValidationType validation = VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCorrelation() <em>Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrelation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CORRELATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCorrelation() <em>Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrelation()
	 * @generated
	 * @ordered
	 */
	protected boolean correlation = CORRELATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MFAImpl() {
		super();
		risk = LightweightDSLFactoryImpl.eINSTANCE.createRisk();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.MFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationType getValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidation(ValidationType newValidation) {
		ValidationType oldValidation = validation;
		validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.MFA__VALIDATION, oldValidation,
					validation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCorrelation() {
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelation(boolean newCorrelation) {
		boolean oldCorrelation = correlation;
		correlation = newCorrelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.MFA__CORRELATION,
					oldCorrelation, correlation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.MFA__VALIDATION:
			return getValidation();
		case LightweightDSLPackage.MFA__CORRELATION:
			return isCorrelation();
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
		case LightweightDSLPackage.MFA__VALIDATION:
			setValidation((ValidationType) newValue);
			return;
		case LightweightDSLPackage.MFA__CORRELATION:
			setCorrelation((Boolean) newValue);
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
		case LightweightDSLPackage.MFA__VALIDATION:
			setValidation(VALIDATION_EDEFAULT);
			return;
		case LightweightDSLPackage.MFA__CORRELATION:
			setCorrelation(CORRELATION_EDEFAULT);
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
		case LightweightDSLPackage.MFA__VALIDATION:
			return validation != VALIDATION_EDEFAULT;
		case LightweightDSLPackage.MFA__CORRELATION:
			return correlation != CORRELATION_EDEFAULT;
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
		result.append(" (validation: ");
		result.append(validation);
		result.append(", correlation: ");
		result.append(correlation);
		result.append(')');
		return result.toString();
	}

} //MFAImpl
