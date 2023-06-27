package screens;

import CarOps.*;


import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateSessionScr extends DefScreen {
    TextField nameField, plateField, dateField;
    Button submitButton;

    public CreateSessionScr(Stage primaryStage,String Label) throws FileNotFoundException {
        super(primaryStage,Label);

        VBox form = new VBox(10);
        form.setAlignment(Pos.CENTER);

        nameField = new TextField();
        nameField.setPromptText("Name");
        plateField = new TextField();
        plateField.setPromptText("Plate");
        dateField = new TextField();
        dateField.setPromptText("Date");

        submitButton = new Button("Τέλος");
        submitButton.setOnAction(e -> submitForm());

        form.getChildren().addAll(nameField, plateField, dateField, submitButton);

        this.getChildren().add(form);
    }

    private void submitForm() {
        String name = nameField.getText();
        String plate = plateField.getText();
        String date = dateField.getText();

        Main.registry.addNewItem(name, date, plate);
    }
}
