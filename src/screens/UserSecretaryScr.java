package screens;

import CarOps.Main;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserSecretaryScr extends DefScreen {
    public UserSecretaryScr(Stage primaryStage) {
        super(primaryStage);
        DefButtonHome returnButton = new DefButtonHome("Sec");
        this.addButtonToGroup(returnButton);
        this.getChildren().add(returnButton);

        // Δημιουργία του κειμένου επικεφαλίδας
        Text headerText = new Text("  ");
        headerText.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        headerText.setFill(Color.WHITE); // Ορισμός του χρώματος σε άσπρο
        this.getChildren().add(headerText);

        // Τοποθέτηση του κειμένου στο κέντρο της οθόνης
        this.setAlignment(Pos.CENTER);
    }
}

