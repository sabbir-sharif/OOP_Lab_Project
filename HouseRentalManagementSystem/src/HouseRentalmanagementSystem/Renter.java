package HouseRentalmanagementSystem;

public class Renter {
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	//private Renting renting;
	
	public Renter(String name, String email, String password, String phoneNumber, Renting renting) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		//this.renting = renting;
	}
	
	
}
