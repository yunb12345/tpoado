package model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TrofeoCreido extends Trofeo{

    private Date fechaUltimoTrofeo;

    public TrofeoCreido(String descripcion, Notificador notificador) {
        super(descripcion, notificador);
    }

    @Override
    public void otorgarTrofeo(Socio socio) {
        List<Peso> pesos = socio.getListaPeso();
        int cantVecesPesadas = 0;
        Date fechaActual = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaActual); //calendario con la fechaActual
        cal.add(Calendar.MONTH, -1); // Hace un mes atras de la fecha actual
        Date fechaLimite = cal.getTime();

        if (fechaUltimoTrofeo != null && esMismoMes(fechaUltimoTrofeo, fechaActual)) {
            return; // Si ya se otorgó un trofeo en el mismo mes, no otorgar otro
        }
        for (Peso peso : pesos) {
            if (peso.getFecha().after(fechaLimite)) {
                cantVecesPesadas++;
            }
        }
        if (cantVecesPesadas >=3){
            socio.agregarTrofeo(this);
            fechaUltimoTrofeo = fechaActual;
        }
    }

    // Metodo para verificar si es el mismo mes y año
    private boolean esMismoMes(Date fecha1, Date fecha2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(fecha1);
        cal2.setTime(fecha2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
    }
}
