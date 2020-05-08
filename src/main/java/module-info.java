module org.kristof {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;

    requires com.google.gson;

   // opens Backend_Beer to com.google.gson;
    opens org.kristof to javafx.fxml;
    exports org.kristof;
   // exports Backend_Beer;
    
}