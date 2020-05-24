package org.kristof;

import java.io.IOException;
import java.net.URISyntaxException;


import Backend_Beer.PersonPOJO;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.tinylog.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class primaryController {

    @FXML
    private TextField nameSetter;

    @FXML
    private Label errorLabel;
    

    public void onEnter(ActionEvent actionEvent) throws IOException {

        if (nameSetter.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
            System.out.println("Empty username!");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Beer.fxml"));
            Parent root = fxmlLoader.load();

            PersonPOJO p = new PersonPOJO(nameSetter.getText());
            fxmlLoader.<BeerController>getController().initdata(p);

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
        }
        else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Search.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            stage.setTitle("Finder");
            PersonPOJO person = new PersonPOJO(nameSetter.getText());
            fxmlLoader.<SearchController>getController().initdata(person);


            Logger.info("Moving to {} page", stage.getTitle());
        }

    }

}