package CarOps;
import screens.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Registry registry; //Global Registry
    //Window Size
    public static int i=1100; //1100
    public static int j=650; //650
    public static int ii=110; //1100
    public static int jj=60; //650
    public static String backgroundColor = "-fx-background-color: rgb(35, 35, 35);";
    public static String backgroundSecColor = "-fx-background-color: rgb(60, 60, 60);";
    public static String backgroundThirdColor = "-fx-background-color: rgb(75, 75, 75);";
    public static String textcolour = "rgb(245, 245, 245)";

    @Override
    public void start(Stage primaryStage) throws Exception{
        registry = new Registry(); //New Regisry

        //Start Screen
        StartScr startScr = new StartScr(primaryStage);
        Scene scene = new Scene(startScr, i, j);
        
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        scene.getRoot().setStyle(backgroundColor);

        primaryStage.setTitle("CarOps");
        primaryStage.setScene(scene);
        primaryStage.show();
         
    }

    public static void main(String[] args) {
        launch(args);
    }
}
