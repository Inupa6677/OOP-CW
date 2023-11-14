module com.example.oopcw {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;



    opens com.example.oopcw to javafx.fxml;
    exports com.example.oopcw;
}