package controller;

import model.Ejercicio;
import model.Objetivo;
import model.Rutina;
import model.Entrenamiento;

import java.util.ArrayList;
import java.util.List;

public class EntrenamientoController {
    private static EntrenamientoController instancia = null;

    public static EntrenamientoController getInstancia(){
        if(instancia==null){
            instancia = new EntrenamientoController();
        }
        return instancia;
    }

    private EntrenamientoController(){
    }
}
