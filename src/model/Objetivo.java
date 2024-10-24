package model;

public abstract class Objetivo {
    private String descripcion;

    public Objetivo() {
        this.descripcion = descripcion;
    }

    public abstract boolean cumplirObjetivo();
    public abstract void crearRutina();
}
