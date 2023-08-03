package screens;

import CarOps.Main;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class DefText extends Label {
    public DefText(String text) {
        super(text);
        
        // Set font properties
        //setFont(Font.font(12));
        setFont(Font.font("Helvetica", FontWeight.BOLD, 34));
        //setFont(Font.font("Arial"));


        setStyle("-fx-text-fill: " + Main.textcolour + ";");
    }
}
