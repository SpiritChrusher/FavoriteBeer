package org.kristof;

import Backend_Beer.*;

import com.google.gson.Gson;
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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.*;

public class SearchController {

    @FXML
    private Button tofavorites;

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

    ArrayList<BeerPOJO> founded = new ArrayList<>();

    public void initdata(Person p){
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




        List<String> consultations = listchosen.getItems();
        ArrayList<String> showing;
        if (consultations instanceof ArrayList<?>) {
            showing = (ArrayList<String>) consultations;
        } else {
            showing = new ArrayList<>(consultations);
        }



       // BeerPOJO[] bj = new Gson().fromJson(new InputStreamReader(jsonfile), BeerPOJO);


        found.setText(BeerSeacher.Bestbeer(BeerSeacher.Favorite_types(showing, BeerDAO.ReadBeers())));



        user.addtoList(found.getText());
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

    public void tofavorites(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Favorites.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Favorites");

        System.out.println(user.getName());
        for (var a: user.getFavoritebeers()
             ) {
            System.out.println("listaelem" + a);
        }
        fxmlLoader.<FavoritesController>getController().initdata(user);
        Logger.info("Moving to {} page", stage.getTitle());

    }
}
