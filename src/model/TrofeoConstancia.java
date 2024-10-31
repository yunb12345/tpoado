package model;

import java.util.List;

public class TrofeoConstancia extends Trofeo{

    public TrofeoConstancia(String descripcion, Notificador notificador) {
        super(descripcion, notificador);
    }

    @Override
    public void otorgarTrofeo(Socio socio){
        if(socio.getObjetivo().getRutina().rutinaCompletada()){ //revisar esto
            socio.agregarTrofeo(this);
        }
    };
}
