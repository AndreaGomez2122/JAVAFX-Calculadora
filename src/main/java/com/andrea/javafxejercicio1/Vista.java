package com.andrea.javafxejercicio1;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Vista extends VBox {

    public Label label;
    public GridPane buttons;

    public Vista() {
        this.label = new Label("");
        CalculadoraController calculadoraController = new CalculadoraController(this.label);
        this.buttons = new Botones(calculadoraController);
        this.getChildren().add(this.label);
        this.getChildren().add(this.buttons);

    }



}
