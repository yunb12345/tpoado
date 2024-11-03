package model;

public class Notificador{
    private Notificacion notificacion;

    public void notificar(Notificacion notificacion) {
        System.out.println(notificacion.getMensaje());
    }

}
