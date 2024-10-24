package model;

public class BajarPeso extends Objetivo{
    private float pesoIdeal;

    public BajarPeso(float pesoIdeal){
        this.pesoIdeal = pesoIdeal;
    }

    private Double calcularPesoIdeal(){
        return 25.5;
    };

    @Override
    public boolean cumplirObjetivo() {
        return false;
    }
}
