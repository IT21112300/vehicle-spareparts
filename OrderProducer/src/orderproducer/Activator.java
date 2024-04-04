package orderproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {



	private static BundleContext context;
	ServiceRegistration ServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Order Service Started");
		OrderServiceImpl orderService = new OrderServiceImpl();
		ServiceRegistration = bundleContext.registerService(
				OrderService.class.getName(), orderService, null);
				
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Order Service Stopped");
	}

}
