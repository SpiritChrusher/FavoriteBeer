package org.kristof;

import Backend_Beer.Beertypes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import java.util.*;

public class SearchController {



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

    @FXML
    public void initialize()
    {
   // listshow.setPrefHeight(500);
        populate(listshow);
        populate(listchosen);
    }


    public void populate(ListView a) {
    ArrayList<String> lista = new ArrayList<>();

    for (var i : Beertypes.values())
    {
        lista.add(i.getName());
    }

    a.getItems().addAll(lista);
}

    public void Move(ActionEvent actionEvent) {
    }

    public void Search(ActionEvent actionEvent) {
    }
}
