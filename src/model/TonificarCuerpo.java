package model;

public class TonificarCuerpo extends Objetivo {


    public TonificarCuerpo(Double masaMuscular, double porcentajeGrasa) {
        super();
    }

    private Double calcularIdeal() {
        return 10.5; //un ej
    }
    @Override
    public boolean cumplirObjetivo(Socio socio) {
        return false;
    }

    @Override
    public void crearRutina() {

    }
}
