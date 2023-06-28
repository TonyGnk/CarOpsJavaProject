package screens;

import java.io.FileNotFoundException;

import CarOps.Client;
import CarOps.Registry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClientsTable extends DefScreen<Client> {
    private TableView<Client> table;
    private TableColumn<Client, String> firstNameCol;
    private TableColumn<Client, String> lastNameCol;
    private TableColumn<Client, Integer> phoneCol;
    private TableColumn<Client, String> addressCol;
    private TableColumn<Client, String> emailCol;
    private TableColumn<Client, Void> editCol;
    private TableColumn<Client, Void> deleteCol;

    public ClientsTable(Stage primaryStage) throws FileNotFoundException {
        super(primaryStage, "Πελάτες");

        // Create table columns
        firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("FirstName"));

        lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("LastName"));

        phoneCol = new TableColumn<>("Phone");
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("Phone"));

        addressCol = new TableColumn<>("Address");
        addressCol.setCellValueFactory(new PropertyValueFactory<>("Address"));

        emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("Email"));

        editCol = new TableColumn<>("Επεξεργασία");
        editCol.setCellFactory(ActionButtonTableCell.forTableColumn("Edit", (Client client) -> {
            try {
				openClientInputScreen(primaryStage,client);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return client;
        }));

        deleteCol = new TableColumn<>("Διαγραφή");
        deleteCol.setCellFactory(ActionButtonTableCell.forTableColumn("Delete", (Client client) -> {
            deleteClient(client);
            return client;
        }));

        // Add columns to the table
        table = new TableView<>();
        table.setItems(getClients());
        table.getColumns().addAll(firstNameCol, lastNameCol, phoneCol, addressCol, emailCol, editCol, deleteCol);

        // Create add button
        DefButtonOption addButton = new DefButtonOption("Δημιουργία");
        addButton.setOnAction(e -> {
			try {
				openClientInputScreen(primaryStage,null);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
        addButtonToGroup(addButton);

        // Create layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(table);

        // Set the content
        clearGroup();
        addButtonToGroup(layout);
    }

    public ObservableList<Client> getClients() {
        return FXCollections.observableArrayList(Registry.Clients);
    }

    /*private void openClientInputScreen(Stage primaryStage, Client client) throws FileNotFoundException {
        ClientsInput inputScreen = new ClientsInput(primaryStage, client, this);
        primaryStage.setScene(new Scene(inputScreen));
    }*/
    
    private void openClientInputScreen(Stage primaryStage, Client client) throws FileNotFoundException {
        ClientsInput inputScreen = new ClientsInput(primaryStage, client, this);
        Stage inputStage = new Stage();
        inputStage.initOwner(primaryStage);
        inputStage.initModality(Modality.WINDOW_MODAL);
        inputStage.setScene(new Scene(inputScreen));
        inputStage.showAndWait();
    }


    private void deleteClient(Client client) {
        Registry.Clients.remove(client);
        table.getItems().remove(client);
    }
    public void refreshTable() {
        table.setItems(getClients());
    }
    public void refreshTable(Client client) {
        int index = table.getItems().indexOf(client);
        if (index >= 0) {
            table.getItems().set(index, client);
        }
    }

}
