package screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SessionScr extends DefUserScreen {
    public SessionScr(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        DefUserScreen dimiourgia = new EditSessionScr(primaryStage);
        Button dimiourgiaButton = new DefButtonStart("Νέο Ραντεβού", dimiourgia);
        this.getChildren().addAll(dimiourgiaButton);


    }
}
