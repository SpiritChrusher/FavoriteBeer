module org.kristof {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens org.kristof to javafx.fxml;
    exports org.kristof;
}