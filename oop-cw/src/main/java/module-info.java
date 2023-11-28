module com.example.oop_cw_v1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jasperreports;


    opens com.example.oop_cw_v1 to javafx.fxml;
    exports com.example.oop_cw_v1;
}