package org.kristof;

import Backend_Beer.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;

import java.util.*;

public class SearchController {



    @FXML
    private Label username;

    @FXML
    private ListView listshow;

    @FXML
    private ListView listchosen;

    @FXML
    private Label found;


    private PersonPOJO person;
    private final ObservableList<String> chosen_tastes = FXCollections.observableArrayList();
   // private Integer selectedIndex = -1;


    public void initdata(PersonPOJO p){
        person = p;
        username.setText("Current user: " + person.getName());

    }

    public void initialize() {

        populate(listshow);
        listchosen.setItems(chosen_tastes);

    }


    public void populate(ListView a) {

        a.getItems().addAll(Beer.TASTES);

        Logger.info("Listview is populated");
    }

    public void Move(ActionEvent actionEvent) {
        chosen_tastes.add(listshow.getSelectionModel().getSelectedItem().toString());

    }

    public void Search(ActionEvent actionEvent) {

        List<String> chosen = listchosen.getItems();

        if(chosen.size() >= 2) {
            found.setText(Beerseacher.Bestbeer(Beerseacher.Favorite_types(chosen, BeerDAO.ReadBeers())));

            Logger.debug("Saving result to the user.");
        }
        else{
            found.setText("Please add at least 2 elements!");
            Logger.warn("User didn't provide at least 2 tastes");
        }
        if(!found.getText().equals("Selected options didn't match any beers"))
        {
            person.addtoList(found.getText());
            Logger.debug("Saving result to the user.");
        }

    }


    public void toBeers(ActionEvent actionEvent) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Beer.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Beers");
        fxmlLoader.<BeerController>getController().initdata(person);
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
            listchosen.getItems().remove(selectedIdx);
        }
    }

    public void tofavorites(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Favorites.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Favorites");

        fxmlLoader.<FavoritesController>getController().initdata(person);

        Logger.info("Moving to {} page", stage.getTitle());

    }
}
