package HouseRentalmanagementSystem;

import java.util.ArrayList;

public class Main {
	
	public ArrayList<Property> propertyList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner owner = new Owner("Sabbir", "0168212");
		
		owner.addProperty("DIU", 001, "Single Room", "2000", true);
		owner.getDetails();
	}

}
