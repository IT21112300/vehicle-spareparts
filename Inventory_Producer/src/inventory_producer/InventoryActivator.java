package inventory_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class InventoryActivator implements BundleActivator {

//	private static BundleContext context;
//
//	static BundleContext getContext() {
//		return context;
//	}

	public void start(BundleContext context) throws Exception {
        InventoryService inventoryService = new InventoryServiceImpl();
        context.registerService(InventoryService.class, inventoryService, null);
        System.out.println("Inventory Service Registered");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Inventory Service Unregistered");
    }

}

