/**
 */
package lightweightDSL.provider;

import java.util.Collection;
import java.util.List;

import lightweightDSL.App;
import lightweightDSL.LightweightDSLFactory;
import lightweightDSL.LightweightDSLPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lightweightDSL.App} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRisksPropertyDescriptor(object);
			addRegistrationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Risks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRisksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_App_risks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_App_risks_feature", "_UI_App_type"),
						LightweightDSLPackage.Literals.APP__RISKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Registration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_App_registration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_App_registration_feature", "_UI_App_type"),
						LightweightDSLPackage.Literals.APP__REGISTRATION, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LightweightDSLPackage.Literals.APP__PHASES);
			childrenFeatures.add(LightweightDSLPackage.Literals.APP__AUTHENTICATORS);
			childrenFeatures.add(LightweightDSLPackage.Literals.APP__AUTH_METHODS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns App.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/App"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_App_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(App.class)) {
		case LightweightDSLPackage.APP__PHASES:
		case LightweightDSLPackage.APP__AUTHENTICATORS:
		case LightweightDSLPackage.APP__AUTH_METHODS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__PHASES,
				LightweightDSLFactory.eINSTANCE.createRegistration()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__PHASES,
				LightweightDSLFactory.eINSTANCE.createRecovery()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__PHASES,
				LightweightDSLFactory.eINSTANCE.createLogin()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__PHASES,
				LightweightDSLFactory.eINSTANCE.createReset()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__AUTHENTICATORS,
				LightweightDSLFactory.eINSTANCE.createKnowledge()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__AUTHENTICATORS,
				LightweightDSLFactory.eINSTANCE.createPossession()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__AUTHENTICATORS,
				LightweightDSLFactory.eINSTANCE.createBiometrics()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__AUTH_METHODS,
				LightweightDSLFactory.eINSTANCE.createMFA()));

		newChildDescriptors.add(createChildParameter(LightweightDSLPackage.Literals.APP__AUTH_METHODS,
				LightweightDSLFactory.eINSTANCE.createSFA()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LightweightDSLEditPlugin.INSTANCE;
	}

}
