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


public class StartScr extends VBox {
    private VBox allContentBox;
    private HBox contentBox;
    private HBox closeButtonBox; // New HBox for the close button

    public StartScr(Stage primaryStage) throws FileNotFoundException {
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

        // Create the close button
        DefButtonHome closeButton = new DefButtonHome("N", "Κλείσιμο");
        closeButton.setOnAction(e -> primaryStage.close());

        Label connectAsLabel = new DefTextHeader("Ποιος θα χρησιμοποιήσει το CarOps?");

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

        //Δημιουργία μιας φωτογραφίας στο κέντρο της οθόνης που λέγεται user.png σε μέγεθος που να φαίνεται καλά και προσθήκη στην οθόνη
        Image image = new Image(new FileInputStream("src\\resources\\user.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        allContentBox.getChildren().add(imageView);
        

        

        // Add the label and the button container to the main VBox
        allContentBox.getChildren().addAll(connectAsLabel, contentBox);

        // Create an HBox for the close button and center it
        closeButtonBox = new HBox(closeButton);
        closeButtonBox.setAlignment(Pos.CENTER);


        // Add the image view, the main VBox, and the close button to the root VBox
        getChildren().addAll(allContentBox, closeButtonBox);
    }
}

