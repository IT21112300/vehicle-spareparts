package inventory_consumer;

//ConsumerActivator.java
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import InventoryService; // Importing the InventoryService interface from the producer project

public class ConsumerActivator implements BundleActivator {
 private InventoryService inventoryService;

 @Override
 public void start(BundleContext context) throws Exception {
     ServiceReference<InventoryService> serviceReference = context.getServiceReference(InventoryService.class);
     if (serviceReference != null) {
         inventoryService = context.getService(serviceReference);
         System.out.println("Consumer: Inventory Service Obtained");
         
         // Call methods on the inventory service as needed
         inventoryService.viewInventory(); // Example usage
     } else {
         System.out.println("Consumer: Inventory Service not available");
     }
 }

 @Override
 public void stop(BundleContext context) throws Exception {
     // Release any resources if needed
     if (inventoryService != null) {
         context.ungetService(context.getServiceReference(InventoryService.class));
         System.out.println("Consumer: Inventory Service Released");
     }
 }
}
