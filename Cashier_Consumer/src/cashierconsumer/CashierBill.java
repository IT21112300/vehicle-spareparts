//IT2062988
//Munasinghe K.D.V.S

package cashierconsumer;

import java.util.Scanner;
import cashierproducer.ViewBillService;

public class CashierBill {
    
    private boolean exit = false;
    private Scanner scannerobj = new Scanner(System.in);
    
    public void startCashier(ViewBillService viewBillService) {
        String navigateToHome = null;
        do {
            int selection = 3;
            do {
            	
            	// Displaying  menu options
                System.out.println("-------------------- VIEW BILL ----------------- "); 
                System.out.println("Choose the service ");
                System.out.println("01. View bill");
                System.out.println("02. Exit");
                System.out.println("Choose Option Number");
                selection = Integer.valueOf(scannerobj.nextLine());
                
                if(selection == 2) {  
                    exit = true;
                }
                
             // Validating user input
                if (selection != 1 && selection != 2 ) {
                    System.out.println("Please enter a valid selection");
                }
            } while (selection != 1 && selection != 2);
            
         // View bill option
            if(selection == 1) { 
                System.out.println("Enter the bill ID (1 or 2 or 3): ");
                int billId = Integer.valueOf(scannerobj.nextLine());
                if (billId == 1 || billId == 2 || billId == 3) {
                	
                	// Retrieve and displaying  the selected bills
                    String bill = (billId == 1) ? viewBillService.viewBill1() : (billId == 2) ? viewBillService.viewBill2() : viewBillService.viewBill3();
                    System.out.println("Bill " + billId + ":");
                    System.out.println(bill);
                } else {
                    System.out.println("Invalid bill ID. Please enter 1 or 2 or 3.");
                }
            } else if (selection == 2) {
            	
            	// Exit the progra
                return;
            }
        } while (!exit);
    }
}