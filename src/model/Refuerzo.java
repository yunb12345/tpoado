package model;

public abstract class Refuerzo {
    private Ejercicio ejercicio;

    public Refuerzo(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public abstract void reforzarEejercicio();
}
