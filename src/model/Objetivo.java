package model;

import java.util.List;

public abstract class Objetivo {
    private String descripcion;
    private boolean objetivoCompletado = false;

    public Objetivo() {
        this.descripcion = descripcion;
    }

    public abstract boolean cumplirObjetivo(Socio socio);
    public abstract List<Ejercicio> crearRutina();

    public boolean isObjetivoCompletado() {
        return objetivoCompletado;
    }
}
