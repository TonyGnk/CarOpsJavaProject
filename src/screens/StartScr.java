package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class StartScr extends VBox {
    private VBox allContentBox;
    private HBox contentBox;

    public StartScr(Stage primaryStage) {
        super();
        // Create instances of user screen classes
        DefScreen gramateia = new UserSecretaryHome(primaryStage);
        DefScreen idioktitis = new UserOwnerHome(primaryStage);
        DefScreen mhhanikosYpod = new UserHostMechanicHome(primaryStage);
        DefScreen mhhanikos = new UserMechanicHome(primaryStage);
        DefScreen mhhanikosEpilep = new UserSupervisorHome(primaryStage);

        // Create buttons for each user type
        Button gramateiaButton = new DefButtonStart("Γραμματεία", gramateia);
        Button idioktitisButton = new DefButtonStart("Ιδιοκτήτης", idioktitis);
        Button mhhanikosYpodButton = new DefButtonStart("Μηχανικός Υποδοχής", mhhanikosYpod);
        Button mhhanikosButton = new DefButtonStart("Μηχανικός", mhhanikos);
        Button mhhanikosEpilepButton = new DefButtonStart("Επιβλέπων Μηχανικός", mhhanikosEpilep);

        
        //this.setAlignment(Pos.CENTER);
        
        Label connectAsLabel = new DefTextHeader("Ποιος θα χρησιμοποιήσει το CarOps;");
        
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

        // Add the buttons to the container
        contentBox.getChildren().addAll(
                gramateiaButton,
                idioktitisButton,
                mhhanikosYpodButton,
                mhhanikosButton,
                mhhanikosEpilepButton
        );
        
        // Add the label and the button container to the main VBox
        allContentBox.getChildren().addAll(connectAsLabel, contentBox);
        this.getChildren().add(allContentBox);
    }
}

