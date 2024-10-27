package model;

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

    public Ejercicio(int cantidadSeries, int repeticiones, float pesoAsignado, int nivelAerobico,
                     ExigenciaMuscular nivelMuscular,GrupoMuscular grupoMuscular) {
        this.cantidadSeries = cantidadSeries;
        this.repeticiones = repeticiones;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.nivelMuscular = nivelMuscular;
        this.grupoMuscular = grupoMuscular;
    }

    public void modificarValores(){

    }

    public void iniciarEjercicio(){

    }

    public void finalizarEjercicio(){

    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public ExigenciaMuscular getNivelMuscular() {
        return nivelMuscular;
    }
}
