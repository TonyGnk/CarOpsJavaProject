//Tony - DONE
package CarOps;

public class SystemUser {

	private String username;
	private String password;
	private String firstName;
	private String lastName;

	public SystemUser(String username, String password, String firstName, String lastName) {
		this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
	}
	
	public void printDetails() {
		
		System.out.println("Username: " +username);
		System.out.println("Password: " +password);
		System.out.println("First Name: " +firstName);
		System.out.println("Last Name: " +lastName);
	}
			
	//Getters & Setters
	public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
			
	/*EXAMPLES
        //Setters
        newUser.setUsername("JaneDoe");
        newUser.setPassword("NewPassword123");
        newUser.setFirstName("Jane");
        newUser.setLastName("Doe");

        //Getters
        System.out.println("New Username: " + newUser.getUsername());
        System.out.println("New Password: " + newUser.getPassword());
        System.out.println("New First Name: " + newUser.getFirstName());
        System.out.println("New Last Name: " + newUser.getLastName()); 		
	*/