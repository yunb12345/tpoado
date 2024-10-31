package model;

public class Peso {
    private float peso;
    private int anio;
    private float masa;
    private float grasa;
    private int mes;


    public Peso(float peso,float masa,float grasa,int mes,int anio) {
        this.peso = peso;
        this.mes = mes;
        this.anio = anio;
        this.masa = masa;
        this.grasa = grasa;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public float getMasa() {
        return masa;
    }

    public float getGrasa() {
        return grasa;
    }
}
