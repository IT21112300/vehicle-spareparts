// IT21112300 
// Shashikala W.A.A.
package inventory_producer;

import java.util.HashMap;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService {
    private Map<String, InventoryItem> inventory = new HashMap<>();

    @Override
    public void addInventoryItem(String itemName, int quantity, double price) {
        InventoryItem item = inventory.get(itemName);
        if (item == null) {
            item = new InventoryItem(itemName, quantity, price);
        } else {
            item.setQuantity(item.getQuantity() + quantity);
        }
        inventory.put(itemName, item);
        System.out.println("\nAdding " + quantity + " " + itemName + " to inventory....\n");
    }

    @Override
    public String viewInventory() {
    	
        StringBuilder sb = new StringBuilder();
        
        sb.append("Current Inventory:\n\n");
        sb.append("Item\t\tQuantity\tPrice(LKR)\n\n");
        for (Map.Entry<String, InventoryItem> entry : inventory.entrySet()) {
            InventoryItem item = entry.getValue();
            sb.append(item.getName()).append("\t\t").append(item.getQuantity()).append("\t\t").append(item.getPrice()).append("\n");
        }
        return sb.toString();
    }
}
