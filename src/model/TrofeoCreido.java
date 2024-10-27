package model;

import java.util.List;

public class TrofeoCreido extends Trofeo{

    private int mesActual;

    public TrofeoCreido(String descripcion, Notificador notificador) {
        super(descripcion, notificador);
    }

    @Override
    public void otorgarTrofeo(Socio socio) {
        List<Peso> pesos = socio.getPesosDelMes();
        int cantVecesPesadas = 0;
        for(Peso value: pesos){
            if(value.getMes() == mesActual){
                cantVecesPesadas++;
            }
        }
        if (cantVecesPesadas >=3){
            socio.agregarTrofeo(this);
        }
        /*-sobre trofeo
        trofeo al creido, q se pasa mas de 3 veces al mes
        si es en un determinado mes, o si es que se pese min 3 veces al mes en todos los meses
        o si solo existe un solo mes q se haya pesado mas de 3 veces q se lo den*/
        }
    }
