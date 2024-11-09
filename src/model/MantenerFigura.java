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

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        return !(socio.getPrimerPeso().getPeso() - oscilacionPeso < socio.getUltimoPeso().getPeso()) &&
                !(socio.getPrimerPeso().getPeso() + oscilacionPeso > socio.getUltimoPeso().getPeso());
    }

    @Override
    public void crearRutina() {
        Rutina rutina = new Rutina();
        rutina.generarRutina(this);
        this.setRutina(rutina);
    }

    @Override
    public boolean cumpleCriterio(Ejercicio ejercicio) {
        return ((ejercicio.getNivelAerobico() <= 2 && ejercicio.getNivelAerobico() <= 4) &&
                ejercicio.getNivelMuscular() != ExigenciaMuscular.alto);
    }
}
