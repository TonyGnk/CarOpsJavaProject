package screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GramateiaScreen extends UserScreen {
    public GramateiaScreen(Stage primaryStage) {
        super(primaryStage);
        this.setAlignment(Pos.CENTER);

        UserScreen rantebou = new SessionScr(primaryStage);
        Button rantebouButton = new UserButton("Ραντεβού", rantebou);
        this.getChildren().addAll(rantebouButton);
    }
}
