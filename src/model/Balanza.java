package model;

import model.interfaces.IBalanza;

public class Balanza implements IBalanza {

    private float peso;
    private float porcentajeGrasa;
    private float masaMuscular;
    private float estatura;

    public Balanza(float peso, float porcentajeGrasa, float masaMuscular, float estatura){
        this.peso = peso;
        this.porcentajeGrasa = porcentajeGrasa;
        this.masaMuscular = masaMuscular;
        this.estatura = estatura;
    }

    @Override
    public float pesarse() {
        return peso;
    }

    @Override
    public float calcularGrasa() {
        return porcentajeGrasa;
    }

    @Override
    public float calcularMasa() {
        return masaMuscular;
    }

    @Override
    public float calcularPesoIdeal() {
        return peso/estatura * estatura;
    }
}
