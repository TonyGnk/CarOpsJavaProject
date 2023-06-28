 package CarOps;

public class Client {

	private String FirstName;
	private String LastName;
	private String Phone;
	private String Address;
	private String email;
	private int ClientID;

	public void PrintDetails() {
		System.out.println("First Name: "+ FirstName);
		System.out.println("LastName "+ LastName);
		System.out.println("Phone: "+ Phone);
		System.out.println("Address: "+ Address);
		System.out.println("email: "+ email);
		System.out.println("ClientID: "+ ClientID);
		
	}




	public Client(String firstName, String lastName, String phone, String address, String email) {

		super();
		FirstName = firstName;
		LastName = lastName;
		Phone = phone;
		Address = address;
		this.email = email;
		ClientID = Registry.Clients.size() + 1;
		Registry.Clients.add(this);
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getClientID() {
		return ClientID;
	}

	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	

}