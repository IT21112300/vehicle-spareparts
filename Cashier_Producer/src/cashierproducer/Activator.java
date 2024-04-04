//IT2062988
//Munasinghe K.D.V.S

package cashierproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	//Method called when the bundle is going to start
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	//Method called when the bundle is going to stop
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}