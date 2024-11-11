package model;

import bd.BaseDato;
import controller.RutinaController;

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
        return socio.getUltimoPeso().getPeso() == calcularPesoIdeal();
    }

    @Override
    public void crearRutina() {
        RutinaController rutinaController = RutinaController.getInstancia();
        Rutina rutina = new Rutina();
        rutina.generarRutina(this);
        rutinaController.agregarRutina(rutina);
        this.setRutina(rutina);
    }

    @Override
    public void reforzarRutina() {
        rutina.reforzarRutina(0.5f); //valor hardcodeado del porcentaje
    }

    @Override
    public boolean cumpleCriterio(Ejercicio ejercicio) {
        return ejercicio.getNivelAerobico()>=3;
    }

}