package model;

public abstract class Trofeo {
    private String descripcion;
    protected Notificador notificador;

    public Trofeo(String descripcion) {
        this.descripcion = descripcion;
        this.notificador = new Notificador();
    }

    public abstract void otorgarTrofeo(Socio socio);
}
