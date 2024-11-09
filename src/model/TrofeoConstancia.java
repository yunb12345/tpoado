package model;

import java.util.List;

public class TrofeoConstancia extends Trofeo{

    public TrofeoConstancia(String descripcion) {
        super(descripcion);
    }

    @Override
    public void otorgarTrofeo(Socio socio){
        if(socio.getObjetivo().getRutina().rutinaCompletada()){
            socio.agregarTrofeo(this);
            notificador.notificar(new Notificacion("Felicidades, has obtenido un nuevo trofeo"));
        }
    };
}
