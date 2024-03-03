package inventory_producer;

import java.util.HashMap;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService {
 private Map<String, Integer> inventory = new HashMap<>();

 @Override
 public void addInventoryItem(String itemName, int quantity) {
     inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
     System.out.println("Added " + quantity + " " + itemName + " to inventory.");
 }

 @Override
 public void viewInventory() {
     System.out.println("Current Inventory:");
     System.out.println("Item\t\tQuantity");
     for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
         System.out.println(entry.getKey() + "\t\t" + entry.getValue());
     }
 }
}
