package model;

import java.util.List;

public class Rutina {
    private List<Entrenamiento> entrenamientos;
    private int duracion = 4;

    public Rutina() {

    }

    public void generarRutina(Objetivo objetivo){
        int cantEntrenamiento = 4; //hardcodeado
        for(int i=0;i<cantEntrenamiento;i++){
            Entrenamiento entrenamiento = new Entrenamiento(i);
            entrenamiento.generarEjercicio(objetivo);
            entrenamientos.add(entrenamiento);
        }
    }

    public void reforzarRutina(int nuevaCantRepeticiones, int nuevaCantSeries, float nuevoPeso){
        for(Entrenamiento value: entrenamientos){
            value.modificarEntrenamiento(nuevaCantRepeticiones,nuevaCantSeries,nuevoPeso);
        }
    }
    public void iniciarRutina(){

    }

    public void finalizarRutina(){

    }

    public boolean rutinaCompletada(){
        for(Entrenamiento value: entrenamientos){
            if(!value.cumplioAsistencia() && value.verificarEjercicioCompletado()){
                return false;
            }
        }
        return true;
    }
}
