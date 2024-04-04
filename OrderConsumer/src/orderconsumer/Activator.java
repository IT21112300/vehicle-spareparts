package orderconsumer;

import java.util.InputMismatchException;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import orderproducer.OrderService;

public class Activator implements BundleActivator {

    ServiceReference serviceReference;

    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Start Order Consumer Service");
        Scanner scanner = new Scanner(System.in);

        ServiceReference serviceReference = bundleContext.getServiceReference(OrderService.class.getName());
        if (serviceReference == null) {
            System.out.println("Order Service not found");
            return;
        }
        OrderService orderService = (OrderService) bundleContext.getService(serviceReference);
        orderService.defaultList();

        while (true) {
            System.out.println("=========Welcome=========");
            System.out.println("1.Type 'Customer'");
            String userType = scanner.nextLine();

            if (userType.equalsIgnoreCase("Customer")) {
                handleCustomerOperations(scanner, orderService);
                break; 
            } else {
                System.out.println("Invalid Input. Please enter 'Customer'.");
            }
        }
    }



    private void handleCustomerOperations(Scanner scanner, OrderService service) {
        do {
            System.out.println("Place Your Order Here");
            System.out.println("1.Available Vehical Spare Parts - Press 1");
            int option = safeNextInt(scanner);

            switch (option) {
                case 1:
                    orderSelection(scanner, service);
                    break;
                default:
                    System.out.println("Option not available. Please try again.");
            }
        } while (thankYouMessage(scanner));
        System.out.println("--------- Enjoy your purchase.------------");
    }

    private void orderSelection(Scanner scanner, OrderService service) {
        service.printOrderList();
        System.out.println("============Invoice===========");
        float total = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter Item Id or '0' to proceed to checkout: ");
            int itemId = safeNextInt(scanner);
            if (itemId == 0) {
                break;
            }
            System.out.print("Enter Qty : ");
            int Qty = safeNextInt(scanner);
            total += service.calculateBill(itemId, Qty, count);
            count++;
        }
        printInvoice(total, scanner, service, count);
    }

    private void printInvoice(float total, Scanner scanner, OrderService service, int count) {
        System.out.println("-------------------------------------------------");
        System.out.println("Total Amount Rs: " + total);
        
       
        System.out.println("___________________________________________________");
    }

    private boolean thankYouMessage(Scanner scanner) {
        System.out.print("Thank you! ");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("Y");
    }

    private int safeNextInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private float safeNextFloat(Scanner scanner) {
        while (!scanner.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Stop Order Consumer Service");
    }
}
