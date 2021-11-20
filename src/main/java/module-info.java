module com.andrea.javafxejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.andrea.javafxejercicio1 to javafx.fxml;
    exports com.andrea.javafxejercicio1;
}