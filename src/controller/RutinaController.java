package controller;

import model.Ejercicio;
import model.Entrenamiento;
import model.Rutina;
import model.Socio;

import java.util.ArrayList;
import java.util.List;

public class RutinaController {
    private SocioController sociocontroller;
    private static RutinaController instancia = null;

    public static RutinaController getInstancia(){
        if(instancia==null){
            instancia = new RutinaController();
        }
        return instancia;
    }
    private RutinaController(){
        this.sociocontroller = SocioController.getInstance();
    }
}