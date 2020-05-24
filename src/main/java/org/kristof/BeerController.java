package org.kristof;

import Backend_Beer.BeerDAO;
import Backend_Beer.Beer;
import Backend_Beer.PersonPOJO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;

public class BeerController{
    @FXML
    private Label beertext;

    @FXML
    private Label playername;

    @FXML
    private TextField userentry;


    private PersonPOJO person;

    public void initdata(PersonPOJO p) {
         person = p;
        playername.setText("User: " + person.getName());
    }

    public void onEnter(ActionEvent actionEvent) throws IOException, URISyntaxException {

      List<Beer> all_beers = BeerDAO.ReadBeers();

        beertext.setText(all_beers.stream().filter(a -> a.getName().equals(userentry.getText())).findFirst().get().toString());

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
