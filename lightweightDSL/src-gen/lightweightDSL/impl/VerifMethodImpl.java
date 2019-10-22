/**
 */
package lightweightDSL.impl;

import lightweightDSL.LEVEL;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.VerifMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verif Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lightweightDSL.impl.VerifMethodImpl#isValidity <em>Validity</em>}</li>
 *   <li>{@link lightweightDSL.impl.VerifMethodImpl#isUniqueness <em>Uniqueness</em>}</li>
 *   <li>{@link lightweightDSL.impl.VerifMethodImpl#isBindings <em>Bindings</em>}</li>
 *   <li>{@link lightweightDSL.impl.VerifMethodImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerifMethodImpl extends MinimalEObjectImpl.Container implements VerifMethod {
	/**
	 * The default value of the '{@link #isValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean validity = VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueness() <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUENESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueness() <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueness()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueness = UNIQUENESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBindings() <em>Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBindings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BINDINGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBindings() <em>Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBindings()
	 * @generated
	 * @ordered
	 */
	protected boolean bindings = BINDINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LEVEL LEVEL_EDEFAULT = LEVEL.LOW;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LEVEL level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightweightDSLPackage.Literals.VERIF_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidity(boolean newValidity) {
		boolean oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.VERIF_METHOD__VALIDITY,
					oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUniqueness() {
		return uniqueness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueness(boolean newUniqueness) {
		boolean oldUniqueness = uniqueness;
		uniqueness = newUniqueness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.VERIF_METHOD__UNIQUENESS,
					oldUniqueness, uniqueness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBindings() {
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindings(boolean newBindings) {
		boolean oldBindings = bindings;
		bindings = newBindings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.VERIF_METHOD__BINDINGS,
					oldBindings, bindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEVEL getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(LEVEL newLevel) {
		LEVEL oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightweightDSLPackage.VERIF_METHOD__LEVEL, oldLevel,
					level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LightweightDSLPackage.VERIF_METHOD__VALIDITY:
			return isValidity();
		case LightweightDSLPackage.VERIF_METHOD__UNIQUENESS:
			return isUniqueness();
		case LightweightDSLPackage.VERIF_METHOD__BINDINGS:
			return isBindings();
		case LightweightDSLPackage.VERIF_METHOD__LEVEL:
			return getLevel();
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
		case LightweightDSLPackage.VERIF_METHOD__VALIDITY:
			setValidity((Boolean) newValue);
			return;
		case LightweightDSLPackage.VERIF_METHOD__UNIQUENESS:
			setUniqueness((Boolean) newValue);
			return;
		case LightweightDSLPackage.VERIF_METHOD__BINDINGS:
			setBindings((Boolean) newValue);
			return;
		case LightweightDSLPackage.VERIF_METHOD__LEVEL:
			setLevel((LEVEL) newValue);
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
		case LightweightDSLPackage.VERIF_METHOD__VALIDITY:
			setValidity(VALIDITY_EDEFAULT);
			return;
		case LightweightDSLPackage.VERIF_METHOD__UNIQUENESS:
			setUniqueness(UNIQUENESS_EDEFAULT);
			return;
		case LightweightDSLPackage.VERIF_METHOD__BINDINGS:
			setBindings(BINDINGS_EDEFAULT);
			return;
		case LightweightDSLPackage.VERIF_METHOD__LEVEL:
			setLevel(LEVEL_EDEFAULT);
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
		case LightweightDSLPackage.VERIF_METHOD__VALIDITY:
			return validity != VALIDITY_EDEFAULT;
		case LightweightDSLPackage.VERIF_METHOD__UNIQUENESS:
			return uniqueness != UNIQUENESS_EDEFAULT;
		case LightweightDSLPackage.VERIF_METHOD__BINDINGS:
			return bindings != BINDINGS_EDEFAULT;
		case LightweightDSLPackage.VERIF_METHOD__LEVEL:
			return level != LEVEL_EDEFAULT;
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
		result.append(" (validity: ");
		result.append(validity);
		result.append(", uniqueness: ");
		result.append(uniqueness);
		result.append(", bindings: ");
		result.append(bindings);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //VerifMethodImpl
