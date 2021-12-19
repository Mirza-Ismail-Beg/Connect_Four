module com.example.connecr_four {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.connecr_four to javafx.fxml;
    exports com.example.connecr_four;
}