package model;

public abstract class Objetivo {
    private String descripcion;

    public Objetivo(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract boolean cumplirObjetivo();
    public abstract void crearRutina();
}
