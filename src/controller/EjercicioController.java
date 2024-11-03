package controller;

import bd.BaseDato;
import model.Ejercicio;
import model.EjercicioCompletado;
import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

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
        //Ejercicio ejercicio1 = new Ejercicio(1,1,12.3f,5,ExigenciaMuscular.alto, GrupoMuscular.brazo);
        //BaseDato.agregarEjercicio(ejercicio1);
    }

    public List<Ejercicio> getEjercicios(){
        return BaseDato.getEjercicios();
    }
    public void agregarEjercicio(Ejercicio ejercicio){
        BaseDato.agregarEjercicio(ejercicio);
    }
    public void agregarEjercicioCompletado(EjercicioCompletado ejercicioCompletado){
        BaseDato.agregarEjercicioCompletado(ejercicioCompletado);
    }
}
