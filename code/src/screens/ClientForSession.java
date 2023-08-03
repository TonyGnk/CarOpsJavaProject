package screens;
import java.io.FileNotFoundException;

import CarOps.*;

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

public class ClientForSession extends DefScreen<Client> {
    private TableView<Client> table;
    private TableColumn<Client, String> firstNameCol;
    private TableColumn<Client, String> lastNameCol;
    private TableColumn<Client, Integer> phoneCol;
    private TableColumn<Client, String> addressCol;
    private TableColumn<Client, String> emailCol;
    private TableColumn<Client, Void> selectCol;
    private Button createButton;

    private SessionTable parentTable;

    public ClientForSession(Stage primaryStage, SessionTable parentTable) throws FileNotFoundException {
        super(primaryStage, "Πελάτες");

        this.parentTable = parentTable;

        // Create table columns
        firstNameCol = new TableColumn<>("Όνομα");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        lastNameCol = new TableColumn<>("Επώνυμο");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        phoneCol = new TableColumn<>("Τηλέφωνο");
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));

        addressCol = new TableColumn<>("Διεύθυνση");
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));

        emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        selectCol = new TableColumn<>("Επιλογή");
        selectCol.setCellFactory(ActionButtonTableCell.forTableColumn("Επιλογή", (Client client) -> {
            try {
				openSessionInput(primaryStage, client);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return client;
        }));

        // Add columns to the table
        table = new TableView<>();
        table.setItems(getClients());
        table.getColumns().addAll(firstNameCol, lastNameCol, phoneCol, addressCol, emailCol, selectCol);

        // Create add button
        createButton = new DefButtonOption("Δημιουργία");
        createButton.setOnAction(e -> {
            try {
				openClientInputScreen(primaryStage);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        addButtonToGroup(createButton);

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

    private void openClientInputScreen(Stage primaryStage) throws FileNotFoundException {
        ClientsInput clientInput = new ClientsInput(primaryStage, this);
        Stage clientInputStage = new Stage();
        clientInputStage.initOwner(primaryStage);
        clientInputStage.initModality(Modality.WINDOW_MODAL);
        clientInputStage.setScene(new Scene(clientInput));
        clientInputStage.showAndWait();
    }

    private void openSessionInput(Stage primaryStage, Client client) throws FileNotFoundException {
    	 Stage inputStage = (Stage) getScene().getWindow();
    	    
    	SessionInput sessionInput = new SessionInput(primaryStage, client, parentTable,inputStage);
        Stage sessionInputStage = new Stage();
        sessionInputStage.initOwner(primaryStage);
        sessionInputStage.initModality(Modality.WINDOW_MODAL);
        sessionInputStage.setScene(new Scene(sessionInput));
        sessionInputStage.show();
    }

    public void refreshTable() {
        table.setItems(getClients());
    }
}