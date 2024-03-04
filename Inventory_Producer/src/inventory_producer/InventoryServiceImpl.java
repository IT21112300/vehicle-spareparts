package inventory_producer;

// InventoryServiceImpl.java
import java.util.HashMap;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService {
    private Map<String, Integer> inventory = new HashMap<>();

    @Override
    public void addItem(String itemName, int amount) {
        inventory.put(itemName, inventory.getOrDefault(itemName, 0) + amount);
    }

    @Override
    public String viewItems() {
        StringBuilder sb = new StringBuilder("Current Inventory:\n");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
