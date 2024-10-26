package model;

import java.util.List;

public class Rutina {
    private List<Entrenamiento> entrenamiento;
    private int duracion = 4;
    private Socio socio;

    public Rutina(int duracion,List<Entrenamiento> entrenamiento,Socio socio) {
        this.entrenamiento = null;
        this.duracion = duracion;
        this.socio = socio;
    }
    public void generarRutina(){
        
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
}
