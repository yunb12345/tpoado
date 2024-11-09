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

    public void reforzarRutina(float porcentaje){
        for(Entrenamiento value: entrenamientos){
            value.reforzarEjercicio(porcentaje);
        }
    }
    public void iniciarRutina(){
        System.out.println("Rutina iniciada");
    }

    public void finalizarRutina(){
        System.out.println("Rutina finalizada");
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
