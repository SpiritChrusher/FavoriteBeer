package org.kristof;

import java.io.IOException;

import Backend_Beer.Beertypes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import Backend_Beer.BeerPOJO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;



public class SecondaryController extends  App{

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    @Override
    public void start(Stage Search) {
        window = Search;
        window.setTitle("ComboBox Demo");
        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will Hunting",
                "St. Vincent",
                "Blackhat"
        );

        comboBox.setPromptText("What is your favorite movie?");

        //ComboBoxes also generate actions if you need to get value instantly
        comboBox.setOnAction( e -> System.out.println("User selected " + comboBox.getValue()) );

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

}