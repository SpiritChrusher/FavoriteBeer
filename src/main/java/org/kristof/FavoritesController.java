package org.kristof;

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
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;

public class FavoritesController {

    @FXML
    private Label nameLabel;

    @FXML
    private ListView beerlist;

    @FXML private Label beertext;

    @FXML
    private Button Back;

    Person person;
    public void initdata(Person user) {
        person = user;
        nameLabel.setText("name: " + person.getName());
        beerlist.getItems().addAll(person.getFavoritebeers());
    }

  /*  public void initialize() {



    }*/

    public void Back(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Search.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Searching");
        fxmlLoader.<FavoritesController>getController().initdata(person);
        Logger.info("Moving to {} page", stage.getTitle());

    }
}
