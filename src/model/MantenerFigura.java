package model;

import controller.EjercicioController;
import model.enums.ExigenciaMuscular;

import java.util.ArrayList;
import java.util.List;

public class MantenerFigura extends Objetivo{
    private int oscilacionPeso;

    public MantenerFigura(int oscilacionPeso){
        super();
        this.oscilacionPeso = oscilacionPeso;
    };

    //si el primer peso menos la osc es menor al ultimo peso quiere decir que no mantuvo la figura
    //pes inic 60 osc 5, no puede pesar menos de 55
    //si el primer peso menos la osc es mayor al ultimo peso, no mantuvo la figura
    //pes inic 60 osc 5, no puede pesar mas de 65
    @Override
    public boolean cumplirObjetivo(Socio socio) {
        return !(socio.getPrimerPeso() - oscilacionPeso < socio.getUltimoPeso()) &&
                !(socio.getPrimerPeso() + oscilacionPeso > socio.getUltimoPeso());
    }

    @Override
    public List<Ejercicio> crearRutina() {
        List<Ejercicio> ejercicio = EjercicioController.getInstancia().getEjercicios(); //no estoy seguro de esto
        List<Ejercicio> ejercicioAux = new ArrayList<>();
        for (Ejercicio value : ejercicio) {
            if ((2 <= value.getNivelAerobico() && value.getNivelAerobico() <= 4) && value.getNivelMuscular() != ExigenciaMuscular.alto) {
                ejercicioAux.add(value);
            }
        }
        return ejercicioAux;
    }
}
