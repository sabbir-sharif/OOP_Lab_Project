package HouseRentalmanagementSystem;

public class Property {
	private String address;
	private int id;
	private String type;
	private String price;
	private boolean available;
	private String owner;
	private String contact;
	
	public Property(String address, int id, 
			String type, String price, boolean available, 
			String owner, String contact) {
		this.address = address;
		this.id = id;
		this.type = type;
		this.price = price;
		this.available = available;
		this.owner = owner;
		this.contact = contact;
	}
	//Overriding 'toString' method of java.lang class
	@Override
	public String toString() {
		return "Location: " + address + ", Type: " + type 
				+ ", Price: " + price + ", Available: " + available
					 + ", Owner Name: " + owner + ", Contact: " + contact +" |\n";
//		"Location: " + address + "\nType: " + type + 
//			   "\nPrice: " + price + "\nAvailable: " + available
//			 + "\nOwner Name: " + owner + "\nContact: " + contact + "\n";
	}
}
