module com.example.servotester {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.servotester to javafx.fxml;
    exports com.example.servotester;
}