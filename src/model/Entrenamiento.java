package model;

import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private int dia;
    private boolean asistencia;
    //Objetivo objetivo;

    public Entrenamiento(int dia, List<Ejercicio> ejercicios) {
        this.dia = dia;
        this.ejercicios = ejercicios;
        this.asistencia = false;
    }

    public void iniciarEntrenamiento(){
            asistencia = true;
    }

    public boolean asistencia() {
        return asistencia;
    }

    public boolean verificarEjercicioCompletado(){
        for(Ejercicio value: ejercicios){
            if(!value.ejercicioFinalizado()){
                return false;
            }
        }
        return true;
    }

    public void modificarEntrenamiento(int nuevoCantRepeticiones, int nuevaCantSeries, int nuevoPeso){
        for(Ejercicio value:ejercicios){
            value.modificarValores(nuevoCantRepeticiones,nuevaCantSeries,nuevoPeso);
        }
    }
}
