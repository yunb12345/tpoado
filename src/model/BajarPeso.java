package model;

public class BajarPeso extends Objetivo{
    private float pesoIdeal;

    public BajarPeso(){
        super();
    }

    private float calcularPesoIdeal(){
        return 70.10f;
    }; //hardcodeado

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        pesoIdeal = calcularPesoIdeal();
        if (socio.getUltimoPeso().getPeso() == calcularPesoIdeal()){
            Objetivo objetivo = new MantenerFigura(5);
            socio.cambiarObjetivo(objetivo);
            return true;
        }
        return false;
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