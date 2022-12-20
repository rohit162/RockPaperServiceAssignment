module com.example.natwestproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.ws.rs;


    opens com.example.natwestproject to javafx.fxml;
    exports com.example.natwestproject;
}