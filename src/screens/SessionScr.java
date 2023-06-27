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

public class SessionScr extends DefScreenData {

    public SessionScr(Stage primaryStage, String Label) throws FileNotFoundException {
    	super(primaryStage, Label, Main.registry.Sessions);


        

        // Add the table to the VBox

        //DefScreen creation = new DefScreenInput(primaryStage, "Νέο Ραντεβού");
        //Button creationButton = new DefButtonOption(creation, "Νέο Ραντεβού");
        //addButtonToGroup(creationButton);
    }
}