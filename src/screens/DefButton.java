package screens;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.control.Button;

public class DefButton extends Button{
    private Timeline timeline; 
    public DefButton(String text) {
        super(text);
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
    }
}
