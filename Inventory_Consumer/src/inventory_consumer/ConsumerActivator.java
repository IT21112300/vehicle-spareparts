// IT21112300 
// Shashikala W.A.A.
package inventory_consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import inventory_producer.InventoryService; 

public class ConsumerActivator implements BundleActivator {
 private InventoryServiceUser inventoryServiceUser;

 @Override
 public void start(BundleContext context) throws Exception {
     ServiceReference<InventoryService> serviceReference = context.getServiceReference(InventoryService.class);
     if (serviceReference != null) {
         InventoryService inventoryService = context.getService(serviceReference);
         System.out.println("Consumer: Inventory Service Obtained");

         inventoryServiceUser = new InventoryServiceUser(inventoryService);

         inventoryServiceUser.interactWithInventoryService();
     } else {
         System.out.println("Consumer: Inventory Service not available");
     }
 }

 @Override
 public void stop(BundleContext context) throws Exception {
     System.out.println("Consumer: Stopping");
 }
}
