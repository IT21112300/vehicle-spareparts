// IT21112300 
// Shashikala W.A.A.

package inventory_consumer;

import inventory_producer.InventoryService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventoryServiceUser {
    private InventoryService inventoryService;

    public InventoryServiceUser(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void interactWithInventoryService() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\r\n"
                + " __      __  _     _      _        _____           _         _____                      _                   \r\n"
                + " \\ \\    / / | |   (_)    | |      |  __ \\         | |       |_   _|                    | |                  \r\n"
                + "  \\ \\  / /__| |__  _  ___| | ___  | |__) |_ _ _ __| |_ ___    | |  _ ____   _____ _ __ | |_ ___  _ __ _   _ \r\n"
                + "   \\ \\/ / _ \\ '_ \\| |/ __| |/ _ \\ |  ___/ _` | '__| __/ __|   | | | '_ \\ \\ / / _ \\ '_ \\| __/ _ \\| '__| | | |\r\n"
                + "    \\  /  __/ | | | | (__| |  __/ | |  | (_| | |  | |_\\__ \\  _| |_| | | \\ V /  __/ | | | || (_) | |  | |_| |\r\n"
                + "     \\/ \\___|_| |_|_|\\___|_|\\___| |_|   \\__,_|_|   \\__|___/ |_____|_| |_|\\_/ \\___|_| |_|\\__\\___/|_|   \\__, |\r\n"
                + "                                                                                                       __/ |\r\n"
                + "                                                                                                      |___/ \r\n"
                + "");
        System.out.println("**********************************************************");
        System.out.println("                          Menu                            ");
        System.out.println("**********************************************************");

        System.out.println("1 :    Add items");
        System.out.println("2 :    View items");
        System.out.println("99:   Exit\n\n");
        System.out.println("Enter your choice (Enter the number assigned...):");
        
        int choice = scanner.nextInt();
        while (choice != 99) {
            switch (choice) {
            case 1:
            	System.out.println("\n============================================================\n");
                System.out.println("Enter item name:");
                String itemName = scanner.next();
                int amount = 0;
                boolean validAmount = false;
                while (!validAmount) {
                    try {
                        System.out.println("Enter quantity:");
                        amount = scanner.nextInt();
                        validAmount = true;
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input! Please enter valid numeric value for quantity....\n");
                        scanner.next(); 
                    }
                }
                double price = 0;
                boolean validPrice = false;
                while (!validPrice) {
                    try {
                        System.out.println("Enter unit price:");
                        price = scanner.nextDouble();
                        validPrice = true;
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input! Please enter a valid numeric value for price....\n");
                        scanner.next(); 
                    }
                }
                inventoryService.addInventoryItem(itemName, amount, price);
                System.out.println("Item added successfully!.\n\n");
            	System.out.println("\n============================================================\n");
                break;
                    
                case 2:                   
                	System.out.println("\n------------------------------------------------------------\n");
                    System.out.println(inventoryService.viewInventory()); 
                	System.out.println("\n============================================================\n");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice!. Please try again....\n");
                	System.out.println("\n============================================================\n");
                    break;
            }
            System.out.println("**********************************************************");
            System.out.println("                          Menu                            ");
            System.out.println("**********************************************************");
            
            System.out.println("1 :  	Add items");
            System.out.println("2 : 	View items");
            System.out.println("99: 	Exit\n\n");
            System.out.println("Enter your choice (Enter the number assigned...)");
            choice = scanner.nextInt();
        }
        
        System.out.println("Exiting...\n\n");
        System.out.println("======================== Thank You! ========================\n");
        scanner.close();
    }
}
