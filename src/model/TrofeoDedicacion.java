package model;

public class TrofeoDedicacion extends Trofeo{

    public TrofeoDedicacion(String descripcion, Notificador notificador) {
        super(descripcion, notificador);
    }

    @Override
    public void otorgarTrofeo(Socio socio) {
        if(socio.getObjetivo().isObjetivoCompletado()){
           socio.agregarTrofeo(this);
        }
    }
}
