package controller;

import model.Ejercicio;
import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

import java.util.ArrayList;
import java.util.List;

public class EjercicioController {
    private static EjercicioController instancia = null;
    private List<Ejercicio> ejercicios = null;

    public static EjercicioController getInstancia(){
        if(instancia==null){
            instancia = new EjercicioController();
        }
        return instancia;
    }
    private EjercicioController(){
        Ejercicio ejercicio1 = new Ejercicio(1,1,12.3f,5,ExigenciaMuscular.alto, GrupoMuscular.brazo);
        ejercicios = new ArrayList<Ejercicio>();
        ejercicios.add(ejercicio1);
    }
    public List<Ejercicio> getEjercicios(){
        return ejercicios;
    }
}
