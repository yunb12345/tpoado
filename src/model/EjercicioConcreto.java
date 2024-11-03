package model;

import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

public class EjercicioConcreto extends Ejercicio{
    public EjercicioConcreto(int cantidadSeries, int repeticiones, float pesoAsignado, int nivelAerobico, ExigenciaMuscular nivelMuscular, GrupoMuscular grupoMuscular) {
        super(cantidadSeries, repeticiones, pesoAsignado, nivelAerobico, nivelMuscular, grupoMuscular);
    }

}
