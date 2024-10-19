package HouseRentalmanagementSystem;

import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Property> propertyList = new ArrayList<>();
	
	public static void addAllProperty(Property property) {
		propertyList.add(property);
	}
	
	public static void getAllproperty(int i) {
		for(var property: propertyList) {
			System.out.println(property);
		}
		
		System.out.println("Rented: \n" + propertyList.get(i));
	}

	public static void main(String[] args) {
		Owner owner = new Owner("Sabbir", "0168212");
		Owner owner2 = new Owner("Rasel", "0156798");
		
		owner.addProperty("DIU", 001, "Single Room", "2000", true);
		owner2.addProperty("Datta Para", 002, "Double Room", "1500", true);
		//owner.getDetails();
		
		Renter renter1 = new Renter("xyz", "email@email.com", "012345");
		renter1.seeProperty(1);
		//Main.getAllproperty();
	}

}
