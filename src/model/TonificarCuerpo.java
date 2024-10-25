package model;

public class TonificarCuerpo extends Objetivo {


    public TonificarCuerpo(Double masaMuscular, double porcentajeGrasa) {
        super();
    }

    private float calcularGrasaIdeal(Socio socio) {
        return 10.5F; //un ej
    }
    private float calcularMasaIdeal(Socio socio){
        return 10.5F;
    }

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        float grasaIdeal = calcularGrasaIdeal(socio);
        float masaIdeal = calcularMasaIdeal(socio);
        return socio.getMasa() == masaIdeal && socio.getGrasa() == grasaIdeal;
    }

    @Override
    public void crearRutina() {

    }
}
