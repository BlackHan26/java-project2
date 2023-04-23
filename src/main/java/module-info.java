module com.example.javaproject22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproject22 to javafx.fxml;
    exports com.example.javaproject22;
}