package screens;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserImageView extends VBox {
    public UserImageView(String imagePath, String username, UserScreen userScreen) {
        super();

        ImageView imageView = new ImageView(new Image(imagePath));
        Label label = new Label(username);

        this.getChildren().addAll(imageView, label);

        this.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            stage.setScene(new Scene(userScreen, 800, 600));
        });
    }
}
