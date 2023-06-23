package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UserSecretaryScr extends DefUserScreen {
    public UserSecretaryScr(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        DefUserScreen rantebou = new SessionScr(primaryStage);
        Button rantebouButton = new DefButtonStart("Ραντεβού", rantebou);
        this.getChildren().addAll(rantebouButton);
    }
}
