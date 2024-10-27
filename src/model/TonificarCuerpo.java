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
        return socio.getMasa() == masaIdeal && socio.getGrasa() == grasaIdeal;
    }

    @Override
    public List<Ejercicio> crearRutina() {
        List<Ejercicio> ejercicio = EjercicioController.getInstancia().getEjercicios(); //no estoy seguro de esto
        List<Ejercicio> ejercicioAux = new ArrayList<>();
        for (Ejercicio value : ejercicio) {
            if (value.getNivelAerobico() <= 5 && value.getNivelMuscular() == ExigenciaMuscular.alto) {
                ejercicioAux.add(value);
            }
        }
        return ejercicioAux;
    }
}
