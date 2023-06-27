package screens;

import CarOps.*;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DefScreenInput<T extends Client> extends DefScreen {
    private TextField[] inputFields;
    private Button submitButton;
    private List<T> data;
    private Class<T> clazz;

    public DefScreenInput(Stage primaryStage, String label, List<T> data) throws FileNotFoundException {
        super(primaryStage, label);
        this.data = data;

        clazz = (Class<T>) data.get(0).getClass();

        VBox form = new VBox(10);
        form.setAlignment(Pos.CENTER);

        // Create input fields dynamically based on the object's fields
        if (!data.isEmpty()) {
            T firstObject = data.get(0);
            Field[] fields = firstObject.getClass().getDeclaredFields();
            inputFields = new TextField[fields.length];

            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                String fieldName = field.getName();

                Label labelField = new Label(fieldName);
                TextField textField = new TextField();
                textField.setPromptText(fieldName);

                inputFields[i] = textField;

                HBox inputBox = new HBox(10);
                inputBox.setAlignment(Pos.CENTER);
                inputBox.getChildren().addAll(labelField, textField);

                form.getChildren().add(inputBox);
            }
        }

        submitButton = new Button("Τέλος");
        submitButton.setOnAction(e -> submitForm());

        form.getChildren().add(submitButton);

        clearGroup();
        addGroupToGroup(form);
    }

    private void submitForm() {
        try {
            T object = clazz.getDeclaredConstructor().newInstance();
            Field[] fields = object.getClass().getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
                field.set(object, inputFields[i].getText());
            }

            Main.registry.AddNewItem(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
