package model;

import model.interfaces.IBalanza;

public class Balanza implements IBalanza {

    private float peso;
    private float porcentajeGrasa;
    private float masaMuscular;

    public Balanza(float peso, float porcentajeGrasa,float masaMuscular){
        this.peso = peso;
        this.porcentajeGrasa = porcentajeGrasa;
        this.masaMuscular = masaMuscular;
    }

    @Override
    public float pesarse() {
        return 0;
    }

    @Override
    public float calcularGrasa() {
        return 0;
    }

    @Override
    public void calcularMasa() {

    }

    @Override
    public void calcularPesoIdeal() {

    }
}
