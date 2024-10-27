package model;

import controller.EjercicioController;

import java.util.ArrayList;
import java.util.List;

public class EjercicioCompletado {
    private int cantSeries;
    private int repeticiones;
    private float pesoLevantado;

    public EjercicioCompletado(int cantSeries,int repeticiones, float pesoLevantado){
        this.cantSeries = cantSeries;
        this.repeticiones = repeticiones;
        this.pesoLevantado = pesoLevantado;
    }
}
