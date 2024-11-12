package model;

import controller.EjercicioController;
import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

import java.util.Date;

public class Ejercicio{
    private int cantidadSeries;
    private int repeticiones;
    private float pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular nivelMuscular;
    private GrupoMuscular grupoMuscular;
    private VideoEjercicio video;//agregac
    private boolean ejercicioIniciado;
    private boolean ejercicioFinalizado;
    private boolean ejercicioCompletado;


    public Ejercicio(int cantidadSeries, int repeticiones, float pesoAsignado, int nivelAerobico,
                     ExigenciaMuscular nivelMuscular,GrupoMuscular grupoMuscular) {
        this.cantidadSeries = cantidadSeries;
        this.repeticiones = repeticiones;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.nivelMuscular = nivelMuscular;
        this.grupoMuscular = grupoMuscular;
        this.ejercicioFinalizado = false;
        this.ejercicioIniciado = false;
        this.ejercicioCompletado = false;
    }

    public boolean iniciarEjercicio(){
        ejercicioIniciado=true;
    }

    public void finalizarEjercicio(Entrenamiento entrenamiento,int cantidadSeries,int repeticiones,float pesoAsignado){
        Date fechaActual = new Date();
        EjercicioRegistrar ejercicioRegistrar = new EjercicioRegistrar(cantidadSeries,repeticiones,pesoAsignado,
                fechaActual,entrenamiento,this);
        EjercicioController.getInstancia().agregarEjercicioRegistrado(ejercicioRegistrar);
        if(cantidadSeries >= this.cantidadSeries && repeticiones >= this.repeticiones && pesoAsignado >= this.pesoAsignado){
            ejercicioCompletado = true;
        }
    }

    public boolean ejercicioFinalizado(){
        return ejercicioFinalizado;
    }

    public boolean esEjercicioCompletado() {
        return ejercicioCompletado;
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
