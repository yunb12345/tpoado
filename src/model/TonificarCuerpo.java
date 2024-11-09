package model;

import controller.EjercicioController;
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
        Rutina rutina = new Rutina();
        rutina.generarRutina(this);
        this.setRutina(rutina);
    }

    @Override
    public boolean cumpleCriterio(Ejercicio ejercicio) {
        return ejercicio.getNivelAerobico() <= 5 && ejercicio.getNivelMuscular() == ExigenciaMuscular.alto;
    }
}
