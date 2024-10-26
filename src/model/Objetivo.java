package model;

public abstract class Objetivo {
    private String descripcion;
    private boolean objetivoCompletado = false;

    public Objetivo() {
        this.descripcion = descripcion;
    }

    public abstract boolean cumplirObjetivo(Socio socio);
    public abstract void crearRutina();

    public boolean isObjetivoCompletado() {
        return objetivoCompletado;
    }
}
