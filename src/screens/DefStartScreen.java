package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import CarOps.Main;


public class DefStartScreen extends VBox {
	protected VBox allContentBox;
	protected HBox contentBoxLarge;
	protected HBox contentBox;

    public DefStartScreen(Stage primaryStage) throws FileNotFoundException {
        super();

        Label connectAsLabel = new DefTextHeader("Ποιος θα χρησιμοποιήσει το CarOps? BETA");
        DefButtonOption closeButton = new DefButtonOption("Κλείσιμο");
        closeButton.setOnAction(e -> primaryStage.close());
        
        // Create a container for the buttons
        allContentBox = new VBox();
        allContentBox.setAlignment(Pos.TOP_CENTER);  // Align the big box in the center vertically       
        allContentBox.setStyle(Main.backgroundColor2+"-fx-border-width: 3px;"+"-fx-border-radius: 10px; -fx-background-radius:10px; -fx-border-color: rgb(176, 190, 197);");
        allContentBox.setPadding(new Insets(10));
        VBox.setVgrow(allContentBox, Priority.ALWAYS);

        // Create a container for the buttons
        contentBox = new HBox();
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setSpacing(10);                  
        
        contentBoxLarge = new HBox();
        contentBoxLarge.setAlignment(Pos.CENTER);
   
        connectAsLabel.setPadding(new Insets(0,10,0,10));
    	contentBoxLarge.setPadding(new Insets(10));
    	contentBox.setPadding(new Insets(10));
        allContentBox.setMargin(connectAsLabel, new Insets(40,0,00,0));
        allContentBox.setMargin(contentBoxLarge, new Insets(90,0,90,0));
        allContentBox.setMargin(contentBox, new Insets(5,0,0,0));
        
        
        contentBox.getChildren().add(closeButton);
        allContentBox.getChildren().addAll(connectAsLabel,contentBoxLarge,contentBox);       
        
        VBox.setMargin(allContentBox, new Insets(6));
        getChildren().addAll(allContentBox);
    }
    protected void addButtonToGroup(DefButtonStart button) {
    	contentBoxLarge.getChildren().add(button);
    }
}

