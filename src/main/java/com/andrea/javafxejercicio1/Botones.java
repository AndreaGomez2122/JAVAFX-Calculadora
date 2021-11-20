package com.andrea.javafxejercicio1;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class Botones extends GridPane {

    Button boton0;
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;

    Button botonMas;
    Button botonMenos;
    Button botonMultiplicar;
    Button botonDividir;
    Button botonModule;
    Button botonFullErase;
    Button botonOperate;


    public void inicializarBotones(){

        boton0 = new Button("0");
        boton1 = new Button("1");
        boton2 = new Button("2");
        boton3 = new Button("3");
        boton4 = new Button("4");
        boton5 = new Button("5");
        boton6 = new Button("6");
        boton7 = new Button("7");
        boton8 = new Button("8");
        boton9 = new Button("9");

        botonMas = new Button("+");
        botonMenos = new Button("-");
        botonMultiplicar = new Button("x");
        botonDividir = new Button("/");
        botonModule = new Button("%");
        botonFullErase = new Button("C");
        botonOperate = new Button("=");

    }

    public Botones(CalculadoraController calculadoraController) {

            inicializarBotones();
            boton0.setOnAction(actionEvent -> calculadoraController.añadirNumero(0));
            this.add(boton0, 2, 4);
            boton1.setOnAction(actionEvent -> calculadoraController.añadirNumero(1));
            this.add(boton1, 1, 3);
            boton2.setOnAction(actionEvent -> calculadoraController.añadirNumero(2));
            this.add(boton2, 2, 3);
            boton3.setOnAction(actionEvent -> calculadoraController.añadirNumero(3));
            this.add(boton3, 3, 3);
            boton4.setOnAction(actionEvent -> calculadoraController.añadirNumero(4));
            this.add(boton4, 1, 2);
            boton5.setOnAction(actionEvent -> calculadoraController.añadirNumero(5));
            this.add(boton5, 2, 2);
            boton6.setOnAction(actionEvent -> calculadoraController.añadirNumero(6));
            this.add(boton6, 3, 2);
            boton7.setOnAction(actionEvent -> calculadoraController.añadirNumero(7));
            this.add(boton7, 1, 1);
            boton8.setOnAction(actionEvent -> calculadoraController.añadirNumero(8));
            this.add(boton8, 2, 1);
            boton9.setOnAction(actionEvent -> calculadoraController.añadirNumero(9));
            this.add(boton9, 3, 1);

            botonMas.setOnAction(actionEvent -> calculadoraController.añadirOperacion('+'));
            this.add(botonMas, 4, 1);
            botonMenos.setOnAction(actionEvent -> calculadoraController.añadirOperacion('-'));
            this.add(botonMenos, 4, 2);
            botonMultiplicar.setOnAction(actionEvent -> calculadoraController.añadirOperacion('x'));
            this.add(botonMultiplicar, 4, 3);
            botonDividir.setOnAction(actionEvent -> calculadoraController.añadirOperacion('/'));
            this.add(botonDividir, 4, 4);
            botonModule.setOnAction(actionEvent -> calculadoraController.añadirOperacion('%'));
            this.add(botonModule, 3, 4);
            botonFullErase.setOnAction(actionEvent -> calculadoraController.limpiarOperaciones());
            this.add(botonFullErase, 1, 4);
            botonOperate.setOnAction(actionEvent -> calculadoraController.operar());
            this.add(botonOperate, 1, 5, 4, 1);
            this.getChildren().forEach(b -> ((Button)b).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE));
            setHgrow(this, Priority.ALWAYS);
            setVgrow(this, Priority.ALWAYS);


        }
    }

