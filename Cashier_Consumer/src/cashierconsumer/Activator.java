//IT2062988
//Munasinghe K.D.V.S

package cashierconsumer;


import cashierproducer.ViewBillService;
import cashierproducer.ViewBillServiceIMPL;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration viewBillServiceReference;
	
	
	// Method called when the bundle is started
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("--------Start Cashier Service-------- ");
		
		ViewBillService viewBillService = new ViewBillServiceIMPL();   
		viewBillServiceReference = bundleContext.registerService(ViewBillService.class.getName(),viewBillService,null);
		
		CashierBill welcomeCM = new CashierBill();
		welcomeCM.startCashier(viewBillService);
	}

	// Method called when the bundle is stopped
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("--------Stop Cashier Service-------- ");
	}

}