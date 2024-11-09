package model;

public class TrofeoDedicacion extends Trofeo{

    public TrofeoDedicacion(String descripcion) {
        super(descripcion);
    }

    @Override
    public void otorgarTrofeo(Socio socio) {
        if(socio.cumplirObjetivo()){
           socio.agregarTrofeo(this);
            notificador.notificar(new Notificacion("Felicidades, has obtenido un nuevo trofeo"));
        }
    }
}
