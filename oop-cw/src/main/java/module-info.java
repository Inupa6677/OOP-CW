module com.example.oopcw {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.oopcw to javafx.fxml;
    exports com.example.oopcw;
}