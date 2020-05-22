package org.kristof;

import java.io.IOException;
import java.net.URISyntaxException;


import Backend_Beer.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.tinylog.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class primaryController {

    @FXML
    public TextField nameSetter;

    @FXML
    public Label errorLabel;
    

    public void onEnter(ActionEvent actionEvent) throws IOException, URISyntaxException {

        if (nameSetter.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
            System.out.println("Empty username!");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Beer.fxml"));
            Parent root = fxmlLoader.load();

            Person p = new Person(nameSetter.getText());
            fxmlLoader.<BeerController>getController().initdata(p);

            //  App.setRoot("Beer");
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            Logger.info("Username is set to {}, loading game scene.", nameSetter.getText());
        }
    }
    public void toSecond(ActionEvent actionEvent) throws IOException {

        if (nameSetter.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
            System.out.println("Empty username!");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Search.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            stage.setTitle("Finder");
            Person p = new Person(nameSetter.getText());
            fxmlLoader.<SearchController>getController().initdata(p);

            Logger.info("Moving to {} page", stage.getTitle());
        }

    }

}