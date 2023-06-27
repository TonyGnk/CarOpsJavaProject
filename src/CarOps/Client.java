 package CarOps;

public class Client {

	private String FirstName;
	private String LastName;
	private int Phone;
	private String Address;
	private String email;
	private int ClientID;
	

	/**
	 * 
	 * @param FirstName
	 * @param LastName
	 * @param Phone
	 * @param Adress
	 * @param email
	 * @param ClientID
	 */

	public void PrintDetails() {
		System.out.println("First Name: "+ FirstName);
		System.out.println("LastName "+ LastName);
		System.out.println("Phone: "+ Phone);
		System.out.println("Address: "+ Address);
		System.out.println("email: "+ email);
		System.out.println("ClientID: "+ ClientID);
		
	}

	/**
	 * 
	 * @param FirstName
	 * @param LastName
	 * @param Phone
	 * @param Address
	 * @param email
	 */

	public Client(String firstName, String lastName, int phone, String address, String email) {
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

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
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