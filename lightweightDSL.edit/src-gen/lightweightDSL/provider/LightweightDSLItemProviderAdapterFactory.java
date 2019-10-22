/**
 */
package lightweightDSL.provider;

import java.util.ArrayList;
import java.util.Collection;

import lightweightDSL.util.LightweightDSLAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LightweightDSLItemProviderAdapterFactory extends LightweightDSLAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightweightDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Registration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationItemProvider registrationItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Registration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegistrationAdapter() {
		if (registrationItemProvider == null) {
			registrationItemProvider = new RegistrationItemProvider(this);
		}

		return registrationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Recovery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoveryItemProvider recoveryItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Recovery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecoveryAdapter() {
		if (recoveryItemProvider == null) {
			recoveryItemProvider = new RecoveryItemProvider(this);
		}

		return recoveryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Login} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginItemProvider loginItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Login}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoginAdapter() {
		if (loginItemProvider == null) {
			loginItemProvider = new LoginItemProvider(this);
		}

		return loginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Reset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetItemProvider resetItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Reset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResetAdapter() {
		if (resetItemProvider == null) {
			resetItemProvider = new ResetItemProvider(this);
		}

		return resetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.App} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppItemProvider appItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAppAdapter() {
		if (appItemProvider == null) {
			appItemProvider = new AppItemProvider(this);
		}

		return appItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.VerifMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifMethodItemProvider verifMethodItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.VerifMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerifMethodAdapter() {
		if (verifMethodItemProvider == null) {
			verifMethodItemProvider = new VerifMethodItemProvider(this);
		}

		return verifMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.MFA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFAItemProvider mfaItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.MFA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMFAAdapter() {
		if (mfaItemProvider == null) {
			mfaItemProvider = new MFAItemProvider(this);
		}

		return mfaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.SFA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SFAItemProvider sfaItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.SFA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSFAAdapter() {
		if (sfaItemProvider == null) {
			sfaItemProvider = new SFAItemProvider(this);
		}

		return sfaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Knowledge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeItemProvider knowledgeItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Knowledge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKnowledgeAdapter() {
		if (knowledgeItemProvider == null) {
			knowledgeItemProvider = new KnowledgeItemProvider(this);
		}

		return knowledgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Possession} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossessionItemProvider possessionItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Possession}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPossessionAdapter() {
		if (possessionItemProvider == null) {
			possessionItemProvider = new PossessionItemProvider(this);
		}

		return possessionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Biometrics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiometricsItemProvider biometricsItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Biometrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBiometricsAdapter() {
		if (biometricsItemProvider == null) {
			biometricsItemProvider = new BiometricsItemProvider(this);
		}

		return biometricsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link lightweightDSL.Risk} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskItemProvider riskItemProvider;

	/**
	 * This creates an adapter for a {@link lightweightDSL.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRiskAdapter() {
		if (riskItemProvider == null) {
			riskItemProvider = new RiskItemProvider(this);
		}

		return riskItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (registrationItemProvider != null)
			registrationItemProvider.dispose();
		if (recoveryItemProvider != null)
			recoveryItemProvider.dispose();
		if (loginItemProvider != null)
			loginItemProvider.dispose();
		if (resetItemProvider != null)
			resetItemProvider.dispose();
		if (appItemProvider != null)
			appItemProvider.dispose();
		if (attributeItemProvider != null)
			attributeItemProvider.dispose();
		if (verifMethodItemProvider != null)
			verifMethodItemProvider.dispose();
		if (mfaItemProvider != null)
			mfaItemProvider.dispose();
		if (sfaItemProvider != null)
			sfaItemProvider.dispose();
		if (knowledgeItemProvider != null)
			knowledgeItemProvider.dispose();
		if (possessionItemProvider != null)
			possessionItemProvider.dispose();
		if (biometricsItemProvider != null)
			biometricsItemProvider.dispose();
		if (riskItemProvider != null)
			riskItemProvider.dispose();
	}

}
