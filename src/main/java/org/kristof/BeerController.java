package org.kristof;

import Backend_Beer.BeerDAO;
import Backend_Beer.BeerPOJO;
import Backend_Beer.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.google.gson.*;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BeerController{
    @FXML
    public Label beertext;

    @FXML
    public Button tosearch;

    @FXML
    private Label playername;

    @FXML
    public TextField userentry;


    private Person person;

    public void initdata(Person p) {
         person = p;
        playername.setText("User: " + person.getName());
    }

    public void onEnter(ActionEvent actionEvent) throws IOException, URISyntaxException {

      List<BeerPOJO> allbeers = BeerDAO.ReadBeers();

        beertext.setText(allbeers.stream().filter(a -> a.getName().equals(userentry.getText())).findFirst().get().toString());

        Logger.info("User's data has been saved to Json file.");

    }

    public void tosearch(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Search.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Search");
        fxmlLoader.<SearchController>getController().initdata(person);
        Logger.info("Moving to {} page", stage.getTitle());
    }
}
