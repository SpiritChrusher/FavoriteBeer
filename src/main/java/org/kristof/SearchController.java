package org.kristof;

import Backend_Beer.Beertypes;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import java.util.*;

public class SearchController {



@FXML
public ListView listshow;


   /* private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Search"),800, 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
*/
public void populate()
{
    ArrayList<String> lista = new ArrayList<>();

    for (var i : Beertypes.values())
    {
        lista.add(i.getName());
    }


    listshow.getItems().addAll(lista);
}

}
