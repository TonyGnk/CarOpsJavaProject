package screens;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import CarOps.Main;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class DefTextHeader extends DefText {
    public DefTextHeader(String text) {
        super(text);
        
        setFont(Font.font("Helvetica", FontWeight.BOLD, 22));
        setStyle("-fx-text-fill: " + Main.textcolour + ";");
    }
}