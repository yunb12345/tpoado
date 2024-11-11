package model;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private List<Entrenamiento> entrenamientos;
    private int duracion = 4;

    public Rutina() {
        entrenamientos = new ArrayList<>();
    }

    public void generarRutina(Objetivo objetivo){
        int cantEntrenamiento = 4; //hardcodeado tiene 4 dias
        for(int i=0;i<cantEntrenamiento;i++){
            Entrenamiento entrenamiento = new Entrenamiento(i);
            entrenamiento.generarEjercicio(objetivo);
            entrenamientos.add(entrenamiento);
        }
    }

    public void reforzarRutina(float porcentaje){
        for(Entrenamiento value: entrenamientos){
            value.reforzarEjercicio(porcentaje);
        }
    }

    public void iniciarRutina(){
        for(Entrenamiento entrenamiento :entrenamientos){
            entrenamiento.iniciarEntrenamiento();
        };
        this.rutinaCompletada();
    }

    public boolean rutinaCompletada(){
        for(Entrenamiento value: entrenamientos){
            if(!value.cumplioAsistencia() && value.verificarEjerciciosCompletado()){
                return false;
            }
        }
        return true;
    }
}
