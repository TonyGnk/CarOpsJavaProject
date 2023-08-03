package screens;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import CarOps.Registry;
import CarOps.Vehicle;
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

public class VehicleTable extends DefScreen<Vehicle> {
    private TableView<Vehicle> table;
    private TableColumn<Vehicle, String> plateCol;
    private TableColumn<Vehicle, String> brandCol;
    private TableColumn<Vehicle, String> modelCol;
    private TableColumn<Vehicle, Integer> prodYearCol;
    private TableColumn<Vehicle, Void> editCol;
    private TableColumn<Vehicle, Void> deleteCol;

    public VehicleTable(Stage primaryStage) throws FileNotFoundException {
        super(primaryStage, "Οχήματα");

        // Create table columns
        plateCol = new TableColumn<>("Plate");
        plateCol.setCellValueFactory(new PropertyValueFactory<>("Plate"));

        brandCol = new TableColumn<>("Brand");
        brandCol.setCellValueFactory(new PropertyValueFactory<>("Brand"));

        modelCol = new TableColumn<>("Model");
        modelCol.setCellValueFactory(new PropertyValueFactory<>("Model"));

        prodYearCol = new TableColumn<>("Production Year");
        prodYearCol.setCellValueFactory(new PropertyValueFactory<>("ProdYear"));

        editCol = new TableColumn<>("Επεξεργασία");
        editCol.setCellFactory(ActionButtonTableCell.forTableColumn("Edit", (Vehicle vehicle) -> {
            try {
                openVehicleInputScreen(primaryStage, vehicle);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return vehicle;
        }));

        deleteCol = new TableColumn<>("Διαγραφή");
        deleteCol.setCellFactory(ActionButtonTableCell.forTableColumn("Delete", (Vehicle vehicle) -> {
            deleteVehicle(vehicle);
            return vehicle;
        }));

        // Add columns to the table
        table = new TableView<>();
        table.setItems(getVehicles());
        table.getColumns().addAll(plateCol, brandCol, modelCol, prodYearCol, editCol, deleteCol);

        // Create add button
        DefButtonOption addButton = new DefButtonOption("Δημιουργία");
        addButton.setOnAction(e -> {
            try {
                openVehicleInputScreen(primaryStage, null);
            } catch (Exception e1) {
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

    public ObservableList<Vehicle> getVehicles() {
        return FXCollections.observableArrayList(Registry.Vehicles);
    }

    private void openVehicleInputScreen(Stage primaryStage, Vehicle vehicle) throws Exception {
        VehicleInput inputScreen = new VehicleInput(primaryStage, vehicle, this);
        Stage inputStage = new Stage();
        inputStage.initOwner(primaryStage);
        inputStage.initModality(Modality.WINDOW_MODAL);
        inputStage.setScene(new Scene(inputScreen));
        inputStage.showAndWait();
    }

    private void deleteVehicle(Vehicle vehicle) {
        Registry.Vehicles.remove(vehicle);
        table.getItems().remove(vehicle);
    }

    public void refreshTable() {
        table.setItems(getVehicles());
    }

    public void refreshTable(Vehicle vehicle) {
        int index = table.getItems().indexOf(vehicle);
        if (index >= 0) {
            table.getItems().set(index, vehicle);
        }
    }
}
