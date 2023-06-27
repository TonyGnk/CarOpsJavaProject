package screens;

import java.io.FileNotFoundException;
import java.util.List;

import CarOps.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DefScreen<T> extends VBox {
    protected VBox allContentBox;
    protected HBox contentBoxLarge;
    protected HBox contentBox;
    protected Label connectAsLabel;

    public DefScreen (Stage primaryStage,String Label) throws FileNotFoundException {
        super();
        
        connectAsLabel = new DefTextHeader(Label);
       
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
        
        
        // Create a container for the buttons
        allContentBox = new VBox();
        allContentBox.setAlignment(Pos.TOP_CENTER);
        //allContentBox.setStyle(Main.backgroundColor2+"-fx-border-width: 3px;"+"-fx-border-radius: 10px; -fx-background-radius:10px; -fx-border-color: rgb(207, 216, 220);");
        
        allContentBox.setStyle(Main.backgroundColor2+"-fx-border-width: 3px;"+"-fx-border-radius: 10px; -fx-background-radius:10px; -fx-border-color: rgb(176, 190, 197);");

        
        allContentBox.setPadding(new Insets(10));
        VBox.setVgrow(allContentBox, Priority.ALWAYS);
        
        //allContentBox.setSpacing(80);
        //allContentBox.setPadding(new Insets(10));

        // Create a container for the buttons
        contentBox = new HBox();
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setSpacing(10);
        //contentBox.setPadding(new Insets(0,0,40,0)); 
        //contentBox.setPadding(new Insets(10)); 
        
        // Create a container for the buttons
        contentBoxLarge = new HBox();
        contentBoxLarge.setAlignment(Pos.CENTER);
        //contentBoxLarge.setPadding(new Insets(70,0,0,0)); 
        
        // Create an HBox for the close button and center it   
         
    	
    	
    	//allContentBox.setSpacing(80);
        allContentBox.setMargin(connectAsLabel, new Insets(40,0,00,0));
        allContentBox.setMargin(contentBoxLarge, new Insets(90,0,90,0));
        allContentBox.setMargin(contentBox, new Insets(5,0,0,0));
    	connectAsLabel.setPadding(new Insets(0,10,0,10));
    	contentBoxLarge.setPadding(new Insets(10));
    	contentBoxLarge.setSpacing(10);
    	contentBox.setPadding(new Insets(10));
        
        contentBox.getChildren().addAll(backButton);
        allContentBox.getChildren().addAll(connectAsLabel,contentBoxLarge,contentBox);
        
        VBox.setMargin(allContentBox, new Insets(6));
        getChildren().addAll(allContentBox);
    }
    
    
    
    
    
   

    protected void addButtonToGroup(Button button) {
    	contentBox.getChildren().add(button);
    }
    
    protected void addButtonToGroup(DefButtonStart button) {
    	contentBoxLarge.getChildren().add(button);
    }
    
    protected void addButtonToGroup(DefButtonOption button) {
    	contentBox.getChildren().add(button);
    }
    protected void clearGroup() {
    	allContentBox.getChildren().clear();
    }
    
    protected void addButtonToGroup(HBox button) {
    	allContentBox.setMargin(button, new Insets(5,0,0,0));
    	allContentBox.getChildren().addAll(connectAsLabel,button,contentBox);
    }
    protected void addButtonToGroup(VBox button) {
    	allContentBox.setMargin(button, new Insets(5,0,0,0));
    	allContentBox.getChildren().addAll(connectAsLabel,button,contentBox);
    }
    
    protected void addGroupToGroup(VBox button) {
    	allContentBox.getChildren().addAll(connectAsLabel,button,contentBox);
    }
    

    

	public DefScreen addButtonInScr(Stage primaryStage, String string) throws FileNotFoundException {
		DefScreen screen = new DefScreen(primaryStage,string); 
		DefButtonStart button = new DefButtonStart(screen,string);
		contentBoxLarge.getChildren().add(button);	
		return screen;
	}
	public DefScreenData addButtonInScr(Stage primaryStage,DefStartScreen backscreen, String string,List<T> data) throws FileNotFoundException {
		DefScreenData screen = new DefScreenData(primaryStage,string,data); 
		DefButtonStart button = new DefButtonStart(screen,string);
		
		contentBoxLarge.getChildren().add(button);		
		return screen;
	}
	public DefScreenInput addButtonInScr(Stage primaryStage, String string,List<T> data, String input) throws FileNotFoundException {
		DefScreenInput screen = new DefScreenInput(primaryStage,string,data); 
		DefButtonStart button = new DefButtonStart(screen,string);
		contentBoxLarge.getChildren().add(button);	
		return screen;
	}
	
	
}
