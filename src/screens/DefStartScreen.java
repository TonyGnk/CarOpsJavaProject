package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class DefStartScreen extends VBox {
	protected VBox allContentBox;
	protected HBox contentBox;
	protected HBox closeButtonBox; // New HBox for the close button

    public DefStartScreen(Stage primaryStage) throws FileNotFoundException {
        super();

        Label connectAsLabel = new DefTextHeader("Ποιος θα χρησιμοποιήσει το CarOps? BETA");
        DefButtonOption closeButton = new DefButtonOption("Κλείσιμο");
        closeButton.setOnAction(e -> primaryStage.close());
        
        // Create a container for the buttons
        allContentBox = new VBox();
        allContentBox.setAlignment(Pos.CENTER);  // Align the big box in the center vertically
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

        closeButtonBox.getChildren().add(closeButton);
        allContentBox.getChildren().addAll(connectAsLabel,contentBox,closeButtonBox);
        
        getChildren().addAll(allContentBox);
    }
    protected void addButtonToGroup(Button button) {
        contentBox.getChildren().add(button);
    }
}

