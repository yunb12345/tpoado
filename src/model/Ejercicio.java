package model;

import model.enums.ExigenciaMuscular;

public class Ejercicio {
    private int cantidadSeries;
    private int repeticiones;
    private float pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular nivelMuscular;
    private VideoEjercicio video;//agregac

    public Ejercicio(int cantidadSeries, int repeticiones, float pesoAsignado, int nivelAerobico,
                     ExigenciaMuscular nivelMuscular) {
        this.cantidadSeries = cantidadSeries;
        this.repeticiones = repeticiones;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.nivelMuscular = nivelMuscular;
    }

    public void modificarValores(){

    }

    public void iniciarEjercicio(){

    }

    public void finalizarEjercicio(){

    }

}
