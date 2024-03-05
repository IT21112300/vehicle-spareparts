package feedbackconsumer;

import java.util.Scanner;
import feedbackproducer.FeedbackMenuServiceIMPL;
import feedbackproducer.ViewMenuService;


public class FeedbackMenu {
	
	private boolean exit = false;
	Scanner scannerobj = new Scanner(System.in);
	
	public void startCustomer(ViewMenuService viewMenuService) {
		String navigateToHome = null;
		do {
			int selection = 3;
			do {
				
				System.out.println("*****To give feedback you have to logIn first*****");
				System.out.println("01. LogIn");
				System.out.println("02. Exit");
				System.out.print("Choose Option Number(Enter 1 or 2): ");
				selection = Integer.valueOf(scannerobj.nextLine());
				
				if(selection == 2) {  
					exit = true;
				}
				
				if (selection != 1 && selection != 2 ) {
					System.out.println("Please enter a valid selection");
				}
			}while(selection != 1 && selection != 2 );
			
			String backToHome = null;
			String userName = null;
			String password = null;
			String ord = null;
			String feed;
			FeedbackMenuServiceIMPL LoginCus = new FeedbackMenuServiceIMPL();			
			if (selection == 1) {
			    do {
			        System.out.println("   ____          _                              _                ___       \r\n"
			                + "  / ____   _ ___| |_ ___  _ __ ___   ___ _ __  | |    ___   __ _|_ _|_ __  \r\n"
			                + " | |  | | | / __| __/ _ \\| '_ ` _ \\ / _ | '__| | |   / _ \\ / _` || || '_ \\ \r\n"
			                + " | |__| |_| \\__ | || (_) | | | | | |  __| |    | |__| (_) | (_| || || | | |\r\n"
			                + "  \\____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_____\\___/ \\__, |___|_| |_|\r\n"
			                + "                                                           |___/          ");

			        System.out.print("Enter Username : ");
			        userName = scannerobj.nextLine();
			        System.out.print("Enter Password : ");
			        password = scannerobj.nextLine();
			        LoginCus.login(userName, password);

			        System.out.println("01. View Orders ");
			        System.out.println("99. Exit  \n\n");
			        System.out.print("Enter Option Number :");
			        ord = scannerobj.nextLine();

			        if (ord.equals("1")) {
			            // Show orders
			            System.out.println("==================Showing orders======================");
			            System.out.print("OrderID \t");
			            System.out.println("Item");
			            System.out.println("========================================");
			            System.out.print("001\t");
			            System.out.println("Tyre");
			            System.out.print("002\t");
			            System.out.println("Rim");
			        } else if (ord.equals("99")) {
			            // Exit
			            System.out.println("Exiting...");
			            break;
			        }

			        System.out.print("Enter Your Feedback :");
			        feed = scannerobj.nextLine();

			    } while (!ord.equals("99"));
			} else if (selection == 2) {
			    return;
			}


		}while(!exit);
					
							
	}				
}