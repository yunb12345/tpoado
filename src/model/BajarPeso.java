package model;

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
        return socio.getUltimoPeso().getPeso() == calcularPesoIdeal();
    }

    @Override
    public void crearRutina() {
        Rutina rutina = new Rutina();
        rutina.generarRutina(this);
        this.setRutina(rutina);
    }
    @Override
    public boolean cumpleCriterio(Ejercicio ejercicio) {
        return ejercicio.getNivelAerobico()>=3;
    }

}