package model;

public class BajarPeso extends Objetivo{
    private float pesoIdeal;

    public BajarPeso(float pesoIdeal){
        super();
        this.pesoIdeal = pesoIdeal;
    }

    private Double calcularPesoIdeal(){
        return 25.5;
    };

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        return false;
    }

    @Override
    public void crearRutina() {

    }
}
