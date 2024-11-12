package controller;

import bd.BaseDato;
import model.Ejercicio;
import model.EjercicioRegistrar;
import model.EjercicioReforzado;

import java.util.List;

public class EjercicioController {
    private static EjercicioController instancia = null;

    public static EjercicioController getInstancia(){
        if(instancia==null){
            instancia = new EjercicioController();
        }
        return instancia;
    }
    private EjercicioController(){
    }

    public List<Ejercicio> getEjercicios(){
        return BaseDato.getEjercicios();
    }

    public void agregarEjercicio(Ejercicio ejercicio){
        BaseDato.agregarEjercicio(ejercicio);
    }
    public void agregarEjercicioRegistrado(EjercicioRegistrar ejercicioRegistrar){
        BaseDato.agregarEjercicioRegistrado(ejercicioRegistrar);
    }
    public void agregarEjercicioReforzado(EjercicioReforzado ejercicioReforzado){
        BaseDato.agregarEjercicioReforzado(ejercicioReforzado);
    }
}
