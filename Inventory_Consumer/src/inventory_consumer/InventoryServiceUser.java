//InventoryServiceUser.java
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

        System.out.println("Inventory management system");
        System.out.println("1. Add items");
        System.out.println("2. View items");
        System.out.println("99. Exit");

        int choice = scanner.nextInt();
        while (choice != 99) {
            switch (choice) {
                case 1:
                    System.out.println("Enter item name:");
                    String itemName = scanner.next();
                    System.out.println("Enter amount:");
                    int amount = scanner.nextInt();
                    inventoryService.addItem(itemName, amount);
                    System.out.println("Item added successfully.");
                    break;
                case 2:
                    System.out.println(inventoryService.viewItems());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
        }
        System.out.println("Exiting...");
        scanner.close();
    }
}
