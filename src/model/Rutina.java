package model;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private List<Entrenamiento> entrenamientos;
    private int duracion = 16; //dias
    private boolean rutinaIniciada;
    private boolean rutinaFinalizada;
    private boolean rutinaCompletada;

    public Rutina() {
        entrenamientos = new ArrayList<>();
        rutinaIniciada=false;
        rutinaFinalizada=false;
        rutinaCompletada=false;
    }

    public void generarRutina(Objetivo objetivo){
        for(int i=0;i<duracion;i++){
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
        rutinaIniciada = true;
    }

    public void finalizarRutina(){
        if(rutinaIniciada){
            rutinaFinalizada = true;
        }
    }
    public void iniciarEntrenamientoDelDia(int dia){
        if(isRutinaIniciada()){
            for(Entrenamiento entrenamiento:entrenamientos){
                if(entrenamiento.getDia() == dia){
                    entrenamiento.iniciarEntrenamiento();
                }
            }
        }
    }
    public void finalizarEntrenamientoDelDia(int dia){
        for(Entrenamiento entrenamiento:entrenamientos){
            if(entrenamiento.getDia() == dia){
                entrenamiento.finalizarEntrenamiento();
            }
        }
    }
    public boolean isEntrenamientoDelDiaFinalizada(int dia){
        for(Entrenamiento entrenamiento:entrenamientos){
            if(entrenamiento.getDia() == dia){
                return entrenamiento.isEntrenamientoFinalizado();
            }
        }
        return false;
    }
    public boolean isEntrenamientoDelDiaIniciada(int dia){
        for(Entrenamiento entrenamiento:entrenamientos){
            if(entrenamiento.getDia() == dia){
                return entrenamiento.isEntrenamientoIniciado();
            }
        }
        return false;
    }
    public boolean isRutinaCompletada(){
        for(Entrenamiento value: entrenamientos){
            if(value.cumplioAsistencia() && value.verificarEjerciciosCompletado()){
                return rutinaCompletada=true;
            }
        }
        return rutinaCompletada;
    }
    public boolean isRutinaIniciada(){
        return rutinaIniciada;
    }
    public boolean isRutinaFinalizada() {
        return rutinaFinalizada;
    }
    public Entrenamiento getEntrenamientoDelDia(int dia){
        for(Entrenamiento entrenamiento:entrenamientos){
            if (entrenamiento.getDia()==dia){
                return entrenamiento;
            }
        }
        return null;
    }

}
