package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Entrenamiento {
    List<Ejercicio > ejercicios;
    int dia;
    //Objetivo objetivo;

    public Entrenamiento(int dia, List<Ejercicio> ejercicios) {
        this.dia = dia;
        this.ejercicios = ejercicios;
    }


}
