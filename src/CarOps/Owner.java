//Tony DONE
package CarOps;

public class Owner extends SystemUser {

    private String type;

    public Owner(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        this.type = "Owner";
    }

    public String getType() { return type; }
}

	/*EXAMPLES
		System.out.println("Type: " + newUser.getType());
	 */
