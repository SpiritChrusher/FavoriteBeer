package org.kristof;

import java.io.IOException;
import java.net.URISyntaxException;


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

            fxmlLoader.<BeerController>getController().initdata(nameSetter.getText());
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

            Logger.info("Moving to another page");
        }

    }

}