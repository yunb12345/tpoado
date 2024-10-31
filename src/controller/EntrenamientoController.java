package controller;

import model.Ejercicio;
import model.Objetivo;
import model.Rutina;
import model.Entrenamiento;

import java.util.ArrayList;
import java.util.List;

public class EntrenamientoController {
    private EjercicioController ejercicioController = EjercicioController.getInstancia();
    private static EntrenamientoController instancia = null;
    private List<Entrenamiento> entrenamientos = null;

    public static EntrenamientoController getInstancia(){
        if(instancia==null){
            instancia = new EntrenamientoController();
        }
        return instancia;
    }

    private EntrenamientoController(){
        this.entrenamientos = new ArrayList<>();
    }
}
