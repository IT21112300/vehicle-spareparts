// IT21112300 
// Shashikala W.A.A.
package inventory_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class InventoryActivator implements BundleActivator {

	private ServiceRegistration<InventoryService> serviceRegistration;

    @Override
    public void start(BundleContext context) throws Exception {
        serviceRegistration = context.registerService(InventoryService.class, new InventoryServiceImpl(), null);
        System.out.println("Producer: Inventory Service Registered");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        serviceRegistration.unregister();
        System.out.println("Producer: Inventory Service Unregistered");
    }

}

