package com.andrea.javafxejercicio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private int contador=0;
    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(new Vista());
        //scene.getStylesheets().add("Estilos.css");
        scene.getStylesheets().add(
               "Estilos.css");

        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}