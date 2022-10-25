module com.example.market {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.market to javafx.fxml;
    exports com.example.market;
}