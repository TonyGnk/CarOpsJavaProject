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

public class SessionScr extends DefScreen {

    public SessionScr(Stage primaryStage, String Label) throws FileNotFoundException {
        super(primaryStage, Label);

        TableView<Session> table = new TableView<>();
        table.getStyleClass().add("my-table");//!!

        // Create the ObservableList from the ArrayList
        ObservableList<Session> data = FXCollections.observableArrayList(Main.registry.Sessions);
        table.setItems(data);

        // Create columns for the table
        TableColumn<Session, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Session, String> dateColumn = new TableColumn<>("Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<Session, String> plateColumn = new TableColumn<>("Plate");
        plateColumn.setCellValueFactory(new PropertyValueFactory<>("plate"));


        TableColumn<Session, String> editColumn = new TableColumn<>("Επεξεργασία");
        editColumn.setCellFactory(param -> new TableCell<>() {
            final Button btn = new Button("Επεξεργασία");

            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    btn.setOnAction(event -> {
                        Session session = getTableView().getItems().get(getIndex());
                        // Call your screen here passing the session data
                    });
                    setGraphic(btn);
                }
            }
        });




        table.getColumns().add(nameColumn);
        table.getColumns().add(dateColumn);
        table.getColumns().add(plateColumn);
        table.getColumns().add(editColumn);//!!

        

        // Add the table to the VBox
        contentBox.getChildren().add(table);
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setSpacing(10);
        contentBox.setPadding(new Insets(10));

        DefScreen creation = new CreateSessionScr(primaryStage, "Νέο Ραντεβού");
        Button creationButton = new DefButtonOption(creation, "Νέο Ραντεβού");
        addButtonToGroup(creationButton);
    }
}