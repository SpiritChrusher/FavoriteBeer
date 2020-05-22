package org.kristof;

import Backend_Beer.*;

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
import java.net.URISyntaxException;
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


    private Person user;
    private final ObservableList<String> chosentastes = FXCollections.observableArrayList();
    private Integer selectedIndex = -1;

    ArrayList<String> tasteoptions = new ArrayList<>();


    public void initdata(Person p, BeerPOJO[] bj) {
        user = p;
        username.setText("Current user: " + user.getName());

    }

    public void initialize() {

        populate(listshow);
        listchosen.setItems(chosentastes);

    }


    public void populate(ListView a) {

        a.getItems().addAll(BeerPOJO.izek);

        Logger.info("Listview is populated");
    }

    public void Move(ActionEvent actionEvent) {
        chosentastes.add(listshow.getSelectionModel().getSelectedItem().toString());

    }

    public void Search(ActionEvent actionEvent) throws IOException, URISyntaxException {

        BeerSeacher a = new BeerSeacher();
        List<String> results = listchosen.getItems();
        for (var item: results
             ) {
            System.out.println(item);
        }
        a.Favorite_types(results);

        found.setText(a.Favorite_types(results).toString());

        /*ArrayList<BeerPOJO> founded = new ArrayList<>();
        BeerPOJO foundbeer = new BeerPOJO();
        founded.add(foundbeer);
        user.setFavoritebeers(founded);*/
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
        fxmlLoader.<BeerController>getController().initdata(user);
        Logger.info("Moving to {} page", stage.getTitle());

    }

    public void Clear(ActionEvent actionEvent) {

        listchosen.getItems().clear();

    }

    public void Remove(ActionEvent actionEvent) {
        final int selectedIdx = listchosen.getSelectionModel().getSelectedIndex();
        if (selectedIdx != -1) {
            String itemToRemove = listchosen.getSelectionModel().getSelectedItem().toString();

            final int newSelectedIdx =
                    (selectedIdx == listchosen.getItems().size() - 1)
                            ? selectedIdx - 1
                            : selectedIdx;
            listchosen.getItems().remove(selectedIdx); //.getSelectionModel().clearSelection();
        }
    }
}
