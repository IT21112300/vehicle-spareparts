// IT21112300 
// Shashikala W.A.A.

package inventory_consumer;

import inventory_producer.InventoryService;

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

        System.out.println("1. Add items");
        System.out.println("2. View items");
        System.out.println("99. Exit");
        System.out.println("Enter your choice:");
        
        int choice = scanner.nextInt();
        while (choice != 99) {
            switch (choice) {
                case 1:
                    System.out.println("Enter item name:");
                    String itemName = scanner.next();
                    System.out.println("Enter quantity:");
                    int amount = scanner.nextInt();
                    System.out.println("Enter price:");
                    double price = scanner.nextDouble(); 
                    inventoryService.addInventoryItem(itemName, amount, price);
                    System.out.println("****************Item added successfully.****************\n");
                    break;
                case 2:
                    System.out.println(inventoryService.viewInventory()); 
                    System.out.println("*********************************************************\n");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.\n");
                    break;
            }
            System.out.println("1. Add items");
            System.out.println("2. View items");
            System.out.println("99. Exit\n");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
        }
        System.out.println("Exiting...\n\n");
        System.out.println("************************Thank You!**************************\n");
        scanner.close();
    }
}
