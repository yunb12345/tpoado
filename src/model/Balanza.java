package model;

import model.interfaces.IBalanza;

public class Balanza implements IBalanza {

    private float peso;
    private float porcentajeGrasa;
    private float masaMuscular;

    public Balanza(){

    }

    @Override
    public float pesarse() {
        return 70.10f;
    }

    @Override
    public float calcularGrasa() {
        return 0;
    }

    @Override
    public float calcularMasa() {
        return 0;
    }

    @Override
    public float calcularPesoIdeal() {
        return 0;
    }
}
