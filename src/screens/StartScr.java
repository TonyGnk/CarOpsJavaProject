package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StartScr extends HBox {
    private HBox buttonGroup;

    public StartScr(Stage primaryStage) {
        super();
        this.setAlignment(Pos.CENTER);
        this.getStyleClass().add("screen");

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

        // Add the buttons to the button group
        buttonGroup = new HBox();
        buttonGroup.setAlignment(Pos.CENTER);
        buttonGroup.setSpacing(10);
        buttonGroup.setPadding(new Insets(10));

        buttonGroup.getChildren().addAll(
                gramateiaButton,
                idioktitisButton,
                mhhanikosYpodButton,
                mhhanikosButton,
                mhhanikosEpilepButton
        );

        this.getChildren().add(buttonGroup);
    }
}
