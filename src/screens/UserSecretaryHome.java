package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UserSecretaryHome extends DefScreen {
    public UserSecretaryHome(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        DefScreen rantebou = new SessionScr(primaryStage);
        Button rantebouButton = new DefButtonOption("Ραντεβού", rantebou);
        this.getChildren().addAll(rantebouButton);
    }
}