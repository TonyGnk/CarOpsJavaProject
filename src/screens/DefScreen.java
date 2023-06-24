package screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DefScreen extends HBox {
    private HBox buttonGroup;

    public DefScreen(Stage primaryStage) {
        super();
        DefButtonQuit returnButton = new DefButtonQuit();

        buttonGroup = new HBox();
        buttonGroup.setAlignment(Pos.CENTER);
        buttonGroup.setSpacing(10); // Ορισμός του αποστάσματος ανάμεσα στα παιδιά του HBox
        buttonGroup.setPadding(new Insets(10)); // Ορισμός του padding για το HBox

        buttonGroup.getChildren().add(returnButton);

        this.getChildren().add(buttonGroup);
    }

    protected void addButtonToGroup(Button button) {
        buttonGroup.getChildren().add(button);
    }
}
