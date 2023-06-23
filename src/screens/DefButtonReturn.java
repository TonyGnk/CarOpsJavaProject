package screens;

import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DefButtonReturn extends Button {
    public DefButtonReturn() {
    	super("Επιστροφή στην αρχική οθόνη");

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            stage.setScene(new Scene(new StartScr(stage), 800, 600));
        });

        this.setPrefSize(150, 150);
    }
}

