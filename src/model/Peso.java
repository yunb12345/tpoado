package model;

public class Peso {
    private float peso;
    private int mes;

    public Peso(float peso, int mes) {
        this.peso = peso;
        this.mes = mes;
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
}
