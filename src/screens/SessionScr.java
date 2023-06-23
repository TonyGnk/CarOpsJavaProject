package screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SessionScr extends UserScreen {
    public SessionScr(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        UserScreen dimiourgia = new EditSessionScr(primaryStage);
        Button dimiourgiaButton = new UserButton("Νέο Ραντεβού", dimiourgia);
        this.getChildren().addAll(dimiourgiaButton);


    }
}
