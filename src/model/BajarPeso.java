package model;

import controller.SocioController;

public class BajarPeso extends Objetivo{
    private Double pesoIdeal;

    public BajarPeso(Double pesoIdeal){
        super();
        this.pesoIdeal = pesoIdeal;
    }

    private Double calcularPesoIdeal(){
        return 25.5;
    };

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        pesoIdeal = calcularPesoIdeal();
        if(socio.pesarse() == calcularPesoIdeal()){
            return true;
        }
        return false;
    }

    @Override
    public void crearRutina() {

    }
}
