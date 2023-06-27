package screens;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

import CarOps.*;

public class StartScr extends DefStartScreen {
	
    public StartScr(Stage primaryStage) throws FileNotFoundException {
        super(primaryStage);
        
        //Γραμματεία
        Session s = new Session("Παράδειγμα", "Παραδείγματος", "Παράδειγμα", 3);
        DefScreen gramateia = addButtonInScrFirst(primaryStage,"Γραμματεία");
        	DefScreenData rantevou = gramateia.addButtonInScr(primaryStage,this,"Ραντεβού",Main.registry.Sessions);
        		//DefScreenInput newrantevou = rantevou.addButtonInScrData(primaryStage,"Νέο Ραντεβού",Main.registry.Sessions);
        	DefScreenData pelates = gramateia.addButtonInScr(primaryStage,this,"Πελάτες",Main.registry.Clients);	
        	DefScreenData oximata = gramateia.addButtonInScr(primaryStage,this,"Οχήματα",Main.registry.Vehicles);	
        
        	
        //Ιδιοκτήτης	
        DefScreen owner = addButtonInScrFirst(primaryStage,"Ιδιοκτήτης");
        	DefScreenData Anafores = owner.addButtonInScr(primaryStage,this,"Αναφορές",Main.registry.Reports);
        
        	
        //Υποδοχής	
        DefScreen hostmechanic = addButtonInScrFirst(primaryStage,"Μηχανικός Υποδοχής");
        	DefScreenData Fakeloi = hostmechanic.addButtonInScr(primaryStage,this,"Φάκελοι Επισκευής",Main.registry.RepairFolders);
        	DefScreenData listaerg = hostmechanic.addButtonInScr(primaryStage,this,"Λίστα Εργασιών",Main.registry.TaskAssignments);
        
        	
        //Επιβλέπων	
        DefScreen supmechanic = addButtonInScrFirst(primaryStage,"Επιβλέπων Μηχανικός");
        	DefScreenData Antalaktika = supmechanic.addButtonInScr(primaryStage,this,"Ανταλλακτικά",Main.registry.RepairFolders);//Δεν είμαι σίγουρος, Νίκο έλεγξε το αν είναι το σωστό arraylist
        	DefScreenData diaxeirisiep = supmechanic.addButtonInScr(primaryStage,this,"Διαχείριση Επισκευών",Main.registry.Repairs);//Επίσης
        
        
        //Μηχανικός	
        DefScreen mechanic = addButtonInScrFirst(primaryStage,"Μηχανικός");
        	DefScreenData probolianatheseon = mechanic.addButtonInScr(primaryStage,this,"Προβολή Αναθέσεων",Main.registry.TaskAssignments);//Επίσης	
        
    }
    
    public DefScreen addButtonInScrFirst(Stage primaryStage, String string) throws FileNotFoundException {
        DefScreen screen = new DefScreen(primaryStage,string); 
        DefButtonStart button = new DefButtonStart(screen,string);
        contentBoxLarge.getChildren().add(button);    
        return screen;
    }



}

