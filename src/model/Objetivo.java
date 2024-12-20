package model;

import java.util.List;

public abstract class Objetivo {
    protected String descripcion;
    protected Rutina rutina;

    public Objetivo() {
    }

    //Para el refuerzo de la rutina, esto no es sobre el progreso
    public abstract boolean cumplirObjetivo(Socio socio);

    public abstract void crearRutina();

    public abstract void reforzarRutina();

    public void iniciarRutina(){
        rutina.iniciarRutina();
    }
    public void finalizarRutina(){
        rutina.finalizarRutina();
    }
    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Rutina getRutina() {
        return rutina;
    }
}
