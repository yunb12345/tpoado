package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Entrenamiento {
    List<Ejercicio > ejercicios;
    Date fecha;
    Objetivo objetivo;

    public Entrenamiento(Date fecha, Objetivo objetivo, List<Ejercicio> ejercicios) {
        this.fecha = fecha;
        this.objetivo = objetivo;
        this.ejercicios = new ArrayList<>();
    }


}
