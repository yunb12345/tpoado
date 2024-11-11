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
        aplicarModificaciones();
    }

    private void aplicarModificaciones() {
        ejercicio.pesoAsignado *= (1 + porcentaje / 100);
        ejercicio.repeticiones = Math.round(ejercicio.repeticiones * (1 + porcentaje / 100));
        ejercicio.cantidadSeries = Math.round(ejercicio.cantidadSeries * (1 + porcentaje / 100));
    }

}
