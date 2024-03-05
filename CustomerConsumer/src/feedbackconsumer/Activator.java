package feedbackconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import feedbackproducer.FeedbackMenuServiceIMPL;
import feedbackproducer.ViewMenuService;

public class Activator implements BundleActivator {

	ServiceRegistration feedbackMenuServiceReference;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("--------Start Feedback Service----------- ");
		
		ViewMenuService viewMenuService = new FeedbackMenuServiceIMPL();   
		feedbackMenuServiceReference = bundleContext.registerService(ViewMenuService.class.getName(),viewMenuService,null);
		
		FeedbackMenu feedback = new FeedbackMenu();
		feedback.startCustomer(viewMenuService);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("--------Stop Feedback-------- ");
	}

}
