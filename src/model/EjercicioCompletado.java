package model;

import controller.EjercicioController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EjercicioCompletado {
    private int cantSeries;
    private int repeticiones;
    private float pesoLevantado;
    private Date fecha;
    private Entrenamiento entrenamiento;
    private Ejercicio ejercicio;

    public EjercicioCompletado(int cantSeries,int repeticiones,float pesoLevantado,Date fecha,Entrenamiento entrenamiento,Ejercicio ejercicio){
        this.cantSeries = cantSeries;
        this.repeticiones = repeticiones;
        this.pesoLevantado = pesoLevantado;
        this.fecha = fecha;
        this.entrenamiento = entrenamiento;
        this.ejercicio=ejercicio;
    }
}
