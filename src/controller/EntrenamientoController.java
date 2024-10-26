package controller;

import model.Rutina;

import java.util.ArrayList;
import java.util.List;

public class EntrenamientoController {
    private SocioController sociocontroller;
    private static EntrenamientoController instancia = null;

    public static EntrenamientoController getInstancia(){
        if(instancia==null){
            instancia = new EntrenamientoController();
        }
        return instancia;
    }
    private EntrenamientoController(){
        this.sociocontroller = SocioController.getInstance();
    }
}
