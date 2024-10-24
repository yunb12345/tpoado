package controller;

import model.Ejercicio;
import model.EjercicioCompletado;
import model.Entrenamiento;

import java.util.ArrayList;
import java.util.List;

public class GymController {
    private List<Entrenamiento> entrenamientos;
    private List<Ejercicio> ejercicios;
    private List<EjercicioCompletado> ejerciciosCompletados;

    private static GymController INSTANCE = null;

    private GymController(){
        entrenamientos = new ArrayList<>();
        ejercicios = new ArrayList<>();
        ejerciciosCompletados = new ArrayList<>();
    }

    public static GymController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new GymController();
        }
        return INSTANCE;
    }

    public List<Ejercicio> comenzarEntrenamientoDia(){
        return ejercicios;
    }

    public List<EjercicioCompletado> registrarEjercicio(){
        return  ejerciciosCompletados;
    }

    public void enviarNotificacion(){

    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public List<EjercicioCompletado> getEjerciciosCompletados() {
        return ejerciciosCompletados;
    }

    public void setEjerciciosCompletados(List<EjercicioCompletado> ejerciciosCompletados) {
        this.ejerciciosCompletados = ejerciciosCompletados;
    }
}
