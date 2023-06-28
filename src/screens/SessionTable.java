package screens;
import java.io.FileNotFoundException;

import CarOps.*;
import javafx.beans.property.SimpleStringProperty;
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

public class SessionTable extends DefScreen<Session> {
    private TableView<Session> table;
    private TableColumn<Session, String> nameCol;
    private TableColumn<Session, String> dateCol;
    private TableColumn<Session, String> plateCol;
    private TableColumn<Session, String> clientCol;
    private TableColumn<Session, Void> deleteCol;
    private Button createButton;

    public SessionTable(Stage primaryStage) throws FileNotFoundException {
        super(primaryStage, "Συνεδρίες");

        // Create table columns
        nameCol = new TableColumn<>("Όνομα");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        dateCol = new TableColumn<>("Ημερομηνία");
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        plateCol = new TableColumn<>("Πινακίδα");
        plateCol.setCellValueFactory(new PropertyValueFactory<>("plate"));

        clientCol = new TableColumn<>("Πελάτης");
        clientCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClient().getFullName()));

        deleteCol = new TableColumn<>("Διαγραφή");
        deleteCol.setCellFactory(ActionButtonTableCell.forTableColumn("Delete", (Session session) -> {
            deleteSession(session);
            return session;
        }));

        // Add columns to the table
        table = new TableView<>();
        table.setItems(getSessions());
        table.getColumns().addAll(nameCol, dateCol, plateCol, clientCol, deleteCol);

        // Create add button
        createButton = new DefButtonOption("Δημιουργία");
        createButton.setOnAction(e -> {
            try {
				openClientForSession(primaryStage);
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

    public ObservableList<Session> getSessions() {
        return FXCollections.observableArrayList(Registry.Sessions);
    }

    private void openClientForSession(Stage primaryStage) throws FileNotFoundException {
        ClientForSession clientForSession = new ClientForSession(primaryStage, this);
        Stage clientForSessionStage = new Stage();
        clientForSessionStage.initOwner(primaryStage);
        clientForSessionStage.initModality(Modality.WINDOW_MODAL);
        clientForSessionStage.setScene(new Scene(clientForSession));
        clientForSessionStage.showAndWait();
    }

    private void deleteSession(Session session) {
        Registry.Sessions.remove(session);
        table.getItems().remove(session);
    }

    public void refreshTable() {
        table.setItems(getSessions());
    }

    public void refreshTable(Session session) {
        int index = table.getItems().indexOf(session);
        if (index >= 0) {
            table.getItems().set(index, session);
        }
    }
}
