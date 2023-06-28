package screens;

import java.io.FileNotFoundException;

import CarOps.Client;
import CarOps.Registry;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClientsInput extends DefScreen<Client> {
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField phoneField;
    private TextField addressField;
    private TextField emailField;
    private Button createButton;

    private Client client;
    private ClientsTable parentTable;

    public ClientsInput(Stage primaryStage, Client client, ClientsTable parentTable) throws FileNotFoundException {
        super(primaryStage, "Client Input");

        this.client = client;
        this.parentTable = parentTable;

        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label phoneLabel = new Label("Phone:");
        Label addressLabel = new Label("Address:");
        Label emailLabel = new Label("Email:");

        firstNameField = new TextField();
        lastNameField = new TextField();
        phoneField = new TextField();
        addressField = new TextField();
        emailField = new TextField();

        createButton = new DefButtonOption("Αποθήκευση");
        createButton.setOnAction(e -> createOrUpdateClient(primaryStage));

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));

        gridPane.add(firstNameLabel, 0, 0);
        gridPane.add(firstNameField, 1, 0);
        gridPane.add(lastNameLabel, 0, 1);
        gridPane.add(lastNameField, 1, 1);
        gridPane.add(phoneLabel, 0, 2);
        gridPane.add(phoneField, 1, 2);
        gridPane.add(addressLabel, 0, 3);
        gridPane.add(addressField, 1, 3);
        gridPane.add(emailLabel, 0, 4);
        gridPane.add(emailField, 1, 4);
        gridPane.add(createButton, 0, 5, 2, 1);
        addButtonToGroupPop(createButton);
        
        if (client != null) {
            fillFieldsWithClientData();
        }

        clearGroup();
        addButtonToGroup(gridPane);
    }

    private void fillFieldsWithClientData() {
        firstNameField.setText(client.getFirstName());
        lastNameField.setText(client.getLastName());
        phoneField.setText(String.valueOf(client.getPhone()));
        addressField.setText(client.getAddress());
        emailField.setText(client.getEmail());
    }

    private void createOrUpdateClient(Stage primaryStage) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();
        String email = emailField.getText();

        if (client == null) {
            client = new Client(firstName, lastName, phone, address, email);
            parentTable.getClients().add(client);
        } else {
            client.setFirstName(firstName);
            client.setLastName(lastName);
            client.setPhone(phone);
            client.setAddress(address);
            client.setEmail(email);
        }
        parentTable.refreshTable(client);
        parentTable.refreshTable();
        Stage inputStage = (Stage) createButton.getScene().getWindow();
        inputStage.close();      
    }
}
