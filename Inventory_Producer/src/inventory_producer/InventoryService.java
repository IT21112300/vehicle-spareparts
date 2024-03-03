package inventory_producer;

public interface InventoryService {
    void addInventoryItem(String itemName, int quantity);
    void viewInventory();
}