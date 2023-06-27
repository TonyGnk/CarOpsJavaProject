package screens;

import CarOps.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.TextField;

import java.lang.reflect.Field;

public class DefScreenData<T> extends DefScreen {
	protected VBox inputFieldsBox;  // the VBox that will hold the input fields
    protected List<TextField> inputFields;  // list of TextField that represent the class T fields
	protected HBox tableBox;
	public DefScreenData(Stage primaryStage, String Label, List<T> data) throws FileNotFoundException {
        super(primaryStage, Label);

        TableView<T> table = new TableView<>();
        Label placeholder = new Label("Δεν υπάρχουν στοιχεία");
        table.setPlaceholder(placeholder);
        
        // Create the ObservableList from the ArrayList
        ObservableList<T> observableData = FXCollections.observableArrayList(data);
        table.setItems(observableData);

        // Get class of T
        final Class<?>[] clazz = new Class<?>[1];
        if (!data.isEmpty()) {
            clazz[0] = data.get(0).getClass();
        }

        // Create columns for the table dynamically
        if (clazz[0] != null) {
            for (Field field : clazz[0].getDeclaredFields()) {
                String fieldName = field.getName();
                TableColumn<T, String> column = new TableColumn<>(fieldName);
                column.setCellValueFactory(new PropertyValueFactory<>(fieldName));
                table.getColumns().add(column);
            }
        }
        
        inputFieldsBox = new VBox();
        inputFields = new ArrayList<>();
        for (TableColumn<T, ?> column : table.getColumns()) {
            TextField textField = new TextField();
            textField.setPromptText(column.getText());
            inputFieldsBox.getChildren().add(textField);
            inputFields.add(textField);
        }
        
        table.setPrefWidth(600); // Set the preferred width of the table
        table.setStyle("-fx-border-width: 1px; -fx-background-radius: 2px; -fx-border-color: rgb(69, 90, 100);"); // Set rounded corners style

        tableBox = new HBox();
    	tableBox.setSpacing(10);
    	tableBox.setAlignment(Pos.CENTER);
    	
        // Add the table to the VBox
        tableBox.getChildren().add(table);
        clearGroup();
        
        allContentBox.getChildren().removeAll();
        addButtonToGroup(tableBox);

        
        DefButtonOption createEntryButton = new DefButtonOption("Αποθήκευση");
        createEntryButton.setOnAction(e -> {
            try {
                T newEntry = (T) clazz[0].getConstructor().newInstance();
                for (int i = 0; i < clazz[0].getDeclaredFields().length; i++) {
                    Field field = clazz[0].getDeclaredFields()[i];
                    String fieldName = field.getName();
                    TextField inputField = inputFields.get(i);
                    String fieldValue = inputField.getText();

                    clazz[0].getMethod("set" + capitalizeFirstLetter(fieldName), String.class).invoke(newEntry, fieldValue);
                }
                observableData.add(newEntry);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
       
        
        
        DefScreen input = new DefScreen(primaryStage,"Δημιουργία");
        //addGroupToGroup(inputFieldsBox);
        DefButtonOption button = new DefButtonOption(input,"Δημιουργία");
        input.clearGroup();
        input.addButtonToGroup(inputFieldsBox);
        input.addButtonToGroup(createEntryButton);
        
        addButtonToGroup(button);	
    }

    public DefScreenInput addButtonInScrData(Stage primaryStage, String string,List<T> data) throws FileNotFoundException {
		DefScreenInput screen = new DefScreenInput(primaryStage,string,data); 
		DefButtonOption button = new DefButtonOption(screen,string);
		addButtonToGroup(button);	
		
		return screen;
	}
    
    private String capitalizeFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
