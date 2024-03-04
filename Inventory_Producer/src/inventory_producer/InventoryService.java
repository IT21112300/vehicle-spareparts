package inventory_producer;

//InventoryService.java
public interface InventoryService {
 void addItem(String itemName, int amount);
 String viewItems();
}
