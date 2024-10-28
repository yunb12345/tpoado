package model;

import java.util.List;

public class Rutina {
    private List<Entrenamiento> entrenamientos;
    private int duracion = 4;
    private Socio socio;

    public Rutina(Socio socio,List<Entrenamiento> entrenamientos) {
        this.socio = socio;
        this.entrenamientos = entrenamientos;
    }

    public void generarRutina(){
        Objetivo objetivo = socio.getObjetivo();
    }

    public void reforzarRuti(int nuevaCantRepeticiones, int nuevaCantSeries, int nuevoPeso){
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
            if(!value.asistencia() && value.verificarEjercicioCompletado()){
                return false;
            }
        }
        return true;
    }
}
