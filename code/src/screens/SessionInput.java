package screens;
import java.io.FileNotFoundException;

import CarOps.*;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SessionInput extends DefScreen<Session> {
    private TextField nameField;
    private TextField dateField;
    private TextField plateField;
    private Button saveButton;

    private Client client;
    private SessionTable parentTable;

    public SessionInput(Stage primaryStage, Client client, SessionTable parentTable, Stage p) throws FileNotFoundException {
        super(primaryStage, "Εισαγωγή Συνεδρίας");
        p.close();
        this.client = client;
        this.parentTable = parentTable;

        Label nameLabel = new Label("Όνομα:");
        Label dateLabel = new Label("Ημερομηνία:");
        Label plateLabel = new Label("Πινακίδα:");

        nameField = new TextField();
        dateField = new TextField();
        plateField = new TextField();

        saveButton = new DefButtonOption("Αποθήκευση");
        saveButton.setOnAction(e -> createSession(primaryStage));

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(dateLabel, 0, 1);
        gridPane.add(dateField, 1, 1);
        gridPane.add(plateLabel, 0, 2);
        gridPane.add(plateField, 1, 2);

        addButtonToGroupPop(saveButton);
        clearGroup();
        addButtonToGroup(gridPane);
    }
    

    private void createSession(Stage primaryStage) {
        String name = nameField.getText();
        String date = dateField.getText();
        String plate = plateField.getText();

        Session session = new Session(name, date, plate, client);
        parentTable.getSessions().add(session);
        parentTable.refreshTable();
        Stage inputStage = (Stage) getScene().getWindow();
        inputStage.close();
    }
}