module com.example.oopcw {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.oopcw to javafx.fxml;
    exports com.example.oopcw;
}