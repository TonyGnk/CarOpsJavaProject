package screens;

import java.io.FileNotFoundException;

import CarOps.Registry;
import CarOps.Vehicle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VehicleInput extends DefScreen<Vehicle> {
    private TextField plateField;
    private TextField brandField;
    private TextField modelField;
    private TextField prodYearField;
    private Button createButton;

    private Vehicle vehicle;
    private VehicleTable parentTable;

    public VehicleInput(Stage primaryStage, Vehicle vehicle, VehicleTable parentTable) throws FileNotFoundException {
        super(primaryStage, "Επεξεργασία");

        this.vehicle = vehicle;
        this.parentTable = parentTable;

        Label plateLabel = new Label("Plate:");
        Label brandLabel = new Label("Brand:");
        Label modelLabel = new Label("Model:");
        Label prodYearLabel = new Label("Production Year:");

        plateField = new TextField();
        brandField = new TextField();
        modelField = new TextField();
        prodYearField = new TextField();

        createButton = new DefButtonOption("Αποθήκευση");
        createButton.setOnAction(e -> createOrUpdateVehicle(primaryStage));

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));

        gridPane.add(plateLabel, 0, 0);
        gridPane.add(plateField, 1, 0);
        gridPane.add(brandLabel, 0, 1);
        gridPane.add(brandField, 1, 1);
        gridPane.add(modelLabel, 0, 2);
        gridPane.add(modelField, 1, 2);
        gridPane.add(prodYearLabel, 0, 3);
        gridPane.add(prodYearField, 1, 3);
        gridPane.add(createButton, 0, 4, 2, 1);
        addButtonToGroupPop(createButton);

        if (vehicle != null) {
            fillFieldsWithVehicleData();
        }

        clearGroup();
        addButtonToGroup(gridPane);
    }

    private void fillFieldsWithVehicleData() {
        plateField.setText(vehicle.getPlate());
        brandField.setText(vehicle.getBrand());
        modelField.setText(vehicle.getModel());
        prodYearField.setText(String.valueOf(vehicle.getProdYear()));
    }

    private void createOrUpdateVehicle(Stage primaryStage) {
        String plate = plateField.getText();
        String brand = brandField.getText();
        String model = modelField.getText();
        int prodYear = Integer.parseInt(prodYearField.getText());

        if (vehicle == null) {
            vehicle = new Vehicle(plate, brand, model, prodYear);
            Registry.Vehicles.add(vehicle);
        } else {
            vehicle.setPlate(plate);
            vehicle.setBrand(brand);
            vehicle.setModel(model);
            vehicle.setProdYear(prodYear);
        }
        parentTable.refreshTable(vehicle);
        parentTable.refreshTable();
        Stage inputStage = (Stage) createButton.getScene().getWindow();
        inputStage.close();
    }
}
