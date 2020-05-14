package org.kristof;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SecondaryController extends  App{

    @Override
    public void start(Stage secondary) {
        secondary.setTitle("CheckBox Experiment 1");

        CheckBox checkBox1 = new CheckBox("Green");

        HBox hbox = new HBox(checkBox1);

        Scene scene = new Scene(hbox, 200, 100);
        secondary.setScene(scene);
        secondary.show();

    }



}