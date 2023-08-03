package screens;
import CarOps.Main;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class DefButtonStart extends DefButton {
	private Timeline timeline;
    public DefButtonStart(DefScreen userScreen,String username) {
        super(username);

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            userScreen.setStyle(Main.backgroundColor);
            stage.setScene(new Scene(userScreen, Main.i, Main.j));
        });

        this.setPrefSize(150, 150);
        //this.setStyle(Main.backgroundSecColor+"-fx-background-radius: 10;");
/*
        this.setOnMouseEntered(e -> {
            timeline = new Timeline();
            int i = 60;
            while (i < 75) {
                int rgb = i;
                String colorStyle = String.format("-fx-background-color: rgb(%d, %d, %d);", rgb, rgb, rgb);
                String corners = String.format("-fx-background-radius: %d;", rgb-50);
                KeyFrame keyFrame = new KeyFrame(Duration.millis((i - 60) * 13), event -> this.setStyle(colorStyle+corners));
                timeline.getKeyFrames().add(keyFrame);
                i++;
            }
            timeline.play();
        });

        this.setOnMouseExited(e -> {
            if (timeline != null) {
                timeline.stop();
            }
            timeline = new Timeline();
            int i = 75;
            while (i >= 60) {
                int rgb = i;
                String colorStyle = String.format("-fx-background-color: rgb(%d, %d, %d);", rgb, rgb, rgb);
                String corners = String.format("-fx-background-radius: %d;", rgb-50);
                KeyFrame keyFrame = new KeyFrame(Duration.millis((75 - i) * 13), event -> this.setStyle(colorStyle+corners));
                timeline.getKeyFrames().add(keyFrame);
                i--;
            }
            timeline.play();
        });
*/
    }
}
