package model;

import controller.EjercicioController;

import java.util.ArrayList;
import java.util.List;

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
        return socio.getUltimoPeso() == calcularPesoIdeal();
    }

    @Override
    public List<Ejercicio> crearRutina() {
        List<Ejercicio> ejercicio = EjercicioController.getInstancia().getEjercicios(); //no estoy seguro de esto
        List<Ejercicio> ejercicioAux = new ArrayList<>();
        for (Ejercicio value : ejercicio) {
            if (value.getNivelAerobico() >= 3) {
                ejercicioAux.add(value);
            }
        }
        return ejercicioAux;
    }
}
