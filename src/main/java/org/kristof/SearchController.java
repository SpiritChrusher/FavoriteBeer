package org.kristof;

import Backend_Beer.BeerPOJO;
import Backend_Beer.Beertypes;

import Backend_Beer.Person;
import Backend_Beer.PersonDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.*;

public class SearchController {


    @FXML
    private Button tobeers;

    @FXML
    private Label options;

    @FXML
    private Label selected;

    @FXML
    private Label username;

    @FXML
    private ListView listshow;

    @FXML
    private ListView listchosen;

    @FXML
    private Button search;

    @FXML
    private Button move;

    @FXML
    private Label found;


    Person user = new Person();
    private final ObservableList<String> chosentastes = FXCollections.observableArrayList();
    private Integer selectedIndex = -1;

ArrayList<String> tasteoptions = new ArrayList<>();
    public void initdata(String userName) {
        user = new Person(userName);
        username.setText("Current user: " + user.getName() );

    }

    public void initialize()
    {

        populate(listshow);
        listchosen.setItems(chosentastes);

    }



    public void populate(ListView a) {
    ArrayList<String> lista = new ArrayList<>();

    for (var i : Beertypes.values())
    {
        lista.add(i.getName());
    }

    a.getItems().addAll(lista);

        Logger.info("Listview is populated");
}

    public void Move(ActionEvent actionEvent)
    {
        chosentastes.add(listshow.getSelectionModel().getSelectedItem().toString());

    }

    public void Search(ActionEvent actionEvent) {

        ArrayList<BeerPOJO> founded = new ArrayList<>();
        BeerPOJO foundbeer = new BeerPOJO();
        founded.add(foundbeer);
    user.setFavoritebeers(founded);
        Logger.debug("Saving result to the user.");


    }


    public void toBeers(ActionEvent actionEvent) throws IOException {

        PersonDAO.WriteToJson(user);
        Logger.debug("user infos are saved to a json file.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Beer.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Beers");

        Logger.info("Moving to {} page", stage.getTitle());

    }
}
