package HouseRentalmanagementSystem;

public class Renter {
	private String name;
	private String email;
	private String phoneNumber;
	//private String password;
	//private Renting renting;
	
	public Renter(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		//this.password = password;
		//this.renting = renting;
	}
	
	public void seeProperty(int i) {
		Main.getAllproperty(i);
	}
}
