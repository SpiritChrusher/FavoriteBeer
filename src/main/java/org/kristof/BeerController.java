package org.kristof;

import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import Backend_Beer.BeerPOJO;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.google.gson.*;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

public class BeerController{
    @FXML
    public Label beertext;

    @FXML
    public TextField userentry;

    ArrayList<BeerPOJO> masodik = new ArrayList<>();

    public void WriteLabel() throws IOException, URISyntaxException {

        var myJson = getClass().getResource("jsons/Mybeers_part.json");
        var f = new String(Files.readAllBytes(Paths.get(myJson.toURI())), StandardCharsets.UTF_8);
        System.out.println(myJson);
        Gson g = new Gson();
        BeerPOJO[] bj = g.fromJson(f, BeerPOJO[].class);



        for (var a:bj
        ) {
            masodik.add(a);
        }

    }

    public void onEnter(ActionEvent actionEvent) throws IOException, URISyntaxException {
        WriteLabel();

        masodik.stream().map(a -> a.getName()).sorted().forEach(System.out::println);

        masodik.stream().filter(a -> a.getName().equals(userentry.getText()));
       //String found = masodik.stream().filter(a -> a.getName().equals(userentry.getText())).toString();

        for (var a: masodik
             ) {
            if (a.getName().equals(userentry.getText()))
            {
                beertext.setText(a.toString());
            }
        }


    }
}
