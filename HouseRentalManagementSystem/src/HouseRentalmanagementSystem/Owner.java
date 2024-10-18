package HouseRentalmanagementSystem;

import java.util.ArrayList;

public class Owner {
	private String name;
	private String phoneNumber;
	///public Property property;
	private ArrayList<Property> properties = new ArrayList<>();
	
	public Owner(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		//this.property = property;
	}
	public void addProperty(String address, int id, String type, String price, boolean available) {
		Property p = new Property(address, id, type, price, available, this.name, this.phoneNumber);
		properties.add(p);
	}
	
	public void getDetails() {
		System.out.println(properties.get(0));
	}
}
