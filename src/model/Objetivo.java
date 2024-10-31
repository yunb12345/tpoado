package model;

import java.util.List;

public abstract class Objetivo {
    private String descripcion;
    private Rutina rutina;

    public Objetivo() {
        this.descripcion = descripcion;
    }

    //Para el refuerzo de la rutina, esto no es sobre el progreso
    public abstract boolean cumplirObjetivo(Socio socio);
    public abstract void crearRutina();
    public abstract boolean cumpleCriterio(Ejercicio ejercicio);
    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }
    public Rutina getRutina() {
        return rutina;
    }
}
