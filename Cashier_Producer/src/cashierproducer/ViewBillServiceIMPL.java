//IT2062988
//Munasinghe K.D.V.S

package cashierproducer;

public class ViewBillServiceIMPL implements ViewBillService {
    
    @Override
    public String viewBill1() {
    	
    	//Bill details for Vinal
        String bill1 = "----------------- Vinal's Bill -----------------\n" +
                      "Item: Tyres, WindScreen\n" +
                      "Price: RS.35,000.00\n" +
                      "Quantity: 2 Items\n" +
                      "Payment: Master card\n" +
                      "---------------------------------------------";
        return bill1;
    }

    @Override
    public String viewBill2() {
    	
    	//Bill details for Vinura
        String bill2 = "----------------- Vinura's Bill -----------------\n" +
                      "Item: Laptop, Mouse, Keyboard\n" +
                      "Price: RS.50,000.00, RS.1,000.00, RS.2,000.00\n" +
                      "Quantity: 1 Item, 2 Items, 1 Item\n" +
                      "Payment: Visa card\n" +
                      "---------------------------------------------";
        return bill2;
    }
    
	@Override
    public String viewBill3() {
		
		//Bill details for Amali
        String bill2 = "----------------- Amali's Bill -----------------\n" +
                      "Item: Laptop, Mouse, Keyboard\n" +
                      "Price: RS.50,000.00, RS.1,000.00, RS.2,000.00\n" +
                      "Quantity: 1 Item, 2 Items, 1 Item\n" +
                      "Payment: Visa card\n" +
                      "---------------------------------------------";
        return bill2;
    }
    
	@Override
	public void viewBill() {
		// TODO Auto-generated method stub
		
	}
}