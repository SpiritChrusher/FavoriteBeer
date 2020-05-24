module org.kristof {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.google.gson;
    requires org.tinylog.api;
    exports  Backend_Beer;

    opens org.kristof to javafx.fxml;
    exports org.kristof;
    opens Backend_Beer to com.google.gson;

}