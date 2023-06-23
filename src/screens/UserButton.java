package screens;

import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserButton extends Button {
    public UserButton(String username, UserScreen userScreen) {
        super(username);

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            stage.setScene(new Scene(userScreen, 800, 600));
        });

        // Ορισμός του μεγέθους του κουμπιού
        this.setPrefSize(150, 150);
    }
}
