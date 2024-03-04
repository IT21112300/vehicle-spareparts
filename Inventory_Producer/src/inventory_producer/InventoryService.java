// IT21112300 
// Shashikala W.A.A.
package inventory_producer;

public interface InventoryService {
    void addInventoryItem(String itemName, int quantity,double price);
    String viewInventory();
}