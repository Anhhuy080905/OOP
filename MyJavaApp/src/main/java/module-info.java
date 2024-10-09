module org.example.myjavaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    requires com.dlsc.formsfx;
    requires mysql.connector.j;

    opens org.example.myjavaapp to javafx.fxml;
    exports org.example.myjavaapp;
}