package CarOps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static Registry registry;
    @Override

    public void start(Stage primaryStage) throws Exception{
        registry = new Registry();

        StartScr startScr = new StartScr(primaryStage);
        Scene scene = new Scene(startScr, 800, 600);

        primaryStage.setTitle("Συνεργείο Αυτοκινήτων");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
