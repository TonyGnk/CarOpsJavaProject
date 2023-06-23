package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StartScr extends HBox {
    public StartScr(Stage primaryStage) {
        super();
        this.setAlignment(Pos.CENTER);

        // Οι κλάσεις των χρηστών
        UserScreen gramateia = new GramateiaScreen(primaryStage);
        UserScreen idioktitis = new IdioktitisScreen(primaryStage);
        UserScreen mhhanikosYpod = new MhhanikosYpodScreen(primaryStage);
        UserScreen mhhanikos = new MhhanikosScreen(primaryStage);
        UserScreen mhhanikosEpilep = new MhhanikosEpilepScreen(primaryStage);

        // Τα κουμπιά των χρηστών
        Button gramateiaButton = new UserButton("Γραμματεία", gramateia);
        Button idioktitisButton = new UserButton("Ιδιοκτήτης", idioktitis);
        Button mhhanikosYpodButton = new UserButton("Μηχανικός Υποδοχής", mhhanikosYpod);
        Button mhhanikosButton = new UserButton("Μηχανικός", mhhanikos);
        Button mhhanikosEpilepButton = new UserButton("Επιβλέπων Μηχανικός", mhhanikosEpilep);

        // Προσθήκη των κουμπιών στην αρχική οθόνη
        this.getChildren().addAll(gramateiaButton, idioktitisButton, mhhanikosYpodButton, mhhanikosButton, mhhanikosEpilepButton);
    }
}
