module org.kristof {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;

    requires com.google.gson;

//requires slf4j.api;
    opens org.kristof to javafx.fxml;
    exports org.kristof;

}