package screens;

import java.io.FileNotFoundException;

import CarOps.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DefScreen extends VBox {
    protected VBox allContentBox;
    protected HBox contentBox;
    protected HBox closeButtonBox;

    public DefScreen(Stage primaryStage,String Label) throws FileNotFoundException {
        super();
        
        Label connectAsLabel = new DefTextHeader(Label);
       
        DefButtonOption backButton = new DefButtonOption("Έξοδος");                  
        backButton.setOnAction(e -> {
        	try {	
        		Scene scene = new Scene(new StartScr(primaryStage), Main.i, Main.j);
                scene.getRoot().setStyle(Main.backgroundColor);
                primaryStage.setScene(scene);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
        });      
        
        DefButtonOption closeButton = new DefButtonOption("Κλείσιμο");
        closeButton.setOnAction(e -> primaryStage.close());
        
        // Create a container for the buttons
        allContentBox = new VBox();
        allContentBox.setAlignment(Pos.CENTER);
        allContentBox.setMargin(connectAsLabel, new Insets(40));
        allContentBox.setSpacing(80);
        allContentBox.setPadding(new Insets(10));

        // Create a container for the buttons
        contentBox = new HBox();
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setSpacing(10);
        contentBox.setPadding(new Insets(10));                   

        // Create an HBox for the close button and center it
        closeButtonBox = new HBox();
        closeButtonBox.setSpacing(10);
        closeButtonBox.setPadding(new Insets(10)); 
        closeButtonBox.setAlignment(Pos.CENTER);
      
        
        closeButtonBox.getChildren().addAll(backButton, closeButton);
        allContentBox.getChildren().addAll(connectAsLabel, contentBox,closeButtonBox);

        getChildren().addAll(allContentBox);
    }
   

    protected void addButtonToGroup(Button button) {
    	contentBox.getChildren().add(button);
    }
    
    protected void addButtonToGroup(DefButtonStart button) {
    	contentBox.getChildren().add(button);
    }
    
    protected void addButtonToGroup(DefButtonOption button) {
    	contentBox.getChildren().add(button);
    }
}
