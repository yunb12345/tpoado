package model;

public class TonificarCuerpo extends Objetivo {
    private Double masaMuscular;
    private Double porcentajeGrasa;

    public TonificarCuerpo(Double masaMuscular, double porcentajeGrasa){
        this.masaMuscular = masaMuscular;
        this.porcentajeGrasa = porcentajeGrasa;
    }

    private Double calcularIdeal(){

    }

    public void calcularMasa(){

    }

    public void calcularGrasa(){

    }

    @Override
    public boolean cumplirObjetivo() {
        return false;
    }
}
