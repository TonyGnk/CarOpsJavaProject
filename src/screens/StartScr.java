package screens;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class StartScr extends DefStartScreen {
	
    public StartScr(Stage primaryStage) throws FileNotFoundException {
        super(primaryStage);
        
        // Create instances of user screen classes
        //DefStartScreen d = new DefStartScreen(primaryStage);
        DefScreen gramateia = new UserSecretaryHome(primaryStage,"Γραμματεία");
        //DefScreen idioktitis = new UserOwnerHome(primaryStage);
        //DefScreen mhhanikosYpod = new UserHostMechanicHome(primaryStage);
        //DefScreen mhhanikos = new UserMechanicHome(primaryStage);
        //DefScreen mhhanikosEpilep = new UserSupervisorHome(primaryStage);
		
        // Create buttons for each user type
        DefButtonStart gramateiaButton = new DefButtonStart(gramateia,"Γραμματεία");
        //Button idioktitisButton = new DefButtonStart("Ιδιοκτήτης", idioktitis);
        //Button mhhanikosYpodButton = new DefButtonStart("Μηχανικός Υποδοχής", mhhanikosYpod);
        //Button mhhanikosButton = new DefButtonStart("Μηχανικός", mhhanikos);
        //Button mhhanikosEpilepButton = new DefButtonStart("Επιβλέπων Μηχανικός", mhhanikosEpilep);

        addButtonToGroup(gramateiaButton);
        //addButtonToGroup(idioktitisButton);
        //addButtonToGroup(mhhanikosYpodButton);
        //addButtonToGroup(mhhanikosButton);
        //addButtonToGroup(mhhanikosEpilepButton);

    }
}

