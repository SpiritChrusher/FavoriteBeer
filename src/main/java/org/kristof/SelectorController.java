package org.kristof;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SelectorController extends App{

 /*   Stage window;
    TableView<String> table;


    @Override
    public void start(Stage Selector)  {
        window = Selector;
        window.setTitle("thenewboston - JavaFX");

        //Name column
        TableColumn<String, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<String, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    //Get all of the products
    public ObservableList<String> getProduct(){
        ObservableList<String> products = FXCollections.observableArrayList();
        products.add("Laptop");
        products.add("Bouncy Ball");
        products.add("Toilet");
        products.add("The Notebook DVD");
        products.add("Corn");
        return products;
    }
*/

}
