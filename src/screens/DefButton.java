package screens;
import CarOps.Main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefButton extends Button{
    private Timeline timeline; 
    public DefButton(String text) {
        super(text);       
        this.setStyle(Main.backgroundSecColor
                + "-fx-background-radius: 10px;"); // Reduce background radius by border width
        
        this.setTextFill(Color.web(Main.textcolour2));
        // Define a regular expression pattern to match the RGB values
        String regex = "rgb\\((\\d+),\\s*(\\d+),\\s*(\\d+)\\)";

        // Create a Pattern object from the regex
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the backgroundColor2 string
        Matcher matcher = pattern.matcher(Main.backgroundSecColor);

        // Check if a match is found
        int r=0;
        int g=0;
        int b=0;
        if (matcher.find()) {
            // Extract the RGB values from the matched groups
            r = Integer.parseInt(matcher.group(1));
            g = Integer.parseInt(matcher.group(2));
            b = Integer.parseInt(matcher.group(3));
        }
        final int rr=r-60;
        final int gg=g-60;
        final int bb=b-60;

        this.setOnMouseEntered(e -> {
            timeline = new Timeline();
            int i = 60;
            while (i < 75) {
                int rgb = i;
                String colorStyle = String.format("-fx-background-color: rgb(%d, %d, %d);", rgb+rr, rgb+gg, rgb+bb);
                String corners = String.format("-fx-background-radius:%d;",rgb-50);
                KeyFrame keyFrame = new KeyFrame(Duration.millis((i - 60) * 14), event -> this.setStyle(colorStyle+corners));
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
                String colorStyle = String.format("-fx-background-color: rgb(%d, %d, %d);", rgb+rr, rgb+gg, rgb+bb);
                String corners = String.format("-fx-background-radius:%d;",rgb-50);
                KeyFrame keyFrame = new KeyFrame(Duration.millis((75 - i) * 14), event -> this.setStyle(colorStyle+corners));
                timeline.getKeyFrames().add(keyFrame);
                i--;
            }
            timeline.play();
        });
    }
}
