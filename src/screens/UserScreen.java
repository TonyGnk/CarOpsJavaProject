package screens;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public abstract class UserScreen extends VBox {
    public UserScreen(Stage primaryStage) {
        super();

        Button backButton = new Button("Επιστροφή στην αρχική οθόνη");
        backButton.setOnAction(e -> primaryStage.setScene(new Scene(new StartScr(primaryStage), 800, 600)));

        this.getChildren().add(backButton);
    }
}
