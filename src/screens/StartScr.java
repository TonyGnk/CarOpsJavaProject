package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartScr extends HBox {  
	public StartScr(Stage primaryStage) {
        super();
        this.setAlignment(Pos.CENTER);

        // Οι κλάσεις των χρηστών
        DefUserScreen gramateia = new UserSecretaryScr(primaryStage);
        DefUserScreen idioktitis = new UserOwnerScr(primaryStage);
        DefUserScreen mhhanikosYpod = new UserHostMechanicScr(primaryStage);
        DefUserScreen mhhanikos = new UserMechanicScr(primaryStage);
        DefUserScreen mhhanikosEpilep = new UserSupervisorScr(primaryStage);

        // Τα κουμπιά των χρηστών
        Button gramateiaButton = new DefButtonStart("Γραμματεία", gramateia);
        Button idioktitisButton = new DefButtonStart("Ιδιοκτήτης", idioktitis);
        Button mhhanikosYpodButton = new DefButtonStart("Μηχανικός Υποδοχής", mhhanikosYpod);
        Button mhhanikosButton = new DefButtonStart("Μηχανικός", mhhanikos);
        Button mhhanikosEpilepButton = new DefButtonStart("Επιβλέπων Μηχανικός", mhhanikosEpilep);

        // Προσθήκη των κουμπιών στην αρχική οθόνη
        this.getChildren().addAll(gramateiaButton, idioktitisButton, mhhanikosYpodButton, mhhanikosButton, mhhanikosEpilepButton);
    }
}
