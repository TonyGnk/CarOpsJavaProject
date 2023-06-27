package CarOps;
import screens.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
    public static Registry registry; //Global Registry
    //Window Size
    public static int i=1100; //1100 - Vertical Size
    public static int j=650; //650 - Horizontal Size
    public static int ii=110; //110
    public static int jj=35; //35
    public static String backgroundColor = "-fx-background-color: rgb(243, 243, 243);";//35
    public static String backgroundColor2 = "-fx-background-color: rgb(207, 216, 220);";//35
    public static String backgroundSecColor = "-fx-background-color: rgb(69, 90, 100);"; //Most for the Buttons
    public static String backgroundThirdColor = "-fx-background-color: rgb(75, 75, 75);";
    public static String textcolour = "rgb(38, 50, 56)";
    public static String textcolour2 = "rgb(243, 243, 243)";

    @Override
    public void start(Stage primaryStage) throws Exception{
        registry = new Registry(); //New Registry
        Session s1 = new Session("Παράδειγμα", "03/07/23", "ZMP-4931");
        Client s2 = new Client("Γιάννης", "Γαβριηλίδης",231043110, "Βενιζέλου 23, Θεσσαλονίκη", "John@gmail.com");
        Vehicle s3 = new Vehicle("ZMP-4931","Toyota","Yaris", 2011);
        
        //Start Screen
        StartScr startScr = new StartScr(primaryStage);
        Scene scene = new Scene(startScr, i, j);
        
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        scene.getRoot().setStyle(backgroundColor);

        primaryStage.setTitle("CarOps");
        primaryStage.setScene(scene);
        Platform.setImplicitExit(false);
        primaryStage.show();
         
    }

    public static void main(String[] args) {
        launch(args);
        
    }
}


