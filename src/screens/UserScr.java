package screens;

import java.io.FileNotFoundException;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UserScr extends DefScreen {
    public UserScr(Stage primaryStage,String Label) throws FileNotFoundException {
        super(primaryStage,Label);
        DefScreen rantebou = new SessionScr(primaryStage,"Ραντεβού");
        //DefScreen rantebou2 = new SessionScr(primaryStage);
        DefButtonStart rantebouButton = new DefButtonStart(rantebou,"Ραντεβού");
        //Button rantebouButton2 = new DefButtonOption("Ραντεβού", rantebou2);
        
        addButtonToGroup(rantebouButton);
        //addButtonToGroup(rantebouButton2);
        
  
    }
  
}