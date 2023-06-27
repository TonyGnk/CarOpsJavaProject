package screens;

import CarOps.Main;
import CarOps.Session;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.List;

public class DefScreenData<T> extends DefScreen {
	protected HBox tableBox;
	public DefScreenData(Stage primaryStage, String Label, List<T> data) throws FileNotFoundException {
        super(primaryStage, Label);

        TableView<T> table = new TableView<>();

        // Create the ObservableList from the ArrayList
        ObservableList<T> observableData = FXCollections.observableArrayList(data);
        table.setItems(observableData);

        // Create columns for the table
        TableColumn<T, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<T, String> dateColumn = new TableColumn<>("Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<T, String> plateColumn = new TableColumn<>("Plate");
        plateColumn.setCellValueFactory(new PropertyValueFactory<>("plate"));

        TableColumn<T, String> editColumn = new TableColumn<>("Επεξεργασία");
        editColumn.setCellFactory(param -> new TableCell<>() {
            final Button btn = new Button("Επεξεργασία");

            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    btn.setOnAction(event -> {
                        T session = getTableView().getItems().get(getIndex());
                        // Call your screen here passing the session data
                    });
                    setGraphic(btn);
                }
            }
        });

        table.getColumns().add(nameColumn);
        table.getColumns().add(dateColumn);
        table.getColumns().add(plateColumn);
        table.getColumns().add(editColumn);
        
        tableBox = new HBox();
    	tableBox.setSpacing(10);
    	tableBox.setAlignment(Pos.CENTER);
    	
        // Add the table to the VBox
        tableBox.getChildren().add(table);
        clearGroup();
        
        allContentBox.getChildren().removeAll();
        addButtonToGroup(tableBox);

    }
}
