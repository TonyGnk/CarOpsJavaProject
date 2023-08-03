package screens;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

import CarOps.*;

public class StartScr extends DefStartScreen {
	
    public StartScr(Stage primaryStage) throws FileNotFoundException {
        super(primaryStage);
        
        //Γραμματεία
        DefScreen gramateia = addButtonInScrFirst(primaryStage,"Γραμματεία");      	       	
        	
        	//Ραντεβού
        	DefScreen rante = new SessionTable(primaryStage); 
    		DefButtonStart rantebutton = new DefButtonStart(rante,"Ραντεβού");
    		gramateia.contentBoxLarge.getChildren().add(rantebutton);	
        	
        	//Οχήματα
        	DefScreen vehic = new VehicleTable(primaryStage); 
    		DefButtonStart vehicbutton = new DefButtonStart(vehic,"Οχήματα");
    		gramateia.contentBoxLarge.getChildren().add(vehicbutton);
        	
        	//Πελάτες
        	DefScreen clientable = new ClientsTable(primaryStage); 
    		DefButtonStart button = new DefButtonStart(clientable,"Πελάτες");
    		gramateia.contentBoxLarge.getChildren().add(button);
        
    		
        //Ιδιοκτήτης	
        DefScreen owner = addButtonInScrFirst(primaryStage,"Ιδιοκτήτης");
        	DefScreenData Anafores = owner.addButtonInScr(primaryStage,this,"Αναφορές",Main.registry.Reports);
        
        	
        //Υποδοχής	
        DefScreen hostmechanic = addButtonInScrFirst(primaryStage,"Μηχανικός Υποδοχής");
        	DefScreenData Fakeloi = hostmechanic.addButtonInScr(primaryStage,this,"Φάκελοι Επισκευής",Main.registry.RepairFolders);
        	DefScreenData listaerg = hostmechanic.addButtonInScr(primaryStage,this,"Λίστα Εργασιών",Main.registry.TaskAssignments);
        
        	
        //Επιβλέπων	
        DefScreen supmechanic = addButtonInScrFirst(primaryStage,"Επιβλέπων Μηχανικός");
        	DefScreenData Antalaktika = supmechanic.addButtonInScr(primaryStage,this,"Ανταλλακτικά",Main.registry.SpareParts);
        	DefScreenData diaxeirisiep = supmechanic.addButtonInScr(primaryStage,this,"Διαχείριση Επισκευών",Main.registry.Repairs);
        
        
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

