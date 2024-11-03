package model;

import controller.EjercicioController;
import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

import java.util.Date;

public abstract class Ejercicio{
    protected int cantidadSeries;
    protected int repeticiones;
    protected float pesoAsignado;
    protected int nivelAerobico;
    protected ExigenciaMuscular nivelMuscular;
    protected GrupoMuscular grupoMuscular;
    protected VideoEjercicio video;//agregac
    protected boolean ejercicioFinalizado;


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

    public void iniciarEjercicio(){
        System.out.println("Inicio el ejercicio");
    }

    public void finalizarEjercicio(Entrenamiento entrenamiento){
        Date fechaActual = new Date();
        EjercicioCompletado ejercicioCompletado = new EjercicioCompletado(cantidadSeries,repeticiones,pesoAsignado,
                fechaActual,entrenamiento,this);
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


    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

}
