package screens;

import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DefButtonOption extends Button {
    public DefButtonOption(String username, DefUserScreen userScreen) {
        super(username);

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            stage.setScene(new Scene(userScreen, 800, 600));
        });

        this.setPrefSize(150, 150);
    }
}
