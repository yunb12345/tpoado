package model;

import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;

public class EjercicioReforzado extends Ejercicio{
    private Ejercicio ejercicio;
    private float porcentaje;

    public EjercicioReforzado(Ejercicio ejercicio,float porcentaje) {
        super(ejercicio.getCantidadSeries(),ejercicio.getRepeticiones(),ejercicio.getPesoAsignado(),
                ejercicio.getNivelAerobico(), ejercicio.getNivelMuscular(),
                ejercicio.getGrupoMuscular());
        this.ejercicio=ejercicio;
    }
    public int getCantidadSeries() {
        return Math.round(ejercicio.getCantidadSeries() * (1 + porcentaje / 100));
    }

    public int getRepeticiones() {
        return Math.round(ejercicio.getRepeticiones() * (1 + porcentaje / 100));
    }

    public float getPesoAsignado() {
        return (1 + porcentaje / 100) + ejercicio.getPesoAsignado();
    }
}
