package model;

import java.util.List;

public class Rutina {
    private List<Entrenamiento> entrenamientos;
    private Entrenamiento entrenamiento = null;
    private int duracion = 4;
    private Socio socio;

    public Rutina(Socio socio,Entrenamiento entrenamiento) {
        this.socio = socio;
        this.entrenamiento = entrenamiento;
    }

    public void generarRutina(){
        Objetivo objetivo = socio.getObjetivo();
    }

    public void reforzarRutina(int nuevaCantRepeticiones, int nuevaCantSeries, float nuevoPeso){
        for(Entrenamiento value: entrenamientos){
            entrenamiento.modificarEntrenamiento(nuevaCantRepeticiones,nuevaCantSeries,nuevoPeso);
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
