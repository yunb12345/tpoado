package model;

public abstract class Trofeo {
    private String descripcion;
    protected Notificador notificador;

    public Trofeo(String descripcion, Notificador notificador) {
        this.descripcion = descripcion;
        this.notificador = notificador;
    }

    public abstract void otorgarTrofeo(Socio socio);
}
