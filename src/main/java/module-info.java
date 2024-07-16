module org.example.demodesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql;


    opens org.example.demodesktop to javafx.fxml;
    exports org.example.demodesktop;
    exports org.example.demodesktop.controller;
    opens org.example.demodesktop.controller to javafx.fxml;
}