package CarOps;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String email;
    private int clientID;
    private StringProperty fullName;

    public Client(String firstName, String lastName, String phone, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.clientID = Registry.Clients.size() + 1;
        Registry.Clients.add(this);
        this.fullName = new SimpleStringProperty(firstName + " " + lastName);
    }

    public Client(String firstName, String lastName) {
        this(firstName, lastName, null, null, null);
    }

    public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Client ID: " + clientID);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public StringProperty fullNameProperty() {
        return fullName;
    }

    public String getFullName() {
        return fullName.get();
    }

    public void setFullName(String fullName) {
        this.fullName.set(fullName);
    }

    public static Client searchClientByName(String firstName) {
        for (Client client : Registry.Clients) {
            if (client.getFirstName().equalsIgnoreCase(firstName)) {
                return client;
            }
        }
        return null; // Client not found
    }
}
