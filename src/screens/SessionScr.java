package screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SessionScr extends UserSecretaryScr {
    public SessionScr(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        DefScreen dimiourgia = new EditSessionScr(primaryStage);
        Button dimiourgiaButton = new DefButtonOption("Νέο Ραντεβού", dimiourgia);
        //this.addButtonToGroup(dimiourgiaButton);
        this.getChildren().add(dimiourgiaButton);
    }
}
