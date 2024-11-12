package model;

import controller.EjercicioController;
import controller.RutinaController;
import model.enums.ExigenciaMuscular;

import java.util.ArrayList;
import java.util.List;

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
        return socio.getUltimoPeso().getMasa() == masaIdeal && socio.getUltimoPeso().getMasa() == grasaIdeal;
    }

    @Override
    public void crearRutina() {
        RutinaController rutinaController = RutinaController.getInstancia();
        Rutina rutina = new Rutina();
        rutina.generarRutina(this);
        rutinaController.agregarRutina(rutina);
    }

    @Override
    public void reforzarRutina() {
        rutina.reforzarRutina(0.5f); //valor hardcodeado del porcentaje
    }
}
