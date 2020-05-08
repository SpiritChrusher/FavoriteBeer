package org.kristof;

import java.io.IOException;

import Backend_Beer.BeerPOJO;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("Beer");
    }
}
