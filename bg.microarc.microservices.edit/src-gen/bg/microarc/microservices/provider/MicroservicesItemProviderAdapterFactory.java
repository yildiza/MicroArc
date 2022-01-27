/**
 */
package bg.microarc.microservices.provider;

import bg.microarc.microservices.util.MicroservicesAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

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
public class MicroservicesItemProviderAdapterFactory extends MicroservicesAdapterFactory
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
	public MicroservicesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.Microservice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceItemProvider microserviceItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroserviceAdapter() {
		if (microserviceItemProvider == null) {
			microserviceItemProvider = new MicroserviceItemProvider(this);
		}

		return microserviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserItemProvider userItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserAdapter() {
		if (userItemProvider == null) {
			userItemProvider = new UserItemProvider(this);
		}

		return userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.API_Gateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected API_GatewayItemProvider apI_GatewayItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.API_Gateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAPI_GatewayAdapter() {
		if (apI_GatewayItemProvider == null) {
			apI_GatewayItemProvider = new API_GatewayItemProvider(this);
		}

		return apI_GatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.LoadBalancer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerItemProvider loadBalancerItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.LoadBalancer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoadBalancerAdapter() {
		if (loadBalancerItemProvider == null) {
			loadBalancerItemProvider = new LoadBalancerItemProvider(this);
		}

		return loadBalancerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.DataBase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseItemProvider dataBaseItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.DataBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataBaseAdapter() {
		if (dataBaseItemProvider == null) {
			dataBaseItemProvider = new DataBaseItemProvider(this);
		}

		return dataBaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.EventBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBrokerItemProvider eventBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.EventBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventBrokerAdapter() {
		if (eventBrokerItemProvider == null) {
			eventBrokerItemProvider = new EventBrokerItemProvider(this);
		}

		return eventBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.MessageBroker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBrokerItemProvider messageBrokerItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.MessageBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageBrokerAdapter() {
		if (messageBrokerItemProvider == null) {
			messageBrokerItemProvider = new MessageBrokerItemProvider(this);
		}

		return messageBrokerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.MobileUI} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileUIItemProvider mobileUIItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.MobileUI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobileUIAdapter() {
		if (mobileUIItemProvider == null) {
			mobileUIItemProvider = new MobileUIItemProvider(this);
		}

		return mobileUIItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.WebUI} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebUIItemProvider webUIItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.WebUI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebUIAdapter() {
		if (webUIItemProvider == null) {
			webUIItemProvider = new WebUIItemProvider(this);
		}

		return webUIItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.MicroserviceModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceModelItemProvider microserviceModelItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.MicroserviceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroserviceModelAdapter() {
		if (microserviceModelItemProvider == null) {
			microserviceModelItemProvider = new MicroserviceModelItemProvider(this);
		}

		return microserviceModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bg.microarc.microservices.ServiceRegistry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRegistryItemProvider serviceRegistryItemProvider;

	/**
	 * This creates an adapter for a {@link bg.microarc.microservices.ServiceRegistry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceRegistryAdapter() {
		if (serviceRegistryItemProvider == null) {
			serviceRegistryItemProvider = new ServiceRegistryItemProvider(this);
		}

		return serviceRegistryItemProvider;
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
		if (microserviceItemProvider != null)
			microserviceItemProvider.dispose();
		if (userItemProvider != null)
			userItemProvider.dispose();
		if (apI_GatewayItemProvider != null)
			apI_GatewayItemProvider.dispose();
		if (loadBalancerItemProvider != null)
			loadBalancerItemProvider.dispose();
		if (dataBaseItemProvider != null)
			dataBaseItemProvider.dispose();
		if (eventBrokerItemProvider != null)
			eventBrokerItemProvider.dispose();
		if (messageBrokerItemProvider != null)
			messageBrokerItemProvider.dispose();
		if (mobileUIItemProvider != null)
			mobileUIItemProvider.dispose();
		if (webUIItemProvider != null)
			webUIItemProvider.dispose();
		if (microserviceModelItemProvider != null)
			microserviceModelItemProvider.dispose();
		if (serviceRegistryItemProvider != null)
			serviceRegistryItemProvider.dispose();
	}

}