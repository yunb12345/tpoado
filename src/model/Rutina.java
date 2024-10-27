package model;

import java.util.List;

public class Rutina {
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

    public void reforzarRutina(){

    }

    public boolean verificarAsistenciaTotal(){
        return true;
    }

    public void iniciarRutina(){

    }

    public void finalizarRutina(){

    }

    public boolean rutinaCompletada(){
        return true;
    }
}
