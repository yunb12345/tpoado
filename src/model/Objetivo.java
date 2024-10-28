package model;

import java.util.List;

public abstract class Objetivo {
    private String descripcion;

    public Objetivo() {
        this.descripcion = descripcion;
    }

    //Para el refuerzo de la rutina, esto no es sobre el progreso
    public abstract boolean cumplirObjetivo(Socio socio);
    public abstract List<Ejercicio> crearRutina();

}
