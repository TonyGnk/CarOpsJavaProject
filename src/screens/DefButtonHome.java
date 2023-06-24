package screens;
import CarOps.Main;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DefButtonHome extends Button {
	private Timeline timeline; 
	public DefButtonHome(String type) {
        super("Αρχική Οθόνη");

        this.setOnAction(e -> {
            Stage stage = (Stage) this.getScene().getWindow();
            DefScreen userscreen;

            if (type.equals("Sec")) {
                userscreen = new UserSecretaryHome(stage);
            } else if (type.equals("Own")) {
                userscreen = new UserOwnerHome(stage);
            } else if (type.equals("Hos")) {
                userscreen = new UserHostMechanicHome(stage);
            } else if (type.equals("Mec")) {
                userscreen = new UserMechanicHome(stage);
            } else {
                userscreen = new UserSupervisorHome(stage);
            }
            
            userscreen.setStyle(Main.backgroundColor);
            stage.setScene(new Scene(userscreen, Main.i, Main.j));
        });
        
        this.setPrefSize(Main.ii, Main.jj);
        this.setTextFill(Color.web(Main.textcolour));
        this.setStyle(Main.backgroundSecColor+"-fx-background-radius: 10;");

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
