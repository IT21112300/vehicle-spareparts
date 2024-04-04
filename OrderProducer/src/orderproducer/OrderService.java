package orderproducer;

public interface OrderService {
	public void defaultList();
	public void printOrderList();
	public int getListSize();
	public float calculateBill(int itemId, int Qty, int count);
}
