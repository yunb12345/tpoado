package model;

import controller.EjercicioController;
import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

public class Ejercicio {
    private int cantidadSeries;
    private int repeticiones;
    private float pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular nivelMuscular;
    private GrupoMuscular grupoMuscular;
    private VideoEjercicio video;//agregac
    private boolean ejercicioFinalizado;


    public Ejercicio(int cantidadSeries, int repeticiones, float pesoAsignado, int nivelAerobico,
                     ExigenciaMuscular nivelMuscular,GrupoMuscular grupoMuscular) {
        this.cantidadSeries = cantidadSeries;
        this.repeticiones = repeticiones;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.nivelMuscular = nivelMuscular;
        this.grupoMuscular = grupoMuscular;
        this.ejercicioFinalizado = false;
    }

    public void modificarValores(){

    }

    public void iniciarEjercicio(){

    }

    public void finalizarEjercicio(){
        EjercicioCompletado ejercicioCompletado = new EjercicioCompletado(cantidadSeries,repeticiones,pesoAsignado);
        EjercicioController.getInstancia().agregarEjercicioCompletado(ejercicioCompletado);
        ejercicioFinalizado = true;
    }

    public boolean ejercicioFinalizado(){
        return ejercicioFinalizado;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public ExigenciaMuscular getNivelMuscular() {
        return nivelMuscular;
    }

    public int getCantidadSeries() {
        return cantidadSeries;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public float getPesoAsignado() {
        return pesoAsignado;
    }
}
