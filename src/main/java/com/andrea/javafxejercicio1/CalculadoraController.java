package com.andrea.javafxejercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculadoraController {

        private final Label label;
        private int numero;
        private int operador;
        private char operacion;
        private boolean primerNumero;
        private boolean hasoperacion;
        private boolean hasoperador;

        public CalculadoraController(Label label) {
            this.numero = 0;
            this.operador = 0;
            this.label = label;
            this.operacion = 0;
            this.primerNumero = true;
            this.hasoperador = true;
            this.hasoperacion = false;
        }



    public void añadirNumero(int n) {
        if (primerNumero) {
            label.setText("" + n);
            primerNumero = false;
        } else
            label.setText(label.getText() + n);
        if (operacion == 0) {
            this.numero = this.numero * 10 + n;
        }else {
            this.operador = this.operador * 10 + n;
            hasoperador = true;
        }
    }

    public void añadirOperacion(char c) {
        if (c != operacion){
            operacion = c;
            if (!hasoperacion)
                label.setText(label.getText() + " " + c + " ");
            else {
                label.setText(label.getText().substring(0, label.getText().length()-3) + " " + c + " ");
                this.operador = 0;
            }
            hasoperacion = true;
        }
    }

    public void limpiarOperaciones() {
        this.numero = 0;
        this.operador = 0;
        this.operacion = 0;
        this.primerNumero = true;
        this.hasoperacion = false;
        label.setText("");
    }

    public void operar() {
        CalculadoraModel model = new CalculadoraModel(this.numero, this.operacion, this.operador);
        if (!hasoperador)
            operador = numero;
        if (operacion == '+' || operacion == '-' || operacion == 'x' || operacion == '/' || operacion == '%')
            label.setText(label.getText() + " = " + model.operar());
        else
            label.setText(model.operar());
        this.numero = 0;
        this.operacion = 0;
        this.operador = 0;
        this.hasoperacion = false;
        primerNumero = true;
    }
}
