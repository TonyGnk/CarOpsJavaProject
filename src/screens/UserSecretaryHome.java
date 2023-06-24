package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UserSecretaryHome extends DefScreen {
    public UserSecretaryHome(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        DefScreen rantebou = new SessionScr(primaryStage);
        DefScreen rantebou2 = new SessionScr(primaryStage);
        Button rantebouButton = new DefButtonOption("Ραντεβού", rantebou);
        Button rantebouButton2 = new DefButtonOption("Ραντεβού", rantebou2);
        this.getChildren().addAll(rantebouButton,rantebouButton2);
    }
}