package org.kristof;

import java.io.IOException;
import java.net.URISyntaxException;

import Backend_Beer.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import lombok.extern.slf4j.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import Backend_Beer.BeerPOJO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

//@Slf4j
public class primaryController {

    @FXML
    public TextField nameSetter;

    @FXML
    public Label errorLabel;



    ObservableList<String> options =
            FXCollections.observableArrayList(
                    "Option 1",
                    "Option 2",
                    "Option 3"
            );
    final ComboBox comboBox = new ComboBox(options);



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
     //       Logger logger = LoggerFactory.getLogger(primaryController.class);
       //     logger.info("Username is set to {}, loading game scene.", nameSetter.getText());
          // log.info("Username is set to {}, loading game scene.", nameSetter.getText());
       }
    }

  /* @FXML
    private void switchToSecondary() throws IOException {

      //  FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Beer.fxml"));
        Parent root = fxmlLoader.load();

        log.info("json is loaded, name is set to ...");
        App.setRoot("Beer");//

        if (namesetter.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
            System.out.println("Empty username!");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Beer.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<BeerController>getController().initdata(namesetter.getText());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            log.info("Username is set to {}, loading game scene.", usernameTextfield.getText());
        }
    } */
}
