package orderproducer;

import java.util.ArrayList;

public class OrderServiceImpl implements  OrderService{

	ArrayList<String> spareParts = new ArrayList<String>();
	ArrayList<Float> price = new ArrayList<Float>();
	
	@Override
	public void defaultList() {
		
		spareParts.add("Headlight bulbs");
		price.add((float) 10000);
		
		spareParts.add("Radiators");
		price.add((float) 25000);
		
		spareParts.add("Seats");
		price.add((float) 8000);
		
		spareParts.add("Door Handles");
		price.add((float) 5000);
		
		spareParts.add("Tires");
		price.add((float) 5000);
		
	}

	@Override
	public void printOrderList() {
		// TODO Auto-generated method stub
		System.out.println("--------------- Available Vehicle Spare parts ---------------");
		for (int i=0; i < price.size(); i++)
			{
				System.out.println(i+1 + " " +spareParts.get(i) +" Rs:"+price.get(i));
			}
		System.out.println("--------------------------------------------------");
	}

	
	@Override
	public int getListSize() {
		return spareParts.size();
	}

	@Override
	public float calculateBill(int itemId, int Qty, int count) {
		// TODO Auto-generated method stub
		float vehiclePrice = price.get(itemId-1);
		float total = (vehiclePrice*Qty);
		System.out.println((count+1) +") "+ spareParts.get(itemId-1) +" x "+ Qty + " = " + total + "Rupees");
		return total;
	}
	
}
