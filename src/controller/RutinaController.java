package controller;

import bd.BaseDato;
import model.Rutina;

public class RutinaController {
    private static RutinaController instancia = null;

    public static RutinaController getInstancia(){
        if(instancia==null){
            instancia = new RutinaController();
        }
        return instancia;
    }
    private RutinaController(){
    }
    public void agregarRutina(Rutina rutina){
        BaseDato.agregarRutina(rutina);
    }
}