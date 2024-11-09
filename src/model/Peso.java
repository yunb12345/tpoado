package model;

import model.interfaces.IBalanza;

import java.util.Date;

public class Peso {
    private float peso;
    private float masa;
    private float grasa;
    private IBalanza balanza = new Balanza();
    private Date fecha;

    public Peso() {
        this.pesarse();
    }

    public float getPeso() {
        return peso;
    }

    public float getMasa() {
        return masa;
    }

    public float getGrasa() {
        return grasa;
    }

    public void pesarse(){
        peso = balanza.pesarse();
        masa = balanza.calcularMasa();
        grasa = balanza.calcularGrasa();
        fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }
}
