package model;

import controller.EjercicioController;
import controller.RutinaController;
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
