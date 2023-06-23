//Προεπιλεγμένο πρότυπο για σελίδα χρηστών
package screens;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public abstract class DefUserScreen extends VBox {
    public DefUserScreen(Stage primaryStage) {
        super();
        DefButtonReturn returnButton = new DefButtonReturn();

        this.getChildren().add(returnButton);
    }
}
