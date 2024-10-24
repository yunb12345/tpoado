package model;

public class TonificarCuerpo extends Objetivo {
    private Double masaMuscular;
    private Double porcentajeGrasa;

    public TonificarCuerpo(Double masaMuscular, double porcentajeGrasa){
        super();
        this.masaMuscular = masaMuscular;
        this.porcentajeGrasa = porcentajeGrasa;
    }

    private Double calcularIdeal(){
        return 10.5; //un ej
    }

    public void calcularMasa(){

    }

    public void calcularGrasa(){

    }

    @Override
    public boolean cumplirObjetivo() {
        return false;
    }

    @Override
    public void crearRutina() {

    }
}
